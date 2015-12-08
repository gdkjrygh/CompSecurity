// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.di.components;

import dagger.internal.Factory;

// Referenced classes of package com.pinterest.di.components:
//            ActivityComponent, DaggerCheckoutComponent

class a
    implements Factory
{

    final ilder a;
    final DaggerCheckoutComponent b;
    private final ActivityComponent c;

    public Object get()
    {
        android.content.res.Resources resources = c.resources();
        if (resources == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return resources;
        }
    }

    ilder(DaggerCheckoutComponent daggercheckoutcomponent, ilder ilder)
    {
        b = daggercheckoutcomponent;
        a = ilder;
        super();
        c = com.pinterest.di.components.ilder.a(a);
    }
}
