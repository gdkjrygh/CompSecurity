// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl.exceptions;


// Referenced classes of package com.fitbit.data.bl.exceptions:
//            ServerCommunicationException

public class NetworkTimeoutException extends ServerCommunicationException
{

    public NetworkTimeoutException()
    {
    }

    public NetworkTimeoutException(Throwable throwable)
    {
        super(throwable);
    }

    public int a()
    {
        return 0x7f08053d;
    }

    public String b()
    {
        return "NetworkTimeoutException";
    }
}
