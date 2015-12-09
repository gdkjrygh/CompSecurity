// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.HashMap;

public final class df extends Enum
{

    public static final df A;
    public static final df B;
    private static HashMap C;
    private static final df F[];
    public static final df a;
    public static final df b;
    public static final df c;
    public static final df d;
    public static final df e;
    public static final df f;
    public static final df g;
    public static final df h;
    public static final df i;
    public static final df j;
    public static final df k;
    public static final df l;
    public static final df m;
    public static final df n;
    public static final df o;
    public static final df p;
    public static final df q;
    public static final df r;
    public static final df s;
    public static final df t;
    public static final df u;
    public static final df v;
    public static final df w;
    public static final df x;
    public static final df y;
    public static final df z;
    private int D;
    private String E;

    private df(String s1, int i1, int j1, String s2)
    {
        super(s1, i1);
        D = j1;
        E = s2;
    }

    public static df a(Throwable throwable)
    {
        if (C == null)
        {
            b();
        }
        Object obj = null;
        if (throwable != null)
        {
            obj = throwable.getClass().getName();
        }
        obj = (df)C.get(obj);
        throwable = ((Throwable) (obj));
        if (obj == null)
        {
            throwable = B;
        }
        return throwable;
    }

    private static void b()
    {
        b/a/df;
        JVM INSTR monitorenter ;
        HashMap hashmap = C;
        if (hashmap == null) goto _L2; else goto _L1
_L1:
        b/a/df;
        JVM INSTR monitorexit ;
        return;
_L2:
        df adf[];
        int j1;
        hashmap = new HashMap();
        adf = values();
        j1 = adf.length;
        int i1 = 0;
_L4:
        df df1;
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        df1 = adf[i1];
        hashmap.put(df1.E, df1);
        i1++;
        if (true) goto _L4; else goto _L3
_L3:
        C = hashmap;
        if (true) goto _L1; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    public static df valueOf(String s1)
    {
        return (df)Enum.valueOf(b/a/df, s1);
    }

    public static df[] values()
    {
        return (df[])F.clone();
    }

    public final int a()
    {
        return D;
    }

    static 
    {
        a = new df("OK", 0, 0, null);
        b = new df("ASSERTION_ERROR", 1, 1, "java.lang.AssertionError");
        c = new df("BIND_EXCEPTION", 2, 2, "java.net.BindException");
        d = new df("CLASS_NOT_FOUND_EXCEPTION", 3, 3, "java.lang.ClassNotFoundException");
        e = new df("ERROR", 4, 4, "java.lang.Error");
        f = new df("IO_EXCEPTION", 5, 5, "java.io.IOException");
        g = new df("ILLEGAL_ARGUMENT_EXCEPTION", 6, 6, "java.lang.IllegalArgumentException");
        h = new df("ILLEGAL_STATE_EXCEPTION", 7, 7, "java.lang.IllegalStateException");
        i = new df("INDEX_OUT_OF_BOUNDS_EXCEPTION", 8, 8, "java.lang.IndexOutOfBoundsException");
        j = new df("MALFORMED_URL_EXCEPTION", 9, 9, "java.net.MalformedURLException");
        k = new df("NO_SUCH_PROVIDER_EXCEPTION", 10, 10, "java.security.NoSuchProviderException");
        l = new df("NULL_POINTER_EXCEPTION", 11, 11, "java.lang.NullPointerException");
        m = new df("PROTOCOL_EXCEPTION", 12, 12, "java.net.ProtocolException");
        n = new df("SECURITY_EXCEPTION", 13, 13, "java.lang.SecurityException");
        o = new df("SOCKET_EXCEPTION", 14, 14, "java.net.SocketException");
        p = new df("SOCKET_TIMEOUT_EXCEPTION", 15, 15, "java.net.SocketTimeoutException");
        q = new df("SSL_PEER_UNVERIFIED_EXCEPTION", 16, 16, "javax.net.ssl.SSLPeerUnverifiedException");
        r = new df("STRING_INDEX_OUT_OF_BOUNDS_EXCEPTION", 17, 17, "java.lang.StringIndexOutOfBoundsException");
        s = new df("UNKNOWN_HOST_EXCEPTION", 18, 18, "java.net.UnknownHostException");
        t = new df("UNKNOWN_SERVICE_EXCEPTION", 19, 19, "java.net.UnknownServiceException");
        u = new df("UNSUPPORTED_OPERATION_EXCEPTION", 20, 20, "java.lang.UnsupportedOperationException");
        v = new df("URI_SYNTAX_EXCEPTION", 21, 21, "java.net.URISyntaxException");
        w = new df("CONNECT_EXCEPTION", 22, 22, "java.net.ConnectException");
        x = new df("SSL_EXCEPTION", 23, 23, "javax.net.ssl.SSLException");
        y = new df("SSL_HANDSHAKE_EXCEPTION", 24, 24, "javax.net.ssl.SSLHandshakeException");
        z = new df("SSL_KEY_EXCEPTION", 25, 25, "javax.net.ssl.SSLKeyException");
        A = new df("SSL_PROTOCOL_EXCEPTION", 26, 26, "javax.net.ssl.SSLProtocolException");
        B = new df("UNDEFINED_EXCEPTION", 27, -1, "__UNKNOWN__");
        F = (new df[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B
        });
    }
}
