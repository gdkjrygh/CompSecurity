// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.main:
//            ScreenStateProvider

public final class  extends b
    implements a, Provider
{

    private b supertype;

    public final void attach(l l1)
    {
        supertype = l1.a("members/com.soundcloud.lightcycle.DefaultActivityLightCycle", com/soundcloud/android/main/ScreenStateProvider, getClass().getClassLoader(), false);
    }

    public final ScreenStateProvider get()
    {
        ScreenStateProvider screenstateprovider = new ScreenStateProvider();
        injectMembers(screenstateprovider);
        return screenstateprovider;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(supertype);
    }

    public final void injectMembers(ScreenStateProvider screenstateprovider)
    {
        supertype.injectMembers(screenstateprovider);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ScreenStateProvider)obj);
    }

    public ()
    {
        super("com.soundcloud.android.main.ScreenStateProvider", "members/com.soundcloud.android.main.ScreenStateProvider", false, com/soundcloud/android/main/ScreenStateProvider);
    }
}
