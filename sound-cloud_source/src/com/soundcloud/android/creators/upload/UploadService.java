// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.upload;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.util.Log;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.api.legacy.model.PublicApiTrack;
import com.soundcloud.android.api.legacy.model.Recording;
import com.soundcloud.android.commands.StoreTracksCommand;
import com.soundcloud.android.creators.record.SoundRecorder;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.UploadEvent;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.sync.posts.StorePostsCommand;
import com.soundcloud.android.utils.IOUtils;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.b;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import rx.Y;

// Referenced classes of package com.soundcloud.android.creators.upload:
//            UploadNotificationController, ImageResizer, Processor, Encoder, 
//            Uploader

public class UploadService extends Service
{
    private final class EventSubscriber extends DefaultSubscriber
    {

        final UploadService this$0;

        public final void onNext(UploadEvent uploadevent)
        {
            Recording recording = uploadevent.getRecording();
            if (uploadevent.isStarted())
            {
                queueUpload(recording);
            } else
            {
                if (uploadevent.isError() || uploadevent.isCancelled())
                {
                    recording.setUploadFailed(uploadevent.isCancelled());
                    releaseLocks();
                    uploads.remove(Long.valueOf(recording.getId()));
                    onUploadDone(recording);
                    return;
                }
                if (uploadevent.isResizeStarted() || uploadevent.isProcessingStarted())
                {
                    acquireWakelock();
                    return;
                }
                if (uploadevent.isResizeSuccess() || uploadevent.isProcessingSuccess())
                {
                    releaseWakelock();
                    queueUpload(recording);
                    return;
                }
                if (uploadevent.isTransferStarted())
                {
                    notificationController.showTransferringNotification(recording, 0);
                    acquireLocks();
                    return;
                }
                if (uploadevent.isTransferProgress())
                {
                    notificationController.showTransferringNotification(recording, uploadevent.getProgress());
                    return;
                }
                if (uploadevent.isTransferSuccess())
                {
                    Upload upload1 = (Upload)uploads.get(Long.valueOf(recording.getId()));
                    if (upload1 != null)
                    {
                        upload1.track = uploadevent.getTrack();
                        SoundRecorder.getInstance(getApplicationContext()).reset(true);
                        releaseLocks();
                        onUploadDone(recording);
                        eventBus.publish(EventQueue.UPLOAD, UploadEvent.success(recording));
                        return;
                    }
                }
            }
        }

        public final volatile void onNext(Object obj)
        {
            onNext((UploadEvent)obj);
        }

        private EventSubscriber()
        {
            this$0 = UploadService.this;
            super();
        }

        EventSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private static class Upload
    {

        final Recording recording;
        PublicApiTrack track;

        public String toString()
        {
            return (new StringBuilder("Upload{recording=")).append(recording).append(", playbackStream=").append(recording.getPlaybackStream()).append('}').toString();
        }

        public Upload(Recording recording1)
        {
            recording = recording1;
        }
    }

    private static final class UploadHandler extends Handler
    {

        private final ApiClient apiClient;
        private final EventBus eventBus;
        private final WeakReference serviceRef;
        private final StorePostsCommand storePostsCommand;
        private final StoreTracksCommand storeTracksCommand;

        public final void handleMessage(Message message)
        {
            UploadService uploadservice = (UploadService)serviceRef.get();
            if (uploadservice == null)
            {
                return;
            }
            message = (Upload)message.obj;
            String s = UploadService.TAG;
            (new StringBuilder("handleMessage(")).append(message).append(")");
            if (((Upload) (message)).recording.needsResizing())
            {
                uploadservice.processingHandler.post(new ImageResizer(((Upload) (message)).recording));
                return;
            }
            if (((Upload) (message)).recording.needsProcessing())
            {
                uploadservice.processingHandler.post(new Processor(((Upload) (message)).recording));
                return;
            }
            if (((Upload) (message)).recording.needsEncoding())
            {
                uploadservice.processingHandler.post(new Encoder(((Upload) (message)).recording, eventBus));
                return;
            } else
            {
                post(new Uploader(uploadservice, apiClient, ((Upload) (message)).recording, storeTracksCommand, storePostsCommand, eventBus));
                return;
            }
        }

        private UploadHandler(UploadService uploadservice, Looper looper, ApiClient apiclient, StoreTracksCommand storetrackscommand, StorePostsCommand storepostscommand, EventBus eventbus)
        {
            super(looper);
            apiClient = apiclient;
            storeTracksCommand = storetrackscommand;
            storePostsCommand = storepostscommand;
            eventBus = eventbus;
            serviceRef = new WeakReference(uploadservice);
        }

        UploadHandler(UploadService uploadservice, Looper looper, ApiClient apiclient, StoreTracksCommand storetrackscommand, StorePostsCommand storepostscommand, EventBus eventbus, _cls1 _pcls1)
        {
            this(uploadservice, looper, apiclient, storetrackscommand, storepostscommand, eventbus);
        }
    }


    public static final String EXTRA_PROGRESS = "progress";
    public static final String EXTRA_RECORDING = "recording";
    public static final String EXTRA_STAGE = "stage";
    static final String TAG = com/soundcloud/android/creators/upload/UploadService.getSimpleName();
    public static final int UPLOAD_STAGE_PROCESSING = 1;
    public static final int UPLOAD_STAGE_TRANSFERRING = 2;
    ApiClient apiClient;
    private final IBinder binder;
    EventBus eventBus;
    UploadNotificationController notificationController;
    private Handler processingHandler;
    StorePostsCommand storePostsCommand;
    StoreTracksCommand storeTracksCommand;
    private Y subscription;
    private UploadHandler uploadHandler;
    private final Map uploads;
    private android.os.PowerManager.WakeLock wakeLock;
    private android.net.wifi.WifiManager.WifiLock wifiLock;

    public UploadService()
    {
        uploads = new HashMap();
        binder = new _cls1();
        SoundCloudApplication.getObjectGraph().a(this);
    }

    public UploadService(StorePostsCommand storepostscommand, EventBus eventbus)
    {
        uploads = new HashMap();
        binder = new _cls1();
        storePostsCommand = storepostscommand;
        eventBus = eventbus;
    }

    private void acquireLocks()
    {
        Log.isLoggable(TAG, 3);
        acquireWakelock();
        acquireWifilock();
    }

    private void acquireWakelock()
    {
        if (wakeLock != null && !wakeLock.isHeld())
        {
            wakeLock.acquire();
        }
    }

    private void acquireWifilock()
    {
        if (wifiLock != null && !wifiLock.isHeld())
        {
            wifiLock.acquire();
        }
    }

    private static Looper createLooper(String s, int i)
    {
        s = new HandlerThread(s, i);
        s.start();
        return s.getLooper();
    }

    private Upload getUpload(Recording recording)
    {
        if (!uploads.containsKey(Long.valueOf(recording.getId())))
        {
            uploads.put(Long.valueOf(recording.getId()), new Upload(recording));
        }
        return (Upload)uploads.get(Long.valueOf(recording.getId()));
    }

    private void onUploadDone(Recording recording)
    {
        if (recording.isUploaded())
        {
            notificationController.showUploadFinished(recording);
        } else
        if (recording.isError())
        {
            notificationController.showUploadError(recording);
        } else
        {
            notificationController.onUploadCancelled();
        }
        uploads.remove(Long.valueOf(recording.getId()));
        if (!isUploading())
        {
            stopSelf();
        }
    }

    private void queueUpload(Recording recording)
    {
        notificationController.showProcessingNotification(recording);
        recording = getUpload(recording);
        Message.obtain(uploadHandler, 0, recording).sendToTarget();
    }

    private void releaseLocks()
    {
        Log.isLoggable(TAG, 3);
        releaseWakelock();
        releaseWifilock();
    }

    private void releaseWakelock()
    {
        if (wakeLock != null && wakeLock.isHeld())
        {
            wakeLock.release();
        }
    }

    private void releaseWifilock()
    {
        if (wifiLock != null && wifiLock.isHeld())
        {
            wifiLock.release();
        }
    }

    void cancel(Recording recording)
    {
        Upload upload1 = (Upload)uploads.get(Long.valueOf(recording.getId()));
        if (upload1 != null)
        {
            uploadHandler.removeMessages(0, upload1);
        }
        eventBus.publish(EventQueue.UPLOAD, UploadEvent.cancelled(recording));
        if (uploads.isEmpty())
        {
            stopSelf();
        }
    }

    Handler getProcessingHandler()
    {
        return processingHandler;
    }

    Handler getUploadHandler()
    {
        return uploadHandler;
    }

    android.os.PowerManager.WakeLock getWakeLock()
    {
        return wakeLock;
    }

    android.net.wifi.WifiManager.WifiLock getWifiLock()
    {
        return wifiLock;
    }

    public boolean isUploading()
    {
        boolean flag = false;
        if (!uploads.isEmpty() || uploadHandler.hasMessages(0))
        {
            flag = true;
        }
        return flag;
    }

    public IBinder onBind(Intent intent)
    {
        return binder;
    }

    public void onCreate()
    {
        super.onCreate();
        uploadHandler = new UploadHandler(this, createLooper("Uploader", 0), apiClient, storeTracksCommand, storePostsCommand, eventBus, null);
        processingHandler = new Handler(createLooper("Processing", 10));
        wakeLock = ((PowerManager)getSystemService("power")).newWakeLock(1, TAG);
        wifiLock = IOUtils.createHiPerfWifiLock(this, TAG);
        subscription = eventBus.subscribe(EventQueue.UPLOAD, new EventSubscriber(null));
    }

    public void onDestroy()
    {
        uploadHandler.getLooper().quit();
        processingHandler.getLooper().quit();
        subscription.unsubscribe();
        if (isUploading())
        {
            for (Iterator iterator = uploads.values().iterator(); iterator.hasNext(); cancel(((Upload)iterator.next()).recording)) { }
        }
    }

    public void upload(Recording recording)
    {
        SoundRecorder soundrecorder = SoundRecorder.getInstance(getApplicationContext());
        if (soundrecorder.isActive() && soundrecorder.getRecording().equals(recording))
        {
            soundrecorder.gotoIdleState();
        }
        recording.setUploading();
        queueUpload(recording);
    }










    private class _cls1 extends LocalBinder
    {

        final UploadService this$0;

        public volatile Service getService()
        {
            return getService();
        }

        public UploadService getService()
        {
            return UploadService.this;
        }

        _cls1()
        {
            this$0 = UploadService.this;
            super();
        }
    }

}
