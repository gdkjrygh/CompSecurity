// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.af;
import com.google.a.d.a;
import com.google.a.d.c;
import com.google.a.d.d;
import java.net.URL;

final class aj extends af
{

    aj()
    {
    }

    public URL a(a a1)
    {
        if (a1.f() == c.i)
        {
            a1.j();
        } else
        {
            a1 = a1.h();
            if (!"null".equals(a1))
            {
                return new URL(a1);
            }
        }
        return null;
    }

    public volatile void a(d d1, Object obj)
    {
        a(d1, (URL)obj);
    }

    public void a(d d1, URL url)
    {
        if (url == null)
        {
            url = null;
        } else
        {
            url = url.toExternalForm();
        }
        d1.b(url);
    }

    public Object b(a a1)
    {
        return a(a1);
    }
}
