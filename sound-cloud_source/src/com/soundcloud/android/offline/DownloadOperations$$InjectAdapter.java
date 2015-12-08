// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.playback.StreamUrlBuilder;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.offline:
//            DownloadOperations, StrictSSLHttpClient, SecureFileStorage, DeleteOfflineTrackCommand, 
//            OfflineSettingsStorage, OfflineTrackAssetDownloader

public final class  extends b
    implements Provider
{

    private b assetDownloader;
    private b connectionHelper;
    private b deleteOfflineContent;
    private b fileStorage;
    private b httpClient;
    private b offlineSettings;
    private b playQueueManager;
    private b scheduler;
    private b urlBuilder;

    public final void attach(l l1)
    {
        httpClient = l1.a("com.soundcloud.android.offline.StrictSSLHttpClient", com/soundcloud/android/offline/DownloadOperations, getClass().getClassLoader());
        fileStorage = l1.a("com.soundcloud.android.offline.SecureFileStorage", com/soundcloud/android/offline/DownloadOperations, getClass().getClassLoader());
        deleteOfflineContent = l1.a("com.soundcloud.android.offline.DeleteOfflineTrackCommand", com/soundcloud/android/offline/DownloadOperations, getClass().getClassLoader());
        playQueueManager = l1.a("com.soundcloud.android.playback.PlayQueueManager", com/soundcloud/android/offline/DownloadOperations, getClass().getClassLoader());
        connectionHelper = l1.a("com.soundcloud.android.utils.NetworkConnectionHelper", com/soundcloud/android/offline/DownloadOperations, getClass().getClassLoader());
        offlineSettings = l1.a("com.soundcloud.android.offline.OfflineSettingsStorage", com/soundcloud/android/offline/DownloadOperations, getClass().getClassLoader());
        urlBuilder = l1.a("com.soundcloud.android.playback.StreamUrlBuilder", com/soundcloud/android/offline/DownloadOperations, getClass().getClassLoader());
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/offline/DownloadOperations, getClass().getClassLoader());
        assetDownloader = l1.a("com.soundcloud.android.offline.OfflineTrackAssetDownloader", com/soundcloud/android/offline/DownloadOperations, getClass().getClassLoader());
    }

    public final DownloadOperations get()
    {
        return new DownloadOperations((StrictSSLHttpClient)httpClient.get(), (SecureFileStorage)fileStorage.get(), (DeleteOfflineTrackCommand)deleteOfflineContent.get(), (PlayQueueManager)playQueueManager.get(), (NetworkConnectionHelper)connectionHelper.get(), (OfflineSettingsStorage)offlineSettings.get(), (StreamUrlBuilder)urlBuilder.get(), (R)scheduler.get(), (OfflineTrackAssetDownloader)assetDownloader.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(httpClient);
        set.add(fileStorage);
        set.add(deleteOfflineContent);
        set.add(playQueueManager);
        set.add(connectionHelper);
        set.add(offlineSettings);
        set.add(urlBuilder);
        set.add(scheduler);
        set.add(assetDownloader);
    }

    public ()
    {
        super("com.soundcloud.android.offline.DownloadOperations", "members/com.soundcloud.android.offline.DownloadOperations", false, com/soundcloud/android/offline/DownloadOperations);
    }
}
