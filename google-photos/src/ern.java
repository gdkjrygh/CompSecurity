// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ern extends Enum
{

    private static ern A;
    private static ern B;
    private static ern C;
    private static ern D;
    private static ern E;
    private static ern F;
    private static ern G;
    private static final ern I[];
    public static final ern a;
    public static final ern b;
    private static ern e;
    private static ern f;
    private static ern g;
    private static ern h;
    private static ern i;
    private static ern j;
    private static ern k;
    private static ern l;
    private static ern m;
    private static ern n;
    private static ern o;
    private static ern p;
    private static ern q;
    private static ern r;
    private static ern s;
    private static ern t;
    private static ern u;
    private static ern v;
    private static ern w;
    private static ern x;
    private static ern y;
    private static ern z;
    private final boolean H;
    final String c;
    final String d;

    private ern(String s1, int i1, String s2, String s3)
    {
        this(s1, i1, s2, s3, true);
    }

    private ern(String s1, int i1, String s2, String s3, String s4)
    {
        byte byte0;
        boolean flag;
        flag = false;
        byte0 = -1;
        s2.hashCode();
        JVM INSTR lookupswitch 3: default 44
    //                   103772132: 101
    //                   292617899: 116
    //                   1753822736: 131;
           goto _L1 _L2 _L3 _L4
_L1:
        byte0;
        JVM INSTR tableswitch 0 2: default 72
    //                   0 146
    //                   1 190
    //                   2 202;
           goto _L5 _L6 _L7 _L8
_L5:
        s1 = String.valueOf(s2);
        if (s1.length() != 0)
        {
            s1 = "Unknown table: ".concat(s1);
        } else
        {
            s1 = new String("Unknown table: ");
        }
        throw new IllegalArgumentException(s1);
_L2:
        if (s2.equals("media"))
        {
            byte0 = 0;
        }
          goto _L1
_L3:
        if (s2.equals("remote_media"))
        {
            byte0 = 1;
        }
          goto _L1
_L4:
        if (s2.equals("local_media"))
        {
            byte0 = 2;
        }
          goto _L1
_L6:
        s3 = b.b("media1", s3);
_L10:
        if ("local_media".equals(s2) || "remote_media".equals(s2))
        {
            flag = true;
        }
        this(s1, i1, s3, s4, flag);
        return;
_L7:
        s3 = b.b("remote_media", s3);
        continue; /* Loop/switch isn't completed */
_L8:
        s3 = b.b("local_media", s3);
        if (true) goto _L10; else goto _L9
_L9:
    }

    private ern(String s1, int i1, String s2, String s3, boolean flag)
    {
        super(s1, i1);
        c = s2;
        d = s3;
        H = flag;
    }

    static String a(ern ern1)
    {
        return ern1.d;
    }

    static boolean b(ern ern1)
    {
        return ern1.H;
    }

    public static ern valueOf(String s1)
    {
        return (ern)Enum.valueOf(ern, s1);
    }

    public static ern[] values()
    {
        return (ern[])I.clone();
    }

    static 
    {
        e = new ern("ID", 0, "media", "_id", "_id");
        f = new ern("TIMESTAMP", 1, "media", "capture_timestamp", "capture_timestamp");
        g = new ern("TYPE", 2, "media", "type", "type");
        h = new ern("DEDUP_KEY", 3, "media", "dedup_key", "dedup_key");
        String s1 = String.valueOf(b.b("remote_media", "photosphere"));
        String s2 = String.valueOf(b.b("local_media", "photosphere"));
        i = new ern("PHOTOSPHERE", 4, (new StringBuilder(String.valueOf(s1).length() + 12 + String.valueOf(s2).length())).append("COALESCE(").append(s1).append(", ").append(s2).append(")").toString(), "photosphere");
        s1 = String.valueOf(b.b("local_media", "duration"));
        s2 = String.valueOf(b.b("remote_media", "duration"));
        j = new ern("DURATION", 5, (new StringBuilder(String.valueOf(s1).length() + 12 + String.valueOf(s2).length())).append("COALESCE(").append(s1).append(", ").append(s2).append(")").toString(), "duration");
        k = new ern("AUTO_BACKUP_STATE", 6, "local_media", "auto_backup_state", "auto_backup_state");
        l = new ern("CONTENT_URI", 7, "local_media", "content_uri", "content_uri");
        m = new ern("SIGNATURE", 8, "local_media", "signature", "signature");
        a = new ern("REMOTE_STATE", 9, "remote_media", "state", "remote_state");
        b = new ern("LOCAL_STATE", 10, "local_media", "state", "local_state");
        s1 = String.valueOf(b.b("remote_media", "remote_url"));
        n = new ern("REMOTE_URL", 11, (new StringBuilder(String.valueOf(s1).length() + 5)).append("MAX(").append(s1).append(")").toString(), "remote_url");
        o = new ern("MEDIA_KEY", 12, "remote_media", "media_key", "media_key");
        p = new ern("PHOTO_ID", 13, "remote_media", "photo_id", "photo_id");
        s1 = String.valueOf(b.b("remote_media", "composition_type"));
        s2 = String.valueOf(b.b("local_media", "composition_type"));
        q = new ern("COMPOSITION_TYPE", 14, (new StringBuilder(String.valueOf(s1).length() + 12 + String.valueOf(s2).length())).append("COALESCE(").append(s1).append(", ").append(s2).append(")").toString(), "composition_type");
        r = new ern("CAPTION", 15, "remote_media", "caption", "caption");
        s = new ern("CLUSTER_ID", 16, "remote_media", "cluster_id", "cluster_id");
        t = new ern("CLUSTER_SCORE", 17, "remote_media", "cluster_score", "cluster_score");
        u = new ern("PROTOBUF", 18, "remote_media", "protobuf", "protobuf");
        v = new ern("IS_EDITED", 19, "remote_media", "is_edited", "is_edited");
        s1 = String.valueOf(b.b("remote_media", "is_from_drive"));
        w = new ern("IS_FROM_DRIVE", 20, (new StringBuilder(String.valueOf(s1).length() + 5)).append("MAX(").append(s1).append(")").toString(), "is_from_drive");
        s1 = String.valueOf(b.b("remote_media", "is_shared"));
        x = new ern("IS_SHARED", 21, (new StringBuilder(String.valueOf(s1).length() + 5)).append("MAX(").append(s1).append(")").toString(), "is_shared");
        s1 = String.valueOf(b.b("local_media", "size_bytes"));
        s2 = String.valueOf(b.b("remote_media", "size_bytes"));
        y = new ern("SIZE_BYTES", 22, (new StringBuilder(String.valueOf(s1).length() + 12 + String.valueOf(s2).length())).append("COALESCE(").append(s1).append(", ").append(s2).append(")").toString(), "byte_size");
        s1 = String.valueOf(b.b("local_media", "width"));
        s2 = String.valueOf(b.b("remote_media", "width"));
        z = new ern("WIDTH", 23, (new StringBuilder(String.valueOf(s1).length() + 12 + String.valueOf(s2).length())).append("COALESCE(").append(s1).append(", ").append(s2).append(")").toString(), "width");
        s1 = String.valueOf(b.b("local_media", "height"));
        s2 = String.valueOf(b.b("remote_media", "height"));
        A = new ern("HEIGHT", 24, (new StringBuilder(String.valueOf(s1).length() + 12 + String.valueOf(s2).length())).append("COALESCE(").append(s1).append(", ").append(s2).append(")").toString(), "height");
        s1 = String.valueOf(b.b("remote_media", "timezone_offset"));
        s2 = String.valueOf(b.b("local_media", "timezone_offset"));
        B = new ern("TIMEZONE_OFFSET", 25, (new StringBuilder(String.valueOf(s1).length() + 12 + String.valueOf(s2).length())).append("COALESCE(").append(s1).append(", ").append(s2).append(")").toString(), "timezone_offset");
        C = new ern("MONTH_RANDOM_TIMESTAMP", 26, "media", "month_random_timestamp", "month_random_timestamp");
        D = new ern("COLLECTION_ID", 27, "remote_media", "collection_id", "collection_id");
        E = new ern("CAPTURED_FRAME_RATE", 28, "local_media", "capture_frame_rate", "capture_frame_rate");
        F = new ern("ENCODED_FRAME_RATE", 29, "local_media", "encoded_frame_rate", "encoded_frame_rate");
        G = new ern("POSITION", 30, "remote_media", "position", "position");
        I = (new ern[] {
            e, f, g, h, i, j, k, l, m, a, 
            b, n, o, p, q, r, s, t, u, v, 
            w, x, y, z, A, B, C, D, E, F, 
            G
        });
    }
}
