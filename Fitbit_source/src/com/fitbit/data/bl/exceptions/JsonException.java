// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl.exceptions;


// Referenced classes of package com.fitbit.data.bl.exceptions:
//            ServerCommunicationException

public class JsonException extends ServerCommunicationException
{

    private static final long serialVersionUID = 1L;

    public JsonException(Throwable throwable)
    {
        super(throwable);
    }

    public String b()
    {
        return "JsonException";
    }
}
