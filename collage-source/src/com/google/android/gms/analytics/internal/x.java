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
import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.ix;
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
//            r, k, t, af, 
//            c, g, v, n, 
//            al

class x extends r
    implements Closeable
{
    class a extends SQLiteOpenHelper
    {

        final x a;

        private void a(SQLiteDatabase sqlitedatabase)
        {
            boolean flag1 = true;
            Set set = b(sqlitedatabase, "hits2");
            String as[] = new String[4];
            as[0] = "hit_id";
            as[1] = "hit_string";
            as[2] = "hit_time";
            as[3] = "hit_url";
            int i1 = as.length;
            for (int l = 0; l < i1; l++)
            {
                String s = as[l];
                if (!set.remove(s))
                {
                    throw new SQLiteException((new StringBuilder()).append("Database hits2 is missing required column: ").append(s).toString());
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

        private boolean a(SQLiteDatabase sqlitedatabase, String s)
        {
            SQLiteDatabase sqlitedatabase1 = null;
            sqlitedatabase = sqlitedatabase.query("SQLITE_MASTER", new String[] {
                "name"
            }, "name=?", new String[] {
                s
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
            a.c("Error querying for table", s, sqliteexception);
            if (sqlitedatabase1 != null)
            {
                sqlitedatabase1.close();
            }
            return false;
            sqlitedatabase;
            s = sqlitedatabase1;
_L2:
            if (s != null)
            {
                s.close();
            }
            throw sqlitedatabase;
            Exception exception;
            exception;
            s = sqlitedatabase;
            sqlitedatabase = exception;
            if (true) goto _L2; else goto _L1
_L1:
            sqliteexception;
            if (true) goto _L4; else goto _L3
_L3:
        }

        private Set b(SQLiteDatabase sqlitedatabase, String s)
        {
            HashSet hashset;
            hashset = new HashSet();
            sqlitedatabase = sqlitedatabase.rawQuery((new StringBuilder()).append("SELECT * FROM ").append(s).append(" LIMIT 0").toString(), null);
            s = sqlitedatabase.getColumnNames();
            int l = 0;
_L2:
            if (l >= s.length)
            {
                break; /* Loop/switch isn't completed */
            }
            hashset.add(s[l]);
            l++;
            if (true) goto _L2; else goto _L1
_L1:
            sqlitedatabase.close();
            return hashset;
            s;
            sqlitedatabase.close();
            throw s;
        }

        private void b(SQLiteDatabase sqlitedatabase)
        {
            int l = 0;
            sqlitedatabase = b(sqlitedatabase, "properties");
            String as[] = new String[6];
            as[0] = "app_uid";
            as[1] = "cid";
            as[2] = "tid";
            as[3] = "params";
            as[4] = "adid";
            as[5] = "hits_count";
            for (int i1 = as.length; l < i1; l++)
            {
                String s = as[l];
                if (!sqlitedatabase.remove(s))
                {
                    throw new SQLiteException((new StringBuilder()).append("Database properties is missing required column: ").append(s).toString());
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

        public SQLiteDatabase getWritableDatabase()
        {
            if (!x.a(a).a(0x36ee80L))
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
                x.a(a).a();
                a.f("Opening the database failed, dropping the table and recreating it");
                Object obj = x.b(a);
                a.o().getDatabasePath(((String) (obj))).delete();
                try
                {
                    obj = super.getWritableDatabase();
                    x.a(a).b();
                }
                catch (SQLiteException sqliteexception1)
                {
                    a.e("Failed to open freshly created database", sqliteexception1);
                    throw sqliteexception1;
                }
                return ((SQLiteDatabase) (obj));
            }
            return sqlitedatabase;
        }

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            al.a(sqlitedatabase.getPath());
        }

        public void onOpen(SQLiteDatabase sqlitedatabase)
        {
            Cursor cursor;
            if (android.os.Build.VERSION.SDK_INT >= 15)
            {
                break MISSING_BLOCK_LABEL_29;
            }
            cursor = sqlitedatabase.rawQuery("PRAGMA journal_mode=memory", null);
            cursor.moveToFirst();
            cursor.close();
            if (!a(sqlitedatabase, "hits2"))
            {
                sqlitedatabase.execSQL(x.G());
            } else
            {
                a(sqlitedatabase);
            }
            if (!a(sqlitedatabase, "properties"))
            {
                sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
                return;
            } else
            {
                b(sqlitedatabase);
                return;
            }
            sqlitedatabase;
            cursor.close();
            throw sqlitedatabase;
        }

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int l, int i1)
        {
        }

        a(Context context, String s)
        {
            a = x.this;
            super(context, s, null, 1);
        }
    }


    private static final String a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[] {
        "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id"
    });
    private static final String b = String.format("SELECT MAX(%s) FROM %s WHERE 1;", new Object[] {
        "hit_time", "hits2"
    });
    private final a c;
    private final k d = new k(n());
    private final k e = new k(n());

    x(t t1)
    {
        super(t1);
        String s = I();
        c = new a(t1.b(), s);
    }

    static String G()
    {
        return a;
    }

    private void H()
    {
        int l = q().y();
        long l1 = g();
        if (l1 > (long)(l - 1))
        {
            List list = a((l1 - (long)l) + 1L);
            d("Store full, deleting hits to make room, count", Integer.valueOf(list.size()));
            a(list);
        }
    }

    private String I()
    {
        if (!q().a())
        {
            return q().A();
        }
        if (q().b())
        {
            return q().A();
        } else
        {
            return q().B();
        }
    }

    private long a(String s, String as[])
    {
        String as1[];
        String as2[];
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = F();
        as2 = null;
        as1 = null;
        as = sqlitedatabase.rawQuery(s, as);
        as1 = as;
        as2 = as;
        if (!as.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_60;
        }
        as1 = as;
        as2 = as;
        long l = as.getLong(0);
        if (as != null)
        {
            as.close();
        }
        return l;
        as1 = as;
        as2 = as;
        try
        {
            throw new SQLiteException("Database returned empty set");
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            as2 = as1;
        }
        finally
        {
            if (as2 == null) goto _L0; else goto _L0
        }
        d("Database error", s, as);
        as2 = as1;
        throw as;
        as2.close();
        throw s;
    }

    private long a(String s, String as[], long l)
    {
        String as1[];
        String as2[];
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = F();
        as2 = null;
        as1 = null;
        as = sqlitedatabase.rawQuery(s, as);
        as1 = as;
        as2 = as;
        if (!as.moveToFirst()) goto _L2; else goto _L1
_L1:
        as1 = as;
        as2 = as;
        l = as.getLong(0);
        long l1;
        l1 = l;
        if (as != null)
        {
            as.close();
            l1 = l;
        }
_L4:
        return l1;
_L2:
        l1 = l;
        if (as == null) goto _L4; else goto _L3
_L3:
        as.close();
        return l;
        as;
        as2 = as1;
        d("Database error", s, as);
        as2 = as1;
        throw as;
        s;
        if (as2 != null)
        {
            as2.close();
        }
        throw s;
    }

    static k a(x x1)
    {
        return x1.e;
    }

    private static String a(Map map)
    {
        z.a(map);
        Object obj = new android.net.Uri.Builder();
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); ((android.net.Uri.Builder) (obj)).appendQueryParameter((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        obj = ((android.net.Uri.Builder) (obj)).build().getEncodedQuery();
        map = ((Map) (obj));
        if (obj == null)
        {
            map = "";
        }
        return map;
    }

    private String b(c c1)
    {
        if (c1.f())
        {
            return q().o();
        } else
        {
            return q().p();
        }
    }

    static String b(x x1)
    {
        return x1.I();
    }

    private static String c(c c1)
    {
        z.a(c1);
        Object obj = new android.net.Uri.Builder();
        c1 = c1.b().entrySet().iterator();
        do
        {
            if (!c1.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)c1.next();
            String s = (String)entry.getKey();
            if (!"ht".equals(s) && !"qt".equals(s) && !"AppUID".equals(s))
            {
                ((android.net.Uri.Builder) (obj)).appendQueryParameter(s, (String)entry.getValue());
            }
        } while (true);
        obj = ((android.net.Uri.Builder) (obj)).build().getEncodedQuery();
        c1 = ((c) (obj));
        if (obj == null)
        {
            c1 = "";
        }
        return c1;
    }

    SQLiteDatabase F()
    {
        SQLiteDatabase sqlitedatabase;
        try
        {
            sqlitedatabase = c.getWritableDatabase();
        }
        catch (SQLiteException sqliteexception)
        {
            d("Error opening database", sqliteexception);
            throw sqliteexception;
        }
        return sqlitedatabase;
    }

    public long a(long l, String s, String s1)
    {
        z.a(s);
        z.a(s1);
        D();
        m();
        return a("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[] {
            String.valueOf(l), s, s1
        }, 0L);
    }

    public List a(long l)
    {
        Object obj;
        Object obj1;
        ArrayList arraylist;
        obj1 = null;
        m();
        D();
        if (l <= 0L)
        {
            return Collections.emptyList();
        }
        obj = F();
        arraylist = new ArrayList();
        String s = String.format("%s ASC", new Object[] {
            "hit_id"
        });
        String s1 = Long.toString(l);
        obj = ((SQLiteDatabase) (obj)).query("hits2", new String[] {
            "hit_id"
        }, null, null, null, null, s, s1);
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
        d("Error selecting hit ids", obj2);
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

    Map a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return new HashMap(0);
        }
        Object obj;
        if (!s.startsWith("?"))
        {
            try
            {
                s = (new StringBuilder()).append("?").append(s).toString();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                e("Error parsing hit parameters", s);
                return new HashMap(0);
            }
        }
        obj = URLEncodedUtils.parse(new URI(s), "UTF-8");
        s = new HashMap(((List) (obj)).size());
        NameValuePair namevaluepair;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); s.put(namevaluepair.getName(), namevaluepair.getValue()))
        {
            namevaluepair = (NameValuePair)((Iterator) (obj)).next();
        }

        return s;
    }

    protected void a()
    {
    }

    public void a(long l, String s)
    {
        z.a(s);
        D();
        m();
        int i1 = F().delete("properties", "app_uid=? AND cid<>?", new String[] {
            String.valueOf(l), s
        });
        if (i1 > 0)
        {
            a("Deleted property records", Integer.valueOf(i1));
        }
    }

    public void a(c c1)
    {
        SQLiteDatabase sqlitedatabase;
        ContentValues contentvalues;
        z.a(c1);
        m();
        D();
        String s = c(c1);
        if (s.length() > 8192)
        {
            p().a(c1, "Hit length exceeds the maximum allowed size");
            return;
        }
        H();
        sqlitedatabase = F();
        contentvalues = new ContentValues();
        contentvalues.put("hit_string", s);
        contentvalues.put("hit_time", Long.valueOf(c1.d()));
        contentvalues.put("hit_app_id", Integer.valueOf(c1.a()));
        contentvalues.put("hit_url", b(c1));
        long l = sqlitedatabase.insert("hits2", null, contentvalues);
        if (l == -1L)
        {
            try
            {
                f("Failed to insert a hit (got -1)");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (c c1)
            {
                e("Error storing a hit", c1);
            }
            return;
        }
        b("Hit saved to database. db-id, hit", Long.valueOf(l), c1);
        return;
    }

    public void a(v v1)
    {
        z.a(v1);
        D();
        m();
        SQLiteDatabase sqlitedatabase = F();
        String s = a(v1.f());
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("app_uid", Long.valueOf(v1.a()));
        contentvalues.put("cid", v1.b());
        contentvalues.put("tid", v1.c());
        int l;
        if (v1.d())
        {
            l = 1;
        } else
        {
            l = 0;
        }
        contentvalues.put("adid", Integer.valueOf(l));
        contentvalues.put("hits_count", Long.valueOf(v1.e()));
        contentvalues.put("params", s);
        try
        {
            if (sqlitedatabase.insertWithOnConflict("properties", null, contentvalues, 5) == -1L)
            {
                f("Failed to insert/update a property (got -1)");
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (v v1)
        {
            e("Error storing a property", v1);
        }
    }

    public void a(List list)
    {
        z.a(list);
        m();
        D();
        if (!list.isEmpty())
        {
            Object obj = new StringBuilder("hit_id");
            ((StringBuilder) (obj)).append(" in (");
            for (int l = 0; l < list.size(); l++)
            {
                Long long1 = (Long)list.get(l);
                if (long1 == null || long1.longValue() == 0L)
                {
                    throw new SQLiteException("Invalid hit id");
                }
                if (l > 0)
                {
                    ((StringBuilder) (obj)).append(",");
                }
                ((StringBuilder) (obj)).append(long1);
            }

            ((StringBuilder) (obj)).append(")");
            obj = ((StringBuilder) (obj)).toString();
            try
            {
                SQLiteDatabase sqlitedatabase = F();
                a("Deleting dispatched hits. count", Integer.valueOf(list.size()));
                int i1 = sqlitedatabase.delete("hits2", ((String) (obj)), null);
                if (i1 != list.size())
                {
                    b("Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(i1), obj);
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                e("Error deleting hits", list);
                throw list;
            }
        }
    }

    public List b(long l)
    {
        Object obj;
        Object obj1;
        boolean flag = true;
        obj1 = null;
        Object obj2;
        String s;
        String s1;
        int i1;
        long l1;
        if (l < 0L)
        {
            flag = false;
        }
        z.b(flag);
        m();
        D();
        obj2 = F();
        obj = obj1;
        s = String.format("%s ASC", new Object[] {
            "hit_id"
        });
        obj = obj1;
        s1 = Long.toString(l);
        obj = obj1;
        obj1 = ((SQLiteDatabase) (obj2)).query("hits2", new String[] {
            "hit_id", "hit_time", "hit_string", "hit_url", "hit_app_id"
        }, null, null, null, null, s, s1);
        obj = obj1;
        obj2 = new ArrayList();
        obj = obj1;
        if (!((Cursor) (obj1)).moveToFirst()) goto _L2; else goto _L1
_L1:
        obj = obj1;
        l = ((Cursor) (obj1)).getLong(0);
        obj = obj1;
        l1 = ((Cursor) (obj1)).getLong(1);
        obj = obj1;
        s = ((Cursor) (obj1)).getString(2);
        obj = obj1;
        s1 = ((Cursor) (obj1)).getString(3);
        obj = obj1;
        i1 = ((Cursor) (obj1)).getInt(4);
        obj = obj1;
        ((List) (obj2)).add(new c(this, a(s), l1, n.d(s1), l, i1));
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
        e("Error loading hits from the database", obj1);
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

    public void b()
    {
        D();
        F().beginTransaction();
    }

    public void c()
    {
        D();
        F().setTransactionSuccessful();
    }

    public void c(long l)
    {
        m();
        D();
        ArrayList arraylist = new ArrayList(1);
        arraylist.add(Long.valueOf(l));
        a("Deleting hit, id", Long.valueOf(l));
        a(arraylist);
    }

    public void close()
    {
        try
        {
            c.close();
            return;
        }
        catch (SQLiteException sqliteexception)
        {
            e("Sql error closing database", sqliteexception);
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            e("Error closing database", illegalstateexception);
        }
    }

    public List d(long l)
    {
        Cursor cursor;
        Cursor cursor1;
        Object obj1;
        D();
        m();
        obj1 = F();
        cursor1 = null;
        cursor = cursor1;
        int i1 = q().z();
        cursor = cursor1;
        cursor1 = ((SQLiteDatabase) (obj1)).query("properties", new String[] {
            "cid", "tid", "adid", "hits_count", "params"
        }, "app_uid=?", new String[] {
            String.valueOf(l)
        }, null, null, null, String.valueOf(i1));
        cursor = cursor1;
        obj1 = new ArrayList();
        cursor = cursor1;
        if (!cursor1.moveToFirst()) goto _L2; else goto _L1
_L1:
        cursor = cursor1;
        String s = cursor1.getString(0);
        cursor = cursor1;
        String s1 = cursor1.getString(1);
        cursor = cursor1;
        Map map;
        long l1;
        boolean flag;
        if (cursor1.getInt(2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        cursor = cursor1;
        l1 = cursor1.getInt(3);
        cursor = cursor1;
        map = g(cursor1.getString(4));
        cursor = cursor1;
        if (TextUtils.isEmpty(s)) goto _L4; else goto _L3
_L3:
        cursor = cursor1;
        if (!TextUtils.isEmpty(s1)) goto _L5; else goto _L4
_L4:
        cursor = cursor1;
        c("Read property with empty client id or tracker id", s, s1);
_L6:
        cursor = cursor1;
        if (cursor1.moveToNext()) goto _L1; else goto _L2
_L2:
        cursor = cursor1;
        if (((List) (obj1)).size() < i1)
        {
            break MISSING_BLOCK_LABEL_271;
        }
        cursor = cursor1;
        e("Sending hits to too many properties. Campaign report might be incorrect");
        if (cursor1 != null)
        {
            cursor1.close();
        }
        return ((List) (obj1));
_L5:
        cursor = cursor1;
        ((List) (obj1)).add(new v(l, s, s1, flag, l1, map));
          goto _L6
        SQLiteException sqliteexception;
        sqliteexception;
        Object obj;
        cursor = cursor1;
        obj = sqliteexception;
_L10:
        e("Error loading hits from the database", obj);
        throw obj;
        obj;
_L8:
        if (cursor != null)
        {
            cursor.close();
        }
        throw obj;
        obj;
        if (true) goto _L8; else goto _L7
_L7:
        obj;
        cursor = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void d()
    {
        D();
        F().endTransaction();
    }

    public void e()
    {
        m();
        D();
        F().delete("hits2", null, null);
    }

    public void f()
    {
        m();
        D();
        F().delete("properties", null, null);
    }

    public long g()
    {
        m();
        D();
        return a("SELECT COUNT(*) FROM hits2", ((String []) (null)));
    }

    Map g(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return new HashMap(0);
        }
        try
        {
            Object obj = URLEncodedUtils.parse(new URI((new StringBuilder()).append("?").append(s).toString()), "UTF-8");
            s = new HashMap(((List) (obj)).size());
            NameValuePair namevaluepair;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); s.put(namevaluepair.getName(), namevaluepair.getValue()))
            {
                namevaluepair = (NameValuePair)((Iterator) (obj)).next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            e("Error parsing property parameters", s);
            return new HashMap(0);
        }
        return s;
    }

    boolean h()
    {
        return g() == 0L;
    }

    public int i()
    {
        m();
        D();
        if (!d.a(0x5265c00L))
        {
            return 0;
        } else
        {
            d.a();
            b("Deleting stale hits (if any)");
            int l = F().delete("hits2", "hit_time < ?", new String[] {
                Long.toString(n().a() - 0x9a7ec800L)
            });
            a("Deleted stale hits, count", Integer.valueOf(l));
            return l;
        }
    }

    public long j()
    {
        m();
        D();
        return a(b, ((String []) (null)), 0L);
    }

}
