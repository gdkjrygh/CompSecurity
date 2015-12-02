// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;


public final class bp extends Enum
{

    private static final bp $VALUES[];
    public static final bp External;
    public static final bp Internal;

    private bp(String s, int i)
    {
        super(s, i);
    }

    public static bp valueOf(String s)
    {
        return (bp)Enum.valueOf(com/facebook/orca/sms/bp, s);
    }

    public static bp[] values()
    {
        return (bp[])$VALUES.clone();
    }

    static 
    {
        Internal = new bp("Internal", 0);
        External = new bp("External", 1);
        $VALUES = (new bp[] {
            Internal, External
        });
    }
}
