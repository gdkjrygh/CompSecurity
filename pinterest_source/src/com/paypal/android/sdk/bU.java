// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;


// Referenced classes of package com.paypal.android.sdk:
//            aI, cw, bu, bT, 
//            cs, cn, cy, co, 
//            cl, cm, cj, cq, 
//            cr

public final class bU
    implements aI
{

    private bT a;

    public bU(bT bt)
    {
        a = bt;
    }

    public final void a(bu bu1)
    {
        if (bu1 instanceof cw)
        {
            if (bu1.r())
            {
                a.a((cw)bu1);
                return;
            } else
            {
                a.b((cw)bu1);
                return;
            }
        }
        if (bu1 instanceof cs)
        {
            if (bu1.r())
            {
                a.a((cs)bu1);
                return;
            } else
            {
                a.b((cs)bu1);
                return;
            }
        }
        if (bu1 instanceof cn)
        {
            if (bu1.r())
            {
                a.a((cn)bu1);
                return;
            } else
            {
                a.b((cn)bu1);
                return;
            }
        }
        if (bu1 instanceof cy)
        {
            if (bu1.r())
            {
                a.a((cy)bu1);
                return;
            } else
            {
                a.b((cy)bu1);
                return;
            }
        }
        if (bu1 instanceof co)
        {
            if (bu1.r())
            {
                a.a();
                return;
            } else
            {
                a.a((co)bu1);
                return;
            }
        }
        if (bu1 instanceof cl)
        {
            if (bu1.r())
            {
                a.a((cl)bu1);
                return;
            } else
            {
                a.b((cl)bu1);
                return;
            }
        }
        if (bu1 instanceof cm)
        {
            if (bu1.r())
            {
                a.a((cm)bu1);
                return;
            } else
            {
                a.b((cm)bu1);
                return;
            }
        }
        if (bu1 instanceof cj)
        {
            if (bu1.r())
            {
                a.a((cj)bu1);
                return;
            } else
            {
                a.b((cj)bu1);
                return;
            }
        }
        if (bu1 instanceof cq)
        {
            if (bu1.r())
            {
                a.a((cq)bu1);
                return;
            } else
            {
                a.b((cq)bu1);
                return;
            }
        }
        if (bu1 instanceof cr)
        {
            if (bu1.r())
            {
                a.a((cr)bu1);
                return;
            } else
            {
                a.b((cr)bu1);
                return;
            }
        } else
        {
            throw new RuntimeException("not handled");
        }
    }
}
