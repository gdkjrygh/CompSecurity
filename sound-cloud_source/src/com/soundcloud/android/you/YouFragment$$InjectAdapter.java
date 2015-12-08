// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.you;

import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.you:
//            YouFragment, YouPresenter

public final class  extends b
    implements a, Provider
{

    private b presenter;
    private b supertype;

    public final void attach(l l1)
    {
        presenter = l1.a("com.soundcloud.android.you.YouPresenter", com/soundcloud/android/you/YouFragment, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.LightCycleSupportFragment", com/soundcloud/android/you/YouFragment, getClass().getClassLoader(), false);
    }

    public final YouFragment get()
    {
        YouFragment youfragment = new YouFragment();
        injectMembers(youfragment);
        return youfragment;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(presenter);
        set1.add(supertype);
    }

    public final void injectMembers(YouFragment youfragment)
    {
        youfragment.presenter = (YouPresenter)presenter.get();
        supertype.injectMembers(youfragment);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((YouFragment)obj);
    }

    public ()
    {
        super("com.soundcloud.android.you.YouFragment", "members/com.soundcloud.android.you.YouFragment", false, com/soundcloud/android/you/YouFragment);
    }
}
