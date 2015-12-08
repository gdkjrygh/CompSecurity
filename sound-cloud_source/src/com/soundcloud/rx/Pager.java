// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.rx;

import rx.X;
import rx.Y;
import rx.b;
import rx.g.c;
import rx.h.f;
import rx.internal.util.q;

public class Pager
{
    private final class PageSubscriber extends X
    {

        private final X inner;
        final Pager this$0;

        public final void onCompleted()
        {
            inner.onCompleted();
        }

        public final void onError(Throwable throwable)
        {
            inner.onError(throwable);
        }

        public final void onNext(Object obj)
        {
            nextPage = (b)pagingFunction.call(obj);
            inner.onNext(pageTransformer.call(obj));
            if (nextPage == Pager.FINISH_SEQUENCE)
            {
                pages.onCompleted();
            }
        }

        public PageSubscriber(X x)
        {
            this$0 = Pager.this;
            super();
            inner = x;
        }
    }

    public static interface PagingFunction
        extends rx.b.f
    {
    }


    private static final b FINISH_SEQUENCE = b.never();
    private b nextPage;
    private final rx.b.f pageTransformer;
    private c pages;
    private final PagingFunction pagingFunction;
    private Y subscription;

    Pager(PagingFunction pagingfunction, rx.b.f f1)
    {
        nextPage = finish();
        subscription = f.a();
        pagingFunction = pagingfunction;
        pageTransformer = f1;
    }

    public static Pager create(PagingFunction pagingfunction)
    {
        return new Pager(pagingfunction, q.b());
    }

    public static Pager create(PagingFunction pagingfunction, rx.b.f f1)
    {
        return new Pager(pagingfunction, f1);
    }

    public static b finish()
    {
        return FINISH_SEQUENCE;
    }

    public b currentPage()
    {
        return page(nextPage);
    }

    public boolean hasNext()
    {
        return nextPage != FINISH_SEQUENCE;
    }

    public void next()
    {
        if (!subscription.isUnsubscribed() && hasNext())
        {
            pages.onNext(nextPage);
        }
    }

    public b page(final b source)
    {
        return b.create(new _cls1());
    }




/*
    static c access$002(Pager pager, c c1)
    {
        pager.pages = c1;
        return c1;
    }

*/



/*
    static Y access$102(Pager pager, Y y)
    {
        pager.subscription = y;
        return y;
    }

*/



/*
    static b access$202(Pager pager, b b1)
    {
        pager.nextPage = b1;
        return b1;
    }

*/




    private class _cls1
        implements rx.b.f
    {

        final Pager this$0;
        final b val$source;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            pages = c.a();
            subscription = b.switchOnNext(pages).subscribe(new PageSubscriber(x));
            x.add(subscription);
            pages.onNext(source);
        }

        _cls1()
        {
            this$0 = Pager.this;
            source = b1;
            super();
        }
    }

}
