// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.mopub.common:
//            e, d, g, DiskLruCacheUtil, 
//            h

public final class DiskLruCache
    implements Closeable
{

    static final Pattern a = Pattern.compile("[a-z0-9_-]{1,64}");
    private static final OutputStream p = new e();
    final ThreadPoolExecutor b;
    private final File c;
    private final File d;
    private final File e;
    private final File f;
    private final int g;
    private long h;
    private final int i;
    private long j;
    private Writer k;
    private final LinkedHashMap l = new LinkedHashMap(0, 0.75F, true);
    private int m;
    private long n;
    private final Callable o = new d(this);

    private DiskLruCache(File file, int i1, int j1, long l1)
    {
        j = 0L;
        n = 0L;
        b = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        c = file;
        g = i1;
        d = new File(file, "journal");
        e = new File(file, "journal.tmp");
        f = new File(file, "journal.bkp");
        i = j1;
        h = l1;
    }

    static Editor a(DiskLruCache disklrucache, String s, long l1)
    {
        return disklrucache.a(s, l1);
    }

    private Editor a(String s, long l1)
    {
        this;
        JVM INSTR monitorenter ;
        g g1;
        f();
        a(s);
        g1 = (g)l.get(s);
        if (l1 == -1L) goto _L2; else goto _L1
_L1:
        if (g1 == null) goto _L4; else goto _L3
_L3:
        long l2 = com.mopub.common.g.f(g1);
        if (l2 == l1) goto _L2; else goto _L4
_L4:
        s = null;
_L10:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        if (g1 != null) goto _L6; else goto _L5
_L5:
        g1 = new g(this, s, (byte)0);
        l.put(s, g1);
_L8:
        Editor editor;
        editor = new Editor(g1, (byte)0);
        com.mopub.common.g.a(g1, editor);
        k.write((new StringBuilder("DIRTY ")).append(s).append('\n').toString());
        k.flush();
        s = editor;
        continue; /* Loop/switch isn't completed */
        s;
        throw s;
_L6:
        editor = com.mopub.common.g.b(g1);
        if (editor == null) goto _L8; else goto _L7
_L7:
        s = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    static OutputStream a()
    {
        return p;
    }

    static Writer a(DiskLruCache disklrucache)
    {
        return disklrucache.k;
    }

    static String a(InputStream inputstream)
    {
        return DiskLruCacheUtil.a(new InputStreamReader(inputstream, DiskLruCacheUtil.b));
    }

    private void a(Editor editor, boolean flag)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        g g1;
        g1 = Editor.a(editor);
        if (com.mopub.common.g.b(g1) != editor)
        {
            throw new IllegalStateException();
        }
        break MISSING_BLOCK_LABEL_31;
        editor;
        this;
        JVM INSTR monitorexit ;
        throw editor;
        int j1 = ((flag1) ? 1 : 0);
        if (!flag) goto _L2; else goto _L1
_L1:
        j1 = ((flag1) ? 1 : 0);
        if (com.mopub.common.g.e(g1)) goto _L2; else goto _L3
_L3:
        int i1 = 0;
_L7:
        j1 = ((flag1) ? 1 : 0);
        if (i1 >= i) goto _L2; else goto _L4
_L4:
        if (!Editor.b(editor)[i1])
        {
            editor.abort();
            throw new IllegalStateException((new StringBuilder("Newly created entry didn't create value for index ")).append(i1).toString());
        }
        if (g1.getDirtyFile(i1).exists()) goto _L6; else goto _L5
_L5:
        editor.abort();
_L8:
        this;
        JVM INSTR monitorexit ;
        return;
_L6:
        i1++;
          goto _L7
_L2:
        File file;
        long l1;
        long l2;
        for (; j1 >= i; j1++)
        {
            break MISSING_BLOCK_LABEL_224;
        }

        editor = g1.getDirtyFile(j1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        if (editor.exists())
        {
            file = g1.getCleanFile(j1);
            editor.renameTo(file);
            l1 = com.mopub.common.g.c(g1)[j1];
            l2 = file.length();
            com.mopub.common.g.c(g1)[j1] = l2;
            j = (j - l1) + l2;
        }
        break MISSING_BLOCK_LABEL_405;
        a(((File) (editor)));
        break MISSING_BLOCK_LABEL_405;
        m = m + 1;
        com.mopub.common.g.a(g1, null);
        if (!(com.mopub.common.g.e(g1) | flag))
        {
            break MISSING_BLOCK_LABEL_358;
        }
        com.mopub.common.g.a(g1);
        k.write((new StringBuilder("CLEAN ")).append(com.mopub.common.g.d(g1)).append(g1.getLengths()).append('\n').toString());
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_317;
        }
        l1 = n;
        n = 1L + l1;
        com.mopub.common.g.a(g1, l1);
_L9:
        k.flush();
        if (j > h || e())
        {
            b.submit(o);
        }
          goto _L8
        l.remove(com.mopub.common.g.d(g1));
        k.write((new StringBuilder("REMOVE ")).append(com.mopub.common.g.d(g1)).append('\n').toString());
          goto _L9
    }

    static void a(DiskLruCache disklrucache, Editor editor, boolean flag)
    {
        disklrucache.a(editor, flag);
    }

    private static void a(File file)
    {
        if (file.exists() && !file.delete())
        {
            throw new IOException();
        } else
        {
            return;
        }
    }

    private static void a(File file, File file1, boolean flag)
    {
        if (flag)
        {
            a(file1);
        }
        if (!file.renameTo(file1))
        {
            throw new IOException();
        } else
        {
            return;
        }
    }

    private static void a(String s)
    {
        if (!a.matcher(s).matches())
        {
            throw new IllegalArgumentException((new StringBuilder("keys must match regex [a-z0-9_-]{1,64}: \"")).append(s).append("\"").toString());
        } else
        {
            return;
        }
    }

    private void b()
    {
        h h1 = new h(new FileInputStream(d), DiskLruCacheUtil.a);
        Exception exception;
        String s = h1.readLine();
        String s2 = h1.readLine();
        String s3 = h1.readLine();
        String s4 = h1.readLine();
        String s6 = h1.readLine();
        if (!"libcore.io.DiskLruCache".equals(s) || !"1".equals(s2) || !Integer.toString(g).equals(s3) || !Integer.toString(i).equals(s4) || !"".equals(s6))
        {
            throw new IOException((new StringBuilder("unexpected journal header: [")).append(s).append(", ").append(s2).append(", ").append(s4).append(", ").append(s6).append("]").toString());
        }
        int i1 = 0;
_L2:
        String s5;
        int j1;
        s5 = h1.readLine();
        j1 = s5.indexOf(' ');
        if (j1 != -1)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        try
        {
            throw new IOException((new StringBuilder("unexpected journal line: ")).append(s5).toString());
        }
        catch (EOFException eofexception) { }
        finally
        {
            DiskLruCacheUtil.a(h1);
            throw exception;
        }
        m = i1 - l.size();
        DiskLruCacheUtil.a(h1);
        return;
        int k1 = j1 + 1;
        int l1 = s5.indexOf(' ', k1);
        if (l1 != -1)
        {
            break MISSING_BLOCK_LABEL_319;
        }
        String s1 = s5.substring(k1);
        if (j1 != 6)
        {
            break MISSING_BLOCK_LABEL_329;
        }
        if (s5.startsWith("REMOVE"))
        {
            l.remove(s1);
            break MISSING_BLOCK_LABEL_519;
        }
        break MISSING_BLOCK_LABEL_329;
        s1 = s5.substring(k1, l1);
        g g2 = (g)l.get(s1);
        g g1;
        g1 = g2;
        if (g2 != null)
        {
            break MISSING_BLOCK_LABEL_368;
        }
        g1 = new g(this, s1, (byte)0);
        l.put(s1, g1);
        if (l1 == -1 || j1 != 5)
        {
            break MISSING_BLOCK_LABEL_426;
        }
        if (s5.startsWith("CLEAN"))
        {
            String as[] = s5.substring(l1 + 1).split(" ");
            com.mopub.common.g.a(g1);
            com.mopub.common.g.a(g1, null);
            com.mopub.common.g.a(g1, as);
            break MISSING_BLOCK_LABEL_519;
        }
        if (l1 != -1 || j1 != 5)
        {
            break MISSING_BLOCK_LABEL_467;
        }
        if (s5.startsWith("DIRTY"))
        {
            com.mopub.common.g.a(g1, new Editor(g1, (byte)0));
            break MISSING_BLOCK_LABEL_519;
        }
        if (l1 != -1 || j1 != 4)
        {
            break MISSING_BLOCK_LABEL_490;
        }
        if (s5.startsWith("READ"))
        {
            break MISSING_BLOCK_LABEL_519;
        }
        throw new IOException((new StringBuilder("unexpected journal line: ")).append(s5).toString());
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static void b(DiskLruCache disklrucache)
    {
        disklrucache.g();
    }

    private void c()
    {
        a(e);
        for (Iterator iterator = l.values().iterator(); iterator.hasNext();)
        {
            g g1 = (g)iterator.next();
            if (com.mopub.common.g.b(g1) == null)
            {
                int i1 = 0;
                while (i1 < i) 
                {
                    j = j + com.mopub.common.g.c(g1)[i1];
                    i1++;
                }
            } else
            {
                com.mopub.common.g.a(g1, null);
                for (int j1 = 0; j1 < i; j1++)
                {
                    a(g1.getCleanFile(j1));
                    a(g1.getDirtyFile(j1));
                }

                iterator.remove();
            }
        }

    }

    static boolean c(DiskLruCache disklrucache)
    {
        return disklrucache.e();
    }

    private void d()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (k != null)
        {
            k.close();
        }
        obj = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(e), DiskLruCacheUtil.a));
        Iterator iterator;
        ((Writer) (obj)).write("libcore.io.DiskLruCache");
        ((Writer) (obj)).write("\n");
        ((Writer) (obj)).write("1");
        ((Writer) (obj)).write("\n");
        ((Writer) (obj)).write(Integer.toString(g));
        ((Writer) (obj)).write("\n");
        ((Writer) (obj)).write(Integer.toString(i));
        ((Writer) (obj)).write("\n");
        ((Writer) (obj)).write("\n");
        iterator = l.values().iterator();
_L1:
        g g1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_236;
            }
            g1 = (g)iterator.next();
            if (com.mopub.common.g.b(g1) == null)
            {
                break MISSING_BLOCK_LABEL_198;
            }
            ((Writer) (obj)).write((new StringBuilder("DIRTY ")).append(com.mopub.common.g.d(g1)).append('\n').toString());
        } while (true);
        Exception exception;
        exception;
        ((Writer) (obj)).close();
        throw exception;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        ((Writer) (obj)).write((new StringBuilder("CLEAN ")).append(com.mopub.common.g.d(g1)).append(g1.getLengths()).append('\n').toString());
          goto _L1
        ((Writer) (obj)).close();
        if (d.exists())
        {
            a(d, f, true);
        }
        a(e, d, false);
        f.delete();
        k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(d, true), DiskLruCacheUtil.a));
        this;
        JVM INSTR monitorexit ;
    }

    static void d(DiskLruCache disklrucache)
    {
        disklrucache.d();
    }

    static int e(DiskLruCache disklrucache)
    {
        disklrucache.m = 0;
        return 0;
    }

    private boolean e()
    {
        return m >= 2000 && m >= l.size();
    }

    static int f(DiskLruCache disklrucache)
    {
        return disklrucache.i;
    }

    private void f()
    {
        if (k == null)
        {
            throw new IllegalStateException("cache is closed");
        } else
        {
            return;
        }
    }

    static File g(DiskLruCache disklrucache)
    {
        return disklrucache.c;
    }

    private void g()
    {
        while (j > h) 
        {
            remove((String)((java.util.Map.Entry)l.entrySet().iterator().next()).getKey());
        }
    }

    public static DiskLruCache open(File file, int i1, int j1, long l1)
    {
        Object obj;
        if (l1 <= 0L)
        {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (j1 <= 0)
        {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        obj = new File(file, "journal.bkp");
        if (((File) (obj)).exists())
        {
            File file1 = new File(file, "journal");
            if (file1.exists())
            {
                ((File) (obj)).delete();
            } else
            {
                a(((File) (obj)), file1, false);
            }
        }
        obj = new DiskLruCache(file, i1, j1, l1);
        if (!((DiskLruCache) (obj)).d.exists())
        {
            break MISSING_BLOCK_LABEL_211;
        }
        ((DiskLruCache) (obj)).b();
        ((DiskLruCache) (obj)).c();
        obj.k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(((DiskLruCache) (obj)).d, true), DiskLruCacheUtil.a));
        return ((DiskLruCache) (obj));
        IOException ioexception;
        ioexception;
        System.out.println((new StringBuilder("DiskLruCache ")).append(file).append(" is corrupt: ").append(ioexception.getMessage()).append(", removing").toString());
        ((DiskLruCache) (obj)).delete();
        file.mkdirs();
        file = new DiskLruCache(file, i1, j1, l1);
        file.d();
        return file;
    }

    public final void close()
    {
        this;
        JVM INSTR monitorenter ;
        Writer writer = k;
        if (writer != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Iterator iterator = (new ArrayList(l.values())).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            g g1 = (g)iterator.next();
            if (com.mopub.common.g.b(g1) != null)
            {
                com.mopub.common.g.b(g1).abort();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_73;
        Exception exception;
        exception;
        throw exception;
        g();
        k.close();
        k = null;
          goto _L1
    }

    public final void delete()
    {
        close();
        DiskLruCacheUtil.a(c);
    }

    public final Editor edit(String s)
    {
        return a(s, -1L);
    }

    public final void flush()
    {
        this;
        JVM INSTR monitorenter ;
        f();
        g();
        k.flush();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final Snapshot get(String s)
    {
        Object obj = null;
        this;
        JVM INSTR monitorenter ;
        g g1;
        f();
        a(s);
        g1 = (g)l.get(s);
        if (g1 != null) goto _L2; else goto _L1
_L1:
        Snapshot snapshot = obj;
_L7:
        this;
        JVM INSTR monitorexit ;
        return snapshot;
_L2:
        snapshot = obj;
        InputStream ainputstream[];
        if (!com.mopub.common.g.e(g1))
        {
            continue; /* Loop/switch isn't completed */
        }
        ainputstream = new InputStream[i];
        int i1 = 0;
_L4:
        if (i1 >= i)
        {
            break; /* Loop/switch isn't completed */
        }
        ainputstream[i1] = new FileInputStream(g1.getCleanFile(i1));
        i1++;
        if (true) goto _L4; else goto _L3
        s;
        i1 = 0;
_L5:
        snapshot = obj;
        if (i1 >= i)
        {
            continue; /* Loop/switch isn't completed */
        }
        snapshot = obj;
        if (ainputstream[i1] == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        DiskLruCacheUtil.a(ainputstream[i1]);
        i1++;
        if (true) goto _L5; else goto _L3
_L3:
        m = m + 1;
        k.append((new StringBuilder("READ ")).append(s).append('\n').toString());
        if (e())
        {
            b.submit(o);
        }
        snapshot = new Snapshot(s, com.mopub.common.g.f(g1), ainputstream, com.mopub.common.g.c(g1), (byte)0);
        if (true) goto _L7; else goto _L6
_L6:
        s;
        throw s;
    }

    public final File getDirectory()
    {
        return c;
    }

    public final long getMaxSize()
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = h;
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean isClosed()
    {
        this;
        JVM INSTR monitorenter ;
        Writer writer = k;
        boolean flag;
        if (writer == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean remove(String s)
    {
        int i1 = 0;
        this;
        JVM INSTR monitorenter ;
        g g1;
        f();
        a(s);
        g1 = (g)l.get(s);
        if (g1 == null) goto _L2; else goto _L1
_L1:
        Object obj = com.mopub.common.g.b(g1);
        if (obj == null) goto _L3; else goto _L2
_L2:
        boolean flag = false;
_L7:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L5:
        j = j - com.mopub.common.g.c(g1)[i1];
        com.mopub.common.g.c(g1)[i1] = 0L;
        i1++;
_L3:
        if (i1 >= i)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        obj = g1.getCleanFile(i1);
        if (!((File) (obj)).exists() || ((File) (obj)).delete()) goto _L5; else goto _L4
_L4:
        throw new IOException((new StringBuilder("failed to delete ")).append(obj).toString());
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        m = m + 1;
        k.append((new StringBuilder("REMOVE ")).append(s).append('\n').toString());
        l.remove(s);
        if (e())
        {
            b.submit(o);
        }
        flag = true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void setMaxSize(long l1)
    {
        this;
        JVM INSTR monitorenter ;
        h = l1;
        b.submit(o);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final long size()
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = j;
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }


    private class Editor
    {

        final DiskLruCache a;
        private final g b;
        private final boolean c[];
        private boolean d;
        private boolean e;

        static g a(Editor editor)
        {
            return editor.b;
        }

        static boolean[] b(Editor editor)
        {
            return editor.c;
        }

        static boolean c(Editor editor)
        {
            editor.d = true;
            return true;
        }

        public final void abort()
        {
            DiskLruCache.a(a, this, false);
        }

        public final void abortUnlessCommitted()
        {
            if (e)
            {
                break MISSING_BLOCK_LABEL_11;
            }
            abort();
            return;
            IOException ioexception;
            ioexception;
        }

        public final void commit()
        {
            if (d)
            {
                DiskLruCache.a(a, this, false);
                a.remove(com.mopub.common.g.d(b));
            } else
            {
                DiskLruCache.a(a, this, true);
            }
            e = true;
        }

        public final String getString(int i1)
        {
            InputStream inputstream = newInputStream(i1);
            if (inputstream != null)
            {
                return DiskLruCache.a(inputstream);
            } else
            {
                return null;
            }
        }

        public final InputStream newInputStream(int i1)
        {
            DiskLruCache disklrucache = a;
            disklrucache;
            JVM INSTR monitorenter ;
            if (com.mopub.common.g.b(b) != this)
            {
                throw new IllegalStateException();
            }
            break MISSING_BLOCK_LABEL_31;
            Object obj;
            obj;
            disklrucache;
            JVM INSTR monitorexit ;
            throw obj;
            if (com.mopub.common.g.e(b))
            {
                break MISSING_BLOCK_LABEL_45;
            }
            disklrucache;
            JVM INSTR monitorexit ;
            return null;
            FileInputStream fileinputstream = new FileInputStream(b.getCleanFile(i1));
            disklrucache;
            JVM INSTR monitorexit ;
            return fileinputstream;
            fileinputstream;
            disklrucache;
            JVM INSTR monitorexit ;
            return null;
        }

        public final OutputStream newOutputStream(int i1)
        {
            DiskLruCache disklrucache = a;
            disklrucache;
            JVM INSTR monitorenter ;
            if (com.mopub.common.g.b(b) != this)
            {
                throw new IllegalStateException();
            }
            break MISSING_BLOCK_LABEL_31;
            Object obj;
            obj;
            disklrucache;
            JVM INSTR monitorexit ;
            throw obj;
            File file;
            if (!com.mopub.common.g.e(b))
            {
                c[i1] = true;
            }
            file = b.getDirtyFile(i1);
            Object obj1 = new FileOutputStream(file);
_L1:
            obj1 = new f(this, ((OutputStream) (obj1)), (byte)0);
            disklrucache;
            JVM INSTR monitorexit ;
            return ((OutputStream) (obj1));
            obj1;
            DiskLruCache.g(a).mkdirs();
            obj1 = new FileOutputStream(file);
              goto _L1
            obj1;
            obj1 = DiskLruCache.a();
            disklrucache;
            JVM INSTR monitorexit ;
            return ((OutputStream) (obj1));
        }

        public final void set(int i1, String s)
        {
            OutputStreamWriter outputstreamwriter = new OutputStreamWriter(newOutputStream(i1), DiskLruCacheUtil.b);
            outputstreamwriter.write(s);
            DiskLruCacheUtil.a(outputstreamwriter);
            return;
            s;
            outputstreamwriter = null;
_L2:
            DiskLruCacheUtil.a(outputstreamwriter);
            throw s;
            s;
            if (true) goto _L2; else goto _L1
_L1:
        }

        private Editor(g g1)
        {
            a = DiskLruCache.this;
            super();
            b = g1;
            if (com.mopub.common.g.e(g1))
            {
                disklrucache = null;
            } else
            {
                disklrucache = new boolean[DiskLruCache.f(DiskLruCache.this)];
            }
            c = DiskLruCache.this;
        }

        Editor(g g1, byte byte0)
        {
            this(g1);
        }
    }


    private class Snapshot
        implements Closeable
    {

        final DiskLruCache a;
        private final String b;
        private final long c;
        private final InputStream d[];
        private final long e[];

        public final void close()
        {
            InputStream ainputstream[] = d;
            int j1 = ainputstream.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                DiskLruCacheUtil.a(ainputstream[i1]);
            }

        }

        public final Editor edit()
        {
            return DiskLruCache.a(a, b, c);
        }

        public final InputStream getInputStream(int i1)
        {
            return d[i1];
        }

        public final long getLength(int i1)
        {
            return e[i1];
        }

        public final String getString(int i1)
        {
            return DiskLruCache.a(getInputStream(i1));
        }

        private Snapshot(String s, long l1, InputStream ainputstream[], long al[])
        {
            a = DiskLruCache.this;
            super();
            b = s;
            c = l1;
            d = ainputstream;
            e = al;
        }

        Snapshot(String s, long l1, InputStream ainputstream[], long al[], byte byte0)
        {
            this(s, l1, ainputstream, al);
        }
    }

}
