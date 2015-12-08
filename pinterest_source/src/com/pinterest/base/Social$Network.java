// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.base;


public final class  extends Enum
{

    private static final NONE $VALUES[];
    public static final NONE FACEBOOK;
    public static final NONE GPLUS;
    public static final NONE NONE;
    public static final NONE RAKUTEN;
    public static final NONE TWITTER;

    public static  from(int i)
    {
         a[] = values();
        if (i < a.length && i >= 0)
        {
            return a[i];
        } else
        {
            return NONE;
        }
    }

    public static NONE valueOf(String s)
    {
        return (NONE)Enum.valueOf(com/pinterest/base/Social$Network, s);
    }

    public static NONE[] values()
    {
        return (NONE[])$VALUES.clone();
    }

    static 
    {
        FACEBOOK = new <init>("FACEBOOK", 0);
        GPLUS = new <init>("GPLUS", 1);
        TWITTER = new <init>("TWITTER", 2);
        RAKUTEN = new <init>("RAKUTEN", 3);
        NONE = new <init>("NONE", 4);
        $VALUES = (new .VALUES[] {
            FACEBOOK, GPLUS, TWITTER, RAKUTEN, NONE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
