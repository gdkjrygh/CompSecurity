// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.exception;


// Referenced classes of package com.stripe.exception:
//            StripeException

public class CardException extends StripeException
{

    private static final long serialVersionUID = 1L;
    private String charge;
    private String code;
    private String declineCode;
    private String param;

    public CardException(String s, String s1, String s2, String s3, String s4, Throwable throwable)
    {
        super(s, throwable);
        code = s1;
        param = s2;
        declineCode = s3;
        charge = s4;
    }

    public String getCharge()
    {
        return charge;
    }

    public String getCode()
    {
        return code;
    }

    public String getDeclineCode()
    {
        return declineCode;
    }

    public String getParam()
    {
        return param;
    }
}
