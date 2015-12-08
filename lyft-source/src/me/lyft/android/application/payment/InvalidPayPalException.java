// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.payment;


// Referenced classes of package me.lyft.android.application.payment:
//            PaymentException

public class InvalidPayPalException extends PaymentException
{

    public InvalidPayPalException(String s, Throwable throwable, String s1)
    {
        super(s, throwable, s1);
    }
}
