// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl.exceptions;


// Referenced classes of package com.fitbit.data.bl.exceptions:
//            ServerCommunicationException

public abstract class TrackerBackOffException extends ServerCommunicationException
{

    public static final int a = 503;
    private static final long serialVersionUID = 1L;
    protected final int retryInterval;

    public TrackerBackOffException(String s)
    {
        super(s);
        retryInterval = 0;
    }

    public TrackerBackOffException(String s, int i)
    {
        super(s);
        retryInterval = i;
    }

    public int g()
    {
        return retryInterval;
    }
}
