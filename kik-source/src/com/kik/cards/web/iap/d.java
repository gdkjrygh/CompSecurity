// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.iap;

import com.kik.g.i;
import com.kik.sdkutils.ab;
import kik.a.e.v;

// Referenced classes of package com.kik.cards.web.iap:
//            b

final class d extends i
{

    final b a;

    d(b b1)
    {
        a = b1;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
label0:
        {
            if (b.b(a) != null)
            {
                if (ab.a() <= b.c(a).o("kik.iap.next_sku_check").longValue())
                {
                    break label0;
                }
                b.c(a).a("kik.iap.next_sku_check", Long.valueOf(ab.a() + 0xdbba00L));
                b.a(a);
            }
            return;
        }
        b.d(a);
    }
}
