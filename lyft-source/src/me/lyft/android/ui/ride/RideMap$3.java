// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ride;

import me.lyft.android.domain.location.Location;
import me.lyft.android.map.lyft.MapOwner;
import me.lyft.android.rx.AsyncCall;

// Referenced classes of package me.lyft.android.ui.ride:
//            RideMap

class > extends AsyncCall
{

    final RideMap this$0;
    final float val$zoom;

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Location)obj);
    }

    public void onSuccess(Location location)
    {
        RideMap.access$100(RideMap.this).centerWithPadding(location, val$zoom);
    }

    cation()
    {
        this$0 = final_ridemap;
        val$zoom = F.this;
        super();
    }
}
