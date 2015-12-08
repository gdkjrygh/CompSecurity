// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.utils:
//            CollapsingScrollHelper

public final class  extends b
    implements a, Provider
{

    private b supertype;

    public final void attach(l l1)
    {
        supertype = l1.a("members/com.soundcloud.lightcycle.DefaultSupportFragmentLightCycle", com/soundcloud/android/utils/CollapsingScrollHelper, getClass().getClassLoader(), false);
    }

    public final CollapsingScrollHelper get()
    {
        CollapsingScrollHelper collapsingscrollhelper = new CollapsingScrollHelper();
        injectMembers(collapsingscrollhelper);
        return collapsingscrollhelper;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(supertype);
    }

    public final void injectMembers(CollapsingScrollHelper collapsingscrollhelper)
    {
        supertype.injectMembers(collapsingscrollhelper);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((CollapsingScrollHelper)obj);
    }

    public ()
    {
        super("com.soundcloud.android.utils.CollapsingScrollHelper", "members/com.soundcloud.android.utils.CollapsingScrollHelper", false, com/soundcloud/android/utils/CollapsingScrollHelper);
    }
}
