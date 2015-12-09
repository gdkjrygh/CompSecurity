// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import java.io.IOException;

public final class RequestException extends Exception
{

    public RequestException(IOException ioexception)
    {
        super(ioexception);
    }

    public IOException getCause()
    {
        return (IOException)super.getCause();
    }

    public volatile Throwable getCause()
    {
        return getCause();
    }
}
