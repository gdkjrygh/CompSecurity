// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;

import android.content.Context;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class ProcessLock
{

    private static final String a = com/qihoo360/common/utils/ProcessLock.getSimpleName();
    private final Context b;
    private final boolean c;
    private final String d;
    private File e;
    private RandomAccessFile f;
    private FileLock g;
    private FileChannel h;
    private boolean i;

    public ProcessLock(Context context, String s, boolean flag)
    {
        i = false;
        b = context;
        c = flag;
        d = (new StringBuilder(String.valueOf(s))).append(".lock").toString();
    }

    private void a()
    {
        if (h != null)
        {
            IOException ioexception;
            try
            {
                h.close();
            }
            catch (IOException ioexception1) { }
            h = null;
        }
        if (f != null)
        {
            try
            {
                f.close();
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception) { }
            f = null;
        }
        e = null;
    }

    public void freeLock()
    {
        this;
        JVM INSTR monitorenter ;
        if (!i)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        if (c)
        {
            e.delete();
        }
        Exception exception;
        try
        {
            g.release();
        }
        catch (IOException ioexception) { }
        g = null;
        a();
        i = false;
        this;
        JVM INSTR monitorexit ;
        return;
        exception;
        throw exception;
    }

    public byte getInternalLockByte()
    {
        byte byte0 = 0;
        this;
        JVM INSTR monitorenter ;
        ByteBuffer bytebuffer;
        if (!i)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        bytebuffer = ByteBuffer.allocate(1);
        Exception exception;
        try
        {
            h.position(0L);
            h.read(bytebuffer);
        }
        catch (IOException ioexception) { }
        byte0 = bytebuffer.get(0);
        this;
        JVM INSTR monitorexit ;
        return byte0;
        exception;
        throw exception;
    }

    public void setInternalLockByte(byte byte0)
    {
        this;
        JVM INSTR monitorenter ;
        ByteBuffer bytebuffer;
        if (!i)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        bytebuffer = ByteBuffer.wrap(new byte[] {
            byte0
        });
        Exception exception;
        try
        {
            h.position(0L);
            h.write(bytebuffer);
        }
        catch (IOException ioexception) { }
        this;
        JVM INSTR monitorexit ;
        return;
        exception;
        throw exception;
    }

    public String toString()
    {
        return (new StringBuilder(String.valueOf(d))).append(" ").append(c).toString();
    }

    public boolean tryLock(int j, int k, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!i) goto _L2; else goto _L1
_L1:
        flag = i;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        e = b.getFileStreamPath(d);
        f = new RandomAccessFile(e, "rw");
        h = f.getChannel();
        if (!flag) goto _L4; else goto _L3
_L3:
        FileNotFoundException filenotfoundexception;
        try
        {
            g = h.lock();
            i = true;
        }
        catch (Exception exception) { }
_L6:
        if (!i)
        {
            a();
            if (e != null && c)
            {
                e.delete();
                e = null;
            }
        }
        flag = i;
          goto _L5
        filenotfoundexception;
        flag = false;
          goto _L5
_L7:
        Object obj;
        long l;
        try
        {
            g = h.tryLock();
        }
        catch (IOException ioexception) { }
        if (g != null)
        {
            i = true;
            break; /* Loop/switch isn't completed */
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        JVM INSTR monitorexit ;
        throw obj;
        if (k > 0)
        {
            l = k;
            try
            {
                Thread.sleep(l);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            finally
            {
                this;
            }
        }
        j--;
_L4:
        if (j > 0) goto _L7; else goto _L6
    }

}
