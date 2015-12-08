// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import android.net.Uri;
import android.util.Log;
import com.android.slyce.a.c.a.a;
import com.android.slyce.a.g;
import org.apache.http.RequestLine;

// Referenced classes of package com.android.slyce.a.c:
//            av, v

public class u
{

    static final boolean h;
    Uri a;
    int b;
    String c;
    int d;
    String e;
    int f;
    long g;
    private String i;
    private av j;
    private boolean k;
    private a l;

    public u(Uri uri, String s)
    {
        this(uri, s, null);
    }

    public u(Uri uri, String s, av av1)
    {
        j = new av();
        k = true;
        b = 30000;
        d = -1;
        if (!h && uri == null)
        {
            throw new AssertionError();
        }
        i = s;
        a = uri;
        if (av1 == null)
        {
            j = new av();
        } else
        {
            j = av1;
        }
        if (av1 == null)
        {
            a(j, uri);
        }
    }

    static String a(u u1)
    {
        return u1.i;
    }

    public static void a(av av1, Uri uri)
    {
        if (uri != null)
        {
            String s1 = uri.getHost();
            String s = s1;
            if (uri.getPort() != -1)
            {
                s = (new StringBuilder()).append(s1).append(":").append(uri.getPort()).toString();
            }
            if (s != null)
            {
                av1.a("Host", s);
            }
        }
        av1.a("User-Agent", b());
        av1.a("Accept-Encoding", "gzip, deflate");
        av1.a("Connection", "keep-alive");
        av1.a("Accept", "*/*");
    }

    protected static String b()
    {
        String s = System.getProperty("http.agent");
        if (s != null)
        {
            return s;
        } else
        {
            return (new StringBuilder()).append("Java").append(System.getProperty("java.version")).toString();
        }
    }

    private String d(String s)
    {
        long l1 = 0L;
        if (g != 0L)
        {
            l1 = System.currentTimeMillis() - g;
        }
        return String.format("(%d ms) %s: %s", new Object[] {
            Long.valueOf(l1), d(), s
        });
    }

    public RequestLine a()
    {
        return new v(this);
    }

    public void a(g g1)
    {
    }

    public void a(String s)
    {
        while (e == null || f > 4) 
        {
            return;
        }
        Log.i(e, d(s));
    }

    public void a(String s, int i1)
    {
        c = s;
        d = i1;
    }

    public void a(String s, Exception exception)
    {
        while (e == null || f > 6) 
        {
            return;
        }
        Log.e(e, d(s));
        Log.e(e, exception.getMessage(), exception);
    }

    public void b(String s)
    {
        while (e == null || f > 2) 
        {
            return;
        }
        Log.v(e, d(s));
    }

    public String c()
    {
        return i;
    }

    public void c(String s)
    {
        while (e == null || f > 3) 
        {
            return;
        }
        Log.d(e, d(s));
    }

    public Uri d()
    {
        return a;
    }

    public av e()
    {
        return j;
    }

    public boolean f()
    {
        return k;
    }

    public a g()
    {
        return l;
    }

    public int h()
    {
        return b;
    }

    public String i()
    {
        return c;
    }

    public int j()
    {
        return d;
    }

    public String toString()
    {
        if (j == null)
        {
            return super.toString();
        } else
        {
            return j.e(a.toString());
        }
    }

    static 
    {
        boolean flag;
        if (!com/android/slyce/a/c/u.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
    }
}
