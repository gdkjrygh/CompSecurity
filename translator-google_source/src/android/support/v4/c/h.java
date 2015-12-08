// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.c;

import java.util.Locale;

// Referenced classes of package android.support.v4.c:
//            j, i

public final class h
{

    public static final Locale a = new Locale("", "");
    private static final i b;
    private static String c = "Arab";
    private static String d = "Hebr";

    public static int a(Locale locale)
    {
        return b.a(locale);
    }

    static String a()
    {
        return c;
    }

    static String b()
    {
        return d;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            b = new j();
        } else
        {
            b = new i((byte)0);
        }
    }
}
