// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subjects;

import rx.Scheduler;
import rx.functions.Action1;

// Referenced classes of package rx.subjects:
//            ReplaySubject

static final class scheduler
    implements Action1
{

    final Scheduler scheduler;
    final e state;

    public volatile void call(Object obj)
    {
        call((r.SubjectObserver)obj);
    }

    public void call(r.SubjectObserver subjectobserver)
    {
        de de;
        if (!state.terminated)
        {
            de = state.replayObserverFromIndexTest(state.head(), subjectobserver, scheduler.now());
        } else
        {
            de = state.replayObserverFromIndex(state.head(), subjectobserver);
        }
        subjectobserver.index(de);
    }

    public e(e e, Scheduler scheduler1)
    {
        state = e;
        scheduler = scheduler1;
    }
}
