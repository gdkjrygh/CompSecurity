// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

// Referenced classes of package com.paypal.android.sdk.payments:
//            aG, PayPalProfileSharingActivity, ay, d, 
//            aH

final class ax
    implements aG
{

    final PayPalProfileSharingActivity a;

    ax(PayPalProfileSharingActivity paypalprofilesharingactivity)
    {
        a = paypalprofilesharingactivity;
        super();
    }

    public final void a()
    {
        Date date = Calendar.getInstance().getTime();
        if (PayPalProfileSharingActivity.d(a).compareTo(date) > 0)
        {
            long l = PayPalProfileSharingActivity.d(a).getTime() - date.getTime();
            PayPalProfileSharingActivity.a();
            (new StringBuilder("Delaying ")).append(l).append(" miliseconds so user doesn't see flicker.");
            PayPalProfileSharingActivity.a(a, new Timer());
            PayPalProfileSharingActivity.e(a).schedule(new ay(this), l);
            return;
        } else
        {
            PayPalProfileSharingActivity.c(a);
            return;
        }
    }

    public final void a(aH ah)
    {
        d.a(a, ah);
    }
}
