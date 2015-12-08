// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import com.squareup.okhttp.internal.io.FileSystem;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Sink;
import okio.Timeout;

// Referenced classes of package com.squareup.okhttp.internal:
//            Util, Platform, FaultHidingSink

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
    private static final Sink NULL_SINK = new Sink() {

        public void close()
        {
        }

        public void flush()
        {
        }

        public Timeout timeout()
        {
            return Timeout.NONE;
        }

        public void write(Buffer buffer, long l)
        {
            buffer.skip(l);
        }

    };
    private static final String READ = "READ";
    private static final String REMOVE = "REMOVE";
    static final String VERSION_1 = "1";
    private final int appVersion;
    private final Runnable cleanupRunnable = new Runnable() {

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

            
            {
                this$0 = DiskLruCache.this;
                super();
            }
    };
    private boolean closed;
    private final File directory;
    private final Executor executor;
    private final FileSystem fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    private BufferedSink journalWriter;
    private final LinkedHashMap lruEntries = new LinkedHashMap(0, 0.75F, true);
    private long maxSize;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;

    DiskLruCache(FileSystem filesystem, File file, int i, int j, long l, Executor executor1)
    {
        size = 0L;
        nextSequenceNumber = 0L;
        fileSystem = filesystem;
        directory = file;
        appVersion = i;
        journalFile = new File(file, "journal");
        journalFileTmp = new File(file, "journal.tmp");
        journalFileBackup = new File(file, "journal.bkp");
        valueCount = j;
        maxSize = l;
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
        int j = ((flag1) ? 1 : 0);
        if (!flag) goto _L2; else goto _L1
_L1:
        j = ((flag1) ? 1 : 0);
        if (entry.readable) goto _L2; else goto _L3
_L3:
        int i = 0;
_L7:
        j = ((flag1) ? 1 : 0);
        if (i >= valueCount) goto _L2; else goto _L4
_L4:
        if (!editor.written[i])
        {
            editor.abort();
            throw new IllegalStateException((new StringBuilder()).append("Newly created entry didn't create value for index ").append(i).toString());
        }
        if (fileSystem.exists(entry.dirtyFiles[i])) goto _L6; else goto _L5
_L5:
        editor.abort();
_L8:
        this;
        JVM INSTR monitorexit ;
        return;
_L6:
        i++;
          goto _L7
_L2:
        File file;
        long l;
        long l1;
        for (; j >= valueCount; j++)
        {
            break MISSING_BLOCK_LABEL_259;
        }

        editor = entry.dirtyFiles[j];
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_246;
        }
        if (fileSystem.exists(editor))
        {
            file = entry.cleanFiles[j];
            fileSystem.rename(editor, file);
            l = entry.lengths[j];
            l1 = fileSystem.size(file);
            entry.lengths[j] = l1;
            size = (size - l) + l1;
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
        journalWriter.writeUtf8("CLEAN").writeByte(32);
        journalWriter.writeUtf8(entry.key);
        entry.writeLengths(journalWriter);
        journalWriter.writeByte(10);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_368;
        }
        l = nextSequenceNumber;
        nextSequenceNumber = 1L + l;
        entry.sequenceNumber = l;
_L9:
        journalWriter.flush();
        if (size > maxSize || journalRebuildRequired())
        {
            executor.execute(cleanupRunnable);
        }
          goto _L8
        lruEntries.remove(entry.key);
        journalWriter.writeUtf8("REMOVE").writeByte(32);
        journalWriter.writeUtf8(entry.key);
        journalWriter.writeByte(10);
          goto _L9
    }

    public static DiskLruCache create(FileSystem filesystem, File file, int i, int j, long l)
    {
        if (l <= 0L)
        {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (j <= 0)
        {
            throw new IllegalArgumentException("valueCount <= 0");
        } else
        {
            return new DiskLruCache(filesystem, file, i, j, l, new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory("OkHttp DiskLruCache", true)));
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
        journalWriter.writeUtf8("DIRTY").writeByte(32).writeUtf8(s).writeByte(10);
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
        obj = new Entry(s);
        lruEntries.put(s, obj);
        s = ((String) (obj));
_L6:
        obj = new Editor(s);
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

    private BufferedSink newJournalWriter()
    {
        return Okio.buffer(new FaultHidingSink(fileSystem.appendingSink(journalFile)) {

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

            
            {
                this$0 = DiskLruCache.this;
                super(sink);
            }
        });
    }

    private void processJournal()
    {
        fileSystem.delete(journalFileTmp);
        for (Iterator iterator = lruEntries.values().iterator(); iterator.hasNext();)
        {
            Entry entry = (Entry)iterator.next();
            if (entry.currentEditor == null)
            {
                int i = 0;
                while (i < valueCount) 
                {
                    size = size + entry.lengths[i];
                    i++;
                }
            } else
            {
                entry.currentEditor = null;
                for (int j = 0; j < valueCount; j++)
                {
                    fileSystem.delete(entry.cleanFiles[j]);
                    fileSystem.delete(entry.dirtyFiles[j]);
                }

                iterator.remove();
            }
        }

    }

    private void readJournal()
    {
        BufferedSource bufferedsource = Okio.buffer(fileSystem.source(journalFile));
        String s = bufferedsource.readUtf8LineStrict();
        String s1 = bufferedsource.readUtf8LineStrict();
        String s2 = bufferedsource.readUtf8LineStrict();
        String s3 = bufferedsource.readUtf8LineStrict();
        String s4 = bufferedsource.readUtf8LineStrict();
        if (!"libcore.io.DiskLruCache".equals(s) || !"1".equals(s1) || !Integer.toString(appVersion).equals(s2) || !Integer.toString(valueCount).equals(s3) || !"".equals(s4))
        {
            throw new IOException((new StringBuilder()).append("unexpected journal header: [").append(s).append(", ").append(s1).append(", ").append(s3).append(", ").append(s4).append("]").toString());
        }
        break MISSING_BLOCK_LABEL_187;
        Object obj;
        obj;
        Util.closeQuietly(bufferedsource);
        throw obj;
        int i = 0;
_L2:
        readJournalLine(bufferedsource.readUtf8LineStrict());
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        redundantOpCount = i - lruEntries.size();
        if (bufferedsource.exhausted())
        {
            break MISSING_BLOCK_LABEL_242;
        }
        rebuildJournal();
_L3:
        Util.closeQuietly(bufferedsource);
        return;
        journalWriter = newJournalWriter();
          goto _L3
    }

    private void readJournalLine(String s)
    {
        int i;
        int j;
        int k;
        i = s.indexOf(' ');
        if (i == -1)
        {
            throw new IOException((new StringBuilder()).append("unexpected journal line: ").append(s).toString());
        }
        j = i + 1;
        k = s.indexOf(' ', j);
        if (k != -1) goto _L2; else goto _L1
_L1:
        String s1 = s.substring(j);
        if (i != "REMOVE".length() || !s.startsWith("REMOVE")) goto _L4; else goto _L3
_L3:
        lruEntries.remove(s1);
_L6:
        return;
_L2:
        s1 = s.substring(j, k);
_L4:
        Entry entry1 = (Entry)lruEntries.get(s1);
        Entry entry = entry1;
        if (entry1 == null)
        {
            entry = new Entry(s1);
            lruEntries.put(s1, entry);
        }
        if (k != -1 && i == "CLEAN".length() && s.startsWith("CLEAN"))
        {
            s = s.substring(k + 1).split(" ");
            entry.readable = true;
            entry.currentEditor = null;
            entry.setLengths(s);
            return;
        }
        if (k == -1 && i == "DIRTY".length() && s.startsWith("DIRTY"))
        {
            entry.currentEditor = new Editor(entry);
            return;
        }
        if (k != -1 || i != "READ".length() || !s.startsWith("READ"))
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
        obj = Okio.buffer(fileSystem.sink(journalFileTmp));
        Iterator iterator;
        ((BufferedSink) (obj)).writeUtf8("libcore.io.DiskLruCache").writeByte(10);
        ((BufferedSink) (obj)).writeUtf8("1").writeByte(10);
        ((BufferedSink) (obj)).writeDecimalLong(appVersion).writeByte(10);
        ((BufferedSink) (obj)).writeDecimalLong(valueCount).writeByte(10);
        ((BufferedSink) (obj)).writeByte(10);
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
            ((BufferedSink) (obj)).writeUtf8("DIRTY").writeByte(32);
            ((BufferedSink) (obj)).writeUtf8(entry.key);
            ((BufferedSink) (obj)).writeByte(10);
        } while (true);
        Exception exception;
        exception;
        ((BufferedSink) (obj)).close();
        throw exception;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        ((BufferedSink) (obj)).writeUtf8("CLEAN").writeByte(32);
        ((BufferedSink) (obj)).writeUtf8(entry.key);
        entry.writeLengths(((BufferedSink) (obj)));
        ((BufferedSink) (obj)).writeByte(10);
          goto _L1
        ((BufferedSink) (obj)).close();
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
        for (int i = 0; i < valueCount; i++)
        {
            fileSystem.delete(entry.cleanFiles[i]);
            size = size - entry.lengths[i];
            entry.lengths[i] = 0L;
        }

        redundantOpCount = redundantOpCount + 1;
        journalWriter.writeUtf8("REMOVE").writeByte(32).writeUtf8(entry.key).writeByte(10);
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
        int j;
        aentry = (Entry[])lruEntries.values().toArray(new Entry[lruEntries.size()]);
        j = aentry.length;
        Exception exception;
        Entry entry;
        for (int i = 0; i >= j; i++)
        {
            break MISSING_BLOCK_LABEL_83;
        }

        entry = aentry[i];
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
        int j;
        initialize();
        aentry = (Entry[])lruEntries.values().toArray(new Entry[lruEntries.size()]);
        j = aentry.length;
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        removeEntry(aentry[i]);
        i++;
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
        journalWriter.writeUtf8("READ").writeByte(32).writeUtf8(s).writeByte(10);
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

    void initialize()
    {
        if (!$assertionsDisabled && !Thread.holdsLock(this))
        {
            throw new AssertionError();
        }
        if (initialized)
        {
            return;
        }
        if (fileSystem.exists(journalFileBackup))
        {
            if (fileSystem.exists(journalFile))
            {
                fileSystem.delete(journalFileBackup);
            } else
            {
                fileSystem.rename(journalFileBackup, journalFile);
            }
        }
        if (fileSystem.exists(journalFile))
        {
            try
            {
                readJournal();
                processJournal();
                initialized = true;
                return;
            }
            catch (IOException ioexception)
            {
                Platform.get().logW((new StringBuilder()).append("DiskLruCache ").append(directory).append(" is corrupt: ").append(ioexception.getMessage()).append(", removing").toString());
            }
            delete();
            closed = false;
        }
        rebuildJournal();
        initialized = true;
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
        Iterator iterator;
        initialize();
        iterator = new Iterator() {

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
                exception1;
                disklrucache;
                JVM INSTR monitorexit ;
                throw exception1;
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
                Exception exception1;
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
                throw exception1;
            }

            
            {
                this$0 = DiskLruCache.this;
                super();
                _flddelegate = (new ArrayList(lruEntries.values())).iterator();
            }

            private class Snapshot
                implements Closeable
            {

                private final String key;
                private final long lengths[];
                private final long sequenceNumber;
                private final Source sources[];
                final DiskLruCache this$0;

                public void close()
                {
                    Source asource[] = sources;
                    int j = asource.length;
                    for (int i = 0; i < j; i++)
                    {
                        Util.closeQuietly(asource[i]);
                    }

                }

                public Editor edit()
                {
                    return DiskLruCache.this.edit(key, sequenceNumber);
                }

                public long getLength(int i)
                {
                    return lengths[i];
                }

                public Source getSource(int i)
                {
                    return sources[i];
                }

                public String key()
                {
                    return key;
                }


                private Snapshot(String s, long l, Source asource[], long al[])
                {
                    this$0 = DiskLruCache.this;
                    super();
                    key = s;
                    sequenceNumber = l;
                    sources = asource;
                    lengths = al;
                }

                Snapshot(String s, long l, Source asource[], long al[], _cls1 _pcls1)
                {
                    this(s, l, asource, al);
                }
            }

        };
        this;
        JVM INSTR monitorexit ;
        return iterator;
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
    static int access$502(DiskLruCache disklrucache, int i)
    {
        disklrucache.redundantOpCount = i;
        return i;
    }

*/


/*
    static boolean access$602(DiskLruCache disklrucache, boolean flag)
    {
        disklrucache.hasJournalErrors = flag;
        return flag;
    }

*/

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
                int i = 0;
                do
                {
                    try
                    {
                        if (i >= as.length)
                        {
                            break;
                        }
                        lengths[i] = Long.parseLong(as[i]);
                    }
                    catch (NumberFormatException numberformatexception)
                    {
                        throw invalidLengths(as);
                    }
                    i++;
                } while (true);
            }

            Snapshot snapshot()
            {
                Source asource[];
                long al[];
                int i;
                boolean flag;
                flag = false;
                if (!Thread.holdsLock(DiskLruCache.this))
                {
                    throw new AssertionError();
                }
                asource = new Source[valueCount];
                al = (long[])lengths.clone();
                i = 0;
_L2:
                if (i >= valueCount)
                {
                    break; /* Loop/switch isn't completed */
                }
                asource[i] = fileSystem.source(cleanFiles[i]);
                i++;
                if (true) goto _L2; else goto _L1
_L1:
                Snapshot snapshot1 = new Snapshot(key, sequenceNumber, asource, al);
                return snapshot1;
_L4:
                for (; i < valueCount && asource[i] != null; i++)
                {
                    Util.closeQuietly(asource[i]);
                }

                return null;
                FileNotFoundException filenotfoundexception;
                filenotfoundexception;
                i = ((flag) ? 1 : 0);
                if (true) goto _L4; else goto _L3
_L3:
            }

            void writeLengths(BufferedSink bufferedsink)
            {
                long al[] = lengths;
                int j = al.length;
                for (int i = 0; i < j; i++)
                {
                    long l = al[i];
                    bufferedsink.writeByte(32).writeDecimalLong(l);
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
                int j = s.length();
                for (int i = 0; i < valueCount; i++)
                {
                    s.append(i);
                    cleanFiles[i] = new File(directory, s.toString());
                    s.append(".tmp");
                    dirtyFiles[i] = new File(directory, s.toString());
                    s.setLength(j);
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

        public Sink newSink(int i)
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
                written[i] = true;
            }
            obj1 = entry.dirtyFiles[i];
            obj1 = fileSystem.sink(((File) (obj1)));
            obj1 = new FaultHidingSink(((Sink) (obj1))) {

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

                
                {
                    this$1 = Editor.this;
                    super(sink);
                }
            };
            disklrucache;
            JVM INSTR monitorexit ;
            return ((Sink) (obj1));
            obj1;
            obj1 = DiskLruCache.NULL_SINK;
            disklrucache;
            JVM INSTR monitorexit ;
            return ((Sink) (obj1));
        }

        public Source newSource(int i)
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
            Source source = fileSystem.source(entry.cleanFiles[i]);
            disklrucache;
            JVM INSTR monitorexit ;
            return source;
            source;
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

    }

}
