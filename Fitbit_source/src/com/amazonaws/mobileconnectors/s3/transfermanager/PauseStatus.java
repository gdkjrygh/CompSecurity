// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.mobileconnectors.s3.transfermanager;


public final class PauseStatus extends Enum
{

    public static final PauseStatus a;
    public static final PauseStatus b;
    public static final PauseStatus c;
    public static final PauseStatus d;
    public static final PauseStatus e;
    private static final PauseStatus f[];

    private PauseStatus(String s, int i)
    {
        super(s, i);
    }

    public static PauseStatus valueOf(String s)
    {
        return (PauseStatus)Enum.valueOf(com/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus, s);
    }

    public static PauseStatus[] values()
    {
        return (PauseStatus[])f.clone();
    }

    public boolean a()
    {
        return this == a;
    }

    public boolean b()
    {
        return this == e || this == c;
    }

    public boolean c()
    {
        return this == b || this == d;
    }

    static 
    {
        a = new PauseStatus("SUCCESS", 0);
        b = new PauseStatus("NOT_STARTED", 1);
        c = new PauseStatus("CANCELLED_BEFORE_START", 2);
        d = new PauseStatus("NO_EFFECT", 3);
        e = new PauseStatus("CANCELLED", 4);
        f = (new PauseStatus[] {
            a, b, c, d, e
        });
    }
}
