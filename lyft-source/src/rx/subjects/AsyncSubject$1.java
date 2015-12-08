// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subjects;

import rx.functions.Action1;
import rx.internal.operators.NotificationLite;

// Referenced classes of package rx.subjects:
//            AsyncSubject, SubjectSubscriptionManager

final class val.state
    implements Action1
{

    final SubjectSubscriptionManager val$state;

    public volatile void call(Object obj)
    {
        call((tionManager.SubjectObserver)obj);
    }

    public void call(tionManager.SubjectObserver subjectobserver)
    {
        Object obj = val$state.get();
        NotificationLite notificationlite = val$state.nl;
        subjectobserver.accept(obj, notificationlite);
        if (obj == null || !notificationlite.isCompleted(obj) && !notificationlite.isError(obj))
        {
            subjectobserver.onCompleted();
        }
    }

    tionManager()
    {
        val$state = subjectsubscriptionmanager;
        super();
    }
}
