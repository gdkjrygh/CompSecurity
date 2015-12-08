// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import rx.functions.Func0;
import rx.subjects.ReplaySubject;
import rx.subjects.Subject;

// Referenced classes of package rx:
//            Observable

class <init>
    implements Func0
{

    final Observable this$0;

    public volatile Object call()
    {
        return call();
    }

    public Subject call()
    {
        return ReplaySubject.create();
    }

    ct()
    {
        this$0 = Observable.this;
        super();
    }
}
