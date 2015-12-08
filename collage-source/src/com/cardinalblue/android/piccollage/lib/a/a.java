// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.lib.a;

import com.android.volley.g;
import com.android.volley.i;
import com.android.volley.k;
import com.android.volley.m;
import com.android.volley.toolbox.e;
import com.google.b.f;
import com.google.b.t;
import java.io.UnsupportedEncodingException;
import java.util.Map;

public class a extends k
{

    private final f a;
    private final Class b;
    private final Map c;
    private final com.android.volley.m.b d;

    public a(String s, Class class1, Map map, f f1, com.android.volley.m.b b1, com.android.volley.m.a a1)
    {
        super(0, s, a1);
        b = class1;
        c = map;
        d = b1;
        s = f1;
        if (f1 == null)
        {
            s = new f();
        }
        a = s;
    }

    protected m a(g g1)
    {
        try
        {
            String s = new String(g1.b, e.a(g1.c));
            g1 = m.a(a.a(s, b), e.a(g1));
        }
        // Misplaced declaration of an exception variable
        catch (g g1)
        {
            return m.a(new i(g1));
        }
        // Misplaced declaration of an exception variable
        catch (g g1)
        {
            return m.a(new i(g1));
        }
        return g1;
    }

    protected void b(Object obj)
    {
        d.a(obj);
    }

    public Map k()
        throws com.android.volley.a
    {
        if (c != null)
        {
            return c;
        } else
        {
            return super.k();
        }
    }
}
