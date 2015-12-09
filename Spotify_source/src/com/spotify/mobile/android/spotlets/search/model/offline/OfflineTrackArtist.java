// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.search.model.offline;


// Referenced classes of package com.spotify.mobile.android.spotlets.search.model.offline:
//            OfflineSearchEntity

public final class OfflineTrackArtist extends OfflineSearchEntity
{

    public OfflineTrackArtist(String s, String s1, String s2)
    {
        super(s2, s, s1);
    }

    public final volatile String getImageUri()
    {
        return super.getImageUri();
    }

    public final volatile String getName()
    {
        return super.getName();
    }

    public final volatile String getUri()
    {
        return super.getUri();
    }

    public final String toString()
    {
        return getName();
    }
}
