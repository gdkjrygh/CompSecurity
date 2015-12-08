// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.os.Bundle;
import com.android.vending.billing.IInAppBillingService;

final class aol extends aoo
{

    private final String e;
    private final String f;
    private final String g;

    aol(String s, String s1, String s2)
    {
        super(aot.d);
        e = s;
        f = s1;
        g = s2;
    }

    protected final String a()
    {
        return null;
    }

    final void a(IInAppBillingService iinappbillingservice, String s)
    {
        String s2 = f;
        String s3 = e;
        String s1;
        if (g == null)
        {
            s1 = "";
        } else
        {
            s1 = g;
        }
        iinappbillingservice = iinappbillingservice.a(3, s, s2, s3, s1);
        if (!a(((Bundle) (iinappbillingservice))))
        {
            a((PendingIntent)iinappbillingservice.getParcelable("BUY_INTENT"));
        }
    }
}
