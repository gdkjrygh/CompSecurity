// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subjects;

import rx.functions.Action0;

// Referenced classes of package rx.subjects:
//            SubjectSubscriptionManager

class bjectObserver
    implements Action0
{

    final SubjectSubscriptionManager this$0;
    final bjectObserver val$bo;

    public void call()
    {
        remove(val$bo);
    }

    bjectObserver()
    {
        this$0 = final_subjectsubscriptionmanager;
        val$bo = bjectObserver.this;
        super();
    }
}
