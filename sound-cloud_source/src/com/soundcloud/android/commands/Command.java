// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.commands;

import rx.b;
import rx.b.f;

public abstract class Command
{

    public Command()
    {
    }

    public abstract Object call(Object obj);

    public final rx.b.b toAction()
    {
        return new _cls2();
    }

    public final f toContinuation()
    {
        return new _cls3();
    }

    public b toObservable(final Object input)
    {
        return b.create(new _cls1());
    }

    private class _cls2
        implements rx.b.b
    {

        final Command this$0;

        public void call(Object obj)
        {
            Command.this.call(obj);
        }

        _cls2()
        {
            this$0 = Command.this;
            super();
        }
    }


    private class _cls3
        implements f
    {

        final Command this$0;

        public volatile Object call(Object obj)
        {
            return call(obj);
        }

        public b call(Object obj)
        {
            return toObservable(obj);
        }

        _cls3()
        {
            this$0 = Command.this;
            super();
        }
    }


    private class _cls1
        implements rx.b.f
    {

        final Command this$0;
        final Object val$input;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            try
            {
                x.onNext(Command.this.call(input));
                x.onCompleted();
                return;
            }
            catch (Throwable throwable)
            {
                x.onError(throwable);
            }
        }

        _cls1()
        {
            this$0 = Command.this;
            input = obj;
            super();
        }
    }

}
