// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.mobileconnectors.s3.transfermanager.a;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.a.b;
import com.amazonaws.a.c;
import com.amazonaws.a.d;
import com.amazonaws.mobileconnectors.s3.transfermanager.Transfer;
import com.amazonaws.mobileconnectors.s3.transfermanager.n;
import com.amazonaws.services.s3.model.ax;
import com.amazonaws.services.s3.model.bn;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

// Referenced classes of package com.amazonaws.mobileconnectors.s3.transfermanager.a:
//            s, q

public abstract class a
    implements Transfer
{

    protected volatile com.amazonaws.mobileconnectors.s3.transfermanager.Transfer.TransferState a;
    protected q b;
    protected final d c;
    protected final Collection d;
    private final n e;
    private final String f;

    a(String s1, n n, d d1)
    {
        this(s1, n, d1, null);
    }

    a(String s1, n n, d d1, s s2)
    {
        a = com.amazonaws.mobileconnectors.s3.transfermanager.Transfer.TransferState.a;
        d = new LinkedList();
        f = s1;
        c = d1;
        e = n;
        a(s2);
    }

    protected void a(int i1)
    {
        com.amazonaws.a.c.a(c, new com.amazonaws.a.a(i1, 0L));
    }

    public void a(b b1)
    {
        this;
        JVM INSTR monitorenter ;
        c.a(b1);
        this;
        JVM INSTR monitorexit ;
        return;
        b1;
        throw b1;
    }

    public void a(com.amazonaws.mobileconnectors.s3.transfermanager.Transfer.TransferState transferstate)
    {
        this;
        JVM INSTR monitorenter ;
        a = transferstate;
        this;
        JVM INSTR monitorexit ;
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((s)iterator.next()).a(this, transferstate)) { }
        break MISSING_BLOCK_LABEL_52;
        transferstate;
        this;
        JVM INSTR monitorexit ;
        throw transferstate;
    }

    public void a(q q1)
    {
        b = q1;
    }

    public void a(s s1)
    {
        this;
        JVM INSTR monitorenter ;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        d.add(s1);
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public void a(bn bn)
    {
        this;
        JVM INSTR monitorenter ;
        c.a(new ax(bn));
        this;
        JVM INSTR monitorexit ;
        return;
        bn;
        throw bn;
    }

    protected void a(ExecutionException executionexception)
    {
        throw b(executionexception);
    }

    protected AmazonClientException b(ExecutionException executionexception)
    {
        executionexception = executionexception.getCause();
        if (executionexception instanceof AmazonClientException)
        {
            return (AmazonClientException)executionexception;
        } else
        {
            return new AmazonClientException((new StringBuilder()).append("Unable to complete transfer: ").append(executionexception.getMessage()).toString(), executionexception);
        }
    }

    public void b(b b1)
    {
        this;
        JVM INSTR monitorenter ;
        c.b(b1);
        this;
        JVM INSTR monitorexit ;
        return;
        b1;
        throw b1;
    }

    public void b(com.amazonaws.mobileconnectors.s3.transfermanager.Transfer.TransferState transferstate)
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((s)iterator.next()).a(this, transferstate)) { }
    }

    public void b(s s1)
    {
        this;
        JVM INSTR monitorenter ;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        d.remove(s1);
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public void b(bn bn)
    {
        this;
        JVM INSTR monitorenter ;
        c.b(new ax(bn));
        this;
        JVM INSTR monitorexit ;
        return;
        bn;
        throw bn;
    }

    public boolean f()
    {
        this;
        JVM INSTR monitorenter ;
        if (a == com.amazonaws.mobileconnectors.s3.transfermanager.Transfer.TransferState.e || a == com.amazonaws.mobileconnectors.s3.transfermanager.Transfer.TransferState.c) goto _L2; else goto _L1
_L1:
        com.amazonaws.mobileconnectors.s3.transfermanager.Transfer.TransferState transferstate;
        com.amazonaws.mobileconnectors.s3.transfermanager.Transfer.TransferState transferstate1;
        transferstate = a;
        transferstate1 = com.amazonaws.mobileconnectors.s3.transfermanager.Transfer.TransferState.d;
        if (transferstate != transferstate1) goto _L3; else goto _L2
_L2:
        boolean flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L3:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public void g()
        throws AmazonClientException, AmazonServiceException, InterruptedException
    {
        Object obj = null;
_L1:
        if (b.b() && obj != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        obj = b.a().get();
          goto _L1
        ExecutionException executionexception;
        executionexception;
        a(executionexception);
    }

    public AmazonClientException h()
        throws InterruptedException
    {
        try
        {
            for (; !b.b(); b.a().get()) { }
        }
        catch (ExecutionException executionexception)
        {
            return b(executionexception);
        }
        b.a().get();
        return null;
    }

    public String i()
    {
        return f;
    }

    public com.amazonaws.mobileconnectors.s3.transfermanager.Transfer.TransferState j()
    {
        this;
        JVM INSTR monitorenter ;
        com.amazonaws.mobileconnectors.s3.transfermanager.Transfer.TransferState transferstate = a;
        this;
        JVM INSTR monitorexit ;
        return transferstate;
        Exception exception;
        exception;
        throw exception;
    }

    public n k()
    {
        return e;
    }

    public q l()
    {
        return b;
    }
}
