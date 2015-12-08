// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subjects;

import rx.functions.Action1;

// Referenced classes of package rx.subjects:
//            ReplaySubject

static final class val.state
    implements Action1
{

    final undedState val$state;

    public volatile void call(Object obj)
    {
        call((ionManager.SubjectObserver)obj);
    }

    public void call(ionManager.SubjectObserver subjectobserver)
    {
        subjectobserver;
        JVM INSTR monitorenter ;
        if (subjectobserver.first && !subjectobserver.emitting)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        subjectobserver;
        JVM INSTR monitorexit ;
        return;
        subjectobserver.first = false;
        subjectobserver.emitting = true;
        subjectobserver;
        JVM INSTR monitorexit ;
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag1 = false;
_L2:
        boolean flag = flag2;
        deList.Node node = (deList.Node)subjectobserver.index();
        flag = flag2;
        deList.Node node1 = val$state.tail();
        if (node == node1)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        flag = flag2;
        subjectobserver.index(val$state.replayObserverFromIndex(node, subjectobserver));
        flag = flag2;
        subjectobserver;
        JVM INSTR monitorenter ;
        flag = flag1;
        if (node1 != val$state.tail())
        {
            break MISSING_BLOCK_LABEL_142;
        }
        flag = flag1;
        subjectobserver.emitting = false;
        flag = true;
        subjectobserver;
        JVM INSTR monitorexit ;
        if (true)
        {
            break; /* Loop/switch isn't completed */
        }
        subjectobserver;
        JVM INSTR monitorenter ;
        subjectobserver.emitting = false;
        subjectobserver;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        subjectobserver;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        subjectobserver;
        JVM INSTR monitorexit ;
        throw exception;
        flag = flag1;
        subjectobserver;
        JVM INSTR monitorexit ;
        if (true) goto _L2; else goto _L1
        exception;
        subjectobserver;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        if (flag) goto _L4; else goto _L3
_L3:
        subjectobserver;
        JVM INSTR monitorenter ;
        subjectobserver.emitting = false;
        subjectobserver;
        JVM INSTR monitorexit ;
_L4:
        throw exception;
        exception;
        subjectobserver;
        JVM INSTR monitorexit ;
        throw exception;
_L1:
    }

    undedState(undedState undedstate)
    {
        val$state = undedstate;
        super();
    }
}
