// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package a.a.a.a.a.c:
//            l, u, y, o

public class v
    implements l, u, y
{

    private final List a = new ArrayList();
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final AtomicReference c = new AtomicReference(null);

    public v()
    {
    }

    public static boolean b(Object obj)
    {
        l l1;
        y y1;
        try
        {
            l1 = (l)obj;
            y1 = (y)obj;
            obj = (u)obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        return l1 != null && y1 != null && obj != null;
    }

    public int a()
    {
        return o.b;
    }

    public final void a(y y1)
    {
        this;
        JVM INSTR monitorenter ;
        a.add(y1);
        this;
        JVM INSTR monitorexit ;
        return;
        y1;
        throw y1;
    }

    public final volatile void a(Object obj)
    {
        a((y)obj);
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
        return o.a(this, obj);
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
            if (!((y)iterator.next()).j())
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
