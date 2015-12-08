// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import android.content.Context;
import com.soundcloud.android.utils.NetworkConnectivityListener;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.main:
//            NetworkConnectivityController

public final class  extends b
    implements a, Provider
{

    private b connectivityListener;
    private b context;
    private b supertype;

    public final void attach(l l1)
    {
        context = l1.a("android.content.Context", com/soundcloud/android/main/NetworkConnectivityController, getClass().getClassLoader());
        connectivityListener = l1.a("com.soundcloud.android.utils.NetworkConnectivityListener", com/soundcloud/android/main/NetworkConnectivityController, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.DefaultActivityLightCycle", com/soundcloud/android/main/NetworkConnectivityController, getClass().getClassLoader(), false);
    }

    public final NetworkConnectivityController get()
    {
        NetworkConnectivityController networkconnectivitycontroller = new NetworkConnectivityController((Context)context.get(), (NetworkConnectivityListener)connectivityListener.get());
        injectMembers(networkconnectivitycontroller);
        return networkconnectivitycontroller;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(connectivityListener);
        set1.add(supertype);
    }

    public final void injectMembers(NetworkConnectivityController networkconnectivitycontroller)
    {
        supertype.injectMembers(networkconnectivitycontroller);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((NetworkConnectivityController)obj);
    }

    public ()
    {
        super("com.soundcloud.android.main.NetworkConnectivityController", "members/com.soundcloud.android.main.NetworkConnectivityController", false, com/soundcloud/android/main/NetworkConnectivityController);
    }
}
