// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.exception;


// Referenced classes of package com.google.wallet.wobl.exception:
//            WoblException

public class WoblMalformedDocException extends WoblException
{

    public WoblMalformedDocException()
    {
    }

    public WoblMalformedDocException(String s)
    {
        super(s);
    }

    public WoblMalformedDocException(String s, String s1)
    {
        super((new StringBuilder(String.valueOf(s).length() + 21 + String.valueOf(s1).length())).append(s).append(", exception found at:").append(s1).toString());
    }

    public WoblMalformedDocException(String s, Throwable throwable)
    {
        super(s, throwable);
    }
}
