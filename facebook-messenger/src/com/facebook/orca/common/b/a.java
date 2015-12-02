// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.b;


public final class a extends Enum
{

    private static final a $VALUES[];
    public static final a FB4A;
    public static final a ORCA;

    private a(String s, int i)
    {
        super(s, i);
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/facebook/orca/common/b/a, s);
    }

    public static a[] values()
    {
        return (a[])$VALUES.clone();
    }

    static 
    {
        ORCA = new a("ORCA", 0);
        FB4A = new a("FB4A", 1);
        $VALUES = (new a[] {
            ORCA, FB4A
        });
    }
}
