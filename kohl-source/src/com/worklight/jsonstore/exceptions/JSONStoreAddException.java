// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.exceptions;


// Referenced classes of package com.worklight.jsonstore.exceptions:
//            JSONStoreException

public class JSONStoreAddException extends JSONStoreException
{

    private static final long serialVersionUID = 0x31ac8b6997828d1fL;
    private int amountAdded;

    public JSONStoreAddException(String s)
    {
        super(s);
    }

    public JSONStoreAddException(String s, int i)
    {
        super(s);
        amountAdded = i;
    }

    public JSONStoreAddException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public JSONStoreAddException(String s, Throwable throwable, int i)
    {
        super(s, throwable);
    }

    public JSONStoreAddException(Throwable throwable)
    {
        super(throwable);
    }

    public int getAmountAdded()
    {
        return amountAdded;
    }
}
