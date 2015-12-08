// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.transport;

import android.content.Context;
import android.text.TextUtils;
import com.microsoft.onlineid.b.c;
import com.microsoft.onlineid.internal.e;
import com.microsoft.onlineid.internal.l;
import com.microsoft.onlineid.internal.n;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;

// Referenced classes of package com.microsoft.onlineid.internal.transport:
//            a

public final class b
{

    private int a;
    private int b;
    private a c;
    private String d;

    public b()
    {
        a = 60000;
        b = 30000;
    }

    public static String a(Context context)
    {
        return b((new StringBuilder()).append(context.getPackageName()).append("/").append(l.b(context)).toString(), (new StringBuilder("MsaAndroidSdk/")).append(n.a(context)).toString());
    }

    public static String b(String s, String s1)
    {
        if (TextUtils.isEmpty(s))
        {
            return s1;
        }
        if (TextUtils.isEmpty(s1))
        {
            return s;
        } else
        {
            return (new StringBuilder()).append(s).append("; ").append(s1).toString();
        }
    }

    private void c(URL url)
        throws c
    {
        boolean flag = false;
        if (c == null)
        {
            c = new a(url);
        } else
        {
            c.a(url);
        }
        c.a();
        c.a(a);
        c.b(b);
        c.b();
        c.a(false);
        if (!TextUtils.isEmpty(d))
        {
            flag = true;
        }
        try
        {
            com.microsoft.onlineid.internal.e.a(flag);
            c.a("User-Agent", b(System.getProperty("http.agent"), d));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (URL url)
        {
            throw new c(url.getMessage(), url);
        }
    }

    public final InputStream a()
        throws c
    {
        InputStream inputstream;
        try
        {
            if (c.f() == 200)
            {
                return c.g();
            }
            inputstream = c.h();
        }
        catch (IOException ioexception)
        {
            throw new c(ioexception);
        }
        return inputstream;
    }

    public final void a(int i)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException("Connection timeout value is out of range");
        } else
        {
            a = i;
            return;
        }
    }

    final void a(String s)
    {
        d = b(d, s);
    }

    public final void a(String s, String s1)
    {
        c.a(s, s1);
    }

    public final void a(URL url)
        throws c
    {
        if (url == null)
        {
            throw new IllegalArgumentException("URL cannot be null");
        }
        try
        {
            c(url);
            c.a("POST");
            c.d();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (URL url)
        {
            throw new c(url.getMessage(), url);
        }
    }

    public final int b()
        throws c
    {
        int i;
        try
        {
            i = c.f();
        }
        catch (IOException ioexception)
        {
            throw new c(ioexception);
        }
        return i;
    }

    public final void b(int i)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException("Read timeout value is out of range");
        } else
        {
            b = i;
            return;
        }
    }

    public final void b(URL url)
        throws c
    {
        if (url == null)
        {
            throw new IllegalArgumentException("URL cannot be null");
        }
        try
        {
            c(url);
            c.a("GET");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (URL url)
        {
            throw new c(url.getMessage(), url);
        }
    }

    public final long c()
    {
        return c.i();
    }

    public final OutputStream d()
        throws c
    {
        if (c.c().equals("GET"))
        {
            throw new c("A GET request cannot have an OutputStream");
        }
        OutputStream outputstream;
        try
        {
            outputstream = c.e();
        }
        catch (IOException ioexception)
        {
            throw new c(ioexception);
        }
        return outputstream;
    }

    public final void e()
    {
        c.j();
    }

    public final void f()
    {
        c.a(true);
    }
}
