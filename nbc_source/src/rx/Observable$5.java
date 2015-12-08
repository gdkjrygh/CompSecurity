// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import rx.functions.Func1;

// Referenced classes of package rx:
//            Observable

class 
    implements Func1
{

    final Observable this$0;
    final Object val$element;

    public final Boolean call(Object obj)
    {
        boolean flag;
        if (val$element == null)
        {
            if (obj == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = val$element.equals(obj);
        }
        return Boolean.valueOf(flag);
    }

    public volatile Object call(Object obj)
    {
        return call(obj);
    }

    ()
    {
        this$0 = final_observable;
        val$element = Object.this;
        super();
    }
}
