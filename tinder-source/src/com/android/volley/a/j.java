// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.a;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.i;
import com.android.volley.l;
import java.io.UnsupportedEncodingException;

public abstract class j extends Request
{

    private static final String m = String.format("application/json; charset=%s", new Object[] {
        "utf-8"
    });
    private com.android.volley.i.b n;
    private final String o;

    public j(int i, String s, String s1, com.android.volley.i.b b, com.android.volley.i.a a1)
    {
        super(i, s, a1);
        n = b;
        o = s1;
    }

    public abstract i a(NetworkResponse networkresponse);

    protected final void a()
    {
        super.a();
        n = null;
    }

    public void a(Object obj)
    {
        if (n != null)
        {
            n.a(obj);
        }
    }

    public final String e()
    {
        return g();
    }

    public final byte[] f()
    {
        return h();
    }

    public String g()
    {
        return m;
    }

    public byte[] h()
    {
        if (o == null)
        {
            return null;
        }
        byte abyte0[];
        try
        {
            abyte0 = o.getBytes("utf-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            l.d("Unsupported Encoding while trying to get the bytes of %s using %s", new Object[] {
                o, "utf-8"
            });
            return null;
        }
        return abyte0;
    }

}
