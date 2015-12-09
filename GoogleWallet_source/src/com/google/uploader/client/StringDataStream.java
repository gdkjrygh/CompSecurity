// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.uploader.client;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

// Referenced classes of package com.google.uploader.client:
//            DataStream

public final class StringDataStream
    implements DataStream
{

    private final byte contents[];
    private int currentPosition;
    private int markPosition;

    public StringDataStream(String s)
    {
        try
        {
            contents = s.getBytes("UTF-8");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
    }

    public final long getMarkPosition()
    {
        this;
        JVM INSTR monitorenter ;
        int i = markPosition;
        long l = i;
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public final long getReadAheadLimit()
    {
        this;
        JVM INSTR monitorenter ;
        return 0x7fffffffffffffffL;
    }

    public final long getReadPosition()
    {
        this;
        JVM INSTR monitorenter ;
        int i = currentPosition;
        long l = i;
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public final long getSize()
    {
        this;
        JVM INSTR monitorenter ;
        int i = contents.length;
        long l = i;
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean hasMoreData()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        int j;
        i = currentPosition;
        j = contents.length;
        boolean flag;
        if (i < j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final void mark()
    {
        this;
        JVM INSTR monitorenter ;
        markPosition = currentPosition;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final int read(byte abyte0[], int i, int j)
        throws IOException
    {
        int k = 0;
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (abyte0.length - i >= j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Buffer length too small.");
        if (j != 0) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return k;
_L2:
        if (currentPosition == contents.length)
        {
            break; /* Loop/switch isn't completed */
        }
        k = Math.min(j, contents.length - currentPosition);
        j = 0;
_L4:
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        abyte0[i + j] = contents[currentPosition];
        currentPosition = currentPosition + 1;
        j++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L1; else goto _L5
_L5:
        abyte0;
        throw abyte0;
    }

    public final void rewind()
    {
        this;
        JVM INSTR monitorenter ;
        currentPosition = markPosition;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final long skip(long l)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        l = Math.min(l, contents.length - currentPosition);
        currentPosition = (int)((long)currentPosition + l);
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }
}
