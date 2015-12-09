// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import com.spotify.mobile.android.model.Artist;

public final class dnx
{

    public static final String a[] = {
        "_id", "name", "uri", "collection_uri", "collection_all_tracks_uri", "image_small_uri", "is_available", "is_radio_available", "albums_in_collection_count", "tracks_in_collection_count", 
        "is_playing", "is_paused", "offline_state", "sync_progress", "sort_name", "is_followed", "image_uri", "tracks_offlined_count"
    };

    public static Artist a(Cursor cursor)
    {
        return new Artist(cursor.getInt(0), cursor.getInt(12), cursor.getInt(13), cursor.getInt(8), cursor.getInt(9), cursor.getInt(17), gcw.a(cursor, 1, ""), gcw.a(cursor, 2, ""), gcw.a(cursor, 3, ""), gcw.a(cursor, 4, ""), gcw.a(cursor, 16, ""), gcw.a(cursor, 5, ""), gcw.a(cursor, 14, ""), gcw.a(cursor, 6), gcw.a(cursor, 7), gcw.a(cursor, 10), gcw.a(cursor, 11), gcw.a(cursor, 15));
    }

}
