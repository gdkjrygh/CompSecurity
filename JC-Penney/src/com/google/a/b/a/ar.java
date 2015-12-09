// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.af;
import com.google.a.d.a;
import com.google.a.d.c;
import com.google.a.d.d;
import java.util.Locale;
import java.util.StringTokenizer;

final class ar extends af
{

    ar()
    {
    }

    public Locale a(a a1)
    {
        if (a1.f() == c.i)
        {
            a1.j();
            return null;
        }
        Object obj = new StringTokenizer(a1.h(), "_");
        String s;
        if (((StringTokenizer) (obj)).hasMoreElements())
        {
            a1 = ((StringTokenizer) (obj)).nextToken();
        } else
        {
            a1 = null;
        }
        if (((StringTokenizer) (obj)).hasMoreElements())
        {
            s = ((StringTokenizer) (obj)).nextToken();
        } else
        {
            s = null;
        }
        if (((StringTokenizer) (obj)).hasMoreElements())
        {
            obj = ((StringTokenizer) (obj)).nextToken();
        } else
        {
            obj = null;
        }
        if (s == null && obj == null)
        {
            return new Locale(a1);
        }
        if (obj == null)
        {
            return new Locale(a1, s);
        } else
        {
            return new Locale(a1, s, ((String) (obj)));
        }
    }

    public volatile void a(d d1, Object obj)
    {
        a(d1, (Locale)obj);
    }

    public void a(d d1, Locale locale)
    {
        if (locale == null)
        {
            locale = null;
        } else
        {
            locale = locale.toString();
        }
        d1.b(locale);
    }

    public Object b(a a1)
    {
        return a(a1);
    }
}
