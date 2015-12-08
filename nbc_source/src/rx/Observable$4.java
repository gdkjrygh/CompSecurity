// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import rx.functions.Action2;
import rx.functions.Func2;

// Referenced classes of package rx:
//            Observable

class 
    implements Func2
{

    final Observable this$0;
    final Action2 val$collector;

    public final Object call(Object obj, Object obj1)
    {
        val$collector.call(obj, obj1);
        return obj;
    }

    ion2()
    {
        this$0 = final_observable;
        val$collector = Action2.this;
        super();
    }
}
