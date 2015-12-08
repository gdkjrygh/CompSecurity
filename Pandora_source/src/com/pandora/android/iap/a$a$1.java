// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.iap;

import android.support.v4.content.j;
import com.amazon.device.iap.model.FulfillmentResult;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.provider.b;
import java.util.List;
import p.df.a;

// Referenced classes of package com.pandora.android.iap:
//            a, d, b

class a
    implements p.cm.bject
{

    final String a;
    final andoraIntent b;

    public void a(p.dc.a a1, List list)
    {
        if (a1 != null)
        {
            com.pandora.android.iap.andoraIntent().e().a(a, FulfillmentResult.FULFILLED);
            p.df.a.c("ALaCarteSubscriptionManager", "AmazonPurchase aLaCarte was successful");
            list = new PandoraIntent("iap_complete");
            b.a.C().a(list);
            com.pandora.android.iap.a.a(b.b, a1);
            b.b.a(a1);
            b.b.c();
            return;
        } else
        {
            p.df.a.c("ALaCarteSubscriptionManager", "AmazonPurchase AlaCarte failed");
            b.b.a(new PandoraIntent("iap_error"));
            return;
        }
    }

    ( , String s)
    {
        b = ;
        a = s;
        super();
    }
}
