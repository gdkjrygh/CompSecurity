// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;

public final class aaD extends Enum
{

    private static aaD A;
    private static aaD B;
    private static aaD C;
    private static HashMap D;
    private static final aaD F[];
    public static final aaD a;
    private static aaD c;
    private static aaD d;
    private static aaD e;
    private static aaD f;
    private static aaD g;
    private static aaD h;
    private static aaD i;
    private static aaD j;
    private static aaD k;
    private static aaD l;
    private static aaD m;
    private static aaD n;
    private static aaD o;
    private static aaD p;
    private static aaD q;
    private static aaD r;
    private static aaD s;
    private static aaD t;
    private static aaD u;
    private static aaD v;
    private static aaD w;
    private static aaD x;
    private static aaD y;
    private static aaD z;
    private String E;
    int b;

    private aaD(String s1, int i1, int j1, String s2)
    {
        super(s1, i1);
        b = j1;
        E = s2;
    }

    public static aaD a(Throwable throwable)
    {
        if (D == null)
        {
            a();
        }
        Object obj = null;
        if (throwable != null)
        {
            obj = throwable.getClass().getName();
        }
        obj = (aaD)D.get(obj);
        throwable = ((Throwable) (obj));
        if (obj == null)
        {
            throwable = C;
        }
        return throwable;
    }

    private static void a()
    {
        aaD;
        JVM INSTR monitorenter ;
        HashMap hashmap = D;
        if (hashmap == null) goto _L2; else goto _L1
_L1:
        aaD;
        JVM INSTR monitorexit ;
        return;
_L2:
        aaD aaad[];
        int j1;
        hashmap = new HashMap();
        aaad = values();
        j1 = aaad.length;
        int i1 = 0;
_L4:
        aaD aad;
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        aad = aaad[i1];
        hashmap.put(aad.E, aad);
        i1++;
        if (true) goto _L4; else goto _L3
_L3:
        D = hashmap;
        if (true) goto _L1; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    public static aaD valueOf(String s1)
    {
        return (aaD)Enum.valueOf(aaD, s1);
    }

    public static aaD[] values()
    {
        return (aaD[])F.clone();
    }

    static 
    {
        a = new aaD("OK", 0, 0, null);
        c = new aaD("ASSERTION_ERROR", 1, 1, "java.lang.AssertionError");
        d = new aaD("BIND_EXCEPTION", 2, 2, "java.net.BindException");
        e = new aaD("CLASS_NOT_FOUND_EXCEPTION", 3, 3, "java.lang.ClassNotFoundException");
        f = new aaD("ERROR", 4, 4, "java.lang.Error");
        g = new aaD("IO_EXCEPTION", 5, 5, "java.io.IOException");
        h = new aaD("ILLEGAL_ARGUMENT_EXCEPTION", 6, 6, "java.lang.IllegalArgumentException");
        i = new aaD("ILLEGAL_STATE_EXCEPTION", 7, 7, "java.lang.IllegalStateException");
        j = new aaD("INDEX_OUT_OF_BOUNDS_EXCEPTION", 8, 8, "java.lang.IndexOutOfBoundsException");
        k = new aaD("MALFORMED_URL_EXCEPTION", 9, 9, "java.net.MalformedURLException");
        l = new aaD("NO_SUCH_PROVIDER_EXCEPTION", 10, 10, "java.security.NoSuchProviderException");
        m = new aaD("NULL_POINTER_EXCEPTION", 11, 11, "java.lang.NullPointerException");
        n = new aaD("PROTOCOL_EXCEPTION", 12, 12, "java.net.ProtocolException");
        o = new aaD("SECURITY_EXCEPTION", 13, 13, "java.lang.SecurityException");
        p = new aaD("SOCKET_EXCEPTION", 14, 14, "java.net.SocketException");
        q = new aaD("SOCKET_TIMEOUT_EXCEPTION", 15, 15, "java.net.SocketTimeoutException");
        r = new aaD("SSL_PEER_UNVERIFIED_EXCEPTION", 16, 16, "javax.net.ssl.SSLPeerUnverifiedException");
        s = new aaD("STRING_INDEX_OUT_OF_BOUNDS_EXCEPTION", 17, 17, "java.lang.StringIndexOutOfBoundsException");
        t = new aaD("UNKNOWN_HOST_EXCEPTION", 18, 18, "java.net.UnknownHostException");
        u = new aaD("UNKNOWN_SERVICE_EXCEPTION", 19, 19, "java.net.UnknownServiceException");
        v = new aaD("UNSUPPORTED_OPERATION_EXCEPTION", 20, 20, "java.lang.UnsupportedOperationException");
        w = new aaD("URI_SYNTAX_EXCEPTION", 21, 21, "java.net.URISyntaxException");
        x = new aaD("CONNECT_EXCEPTION", 22, 22, "java.net.ConnectException");
        y = new aaD("SSL_EXCEPTION", 23, 23, "javax.net.ssl.SSLException");
        z = new aaD("SSL_HANDSHAKE_EXCEPTION", 24, 24, "javax.net.ssl.SSLHandshakeException");
        A = new aaD("SSL_KEY_EXCEPTION", 25, 25, "javax.net.ssl.SSLKeyException");
        B = new aaD("SSL_PROTOCOL_EXCEPTION", 26, 26, "javax.net.ssl.SSLProtocolException");
        C = new aaD("UNDEFINED_EXCEPTION", 27, -1, "__UNKNOWN__");
        F = (new aaD[] {
            a, c, d, e, f, g, h, i, j, k, 
            l, m, n, o, p, q, r, s, t, u, 
            v, w, x, y, z, A, B, C
        });
    }
}
