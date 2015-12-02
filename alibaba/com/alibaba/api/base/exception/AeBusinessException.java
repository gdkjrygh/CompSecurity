// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.base.exception;

import id;

public class AeBusinessException extends id
{

    public String scene;

    private AeBusinessException()
    {
    }

    public AeBusinessException(String s)
    {
        super(s);
    }

    public AeBusinessException(String s, String s1)
    {
        super(s);
        scene = s1;
    }

    public AeBusinessException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public AeBusinessException(String s, Throwable throwable, String s1)
    {
        super(s, throwable);
        scene = s1;
    }

    private AeBusinessException(Throwable throwable)
    {
        super(throwable);
    }
}
