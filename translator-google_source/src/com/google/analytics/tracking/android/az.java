// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.Command;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.analytics.tracking.android:
//            h, ba, bc, bf, 
//            bb, aq, ao, an, 
//            i, l, m, u

final class az
    implements h
{

    private static final String a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[] {
        "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id"
    });
    private final bc b;
    private volatile m c;
    private final i d;
    private final Context e;
    private final String f;
    private long g;
    private l h;

    az(i j, Context context)
    {
        this(j, context, "google_analytics_v2.db");
    }

    private az(i j, Context context, String s)
    {
        e = context.getApplicationContext();
        f = s;
        d = j;
        h = new ba(this);
        b = new bc(this, e, f);
        c = new bf(new bb(this), e);
        g = 0L;
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
            aq.f(s);
            return null;
        }
        return sqlitedatabase;
    }

    static l a(az az1)
    {
        return az1.h;
    }

    private static String a(Map map)
    {
        ArrayList arraylist = new ArrayList(map.size());
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); arraylist.add((new StringBuilder()).append((String)entry.getKey()).append("=").append(ao.a((String)entry.getValue())).toString()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        return TextUtils.join("&", arraylist);
    }

    private List a(int j)
    {
        Object obj2 = a("Error opening database for peekHits");
        if (obj2 != null) goto _L2; else goto _L1
_L1:
        Object obj1 = new ArrayList();
_L8:
        return ((List) (obj1));
_L2:
        obj1 = null;
        new ArrayList();
        Object obj;
        obj = String.format("%s ASC, %s ASC", new Object[] {
            "hit_url", "hit_id"
        });
        String s = Integer.toString(j);
        obj = ((SQLiteDatabase) (obj2)).query("hits2", new String[] {
            "hit_id", "hit_time", "hit_url"
        }, null, null, null, null, ((String) (obj)), s);
        Object obj3 = new ArrayList();
        boolean flag;
        if (((Cursor) (obj)).moveToFirst())
        {
            do
            {
                obj1 = new an(((Cursor) (obj)).getLong(0), ((Cursor) (obj)).getLong(1));
                obj1.d = ((Cursor) (obj)).getString(2);
                ((List) (obj3)).add(obj1);
                flag = ((Cursor) (obj)).moveToNext();
            } while (flag);
        }
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        obj1 = obj;
        Object obj4 = String.format("%s ASC", new Object[] {
            "hit_id"
        });
        obj1 = obj;
        String s1 = Integer.toString(j);
        obj1 = obj;
        obj2 = ((SQLiteDatabase) (obj2)).query("hits2", new String[] {
            "hit_id", "hit_string"
        }, null, null, null, null, ((String) (obj4)), s1);
        if (!((Cursor) (obj2)).moveToFirst()) goto _L4; else goto _L3
_L3:
        j = 0;
_L18:
        if (!(obj2 instanceof SQLiteCursor) || ((SQLiteCursor)obj2).getWindow().getNumRows() > 0) goto _L6; else goto _L5
_L5:
        aq.f((new StringBuilder("hitString for hitId ")).append(((an)((List) (obj3)).get(j)).b).append(" too large.  Hit will be deleted.").toString());
_L9:
        boolean flag1 = ((Cursor) (obj2)).moveToNext();
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_612;
        }
_L4:
        if (obj2 != null)
        {
            ((Cursor) (obj2)).close();
        }
        return ((List) (obj3));
        obj1;
        obj = null;
_L17:
        aq.f((new StringBuilder("error in peekHits fetching hitIds: ")).append(((SQLiteException) (obj1)).getMessage()).toString());
        obj2 = new ArrayList();
        obj1 = obj2;
        if (obj == null) goto _L8; else goto _L7
_L7:
        ((Cursor) (obj)).close();
        return ((List) (obj2));
        obj;
_L16:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
_L6:
        ((an)((List) (obj3)).get(j)).a = ((Cursor) (obj2)).getString(1);
          goto _L9
        obj1;
        obj = obj2;
        obj2 = obj1;
_L15:
        obj1 = obj;
        aq.f((new StringBuilder("error in peekHits fetching hitString: ")).append(((SQLiteException) (obj2)).getMessage()).toString());
        obj1 = obj;
        obj2 = new ArrayList();
        obj1 = obj;
        obj3 = ((List) (obj3)).iterator();
        j = 0;
_L11:
        obj1 = obj;
        if (!((Iterator) (obj3)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        obj4 = (an)((Iterator) (obj3)).next();
        int k;
        k = j;
        obj1 = obj;
        if (TextUtils.isEmpty(((an) (obj4)).a))
        {
            if (j != 0)
            {
                break; /* Loop/switch isn't completed */
            }
            k = 1;
        }
        obj1 = obj;
        ((List) (obj2)).add(obj4);
        j = k;
        if (true) goto _L11; else goto _L10
        obj;
_L13:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
_L10:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return ((List) (obj2));
        obj;
        obj1 = obj2;
        if (true) goto _L13; else goto _L12
_L12:
        obj2;
        if (true) goto _L15; else goto _L14
_L14:
        Exception exception;
        exception;
        obj1 = obj;
        obj = exception;
          goto _L16
        exception;
        obj1 = obj;
        obj = exception;
          goto _L16
        obj1;
          goto _L17
        j++;
          goto _L18
    }

    private void a(Collection collection)
    {
        boolean flag;
        flag = false;
        if (collection == null)
        {
            throw new NullPointerException("hits cannot be null");
        }
        if (!collection.isEmpty()) goto _L2; else goto _L1
_L1:
        Object obj;
        return;
_L2:
        if ((obj = a("Error opening database for deleteHit")) == null) goto _L1; else goto _L3
_L3:
        String as[];
        String s;
        as = new String[collection.size()];
        s = String.format("HIT_ID in (%s)", new Object[] {
            TextUtils.join(",", Collections.nCopies(as.length, "?"))
        });
        Iterator iterator = collection.iterator();
        for (int j = 0; iterator.hasNext(); j++)
        {
            as[j] = Long.toString(((an)iterator.next()).b);
        }

        ((SQLiteDatabase) (obj)).delete("hits2", s, as);
        obj = d;
        if (d() == 0)
        {
            flag = true;
        }
        try
        {
            ((i) (obj)).a(flag);
            return;
        }
        catch (SQLiteException sqliteexception)
        {
            aq.f((new StringBuilder("Error deleting hit ")).append(collection).toString());
        }
        return;
    }

    static String b(az az1)
    {
        return az1.f;
    }

    static Context c(az az1)
    {
        return az1.e;
    }

    static String c()
    {
        return a;
    }

    private int d()
    {
        Cursor cursor;
        Object obj;
        Object obj1;
        int j;
        int k;
        obj = null;
        cursor = null;
        j = 0;
        k = 0;
        obj1 = a("Error opening database for requestNumHitsPending");
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        return k;
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
        j = (int)l1;
        k = j;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
            return j;
        }
        if (true) goto _L1; else goto _L3
_L3:
        obj;
        obj = cursor;
        aq.f("Error getting numStoredHits");
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

    public final void a()
    {
        boolean flag = true;
        Object obj = a("Error opening database for clearHits");
        if (obj != null)
        {
            if (0L == 0L)
            {
                ((SQLiteDatabase) (obj)).delete("hits2", null, null);
            } else
            {
                ((SQLiteDatabase) (obj)).delete("hits2", "hit_app_id = ?", new String[] {
                    Long.valueOf(0L).toString()
                });
            }
            obj = d;
            if (d() != 0)
            {
                flag = false;
            }
            ((i) (obj)).a(flag);
        }
    }

    public final void a(Map map, long l1, String s, Collection collection)
    {
        Object obj;
        boolean flag = true;
        long l2 = h.a();
        if (l2 > g + 0x5265c00L)
        {
            g = l2;
            obj = a("Error opening database for deleteStaleHits");
            if (obj != null)
            {
                ((SQLiteDatabase) (obj)).delete("hits2", "HIT_TIME < ?", new String[] {
                    Long.toString(h.a() - 0x9a7ec800L)
                });
                obj = d;
                int j;
                if (d() != 0)
                {
                    flag = false;
                }
                ((i) (obj)).a(flag);
            }
        }
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            obj = (Command)collection.next();
            if (!((Command) (obj)).a.equals("appendVersion"))
            {
                continue;
            }
            collection = ((Command) (obj)).c;
            obj = ((Command) (obj)).b;
            if (collection == null)
            {
                collection = "";
            }
            if (obj != null)
            {
                map.put(obj, collection);
            }
            break;
        } while (true);
        j = (d() - 2000) + 1;
        if (j > 0)
        {
            collection = a(j);
            aq.g((new StringBuilder("Store full, deleting ")).append(collection.size()).append(" hits to make room").toString());
            a(collection);
        }
        collection = a("Error opening database for putHit");
        if (collection == null) goto _L2; else goto _L1
_L1:
        obj = new ContentValues();
        ((ContentValues) (obj)).put("hit_string", a(map));
        ((ContentValues) (obj)).put("hit_time", Long.valueOf(l1));
        if (!map.containsKey("AppUID")) goto _L4; else goto _L3
_L3:
        l1 = Long.parseLong((String)map.get("AppUID"));
_L6:
        ((ContentValues) (obj)).put("hit_app_id", Long.valueOf(l1));
        map = s;
        if (s == null)
        {
            map = "http://www.google-analytics.com/collect";
        }
        if (map.length() != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        aq.f("empty path: not sending hit");
_L2:
        return;
        map;
_L4:
        l1 = 0L;
        if (true) goto _L6; else goto _L5
_L5:
        ((ContentValues) (obj)).put("hit_url", map);
        try
        {
            collection.insert("hits2", null, ((ContentValues) (obj)));
            d.a(false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            aq.f("Error storing hit");
        }
        return;
    }

    public final void b()
    {
        aq.e("dispatch running...");
        if (c.a())
        {
            List list = a(40);
            if (list.isEmpty())
            {
                aq.e("...nothing to dispatch");
                d.a(true);
                return;
            }
            int j = c.a(list);
            aq.e((new StringBuilder("sent ")).append(j).append(" of ").append(list.size()).append(" hits").toString());
            a(list.subList(0, Math.min(j, list.size())));
            if (j == list.size() && d() > 0)
            {
                u.a().c();
                return;
            }
        }
    }

}
