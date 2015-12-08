// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subjects;

import rx.functions.Action1;

// Referenced classes of package rx.subjects:
//            PublishSubject, SubjectSubscriptionManager

final class val.state
    implements Action1
{

    final SubjectSubscriptionManager val$state;

    public volatile void call(Object obj)
    {
        call((onManager.SubjectObserver)obj);
    }

    public void call(onManager.SubjectObserver subjectobserver)
    {
        subjectobserver.emitFirst(val$state.get(), val$state.nl);
    }

    onManager()
    {
        val$state = subjectsubscriptionmanager;
        super();
    }
}
