// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.payment.iap.proto;

import com.squareup.wire.Message;

public final class GoogleIAPProceedPurchaseRequest extends Message
{

    public static final String DEFAULT_DATA_SIGNATURE = "";
    public static final String DEFAULT_PURCHASE_DATA = "";
    public static final Integer DEFAULT_RESPONSE_CODE = Integer.valueOf(0);
    public final String data_signature;
    public final String purchase_data;
    public final Integer response_code;

    private GoogleIAPProceedPurchaseRequest(Builder builder)
    {
        super(builder);
        response_code = builder.response_code;
        purchase_data = builder.purchase_data;
        data_signature = builder.data_signature;
    }

    GoogleIAPProceedPurchaseRequest(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof GoogleIAPProceedPurchaseRequest))
            {
                return false;
            }
            obj = (GoogleIAPProceedPurchaseRequest)obj;
            if (!a(response_code, ((GoogleIAPProceedPurchaseRequest) (obj)).response_code) || !a(purchase_data, ((GoogleIAPProceedPurchaseRequest) (obj)).purchase_data) || !a(data_signature, ((GoogleIAPProceedPurchaseRequest) (obj)).data_signature))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int l = 0;
        int j = hashCode;
        int i = j;
        if (j == 0)
        {
            int k;
            if (response_code != null)
            {
                i = response_code.hashCode();
            } else
            {
                i = 0;
            }
            if (purchase_data != null)
            {
                k = purchase_data.hashCode();
            } else
            {
                k = 0;
            }
            if (data_signature != null)
            {
                l = data_signature.hashCode();
            }
            i = (k + i * 37) * 37 + l;
            hashCode = i;
        }
        return i;
    }


    private class Builder extends gxc
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

        public final Builder data_signature(String s)
        {
            data_signature = s;
            return this;
        }

        public final Builder purchase_data(String s)
        {
            purchase_data = s;
            return this;
        }

        public final Builder response_code(Integer integer)
        {
            response_code = integer;
            return this;
        }

        public Builder()
        {
        }

        public Builder(GoogleIAPProceedPurchaseRequest googleiapproceedpurchaserequest)
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

}
