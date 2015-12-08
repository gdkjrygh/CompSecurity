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
import android.util.Pair;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzik;
import com.google.android.gms.internal.zzlv;
import com.google.android.gms.internal.zzlx;
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
//            zzd, zzh, zzac, zzae, 
//            zze, zzr, zzaf, GoogleAnalytics, 
//            zzab, zzo, zzt

class zzag
    implements zzd
{
    class zza extends SQLiteOpenHelper
    {

        private boolean zzFa;
        private long zzFb;
        final zzag zzFc;

        private void zza(SQLiteDatabase sqlitedatabase)
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

        private boolean zza(String s, SQLiteDatabase sqlitedatabase)
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
            zzae.zzac((new StringBuilder("Error querying for table ")).append(s).toString());
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
            if (zzFa && zzFb + 0x36ee80L > zzag.zza(zzFc).currentTimeMillis())
            {
                throw new SQLiteException("Database creation failed");
            }
            sqlitedatabase = null;
            zzFa = true;
            zzFb = zzag.zza(zzFc).currentTimeMillis();
            SQLiteDatabase sqlitedatabase1 = super.getWritableDatabase();
            sqlitedatabase = sqlitedatabase1;
_L2:
            SQLiteDatabase sqlitedatabase2 = sqlitedatabase;
            if (sqlitedatabase == null)
            {
                sqlitedatabase2 = super.getWritableDatabase();
            }
            zzFa = false;
            return sqlitedatabase2;
            SQLiteException sqliteexception;
            sqliteexception;
            zzag.zzc(zzFc).getDatabasePath(zzag.zzb(zzFc)).delete();
            if (true) goto _L2; else goto _L1
_L1:
        }

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            zzt.zzam(sqlitedatabase.getPath());
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
            if (!zza("hits2", sqlitedatabase))
            {
                sqlitedatabase.execSQL(zzag.zzgB());
                return;
            } else
            {
                zza(sqlitedatabase);
                return;
            }
            sqlitedatabase;
            cursor.close();
            throw sqlitedatabase;
        }

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
        }

        zza(Context context, String s)
        {
            zzFc = zzag.this;
            super(context, s, null, 1);
            zzFb = 0L;
        }
    }


    private static final String zzES = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[] {
        "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id"
    });
    private static final String zzET = String.format("SELECT COUNT(*), MIN(%s), MAX(%s) FROM %s WHERE 1;", new Object[] {
        "hit_time", "hit_time", "hits2"
    });
    private final Context mContext;
    private zzo zzBr;
    private volatile boolean zzBs;
    private final zze zzCb;
    private final zza zzEU;
    private volatile zzr zzEV;
    private final String zzEW;
    private zzaf zzEX;
    private long zzEY;
    private final int zzEZ;
    private zzlv zzmW;

    zzag(zze zze1, Context context, zzo zzo)
    {
        this(zze1, context, "google_analytics_v4.db", 2000, zzo);
    }

    zzag(zze zze1, Context context, String s, int i, zzo zzo)
    {
        zzBs = true;
        mContext = context.getApplicationContext();
        zzBr = zzo;
        zzEW = s;
        zzCb = zze1;
        zzmW = zzlx.zzkc();
        zzEU = new zza(mContext, zzEW);
        zzEV = new zzh(new DefaultHttpClient(), mContext, zzBr);
        zzEY = 0L;
        zzEZ = i;
    }

    static String zzD(Map map)
    {
        ArrayList arraylist = new ArrayList(map.size());
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); arraylist.add((new StringBuilder()).append(zzac.encode((String)entry.getKey())).append("=").append(zzac.encode((String)entry.getValue())).toString()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        return TextUtils.join("&", arraylist);
    }

    static zzlv zza(zzag zzag1)
    {
        return zzag1.zzmW;
    }

    private void zza(Map map, long l, String s)
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = zzar("Error opening database for putHit");
        if (sqlitedatabase != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ContentValues contentvalues;
        boolean flag;
        contentvalues = new ContentValues();
        contentvalues.put("hit_string", zzD(map));
        contentvalues.put("hit_time", Long.valueOf(l));
        flag = map.containsKey("AppUID");
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        l = Long.parseLong((String)map.get("AppUID"));
_L3:
        contentvalues.put("hit_app_id", Long.valueOf(l));
        map = s;
        if (s == null)
        {
            map = "http://www.google-analytics.com/collect";
        }
        if (map.length() != 0)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        zzae.zzac("Empty path: not sending hit");
          goto _L1
        map;
        throw map;
        map;
        l = 0L;
          goto _L3
        contentvalues.put("hit_url", map);
        sqlitedatabase.insert("hits2", null, contentvalues);
        zzCb.zzD(false);
          goto _L1
        map;
        zzae.zzac("Error storing hit");
          goto _L1
    }

    private void zza(Map map, Collection collection)
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
            } while (!"appendVersion".equals(zzik1.getId()));
            map.put(s, zzik1.getValue());
        }
    }

    private SQLiteDatabase zzar(String s)
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = zzEU.getWritableDatabase();
        s = sqlitedatabase;
_L2:
        this;
        JVM INSTR monitorexit ;
        return s;
        SQLiteException sqliteexception;
        sqliteexception;
        zzae.zzac(s);
        s = null;
        if (true) goto _L2; else goto _L1
_L1:
        s;
        throw s;
    }

    static String zzb(zzag zzag1)
    {
        return zzag1.zzEW;
    }

    static Context zzc(zzag zzag1)
    {
        return zzag1.mContext;
    }

    static String zzgB()
    {
        return zzES;
    }

    private void zzgy()
    {
        int i = (zzgA() - zzEZ) + 1;
        if (i > 0)
        {
            List list = zzM(i);
            zzae.zzab((new StringBuilder("Store full, deleting ")).append(list.size()).append(" hits to make room.").toString());
            zzb((String[])list.toArray(new String[0]));
        }
    }

    public void dispatch()
    {
        boolean flag = true;
        zzae.zzab("Dispatch running...");
        if (!zzEV.zzfk())
        {
            return;
        }
        List list = zzN(20);
        if (list.isEmpty())
        {
            zzae.zzab("...nothing to dispatch");
            zzCb.zzD(true);
            return;
        }
        if (zzEX == null)
        {
            zzEX = new zzaf("_t=dispatch&_v=ma4.0.6", false);
        }
        int i;
        if (zzgA() > list.size())
        {
            flag = false;
        }
        i = zzEV.zza(list, zzEX, flag);
        zzae.zzab((new StringBuilder("sent ")).append(i).append(" of ").append(list.size()).append(" hits").toString());
        zzb(list.subList(0, Math.min(i, list.size())));
        if (i == list.size() && zzgA() > 0)
        {
            GoogleAnalytics.getInstance(mContext).dispatchLocalHits();
            return;
        } else
        {
            zzEX = null;
            return;
        }
    }

    public void setDryRun(boolean flag)
    {
        zzBs = flag;
        if (zzEV != null)
        {
            zzEV.setDryRun(flag);
        }
    }

    List zzM(int i)
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist = new ArrayList();
        if (i > 0) goto _L2; else goto _L1
_L1:
        zzae.zzac("Invalid maxHits specified. Skipping");
_L3:
        this;
        JVM INSTR monitorexit ;
        return arraylist;
_L2:
        Object obj = zzar("Error opening database for peekHitIds.");
        if (obj != null) goto _L4; else goto _L3
_L4:
        Object obj1;
        obj1 = String.format("%s ASC", new Object[] {
            "hit_id"
        });
        String s = Integer.toString(i);
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
        zzae.zzac((new StringBuilder("Error in peekHits fetching hitIds: ")).append(sqliteexception.getMessage()).toString());
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
            break MISSING_BLOCK_LABEL_206;
        }
        ((Cursor) (obj)).close();
        throw exception;
        exception;
        if (true) goto _L10; else goto _L9
_L9:
        sqliteexception;
          goto _L11
    }

    public List zzN(int i)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj1;
        Object obj3;
        obj1 = new ArrayList();
        obj3 = zzar("Error opening database for peekHits");
        if (obj3 != null) goto _L2; else goto _L1
_L1:
        Object obj2 = obj1;
_L8:
        this;
        JVM INSTR monitorexit ;
        return ((List) (obj2));
_L2:
        Object obj = null;
        obj2 = String.format("%s ASC", new Object[] {
            "hit_id"
        });
        String s = Integer.toString(i);
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
                ((List) (obj2)).add(new zzab(null, ((Cursor) (obj)).getLong(0), ((Cursor) (obj)).getLong(1), ""));
                flag = ((Cursor) (obj)).moveToNext();
            } while (flag);
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        ((Cursor) (obj)).close();
        obj1 = obj;
        Object obj6 = String.format("%s ASC", new Object[] {
            "hit_id"
        });
        obj1 = obj;
        String s1 = Integer.toString(i);
        obj1 = obj;
        obj3 = ((SQLiteDatabase) (obj3)).query("hits2", new String[] {
            "hit_id", "hit_string", "hit_url"
        }, null, null, null, null, ((String) (obj6)), s1);
        if (!((Cursor) (obj3)).moveToFirst()) goto _L4; else goto _L3
_L3:
        i = 0;
_L17:
        if (((SQLiteCursor)obj3).getWindow().getNumRows() <= 0) goto _L6; else goto _L5
_L5:
        ((zzab)((List) (obj2)).get(i)).zzap(((Cursor) (obj3)).getString(1));
        ((zzab)((List) (obj2)).get(i)).zzaq(((Cursor) (obj3)).getString(2));
_L10:
        boolean flag1 = ((Cursor) (obj3)).moveToNext();
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_651;
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
        zzae.zzac((new StringBuilder("Error in peekHits fetching hitIds: ")).append(((SQLiteException) (obj2)).getMessage()).toString());
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
            break MISSING_BLOCK_LABEL_404;
        }
        ((Cursor) (obj1)).close();
        throw obj;
_L6:
        zzae.zzac(String.format("HitString for hitId %d too large.  Hit will be deleted.", new Object[] {
            Long.valueOf(((zzab)((List) (obj2)).get(i)).zzgs())
        }));
          goto _L10
        obj1;
        obj = obj3;
        obj3 = obj1;
_L14:
        obj1 = obj;
        zzae.zzac((new StringBuilder("Error in peekHits fetching hitString: ")).append(((SQLiteException) (obj3)).getMessage()).toString());
        obj1 = obj;
        obj3 = new ArrayList();
        obj1 = obj;
        obj2 = ((List) (obj2)).iterator();
        i = 0;
_L12:
        obj1 = obj;
        if (!((Iterator) (obj2)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        obj6 = (zzab)((Iterator) (obj2)).next();
        int j;
        j = i;
        obj1 = obj;
        if (TextUtils.isEmpty(((zzab) (obj6)).zzgr()))
        {
            if (i != 0)
            {
                break; /* Loop/switch isn't completed */
            }
            j = 1;
        }
        obj1 = obj;
        ((List) (obj3)).add(obj6);
        i = j;
        if (true) goto _L12; else goto _L11
        obj;
_L13:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_577;
        }
        ((Cursor) (obj1)).close();
        throw obj;
_L11:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_589;
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
        i++;
          goto _L17
    }

    public void zza(Map map, long l, String s, Collection collection)
    {
        zzgz();
        zzgy();
        zza(map, collection);
        zza(map, l, s);
    }

    void zzb(Collection collection)
    {
        if (collection == null || collection.isEmpty())
        {
            zzae.zzac("Empty/Null collection passed to deleteHits.");
            return;
        }
        String as[] = new String[collection.size()];
        collection = collection.iterator();
        for (int i = 0; collection.hasNext(); i++)
        {
            as[i] = String.valueOf(((zzab)collection.next()).zzgs());
        }

        zzb(as);
    }

    void zzb(String as[])
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        if (as == null) goto _L2; else goto _L1
_L1:
        if (as.length != 0) goto _L3; else goto _L2
_L2:
        zzae.zzac("Empty hitIds passed to deleteHits.");
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        Object obj = zzar("Error opening database for deleteHits.");
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        String s = String.format("HIT_ID in (%s)", new Object[] {
            TextUtils.join(",", Collections.nCopies(as.length, "?"))
        });
        ((SQLiteDatabase) (obj)).delete("hits2", s, as);
        obj = zzCb;
        SQLiteException sqliteexception;
        if (zzgA() != 0)
        {
            flag = false;
        }
        ((zze) (obj)).zzD(flag);
        continue; /* Loop/switch isn't completed */
        sqliteexception;
        zzae.zzac((new StringBuilder("Error deleting hits ")).append(TextUtils.join(",", as)).toString());
        if (true) goto _L5; else goto _L4
_L4:
        as;
        throw as;
    }

    public zzr zzff()
    {
        return zzEV;
    }

    public Pair zzfg()
    {
        Object obj1 = null;
        Object obj = null;
        this;
        JVM INSTR monitorenter ;
        Object obj2;
        Pair pair;
        zzx.zzbe("getMinMaxHitTimes may not be called from the main thread");
        pair = Pair.create(Long.valueOf(0L), Long.valueOf(0L));
        obj2 = zzar("Error opening database for getMinMaxHitTimes.");
        if (obj2 != null) goto _L2; else goto _L1
_L1:
        obj1 = pair;
_L4:
        this;
        JVM INSTR monitorexit ;
        return ((Pair) (obj1));
_L2:
        Cursor cursor = ((SQLiteDatabase) (obj2)).rawQuery(zzET, null);
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
        zzae.zzac("Error getting minMaxHitTimes");
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

    int zzgA()
    {
        Object obj;
        Object obj1;
        int i;
        obj1 = null;
        obj = null;
        i = 0;
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        Object obj2 = zzar("Error opening database for getNumStoredHits.");
        if (obj2 != null) goto _L2; else goto _L1
_L1:
        int j = ((flag) ? 1 : 0);
_L4:
        this;
        JVM INSTR monitorexit ;
        return j;
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
        long l = ((Cursor) (obj2)).getLong(0);
        i = (int)l;
        j = i;
        if (obj2 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        ((Cursor) (obj2)).close();
        j = i;
        continue; /* Loop/switch isn't completed */
        obj;
        throw obj;
        obj1;
        obj1 = obj;
        zzae.zzac("Error getting numStoredHits");
        j = ((flag) ? 1 : 0);
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        ((Cursor) (obj)).close();
        j = ((flag) ? 1 : 0);
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

    int zzgz()
    {
        boolean flag = false;
        int i = 0;
        this;
        JVM INSTR monitorenter ;
        long l;
        long l1;
        l = zzmW.currentTimeMillis();
        l1 = zzEY;
        if (l > l1 + 0x5265c00L) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return i;
_L2:
        Object obj;
        zzEY = l;
        obj = zzar("Error opening database for deleteStaleHits.");
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = ((SQLiteDatabase) (obj)).delete("hits2", "HIT_TIME < ?", new String[] {
            Long.toString(zzmW.currentTimeMillis() - 0x9a7ec800L)
        });
        obj = zzCb;
        if (zzgA() == 0)
        {
            flag = true;
        }
        ((zze) (obj)).zzD(flag);
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void zzl(long l)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        Object obj = zzar("Error opening database for clearHits");
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (l != 0L)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        ((SQLiteDatabase) (obj)).delete("hits2", null, null);
_L3:
        obj = zzCb;
        Exception exception;
        if (zzgA() != 0)
        {
            flag = false;
        }
        ((zze) (obj)).zzD(flag);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        ((SQLiteDatabase) (obj)).delete("hits2", "hit_app_id = ?", new String[] {
            Long.valueOf(l).toString()
        });
          goto _L3
        exception;
        throw exception;
    }

}
