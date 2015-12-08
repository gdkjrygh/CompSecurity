// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl.exceptions;


// Referenced classes of package com.fitbit.data.bl.exceptions:
//            ServerCommunicationException

public class BlockerRestrictionException extends ServerCommunicationException
{

    private static final long serialVersionUID = 0xadad1d4fbbdf68f6L;

    public BlockerRestrictionException()
    {
    }

    BlockerRestrictionException(String s)
    {
        super(s);
    }

    public String b()
    {
        return "BlockerRestrictionException";
    }
}
