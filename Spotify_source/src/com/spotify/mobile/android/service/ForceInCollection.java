// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service;


public final class ForceInCollection extends Enum
{

    public static final ForceInCollection a;
    public static final ForceInCollection b;
    private static final ForceInCollection c[];

    private ForceInCollection(String s, int i)
    {
        super(s, i);
    }

    public static ForceInCollection valueOf(String s)
    {
        return (ForceInCollection)Enum.valueOf(com/spotify/mobile/android/service/ForceInCollection, s);
    }

    public static ForceInCollection[] values()
    {
        return (ForceInCollection[])c.clone();
    }

    static 
    {
        a = new ForceInCollection("YES", 0);
        b = new ForceInCollection("NO", 1);
        c = (new ForceInCollection[] {
            a, b
        });
    }
}
