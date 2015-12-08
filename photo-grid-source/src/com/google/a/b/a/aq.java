// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.am;
import com.google.a.d.a;
import com.google.a.d.e;
import com.google.a.d.f;
import java.util.Locale;
import java.util.StringTokenizer;

final class aq extends am
{

    aq()
    {
    }

    public final Object a(a a1)
    {
        if (a1.f() == e.i)
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

    public final void a(f f1, Object obj)
    {
        obj = (Locale)obj;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((Locale) (obj)).toString();
        }
        f1.b(((String) (obj)));
    }
}
