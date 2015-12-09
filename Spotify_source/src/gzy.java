// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import io.fabric.sdk.android.services.concurrency.Priority;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class gzy
    implements gzr, gzx, hab
{

    private final List a = new ArrayList();
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final AtomicReference c = new AtomicReference(null);

    public gzy()
    {
    }

    public static boolean b(Object obj)
    {
        gzr gzr1;
        hab hab1;
        try
        {
            gzr1 = (gzr)obj;
            hab1 = (hab)obj;
            obj = (gzx)obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        return gzr1 != null && hab1 != null && obj != null;
    }

    public Priority a()
    {
        return Priority.a;
    }

    public final void a(hab hab1)
    {
        this;
        JVM INSTR monitorenter ;
        a.add(hab1);
        this;
        JVM INSTR monitorexit ;
        return;
        hab1;
        throw hab1;
    }

    public final volatile void a(Object obj)
    {
        a((hab)obj);
    }

    public final void a(Throwable throwable)
    {
        c.set(throwable);
    }

    public final void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        b.set(flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public int compareTo(Object obj)
    {
        return Priority.a(this, obj);
    }

    public final Collection f()
    {
        this;
        JVM INSTR monitorenter ;
        Collection collection = Collections.unmodifiableCollection(a);
        this;
        JVM INSTR monitorexit ;
        return collection;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean g()
    {
        for (Iterator iterator = f().iterator(); iterator.hasNext();)
        {
            if (!((hab)iterator.next()).h())
            {
                return false;
            }
        }

        return true;
    }

    public final boolean h()
    {
        return b.get();
    }
}
