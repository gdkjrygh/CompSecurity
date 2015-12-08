// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.rx.eventbus;

import rx.X;
import rx.b.b;
import rx.g.a;
import rx.g.c;
import rx.g.m;

final class EventSubject extends m
{
    private static final class BehaviorSubjectOnSubscribe
        implements rx.b.f
    {

        private final a subject;

        public final volatile void call(Object obj)
        {
            call((X)obj);
        }

        public final void call(X x)
        {
            subject.subscribe(x);
        }


        BehaviorSubjectOnSubscribe(Object obj)
        {
            if (obj == null)
            {
                subject = a.a();
                return;
            } else
            {
                subject = a.a(obj);
                return;
            }
        }
    }

    private static final class DefaultErrorHandler
        implements b
    {

        public final volatile void call(Object obj)
        {
            call((Throwable)obj);
        }

        public final void call(Throwable throwable)
        {
            throwable.printStackTrace();
        }

        private DefaultErrorHandler()
        {
        }

        DefaultErrorHandler(_cls1 _pcls1)
        {
            this();
        }
    }

    private static final class PublishSubjectOnSubscribe
        implements rx.b.f
    {

        private final c subject;

        public final volatile void call(Object obj)
        {
            call((X)obj);
        }

        public final void call(X x)
        {
            subject.subscribe(x);
        }


        private PublishSubjectOnSubscribe()
        {
            subject = c.a();
        }

        PublishSubjectOnSubscribe(_cls1 _pcls1)
        {
            this();
        }
    }


    private final b onError;
    private final m wrappedSubject;

    EventSubject(rx.b.f f, m m1, b b1)
    {
        super(f);
        wrappedSubject = m1;
        if (b1 == null)
        {
            onError = new DefaultErrorHandler(null);
            return;
        } else
        {
            onError = b1;
            return;
        }
    }

    public static EventSubject create()
    {
        PublishSubjectOnSubscribe publishsubjectonsubscribe = new PublishSubjectOnSubscribe(null);
        return new EventSubject(publishsubjectonsubscribe, publishsubjectonsubscribe.subject, null);
    }

    public static EventSubject create(b b1)
    {
        PublishSubjectOnSubscribe publishsubjectonsubscribe = new PublishSubjectOnSubscribe(null);
        return new EventSubject(publishsubjectonsubscribe, publishsubjectonsubscribe.subject, b1);
    }

    public static EventSubject replaying()
    {
        BehaviorSubjectOnSubscribe behaviorsubjectonsubscribe = new BehaviorSubjectOnSubscribe(null);
        return new EventSubject(behaviorsubjectonsubscribe, behaviorsubjectonsubscribe.subject, null);
    }

    public static EventSubject replaying(Object obj, b b1)
    {
        obj = new BehaviorSubjectOnSubscribe(obj);
        return new EventSubject(((rx.b.f) (obj)), ((BehaviorSubjectOnSubscribe) (obj)).subject, b1);
    }

    public final boolean hasObservers()
    {
        return wrappedSubject.hasObservers();
    }

    public final void onCompleted()
    {
    }

    public final void onError(Throwable throwable)
    {
        onError.call(throwable);
    }

    public final void onNext(Object obj)
    {
        wrappedSubject.onNext(obj);
    }
}
