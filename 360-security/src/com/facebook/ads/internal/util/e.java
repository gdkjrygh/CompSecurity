// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.util;

import java.util.Locale;

// Referenced classes of package com.facebook.ads.internal.util:
//            t

public final class e extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    private static final e d[];

    private e(String s, int i)
    {
        super(s, i);
    }

    public static e a(String s)
    {
        if (t.a(s))
        {
            return a;
        }
        try
        {
            s = valueOf(s.toUpperCase(Locale.US));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return a;
        }
        return s;
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/facebook/ads/internal/util/e, s);
    }

    public static e[] values()
    {
        return (e[])d.clone();
    }

    static 
    {
        a = new e("NONE", 0);
        b = new e("INSTALLED", 1);
        c = new e("NOT_INSTALLED", 2);
        d = (new e[] {
            a, b, c
        });
    }
}
