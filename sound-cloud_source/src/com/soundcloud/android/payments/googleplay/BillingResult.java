// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments.googleplay;

import android.content.Intent;

// Referenced classes of package com.soundcloud.android.payments.googleplay:
//            BillingUtil, Payload

public class BillingResult
{

    private static final String FAIL_REASON_CANCELLED = "payment failed";
    private static final String FAIL_REASON_ERROR = "billing error: ";
    private static final String FAIL_REASON_UNKNOWN = "unknown";
    public static final int REQUEST_CODE = 1001;
    private final Intent data;
    private final int requestCode;
    private final int resultCode;

    public BillingResult(int i, int j, Intent intent)
    {
        requestCode = i;
        resultCode = j;
        data = intent;
    }

    private boolean isBillingResultOk()
    {
        return BillingUtil.getResponseCodeFromIntent(data) == 0;
    }

    public String getFailReason()
    {
        if (resultCode == 0)
        {
            return "payment failed";
        }
        if (!isBillingResultOk())
        {
            return (new StringBuilder("billing error: ")).append(BillingUtil.getResponseCodeFromIntent(data)).toString();
        } else
        {
            return "unknown";
        }
    }

    public Payload getPayload()
    {
        return new Payload(data.getStringExtra("INAPP_PURCHASE_DATA"), data.getStringExtra("INAPP_DATA_SIGNATURE"));
    }

    public boolean isForRequest()
    {
        return requestCode == 1001;
    }

    public boolean isOk()
    {
        return resultCode == -1 && isBillingResultOk();
    }
}
