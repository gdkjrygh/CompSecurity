// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.selfupdate;


public final class e extends Enum
{

    private static final e $VALUES[];
    public static final e DEFAULT;
    public static final e MOBILE;
    public static final e WIFI;
    public final int value;

    private e(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/facebook/selfupdate/e, s);
    }

    public static e[] values()
    {
        return (e[])$VALUES.clone();
    }

    static 
    {
        MOBILE = new e("MOBILE", 0, 1);
        WIFI = new e("WIFI", 1, 2);
        DEFAULT = new e("DEFAULT", 2, WIFI.value);
        $VALUES = (new e[] {
            MOBILE, WIFI, DEFAULT
        });
    }
}
