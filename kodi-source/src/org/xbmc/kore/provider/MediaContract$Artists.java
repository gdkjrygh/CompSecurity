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
        "_id", "updated", "host_id", "artistid", "artist", "description", "genre", "fanart", "thumbnail"
    };
    public static final Uri CONTENT_URI;

    public static Uri buildArtistsListUri(long l)
    {
        return ildHostUri(l).buildUpon().("artists").();
    }

    public static String getArtistId(Uri uri)
    {
        return (String)uri.getPathSegments().get(3);
    }

    static 
    {
        CONTENT_URI = MediaContract.BASE_CONTENT_URI.buildUpon().("artists").();
    }
}
