// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.b;

import a.a.f;
import com.appboy.d.c;
import java.util.Locale;

public final class a extends Enum
    implements c
{

    public static final a a;
    public static final a b;
    private static final a c[];

    private a(String s, int i)
    {
        super(s, i);
    }

    public static String a(String s)
    {
        return s.replace(" ", "_").toUpperCase(Locale.US);
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/appboy/b/a, s);
    }

    public static a[] values()
    {
        return (a[])c.clone();
    }

    public final Object a()
    {
        switch (f.a[ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return "Google Play Store";

        case 2: // '\002'
            return "Kindle Store";
        }
    }

    static 
    {
        a = new a("GOOGLE_PLAY_STORE", 0);
        b = new a("KINDLE_STORE", 1);
        c = (new a[] {
            a, b
        });
    }
}
