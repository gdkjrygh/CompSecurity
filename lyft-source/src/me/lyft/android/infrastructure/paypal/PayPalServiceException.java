// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.paypal;

import me.lyft.android.common.IHasReason;

public class PayPalServiceException extends Throwable
    implements IHasReason
{

    private String reason;

    public PayPalServiceException(Throwable throwable, String s)
    {
        super(throwable);
        reason = s;
    }

    public String getReason()
    {
        return (new StringBuilder()).append("paypal_").append(reason).toString();
    }
}
