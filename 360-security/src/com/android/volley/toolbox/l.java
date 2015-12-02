// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.Request;
import com.android.volley.i;
import com.android.volley.k;
import com.android.volley.n;
import java.io.UnsupportedEncodingException;

// Referenced classes of package com.android.volley.toolbox:
//            d

public class l extends Request
{

    private final com.android.volley.k.b a;
    private String b;

    public l(int j, String s, String s1, com.android.volley.k.b b1, com.android.volley.k.a a1)
    {
        super(j, s, a1);
        a = b1;
        b = s1;
    }

    protected k a(i j)
    {
        String s;
        try
        {
            s = new String(j.b, d.a(j.c));
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            unsupportedencodingexception = new String(j.b);
        }
        return k.a(s, d.a(j));
    }

    protected void b(Object obj)
    {
        c((String)obj);
    }

    protected void c(String s)
    {
        a.a(s);
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
