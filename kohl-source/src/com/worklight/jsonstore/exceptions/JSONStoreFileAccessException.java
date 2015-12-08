// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.exceptions;


// Referenced classes of package com.worklight.jsonstore.exceptions:
//            JSONStoreException

public class JSONStoreFileAccessException extends JSONStoreException
{

    private static final long serialVersionUID = 0x1f551e60ce6d71c9L;

    public JSONStoreFileAccessException(String s)
    {
        super(s);
    }

    public JSONStoreFileAccessException(String s, Throwable throwable)
    {
        super(s, throwable);
    }
}
