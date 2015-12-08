// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.exceptions;

import android.content.Context;
import android.content.res.Resources;

public class CastException extends Exception
{

    private static final long serialVersionUID = 1L;

    public CastException()
    {
    }

    public CastException(Context context, int i)
    {
        super(context.getResources().getString(i));
    }

    public CastException(Context context, int i, Exception exception)
    {
        super(context.getResources().getString(i), exception);
    }

    public CastException(String s)
    {
        super(s);
    }

    public CastException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public CastException(Throwable throwable)
    {
        super(throwable);
    }
}
