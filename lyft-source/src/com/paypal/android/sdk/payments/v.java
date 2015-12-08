// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.widget.LinearLayout;
import com.paypal.android.sdk.cc;
import com.paypal.android.sdk.cq;
import com.paypal.android.sdk.cs;
import com.paypal.android.sdk.ct;

// Referenced classes of package com.paypal.android.sdk.payments:
//            ay, p, aB, d

final class v
    implements ay
{

    private p a;

    v(p p1)
    {
        a = p1;
        super();
    }

    public final void a(aB ab)
    {
        a.dismissDialog(2);
        if (ab.b.equals("invalid_nonce"))
        {
            a.c.h.setEnabled(false);
            d.a(a, cq.a(cs.aK), 4);
            return;
        } else
        {
            a.c.h.setEnabled(true);
            d.a(a, cq.a(ab.b), 1);
            return;
        }
    }

    public final void a(Object obj)
    {
        if (obj instanceof cc)
        {
            p.a(a, (cc)obj);
            return;
        } else
        {
            p.b(a);
            return;
        }
    }
}
