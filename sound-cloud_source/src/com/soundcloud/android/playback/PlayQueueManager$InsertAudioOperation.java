// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.PropertySet;

// Referenced classes of package com.soundcloud.android.playback:
//            PlayQueueManager, PlayQueue

public static class shouldPersist
    implements shouldPersist
{

    private final PropertySet metaData;
    private final int position;
    private final boolean shouldPersist;
    private final Urn trackUrn;

    public void execute(PlayQueue playqueue)
    {
        playqueue.insertTrack(position, trackUrn, metaData, shouldPersist);
    }

    public (int i, Urn urn, PropertySet propertyset, boolean flag)
    {
        position = i;
        trackUrn = urn;
        metaData = propertyset;
        shouldPersist = flag;
    }
}
