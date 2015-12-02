// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.enginehelper.clean;


public final class CleanScanType extends Enum
{

    public static final CleanScanType FULL;
    public static final CleanScanType NOTIFICATION;
    public static final CleanScanType PREPOSE;
    private static final CleanScanType a[];

    private CleanScanType(String s, int i)
    {
        super(s, i);
    }

    public static CleanScanType valueOf(String s)
    {
        return (CleanScanType)Enum.valueOf(com/qihoo/security/enginehelper/clean/CleanScanType, s);
    }

    public static CleanScanType[] values()
    {
        return (CleanScanType[])a.clone();
    }

    static 
    {
        FULL = new CleanScanType("FULL", 0);
        PREPOSE = new CleanScanType("PREPOSE", 1);
        NOTIFICATION = new CleanScanType("NOTIFICATION", 2);
        a = (new CleanScanType[] {
            FULL, PREPOSE, NOTIFICATION
        });
    }
}
