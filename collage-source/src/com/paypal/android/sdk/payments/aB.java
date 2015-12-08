// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.content.Context;
import android.content.Intent;
import com.paypal.android.sdk.cn;
import com.paypal.android.sdk.co;
import com.paypal.android.sdk.dc;
import com.paypal.android.sdk.df;
import com.paypal.android.sdk.ee;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.paypal.android.sdk.payments:
//            PayPalService, dq, ae, e

final class aB
    implements Runnable
{

    private Context a;

    aB(Context context)
    {
        a = context;
        super();
    }

    public final void run()
    {
        PayPalService.y();
        Object obj = a;
        new dq();
        obj = new cn(((Context) (obj)), "AndroidBasePrefs");
        dc.a(((cn) (obj)));
        df.a(((cn) (obj)));
        String s;
        for (Iterator iterator = (new ae(this)).iterator(); iterator.hasNext(); ee.b(s))
        {
            s = (String)iterator.next();
            co co1 = new co(((cn) (obj)), s);
            co1.b();
            co1.c();
        }

        obj = new Intent("com.paypal.android.sdk.clearAllUserData");
        e.a(a).a(((Intent) (obj)));
        PayPalService.y();
    }
}
