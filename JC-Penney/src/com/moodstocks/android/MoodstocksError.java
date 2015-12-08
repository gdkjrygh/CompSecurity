// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.moodstocks.android;

import com.moodstocks.android.core.Loader;

public class MoodstocksError extends Throwable
{

    private static final long serialVersionUID = 1L;
    private int errorCode;

    protected MoodstocksError(String s, int i)
    {
        super(s);
        errorCode = 0;
        errorCode = i;
    }

    public int getErrorCode()
    {
        return errorCode;
    }

    static 
    {
        Loader.load();
    }
}
