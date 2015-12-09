// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs.service;


public final class DncsPairingError extends Enum
{

    public static final DncsPairingError a;
    public static final DncsPairingError b;
    public static final DncsPairingError c;
    public static final DncsPairingError d;
    public static final DncsPairingError e;
    public static final DncsPairingError f;
    public static final DncsPairingError g;
    private static final DncsPairingError h[];

    private DncsPairingError(String s, int i)
    {
        super(s, i);
    }

    public static DncsPairingError valueOf(String s)
    {
        return (DncsPairingError)Enum.valueOf(com/fitbit/dncs/service/DncsPairingError, s);
    }

    public static DncsPairingError[] values()
    {
        return (DncsPairingError[])h.clone();
    }

    public boolean a()
    {
        return this == c || this == b;
    }

    public boolean b()
    {
        return this == a || this == e || this == f;
    }

    static 
    {
        a = new DncsPairingError("INTERNAL_ERROR", 0);
        b = new DncsPairingError("CANCELED_INTERNAL", 1);
        c = new DncsPairingError("CANCELED_BY_USER", 2);
        d = new DncsPairingError("UNKNOWN_DEVICE", 3);
        e = new DncsPairingError("BLUETOOTH_ERROR", 4);
        f = new DncsPairingError("DEVICE_NOT_FOUND", 5);
        g = new DncsPairingError("BLUETOOTH_BUSY", 6);
        h = (new DncsPairingError[] {
            a, b, c, d, e, f, g
        });
    }
}
