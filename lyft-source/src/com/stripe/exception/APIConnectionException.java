// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.exception;


// Referenced classes of package com.stripe.exception:
//            StripeException

public class APIConnectionException extends StripeException
{

    private static final long serialVersionUID = 1L;

    public APIConnectionException(String s)
    {
        super(s);
    }

    public APIConnectionException(String s, Throwable throwable)
    {
        super(s, throwable);
    }
}
