// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.exceptions;


// Referenced classes of package com.worklight.jsonstore.exceptions:
//            JSONStoreException

public class JSONStoreInvalidPasswordException extends JSONStoreException
{

    private static final long serialVersionUID = 0xb75d9f3fb51e012dL;

    public JSONStoreInvalidPasswordException(String s)
    {
        super(s);
    }

    public JSONStoreInvalidPasswordException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public JSONStoreInvalidPasswordException(Throwable throwable)
    {
        super(throwable);
    }
}
