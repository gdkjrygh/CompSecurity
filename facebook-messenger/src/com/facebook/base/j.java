// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base;


public final class j extends Enum
{

    private static final j $VALUES[];
    public static final j DEBUG;
    public static final j IN_HOUSE;
    public static final j PROD;

    private j(String s, int i)
    {
        super(s, i);
    }

    public static j valueOf(String s)
    {
        return (j)Enum.valueOf(com/facebook/base/j, s);
    }

    public static j[] values()
    {
        return (j[])$VALUES.clone();
    }

    public String getPermission()
    {
        return String.format("com.facebook.permission.%s.FB_APP_COMMUNICATION", new Object[] {
            name().toLowerCase()
        });
    }

    static 
    {
        DEBUG = new j("DEBUG", 0);
        IN_HOUSE = new j("IN_HOUSE", 1);
        PROD = new j("PROD", 2);
        $VALUES = (new j[] {
            DEBUG, IN_HOUSE, PROD
        });
    }
}
