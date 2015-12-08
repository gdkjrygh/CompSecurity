// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.a;

import com.android.volley.AuthFailureError;
import com.android.volley.a.l;
import java.io.UnsupportedEncodingException;
import java.util.Map;

public final class b extends l
{

    private final Map m = null;
    private String n;

    public b(String s, String s1, com.android.volley.i.b b1, com.android.volley.i.a a)
    {
        super(2, s, b1, a);
        n = s1;
        (new StringBuilder("url=")).append(s).append(", mPayload=").append(s1);
    }

    public final Map d()
        throws AuthFailureError
    {
        if (m != null)
        {
            return m;
        } else
        {
            return super.d();
        }
    }

    public final String g()
    {
        return "application/x-www-form-urlencoded";
    }

    public final byte[] h()
    {
        (new StringBuilder("Returning ")).append(n);
        byte abyte0[];
        try
        {
            if (n == null)
            {
                n = "";
            }
            abyte0 = n.getBytes("utf-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            com.android.volley.l.d("Unsupported Encoding while trying to get the bytes of %s using %s", new Object[] {
                n, "utf-8"
            });
            return null;
        }
        return abyte0;
    }
}
