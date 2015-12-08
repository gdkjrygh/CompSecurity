// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy;

import java.io.IOException;

public class BrokenHttpClientException extends IOException
{

    private static final long serialVersionUID = 0xbde1b0e9b7a41e8fL;

    public BrokenHttpClientException(Throwable throwable)
    {
        String s;
        if (throwable == null)
        {
            s = null;
        } else
        {
            s = throwable.toString();
        }
        super(s);
        initCause(throwable);
    }
}
