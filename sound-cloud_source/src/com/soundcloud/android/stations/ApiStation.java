// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.api.model.ModelCollection;
import com.soundcloud.android.api.model.StationRecord;
import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.Lists;
import com.soundcloud.java.functions.Function;
import com.soundcloud.java.objects.MoreObjects;
import java.util.List;

// Referenced classes of package com.soundcloud.android.stations:
//            ApiStationMetadata, Stations

public final class ApiStation
    implements StationRecord
{

    private static final Function TO_URN = new _cls1();
    private final ApiStationMetadata metadata;
    private final List tracks;

    public ApiStation(ApiStationMetadata apistationmetadata, ModelCollection modelcollection)
    {
        metadata = apistationmetadata;
        tracks = modelcollection.getCollection();
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ApiStation)obj;
            if (!MoreObjects.equal(metadata, ((ApiStation) (obj)).metadata) || !MoreObjects.equal(tracks, ((ApiStation) (obj)).tracks))
            {
                return false;
            }
        }
        return true;
    }

    public final ApiStationMetadata getMetadata()
    {
        return metadata;
    }

    public final String getPermalink()
    {
        return metadata.getPermalink();
    }

    public final int getPreviousPosition()
    {
        return Stations.NEVER_PLAYED;
    }

    public final String getTitle()
    {
        return metadata.getTitle();
    }

    public final List getTrackRecords()
    {
        return tracks;
    }

    public final List getTracks()
    {
        return Lists.transform(tracks, TO_URN);
    }

    public final String getType()
    {
        return metadata.getType();
    }

    public final Urn getUrn()
    {
        return metadata.getUrn();
    }

    public final int hashCode()
    {
        return MoreObjects.hashCode(new Object[] {
            metadata, tracks
        });
    }


    private class _cls1
        implements Function
    {

        public final Urn apply(TrackRecord trackrecord)
        {
            return trackrecord.getUrn();
        }

        public final volatile Object apply(Object obj)
        {
            return apply((TrackRecord)obj);
        }

        _cls1()
        {
        }
    }

}
