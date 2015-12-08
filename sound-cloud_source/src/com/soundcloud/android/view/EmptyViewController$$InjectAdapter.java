// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import com.soundcloud.android.utils.NetworkConnectionHelper;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.view:
//            EmptyViewController

public final class  extends b
    implements a, Provider
{

    private b networkConnectionHelper;
    private b supertype;

    public final void attach(l l1)
    {
        networkConnectionHelper = l1.a("com.soundcloud.android.utils.NetworkConnectionHelper", com/soundcloud/android/view/EmptyViewController, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.DefaultSupportFragmentLightCycle", com/soundcloud/android/view/EmptyViewController, getClass().getClassLoader(), false);
    }

    public final EmptyViewController get()
    {
        EmptyViewController emptyviewcontroller = new EmptyViewController((NetworkConnectionHelper)networkConnectionHelper.get());
        injectMembers(emptyviewcontroller);
        return emptyviewcontroller;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(networkConnectionHelper);
        set1.add(supertype);
    }

    public final void injectMembers(EmptyViewController emptyviewcontroller)
    {
        supertype.injectMembers(emptyviewcontroller);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((EmptyViewController)obj);
    }

    public ()
    {
        super("com.soundcloud.android.view.EmptyViewController", "members/com.soundcloud.android.view.EmptyViewController", false, com/soundcloud/android/view/EmptyViewController);
    }
}
