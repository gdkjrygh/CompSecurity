// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.exceptions;


public abstract class JSONStoreException extends Exception
{

    private static final long serialVersionUID = 0xa10ab6d9d2fcefbL;

    public JSONStoreException(String s)
    {
        super(s);
    }

    public JSONStoreException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public JSONStoreException(Throwable throwable)
    {
        super(throwable);
    }
}
