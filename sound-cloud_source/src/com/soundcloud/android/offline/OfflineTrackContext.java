// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.model.Urn;
import java.util.List;

// Referenced classes of package com.soundcloud.android.offline:
//            AutoValue_OfflineTrackContext

public abstract class OfflineTrackContext
{

    public OfflineTrackContext()
    {
    }

    public static OfflineTrackContext create(Urn urn, Urn urn1, List list, boolean flag)
    {
        return new AutoValue_OfflineTrackContext(urn, urn1, list, flag);
    }

    public abstract Urn getCreator();

    public abstract List getPlaylists();

    public abstract Urn getTrack();

    public abstract boolean isLiked();
}
