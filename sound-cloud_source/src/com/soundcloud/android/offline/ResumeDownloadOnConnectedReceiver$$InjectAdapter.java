// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import android.content.Context;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.offline:
//            ResumeDownloadOnConnectedReceiver, DownloadOperations

public final class  extends b
    implements Provider
{

    private b context;
    private b downloadOperations;

    public final void attach(l l1)
    {
        context = l1.a("android.content.Context", com/soundcloud/android/offline/ResumeDownloadOnConnectedReceiver, getClass().getClassLoader());
        downloadOperations = l1.a("com.soundcloud.android.offline.DownloadOperations", com/soundcloud/android/offline/ResumeDownloadOnConnectedReceiver, getClass().getClassLoader());
    }

    public final ResumeDownloadOnConnectedReceiver get()
    {
        return new ResumeDownloadOnConnectedReceiver((Context)context.get(), (DownloadOperations)downloadOperations.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(downloadOperations);
    }

    public ()
    {
        super("com.soundcloud.android.offline.ResumeDownloadOnConnectedReceiver", "members/com.soundcloud.android.offline.ResumeDownloadOnConnectedReceiver", true, com/soundcloud/android/offline/ResumeDownloadOnConnectedReceiver);
    }
}
