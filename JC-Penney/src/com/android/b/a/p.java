// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.b.a;

import com.android.b.ad;
import com.android.b.n;
import com.android.b.q;
import com.android.b.v;
import com.android.b.w;
import com.android.b.x;
import java.io.UnsupportedEncodingException;

public abstract class p extends q
{

    private static final String a = String.format("application/json; charset=%s", new Object[] {
        "utf-8"
    });
    private final x b;
    private final String c;

    public p(int i, String s, String s1, x x1, w w)
    {
        super(i, s, w);
        b = x1;
        c = s1;
    }

    protected abstract v a(n n);

    protected void a(Object obj)
    {
        b.a(obj);
    }

    public String k()
    {
        return o();
    }

    public byte[] l()
    {
        return p();
    }

    public String o()
    {
        return a;
    }

    public byte[] p()
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
            ad.d("Unsupported Encoding while trying to get the bytes of %s using %s", new Object[] {
                c, "utf-8"
            });
            return null;
        }
        return abyte0;
    }

}
