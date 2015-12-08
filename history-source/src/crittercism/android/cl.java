// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.util.HashMap;

public final class cl extends Enum
{

    public static final cl A;
    public static final cl B;
    private static HashMap C;
    private static final cl F[];
    public static final cl a;
    public static final cl b;
    public static final cl c;
    public static final cl d;
    public static final cl e;
    public static final cl f;
    public static final cl g;
    public static final cl h;
    public static final cl i;
    public static final cl j;
    public static final cl k;
    public static final cl l;
    public static final cl m;
    public static final cl n;
    public static final cl o;
    public static final cl p;
    public static final cl q;
    public static final cl r;
    public static final cl s;
    public static final cl t;
    public static final cl u;
    public static final cl v;
    public static final cl w;
    public static final cl x;
    public static final cl y;
    public static final cl z;
    private int D;
    private String E;

    private cl(String s1, int i1, int j1, String s2)
    {
        super(s1, i1);
        D = j1;
        E = s2;
    }

    public static cl a(Throwable throwable)
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
        obj = (cl)C.get(obj);
        throwable = ((Throwable) (obj));
        if (obj == null)
        {
            throwable = B;
        }
        return throwable;
    }

    private static void b()
    {
        crittercism/android/cl;
        JVM INSTR monitorenter ;
        HashMap hashmap = C;
        if (hashmap == null) goto _L2; else goto _L1
_L1:
        crittercism/android/cl;
        JVM INSTR monitorexit ;
        return;
_L2:
        cl acl[];
        int j1;
        hashmap = new HashMap();
        acl = values();
        j1 = acl.length;
        int i1 = 0;
_L4:
        cl cl1;
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        cl1 = acl[i1];
        hashmap.put(cl1.E, cl1);
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

    public static cl valueOf(String s1)
    {
        return (cl)Enum.valueOf(crittercism/android/cl, s1);
    }

    public static cl[] values()
    {
        return (cl[])F.clone();
    }

    public final int a()
    {
        return D;
    }

    static 
    {
        a = new cl("OK", 0, 0, null);
        b = new cl("ASSERTION_ERROR", 1, 1, "java.lang.AssertionError");
        c = new cl("BIND_EXCEPTION", 2, 2, "java.net.BindException");
        d = new cl("CLASS_NOT_FOUND_EXCEPTION", 3, 3, "java.lang.ClassNotFoundException");
        e = new cl("ERROR", 4, 4, "java.lang.Error");
        f = new cl("IO_EXCEPTION", 5, 5, "java.io.IOException");
        g = new cl("ILLEGAL_ARGUMENT_EXCEPTION", 6, 6, "java.lang.IllegalArgumentException");
        h = new cl("ILLEGAL_STATE_EXCEPTION", 7, 7, "java.lang.IllegalStateException");
        i = new cl("INDEX_OUT_OF_BOUNDS_EXCEPTION", 8, 8, "java.lang.IndexOutOfBoundsException");
        j = new cl("MALFORMED_URL_EXCEPTION", 9, 9, "java.net.MalformedURLException");
        k = new cl("NO_SUCH_PROVIDER_EXCEPTION", 10, 10, "java.security.NoSuchProviderException");
        l = new cl("NULL_POINTER_EXCEPTION", 11, 11, "java.lang.NullPointerException");
        m = new cl("PROTOCOL_EXCEPTION", 12, 12, "java.net.ProtocolException");
        n = new cl("SECURITY_EXCEPTION", 13, 13, "java.lang.SecurityException");
        o = new cl("SOCKET_EXCEPTION", 14, 14, "java.net.SocketException");
        p = new cl("SOCKET_TIMEOUT_EXCEPTION", 15, 15, "java.net.SocketTimeoutException");
        q = new cl("SSL_PEER_UNVERIFIED_EXCEPTION", 16, 16, "javax.net.ssl.SSLPeerUnverifiedException");
        r = new cl("STRING_INDEX_OUT_OF_BOUNDS_EXCEPTION", 17, 17, "java.lang.StringIndexOutOfBoundsException");
        s = new cl("UNKNOWN_HOST_EXCEPTION", 18, 18, "java.net.UnknownHostException");
        t = new cl("UNKNOWN_SERVICE_EXCEPTION", 19, 19, "java.net.UnknownServiceException");
        u = new cl("UNSUPPORTED_OPERATION_EXCEPTION", 20, 20, "java.lang.UnsupportedOperationException");
        v = new cl("URI_SYNTAX_EXCEPTION", 21, 21, "java.net.URISyntaxException");
        w = new cl("CONNECT_EXCEPTION", 22, 22, "java.net.ConnectException");
        x = new cl("SSL_EXCEPTION", 23, 23, "javax.net.ssl.SSLException");
        y = new cl("SSL_HANDSHAKE_EXCEPTION", 24, 24, "javax.net.ssl.SSLHandshakeException");
        z = new cl("SSL_KEY_EXCEPTION", 25, 25, "javax.net.ssl.SSLKeyException");
        A = new cl("SSL_PROTOCOL_EXCEPTION", 26, 26, "javax.net.ssl.SSLProtocolException");
        B = new cl("UNDEFINED_EXCEPTION", 27, -1, "__UNKNOWN__");
        F = (new cl[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B
        });
    }
}
