// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import com.soundcloud.java.collections.PropertySet;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerPageData

final class VideoPageData extends PlayerPageData
{

    VideoPageData(int i, PropertySet propertyset)
    {
        super(PlayerPageData.Kind.VIDEO, i, propertyset);
    }

    public final String toString()
    {
        return (new StringBuilder("VideoPageData {positionInPlayQueue=")).append(positionInPlayQueue).append(", properties=").append(properties).append('}').toString();
    }
}
