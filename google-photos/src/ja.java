// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

public final class ja
{

    private static final jb a;

    public static String a(Locale locale)
    {
        return a.a(locale);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            a = new je();
        } else
        if (i >= 14)
        {
            a = new jd();
        } else
        {
            a = new jc();
        }
    }
}
