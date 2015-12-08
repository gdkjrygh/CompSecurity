// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3;


public class SerializationException extends RuntimeException
{

    private static final long serialVersionUID = 0x37e9f9395ae00706L;

    public SerializationException()
    {
    }

    public SerializationException(String s)
    {
        super(s);
    }

    public SerializationException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public SerializationException(Throwable throwable)
    {
        super(throwable);
    }
}
