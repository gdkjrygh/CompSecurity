// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.exceptions;


// Referenced classes of package com.worklight.jsonstore.exceptions:
//            JSONStoreException

public class JSONStoreChangeException extends JSONStoreException
{

    private static final long serialVersionUID = 0x898dc678a0e8c7b5L;

    public JSONStoreChangeException(String s)
    {
        super(s);
    }

    public JSONStoreChangeException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public JSONStoreChangeException(Throwable throwable)
    {
        super(throwable);
    }
}
