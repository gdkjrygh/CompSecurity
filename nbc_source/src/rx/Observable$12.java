// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import rx.functions.Func1;

// Referenced classes of package rx:
//            Observable

class <init>
    implements Func1
{

    final Observable this$0;
    final Class val$klass;

    public final Boolean call(Object obj)
    {
        return Boolean.valueOf(val$klass.isInstance(obj));
    }

    public volatile Object call(Object obj)
    {
        return call(obj);
    }

    ()
    {
        this$0 = final_observable;
        val$klass = Class.this;
        super();
    }
}
