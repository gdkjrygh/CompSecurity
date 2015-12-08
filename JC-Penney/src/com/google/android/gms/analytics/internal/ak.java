// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.d.q;
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

// Referenced classes of package com.google.android.gms.analytics.internal:
//            z, q, al, ab, 
//            bb, d, ae, j, 
//            r

class ak extends z
    implements Closeable
{

    private static final String a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[] {
        "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id"
    });
    private static final String b = String.format("SELECT MAX(%s) FROM %s WHERE 1;", new Object[] {
        "hit_time", "hits2"
    });
    private final al c;
    private final com.google.android.gms.analytics.internal.q d = new com.google.android.gms.analytics.internal.q(n());
    private final com.google.android.gms.analytics.internal.q e = new com.google.android.gms.analytics.internal.q(n());

    ak(ab ab1)
    {
        super(ab1);
        String s = G();
        c = new al(this, ab1.b(), s);
    }

    private void F()
    {
        int k = q().y();
        long l = e();
        if (l > (long)(k - 1))
        {
            List list = a((l - (long)k) + 1L);
            d("Store full, deleting hits to make room, count", Integer.valueOf(list.size()));
            a(list);
        }
    }

    private String G()
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
        sqlitedatabase = i();
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
        sqlitedatabase = i();
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

    static com.google.android.gms.analytics.internal.q a(ak ak1)
    {
        return ak1.e;
    }

    private static String a(Map map)
    {
        u.a(map);
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

    static String b(ak ak1)
    {
        return ak1.G();
    }

    private String b(d d1)
    {
        if (d1.f())
        {
            return q().o();
        } else
        {
            return q().p();
        }
    }

    private static String c(d d1)
    {
        u.a(d1);
        Object obj = new android.net.Uri.Builder();
        d1 = d1.b().entrySet().iterator();
        do
        {
            if (!d1.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)d1.next();
            String s = (String)entry.getKey();
            if (!"ht".equals(s) && !"qt".equals(s) && !"AppUID".equals(s))
            {
                ((android.net.Uri.Builder) (obj)).appendQueryParameter(s, (String)entry.getValue());
            }
        } while (true);
        obj = ((android.net.Uri.Builder) (obj)).build().getEncodedQuery();
        d1 = ((d) (obj));
        if (obj == null)
        {
            d1 = "";
        }
        return d1;
    }

    static String j()
    {
        return a;
    }

    public long a(long l, String s, String s1)
    {
        u.a(s);
        u.a(s1);
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
        obj = i();
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
        u.a(s);
        D();
        m();
        int k = i().delete("properties", "app_uid=? AND cid<>?", new String[] {
            String.valueOf(l), s
        });
        if (k > 0)
        {
            a("Deleted property records", Integer.valueOf(k));
        }
    }

    public void a(ae ae1)
    {
        u.a(ae1);
        D();
        m();
        SQLiteDatabase sqlitedatabase = i();
        String s = a(ae1.f());
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("app_uid", Long.valueOf(ae1.a()));
        contentvalues.put("cid", ae1.b());
        contentvalues.put("tid", ae1.c());
        int k;
        if (ae1.d())
        {
            k = 1;
        } else
        {
            k = 0;
        }
        contentvalues.put("adid", Integer.valueOf(k));
        contentvalues.put("hits_count", Long.valueOf(ae1.e()));
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
        catch (ae ae1)
        {
            e("Error storing a property", ae1);
        }
    }

    public void a(d d1)
    {
        SQLiteDatabase sqlitedatabase;
        ContentValues contentvalues;
        u.a(d1);
        m();
        D();
        String s = c(d1);
        if (s.length() > 8192)
        {
            p().a(d1, "Hit length exceeds the maximum allowed size");
            return;
        }
        F();
        sqlitedatabase = i();
        contentvalues = new ContentValues();
        contentvalues.put("hit_string", s);
        contentvalues.put("hit_time", Long.valueOf(d1.d()));
        contentvalues.put("hit_app_id", Integer.valueOf(d1.a()));
        contentvalues.put("hit_url", b(d1));
        long l = sqlitedatabase.insert("hits2", null, contentvalues);
        if (l == -1L)
        {
            try
            {
                f("Failed to insert a hit (got -1)");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (d d1)
            {
                e("Error storing a hit", d1);
            }
            return;
        }
        b("Hit saved to database. db-id, hit", Long.valueOf(l), d1);
        return;
    }

    public void a(List list)
    {
        u.a(list);
        m();
        D();
        if (!list.isEmpty())
        {
            Object obj = new StringBuilder("hit_id");
            ((StringBuilder) (obj)).append(" in (");
            for (int k = 0; k < list.size(); k++)
            {
                Long long1 = (Long)list.get(k);
                if (long1 == null || long1.longValue() == 0L)
                {
                    throw new SQLiteException("Invalid hit id");
                }
                if (k > 0)
                {
                    ((StringBuilder) (obj)).append(",");
                }
                ((StringBuilder) (obj)).append(long1);
            }

            ((StringBuilder) (obj)).append(")");
            obj = ((StringBuilder) (obj)).toString();
            try
            {
                SQLiteDatabase sqlitedatabase = i();
                a("Deleting dispatched hits. count", Integer.valueOf(list.size()));
                int l = sqlitedatabase.delete("hits2", ((String) (obj)), null);
                if (l != list.size())
                {
                    b("Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(l), obj);
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
        int k;
        long l1;
        if (l < 0L)
        {
            flag = false;
        }
        u.a(flag);
        m();
        D();
        obj2 = i();
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
        k = ((Cursor) (obj1)).getInt(4);
        obj = obj1;
        ((List) (obj2)).add(new d(this, a(s), l1, r.d(s1), l, k));
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
        i().beginTransaction();
    }

    public void c()
    {
        D();
        i().setTransactionSuccessful();
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
        obj1 = i();
        cursor1 = null;
        cursor = cursor1;
        int k = q().z();
        cursor = cursor1;
        cursor1 = ((SQLiteDatabase) (obj1)).query("properties", new String[] {
            "cid", "tid", "adid", "hits_count", "params"
        }, "app_uid=?", new String[] {
            String.valueOf(l)
        }, null, null, null, String.valueOf(k));
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
        if (((List) (obj1)).size() < k)
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
        ((List) (obj1)).add(new ae(l, s, s1, flag, l1, map));
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
        i().endTransaction();
    }

    public long e()
    {
        m();
        D();
        return a("SELECT COUNT(*) FROM hits2", ((String []) (null)));
    }

    boolean f()
    {
        return e() == 0L;
    }

    public int g()
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
            int k = i().delete("hits2", "hit_time < ?", new String[] {
                Long.toString(n().a() - 0x9a7ec800L)
            });
            a("Deleted stale hits, count", Integer.valueOf(k));
            return k;
        }
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

    public long h()
    {
        m();
        D();
        return a(b, ((String []) (null)), 0L);
    }

    SQLiteDatabase i()
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

}
