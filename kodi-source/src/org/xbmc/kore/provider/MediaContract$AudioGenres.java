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
        "_id", "updated", "host_id", "genreid", "thumbnail", "title"
    };
    public static final Uri CONTENT_URI;

    public static Uri buildAudioGenresListUri(long l)
    {
        return ostUri(l).buildUpon().buildHostUri("audio_genres").buildHostUri();
    }

    public static String getAudioGenreId(Uri uri)
    {
        return (String)uri.getPathSegments().get(3);
    }

    static 
    {
        CONTENT_URI = MediaContract.BASE_CONTENT_URI.buildUpon().ASE_CONTENT_URI("audio_genres").ASE_CONTENT_URI();
    }
}
