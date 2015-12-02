// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.l;


public final class a extends Enum
{

    private static final a $VALUES[];
    public static final a AVAILABLE;
    public static final a NONE;

    private a(String s, int i)
    {
        super(s, i);
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/facebook/l/a, s);
    }

    public static a[] values()
    {
        return (a[])$VALUES.clone();
    }

    static 
    {
        AVAILABLE = new a("AVAILABLE", 0);
        NONE = new a("NONE", 1);
        $VALUES = (new a[] {
            AVAILABLE, NONE
        });
    }
}
