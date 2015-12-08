// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public final class okq
    implements okj
{

    private static final FilenameFilter f = new okr();
    private static final FilenameFilter g = new oks();
    public final File a;
    public final int b = 0x40000;
    public final Map c = new HashMap();
    public final Object d = new Object();
    public boolean e;
    private final oku h;
    private final okt i;
    private long j;

    public okq(File file, int k, long l, oku oku1, okt okt1)
    {
        a = (File)p.b(file, "cacheDir");
        h = (oku)p.b(oku1, "policy");
        i = (okt)p.b(okt1, "clock");
        p.a(true, "chunkSizeBytes must be positive");
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "quotaBytes must be non-negative");
        j = l / 0x40000L;
    }

    private void b(String s, int k, byte abyte0[], long l)
    {
        Object obj;
        Object obj1;
        Object obj2;
        File file2;
        if (j == 0L)
        {
            return;
        }
        obj1 = (okv)c.get(s);
        if (obj1 == null)
        {
            File file = a;
            obj1 = i;
            obj1 = new okv(file, s, okd.a(), true, ((okt) (obj1)).a(), -1L);
            c.put(s, obj1);
        }
        long l1 = l;
        if (l == -1L)
        {
            l1 = ((okv) (obj1)).g;
        }
        boolean flag;
        if (l1 != -1L)
        {
            File file1;
            String s1;
            if ((long)(b * k) <= l1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p.a(flag, "chunk beyond EOF");
        }
        if (k >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "index must not be negative");
        obj1.e = true;
        if (l1 != -1L)
        {
            obj1.g = l1;
        }
        if (!((okv) (obj1)).d)
        {
            obj1.d = true;
            file1 = ((okv) (obj1)).a;
            obj = String.valueOf(((okv) (obj1)).b);
            s1 = String.valueOf("~m");
            if (s1.length() != 0)
            {
                obj = ((String) (obj)).concat(s1);
            } else
            {
                obj = new String(((String) (obj)));
            }
            (new File(file1, ((String) (obj)))).delete();
        }
        obj = ((okv) (obj1)).c;
        if (k < 0)
        {
            throw new IndexOutOfBoundsException("bit index must be non-negative");
        }
        if (k >= ((okd) (obj)).a.length << 3)
        {
            byte abyte1[] = new byte[(k / 8 + 1) * 2];
            System.arraycopy(((okd) (obj)).a, 0, abyte1, 0, ((okd) (obj)).a.length);
            obj.a = abyte1;
        }
        int i1 = k / 8;
        byte byte0 = (byte)(1 << k % 8);
        if ((((okd) (obj)).a[i1] & byte0) == 0)
        {
            byte abyte2[] = ((okd) (obj)).a;
            abyte2[i1] = (byte)(byte0 | abyte2[i1]);
            obj.b = ((okd) (obj)).b + 1;
        }
        obj2 = a;
        obj = String.valueOf(s);
        String s2 = String.valueOf("~c");
        if (s2.length() != 0)
        {
            obj = ((String) (obj)).concat(s2);
        } else
        {
            obj = new String(((String) (obj)));
        }
        file2 = new File(((File) (obj2)), ((String) (obj)));
        obj2 = new RandomAccessFile(file2, "rw");
        obj = obj2;
        ((RandomAccessFile) (obj2)).seek(b * k);
        obj = obj2;
        ((RandomAccessFile) (obj2)).write(abyte0, 0, b);
        p.a(((java.io.Closeable) (obj2)));
        ((okv) (obj1)).a(i.a());
        obj1.e = false;
        h();
        return;
        Exception exception;
        exception;
        abyte0 = null;
_L8:
        obj = abyte0;
        Log.e("PersistentChunkStore", "Error writing chunk", exception);
        obj = abyte0;
        file2.delete();
        obj = abyte0;
        obj2 = ((okv) (obj1)).a;
        obj = abyte0;
        obj1 = String.valueOf(((okv) (obj1)).b);
        obj = abyte0;
        String s3 = String.valueOf("~m");
        obj = abyte0;
        if (s3.length() == 0) goto _L2; else goto _L1
_L1:
        obj = abyte0;
        obj1 = ((String) (obj1)).concat(s3);
_L4:
        obj = abyte0;
        (new File(((File) (obj2)), ((String) (obj1)))).delete();
        obj = abyte0;
        c.remove(s);
        p.a(abyte0);
        return;
_L2:
        obj = abyte0;
        obj1 = new String(((String) (obj1)));
        if (true) goto _L4; else goto _L3
_L3:
        s;
_L6:
        p.a(((java.io.Closeable) (obj)));
        throw s;
        s;
        obj = null;
        if (true) goto _L6; else goto _L5
_L5:
        s3;
        abyte0 = ((byte []) (obj2));
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static okt c()
    {
        return new okt();
    }

    public static oku d()
    {
        return new oku();
    }

    private void h()
    {
        do
        {
            if ((long)g() <= j)
            {
                break;
            }
            okv okv1 = null;
            long l = 0x7fffffffffffffffL;
            Iterator iterator = c.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                okv okv2 = (okv)iterator.next();
                long l1 = h.a(okv2);
                if (l1 < l)
                {
                    okv1 = okv2;
                    l = l1;
                }
            } while (true);
            if (okv1 != null)
            {
                b(okv1.b);
            }
        } while (true);
    }

    public final int a()
    {
        return b;
    }

    public final long a(String s)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        s = (okv)c.get(s);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        obj;
        JVM INSTR monitorexit ;
        return -1L;
        long l = ((okv) (s)).g;
        obj;
        JVM INSTR monitorexit ;
        return l;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void a(long l)
    {
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "quotaBytes must be non-negative");
        synchronized (d)
        {
            p.b(e, "ChunkStore not initialized");
            j = l / (long)b;
            h();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(String s, int k, byte abyte0[])
    {
        synchronized (d)
        {
            p.b(e, "ChunkStore not initialized");
            b(s, k, abyte0, -1L);
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void a(String s, int k, byte abyte0[], long l)
    {
        synchronized (d)
        {
            p.b(e, "ChunkStore not initialized");
            b(s, k, abyte0, l);
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final boolean a(String s, int k)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        p.b(e, "ChunkStore not initialized");
        s = (okv)c.get(s);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        boolean flag = s.a(k);
        obj;
        JVM INSTR monitorexit ;
        return flag;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final int b(String s, int k, byte abyte0[])
    {
        int l = 0;
        Object obj2 = d;
        obj2;
        JVM INSTR monitorenter ;
        Object obj;
        p.b(e, "ChunkStore not initialized");
        obj = (okv)c.get(s);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        obj2;
        JVM INSTR monitorexit ;
        return 0;
        if (((okv) (obj)).g == -1L || (long)(b * k) < ((okv) (obj)).g)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        obj2;
        JVM INSTR monitorexit ;
        return -1;
        s;
        obj2;
        JVM INSTR monitorexit ;
        throw s;
        if (((okv) (obj)).a(k))
        {
            break MISSING_BLOCK_LABEL_99;
        }
        obj2;
        JVM INSTR monitorexit ;
        return 0;
        int i1 = b;
        if (((okv) (obj)).a(k)) goto _L2; else goto _L1
_L1:
        Object obj1;
        String s1;
        ((okv) (obj)).a(i.a());
        obj1 = a;
        obj = String.valueOf(s);
        s1 = String.valueOf("~c");
        if (s1.length() == 0) goto _L4; else goto _L3
_L3:
        obj = ((String) (obj)).concat(s1);
_L5:
        obj = new File(((File) (obj1)), ((String) (obj)));
        obj = new RandomAccessFile(((File) (obj)), "r");
        ((RandomAccessFile) (obj)).seek(b * k);
        ((RandomAccessFile) (obj)).readFully(abyte0, 0, b);
        p.a(((java.io.Closeable) (obj)));
        obj2;
        JVM INSTR monitorexit ;
        return l;
_L2:
        long l1;
        if (((okv) (obj)).g == -1L)
        {
            l = i1;
            continue; /* Loop/switch isn't completed */
        }
        l1 = k * i1;
        l = (int)(Math.min(((okv) (obj)).g, (k + 1) * i1) - l1);
        continue; /* Loop/switch isn't completed */
_L4:
        obj = new String(((String) (obj)));
          goto _L5
        obj;
        abyte0 = null;
_L11:
        obj1 = String.valueOf(s);
        if (((String) (obj1)).length() == 0) goto _L7; else goto _L6
_L6:
        obj1 = "Failed to read cache file ".concat(((String) (obj1)));
_L8:
        Log.w("PersistentChunkStore", ((String) (obj1)), ((Throwable) (obj)));
        b(s);
        throw obj;
        s;
_L9:
        p.a(abyte0);
        throw s;
_L7:
        obj1 = new String("Failed to read cache file ");
          goto _L8
        s;
        abyte0 = null;
          goto _L9
        s;
        abyte0 = ((byte []) (obj));
          goto _L9
        IOException ioexception;
        ioexception;
        abyte0 = ((byte []) (obj));
        obj = ioexception;
        if (true) goto _L11; else goto _L10
_L10:
        if (true) goto _L1; else goto _L12
_L12:
    }

    public final void b()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        p.b(e, "ChunkStore not initialized");
        for (Iterator iterator = c.values().iterator(); iterator.hasNext(); ((okv)iterator.next()).a()) { }
        break MISSING_BLOCK_LABEL_61;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
    }

    public final void b(String s)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        String s1;
        File file;
        String s2;
        p.b(e, "ChunkStore not initialized");
        file = a;
        s1 = String.valueOf(s);
        s2 = String.valueOf("~m");
        if (s2.length() == 0) goto _L2; else goto _L1
_L1:
        s1 = s1.concat(s2);
_L3:
        (new File(file, s1)).delete();
        file = a;
        s1 = String.valueOf(s);
        String s3 = String.valueOf("~c");
        if (s3.length() == 0)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        s1 = s1.concat(s3);
_L4:
        (new File(file, s1)).delete();
        c.remove(s);
        return;
_L2:
        s1 = new String(s1);
          goto _L3
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        s1 = new String(s1);
          goto _L4
    }

    public final void e()
    {
        Object obj2 = d;
        obj2;
        JVM INSTR monitorenter ;
        if (!a.exists())
        {
            a.mkdir();
        }
        if (e) goto _L2; else goto _L1
_L1:
        String as1[];
        HashSet hashset;
        int l;
        String as[] = a.list(f);
        as1 = a.list(g);
        hashset = new HashSet(Arrays.asList(as));
        l = as1.length;
        int k = 0;
_L14:
        if (k >= l) goto _L4; else goto _L3
_L3:
        String s2 = as1[k];
        Object obj;
        String s1;
        String s3;
        s1 = s2.substring(0, s2.length() - 2);
        obj = String.valueOf(s1);
        s3 = String.valueOf("~c");
        if (s3.length() == 0) goto _L6; else goto _L5
_L5:
        obj = ((String) (obj)).concat(s3);
_L11:
        boolean flag = hashset.remove(obj);
        if (!flag) goto _L8; else goto _L7
_L7:
        obj = okv.a(a, s1);
_L12:
        if (obj == null) goto _L10; else goto _L9
_L9:
        c.put(s1, obj);
          goto _L10
_L6:
        obj = new String(((String) (obj)));
          goto _L11
        Object obj1;
        obj1;
        obj2;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        Log.e("PersistentChunkStore", "Error loading metadata", ((Throwable) (obj1)));
        obj1 = null;
          goto _L12
_L8:
        (new File(a, s2)).delete();
          goto _L10
_L4:
        String s;
        for (Iterator iterator = hashset.iterator(); iterator.hasNext(); (new File(a, s)).delete())
        {
            s = (String)iterator.next();
        }

        e = true;
_L2:
        obj2;
        JVM INSTR monitorexit ;
        return;
_L10:
        k++;
        if (true) goto _L14; else goto _L13
_L13:
    }

    public final long f()
    {
        long l;
        long l1;
        synchronized (d)
        {
            p.b(e, "ChunkStore not initialized");
            l = j;
            l1 = b;
        }
        return l * l1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final int g()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator;
        p.b(e, "ChunkStore not initialized");
        iterator = c.values().iterator();
        int k = 0;
        while (iterator.hasNext()) 
        {
            k = ((okv)iterator.next()).c.b + k;
        }
        obj;
        JVM INSTR monitorexit ;
        return k;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
