// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.executors;


public final class v extends Enum
{

    private static final v $VALUES[];
    public static final v HIGH;
    public static final v LOW;
    public static final v NORMAL;

    private v(String s, int i)
    {
        super(s, i);
    }

    public static v valueOf(String s)
    {
        return (v)Enum.valueOf(com/facebook/common/executors/v, s);
    }

    public static v[] values()
    {
        return (v[])$VALUES.clone();
    }

    static 
    {
        HIGH = new v("HIGH", 0);
        NORMAL = new v("NORMAL", 1);
        LOW = new v("LOW", 2);
        $VALUES = (new v[] {
            HIGH, NORMAL, LOW
        });
    }
}
