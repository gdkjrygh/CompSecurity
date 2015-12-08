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
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.google.android.gms.internal.fd;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.http.impl.client.DefaultHttpClient;

// Referenced classes of package com.google.android.gms.analytics:
//            d, ah, aa, e, 
//            y, x, n, ab, 
//            GoogleAnalytics, i, p

class ac
    implements d
{
    class a extends SQLiteOpenHelper
    {

        final ac wW;
        private boolean wX;
        private long wY;

        private void a(SQLiteDatabase sqlitedatabase)
        {
            Cursor cursor;
            HashSet hashset;
            boolean flag1;
            flag1 = false;
            cursor = sqlitedatabase.rawQuery("SELECT * FROM hits2 WHERE 0", null);
            hashset = new HashSet();
            String as[] = cursor.getColumnNames();
            int j = 0;
_L2:
            if (j >= as.length)
            {
                break; /* Loop/switch isn't completed */
            }
            hashset.add(as[j]);
            j++;
            if (true) goto _L2; else goto _L1
_L1:
            cursor.close();
            if (!hashset.remove("hit_id") || !hashset.remove("hit_url") || !hashset.remove("hit_string") || !hashset.remove("hit_time"))
            {
                throw new SQLiteException("Database column missing");
            }
            break MISSING_BLOCK_LABEL_128;
            sqlitedatabase;
            cursor.close();
            throw sqlitedatabase;
            boolean flag = flag1;
            if (!hashset.remove("hit_app_id"))
            {
                flag = true;
            }
            if (!hashset.isEmpty())
            {
                throw new SQLiteException("Database has extra columns");
            }
            if (flag)
            {
                sqlitedatabase.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id");
            }
            return;
        }

        private boolean a(String s, SQLiteDatabase sqlitedatabase)
        {
            Object obj = null;
            sqlitedatabase = sqlitedatabase.query("SQLITE_MASTER", new String[] {
                "name"
            }, "name=?", new String[] {
                s
            }, null, null, null);
            boolean flag = sqlitedatabase.moveToFirst();
            if (sqlitedatabase != null)
            {
                sqlitedatabase.close();
            }
            return flag;
            sqlitedatabase;
            sqlitedatabase = null;
_L4:
            aa.D((new StringBuilder()).append("Error querying for table ").append(s).toString());
            if (sqlitedatabase != null)
            {
                sqlitedatabase.close();
            }
            return false;
            s;
            sqlitedatabase = obj;
_L2:
            if (sqlitedatabase != null)
            {
                sqlitedatabase.close();
            }
            throw s;
            s;
            continue; /* Loop/switch isn't completed */
            s;
            if (true) goto _L2; else goto _L1
_L1:
            SQLiteException sqliteexception;
            sqliteexception;
            if (true) goto _L4; else goto _L3
_L3:
        }

        public SQLiteDatabase getWritableDatabase()
        {
            SQLiteDatabase sqlitedatabase;
            if (wX && wY + 0x36ee80L > ac.a(wW).currentTimeMillis())
            {
                throw new SQLiteException("Database creation failed");
            }
            sqlitedatabase = null;
            wX = true;
            wY = ac.a(wW).currentTimeMillis();
            SQLiteDatabase sqlitedatabase1 = super.getWritableDatabase();
            sqlitedatabase = sqlitedatabase1;
_L2:
            SQLiteDatabase sqlitedatabase2 = sqlitedatabase;
            if (sqlitedatabase == null)
            {
                sqlitedatabase2 = super.getWritableDatabase();
            }
            wX = false;
            return sqlitedatabase2;
            SQLiteException sqliteexception;
            sqliteexception;
            ac.c(wW).getDatabasePath(ac.b(wW)).delete();
            if (true) goto _L2; else goto _L1
_L1:
        }

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            p.N(sqlitedatabase.getPath());
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
            if (!a("hits2", sqlitedatabase))
            {
                sqlitedatabase.execSQL(ac.du());
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

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int j, int k)
        {
        }

        a(Context context, String s)
        {
            wW = ac.this;
            super(context, s, null, 1);
            wY = 0L;
        }
    }


    private static final String wP = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[] {
        "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id"
    });
    private final Context mContext;
    private final e uc;
    private i uu = new i() {

        final ac wW;

        public long currentTimeMillis()
        {
            return System.currentTimeMillis();
        }

            
            {
                wW = ac.this;
                super();
            }
    };
    private final a wQ;
    private volatile n wR;
    private final String wS;
    private ab wT;
    private long wU;
    private final int wV;

    ac(e e1, Context context)
    {
        this(e1, context, "google_analytics_v4.db", 2000);
    }

    ac(e e1, Context context, String s, int j)
    {
        mContext = context.getApplicationContext();
        wS = s;
        uc = e1;
        wQ = new a(mContext, wS);
        wR = new ah(new DefaultHttpClient(), mContext);
        wU = 0L;
        wV = j;
    }

    private SQLiteDatabase S(String s)
    {
        SQLiteDatabase sqlitedatabase;
        try
        {
            sqlitedatabase = wQ.getWritableDatabase();
        }
        catch (SQLiteException sqliteexception)
        {
            aa.D(s);
            return null;
        }
        return sqlitedatabase;
    }

    static i a(ac ac1)
    {
        return ac1.uu;
    }

    private void a(Map map, long l1, String s)
    {
        SQLiteDatabase sqlitedatabase = S("Error opening database for putHit");
        if (sqlitedatabase == null)
        {
            return;
        }
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("hit_string", v(map));
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
            aa.D("Empty path: not sending hit");
            return;
        }
        contentvalues.put("hit_url", map);
        try
        {
            sqlitedatabase.insert("hits2", null, contentvalues);
            uc.s(false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            aa.D("Error storing hit");
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
            fd fd1;
            do
            {
                if (!collection.hasNext())
                {
                    break label0;
                }
                fd1 = (fd)collection.next();
            } while (!"appendVersion".equals(fd1.getId()));
            map.put(s, fd1.getValue());
        }
    }

    static String b(ac ac1)
    {
        return ac1.wS;
    }

    static Context c(ac ac1)
    {
        return ac1.mContext;
    }

    private void dr()
    {
        int j = (dt() - wV) + 1;
        if (j > 0)
        {
            List list = A(j);
            aa.C((new StringBuilder()).append("Store full, deleting ").append(list.size()).append(" hits to make room.").toString());
            a((String[])list.toArray(new String[0]));
        }
    }

    static String du()
    {
        return wP;
    }

    static String v(Map map)
    {
        ArrayList arraylist = new ArrayList(map.size());
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); arraylist.add((new StringBuilder()).append(y.encode((String)entry.getKey())).append("=").append(y.encode((String)entry.getValue())).toString()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        return TextUtils.join("&", arraylist);
    }

    List A(int j)
    {
        Object obj;
        ArrayList arraylist;
        arraylist = new ArrayList();
        if (j <= 0)
        {
            aa.D("Invalid maxHits specified. Skipping");
            return arraylist;
        }
        obj = S("Error opening database for peekHitIds.");
        if (obj == null)
        {
            return arraylist;
        }
        Object obj1;
        obj1 = String.format("%s ASC", new Object[] {
            "hit_id"
        });
        String s = Integer.toString(j);
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
        aa.D((new StringBuilder()).append("Error in peekHits fetching hitIds: ").append(sqliteexception.getMessage()).toString());
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

    public List B(int j)
    {
        Object obj1;
        Object obj4;
        obj1 = new ArrayList();
        obj4 = S("Error opening database for peekHits");
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
        String s = Integer.toString(j);
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
                ((List) (obj3)).add(new x(null, ((Cursor) (obj)).getLong(0), ((Cursor) (obj)).getLong(1)));
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
        String s1 = Integer.toString(j);
        obj1 = obj;
        obj2 = ((SQLiteDatabase) (obj4)).query("hits2", new String[] {
            "hit_id", "hit_string", "hit_url"
        }, null, null, null, null, ((String) (obj2)), s1);
        if (!((Cursor) (obj2)).moveToFirst()) goto _L4; else goto _L3
_L3:
        j = 0;
_L18:
        if (((SQLiteCursor)obj2).getWindow().getNumRows() <= 0) goto _L6; else goto _L5
_L5:
        ((x)((List) (obj3)).get(j)).Q(((Cursor) (obj2)).getString(1));
        ((x)((List) (obj3)).get(j)).R(((Cursor) (obj2)).getString(2));
_L9:
        boolean flag1 = ((Cursor) (obj2)).moveToNext();
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_635;
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
        aa.D((new StringBuilder()).append("Error in peekHits fetching hitIds: ").append(((SQLiteException) (obj2)).getMessage()).toString());
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
        aa.D(String.format("HitString for hitId %d too large.  Hit will be deleted.", new Object[] {
            Long.valueOf(((x)((List) (obj3)).get(j)).dl())
        }));
          goto _L9
        obj1;
        obj = obj2;
        obj2 = obj1;
_L15:
        obj1 = obj;
        aa.D((new StringBuilder()).append("Error in peekHits fetching hitString: ").append(((SQLiteException) (obj2)).getMessage()).toString());
        obj1 = obj;
        obj2 = new ArrayList();
        j = 0;
        obj1 = obj;
        obj3 = ((List) (obj3)).iterator();
_L11:
        obj1 = obj;
        if (!((Iterator) (obj3)).hasNext())
        {
            break MISSING_BLOCK_LABEL_539;
        }
        obj1 = obj;
        obj4 = (x)((Iterator) (obj3)).next();
        obj1 = obj;
        flag1 = TextUtils.isEmpty(((x) (obj4)).dk());
        int k;
        k = j;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_555;
        }
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_552;
        }
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return ((List) (obj2));
        k = 1;
        obj1 = obj;
        ((List) (obj2)).add(obj4);
        j = k;
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
        j++;
          goto _L18
    }

    public void a(Map map, long l1, String s, Collection collection)
    {
        ds();
        dr();
        a(map, collection);
        a(map, l1, s);
    }

    void a(String as[])
    {
        boolean flag = true;
        if (as != null && as.length != 0) goto _L2; else goto _L1
_L1:
        aa.D("Empty hitIds passed to deleteHits.");
_L4:
        return;
_L2:
        Object obj = S("Error opening database for deleteHits.");
        if (obj == null) goto _L4; else goto _L3
_L3:
        String s = String.format("HIT_ID in (%s)", new Object[] {
            TextUtils.join(",", Collections.nCopies(as.length, "?"))
        });
        ((SQLiteDatabase) (obj)).delete("hits2", s, as);
        obj = uc;
        SQLiteException sqliteexception;
        if (dt() != 0)
        {
            flag = false;
        }
        ((e) (obj)).s(flag);
        return;
        sqliteexception;
        aa.D((new StringBuilder()).append("Error deleting hits ").append(as).toString());
        return;
    }

    void b(Collection collection)
    {
        if (collection == null || collection.isEmpty())
        {
            aa.D("Empty/Null collection passed to deleteHits.");
            return;
        }
        String as[] = new String[collection.size()];
        collection = collection.iterator();
        for (int j = 0; collection.hasNext(); j++)
        {
            as[j] = String.valueOf(((x)collection.next()).dl());
        }

        a(as);
    }

    public void cq()
    {
        boolean flag = true;
        aa.C("Dispatch running...");
        if (!wR.cC())
        {
            return;
        }
        List list = B(40);
        if (list.isEmpty())
        {
            aa.C("...nothing to dispatch");
            uc.s(true);
            return;
        }
        if (wT == null)
        {
            wT = new ab("_t=dispatch&_v=ma4.0.2", true);
        }
        int j;
        if (dt() > list.size())
        {
            flag = false;
        }
        j = wR.a(list, wT, flag);
        aa.C((new StringBuilder()).append("sent ").append(j).append(" of ").append(list.size()).append(" hits").toString());
        b(list.subList(0, Math.min(j, list.size())));
        if (j == list.size() && dt() > 0)
        {
            GoogleAnalytics.getInstance(mContext).dispatchLocalHits();
            return;
        } else
        {
            wT = null;
            return;
        }
    }

    public n cr()
    {
        return wR;
    }

    int ds()
    {
        boolean flag = true;
        long l1 = uu.currentTimeMillis();
        if (l1 > wU + 0x5265c00L)
        {
            wU = l1;
            Object obj = S("Error opening database for deleteStaleHits.");
            if (obj != null)
            {
                int j = ((SQLiteDatabase) (obj)).delete("hits2", "HIT_TIME < ?", new String[] {
                    Long.toString(uu.currentTimeMillis() - 0x9a7ec800L)
                });
                obj = uc;
                if (dt() != 0)
                {
                    flag = false;
                }
                ((e) (obj)).s(flag);
                return j;
            }
        }
        return 0;
    }

    int dt()
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
        obj1 = S("Error opening database for getNumStoredHits.");
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
        aa.D("Error getting numStoredHits");
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

    public void l(long l1)
    {
        boolean flag = true;
        Object obj = S("Error opening database for clearHits");
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
            obj = uc;
            if (dt() != 0)
            {
                flag = false;
            }
            ((e) (obj)).s(flag);
        }
    }

}
