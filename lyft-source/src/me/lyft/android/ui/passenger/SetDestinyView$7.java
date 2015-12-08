// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.res.Resources;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.location.Location;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.ReactiveProperty;

// Referenced classes of package me.lyft.android.ui.passenger:
//            SetDestinyView

class val.location extends AsyncCall
{

    final SetDestinyView this$0;
    final Location val$location;

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Location)obj);
    }

    public void onSuccess(Location location1)
    {
        super.onSuccess(location1);
        location1 = val$location.getDisplayName();
        if (!Strings.isNullOrEmpty(location1))
        {
            SetDestinyView.access$600(SetDestinyView.this).onNext(location1);
            return;
        } else
        {
            SetDestinyView.access$600(SetDestinyView.this).onNext(getResources().getString(0x7f070064));
            return;
        }
    }

    ()
    {
        this$0 = final_setdestinyview;
        val$location = Location.this;
        super();
    }
}
