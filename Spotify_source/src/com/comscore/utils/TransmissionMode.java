// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils;


public final class TransmissionMode extends Enum
{

    public static final TransmissionMode a;
    public static final TransmissionMode b;
    public static final TransmissionMode c;
    public static final TransmissionMode d;
    public static final TransmissionMode e;
    private static final TransmissionMode f[];

    private TransmissionMode(String s, int i)
    {
        super(s, i);
    }

    public static TransmissionMode valueOf(String s)
    {
        return (TransmissionMode)Enum.valueOf(com/comscore/utils/TransmissionMode, s);
    }

    public static TransmissionMode[] values()
    {
        return (TransmissionMode[])f.clone();
    }

    static 
    {
        a = new TransmissionMode("DEFAULT", 0);
        b = new TransmissionMode("NEVER", 1);
        c = new TransmissionMode("WIFIONLY", 2);
        d = new TransmissionMode("PIGGYBACK", 3);
        e = new TransmissionMode("DISABLED", 4);
        f = (new TransmissionMode[] {
            a, b, c, d, e
        });
    }
}
