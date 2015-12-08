// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.rx;

import java.util.Iterator;
import rx.P;
import rx.Y;
import rx.b;
import rx.h.f;

public final class RxUtils
{

    public static final rx.b.f IS_FALSE = new _cls2();
    public static final rx.b.f IS_TRUE = new _cls1();
    public static final rx.b.f TO_VOID = new _cls3();

    private RxUtils()
    {
    }

    public static rx.b.f continueWith(final b continuation)
    {
        return new _cls6();
    }

    public static rx.b.f emitCollectionItems()
    {
        return new _cls4();
    }

    public static void emitIterable(P p, Iterable iterable)
    {
        for (iterable = iterable.iterator(); iterable.hasNext(); p.onNext(iterable.next())) { }
    }

    public static rx.b.f filterEmptyLists()
    {
        return new _cls7();
    }

    public static Y invalidSubscription()
    {
        return f.b();
    }

    public static rx.b.f returning(final Object obj)
    {
        return new _cls5();
    }


    private class _cls6
        implements rx.b.f
    {

        final b val$continuation;

        public final volatile Object call(Object obj)
        {
            return call(obj);
        }

        public final b call(Object obj)
        {
            return continuation;
        }

        _cls6()
        {
            continuation = b;
            super();
        }
    }


    private class _cls4
        implements rx.b.f
    {

        public final volatile Object call(Object obj)
        {
            return call((Collection)obj);
        }

        public final b call(Collection collection)
        {
            return b.from(collection);
        }

        _cls4()
        {
        }
    }


    private class _cls7
        implements rx.b.f
    {

        public final Boolean call(List list)
        {
            boolean flag;
            if (!list.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        }

        public final volatile Object call(Object obj)
        {
            return call((List)obj);
        }

        _cls7()
        {
        }
    }


    private class _cls5
        implements rx.b.f
    {

        final Object val$obj;

        public final Object call(Object obj1)
        {
            return obj;
        }

        _cls5()
        {
            obj = obj1;
            super();
        }
    }


    private class _cls1
        implements rx.b.f
    {

        public final Boolean call(Boolean boolean1)
        {
            return boolean1;
        }

        public final volatile Object call(Object obj)
        {
            return call((Boolean)obj);
        }

        _cls1()
        {
        }
    }


    private class _cls2
        implements rx.b.f
    {

        public final Boolean call(Boolean boolean1)
        {
            boolean flag;
            if (!boolean1.booleanValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        }

        public final volatile Object call(Object obj)
        {
            return call((Boolean)obj);
        }

        _cls2()
        {
        }
    }


    private class _cls3
        implements rx.b.f
    {

        public final volatile Object call(Object obj)
        {
            return call(obj);
        }

        public final Void call(Object obj)
        {
            return null;
        }

        _cls3()
        {
        }
    }

}
