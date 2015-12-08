// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.observables;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import rx.Subscriber;
import rx.exceptions.CompositeException;

// Referenced classes of package rx.observables:
//            AbstractOnSubscribe

public static final class <init>
{

    private long calls;
    private boolean hasCompleted;
    private boolean hasOnNext;
    private final AtomicInteger inUse;
    private final AbstractOnSubscribe parent;
    private int phase;
    private final AtomicLong requestCount;
    private final Object state;
    private boolean stopRequested;
    private final Subscriber subscriber;
    private Throwable theException;
    private Object theValue;

    protected boolean accept()
    {
        if (hasOnNext)
        {
            Object obj = theValue;
            theValue = null;
            hasOnNext = false;
            try
            {
                subscriber.onNext(obj);
            }
            catch (Throwable throwable)
            {
                hasCompleted = true;
                Throwable throwable1 = theException;
                theException = null;
                if (throwable1 == null)
                {
                    subscriber.onError(throwable);
                    return true;
                } else
                {
                    subscriber.onError(new CompositeException(Arrays.asList(new Throwable[] {
                        throwable, throwable1
                    })));
                    return true;
                }
            }
        }
        if (hasCompleted)
        {
            obj = theException;
            theException = null;
            if (obj != null)
            {
                subscriber.onError(((Throwable) (obj)));
                return true;
            } else
            {
                subscriber.onCompleted();
                return true;
            }
        } else
        {
            return false;
        }
    }

    public void advancePhase()
    {
        advancePhaseBy(1);
    }

    public void advancePhaseBy(int i)
    {
        phase = phase + i;
    }

    public long calls()
    {
        return calls;
    }

    protected void free()
    {
        while (inUse.get() <= 0 || inUse.decrementAndGet() != 0) 
        {
            return;
        }
        parent.onTerminated(state);
    }

    public void onCompleted()
    {
        if (hasCompleted)
        {
            throw new IllegalStateException("Already terminated", theException);
        } else
        {
            hasCompleted = true;
            return;
        }
    }

    public void onError(Throwable throwable)
    {
        if (throwable == null)
        {
            throw new NullPointerException("e != null required");
        }
        if (hasCompleted)
        {
            throw new IllegalStateException("Already terminated", theException);
        } else
        {
            theException = throwable;
            hasCompleted = true;
            return;
        }
    }

    public void onNext(Object obj)
    {
        if (hasOnNext)
        {
            throw new IllegalStateException("onNext not consumed yet!");
        }
        if (hasCompleted)
        {
            throw new IllegalStateException("Already terminated", theException);
        } else
        {
            theValue = obj;
            hasOnNext = true;
            return;
        }
    }

    public int phase()
    {
        return phase;
    }

    public void phase(int i)
    {
        phase = i;
    }

    public Object state()
    {
        return state;
    }

    public void stop()
    {
        stopRequested = true;
    }

    protected boolean stopRequested()
    {
        return stopRequested;
    }

    protected void terminate()
    {
        int i;
        do
        {
            i = inUse.get();
            if (i <= 0)
            {
                return;
            }
        } while (!inUse.compareAndSet(i, 0));
        parent.onTerminated(state);
    }

    protected boolean use()
    {
        boolean flag = true;
        int i = inUse.get();
        if (i == 0)
        {
            flag = false;
        } else
        if (i != 1 || !inUse.compareAndSet(1, 2))
        {
            throw new IllegalStateException("This is not reentrant nor threadsafe!");
        }
        return flag;
    }

    protected boolean verify()
    {
        return hasOnNext || hasCompleted || stopRequested;
    }





/*
    static long access$708( )
    {
        long l = .calls;
        .calls = 1L + l;
        return l;
    }

*/

    private calls(AbstractOnSubscribe abstractonsubscribe, Subscriber subscriber1, Object obj)
    {
        parent = abstractonsubscribe;
        subscriber = subscriber1;
        state = obj;
        requestCount = new AtomicLong();
        inUse = new AtomicInteger(1);
    }

    inUse(AbstractOnSubscribe abstractonsubscribe, Subscriber subscriber1, Object obj, inUse inuse)
    {
        this(abstractonsubscribe, subscriber1, obj);
    }
}
