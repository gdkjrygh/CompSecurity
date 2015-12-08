// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


final class af extends Enum
{

    public static final af a;
    public static final af b;
    public static final af c;
    private static final af d[];

    private af(String s, int i)
    {
        super(s, i);
    }

    public static af valueOf(String s)
    {
        return (af)Enum.valueOf(com/google/android/gms/tagmanager/af, s);
    }

    public static af[] values()
    {
        return (af[])d.clone();
    }

    static 
    {
        a = new af("NONE", 0);
        b = new af("CONTAINER", 1);
        c = new af("CONTAINER_DEBUG", 2);
        d = (new af[] {
            a, b, c
        });
    }
}
