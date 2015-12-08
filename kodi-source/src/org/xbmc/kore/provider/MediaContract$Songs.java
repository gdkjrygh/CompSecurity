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
        "_id", "updated", "host_id", "albumid", "songid", "duration", "thumbnail", "file", "track", "title"
    };
    public static final Uri CONTENT_URI;

    public static Uri buildSongsListUri(long l, long l1)
    {
        return .buildAlbumUri(l, l1).buildUpon().th("songs").th();
    }

    public static String getSongId(Uri uri)
    {
        return (String)uri.getPathSegments().get(5);
    }

    static 
    {
        CONTENT_URI = MediaContract.BASE_CONTENT_URI.buildUpon().th("songs").th();
    }
}
