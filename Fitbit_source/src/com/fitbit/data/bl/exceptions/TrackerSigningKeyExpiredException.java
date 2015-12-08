// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl.exceptions;


// Referenced classes of package com.fitbit.data.bl.exceptions:
//            ServerCommunicationException

public class TrackerSigningKeyExpiredException extends ServerCommunicationException
{

    public static final int a = 419;
    private static final long serialVersionUID = 1L;

    public TrackerSigningKeyExpiredException()
    {
        super(419, "Tracker signing key expired");
    }

    public String b()
    {
        return "TrackerSigningKeyExpiredException";
    }
}
