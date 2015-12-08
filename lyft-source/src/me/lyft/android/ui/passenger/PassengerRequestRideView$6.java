// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import java.util.List;
import me.lyft.android.IUserSession;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import rx.functions.Func2;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRequestRideView

class this._cls0
    implements Func2
{

    final PassengerRequestRideView this$0;

    public Boolean call(List list, Boolean boolean1)
    {
        boolean flag = true;
        if (list.size() <= 1 || !boolean1.booleanValue() || !"passenger".equalsIgnoreCase(userSession.getUser().getMode()))
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public volatile Object call(Object obj, Object obj1)
    {
        return call((List)obj, (Boolean)obj1);
    }

    ()
    {
        this$0 = PassengerRequestRideView.this;
        super();
    }
}
