// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import java.io.IOException;

public final class ac extends RuntimeException
{

    protected ac(IOException ioexception)
    {
        super(ioexception);
    }

    public final volatile Throwable getCause()
    {
        return (IOException)super.getCause();
    }
}
