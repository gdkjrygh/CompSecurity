// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzf;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.cast:
//            LaunchOptions

public static final class zzMg
{

    private LaunchOptions zzMg;

    public LaunchOptions build()
    {
        return zzMg;
    }

    public zzMg setLocale(Locale locale)
    {
        zzMg.setLanguage(zzf.zzb(locale));
        return this;
    }

    public age setRelaunchIfRunning(boolean flag)
    {
        zzMg.setRelaunchIfRunning(flag);
        return this;
    }

    public ()
    {
        zzMg = new LaunchOptions();
    }
}
