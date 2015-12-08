// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.provider;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.internal.GamesLog;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.provider:
//            GamesDatabaseHelper

public final class ImageStore
{
    public static final class Entry
    {

        public final long id;
        public final String path;
        public final long size;

        public Entry(File file)
        {
            id = Long.parseLong(file.getName());
            size = file.length();
            path = file.getAbsolutePath();
        }
    }


    private static final String IMAGES_ID_PROJECTION[] = {
        "_id", "local"
    };
    private final GamesDatabaseHelper mDatabaseHelper;
    private SQLiteDatabase mDb;
    final Map mEntries = new HashMap();
    long mLastCleanupTimeMillis;
    private final File mStorePath;
    private long mTotalSize;

    public ImageStore(File file, GamesDatabaseHelper gamesdatabasehelper)
    {
        mTotalSize = 0L;
        mLastCleanupTimeMillis = 0L;
        boolean flag;
        if (file.exists() && file.isDirectory())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag, "Must provide an existing directory!");
        mStorePath = file;
        mDatabaseHelper = gamesdatabasehelper;
        initialize();
    }

    private static void cleanupFile(File file)
    {
        if (!file.delete())
        {
            GamesLog.d("ImageStore", (new StringBuilder("Could not clean up file ")).append(file.getAbsolutePath()).toString());
        }
    }

    private File getFileForImageFileId(long l)
    {
        return new File(mStorePath, String.valueOf(l));
    }

    private void initialize()
    {
        File afile[] = mStorePath.listFiles();
        if (afile == null)
        {
            return;
        }
        int j = afile.length;
        int i = 0;
        while (i < j) 
        {
            File file = afile[i];
            try
            {
                Entry entry = new Entry(file);
                putEntry(entry.id, entry);
            }
            catch (NumberFormatException numberformatexception)
            {
                cleanupFile(file);
            }
            i++;
        }
        mDb = mDatabaseHelper.getWritableDatabase();
    }

    private void putEntry(long l, Entry entry)
    {
        if (!mEntries.containsKey(Long.valueOf(l)))
        {
            mTotalSize = mTotalSize + entry.size;
        } else
        {
            Entry entry1 = (Entry)mEntries.get(Long.valueOf(l));
            mTotalSize = mTotalSize + (entry.size - entry1.size);
        }
        mEntries.put(Long.valueOf(l), entry);
    }

    public static File verifyImageDirectory(File file, String s)
    {
        s = new File(file, (new StringBuilder("images/games/")).append(s).toString());
        file = s;
        if (!s.exists())
        {
            file = s;
            if (!s.mkdirs())
            {
                file = null;
            }
        }
        return file;
    }

    public final Set cleanup(Set set)
    {
        Object obj;
        Object obj1;
        obj = new HashSet();
        ((Set) (obj)).addAll(mEntries.keySet());
        ((Set) (obj)).removeAll(set);
        if (!((Set) (obj)).isEmpty())
        {
            GamesLog.d("ImageStore", (new StringBuilder("cleanup removing ")).append(((Set) (obj)).size()).append(" files").toString());
            for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); remove(((Long)((Iterator) (obj)).next()).longValue())) { }
        }
        obj1 = new HashSet();
        obj = new HashSet();
        ((Set) (obj)).addAll(set);
        set = mDb.query("images", IMAGES_ID_PROJECTION, null, null, null, null, null);
        break MISSING_BLOCK_LABEL_150;
        obj;
        set.close();
        throw obj;
        do
        {
            if (!set.moveToNext())
            {
                break;
            }
            long l = set.getLong(0);
            ((Set) (obj)).remove(Long.valueOf(l));
            if (set.getInt(1) == 1)
            {
                ((Set) (obj1)).add(Long.valueOf(l));
            }
        } while (true);
        set.close();
        ((Set) (obj1)).removeAll(mEntries.keySet());
        if (!((Set) (obj1)).isEmpty())
        {
            GamesLog.d("ImageStore", (new StringBuilder("cleanup changing local state for ")).append(((Set) (obj1)).size()).append(" keys").toString());
            if (((Set) (obj1)).size() > 50)
            {
                set = new ArrayList();
                set.addAll(((java.util.Collection) (obj1)));
                set = TextUtils.join(",", set.subList(0, 50));
            } else
            {
                set = TextUtils.join(",", ((Iterable) (obj1)));
            }
            set = (new StringBuilder("_id IN (")).append(set).append(")").toString();
            obj1 = new ContentValues();
            ((ContentValues) (obj1)).put("local", Integer.valueOf(0));
            mDb.update("images", ((ContentValues) (obj1)), set, null);
        }
        mLastCleanupTimeMillis = SystemClock.elapsedRealtime();
        return ((Set) (obj));
    }

    public final long insert(byte abyte0[], String s, long l)
    {
        File file;
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_222;
        }
        file = null;
        File file1 = File.createTempFile("img", null, mStorePath);
        file = file1;
        Object obj = new FileOutputStream(file1);
        file = file1;
        ((FileOutputStream) (obj)).write(abyte0);
        file = file1;
        ((FileOutputStream) (obj)).close();
        file = file1;
        obj = new ContentValues();
        file = file1;
        ((ContentValues) (obj)).put("url", s);
        file = file1;
        ((ContentValues) (obj)).put("local", Integer.valueOf(1));
        file = file1;
        ((ContentValues) (obj)).put("filesize", Integer.valueOf(abyte0.length));
        file = file1;
        ((ContentValues) (obj)).put("download_timestamp", Long.valueOf(l));
        file = file1;
        l = mDb.insert("images", null, ((ContentValues) (obj)));
        abyte0 = file1;
        if (l == 0L)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        file = file1;
        s = getFileForImageFileId(l);
        file = file1;
        abyte0 = file1;
        if (!file1.renameTo(s))
        {
            break MISSING_BLOCK_LABEL_212;
        }
        file = file1;
        abyte0 = new Entry(s);
        file = file1;
        putEntry(((Entry) (abyte0)).id, abyte0);
        return l;
        abyte0;
        abyte0 = file;
        if (abyte0 != null)
        {
            cleanupFile(abyte0);
        }
        return 0L;
        if (s == null)
        {
            GamesLog.e("ImageStore", "Attempted to insert image with no bytes and no URL!");
            return 0L;
        } else
        {
            abyte0 = new ContentValues();
            abyte0.put("url", s);
            abyte0.put("local", Integer.valueOf(0));
            return mDb.insert("images", null, abyte0);
        }
    }

    public final int remove(long l)
    {
        cleanupFile(getFileForImageFileId(l));
        Entry entry = (Entry)mEntries.get(Long.valueOf(l));
        if (entry != null)
        {
            mTotalSize = mTotalSize - entry.size;
            mEntries.remove(Long.valueOf(l));
        }
        return mDb.delete("images", "_id=?", new String[] {
            String.valueOf(l)
        });
    }

    public final boolean update(long l, byte abyte0[], long l1)
    {
        File file = null;
        File file1 = File.createTempFile("img", null, mStorePath);
        file = file1;
        Object obj = new FileOutputStream(file1);
        file = file1;
        ((FileOutputStream) (obj)).write(abyte0);
        file = file1;
        ((FileOutputStream) (obj)).close();
        file = file1;
        obj = new ContentValues();
        file = file1;
        ((ContentValues) (obj)).put("local", Integer.valueOf(1));
        file = file1;
        ((ContentValues) (obj)).put("filesize", Integer.valueOf(abyte0.length));
        file = file1;
        ((ContentValues) (obj)).put("download_timestamp", Long.valueOf(l1));
        file = file1;
        l1 = mDb.update("images", ((ContentValues) (obj)), "_id=?", new String[] {
            String.valueOf(l)
        });
        if (l1 != 1L)
        {
            break MISSING_BLOCK_LABEL_199;
        }
        file = file1;
        obj = getFileForImageFileId(l);
        abyte0 = file1;
        file = file1;
        if (!file1.renameTo(((File) (obj))))
        {
            break MISSING_BLOCK_LABEL_232;
        }
        file = file1;
        putEntry(l, new Entry(((File) (obj))));
        return true;
        file = file1;
        GamesLog.e("ImageStore", (new StringBuilder()).append(l1).append(" rows updated, expected 1").toString());
        abyte0 = file1;
_L2:
        if (abyte0 != null)
        {
            cleanupFile(abyte0);
        }
        return false;
        abyte0;
        abyte0 = file;
        if (true) goto _L2; else goto _L1
_L1:
    }

}
