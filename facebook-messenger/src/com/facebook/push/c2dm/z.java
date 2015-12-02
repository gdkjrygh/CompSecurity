// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.c2dm;


public final class z extends Enum
{

    private static final z $VALUES[];
    public static final z C2DM;
    public static final z GCM;

    private z(String s, int i)
    {
        super(s, i);
    }

    public static z valueOf(String s)
    {
        return (z)Enum.valueOf(com/facebook/push/c2dm/z, s);
    }

    public static z[] values()
    {
        return (z[])$VALUES.clone();
    }

    static 
    {
        C2DM = new z("C2DM", 0);
        GCM = new z("GCM", 1);
        $VALUES = (new z[] {
            C2DM, GCM
        });
    }
}
