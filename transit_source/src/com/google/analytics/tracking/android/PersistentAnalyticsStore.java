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
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.Command;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;

// Referenced classes of package com.google.analytics.tracking.android:
//            AnalyticsStore, SimpleNetworkDispatcher, HitBuilder, Log, 
//            AnalyticsStoreStateListener, Hit, Clock, Dispatcher, 
//            GAServiceManager, NoopDispatcher, HttpClientFactory, FutureApis

class PersistentAnalyticsStore
    implements AnalyticsStore
{
    class AnalyticsDatabaseHelper extends SQLiteOpenHelper
    {

        private boolean mBadDatabase;
        private long mLastDatabaseCheckTime;
        final PersistentAnalyticsStore this$0;

        private boolean tablePresent(String s, SQLiteDatabase sqlitedatabase)
        {
            SQLiteDatabase sqlitedatabase1;
            SQLiteDatabase sqlitedatabase2;
            sqlitedatabase2 = null;
            sqlitedatabase1 = null;
            sqlitedatabase = sqlitedatabase.query("SQLITE_MASTER", new String[] {
                "name"
            }, "name=?", new String[] {
                s
            }, null, null, null);
            sqlitedatabase1 = sqlitedatabase;
            sqlitedatabase2 = sqlitedatabase;
            boolean flag = sqlitedatabase.moveToFirst();
            if (sqlitedatabase != null)
            {
                sqlitedatabase.close();
            }
            return flag;
            sqlitedatabase;
            sqlitedatabase2 = sqlitedatabase1;
            Log.w((new StringBuilder()).append("error querying for table ").append(s).toString());
            if (sqlitedatabase1 != null)
            {
                sqlitedatabase1.close();
            }
            return false;
            s;
            if (sqlitedatabase2 != null)
            {
                sqlitedatabase2.close();
            }
            throw s;
        }

        private void validateColumnsPresent(SQLiteDatabase sqlitedatabase)
        {
            Cursor cursor;
            HashSet hashset;
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
            break MISSING_BLOCK_LABEL_125;
            sqlitedatabase;
            cursor.close();
            throw sqlitedatabase;
            boolean flag;
            if (!hashset.remove("hit_app_id"))
            {
                flag = true;
            } else
            {
                flag = false;
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

        public SQLiteDatabase getWritableDatabase()
        {
            SQLiteDatabase sqlitedatabase;
            if (mBadDatabase && mLastDatabaseCheckTime + 0x36ee80L > mClock.currentTimeMillis())
            {
                throw new SQLiteException("Database creation failed");
            }
            sqlitedatabase = null;
            mBadDatabase = true;
            mLastDatabaseCheckTime = mClock.currentTimeMillis();
            SQLiteDatabase sqlitedatabase1 = super.getWritableDatabase();
            sqlitedatabase = sqlitedatabase1;
_L2:
            SQLiteDatabase sqlitedatabase2 = sqlitedatabase;
            if (sqlitedatabase == null)
            {
                sqlitedatabase2 = super.getWritableDatabase();
            }
            mBadDatabase = false;
            return sqlitedatabase2;
            SQLiteException sqliteexception;
            sqliteexception;
            mContext.getDatabasePath(mDatabaseName).delete();
            if (true) goto _L2; else goto _L1
_L1:
        }

        boolean isBadDatabase()
        {
            return mBadDatabase;
        }

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            FutureApis.setOwnerOnlyReadWrite(sqlitedatabase.getPath());
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
            if (!tablePresent("hits2", sqlitedatabase))
            {
                sqlitedatabase.execSQL(PersistentAnalyticsStore.CREATE_HITS_TABLE);
                return;
            } else
            {
                validateColumnsPresent(sqlitedatabase);
                return;
            }
            sqlitedatabase;
            cursor.close();
            throw sqlitedatabase;
        }

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
        }

        void setBadDatabase(boolean flag)
        {
            mBadDatabase = flag;
        }

        AnalyticsDatabaseHelper(Context context, String s)
        {
            this$0 = PersistentAnalyticsStore.this;
            super(context, s, null, 1);
            mLastDatabaseCheckTime = 0L;
        }
    }


    static final String BACKEND_LIBRARY_VERSION = "";
    private static final String CREATE_HITS_TABLE = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[] {
        "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id"
    });
    private static final String DATABASE_FILENAME = "google_analytics_v2.db";
    static final String HITS_TABLE = "hits2";
    static final String HIT_APP_ID = "hit_app_id";
    static final String HIT_ID = "hit_id";
    static final String HIT_STRING = "hit_string";
    static final String HIT_TIME = "hit_time";
    static final String HIT_URL = "hit_url";
    private Clock mClock = new Clock() {

        final PersistentAnalyticsStore this$0;

        public long currentTimeMillis()
        {
            return System.currentTimeMillis();
        }

            
            {
                this$0 = PersistentAnalyticsStore.this;
                super();
            }
    };
    private final Context mContext;
    private final String mDatabaseName;
    private final AnalyticsDatabaseHelper mDbHelper;
    private volatile Dispatcher mDispatcher;
    private long mLastDeleteStaleHitsTime;
    private final AnalyticsStoreStateListener mListener;

    PersistentAnalyticsStore(AnalyticsStoreStateListener analyticsstorestatelistener, Context context)
    {
        this(analyticsstorestatelistener, context, "google_analytics_v2.db");
    }

    PersistentAnalyticsStore(AnalyticsStoreStateListener analyticsstorestatelistener, Context context, String s)
    {
        mContext = context.getApplicationContext();
        mDatabaseName = s;
        mListener = analyticsstorestatelistener;
        mDbHelper = new AnalyticsDatabaseHelper(mContext, mDatabaseName);
        mDispatcher = new SimpleNetworkDispatcher(this, createDefaultHttpClientFactory(), mContext);
        mLastDeleteStaleHitsTime = 0L;
    }

    private HttpClientFactory createDefaultHttpClientFactory()
    {
        return new HttpClientFactory() {

            final PersistentAnalyticsStore this$0;

            public HttpClient newInstance()
            {
                return new DefaultHttpClient();
            }

            
            {
                this$0 = PersistentAnalyticsStore.this;
                super();
            }
        };
    }

    private void fillVersionParametersIfNecessary(Map map, Collection collection)
    {
        Object obj = collection.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            collection = (Command)((Iterator) (obj)).next();
            if (!collection.getId().equals("appendVersion"))
            {
                continue;
            }
            obj = collection.getValue();
            storeVersion(map, collection.getUrlParam(), ((String) (obj)));
            break;
        } while (true);
    }

    public static String generateHitString(Map map)
    {
        ArrayList arraylist = new ArrayList(map.size());
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); arraylist.add((new StringBuilder()).append((String)entry.getKey()).append("=").append(HitBuilder.encode((String)entry.getValue())).toString()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        return TextUtils.join("&", arraylist);
    }

    private SQLiteDatabase getWritableDatabase(String s)
    {
        SQLiteDatabase sqlitedatabase;
        try
        {
            sqlitedatabase = mDbHelper.getWritableDatabase();
        }
        catch (SQLiteException sqliteexception)
        {
            Log.w(s);
            return null;
        }
        return sqlitedatabase;
    }

    private void removeOldHitIfFull()
    {
        int i = (getNumStoredHits() - 2000) + 1;
        if (i > 0)
        {
            List list = peekHits(i);
            Log.wDebug((new StringBuilder()).append("Store full, deleting ").append(list.size()).append(" hits to make room").toString());
            deleteHits(list);
        }
    }

    private void storeVersion(Map map, String s, String s1)
    {
        if (s1 == null)
        {
            s1 = "";
        } else
        {
            s1 = (new StringBuilder()).append(s1).append("").toString();
        }
        if (s != null)
        {
            map.put(s, s1);
        }
    }

    private void writeHitToDatabase(Map map, long l, String s)
    {
        SQLiteDatabase sqlitedatabase = getWritableDatabase("Error opening database for putHit");
        if (sqlitedatabase == null)
        {
            return;
        }
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("hit_string", generateHitString(map));
        contentvalues.put("hit_time", Long.valueOf(l));
        long l1 = 0L;
        l = l1;
        if (map.containsKey("AppUID"))
        {
            try
            {
                l = Long.parseLong((String)map.get("AppUID"));
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                l = l1;
            }
        }
        contentvalues.put("hit_app_id", Long.valueOf(l));
        map = s;
        if (s == null)
        {
            map = "http://www.google-analytics.com/collect";
        }
        if (map.length() == 0)
        {
            Log.w("empty path: not sending hit");
            return;
        }
        contentvalues.put("hit_url", map);
        try
        {
            sqlitedatabase.insert("hits2", null, contentvalues);
            mListener.reportStoreIsEmpty(false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            Log.w("Error storing hit");
        }
    }

    public void clearHits(long l)
    {
        boolean flag = true;
        Object obj = getWritableDatabase("Error opening database for clearHits");
        if (obj != null)
        {
            if (l == 0L)
            {
                ((SQLiteDatabase) (obj)).delete("hits2", null, null);
            } else
            {
                ((SQLiteDatabase) (obj)).delete("hits2", "hit_app_id = ?", new String[] {
                    Long.valueOf(l).toString()
                });
            }
            obj = mListener;
            if (getNumStoredHits() != 0)
            {
                flag = false;
            }
            ((AnalyticsStoreStateListener) (obj)).reportStoreIsEmpty(flag);
        }
    }

    public void close()
    {
        try
        {
            mDbHelper.getWritableDatabase().close();
            return;
        }
        catch (SQLiteException sqliteexception)
        {
            Log.w("Error opening database for close");
        }
    }

    public void deleteHits(Collection collection)
    {
        if (collection == null)
        {
            throw new NullPointerException("hits cannot be null");
        }
        if (!collection.isEmpty()) goto _L2; else goto _L1
_L1:
        Object obj;
        return;
_L2:
        if ((obj = getWritableDatabase("Error opening database for deleteHit")) == null) goto _L1; else goto _L3
_L3:
        String as[];
        String s;
        as = new String[collection.size()];
        s = String.format("HIT_ID in (%s)", new Object[] {
            TextUtils.join(",", Collections.nCopies(as.length, "?"))
        });
        int i = 0;
        for (Iterator iterator = collection.iterator(); iterator.hasNext();)
        {
            as[i] = Long.toString(((Hit)iterator.next()).getHitId());
            i++;
        }

        ((SQLiteDatabase) (obj)).delete("hits2", s, as);
        obj = mListener;
        boolean flag;
        if (getNumStoredHits() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            ((AnalyticsStoreStateListener) (obj)).reportStoreIsEmpty(flag);
            return;
        }
        catch (SQLiteException sqliteexception)
        {
            Log.w((new StringBuilder()).append("Error deleting hit ").append(collection).toString());
        }
        return;
    }

    int deleteStaleHits()
    {
        boolean flag = true;
        long l = mClock.currentTimeMillis();
        if (l > mLastDeleteStaleHitsTime + 0x5265c00L)
        {
            mLastDeleteStaleHitsTime = l;
            Object obj = getWritableDatabase("Error opening database for deleteStaleHits");
            if (obj != null)
            {
                int i = ((SQLiteDatabase) (obj)).delete("hits2", "HIT_TIME < ?", new String[] {
                    Long.toString(mClock.currentTimeMillis() - 0x9a7ec800L)
                });
                obj = mListener;
                if (getNumStoredHits() != 0)
                {
                    flag = false;
                }
                ((AnalyticsStoreStateListener) (obj)).reportStoreIsEmpty(flag);
                return i;
            }
        }
        return 0;
    }

    public void dispatch()
    {
        Log.vDebug("dispatch running...");
        if (mDispatcher.okToDispatch())
        {
            List list = peekHits(40);
            if (list.isEmpty())
            {
                Log.vDebug("...nothing to dispatch");
                mListener.reportStoreIsEmpty(true);
                return;
            }
            int i = mDispatcher.dispatchHits(list);
            Log.vDebug((new StringBuilder()).append("sent ").append(i).append(" of ").append(list.size()).append(" hits").toString());
            deleteHits(list.subList(0, Math.min(i, list.size())));
            if (i == list.size() && getNumStoredHits() > 0)
            {
                GAServiceManager.getInstance().dispatch();
                return;
            }
        }
    }

    public AnalyticsDatabaseHelper getDbHelper()
    {
        return mDbHelper;
    }

    AnalyticsDatabaseHelper getHelper()
    {
        return mDbHelper;
    }

    int getNumStoredHits()
    {
        Cursor cursor;
        Object obj;
        Object obj1;
        int i;
        boolean flag;
        flag = false;
        i = 0;
        obj1 = getWritableDatabase("Error opening database for requestNumHitsPending");
        if (obj1 == null)
        {
            return 0;
        }
        obj = null;
        cursor = null;
        obj1 = ((SQLiteDatabase) (obj1)).rawQuery("SELECT COUNT(*) from hits2", null);
        cursor = ((Cursor) (obj1));
        obj = obj1;
        if (!((Cursor) (obj1)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_64;
        }
        cursor = ((Cursor) (obj1));
        obj = obj1;
        long l = ((Cursor) (obj1)).getLong(0);
        i = (int)l;
        int j;
        j = i;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
            j = i;
        }
_L2:
        return j;
        obj;
        obj = cursor;
        Log.w("Error getting numStoredHits");
        j = ((flag) ? 1 : 0);
        if (cursor != null)
        {
            cursor.close();
            j = ((flag) ? 1 : 0);
        }
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw exception;
    }

    public List peekHits(int i)
    {
        Object obj4 = getWritableDatabase("Error opening database for peekHits");
        if (obj4 != null) goto _L2; else goto _L1
_L1:
        Object obj1 = new ArrayList();
_L10:
        return ((List) (obj1));
_L2:
        Object obj;
        Object obj2;
        Object obj3;
        obj3 = null;
        obj = null;
        new ArrayList();
        obj2 = obj;
        obj1 = obj3;
        String s = String.format("%s ASC, %s ASC", new Object[] {
            "hit_url", "hit_id"
        });
        obj2 = obj;
        obj1 = obj3;
        String s1 = Integer.toString(i);
        obj2 = obj;
        obj1 = obj3;
        obj = ((SQLiteDatabase) (obj4)).query("hits2", new String[] {
            "hit_id", "hit_time", "hit_url"
        }, null, null, null, null, s, s1);
        obj2 = obj;
        obj1 = obj;
        obj3 = new ArrayList();
        int j;
        boolean flag;
        if (((Cursor) (obj)).moveToFirst())
        {
            do
            {
                obj1 = new Hit(null, ((Cursor) (obj)).getLong(0), ((Cursor) (obj)).getLong(1));
                ((Hit) (obj1)).setHitUrl(((Cursor) (obj)).getString(2));
                ((List) (obj3)).add(obj1);
                flag = ((Cursor) (obj)).moveToNext();
            } while (flag);
        }
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        j = 0;
        obj2 = obj;
        obj1 = obj;
        s = String.format("%s ASC", new Object[] {
            "hit_id"
        });
        obj2 = obj;
        obj1 = obj;
        s1 = Integer.toString(i);
        obj2 = obj;
        obj1 = obj;
        obj = ((SQLiteDatabase) (obj4)).query("hits2", new String[] {
            "hit_id", "hit_string"
        }, null, null, null, null, s, s1);
        obj2 = obj;
        obj1 = obj;
        if (!((Cursor) (obj)).moveToFirst()) goto _L4; else goto _L3
_L3:
        i = j;
_L9:
        obj2 = obj;
        obj1 = obj;
        if (!(obj instanceof SQLiteCursor)) goto _L6; else goto _L5
_L5:
        obj2 = obj;
        obj1 = obj;
        if (((SQLiteCursor)obj).getWindow().getNumRows() <= 0) goto _L8; else goto _L7
_L7:
        obj2 = obj;
        obj1 = obj;
        ((Hit)((List) (obj3)).get(i)).setHitString(((Cursor) (obj)).getString(1));
_L12:
        i++;
        obj2 = obj;
        obj1 = obj;
        boolean flag1 = ((Cursor) (obj)).moveToNext();
        if (flag1) goto _L9; else goto _L4
_L4:
        obj1 = obj3;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
            return ((List) (obj3));
        }
          goto _L10
        obj3;
        obj = obj2;
_L20:
        obj1 = obj;
        Log.w((new StringBuilder()).append("error in peekHits fetching hitIds: ").append(((SQLiteException) (obj3)).getMessage()).toString());
        obj1 = obj;
        obj2 = new ArrayList();
        obj1 = obj2;
        if (obj == null) goto _L10; else goto _L11
_L11:
        ((Cursor) (obj)).close();
        return ((List) (obj2));
        obj2;
        obj = obj1;
        obj1 = obj2;
_L19:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw obj1;
_L8:
        obj2 = obj;
        obj1 = obj;
        Log.w((new StringBuilder()).append("hitString for hitId ").append(((Hit)((List) (obj3)).get(i)).getHitId()).append(" too large.  Hit will be deleted.").toString());
          goto _L12
        obj;
        obj1 = obj2;
        Log.w((new StringBuilder()).append("error in peekHits fetching hitString: ").append(((SQLiteException) (obj)).getMessage()).toString());
        obj1 = obj2;
        obj = new ArrayList();
        i = 0;
        obj1 = obj2;
        obj3 = ((List) (obj3)).iterator();
_L18:
        obj1 = obj2;
        if (!((Iterator) (obj3)).hasNext()) goto _L14; else goto _L13
_L13:
        obj1 = obj2;
        obj4 = (Hit)((Iterator) (obj3)).next();
        obj1 = obj2;
        flag1 = TextUtils.isEmpty(((Hit) (obj4)).getHitParams());
        j = i;
        if (!flag1) goto _L16; else goto _L15
_L15:
        if (i == 0) goto _L17; else goto _L14
_L14:
        if (obj2 != null)
        {
            ((Cursor) (obj2)).close();
        }
        return ((List) (obj));
_L6:
        obj2 = obj;
        obj1 = obj;
        ((Hit)((List) (obj3)).get(i)).setHitString(((Cursor) (obj)).getString(1));
          goto _L12
        obj;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
_L17:
        j = 1;
_L16:
        obj1 = obj2;
        ((List) (obj)).add(obj4);
        i = j;
          goto _L18
        obj1;
          goto _L19
        obj3;
          goto _L20
    }

    public void putHit(Map map, long l, String s, Collection collection)
    {
        deleteStaleHits();
        fillVersionParametersIfNecessary(map, collection);
        removeOldHitIfFull();
        writeHitToDatabase(map, l, s);
    }

    public void setClock(Clock clock)
    {
        mClock = clock;
    }

    public void setDispatch(boolean flag)
    {
        Object obj;
        if (flag)
        {
            obj = new SimpleNetworkDispatcher(this, createDefaultHttpClientFactory(), mContext);
        } else
        {
            obj = new NoopDispatcher();
        }
        mDispatcher = ((Dispatcher) (obj));
    }

    void setDispatcher(Dispatcher dispatcher)
    {
        mDispatcher = dispatcher;
    }

    void setLastDeleteStaleHitsTime(long l)
    {
        mLastDeleteStaleHitsTime = l;
    }





}
