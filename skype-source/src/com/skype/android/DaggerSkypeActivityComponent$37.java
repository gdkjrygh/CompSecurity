// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import dagger.internal.Factory;

// Referenced classes of package com.skype.android:
//            DaggerSkypeActivityComponent, SkypeApplicationComponent

final class a
    implements Factory
{

    final lder a;
    final DaggerSkypeActivityComponent b;
    private final SkypeApplicationComponent c;

    public final Object get()
    {
        com.skype.android.config.ecs.EcsClient ecsclient = c.ecsClient();
        if (ecsclient == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return ecsclient;
        }
    }

    lder(DaggerSkypeActivityComponent daggerskypeactivitycomponent, lder lder)
    {
        b = daggerskypeactivitycomponent;
        a = lder;
        super();
        c = com.skype.android.lder.b(a);
    }
}
