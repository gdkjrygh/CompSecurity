// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.network;

import java.io.IOException;

public class  extends RuntimeException
{

    private static final long serialVersionUID = 0xefc1aa7964bcfdc9L;

    public IOException a()
    {
        return (IOException)super.getCause();
    }

    public Throwable getCause()
    {
        return a();
    }

    protected (IOException ioexception)
    {
        super(ioexception);
    }
}
