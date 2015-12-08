// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx.Observer;
import rx.internal.operators.NotificationLite;

public final class actual
    implements Observer
{

    final Observer actual;
    protected volatile boolean caughtUp;
    boolean emitting;
    boolean fastPath;
    boolean first;
    private volatile Object index;
    List queue;

    protected void accept(Object obj, NotificationLite notificationlite)
    {
        if (obj != null)
        {
            notificationlite.accept(actual, obj);
        }
    }

    protected void emitFirst(Object obj, NotificationLite notificationlite)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        if (first && !emitting)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        first = false;
        if (obj != null)
        {
            flag = true;
        }
        emitting = flag;
        this;
        JVM INSTR monitorexit ;
        if (obj != null)
        {
            emitLoop(null, obj, notificationlite);
            return;
        } else
        {
            return;
        }
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    protected void emitLoop(List list, Object obj, NotificationLite notificationlite)
    {
        boolean flag;
        boolean flag2;
        boolean flag3;
        flag2 = true;
        flag3 = false;
        flag = true;
_L5:
        if (list == null) goto _L2; else goto _L1
_L1:
        for (list = list.iterator(); list.hasNext(); accept(list.next(), notificationlite)) { }
          goto _L2
        list;
        flag = flag3;
_L6:
        if (flag) goto _L4; else goto _L3
_L3:
        this;
        JVM INSTR monitorenter ;
        emitting = false;
        this;
        JVM INSTR monitorexit ;
_L4:
        throw list;
_L2:
        boolean flag1;
        flag1 = flag;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        accept(obj, notificationlite);
        flag1 = false;
        this;
        JVM INSTR monitorenter ;
        list = queue;
        queue = null;
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        emitting = false;
        flag1 = flag2;
        this;
        JVM INSTR monitorexit ;
        return;
        this;
        JVM INSTR monitorexit ;
        flag = flag1;
          goto _L5
        list;
        flag = false;
_L7:
        flag1 = flag;
        this;
        JVM INSTR monitorexit ;
        throw list;
        list;
          goto _L6
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
        list;
        flag = flag1;
          goto _L7
    }

    protected void emitNext(Object obj, NotificationLite notificationlite)
    {
        if (fastPath)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        this;
        JVM INSTR monitorenter ;
        first = false;
        if (!emitting)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        if (queue == null)
        {
            queue = new ArrayList();
        }
        queue.add(obj);
        this;
        JVM INSTR monitorexit ;
        return;
        this;
        JVM INSTR monitorexit ;
        fastPath = true;
        notificationlite.accept(actual, obj);
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    protected Observer getActual()
    {
        return actual;
    }

    public Object index()
    {
        return index;
    }

    public void index(Object obj)
    {
        index = obj;
    }

    public void onCompleted()
    {
        actual.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        actual.onError(throwable);
    }

    public void onNext(Object obj)
    {
        actual.onNext(obj);
    }

    public (Observer observer)
    {
        first = true;
        actual = observer;
    }
}
