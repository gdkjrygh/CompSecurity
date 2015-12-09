// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl.exceptions;


// Referenced classes of package com.fitbit.data.bl.exceptions:
//            ServerCommunicationException

public class IncorrectTimestampException extends ServerCommunicationException
{

    private static final long serialVersionUID = 0x51fda862efcd292bL;

    public IncorrectTimestampException()
    {
    }

    public int a()
    {
        return 0x7f080286;
    }

    public String b()
    {
        return "IncorrectTimestampException";
    }
}
