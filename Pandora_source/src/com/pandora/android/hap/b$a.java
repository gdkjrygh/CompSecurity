// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.hap;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.pandora.android.hap:
//            b

private static class m extends OutputStream
{

    ByteArrayOutputStream a;
    Object b;

    public byte[] a()
        throws IOException
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        if (a == null)
        {
            return new byte[0];
        }
        try
        {
            for (; a.size() == 0; b.wait()) { }
            break MISSING_BLOCK_LABEL_52;
        }
        catch (InterruptedException interruptedexception) { }
        finally { }
        obj;
        JVM INSTR monitorexit ;
        return new byte[0];
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        byte abyte0[];
        abyte0 = a.toByteArray();
        a.reset();
        obj;
        JVM INSTR monitorexit ;
        return abyte0;
    }

    public void write(int i)
        throws IOException
    {
        synchronized (b)
        {
            a.write(i);
            b.notify();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void write(byte abyte0[], int i, int j)
        throws IOException
    {
        synchronized (b)
        {
            a.write(abyte0, i, j);
            b.notify();
        }
        return;
        abyte0;
        obj;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    public on()
    {
        b = new Object();
        a = new ByteArrayOutputStream();
    }
}
