// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

final class jrt extends jsw
    implements Closeable
{

    private static final String a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[] {
        "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id"
    });
    private static final String b = String.format("SELECT MAX(%s) FROM %s WHERE 1;", new Object[] {
        "hit_time", "hits2"
    });
    private final jru c;
    private final jsu e = new jsu(g());
    private final jsu f = new jsu(g());

    jrt(jrk jrk1)
    {
        super(jrk1);
        String s = u();
        c = new jru(this, jrk1.a, s);
    }

    private long a(String s, String as[])
    {
        Object obj;
        Object obj1;
        obj = null;
        as = null;
        obj1 = t();
        obj1 = ((SQLiteDatabase) (obj1)).rawQuery(s, null);
        as = ((String []) (obj1));
        obj = obj1;
        if (!((Cursor) (obj1)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_66;
        }
        as = ((String []) (obj1));
        obj = obj1;
        long l = ((Cursor) (obj1)).getLong(0);
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        return l;
        as = ((String []) (obj1));
        obj = obj1;
        throw new SQLiteException("Database returned empty set");
        SQLiteException sqliteexception;
        sqliteexception;
        obj = as;
        d("Database error", s, sqliteexception);
        obj = as;
        throw sqliteexception;
        s;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw s;
    }

    private long a(String s, String as[], long l)
    {
        Object obj;
        Object obj1;
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = t();
        obj = null;
        obj1 = null;
        as = sqlitedatabase.rawQuery(s, as);
        if (!as.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_49;
        }
        l = as.getLong(0);
        if (as != null)
        {
            as.close();
        }
        return l;
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
        d("Database error", s, obj1);
        obj = as;
        throw obj1;
        s;
_L2:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw s;
        s;
        obj = as;
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private Map a(String s)
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
                s = (new StringBuilder("?")).append(s).toString();
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

    static jsu a(jrt jrt1)
    {
        return jrt1.f;
    }

    static String b(jrt jrt1)
    {
        return jrt1.u();
    }

    private List d(long l)
    {
        Object obj;
        Object obj1;
        ArrayList arraylist;
        obj1 = null;
        jrk.i();
        r();
        if (l <= 0L)
        {
            return Collections.emptyList();
        }
        obj = t();
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

    private Map g(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return new HashMap(0);
        }
        try
        {
            Object obj = URLEncodedUtils.parse(new URI((new StringBuilder("?")).append(s).toString()), "UTF-8");
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

    static String o()
    {
        return a;
    }

    private long p()
    {
        jrk.i();
        r();
        return a("SELECT COUNT(*) FROM hits2", ((String []) (null)));
    }

    private SQLiteDatabase t()
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

    private String u()
    {
        if (!kbe.a)
        {
            return "google_analytics_v4.db";
        }
        if (i().a())
        {
            return "google_analytics_v4.db";
        } else
        {
            return "google_analytics2_v4.db";
        }
    }

    public final long a(long l, String s, String s1)
    {
        b.o(s);
        b.o(s1);
        r();
        jrk.i();
        return a("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[] {
            String.valueOf(l), s, s1
        }, 0L);
    }

    public final List a(long l)
    {
        Object obj;
        Object obj1;
        boolean flag = true;
        obj1 = null;
        Object obj2;
        String s;
        String s1;
        int i;
        long l1;
        if (l < 0L)
        {
            flag = false;
        }
        b.b(flag);
        jrk.i();
        r();
        obj2 = t();
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
        i = ((Cursor) (obj1)).getInt(4);
        obj = obj1;
        ((List) (obj2)).add(new jsn(this, a(s), l1, jtk.c(s1), l, i));
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

    protected final void a()
    {
    }

    public final void a(long l, String s)
    {
        b.o(s);
        r();
        jrk.i();
        int i = t().delete("properties", "app_uid=? AND cid<>?", new String[] {
            String.valueOf(l), s
        });
        if (i > 0)
        {
            a("Deleted property records", Integer.valueOf(i));
        }
    }

    public final void a(List list)
    {
        b.d(list);
        jrk.i();
        r();
        if (!list.isEmpty())
        {
            Object obj = new StringBuilder("hit_id");
            ((StringBuilder) (obj)).append(" in (");
            for (int i = 0; i < list.size(); i++)
            {
                Long long1 = (Long)list.get(i);
                if (long1 == null || long1.longValue() == 0L)
                {
                    throw new SQLiteException("Invalid hit id");
                }
                if (i > 0)
                {
                    ((StringBuilder) (obj)).append(",");
                }
                ((StringBuilder) (obj)).append(long1);
            }

            ((StringBuilder) (obj)).append(")");
            obj = ((StringBuilder) (obj)).toString();
            try
            {
                SQLiteDatabase sqlitedatabase = t();
                a("Deleting dispatched hits. count", Integer.valueOf(list.size()));
                int j = sqlitedatabase.delete("hits2", ((String) (obj)), null);
                if (j != list.size())
                {
                    b("Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(j), obj);
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

    public final void a(jrn jrn1)
    {
        b.d(jrn1);
        r();
        jrk.i();
        SQLiteDatabase sqlitedatabase = t();
        Object obj1 = jrn1.f;
        b.d(obj1);
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
        ((ContentValues) (obj1)).put("app_uid", Long.valueOf(jrn1.a));
        ((ContentValues) (obj1)).put("cid", jrn1.b);
        ((ContentValues) (obj1)).put("tid", jrn1.c);
        int i;
        if (jrn1.d)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        ((ContentValues) (obj1)).put("adid", Integer.valueOf(i));
        ((ContentValues) (obj1)).put("hits_count", Long.valueOf(jrn1.e));
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
        catch (jrn jrn1)
        {
            e("Error storing a property", jrn1);
        }
    }

    public final void a(jsn jsn1)
    {
        long l;
        b.d(jsn1);
        jrk.i();
        r();
        b.d(jsn1);
        Object obj = new android.net.Uri.Builder();
        Object obj1 = jsn1.a.entrySet().iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
            String s = (String)entry.getKey();
            if (!"ht".equals(s) && !"qt".equals(s) && !"AppUID".equals(s))
            {
                ((android.net.Uri.Builder) (obj)).appendQueryParameter(s, (String)entry.getValue());
            }
        } while (true);
        obj = ((android.net.Uri.Builder) (obj)).build().getEncodedQuery();
        if (obj == null)
        {
            obj = "";
        }
        if (((String) (obj)).length() > 8192)
        {
            super.d.a().a(jsn1, "Hit length exceeds the maximum allowed size");
            return;
        }
        int i = ((Integer)jsl.c.a()).intValue();
        l = p();
        if (l > (long)(i - 1))
        {
            obj1 = d((l - (long)i) + 1L);
            d("Store full, deleting hits to make room, count", Integer.valueOf(((List) (obj1)).size()));
            a(((List) (obj1)));
        }
        obj1 = t();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("hit_string", ((String) (obj)));
        contentvalues.put("hit_time", Long.valueOf(jsn1.d));
        contentvalues.put("hit_app_id", Integer.valueOf(jsn1.e));
        if (jsn1.f)
        {
            obj = jsh.h();
        } else
        {
            obj = jsh.i();
        }
        contentvalues.put("hit_url", ((String) (obj)));
        l = ((SQLiteDatabase) (obj1)).insert("hits2", null, contentvalues);
        if (l == -1L)
        {
            try
            {
                f("Failed to insert a hit (got -1)");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (jsn jsn1)
            {
                e("Error storing a hit", jsn1);
            }
            return;
        }
        b("Hit saved to database. db-id, hit", Long.valueOf(l), jsn1);
        return;
    }

    public final void b()
    {
        r();
        t().beginTransaction();
    }

    public final void b(long l)
    {
        jrk.i();
        r();
        ArrayList arraylist = new ArrayList(1);
        arraylist.add(Long.valueOf(l));
        a("Deleting hit, id", Long.valueOf(l));
        a(arraylist);
    }

    public final List c(long l)
    {
        Cursor cursor;
        Cursor cursor1;
        Object obj1;
        r();
        jrk.i();
        obj1 = t();
        cursor1 = null;
        cursor = cursor1;
        int i = ((Integer)jsl.d.a()).intValue();
        cursor = cursor1;
        cursor1 = ((SQLiteDatabase) (obj1)).query("properties", new String[] {
            "cid", "tid", "adid", "hits_count", "params"
        }, "app_uid=?", new String[] {
            "0"
        }, null, null, null, String.valueOf(i));
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
        boolean flag;
        if (cursor1.getInt(2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        cursor = cursor1;
        l = cursor1.getInt(3);
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
        if (((List) (obj1)).size() < i)
        {
            break MISSING_BLOCK_LABEL_273;
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
        ((List) (obj1)).add(new jrn(0L, s, s1, flag, l, map));
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

    public final void c()
    {
        r();
        t().setTransactionSuccessful();
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
            e("Sql error closing database", sqliteexception);
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            e("Error closing database", illegalstateexception);
        }
    }

    public final void d()
    {
        r();
        t().endTransaction();
    }

    final boolean e()
    {
        return p() == 0L;
    }

    public final int m()
    {
        jrk.i();
        r();
        if (!e.a(0x5265c00L))
        {
            return 0;
        } else
        {
            e.a();
            b("Deleting stale hits (if any)");
            int i = t().delete("hits2", "hit_time < ?", new String[] {
                Long.toString(g().a() - 0x9a7ec800L)
            });
            a("Deleted stale hits, count", Integer.valueOf(i));
            return i;
        }
    }

    public final long n()
    {
        jrk.i();
        r();
        return a(b, ((String []) (null)), 0L);
    }

}
