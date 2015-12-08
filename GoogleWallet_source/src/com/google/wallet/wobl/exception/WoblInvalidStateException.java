// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.exception;


// Referenced classes of package com.google.wallet.wobl.exception:
//            WoblException

public class WoblInvalidStateException extends WoblException
{

    public WoblInvalidStateException()
    {
    }

    public WoblInvalidStateException(String s)
    {
        super(s);
    }

    public WoblInvalidStateException(String s, String s1)
    {
        super((new StringBuilder(String.valueOf(s).length() + 18 + String.valueOf(s1).length())).append(s).append(", parser details: ").append(s1).toString());
    }

    public WoblInvalidStateException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public WoblInvalidStateException(Throwable throwable)
    {
        super(throwable);
    }
}
