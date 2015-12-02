// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.activity;


public final class j extends Enum
{

    private static final j $VALUES[];
    public static final j DELETE;
    public static final j NORMAL;

    private j(String s, int i)
    {
        super(s, i);
    }

    public static j valueOf(String s)
    {
        return (j)Enum.valueOf(com/facebook/orca/activity/j, s);
    }

    public static j[] values()
    {
        return (j[])$VALUES.clone();
    }

    static 
    {
        NORMAL = new j("NORMAL", 0);
        DELETE = new j("DELETE", 1);
        $VALUES = (new j[] {
            NORMAL, DELETE
        });
    }
}
