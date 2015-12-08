// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.bl;
import com.google.android.gms.internal.bn;
import com.google.android.gms.internal.ha;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.http.impl.client.DefaultHttpClient;

// Referenced classes of package com.google.android.gms.analytics:
//            ad, ah, p, n, 
//            ae, m, ap, q, 
//            c, am

class r
    implements ad
{

    private static final String a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[] {
        "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id"
    });
    private final a b;
    private volatile ap c;
    private final ae d;
    private final Context e;
    private final String f;
    private q g;
    private long h;
    private final int i;
    private bl j;
    private am k;
    private volatile boolean l;

    r(ae ae1, Context context, am am)
    {
        this(ae1, context, "google_analytics_v4.db", 2000, am);
    }

    r(ae ae1, Context context, String s, int i1, am am)
    {
        l = true;
        e = context.getApplicationContext();
        k = am;
        f = s;
        d = ae1;
        j = bn.c();
    /* block-local class not found */
    class a {}

        b = new a(e, f);
        c = new ah(new DefaultHttpClient(), e, k);
        h = 0L;
        i = i1;
    }

    private SQLiteDatabase a(String s)
    {
        SQLiteDatabase sqlitedatabase;
        try
        {
            sqlitedatabase = b.getWritableDatabase();
        }
        catch (SQLiteException sqliteexception)
        {
            p.d(s);
            return null;
        }
        return sqlitedatabase;
    }

    static bl a(r r1)
    {
        return r1.j;
    }

    static String a(Map map)
    {
        ArrayList arraylist = new ArrayList(map.size());
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); arraylist.add((new StringBuilder()).append(n.a((String)entry.getKey())).append("=").append(n.a((String)entry.getValue())).toString()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        return TextUtils.join("&", arraylist);
    }

    private void a(Map map, long l1, String s)
    {
        SQLiteDatabase sqlitedatabase = a("Error opening database for putHit");
        if (sqlitedatabase == null)
        {
            return;
        }
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("hit_string", a(map));
        contentvalues.put("hit_time", Long.valueOf(l1));
        if (map.containsKey("AppUID"))
        {
            try
            {
                l1 = Long.parseLong((String)map.get("AppUID"));
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                l1 = 0L;
            }
        } else
        {
            l1 = 0L;
        }
        contentvalues.put("hit_app_id", Long.valueOf(l1));
        map = s;
        if (s == null)
        {
            map = "http://www.google-analytics.com/collect";
        }
        if (map.length() == 0)
        {
            p.d("Empty path: not sending hit");
            return;
        }
        contentvalues.put("hit_url", map);
        try
        {
            sqlitedatabase.insert("hits2", null, contentvalues);
            d.a(false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            p.d("Error storing hit");
        }
    }

    private void a(Map map, Collection collection)
    {
label0:
        {
            String s = "&_v".substring(1);
            if (collection == null)
            {
                break label0;
            }
            collection = collection.iterator();
            ha ha1;
            do
            {
                if (!collection.hasNext())
                {
                    break label0;
                }
                ha1 = (ha)collection.next();
            } while (!"appendVersion".equals(ha1.a()));
            map.put(s, ha1.b());
        }
    }

    static String b(r r1)
    {
        return r1.f;
    }

    static Context c(r r1)
    {
        return r1.e;
    }

    static String e()
    {
        return a;
    }

    private void f()
    {
        int i1 = (b() - i) + 1;
        if (i1 > 0)
        {
            List list = a(i1);
            p.c((new StringBuilder()).append("Store full, deleting ").append(list.size()).append(" hits to make room.").toString());
            a((String[])list.toArray(new String[0]));
        }
    }

    int a()
    {
        boolean flag = true;
        long l1 = j.a();
        if (l1 > h + 0x5265c00L)
        {
            h = l1;
            Object obj = a("Error opening database for deleteStaleHits.");
            if (obj != null)
            {
                int i1 = ((SQLiteDatabase) (obj)).delete("hits2", "HIT_TIME < ?", new String[] {
                    Long.toString(j.a() - 0x9a7ec800L)
                });
                obj = d;
                if (b() != 0)
                {
                    flag = false;
                }
                ((ae) (obj)).a(flag);
                return i1;
            }
        }
        return 0;
    }

    List a(int i1)
    {
        Object obj;
        ArrayList arraylist;
        arraylist = new ArrayList();
        if (i1 <= 0)
        {
            p.d("Invalid maxHits specified. Skipping");
            return arraylist;
        }
        obj = a("Error opening database for peekHitIds.");
        if (obj == null)
        {
            return arraylist;
        }
        Object obj1;
        obj1 = String.format("%s ASC", new Object[] {
            "hit_id"
        });
        String s = Integer.toString(i1);
        obj1 = ((SQLiteDatabase) (obj)).query("hits2", new String[] {
            "hit_id"
        }, null, null, null, null, ((String) (obj1)), s);
        obj = obj1;
        if (!((Cursor) (obj1)).moveToFirst()) goto _L2; else goto _L1
_L1:
        obj = obj1;
        arraylist.add(String.valueOf(((Cursor) (obj1)).getLong(0)));
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
        SQLiteException sqliteexception;
        sqliteexception;
        obj1 = null;
_L6:
        obj = obj1;
        p.d((new StringBuilder()).append("Error in peekHits fetching hitIds: ").append(sqliteexception.getMessage()).toString());
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
          goto _L3
        Exception exception;
        exception;
        obj = null;
_L5:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw exception;
        exception;
        if (true) goto _L5; else goto _L4
_L4:
        sqliteexception;
          goto _L6
    }

    public void a(long l1)
    {
        boolean flag = true;
        Object obj = a("Error opening database for clearHits");
        if (obj != null)
        {
            if (l1 == 0L)
            {
                ((SQLiteDatabase) (obj)).delete("hits2", null, null);
            } else
            {
                ((SQLiteDatabase) (obj)).delete("hits2", "hit_app_id = ?", new String[] {
                    Long.valueOf(l1).toString()
                });
            }
            obj = d;
            if (b() != 0)
            {
                flag = false;
            }
            ((ae) (obj)).a(flag);
        }
    }

    void a(Collection collection)
    {
        if (collection == null || collection.isEmpty())
        {
            p.d("Empty/Null collection passed to deleteHits.");
            return;
        }
        String as[] = new String[collection.size()];
        collection = collection.iterator();
        for (int i1 = 0; collection.hasNext(); i1++)
        {
            as[i1] = String.valueOf(((m)collection.next()).b());
        }

        a(as);
    }

    public void a(Map map, long l1, String s, Collection collection)
    {
        a();
        f();
        a(map, collection);
        a(map, l1, s);
    }

    public void a(boolean flag)
    {
        l = flag;
        if (c != null)
        {
            c.a(flag);
        }
    }

    void a(String as[])
    {
        boolean flag = true;
        if (as != null && as.length != 0) goto _L2; else goto _L1
_L1:
        p.d("Empty hitIds passed to deleteHits.");
_L4:
        return;
_L2:
        Object obj = a("Error opening database for deleteHits.");
        if (obj == null) goto _L4; else goto _L3
_L3:
        String s = String.format("HIT_ID in (%s)", new Object[] {
            TextUtils.join(",", Collections.nCopies(as.length, "?"))
        });
        ((SQLiteDatabase) (obj)).delete("hits2", s, as);
        obj = d;
        SQLiteException sqliteexception;
        if (b() != 0)
        {
            flag = false;
        }
        ((ae) (obj)).a(flag);
        return;
        sqliteexception;
        p.d((new StringBuilder()).append("Error deleting hits ").append(TextUtils.join(",", as)).toString());
        return;
    }

    int b()
    {
        Cursor cursor;
        Object obj;
        Object obj1;
        int i1;
        int j1;
        obj = null;
        cursor = null;
        i1 = 0;
        j1 = 0;
        obj1 = a("Error opening database for getNumStoredHits.");
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        return j1;
_L2:
        obj1 = ((SQLiteDatabase) (obj1)).rawQuery("SELECT COUNT(*) from hits2", null);
        cursor = ((Cursor) (obj1));
        obj = obj1;
        if (!((Cursor) (obj1)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_65;
        }
        cursor = ((Cursor) (obj1));
        obj = obj1;
        long l1 = ((Cursor) (obj1)).getLong(0);
        i1 = (int)l1;
        j1 = i1;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
            return i1;
        }
        if (true) goto _L1; else goto _L3
_L3:
        obj;
        obj = cursor;
        p.d("Error getting numStoredHits");
        if (cursor == null) goto _L1; else goto _L4
_L4:
        cursor.close();
        return 0;
        Exception exception;
        exception;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw exception;
    }

    public List b(int i1)
    {
        Object obj1;
        Object obj4;
        obj1 = new ArrayList();
        obj4 = a("Error opening database for peekHits");
        if (obj4 != null) goto _L2; else goto _L1
_L1:
        Object obj2 = obj1;
_L8:
        return ((List) (obj2));
_L2:
        Object obj = null;
        obj2 = String.format("%s ASC", new Object[] {
            "hit_id"
        });
        String s = Integer.toString(i1);
        obj2 = ((SQLiteDatabase) (obj4)).query("hits2", new String[] {
            "hit_id", "hit_time"
        }, null, null, null, null, ((String) (obj2)), s);
        obj = obj2;
        Object obj3 = new ArrayList();
        boolean flag;
        if (((Cursor) (obj)).moveToFirst())
        {
            do
            {
                ((List) (obj3)).add(new m(null, ((Cursor) (obj)).getLong(0), ((Cursor) (obj)).getLong(1), ""));
                flag = ((Cursor) (obj)).moveToNext();
            } while (flag);
        }
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        obj1 = obj;
        obj2 = String.format("%s ASC", new Object[] {
            "hit_id"
        });
        obj1 = obj;
        String s1 = Integer.toString(i1);
        obj1 = obj;
        obj2 = ((SQLiteDatabase) (obj4)).query("hits2", new String[] {
            "hit_id", "hit_string", "hit_url"
        }, null, null, null, null, ((String) (obj2)), s1);
        if (!((Cursor) (obj2)).moveToFirst()) goto _L4; else goto _L3
_L3:
        i1 = 0;
_L18:
        if (((SQLiteCursor)obj2).getWindow().getNumRows() <= 0) goto _L6; else goto _L5
_L5:
        ((m)((List) (obj3)).get(i1)).a(((Cursor) (obj2)).getString(1));
        ((m)((List) (obj3)).get(i1)).b(((Cursor) (obj2)).getString(2));
_L9:
        boolean flag1 = ((Cursor) (obj2)).moveToNext();
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_638;
        }
_L4:
        if (obj2 != null)
        {
            ((Cursor) (obj2)).close();
        }
        return ((List) (obj3));
        obj2;
        obj3 = null;
        obj = obj1;
        obj1 = obj3;
_L17:
        p.d((new StringBuilder()).append("Error in peekHits fetching hitIds: ").append(((SQLiteException) (obj2)).getMessage()).toString());
        obj2 = obj;
        if (obj1 == null) goto _L8; else goto _L7
_L7:
        ((Cursor) (obj1)).close();
        return ((List) (obj));
        obj2;
        obj1 = obj;
        obj = obj2;
_L16:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
_L6:
        p.d(String.format("HitString for hitId %d too large.  Hit will be deleted.", new Object[] {
            Long.valueOf(((m)((List) (obj3)).get(i1)).b())
        }));
          goto _L9
        obj1;
        obj = obj2;
        obj2 = obj1;
_L15:
        obj1 = obj;
        p.d((new StringBuilder()).append("Error in peekHits fetching hitString: ").append(((SQLiteException) (obj2)).getMessage()).toString());
        obj1 = obj;
        obj2 = new ArrayList();
        i1 = 0;
        obj1 = obj;
        obj3 = ((List) (obj3)).iterator();
_L11:
        obj1 = obj;
        if (!((Iterator) (obj3)).hasNext())
        {
            break MISSING_BLOCK_LABEL_542;
        }
        obj1 = obj;
        obj4 = (m)((Iterator) (obj3)).next();
        obj1 = obj;
        flag1 = TextUtils.isEmpty(((m) (obj4)).a());
        int j1;
        j1 = i1;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_558;
        }
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_555;
        }
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return ((List) (obj2));
        j1 = 1;
        obj1 = obj;
        ((List) (obj2)).add(obj4);
        i1 = j1;
        if (true) goto _L11; else goto _L10
_L10:
        obj;
_L13:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
        obj;
        obj1 = obj2;
        if (true) goto _L13; else goto _L12
_L12:
        obj2;
        if (true) goto _L15; else goto _L14
_L14:
        obj2;
        obj1 = obj;
        obj = obj2;
          goto _L16
        obj;
          goto _L16
        obj2;
        obj3 = obj;
        obj = obj1;
        obj1 = obj3;
          goto _L17
        obj2;
        obj1 = obj;
        obj = obj3;
          goto _L17
        i1++;
          goto _L18
    }

    public void c()
    {
        boolean flag = true;
        p.c("Dispatch running...");
        if (!c.a())
        {
            return;
        }
        List list = b(20);
        if (list.isEmpty())
        {
            p.c("...nothing to dispatch");
            d.a(true);
            return;
        }
        if (g == null)
        {
            g = new q("_t=dispatch&_v=ma4.0.4", false);
        }
        int i1;
        if (b() > list.size())
        {
            flag = false;
        }
        i1 = c.a(list, g, flag);
        p.c((new StringBuilder()).append("sent ").append(i1).append(" of ").append(list.size()).append(" hits").toString());
        a(list.subList(0, Math.min(i1, list.size())));
        if (i1 == list.size() && b() > 0)
        {
            com.google.android.gms.analytics.c.a(e).e();
            return;
        } else
        {
            g = null;
            return;
        }
    }

    public ap d()
    {
        return c;
    }

}
