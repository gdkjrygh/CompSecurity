// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.io.Serializable;
import rx.Observer;

public final class NotificationLite
{

    private static final NotificationLite INSTANCE = new NotificationLite();
    private static final Object ON_COMPLETED_SENTINEL = new Serializable() {

        private static final long serialVersionUID = 1L;

        public String toString()
        {
            return "Notification=>Completed";
        }

    };
    private static final Object ON_NEXT_NULL_SENTINEL = new Serializable() {

        private static final long serialVersionUID = 2L;

        public String toString()
        {
            return "Notification=>NULL";
        }

    };

    private NotificationLite()
    {
    }

    public static NotificationLite instance()
    {
        return INSTANCE;
    }

    public boolean accept(Observer observer, Object obj)
    {
        if (obj == ON_COMPLETED_SENTINEL)
        {
            observer.onCompleted();
            return true;
        }
        if (obj == ON_NEXT_NULL_SENTINEL)
        {
            observer.onNext(null);
            return false;
        }
        if (obj != null)
        {
            if (obj.getClass() == rx/internal/operators/NotificationLite$OnErrorSentinel)
            {
                observer.onError(((OnErrorSentinel)obj).e);
                return true;
            } else
            {
                observer.onNext(obj);
                return false;
            }
        } else
        {
            throw new IllegalArgumentException("The lite notification can not be null");
        }
    }

    public Object completed()
    {
        return ON_COMPLETED_SENTINEL;
    }

    public Object error(Throwable throwable)
    {
        return new OnErrorSentinel(throwable);
    }

    public Throwable getError(Object obj)
    {
        return ((OnErrorSentinel)obj).e;
    }

    public Object getValue(Object obj)
    {
        Object obj1 = obj;
        if (obj == ON_NEXT_NULL_SENTINEL)
        {
            obj1 = null;
        }
        return obj1;
    }

    public boolean isCompleted(Object obj)
    {
        return obj == ON_COMPLETED_SENTINEL;
    }

    public boolean isError(Object obj)
    {
        return obj instanceof OnErrorSentinel;
    }

    public boolean isNext(Object obj)
    {
        return obj != null && !isError(obj) && !isCompleted(obj);
    }

    public boolean isNull(Object obj)
    {
        return obj == ON_NEXT_NULL_SENTINEL;
    }

    public rx.Notification.Kind kind(Object obj)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("The lite notification can not be null");
        }
        if (obj == ON_COMPLETED_SENTINEL)
        {
            return rx.Notification.Kind.OnCompleted;
        }
        if (obj instanceof OnErrorSentinel)
        {
            return rx.Notification.Kind.OnError;
        } else
        {
            return rx.Notification.Kind.OnNext;
        }
    }

    public Object next(Object obj)
    {
        Object obj1 = obj;
        if (obj == null)
        {
            obj1 = ON_NEXT_NULL_SENTINEL;
        }
        return obj1;
    }


    private class OnErrorSentinel
        implements Serializable
    {

        private static final long serialVersionUID = 3L;
        private final Throwable e;

        public String toString()
        {
            return (new StringBuilder()).append("Notification=>Error:").append(e).toString();
        }


        public OnErrorSentinel(Throwable throwable)
        {
            e = throwable;
        }
    }

}
