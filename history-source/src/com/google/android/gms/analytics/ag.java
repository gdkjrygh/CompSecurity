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
import com.google.android.gms.internal.ha;
import com.google.android.gms.internal.ld;
import com.google.android.gms.internal.lf;
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
//            d, h, ac, ae, 
//            e, ab, r, af, 
//            GoogleAnalytics, o, t

class ag
    implements d
{
    class a extends SQLiteOpenHelper
    {

        private boolean BZ;
        private long Ca;
        final ag Cb;

        private void a(SQLiteDatabase sqlitedatabase)
        {
            Cursor cursor;
            HashSet hashset;
            boolean flag1;
            flag1 = false;
            cursor = sqlitedatabase.rawQuery("SELECT * FROM hits2 WHERE 0", null);
            hashset = new HashSet();
            String as[] = cursor.getColumnNames();
            int i = 0;
_L2:
            if (i >= as.length)
            {
                break; /* Loop/switch isn't completed */
            }
            hashset.add(as[i]);
            i++;
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
            ae.W((new StringBuilder()).append("Error querying for table ").append(s).toString());
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
            if (BZ && Ca + 0x36ee80L > ag.a(Cb).currentTimeMillis())
            {
                throw new SQLiteException("Database creation failed");
            }
            sqlitedatabase = null;
            BZ = true;
            Ca = ag.a(Cb).currentTimeMillis();
            SQLiteDatabase sqlitedatabase1 = super.getWritableDatabase();
            sqlitedatabase = sqlitedatabase1;
_L2:
            SQLiteDatabase sqlitedatabase2 = sqlitedatabase;
            if (sqlitedatabase == null)
            {
                sqlitedatabase2 = super.getWritableDatabase();
            }
            BZ = false;
            return sqlitedatabase2;
            SQLiteException sqliteexception;
            sqliteexception;
            ag.c(Cb).getDatabasePath(ag.b(Cb)).delete();
            if (true) goto _L2; else goto _L1
_L1:
        }

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            t.ag(sqlitedatabase.getPath());
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
                sqlitedatabase.execSQL(ag.fk());
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

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
        }

        a(Context context, String s)
        {
            Cb = ag.this;
            super(context, s, null, 1);
            Ca = 0L;
        }
    }


    private static final String BS = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[] {
        "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id"
    });
    private final a BT;
    private volatile r BU;
    private final String BV;
    private af BW;
    private long BX;
    private final int BY;
    private final Context mContext;
    private ld wb;
    private o ys;
    private volatile boolean yt;
    private final e zc;

    ag(e e1, Context context, o o)
    {
        this(e1, context, "google_analytics_v4.db", 2000, o);
    }

    ag(e e1, Context context, String s, int i, o o)
    {
        yt = true;
        mContext = context.getApplicationContext();
        ys = o;
        BV = s;
        zc = e1;
        wb = lf._mthif();
        BT = new a(mContext, BV);
        BU = new h(new DefaultHttpClient(), mContext, ys);
        BX = 0L;
        BY = i;
    }

    static String A(Map map)
    {
        ArrayList arraylist = new ArrayList(map.size());
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); arraylist.add((new StringBuilder()).append(ac.encode((String)entry.getKey())).append("=").append(ac.encode((String)entry.getValue())).toString()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        return TextUtils.join("&", arraylist);
    }

    static ld a(ag ag1)
    {
        return ag1.wb;
    }

    private void a(Map map, long l1, String s)
    {
        SQLiteDatabase sqlitedatabase = al("Error opening database for putHit");
        if (sqlitedatabase == null)
        {
            return;
        }
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("hit_string", A(map));
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
            ae.W("Empty path: not sending hit");
            return;
        }
        contentvalues.put("hit_url", map);
        try
        {
            sqlitedatabase.insert("hits2", null, contentvalues);
            zc.B(false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            ae.W("Error storing hit");
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
            } while (!"appendVersion".equals(ha1.getId()));
            map.put(s, ha1.getValue());
        }
    }

    private SQLiteDatabase al(String s)
    {
        SQLiteDatabase sqlitedatabase;
        try
        {
            sqlitedatabase = BT.getWritableDatabase();
        }
        catch (SQLiteException sqliteexception)
        {
            ae.W(s);
            return null;
        }
        return sqlitedatabase;
    }

    static String b(ag ag1)
    {
        return ag1.BV;
    }

    static Context c(ag ag1)
    {
        return ag1.mContext;
    }

    private void fh()
    {
        int i = (fj() - BY) + 1;
        if (i > 0)
        {
            List list = G(i);
            ae.V((new StringBuilder()).append("Store full, deleting ").append(list.size()).append(" hits to make room.").toString());
            b((String[])list.toArray(new String[0]));
        }
    }

    static String fk()
    {
        return BS;
    }

    List G(int i)
    {
        Object obj;
        ArrayList arraylist;
        arraylist = new ArrayList();
        if (i <= 0)
        {
            ae.W("Invalid maxHits specified. Skipping");
            return arraylist;
        }
        obj = al("Error opening database for peekHitIds.");
        if (obj == null)
        {
            return arraylist;
        }
        Object obj1;
        obj1 = String.format("%s ASC", new Object[] {
            "hit_id"
        });
        String s = Integer.toString(i);
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
        ae.W((new StringBuilder()).append("Error in peekHits fetching hitIds: ").append(sqliteexception.getMessage()).toString());
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

    public List H(int i)
    {
        Object obj1;
        Object obj4;
        obj1 = new ArrayList();
        obj4 = al("Error opening database for peekHits");
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
        String s = Integer.toString(i);
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
                ((List) (obj3)).add(new ab(null, ((Cursor) (obj)).getLong(0), ((Cursor) (obj)).getLong(1), ""));
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
        String s1 = Integer.toString(i);
        obj1 = obj;
        obj2 = ((SQLiteDatabase) (obj4)).query("hits2", new String[] {
            "hit_id", "hit_string", "hit_url"
        }, null, null, null, null, ((String) (obj2)), s1);
        if (!((Cursor) (obj2)).moveToFirst()) goto _L4; else goto _L3
_L3:
        i = 0;
_L18:
        if (((SQLiteCursor)obj2).getWindow().getNumRows() <= 0) goto _L6; else goto _L5
_L5:
        ((ab)((List) (obj3)).get(i)).aj(((Cursor) (obj2)).getString(1));
        ((ab)((List) (obj3)).get(i)).ak(((Cursor) (obj2)).getString(2));
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
        ae.W((new StringBuilder()).append("Error in peekHits fetching hitIds: ").append(((SQLiteException) (obj2)).getMessage()).toString());
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
        ae.W(String.format("HitString for hitId %d too large.  Hit will be deleted.", new Object[] {
            Long.valueOf(((ab)((List) (obj3)).get(i)).fb())
        }));
          goto _L9
        obj1;
        obj = obj2;
        obj2 = obj1;
_L15:
        obj1 = obj;
        ae.W((new StringBuilder()).append("Error in peekHits fetching hitString: ").append(((SQLiteException) (obj2)).getMessage()).toString());
        obj1 = obj;
        obj2 = new ArrayList();
        i = 0;
        obj1 = obj;
        obj3 = ((List) (obj3)).iterator();
_L11:
        obj1 = obj;
        if (!((Iterator) (obj3)).hasNext())
        {
            break MISSING_BLOCK_LABEL_542;
        }
        obj1 = obj;
        obj4 = (ab)((Iterator) (obj3)).next();
        obj1 = obj;
        flag1 = TextUtils.isEmpty(((ab) (obj4)).fa());
        int j;
        j = i;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_558;
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_555;
        }
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return ((List) (obj2));
        j = 1;
        obj1 = obj;
        ((List) (obj2)).add(obj4);
        i = j;
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
        i++;
          goto _L18
    }

    public void a(Map map, long l1, String s, Collection collection)
    {
        fi();
        fh();
        a(map, collection);
        a(map, l1, s);
    }

    void b(Collection collection)
    {
        if (collection == null || collection.isEmpty())
        {
            ae.W("Empty/Null collection passed to deleteHits.");
            return;
        }
        String as[] = new String[collection.size()];
        collection = collection.iterator();
        for (int i = 0; collection.hasNext(); i++)
        {
            as[i] = String.valueOf(((ab)collection.next()).fb());
        }

        b(as);
    }

    void b(String as[])
    {
        boolean flag = true;
        if (as != null && as.length != 0) goto _L2; else goto _L1
_L1:
        ae.W("Empty hitIds passed to deleteHits.");
_L4:
        return;
_L2:
        Object obj = al("Error opening database for deleteHits.");
        if (obj == null) goto _L4; else goto _L3
_L3:
        String s = String.format("HIT_ID in (%s)", new Object[] {
            TextUtils.join(",", Collections.nCopies(as.length, "?"))
        });
        ((SQLiteDatabase) (obj)).delete("hits2", s, as);
        obj = zc;
        SQLiteException sqliteexception;
        if (fj() != 0)
        {
            flag = false;
        }
        ((e) (obj)).B(flag);
        return;
        sqliteexception;
        ae.W((new StringBuilder()).append("Error deleting hits ").append(TextUtils.join(",", as)).toString());
        return;
    }

    public r dV()
    {
        return BU;
    }

    public void dispatch()
    {
        boolean flag = true;
        ae.V("Dispatch running...");
        if (!BU.ea())
        {
            return;
        }
        List list = H(20);
        if (list.isEmpty())
        {
            ae.V("...nothing to dispatch");
            zc.B(true);
            return;
        }
        if (BW == null)
        {
            BW = new af("_t=dispatch&_v=ma4.0.4", false);
        }
        int i;
        if (fj() > list.size())
        {
            flag = false;
        }
        i = BU.a(list, BW, flag);
        ae.V((new StringBuilder()).append("sent ").append(i).append(" of ").append(list.size()).append(" hits").toString());
        b(list.subList(0, Math.min(i, list.size())));
        if (i == list.size() && fj() > 0)
        {
            GoogleAnalytics.getInstance(mContext).dispatchLocalHits();
            return;
        } else
        {
            BW = null;
            return;
        }
    }

    int fi()
    {
        boolean flag = true;
        long l1 = wb.currentTimeMillis();
        if (l1 > BX + 0x5265c00L)
        {
            BX = l1;
            Object obj = al("Error opening database for deleteStaleHits.");
            if (obj != null)
            {
                int i = ((SQLiteDatabase) (obj)).delete("hits2", "HIT_TIME < ?", new String[] {
                    Long.toString(wb.currentTimeMillis() - 0x9a7ec800L)
                });
                obj = zc;
                if (fj() != 0)
                {
                    flag = false;
                }
                ((e) (obj)).B(flag);
                return i;
            }
        }
        return 0;
    }

    int fj()
    {
        Cursor cursor;
        Object obj;
        Object obj1;
        int i;
        int j;
        obj = null;
        cursor = null;
        i = 0;
        j = 0;
        obj1 = al("Error opening database for getNumStoredHits.");
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        return j;
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
        i = (int)l1;
        j = i;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
            return i;
        }
        if (true) goto _L1; else goto _L3
_L3:
        obj;
        obj = cursor;
        ae.W("Error getting numStoredHits");
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
        Object obj = al("Error opening database for clearHits");
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
            obj = zc;
            if (fj() != 0)
            {
                flag = false;
            }
            ((e) (obj)).B(flag);
        }
    }

    public void setDryRun(boolean flag)
    {
        yt = flag;
        if (BU != null)
        {
            BU.setDryRun(flag);
        }
    }

}
