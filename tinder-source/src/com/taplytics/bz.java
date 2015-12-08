// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import com.taplytics.a.j;
import com.taplytics.a.k;
import java.util.WeakHashMap;

// Referenced classes of package com.taplytics:
//            bw

final class bz
    implements Runnable
{

    final String a;
    final Object b;
    final bw c;

    bz(bw bw1, String s, Object obj)
    {
        c = bw1;
        a = s;
        b = obj;
        super();
    }

    public final void run()
    {
        if (a != null && b != null && c.a.containsKey(a) && (c.a.get(a) instanceof j))
        {
            j j1 = (j)c.a.get(a);
            if (j1.b != null)
            {
                j1.b.a(b);
            }
        }
    }
}
