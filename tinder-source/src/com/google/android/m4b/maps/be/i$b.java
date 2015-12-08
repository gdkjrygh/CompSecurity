// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.be;

import com.google.android.m4b.maps.bd.d;
import com.google.android.m4b.maps.bo.aa;
import com.google.android.m4b.maps.bo.ac;

// Referenced classes of package com.google.android.m4b.maps.be:
//            i

static final class h
{

    final int a;
    final long b;
    final String c;
    final int d;
    final byte e[];
    final aa f;
    final ac g;
    final d h;

    (long l, String s, int j, ac ac, d d1)
    {
        a = 1;
        b = l;
        c = s;
        d = j;
        e = null;
        g = ac;
        f = null;
        h = d1;
    }

    h(long l, String s, int j, byte abyte0[], aa aa1, d d1)
    {
        a = 0;
        b = l;
        c = s;
        d = j;
        e = abyte0;
        if (aa1 == null)
        {
            s = null;
        } else
        {
            s = aa1.a();
        }
        g = s;
        f = aa1;
        h = d1;
    }
}
