// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.Request;
import com.android.volley.n;
import java.io.UnsupportedEncodingException;

public abstract class j extends Request
{

    private final com.android.volley.k.b a;
    private final String b;

    public j(int i, String s, String s1, com.android.volley.k.b b1, com.android.volley.k.a a1)
    {
        super(i, s, a1);
        a = b1;
        b = s1;
    }

    protected void b(Object obj)
    {
        a.a(obj);
    }

    public String l()
    {
        return p();
    }

    public byte[] m()
    {
        return q();
    }

    public byte[] q()
    {
        if (b == null)
        {
            return null;
        }
        byte abyte0[];
        try
        {
            abyte0 = b.getBytes(o());
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            n.d("Unsupported Encoding while trying to get the bytes of %s using %s", new Object[] {
                b, o()
            });
            return null;
        }
        return abyte0;
    }
}
