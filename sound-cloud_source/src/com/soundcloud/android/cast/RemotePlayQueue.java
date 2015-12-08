// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.cast;

import com.soundcloud.android.model.Urn;
import java.util.Collections;
import java.util.List;

public class RemotePlayQueue
{

    private final Urn currentTrackUrn;
    private final List trackList;

    public RemotePlayQueue(List list, Urn urn)
    {
        trackList = Collections.unmodifiableList(list);
        currentTrackUrn = urn;
    }

    public int getCurrentPosition()
    {
        return trackList.indexOf(currentTrackUrn);
    }

    public Urn getCurrentTrackUrn()
    {
        return currentTrackUrn;
    }

    public List getTrackList()
    {
        return trackList;
    }
}
