// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl.exceptions;


// Referenced classes of package com.fitbit.data.bl.exceptions:
//            ServerCommunicationException

public class RateLimitException extends ServerCommunicationException
{

    public static final int a = 429;
    private static final String b = "Application is backed off";
    private static final long serialVersionUID = 1L;
    private final long retryAfter;

    public RateLimitException(long l)
    {
        super(429, "Application is backed off");
        retryAfter = l;
    }

    public String b()
    {
        return "RateLimitException";
    }

    public long c()
    {
        return retryAfter;
    }

    public String toString()
    {
        return (new StringBuilder()).append("RateLimitException: retryAfter = ").append(retryAfter).append(", message = ").append(getMessage()).toString();
    }
}
