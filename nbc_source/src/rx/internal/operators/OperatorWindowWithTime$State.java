// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Observer;

// Referenced classes of package rx.internal.operators:
//            OperatorWindowWithTime

static final class count
{

    static final count EMPTY = new <init>(null, null, 0);
    final Observer consumer;
    final int count;
    final Observable producer;

    public static count empty()
    {
        return EMPTY;
    }

    public EMPTY clear()
    {
        return empty();
    }

    public empty create(Observer observer, Observable observable)
    {
        return new <init>(observer, observable, 0);
    }

    public <init> next()
    {
        return new <init>(consumer, producer, count + 1);
    }


    public (Observer observer, Observable observable, int i)
    {
        consumer = observer;
        producer = observable;
        count = i;
    }
}
