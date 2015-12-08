// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import okio.BufferedSource;

public abstract class ResponseBody
    implements Closeable
{

    public ResponseBody()
    {
    }

    public final InputStream byteStream()
    {
        return source().inputStream();
    }

    public void close()
        throws IOException
    {
        source().close();
    }

    public abstract BufferedSource source();
}
