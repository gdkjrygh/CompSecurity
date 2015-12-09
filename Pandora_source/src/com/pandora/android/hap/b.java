// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.hap;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class b
    implements p.dm.b
{
    private static class a extends OutputStream
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

        public void write(int j)
            throws IOException
        {
            synchronized (b)
            {
                a.write(j);
                b.notify();
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void write(byte abyte0[], int j, int k)
            throws IOException
        {
            synchronized (b)
            {
                a.write(abyte0, j, k);
                b.notify();
            }
            return;
            abyte0;
            obj;
            JVM INSTR monitorexit ;
            throw abyte0;
        }

        public a()
        {
            b = new Object();
            a = new ByteArrayOutputStream();
        }
    }


    PipedInputStream a;
    PipedOutputStream b;
    a c;
    boolean d;

    protected b()
    {
        d = false;
        try
        {
            a = new PipedInputStream();
            b = new PipedOutputStream(a);
            c = new a();
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    protected void a(byte abyte0[])
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (!a() && b != null)
        {
            b.write(abyte0);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    public boolean a()
    {
        return d;
    }

    protected byte[] b()
        throws IOException
    {
        if (a() || c == null)
        {
            throw new IOException("cannot read from pandora - connection is closed");
        } else
        {
            return c.a();
        }
    }

    public InputStream e()
    {
        return a;
    }

    public OutputStream f()
    {
        return c;
    }

    public void g()
    {
        this;
        JVM INSTR monitorenter ;
        d = true;
        b.close();
        a.close();
        c.close();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        ((IOException) (obj)).printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
    }

    public boolean i()
    {
        return false;
    }
}
