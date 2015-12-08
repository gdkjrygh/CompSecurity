// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import dagger.internal.Factory;

// Referenced classes of package com.skype.android:
//            DaggerSkypeDialogFragmentComponent, SkypeApplicationComponent

final class a
    implements Factory
{

    final ilder a;
    final DaggerSkypeDialogFragmentComponent b;
    private final SkypeApplicationComponent c;

    public final Object get()
    {
        com.skype.android.res.DefaultAvatars defaultavatars = c.defaultAvatars();
        if (defaultavatars == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return defaultavatars;
        }
    }

    ilder(DaggerSkypeDialogFragmentComponent daggerskypedialogfragmentcomponent, ilder ilder)
    {
        b = daggerskypedialogfragmentcomponent;
        a = ilder;
        super();
        c = com.skype.android.ilder.a(a);
    }
}
