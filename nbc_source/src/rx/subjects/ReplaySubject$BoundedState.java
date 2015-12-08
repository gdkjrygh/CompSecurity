// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subjects;

import java.util.ArrayList;
import java.util.List;
import rx.Observer;
import rx.functions.Func1;
import rx.internal.operators.NotificationLite;

// Referenced classes of package rx.subjects:
//            ReplaySubject

static final class leaveTransform
    implements leaveTransform
{

    final Func1 enterTransform;
    final y evictionPolicy;
    final Func1 leaveTransform;
    final y list = new t>();
    final NotificationLite nl = NotificationLite.instance();
    volatile  tail;
    volatile boolean terminated;

    public void accept(Observer observer,  )
    {
        nl.accept(observer, leaveTransform.call(.value));
    }

    public void acceptTest(Observer observer,  , long l)
    {
         = (() (.value));
        if (!evictionPolicy.test(, l))
        {
            nl.accept(observer, leaveTransform.call());
        }
    }

    public void complete()
    {
        if (!terminated)
        {
            terminated = true;
            list.ast(enterTransform.call(nl.completed()));
            evictionPolicy.evictFinal(list);
            tail = list.;
        }
    }

    public void error(Throwable throwable)
    {
        if (!terminated)
        {
            terminated = true;
            list.ast(enterTransform.call(nl.error(throwable)));
            evictionPolicy.evictFinal(list);
            tail = list.;
        }
    }

    public  head()
    {
        return list.;
    }

    public boolean isEmpty()
    {
        Object obj = head().next;
        if (obj != null)
        {
            if (!nl.isError(obj = leaveTransform.call((() (obj)).value)) && !nl.isCompleted(obj))
            {
                return false;
            }
        }
        return true;
    }

    public Object latest()
    {
        Object obj = head().next;
        if (obj != null)
        {
              = null;
            for (; obj != tail(); obj = (() (obj)).next)
            {
                 = (() (obj));
            }

            obj = leaveTransform.call((() (obj)).value);
            if (nl.isError(obj) || nl.isCompleted(obj))
            {
                if ( != null)
                {
                    obj = leaveTransform.call(.value);
                    return nl.getValue(obj);
                }
            } else
            {
                return nl.getValue(obj);
            }
        }
        return null;
    }

    public void next(Object obj)
    {
        if (!terminated)
        {
            list.ast(enterTransform.call(nl.next(obj)));
            evictionPolicy.evict(list);
            tail = list.;
        }
    }

    public boolean replayObserver(SubjectObserver subjectobserver)
    {
        subjectobserver;
        JVM INSTR monitorenter ;
        subjectobserver.first = false;
        if (!subjectobserver.emitting)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        subjectobserver;
        JVM INSTR monitorexit ;
        return false;
        subjectobserver;
        JVM INSTR monitorexit ;
        subjectobserver.index(replayObserverFromIndex(()subjectobserver.index(), subjectobserver));
        return true;
        Exception exception;
        exception;
        subjectobserver;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public volatile Object replayObserverFromIndex(Object obj, SubjectObserver subjectobserver)
    {
        return replayObserverFromIndex(()obj, subjectobserver);
    }

    public  replayObserverFromIndex( , SubjectObserver subjectobserver)
    {
        for (;  != tail();  = .next)
        {
            accept(subjectobserver, .next);
        }

        return ;
    }

    public volatile Object replayObserverFromIndexTest(Object obj, SubjectObserver subjectobserver, long l)
    {
        return replayObserverFromIndexTest(()obj, subjectobserver, l);
    }

    public  replayObserverFromIndexTest( , SubjectObserver subjectobserver, long l)
    {
        for (;  != tail();  = .next)
        {
            acceptTest(subjectobserver, .next, l);
        }

        return ;
    }

    public int size()
    {
        int j;
label0:
        {
            int i = 0;
             1 = head();
            for (  = 1.next;  != null;  = .next)
            {
                i++;
                1 = ;
            }

            j = i;
            if (1.value == null)
            {
                break label0;
            }
            Object obj = leaveTransform.call(1.value);
            j = i;
            if (obj == null)
            {
                break label0;
            }
            if (!nl.isError(obj))
            {
                j = i;
                if (!nl.isCompleted(obj))
                {
                    break label0;
                }
            }
            j = i - 1;
        }
        return j;
    }

    public  tail()
    {
        return tail;
    }

    public boolean terminated()
    {
        return terminated;
    }

    public Object[] toArray(Object aobj[])
    {
        ArrayList arraylist = new ArrayList();
          = head().next;
        do
        {
            Object obj;
label0:
            {
                if ( != null)
                {
                    obj = leaveTransform.call(.value);
                    if (.next != null || !nl.isError(obj) && !nl.isCompleted(obj))
                    {
                        break label0;
                    }
                }
                return arraylist.toArray(aobj);
            }
            arraylist.add(obj);
             = .next;
        } while (true);
    }

    public y(y y, Func1 func1, Func1 func1_1)
    {
        tail = list.;
        evictionPolicy = y;
        enterTransform = func1;
        leaveTransform = func1_1;
    }
}
