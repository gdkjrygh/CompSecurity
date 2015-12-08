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
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.wg;
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
//            y, p, ak, aa, 
//            az, d, q, ad, 
//            j, bh, bi

final class aj extends y
    implements Closeable
{

    private static final String a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[] {
        "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id"
    });
    private static final String b = String.format("SELECT MAX(%s) FROM %s WHERE 1;", new Object[] {
        "hit_time", "hits2"
    });
    private final ak c;
    private final p d = new p(l());
    private final p e = new p(l());

    aj(aa aa1)
    {
        super(aa1);
        String s = F();
        c = new ak(this, aa1.a(), s);
    }

    private long D()
    {
        aa.r();
        B();
        return a("SELECT COUNT(*) FROM hits2");
    }

    private SQLiteDatabase E()
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

    private String F()
    {
        if (!i.a)
        {
            return "google_analytics_v4.db";
        }
        if (o().a())
        {
            return "google_analytics_v4.db";
        } else
        {
            return "google_analytics2_v4.db";
        }
    }

    private long a(String s)
    {
        Cursor cursor;
        Cursor cursor1;
        Object obj;
        cursor1 = null;
        cursor = null;
        obj = E();
        obj = ((SQLiteDatabase) (obj)).rawQuery(s, null);
        cursor = ((Cursor) (obj));
        cursor1 = ((Cursor) (obj));
        if (!((Cursor) (obj)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_66;
        }
        cursor = ((Cursor) (obj));
        cursor1 = ((Cursor) (obj));
        long l = ((Cursor) (obj)).getLong(0);
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return l;
        cursor = ((Cursor) (obj));
        cursor1 = ((Cursor) (obj));
        throw new SQLiteException("Database returned empty set");
        SQLiteException sqliteexception;
        sqliteexception;
        cursor1 = cursor;
        d("Database error", s, sqliteexception);
        cursor1 = cursor;
        throw sqliteexception;
        s;
        if (cursor1 != null)
        {
            cursor1.close();
        }
        throw s;
    }

    private long a(String s, String as[])
    {
        Object obj;
        Object obj1;
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = E();
        obj = null;
        obj1 = null;
        as = sqlitedatabase.rawQuery(s, as);
        long l;
        if (!as.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_50;
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

    static p a(aj aj1)
    {
        return aj1.e;
    }

    static String b(aj aj1)
    {
        return aj1.F();
    }

    private List c(long l)
    {
        Object obj;
        Object obj1;
        ArrayList arraylist;
        obj1 = null;
        aa.r();
        B();
        if (l <= 0L)
        {
            return Collections.emptyList();
        }
        obj = E();
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

    private Map h(String s)
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

    static String i()
    {
        return a;
    }

    public final long a(long l, String s, String s1)
    {
        bl.a(s);
        bl.a(s1);
        B();
        aa.r();
        return a("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[] {
            String.valueOf(l), s, s1
        });
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
        int k;
        long l1;
        if (l < 0L)
        {
            flag = false;
        }
        bl.b(flag);
        aa.r();
        B();
        obj2 = E();
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
        ((List) (obj2)).add(new d(this, g(s), l1, q.e(s1), l, k));
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
        bl.a(s);
        B();
        aa.r();
        int k = E().delete("properties", "app_uid=? AND cid<>?", new String[] {
            String.valueOf(l), s
        });
        if (k > 0)
        {
            a("Deleted property records", Integer.valueOf(k));
        }
    }

    public final void a(ad ad1)
    {
        bl.a(ad1);
        B();
        aa.r();
        SQLiteDatabase sqlitedatabase = E();
        Object obj1 = ad1.f();
        bl.a(obj1);
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
        ((ContentValues) (obj1)).put("app_uid", Long.valueOf(ad1.a()));
        ((ContentValues) (obj1)).put("cid", ad1.b());
        ((ContentValues) (obj1)).put("tid", ad1.c());
        int k;
        if (ad1.d())
        {
            k = 1;
        } else
        {
            k = 0;
        }
        ((ContentValues) (obj1)).put("adid", Integer.valueOf(k));
        ((ContentValues) (obj1)).put("hits_count", Long.valueOf(ad1.e()));
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
        catch (ad ad1)
        {
            e("Error storing a property", ad1);
        }
    }

    public final void a(d d1)
    {
        long l;
        bl.a(d1);
        aa.r();
        B();
        bl.a(d1);
        Object obj = new android.net.Uri.Builder();
        Object obj1 = d1.b().entrySet().iterator();
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
            n().a(d1, "Hit length exceeds the maximum allowed size");
            return;
        }
        int k = ((Integer)bh.f.a()).intValue();
        l = D();
        if (l > (long)(k - 1))
        {
            obj1 = c((l - (long)k) + 1L);
            d("Store full, deleting hits to make room, count", Integer.valueOf(((List) (obj1)).size()));
            a(((List) (obj1)));
        }
        obj1 = E();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("hit_string", ((String) (obj)));
        contentvalues.put("hit_time", Long.valueOf(d1.d()));
        contentvalues.put("hit_app_id", Integer.valueOf(d1.a()));
        if (d1.e())
        {
            obj = az.h();
        } else
        {
            obj = com.google.android.gms.analytics.internal.az.i();
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
            catch (d d1)
            {
                e("Error storing a hit", d1);
            }
            return;
        }
        b("Hit saved to database. db-id, hit", Long.valueOf(l), d1);
        return;
    }

    public final void a(List list)
    {
        bl.a(list);
        aa.r();
        B();
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
                SQLiteDatabase sqlitedatabase = E();
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

    public final void b()
    {
        B();
        E().beginTransaction();
    }

    public final void b(long l)
    {
        aa.r();
        B();
        ArrayList arraylist = new ArrayList(1);
        arraylist.add(Long.valueOf(l));
        a("Deleting hit, id", Long.valueOf(l));
        a(arraylist);
    }

    public final void c()
    {
        B();
        E().setTransactionSuccessful();
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
        B();
        E().endTransaction();
    }

    final boolean e()
    {
        return D() == 0L;
    }

    public final int f()
    {
        aa.r();
        B();
        if (!d.a(0x5265c00L))
        {
            return 0;
        } else
        {
            d.a();
            b("Deleting stale hits (if any)");
            int k = E().delete("hits2", "hit_time < ?", new String[] {
                Long.toString(l().a() - 0x9a7ec800L)
            });
            a("Deleted stale hits, count", Integer.valueOf(k));
            return k;
        }
    }

    public final long g()
    {
        aa.r();
        B();
        return a(b, ((String []) (null)));
    }

    public final List h()
    {
        Object obj;
        Object obj1;
        obj1 = null;
        B();
        aa.r();
        obj = E();
        int k;
        k = ((Integer)bh.h.a()).intValue();
        obj = ((SQLiteDatabase) (obj)).query("properties", new String[] {
            "cid", "tid", "adid", "hits_count", "params"
        }, "app_uid=?", new String[] {
            "0"
        }, null, null, null, String.valueOf(k));
        obj1 = new ArrayList();
        if (!((Cursor) (obj)).moveToFirst()) goto _L2; else goto _L1
_L1:
        String s;
        String s1;
        s = ((Cursor) (obj)).getString(0);
        s1 = ((Cursor) (obj)).getString(1);
        Map map;
        long l;
        boolean flag;
        if (((Cursor) (obj)).getInt(2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l = ((Cursor) (obj)).getInt(3);
        map = h(((Cursor) (obj)).getString(4));
        if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) goto _L4; else goto _L3
_L3:
        c("Read property with empty client id or tracker id", s, s1);
_L6:
        if (((Cursor) (obj)).moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        if (((List) (obj1)).size() >= k)
        {
            e("Sending hits to too many properties. Campaign report might be incorrect");
        }
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return ((List) (obj1));
_L4:
        ((List) (obj1)).add(new ad(s, s1, flag, l, map));
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L1; else goto _L7
_L7:
        obj1;
_L11:
        e("Error loading hits from the database", obj1);
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
