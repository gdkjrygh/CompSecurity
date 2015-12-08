// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.model.PostProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.tracks.TrackProperty;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.objects.MoreObjects;

// Referenced classes of package com.soundcloud.android.playback:
//            PlayQueueItem

public class TrackQueueItem extends PlayQueueItem
{
    public static class Builder
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

        public Builder fromSource(String s, String s1)
        {
            source = s;
            sourceVersion = s1;
            return this;
        }

        public Builder persist(boolean flag)
        {
            shouldPersist = flag;
            return this;
        }

        public Builder relatedEntity(Urn urn)
        {
            relatedEntity = urn;
            return this;
        }

        public Builder withAdData(PropertySet propertyset)
        {
            adData = propertyset;
            return this;
        }

        public Builder(Urn urn)
        {
            this(urn, Urn.NOT_SET);
        }

        public Builder(Urn urn, Urn urn1)
        {
            source = "";
            sourceVersion = "";
            adData = PropertySet.create();
            relatedEntity = Urn.NOT_SET;
            shouldPersist = true;
            track = urn;
            reposter = urn1;
        }

        public Builder(PropertySet propertyset)
        {
            this((Urn)propertyset.get(TrackProperty.URN), (Urn)propertyset.getOrElse(PostProperty.REPOSTER_URN, Urn.NOT_SET));
        }
    }


    private final Urn relatedEntity;
    private final Urn reposter;
    private final boolean shouldPersist;
    private final String source;
    private final String sourceVersion;
    private final Urn trackUrn;

    private TrackQueueItem(Urn urn, Urn urn1, Urn urn2, String s, String s1, PropertySet propertyset, boolean flag)
    {
        trackUrn = urn;
        reposter = urn1;
        relatedEntity = urn2;
        source = s;
        sourceVersion = s1;
        shouldPersist = flag;
        super.setMetaData(propertyset);
    }

    TrackQueueItem(Urn urn, Urn urn1, Urn urn2, String s, String s1, PropertySet propertyset, boolean flag, 
            _cls1 _pcls1)
    {
        this(urn, urn1, urn2, s, s1, propertyset, flag);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (TrackQueueItem)obj;
            if (!MoreObjects.equal(trackUrn, ((TrackQueueItem) (obj)).trackUrn) || !MoreObjects.equal(source, ((TrackQueueItem) (obj)).source) || !MoreObjects.equal(sourceVersion, ((TrackQueueItem) (obj)).sourceVersion) || getKind() != ((TrackQueueItem) (obj)).getKind())
            {
                return false;
            }
        }
        return true;
    }

    public PlayQueueItem.Kind getKind()
    {
        return PlayQueueItem.Kind.TRACK;
    }

    public Urn getRelatedEntity()
    {
        return relatedEntity;
    }

    public Urn getReposter()
    {
        return reposter;
    }

    public String getSource()
    {
        return source;
    }

    public String getSourceVersion()
    {
        return sourceVersion;
    }

    public Urn getTrackUrn()
    {
        return trackUrn;
    }

    public int hashCode()
    {
        return MoreObjects.hashCode(new Object[] {
            trackUrn, source, sourceVersion
        });
    }

    public boolean shouldPersist()
    {
        return shouldPersist;
    }
}
