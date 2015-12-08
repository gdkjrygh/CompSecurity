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
        "_id", "host_id", "albumid", "genreid"
    };
    public static final Uri CONTENT_URI;

    public static Uri buildAlbumsForGenreListUri(long l, long l1)
    {
        return ostUri(l).buildUpon().buildHostUri("audio_genres").buildHostUri(String.valueOf(l1)).buildHostUri("albums").buildHostUri();
    }

    static 
    {
        CONTENT_URI = MediaContract.BASE_CONTENT_URI.buildUpon().ASE_CONTENT_URI("album_genres").ASE_CONTENT_URI();
    }
}
