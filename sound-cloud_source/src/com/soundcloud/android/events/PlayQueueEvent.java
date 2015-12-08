// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import com.soundcloud.android.model.Urn;
import com.soundcloud.java.objects.MoreObjects;

public class PlayQueueEvent
{

    public static final int AUDIO_AD_REMOVED = 2;
    public static final int NEW_QUEUE = 0;
    public static final int QUEUE_UPDATE = 1;
    private final Urn collectionUrn;
    private final int kind;

    public PlayQueueEvent(int i, Urn urn)
    {
        kind = i;
        collectionUrn = urn;
    }

    public static PlayQueueEvent fromAudioAdRemoved(Urn urn)
    {
        return new PlayQueueEvent(2, urn);
    }

    public static PlayQueueEvent fromNewQueue(Urn urn)
    {
        return new PlayQueueEvent(0, urn);
    }

    public static PlayQueueEvent fromQueueUpdate(Urn urn)
    {
        return new PlayQueueEvent(1, urn);
    }

    private String getKindName()
    {
        switch (kind)
        {
        default:
            return "unknown";

        case 0: // '\0'
            return "NEW_QUEUE";

        case 1: // '\001'
            return "QUEUE_UPDATE";

        case 2: // '\002'
            return "AUDIO_AD_REMOVED";
        }
    }

    public boolean audioAdRemoved()
    {
        return kind == 2;
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof PlayQueueEvent) && ((PlayQueueEvent)obj).getKind() == kind;
    }

    public Urn getCollectionUrn()
    {
        return collectionUrn;
    }

    public int getKind()
    {
        return kind;
    }

    public int hashCode()
    {
        return kind;
    }

    public boolean isNewQueue()
    {
        return kind == 0;
    }

    public boolean isQueueUpdate()
    {
        return kind == 1;
    }

    public String toString()
    {
        return MoreObjects.toStringHelper(this).add("kind", getKindName()).toString();
    }
}
