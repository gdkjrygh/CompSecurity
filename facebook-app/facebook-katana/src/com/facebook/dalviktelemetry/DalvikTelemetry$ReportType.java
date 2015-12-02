// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.dalviktelemetry;


final class  extends Enum
{

    private static final TEST $VALUES[];
    public static final TEST NORMAL;
    public static final TEST TEST;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/facebook/dalviktelemetry/DalvikTelemetry$ReportType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NORMAL = new <init>("NORMAL", 0);
        TEST = new <init>("TEST", 1);
        $VALUES = (new .VALUES[] {
            NORMAL, TEST
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
