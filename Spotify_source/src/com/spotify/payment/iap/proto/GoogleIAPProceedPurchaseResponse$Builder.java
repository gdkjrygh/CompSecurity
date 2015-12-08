// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.payment.iap.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.payment.iap.proto:
//            GoogleIAPProceedPurchaseResponse

public final class success extends gxc
{

    public Boolean success;

    public final GoogleIAPProceedPurchaseResponse build()
    {
        checkRequiredFields();
        return new GoogleIAPProceedPurchaseResponse(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build success(Boolean boolean1)
    {
        success = boolean1;
        return this;
    }

    public ()
    {
    }

    public (GoogleIAPProceedPurchaseResponse googleiapproceedpurchaseresponse)
    {
        super(googleiapproceedpurchaseresponse);
        if (googleiapproceedpurchaseresponse == null)
        {
            return;
        } else
        {
            success = googleiapproceedpurchaseresponse.success;
            return;
        }
    }
}
