// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.cast;

import com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.cast:
//            DefaultCastConnectionHelper

public final class r extends b
    implements a, Provider
{

    private b supertype;
    private b videoCastManager;

    public final void attach(l l1)
    {
        videoCastManager = l1.a("com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager", com/soundcloud/android/cast/DefaultCastConnectionHelper, getClass().getClassLoader());
        supertype = l1.a("members/com.google.android.libraries.cast.companionlibrary.cast.callbacks.VideoCastConsumerImpl", com/soundcloud/android/cast/DefaultCastConnectionHelper, getClass().getClassLoader(), false);
    }

    public final DefaultCastConnectionHelper get()
    {
        DefaultCastConnectionHelper defaultcastconnectionhelper = new DefaultCastConnectionHelper((VideoCastManager)videoCastManager.get());
        injectMembers(defaultcastconnectionhelper);
        return defaultcastconnectionhelper;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(videoCastManager);
        set1.add(supertype);
    }

    public final void injectMembers(DefaultCastConnectionHelper defaultcastconnectionhelper)
    {
        supertype.injectMembers(defaultcastconnectionhelper);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((DefaultCastConnectionHelper)obj);
    }

    public r()
    {
        super("com.soundcloud.android.cast.DefaultCastConnectionHelper", "members/com.soundcloud.android.cast.DefaultCastConnectionHelper", true, com/soundcloud/android/cast/DefaultCastConnectionHelper);
    }
}
