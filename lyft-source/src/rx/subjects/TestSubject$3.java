// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subjects;

import rx.functions.Action0;

// Referenced classes of package rx.subjects:
//            TestSubject

class val.e
    implements Action0
{

    final TestSubject this$0;
    final Throwable val$e;

    public void call()
    {
        TestSubject.access$100(TestSubject.this, val$e);
    }

    ()
    {
        this$0 = final_testsubject;
        val$e = Throwable.this;
        super();
    }
}
