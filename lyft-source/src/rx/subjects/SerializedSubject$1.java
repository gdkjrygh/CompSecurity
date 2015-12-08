// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subjects;

import rx.Subscriber;

// Referenced classes of package rx.subjects:
//            SerializedSubject, Subject

class val.actual
    implements rx.be
{

    final Subject val$actual;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        val$actual.unsafeSubscribe(subscriber);
    }

    ()
    {
        val$actual = subject;
        super();
    }
}
