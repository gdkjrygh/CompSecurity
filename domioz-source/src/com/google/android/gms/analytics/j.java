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
import android.util.Pair;
import com.google.android.gms.common.internal.ap;
import com.google.android.gms.internal.io;
import com.google.android.gms.internal.ip;
import com.google.android.gms.internal.zzik;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.http.impl.client.DefaultHttpClient;

// Referenced classes of package com.google.android.gms.analytics:
//            u, k, y, h, 
//            g, f, v, ak, 
//            i, a, ai

final class j
    implements u
{

    private static final String a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[] {
        "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id"
    });
    private static final String b = String.format("SELECT COUNT(*), MIN(%s), MAX(%s) FROM %s WHERE 1;", new Object[] {
        "hit_time", "hit_time", "hits2"
    });
    private final k c;
    private volatile ak d;
    private final v e;
    private final Context f;
    private final String g;
    private i h;
    private long i;
    private final int j;
    private io k;
    private ai l;
    private volatile boolean m;

    j(v v1, Context context, ai ai)
    {
        this(v1, context, "google_analytics_v4.db", ai);
    }

    private j(v v1, Context context, String s, ai ai)
    {
        m = true;
        f = context.getApplicationContext();
        l = ai;
        g = s;
        e = v1;
        k = ip.c();
        c = new k(this, f, g);
        d = new y(new DefaultHttpClient(), f, l);
        i = 0L;
        j = 2000;
    }

    private SQLiteDatabase a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = c.getWritableDatabase();
        s = sqlitedatabase;
_L2:
        this;
        JVM INSTR monitorexit ;
        return s;
        SQLiteException sqliteexception;
        sqliteexception;
        com.google.android.gms.analytics.h.d(s);
        s = null;
        if (true) goto _L2; else goto _L1
_L1:
        s;
        throw s;
    }

    static io a(j j1)
    {
        return j1.k;
    }

    private static String a(Map map)
    {
        ArrayList arraylist = new ArrayList(map.size());
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); arraylist.add((new StringBuilder()).append(com.google.android.gms.analytics.g.a((String)entry.getKey())).append("=").append(com.google.android.gms.analytics.g.a((String)entry.getValue())).toString()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        return TextUtils.join("&", arraylist);
    }

    private List a(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist = new ArrayList();
        if (i1 > 0) goto _L2; else goto _L1
_L1:
        com.google.android.gms.analytics.h.d("Invalid maxHits specified. Skipping");
_L3:
        this;
        JVM INSTR monitorexit ;
        return arraylist;
_L2:
        Object obj = a("Error opening database for peekHitIds.");
        if (obj != null) goto _L4; else goto _L3
_L4:
        Object obj1;
        obj1 = String.format("%s ASC", new Object[] {
            "hit_id"
        });
        String s = Integer.toString(i1);
        obj1 = ((SQLiteDatabase) (obj)).query("hits2", new String[] {
            "hit_id"
        }, null, null, null, null, ((String) (obj1)), s);
        obj = obj1;
        if (!((Cursor) (obj1)).moveToFirst()) goto _L6; else goto _L5
_L5:
        obj = obj1;
        arraylist.add(String.valueOf(((Cursor) (obj1)).getLong(0)));
        obj = obj1;
        boolean flag = ((Cursor) (obj1)).moveToNext();
        if (flag) goto _L5; else goto _L6
_L6:
        if (obj1 == null) goto _L3; else goto _L7
_L7:
        ((Cursor) (obj1)).close();
          goto _L3
        SQLiteException sqliteexception;
        sqliteexception;
        obj1 = null;
_L11:
        obj = obj1;
        com.google.android.gms.analytics.h.d((new StringBuilder("Error in peekHits fetching hitIds: ")).append(sqliteexception.getMessage()).toString());
        if (obj1 == null) goto _L3; else goto _L8
_L8:
        ((Cursor) (obj1)).close();
          goto _L3
        obj;
        throw obj;
        Exception exception;
        exception;
        obj = null;
_L10:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        ((Cursor) (obj)).close();
        throw exception;
        exception;
        if (true) goto _L10; else goto _L9
_L9:
        sqliteexception;
          goto _L11
    }

    private void a(Collection collection)
    {
        if (collection == null || collection.isEmpty())
        {
            com.google.android.gms.analytics.h.d("Empty/Null collection passed to deleteHits.");
            return;
        }
        String as[] = new String[collection.size()];
        collection = collection.iterator();
        for (int i1 = 0; collection.hasNext(); i1++)
        {
            as[i1] = String.valueOf(((f)collection.next()).b());
        }

        a(as);
    }

    private void a(Map map, long l1, String s)
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = a("Error opening database for putHit");
        if (sqlitedatabase != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ContentValues contentvalues;
        boolean flag;
        contentvalues = new ContentValues();
        contentvalues.put("hit_string", a(map));
        contentvalues.put("hit_time", Long.valueOf(l1));
        flag = map.containsKey("AppUID");
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        l1 = Long.parseLong((String)map.get("AppUID"));
_L3:
        contentvalues.put("hit_app_id", Long.valueOf(l1));
        map = s;
        if (s == null)
        {
            map = "http://www.google-analytics.com/collect";
        }
        if (map.length() != 0)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        com.google.android.gms.analytics.h.d("Empty path: not sending hit");
          goto _L1
        map;
        throw map;
        map;
        l1 = 0L;
          goto _L3
        contentvalues.put("hit_url", map);
        sqlitedatabase.insert("hits2", null, contentvalues);
        e.a(false);
          goto _L1
        map;
        com.google.android.gms.analytics.h.d("Error storing hit");
          goto _L1
    }

    private static void a(Map map, Collection collection)
    {
label0:
        {
            String s = "&_v".substring(1);
            if (collection == null)
            {
                break label0;
            }
            collection = collection.iterator();
            zzik zzik1;
            do
            {
                if (!collection.hasNext())
                {
                    break label0;
                }
                zzik1 = (zzik)collection.next();
            } while (!"appendVersion".equals(zzik1.a()));
            map.put(s, zzik1.b());
        }
    }

    private void a(String as[])
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        if (as == null) goto _L2; else goto _L1
_L1:
        if (as.length != 0) goto _L3; else goto _L2
_L2:
        com.google.android.gms.analytics.h.d("Empty hitIds passed to deleteHits.");
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        Object obj = a("Error opening database for deleteHits.");
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        String s = String.format("HIT_ID in (%s)", new Object[] {
            TextUtils.join(",", Collections.nCopies(as.length, "?"))
        });
        ((SQLiteDatabase) (obj)).delete("hits2", s, as);
        obj = e;
        SQLiteException sqliteexception;
        if (h() != 0)
        {
            flag = false;
        }
        ((v) (obj)).a(flag);
        continue; /* Loop/switch isn't completed */
        sqliteexception;
        com.google.android.gms.analytics.h.d((new StringBuilder("Error deleting hits ")).append(TextUtils.join(",", as)).toString());
        if (true) goto _L5; else goto _L4
_L4:
        as;
        throw as;
    }

    static String b(j j1)
    {
        return j1.g;
    }

    static Context c(j j1)
    {
        return j1.f;
    }

    static String e()
    {
        return a;
    }

    private List f()
    {
        Object obj = null;
        this;
        JVM INSTR monitorenter ;
        Object obj1;
        Object obj3;
        obj1 = new ArrayList();
        obj3 = a("Error opening database for peekHits");
        if (obj3 != null) goto _L2; else goto _L1
_L1:
        Object obj2 = obj1;
_L8:
        this;
        JVM INSTR monitorexit ;
        return ((List) (obj2));
_L2:
        obj2 = String.format("%s ASC", new Object[] {
            "hit_id"
        });
        String s = Integer.toString(20);
        obj2 = ((SQLiteDatabase) (obj3)).query("hits2", new String[] {
            "hit_id", "hit_time"
        }, null, null, null, null, ((String) (obj2)), s);
        obj = obj2;
        obj2 = new ArrayList();
        boolean flag;
        if (((Cursor) (obj)).moveToFirst())
        {
            do
            {
                ((List) (obj2)).add(new f(((Cursor) (obj)).getLong(0), ((Cursor) (obj)).getLong(1), ""));
                flag = ((Cursor) (obj)).moveToNext();
            } while (flag);
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        ((Cursor) (obj)).close();
        obj1 = obj;
        Object obj6 = String.format("%s ASC", new Object[] {
            "hit_id"
        });
        obj1 = obj;
        String s1 = Integer.toString(20);
        obj1 = obj;
        obj3 = ((SQLiteDatabase) (obj3)).query("hits2", new String[] {
            "hit_id", "hit_string", "hit_url"
        }, null, null, null, null, ((String) (obj6)), s1);
        if (!((Cursor) (obj3)).moveToFirst()) goto _L4; else goto _L3
_L3:
        int i1 = 0;
_L17:
        if (((SQLiteCursor)obj3).getWindow().getNumRows() <= 0) goto _L6; else goto _L5
_L5:
        ((f)((List) (obj2)).get(i1)).a(((Cursor) (obj3)).getString(1));
        ((f)((List) (obj2)).get(i1)).b(((Cursor) (obj3)).getString(2));
_L10:
        boolean flag1 = ((Cursor) (obj3)).moveToNext();
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_630;
        }
_L4:
        if (obj3 == null) goto _L8; else goto _L7
_L7:
        ((Cursor) (obj3)).close();
          goto _L8
        obj2;
        obj3 = null;
        obj = obj1;
        obj1 = obj3;
_L16:
        com.google.android.gms.analytics.h.d((new StringBuilder("Error in peekHits fetching hitIds: ")).append(((SQLiteException) (obj2)).getMessage()).toString());
        obj2 = obj;
        if (obj1 == null) goto _L8; else goto _L9
_L9:
        ((Cursor) (obj1)).close();
        obj2 = obj;
          goto _L8
        obj;
        throw obj;
        obj2;
        obj1 = obj;
        obj = obj2;
_L15:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_389;
        }
        ((Cursor) (obj1)).close();
        throw obj;
_L6:
        com.google.android.gms.analytics.h.d(String.format("HitString for hitId %d too large.  Hit will be deleted.", new Object[] {
            Long.valueOf(((f)((List) (obj2)).get(i1)).b())
        }));
          goto _L10
        obj1;
        obj = obj3;
        obj3 = obj1;
_L14:
        obj1 = obj;
        com.google.android.gms.analytics.h.d((new StringBuilder("Error in peekHits fetching hitString: ")).append(((SQLiteException) (obj3)).getMessage()).toString());
        obj1 = obj;
        obj3 = new ArrayList();
        obj1 = obj;
        obj2 = ((List) (obj2)).iterator();
        i1 = 0;
_L12:
        obj1 = obj;
        if (!((Iterator) (obj2)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        obj6 = (f)((Iterator) (obj2)).next();
        int j1;
        j1 = i1;
        obj1 = obj;
        if (TextUtils.isEmpty(((f) (obj6)).a()))
        {
            if (i1 != 0)
            {
                break; /* Loop/switch isn't completed */
            }
            j1 = 1;
        }
        obj1 = obj;
        ((List) (obj3)).add(obj6);
        i1 = j1;
        if (true) goto _L12; else goto _L11
        obj;
_L13:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_562;
        }
        ((Cursor) (obj1)).close();
        throw obj;
_L11:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_574;
        }
        ((Cursor) (obj)).close();
        obj2 = obj3;
          goto _L8
        obj;
        obj1 = obj3;
          goto _L13
        obj3;
          goto _L14
        obj2;
        obj1 = obj;
        obj = obj2;
          goto _L15
        obj;
          goto _L15
        obj2;
        Object obj4 = obj;
        obj = obj1;
        obj1 = obj4;
          goto _L16
        SQLiteException sqliteexception;
        sqliteexception;
        Object obj5 = obj;
        obj = obj2;
        obj2 = sqliteexception;
        sqliteexception = ((SQLiteException) (obj5));
          goto _L16
        i1++;
          goto _L17
    }

    private int g()
    {
        boolean flag = false;
        int i1 = 0;
        this;
        JVM INSTR monitorenter ;
        long l1;
        long l2;
        l1 = k.a();
        l2 = i;
        if (l1 > l2 + 0x5265c00L) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return i1;
_L2:
        Object obj;
        i = l1;
        obj = a("Error opening database for deleteStaleHits.");
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = ((SQLiteDatabase) (obj)).delete("hits2", "HIT_TIME < ?", new String[] {
            Long.toString(k.a() - 0x9a7ec800L)
        });
        obj = e;
        if (h() == 0)
        {
            flag = true;
        }
        ((v) (obj)).a(flag);
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private int h()
    {
        Object obj;
        Object obj1;
        int i1;
        obj1 = null;
        obj = null;
        i1 = 0;
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        Object obj2 = a("Error opening database for getNumStoredHits.");
        if (obj2 != null) goto _L2; else goto _L1
_L1:
        int j1 = ((flag) ? 1 : 0);
_L4:
        this;
        JVM INSTR monitorexit ;
        return j1;
_L2:
        obj2 = ((SQLiteDatabase) (obj2)).rawQuery("SELECT COUNT(*) from hits2", null);
        obj = obj2;
        obj1 = obj2;
        if (!((Cursor) (obj2)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_73;
        }
        obj = obj2;
        obj1 = obj2;
        long l1 = ((Cursor) (obj2)).getLong(0);
        i1 = (int)l1;
        j1 = i1;
        if (obj2 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        ((Cursor) (obj2)).close();
        j1 = i1;
        continue; /* Loop/switch isn't completed */
        obj;
        throw obj;
        obj1;
        obj1 = obj;
        com.google.android.gms.analytics.h.d("Error getting numStoredHits");
        j1 = ((flag) ? 1 : 0);
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        ((Cursor) (obj)).close();
        j1 = ((flag) ? 1 : 0);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        ((Cursor) (obj1)).close();
        throw exception;
    }

    public final void a()
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        Object obj = a("Error opening database for clearHits");
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (0L != 0L)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        ((SQLiteDatabase) (obj)).delete("hits2", null, null);
_L3:
        obj = e;
        Exception exception;
        if (h() != 0)
        {
            flag = false;
        }
        ((v) (obj)).a(flag);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        ((SQLiteDatabase) (obj)).delete("hits2", "hit_app_id = ?", new String[] {
            Long.valueOf(0L).toString()
        });
          goto _L3
        exception;
        throw exception;
    }

    public final void a(Map map, long l1, String s, Collection collection)
    {
        g();
        int i1 = (h() - j) + 1;
        if (i1 > 0)
        {
            List list = a(i1);
            com.google.android.gms.analytics.h.c((new StringBuilder("Store full, deleting ")).append(list.size()).append(" hits to make room.").toString());
            a((String[])list.toArray(new String[0]));
        }
        a(map, collection);
        a(map, l1, s);
    }

    public final void a(boolean flag)
    {
        m = flag;
        if (d != null)
        {
            d.a(flag);
        }
    }

    public final Pair b()
    {
        Object obj1 = null;
        Object obj = null;
        this;
        JVM INSTR monitorenter ;
        Object obj2;
        Pair pair;
        ap.c("getMinMaxHitTimes may not be called from the main thread");
        pair = Pair.create(Long.valueOf(0L), Long.valueOf(0L));
        obj2 = a("Error opening database for getMinMaxHitTimes.");
        if (obj2 != null) goto _L2; else goto _L1
_L1:
        obj1 = pair;
_L4:
        this;
        JVM INSTR monitorexit ;
        return ((Pair) (obj1));
_L2:
        Cursor cursor = ((SQLiteDatabase) (obj2)).rawQuery(b, null);
        obj2 = pair;
        obj = cursor;
        obj1 = cursor;
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_105;
        }
        obj = cursor;
        obj1 = cursor;
        obj2 = Pair.create(Long.valueOf(cursor.getLong(1)), Long.valueOf(cursor.getLong(2)));
        obj1 = obj2;
        if (cursor == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        cursor.close();
        obj1 = obj2;
        continue; /* Loop/switch isn't completed */
        obj;
        throw obj;
        obj1;
        obj1 = obj;
        com.google.android.gms.analytics.h.d("Error getting minMaxHitTimes");
        obj1 = pair;
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        ((Cursor) (obj)).close();
        obj1 = pair;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        ((Cursor) (obj1)).close();
        throw exception;
    }

    public final void c()
    {
        boolean flag = true;
        com.google.android.gms.analytics.h.c("Dispatch running...");
        if (!d.a())
        {
            return;
        }
        List list = f();
        if (list.isEmpty())
        {
            com.google.android.gms.analytics.h.c("...nothing to dispatch");
            e.a(true);
            return;
        }
        if (h == null)
        {
            h = new i("_t=dispatch&_v=ma4.0.6");
        }
        int i1;
        if (h() > list.size())
        {
            flag = false;
        }
        i1 = d.a(list, h, flag);
        com.google.android.gms.analytics.h.c((new StringBuilder("sent ")).append(i1).append(" of ").append(list.size()).append(" hits").toString());
        a(list.subList(0, Math.min(i1, list.size())));
        if (i1 == list.size() && h() > 0)
        {
            com.google.android.gms.analytics.a.a(f).f();
            return;
        } else
        {
            h = null;
            return;
        }
    }

    public final ak d()
    {
        return d;
    }

}
