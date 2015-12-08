// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Observer;

// Referenced classes of package rx.internal.operators:
//            OperatorWindowWithSize

static final class producer
{

    final Observer consumer;
    int count;
    final Observable producer;

    public A(Observer observer, Observable observable)
    {
        consumer = observer;
        producer = observable;
    }
}
