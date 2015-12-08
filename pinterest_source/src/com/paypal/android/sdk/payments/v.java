// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.widget.LinearLayout;
import com.paypal.android.sdk.cF;
import com.paypal.android.sdk.cH;
import com.paypal.android.sdk.cI;
import com.paypal.android.sdk.cq;

// Referenced classes of package com.paypal.android.sdk.payments:
//            aE, p, aH, d

final class v
    implements aE
{

    private p a;

    v(p p1)
    {
        a = p1;
        super();
    }

    public final void a(aH ah)
    {
        a.dismissDialog(2);
        if (ah.b.equals("invalid_nonce"))
        {
            a.c.h.setEnabled(false);
            d.a(a, cF.a(cH.aL), 4);
            return;
        } else
        {
            a.c.h.setEnabled(true);
            d.a(a, cF.a(ah.b), 1);
            return;
        }
    }

    public final void a(Object obj)
    {
        if (obj instanceof cq)
        {
            p.a(a, (cq)obj);
            return;
        } else
        {
            p.b(a);
            return;
        }
    }
}
