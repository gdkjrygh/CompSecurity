// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import dagger.a.b;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.offline:
//            DownloadQueue

public final class A extends b
    implements Provider
{

    public final DownloadQueue get()
    {
        return new DownloadQueue();
    }

    public final volatile Object get()
    {
        return get();
    }

    public A()
    {
        super("com.soundcloud.android.offline.DownloadQueue", "members/com.soundcloud.android.offline.DownloadQueue", false, com/soundcloud/android/offline/DownloadQueue);
    }
}
