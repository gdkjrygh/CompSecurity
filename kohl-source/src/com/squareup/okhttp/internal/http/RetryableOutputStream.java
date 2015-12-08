// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.AbstractOutputStream;
import com.squareup.okhttp.internal.Util;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ProtocolException;

final class RetryableOutputStream extends AbstractOutputStream
{

    private final ByteArrayOutputStream content;
    private final int limit;

    public RetryableOutputStream()
    {
        limit = -1;
        content = new ByteArrayOutputStream();
    }

    public RetryableOutputStream(int i)
    {
        limit = i;
        content = new ByteArrayOutputStream(i);
    }

    public void close()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = closed;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        closed = true;
        if (content.size() >= limit) goto _L1; else goto _L3
_L3:
        throw new ProtocolException((new StringBuilder()).append("content-length promised ").append(limit).append(" bytes, but received ").append(content.size()).toString());
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int contentLength()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        close();
        i = content.size();
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public void write(byte abyte0[], int i, int j)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        checkNotClosed();
        Util.checkOffsetAndCount(abyte0.length, i, j);
        if (limit != -1 && content.size() > limit - j)
        {
            throw new ProtocolException((new StringBuilder()).append("exceeded content-length limit of ").append(limit).append(" bytes").toString());
        }
        break MISSING_BLOCK_LABEL_77;
        abyte0;
        this;
        JVM INSTR monitorexit ;
        throw abyte0;
        content.write(abyte0, i, j);
        this;
        JVM INSTR monitorexit ;
    }

    public void writeToSocket(OutputStream outputstream)
        throws IOException
    {
        content.writeTo(outputstream);
    }
}
