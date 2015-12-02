// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;


final class bh extends Enum
{

    private static final bh $VALUES[];
    public static final bh DOWNLOADED;
    public static final bh ERROR;
    public static final bh INIT;

    private bh(String s, int i)
    {
        super(s, i);
    }

    public static bh valueOf(String s)
    {
        return (bh)Enum.valueOf(com/facebook/orca/threadview/bh, s);
    }

    public static bh[] values()
    {
        return (bh[])$VALUES.clone();
    }

    static 
    {
        INIT = new bh("INIT", 0);
        DOWNLOADED = new bh("DOWNLOADED", 1);
        ERROR = new bh("ERROR", 2);
        $VALUES = (new bh[] {
            INIT, DOWNLOADED, ERROR
        });
    }
}
