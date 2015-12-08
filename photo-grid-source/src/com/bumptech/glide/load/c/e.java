// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.c;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.util.Map;

// Referenced classes of package com.bumptech.glide.load.c:
//            f

public class e
{

    private final URL a;
    private final f b;
    private final String c;
    private String d;
    private URL e;

    public e(String s)
    {
        this(s, f.b);
    }

    private e(String s, f f1)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException((new StringBuilder("String url must not be empty or null: ")).append(s).toString());
        }
        if (f1 == null)
        {
            throw new IllegalArgumentException("Headers must not be null");
        } else
        {
            c = s;
            a = null;
            b = f1;
            return;
        }
    }

    public e(URL url)
    {
        this(url, f.b);
    }

    private e(URL url, f f1)
    {
        if (url == null)
        {
            throw new IllegalArgumentException("URL must not be null!");
        }
        if (f1 == null)
        {
            throw new IllegalArgumentException("Headers must not be null");
        } else
        {
            a = url;
            c = null;
            b = f1;
            return;
        }
    }

    public final URL a()
    {
        if (e == null)
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
            e = new URL(d);
        }
        return e;
    }

    public final Map b()
    {
        return b.a();
    }

    public final String c()
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
        if (obj instanceof e)
        {
            obj = (e)obj;
            flag = flag1;
            if (c().equals(((e) (obj)).c()))
            {
                flag = flag1;
                if (b.equals(((e) (obj)).b))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return c().hashCode() * 31 + b.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append(c()).append('\n').append(b.toString()).toString();
    }
}
