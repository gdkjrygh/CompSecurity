// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class euk
{

    public static final String a;

    public static String a()
    {
        String s = String.valueOf("SELECT _id AS _id, media_key AS collection_media_key, NULL AS collection_album_id, media_key AS cover_item_media_key, capture_timestamp AS start, capture_timestamp AS end, caption AS title, 1 AS total_items, ");
        String s1 = String.valueOf(String.valueOf(esm.d.f));
        String s2 = String.valueOf("type");
        String s3 = String.valueOf("remote_url");
        String s4 = String.valueOf("cover_url");
        String s5 = String.valueOf("width");
        String s6 = String.valueOf("cover_width");
        String s7 = String.valueOf("height");
        String s8 = String.valueOf("cover_height");
        String s9 = String.valueOf("duration");
        String s10 = String.valueOf("duration");
        String s11 = String.valueOf("audience");
        String s12 = String.valueOf("protobuf");
        String s13 = String.valueOf("remote_media");
        String s14 = String.valueOf("composition_type");
        String s15 = a;
        String s16 = String.valueOf("has_storyboard");
        String s17 = String.valueOf("dedup_key");
        return (new StringBuilder(String.valueOf(s).length() + 88 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length() + String.valueOf(s6).length() + String.valueOf(s7).length() + String.valueOf(s8).length() + String.valueOf(s9).length() + String.valueOf(s10).length() + String.valueOf(s11).length() + String.valueOf(s12).length() + String.valueOf(s13).length() + String.valueOf(s14).length() + String.valueOf(s15).length() + String.valueOf(s16).length() + String.valueOf(s17).length())).append(s).append(s1).append(" AS ").append(s2).append(", ").append(s3).append(" AS ").append(s4).append(", ").append(s5).append(" AS ").append(s6).append(", ").append(s7).append(" AS ").append(s8).append(", ").append(s9).append(" AS ").append(s10).append(", 0 AS ").append(s11).append(", ").append(s12).append(" FROM ").append(s13).append(" WHERE ").append(s14).append(" = 8").append(" AND ").append(s15).append(" AND ").append(s16).append(" = 1 GROUP BY ").append(s17).toString();
    }

    static String b()
    {
        String s = String.valueOf("CREATE TABLE remote_media(_id INTEGER PRIMARY KEY, dedup_key TEXT NOT NULL, remote_url STRING NOT NULL, media_key STRING UNIQUE NOT NULL, capture_timestamp INTEGER NOT NULL, type TEXT NOT NULL, state INTEGER NOT NULL DEFAULT ");
        int i = eun.a.c;
        String s1 = String.valueOf("photosphere");
        String s2 = String.valueOf("photo_id");
        String s3 = String.valueOf("collection_id");
        String s4 = String.valueOf("composition_type");
        String s5 = String.valueOf("caption");
        String s6 = String.valueOf("cluster_id");
        String s7 = String.valueOf("cluster_score");
        String s8 = String.valueOf("protobuf");
        String s9 = String.valueOf("width");
        String s10 = String.valueOf("height");
        String s11 = String.valueOf("size_bytes");
        String s12 = String.valueOf("timezone_offset");
        String s13 = String.valueOf("utc_timestamp");
        String s14 = String.valueOf("duration");
        String s15 = String.valueOf("filename");
        String s16 = String.valueOf("iso");
        String s17 = String.valueOf("exposure");
        String s18 = String.valueOf("camera_make");
        String s19 = String.valueOf("camera_model");
        String s20 = String.valueOf("lens");
        String s21 = String.valueOf("focal_length");
        String s22 = String.valueOf("f_stop");
        String s23 = String.valueOf("latitude");
        String s24 = String.valueOf("is_edited");
        String s25 = String.valueOf("longitude");
        String s26 = String.valueOf("is_hidden");
        String s27 = String.valueOf("is_shared");
        String s28 = String.valueOf("is_from_drive");
        String s29 = String.valueOf("has_storyboard");
        String s30 = String.valueOf("position");
        return (new StringBuilder(String.valueOf(s).length() + 375 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length() + String.valueOf(s6).length() + String.valueOf(s7).length() + String.valueOf(s8).length() + String.valueOf(s9).length() + String.valueOf(s10).length() + String.valueOf(s11).length() + String.valueOf(s12).length() + String.valueOf(s13).length() + String.valueOf(s14).length() + String.valueOf(s15).length() + String.valueOf(s16).length() + String.valueOf(s17).length() + String.valueOf(s18).length() + String.valueOf(s19).length() + String.valueOf(s20).length() + String.valueOf(s21).length() + String.valueOf(s22).length() + String.valueOf(s23).length() + String.valueOf(s24).length() + String.valueOf(s25).length() + String.valueOf(s26).length() + String.valueOf(s27).length() + String.valueOf(s28).length() + String.valueOf(s29).length() + String.valueOf(s30).length())).append(s).append(i).append(", ").append(s1).append(" INTEGER, ").append(s2).append(" INTEGER, ").append(s3).append(" STRING, ").append(s4).append(" INTEGER, ").append(s5).append(" TEXT, ").append(s6).append(" TEXT, ").append(s7).append(" REAL, ").append(s8).append(" BLOB, ").append(s9).append(" INTEGER, ").append(s10).append(" INTEGER, ").append(s11).append(" INTEGER NOT NULL, ").append(s12).append(" INTEGER NOT NULL, ").append(s13).append(" INTEGER NOT NULL, ").append(s14).append(" INTEGER, ").append(s15).append(" TEXT, ").append(s16).append(" INTEGER, ").append(s17).append(" REAL, ").append(s18).append(" TEXT, ").append(s19).append(" TEXT, ").append(s20).append(" TEXT, ").append(s21).append(" INTEGER, ").append(s22).append(" REAL, ").append(s23).append(" REAL, ").append(s24).append(" INTEGER, ").append(s25).append(" REAL, ").append(s26).append(" INTEGER NOT NULL DEFAULT 0, ").append(s27).append(" INTEGER NOT NULL DEFAULT 0, ").append(s28).append(" INTEGER NOT NULL DEFAULT 0, ").append(s29).append(" INTEGER NOT NULL DEFAULT 0, ").append(s30).append(" REAL)").toString();
    }

    static 
    {
        String s = String.valueOf("state = ");
        int i = eun.a.c;
        String s1 = String.valueOf("is_hidden = 0");
        a = (new StringBuilder(String.valueOf(s).length() + 16 + String.valueOf(s1).length())).append(s).append(i).append(" AND ").append(s1).toString();
        s = String.valueOf("state = ");
        i = eun.b.c;
        s1 = String.valueOf("is_hidden = 0");
        (new StringBuilder(String.valueOf(s).length() + 16 + String.valueOf(s1).length())).append(s).append(i).append(" AND ").append(s1);
    }
}
