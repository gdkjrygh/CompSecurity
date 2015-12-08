// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import dagger.internal.Factory;

// Referenced classes of package com.skype.android:
//            DaggerSkypeFragmentComponent, SkypeApplicationComponent

final class a
    implements Factory
{

    final lder a;
    final DaggerSkypeFragmentComponent b;
    private final SkypeApplicationComponent c;

    public final Object get()
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

    lder(DaggerSkypeFragmentComponent daggerskypefragmentcomponent, lder lder)
    {
        b = daggerskypefragmentcomponent;
        a = lder;
        super();
        c = com.skype.android.lder.a(a);
    }
}
