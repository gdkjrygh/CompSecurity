// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subjects;

import rx.functions.Action1;

// Referenced classes of package rx.subjects:
//            ReplaySubject

final class val.state
    implements Action1
{

    final boundedReplayState val$state;

    public volatile void call(Object obj)
    {
        call((ionManager.SubjectObserver)obj);
    }

    public void call(ionManager.SubjectObserver subjectobserver)
    {
        subjectobserver.index(Integer.valueOf(val$state.replayObserverFromIndex(Integer.valueOf(0), subjectobserver).intValue()));
    }

    boundedReplayState()
    {
        val$state = boundedreplaystate;
        super();
    }
}
