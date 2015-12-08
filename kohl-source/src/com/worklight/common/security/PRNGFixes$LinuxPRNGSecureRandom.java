// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common.security;

import com.worklight.common.Logger;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.SecureRandomSpi;

// Referenced classes of package com.worklight.common.security:
//            PRNGFixes

public static class  extends SecureRandomSpi
{

    private static final File URANDOM_FILE = new File("/dev/urandom");
    private static final Object sLock = new Object();
    private static DataInputStream sUrandomIn;
    private static OutputStream sUrandomOut;
    private boolean mSeeded;

    private DataInputStream getUrandomInputStream()
    {
        Object obj = sLock;
        obj;
        JVM INSTR monitorenter ;
        DataInputStream datainputstream = sUrandomIn;
        if (datainputstream != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        sUrandomIn = new DataInputStream(new FileInputStream(URANDOM_FILE));
        datainputstream = sUrandomIn;
        obj;
        JVM INSTR monitorexit ;
        return datainputstream;
        Object obj1;
        obj1;
        throw new SecurityException((new StringBuilder()).append("Failed to open ").append(URANDOM_FILE).append(" for reading").toString(), ((Throwable) (obj1)));
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    private OutputStream getUrandomOutputStream()
        throws IOException
    {
        OutputStream outputstream;
        synchronized (sLock)
        {
            if (sUrandomOut == null)
            {
                sUrandomOut = new FileOutputStream(URANDOM_FILE);
            }
            outputstream = sUrandomOut;
        }
        return outputstream;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected byte[] engineGenerateSeed(int i)
    {
        byte abyte0[] = new byte[i];
        engineNextBytes(abyte0);
        return abyte0;
    }

    protected void engineNextBytes(byte abyte0[])
    {
        if (!mSeeded)
        {
            engineSetSeed(PRNGFixes.access$100());
        }
        DataInputStream datainputstream;
        synchronized (sLock)
        {
            datainputstream = getUrandomInputStream();
        }
        datainputstream;
        JVM INSTR monitorenter ;
        datainputstream.readFully(abyte0);
        datainputstream;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw abyte0;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new SecurityException((new StringBuilder()).append("Failed to read from ").append(URANDOM_FILE).toString(), abyte0);
        }
        abyte0;
        datainputstream;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    protected void engineSetSeed(byte abyte0[])
    {
        OutputStream outputstream;
        synchronized (sLock)
        {
            outputstream = getUrandomOutputStream();
        }
        outputstream.write(abyte0);
        outputstream.flush();
        mSeeded = true;
        return;
        abyte0;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw abyte0;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[]) { }
        finally
        {
            mSeeded = true;
        }
        PRNGFixes.access$000().warn((new StringBuilder()).append("Failed to mix seed into ").append(URANDOM_FILE).toString());
        mSeeded = true;
        return;
    }


    public ()
    {
    }
}
