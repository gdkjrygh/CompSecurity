// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.a;


public final class b extends Enum
{

    private static final b $VALUES[];
    public static final b CONVERSION;
    public static final b EXPOSURE;
    public static final b UNDEPLOYMENT;

    private b(String s, int i)
    {
        super(s, i);
    }

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(com/facebook/abtest/qe/a/b, s);
    }

    public static b[] values()
    {
        return (b[])$VALUES.clone();
    }

    static 
    {
        EXPOSURE = new b("EXPOSURE", 0);
        UNDEPLOYMENT = new b("UNDEPLOYMENT", 1);
        CONVERSION = new b("CONVERSION", 2);
        $VALUES = (new b[] {
            EXPOSURE, UNDEPLOYMENT, CONVERSION
        });
    }
}
