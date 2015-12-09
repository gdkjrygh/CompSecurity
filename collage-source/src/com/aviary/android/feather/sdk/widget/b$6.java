// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.widget.Toast;
import com.aviary.android.feather.cds.billing.util.Purchase;
import com.aviary.android.feather.cds.billing.util.e;
import com.aviary.android.feather.common.b.b;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            b

class e
    implements com.aviary.android.feather.cds.billing.util.hase
{

    final long a;
    final String b;
    final String c;
    final String d;
    final String e;
    final com.aviary.android.feather.sdk.widget.b f;

    public void a(e e1, Purchase purchase)
    {
        b.a.b("onIabPurchaseFinished: { result: %s, purchase: %s }", new Object[] {
            e1, purchase
        });
        if (!f.d())
        {
            b.a.d("context is no more valid");
            return;
        }
        if (e1.d())
        {
            switch (e1.a())
            {
            default:
                Toast.makeText(f.c, e1.b(), 0).show();
                break;

            case -1005: 
                break;
            }
        } else
        {
            com.aviary.android.feather.sdk.widget.b.a(f, purchase, a, b, c, d);
        }
        f.b.a(b, e, e1.c());
    }

    l.Purchase(com.aviary.android.feather.sdk.widget.b b1, long l, String s, String s1, String s2, String s3)
    {
        f = b1;
        a = l;
        b = s;
        c = s1;
        d = s2;
        e = s3;
        super();
    }
}
