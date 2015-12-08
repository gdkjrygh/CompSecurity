// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subjects;


// Referenced classes of package rx.subjects:
//            ReplaySubject

static interface .SubjectObserver
{

    public abstract void complete();

    public abstract void error(Throwable throwable);

    public abstract boolean isEmpty();

    public abstract Object latest();

    public abstract void next(Object obj);

    public abstract boolean replayObserver(.SubjectObserver subjectobserver);

    public abstract Object replayObserverFromIndex(Object obj, .SubjectObserver subjectobserver);

    public abstract Object replayObserverFromIndexTest(Object obj, .SubjectObserver subjectobserver, long l);

    public abstract int size();

    public abstract boolean terminated();

    public abstract Object[] toArray(Object aobj[]);
}
