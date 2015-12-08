// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl.exceptions;


// Referenced classes of package com.fitbit.data.bl.exceptions:
//            ServerCommunicationException

public class NotLinkedTrackerException extends ServerCommunicationException
{

    public static final String a = "deviceid";
    public static final String b = "wireid";
    public static final int c = 400;
    private static final long serialVersionUID = 1L;

    public NotLinkedTrackerException(String s)
    {
        super(s);
    }

    public static void a(String s, int i, String s1)
        throws NotLinkedTrackerException
    {
        if (("deviceid".equalsIgnoreCase(s) || "wireid".equalsIgnoreCase(s)) && i == 400)
        {
            throw new NotLinkedTrackerException(s1);
        } else
        {
            return;
        }
    }

    public String b()
    {
        return "NotLinkedTrackerException";
    }
}
