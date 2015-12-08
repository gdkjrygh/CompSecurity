// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.driver.expresspay;

import me.lyft.android.common.IHasReason;

public class ExpressPayException extends Exception
    implements IHasReason
{

    public static final String ACCOUNT_INCOMPLETE = "account_incomplete";
    public static final String INELIGIBLE = "ineligible";
    public static final String INSUFFICIENT_EARNINGS = "insufficient_earnings";
    private String reason;

    public ExpressPayException(String s, Throwable throwable, String s1)
    {
        super(s, throwable);
        reason = s1;
    }

    public String getReason()
    {
        return reason;
    }
}
