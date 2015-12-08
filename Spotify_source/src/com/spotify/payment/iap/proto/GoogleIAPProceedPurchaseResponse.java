// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.payment.iap.proto;

import com.squareup.wire.Message;

public final class GoogleIAPProceedPurchaseResponse extends Message
{

    public static final Boolean DEFAULT_SUCCESS = Boolean.valueOf(false);
    public final Boolean success;

    private GoogleIAPProceedPurchaseResponse(Builder builder)
    {
        super(builder);
        success = builder.success;
    }

    GoogleIAPProceedPurchaseResponse(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof GoogleIAPProceedPurchaseResponse))
        {
            return false;
        } else
        {
            return a(success, ((GoogleIAPProceedPurchaseResponse)obj).success);
        }
    }

    public final int hashCode()
    {
        int i = hashCode;
        if (i != 0)
        {
            return i;
        }
        if (success != null)
        {
            i = success.hashCode();
        } else
        {
            i = 0;
        }
        hashCode = i;
        return i;
    }


    private class Builder extends gxc
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

        public final Builder success(Boolean boolean1)
        {
            success = boolean1;
            return this;
        }

        public Builder()
        {
        }

        public Builder(GoogleIAPProceedPurchaseResponse googleiapproceedpurchaseresponse)
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

}
