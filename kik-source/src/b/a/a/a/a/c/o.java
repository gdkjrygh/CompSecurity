// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package b.a.a.a.a.c:
//            f, n, q, i

public class o
    implements f, n, q
{

    private final List a = new ArrayList();
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final AtomicReference c = new AtomicReference(null);

    public o()
    {
    }

    public static boolean b(Object obj)
    {
        f f1;
        q q1;
        try
        {
            f1 = (f)obj;
            q1 = (q)obj;
            obj = (n)obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        return f1 != null && q1 != null && obj != null;
    }

    public int a()
    {
        return i.b;
    }

    public final void a(q q1)
    {
        this;
        JVM INSTR monitorenter ;
        a.add(q1);
        this;
        JVM INSTR monitorexit ;
        return;
        q1;
        throw q1;
    }

    public final volatile void a(Object obj)
    {
        a((q)obj);
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
        return i.a(this, obj);
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
            if (!((q)iterator.next()).j())
            {
                return false;
            }
        }

        return true;
    }

    public final boolean j()
    {
        return b.get();
    }
}
