// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl.exceptions;


// Referenced classes of package com.fitbit.data.bl.exceptions:
//            TrackerBackOffException

public class SynclairBackOffException extends TrackerBackOffException
{

    private static final long serialVersionUID = 1L;

    public SynclairBackOffException()
    {
        super("Tracker Sync is backed off");
    }

    public SynclairBackOffException(int i)
    {
        super("Tracker Sync is backed off", i);
    }

    public String b()
    {
        return "SynclairBackOffException";
    }

    public String toString()
    {
        return (new StringBuilder()).append("Synclair backoff error: retryInterval = ").append(retryInterval).append(", message = ").append(getMessage()).toString();
    }
}
