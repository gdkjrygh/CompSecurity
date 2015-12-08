// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.b.V;
import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzx;
import java.io.Closeable;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            t, k, s, v, 
//            R, d, l, g, 
//            Z, y, Y

final class D extends t
    implements Closeable
{
    final class a extends SQLiteOpenHelper
    {

        final D a;

        private static void a(SQLiteDatabase sqlitedatabase)
        {
            int j = 0;
            sqlitedatabase = b(sqlitedatabase, "properties");
            for (; j < 6; j++)
            {
                String s1 = (new String[] {
                    "app_uid", "cid", "tid", "params", "adid", "hits_count"
                })[j];
                if (!sqlitedatabase.remove(s1))
                {
                    throw new SQLiteException((new StringBuilder("Database properties is missing required column: ")).append(s1).toString());
                }
            }

            if (!sqlitedatabase.isEmpty())
            {
                throw new SQLiteException("Database properties table has extra columns");
            } else
            {
                return;
            }
        }

        private boolean a(SQLiteDatabase sqlitedatabase, String s1)
        {
            SQLiteDatabase sqlitedatabase1 = null;
            sqlitedatabase = sqlitedatabase.query("SQLITE_MASTER", new String[] {
                "name"
            }, "name=?", new String[] {
                s1
            }, null, null, null);
            sqlitedatabase1 = sqlitedatabase;
            sqlitedatabase = sqlitedatabase1;
            boolean flag = sqlitedatabase1.moveToFirst();
            if (sqlitedatabase1 != null)
            {
                sqlitedatabase1.close();
            }
            return flag;
            SQLiteException sqliteexception;
            sqliteexception;
            sqlitedatabase1 = null;
_L4:
            sqlitedatabase = sqlitedatabase1;
            a.c("Error querying for table", s1, sqliteexception);
            if (sqlitedatabase1 != null)
            {
                sqlitedatabase1.close();
            }
            return false;
            sqlitedatabase;
            s1 = sqlitedatabase1;
_L2:
            if (s1 != null)
            {
                s1.close();
            }
            throw sqlitedatabase;
            Exception exception;
            exception;
            s1 = sqlitedatabase;
            sqlitedatabase = exception;
            if (true) goto _L2; else goto _L1
_L1:
            sqliteexception;
            if (true) goto _L4; else goto _L3
_L3:
        }

        private static Set b(SQLiteDatabase sqlitedatabase, String s1)
        {
            HashSet hashset;
            hashset = new HashSet();
            sqlitedatabase = sqlitedatabase.rawQuery((new StringBuilder("SELECT * FROM ")).append(s1).append(" LIMIT 0").toString(), null);
            s1 = sqlitedatabase.getColumnNames();
            int j = 0;
_L2:
            if (j >= s1.length)
            {
                break; /* Loop/switch isn't completed */
            }
            hashset.add(s1[j]);
            j++;
            if (true) goto _L2; else goto _L1
_L1:
            sqlitedatabase.close();
            return hashset;
            s1;
            sqlitedatabase.close();
            throw s1;
        }

        public final SQLiteDatabase getWritableDatabase()
        {
            if (!D.a(a).a(0x36ee80L))
            {
                throw new SQLiteException("Database open failed");
            }
            SQLiteDatabase sqlitedatabase;
            try
            {
                sqlitedatabase = super.getWritableDatabase();
            }
            catch (SQLiteException sqliteexception)
            {
                D.a(a).a();
                a.f("Opening the database failed, dropping the table and recreating it");
                Object obj = D.b(a);
                ((s) (a)).i.a.getDatabasePath(((String) (obj))).delete();
                try
                {
                    obj = super.getWritableDatabase();
                    D.a(a).a = 0L;
                }
                catch (SQLiteException sqliteexception1)
                {
                    a.d("Failed to open freshly created database", sqliteexception1);
                    throw sqliteexception1;
                }
                return ((SQLiteDatabase) (obj));
            }
            return sqlitedatabase;
        }

        public final void onCreate(SQLiteDatabase sqlitedatabase)
        {
            sqlitedatabase = sqlitedatabase.getPath();
            if (Y.a() >= 9)
            {
                sqlitedatabase = new File(sqlitedatabase);
                sqlitedatabase.setReadable(false, false);
                sqlitedatabase.setWritable(false, false);
                sqlitedatabase.setReadable(true, true);
                sqlitedatabase.setWritable(true, true);
            }
        }

        public final void onOpen(SQLiteDatabase sqlitedatabase)
        {
            Cursor cursor;
            boolean flag1;
            flag1 = true;
            if (android.os.Build.VERSION.SDK_INT >= 15)
            {
                break MISSING_BLOCK_LABEL_32;
            }
            cursor = sqlitedatabase.rawQuery("PRAGMA journal_mode=memory", null);
            cursor.moveToFirst();
            cursor.close();
            if (!a(sqlitedatabase, "hits2"))
            {
                sqlitedatabase.execSQL(D.i());
            } else
            {
                Set set = b(sqlitedatabase, "hits2");
                for (int j = 0; j < 4; j++)
                {
                    String s1 = (new String[] {
                        "hit_id", "hit_string", "hit_time", "hit_url"
                    })[j];
                    if (!set.remove(s1))
                    {
                        throw new SQLiteException((new StringBuilder("Database hits2 is missing required column: ")).append(s1).toString());
                    }
                }

                boolean flag;
                if (!set.remove("hit_app_id"))
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                if (!set.isEmpty())
                {
                    throw new SQLiteException("Database hits2 has extra columns");
                }
                if (flag)
                {
                    sqlitedatabase.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER");
                }
            }
            if (!a(sqlitedatabase, "properties"))
            {
                sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
                return;
            } else
            {
                a(sqlitedatabase);
                return;
            }
            sqlitedatabase;
            cursor.close();
            throw sqlitedatabase;
        }

        public final void onUpgrade(SQLiteDatabase sqlitedatabase, int j, int i1)
        {
        }

        a(Context context, String s1)
        {
            a = D.this;
            super(context, s1, null, 1);
        }
    }


    private static final String a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[] {
        "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id"
    });
    private static final String b = String.format("SELECT MAX(%s) FROM %s WHERE 1;", new Object[] {
        "hit_time", "hits2"
    });
    private final a c;
    private final k d;
    private final k e;

    D(v v1)
    {
        super(v1);
        d = new k(super.i.c);
        e = new k(super.i.c);
        String s1 = s();
        c = new a(v1.a, s1);
    }

    private long a(String s1)
    {
        Cursor cursor;
        Cursor cursor1;
        Object obj;
        cursor1 = null;
        cursor = null;
        obj = r();
        obj = ((SQLiteDatabase) (obj)).rawQuery(s1, null);
        cursor = ((Cursor) (obj));
        cursor1 = ((Cursor) (obj));
        if (!((Cursor) (obj)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_66;
        }
        cursor = ((Cursor) (obj));
        cursor1 = ((Cursor) (obj));
        long l1 = ((Cursor) (obj)).getLong(0);
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return l1;
        cursor = ((Cursor) (obj));
        cursor1 = ((Cursor) (obj));
        throw new SQLiteException("Database returned empty set");
        SQLiteException sqliteexception;
        sqliteexception;
        cursor1 = cursor;
        d("Database error", s1, sqliteexception);
        cursor1 = cursor;
        throw sqliteexception;
        s1;
        if (cursor1 != null)
        {
            cursor1.close();
        }
        throw s1;
    }

    private long a(String s1, String as[])
    {
        Object obj;
        Object obj1;
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = r();
        obj = null;
        obj1 = null;
        as = sqlitedatabase.rawQuery(s1, as);
        long l1;
        if (!as.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_50;
        }
        l1 = as.getLong(0);
        if (as != null)
        {
            as.close();
        }
        return l1;
        if (as != null)
        {
            as.close();
        }
        return 0L;
        obj;
        as = ((String []) (obj1));
        obj1 = obj;
_L4:
        obj = as;
        d("Database error", s1, obj1);
        obj = as;
        throw obj1;
        s1;
_L2:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw s1;
        s1;
        obj = as;
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static k a(D d1)
    {
        return d1.e;
    }

    static String b(D d1)
    {
        return d1.s();
    }

    private List c(long l1)
    {
        Object obj;
        Object obj1;
        ArrayList arraylist;
        obj1 = null;
        v.g();
        o();
        if (l1 <= 0L)
        {
            return Collections.emptyList();
        }
        obj = r();
        arraylist = new ArrayList();
        String s1 = String.format("%s ASC", new Object[] {
            "hit_id"
        });
        String s2 = Long.toString(l1);
        obj = ((SQLiteDatabase) (obj)).query("hits2", new String[] {
            "hit_id"
        }, null, null, null, null, s1, s2);
        obj1 = obj;
        obj = obj1;
        if (!((Cursor) (obj1)).moveToFirst()) goto _L2; else goto _L1
_L1:
        obj = obj1;
        arraylist.add(Long.valueOf(((Cursor) (obj1)).getLong(0)));
        obj = obj1;
        boolean flag = ((Cursor) (obj1)).moveToNext();
        if (flag) goto _L1; else goto _L2
_L2:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
_L3:
        return arraylist;
        Object obj2;
        obj2;
        obj1 = null;
_L6:
        obj = obj1;
        c("Error selecting hit ids", obj2);
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
          goto _L3
        obj;
_L5:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
        obj2;
        obj1 = obj;
        obj = obj2;
        if (true) goto _L5; else goto _L4
_L4:
        obj2;
          goto _L6
    }

    private Map g(String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            return new HashMap(0);
        }
        Object obj;
        if (!s1.startsWith("?"))
        {
            try
            {
                s1 = (new StringBuilder("?")).append(s1).toString();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                d("Error parsing hit parameters", s1);
                return new HashMap(0);
            }
        }
        obj = URLEncodedUtils.parse(new URI(s1), "UTF-8");
        s1 = new HashMap(((List) (obj)).size());
        NameValuePair namevaluepair;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); s1.put(namevaluepair.getName(), namevaluepair.getValue()))
        {
            namevaluepair = (NameValuePair)((Iterator) (obj)).next();
        }

        return s1;
    }

    private Map h(String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            return new HashMap(0);
        }
        try
        {
            Object obj = URLEncodedUtils.parse(new URI((new StringBuilder("?")).append(s1).toString()), "UTF-8");
            s1 = new HashMap(((List) (obj)).size());
            NameValuePair namevaluepair;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); s1.put(namevaluepair.getName(), namevaluepair.getValue()))
            {
                namevaluepair = (NameValuePair)((Iterator) (obj)).next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            d("Error parsing property parameters", s1);
            return new HashMap(0);
        }
        return s1;
    }

    static String i()
    {
        return a;
    }

    private long q()
    {
        v.g();
        o();
        return a("SELECT COUNT(*) FROM hits2");
    }

    private SQLiteDatabase r()
    {
        SQLiteDatabase sqlitedatabase;
        try
        {
            sqlitedatabase = c.getWritableDatabase();
        }
        catch (SQLiteException sqliteexception)
        {
            c("Error opening database", sqliteexception);
            throw sqliteexception;
        }
        return sqlitedatabase;
    }

    private String s()
    {
        if (!zzd.zzacF)
        {
            return "google_analytics_v4.db";
        }
        if (super.i.d.a())
        {
            return "google_analytics_v4.db";
        } else
        {
            return "google_analytics2_v4.db";
        }
    }

    public final long a(long l1, String s1, String s2)
    {
        zzx.zzcs(s1);
        zzx.zzcs(s2);
        o();
        v.g();
        return a("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[] {
            String.valueOf(l1), s1, s2
        });
    }

    public final List a(long l1)
    {
        Object obj;
        Object obj1;
        boolean flag = true;
        obj1 = null;
        Object obj2;
        String s1;
        String s2;
        int j;
        long l2;
        if (l1 < 0L)
        {
            flag = false;
        }
        zzx.zzZ(flag);
        v.g();
        o();
        obj2 = r();
        obj = obj1;
        s1 = String.format("%s ASC", new Object[] {
            "hit_id"
        });
        obj = obj1;
        s2 = Long.toString(l1);
        obj = obj1;
        obj1 = ((SQLiteDatabase) (obj2)).query("hits2", new String[] {
            "hit_id", "hit_time", "hit_string", "hit_url", "hit_app_id"
        }, null, null, null, null, s1, s2);
        obj = obj1;
        obj2 = new ArrayList();
        obj = obj1;
        if (!((Cursor) (obj1)).moveToFirst()) goto _L2; else goto _L1
_L1:
        obj = obj1;
        l1 = ((Cursor) (obj1)).getLong(0);
        obj = obj1;
        l2 = ((Cursor) (obj1)).getLong(1);
        obj = obj1;
        s1 = ((Cursor) (obj1)).getString(2);
        obj = obj1;
        s2 = ((Cursor) (obj1)).getString(3);
        obj = obj1;
        j = ((Cursor) (obj1)).getInt(4);
        obj = obj1;
        ((List) (obj2)).add(new d(this, g(s1), l2, l.c(s2), l1, j));
        obj = obj1;
        flag = ((Cursor) (obj1)).moveToNext();
        if (flag) goto _L1; else goto _L2
_L2:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        return ((List) (obj2));
        obj1;
        obj = null;
_L6:
        d("Error loading hits from the database", obj1);
        throw obj1;
        obj1;
_L4:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw obj1;
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
        SQLiteException sqliteexception;
        sqliteexception;
        obj = obj1;
        obj1 = sqliteexception;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected final void a()
    {
    }

    public final void a(long l1, String s1)
    {
        zzx.zzcs(s1);
        o();
        v.g();
        int j = r().delete("properties", "app_uid=? AND cid<>?", new String[] {
            String.valueOf(l1), s1
        });
        if (j > 0)
        {
            a("Deleted property records", Integer.valueOf(j));
        }
    }

    public final void a(d d1)
    {
        long l1;
        zzx.zzv(d1);
        v.g();
        o();
        zzx.zzv(d1);
        Object obj = new android.net.Uri.Builder();
        Object obj1 = d1.a.entrySet().iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
            String s1 = (String)entry.getKey();
            if (!"ht".equals(s1) && !"qt".equals(s1) && !"AppUID".equals(s1))
            {
                ((android.net.Uri.Builder) (obj)).appendQueryParameter(s1, (String)entry.getValue());
            }
        } while (true);
        obj = ((android.net.Uri.Builder) (obj)).build().getEncodedQuery();
        if (obj == null)
        {
            obj = "";
        }
        if (((String) (obj)).length() > 8192)
        {
            super.i.a().a(d1, "Hit length exceeds the maximum allowed size");
            return;
        }
        int j = ((Integer)Z.f.a()).intValue();
        l1 = q();
        if (l1 > (long)(j - 1))
        {
            obj1 = c((l1 - (long)j) + 1L);
            c("Store full, deleting hits to make room, count", Integer.valueOf(((List) (obj1)).size()));
            a(((List) (obj1)));
        }
        obj1 = r();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("hit_string", ((String) (obj)));
        contentvalues.put("hit_time", Long.valueOf(d1.d));
        contentvalues.put("hit_app_id", Integer.valueOf(d1.e));
        if (d1.f)
        {
            obj = R.h();
        } else
        {
            obj = R.i();
        }
        contentvalues.put("hit_url", ((String) (obj)));
        l1 = ((SQLiteDatabase) (obj1)).insert("hits2", null, contentvalues);
        if (l1 == -1L)
        {
            try
            {
                f("Failed to insert a hit (got -1)");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (d d1)
            {
                d("Error storing a hit", d1);
            }
            return;
        }
        b("Hit saved to database. db-id, hit", Long.valueOf(l1), d1);
        return;
    }

    public final void a(y y1)
    {
        zzx.zzv(y1);
        o();
        v.g();
        SQLiteDatabase sqlitedatabase = r();
        Object obj1 = y1.f;
        zzx.zzv(obj1);
        Object obj = new android.net.Uri.Builder();
        java.util.Map.Entry entry;
        for (obj1 = ((Map) (obj1)).entrySet().iterator(); ((Iterator) (obj1)).hasNext(); ((android.net.Uri.Builder) (obj)).appendQueryParameter((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
        }

        obj1 = ((android.net.Uri.Builder) (obj)).build().getEncodedQuery();
        obj = obj1;
        if (obj1 == null)
        {
            obj = "";
        }
        obj1 = new ContentValues();
        ((ContentValues) (obj1)).put("app_uid", Long.valueOf(y1.a));
        ((ContentValues) (obj1)).put("cid", y1.b);
        ((ContentValues) (obj1)).put("tid", y1.c);
        int j;
        if (y1.d)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        ((ContentValues) (obj1)).put("adid", Integer.valueOf(j));
        ((ContentValues) (obj1)).put("hits_count", Long.valueOf(y1.e));
        ((ContentValues) (obj1)).put("params", ((String) (obj)));
        try
        {
            if (sqlitedatabase.insertWithOnConflict("properties", null, ((ContentValues) (obj1)), 5) == -1L)
            {
                f("Failed to insert/update a property (got -1)");
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (y y1)
        {
            d("Error storing a property", y1);
        }
    }

    public final void a(List list)
    {
        zzx.zzv(list);
        v.g();
        o();
        if (!list.isEmpty())
        {
            Object obj = new StringBuilder("hit_id");
            ((StringBuilder) (obj)).append(" in (");
            for (int j = 0; j < list.size(); j++)
            {
                Long long1 = (Long)list.get(j);
                if (long1 == null || long1.longValue() == 0L)
                {
                    throw new SQLiteException("Invalid hit id");
                }
                if (j > 0)
                {
                    ((StringBuilder) (obj)).append(",");
                }
                ((StringBuilder) (obj)).append(long1);
            }

            ((StringBuilder) (obj)).append(")");
            obj = ((StringBuilder) (obj)).toString();
            try
            {
                SQLiteDatabase sqlitedatabase = r();
                a("Deleting dispatched hits. count", Integer.valueOf(list.size()));
                int i1 = sqlitedatabase.delete("hits2", ((String) (obj)), null);
                if (i1 != list.size())
                {
                    a(5, "Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(i1), obj);
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                d("Error deleting hits", list);
                throw list;
            }
        }
    }

    public final void b()
    {
        o();
        r().beginTransaction();
    }

    public final void b(long l1)
    {
        v.g();
        o();
        ArrayList arraylist = new ArrayList(1);
        arraylist.add(Long.valueOf(l1));
        a("Deleting hit, id", Long.valueOf(l1));
        a(arraylist);
    }

    public final void c()
    {
        o();
        r().setTransactionSuccessful();
    }

    public final void close()
    {
        try
        {
            c.close();
            return;
        }
        catch (SQLiteException sqliteexception)
        {
            d("Sql error closing database", sqliteexception);
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            d("Error closing database", illegalstateexception);
        }
    }

    public final void d()
    {
        o();
        r().endTransaction();
    }

    final boolean e()
    {
        return q() == 0L;
    }

    public final int f()
    {
        v.g();
        o();
        if (!d.a(0x5265c00L))
        {
            return 0;
        } else
        {
            d.a();
            b("Deleting stale hits (if any)");
            int j = r().delete("hits2", "hit_time < ?", new String[] {
                Long.toString(super.i.c.a() - 0x9a7ec800L)
            });
            a("Deleted stale hits, count", Integer.valueOf(j));
            return j;
        }
    }

    public final long g()
    {
        v.g();
        o();
        return a(b, ((String []) (null)));
    }

    public final List h()
    {
        Object obj;
        Object obj1;
        obj1 = null;
        o();
        v.g();
        obj = r();
        int j;
        j = ((Integer)Z.h.a()).intValue();
        obj = ((SQLiteDatabase) (obj)).query("properties", new String[] {
            "cid", "tid", "adid", "hits_count", "params"
        }, "app_uid=?", new String[] {
            "0"
        }, null, null, null, String.valueOf(j));
        obj1 = new ArrayList();
        if (!((Cursor) (obj)).moveToFirst()) goto _L2; else goto _L1
_L1:
        String s1;
        String s2;
        s1 = ((Cursor) (obj)).getString(0);
        s2 = ((Cursor) (obj)).getString(1);
        Map map;
        long l1;
        boolean flag;
        if (((Cursor) (obj)).getInt(2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l1 = ((Cursor) (obj)).getInt(3);
        map = h(((Cursor) (obj)).getString(4));
        if (!TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s2)) goto _L4; else goto _L3
_L3:
        c("Read property with empty client id or tracker id", s1, s2);
_L6:
        if (((Cursor) (obj)).moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        if (((List) (obj1)).size() >= j)
        {
            e("Sending hits to too many properties. Campaign report might be incorrect");
        }
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return ((List) (obj1));
_L4:
        ((List) (obj1)).add(new y(s1, s2, flag, l1, map));
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L1; else goto _L7
_L7:
        obj1;
_L11:
        d("Error loading hits from the database", obj1);
        throw obj1;
        Exception exception;
        exception;
        obj1 = obj;
        obj = exception;
_L9:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
        obj;
        continue; /* Loop/switch isn't completed */
        exception;
        obj1 = obj;
        obj = exception;
        if (true) goto _L9; else goto _L8
_L8:
        obj1;
        obj = null;
        if (true) goto _L11; else goto _L10
_L10:
    }

}
