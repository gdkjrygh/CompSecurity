// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.stripe;


// Referenced classes of package me.lyft.android.infrastructure.stripe:
//            StripeServiceException

public class StripeInvalidCardException extends StripeServiceException
{

    public StripeInvalidCardException(String s, Throwable throwable)
    {
        super(s, throwable);
    }
}
