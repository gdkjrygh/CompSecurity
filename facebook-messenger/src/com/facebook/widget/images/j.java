// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.images;


public final class j extends Enum
{

    private static final j $VALUES[];
    public static final j FULL_RES;
    public static final j LOW_RES;
    public static final j NONE;

    private j(String s, int i)
    {
        super(s, i);
    }

    public static j valueOf(String s)
    {
        return (j)Enum.valueOf(com/facebook/widget/images/j, s);
    }

    public static j[] values()
    {
        return (j[])$VALUES.clone();
    }

    static 
    {
        NONE = new j("NONE", 0);
        LOW_RES = new j("LOW_RES", 1);
        FULL_RES = new j("FULL_RES", 2);
        $VALUES = (new j[] {
            NONE, LOW_RES, FULL_RES
        });
    }
}
