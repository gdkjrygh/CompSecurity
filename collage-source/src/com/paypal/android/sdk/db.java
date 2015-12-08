// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;


// Referenced classes of package com.paypal.android.sdk:
//            ao, fz, dw, da, 
//            fu, fp, gb, fq, 
//            fn, fo, fl, fs, 
//            ft

public final class db
    implements ao
{

    private da a;

    public db(da da1)
    {
        a = da1;
    }

    public final void a(dw dw1)
    {
        if (dw1 instanceof fz)
        {
            if (dw1.r())
            {
                a.a((fz)dw1);
                return;
            } else
            {
                a.b((fz)dw1);
                return;
            }
        }
        if (dw1 instanceof fu)
        {
            if (dw1.r())
            {
                a.a((fu)dw1);
                return;
            } else
            {
                a.b((fu)dw1);
                return;
            }
        }
        if (dw1 instanceof fp)
        {
            if (dw1.r())
            {
                a.a((fp)dw1);
                return;
            } else
            {
                a.b((fp)dw1);
                return;
            }
        }
        if (dw1 instanceof gb)
        {
            if (dw1.r())
            {
                a.a((gb)dw1);
                return;
            } else
            {
                a.b((gb)dw1);
                return;
            }
        }
        if (dw1 instanceof fq)
        {
            if (dw1.r())
            {
                a.a();
                return;
            } else
            {
                a.a((fq)dw1);
                return;
            }
        }
        if (dw1 instanceof fn)
        {
            if (dw1.r())
            {
                a.a((fn)dw1);
                return;
            } else
            {
                a.b((fn)dw1);
                return;
            }
        }
        if (dw1 instanceof fo)
        {
            if (dw1.r())
            {
                a.a((fo)dw1);
                return;
            } else
            {
                a.b((fo)dw1);
                return;
            }
        }
        if (dw1 instanceof fl)
        {
            if (dw1.r())
            {
                a.a((fl)dw1);
                return;
            } else
            {
                a.b((fl)dw1);
                return;
            }
        }
        if (dw1 instanceof fs)
        {
            if (dw1.r())
            {
                a.a((fs)dw1);
                return;
            } else
            {
                a.b((fs)dw1);
                return;
            }
        }
        if (dw1 instanceof ft)
        {
            if (dw1.r())
            {
                a.a((ft)dw1);
                return;
            } else
            {
                a.b((ft)dw1);
                return;
            }
        } else
        {
            throw new RuntimeException("not handled");
        }
    }
}
