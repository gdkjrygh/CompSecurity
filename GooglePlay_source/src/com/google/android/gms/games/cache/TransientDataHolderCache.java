// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.cache;

import android.content.ContentValues;
import android.os.Bundle;
import android.support.v4.util.LruCache;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.TransientDataHolder;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.provider.PlayGamesContentProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class TransientDataHolderCache
{
    protected static final class CacheEntry
    {

        public final TransientDataHolder data;
        public long dataLifetimeMillis;
        public boolean expandedNext;
        public boolean expandedPrev;
        public long lastUpdatedTimeMillis;
        public int statusCode;
        public int totalCount;
        public String totalCountKey;

        CacheEntry(TransientDataHolder transientdataholder, Integer integer, long l, long l1)
        {
            data = transientdataholder;
            statusCode = integer.intValue();
            totalCountKey = null;
            totalCount = -1;
            lastUpdatedTimeMillis = l;
            dataLifetimeMillis = l1;
            expandedNext = false;
            expandedPrev = false;
        }
    }

    private final class OwnerCache extends LruCache
    {

        final TransientDataHolderCache this$0;

        protected final volatile Object create$7713a341()
        {
            return new LruCache(getMaxCacheKeys());
        }

        protected final volatile void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
        {
            obj = (LruCache)obj1;
            obj1 = (LruCache)obj2;
            if (flag && obj != null && obj1 == null)
            {
                ((LruCache) (obj)).trimToSize(-1);
            }
        }

        public OwnerCache(int i)
        {
            this$0 = TransientDataHolderCache.this;
            super(4);
        }
    }


    private boolean mAscending;
    private LruCache mCachedEntries;
    private final String mDataColumns[];
    private final long mDataLifetimeInMs;
    public final String mImageColumns[];
    private OwnerCache mOwnerCache;
    private final String mSortColumn;
    protected final String mUniquenessColumn;
    private boolean mVerboseLogging;

    protected TransientDataHolderCache(String as[], long l, String s, String s1)
    {
        this(as, l, s, true, s1);
    }

    protected TransientDataHolderCache(String as[], long l, String s, boolean flag, String s1)
    {
        this(as, l, s, flag, s1, (byte)0);
    }

    private TransientDataHolderCache(String as[], long l, String s, boolean flag, String s1, byte byte0)
    {
        Preconditions.checkArgument(true);
        mDataColumns = as;
        mOwnerCache = new OwnerCache(4);
        mCachedEntries = null;
        mDataLifetimeInMs = l;
        mSortColumn = s;
        mAscending = flag;
        mUniquenessColumn = s1;
        mVerboseLogging = ((Boolean)G.verboseCacheLogging.get()).booleanValue();
        s = new ArrayList();
        byte0 = 0;
        for (int i = as.length; byte0 < i; byte0++)
        {
            if (as[byte0].endsWith("_uri"))
            {
                s.add(as[byte0]);
            }
        }

        mImageColumns = (String[])s.toArray(new String[s.size()]);
        PlayGamesContentProvider.addCacheToImageCleaner(this);
    }

    private void logEntryContents(String s, CacheEntry cacheentry)
    {
        String s1;
        int i;
        s1 = getDebugColumn();
        if (s1 == null)
        {
            return;
        }
        GamesLog.d("TransientDataCache", (new StringBuilder("*** Emitting cache entry for ")).append(s).append(" ***").toString());
        s = cacheentry.data.build(0);
        i = 0;
        int j = ((DataHolder) (s)).mRowCount;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        GamesLog.d("TransientDataCache", (new StringBuilder()).append(i + 1).append(". ").append(s.getString(s1, i, s.getWindowIndex(i))).toString());
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        s.close();
        return;
        cacheentry;
        s.close();
        throw cacheentry;
    }

    public final void addCacheData(Object obj, ArrayList arraylist, int i, String s, String s1, int j, long l)
    {
        addCacheData(obj, arraylist, i, s, s1, j, l, mDataLifetimeInMs);
    }

    public final void addCacheData(Object obj, ArrayList arraylist, int i, String s, String s1, int j, long l, long l1)
    {
        CacheEntry cacheentry1;
        boolean flag;
        Preconditions.checkNotNull(mCachedEntries, "Access was made prior to setting cache owner");
        flag = hasData(obj, l);
        if (!flag)
        {
            if (mVerboseLogging)
            {
                CacheEntry cacheentry = findEntry(obj);
                if (cacheentry != null && cacheentry.data != null && cacheentry.data.getCount() > 0)
                {
                    GamesLog.d("TransientDataCache", (new StringBuilder("Expired; clearing data for key ")).append(obj).toString());
                }
            }
            clearData(obj);
        }
        cacheentry1 = findEntry(obj);
        if (cacheentry1 == null)
        {
            cacheentry1 = new CacheEntry(new TransientDataHolder(mDataColumns, mUniquenessColumn, s, s1), Integer.valueOf(i), l, l1);
        } else
        {
            cacheentry1.statusCode = i;
            cacheentry1.lastUpdatedTimeMillis = l;
        }
        i = 0;
        for (int k = arraylist.size(); i < k; i++)
        {
            cacheentry1.data.addRow((ContentValues)arraylist.get(i));
        }

        j;
        JVM INSTR tableswitch -1 1: default 216
    //                   -1 480
    //                   0 241
    //                   1 373;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException((new StringBuilder("Invalid page direction ")).append(j).toString());
_L3:
        s = s1;
        if (flag)
        {
            s = s1;
            if (s1 != null)
            {
                s = s1;
                if (s1.equals(cacheentry1.data.mNextToken))
                {
                    GamesLog.e("TransientDataCache", (new StringBuilder("Got a new response with same next page token - ")).append(s1).toString());
                    s = null;
                }
            }
        }
        cacheentry1.data.mNextToken = s;
        flag = cacheentry1.expandedNext;
        if (arraylist.size() > 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        cacheentry1.expandedNext = i | flag;
_L6:
        mCachedEntries.put(obj, cacheentry1);
        if (mVerboseLogging)
        {
            logEntryContents(obj.toString(), cacheentry1);
        }
        return;
_L4:
        s1 = s;
        if (flag)
        {
            s1 = s;
            if (s != null)
            {
                s1 = s;
                if (s.equals(cacheentry1.data.mPrevToken))
                {
                    GamesLog.e("TransientDataCache", (new StringBuilder("Got a new response with same prev page token - ")).append(s).toString());
                    s1 = null;
                }
            }
        }
        cacheentry1.data.mPrevToken = s1;
        flag = cacheentry1.expandedPrev;
        if (arraylist.size() > 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        cacheentry1.expandedPrev = i | flag;
        continue; /* Loop/switch isn't completed */
_L2:
        cacheentry1.data.mNextToken = s1;
        cacheentry1.data.mPrevToken = s;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void clear()
    {
        if (mCachedEntries != null)
        {
            mCachedEntries.trimToSize(-1);
        }
    }

    public final void clearData(Object obj)
    {
        if (mCachedEntries != null)
        {
            mCachedEntries.remove(obj);
        }
    }

    public final boolean containsEntryWithValue(Object obj, String s, Object obj1)
    {
        obj = findEntry(obj);
        if (obj == null)
        {
            return false;
        }
        obj = ((CacheEntry) (obj)).data.mData;
        int j = ((com.google.android.gms.common.data.DataHolder.Builder) (obj)).mRows.size();
        for (int i = 0; i < j; i++)
        {
            if (Objects.equal(((HashMap)((com.google.android.gms.common.data.DataHolder.Builder) (obj)).mRows.get(i)).get(s), obj1))
            {
                return true;
            }
        }

        return false;
    }

    public final void enableCaching(Object obj)
    {
        mCachedEntries = (LruCache)mOwnerCache.get(obj);
    }

    protected final CacheEntry findEntry(Object obj)
    {
        if (mCachedEntries == null)
        {
            return null;
        } else
        {
            return (CacheEntry)mCachedEntries.get(obj);
        }
    }

    public final DataHolder findMatchingRows(Object obj, String s, String s1)
    {
        com.google.android.gms.common.data.DataHolder.Builder builder;
        Object obj1;
        int i;
        obj1 = findEntry(obj);
        Preconditions.checkNotNull(s1);
        int j;
        int k;
        int l;
        if (mUniquenessColumn == null)
        {
            builder = DataHolder.builder(mDataColumns);
        } else
        {
            builder = DataHolder.builder(mDataColumns, mUniquenessColumn);
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_180;
        }
        obj = getData(obj, null, -1);
        i = 0;
        k = ((DataHolder) (obj)).mRowCount;
_L5:
        if (i >= k) goto _L2; else goto _L1
_L1:
        if (!s1.equals(((DataHolder) (obj)).getString(s, i, ((DataHolder) (obj)).getWindowIndex(i))))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = new ContentValues();
        j = 0;
        l = mDataColumns.length;
_L4:
        if (j >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        ((ContentValues) (obj1)).put(mDataColumns[j], ((DataHolder) (obj)).getString(mDataColumns[j], i, ((DataHolder) (obj)).getWindowIndex(i)));
        j++;
        if (true) goto _L4; else goto _L3
_L3:
        builder.withRow(((ContentValues) (obj1)));
        i++;
          goto _L5
_L2:
        ((DataHolder) (obj)).close();
        return builder.build(0);
        s;
        ((DataHolder) (obj)).close();
        throw s;
    }

    public final Set getCacheKeys()
    {
        if (mCachedEntries == null)
        {
            return new HashSet();
        } else
        {
            return mCachedEntries.snapshot().keySet();
        }
    }

    public final DataHolder getData(Object obj, Bundle bundle)
    {
        return getData(obj, bundle, -1);
    }

    public final DataHolder getData(Object obj, Bundle bundle, int i)
    {
        CacheEntry cacheentry = findEntry(obj);
        if (cacheentry == null)
        {
            obj = DataHolder.empty(4, bundle);
        } else
        {
            Object obj1 = cacheentry.data;
            obj = bundle;
            if (bundle == null)
            {
                obj = new Bundle();
            }
            if (cacheentry.totalCountKey != null)
            {
                ((Bundle) (obj)).putInt(cacheentry.totalCountKey, cacheentry.totalCount);
            }
            if (mSortColumn != null)
            {
                if (mAscending)
                {
                    ((TransientDataHolder) (obj1)).sortData(mSortColumn);
                } else
                {
                    ((TransientDataHolder) (obj1)).sortDataDescending(mSortColumn);
                }
            }
            bundle = ((TransientDataHolder) (obj1)).build(cacheentry.statusCode, ((Bundle) (obj)), i);
            obj1 = ((DataHolder) (bundle)).mMetadata;
            obj = bundle;
            if (cacheentry.data.getCount() > ((DataHolder) (bundle)).mRowCount)
            {
                if (cacheentry.expandedNext && ((Bundle) (obj1)).getString("next_page_token") == null)
                {
                    ((Bundle) (obj1)).putString("next_page_token", "has_local_data");
                }
                obj = bundle;
                if (cacheentry.expandedPrev)
                {
                    obj = bundle;
                    if (((Bundle) (obj1)).getString("prev_page_token") == null)
                    {
                        ((Bundle) (obj1)).putString("prev_page_token", "has_local_data");
                        return bundle;
                    }
                }
            }
        }
        return ((DataHolder) (obj));
    }

    protected abstract String getDebugColumn();

    public final int getEntryCount(Object obj)
    {
        obj = findEntry(obj);
        if (obj == null)
        {
            return 0;
        } else
        {
            return ((CacheEntry) (obj)).totalCount;
        }
    }

    protected int getMaxCacheKeys()
    {
        return 100;
    }

    public final String getNextPageToken(Object obj, long l)
    {
        CacheEntry cacheentry = findEntry(obj);
        if (cacheentry != null && hasData(obj, l))
        {
            return cacheentry.data.mNextToken;
        } else
        {
            return null;
        }
    }

    public final String getPrevPageToken(Object obj, long l)
    {
        CacheEntry cacheentry = findEntry(obj);
        if (cacheentry != null && hasData(obj, l))
        {
            return cacheentry.data.mPrevToken;
        } else
        {
            return null;
        }
    }

    public final int getStatusCode(Object obj)
    {
        obj = findEntry(obj);
        if (obj == null)
        {
            return 4;
        } else
        {
            return ((CacheEntry) (obj)).statusCode;
        }
    }

    public final boolean hasCacheOwner(Object obj)
    {
        return mOwnerCache.snapshot().keySet().contains(obj);
    }

    public final boolean hasData(Object obj, long l)
    {
        for (obj = findEntry(obj); obj == null || ((CacheEntry) (obj)).data == null || ((CacheEntry) (obj)).data.getCount() == 0 || l - ((CacheEntry) (obj)).lastUpdatedTimeMillis > ((CacheEntry) (obj)).dataLifetimeMillis;)
        {
            return false;
        }

        return true;
    }

    public final boolean hasEnoughData(Object obj, long l, int i, boolean flag)
    {
        if (hasData(obj, l)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        obj = findEntry(obj);
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((CacheEntry) (obj)).data.getCount() <= 0 || ((CacheEntry) (obj)).data.mNextToken != null) goto _L1; else goto _L3
_L3:
        return true;
        if (((CacheEntry) (obj)).data.getCount() < i && ((CacheEntry) (obj)).data.mNextToken != null) goto _L1; else goto _L4
_L4:
        return true;
    }

    public final void modifyMatchingIntRowValue(Object obj, String s, String s1, String s2, int i)
    {
        CacheEntry cacheentry;
        cacheentry = findEntry(obj);
        Preconditions.checkNotNull(s1);
        if (cacheentry == null) goto _L2; else goto _L1
_L1:
        DataHolder dataholder;
        ArrayList arraylist;
        int j;
        boolean flag;
        dataholder = getData(obj, null, -1);
        arraylist = new ArrayList();
        flag = false;
        j = 0;
        int l = dataholder.mRowCount;
_L12:
        if (j >= l) goto _L4; else goto _L3
_L3:
        ContentValues contentvalues;
        contentvalues = new ContentValues();
        arraylist.add(contentvalues);
        int k = 0;
        int i1 = mDataColumns.length;
_L6:
        if (k >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        contentvalues.put(mDataColumns[k], dataholder.getString(mDataColumns[k], j, dataholder.getWindowIndex(j)));
        k++;
        if (true) goto _L6; else goto _L5
_L5:
        k = ((flag) ? 1 : 0);
        if (!s1.equals(contentvalues.getAsString(s))) goto _L8; else goto _L7
_L7:
        Integer integer = contentvalues.getAsInteger(s2);
        if (integer == null) goto _L10; else goto _L9
_L9:
        k = ((flag) ? 1 : 0);
        if (integer.intValue() == i) goto _L8; else goto _L10
_L10:
        k = 1;
        contentvalues.put(s2, Integer.valueOf(i));
          goto _L8
_L4:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_243;
        }
        clearData(obj);
        addCacheData(obj, arraylist, cacheentry.statusCode, cacheentry.data.mPrevToken, cacheentry.data.mNextToken, -1, cacheentry.lastUpdatedTimeMillis, cacheentry.dataLifetimeMillis);
        dataholder.close();
_L2:
        return;
        obj;
        dataholder.close();
        throw obj;
_L8:
        j++;
        flag = k;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public final void modifyUniqueRowValue(Object obj, Object obj1, String s, Object obj2)
    {
        obj = findEntry(obj);
        if (obj != null)
        {
            obj = ((CacheEntry) (obj)).data.mData;
            if (((com.google.android.gms.common.data.DataHolder.Builder) (obj)).mUniqueColumn != null)
            {
                obj1 = (Integer)((com.google.android.gms.common.data.DataHolder.Builder) (obj)).mUniqueColumnIndices.get(obj1);
                if (obj1 != null)
                {
                    ((HashMap)((com.google.android.gms.common.data.DataHolder.Builder) (obj)).mRows.get(((Integer) (obj1)).intValue())).put(s, obj2);
                }
            }
        }
    }

    public final void setStatusCode(Object obj, int i)
    {
        obj = findEntry(obj);
        if (obj != null)
        {
            obj.statusCode = i;
        }
    }

    public final void setTotalCount(Object obj, String s, int i)
    {
        obj = findEntry(obj);
        if (obj != null)
        {
            obj.totalCountKey = s;
            obj.totalCount = i;
        }
    }
}
