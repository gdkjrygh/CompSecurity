// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import com.android.volley.e;
import com.android.volley.k;
import com.android.volley.n;
import com.android.volley.r;
import com.android.volley.toolbox.f;

// Referenced classes of package com.kik.cache:
//            au

public final class x extends n
    implements au
{

    private com.android.volley.r.b a;
    private com.android.volley.n.a b;
    private String c;

    public x(String s, com.android.volley.r.b b1, com.android.volley.r.a a1)
    {
        this(s, b1, a1, (byte)0);
    }

    private x(String s, com.android.volley.r.b b1, com.android.volley.r.a a1, byte byte0)
    {
        super(s, a1);
        a(new e(1000, 2, 2.0F));
        a = b1;
        b = null;
    }

    protected final r a(k k1)
    {
        com.android.volley.b.a a1 = f.a(k1);
        if (a1 != null)
        {
            a1.e = a1.e + 0x41353000L;
            a1.d = a1.d + 0x41353000L;
        }
        return r.a(k1.b, a1);
    }

    public final void a_(String s)
    {
        c = s;
    }

    protected final void b(Object obj)
    {
        obj = (byte[])obj;
        a.a(obj);
    }

    public final String d()
    {
        if (c != null)
        {
            return c;
        } else
        {
            return super.d();
        }
    }

    public final com.android.volley.n.a o()
    {
        if (b == null)
        {
            return com.android.volley.n.a.a;
        } else
        {
            return b;
        }
    }

    public final String t()
    {
        return super.d();
    }
}
