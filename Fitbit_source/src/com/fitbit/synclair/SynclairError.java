// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair;


public final class SynclairError extends Enum
{

    public static final SynclairError a;
    public static final SynclairError b;
    public static final SynclairError c;
    public static final SynclairError d;
    public static final SynclairError e;
    public static final SynclairError f;
    public static final SynclairError g;
    public static final SynclairError h;
    public static final SynclairError i;
    public static final SynclairError j;
    private static final SynclairError k[];

    private SynclairError(String s, int l)
    {
        super(s, l);
    }

    public static SynclairError valueOf(String s)
    {
        return (SynclairError)Enum.valueOf(com/fitbit/synclair/SynclairError, s);
    }

    public static SynclairError[] values()
    {
        return (SynclairError[])k.clone();
    }

    static 
    {
        a = new SynclairError("SEARCH_NOT_FOUND", 0);
        b = new SynclairError("SEARCH_FOUND_MANY", 1);
        c = new SynclairError("TRACKER_VALIDATION_ERROR", 2);
        d = new SynclairError("TRACKER_DISCONNECTED", 3);
        e = new SynclairError("TRACKER_LOW_BATTERY", 4);
        f = new SynclairError("TRACKER_BACKOFF", 5);
        g = new SynclairError("INVALID_APP_VERSION", 6);
        h = new SynclairError("NETWORK_ERROR", 7);
        i = new SynclairError("INTERNAL_ERROR", 8);
        j = new SynclairError("BLUETOOTH_ERROR_HANDLED", 9);
        k = (new SynclairError[] {
            a, b, c, d, e, f, g, h, i, j
        });
    }
}
