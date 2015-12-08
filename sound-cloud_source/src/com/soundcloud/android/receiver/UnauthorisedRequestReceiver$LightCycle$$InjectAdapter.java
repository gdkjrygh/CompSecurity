// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.receiver;

import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

public final class  extends b
    implements a, Provider
{

    private b supertype;

    public final void attach(l l1)
    {
        supertype = l1.a("members/com.soundcloud.lightcycle.DefaultActivityLightCycle", com/soundcloud/android/receiver/UnauthorisedRequestReceiver$LightCycle, getClass().getClassLoader(), false);
    }

    public final supertype get()
    {
        supertype supertype1 = new supertype();
        injectMembers(supertype1);
        return supertype1;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(supertype);
    }

    public final void injectMembers(supertype supertype1)
    {
        supertype.injectMembers(supertype1);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((injectMembers)obj);
    }

    public ()
    {
        super("com.soundcloud.android.receiver.UnauthorisedRequestReceiver$LightCycle", "members/com.soundcloud.android.receiver.UnauthorisedRequestReceiver$LightCycle", false, com/soundcloud/android/receiver/UnauthorisedRequestReceiver$LightCycle);
    }
}
