// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.proxy.rpc.enums;


public final class LockScreenStatus extends Enum
{

    public static final LockScreenStatus a;
    public static final LockScreenStatus b;
    public static final LockScreenStatus c;
    private static final LockScreenStatus d[];

    private LockScreenStatus(String s, int i)
    {
        super(s, i);
    }

    public static LockScreenStatus valueOf(String s)
    {
        return (LockScreenStatus)Enum.valueOf(com/ford/syncV4/proxy/rpc/enums/LockScreenStatus, s);
    }

    public static LockScreenStatus[] values()
    {
        return (LockScreenStatus[])d.clone();
    }

    static 
    {
        a = new LockScreenStatus("REQUIRED", 0);
        b = new LockScreenStatus("OPTIONAL", 1);
        c = new LockScreenStatus("OFF", 2);
        d = (new LockScreenStatus[] {
            a, b, c
        });
    }
}
