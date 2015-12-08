// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx.Observer;
import rx.internal.operators.NotificationLite;

// Referenced classes of package rx.subjects:
//            SubjectSubscriptionManager

protected static final class actual
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
        boolean flag2;
        boolean flag3;
        boolean flag4;
        flag2 = true;
        flag4 = false;
        flag3 = false;
_L9:
        if (list == null) goto _L2; else goto _L1
_L1:
        boolean flag = flag3;
        list = list.iterator();
_L3:
        flag = flag3;
        if (!list.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag3;
        accept(list.next(), notificationlite);
        if (true) goto _L3; else goto _L2
        list;
        if (flag) goto _L5; else goto _L4
_L4:
        this;
        JVM INSTR monitorenter ;
        emitting = false;
        this;
        JVM INSTR monitorexit ;
_L5:
        throw list;
_L2:
        boolean flag1;
        flag1 = flag2;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        flag1 = false;
        flag = flag3;
        accept(obj, notificationlite);
        flag = flag3;
        this;
        JVM INSTR monitorenter ;
        flag = flag4;
        list = queue;
        flag = flag4;
        queue = null;
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        flag = flag4;
        emitting = false;
        flag = true;
        this;
        JVM INSTR monitorexit ;
        if (true) goto _L7; else goto _L6
_L6:
        this;
        JVM INSTR monitorenter ;
        emitting = false;
        this;
        JVM INSTR monitorexit ;
_L7:
        return;
        flag = flag4;
        this;
        JVM INSTR monitorexit ;
        flag2 = flag1;
        if (true) goto _L9; else goto _L8
_L8:
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
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
