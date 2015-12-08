// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.exception;


public final class SyncExceptionCause extends Enum
{

    public static final SyncExceptionCause a;
    public static final SyncExceptionCause b;
    public static final SyncExceptionCause c;
    public static final SyncExceptionCause d;
    public static final SyncExceptionCause e;
    public static final SyncExceptionCause f;
    public static final SyncExceptionCause g;
    public static final SyncExceptionCause h;
    public static final SyncExceptionCause i;
    public static final SyncExceptionCause j;
    public static final SyncExceptionCause k;
    public static final SyncExceptionCause l;
    public static final SyncExceptionCause m;
    public static final SyncExceptionCause n;
    public static final SyncExceptionCause o;
    private static SyncExceptionCause p;
    private static SyncExceptionCause q;
    private static SyncExceptionCause r;
    private static SyncExceptionCause s;
    private static final SyncExceptionCause t[];

    private SyncExceptionCause(String s1, int i1)
    {
        super(s1, i1);
    }

    public static SyncExceptionCause valueOf(String s1)
    {
        return (SyncExceptionCause)Enum.valueOf(com/ford/syncV4/exception/SyncExceptionCause, s1);
    }

    public static SyncExceptionCause[] values()
    {
        return (SyncExceptionCause[])t.clone();
    }

    static 
    {
        a = new SyncExceptionCause("BLUETOOTH_ADAPTER_NULL", 0);
        b = new SyncExceptionCause("BLUETOOTH_DISABLED", 1);
        c = new SyncExceptionCause("BLUETOOTH_SOCKET_UNAVAILABLE", 2);
        d = new SyncExceptionCause("HEARTBEAT_PAST_DUE", 3);
        e = new SyncExceptionCause("INCORRECT_LIFECYCLE_MODEL", 4);
        f = new SyncExceptionCause("INVALID_ARGUMENT", 5);
        p = new SyncExceptionCause("INVALID_RPC_PARAMETER", 6);
        g = new SyncExceptionCause("PERMISSION_DENIED", 7);
        h = new SyncExceptionCause("RESERVED_CORRELATION_ID", 8);
        i = new SyncExceptionCause("SYNC_CONNECTION_FAILED", 9);
        j = new SyncExceptionCause("SYNC_PROXY_CYCLED", 10);
        k = new SyncExceptionCause("SYNC_PROXY_DISPOSED", 11);
        q = new SyncExceptionCause("SYNC_PROXY_OBSOLETE", 12);
        l = new SyncExceptionCause("SYNC_REGISTRATION_ERROR", 13);
        m = new SyncExceptionCause("SYNC_UNAVAILABLE", 14);
        n = new SyncExceptionCause("INVALID_HEADER", 15);
        o = new SyncExceptionCause("DATA_BUFFER_NULL", 16);
        r = new SyncExceptionCause("SYNC_USB_DETACHED", 17);
        s = new SyncExceptionCause("SYNC_USB_PERMISSION_DENIED", 18);
        t = (new SyncExceptionCause[] {
            a, b, c, d, e, f, p, g, h, i, 
            j, k, q, l, m, n, o, r, s
        });
    }
}
