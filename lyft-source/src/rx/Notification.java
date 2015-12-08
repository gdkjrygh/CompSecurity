// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;


// Referenced classes of package rx:
//            Observer

public final class Notification
{

    private static final Notification ON_COMPLETED;
    private final Kind kind;
    private final Throwable throwable;
    private final Object value;

    private Notification(Kind kind1, Object obj, Throwable throwable1)
    {
        value = obj;
        throwable = throwable1;
        kind = kind1;
    }

    public static Notification createOnCompleted()
    {
        return ON_COMPLETED;
    }

    public static Notification createOnCompleted(Class class1)
    {
        return ON_COMPLETED;
    }

    public static Notification createOnError(Throwable throwable1)
    {
        return new Notification(Kind.OnError, null, throwable1);
    }

    public static Notification createOnNext(Object obj)
    {
        return new Notification(Kind.OnNext, obj, null);
    }

    public void accept(Observer observer)
    {
        if (isOnNext())
        {
            observer.onNext(getValue());
        } else
        {
            if (isOnCompleted())
            {
                observer.onCompleted();
                return;
            }
            if (isOnError())
            {
                observer.onError(getThrowable());
                return;
            }
        }
    }

    public boolean equals(Object obj)
    {
        if (obj != null)
        {
            if (this == obj)
            {
                return true;
            }
            if (obj.getClass() == getClass())
            {
                obj = (Notification)obj;
                if (((Notification) (obj)).getKind() == getKind() && (!hasValue() || getValue().equals(((Notification) (obj)).getValue())) && (!hasThrowable() || getThrowable().equals(((Notification) (obj)).getThrowable())))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public Kind getKind()
    {
        return kind;
    }

    public Throwable getThrowable()
    {
        return throwable;
    }

    public Object getValue()
    {
        return value;
    }

    public boolean hasThrowable()
    {
        return isOnError() && throwable != null;
    }

    public boolean hasValue()
    {
        return isOnNext() && value != null;
    }

    public int hashCode()
    {
        int j = getKind().hashCode();
        int i = j;
        if (hasValue())
        {
            i = j * 31 + getValue().hashCode();
        }
        j = i;
        if (hasThrowable())
        {
            j = i * 31 + getThrowable().hashCode();
        }
        return j;
    }

    public boolean isOnCompleted()
    {
        return getKind() == Kind.OnCompleted;
    }

    public boolean isOnError()
    {
        return getKind() == Kind.OnError;
    }

    public boolean isOnNext()
    {
        return getKind() == Kind.OnNext;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("[")).append(super.toString()).append(" ").append(getKind());
        if (hasValue())
        {
            stringbuilder.append(" ").append(getValue());
        }
        if (hasThrowable())
        {
            stringbuilder.append(" ").append(getThrowable().getMessage());
        }
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    static 
    {
        ON_COMPLETED = new Notification(Kind.OnCompleted, null, null);
    }

    private class Kind extends Enum
    {

        private static final Kind $VALUES[];
        public static final Kind OnCompleted;
        public static final Kind OnError;
        public static final Kind OnNext;

        public static Kind valueOf(String s)
        {
            return (Kind)Enum.valueOf(rx/Notification$Kind, s);
        }

        public static Kind[] values()
        {
            return (Kind[])$VALUES.clone();
        }

        static 
        {
            OnNext = new Kind("OnNext", 0);
            OnError = new Kind("OnError", 1);
            OnCompleted = new Kind("OnCompleted", 2);
            $VALUES = (new Kind[] {
                OnNext, OnError, OnCompleted
            });
        }

        private Kind(String s, int i)
        {
            super(s, i);
        }
    }

}
