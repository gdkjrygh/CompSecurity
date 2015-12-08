// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.soundcloud.android.model.Urn;
import com.soundcloud.propeller.WriteResult;
import java.lang.ref.WeakReference;

// Referenced classes of package com.soundcloud.android.offline:
//            TrackDownloadsStorage, DownloadState, SecureFileStorage, DownloadOperations, 
//            DownloadRequest

public class DownloadHandler extends Handler
{
    static class Builder
    {

        private final DownloadOperations downloadOperations;
        private final SecureFileStorage secureFileStorage;
        private final TrackDownloadsStorage tracksStorage;

        private Looper createLooper()
        {
            HandlerThread handlerthread = new HandlerThread("DownloadThread", 10);
            handlerthread.start();
            return handlerthread.getLooper();
        }

        DownloadHandler create(Listener listener)
        {
            return new DownloadHandler(createLooper(), new MainHandler(listener), downloadOperations, secureFileStorage, tracksStorage);
        }

        Builder(DownloadOperations downloadoperations, TrackDownloadsStorage trackdownloadsstorage, SecureFileStorage securefilestorage)
        {
            downloadOperations = downloadoperations;
            tracksStorage = trackdownloadsstorage;
            secureFileStorage = securefilestorage;
        }
    }

    static interface Listener
    {

        public abstract void onCancel(DownloadState downloadstate);

        public abstract void onError(DownloadState downloadstate);

        public abstract void onProgress(DownloadState downloadstate);

        public abstract void onSuccess(DownloadState downloadstate);
    }

    static class MainHandler extends Handler
    {

        static final int ACTION_DOWNLOAD_CANCEL = 2;
        static final int ACTION_DOWNLOAD_FAILED = 1;
        static final int ACTION_DOWNLOAD_PROGRESS = 3;
        static final int ACTION_DOWNLOAD_SUCCESS = 0;
        private final WeakReference listenerRef;

        public void handleMessage(Message message)
        {
            Listener listener;
            DownloadState downloadstate;
label0:
            {
label1:
                {
label2:
                    {
                        listener = (Listener)listenerRef.get();
                        if (listener != null)
                        {
                            downloadstate = (DownloadState)message.obj;
                            switch (message.what)
                            {
                            default:
                                throw new IllegalArgumentException((new StringBuilder("Unknown action received by DownloadHandler: ")).append(message.what).toString());

                            case 1: // '\001'
                                break label1;

                            case 2: // '\002'
                                break label2;

                            case 3: // '\003'
                                break label0;

                            case 0: // '\0'
                                listener.onSuccess(downloadstate);
                                break;
                            }
                        }
                        return;
                    }
                    listener.onCancel(downloadstate);
                    return;
                }
                listener.onError(downloadstate);
                return;
            }
            listener.onProgress(downloadstate);
        }

        public void quit()
        {
            listenerRef.clear();
        }

        public MainHandler(Listener listener)
        {
            super(Looper.getMainLooper());
            listenerRef = new WeakReference(listener);
        }
    }


    public static final int ACTION_DOWNLOAD = 0;
    private DownloadRequest current;
    private final DownloadOperations downloadOperations;
    private final MainHandler mainHandler;
    private final SecureFileStorage secureFileStorage;
    private final TrackDownloadsStorage trackDownloadsStorage;

    public DownloadHandler(Looper looper, MainHandler mainhandler, DownloadOperations downloadoperations, SecureFileStorage securefilestorage, TrackDownloadsStorage trackdownloadsstorage)
    {
        super(looper);
        mainHandler = mainhandler;
        downloadOperations = downloadoperations;
        secureFileStorage = securefilestorage;
        trackDownloadsStorage = trackdownloadsstorage;
    }

    DownloadHandler(MainHandler mainhandler, DownloadOperations downloadoperations, SecureFileStorage securefilestorage, TrackDownloadsStorage trackdownloadsstorage)
    {
        mainHandler = mainhandler;
        downloadOperations = downloadoperations;
        secureFileStorage = securefilestorage;
        trackDownloadsStorage = trackdownloadsstorage;
    }

    private DownloadOperations.DownloadProgressListener createDownloadProgressListener(final DownloadRequest request)
    {
        return new _cls1();
    }

    private void sendDownloadResult(int i, DownloadState downloadstate)
    {
        mainHandler.sendMessage(mainHandler.obtainMessage(i, downloadstate));
    }

    private void tryToStoreDownloadSuccess(DownloadState downloadstate)
    {
        if (trackDownloadsStorage.storeCompletedDownload(downloadstate).success())
        {
            sendDownloadResult(0, downloadstate);
            return;
        } else
        {
            secureFileStorage.deleteTrack(downloadstate.getTrack());
            sendDownloadResult(1, downloadstate);
            return;
        }
    }

    void cancel()
    {
        downloadOperations.cancelCurrentDownload();
    }

    public DownloadRequest getCurrentRequest()
    {
        return current;
    }

    public Urn getCurrentTrack()
    {
        if (isDownloading())
        {
            return current.getTrack();
        } else
        {
            return Urn.NOT_SET;
        }
    }

    public void handleMessage(Message message)
    {
        message = (DownloadRequest)message.obj;
        current = message;
        sendDownloadResult(3, DownloadState.inProgress(message, 0L));
        message = downloadOperations.download(message, createDownloadProgressListener(message));
        current = null;
        if (message.isSuccess())
        {
            tryToStoreDownloadSuccess(message);
            return;
        }
        if (message.isCancelled())
        {
            sendDownloadResult(2, message);
            return;
        }
        if (message.isUnavailable())
        {
            trackDownloadsStorage.markTrackAsUnavailable(message.getTrack());
        }
        sendDownloadResult(1, message);
    }

    public boolean isCurrentRequest(DownloadRequest downloadrequest)
    {
        return current != null && current.equals(downloadrequest);
    }

    public boolean isDownloading()
    {
        return current != null;
    }

    void quit()
    {
        getLooper().quit();
        mainHandler.quit();
    }


    private class _cls1
        implements DownloadOperations.DownloadProgressListener
    {

        final DownloadHandler this$0;
        final DownloadRequest val$request;

        public void onProgress(long l)
        {
            sendDownloadResult(3, DownloadState.inProgress(request, l));
        }

        _cls1()
        {
            this$0 = DownloadHandler.this;
            request = downloadrequest;
            super();
        }
    }

}
