// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.subjects.Subject;

// Referenced classes of package rx.internal.operators:
//            OperatorReplay

public static final class subject extends Subject
{

    final Subject subject;

    public boolean hasObservers()
    {
        return subject.hasObservers();
    }

    public void onCompleted()
    {
        subject.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        subject.onError(throwable);
    }

    public void onNext(Object obj)
    {
        subject.onNext(obj);
    }

    public _cls9(rx.lay.SubjectWrapper subjectwrapper, Subject subject1)
    {
        super(subjectwrapper);
        subject = subject1;
    }
}
