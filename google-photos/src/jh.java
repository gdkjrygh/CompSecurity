// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

public final class jh
{

    public static final Locale a = new Locale("", "");
    private static final ji b;
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
            b = new jj();
        } else
        {
            b = new ji((byte)0);
        }
    }
}
