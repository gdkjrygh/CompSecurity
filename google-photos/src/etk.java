// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class etk
{

    public static final String a;

    static String a()
    {
        String s = String.valueOf("CREATE TABLE local_media (_id INTEGER PRIMARY KEY, dedup_key TEXT NOT NULL, content_uri TEXT UNIQUE NOT NULL, capture_timestamp INTEGER NOT NULL, type TEXT NOT NULL, state INTEGER NOT NULL DEFAULT ");
        int i = eun.a.c;
        String s1 = String.valueOf("photosphere");
        String s2 = String.valueOf("composition_type");
        String s3 = String.valueOf("auto_backup_state");
        int j = euu.a.g;
        String s4 = String.valueOf("auto_backup_timestamp");
        String s5 = String.valueOf("width");
        String s6 = String.valueOf("height");
        String s7 = String.valueOf("size_bytes");
        String s8 = String.valueOf("timezone_offset");
        String s9 = String.valueOf("utc_timestamp");
        String s10 = String.valueOf("duration");
        String s11 = String.valueOf("filename");
        String s12 = String.valueOf("filepath");
        String s13 = String.valueOf("iso");
        String s14 = String.valueOf("exposure");
        String s15 = String.valueOf("camera_make");
        String s16 = String.valueOf("camera_model");
        String s17 = String.valueOf("lens");
        String s18 = String.valueOf("focal_length");
        String s19 = String.valueOf("f_stop");
        String s20 = String.valueOf("latitude");
        String s21 = String.valueOf("longitude");
        String s22 = String.valueOf("signature");
        String s23 = String.valueOf("bucket_id");
        String s24 = String.valueOf("capture_frame_rate");
        String s25 = String.valueOf("encoded_frame_rate");
        return (new StringBuilder(String.valueOf(s).length() + 301 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length() + String.valueOf(s6).length() + String.valueOf(s7).length() + String.valueOf(s8).length() + String.valueOf(s9).length() + String.valueOf(s10).length() + String.valueOf(s11).length() + String.valueOf(s12).length() + String.valueOf(s13).length() + String.valueOf(s14).length() + String.valueOf(s15).length() + String.valueOf(s16).length() + String.valueOf(s17).length() + String.valueOf(s18).length() + String.valueOf(s19).length() + String.valueOf(s20).length() + String.valueOf(s21).length() + String.valueOf(s22).length() + String.valueOf(s23).length() + String.valueOf(s24).length() + String.valueOf(s25).length())).append(s).append(i).append(", ").append(s1).append(" INTEGER NOT NULL DEFAULT 0, ").append(s2).append(" INTEGER, ").append(s3).append(" INTEGER NOT NULL DEFAULT ").append(j).append(", ").append(s4).append(" INTEGER, ").append(s5).append(" INTEGER, ").append(s6).append(" INTEGER, ").append(s7).append(" INTEGER, ").append(s8).append(" INTEGER NOT NULL, ").append(s9).append(" INTEGER NOT NULL, ").append(s10).append(" INTEGER, ").append(s11).append(" TEXT, ").append(s12).append(" TEXT, ").append(s13).append(" INTEGER, ").append(s14).append(" REAL, ").append(s15).append(" TEXT, ").append(s16).append(" TEXT, ").append(s17).append(" TEXT, ").append(s18).append(" INTEGER, ").append(s19).append(" REAL, ").append(s20).append(" REAL, ").append(s21).append(" REAL, ").append(s22).append(" INTEGER, ").append(s23).append(" TEXT NOT NULL, ").append(s24).append(" REAL, ").append(s25).append(" REAL)").toString();
    }

    static 
    {
        String s = String.valueOf("state = ");
        int i = eun.a.c;
        (new StringBuilder(String.valueOf(s).length() + 11)).append(s).append(i);
        s = String.valueOf("state = ");
        i = eun.b.c;
        a = (new StringBuilder(String.valueOf(s).length() + 11)).append(s).append(i).toString();
    }
}
