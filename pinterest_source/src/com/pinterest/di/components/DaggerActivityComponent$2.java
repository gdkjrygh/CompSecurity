// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.di.components;

import dagger.internal.Factory;

// Referenced classes of package com.pinterest.di.components:
//            ApplicationComponent, DaggerActivityComponent

class a
    implements Factory
{

    final ilder a;
    final DaggerActivityComponent b;
    private final ApplicationComponent c;

    public Object get()
    {
        android.app.Application application = c.application();
        if (application == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return application;
        }
    }

    ilder(DaggerActivityComponent daggeractivitycomponent, ilder ilder)
    {
        b = daggeractivitycomponent;
        a = ilder;
        super();
        c = com.pinterest.di.components.ilder.a(a);
    }
}
