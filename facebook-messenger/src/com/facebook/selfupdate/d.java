// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.selfupdate;


public final class d extends Enum
{

    private static final d $VALUES[];
    public static final d DEFAULT;
    public static final d FORCE_UPDATE_NOTIFY_USER;
    public static final d FORCE_UPDATE_SILENT;
    public static final d NOTIFY_USER;
    public final int value;

    private d(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/facebook/selfupdate/d, s);
    }

    public static d[] values()
    {
        return (d[])$VALUES.clone();
    }

    static 
    {
        NOTIFY_USER = new d("NOTIFY_USER", 0, 1);
        FORCE_UPDATE_NOTIFY_USER = new d("FORCE_UPDATE_NOTIFY_USER", 1, 2);
        FORCE_UPDATE_SILENT = new d("FORCE_UPDATE_SILENT", 2, 3);
        DEFAULT = new d("DEFAULT", 3, NOTIFY_USER.value);
        $VALUES = (new d[] {
            NOTIFY_USER, FORCE_UPDATE_NOTIFY_USER, FORCE_UPDATE_SILENT, DEFAULT
        });
    }
}
