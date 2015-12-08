// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.ads;


public final class AdPlacement extends Enum
{

    public static final AdPlacement a;
    public static final AdPlacement b;
    public static final AdPlacement c;
    public static final AdPlacement d;
    public static final AdPlacement e;
    private static final AdPlacement f[];

    private AdPlacement(String s, int i)
    {
        super(s, i);
    }

    public static AdPlacement valueOf(String s)
    {
        return (AdPlacement)Enum.valueOf(com/skype/android/ads/AdPlacement, s);
    }

    public static AdPlacement[] values()
    {
        return (AdPlacement[])f.clone();
    }

    static 
    {
        a = new AdPlacement("RECENTS", 0);
        b = new AdPlacement("FAVORITES", 1);
        c = new AdPlacement("CONTACTS", 2);
        d = new AdPlacement("CALL", 3);
        e = new AdPlacement("OTHER", 4);
        f = (new AdPlacement[] {
            a, b, c, d, e
        });
    }
}
