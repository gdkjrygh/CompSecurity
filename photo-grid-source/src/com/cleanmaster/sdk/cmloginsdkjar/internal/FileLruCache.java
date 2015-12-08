// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar.internal;

import android.content.Context;
import com.cleanmaster.sdk.cmloginsdkjar.Settings;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.cleanmaster.sdk.cmloginsdkjar.internal:
//            d, c, Utility, Logger, 
//            i, b, k, h, 
//            g, a

public final class FileLruCache
{

    private static final String HEADER_CACHEKEY_KEY = "key";
    private static final String HEADER_CACHE_CONTENT_TAG_KEY = "tag";
    static final String TAG = com/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache.getSimpleName();
    private static final AtomicLong bufferIndex = new AtomicLong();
    private final File directory;
    private boolean isTrimInProgress;
    private boolean isTrimPending;
    private AtomicLong lastClearCacheTime;
    private final Limits limits;
    private final Object lock = new Object();
    private final String tag;

    public FileLruCache(Context context, String s, Limits limits1)
    {
        lastClearCacheTime = new AtomicLong(0L);
        tag = s;
        limits = limits1;
        directory = new File(context.getCacheDir(), s);
        if (directory.mkdirs() || directory.isDirectory())
        {
            d.a(directory);
        }
    }

    private void postTrim()
    {
        synchronized (lock)
        {
            if (!isTrimPending)
            {
                isTrimPending = true;
                Settings.getExecutor().execute(new c(this));
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void renameToTargetAndTrim(String s, File file)
    {
        if (!file.renameTo(new File(directory, Utility.md5hash(s))))
        {
            file.delete();
        }
        postTrim();
    }

    private void trim()
    {
        synchronized (lock)
        {
            isTrimPending = false;
            isTrimInProgress = true;
        }
        Logger.log(TAG, "trim started");
        obj = new PriorityQueue();
        long l1;
        long l3;
        l1 = 0L;
        l3 = 0L;
        File afile[] = directory.listFiles(d.a());
        long l2;
        long l4;
        l2 = l3;
        l4 = l1;
        if (afile == null) goto _L2; else goto _L1
_L1:
        int i1 = afile.length;
        int l = 0;
_L3:
        File file1;
        l2 = l3;
        l4 = l1;
        if (l >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        file1 = afile[l];
        i j = new i(file1);
        ((PriorityQueue) (obj)).add(j);
        Logger.log(TAG, (new StringBuilder("  trim considering time=")).append(Long.valueOf(j.b())).append(" name=").append(j.a().getName()).toString());
        l2 = file1.length();
        l++;
        l3 = 1L + l3;
        l1 = l2 + l1;
        if (true) goto _L3; else goto _L2
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L5:
        if (l4 <= (long)limits.getByteCount() && l1 <= (long)limits.getFileCount())
        {
            break MISSING_BLOCK_LABEL_273;
        }
        File file = ((i)((PriorityQueue) (obj)).remove()).a();
        Logger.log(TAG, (new StringBuilder("  trim removing ")).append(file.getName()).toString());
        l4 -= file.length();
        file.delete();
        l1--;
        continue; /* Loop/switch isn't completed */
        synchronized (lock)
        {
            isTrimInProgress = false;
            lock.notifyAll();
        }
        return;
        exception1;
        obj1;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception2;
        exception2;
        synchronized (lock)
        {
            isTrimInProgress = false;
            lock.notifyAll();
        }
        throw exception2;
        exception3;
        obj2;
        JVM INSTR monitorexit ;
        throw exception3;
_L2:
        l1 = l2;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void clearCache()
    {
        File afile[] = directory.listFiles(d.a());
        lastClearCacheTime.set(System.currentTimeMillis());
        if (afile != null)
        {
            Settings.getExecutor().execute(new b(this, afile));
        }
    }

    public final InputStream get(String s)
    {
        return get(s, null);
    }

    public final InputStream get(String s, String s1)
    {
        File file = new File(directory, Utility.md5hash(s));
        Object obj;
        JSONObject jsonobject;
        String s2;
        long l;
        boolean flag;
        try
        {
            obj = new FileInputStream(file);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        obj = new BufferedInputStream(((InputStream) (obj)), 8192);
        jsonobject = k.a(((InputStream) (obj)));
        if (jsonobject == null)
        {
            ((BufferedInputStream) (obj)).close();
            return null;
        }
        s2 = jsonobject.optString("key");
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        flag = s2.equals(s);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        ((BufferedInputStream) (obj)).close();
        return null;
        s = jsonobject.optString("tag", null);
        if (s1 == null && s != null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        flag = s1.equals(s);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        ((BufferedInputStream) (obj)).close();
        return null;
        l = (new Date()).getTime();
        Logger.log(TAG, (new StringBuilder("Setting lastModified to ")).append(Long.valueOf(l)).append(" for ").append(file.getName()).toString());
        file.setLastModified(l);
        return ((InputStream) (obj));
        s;
        ((BufferedInputStream) (obj)).close();
        throw s;
    }

    public final InputStream interceptAndPut(String s, InputStream inputstream)
    {
        return new h(inputstream, openPutStream(s));
    }

    final OutputStream openPutStream(String s)
    {
        return openPutStream(s, null);
    }

    public final OutputStream openPutStream(String s, String s1)
    {
        Object obj;
        obj = d.b(directory);
        ((File) (obj)).delete();
        if (!((File) (obj)).createNewFile())
        {
            throw new IOException((new StringBuilder("Could not create file at ")).append(((File) (obj)).getAbsolutePath()).toString());
        }
        Object obj1;
        try
        {
            obj1 = new FileOutputStream(((File) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.log(5, TAG, (new StringBuilder("Error creating buffer output stream: ")).append(s).toString());
            throw new IOException(s.getMessage());
        }
        obj = new BufferedOutputStream(new g(((OutputStream) (obj1)), new a(this, System.currentTimeMillis(), ((File) (obj)), s)), 8192);
        obj1 = new JSONObject();
        ((JSONObject) (obj1)).put("key", s);
        if (!Utility.isNullOrEmpty(s1))
        {
            ((JSONObject) (obj1)).put("tag", s1);
        }
        s = ((JSONObject) (obj1)).toString().getBytes();
        ((OutputStream) (obj)).write(0);
        ((OutputStream) (obj)).write(s.length >> 16 & 0xff);
        ((OutputStream) (obj)).write(s.length >> 8 & 0xff);
        ((OutputStream) (obj)).write(s.length >> 0 & 0xff);
        ((OutputStream) (obj)).write(s);
        return ((OutputStream) (obj));
        s;
        Logger.log(5, TAG, (new StringBuilder("Error creating JSON header for cache file: ")).append(s).toString());
        throw new IOException(s.getMessage());
        s;
        ((BufferedOutputStream) (obj)).close();
        throw s;
    }

    final long sizeInBytesForTest()
    {
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
_L4:
        if (isTrimPending) goto _L2; else goto _L1
_L1:
        boolean flag = isTrimInProgress;
        if (!flag) goto _L3; else goto _L2
_L2:
        Exception exception;
        long l2;
        try
        {
            lock.wait();
        }
        catch (InterruptedException interruptedexception) { }
        finally { }
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        JVM INSTR monitorexit ;
        obj = directory.listFiles();
        long l1 = 0L;
        l2 = l1;
        if (obj != null)
        {
            int l = obj.length;
            int j = 0;
            do
            {
                l2 = l1;
                if (j >= l)
                {
                    break;
                }
                l2 = obj[j].length();
                j++;
                l1 = l2 + l1;
            } while (true);
        }
        break MISSING_BLOCK_LABEL_103;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        return l2;
    }

    public final String toString()
    {
        return (new StringBuilder("{FileLruCache: tag:")).append(tag).append(" file:").append(directory.getName()).append("}").toString();
    }






    private class Limits
    {

        private int byteCount;
        private int fileCount;

        final int getByteCount()
        {
            return byteCount;
        }

        final int getFileCount()
        {
            return fileCount;
        }

        final void setByteCount(int j)
        {
            if (j < 0)
            {
                throw new InvalidParameterException("Cache byte-count limit must be >= 0");
            } else
            {
                byteCount = j;
                return;
            }
        }

        final void setFileCount(int j)
        {
            if (j < 0)
            {
                throw new InvalidParameterException("Cache file count limit must be >= 0");
            } else
            {
                fileCount = j;
                return;
            }
        }

        public Limits()
        {
            fileCount = 1024;
            byteCount = 0x100000;
        }
    }

}
