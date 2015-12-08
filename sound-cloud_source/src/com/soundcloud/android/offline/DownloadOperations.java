// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.crypto.EncryptionException;
import com.soundcloud.android.crypto.EncryptionInterruptedException;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.playback.StreamUrlBuilder;
import com.soundcloud.android.utils.IOUtils;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import com.soundcloud.java.collections.MoreCollections;
import com.soundcloud.java.functions.Predicate;
import java.io.IOException;
import java.util.Collection;
import rx.R;
import rx.b;

// Referenced classes of package com.soundcloud.android.offline:
//            DownloadRequest, StrictSSLHttpClient, OfflineTrackAssetDownloader, DownloadState, 
//            OfflineSettingsStorage, SecureFileStorage, DeleteOfflineTrackCommand

class DownloadOperations
{
    static final class ConnectionState extends Enum
    {

        private static final ConnectionState $VALUES[];
        public static final ConnectionState CONNECTED;
        public static final ConnectionState DISCONNECTED;
        public static final ConnectionState NOT_ALLOWED;

        public static ConnectionState valueOf(String s)
        {
            return (ConnectionState)Enum.valueOf(com/soundcloud/android/offline/DownloadOperations$ConnectionState, s);
        }

        public static ConnectionState[] values()
        {
            return (ConnectionState[])$VALUES.clone();
        }

        static 
        {
            DISCONNECTED = new ConnectionState("DISCONNECTED", 0);
            CONNECTED = new ConnectionState("CONNECTED", 1);
            NOT_ALLOWED = new ConnectionState("NOT_ALLOWED", 2);
            $VALUES = (new ConnectionState[] {
                DISCONNECTED, CONNECTED, NOT_ALLOWED
            });
        }

        private ConnectionState(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface DownloadProgressListener
    {

        public abstract void onProgress(long l);
    }


    private final OfflineTrackAssetDownloader assetDownloader;
    private final NetworkConnectionHelper connectionHelper;
    private final DeleteOfflineTrackCommand deleteOfflineContent;
    private final SecureFileStorage fileStorage;
    private final Predicate isNotCurrentTrackFilter = new _cls1();
    private final OfflineSettingsStorage offlineSettings;
    private final PlayQueueManager playQueueManager;
    private final R scheduler;
    private final StrictSSLHttpClient strictSSLHttpClient;
    private final StreamUrlBuilder urlBuilder;

    DownloadOperations(StrictSSLHttpClient strictsslhttpclient, SecureFileStorage securefilestorage, DeleteOfflineTrackCommand deleteofflinetrackcommand, PlayQueueManager playqueuemanager, NetworkConnectionHelper networkconnectionhelper, OfflineSettingsStorage offlinesettingsstorage, StreamUrlBuilder streamurlbuilder, 
            R r, OfflineTrackAssetDownloader offlinetrackassetdownloader)
    {
        strictSSLHttpClient = strictsslhttpclient;
        fileStorage = securefilestorage;
        deleteOfflineContent = deleteofflinetrackcommand;
        playQueueManager = playqueuemanager;
        connectionHelper = networkconnectionhelper;
        offlineSettings = offlinesettingsstorage;
        urlBuilder = streamurlbuilder;
        scheduler = r;
        assetDownloader = offlinetrackassetdownloader;
    }

    private DownloadState downloadAndStore(DownloadRequest downloadrequest, DownloadProgressListener downloadprogresslistener)
    {
        StrictSSLHttpClient.TrackFileResponse trackfileresponse1 = strictSSLHttpClient.getFileStream(urlBuilder.buildHttpsStreamUrl(downloadrequest.getTrack()));
        StrictSSLHttpClient.TrackFileResponse trackfileresponse = trackfileresponse1;
        if (!trackfileresponse1.isSuccess())
        {
            break MISSING_BLOCK_LABEL_89;
        }
        trackfileresponse = trackfileresponse1;
        saveTrack(downloadrequest, trackfileresponse1, downloadprogresslistener);
        trackfileresponse = trackfileresponse1;
        assetDownloader.fetchTrackArtwork(downloadrequest.getTrack());
        trackfileresponse = trackfileresponse1;
        assetDownloader.fetchTrackWaveform(downloadrequest.getTrack(), downloadrequest.getWaveformUrl());
        trackfileresponse = trackfileresponse1;
        downloadprogresslistener = DownloadState.success(downloadrequest);
        IOUtils.close(trackfileresponse1);
        return downloadprogresslistener;
        trackfileresponse = trackfileresponse1;
        downloadprogresslistener = mapFailureToDownloadResult(downloadrequest, trackfileresponse1);
        IOUtils.close(trackfileresponse1);
        return downloadprogresslistener;
        downloadprogresslistener;
        trackfileresponse1 = null;
_L8:
        trackfileresponse = trackfileresponse1;
        downloadrequest = DownloadState.canceled(downloadrequest);
        IOUtils.close(trackfileresponse1);
        return downloadrequest;
        downloadprogresslistener;
        trackfileresponse1 = null;
_L6:
        trackfileresponse = trackfileresponse1;
        downloadrequest = DownloadState.error(downloadrequest);
        IOUtils.close(trackfileresponse1);
        return downloadrequest;
        downloadprogresslistener;
        trackfileresponse1 = null;
_L4:
        trackfileresponse = trackfileresponse1;
        downloadrequest = DownloadState.connectionError(downloadrequest, getConnectionState());
        IOUtils.close(trackfileresponse1);
        return downloadrequest;
        downloadrequest;
        trackfileresponse = null;
_L2:
        IOUtils.close(trackfileresponse);
        throw downloadrequest;
        downloadrequest;
        if (true) goto _L2; else goto _L1
_L1:
        downloadprogresslistener;
        if (true) goto _L4; else goto _L3
_L3:
        downloadprogresslistener;
        if (true) goto _L6; else goto _L5
_L5:
        downloadprogresslistener;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private ConnectionState getConnectionState()
    {
        if (!connectionHelper.isNetworkConnected())
        {
            return ConnectionState.DISCONNECTED;
        }
        if (!connectionHelper.isWifiConnected() && offlineSettings.isWifiOnlyEnabled())
        {
            return ConnectionState.NOT_ALLOWED;
        } else
        {
            return ConnectionState.CONNECTED;
        }
    }

    private DownloadState mapFailureToDownloadResult(DownloadRequest downloadrequest, StrictSSLHttpClient.TrackFileResponse trackfileresponse)
    {
        if (trackfileresponse.isUnavailable())
        {
            return DownloadState.unavailable(downloadrequest);
        } else
        {
            return DownloadState.error(downloadrequest);
        }
    }

    private void saveTrack(DownloadRequest downloadrequest, StrictSSLHttpClient.TrackFileResponse trackfileresponse, final DownloadProgressListener listener)
        throws IOException, EncryptionException
    {
        fileStorage.storeTrack(downloadrequest.getTrack(), trackfileresponse.getInputStream(), new _cls2());
        (new StringBuilder("Track stored on device: ")).append(downloadrequest.getTrack());
    }

    void cancelCurrentDownload()
    {
        fileStorage.tryCancelRunningEncryption();
    }

    DownloadState download(DownloadRequest downloadrequest, DownloadProgressListener downloadprogresslistener)
    {
        if (!fileStorage.isEnoughSpaceForTrack(downloadrequest.getDuration()))
        {
            return DownloadState.notEnoughSpace(downloadrequest);
        }
        if (!isValidNetwork())
        {
            return DownloadState.connectionError(downloadrequest, getConnectionState());
        } else
        {
            return downloadAndStore(downloadrequest, downloadprogresslistener);
        }
    }

    boolean isValidNetwork()
    {
        return getConnectionState() == ConnectionState.CONNECTED;
    }

    b removeOfflineTracks(Collection collection)
    {
        return deleteOfflineContent.toObservable(MoreCollections.filter(collection, isNotCurrentTrackFilter)).subscribeOn(scheduler);
    }


    private class _cls1
        implements Predicate
    {

        final DownloadOperations this$0;

        public boolean apply(Urn urn)
        {
            return !playQueueManager.isCurrentTrack(urn);
        }

        public volatile boolean apply(Object obj)
        {
            return apply((Urn)obj);
        }

        _cls1()
        {
            this$0 = DownloadOperations.this;
            super();
        }
    }


    private class _cls2
        implements com.soundcloud.android.crypto.Encryptor.EncryptionProgressListener
    {

        final DownloadOperations this$0;
        final DownloadProgressListener val$listener;

        public void onBytesEncrypted(long l)
        {
            listener.onProgress(l);
        }

        _cls2()
        {
            this$0 = DownloadOperations.this;
            listener = downloadprogresslistener;
            super();
        }
    }

}
