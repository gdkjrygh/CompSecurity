// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subjects;

import rx.functions.Action1;

// Referenced classes of package rx.subjects:
//            ReplaySubject

static final class state
    implements Action1
{

    final SubjectObserver state;

    public volatile void call(Object obj)
    {
        call((SubjectObserver)obj);
    }

    public void call(SubjectObserver subjectobserver)
    {
        subjectobserver.index(state.replayObserverFromIndex(state.head(), subjectobserver));
    }

    public SubjectObserver(SubjectObserver subjectobserver)
    {
        state = subjectobserver;
    }
}
