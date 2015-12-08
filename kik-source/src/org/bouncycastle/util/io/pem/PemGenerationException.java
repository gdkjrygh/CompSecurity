// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.util.io.pem;

import java.io.IOException;

public class PemGenerationException extends IOException
{

    private Throwable a;

    public PemGenerationException(String s)
    {
        super(s);
    }

    public PemGenerationException(String s, Throwable throwable)
    {
        super(s);
        a = throwable;
    }

    public Throwable getCause()
    {
        return a;
    }
}
