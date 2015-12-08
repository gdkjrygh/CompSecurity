// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import android.content.res.Resources;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.waveform.WaveformFetchCommand;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflineTrackAssetDownloader, WaveformStorage

public final class  extends b
    implements Provider
{

    private b imageOperations;
    private b resources;
    private b waveformFetchCommand;
    private b waveformStorage;

    public final void attach(l l1)
    {
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/offline/OfflineTrackAssetDownloader, getClass().getClassLoader());
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/offline/OfflineTrackAssetDownloader, getClass().getClassLoader());
        waveformFetchCommand = l1.a("com.soundcloud.android.waveform.WaveformFetchCommand", com/soundcloud/android/offline/OfflineTrackAssetDownloader, getClass().getClassLoader());
        waveformStorage = l1.a("com.soundcloud.android.offline.WaveformStorage", com/soundcloud/android/offline/OfflineTrackAssetDownloader, getClass().getClassLoader());
    }

    public final OfflineTrackAssetDownloader get()
    {
        return new OfflineTrackAssetDownloader((ImageOperations)imageOperations.get(), (Resources)resources.get(), (WaveformFetchCommand)waveformFetchCommand.get(), (WaveformStorage)waveformStorage.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(imageOperations);
        set.add(resources);
        set.add(waveformFetchCommand);
        set.add(waveformStorage);
    }

    public ()
    {
        super("com.soundcloud.android.offline.OfflineTrackAssetDownloader", "members/com.soundcloud.android.offline.OfflineTrackAssetDownloader", false, com/soundcloud/android/offline/OfflineTrackAssetDownloader);
    }
}
