// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.internal.in;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.cast:
//            LaunchOptions

public static final class FS
{

    private LaunchOptions FS;

    public LaunchOptions build()
    {
        return FS;
    }

    public FS setLocale(Locale locale)
    {
        FS.setLanguage(in.b(locale));
        return this;
    }

    public age setRelaunchIfRunning(boolean flag)
    {
        FS.setRelaunchIfRunning(flag);
        return this;
    }

    public ()
    {
        FS = new LaunchOptions();
    }
}
