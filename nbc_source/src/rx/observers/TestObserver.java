// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.observers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import rx.Notification;
import rx.Observer;

public class TestObserver
    implements Observer
{

    private static Observer INERT = new Observer() {

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
    private final Observer _flddelegate;
    private final ArrayList onCompletedEvents;
    private final ArrayList onErrorEvents;
    private final ArrayList onNextEvents;

    public TestObserver()
    {
        onNextEvents = new ArrayList();
        onErrorEvents = new ArrayList();
        onCompletedEvents = new ArrayList();
        _flddelegate = INERT;
    }

    public TestObserver(Observer observer)
    {
        onNextEvents = new ArrayList();
        onErrorEvents = new ArrayList();
        onCompletedEvents = new ArrayList();
        _flddelegate = observer;
    }

    public void assertReceivedOnNext(List list)
    {
        if (onNextEvents.size() != list.size())
        {
            throw new AssertionError((new StringBuilder()).append("Number of items does not match. Provided: ").append(list.size()).append("  Actual: ").append(onNextEvents.size()).toString());
        }
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i) == null)
            {
                if (onNextEvents.get(i) != null)
                {
                    throw new AssertionError((new StringBuilder()).append("Value at index: ").append(i).append(" expected to be [null] but was: [").append(onNextEvents.get(i)).append("]").toString());
                }
                continue;
            }
            if (!list.get(i).equals(onNextEvents.get(i)))
            {
                throw new AssertionError((new StringBuilder()).append("Value at index: ").append(i).append(" expected to be [").append(list.get(i)).append("] (").append(list.get(i).getClass().getSimpleName()).append(") but was: [").append(onNextEvents.get(i)).append("] (").append(onNextEvents.get(i).getClass().getSimpleName()).append(")").toString());
            }
        }

    }

    public void assertTerminalEvent()
    {
        if (onErrorEvents.size() > 1)
        {
            throw new AssertionError((new StringBuilder()).append("Too many onError events: ").append(onErrorEvents.size()).toString());
        }
        if (onCompletedEvents.size() > 1)
        {
            throw new AssertionError((new StringBuilder()).append("Too many onCompleted events: ").append(onCompletedEvents.size()).toString());
        }
        if (onCompletedEvents.size() == 1 && onErrorEvents.size() == 1)
        {
            throw new AssertionError("Received both an onError and onCompleted. Should be one or the other.");
        }
        if (onCompletedEvents.size() == 0 && onErrorEvents.size() == 0)
        {
            throw new AssertionError("No terminal events received.");
        } else
        {
            return;
        }
    }

    public List getEvents()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(onNextEvents);
        arraylist.add(onErrorEvents);
        arraylist.add(onCompletedEvents);
        return Collections.unmodifiableList(arraylist);
    }

    public List getOnCompletedEvents()
    {
        return Collections.unmodifiableList(onCompletedEvents);
    }

    public List getOnErrorEvents()
    {
        return Collections.unmodifiableList(onErrorEvents);
    }

    public List getOnNextEvents()
    {
        return Collections.unmodifiableList(onNextEvents);
    }

    public void onCompleted()
    {
        onCompletedEvents.add(Notification.createOnCompleted());
        _flddelegate.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        onErrorEvents.add(throwable);
        _flddelegate.onError(throwable);
    }

    public void onNext(Object obj)
    {
        onNextEvents.add(obj);
        _flddelegate.onNext(obj);
    }

}
