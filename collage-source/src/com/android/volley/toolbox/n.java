// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.g;
import com.android.volley.k;
import com.android.volley.m;
import java.io.UnsupportedEncodingException;

// Referenced classes of package com.android.volley.toolbox:
//            e

public class n extends k
{

    private com.android.volley.m.b a;

    public n(int i, String s, com.android.volley.m.b b1, com.android.volley.m.a a1)
    {
        super(i, s, a1);
        a = b1;
    }

    protected m a(g g1)
    {
        String s;
        try
        {
            s = new String(g1.b, e.a(g1.c));
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            unsupportedencodingexception = new String(g1.b);
        }
        return m.a(s, e.a(g1));
    }

    protected void b(Object obj)
    {
        d((String)obj);
    }

    protected void d()
    {
        super.d();
        a = null;
    }

    protected void d(String s)
    {
        if (a != null)
        {
            a.a(s);
        }
    }
}
