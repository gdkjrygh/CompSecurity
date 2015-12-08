// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.ads;


public final class AdParent extends Enum
{

    public static final AdParent a;
    public static final AdParent b;
    public static final AdParent c;
    private static final AdParent d[];

    private AdParent(String s, int i)
    {
        super(s, i);
    }

    public static AdParent valueOf(String s)
    {
        return (AdParent)Enum.valueOf(com/skype/android/ads/AdParent, s);
    }

    public static AdParent[] values()
    {
        return (AdParent[])d.clone();
    }

    static 
    {
        a = new AdParent("MAIN", 0);
        b = new AdParent("CALL", 1);
        c = new AdParent("OTHER", 2);
        d = (new AdParent[] {
            a, b, c
        });
    }
}
