// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.observers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import rx.Observer;
import rx.Subscriber;
import rx.exceptions.CompositeException;

// Referenced classes of package rx.observers:
//            TestObserver

public class TestSubscriber extends Subscriber
{

    private static final Observer INERT = new Observer() {

        public void onCompleted()
        {
        }

        public void onError(Throwable throwable)
        {
        }

        public void onNext(Object obj)
        {
        }

    };
    private final long initialRequest;
    private volatile Thread lastSeenThread;
    private final CountDownLatch latch;
    private final TestObserver testObserver;

    public TestSubscriber()
    {
        this(-1L);
    }

    public TestSubscriber(long l)
    {
        this(INERT, l);
    }

    public TestSubscriber(Observer observer)
    {
        this(observer, -1L);
    }

    public TestSubscriber(Observer observer, long l)
    {
        latch = new CountDownLatch(1);
        if (observer == null)
        {
            throw new NullPointerException();
        } else
        {
            testObserver = new TestObserver(observer);
            initialRequest = l;
            return;
        }
    }

    public TestSubscriber(Subscriber subscriber)
    {
        this(((Observer) (subscriber)), -1L);
    }

    public static TestSubscriber create()
    {
        return new TestSubscriber();
    }

    public static TestSubscriber create(long l)
    {
        return new TestSubscriber(l);
    }

    public static TestSubscriber create(Observer observer)
    {
        return new TestSubscriber(observer);
    }

    public static TestSubscriber create(Observer observer, long l)
    {
        return new TestSubscriber(observer, l);
    }

    public static TestSubscriber create(Subscriber subscriber)
    {
        return new TestSubscriber(subscriber);
    }

    public void assertCompleted()
    {
        int i = testObserver.getOnCompletedEvents().size();
        if (i == 0)
        {
            throw new AssertionError("Not completed!");
        }
        if (i > 1)
        {
            throw new AssertionError((new StringBuilder()).append("Completed multiple times: ").append(i).toString());
        } else
        {
            return;
        }
    }

    public void assertError(Class class1)
    {
        List list = testObserver.getOnErrorEvents();
        if (list.size() == 0)
        {
            throw new AssertionError("No errors");
        }
        if (list.size() > 1)
        {
            class1 = new AssertionError((new StringBuilder()).append("Multiple errors: ").append(list.size()).toString());
            class1.initCause(new CompositeException(list));
            throw class1;
        }
        if (!class1.isInstance(list.get(0)))
        {
            class1 = new AssertionError((new StringBuilder()).append("Exceptions differ; expected: ").append(class1).append(", actual: ").append(list.get(0)).toString());
            class1.initCause((Throwable)list.get(0));
            throw class1;
        } else
        {
            return;
        }
    }

    public void assertError(Throwable throwable)
    {
        List list = testObserver.getOnErrorEvents();
        if (list.size() == 0)
        {
            throw new AssertionError("No errors");
        }
        if (list.size() > 1)
        {
            throwable = new AssertionError((new StringBuilder()).append("Multiple errors: ").append(list.size()).toString());
            throwable.initCause(new CompositeException(list));
            throw throwable;
        }
        if (!throwable.equals(list.get(0)))
        {
            throwable = new AssertionError((new StringBuilder()).append("Exceptions differ; expected: ").append(throwable).append(", actual: ").append(list.get(0)).toString());
            throwable.initCause((Throwable)list.get(0));
            throw throwable;
        } else
        {
            return;
        }
    }

    public void assertNoErrors()
    {
        List list = getOnErrorEvents();
        if (list.size() > 0)
        {
            AssertionError assertionerror = new AssertionError((new StringBuilder()).append("Unexpected onError events: ").append(getOnErrorEvents().size()).toString());
            if (list.size() == 1)
            {
                assertionerror.initCause((Throwable)getOnErrorEvents().get(0));
            } else
            {
                assertionerror.initCause(new CompositeException(list));
            }
            throw assertionerror;
        } else
        {
            return;
        }
    }

    public void assertNoTerminalEvent()
    {
        List list = testObserver.getOnErrorEvents();
        int i = testObserver.getOnCompletedEvents().size();
        if (list.size() > 0 || i > 0)
        {
            if (list.isEmpty())
            {
                throw new AssertionError((new StringBuilder()).append("Found ").append(list.size()).append(" errors and ").append(i).append(" completion events instead of none").toString());
            }
            if (list.size() == 1)
            {
                AssertionError assertionerror = new AssertionError((new StringBuilder()).append("Found ").append(list.size()).append(" errors and ").append(i).append(" completion events instead of none").toString());
                assertionerror.initCause((Throwable)list.get(0));
                throw assertionerror;
            } else
            {
                AssertionError assertionerror1 = new AssertionError((new StringBuilder()).append("Found ").append(list.size()).append(" errors and ").append(i).append(" completion events instead of none").toString());
                assertionerror1.initCause(new CompositeException(list));
                throw assertionerror1;
            }
        } else
        {
            return;
        }
    }

    public void assertNoValues()
    {
        int i = testObserver.getOnNextEvents().size();
        if (i > 0)
        {
            throw new AssertionError((new StringBuilder()).append("No onNext events expected yet some received: ").append(i).toString());
        } else
        {
            return;
        }
    }

    public void assertNotCompleted()
    {
        int i = testObserver.getOnCompletedEvents().size();
        if (i == 1)
        {
            throw new AssertionError("Completed!");
        }
        if (i > 1)
        {
            throw new AssertionError((new StringBuilder()).append("Completed multiple times: ").append(i).toString());
        } else
        {
            return;
        }
    }

    public void assertReceivedOnNext(List list)
    {
        testObserver.assertReceivedOnNext(list);
    }

    public void assertTerminalEvent()
    {
        testObserver.assertTerminalEvent();
    }

    public void assertUnsubscribed()
    {
        if (!isUnsubscribed())
        {
            throw new AssertionError("Not unsubscribed.");
        } else
        {
            return;
        }
    }

    public void assertValue(Object obj)
    {
        assertReceivedOnNext(Collections.singletonList(obj));
    }

    public void assertValueCount(int i)
    {
        int j = testObserver.getOnNextEvents().size();
        if (j != i)
        {
            throw new AssertionError((new StringBuilder()).append("Number of onNext events differ; expected: ").append(i).append(", actual: ").append(j).toString());
        } else
        {
            return;
        }
    }

    public transient void assertValues(Object aobj[])
    {
        assertReceivedOnNext(Arrays.asList(aobj));
    }

    public void awaitTerminalEvent()
    {
        try
        {
            latch.await();
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            throw new RuntimeException("Interrupted", interruptedexception);
        }
    }

    public void awaitTerminalEvent(long l, TimeUnit timeunit)
    {
        try
        {
            latch.await(l, timeunit);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (TimeUnit timeunit)
        {
            throw new RuntimeException("Interrupted", timeunit);
        }
    }

    public void awaitTerminalEventAndUnsubscribeOnTimeout(long l, TimeUnit timeunit)
    {
        try
        {
            if (!latch.await(l, timeunit))
            {
                unsubscribe();
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (TimeUnit timeunit)
        {
            unsubscribe();
        }
    }

    public Thread getLastSeenThread()
    {
        return lastSeenThread;
    }

    public List getOnCompletedEvents()
    {
        return testObserver.getOnCompletedEvents();
    }

    public List getOnErrorEvents()
    {
        return testObserver.getOnErrorEvents();
    }

    public List getOnNextEvents()
    {
        return testObserver.getOnNextEvents();
    }

    public void onCompleted()
    {
        lastSeenThread = Thread.currentThread();
        testObserver.onCompleted();
        latch.countDown();
        return;
        Exception exception;
        exception;
        latch.countDown();
        throw exception;
    }

    public void onError(Throwable throwable)
    {
        lastSeenThread = Thread.currentThread();
        testObserver.onError(throwable);
        latch.countDown();
        return;
        throwable;
        latch.countDown();
        throw throwable;
    }

    public void onNext(Object obj)
    {
        lastSeenThread = Thread.currentThread();
        testObserver.onNext(obj);
    }

    public void onStart()
    {
        if (initialRequest >= 0L)
        {
            requestMore(initialRequest);
        }
    }

    public void requestMore(long l)
    {
        request(l);
    }

}
