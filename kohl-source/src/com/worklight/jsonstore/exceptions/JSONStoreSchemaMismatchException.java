// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.exceptions;


// Referenced classes of package com.worklight.jsonstore.exceptions:
//            JSONStoreException

public class JSONStoreSchemaMismatchException extends JSONStoreException
{

    private static final long serialVersionUID = 0x8a37a32610982808L;

    public JSONStoreSchemaMismatchException(String s)
    {
        super(s);
    }

    public JSONStoreSchemaMismatchException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public JSONStoreSchemaMismatchException(Throwable throwable)
    {
        super(throwable);
    }
}
