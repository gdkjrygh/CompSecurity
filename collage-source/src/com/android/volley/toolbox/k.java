// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.g;
import com.android.volley.m;
import com.android.volley.s;
import java.io.UnsupportedEncodingException;

public abstract class k extends com.android.volley.k
{

    private static final String a = String.format("application/json; charset=%s", new Object[] {
        "utf-8"
    });
    private com.android.volley.m.b b;
    private final String c;

    public k(int i, String s1, String s2, com.android.volley.m.b b1, com.android.volley.m.a a1)
    {
        super(i, s1, a1);
        b = b1;
        c = s2;
    }

    protected abstract m a(g g);

    protected void b(Object obj)
    {
        if (b != null)
        {
            b.a(obj);
        }
    }

    protected void d()
    {
        super.d();
        b = null;
    }

    public String n()
    {
        return r();
    }

    public byte[] o()
    {
        return s();
    }

    public String r()
    {
        return a;
    }

    public byte[] s()
    {
        if (c == null)
        {
            return null;
        }
        byte abyte0[];
        try
        {
            abyte0 = c.getBytes("utf-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            com.android.volley.s.d("Unsupported Encoding while trying to get the bytes of %s using %s", new Object[] {
                c, "utf-8"
            });
            return null;
        }
        return abyte0;
    }

}
