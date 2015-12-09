// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.provider;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.cache.TransientDataHolderCache;
import com.google.android.gms.games.internal.GamesLog;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.provider:
//            PlayGamesContentProvider, GamesDataStore, GamesDatabaseHelper, ImageStore

private final class mDataStore
{

    private final GamesDataStore mDataStore;
    private final HashSet mImageIdColumns = new HashSet();
    final HashSet mUsedImageIds = new HashSet();
    final PlayGamesContentProvider this$0;

    private static void cleanupDatabase(SQLiteDatabase sqlitedatabase, String s, String s1, String s2)
    {
        Cursor cursor;
        boolean flag1;
        s2 = (new StringBuilder()).append(s1).append(" IN (").append(s2).append(")").toString();
        cursor = sqlitedatabase.query(s, new String[] {
            "_id", s1
        }, s2, null, null, null, null);
        flag1 = false;
        int i = cursor.getCount();
        if (i != 0) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        cursor.close();
        if (flag)
        {
            return;
        } else
        {
            ContentValues contentvalues = new ContentValues();
            contentvalues.putNull(s1);
            sqlitedatabase.update(s, contentvalues, s2, null);
            return;
        }
_L2:
        flag = flag1;
        if (!cursor.moveToNext()) goto _L4; else goto _L3
_L3:
        GamesLog.w("GamesContentProvider", (new StringBuilder("Found a dangling image reference: ")).append(s).append(".").append(s1).append(" | id : ").append(cursor.getLong(0)).append(" | image id : ").append(cursor.getLong(1)).toString());
          goto _L2
          goto _L4
        sqlitedatabase;
        cursor.close();
        throw sqlitedatabase;
    }

    private Set getAllUsedImageKeys(SQLiteDatabase sqlitedatabase)
    {
        HashSet hashset = new HashSet(mUsedImageIds);
        for (Iterator iterator = mImageIdColumns.iterator(); iterator.hasNext(); getUsedKeysForImageColumn(sqlitedatabase, (Pair)iterator.next(), hashset)) { }
        getUsedKeysForImageColumnsInCaches(hashset);
        return hashset;
    }

    private static void getUsedKeysForImageColumn(SQLiteDatabase sqlitedatabase, Pair pair, Set set)
    {
        String s = (String)pair.first;
        pair = (String)pair.second;
        String s1 = (new StringBuilder()).append(pair).append(" IS NOT NULL").toString();
        sqlitedatabase = sqlitedatabase.query(s, new String[] {
            pair
        }, s1, null, null, null, null);
        while (sqlitedatabase.moveToNext()) 
        {
            set.add(Long.valueOf(sqlitedatabase.getLong(0)));
        }
        break MISSING_BLOCK_LABEL_95;
        pair;
        sqlitedatabase.close();
        throw pair;
        sqlitedatabase.close();
        return;
    }

    private static void getUsedKeysForImageColumnsInCaches(Set set)
    {
label0:
        {
            synchronized (PlayGamesContentProvider.access$200())
            {
                if (PlayGamesContentProvider.access$300() != null)
                {
                    break label0;
                }
            }
            return;
        }
        GamesLog.d("GamesContentProvider", String.format("sCacheList - %d keys in use before and processing %d caches", new Object[] {
            Integer.valueOf(set.size()), Integer.valueOf(PlayGamesContentProvider.access$300().size())
        }));
        int i = 0;
        int l = PlayGamesContentProvider.access$300().size();
_L11:
        if (i >= l) goto _L2; else goto _L1
_L1:
        TransientDataHolderCache transientdataholdercache;
        String as[];
        Iterator iterator;
        transientdataholdercache = (TransientDataHolderCache)PlayGamesContentProvider.access$300().get(i);
        as = transientdataholdercache.mImageColumns;
        GamesLog.d("GamesContentProvider", String.format("sCacheList - contains %d keys", new Object[] {
            Integer.valueOf(transientdataholdercache.getCacheKeys().size())
        }));
        iterator = transientdataholdercache.getCacheKeys().iterator();
_L9:
        DataHolder dataholder;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_348;
        }
        Object obj1 = iterator.next();
        dataholder = transientdataholdercache.getData(obj1, null);
        GamesLog.d("GamesContentProvider", String.format("sCacheList - processing cache key (%s) with %d rows", new Object[] {
            obj1, Integer.valueOf(dataholder.mRowCount)
        }));
        int i1 = dataholder.mRowCount;
        int j = 0;
_L8:
        if (j >= i1) goto _L4; else goto _L3
_L3:
        int j1 = as.length;
        int k = 0;
_L6:
        if (k >= j1)
        {
            continue; /* Loop/switch isn't completed */
        }
        String s = dataholder.getString(as[k], j, dataholder.getWindowIndex(j));
        if (!TextUtils.isEmpty(s))
        {
            set.add(Long.decode(Uri.parse(s).getLastPathSegment()));
        }
_L7:
        k++;
        if (true) goto _L6; else goto _L5
_L5:
        Object obj2;
        continue; /* Loop/switch isn't completed */
        obj2;
        GamesLog.e("GamesContentProvider", "sCacheList - couldn't parse URI", ((Throwable) (obj2)));
          goto _L7
        set;
        dataholder.close();
        throw set;
        set;
        obj;
        JVM INSTR monitorexit ;
        throw set;
          goto _L8
_L4:
        dataholder.close();
          goto _L9
_L2:
        GamesLog.d("GamesContentProvider", String.format("sCacheList - %d keys in use after processing caches", new Object[] {
            Integer.valueOf(set.size())
        }));
        obj;
        JVM INSTR monitorexit ;
        return;
        obj2;
          goto _L7
        i++;
        if (true) goto _L11; else goto _L10
_L10:
    }

    final void cleanupOrphans(Set set)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = mDataStore.mDatabaseHelper.getWritableDatabase();
        sqlitedatabase.beginTransaction();
        set.removeAll(getAllUsedImageKeys(sqlitedatabase));
        Long long1;
        for (set = set.iterator(); set.hasNext(); mDataStore.mImageStore.remove(long1.longValue()))
        {
            long1 = (Long)set.next();
        }

        break MISSING_BLOCK_LABEL_78;
        set;
        sqlitedatabase.endTransaction();
        throw set;
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
    }

    public final void performCleanup()
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = mDataStore.mDatabaseHelper.getWritableDatabase();
        sqlitedatabase.beginTransaction();
        Object obj;
        Object obj1;
        obj = getAllUsedImageKeys(sqlitedatabase);
        obj1 = mDataStore.mImageStore.cleanup(((Set) (obj)));
        if (((Set) (obj1)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_206;
        }
        GamesLog.d("GamesContentProvider", (new StringBuilder("Found ")).append(((Set) (obj1)).size()).append(" dangling image references").toString());
        obj = new StringBuilder();
        boolean flag = true;
        obj1 = ((Set) (obj1)).iterator();
_L1:
        long l;
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_149;
        }
        l = ((Long)((Iterator) (obj1)).next()).longValue();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        ((StringBuilder) (obj)).append(",");
        flag = false;
        ((StringBuilder) (obj)).append(l);
          goto _L1
        obj;
        sqlitedatabase.endTransaction();
        throw obj;
        obj = ((StringBuilder) (obj)).toString();
        Pair pair;
        for (Iterator iterator = mImageIdColumns.iterator(); iterator.hasNext(); cleanupDatabase(sqlitedatabase, (String)pair.first, (String)pair.second, ((String) (obj))))
        {
            pair = (Pair)iterator.next();
        }

        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
    }

    public final void registerImageIdColumn(String s, String s1)
    {
        mImageIdColumns.add(Pair.create(s, s1));
    }

    public Q(GamesDataStore gamesdatastore)
    {
        this$0 = PlayGamesContentProvider.this;
        super();
        mDataStore = (GamesDataStore)Preconditions.checkNotNull(gamesdatastore);
    }
}
