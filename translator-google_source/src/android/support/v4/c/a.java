// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.c;

import java.util.Locale;

// Referenced classes of package android.support.v4.c:
//            e, d, c, b

public final class a
{

    private static final b a;

    public static String a(Locale locale)
    {
        return a.a(locale);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            a = new e();
        } else
        if (i >= 14)
        {
            a = new d();
        } else
        {
            a = new c();
        }
    }
}
