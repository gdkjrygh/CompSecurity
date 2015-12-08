// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ride;

import rx.functions.Func1;

// Referenced classes of package me.lyft.android.domain.ride:
//            Route, Stop

class this._cls0
    implements Func1
{

    final Route this$0;

    public Boolean call(Stop stop)
    {
        boolean flag;
        if (!stop.isCompleted())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public volatile Object call(Object obj)
    {
        return call((Stop)obj);
    }

    ()
    {
        this$0 = Route.this;
        super();
    }
}
