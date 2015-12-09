// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.chimera;

import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.OperationApplicationException;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteTransactionListener;
import android.net.Uri;
import android.os.Build;
import com.google.android.chimera.ContentProvider;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

public abstract class BaseGmsContentProvider extends ContentProvider
    implements SQLiteTransactionListener
{

    public static final ReentrantLock DATABASE_LOCK = new ReentrantLock();
    private final ThreadLocal mApplyingBatch = new ThreadLocal();
    private volatile boolean mNotifyChange;

    public BaseGmsContentProvider()
    {
    }

    private ContentProviderResult[] applyBatchLocked(SQLiteDatabase sqlitedatabase, ArrayList arraylist)
        throws OperationApplicationException
    {
        SQLiteDatabase sqlitedatabase1;
        int i;
        int j;
        j = 0;
        i = 0;
        sqlitedatabase.beginTransactionWithListener(this);
        sqlitedatabase1 = sqlitedatabase;
        mApplyingBatch.set(Boolean.valueOf(true));
        sqlitedatabase1 = sqlitedatabase;
        int j1 = arraylist.size();
        sqlitedatabase1 = sqlitedatabase;
        ContentProviderResult acontentproviderresult[] = new ContentProviderResult[j1];
        int k = 0;
_L2:
        int i1;
        if (k >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = i + 1;
        if (i1 <= 500)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        sqlitedatabase1 = sqlitedatabase;
        throw new OperationApplicationException("Too many content provider operations between yield points. The maximum number of operations per yield point is 500", j);
        sqlitedatabase;
        mApplyingBatch.set(Boolean.valueOf(false));
        sqlitedatabase1.endTransaction();
        onEndTransaction();
        throw sqlitedatabase;
        sqlitedatabase1 = sqlitedatabase;
        ContentProviderOperation contentprovideroperation = (ContentProviderOperation)arraylist.get(k);
        SQLiteDatabase sqlitedatabase2;
        int l;
        i = i1;
        l = j;
        sqlitedatabase2 = sqlitedatabase;
        if (k <= 0)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        sqlitedatabase1 = sqlitedatabase;
        i = i1;
        l = j;
        sqlitedatabase2 = sqlitedatabase;
        if (!contentprovideroperation.isYieldAllowed())
        {
            break MISSING_BLOCK_LABEL_220;
        }
        i1 = 0;
        sqlitedatabase1 = sqlitedatabase;
        boolean flag = mNotifyChange;
        sqlitedatabase1 = sqlitedatabase;
        i = i1;
        l = j;
        sqlitedatabase2 = sqlitedatabase;
        if (!sqlitedatabase.yieldIfContendedSafely(4000L))
        {
            break MISSING_BLOCK_LABEL_220;
        }
        sqlitedatabase1 = sqlitedatabase;
        sqlitedatabase2 = getDatabaseHelper(getHelperUri(arraylist)).getWritableDatabase();
        sqlitedatabase1 = sqlitedatabase2;
        mNotifyChange = flag;
        l = j + 1;
        i = i1;
        sqlitedatabase1 = sqlitedatabase2;
        acontentproviderresult[k] = contentprovideroperation.apply(getContainerContentProvider(), acontentproviderresult, k);
        k++;
        j = l;
        sqlitedatabase = sqlitedatabase2;
        if (true) goto _L2; else goto _L1
_L1:
        sqlitedatabase1 = sqlitedatabase;
        sqlitedatabase.setTransactionSuccessful();
        mApplyingBatch.set(Boolean.valueOf(false));
        sqlitedatabase.endTransaction();
        onEndTransaction();
        return acontentproviderresult;
    }

    private boolean applyingBatch()
    {
        return mApplyingBatch.get() != null && ((Boolean)mApplyingBatch.get()).booleanValue();
    }

    private int bulkInsertLocked(SQLiteDatabase sqlitedatabase, Uri uri, ContentValues acontentvalues[])
    {
        int i;
        int j;
        j = acontentvalues.length;
        sqlitedatabase.beginTransactionWithListener(this);
        i = 0;
_L2:
        SQLiteDatabase sqlitedatabase1;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        sqlitedatabase1 = sqlitedatabase;
        if (insertInTransaction(sqlitedatabase, uri, acontentvalues[i]) == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        sqlitedatabase1 = sqlitedatabase;
        mNotifyChange = true;
        sqlitedatabase1 = sqlitedatabase;
        boolean flag = mNotifyChange;
        sqlitedatabase1 = sqlitedatabase;
        sqlitedatabase.yieldIfContendedSafely();
        sqlitedatabase1 = sqlitedatabase;
        mNotifyChange = flag;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        sqlitedatabase1 = sqlitedatabase;
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        onEndTransaction();
        return j;
        sqlitedatabase;
        sqlitedatabase1.endTransaction();
        throw sqlitedatabase;
    }

    private int deleteLocked(SQLiteDatabase sqlitedatabase, Uri uri, String s, String as[])
    {
        if (applyingBatch()) goto _L2; else goto _L1
_L1:
        sqlitedatabase.beginTransactionWithListener(this);
        int i = deleteInTransaction(sqlitedatabase, uri, s, as);
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        mNotifyChange = true;
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        onEndTransaction();
_L4:
        return i;
        uri;
        sqlitedatabase.endTransaction();
        throw uri;
_L2:
        int j = deleteInTransaction(sqlitedatabase, uri, s, as);
        i = j;
        if (j > 0)
        {
            mNotifyChange = true;
            return j;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private Uri getHelperUri(ArrayList arraylist)
    {
        if (arraylist.size() != 0) goto _L2; else goto _L1
_L1:
        Uri uri = null;
_L4:
        return uri;
_L2:
        Uri uri1 = ((ContentProviderOperation)arraylist.get(0)).getUri();
        String s = getDataStoreName(uri1);
        uri = uri1;
        if (Build.TYPE.equals("user"))
        {
            continue;
        }
        int i = 1;
        int j = arraylist.size();
        do
        {
            uri = uri1;
            if (i >= j)
            {
                continue;
            }
            Asserts.checkState(Objects.equal(s, getDataStoreName(((ContentProviderOperation)arraylist.get(i)).getUri())), "URIs in batch operation refer to different databases");
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private long getInternalId(Uri uri, String s, String as[])
    {
        s = query(uri, new String[] {
            "_id"
        }, s, as, null);
        long l;
        if (!s.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_45;
        }
        l = s.getLong(0);
        s.close();
        return l;
        throw new IllegalStateException((new StringBuilder("Could not find internal ID for URI ")).append(uri).toString());
        uri;
        s.close();
        throw uri;
    }

    private Uri insertLocked(SQLiteDatabase sqlitedatabase, Uri uri, ContentValues contentvalues)
    {
        if (applyingBatch()) goto _L2; else goto _L1
_L1:
        sqlitedatabase.beginTransactionWithListener(this);
        uri = insertInTransaction(sqlitedatabase, uri, contentvalues);
        if (uri == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        mNotifyChange = true;
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        onEndTransaction();
        sqlitedatabase = uri;
_L4:
        return sqlitedatabase;
        uri;
        sqlitedatabase.endTransaction();
        throw uri;
_L2:
        uri = insertInTransaction(sqlitedatabase, uri, contentvalues);
        sqlitedatabase = uri;
        if (uri != null)
        {
            mNotifyChange = true;
            return uri;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static int updateById(SQLiteDatabase sqlitedatabase, Uri uri, String s, String s1, ContentValues contentvalues)
    {
        long l = ContentUris.parseId(uri);
        return sqlitedatabase.update(s, contentvalues, (new StringBuilder()).append(s1).append("=?").toString(), new String[] {
            String.valueOf(l)
        });
    }

    public static int updateByStringId(SQLiteDatabase sqlitedatabase, Uri uri, String s, String s1, ContentValues contentvalues)
    {
        uri = uri.getLastPathSegment();
        Preconditions.checkNotNull(uri);
        return sqlitedatabase.update(s, contentvalues, (new StringBuilder()).append(s1).append("=?").toString(), new String[] {
            uri
        });
    }

    private int updateLocked(SQLiteDatabase sqlitedatabase, Uri uri, ContentValues contentvalues, String s, String as[])
    {
        if (applyingBatch()) goto _L2; else goto _L1
_L1:
        sqlitedatabase.beginTransactionWithListener(this);
        int i = updateInTransaction(sqlitedatabase, uri, contentvalues, s, as);
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        mNotifyChange = true;
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        onEndTransaction();
_L4:
        return i;
        uri;
        sqlitedatabase.endTransaction();
        throw uri;
_L2:
        int j = updateInTransaction(sqlitedatabase, uri, contentvalues, s, as);
        i = j;
        if (j > 0)
        {
            mNotifyChange = true;
            return j;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final ContentProviderResult[] applyBatch(ArrayList arraylist)
        throws OperationApplicationException
    {
        Uri uri;
        uri = getHelperUri(arraylist);
        if (uri == null)
        {
            return new ContentProviderResult[0];
        }
        DATABASE_LOCK.lock();
        arraylist = applyBatchLocked(getDatabaseHelper(uri).getWritableDatabase(), arraylist);
        DATABASE_LOCK.unlock();
        return arraylist;
        arraylist;
        DATABASE_LOCK.unlock();
        throw arraylist;
    }

    public final Uri applyUpsert(SQLiteDatabase sqlitedatabase, Uri uri, Uri uri1, String s, String s1, ContentValues contentvalues, String s2, 
            String as[])
    {
        int i;
        s1 = null;
        i = update(uri1, contentvalues, s2, as);
        if (i != 1) goto _L2; else goto _L1
_L1:
        sqlitedatabase = ContentUris.withAppendedId(uri, getInternalId(uri1, s2, as));
_L4:
        return sqlitedatabase;
_L2:
        if (i != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        long l = sqlitedatabase.insert(s, null, contentvalues);
        sqlitedatabase = s1;
        if (l >= 0L)
        {
            return ContentUris.withAppendedId(uri, l);
        }
        if (true) goto _L4; else goto _L3
_L3:
        sqlitedatabase = s1;
        if (i > 1)
        {
            throw new IllegalArgumentException("Upsert affected multiple rows");
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final Uri applyUpsert$175c4d11(SQLiteDatabase sqlitedatabase, Uri uri, Uri uri1, String s, ContentValues contentvalues)
    {
        return applyUpsert(sqlitedatabase, uri, uri1, s, null, contentvalues, null, null);
    }

    public final int bulkInsert(Uri uri, ContentValues acontentvalues[])
    {
        DATABASE_LOCK.lock();
        int i = bulkInsertLocked(getDatabaseHelper(uri).getWritableDatabase(), uri, acontentvalues);
        DATABASE_LOCK.unlock();
        return i;
        uri;
        DATABASE_LOCK.unlock();
        throw uri;
    }

    public final int delete(Uri uri, String s, String as[])
    {
        DATABASE_LOCK.lock();
        int i = deleteLocked(getDatabaseHelper(uri).getWritableDatabase(), uri, s, as);
        DATABASE_LOCK.unlock();
        return i;
        uri;
        DATABASE_LOCK.unlock();
        throw uri;
    }

    public abstract int deleteInTransaction(SQLiteDatabase sqlitedatabase, Uri uri, String s, String as[]);

    public abstract String getDataStoreName(Uri uri);

    public abstract SQLiteOpenHelper getDatabaseHelper(Uri uri);

    public final Uri insert(Uri uri, ContentValues contentvalues)
    {
        DATABASE_LOCK.lock();
        uri = insertLocked(getDatabaseHelper(uri).getWritableDatabase(), uri, contentvalues);
        DATABASE_LOCK.unlock();
        return uri;
        uri;
        DATABASE_LOCK.unlock();
        throw uri;
    }

    public abstract Uri insertInTransaction(SQLiteDatabase sqlitedatabase, Uri uri, ContentValues contentvalues);

    public abstract void notifyChange();

    public void onBegin()
    {
    }

    public void onCommit()
    {
    }

    public boolean onCreate()
    {
        return true;
    }

    public void onEndTransaction()
    {
        if (mNotifyChange)
        {
            mNotifyChange = false;
            notifyChange();
        }
    }

    public void onRollback()
    {
    }

    public final AssetFileDescriptor openAssetFile(Uri uri, String s)
        throws FileNotFoundException
    {
        DATABASE_LOCK.lock();
        uri = openAssetFileLocked(uri, s);
        DATABASE_LOCK.unlock();
        return uri;
        uri;
        DATABASE_LOCK.unlock();
        throw uri;
    }

    public abstract AssetFileDescriptor openAssetFileLocked(Uri uri, String s)
        throws FileNotFoundException;

    public final Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        DATABASE_LOCK.lock();
        uri = queryLocked(getDatabaseHelper(uri).getReadableDatabase(), uri, as, s, as1, s1);
        DATABASE_LOCK.unlock();
        return uri;
        uri;
        DATABASE_LOCK.unlock();
        throw uri;
    }

    public abstract Cursor queryLocked(SQLiteDatabase sqlitedatabase, Uri uri, String as[], String s, String as1[], String s1);

    public final int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        DATABASE_LOCK.lock();
        int i = updateLocked(getDatabaseHelper(uri).getWritableDatabase(), uri, contentvalues, s, as);
        DATABASE_LOCK.unlock();
        return i;
        uri;
        DATABASE_LOCK.unlock();
        throw uri;
    }

    public abstract int updateInTransaction(SQLiteDatabase sqlitedatabase, Uri uri, ContentValues contentvalues, String s, String as[]);

}
