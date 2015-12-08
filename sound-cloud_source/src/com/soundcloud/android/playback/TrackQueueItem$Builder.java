// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.model.PostProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.tracks.TrackProperty;
import com.soundcloud.java.collections.PropertySet;

// Referenced classes of package com.soundcloud.android.playback:
//            TrackQueueItem

public static class <init>
{

    private PropertySet adData;
    private Urn relatedEntity;
    private final Urn reposter;
    private boolean shouldPersist;
    private String source;
    private String sourceVersion;
    private final Urn track;

    public TrackQueueItem build()
    {
        return new TrackQueueItem(track, reposter, relatedEntity, source, sourceVersion, adData, shouldPersist, null);
    }

    public shouldPersist fromSource(String s, String s1)
    {
        source = s;
        sourceVersion = s1;
        return this;
    }

    public sourceVersion persist(boolean flag)
    {
        shouldPersist = flag;
        return this;
    }

    public shouldPersist relatedEntity(Urn urn)
    {
        relatedEntity = urn;
        return this;
    }

    public relatedEntity withAdData(PropertySet propertyset)
    {
        adData = propertyset;
        return this;
    }

    public (Urn urn)
    {
        this(urn, Urn.NOT_SET);
    }

    public <init>(Urn urn, Urn urn1)
    {
        source = "";
        sourceVersion = "";
        adData = PropertySet.create();
        relatedEntity = Urn.NOT_SET;
        shouldPersist = true;
        track = urn;
        reposter = urn1;
    }

    public reposter(PropertySet propertyset)
    {
        this((Urn)propertyset.get(TrackProperty.URN), (Urn)propertyset.getOrElse(PostProperty.REPOSTER_URN, Urn.NOT_SET));
    }
}
