// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ax;


public final class b extends Enum
{

    public static final b a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    public static final b f;
    public static final b g;
    public static final b h;
    public static final b i;
    public static final b j;
    public static final b k;
    public static final b l;
    public static final b m;
    public static final b n;
    public static final b o;
    public static final b p;
    public static final b q;
    public static final b r;
    public static final b s;
    private static final b t[];

    private b(String s1, int i1)
    {
        super(s1, i1);
    }

    public static b valueOf(String s1)
    {
        return (b)Enum.valueOf(p/ax/b, s1);
    }

    public static b[] values()
    {
        return (b[])t.clone();
    }

    static 
    {
        a = new b("BLUETOOTH_ADAPTER_NULL", 0);
        b = new b("BLUETOOTH_DISABLED", 1);
        c = new b("BLUETOOTH_SOCKET_UNAVAILABLE", 2);
        d = new b("HEARTBEAT_PAST_DUE", 3);
        e = new b("INCORRECT_LIFECYCLE_MODEL", 4);
        f = new b("INVALID_ARGUMENT", 5);
        g = new b("INVALID_RPC_PARAMETER", 6);
        h = new b("PERMISSION_DENIED", 7);
        i = new b("RESERVED_CORRELATION_ID", 8);
        j = new b("SYNC_CONNECTION_FAILED", 9);
        k = new b("SYNC_PROXY_CYCLED", 10);
        l = new b("SYNC_PROXY_DISPOSED", 11);
        m = new b("SYNC_PROXY_OBSOLETE", 12);
        n = new b("SYNC_REGISTRATION_ERROR", 13);
        o = new b("SYNC_UNAVAILABLE", 14);
        p = new b("INVALID_HEADER", 15);
        q = new b("DATA_BUFFER_NULL", 16);
        r = new b("SYNC_USB_DETACHED", 17);
        s = new b("SYNC_USB_PERMISSION_DENIED", 18);
        t = (new b[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s
        });
    }
}
