// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.exceptions;


// Referenced classes of package com.worklight.jsonstore.exceptions:
//            JSONStoreException

public class JSONStoreInvalidSchemaException extends JSONStoreException
{

    private static final long serialVersionUID = 0xd70653a85d2ee170L;

    public JSONStoreInvalidSchemaException(String s)
    {
        super(s);
    }

    public JSONStoreInvalidSchemaException(String s, Throwable throwable)
    {
        super(s, throwable);
    }
}
