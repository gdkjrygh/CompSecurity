// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.text.ParseException;

public final class d extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    public static final d e;
    public static final d f;
    public static final d g;
    public static final d h;
    public static final d i;
    public static final d j;
    public static final d k;
    public static final d l;
    public static final d m;
    public static final d n;
    public static final d o;
    public static final d p;
    public static final d q;
    public static final d r;
    public static final d s;
    public static final d t;
    public static final d u;
    public static final d v;
    public static final d w;
    private static final d z[];
    private int x;
    private String y;

    private d(String s1, int i1, int j1, String s2)
    {
        super(s1, i1);
        x = j1;
        y = s2;
    }

    public static d a(int i1)
    {
        d ad[] = values();
        int k1 = ad.length;
        for (int j1 = 0; j1 < k1; j1++)
        {
            d d1 = ad[j1];
            if (d1.x == i1)
            {
                return d1;
            }
        }

        throw new ParseException((new StringBuilder("Unknown status code: ")).append(Integer.toString(i1)).toString(), 0);
    }

    public static d valueOf(String s1)
    {
        return (d)Enum.valueOf(crittercism/android/d, s1);
    }

    public static d[] values()
    {
        return (d[])z.clone();
    }

    public final int a()
    {
        return x;
    }

    static 
    {
        a = new d("OK", 0, 0, null);
        b = new d("ASSERTION_ERROR", 1, 1, "java.lang.AssertionError");
        c = new d("BIND_EXCEPTION", 2, 2, "java.net.BindException");
        d = new d("CLASS_NOT_FOUND_EXCEPTION", 3, 3, "java.lang.ClassNotFoundException");
        e = new d("ERROR", 4, 4, "java.lang.Error");
        f = new d("IO_EXCEPTION", 5, 5, "java.io.IOException");
        g = new d("ILLEGAL_ARGUMENT_EXCEPTION", 6, 6, "java.lang.IllegalArgumentException");
        h = new d("ILLEGAL_STATE_EXCEPTION", 7, 7, "java.lang.IllegalStateException");
        i = new d("INDEX_OUT_OF_BOUNDS_EXCEPTION", 8, 8, "java.lang.IndexOutOfBoundsException");
        j = new d("MALFORMED_URL_EXCEPTION", 9, 9, "java.net.MalformedURLException");
        k = new d("NO_SUCH_PROVIDER_EXCEPTION", 10, 10, "java.security.NoSuchProviderException");
        l = new d("NULL_POINTER_EXCEPTION", 11, 11, "java.lang.NullPointerException");
        m = new d("PROTOCOL_EXCEPTION", 12, 12, "java.net.ProtocolException");
        n = new d("SECURITY_EXCEPTION", 13, 13, "java.lang.SecurityException");
        o = new d("SOCKET_EXCEPTION", 14, 14, "java.net.SocketException");
        p = new d("SOCKET_TIMEOUT_EXCEPTION", 15, 15, "java.net.SocketTimeoutException");
        q = new d("SSL_PEER_UNVERIFIED_EXCEPTION", 16, 16, "javax.net.ssl.SSLPeerUnverifiedException");
        r = new d("STRING_INDEX_OUT_OF_BOUNDS_EXCEPTION", 17, 17, "java.lang.StringIndexOutOfBoundsException");
        s = new d("UNKNOWN_HOST_EXCEPTION", 18, 18, "java.net.UnknownHostException");
        t = new d("UNKNOWN_SERVICE_EXCEPTION", 19, 19, "java.net.UnknownServiceException");
        u = new d("UNSUPPORTED_OPERATION_EXCEPTION", 20, 20, "java.lang.UnsupportedOperationException");
        v = new d("URI_SYNTAX_EXCEPTION", 21, 21, "java.net.URISyntaxException");
        w = new d("UNDEFINED_EXCEPTION", 22, -1, "__UNKNOWN__");
        z = (new d[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w
        });
    }
}
