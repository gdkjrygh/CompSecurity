// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.creators.record:
//            RecordFragment, RecordPresenter

public final class  extends b
    implements a, Provider
{

    private b recordPresenter;
    private b supertype;

    public final void attach(l l1)
    {
        recordPresenter = l1.a("com.soundcloud.android.creators.record.RecordPresenter", com/soundcloud/android/creators/record/RecordFragment, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.LightCycleSupportFragment", com/soundcloud/android/creators/record/RecordFragment, getClass().getClassLoader(), false);
    }

    public final RecordFragment get()
    {
        RecordFragment recordfragment = new RecordFragment();
        injectMembers(recordfragment);
        return recordfragment;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(recordPresenter);
        set1.add(supertype);
    }

    public final void injectMembers(RecordFragment recordfragment)
    {
        recordfragment.recordPresenter = (RecordPresenter)recordPresenter.get();
        supertype.injectMembers(recordfragment);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((RecordFragment)obj);
    }

    public ()
    {
        super("com.soundcloud.android.creators.record.RecordFragment", "members/com.soundcloud.android.creators.record.RecordFragment", false, com/soundcloud/android/creators/record/RecordFragment);
    }
}
