// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class euf
    implements mvi
{

    private final List a;
    private final noz b;
    private final Context c;

    public euf(Context context)
    {
        c = context;
        b = noz.a(context, 2, "database.Partition", new String[0]);
        context = olm.b(context);
        a = context.c(esq);
        ((fae)context.a(fae)).a();
    }

    public final String a()
    {
        return "Photos2DatabasePartition";
    }

    public final void a(SQLiteDatabase sqlitedatabase)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add("CREATE TABLE media (_id INTEGER PRIMARY KEY AUTOINCREMENT, dedup_key TEXT UNIQUE NOT NULL, utc_timestamp INTEGER NOT NULL, timezone_offset INTEGER NOT NULL, capture_timestamp INTEGER NOT NULL, month_random_timestamp INTEGER NOT NULL DEFAULT 0, type TEXT NOT NULL, is_deleted INTEGER NOT NULL DEFAULT 0, has_local INTEGER NOT NULL DEFAULT 0, is_hidden INTEGER NOT NULL DEFAULT 0, has_storyboard INTEGER NOT NULL DEFAULT 0)");
        arraylist.add(euk.b());
        arraylist.add(etk.a());
        arraylist.add("CREATE TABLE collections(_id INTEGER PRIMARY KEY, collection_media_key STRING UNIQUE NOT NULL, collection_album_id INTEGER, cover_item_media_key STRING, start DATETIME, end DATETIME, title STRING, total_items INTEGER NOT NULL, type INTEGER NOT NULL, protobuf BLOB, is_hidden INTEGER NOT NULL DEFAULT 0, audience INTEGER NOT NULL DEFAULT 0, associated_envelope_media_key TEXT )");
        arraylist.add("CREATE TABLE search_results (_id INTEGER PRIMARY KEY, all_media_id INTEGER NOT NULL REFERENCES media(_id) ON DELETE CASCADE, dedup_key TEXT NOT NULL, capture_timestamp INTEGER NOT NULL, search_query TEXT NOT NULL, is_rejected INTEGER NOT NULL DEFAULT 0, date_header_start_timestamp INTEGER, UNIQUE (dedup_key, search_query))");
        arraylist.add("CREATE TABLE explore_suggestions (category INTEGER PRIMARY KEY NOT NULL, auto_complete_items_response BLOB NOT NULL)");
        arraylist.add("CREATE TABLE all_media_count (count INTEGER NOT NULL DEFAULT 0)");
        arraylist.add("CREATE TABLE chapters(_id INTEGER PRIMARY KEY, start_timestamp INTEGER NOT NULL, end_timestamp INTEGER NOT NULL, media_id INTEGER NOT NULL)");
        arraylist.add("CREATE TABLE partition_version (id INTEGER PRIMARY KEY, created_at_version INTEGER NOT NULL)");
        arraylist.add(ety.a());
        arraylist.add("CREATE TABLE album_enrichments (_id INTEGER PRIMARY KEY, enrichment_media_key STRING UNIQUE NOT NULL, collection_media_key STRING NOT NULL, position REAL NOT NULL, protobuf BLOB NOT NULL)");
        String s1;
        String s4;
        String s6;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); arraylist.add((new StringBuilder(String.valueOf(s1).length() + 59 + String.valueOf(s4).length() + String.valueOf(s6).length())).append("CREATE TABLE ").append(s1).append(" (").append(s4).append(" INTEGER UNIQUE NOT NULL, ").append(s6).append(" INTEGER NOT NULL)").toString()))
        {
            s1 = ((esq)iterator.next()).a;
            s4 = String.valueOf("start_time");
            s6 = String.valueOf("items_under_header");
        }

        Object obj = String.valueOf("CREATE TABLE shared_media(_id INTEGER PRIMARY KEY, dedup_key TEXT NOT NULL, remote_url STRING NOT NULL, media_key STRING UNIQUE NOT NULL, capture_timestamp INTEGER NOT NULL, type TEXT NOT NULL, state INTEGER NOT NULL DEFAULT ");
        int i = eun.a.c;
        String s2 = String.valueOf("photosphere");
        String s5 = String.valueOf("photo_id");
        String s7 = String.valueOf("collection_id");
        String s9 = String.valueOf("composition_type");
        String s11 = String.valueOf("caption");
        String s12 = String.valueOf("cluster_id");
        String s13 = String.valueOf("cluster_score");
        String s14 = String.valueOf("protobuf");
        String s15 = String.valueOf("width");
        String s16 = String.valueOf("height");
        String s17 = String.valueOf("size_bytes");
        String s18 = String.valueOf("timezone_offset");
        String s19 = String.valueOf("utc_timestamp");
        String s20 = String.valueOf("duration");
        String s21 = String.valueOf("filename");
        String s22 = String.valueOf("iso");
        String s23 = String.valueOf("exposure");
        String s24 = String.valueOf("camera_make");
        String s25 = String.valueOf("camera_model");
        String s26 = String.valueOf("lens");
        String s27 = String.valueOf("focal_length");
        String s28 = String.valueOf("f_stop");
        String s29 = String.valueOf("latitude");
        String s30 = String.valueOf("is_edited");
        String s31 = String.valueOf("longitude");
        String s32 = String.valueOf("is_hidden");
        String s33 = String.valueOf("is_shared");
        String s34 = String.valueOf("is_from_drive");
        String s35 = String.valueOf("has_storyboard");
        String s36 = String.valueOf("position");
        String s37 = String.valueOf("owner_media_key");
        String s38 = String.valueOf("write_time_ms");
        arraylist.add((new StringBuilder(String.valueOf(obj).length() + 401 + String.valueOf(s2).length() + String.valueOf(s5).length() + String.valueOf(s7).length() + String.valueOf(s9).length() + String.valueOf(s11).length() + String.valueOf(s12).length() + String.valueOf(s13).length() + String.valueOf(s14).length() + String.valueOf(s15).length() + String.valueOf(s16).length() + String.valueOf(s17).length() + String.valueOf(s18).length() + String.valueOf(s19).length() + String.valueOf(s20).length() + String.valueOf(s21).length() + String.valueOf(s22).length() + String.valueOf(s23).length() + String.valueOf(s24).length() + String.valueOf(s25).length() + String.valueOf(s26).length() + String.valueOf(s27).length() + String.valueOf(s28).length() + String.valueOf(s29).length() + String.valueOf(s30).length() + String.valueOf(s31).length() + String.valueOf(s32).length() + String.valueOf(s33).length() + String.valueOf(s34).length() + String.valueOf(s35).length() + String.valueOf(s36).length() + String.valueOf(s37).length() + String.valueOf(s38).length())).append(((String) (obj))).append(i).append(", ").append(s2).append(" INTEGER, ").append(s5).append(" INTEGER, ").append(s7).append(" STRING, ").append(s9).append(" INTEGER, ").append(s11).append(" TEXT, ").append(s12).append(" TEXT, ").append(s13).append(" REAL, ").append(s14).append(" BLOB, ").append(s15).append(" INTEGER, ").append(s16).append(" INTEGER, ").append(s17).append(" INTEGER NOT NULL, ").append(s18).append(" INTEGER NOT NULL, ").append(s19).append(" INTEGER NOT NULL, ").append(s20).append(" INTEGER, ").append(s21).append(" TEXT, ").append(s22).append(" INTEGER, ").append(s23).append(" REAL, ").append(s24).append(" TEXT, ").append(s25).append(" TEXT, ").append(s26).append(" TEXT, ").append(s27).append(" INTEGER, ").append(s28).append(" REAL, ").append(s29).append(" REAL, ").append(s30).append(" INTEGER, ").append(s31).append(" REAL, ").append(s32).append(" INTEGER NOT NULL DEFAULT 0, ").append(s33).append(" INTEGER NOT NULL DEFAULT 0, ").append(s34).append(" INTEGER NOT NULL DEFAULT 0, ").append(s35).append(" INTEGER NOT NULL DEFAULT 0, ").append(s36).append(" REAL, ").append(s37).append(" TEXT NOT NULL, ").append(s38).append(" INTEGER)").toString());
        arraylist.add("CREATE TABLE envelopes (media_key TEXT PRIMARY KEY NOT NULL, title TEXT, auth_key TEXT, short_url TEXT, is_pinned INTEGER NOT NULL DEFAULT 0, is_joined INTEGER NOT NULL DEFAULT 0, is_collaborative INTEGER NOT NULL DEFAULT 0, can_add_content INTEGER NOT NULL DEFAULT 0, cover_item_media_key TEXT, current_sync_token TEXT, next_sync_token TEXT, resume_token TEXT, owner_actor_id TEXT NOT NULL, start_time_ms DATETIME, end_time_ms DATETIME, created_time_ms DATETIME, write_time_ms INTEGER, protobuf BLOB, total_item_count INTEGER NOT NULL, total_recipient_count INTEGER NOT NULL)");
        arraylist.add("CREATE TABLE external_deleted_media (local_dedup_key TEXT PRIMARY KEY NOT NULL, entry_timestamp INTEGER NOT NULL )");
        arraylist.add("CREATE TABLE envelope_members (envelope_media_key TEXT NOT NULL, actor_id TEXT NOT NULL, is_owner INTEGER NOT NULL DEFAULT 0, write_time_ms INTEGER, PRIMARY KEY (envelope_media_key, actor_id))");
        arraylist.add("CREATE TABLE actors (media_key TEXT PRIMARY KEY NOT NULL, gaia_id TEXT UNIQUE, display_name TEXT, profile_photo_url TEXT)");
        arraylist.add("CREATE INDEX main_local_media_idx ON local_media(dedup_key, content_uri)");
        arraylist.add("CREATE INDEX main_remote_media_idx ON remote_media(dedup_key, remote_url)");
        arraylist.add("CREATE INDEX media_deleted_timestamp_idx ON media (is_deleted, capture_timestamp, _id, is_hidden)");
        arraylist.add("CREATE UNIQUE INDEX main_search_media_idx ON search_results(search_query, dedup_key, is_rejected)");
        arraylist.add("CREATE INDEX resolve_remote_media_idx ON remote_media(dedup_key, photo_id, media_key)");
        arraylist.add("CREATE INDEX remote_media_collection_idx ON remote_media(collection_id)");
        arraylist.add("CREATE INDEX content_uri_local_media_idx ON local_media(content_uri)");
        arraylist.add("CREATE INDEX remote_composition_type_dedup_key_idx ON remote_media(composition_type, dedup_key)");
        arraylist.add("CREATE INDEX chapters_start_end_media_idx ON chapters (start_timestamp, end_timestamp, media_id)");
        arraylist.add("CREATE INDEX photo_id_remote_media_idx ON remote_media(photo_id, media_key)");
        arraylist.add("CREATE INDEX month_random_timestamp_idx ON media (is_hidden, is_deleted, month_random_timestamp)");
        String s3;
        Object obj1;
        String s8;
        String s10;
        for (obj = a.iterator(); ((Iterator) (obj)).hasNext(); arraylist.add((new StringBuilder(String.valueOf(s3).length() + 22 + String.valueOf(obj1).length() + String.valueOf(s8).length() + String.valueOf(s10).length())).append("CREATE INDEX ").append(s3).append(" ON ").append(((String) (obj1))).append(" (").append(s8).append(", ").append(s10).append(")").toString()))
        {
            obj1 = (esq)((Iterator) (obj)).next();
            s3 = ((esq) (obj1)).b;
            obj1 = ((esq) (obj1)).a;
            s8 = String.valueOf("start_time");
            s10 = String.valueOf("items_under_header");
        }

        arraylist.add("CREATE INDEX envelope_create_time_idx ON envelopes(created_time_ms DESC)");
        for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext(); sqlitedatabase.execSQL((String)((Iterator) (obj)).next())) { }
        obj = new ContentValues(2);
        ((ContentValues) (obj)).put("id", Integer.valueOf(1));
        ((ContentValues) (obj)).put("created_at_version", Integer.valueOf(71));
        long l = sqlitedatabase.insertOrThrow("partition_version", null, ((ContentValues) (obj)));
        if (l != 1L)
        {
            throw new IllegalStateException((new StringBuilder(65)).append("created at version insertion failed, row id: ").append(l).toString());
        }
        if (b.a())
        {
            for (sqlitedatabase = arraylist.iterator(); sqlitedatabase.hasNext(); noy.a("statement", (String)sqlitedatabase.next())) { }
        }
    }

    public final boolean a(SQLiteDatabase sqlitedatabase, int i, int j, int k)
    {
        Object obj;
        if (j < 44)
        {
            sqlitedatabase.delete("all_photos_local_sync", null, null);
            sqlitedatabase.delete("photo_requests", null, null);
            mvj.a(sqlitedatabase, new String[] {
                "collections"
            });
            mvj.b(sqlitedatabase, new String[] {
                "collection_covers", "search_results_media"
            });
            return false;
        }
        obj = olm.c(c, euh);
        Collections.sort(((List) (obj)), new eug(this));
        Iterator iterator;
        fan fan1;
        int l;
        boolean flag;
        if (((List) (obj)).isEmpty() || ((euh)((List) (obj)).get(((List) (obj)).size() - 1)).a() == 71)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "Last step must equal to the current version number.");
        obj = new fao(c, ((List) (obj)));
        iterator = ((fao) (obj)).b.iterator();
label0:
        do
        {
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                fan1 = (fan)iterator.next();
                l = fan1.a();
            } while (l <= j);
            if (l > k)
            {
                break label0;
            }
            try
            {
                fan1.a(sqlitedatabase);
            }
            // Misplaced declaration of an exception variable
            catch (SQLiteDatabase sqlitedatabase)
            {
                nlm.a(c, i);
                throw sqlitedatabase;
            }
        } while (true);
        if (((fao) (obj)).a.a())
        {
            sqlitedatabase = String.valueOf(sqlitedatabase.getPath());
            (new StringBuilder(String.valueOf(sqlitedatabase).length() + 57)).append("Successfully upgrade database").append(sqlitedatabase).append(" ").append(j).append(" --> ").append(k);
        }
        return true;
    }

    public final void b(SQLiteDatabase sqlitedatabase)
    {
        String s1 = String.valueOf("CREATE VIEW collection_covers AS SELECT ");
        String s2 = String.valueOf(s.b("_id"));
        String s3 = String.valueOf("_id");
        String s4 = String.valueOf(s.b("collection_media_key"));
        String s5 = String.valueOf("collection_media_key");
        String s6 = String.valueOf(s.b("collection_album_id"));
        String s7 = String.valueOf("collection_album_id");
        String s8 = String.valueOf(s.b("cover_item_media_key"));
        String s9 = String.valueOf("cover_item_media_key");
        String s10 = String.valueOf(s.b("start"));
        String s11 = String.valueOf("start");
        String s12 = String.valueOf(s.b("end"));
        String s13 = String.valueOf("end");
        String s14 = String.valueOf(s.b("title"));
        String s15 = String.valueOf("title");
        String s16 = String.valueOf(s.b("total_items"));
        String s17 = String.valueOf("total_items");
        String s18 = String.valueOf(s.b("type"));
        String s19 = String.valueOf("type");
        String s20 = String.valueOf(s.b("audience"));
        String s21 = String.valueOf("audience");
        String s22 = String.valueOf(s.b("is_hidden"));
        String s23 = String.valueOf("is_hidden");
        String s24 = String.valueOf(s.a("remote_url"));
        String s25 = String.valueOf("cover_url");
        String s26 = String.valueOf(s.a("width"));
        String s27 = String.valueOf("cover_width");
        String s28 = String.valueOf(s.a("height"));
        String s29 = String.valueOf("cover_height");
        String s30 = String.valueOf(s.a("duration"));
        String s31 = String.valueOf("duration");
        String s32 = String.valueOf("collections");
        String s33 = String.valueOf("remote_media");
        String s34 = String.valueOf("cover_item_media_key");
        String s35 = String.valueOf("media_key");
        sqlitedatabase.execSQL((new StringBuilder(String.valueOf(s1).length() + 114 + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length() + String.valueOf(s6).length() + String.valueOf(s7).length() + String.valueOf(s8).length() + String.valueOf(s9).length() + String.valueOf(s10).length() + String.valueOf(s11).length() + String.valueOf(s12).length() + String.valueOf(s13).length() + String.valueOf(s14).length() + String.valueOf(s15).length() + String.valueOf(s16).length() + String.valueOf(s17).length() + String.valueOf(s18).length() + String.valueOf(s19).length() + String.valueOf(s20).length() + String.valueOf(s21).length() + String.valueOf(s22).length() + String.valueOf(s23).length() + String.valueOf(s24).length() + String.valueOf(s25).length() + String.valueOf(s26).length() + String.valueOf(s27).length() + String.valueOf(s28).length() + String.valueOf(s29).length() + String.valueOf(s30).length() + String.valueOf(s31).length() + String.valueOf(s32).length() + String.valueOf(s33).length() + String.valueOf(s34).length() + String.valueOf(s35).length())).append(s1).append(s2).append(" AS ").append(s3).append(", ").append(s4).append(" AS ").append(s5).append(", ").append(s6).append(" AS ").append(s7).append(", ").append(s8).append(" AS ").append(s9).append(", ").append(s10).append(" AS ").append(s11).append(", ").append(s12).append(" AS ").append(s13).append(", ").append(s14).append(" AS ").append(s15).append(", ").append(s16).append(" AS ").append(s17).append(", ").append(s18).append(" AS ").append(s19).append(", ").append(s20).append(" AS ").append(s21).append(", ").append(s22).append(" AS ").append(s23).append(", ").append(s24).append(" AS ").append(s25).append(", ").append(s26).append(" AS ").append(s27).append(", ").append(s28).append(" AS ").append(s29).append(", ").append(s30).append(" AS ").append(s31).append(" FROM ").append(s32).append(" LEFT JOIN ").append(s33).append(" ON (").append(s34).append(" = ").append(s35).append(")").toString());
    }

    public final String[] b()
    {
        ArrayList arraylist = new ArrayList(Arrays.asList(new String[] {
            "media", "remote_media", "local_media", "collections", "search_results", "explore_suggestions", "all_media_count", "chapters", "partition_version", "metadata_sync", 
            "album_enrichments", "shared_media", "envelopes", "external_deleted_media", "envelope_members", "actors"
        }));
        for (Iterator iterator = a.iterator(); iterator.hasNext(); arraylist.add(((esq)iterator.next()).a)) { }
        return (String[])arraylist.toArray(new String[arraylist.size()]);
    }

    public final String[] c()
    {
        return (new String[] {
            "collection_covers"
        });
    }

    public final int d()
    {
        return 71;
    }
}
