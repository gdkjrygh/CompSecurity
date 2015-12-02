// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import com.facebook.debug.log.b;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.facebook.analytics:
//            bt, ak, al, ca, 
//            bu

class bw
    implements Runnable
{

    final bt a;

    private bw(bt bt1)
    {
        a = bt1;
        super();
    }

    bw(bt bt1, bu bu)
    {
        this(bt1);
    }

    public void run()
    {
        boolean flag2 = true;
        bt.d(a).set(false);
        bt.e(a);
        al al1 = bt.c(a).a();
        boolean flag;
        boolean flag1;
        if (al1 == al.CORE || al1 == al.CORE_AND_SAMPLED || bt.f(a) && (bt.g(a) == al.CORE || bt.g(a) == al.CORE_AND_SAMPLED))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag2;
        if (al1 != al.CORE_AND_SAMPLED)
        {
            if (bt.f(a) && bt.g(a) == al.CORE_AND_SAMPLED)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
        }
        do
        {
            ca ca1 = (ca)bt.h(a).poll();
            if (ca1 != null)
            {
                if (ca1.h())
                {
                    if (flag || bt.a(a, ca1))
                    {
                        com.facebook.analytics.bt.b(a, ca1);
                    } else
                    {
                        b.a(bt.f(), (new StringBuilder()).append("Core Event not logged: ").append(ca1.e().toString()).toString());
                    }
                } else
                if (flag1 || bt.a(a, ca1))
                {
                    com.facebook.analytics.bt.b(a, ca1);
                } else
                {
                    b.a(bt.f(), (new StringBuilder()).append("Event not logged: ").append(ca1.e().toString()).toString());
                }
            } else
            {
                return;
            }
        } while (true);
    }
}
