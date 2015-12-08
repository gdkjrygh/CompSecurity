// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.provider;

import android.net.Uri;
import android.provider.BaseColumns;
import java.util.List;

// Referenced classes of package org.xbmc.kore.provider:
//            MediaContract

public static class 
    implements BaseColumns
{

    public static final String ALL_COLUMNS[] = {
        "_id", "updated", "host_id", "albumid", "fanart", "thumbnail", "displayartist", "rating", "title", "year", 
        "albumlabel", "description", "playcount", "genre"
    };
    public static final Uri CONTENT_URI;

    public static Uri buildAlbumUri(long l, long l1)
    {
        return uildHostUri(l).buildUpon().h("albums").h(String.valueOf(l1)).h();
    }

    public static Uri buildAlbumsListUri(long l)
    {
        return uildHostUri(l).buildUpon().h("albums").h();
    }

    public static String getAlbumId(Uri uri)
    {
        return (String)uri.getPathSegments().get(3);
    }

    static 
    {
        CONTENT_URI = MediaContract.BASE_CONTENT_URI.buildUpon().h("albums").h();
    }
}
