// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.k;
import com.android.volley.n;
import com.android.volley.r;
import com.android.volley.x;
import java.io.UnsupportedEncodingException;

public abstract class p extends n
{

    private static final String a = String.format("application/json; charset=%s", new Object[] {
        "utf-8"
    });
    private final com.android.volley.r.b b;
    private final String c = null;

    public p(String s, com.android.volley.r.b b1, com.android.volley.r.a a1)
    {
        super(s, a1);
        b = b1;
    }

    protected abstract r a(k k1);

    protected void b(Object obj)
    {
        b.a(obj);
    }

    public final String j()
    {
        return a;
    }

    public final byte[] k()
    {
        return m();
    }

    public final String l()
    {
        return a;
    }

    public final byte[] m()
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
            x.d("Unsupported Encoding while trying to get the bytes of %s using %s", new Object[] {
                c, "utf-8"
            });
            return null;
        }
        return abyte0;
    }

}
