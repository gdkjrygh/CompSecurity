// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
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

// Referenced classes of package com.facebook.internal:
//            Utility, Logger

public final class FileLruCache
{

    private static final String HEADER_CACHEKEY_KEY = "key";
    private static final String HEADER_CACHE_CONTENT_TAG_KEY = "tag";
    static final String TAG = com/facebook/internal/FileLruCache.getSimpleName();
    private static final AtomicLong bufferIndex = new AtomicLong();
    private final File directory;
    private boolean isTrimInProgress;
    private boolean isTrimPending;
    private AtomicLong lastClearCacheTime;
    private final Limits limits;
    private final Object lock = new Object();
    private final String tag;

    public FileLruCache(String s, Limits limits1)
    {
        lastClearCacheTime = new AtomicLong(0L);
        tag = s;
        limits = limits1;
        directory = new File(FacebookSdk.getCacheDir(), s);
        if (directory.mkdirs() || directory.isDirectory())
        {
            BufferFile.deleteAll(directory);
        }
    }

    private void postTrim()
    {
        synchronized (lock)
        {
            if (!isTrimPending)
            {
                isTrimPending = true;
                FacebookSdk.getExecutor().execute(new _cls3());
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
        Logger.log(LoggingBehavior.CACHE, TAG, "trim started");
        obj = new PriorityQueue();
        long l;
        long l2;
        l = 0L;
        l2 = 0L;
        File afile[] = directory.listFiles(BufferFile.excludeBufferFiles());
        long l1;
        long l3;
        l1 = l2;
        l3 = l;
        if (afile == null) goto _L2; else goto _L1
_L1:
        int j = afile.length;
        int i = 0;
_L3:
        File file1;
        l1 = l2;
        l3 = l;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        file1 = afile[i];
        ModifiedFile modifiedfile = new ModifiedFile(file1);
        ((PriorityQueue) (obj)).add(modifiedfile);
        Logger.log(LoggingBehavior.CACHE, TAG, (new StringBuilder("  trim considering time=")).append(Long.valueOf(modifiedfile.getModified())).append(" name=").append(modifiedfile.getFile().getName()).toString());
        l1 = file1.length();
        i++;
        l2 = 1L + l2;
        l = l1 + l;
        if (true) goto _L3; else goto _L2
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L5:
        if (l3 <= (long)limits.getByteCount() && l <= (long)limits.getFileCount())
        {
            break MISSING_BLOCK_LABEL_282;
        }
        File file = ((ModifiedFile)((PriorityQueue) (obj)).remove()).getFile();
        Logger.log(LoggingBehavior.CACHE, TAG, (new StringBuilder("  trim removing ")).append(file.getName()).toString());
        l3 -= file.length();
        file.delete();
        l--;
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
        l = l1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void clearCache()
    {
        final File filesToDelete[] = directory.listFiles(BufferFile.excludeBufferFiles());
        lastClearCacheTime.set(System.currentTimeMillis());
        if (filesToDelete != null)
        {
            FacebookSdk.getExecutor().execute(new _cls2());
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
        jsonobject = StreamHeader.readHeader(((InputStream) (obj)));
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
        Logger.log(LoggingBehavior.CACHE, TAG, (new StringBuilder("Setting lastModified to ")).append(Long.valueOf(l)).append(" for ").append(file.getName()).toString());
        file.setLastModified(l);
        return ((InputStream) (obj));
        s;
        ((BufferedInputStream) (obj)).close();
        throw s;
    }

    public final String getLocation()
    {
        return directory.getPath();
    }

    public final InputStream interceptAndPut(String s, InputStream inputstream)
    {
        return new CopyingInputStream(inputstream, openPutStream(s));
    }

    public final OutputStream openPutStream(String s)
    {
        return openPutStream(s, null);
    }

    public final OutputStream openPutStream(String s, String s1)
    {
        Object obj;
        obj = BufferFile.newFile(directory);
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
            Logger.log(LoggingBehavior.CACHE, 5, TAG, (new StringBuilder("Error creating buffer output stream: ")).append(s).toString());
            throw new IOException(s.getMessage());
        }
        obj = new BufferedOutputStream(new CloseCallbackOutputStream(((OutputStream) (obj1)), new _cls1()), 8192);
        obj1 = new JSONObject();
        ((JSONObject) (obj1)).put("key", s);
        if (!Utility.isNullOrEmpty(s1))
        {
            ((JSONObject) (obj1)).put("tag", s1);
        }
        StreamHeader.writeHeader(((OutputStream) (obj)), ((JSONObject) (obj1)));
        return ((OutputStream) (obj));
        s;
        Logger.log(LoggingBehavior.CACHE, 5, TAG, (new StringBuilder("Error creating JSON header for cache file: ")).append(s).toString());
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
        long l1;
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
        long l = 0L;
        l1 = l;
        if (obj != null)
        {
            int j = obj.length;
            int i = 0;
            do
            {
                l1 = l;
                if (i >= j)
                {
                    break;
                }
                l1 = obj[i].length();
                i++;
                l = l1 + l;
            } while (true);
        }
        break MISSING_BLOCK_LABEL_103;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        return l1;
    }

    public final String toString()
    {
        return (new StringBuilder("{FileLruCache: tag:")).append(tag).append(" file:").append(directory.getName()).append("}").toString();
    }






    private class BufferFile
    {

        private static final String FILE_NAME_PREFIX = "buffer";
        private static final FilenameFilter filterExcludeBufferFiles = new _cls1();
        private static final FilenameFilter filterExcludeNonBufferFiles = new _cls2();

        static void deleteAll(File file)
        {
            file = file.listFiles(excludeNonBufferFiles());
            if (file != null)
            {
                int j = file.length;
                for (int i = 0; i < j; i++)
                {
                    file[i].delete();
                }

            }
        }

        static FilenameFilter excludeBufferFiles()
        {
            return filterExcludeBufferFiles;
        }

        static FilenameFilter excludeNonBufferFiles()
        {
            return filterExcludeNonBufferFiles;
        }

        static File newFile(File file)
        {
            return new File(file, (new StringBuilder("buffer")).append(Long.valueOf(FileLruCache.bufferIndex.incrementAndGet()).toString()).toString());
        }


        private BufferFile()
        {
        }

        class _cls1
            implements FilenameFilter
        {

            public final boolean accept(File file, String s)
            {
                return !s.startsWith("buffer");
            }

                _cls1()
                {
                }
        }


        class _cls2
            implements FilenameFilter
        {

            public final boolean accept(File file, String s)
            {
                return s.startsWith("buffer");
            }

                _cls2()
                {
                }
        }

    }


    private class _cls3
        implements Runnable
    {

        final FileLruCache this$0;

        public void run()
        {
            trim();
        }

        _cls3()
        {
            this$0 = FileLruCache.this;
            super();
        }
    }


    private class ModifiedFile
        implements Comparable
    {

        private static final int HASH_MULTIPLIER = 37;
        private static final int HASH_SEED = 29;
        private final File file;
        private final long modified;

        public final int compareTo(ModifiedFile modifiedfile)
        {
            if (getModified() < modifiedfile.getModified())
            {
                return -1;
            }
            if (getModified() > modifiedfile.getModified())
            {
                return 1;
            } else
            {
                return getFile().compareTo(modifiedfile.getFile());
            }
        }

        public final volatile int compareTo(Object obj)
        {
            return compareTo((ModifiedFile)obj);
        }

        public final boolean equals(Object obj)
        {
            return (obj instanceof ModifiedFile) && compareTo((ModifiedFile)obj) == 0;
        }

        final File getFile()
        {
            return file;
        }

        final long getModified()
        {
            return modified;
        }

        public final int hashCode()
        {
            return (file.hashCode() + 1073) * 37 + (int)(modified % 0x7fffffffL);
        }

        ModifiedFile(File file1)
        {
            file = file1;
            modified = file1.lastModified();
        }
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

        final void setByteCount(int i)
        {
            if (i < 0)
            {
                throw new InvalidParameterException("Cache byte-count limit must be >= 0");
            } else
            {
                byteCount = i;
                return;
            }
        }

        final void setFileCount(int i)
        {
            if (i < 0)
            {
                throw new InvalidParameterException("Cache file count limit must be >= 0");
            } else
            {
                fileCount = i;
                return;
            }
        }

        public Limits()
        {
            fileCount = 1024;
            byteCount = 0x100000;
        }
    }


    private class _cls2
        implements Runnable
    {

        final FileLruCache this$0;
        final File val$filesToDelete[];

        public void run()
        {
            File afile[] = filesToDelete;
            int j = afile.length;
            for (int i = 0; i < j; i++)
            {
                afile[i].delete();
            }

        }

        _cls2()
        {
            this$0 = FileLruCache.this;
            filesToDelete = afile;
            super();
        }
    }


    private class StreamHeader
    {

        private static final int HEADER_VERSION = 0;

        static JSONObject readHeader(InputStream inputstream)
        {
            int l = 0;
            if (inputstream.read() != 0)
            {
                return null;
            }
            int j = 0;
            int i = 0;
            for (; j < 3; j++)
            {
                int i1 = inputstream.read();
                if (i1 == -1)
                {
                    Logger.log(LoggingBehavior.CACHE, FileLruCache.TAG, "readHeader: stream.read returned -1 while reading header size");
                    return null;
                }
                i = (i << 8) + (i1 & 0xff);
            }

            byte abyte0[] = new byte[i];
            for (int k = l; k < i; k += l)
            {
                l = inputstream.read(abyte0, k, i - k);
                if (l <= 0)
                {
                    Logger.log(LoggingBehavior.CACHE, FileLruCache.TAG, (new StringBuilder("readHeader: stream.read stopped at ")).append(Integer.valueOf(k)).append(" when expected ").append(i).toString());
                    return null;
                }
            }

            inputstream = new JSONTokener(new String(abyte0));
            inputstream = ((InputStream) (inputstream.nextValue()));
            if (inputstream instanceof JSONObject)
            {
                break MISSING_BLOCK_LABEL_201;
            }
            Logger.log(LoggingBehavior.CACHE, FileLruCache.TAG, (new StringBuilder("readHeader: expected JSONObject, got ")).append(inputstream.getClass().getCanonicalName()).toString());
            return null;
            try
            {
                inputstream = (JSONObject)inputstream;
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                throw new IOException(inputstream.getMessage());
            }
            return inputstream;
        }

        static void writeHeader(OutputStream outputstream, JSONObject jsonobject)
        {
            jsonobject = jsonobject.toString().getBytes();
            outputstream.write(0);
            outputstream.write(jsonobject.length >> 16 & 0xff);
            outputstream.write(jsonobject.length >> 8 & 0xff);
            outputstream.write(jsonobject.length >> 0 & 0xff);
            outputstream.write(jsonobject);
        }

        private StreamHeader()
        {
        }
    }


    private class CopyingInputStream extends InputStream
    {

        final InputStream input;
        final OutputStream output;

        public final int available()
        {
            return input.available();
        }

        public final void close()
        {
            input.close();
            output.close();
            return;
            Exception exception;
            exception;
            output.close();
            throw exception;
        }

        public final void mark(int i)
        {
            throw new UnsupportedOperationException();
        }

        public final boolean markSupported()
        {
            return false;
        }

        public final int read()
        {
            int i = input.read();
            if (i >= 0)
            {
                output.write(i);
            }
            return i;
        }

        public final int read(byte abyte0[])
        {
            int i = input.read(abyte0);
            if (i > 0)
            {
                output.write(abyte0, 0, i);
            }
            return i;
        }

        public final int read(byte abyte0[], int i, int j)
        {
            j = input.read(abyte0, i, j);
            if (j > 0)
            {
                output.write(abyte0, i, j);
            }
            return j;
        }

        public final void reset()
        {
            this;
            JVM INSTR monitorenter ;
            throw new UnsupportedOperationException();
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final long skip(long l)
        {
            byte abyte0[] = new byte[1024];
            long l1 = 0L;
            do
            {
                int i;
label0:
                {
                    if (l1 < l)
                    {
                        i = read(abyte0, 0, (int)Math.min(l - l1, 1024L));
                        if (i >= 0)
                        {
                            break label0;
                        }
                    }
                    return l1;
                }
                l1 += i;
            } while (true);
        }

        CopyingInputStream(InputStream inputstream, OutputStream outputstream)
        {
            input = inputstream;
            output = outputstream;
        }
    }


    private class CloseCallbackOutputStream extends OutputStream
    {

        final StreamCloseCallback callback;
        final OutputStream innerStream;

        public void close()
        {
            innerStream.close();
            callback.onClose();
            return;
            Exception exception;
            exception;
            callback.onClose();
            throw exception;
        }

        public void flush()
        {
            innerStream.flush();
        }

        public void write(int i)
        {
            innerStream.write(i);
        }

        public void write(byte abyte0[])
        {
            innerStream.write(abyte0);
        }

        public void write(byte abyte0[], int i, int j)
        {
            innerStream.write(abyte0, i, j);
        }

        CloseCallbackOutputStream(OutputStream outputstream, StreamCloseCallback streamclosecallback)
        {
            innerStream = outputstream;
            callback = streamclosecallback;
        }

        private class StreamCloseCallback
        {

            public abstract void onClose();
        }

    }


    private class _cls1
        implements StreamCloseCallback
    {

        final FileLruCache this$0;
        final File val$buffer;
        final long val$bufferFileCreateTime;
        final String val$key;

        public void onClose()
        {
            if (bufferFileCreateTime < lastClearCacheTime.get())
            {
                buffer.delete();
                return;
            } else
            {
                renameToTargetAndTrim(key, buffer);
                return;
            }
        }

        _cls1()
        {
            this$0 = FileLruCache.this;
            bufferFileCreateTime = l;
            buffer = file;
            key = s;
            super();
        }
    }

}
