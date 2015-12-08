// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http;

import java.io.IOException;

public class NoHttpResponseException extends IOException
{

    private static final long serialVersionUID = 0x95b5fa4be5f5c9d2L;

    public NoHttpResponseException(String s)
    {
        super(s);
    }
}
