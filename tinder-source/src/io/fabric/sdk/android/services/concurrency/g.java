// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//            a, f, i, Priority

public class g
    implements a, f, i
{

    private final List a = new ArrayList();
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final AtomicReference c = new AtomicReference(null);

    public g()
    {
    }

    public static boolean b(Object obj)
    {
        a a1;
        i j;
        try
        {
            a1 = (a)obj;
            j = (i)obj;
            obj = (f)obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        return a1 != null && j != null && obj != null;
    }

    public Priority a()
    {
        return Priority.b;
    }

    public final void a(i j)
    {
        this;
        JVM INSTR monitorenter ;
        a.add(j);
        this;
        JVM INSTR monitorexit ;
        return;
        j;
        throw j;
    }

    public final volatile void a(Object obj)
    {
        a((i)obj);
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
            if (!((i)iterator.next()).h())
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
