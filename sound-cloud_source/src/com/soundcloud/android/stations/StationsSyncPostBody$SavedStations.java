// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import java.util.Collections;
import java.util.List;

// Referenced classes of package com.soundcloud.android.stations:
//            StationsSyncPostBody

static class collection
{
    class SavedStation
    {

        final StationsSyncPostBody.SavedStations this$0;

        SavedStation()
        {
            this$0 = StationsSyncPostBody.SavedStations.this;
            super();
        }
    }


    private List collection;

    public List getCollection()
    {
        return collection;
    }

    SavedStation.this._cls0()
    {
        collection = Collections.emptyList();
    }
}
