// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.l;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Environment;
import com.android.volley.p;
import com.android.volley.toolbox.n;
import com.kik.cache.ad;
import com.kik.cache.bb;
import com.kik.cache.s;
import com.kik.g.a;
import com.kik.g.f;
import com.kik.g.k;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import kik.a.d.a.g;
import kik.a.d.aa;
import kik.a.d.i;
import kik.a.d.o;
import kik.a.e.h;
import kik.a.e.q;
import kik.a.e.t;
import kik.a.e.v;
import kik.a.h.e;
import kik.android.chat.KikApplication;
import kik.android.util.aq;
import kik.android.util.ar;
import kik.android.util.bs;
import kik.android.util.d;
import kik.android.w;
import org.c.b;
import org.c.c;

// Referenced classes of package com.kik.l:
//            ab, f, an, p, 
//            al, u, ac, l, 
//            w, ae, aq, d, 
//            ap

public final class am
    implements ab, v
{
    private static final class a extends kik.android.h.i
    {

        static String a;
        static String b;

        private static void a(SQLiteDatabase sqlitedatabase)
        {
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS KIKcontactsTable (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid VARCHAR, display_name VARCHAR, local_name VARCHAR, user_name VARCHAR, in_roster BOOLEAN,photo_url VARCHAR, photo_timestamp VARCHAR, is_stub BOOLEAN,is_group BOOLEAN,is_blocked BOOLEAN,is_ignored BOOLEAN,pending_convo_clear BOOLEAN,pending_in_roster BOOLEAN,pending_is_blocked BOOLEAN,appear_in_convos_list BOOLEAN,roster_operation_attempts INT,verified BOOLEAN,public_key BLOB,is_public_key_resolved BOOLEAN,is_user_admin BOOLEAN,group_hashtag VARCHAR,is_user_removed BOOLEAN,content_links BLOB );");
            sqlitedatabase.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s (_id INTEGER PRIMARY KEY AUTOINCREMENT, %s VARCHAR, %s VARCHAR, %s LONG, %s VARCHAR, %s BOOLEAN);", new Object[] {
                "KikFriendAttributionTableName", "referrer_jid", "friend_attribute_type", "timestamp", "body", "reply"
            }));
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS messagesTable (_id INTEGER PRIMARY KEY AUTOINCREMENT, body VARCHAR, partner_jid VARCHAR, was_me INT, read_state INT, uid VARCHAR, length INTEGER, timestamp LONG, bin_id VARCHAR, sys_msg VARCHAR, stat_msg VARCHAR, stat_user_jid VARCHAR, stat_special_visibility BOOLEAN,req_read_reciept BOOLEAN, content_id VARCHAR, app_id VARCHAR, message_retry_count INT, encryption_failure BOOLEAN, render_instructions VARCHAR, friend_attr_id INT , encryption_key BLOB);");
            sqlitedatabase.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s (_id INTEGER PRIMARY KEY AUTOINCREMENT, %s VARCHAR, %s VARCHAR);", new Object[] {
                "suggestedResponseTable", "bin_id", "suggested_responses"
            }));
            sqlitedatabase.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s (_id INTEGER PRIMARY KEY AUTOINCREMENT, %s VARCHAR, %s BOOLEAN, %s LONG, %s BOOLEAN);", new Object[] {
                "KIKConversationStatusTable", "jid", "is_muted", "unmute_timestamp", "is_dirty"
            }));
            sqlitedatabase.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s (_id INTEGER PRIMARY KEY AUTOINCREMENT, %s VARCHAR, %s VARCHAR, %s BOOLEAN, %s BOOLEAN);", new Object[] {
                "memberTable", "group_id", "member_jid", "is_admin", "is_banned"
            }));
            sqlitedatabase.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s (_id INTEGER PRIMARY KEY AUTOINCREMENT, %s VARCHAR, %s INT, %s VARCHAR, %s VARCHAR);", new Object[] {
                "KIKContentTable", "content_id", "content_type", "content_name", "content_string"
            }));
            sqlitedatabase.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s (_id INTEGER PRIMARY KEY AUTOINCREMENT, %s VARCHAR, %s VARCHAR, %s VARCHAR, %s VARCHAR, %s VARCHAR, %s VARCHAR, %s VARCHAR);", new Object[] {
                "KIKContentURITable", "content_id", "priority", "platform", "content_uri", "type", "byline", "file_content_type"
            }));
            sqlitedatabase.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s (_id INTEGER PRIMARY KEY AUTOINCREMENT, content_id VARCHAR, retain_count INT);", new Object[] {
                "KIKContentRetainCountTable"
            }));
            sqlitedatabase.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s (_id INTEGER PRIMARY KEY AUTOINCREMENT, %s VARCHAR);", new Object[] {
                "chatMetaInfTable", "bin_id"
            }));
        }

        public final void a(SQLiteDatabase sqlitedatabase, int i1, int j1)
        {
            a(sqlitedatabase);
            Object obj = sqlitedatabase.query("KIKcontactsTable", null, null, null, null, null, null);
            a(((Cursor) (obj)), sqlitedatabase, "KIKcontactsTable", "photo_url");
            if (((Cursor) (obj)).getColumnIndex("photo_timestamp") == -1)
            {
                sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s VARCHAR DEFAULT %s", new Object[] {
                    "KIKcontactsTable", "photo_timestamp", "'0'"
                }));
            }
            a(((Cursor) (obj)), sqlitedatabase, "KIKcontactsTable", "is_group", "0");
            a(((Cursor) (obj)), sqlitedatabase, "KIKcontactsTable", "is_blocked", "0");
            a(((Cursor) (obj)), sqlitedatabase, "KIKcontactsTable", "pending_convo_clear", "0");
            a(((Cursor) (obj)), sqlitedatabase, "KIKcontactsTable", "is_ignored", "0");
            a(((Cursor) (obj)), sqlitedatabase, "KIKcontactsTable", "pending_in_roster", "0");
            a(((Cursor) (obj)), sqlitedatabase, "KIKcontactsTable", "pending_is_blocked", "0");
            a(((Cursor) (obj)), sqlitedatabase, "KIKcontactsTable", "appear_in_convos_list", "0");
            b(((Cursor) (obj)), sqlitedatabase, "KIKcontactsTable", "roster_operation_attempts", "0");
            a(((Cursor) (obj)), sqlitedatabase, "KIKcontactsTable", "verified", "0");
            b(((Cursor) (obj)), sqlitedatabase, "KIKcontactsTable", "public_key");
            a(((Cursor) (obj)), sqlitedatabase, "KIKcontactsTable", "is_public_key_resolved", "0");
            a(((Cursor) (obj)), sqlitedatabase, "KIKcontactsTable", "is_user_admin", "0");
            a(((Cursor) (obj)), sqlitedatabase, "KIKcontactsTable", "group_hashtag");
            a(((Cursor) (obj)), sqlitedatabase, "KIKcontactsTable", "is_user_removed", "0");
            b(((Cursor) (obj)), sqlitedatabase, "KIKcontactsTable", "content_links");
            ((Cursor) (obj)).close();
            if (i1 < 19)
            {
                sqlitedatabase.execSQL("UPDATE KIKcontactsTable SET pending_in_roster = in_roster");
                sqlitedatabase.execSQL("UPDATE KIKcontactsTable SET pending_is_blocked = is_blocked");
            }
            obj = sqlitedatabase.query("messagesTable", null, null, null, null, null, null);
            if (((Cursor) (obj)).getColumnIndex("bin_id") == -1)
            {
                sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN bin_id VARCHAR", new Object[] {
                    "messagesTable"
                }));
                sqlitedatabase.execSQL(String.format("UPDATE %s SET bin_id = partner_jid", new Object[] {
                    "messagesTable"
                }));
            }
            a(((Cursor) (obj)), sqlitedatabase, "messagesTable", "sys_msg");
            a(((Cursor) (obj)), sqlitedatabase, "messagesTable", "stat_msg");
            a(((Cursor) (obj)), sqlitedatabase, "messagesTable", "stat_user_jid");
            a(((Cursor) (obj)), sqlitedatabase, "messagesTable", "content_id", "0");
            a(((Cursor) (obj)), sqlitedatabase, "messagesTable", "content_id");
            a(((Cursor) (obj)), sqlitedatabase, "messagesTable", "app_id");
            b(((Cursor) (obj)), sqlitedatabase, "messagesTable", "app_id", "0");
            a(((Cursor) (obj)), sqlitedatabase, "messagesTable", "encryption_failure", "0");
            b(((Cursor) (obj)), sqlitedatabase, "messagesTable", "encryption_key");
            a(((Cursor) (obj)), sqlitedatabase, "messagesTable", "render_instructions");
            a(((Cursor) (obj)), sqlitedatabase, "messagesTable", "stat_special_visibility", "0");
            if (((Cursor) (obj)).getColumnIndex("friend_attr_id") == -1)
            {
                sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s INT", new Object[] {
                    "messagesTable", "friend_attr_id"
                }));
            }
            ((Cursor) (obj)).close();
            obj = sqlitedatabase.query("KikFriendAttributionTableName", null, null, null, null, null, null);
            a(((Cursor) (obj)), sqlitedatabase, "KikFriendAttributionTableName", "referrer_jid");
            a(((Cursor) (obj)), sqlitedatabase, "KikFriendAttributionTableName", "friend_attribute_type");
            c(((Cursor) (obj)), sqlitedatabase, "KikFriendAttributionTableName", "timestamp");
            a(((Cursor) (obj)), sqlitedatabase, "KikFriendAttributionTableName", "body");
            a(((Cursor) (obj)), sqlitedatabase, "KikFriendAttributionTableName", "reply", "0");
            ((Cursor) (obj)).close();
            obj = com.kik.l.ap.a(sqlitedatabase, com/kik/l/ap, "suggestedResponseTable");
            a(((Cursor) (obj)), sqlitedatabase, "suggestedResponseTable", "bin_id");
            a(((Cursor) (obj)), sqlitedatabase, "suggestedResponseTable", "suggested_responses");
            if (j1 >= 12 && i1 < 12)
            {
                sqlitedatabase.execSQL("UPDATE messagesTable SET read_state = 100 WHERE read_state =0");
                sqlitedatabase.execSQL("UPDATE messagesTable SET read_state = 200 WHERE read_state =2");
                sqlitedatabase.execSQL("UPDATE messagesTable SET read_state = 300 WHERE read_state =6");
                sqlitedatabase.execSQL("UPDATE messagesTable SET read_state = 400 WHERE read_state =3");
                sqlitedatabase.execSQL("UPDATE messagesTable SET read_state = 500 WHERE read_state =4");
                sqlitedatabase.execSQL("UPDATE messagesTable SET read_state = 600 WHERE read_state =5");
            }
            sqlitedatabase.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s (_id INTEGER PRIMARY KEY AUTOINCREMENT, content_id VARCHAR, content_type INT, content_name VARCHAR, content_string VARCHAR);", new Object[] {
                "KIKContentTable"
            }));
            obj = sqlitedatabase.query("KIKContentURITable", null, null, null, null, null, null);
            a(((Cursor) (obj)), sqlitedatabase, "KIKContentURITable", "type");
            a(((Cursor) (obj)), sqlitedatabase, "KIKContentURITable", "byline");
            a(((Cursor) (obj)), sqlitedatabase, "KIKContentURITable", "file_content_type");
            ((Cursor) (obj)).close();
            obj = sqlitedatabase.query("memberTable", null, null, null, null, null, null);
            a(((Cursor) (obj)), sqlitedatabase, "memberTable", "is_admin", "0");
            a(((Cursor) (obj)), sqlitedatabase, "memberTable", "is_banned", "0");
            ((Cursor) (obj)).close();
            sqlitedatabase.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s (_id INTEGER PRIMARY KEY AUTOINCREMENT, content_id VARCHAR, retain_count INT);", new Object[] {
                "KIKContentRetainCountTable"
            }));
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS KIKSponsoredUsersTable");
        }

        public final void onCreate(SQLiteDatabase sqlitedatabase)
        {
            a(sqlitedatabase);
        }

        public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i1, int j1)
        {
        }

        a(Context context, am am1, kik.a.f.k k1)
        {
            SQLiteDatabase sqlitedatabase;
            int i1;
            i1 = 0;
            super(context, "kikDatabase.db", 19, am1.m());
            sqlitedatabase = getWritableDatabase();
            if (b() == 0 || c() < 17 || b() >= 17) goto _L2; else goto _L1
_L1:
            if (c() < 13 || b() >= 13) goto _L4; else goto _L3
_L3:
            sqlitedatabase.execSQL(String.format("UPDATE %s SET content_type = %s, content_name = 'file-url', content_string = '%s' || content_string || '/orig.jpg' WHERE (content_type = %s AND content_name = 'token')", new Object[] {
                "KIKContentTable", Integer.valueOf(2), k1.f(), Integer.valueOf(4)
            }));
            int j1;
            context = com.kik.l.am.q().listFiles();
            j1 = context.length;
_L5:
            if (i1 >= j1)
            {
                break; /* Loop/switch isn't completed */
            }
            k1 = context[i1];
            if (k1 == null)
            {
                break MISSING_BLOCK_LABEL_171;
            }
            String s1 = k1.getPath();
            s1 = s1.substring(s1.lastIndexOf("/"));
            k1.renameTo(new File(am.r(), s1));
            i1++;
            if (true) goto _L5; else goto _L4
            context;
            (new StringBuilder("file copy failed because: ")).append(context.getMessage());
_L4:
            com.kik.l.am.a(am1);
            am1 = sqlitedatabase.query("KIKContentTable", new String[] {
                "content_id", "content_string"
            }, "content_name ='app-name'", null, "content_id", null, null);
            k1 = new Vector();
            if (!am1.moveToFirst()) goto _L7; else goto _L6
_L6:
            ContentValues contentvalues;
            boolean flag;
            boolean flag1;
            contentvalues = new ContentValues();
            context = am1.getString(am1.getColumnIndex("content_id"));
            String s2 = am1.getString(am1.getColumnIndex("content_string"));
            flag = "camera".equalsIgnoreCase(s2.trim());
            flag1 = "gallery".equalsIgnoreCase(s2.trim());
            if (!flag && !flag1) goto _L9; else goto _L8
_L8:
            contentvalues.put("content_id", context);
            contentvalues.put("content_type", Integer.valueOf(3));
            contentvalues.put("content_name", "icon");
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_451;
            }
            context = a;
_L10:
            contentvalues.put("content_string", context);
            k1.add(contentvalues);
_L9:
            flag = am1.moveToNext();
            if (flag) goto _L6; else goto _L7
_L7:
            if (am1 == null)
            {
                break MISSING_BLOCK_LABEL_397;
            }
            am1.close();
            for (context = k1.iterator(); context.hasNext(); sqlitedatabase.insert("KIKContentTable", null, (ContentValues)context.next())) { }
              goto _L2
            context;
            (new StringBuilder("Couldn't add icons during upgrade. Exception: ")).append(context.getMessage());
_L2:
            return;
            context = b;
              goto _L10
            context;
            if (am1 == null)
            {
                break MISSING_BLOCK_LABEL_469;
            }
            am1.close();
            throw context;
        }
    }

    private static final class b extends kik.android.h.i
    {

        public final void a(SQLiteDatabase sqlitedatabase, int i1, int j1)
        {
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS KIKImagesTable");
        }

        public final void onCreate(SQLiteDatabase sqlitedatabase)
        {
        }

        public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i1, int j1)
        {
        }

        b(Context context, String s1)
        {
            super(context, "kikImageDatabase.db", 19, s1);
        }
    }

    private static final class c extends kik.android.h.i
    {

        public final void a(SQLiteDatabase sqlitedatabase, int i1, int j1)
        {
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS KIKItemsTable (_id INTEGER PRIMARY KEY AUTOINCREMENT, item_sku VARCHAR, formatted_price VARCHAR);");
        }

        public final void onCreate(SQLiteDatabase sqlitedatabase)
        {
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS KIKItemsTable (_id INTEGER PRIMARY KEY AUTOINCREMENT, item_sku VARCHAR, formatted_price VARCHAR);");
        }

        public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i1, int j1)
        {
        }

        public c(Context context, String s1)
        {
            super(context, "kikItemDatabase.db", 19, s1);
        }
    }


    private static File D;
    private static final org.c.b a = org.c.c.a("Storage");
    private static File t;
    private static File u;
    private static File v;
    private final bb A;
    private final s B;
    private final s C;
    private final int E;
    private final int F;
    private final l G;
    private final com.kik.l.w H;
    private final ae I;
    private final com.kik.l.d J;
    private final ac K;
    private final w L;
    private final com.kik.l.aq M;
    private final String N;
    private k O;
    private k P;
    private k Q;
    private k R;
    private f S;
    private final Context b;
    private aq c;
    private bs d;
    private bs e;
    private final h f;
    private final a g;
    private final c h;
    private final b i;
    private final t j;
    private File k;
    private File l;
    private File m;
    private File n;
    private File o;
    private File p;
    private File q;
    private File r;
    private File s;
    private com.kik.l.f w;
    private com.kik.l.p x;
    private al y;
    private q z;

    public am(Context context, t t1, ExecutorService executorservice, kik.a.f.k k1, aq aq1, q q1, String s1)
    {
        w = null;
        x = null;
        y = null;
        E = 10;
        F = 5;
        S = new f();
        b = context.getApplicationContext();
        z = q1;
        c = aq1;
        N = s1;
        k = s();
        aq1 = b.getCacheDir();
        l = a(k, aq1, "profPics");
        v = a(k, aq1, "chatPicsSmall");
        m = a(k, aq1, "chatPicsBig");
        n = a(k, aq1, "chatVids");
        s = a(k, aq1, "linkModCache");
        o = a(k, aq1, "gifs");
        p = a(k, aq1, "gifs_");
        r = new File(b.getFilesDir(), "staging");
        t = new File(r, "large");
        u = new File(r, "thumbs");
        q = new File(aq1, "tempVids");
        d = new bs(10);
        e = new bs(5);
        aq1 = Environment.getExternalStorageDirectory();
        if (aq1 != null && aq1.exists()) goto _L2; else goto _L1
_L1:
        D = null;
_L4:
        t();
        if (!l.exists())
        {
            l.mkdirs();
        }
        if (!m.exists())
        {
            m.mkdirs();
        }
        if (!r.exists())
        {
            r.mkdirs();
        }
        if (!t.exists())
        {
            t.mkdirs();
        }
        if (!n.exists())
        {
            n.mkdirs();
        }
        if (!o.exists())
        {
            o.mkdirs();
        }
        if (!q.exists())
        {
            q.mkdirs();
        }
        if (!u.exists())
        {
            u.mkdirs();
        }
        kik.a.h.e.a().a(this);
        O = new com.kik.g.a(this, executorservice);
        P = new com.kik.g.a(this, executorservice);
        Q = new com.kik.g.a(this, executorservice);
        R = new com.kik.g.a(this, executorservice);
        i = new b(b, N);
        j = t1;
        w = new com.kik.l.f(s());
        S.a(w.a(), new an(this));
        x = new com.kik.l.p(s());
        y = new al(s());
        f = new u(c);
        K = new ac(context, l, m, n, t, u, d, e, x);
        g = new a(b, this, k1);
        h = new c(b, N);
        G = new l(g);
        H = new com.kik.l.w(g);
        L = new w(h);
        I = new ae(g, t, u, m, this);
        M = new com.kik.l.aq(g);
        J = new com.kik.l.d(g);
        A = new bb(n, "com.kik.ext.video-camera");
        B = new s(o, "com.kik.ext.gif");
        C = new s(p, null);
        return;
_L2:
        aq1 = new File(aq1, "Kik");
        D = aq1;
        if (!aq1.exists())
        {
            D.mkdirs();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static File a(File file, File file1, String s1)
    {
        file = new File(file, s1);
        kik.android.util.d.a(new File(file1, s1), file);
        return file;
    }

    static void a(am am1)
    {
        Object obj1 = null;
        kik.android.f.a.f.a();
        Object obj = kik.android.f.a.f.a(KikApplication.c(0x7f020043));
        if (obj != null)
        {
            byte abyte0[] = kik.android.util.e.a(((Bitmap) (obj)));
            if (!((Bitmap) (obj)).isRecycled())
            {
                ((Bitmap) (obj)).recycle();
            }
            try
            {
                obj = MessageDigest.getInstance("MD5");
            }
            catch (NoSuchAlgorithmException nosuchalgorithmexception)
            {
                nosuchalgorithmexception.printStackTrace();
                nosuchalgorithmexception = null;
            }
            ((MessageDigest) (obj)).update(abyte0, 0, abyte0.length);
            com.kik.l.a.a = (new BigInteger(1, ((MessageDigest) (obj)).digest())).toString(16);
            am1.a(com.kik.l.a.a, abyte0, false, false, true);
        }
        kik.android.f.a.f.a();
        obj = kik.android.f.a.f.a(KikApplication.c(0x7f020124));
        if (obj != null)
        {
            abyte0 = kik.android.util.e.a(((Bitmap) (obj)));
            if (!((Bitmap) (obj)).isRecycled())
            {
                ((Bitmap) (obj)).recycle();
            }
            try
            {
                obj = MessageDigest.getInstance("MD5");
            }
            catch (NoSuchAlgorithmException nosuchalgorithmexception1)
            {
                nosuchalgorithmexception1.printStackTrace();
                nosuchalgorithmexception1 = obj1;
            }
            ((MessageDigest) (obj)).update(abyte0, 0, abyte0.length);
            com.kik.l.a.b = (new BigInteger(1, ((MessageDigest) (obj)).digest())).toString(16);
            am1.a(com.kik.l.a.b, abyte0, false, false, true);
        }
    }

    static File q()
    {
        return v;
    }

    static File r()
    {
        return u;
    }

    private File s()
    {
        return z.a("cache");
    }

    private void t()
    {
        if (q != null)
        {
            File afile[] = q.listFiles();
            if (afile != null)
            {
                long l1 = System.currentTimeMillis();
                int j1 = afile.length;
                for (int i1 = 0; i1 < j1; i1++)
                {
                    File file = afile[i1];
                    if (l1 - file.lastModified() > 0x240c8400L)
                    {
                        file.delete();
                    }
                }

            }
        }
    }

    private static String z(String s1)
    {
        return (new StringBuilder()).append(s1.hashCode()).toString();
    }

    public final Cursor a(String s1)
    {
        return G.a(s1);
    }

    public final Cursor a(String s1, String as[])
    {
        return G.a(s1, as);
    }

    public final ad a()
    {
        return w.b();
    }

    public final com.kik.g.p a(String s1, kik.a.e.s s2, com.kik.android.a a1)
    {
        if (s1 == null)
        {
            return com.kik.g.s.a(null);
        } else
        {
            String s3 = z(s1);
            return B.a(s3, s1, null, s2, a1, 0x100000);
        }
    }

    public final com.kik.g.p a(kik.a.d.a.a a1, byte abyte0[], kik.a.e.s s1, com.kik.android.a a2)
    {
        byte abyte1[] = null;
        if (a1 == null)
        {
            return com.kik.g.s.a(null);
        }
        if (a1.j())
        {
            abyte1 = abyte0;
        }
        return A.a(a1.o(), a1.h(), abyte1, s1, a2, 0x1400000);
    }

    public final File a(String s1, Object obj, boolean flag, boolean flag1, boolean flag2)
    {
        return K.a(s1, obj, flag, flag1, flag2);
    }

    public final Integer a(String s1, int i1)
    {
        return Integer.valueOf(c.b().getInt(s1, i1));
    }

    public final Object a(String s1, boolean flag)
    {
        return K.a(s1, flag);
    }

    public final void a(Bitmap bitmap, String s1)
    {
        if (bitmap == null)
        {
            return;
        } else
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 0, bytearrayoutputstream);
            bitmap = bytearrayoutputstream.toByteArray();
            K.a(s1, bitmap);
            return;
        }
    }

    public final void a(Integer integer)
    {
        R.a(integer);
    }

    public final void a(Object obj)
    {
        if (obj instanceof n)
        {
            y.a().a((n)obj);
        }
    }

    public final void a(List list)
    {
        Q.a(list);
    }

    public final void a(List list, String s1)
    {
        M.a(list, s1);
    }

    public final void a(UUID uuid, File file)
    {
        K.a(uuid.toString(), file);
    }

    public final void a(aa aa1)
    {
        boolean flag = false;
        f.b();
        y.b();
        Object obj = c.b().edit();
        ((android.content.SharedPreferences.Editor) (obj)).clear();
        kik.android.f.a.f.a().j();
        if (t != null)
        {
            File afile[] = t.listFiles();
            if (afile != null)
            {
                int k1 = afile.length;
                for (int i1 = 0; i1 < k1; i1++)
                {
                    afile[i1].delete();
                }

            }
        }
        if (u != null)
        {
            File afile1[] = u.listFiles();
            if (afile1 != null)
            {
                int l1 = afile1.length;
                for (int j1 = ((flag) ? 1 : 0); j1 < l1; j1++)
                {
                    afile1[j1].delete();
                }

            }
        }
        w.c();
        ((android.content.SharedPreferences.Editor) (obj)).commit();
        c.a();
        SharedPreferences sharedpreferences = c.c();
        String s1 = sharedpreferences.getString("usernameLogin", null);
        obj = s1;
        if (aa1 != null)
        {
            obj = s1;
            if (aa1.c != null)
            {
                obj = aa1.c;
            }
        }
        sharedpreferences.edit().putString("usernameLogin", ((String) (obj))).commit();
        kik.a.h.c.a(z.a(), true, a);
        g.a();
        h.a();
        i.a();
    }

    public final void a(kik.a.d.f f1, kik.a.d.s s1)
    {
        if (f1 == null)
        {
            return;
        }
        f1 = c.a(f1.s()).edit();
        f1.clear();
        if (s1 != null)
        {
            f1.putString("kik.chat.LastMessageSeen", s1.b());
        }
        f1.commit();
    }

    public final void a(kik.a.d.k k1)
    {
        O.a(k1);
    }

    public final void a(byte abyte0[], aa aa1)
    {
        w.a(abyte0, aa1);
    }

    public final void a(byte abyte0[], kik.a.d.n n1)
    {
        w.a(abyte0, n1);
    }

    public final boolean a(File file)
    {
        return K.c(file);
    }

    public final boolean a(String s1, Boolean boolean1)
    {
        android.content.SharedPreferences.Editor editor = c.b().edit();
        editor.putBoolean(s1, boolean1.booleanValue());
        editor.commit();
        return true;
    }

    public final boolean a(String s1, Integer integer)
    {
        android.content.SharedPreferences.Editor editor = c.b().edit();
        editor.putInt(s1, integer.intValue());
        editor.commit();
        return true;
    }

    public final boolean a(String s1, Long long1)
    {
        android.content.SharedPreferences.Editor editor = c.b().edit();
        editor.putLong(s1, long1.longValue());
        editor.commit();
        return true;
    }

    public final boolean a(String s1, Object obj, String s2)
    {
        return K.a(s1, obj, s2);
    }

    public final boolean a(String s1, String s2)
    {
        s2 = new File(s2);
        boolean flag = A.a(s1, s2);
        if (flag)
        {
            s2.deleteOnExit();
        }
        return flag;
    }

    public final boolean a(ArrayList arraylist)
    {
        return H.a(arraylist);
    }

    public final boolean a(Vector vector)
    {
        return L.a(vector);
    }

    public final boolean a(kik.a.d.g g1)
    {
        return H.a(g1);
    }

    public final boolean a(i i1)
    {
        return L.a(i1);
    }

    public final boolean a(kik.a.d.s s1)
    {
        return I.a(s1);
    }

    public final ad b()
    {
        return x.a();
    }

    public final com.kik.g.p b(kik.a.d.a.a a1, byte abyte0[], kik.a.e.s s1, com.kik.android.a a2)
    {
        byte abyte1[] = null;
        if (a1 == null)
        {
            return com.kik.g.s.a(null);
        }
        if (a1.u().equals("com.kik.ext.gif"))
        {
            return a(a1.a(kik.android.gifs.a.a), s1, a2);
        }
        if (a1.j())
        {
            abyte1 = abyte0;
        }
        return A.a(a1.o(), a1.h(), abyte1, s1, a2, 0x100000);
    }

    public final File b(String s1, boolean flag)
    {
        return K.b(s1, flag);
    }

    public final String b(String s1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(q.getPath());
        stringbuilder.append(File.separator);
        stringbuilder.append(s1);
        stringbuilder.append(".mp4");
        return stringbuilder.toString();
    }

    public final String b(String s1, String s2)
    {
        if ("CredentialData.password".equals(s1))
        {
            String s3 = c.b().getString(s1, s2);
            s2 = s3;
            if (s3 != null)
            {
                s2 = s3;
                if (s3.length() != 40)
                {
                    s2 = j.a(s3);
                    c(s1, s2);
                }
            }
            return s2;
        } else
        {
            return c.b().getString(s1, s2);
        }
    }

    public final void b(Bitmap bitmap, String s1)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 80, bytearrayoutputstream);
        bitmap = new ByteArrayInputStream(bytearrayoutputstream.toByteArray());
        C.a(z(s1), bitmap);
    }

    public final void b(File file)
    {
        K.a(file);
    }

    public final void b(String s1, int i1)
    {
        synchronized (g)
        {
            SQLiteDatabase sqlitedatabase = g.getWritableDatabase();
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("content_string", String.valueOf(i1));
            sqlitedatabase.update("KIKContentTable", contentvalues, String.format("content_id = '%s' AND content_name = '%s' AND content_type = '%s'", new Object[] {
                s1, "int-chunk-progress", Integer.valueOf(2)
            }), null);
        }
        return;
        s1;
        a1;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final void b(byte abyte0[], aa aa1)
    {
        w.b(abyte0, aa1);
    }

    public final boolean b(List list)
    {
        return G.a(list);
    }

    public final boolean b(kik.a.d.k k1)
    {
        return G.a(k1);
    }

    public final boolean b(kik.a.d.s s1)
    {
        return I.b(s1);
    }

    public final com.kik.g.e c()
    {
        return O.a();
    }

    public final boolean c(File file)
    {
        return com.kik.l.ac.b(file);
    }

    public final boolean c(String s1)
    {
        return A.e(s1);
    }

    public final boolean c(String s1, String s2)
    {
        android.content.SharedPreferences.Editor editor = c.b().edit();
        editor.putString(s1, s2);
        editor.commit();
        return true;
    }

    public final boolean c(List list)
    {
        return G.b(list);
    }

    public final boolean c(kik.a.d.k k1)
    {
        boolean flag;
        synchronized (g)
        {
            flag = b(k1);
        }
        return flag;
        k1;
        a1;
        JVM INSTR monitorexit ;
        throw k1;
    }

    public final boolean c(kik.a.d.s s1)
    {
        return I.c(s1);
    }

    public final com.kik.g.e d()
    {
        return R.a();
    }

    public final kik.a.d.s d(kik.a.d.s s1)
    {
        kik.a.d.a.a a1 = (kik.a.d.a.a)kik.a.d.a.g.a(s1, kik/a/d/a/a);
        if (a1 == null) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        SQLiteDatabase sqlitedatabase;
        Vector vector;
        Iterator iterator1;
        String s2;
        java.util.Map.Entry entry;
        byte abyte0[];
        if (!s1.d())
        {
            if ("com.kik.ext.camera".equals(a1.u()) || "com.kik.ext.video-camera".equals(a1.u()))
            {
                Bitmap bitmap = ((BitmapDrawable)b.getResources().getDrawable(0x7f020043)).getBitmap();
                kik.android.f.a.f.a();
                Bitmap bitmap1 = kik.android.f.a.f.a(bitmap);
                if (bitmap1 != null)
                {
                    a1.a("icon", new kik.a.d.d(kik.android.util.e.a(bitmap1)));
                    if (bitmap != bitmap1 && !bitmap1.isRecycled())
                    {
                        bitmap1.recycle();
                    }
                }
            } else
            if ("com.kik.ext.gallery".equals(a1.u()) || "com.kik.ext.video-gallery".equals(a1.u()))
            {
                obj = ((BitmapDrawable)b.getResources().getDrawable(0x7f020124)).getBitmap();
                kik.android.f.a.f.a();
                obj1 = kik.android.f.a.f.a(((BitmapDrawable)b.getResources().getDrawable(0x7f020124)).getBitmap());
                if (obj1 != null)
                {
                    a1.a("icon", new kik.a.d.d(kik.android.util.e.a(((Bitmap) (obj1)))));
                    if (obj != obj1 && !((Bitmap) (obj1)).isRecycled())
                    {
                        ((Bitmap) (obj1)).recycle();
                    }
                }
            }
        }
        obj1 = g;
        obj1;
        JVM INSTR monitorenter ;
        sqlitedatabase = g.getWritableDatabase();
        if (a1 == null) goto _L4; else goto _L3
_L3:
        vector = new Vector();
        iterator1 = a1.s().entrySet().iterator();
_L9:
        if (!iterator1.hasNext()) goto _L6; else goto _L5
_L5:
        entry = (java.util.Map.Entry)iterator1.next();
        s2 = (String)entry.getKey();
        obj = MessageDigest.getInstance("MD5");
_L7:
        abyte0 = kik.a.h.e.a().a((o)entry.getValue());
        if (abyte0 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        ((MessageDigest) (obj)).update(abyte0, 0, abyte0.length);
        obj = (new BigInteger(1, ((MessageDigest) (obj)).digest())).toString(16);
        a(((String) (obj)), abyte0, false, false, true);
        kik.a.d.d d1 = new kik.a.d.d(null);
        d1.a(((String) (obj)));
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("content_id", a1.o());
        contentvalues.put("content_type", Integer.valueOf(3));
        contentvalues.put("content_name", s2);
        contentvalues.put("content_string", ((String) (obj)));
        vector.add(contentvalues);
        a1.a(s2, d1);
        continue; /* Loop/switch isn't completed */
        s1;
        obj1;
        JVM INSTR monitorexit ;
        throw s1;
        NoSuchAlgorithmException nosuchalgorithmexception;
        nosuchalgorithmexception;
        nosuchalgorithmexception.printStackTrace();
        nosuchalgorithmexception = null;
          goto _L7
_L6:
        sqlitedatabase.beginTransaction();
        for (Iterator iterator = vector.iterator(); iterator.hasNext(); sqlitedatabase.insert("KIKContentTable", null, (ContentValues)iterator.next())) { }
        break MISSING_BLOCK_LABEL_542;
        s1;
        sqlitedatabase.endTransaction();
        throw s1;
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
_L4:
        obj1;
        JVM INSTR monitorexit ;
_L2:
        return s1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final void d(kik.a.d.k k1)
    {
        if (k1 == null)
        {
            return;
        } else
        {
            w.a(k1);
            return;
        }
    }

    public final boolean d(String s1)
    {
        return A.a(s1);
    }

    public final boolean d(List list)
    {
        return I.a(list);
    }

    public final void e()
    {
        boolean flag1 = true;
        aq aq1 = c;
        boolean flag;
        if (aq1 != null && !aq1.a("Kik.Storage.ContactImageCache.pref").getBoolean("ContactImageCache.volley.migrated", false))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            w.a(G.a(), b, c);
        }
        w.a("profpics", R.a(), b.getCacheDir());
        if (!c.a("Kik.Storage.ContentImageCache.pref").getBoolean("ContentImageCache.volley.migrated", false))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            x.a(s(), c);
        }
        x.a("contentpics", b.getCacheDir());
        y.a("sponsoredresponse", b.getCacheDir());
        if (g.c() >= 18 && g.b() < 18)
        {
            ArrayList arraylist = new ArrayList(G.b().values());
            w.a(arraylist);
        }
    }

    public final boolean e(String s1)
    {
        return s1.startsWith(q.getPath());
    }

    public final File f(String s1)
    {
        return A.c(s1);
    }

    public final Hashtable f()
    {
        return H.a();
    }

    public final Bitmap g(String s1)
    {
        s1 = C.d(z(s1));
        if (s1 == null)
        {
            com.kik.m.h.a(s1);
            return null;
        }
        Object obj;
        obj = android.graphics.Bitmap.Config.RGB_565;
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inPreferredConfig = ((android.graphics.Bitmap.Config) (obj));
        options.inPurgeable = true;
        options.inInputShareable = true;
        obj = BitmapFactory.decodeStream(s1, null, options);
        com.kik.m.h.a(s1);
        return ((Bitmap) (obj));
        s1;
        Object obj1;
        obj1 = null;
        obj = s1;
_L2:
        com.kik.m.h.a(((java.io.Closeable) (obj1)));
        throw obj;
        obj;
        obj1 = s1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void g()
    {
        android.content.SharedPreferences.Editor editor = c.b().edit();
        editor.putBoolean("kik.mute.status.pull", true);
        editor.commit();
    }

    public final void h(String s1)
    {
        P.a(s1);
    }

    public final boolean h()
    {
        return c.b().getBoolean("kik.mute.status.pull", false);
    }

    public final Hashtable i()
    {
        return G.a();
    }

    public final i i(String s1)
    {
        return L.a(s1);
    }

    public final HashMap j()
    {
        return M.a();
    }

    public final boolean j(String s1)
    {
        return H.a(s1);
    }

    public final kik.a.d.k k(String s1)
    {
        return G.b(s1);
    }

    public final void k()
    {
        g.getWritableDatabase().close();
        h.getWritableDatabase().close();
        i.getWritableDatabase().close();
    }

    public final Hashtable l()
    {
        return I.a();
    }

    public final boolean l(String s1)
    {
        return G.c(s1);
    }

    public final String m()
    {
        return N;
    }

    public final boolean m(String s1)
    {
        return I.a(s1);
    }

    public final String n(String s1)
    {
        return b(s1, ((String) (null)));
    }

    public final h n()
    {
        return f;
    }

    public final Long o(String s1)
    {
        return Long.valueOf(c.b().getLong(s1, 0L));
    }

    public final boolean o()
    {
        return w.d();
    }

    public final File p()
    {
        return s;
    }

    public final Boolean p(String s1)
    {
        return Boolean.valueOf(c.b().getBoolean(s1, false));
    }

    public final boolean q(String s1)
    {
        android.content.SharedPreferences.Editor editor = c.b().edit();
        editor.remove(s1);
        editor.commit();
        return true;
    }

    public final kik.a.d.a.a r(String s1)
    {
        return I.b(s1);
    }

    public final void s(String s1)
    {
        K.a(s1);
    }

    public final boolean t(String s1)
    {
        if (D == null)
        {
            return false;
        } else
        {
            return (new File(D, (new StringBuilder()).append(s1).append(".jpg").toString())).exists();
        }
    }

    public final boolean u(String s1)
    {
        return K.b(s1);
    }

    public final boolean v(String s1)
    {
        return K.c(s1);
    }

    public final int[] w(String s1)
    {
        return K.d(s1);
    }

    public final byte[] x(String s1)
    {
        return K.e(s1);
    }

    public final boolean y(String s1)
    {
        return c.b().contains(s1);
    }

}
