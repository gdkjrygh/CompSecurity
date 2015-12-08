// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.payment;

import me.lyft.android.common.IHasReason;

public class PaymentException extends Exception
    implements IHasReason
{

    private String reason;

    public PaymentException(String s, Throwable throwable, String s1)
    {
        super(s, throwable);
        reason = s1;
    }

    public String getReason()
    {
        return reason;
    }
}
