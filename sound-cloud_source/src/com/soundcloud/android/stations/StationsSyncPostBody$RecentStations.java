// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.api.ApiDateFormat;
import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.Lists;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.functions.Function;
import java.util.List;

// Referenced classes of package com.soundcloud.android.stations:
//            StationsSyncPostBody, StationProperty

static class toCollection
{
    class RecentStation
    {

        private final String lastPlayed;
        final StationsSyncPostBody.RecentStations this$0;
        private final String urn;

        public String getLastPlayed()
        {
            return lastPlayed;
        }

        public String getUrn()
        {
            return urn;
        }

        public RecentStation(Urn urn1, long l)
        {
            this$0 = StationsSyncPostBody.RecentStations.this;
            super();
            urn = urn1.toString();
            lastPlayed = ApiDateFormat.formatDate(l);
        }
    }


    private List collection;
    private final Function toCollection = new _cls1();

    public List getCollection()
    {
        return collection;
    }

    public _cls1.this._cls0(List list)
    {
        class _cls1
            implements Function
        {

            final StationsSyncPostBody.RecentStations this$0;

            public RecentStation apply(PropertySet propertyset)
            {
                return new RecentStation((Urn)propertyset.get(StationProperty.URN), ((Long)propertyset.get(StationProperty.UPDATED_LOCALLY_AT)).longValue());
            }

            public volatile Object apply(Object obj)
            {
                return apply((PropertySet)obj);
            }

            _cls1()
            {
                this$0 = StationsSyncPostBody.RecentStations.this;
                super();
            }
        }

        collection = Lists.transform(list, toCollection);
    }
}
