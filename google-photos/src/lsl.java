// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.http.impl.client.DefaultHttpClient;

final class lsl
    implements lrs
{

    private static final String a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL,'%s' INTEGER NOT NULL);", new Object[] {
        "gtm_hits", "hit_id", "hit_time", "hit_url", "hit_first_send_time"
    });
    private final lsn b;
    private volatile lva c;
    private final lrt d;
    private final Context e;
    private final String f;
    private long g;
    private kdh h;
    private final int i;

    lsl(lrt lrt1, Context context)
    {
        this(lrt1, context, "gtm_urls.db", 2000);
    }

    private lsl(lrt lrt1, Context context, String s, int j)
    {
        e = context.getApplicationContext();
        f = s;
        d = lrt1;
        h = kdj.c();
        b = new lsn(this, e, f);
        c = new ltp(new DefaultHttpClient(), e, new lsm(this));
        g = 0L;
        i = 2000;
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
            lqh.b(s);
            return null;
        }
        return sqlitedatabase;
    }

    private List a(int j)
    {
        Object obj;
        ArrayList arraylist;
        arraylist = new ArrayList();
        if (j <= 0)
        {
            lqh.b("Invalid maxHits specified. Skipping");
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
        String s = Integer.toString(j);
        obj1 = ((SQLiteDatabase) (obj)).query("gtm_hits", new String[] {
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
        lqh.b((new StringBuilder("Error in peekHits fetching hitIds: ")).append(sqliteexception.getMessage()).toString());
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

    static kdh a(lsl lsl1)
    {
        return lsl1.h;
    }

    private void a(long l)
    {
        a(new String[] {
            String.valueOf(l)
        });
    }

    static void a(lsl lsl1, long l)
    {
        lsl1.a(l);
    }

    static void a(lsl lsl1, long l, long l1)
    {
        SQLiteDatabase sqlitedatabase;
        ContentValues contentvalues;
        sqlitedatabase = lsl1.a("Error opening database for getNumStoredHits.");
        if (sqlitedatabase == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        contentvalues = new ContentValues();
        contentvalues.put("hit_first_send_time", Long.valueOf(l1));
        sqlitedatabase.update("gtm_hits", contentvalues, "hit_id=?", new String[] {
            String.valueOf(l)
        });
        return;
        SQLiteException sqliteexception;
        sqliteexception;
        lqh.b((new StringBuilder("Error setting HIT_FIRST_DISPATCH_TIME for hitId: ")).append(l).toString());
        lsl1.a(l);
        return;
    }

    private void a(String as[])
    {
        boolean flag = true;
        if (as != null && as.length != 0) goto _L2; else goto _L1
_L1:
        SQLiteDatabase sqlitedatabase;
        return;
_L2:
        if ((sqlitedatabase = a("Error opening database for deleteHits.")) == null) goto _L1; else goto _L3
_L3:
        String s = String.format("HIT_ID in (%s)", new Object[] {
            TextUtils.join(",", Collections.nCopies(as.length, "?"))
        });
        sqlitedatabase.delete("gtm_hits", s, as);
        as = d;
        if (c() != 0)
        {
            flag = false;
        }
        as.a(flag);
        return;
        as;
        lqh.b("Error deleting hits");
        return;
    }

    static String b()
    {
        return a;
    }

    static String b(lsl lsl1)
    {
        return lsl1.f;
    }

    private List b(int j)
    {
        Object obj1;
        Object obj4;
        obj1 = new ArrayList();
        obj4 = a("Error opening database for peekHits");
        if (obj4 != null) goto _L2; else goto _L1
_L1:
        Object obj2 = obj1;
_L11:
        return ((List) (obj2));
_L2:
        Object obj = null;
        obj2 = String.format("%s ASC", new Object[] {
            "hit_id"
        });
        String s = Integer.toString(40);
        obj2 = ((SQLiteDatabase) (obj4)).query("gtm_hits", new String[] {
            "hit_id", "hit_time", "hit_first_send_time"
        }, null, null, null, null, ((String) (obj2)), s);
        obj = obj2;
        Object obj3 = new ArrayList();
        boolean flag;
        if (((Cursor) (obj)).moveToFirst())
        {
            do
            {
                ((List) (obj3)).add(new lro(((Cursor) (obj)).getLong(0), ((Cursor) (obj)).getLong(1), ((Cursor) (obj)).getLong(2)));
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
        String s1 = Integer.toString(40);
        obj1 = obj;
        obj2 = ((SQLiteDatabase) (obj4)).query("gtm_hits", new String[] {
            "hit_id", "hit_url"
        }, null, null, null, null, ((String) (obj2)), s1);
        if (!((Cursor) (obj2)).moveToFirst()) goto _L4; else goto _L3
_L3:
        j = 0;
_L18:
        if (((SQLiteCursor)obj2).getWindow().getNumRows() <= 0) goto _L6; else goto _L5
_L5:
        obj = (lro)((List) (obj3)).get(j);
        obj1 = ((Cursor) (obj2)).getString(1);
        if (obj1 == null) goto _L8; else goto _L7
_L7:
        if (!TextUtils.isEmpty(((String) (obj1)).trim())) goto _L9; else goto _L8
_L8:
        boolean flag1 = ((Cursor) (obj2)).moveToNext();
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_628;
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
        lqh.b((new StringBuilder("Error in peekHits fetching hitIds: ")).append(((SQLiteException) (obj2)).getMessage()).toString());
        obj2 = obj;
        if (obj1 == null) goto _L11; else goto _L10
_L10:
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
_L9:
        obj.c = ((String) (obj1));
          goto _L8
        obj1;
        obj = obj2;
        obj2 = obj1;
_L15:
        obj1 = obj;
        lqh.b((new StringBuilder("Error in peekHits fetching hit url: ")).append(((SQLiteException) (obj2)).getMessage()).toString());
        obj1 = obj;
        obj2 = new ArrayList();
        j = 0;
        obj1 = obj;
        obj3 = ((List) (obj3)).iterator();
_L13:
        obj1 = obj;
        if (!((Iterator) (obj3)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        obj4 = (lro)((Iterator) (obj3)).next();
        int k;
        k = j;
        obj1 = obj;
        if (TextUtils.isEmpty(((lro) (obj4)).c))
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
        if (true) goto _L13; else goto _L12
        obj;
_L14:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
_L6:
        lqh.b(String.format("HitString for hitId %d too large.  Hit will be deleted.", new Object[] {
            Long.valueOf(((lro)((List) (obj3)).get(j)).a)
        }));
          goto _L8
        obj;
        obj1 = obj2;
          goto _L14
_L12:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return ((List) (obj2));
        obj2;
          goto _L15
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
        j++;
          goto _L18
    }

    private int c()
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
        obj1 = a("Error opening database for getNumStoredHits.");
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        return k;
_L2:
        obj1 = ((SQLiteDatabase) (obj1)).rawQuery("SELECT COUNT(*) from gtm_hits", null);
        cursor = ((Cursor) (obj1));
        obj = obj1;
        if (!((Cursor) (obj1)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_64;
        }
        cursor = ((Cursor) (obj1));
        obj = obj1;
        long l = ((Cursor) (obj1)).getLong(0);
        j = (int)l;
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
        lqh.b("Error getting numStoredHits");
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

    static Context c(lsl lsl1)
    {
        return lsl1.e;
    }

    private int d()
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = a("Error opening database for getNumStoredHits.");
        if (obj == null)
        {
            return 0;
        }
        obj = ((SQLiteDatabase) (obj)).query("gtm_hits", new String[] {
            "hit_id", "hit_first_send_time"
        }, "hit_first_send_time=0", null, null, null, null);
        int k = ((Cursor) (obj)).getCount();
        int j;
        j = k;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
            j = k;
        }
_L1:
        return j;
        obj;
        obj = null;
_L4:
        lqh.b("Error getting num untried hits");
        SQLiteException sqliteexception;
        Exception exception;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
            j = 0;
        } else
        {
            j = 0;
        }
          goto _L1
        obj;
_L3:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
        exception;
        obj1 = obj;
        obj = exception;
        continue; /* Loop/switch isn't completed */
        exception;
        obj1 = obj;
        obj = exception;
        if (true) goto _L3; else goto _L2
_L2:
        sqliteexception;
          goto _L4
    }

    public final void a()
    {
        lqh.d("GTM Dispatch running...");
        if (c.a())
        {
            List list = b(40);
            if (list.isEmpty())
            {
                lqh.d("...nothing to dispatch");
                d.a(true);
                return;
            }
            c.a(list);
            if (d() > 0)
            {
                lqm.a().c();
                return;
            }
        }
    }

    public final void a(long l, String s)
    {
        long l1;
        boolean flag;
        flag = true;
        l1 = h.a();
        if (l1 > g + 0x5265c00L) goto _L2; else goto _L1
_L1:
        SQLiteDatabase sqlitedatabase;
        ContentValues contentvalues;
        int j = (c() - i) + 1;
        if (j > 0)
        {
            List list = a(j);
            lqh.d((new StringBuilder("Store full, deleting ")).append(list.size()).append(" hits to make room.").toString());
            a((String[])list.toArray(new String[0]));
        }
        sqlitedatabase = a("Error opening database for putHit");
        if (sqlitedatabase == null)
        {
            break MISSING_BLOCK_LABEL_178;
        }
        contentvalues = new ContentValues();
        contentvalues.put("hit_time", Long.valueOf(l));
        contentvalues.put("hit_url", s);
        contentvalues.put("hit_first_send_time", Integer.valueOf(0));
        sqlitedatabase.insert("gtm_hits", null, contentvalues);
        d.a(false);
        return;
_L2:
        g = l1;
        Object obj = a("Error opening database for deleteStaleHits.");
        if (obj != null)
        {
            ((SQLiteDatabase) (obj)).delete("gtm_hits", "HIT_TIME < ?", new String[] {
                Long.toString(h.a() - 0x9a7ec800L)
            });
            obj = d;
            if (c() != 0)
            {
                flag = false;
            }
            ((lrt) (obj)).a(flag);
        }
        if (true) goto _L1; else goto _L3
_L3:
        s;
        lqh.b("Error storing hit");
        return;
    }

}
