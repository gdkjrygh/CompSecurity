// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.destination;

import me.lyft.android.domain.location.Location;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.ui.passenger.v2.destination:
//            SetDestinationPresenter

class this._cls0
    implements Func1
{

    final SetDestinationPresenter this$0;

    public Boolean call(Location location)
    {
        boolean flag;
        if (!location.isNull())
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
        return call((Location)obj);
    }

    ()
    {
        this$0 = SetDestinationPresenter.this;
        super();
    }
}
