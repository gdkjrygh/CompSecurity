// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.internal.ik;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.cast:
//            LaunchOptions

public static final class Fd
{

    private LaunchOptions Fd;

    public LaunchOptions build()
    {
        return Fd;
    }

    public Fd setLocale(Locale locale)
    {
        Fd.setLanguage(ik.b(locale));
        return this;
    }

    public age setRelaunchIfRunning(boolean flag)
    {
        Fd.setRelaunchIfRunning(flag);
        return this;
    }

    public ()
    {
        Fd = new LaunchOptions();
    }
}
