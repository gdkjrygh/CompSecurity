// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.testing.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class TestableByteArrayOutputStream extends ByteArrayOutputStream
{

    private boolean closed;

    public TestableByteArrayOutputStream()
    {
    }

    public void close()
        throws IOException
    {
        closed = true;
    }

    public final byte[] getBuffer()
    {
        return buf;
    }

    public final boolean isClosed()
    {
        return closed;
    }
}
