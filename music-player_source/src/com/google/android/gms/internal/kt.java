// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            kv, kx, kp

public abstract class kt extends kv
{

    protected List m;

    public kt()
    {
    }

    public void a(kp kp1)
    {
        int i;
        int j;
        if (m == null)
        {
            i = 0;
        } else
        {
            i = m.size();
        }
        for (j = 0; j < i; j++)
        {
            kx kx1 = (kx)m.get(j);
            kp1.d(kx1.a);
            kp1.b(kx1.b);
        }

    }

    public int b()
    {
        int i;
        int j;
        int k;
        if (m == null)
        {
            i = 0;
        } else
        {
            i = m.size();
        }
        j = 0;
        k = 0;
        for (; j < i; j++)
        {
            kx kx1 = (kx)m.get(j);
            k = k + kp.e(kx1.a) + kx1.b.length;
        }

        n = k;
        return k;
    }
}
