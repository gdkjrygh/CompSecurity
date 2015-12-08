// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api;

import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.braintreepayments.api:
//            AppSwitch, ClientToken

public class VenmoAppSwitch extends AppSwitch
{

    public static final String VENMO_SOURCE = "venmo-app";

    public VenmoAppSwitch(Context context, ClientToken clienttoken)
    {
        super(context, clienttoken);
    }

    protected String getAppSwitchActivity()
    {
        return "CardChooserActivity";
    }

    protected String getCertificateIssuer()
    {
        return "CN=Andrew Kortina,OU=Engineering,O=Venmo,L=Philadelphia,ST=PA,C=US";
    }

    protected String getCertificateSubject()
    {
        return "CN=Andrew Kortina,OU=Engineering,O=Venmo,L=Philadelphia,ST=PA,C=US";
    }

    protected Intent getLaunchIntent()
    {
        Intent intent = super.getLaunchIntent().putExtra("com.braintreepayments.api.MERCHANT_ID", mClientToken.getMerchantId());
        if (mClientToken.getVenmoState().equals("offline"))
        {
            intent.putExtra("com.braintreepayments.api.OFFLINE", true);
        } else
        if (mClientToken.getVenmoState().equals("live"))
        {
            intent.putExtra("com.braintreepayments.api.OFFLINE", false);
            return intent;
        }
        return intent;
    }

    protected String getPackage()
    {
        return "com.venmo";
    }

    protected int getPublicKeyHashCode()
    {
        return 0xf844c11d;
    }

    protected String handleAppSwitchResponse(int i, Intent intent)
    {
        if (i == -1)
        {
            return intent.getStringExtra("com.braintreepayments.api.EXTRA_PAYMENT_METHOD_NONCE");
        } else
        {
            return null;
        }
    }

    protected boolean isAvailable()
    {
        return super.isAvailable() && !mClientToken.getVenmoState().equals("off");
    }
}
