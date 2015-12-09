// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import com.paypal.android.sdk.fo;
import com.paypal.android.sdk.fs;

// Referenced classes of package com.paypal.android.sdk.payments:
//            ah, al

class ac
{

    private static final String a = com/paypal/android/sdk/payments/ac.getSimpleName();
    private al b;
    private Object c;
    private ah d;

    ac()
    {
    }

    private void b(ah ah1)
    {
        ah1.a(c);
        boolean flag;
        if (!(c instanceof fo) && !(c instanceof fs))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = null;
        if (flag)
        {
            d = null;
        }
    }

    final void a()
    {
        if (c == null)
        {
            c = "success";
        }
        if (d != null)
        {
            b(d);
        }
    }

    final void a(ah ah1)
    {
        if (c != null)
        {
            b(ah1);
            return;
        }
        if (b != null)
        {
            ah1.a(b);
            b = null;
            d = null;
            return;
        } else
        {
            d = ah1;
            return;
        }
    }

    final void a(al al)
    {
        if (d != null)
        {
            d.a(al);
            return;
        } else
        {
            b = al;
            return;
        }
    }

    final void a(Object obj)
    {
        c = obj;
    }

    final void b()
    {
        d = null;
    }

}
