// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.payment.iap.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.payment.iap.proto:
//            GoogleIAPProceedPurchaseRequest

public final class nature extends gxc
{

    public String data_signature;
    public String purchase_data;
    public Integer response_code;

    public final GoogleIAPProceedPurchaseRequest build()
    {
        checkRequiredFields();
        return new GoogleIAPProceedPurchaseRequest(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build data_signature(String s)
    {
        data_signature = s;
        return this;
    }

    public final data_signature purchase_data(String s)
    {
        purchase_data = s;
        return this;
    }

    public final purchase_data response_code(Integer integer)
    {
        response_code = integer;
        return this;
    }

    public ()
    {
    }

    public (GoogleIAPProceedPurchaseRequest googleiapproceedpurchaserequest)
    {
        super(googleiapproceedpurchaserequest);
        if (googleiapproceedpurchaserequest == null)
        {
            return;
        } else
        {
            response_code = googleiapproceedpurchaserequest.response_code;
            purchase_data = googleiapproceedpurchaserequest.purchase_data;
            data_signature = googleiapproceedpurchaserequest.data_signature;
            return;
        }
    }
}
