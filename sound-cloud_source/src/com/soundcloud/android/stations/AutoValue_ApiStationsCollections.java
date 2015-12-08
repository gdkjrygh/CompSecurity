// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import java.util.List;

// Referenced classes of package com.soundcloud.android.stations:
//            ApiStationsCollections

final class AutoValue_ApiStationsCollections extends ApiStationsCollections
{

    private final List curatorRecommendations;
    private final List genreRecommendations;
    private final List recents;
    private final List saved;
    private final List trackRecommendations;

    AutoValue_ApiStationsCollections(List list, List list1, List list2, List list3, List list4)
    {
        if (list == null)
        {
            throw new NullPointerException("Null recents");
        }
        recents = list;
        if (list1 == null)
        {
            throw new NullPointerException("Null saved");
        }
        saved = list1;
        if (list2 == null)
        {
            throw new NullPointerException("Null trackRecommendations");
        }
        trackRecommendations = list2;
        if (list3 == null)
        {
            throw new NullPointerException("Null genreRecommendations");
        }
        genreRecommendations = list3;
        if (list4 == null)
        {
            throw new NullPointerException("Null curatorRecommendations");
        } else
        {
            curatorRecommendations = list4;
            return;
        }
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof ApiStationsCollections)
            {
                if (!recents.equals(((ApiStationsCollections) (obj = (ApiStationsCollections)obj)).getRecents()) || !saved.equals(((ApiStationsCollections) (obj)).getSaved()) || !trackRecommendations.equals(((ApiStationsCollections) (obj)).getTrackRecommendations()) || !genreRecommendations.equals(((ApiStationsCollections) (obj)).getGenreRecommendations()) || !curatorRecommendations.equals(((ApiStationsCollections) (obj)).getCuratorRecommendations()))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final List getCuratorRecommendations()
    {
        return curatorRecommendations;
    }

    public final List getGenreRecommendations()
    {
        return genreRecommendations;
    }

    public final List getRecents()
    {
        return recents;
    }

    public final List getSaved()
    {
        return saved;
    }

    public final List getTrackRecommendations()
    {
        return trackRecommendations;
    }

    public final int hashCode()
    {
        return ((((recents.hashCode() ^ 0xf4243) * 0xf4243 ^ saved.hashCode()) * 0xf4243 ^ trackRecommendations.hashCode()) * 0xf4243 ^ genreRecommendations.hashCode()) * 0xf4243 ^ curatorRecommendations.hashCode();
    }

    public final String toString()
    {
        return (new StringBuilder("ApiStationsCollections{recents=")).append(recents).append(", saved=").append(saved).append(", trackRecommendations=").append(trackRecommendations).append(", genreRecommendations=").append(genreRecommendations).append(", curatorRecommendations=").append(curatorRecommendations).append("}").toString();
    }
}
