// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.upload;

import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.creators.upload:
//            UploadMonitorFragment, UploadMonitorPresenter

public final class Q extends b
    implements a, Provider
{

    private b supertype;
    private b uploadMonitorPresenter;

    public final void attach(l l1)
    {
        uploadMonitorPresenter = l1.a("com.soundcloud.android.creators.upload.UploadMonitorPresenter", com/soundcloud/android/creators/upload/UploadMonitorFragment, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.LightCycleSupportFragment", com/soundcloud/android/creators/upload/UploadMonitorFragment, getClass().getClassLoader(), false);
    }

    public final UploadMonitorFragment get()
    {
        UploadMonitorFragment uploadmonitorfragment = new UploadMonitorFragment();
        injectMembers(uploadmonitorfragment);
        return uploadmonitorfragment;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(uploadMonitorPresenter);
        set1.add(supertype);
    }

    public final void injectMembers(UploadMonitorFragment uploadmonitorfragment)
    {
        uploadmonitorfragment.uploadMonitorPresenter = (UploadMonitorPresenter)uploadMonitorPresenter.get();
        supertype.injectMembers(uploadmonitorfragment);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((UploadMonitorFragment)obj);
    }

    public Q()
    {
        super("com.soundcloud.android.creators.upload.UploadMonitorFragment", "members/com.soundcloud.android.creators.upload.UploadMonitorFragment", false, com/soundcloud/android/creators/upload/UploadMonitorFragment);
    }
}
