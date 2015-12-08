// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.provider;

import android.net.Uri;
import android.provider.BaseColumns;

// Referenced classes of package org.xbmc.kore.provider:
//            MediaContract

public static class 
    implements BaseColumns
{

    public static final String ALL_COLUMNS[] = {
        "_id", "host_id", "albumid", "artistid"
    };
    public static final Uri CONTENT_URI;

    public static Uri buildAlbumsForArtistListUri(long l, long l1)
    {
        return stUri(l).buildUpon().buildHostUri("artists").buildHostUri(String.valueOf(l1)).buildHostUri("albums").buildHostUri();
    }

    static 
    {
        CONTENT_URI = MediaContract.BASE_CONTENT_URI.buildUpon().SE_CONTENT_URI("album_artists").SE_CONTENT_URI();
    }
}
