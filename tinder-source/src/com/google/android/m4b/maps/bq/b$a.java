// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bq;

import android.util.Pair;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ay.n;
import com.google.android.m4b.maps.bo.aa;
import com.google.android.m4b.maps.bs.e;
import java.util.Map;

// Referenced classes of package com.google.android.m4b.maps.bq:
//            b

public static abstract class b extends n
{

    private b a;
    private final e b;
    final d c[] = new d[8];
    int d;
    final Map e = ax.b();

    static b a(b b1)
    {
        return b1.a;
    }

    static b a(a a1, b b1)
    {
        a1.a = b1;
        return b1;
    }

    static boolean b(a a1)
    {
        return a1.d + 2 <= a1.c.length;
    }

    protected abstract aa a(int i);

    protected final void a(Pair pair, c c1)
    {
        Pair pair1 = pair;
        if (pair.second == null)
        {
            pair1 = new Pair(pair.first, "");
        }
        if (e.get(pair1) != null)
        {
            pair = String.valueOf(pair1);
            c1 = String.valueOf(c1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(pair).length() + 50 + String.valueOf(c1).length())).append("Duplicate tile key: ").append(pair).append(", already exists in batch for ").append(c1).toString());
        } else
        {
            e.put(pair1, Integer.valueOf(d));
            pair = c;
            int i = d;
            d = i + 1;
            pair[i] = c1;
            return;
        }
    }

    protected boolean a(d d1)
    {
        return true;
    }

    protected byte[] b(int i)
    {
        return null;
    }

    protected int h()
    {
        return -1;
    }

    protected (e e1)
    {
        d = 0;
        b = e1;
    }
}
