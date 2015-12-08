// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import java.util.Collections;
import java.util.List;
import rx.functions.Func2;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRequestRideView

class this._cls0
    implements Func2
{

    final PassengerRequestRideView this$0;

    public volatile Object call(Object obj, Object obj1)
    {
        return call((List)obj, (Boolean)obj1);
    }

    public List call(List list, Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            return list;
        } else
        {
            return Collections.emptyList();
        }
    }

    ()
    {
        this$0 = PassengerRequestRideView.this;
        super();
    }
}
