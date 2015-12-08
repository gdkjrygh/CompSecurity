// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

// Referenced classes of package com.bumptech.glide.load.b:
//            e

public class d
{

    private final URL a;
    private final e b;
    private final String c;
    private String d;
    private URL e;

    public d(String s)
    {
        this(s, e.b);
    }

    public d(String s, e e1)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("String url must not be empty or null: ").append(s).toString());
        }
        if (e1 == null)
        {
            throw new IllegalArgumentException("Headers must not be null");
        } else
        {
            c = s;
            a = null;
            b = e1;
            return;
        }
    }

    public d(URL url)
    {
        this(url, e.b);
    }

    public d(URL url, e e1)
    {
        if (url == null)
        {
            throw new IllegalArgumentException("URL must not be null!");
        }
        if (e1 == null)
        {
            throw new IllegalArgumentException("Headers must not be null");
        } else
        {
            a = url;
            c = null;
            b = e1;
            return;
        }
    }

    private URL e()
        throws MalformedURLException
    {
        if (e == null)
        {
            e = new URL(f());
        }
        return e;
    }

    private String f()
    {
        if (TextUtils.isEmpty(d))
        {
            String s1 = c;
            String s = s1;
            if (TextUtils.isEmpty(s1))
            {
                s = a.toString();
            }
            d = Uri.encode(s, "@#&=*+-_.,:!?()/~'%");
        }
        return d;
    }

    public URL a()
        throws MalformedURLException
    {
        return e();
    }

    public String b()
    {
        return f();
    }

    public Map c()
    {
        return b.a();
    }

    public String d()
    {
        if (c != null)
        {
            return c;
        } else
        {
            return a.toString();
        }
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof d)
        {
            obj = (d)obj;
            flag = flag1;
            if (d().equals(((d) (obj)).d()))
            {
                flag = flag1;
                if (b.equals(((d) (obj)).b))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return d().hashCode() * 31 + b.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append(d()).append('\n').append(b.toString()).toString();
    }
}
