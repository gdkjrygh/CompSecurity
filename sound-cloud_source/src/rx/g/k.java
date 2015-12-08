// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.g;

import rx.d.d;

// Referenced classes of package rx.g:
//            m, l

public class k extends m
{

    private final d a;
    private final m b;

    public k(m m1)
    {
        super(new l(m1));
        b = m1;
        a = new d(m1);
    }

    public Throwable getThrowable()
    {
        return b.getThrowable();
    }

    public Object getValue()
    {
        return b.getValue();
    }

    public Object[] getValues()
    {
        return b.getValues();
    }

    public Object[] getValues(Object aobj[])
    {
        return b.getValues(aobj);
    }

    public boolean hasCompleted()
    {
        return b.hasCompleted();
    }

    public boolean hasObservers()
    {
        return b.hasObservers();
    }

    public boolean hasThrowable()
    {
        return b.hasThrowable();
    }

    public boolean hasValue()
    {
        return b.hasValue();
    }

    public void onCompleted()
    {
        a.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        a.onError(throwable);
    }

    public void onNext(Object obj)
    {
        a.onNext(obj);
    }
}
