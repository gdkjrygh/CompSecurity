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
        "_id", "updated", "host_id", "musicvideoid", "fanart", "thumbnail", "playcount", "title", "file", "plot", 
        "director", "runtime", "audio_channels", "audio_coded", "audio_language", "subtitles_languages", "video_aspect", "video_codec", "video_height", "video_width", 
        "album", "artist", "genre", "studio", "tag", "track", "year"
    };
    public static final Uri CONTENT_URI;

    public static Uri buildMusicVideoUri(long l, long l1)
    {
        return ostUri(l).buildUpon().buildHostUri("music_videos").buildHostUri(String.valueOf(l1)).buildHostUri();
    }

    public static Uri buildMusicVideosListUri(long l)
    {
        return ostUri(l).buildUpon().buildHostUri("music_videos").buildHostUri();
    }

    public static String getMusicVideoId(Uri uri)
    {
        return (String)uri.getPathSegments().get(3);
    }

    static 
    {
        CONTENT_URI = MediaContract.BASE_CONTENT_URI.buildUpon().ASE_CONTENT_URI("music_videos").ASE_CONTENT_URI();
    }
}
