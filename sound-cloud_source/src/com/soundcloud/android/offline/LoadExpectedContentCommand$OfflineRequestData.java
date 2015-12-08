// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.model.Urn;

// Referenced classes of package com.soundcloud.android.offline:
//            LoadExpectedContentCommand

private static class playlist
{

    private final Urn creator;
    private final long duration;
    private final boolean isInLikes;
    private final Urn playlist;
    private final boolean syncable;
    private final Urn track;
    private final String waveformUrl;








    public (long l, long l1, long l2, String s, 
            boolean flag, Urn urn)
    {
        this(l, l1, l2, s, flag, false, urn);
    }

    public <init>(long l, long l1, long l2, String s, 
            boolean flag, boolean flag1)
    {
        this(l, l1, l2, s, flag, flag1, Urn.NOT_SET);
    }

    public <init>(long l, long l1, long l2, String s, 
            boolean flag, boolean flag1, Urn urn)
    {
        track = Urn.forTrack(l);
        creator = Urn.forUser(l1);
        duration = l2;
        waveformUrl = s;
        syncable = flag;
        isInLikes = flag1;
        playlist = urn;
    }
}
