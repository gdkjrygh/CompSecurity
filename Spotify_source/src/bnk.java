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

final class bnk extends bnd
    implements Closeable
{

    private static final String a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[] {
        "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id"
    });
    private static final String b = String.format("SELECT MAX(%s) FROM %s WHERE 1;", new Object[] {
        "hit_time", "hits2"
    });
    private final bnl c;
    private final bmv d;
    private final bmv e;

    bnk(bnf bnf1)
    {
        super(bnf1);
        d = new bmv(super.f.c);
        e = new bmv(super.f.c);
        c = new bnl(this, bnf1.a, "google_analytics_v4.db");
    }

    private long a(String s, String as[])
    {
        Object obj;
        Object obj1;
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = r();
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

    static bmv a(bnk bnk1)
    {
        return bnk1.e;
    }

    private List c(long l)
    {
        Object obj;
        Object obj1;
        ArrayList arraylist;
        obj1 = null;
        bnf.i();
        m();
        if (l <= 0L)
        {
            return Collections.emptyList();
        }
        obj = r();
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

    private long g(String s)
    {
        Cursor cursor;
        Cursor cursor1;
        Object obj;
        cursor1 = null;
        cursor = null;
        obj = r();
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

    private Map h(String s)
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

    private Map i(String s)
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
        return "google_analytics_v4.db";
    }

    static String p()
    {
        return a;
    }

    private long q()
    {
        bnf.i();
        m();
        return g("SELECT COUNT(*) FROM hits2");
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
            d("Error opening database", sqliteexception);
            throw sqliteexception;
        }
        return sqlitedatabase;
    }

    public final long a(String s, String s1)
    {
        btl.a(s);
        btl.a(s1);
        m();
        bnf.i();
        return a("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[] {
            "0", s, s1
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
        int j;
        long l1;
        if (l < 0L)
        {
            flag = false;
        }
        btl.b(flag);
        bnf.i();
        m();
        obj2 = r();
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
        j = ((Cursor) (obj1)).getInt(4);
        obj = obj1;
        ((List) (obj2)).add(new bmj(this, h(s), l1, bmz.e(s1), l, j));
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

    public final void a(bmj bmj1)
    {
        long l;
        btl.a(bmj1);
        bnf.i();
        m();
        btl.a(bmj1);
        Object obj = new android.net.Uri.Builder();
        Object obj1 = bmj1.a.entrySet().iterator();
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
            super.f.a().a(bmj1, "Hit length exceeds the maximum allowed size");
            return;
        }
        int j = ((Integer)bnz.c.a).intValue();
        l = q();
        if (l > (long)(j - 1))
        {
            obj1 = c((l - (long)j) + 1L);
            d("Store full, deleting hits to make room, count", Integer.valueOf(((List) (obj1)).size()));
            a(((List) (obj1)));
        }
        obj1 = r();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("hit_string", ((String) (obj)));
        contentvalues.put("hit_time", Long.valueOf(bmj1.d));
        contentvalues.put("hit_app_id", Integer.valueOf(bmj1.e));
        if (bmj1.f)
        {
            obj = bns.h();
        } else
        {
            obj = bns.i();
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
            catch (bmj bmj1)
            {
                e("Error storing a hit", bmj1);
            }
            return;
        }
        b("Hit saved to database. db-id, hit", Long.valueOf(l), bmj1);
        return;
    }

    public final void a(bnh bnh1)
    {
        btl.a(bnh1);
        m();
        bnf.i();
        SQLiteDatabase sqlitedatabase = r();
        Object obj1 = bnh1.e;
        btl.a(obj1);
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
        ((ContentValues) (obj1)).put("app_uid", Long.valueOf(0L));
        ((ContentValues) (obj1)).put("cid", bnh1.a);
        ((ContentValues) (obj1)).put("tid", bnh1.b);
        int j;
        if (bnh1.c)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        ((ContentValues) (obj1)).put("adid", Integer.valueOf(j));
        ((ContentValues) (obj1)).put("hits_count", Long.valueOf(bnh1.d));
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
        catch (bnh bnh1)
        {
            e("Error storing a property", bnh1);
        }
    }

    public final void a(String s)
    {
        btl.a(s);
        m();
        bnf.i();
        int j = r().delete("properties", "app_uid=? AND cid<>?", new String[] {
            "0", s
        });
        if (j > 0)
        {
            a("Deleted property records", Integer.valueOf(j));
        }
    }

    public final void a(List list)
    {
        btl.a(list);
        bnf.i();
        m();
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
                int k = sqlitedatabase.delete("hits2", ((String) (obj)), null);
                if (k != list.size())
                {
                    a(5, "Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(k), obj);
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
        m();
        r().beginTransaction();
    }

    public final void b(long l)
    {
        bnf.i();
        m();
        ArrayList arraylist = new ArrayList(1);
        arraylist.add(Long.valueOf(l));
        a("Deleting hit, id", Long.valueOf(l));
        a(arraylist);
    }

    public final void c()
    {
        m();
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
        m();
        r().endTransaction();
    }

    final boolean e()
    {
        return q() == 0L;
    }

    public final int f()
    {
        bnf.i();
        m();
        if (!d.a(0x5265c00L))
        {
            return 0;
        } else
        {
            d.a();
            b("Deleting stale hits (if any)");
            int j = r().delete("hits2", "hit_time < ?", new String[] {
                Long.toString(super.f.c.a() - 0x9a7ec800L)
            });
            a("Deleted stale hits, count", Integer.valueOf(j));
            return j;
        }
    }

    public final long g()
    {
        bnf.i();
        m();
        return a(b, ((String []) (null)));
    }

    public final List h()
    {
        Object obj;
        Object obj1;
        obj1 = null;
        m();
        bnf.i();
        obj = r();
        int j;
        j = ((Integer)bnz.d.a).intValue();
        obj = ((SQLiteDatabase) (obj)).query("properties", new String[] {
            "cid", "tid", "adid", "hits_count", "params"
        }, "app_uid=?", new String[] {
            "0"
        }, null, null, null, String.valueOf(j));
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
        map = i(((Cursor) (obj)).getString(4));
        if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) goto _L4; else goto _L3
_L3:
        c("Read property with empty client id or tracker id", s, s1);
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
        ((List) (obj1)).add(new bnh(s, s1, flag, l, map));
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
