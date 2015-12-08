// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.artist.model;

import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.artist.model:
//            ArtistModel

class totalCount
    implements JacksonModel
{

    public final List releases;
    public final int totalCount;

    public (List list, int i)
    {
        releases = ArtistModel.access$100(list);
        totalCount = i;
    }
}
