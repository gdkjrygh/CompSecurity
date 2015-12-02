// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.service;

import android.os.Bundle;
import com.facebook.analytics.ak;
import com.facebook.analytics.al;
import com.facebook.fbservice.ops.k;
import com.facebook.fbservice.ops.m;
import com.facebook.fbservice.ops.n;
import com.google.common.d.a.i;

// Referenced classes of package com.facebook.analytics.service:
//            t, m, s

public class r
    implements t
{

    private final k a;
    private final ak b;
    private final boolean c;
    private n d;

    public r(k k1, ak ak1)
    {
        a = k1;
        b = ak1;
        boolean flag;
        if (((int)Math.random() * 0x7fffffff) % 1 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
    }

    static n a(r r1, n n)
    {
        r1.d = n;
        return n;
    }

    public void a()
    {
        while (d != null || b.a() != al.CORE && b.a() != al.CORE_AND_SAMPLED && !c) 
        {
            return;
        }
        d = a.a(m.a, new Bundle()).a();
        i.a(d, new s(this));
    }
}
