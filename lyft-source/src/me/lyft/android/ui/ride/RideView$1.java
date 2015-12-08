// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ride;

import me.lyft.android.application.IUserProvider;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.User;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.ride:
//            RideView

class this._cls0
    implements Action1
{

    final RideView this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        RideView.access$000(RideView.this);
        if (userProvider.getUser().isInDriverMode())
        {
            RideView.access$100(RideView.this);
            return;
        } else
        {
            RideView.access$200(RideView.this);
            return;
        }
    }

    ovider()
    {
        this$0 = RideView.this;
        super();
    }
}
