// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.exceptions;


// Referenced classes of package com.worklight.jsonstore.exceptions:
//            JSONStoreException

public class JSONStoreDirtyCheckException extends JSONStoreException
{

    private static final long serialVersionUID = 0x63e4825e65a5f1efL;

    public JSONStoreDirtyCheckException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public JSONStoreDirtyCheckException(Throwable throwable)
    {
        super(throwable);
    }
}
