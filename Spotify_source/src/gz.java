// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

public final class gz
{

    public static final Locale a = new Locale("", "");
    private static final ha b;
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
            b = new hb((byte)0);
        } else
        {
            b = new ha((byte)0);
        }
    }
}
