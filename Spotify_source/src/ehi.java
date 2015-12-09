// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.service.media.MediaService;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

abstract class ehi
{

    private static AtomicInteger b = new AtomicInteger();
    private static AtomicInteger c = new AtomicInteger();
    protected final MediaService a;
    private final List d = new LinkedList();
    private final egu e;

    ehi(MediaService mediaservice, egu egu1)
    {
        a = mediaservice;
        e = egu1;
    }

    protected abstract void a();

    public void a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        int j = b.incrementAndGet();
        d.add(Integer.valueOf(j));
        e.a(i, j);
        b();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected final void a(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        Integer integer;
        for (Iterator iterator = d.iterator(); iterator.hasNext(); e.a(integer.intValue(), c.incrementAndGet(), obj))
        {
            integer = (Integer)iterator.next();
        }

        break MISSING_BLOCK_LABEL_59;
        obj;
        throw obj;
        this;
        JVM INSTR monitorexit ;
    }

    public abstract void b();

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        d.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void d()
    {
        this;
        JVM INSTR monitorenter ;
        d.clear();
        a.a(this);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void e()
    {
        a();
    }

}
