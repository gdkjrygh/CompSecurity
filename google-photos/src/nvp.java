// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.sqlite.SQLiteDatabase;

public final class nvp
    implements mvi
{

    public nvp()
    {
    }

    public final String a()
    {
        return "PhotosDbPartition";
    }

    public final void a(SQLiteDatabase sqlitedatabase)
    {
        boolean flag = false;
        for (int i = 0; i < 7; i++)
        {
            sqlitedatabase.execSQL((new String[] {
                "CREATE TABLE all_photos (_id INTEGER PRIMARY KEY AUTOINCREMENT, photo_id INTEGER, image_url TEXT, is_primary BOOLEAN DEFAULT '0', data BLOB, local_file_path TEXT, local_content_uri TEXT, fingerprint TEXT, timestamp INTEGER NOT NULL DEFAULT '0', media_attr INTEGER NOT NULL DEFAULT '0', user_actions INTEGER NOT NULL DEFAULT '0', has_edit_list BOOLEAN DEFAULT '0', signature TEXT);", "CREATE TABLE all_tiles (_id INTEGER PRIMARY KEY AUTOINCREMENT, view_id TEXT NOT NULL, view_order INTEGER NOT NULL, type INTEGER NOT NULL, cluster_id TEXT, tile_id TEXT NOT NULL, title TEXT, subtitle TEXT, image_url TEXT, background_color INTEGER, image_width INTEGER, image_height INTEGER, cluster_count INTEGER, comment_count INTEGER, plusone_count INTEGER, duration_days INTEGER, acl INTEGER, user_actions INTEGER NOT NULL DEFAULT '0', media_attr INTEGER NOT NULL DEFAULT '0', timestamp INTEGER NOT NULL DEFAULT '0', data BLOB, parent_id TEXT, photo_id INTEGER, owner_id TEXT, last_refresh_time INTEGER NOT NULL DEFAULT '0', equivalence_token TEXT, media_key TEXT, photographer_gaia_id TEXT, photographer_avatar_url TEXT, content_url TEXT);", "CREATE TABLE tile_requests (view_id TEXT NOT NULL, resume_token TEXT, last_refresh_time INTEGER NOT NULL DEFAULT '0', last_refresh_token TEXT );", "CREATE TABLE photo_comments (_id INTEGER PRIMARY KEY AUTOINCREMENT, tile_id TEXT NOT NULL, comment_id TEXT UNIQUE NOT NULL, author_id TEXT NOT NULL, content TEXT NOT NULL, view_order INT NOT NULL, update_time INT NOT NULL, plusone_count INT DEFAULT (0), plusone_by_viewer BOOLEAN DEFAULT '0', plusone_timestamp INT DEFAULT(0), flagged BOOLEAN NOT NULL DEFAULT(0));", "CREATE TABLE shared_collections (_id TEXT UNIQUE NOT NULL);", "CREATE TABLE all_photos_local_sync (media_store_uri TEXT UNIQUE NOT NULL, media_store_token TEXT);", "CREATE TABLE photo_requests (token TEXT, token_type INT NOT NULL);"
            })[i]);
        }

        for (int j = ((flag) ? 1 : 0); j < 9; j++)
        {
            sqlitedatabase.execSQL((new String[] {
                "CREATE INDEX tile_idx ON all_tiles( view_id, view_order, type, cluster_id, tile_id, title, subtitle, image_url, background_color, image_width, image_height, cluster_count, comment_count, plusone_count, duration_days, acl, user_actions, media_attr, timestamp, last_refresh_time, parent_id, photographer_gaia_id, photographer_avatar_url, content_url )", "CREATE INDEX tile_request_idx ON tile_requests( view_id )", "CREATE INDEX photo_comments_idx ON photo_comments( comment_id)", "CREATE INDEX all_photos_ui_idx ON all_photos(is_primary, timestamp, _id, local_content_uri)", "CREATE INDEX all_photos_photo_id_idx ON all_photos(photo_id)", "CREATE INDEX all_photos_is_primary_idx ON all_photos(is_primary, fingerprint, photo_id)", "CREATE INDEX all_photos_local_only_by_fingerprint_idx ON all_photos(fingerprint, photo_id)", "CREATE INDEX all_photos_local_only_by_content_uri_idx ON all_photos(local_content_uri, photo_id)", "CREATE INDEX all_photos_image_url_index ON all_photos(image_url)"
            })[j]);
        }

    }

    public final boolean a(SQLiteDatabase sqlitedatabase, int i, int j, int k)
    {
        return true;
    }

    public final void b(SQLiteDatabase sqlitedatabase)
    {
    }

    public final String[] b()
    {
        return (new String[] {
            "all_photos", "all_tiles", "tile_requests", "photo_comments", "shared_collections", "all_photos_local_sync", "photo_requests"
        });
    }

    public final String[] c()
    {
        return new String[0];
    }

    public final int d()
    {
        return 1;
    }
}
