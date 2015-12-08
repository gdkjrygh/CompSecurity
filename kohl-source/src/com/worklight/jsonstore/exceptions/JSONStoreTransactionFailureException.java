// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.exceptions;


// Referenced classes of package com.worklight.jsonstore.exceptions:
//            JSONStoreException

public class JSONStoreTransactionFailureException extends JSONStoreException
{

    private static final long serialVersionUID = 0x31ac8b6997828d1fL;

    public JSONStoreTransactionFailureException(String s)
    {
        super(s);
    }

    public JSONStoreTransactionFailureException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public JSONStoreTransactionFailureException(Throwable throwable)
    {
        super(throwable);
    }
}
