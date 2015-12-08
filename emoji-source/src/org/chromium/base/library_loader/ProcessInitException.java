// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base.library_loader;


public class ProcessInitException extends Exception
{

    private int mErrorCode;

    public ProcessInitException(int i)
    {
        mErrorCode = 0;
        mErrorCode = i;
    }

    public ProcessInitException(int i, Throwable throwable)
    {
        super(null, throwable);
        mErrorCode = 0;
        mErrorCode = i;
    }

    public int getErrorCode()
    {
        return mErrorCode;
    }
}
