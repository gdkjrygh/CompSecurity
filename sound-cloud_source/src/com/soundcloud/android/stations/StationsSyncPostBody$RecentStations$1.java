// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.functions.Function;

// Referenced classes of package com.soundcloud.android.stations:
//            StationProperty

class this._cls0
    implements Function
{

    final apply this$0;

    public centStation apply(PropertySet propertyset)
    {
        return new centStation(this._cls0.this, (Urn)propertyset.get(StationProperty.URN), ((Long)propertyset.get(StationProperty.UPDATED_LOCALLY_AT)).longValue());
    }

    public volatile Object apply(Object obj)
    {
        return apply((PropertySet)obj);
    }

    centStation()
    {
        this$0 = this._cls0.this;
        super();
    }
}
