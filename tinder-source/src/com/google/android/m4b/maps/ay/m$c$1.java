// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import com.google.android.m4b.maps.a.h;
import com.google.android.m4b.maps.a.k;
import com.google.android.m4b.maps.a.m;
import com.google.android.m4b.maps.a.r;
import com.google.android.m4b.maps.am.i;
import java.io.IOException;
import java.util.Map;

// Referenced classes of package com.google.android.m4b.maps.ay:
//            m, k, x

final class > extends k
{

    private byte l[];
    private i m;
    private x n;
    private l o;

    protected final m a(h h1)
    {
        String s = (String)h1.c.get("Content-Type");
        >(o, h1.a, s);
        x x1 = n;
        x1.f = k.c() - x1.e;
        x1.d.append(", ");
        if (x1.f < 1000L)
        {
            x1.d.append("<1s");
        } else
        {
            x1.d.append(x1.f / 1000L).append("s");
        }
        return com.google.android.m4b.maps.a.m.a(h1.b, null);
        h1;
_L2:
        return com.google.android.m4b.maps.a.m.a(new r(h1));
        h1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final Map a()
    {
        return >(o, l);
    }

    protected final void a(Object obj)
    {
        obj = (byte[])obj;
        m.a(obj);
    }

    public final String b()
    {
        return "application/binary";
    }

    public final byte[] c()
    {
        return l;
    }

    ( , String s, com.google.android.m4b.maps.a. 1, byte abyte0[], i j, x x1)
    {
        o = ;
        l = abyte0;
        m = j;
        n = x1;
        super(1, s, 1);
    }
}
