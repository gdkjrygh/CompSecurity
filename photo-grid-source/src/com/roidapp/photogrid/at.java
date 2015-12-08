// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import com.roidapp.photogrid.a.k;
import com.roidapp.photogrid.a.l;
import com.roidapp.photogrid.a.m;
import com.roidapp.photogrid.a.n;
import com.roidapp.photogrid.a.o;

// Referenced classes of package com.roidapp.photogrid:
//            as, ar, MainPage

final class at
    implements k
{

    final as a;

    at(as as1)
    {
        a = as1;
        super();
    }

    public final void a(l l1, n n1)
    {
label0:
        {
            if (l1.c())
            {
                l1 = n1.a("com.roidapp.photogrid.remove_ad_year");
                n1 = n1.a("com.roidapp.photogrid.remove_ad_lifelong");
                if (n1 != null && n1.b() == 0)
                {
                    a.a.a.d = true;
                    m.c(a.a.a, 1);
                } else
                {
                    m.c(a.a.a, 0);
                }
                if (l1 != null && l1.b() == 0)
                {
                    a.a.a.e = true;
                    m.b(a.a.a, 1);
                } else
                {
                    m.b(a.a.a, 0);
                }
                if (!a.a.a.d && !a.a.a.e)
                {
                    break label0;
                }
                a.a.a.c = true;
                m.a(a.a.a, 1);
            }
            return;
        }
        a.a.a.c = false;
        m.a(a.a.a, 0);
    }
}
