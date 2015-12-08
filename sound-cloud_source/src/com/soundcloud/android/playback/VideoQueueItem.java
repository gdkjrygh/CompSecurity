// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.java.collections.PropertySet;

// Referenced classes of package com.soundcloud.android.playback:
//            PlayQueueItem

public class VideoQueueItem extends PlayQueueItem
{

    public VideoQueueItem(PropertySet propertyset)
    {
        super.setMetaData(propertyset);
    }

    public PlayQueueItem.Kind getKind()
    {
        return PlayQueueItem.Kind.VIDEO;
    }

    public boolean shouldPersist()
    {
        return false;
    }
}
