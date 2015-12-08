// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.content.DialogInterface;

// Referenced classes of package com.paypal.android.sdk.payments:
//            PayPalProfileSharingActivity, PayPalService

final class ar
    implements android.content.DialogInterface.OnClickListener
{

    private PayPalProfileSharingActivity a;

    ar(PayPalProfileSharingActivity paypalprofilesharingactivity)
    {
        a = paypalprofilesharingactivity;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        PayPalProfileSharingActivity.b(a).a(PayPalProfileSharingActivity.a(a), true);
    }
}
