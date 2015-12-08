// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ride;

import me.lyft.android.application.IUserProvider;
import me.lyft.android.domain.User;
import me.lyft.android.rx.ReactiveProperty;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.ride:
//            RideView

class this._cls0
    implements Action1
{

    final RideView this$0;

    public volatile void call(Object obj)
    {
        call((User)obj);
    }

    public void call(User user)
    {
        RideView.access$300(RideView.this);
        RideView.access$400(RideView.this).onNext(Boolean.valueOf(user.isInDriverMode()));
        RideView.access$502(RideView.this, userProvider.getUser().getMode());
    }

    ovider()
    {
        this$0 = RideView.this;
        super();
    }
}
