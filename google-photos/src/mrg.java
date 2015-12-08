// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class mrg
{

    static final String a;
    static final String b;
    static final String c[] = {
        "_id", "batch_id", "local_uri", "status", "update_time", "attempt_count", "photo_id", "media_key"
    };

    static String[] a(long l)
    {
        return (new String[] {
            Long.toString(l)
        });
    }

    static 
    {
        String s = String.valueOf("CREATE TABLE album_upload_media (_id INTEGER PRIMARY KEY AUTOINCREMENT, batch_id INTEGER NOT NULL, local_uri TEXT NOT NULL, status TEXT NOT NULL DEFAULT '");
        String s1 = String.valueOf(mqu.a.g);
        String s2 = String.valueOf("update_time");
        String s3 = String.valueOf("attempt_count");
        String s4 = String.valueOf("photo_id");
        String s5 = String.valueOf("media_key");
        a = (new StringBuilder(String.valueOf(s).length() + 105 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length())).append(s).append(s1).append("', ").append(s2).append(" INTEGER NOT NULL, ").append(s3).append(" INTEGER NOT NULL DEFAULT 0, ").append(s4).append(" TEXT NOT NULL DEFAULT '', ").append(s5).append(" TEXT NOT NULL DEFAULT '' )").toString();
        s = String.valueOf("status IN ('");
        s1 = String.valueOf(mqu.a.g);
        s2 = String.valueOf(mqu.d.g);
        b = (new StringBuilder(String.valueOf(s).length() + 6 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(s1).append("', '").append(s2).append("')").toString();
    }
}
