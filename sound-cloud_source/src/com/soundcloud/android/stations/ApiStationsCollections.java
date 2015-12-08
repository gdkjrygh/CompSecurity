// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.api.model.ModelCollection;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.soundcloud.android.stations:
//            AutoValue_ApiStationsCollections

public abstract class ApiStationsCollections
{

    public ApiStationsCollections()
    {
    }

    public static ApiStationsCollections create(ModelCollection modelcollection, ModelCollection modelcollection1, ModelCollection modelcollection2, ModelCollection modelcollection3, ModelCollection modelcollection4)
    {
        return new AutoValue_ApiStationsCollections(getCollection(modelcollection), getCollection(modelcollection1), getCollection(modelcollection2), getCollection(modelcollection3), getCollection(modelcollection4));
    }

    private static List getCollection(ModelCollection modelcollection)
    {
        if (modelcollection == null)
        {
            return Collections.emptyList();
        } else
        {
            return modelcollection.getCollection();
        }
    }

    public abstract List getCuratorRecommendations();

    public abstract List getGenreRecommendations();

    public abstract List getRecents();

    public abstract List getSaved();

    public abstract List getTrackRecommendations();
}
