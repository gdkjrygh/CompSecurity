// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.api.ApiDateFormat;
import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.Lists;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.functions.Function;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.soundcloud.android.stations:
//            StationProperty

class StationsSyncPostBody
{
    static class RecentStations
    {

        private List collection;
        private final Function toCollection = new _cls1();

        public List getCollection()
        {
            return collection;
        }

        public RecentStations(List list)
        {
            class _cls1
                implements Function
            {

                final RecentStations this$0;

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
                    this$0 = RecentStations.this;
                    super();
                }
            }

            collection = Lists.transform(list, toCollection);
        }
    }

    class RecentStations.RecentStation
    {

        private final String lastPlayed;
        final RecentStations this$0;
        private final String urn;

        public String getLastPlayed()
        {
            return lastPlayed;
        }

        public String getUrn()
        {
            return urn;
        }

        public RecentStations.RecentStation(Urn urn1, long l)
        {
            this$0 = RecentStations.this;
            super();
            urn = urn1.toString();
            lastPlayed = ApiDateFormat.formatDate(l);
        }
    }

    static class SavedStations
    {

        private List collection;

        public List getCollection()
        {
            return collection;
        }

        SavedStations()
        {
            collection = Collections.emptyList();
        }
    }

    class SavedStations.SavedStation
    {

        final SavedStations this$0;

        SavedStations.SavedStation()
        {
            this$0 = SavedStations.this;
            super();
        }
    }


    private final RecentStations recent;
    private final SavedStations saved = new SavedStations();

    StationsSyncPostBody(List list)
    {
        recent = new RecentStations(list);
    }

    public RecentStations getRecent()
    {
        return recent;
    }

    public SavedStations getSaved()
    {
        return saved;
    }
}
