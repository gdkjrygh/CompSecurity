// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p.dm.m;

public class a extends Thread
{

    InputStream a;
    OutputStream b;
    boolean c;

    public a(InputStream inputstream, OutputStream outputstream)
    {
        c = false;
        a = inputstream;
        b = outputstream;
        setName(getClass().getSimpleName());
        start();
    }

    private int c()
        throws IOException
    {
        do
        {
            int i = a.available();
            if (i == 0)
            {
                try
                {
                    Thread.sleep(200L);
                }
                catch (InterruptedException interruptedexception) { }
            } else
            {
                return i;
            }
        } while (true);
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        c = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = c;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public void run()
    {
_L2:
        byte abyte0[];
        if (b())
        {
            break MISSING_BLOCK_LABEL_94;
        }
        abyte0 = new byte[8192];
        int i = c();
_L3:
        i = a.read(abyte0, 0, Math.min(i, abyte0.length));
        if (i == -1) goto _L2; else goto _L1
_L1:
        b.write(abyte0, 0, i);
        b.flush();
        i = c();
          goto _L3
        IOException ioexception;
        ioexception;
        m.l((new StringBuilder()).append("Lost connection, stopping thread ").append(ioexception.getMessage()).toString());
        a();
    }
}
