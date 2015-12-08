// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.api.model.StationRecord;
import com.soundcloud.android.model.Urn;
import com.soundcloud.java.objects.MoreObjects;
import java.util.ArrayList;
import java.util.List;

class Station
    implements StationRecord
{

    private final int lastPosition;
    private final String permalink;
    private final String title;
    private final List tracks;
    private final String type;
    private final Urn urn;

    public Station(Urn urn1, String s, String s1, List list, String s2, Integer integer)
    {
        type = s1;
        tracks = list;
        urn = urn1;
        lastPosition = integer.intValue();
        title = s;
        permalink = s2;
    }

    static Station stationWithSeedTrack(StationRecord stationrecord, Urn urn1)
    {
        List list = stationrecord.getTracks();
        ArrayList arraylist = new ArrayList(list.size() + 1);
        arraylist.add(urn1);
        arraylist.addAll(list);
        return new Station(stationrecord.getUrn(), stationrecord.getTitle(), stationrecord.getType(), arraylist, stationrecord.getPermalink(), Integer.valueOf(stationrecord.getPreviousPosition()));
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Station)obj;
            if (!MoreObjects.equal(urn, ((Station) (obj)).urn) || !MoreObjects.equal(title, ((Station) (obj)).title) || !MoreObjects.equal(Integer.valueOf(lastPosition), Integer.valueOf(((Station) (obj)).lastPosition)) || !MoreObjects.equal(tracks, ((Station) (obj)).tracks))
            {
                return false;
            }
        }
        return true;
    }

    public String getPermalink()
    {
        return permalink;
    }

    public int getPreviousPosition()
    {
        return lastPosition;
    }

    public String getTitle()
    {
        return title;
    }

    public List getTracks()
    {
        return tracks;
    }

    public String getType()
    {
        return type;
    }

    public Urn getUrn()
    {
        return urn;
    }

    public int hashCode()
    {
        return MoreObjects.hashCode(new Object[] {
            urn, title, Integer.valueOf(lastPosition), tracks
        });
    }
}
