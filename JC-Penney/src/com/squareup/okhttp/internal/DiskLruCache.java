// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import c.ac;
import c.i;
import c.j;
import c.r;
import com.squareup.okhttp.internal.io.FileSystem;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.squareup.okhttp.internal:
//            Util, Platform

public final class DiskLruCache
    implements Closeable
{

    static final boolean $assertionsDisabled;
    static final long ANY_SEQUENCE_NUMBER = -1L;
    private static final String CLEAN = "CLEAN";
    private static final String DIRTY = "DIRTY";
    static final String JOURNAL_FILE = "journal";
    static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    static final String JOURNAL_FILE_TEMP = "journal.tmp";
    static final Pattern LEGAL_KEY_PATTERN = Pattern.compile("[a-z0-9_-]{1,120}");
    static final String MAGIC = "libcore.io.DiskLruCache";
    private static final ac NULL_SINK = new _cls4();
    private static final String READ = "READ";
    private static final String REMOVE = "REMOVE";
    static final String VERSION_1 = "1";
    private final int appVersion;
    private final Runnable cleanupRunnable = new _cls1();
    private boolean closed;
    private final File directory;
    private final Executor executor;
    private final FileSystem fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    private i journalWriter;
    private final LinkedHashMap lruEntries = new LinkedHashMap(0, 0.75F, true);
    private long maxSize;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;

    DiskLruCache(FileSystem filesystem, File file, int k, int l, long l1, Executor executor1)
    {
        size = 0L;
        nextSequenceNumber = 0L;
        fileSystem = filesystem;
        directory = file;
        appVersion = k;
        journalFile = new File(file, "journal");
        journalFileTmp = new File(file, "journal.tmp");
        journalFileBackup = new File(file, "journal.bkp");
        valueCount = l;
        maxSize = l1;
        executor = executor1;
    }

    private void checkNotClosed()
    {
        this;
        JVM INSTR monitorenter ;
        if (isClosed())
        {
            throw new IllegalStateException("cache is closed");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    private void completeEdit(Editor editor, boolean flag)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        Entry entry;
        entry = editor.entry;
        if (entry.currentEditor != editor)
        {
            throw new IllegalStateException();
        }
        break MISSING_BLOCK_LABEL_31;
        editor;
        this;
        JVM INSTR monitorexit ;
        throw editor;
        int l = ((flag1) ? 1 : 0);
        if (!flag) goto _L2; else goto _L1
_L1:
        l = ((flag1) ? 1 : 0);
        if (entry.readable) goto _L2; else goto _L3
_L3:
        int k = 0;
_L7:
        l = ((flag1) ? 1 : 0);
        if (k >= valueCount) goto _L2; else goto _L4
_L4:
        if (!editor.written[k])
        {
            editor.abort();
            throw new IllegalStateException((new StringBuilder()).append("Newly created entry didn't create value for index ").append(k).toString());
        }
        if (fileSystem.exists(entry.dirtyFiles[k])) goto _L6; else goto _L5
_L5:
        editor.abort();
_L8:
        this;
        JVM INSTR monitorexit ;
        return;
_L6:
        k++;
          goto _L7
_L2:
        File file;
        long l1;
        long l2;
        for (; l >= valueCount; l++)
        {
            break MISSING_BLOCK_LABEL_259;
        }

        editor = entry.dirtyFiles[l];
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_246;
        }
        if (fileSystem.exists(editor))
        {
            file = entry.cleanFiles[l];
            fileSystem.rename(editor, file);
            l1 = entry.lengths[l];
            l2 = fileSystem.size(file);
            entry.lengths[l] = l2;
            size = (size - l1) + l2;
        }
        break MISSING_BLOCK_LABEL_472;
        fileSystem.delete(editor);
        break MISSING_BLOCK_LABEL_472;
        redundantOpCount = redundantOpCount + 1;
        entry.currentEditor = null;
        if (!(entry.readable | flag))
        {
            break MISSING_BLOCK_LABEL_412;
        }
        entry.readable = true;
        journalWriter.b("CLEAN").i(32);
        journalWriter.b(entry.key);
        entry.writeLengths(journalWriter);
        journalWriter.i(10);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_368;
        }
        l1 = nextSequenceNumber;
        nextSequenceNumber = 1L + l1;
        entry.sequenceNumber = l1;
_L9:
        journalWriter.flush();
        if (size > maxSize || journalRebuildRequired())
        {
            executor.execute(cleanupRunnable);
        }
          goto _L8
        lruEntries.remove(entry.key);
        journalWriter.b("REMOVE").i(32);
        journalWriter.b(entry.key);
        journalWriter.i(10);
          goto _L9
    }

    public static DiskLruCache create(FileSystem filesystem, File file, int k, int l, long l1)
    {
        if (l1 <= 0L)
        {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (l <= 0)
        {
            throw new IllegalArgumentException("valueCount <= 0");
        } else
        {
            return new DiskLruCache(filesystem, file, k, l, l1, new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory("OkHttp DiskLruCache", true)));
        }
    }

    private Editor edit(String s, long l)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        initialize();
        checkNotClosed();
        validateKey(s);
        obj = (Entry)lruEntries.get(s);
        if (l == -1L) goto _L2; else goto _L1
_L1:
        if (obj == null) goto _L4; else goto _L3
_L3:
        long l1 = ((Entry) (obj)).sequenceNumber;
        if (l1 == l) goto _L2; else goto _L4
_L4:
        s = null;
_L5:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        if (((Entry) (obj)).currentEditor == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        s = null;
          goto _L5
        journalWriter.b("DIRTY").i(32).b(s).i(10);
        journalWriter.flush();
        if (!hasJournalErrors)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        s = null;
          goto _L5
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_193;
        }
        obj = new Entry(s, null);
        lruEntries.put(s, obj);
        s = ((String) (obj));
_L6:
        obj = new Editor(s, null);
        s.currentEditor = ((Editor) (obj));
        s = ((String) (obj));
          goto _L5
        s;
        throw s;
        s = ((String) (obj));
          goto _L6
    }

    private boolean journalRebuildRequired()
    {
        return redundantOpCount >= 2000 && redundantOpCount >= lruEntries.size();
    }

    private i newJournalWriter()
    {
        return r.a(new _cls2(fileSystem.appendingSink(journalFile)));
    }

    private void processJournal()
    {
        fileSystem.delete(journalFileTmp);
        for (Iterator iterator = lruEntries.values().iterator(); iterator.hasNext();)
        {
            Entry entry = (Entry)iterator.next();
            if (entry.currentEditor == null)
            {
                int k = 0;
                while (k < valueCount) 
                {
                    size = size + entry.lengths[k];
                    k++;
                }
            } else
            {
                entry.currentEditor = null;
                for (int l = 0; l < valueCount; l++)
                {
                    fileSystem.delete(entry.cleanFiles[l]);
                    fileSystem.delete(entry.dirtyFiles[l]);
                }

                iterator.remove();
            }
        }

    }

    private void readJournal()
    {
        j j1 = r.a(fileSystem.source(journalFile));
        String s = j1.r();
        String s1 = j1.r();
        String s2 = j1.r();
        String s3 = j1.r();
        String s4 = j1.r();
        if (!"libcore.io.DiskLruCache".equals(s) || !"1".equals(s1) || !Integer.toString(appVersion).equals(s2) || !Integer.toString(valueCount).equals(s3) || !"".equals(s4))
        {
            throw new IOException((new StringBuilder()).append("unexpected journal header: [").append(s).append(", ").append(s1).append(", ").append(s3).append(", ").append(s4).append("]").toString());
        }
        break MISSING_BLOCK_LABEL_187;
        Object obj;
        obj;
        Util.closeQuietly(j1);
        throw obj;
        int k = 0;
_L2:
        readJournalLine(j1.r());
        k++;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        redundantOpCount = k - lruEntries.size();
        if (j1.f())
        {
            break MISSING_BLOCK_LABEL_242;
        }
        rebuildJournal();
_L3:
        Util.closeQuietly(j1);
        return;
        journalWriter = newJournalWriter();
          goto _L3
    }

    private void readJournalLine(String s)
    {
        int k;
        int l;
        int i1;
        k = s.indexOf(' ');
        if (k == -1)
        {
            throw new IOException((new StringBuilder()).append("unexpected journal line: ").append(s).toString());
        }
        l = k + 1;
        i1 = s.indexOf(' ', l);
        if (i1 != -1) goto _L2; else goto _L1
_L1:
        String s1 = s.substring(l);
        if (k != "REMOVE".length() || !s.startsWith("REMOVE")) goto _L4; else goto _L3
_L3:
        lruEntries.remove(s1);
_L6:
        return;
_L2:
        s1 = s.substring(l, i1);
_L4:
        Entry entry1 = (Entry)lruEntries.get(s1);
        Entry entry = entry1;
        if (entry1 == null)
        {
            entry = new Entry(s1, null);
            lruEntries.put(s1, entry);
        }
        if (i1 != -1 && k == "CLEAN".length() && s.startsWith("CLEAN"))
        {
            s = s.substring(i1 + 1).split(" ");
            entry.readable = true;
            entry.currentEditor = null;
            entry.setLengths(s);
            return;
        }
        if (i1 == -1 && k == "DIRTY".length() && s.startsWith("DIRTY"))
        {
            entry.currentEditor = new Editor(entry, null);
            return;
        }
        if (i1 != -1 || k != "READ".length() || !s.startsWith("READ"))
        {
            throw new IOException((new StringBuilder()).append("unexpected journal line: ").append(s).toString());
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void rebuildJournal()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (journalWriter != null)
        {
            journalWriter.close();
        }
        obj = r.a(fileSystem.sink(journalFileTmp));
        Iterator iterator;
        ((i) (obj)).b("libcore.io.DiskLruCache").i(10);
        ((i) (obj)).b("1").i(10);
        ((i) (obj)).k(appVersion).i(10);
        ((i) (obj)).k(valueCount).i(10);
        ((i) (obj)).i(10);
        iterator = lruEntries.values().iterator();
_L1:
        Entry entry;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_250;
            }
            entry = (Entry)iterator.next();
            if (entry.currentEditor == null)
            {
                break MISSING_BLOCK_LABEL_206;
            }
            ((i) (obj)).b("DIRTY").i(32);
            ((i) (obj)).b(entry.key);
            ((i) (obj)).i(10);
        } while (true);
        Exception exception;
        exception;
        ((i) (obj)).close();
        throw exception;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        ((i) (obj)).b("CLEAN").i(32);
        ((i) (obj)).b(entry.key);
        entry.writeLengths(((i) (obj)));
        ((i) (obj)).i(10);
          goto _L1
        ((i) (obj)).close();
        if (fileSystem.exists(journalFile))
        {
            fileSystem.rename(journalFile, journalFileBackup);
        }
        fileSystem.rename(journalFileTmp, journalFile);
        fileSystem.delete(journalFileBackup);
        journalWriter = newJournalWriter();
        hasJournalErrors = false;
        this;
        JVM INSTR monitorexit ;
    }

    private boolean removeEntry(Entry entry)
    {
        if (entry.currentEditor != null)
        {
            entry.currentEditor.hasErrors = true;
        }
        for (int k = 0; k < valueCount; k++)
        {
            fileSystem.delete(entry.cleanFiles[k]);
            size = size - entry.lengths[k];
            entry.lengths[k] = 0L;
        }

        redundantOpCount = redundantOpCount + 1;
        journalWriter.b("REMOVE").i(32).b(entry.key).i(10);
        lruEntries.remove(entry.key);
        if (journalRebuildRequired())
        {
            executor.execute(cleanupRunnable);
        }
        return true;
    }

    private void trimToSize()
    {
        while (size > maxSize) 
        {
            removeEntry((Entry)lruEntries.values().iterator().next());
        }
    }

    private void validateKey(String s)
    {
        if (!LEGAL_KEY_PATTERN.matcher(s).matches())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("keys must match regex [a-z0-9_-]{1,120}: \"").append(s).append("\"").toString());
        } else
        {
            return;
        }
    }

    public void close()
    {
        this;
        JVM INSTR monitorenter ;
        if (initialized && !closed) goto _L2; else goto _L1
_L1:
        closed = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Entry aentry[];
        int l;
        aentry = (Entry[])lruEntries.values().toArray(new Entry[lruEntries.size()]);
        l = aentry.length;
        Exception exception;
        Entry entry;
        for (int k = 0; k >= l; k++)
        {
            break MISSING_BLOCK_LABEL_83;
        }

        entry = aentry[k];
        if (entry.currentEditor != null)
        {
            entry.currentEditor.abort();
        }
        break MISSING_BLOCK_LABEL_114;
        trimToSize();
        journalWriter.close();
        journalWriter = null;
        closed = true;
        if (true) goto _L4; else goto _L3
_L3:
        exception;
        throw exception;
    }

    public void delete()
    {
        close();
        fileSystem.deleteContents(directory);
    }

    public Editor edit(String s)
    {
        return edit(s, -1L);
    }

    public void evictAll()
    {
        this;
        JVM INSTR monitorenter ;
        Entry aentry[];
        int l;
        initialize();
        aentry = (Entry[])lruEntries.values().toArray(new Entry[lruEntries.size()]);
        l = aentry.length;
        int k = 0;
_L2:
        if (k >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        removeEntry(aentry[k]);
        k++;
        if (true) goto _L2; else goto _L1
_L1:
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void flush()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = initialized;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        checkNotClosed();
        trimToSize();
        journalWriter.flush();
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public Snapshot get(String s)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        initialize();
        checkNotClosed();
        validateKey(s);
        obj = (Entry)lruEntries.get(s);
        if (obj == null) goto _L2; else goto _L1
_L1:
        boolean flag = ((Entry) (obj)).readable;
        if (flag) goto _L3; else goto _L2
_L2:
        s = null;
_L5:
        this;
        JVM INSTR monitorexit ;
        return s;
_L3:
        obj = ((Entry) (obj)).snapshot();
        if (obj == null)
        {
            s = null;
            continue; /* Loop/switch isn't completed */
        }
        redundantOpCount = redundantOpCount + 1;
        journalWriter.b("READ").i(32).b(s).i(10);
        s = ((String) (obj));
        if (!journalRebuildRequired())
        {
            continue; /* Loop/switch isn't completed */
        }
        executor.execute(cleanupRunnable);
        s = ((String) (obj));
        if (true) goto _L5; else goto _L4
_L4:
        s;
        throw s;
    }

    public File getDirectory()
    {
        return directory;
    }

    public long getMaxSize()
    {
        this;
        JVM INSTR monitorenter ;
        long l = maxSize;
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public void initialize()
    {
        this;
        JVM INSTR monitorenter ;
        if (!$assertionsDisabled && !Thread.holdsLock(this))
        {
            throw new AssertionError();
        }
        break MISSING_BLOCK_LABEL_28;
        Object obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        boolean flag = initialized;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (fileSystem.exists(journalFileBackup))
        {
            if (!fileSystem.exists(journalFile))
            {
                break MISSING_BLOCK_LABEL_189;
            }
            fileSystem.delete(journalFileBackup);
        }
_L3:
        flag = fileSystem.exists(journalFile);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_177;
        }
        readJournal();
        processJournal();
        initialized = true;
          goto _L1
        obj;
        Platform.get().logW((new StringBuilder()).append("DiskLruCache ").append(directory).append(" is corrupt: ").append(((IOException) (obj)).getMessage()).append(", removing").toString());
        delete();
        closed = false;
        rebuildJournal();
        initialized = true;
          goto _L1
        fileSystem.rename(journalFileBackup, journalFile);
          goto _L3
    }

    public boolean isClosed()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = closed;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean remove(String s)
    {
        this;
        JVM INSTR monitorenter ;
        initialize();
        checkNotClosed();
        validateKey(s);
        s = (Entry)lruEntries.get(s);
        if (s != null) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = removeEntry(s);
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public void setMaxSize(long l)
    {
        this;
        JVM INSTR monitorenter ;
        maxSize = l;
        if (initialized)
        {
            executor.execute(cleanupRunnable);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public long size()
    {
        this;
        JVM INSTR monitorenter ;
        long l;
        initialize();
        l = size;
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public Iterator snapshots()
    {
        this;
        JVM INSTR monitorenter ;
        _cls3 _lcls3;
        initialize();
        _lcls3 = new _cls3();
        this;
        JVM INSTR monitorexit ;
        return _lcls3;
        Exception exception;
        exception;
        throw exception;
    }

    static 
    {
        boolean flag;
        if (!com/squareup/okhttp/internal/DiskLruCache.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }















/*
    static int access$502(DiskLruCache disklrucache, int k)
    {
        disklrucache.redundantOpCount = k;
        return k;
    }

*/


/*
    static boolean access$602(DiskLruCache disklrucache, boolean flag)
    {
        disklrucache.hasJournalErrors = flag;
        return flag;
    }

*/

    private class _cls1
        implements Runnable
    {

        final DiskLruCache this$0;

        public void run()
        {
            boolean flag = false;
            DiskLruCache disklrucache = DiskLruCache.this;
            disklrucache;
            JVM INSTR monitorenter ;
            if (!initialized)
            {
                flag = true;
            }
            if (!(flag | closed))
            {
                break MISSING_BLOCK_LABEL_36;
            }
            disklrucache;
            JVM INSTR monitorexit ;
            return;
            trimToSize();
            if (journalRebuildRequired())
            {
                rebuildJournal();
                redundantOpCount = 0;
            }
            disklrucache;
            JVM INSTR monitorexit ;
            return;
            Object obj;
            obj;
            disklrucache;
            JVM INSTR monitorexit ;
            throw obj;
            obj;
            throw new RuntimeException(((Throwable) (obj)));
        }

        _cls1()
        {
            this$0 = DiskLruCache.this;
            super();
        }
    }


    private class Editor
    {
        private class Entry
        {

            private final File cleanFiles[];
            private Editor currentEditor;
            private final File dirtyFiles[];
            private final String key;
            private final long lengths[];
            private boolean readable;
            private long sequenceNumber;
            final DiskLruCache this$0;

            private IOException invalidLengths(String as[])
            {
                throw new IOException((new StringBuilder()).append("unexpected journal line: ").append(Arrays.toString(as)).toString());
            }

            private void setLengths(String as[])
            {
                if (as.length != valueCount)
                {
                    throw invalidLengths(as);
                }
                int k = 0;
                do
                {
                    try
                    {
                        if (k >= as.length)
                        {
                            break;
                        }
                        lengths[k] = Long.parseLong(as[k]);
                    }
                    catch (NumberFormatException numberformatexception)
                    {
                        throw invalidLengths(as);
                    }
                    k++;
                } while (true);
            }

            Snapshot snapshot()
            {
                ad aad[];
                long al[];
                int k;
                boolean flag;
                flag = false;
                if (!Thread.holdsLock(DiskLruCache.this))
                {
                    throw new AssertionError();
                }
                aad = new ad[valueCount];
                al = (long[])lengths.clone();
                k = 0;
_L2:
                if (k >= valueCount)
                {
                    break; /* Loop/switch isn't completed */
                }
                aad[k] = fileSystem.source(cleanFiles[k]);
                k++;
                if (true) goto _L2; else goto _L1
_L1:
                Snapshot snapshot1 = new Snapshot(key, sequenceNumber, aad, al, null);
                return snapshot1;
_L4:
                for (; k < valueCount && aad[k] != null; k++)
                {
                    Util.closeQuietly(aad[k]);
                }

                return null;
                FileNotFoundException filenotfoundexception;
                filenotfoundexception;
                k = ((flag) ? 1 : 0);
                if (true) goto _L4; else goto _L3
_L3:
            }

            void writeLengths(i k)
            {
                long al[] = lengths;
                int i1 = al.length;
                for (int l = 0; l < i1; l++)
                {
                    long l1 = al[l];
                    k.i(32).k(l1);
                }

            }








/*
            static long access$1602(Entry entry1, long l)
            {
                entry1.sequenceNumber = l;
                return l;
            }

*/



/*
            static boolean access$802(Entry entry1, boolean flag)
            {
                entry1.readable = flag;
                return flag;
            }

*/



/*
            static Editor access$902(Entry entry1, Editor editor)
            {
                entry1.currentEditor = editor;
                return editor;
            }

*/

            private Entry(String s)
            {
                this$0 = DiskLruCache.this;
                super();
                key = s;
                lengths = new long[valueCount];
                cleanFiles = new File[valueCount];
                dirtyFiles = new File[valueCount];
                s = (new StringBuilder(s)).append('.');
                int l = s.length();
                for (int k = 0; k < valueCount; k++)
                {
                    s.append(k);
                    cleanFiles[k] = new File(directory, s.toString());
                    s.append(".tmp");
                    dirtyFiles[k] = new File(directory, s.toString());
                    s.setLength(l);
                }

            }

            Entry(String s, _cls1 _pcls1)
            {
                this(s);
            }

            private class Snapshot
                implements Closeable
            {

                private final String key;
                private final long lengths[];
                private final long sequenceNumber;
                private final ad sources[];
                final DiskLruCache this$0;

                public void close()
                {
                    ad aad[] = sources;
                    int l = aad.length;
                    for (int k = 0; k < l; k++)
                    {
                        Util.closeQuietly(aad[k]);
                    }

                }

                public Editor edit()
                {
                    return DiskLruCache.this.edit(key, sequenceNumber);
                }

                public long getLength(int k)
                {
                    return lengths[k];
                }

                public ad getSource(int k)
                {
                    return sources[k];
                }

                public String key()
                {
                    return key;
                }


                private Snapshot(String s, long l, ad aad[], long al[])
                {
                    this$0 = DiskLruCache.this;
                    super();
                    key = s;
                    sequenceNumber = l;
                    sources = aad;
                    lengths = al;
                }

                Snapshot(String s, long l, ad aad[], long al[], _cls1 _pcls1)
                {
                    this(s, l, aad, al);
                }
            }

        }


        private boolean committed;
        private final Entry entry;
        private boolean hasErrors;
        final DiskLruCache this$0;
        private final boolean written[];

        public void abort()
        {
            synchronized (DiskLruCache.this)
            {
                completeEdit(this, false);
            }
            return;
            exception;
            disklrucache;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void abortUnlessCommitted()
        {
            DiskLruCache disklrucache = DiskLruCache.this;
            disklrucache;
            JVM INSTR monitorenter ;
            boolean flag = committed;
            if (flag)
            {
                break MISSING_BLOCK_LABEL_25;
            }
            Exception exception;
            try
            {
                completeEdit(this, false);
            }
            catch (IOException ioexception) { }
            disklrucache;
            JVM INSTR monitorexit ;
            return;
            exception;
            disklrucache;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void commit()
        {
            DiskLruCache disklrucache = DiskLruCache.this;
            disklrucache;
            JVM INSTR monitorenter ;
            if (!hasErrors)
            {
                break MISSING_BLOCK_LABEL_43;
            }
            completeEdit(this, false);
            removeEntry(entry);
_L2:
            committed = true;
            return;
            completeEdit(this, true);
            if (true) goto _L2; else goto _L1
_L1:
            Exception exception;
            exception;
            disklrucache;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public ac newSink(int k)
        {
            DiskLruCache disklrucache = DiskLruCache.this;
            disklrucache;
            JVM INSTR monitorenter ;
            if (entry.currentEditor != this)
            {
                throw new IllegalStateException();
            }
            break MISSING_BLOCK_LABEL_31;
            Object obj;
            obj;
            disklrucache;
            JVM INSTR monitorexit ;
            throw obj;
            Object obj1;
            if (!entry.readable)
            {
                written[k] = true;
            }
            obj1 = entry.dirtyFiles[k];
            obj1 = fileSystem.sink(((File) (obj1)));
            class _cls1 extends FaultHidingSink
            {

                final Editor this$1;

                protected void onException(IOException ioexception)
                {
                    synchronized (_fld0)
                    {
                        hasErrors = true;
                    }
                    return;
                    exception;
                    ioexception;
                    JVM INSTR monitorexit ;
                    throw exception;
                }

                _cls1(ac ac)
                {
                    this$1 = Editor.this;
                    super(ac);
                }
            }

            obj1 = new _cls1(((ac) (obj1)));
            disklrucache;
            JVM INSTR monitorexit ;
            return ((ac) (obj1));
            obj1;
            obj1 = DiskLruCache.NULL_SINK;
            disklrucache;
            JVM INSTR monitorexit ;
            return ((ac) (obj1));
        }

        public ad newSource(int k)
        {
            DiskLruCache disklrucache = DiskLruCache.this;
            disklrucache;
            JVM INSTR monitorenter ;
            if (entry.currentEditor != this)
            {
                throw new IllegalStateException();
            }
            break MISSING_BLOCK_LABEL_31;
            Object obj;
            obj;
            disklrucache;
            JVM INSTR monitorexit ;
            throw obj;
            if (entry.readable)
            {
                break MISSING_BLOCK_LABEL_45;
            }
            disklrucache;
            JVM INSTR monitorexit ;
            return null;
            ad ad = fileSystem.source(entry.cleanFiles[k]);
            disklrucache;
            JVM INSTR monitorexit ;
            return ad;
            ad;
            disklrucache;
            JVM INSTR monitorexit ;
            return null;
        }




/*
        static boolean access$1902(Editor editor, boolean flag)
        {
            editor.hasErrors = flag;
            return flag;
        }

*/

        private Editor(Entry entry1)
        {
            this$0 = DiskLruCache.this;
            super();
            entry = entry1;
            if (entry1.readable)
            {
                disklrucache = null;
            } else
            {
                disklrucache = new boolean[valueCount];
            }
            written = DiskLruCache.this;
        }

        Editor(Entry entry1, _cls1 _pcls1)
        {
            this(entry1);
        }
    }


    private class _cls2 extends FaultHidingSink
    {

        static final boolean $assertionsDisabled;
        final DiskLruCache this$0;

        protected void onException(IOException ioexception)
        {
            if (!$assertionsDisabled && !Thread.holdsLock(DiskLruCache.this))
            {
                throw new AssertionError();
            } else
            {
                hasJournalErrors = true;
                return;
            }
        }

        static 
        {
            boolean flag;
            if (!com/squareup/okhttp/internal/DiskLruCache.desiredAssertionStatus())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            $assertionsDisabled = flag;
        }

        _cls2(ac ac)
        {
            this$0 = DiskLruCache.this;
            super(ac);
        }
    }


    private class _cls3
        implements Iterator
    {

        final Iterator _flddelegate;
        Snapshot nextSnapshot;
        Snapshot removeSnapshot;
        final DiskLruCache this$0;

        public boolean hasNext()
        {
label0:
            {
                if (nextSnapshot != null)
                {
                    return true;
                }
                synchronized (DiskLruCache.this)
                {
                    if (!closed)
                    {
                        break label0;
                    }
                }
                return false;
            }
            Snapshot snapshot;
            do
            {
                if (!_flddelegate.hasNext())
                {
                    break MISSING_BLOCK_LABEL_71;
                }
                snapshot = ((Entry)_flddelegate.next()).snapshot();
            } while (snapshot == null);
            nextSnapshot = snapshot;
            disklrucache;
            JVM INSTR monitorexit ;
            return true;
            disklrucache;
            JVM INSTR monitorexit ;
            return false;
            exception;
            disklrucache;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public Snapshot next()
        {
            if (!hasNext())
            {
                throw new NoSuchElementException();
            } else
            {
                removeSnapshot = nextSnapshot;
                nextSnapshot = null;
                return removeSnapshot;
            }
        }

        public volatile Object next()
        {
            return next();
        }

        public void remove()
        {
            Exception exception;
            if (removeSnapshot == null)
            {
                throw new IllegalStateException("remove() before next()");
            }
            try
            {
                DiskLruCache.this.remove(removeSnapshot.key);
            }
            catch (IOException ioexception)
            {
                removeSnapshot = null;
                return;
            }
            finally
            {
                removeSnapshot = null;
            }
            removeSnapshot = null;
            return;
            throw exception;
        }

        _cls3()
        {
            this$0 = DiskLruCache.this;
            super();
            _flddelegate = (new ArrayList(lruEntries.values())).iterator();
        }
    }


    private class _cls4
        implements ac
    {

        public void close()
        {
        }

        public void flush()
        {
        }

        public ae timeout()
        {
            return ae.NONE;
        }

        public void write(f f1, long l)
        {
            f1.g(l);
        }

        _cls4()
        {
        }
    }

}
