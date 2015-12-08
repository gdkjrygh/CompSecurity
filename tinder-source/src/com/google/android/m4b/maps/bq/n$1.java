// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bq;

import com.google.android.m4b.maps.ay.k;
import com.google.android.m4b.maps.bo.aa;
import com.google.android.m4b.maps.bo.ap;
import com.google.android.m4b.maps.bo.d;
import com.google.android.m4b.maps.bs.e;

// Referenced classes of package com.google.android.m4b.maps.bq:
//            n

final class <init> extends <init>
{

    private n f;

    protected final aa a(int i)
    {
        if (b[i] == null)
        {
            return null;
        }
        ap ap1;
        long l;
        if (f.f > 0L)
        {
            k.a();
            l = k.c() + f.f;
        } else
        {
            l = -1L;
        }
        ap1 = ap.a(super.c[i].a, b[i], 0, super.c[i].h, l, -1L, f.c);
        k.a();
        ap1.g();
        return ap1;
    }

    protected final byte[] a(int i, int j)
    {
        byte abyte0[] = new byte[i + 8];
        d.a(a, abyte0, 0);
        d.a(j, abyte0, 4);
        return abyte0;
    }

    protected final byte[] b(int i)
    {
        return b[i];
    }

    (n n1, e e)
    {
        f = n1;
        super(n1, e);
    }
}
