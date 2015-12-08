// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ride;

import me.lyft.android.map.lyft.MapOwner;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.ride:
//            RideMap

class this._cls0
    implements Action1
{

    final RideMap this$0;

    public void call(Integer integer)
    {
        RideMap.access$100(RideMap.this).setTopPadding(integer.intValue());
    }

    public volatile void call(Object obj)
    {
        call((Integer)obj);
    }

    ()
    {
        this$0 = RideMap.this;
        super();
    }
}
