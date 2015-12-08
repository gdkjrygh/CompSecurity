// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.java.collections.PropertySet;

// Referenced classes of package com.soundcloud.android.playback:
//            PlayQueueManager, PlayQueue

public static class metadata
    implements metadata
{

    private final PropertySet metadata;
    private final int position;

    public void execute(PlayQueue playqueue)
    {
        playqueue.setMetaData(position, metadata);
    }

    public (int i, PropertySet propertyset)
    {
        position = i;
        metadata = propertyset;
    }
}
