// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.cast;

import com.google.android.gms.cast.m;
import com.soundcloud.android.model.Urn;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

class LocalPlayQueue
{

    public final Urn currentTrackUrn;
    public final m mediaInfo;
    public final List playQueueTrackUrns;
    public final JSONObject playQueueTracksJSON;

    public LocalPlayQueue(JSONObject jsonobject, List list, m m, Urn urn)
    {
        playQueueTracksJSON = jsonobject;
        playQueueTrackUrns = Collections.unmodifiableList(list);
        mediaInfo = m;
        currentTrackUrn = urn;
    }

    public static LocalPlayQueue empty()
    {
        return new LocalPlayQueue(null, Collections.emptyList(), null, Urn.NOT_SET);
    }

    public boolean isEmpty()
    {
        return playQueueTrackUrns.isEmpty();
    }
}
