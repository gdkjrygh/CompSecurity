// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.offline:
//            DownloadOperations, TrackDownloadsStorage, SecureFileStorage

public final class  extends b
    implements Provider
{

    private b operations;
    private b secureFiles;
    private b tracksStorage;

    public final void attach(l l1)
    {
        operations = l1.a("com.soundcloud.android.offline.DownloadOperations", com/soundcloud/android/offline/DownloadHandler$Builder, getClass().getClassLoader());
        tracksStorage = l1.a("com.soundcloud.android.offline.TrackDownloadsStorage", com/soundcloud/android/offline/DownloadHandler$Builder, getClass().getClassLoader());
        secureFiles = l1.a("com.soundcloud.android.offline.SecureFileStorage", com/soundcloud/android/offline/DownloadHandler$Builder, getClass().getClassLoader());
    }

    public final secureFiles get()
    {
        return new secureFiles((DownloadOperations)operations.get(), (TrackDownloadsStorage)tracksStorage.get(), (SecureFileStorage)secureFiles.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(operations);
        set.add(tracksStorage);
        set.add(secureFiles);
    }

    public ()
    {
        super("com.soundcloud.android.offline.DownloadHandler$Builder", "members/com.soundcloud.android.offline.DownloadHandler$Builder", false, com/soundcloud/android/offline/DownloadHandler$Builder);
    }
}
