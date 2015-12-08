// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rx.Y;
import rx.exceptions.Exceptions;

public final class o
    implements Y
{

    public LinkedList a;
    public volatile boolean b;

    public o()
    {
    }

    public o(Y y)
    {
        a = new LinkedList();
        a.add(y);
    }

    public transient o(Y ay[])
    {
        a = new LinkedList(Arrays.asList(ay));
    }

    public final void a(Y y)
    {
        if (y.isUnsubscribed())
        {
            return;
        }
        if (b) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        LinkedList linkedlist1;
        if (b)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        linkedlist1 = a;
        LinkedList linkedlist;
        linkedlist = linkedlist1;
        if (linkedlist1 != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        linkedlist = new LinkedList();
        a = linkedlist;
        linkedlist.add(y);
        this;
        JVM INSTR monitorexit ;
        return;
        y;
        this;
        JVM INSTR monitorexit ;
        throw y;
        this;
        JVM INSTR monitorexit ;
_L2:
        y.unsubscribe();
        return;
    }

    public final boolean isUnsubscribed()
    {
        return b;
    }

    public final void unsubscribe()
    {
        Object obj;
        obj = null;
        if (b)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        this;
        JVM INSTR monitorenter ;
        if (!b)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj1;
        b = true;
        obj1 = a;
        a = null;
        this;
        JVM INSTR monitorexit ;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        for (obj1 = ((Collection) (obj1)).iterator(); ((Iterator) (obj1)).hasNext();)
        {
            Y y = (Y)((Iterator) (obj1)).next();
            try
            {
                y.unsubscribe();
            }
            catch (Throwable throwable)
            {
                if (obj == null)
                {
                    obj = new ArrayList();
                }
                ((List) (obj)).add(throwable);
            }
        }

        break MISSING_BLOCK_LABEL_106;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        Exceptions.throwIfAny(((List) (obj)));
        return;
    }
}
