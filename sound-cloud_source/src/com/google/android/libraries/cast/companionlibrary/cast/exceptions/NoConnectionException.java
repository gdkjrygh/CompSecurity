// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.exceptions;

import java.io.IOException;

public class NoConnectionException extends IOException
{

    public NoConnectionException()
    {
    }

    public NoConnectionException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public NoConnectionException(Throwable throwable)
    {
        super(throwable);
    }
}
