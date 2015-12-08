// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.util.concurrent.locks.ReentrantReadWriteLock;

final class fed
{

    ReentrantReadWriteLock a;
    final String b;
    int c;
    File d;
    private final fec e;
    private int f;

    fed(String s, fec fec1)
    {
        a = new ReentrantReadWriteLock();
        c = fee.a;
        b = s;
        e = fec1;
    }

    private void e()
    {
        this;
        JVM INSTR monitorenter ;
        f = f - 1;
        if (f == 0)
        {
            e.a(this);
            a = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final void a()
    {
        ReentrantReadWriteLock reentrantreadwritelock = a;
        e();
        reentrantreadwritelock.readLock().unlock();
    }

    final void a(File file)
    {
        d = file;
        c = fee.b;
    }

    final void b()
    {
        d();
        a.writeLock().lock();
    }

    final void c()
    {
        ReentrantReadWriteLock reentrantreadwritelock = a;
        e();
        reentrantreadwritelock.writeLock().unlock();
    }

    void d()
    {
        this;
        JVM INSTR monitorenter ;
        f = f + 1;
        if (f == 1)
        {
            e.b(this);
            a = new ReentrantReadWriteLock();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
