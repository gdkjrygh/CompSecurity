// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ride;

import java.util.ArrayList;
import me.lyft.android.domain.geo.Leg;
import rx.functions.Func2;

// Referenced classes of package me.lyft.android.ui.ride:
//            RideMap

class this._cls0
    implements Func2
{

    final RideMap this$0;

    public volatile Object call(Object obj, Object obj1)
    {
        return call((ArrayList)obj, (Leg)obj1);
    }

    public ArrayList call(ArrayList arraylist, Leg leg)
    {
        arraylist.addAll(leg.getLocations());
        return arraylist;
    }

    ()
    {
        this$0 = RideMap.this;
        super();
    }
}
