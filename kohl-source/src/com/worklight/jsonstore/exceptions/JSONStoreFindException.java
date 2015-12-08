// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.exceptions;


// Referenced classes of package com.worklight.jsonstore.exceptions:
//            JSONStoreException

public class JSONStoreFindException extends JSONStoreException
{

    private static final long serialVersionUID = 0x192a4d64ac5ab985L;

    public JSONStoreFindException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public JSONStoreFindException(Throwable throwable)
    {
        super(throwable);
    }
}
