// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.be;

import android.util.Log;
import android.util.Pair;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ad.a;
import com.google.android.m4b.maps.ap.e;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.k;
import com.google.android.m4b.maps.ay.w;
import com.google.android.m4b.maps.bd.d;
import com.google.android.m4b.maps.bo.aa;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bo.b;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bq.g;
import com.google.android.m4b.maps.bx.o;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;

// Referenced classes of package com.google.android.m4b.maps.be:
//            c, d, e

public final class i
    implements com.google.android.m4b.maps.be.c
{
    static final class a
        implements com.google.android.m4b.maps.be.e
    {

        Queue a;
        Map b;

        public final void a()
        {
            a.clear();
            a.offer(new a(this, (byte)0));
        }

        public final void a(int i1)
        {
            a.offer(new c(this, i1));
        }

        public final void a(long l1)
        {
            ac ac1 = com.google.android.m4b.maps.al.b.a(l1);
            if (ac1 != null)
            {
                a.offer(new f(this, ac1));
            }
        }

        public final void a(long l1, int i1)
        {
            ac ac1 = com.google.android.m4b.maps.al.b.a(l1);
            aa aa1 = (aa)b.remove(ac1);
            if (ac1 != null && aa1 != null)
            {
                a.offer(new d(this, aa1, i1));
            }
        }

        public final void b()
        {
            for (; a.size() > 0; a.poll()) { }
            if (b.size() > 0)
            {
                if (ab.a("SDCardTileCache", 6))
                {
                    int i1 = b.size();
                    Log.e("SDCardTileCache", (new StringBuilder(56)).append(i1).append(" tiles were not inserted into the disk cache.").toString());
                }
                b.clear();
            }
        }

        public final void b(long l1, int i1)
        {
            ac ac1 = com.google.android.m4b.maps.al.b.a(l1);
            if (ac1 != null)
            {
                a.offer(new e(this, ac1, i1));
            }
        }
    }

    final class a.a
    {

        private a a;

        private a.a(a a1)
        {
            a = a1;
            super();
        }

        a.a(a a1, byte byte0)
        {
            this(a1);
        }
    }

    final class a.b
    {

        private a a;

        private a.b(a a1)
        {
            a = a1;
            super();
        }

        a.b(a a1, byte byte0)
        {
            this(a1);
        }
    }

    final class a.c
    {

        private int a;
        private a b;

        public a.c(a a1, int i1)
        {
            b = a1;
            super();
            a = i1;
        }
    }

    final class a.d
    {

        private aa a;
        private int b;
        private a c;

        public a.d(a a1, aa aa1, int i1)
        {
            c = a1;
            super();
            a = aa1;
            b = i1;
        }
    }

    final class a.e
    {

        private ac a;
        private int b;
        private a c;

        public a.e(a a1, ac ac1, int i1)
        {
            c = a1;
            super();
            a = ac1;
            b = i1;
        }
    }

    final class a.f
    {

        private ac a;
        private a b;

        public a.f(a a1, ac ac1)
        {
            b = a1;
            super();
            a = ac1;
        }
    }

    static final class b
    {

        final int a;
        final long b;
        final String c;
        final int d;
        final byte e[];
        final aa f;
        final ac g;
        final com.google.android.m4b.maps.bd.d h;

        b(long l1, String s, int i1, ac ac1, com.google.android.m4b.maps.bd.d d1)
        {
            a = 1;
            b = l1;
            c = s;
            d = i1;
            e = null;
            g = ac1;
            f = null;
            h = d1;
        }

        b(long l1, String s, int i1, byte abyte0[], aa aa1, com.google.android.m4b.maps.bd.d d1)
        {
            a = 0;
            b = l1;
            c = s;
            d = i1;
            e = abyte0;
            if (aa1 == null)
            {
                s = null;
            } else
            {
                s = aa1.a();
            }
            g = s;
            f = aa1;
            h = d1;
        }
    }

    public static interface c
    {

        public abstract aa a(ac ac1, byte abyte0[], int i1, long l1, long l2);
    }


    private static final aa a = new com.google.android.m4b.maps.bo.b();
    private static final byte b[] = new byte[0];
    private final String c;
    private final int d;
    private final c e;
    private final HashMap f;
    private com.google.android.m4b.maps.be.d g;
    private final int h = Math.max(Math.min(256, (o.e() >> 3) * 32), 64);
    private final ah i;
    private int j;
    private k k;
    private a l;
    private final com.google.android.m4b.maps.bs.e m;

    public i(String s, int i1, c c1, ah ah, com.google.android.m4b.maps.bs.e e1)
    {
        j = 0;
        k = new k();
        l = null;
        c = s;
        d = i1;
        e = c1;
        f = ax.a(h);
        i = ah;
        m = e1;
    }

    private boolean a(int i1, Locale locale)
    {
        synchronized (f)
        {
            f.clear();
            g.a(i1, locale);
            f();
            if (l != null)
            {
                l.b();
            }
        }
        return true;
        locale;
        hashmap;
        JVM INSTR monitorexit ;
        try
        {
            throw locale;
        }
        // Misplaced declaration of an exception variable
        catch (Locale locale) { }
        if (ab.a("SDCardTileCache", 6))
        {
            Log.e("SDCardTileCache", "Error writing in the cache", locale);
        }
        return false;
    }

    private boolean b(File file)
    {
        long l1;
        if (g != null)
        {
            return true;
        }
        file = new com.google.android.m4b.maps.au.a.a(file);
        l1 = com.google.android.m4b.maps.ay.k.c();
        g = com.google.android.m4b.maps.be.d.a(c, file, l, m);
        int i1 = 0;
_L1:
        IOException ioexception;
        long l2;
        if (i1 != 0 || g() != g.a.g)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            try
            {
                g = com.google.android.m4b.maps.be.d.a(c, d, -1, new Locale(""), file, l, m);
                f();
                if (l != null)
                {
                    l.a();
                    l.b();
                }
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                if (ab.a("SDCardTileCache", 6))
                {
                    file = String.valueOf(file);
                    Log.e("SDCardTileCache", (new StringBuilder(String.valueOf(file).length() + 16)).append("Creating cache: ").append(file).toString());
                }
                return false;
            }
        }
        l2 = com.google.android.m4b.maps.ay.k.c();
        if (ab.a("SDCardTileCache", 3))
        {
            file = c;
            i1 = g.a();
            int j1 = g.a.f;
            String s = String.valueOf(g.a.h);
            long l3 = g.a.g;
            Log.d("SDCardTileCache", (new StringBuilder(String.valueOf(file).length() + 136 + String.valueOf(s).length())).append("Loaded cache: ").append(file).append(" with ").append(i1).append(" entries, data version: ").append(j1).append(", locale: ").append(s).append(", ").append(l2 - l1).append("ms, creationTime: ").append(l3).toString());
        }
        return true;
        ioexception;
        i1 = 1;
          goto _L1
    }

    private void f()
    {
        com.google.android.m4b.maps.ay.o o1 = new com.google.android.m4b.maps.ay.o();
        String s;
        com.google.android.m4b.maps.ap.e e1;
        byte abyte0[];
        o1.writeLong(g.a.g);
        e1 = w.i;
        abyte0 = o1.a.toByteArray();
        s = String.valueOf("disk_creation_time_");
        String s1 = String.valueOf(c);
        if (s1.length() == 0)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        s = s.concat(s1);
_L1:
        e1.a(abyte0, s);
        o1.close();
        return;
        s = new String(s);
          goto _L1
        Exception exception;
        exception;
        o1.close();
        throw exception;
    }

    private long g()
    {
        com.google.android.m4b.maps.ap.e e1 = w.i;
        byte abyte0[] = String.valueOf("disk_creation_time_");
        String s1 = String.valueOf(c);
        if (s1.length() != 0)
        {
            abyte0 = abyte0.concat(s1);
        } else
        {
            abyte0 = new String(abyte0);
        }
        abyte0 = e1.b(abyte0);
        if (abyte0 == null)
        {
            return 0L;
        }
        com.google.android.m4b.maps.ad.a a1 = new com.google.android.m4b.maps.ad.a(abyte0);
        long l1;
        try
        {
            l1 = a1.readLong();
        }
        catch (IOException ioexception)
        {
            com.google.android.m4b.maps.ap.e e2 = w.i;
            String s = String.valueOf("disk_creation_time_");
            String s2 = String.valueOf(c);
            if (s2.length() != 0)
            {
                s = s.concat(s2);
            } else
            {
                s = new String(s);
            }
            e2.a(s);
            return 0L;
        }
        return l1;
    }

    public final void a(ac ac1, com.google.android.m4b.maps.bd.d d1, int i1)
    {
        if (g == null)
        {
            throw new IllegalStateException("Uninitialized");
        }
        HashMap hashmap = f;
        hashmap;
        JVM INSTR monitorenter ;
        b b1 = (b)f.get(ac1);
        if (b1 == null) goto _L2; else goto _L1
_L1:
        if (b1.h == null) goto _L4; else goto _L3
_L3:
        if (d1 == null) goto _L6; else goto _L5
_L5:
        d1 = new com.google.android.m4b.maps.bd.a(b1.h, d1);
_L4:
        if (b1.f == null) goto _L8; else goto _L7
_L7:
        d1 = new b(b1.b, b1.c, com.google.android.m4b.maps.bq.g.a(b1.d, i1), b1.e, b1.f, d1);
_L9:
        f.put(ac1, d1);
_L10:
        hashmap;
        JVM INSTR monitorexit ;
        return;
_L6:
        d1 = b1.h;
          goto _L4
_L8:
        d1 = new b(b1.b, b1.c, com.google.android.m4b.maps.bq.g.a(b1.d, i1), ac1, d1);
          goto _L9
_L2:
        Pair pair = com.google.android.m4b.maps.al.b.a(i, ac1);
        d1 = new b(((Long)pair.first).longValue(), (String)pair.second, i1, ac1, d1);
        f.put(ac1, d1);
          goto _L10
        ac1;
        hashmap;
        JVM INSTR monitorexit ;
        throw ac1;
          goto _L4
    }

    public final void a(ac ac1, aa aa1)
    {
        throw new IllegalStateException("Don't store unencrypted tiles into SD cache.");
    }

    public final void a(ac ac1, aa aa1, byte abyte0[])
    {
        long l3;
        l3 = 0L;
        if (g == null)
        {
            throw new IllegalStateException("Uninitialized");
        }
        if (aa1 instanceof com.google.android.m4b.maps.bo.e)
        {
            throw new IllegalArgumentException("Can't insert a MutableVectorTile into SD cache");
        }
        if (ac1.a > 21) goto _L2; else goto _L1
_L1:
label0:
        {
            Object obj = com.google.android.m4b.maps.al.b.a(i, ac1);
            if (abyte0.length <= 0)
            {
                break label0;
            }
            Object obj1;
            Object obj2;
            String s;
            int i1;
            long l1;
            long l2;
            if (aa1 instanceof ba)
            {
                l2 = ((ba)aa1).m();
                l1 = l2;
                if (l2 != -1L)
                {
                    l2 = (l2 - com.google.android.m4b.maps.ay.k.c()) + com.google.android.m4b.maps.ay.k.b();
                    l1 = l2;
                    if (l2 < 0L)
                    {
                        l1 = 0L;
                    }
                }
                long l4 = ((ba)aa1).o();
                l2 = l4;
                if (l4 != -1L)
                {
                    l4 = (l4 - com.google.android.m4b.maps.ay.k.c()) + com.google.android.m4b.maps.ay.k.b();
                    l2 = l4;
                    if (l4 < 0L)
                    {
                        l2 = l3;
                    }
                }
            } else
            {
                l2 = -1L;
                l1 = -1L;
            }
            obj1 = new ByteArrayOutputStream(abyte0.length + 24);
            obj2 = new DataOutputStream(((java.io.OutputStream) (obj1)));
            try
            {
                ((DataOutputStream) (obj2)).writeInt(24);
                ((DataOutputStream) (obj2)).writeInt(0);
                ((DataOutputStream) (obj2)).writeLong(l1);
                ((DataOutputStream) (obj2)).writeLong(l2);
                ((DataOutputStream) (obj2)).write(abyte0);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                abyte0 = ((ByteArrayOutputStream) (obj1)).toByteArray();
                try
                {
                    ((DataOutputStream) (obj2)).close();
                    ((ByteArrayOutputStream) (obj1)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1) { }
                break label0;
            }
            finally
            {
                ((ByteArrayOutputStream) (obj1)).toByteArray();
                try
                {
                    ((DataOutputStream) (obj2)).close();
                    ((ByteArrayOutputStream) (obj1)).close();
                }
                // Misplaced declaration of an exception variable
                catch (aa aa1) { }
                throw ac1;
            }
            abyte0 = ((ByteArrayOutputStream) (obj1)).toByteArray();
            try
            {
                ((DataOutputStream) (obj2)).close();
                ((ByteArrayOutputStream) (obj1)).close();
            }
            catch (IOException ioexception) { }
        }
        obj1 = f;
        obj1;
        JVM INSTR monitorenter ;
        obj2 = (b)f.get(ac1);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_441;
        }
        i1 = com.google.android.m4b.maps.bq.g.a(((b) (obj2)).d, 0);
_L9:
        l1 = ((Long)((Pair) (obj)).first).longValue();
        s = (String)((Pair) (obj)).second;
        if (obj2 == null) goto _L4; else goto _L3
_L3:
        obj = ((b) (obj2)).h;
_L8:
        aa1 = new b(l1, s, i1, abyte0, aa1, ((com.google.android.m4b.maps.bd.d) (obj)));
        if (j >= h) goto _L6; else goto _L5
_L5:
        f.put(ac1, aa1);
        if (obj2 != null) goto _L6; else goto _L7
_L7:
        j = j + 1;
_L6:
        obj1;
        JVM INSTR monitorexit ;
_L2:
        return;
_L4:
        obj = null;
          goto _L8
        ac1;
        obj1;
        JVM INSTR monitorexit ;
        throw ac1;
        i1 = 0;
          goto _L9
    }

    public final boolean a()
    {
        if (g == null)
        {
            throw new IllegalStateException("Uninitialized");
        } else
        {
            return a(g.a.f, g.a.h);
        }
    }

    public final boolean a(int i1)
    {
        if (g == null)
        {
            throw new IllegalStateException("Uninitialized");
        }
        try
        {
            g.a(i1);
        }
        catch (IOException ioexception)
        {
            if (ab.a("SDCardTileCache", 6))
            {
                Log.e("SDCardTileCache", "Error writing in the cache", ioexception);
            }
            return false;
        }
        return true;
    }

    public final boolean a(aa aa1)
    {
        return aa1 == a;
    }

    public final boolean a(File file)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        com.google.android.m4b.maps.av.a.a();
        flag = b(file);
        com.google.android.m4b.maps.av.a.b();
        this;
        JVM INSTR monitorexit ;
        return flag;
        file;
        throw file;
    }

    public final boolean a(Locale locale)
    {
        if (g == null)
        {
            throw new IllegalStateException("Uninitialized");
        } else
        {
            return a(g.a.f, locale);
        }
    }

    public final byte[] a(ac ac1)
    {
        if (g == null)
        {
            throw new IllegalStateException("Uninitialized");
        }
        if (ac1.a <= 21) goto _L2; else goto _L1
_L1:
        byte abyte1[] = null;
_L11:
        return abyte1;
_L2:
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        b b1 = (b)f.get(ac1);
        if (b1 == null) goto _L4; else goto _L3
_L3:
        byte abyte0[] = b1.e;
_L9:
        obj;
        JVM INSTR monitorexit ;
        obj = abyte0;
        if (abyte0 == null)
        {
            abyte0 = com.google.android.m4b.maps.al.b.a(i, ac1);
            obj = g.a(((Long)((Pair) (abyte0)).first).longValue(), (String)((Pair) (abyte0)).second);
        }
        if (obj == null || obj.length == 0)
        {
            return ((byte []) (obj));
        }
        break MISSING_BLOCK_LABEL_119;
        ac1;
        obj;
        JVM INSTR monitorexit ;
        throw ac1;
        int i1;
        int j1;
        i1 = (new DataInputStream(new ByteArrayInputStream(((byte []) (obj))))).readInt();
        j1 = obj.length - i1;
        if (j1 >= 0 && i1 <= 24) goto _L6; else goto _L5
_L5:
        Object obj1;
        try
        {
            if (ab.a("SDCardTileCache", 6))
            {
                i1 = obj.length;
                abyte0 = c;
                obj = String.valueOf(ac1);
                Log.e("SDCardTileCache", (new StringBuilder(String.valueOf(abyte0).length() + 42 + String.valueOf(obj).length())).append("invalid tile data length[").append(i1).append("] in ").append(abyte0).append(":").append(((String) (obj))).toString());
            }
            break MISSING_BLOCK_LABEL_384;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            abyte0 = null;
        }
          goto _L7
_L6:
        abyte0 = new byte[j1];
        System.arraycopy(obj, i1, abyte0, 0, j1);
        return abyte0;
        obj1;
_L8:
        abyte1 = abyte0;
        if (ab.a("SDCardTileCache", 6))
        {
            String s = c;
            ac1 = String.valueOf(ac1);
            obj1 = String.valueOf(obj1);
            Log.e("SDCardTileCache", (new StringBuilder(String.valueOf(s).length() + 23 + String.valueOf(ac1).length() + String.valueOf(obj1).length())).append("invalid tile data in ").append(s).append(":").append(ac1).append(":").append(((String) (obj1))).toString());
            return abyte0;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (true) goto _L8; else goto _L4
_L4:
        abyte0 = null;
          goto _L9
        return null;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public final void a_(ac ac1)
    {
        a(ac1, a, b);
    }

    public final boolean b()
    {
        return !f.isEmpty();
    }

    public final boolean b(ac ac1)
    {
        if (g == null)
        {
            throw new IllegalStateException("Uninitialized");
        }
        if (ac1.a > 21)
        {
            return false;
        }
        Pair pair = com.google.android.m4b.maps.al.b.a(i, ac1);
        if (g.b(((Long)pair.first).longValue(), (String)pair.second))
        {
            return true;
        }
        HashMap hashmap = f;
        hashmap;
        JVM INSTR monitorenter ;
        ac1 = (b)f.get(ac1);
        if (ac1 == null) goto _L2; else goto _L1
_L1:
        if (((b) (ac1)).e == null) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        hashmap;
        JVM INSTR monitorexit ;
        return flag;
        ac1;
        hashmap;
        JVM INSTR monitorexit ;
        throw ac1;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final int c()
    {
        if (g == null)
        {
            throw new IllegalStateException("Uninitialized");
        } else
        {
            return g.a.f;
        }
    }

    public final aa c(ac ac1)
    {
        long l3;
        l3 = 0L;
        if (g == null)
        {
            throw new IllegalStateException("Uninitialized");
        }
        if (ac1.a > 21)
        {
            return null;
        }
        HashMap hashmap = f;
        hashmap;
        JVM INSTR monitorenter ;
        b b1 = (b)f.get(ac1);
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        ac1 = b1.f;
        hashmap;
        JVM INSTR monitorexit ;
        return ac1;
        ac1;
        hashmap;
        JVM INSTR monitorexit ;
        throw ac1;
        hashmap;
        JVM INSTR monitorexit ;
        long l2;
        Object obj = com.google.android.m4b.maps.al.b.a(i, ac1);
        byte abyte0[] = g.a(((Long)((Pair) (obj)).first).longValue(), (String)((Pair) (obj)).second);
        if (abyte0 == null)
        {
            return null;
        }
        DataInputStream datainputstream;
        int i1;
        long l1;
        long l4;
        try
        {
            if (abyte0.length == 0)
            {
                return a;
            }
            datainputstream = new DataInputStream(new ByteArrayInputStream(abyte0));
            i1 = datainputstream.readInt();
            datainputstream.readInt();
            l2 = datainputstream.readLong();
        }
        catch (IOException ioexception)
        {
            if (ab.a("SDCardTileCache", 6))
            {
                String s = c;
                ac1 = String.valueOf(ac1);
                String s1 = String.valueOf(ioexception);
                Log.e("SDCardTileCache", (new StringBuilder(String.valueOf(s).length() + 27 + String.valueOf(ac1).length() + String.valueOf(s1).length())).append("Could not unpack tile in ").append(s).append(":").append(ac1).append(":").append(s1).toString());
            }
            return null;
        }
        l1 = l2;
        if (l2 == -1L)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        l2 = (l2 - com.google.android.m4b.maps.ay.k.b()) + com.google.android.m4b.maps.ay.k.c();
        l1 = l2;
        if (l2 < 0L)
        {
            l1 = 0L;
        }
        if (i1 <= 16) goto _L2; else goto _L1
_L1:
        l4 = datainputstream.readLong();
        l2 = l4;
        if (l4 == -1L)
        {
            break MISSING_BLOCK_LABEL_245;
        }
        l4 = (l4 - com.google.android.m4b.maps.ay.k.b()) + com.google.android.m4b.maps.ay.k.c();
        l2 = l4;
        if (l4 < 0L)
        {
            l2 = l3;
        }
_L4:
        abyte0 = e.a(ac1, abyte0, i1, l1, l2);
        return abyte0;
_L2:
        l2 = -1L;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final Locale d()
    {
        if (g == null)
        {
            throw new IllegalStateException("Uninitialized");
        } else
        {
            return g.a.h;
        }
    }

    public final void e()
    {
        this;
        JVM INSTR monitorenter ;
        if (g == null)
        {
            throw new IllegalStateException("Uninitialized");
        }
        break MISSING_BLOCK_LABEL_25;
        Object obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        g.b();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        if (!ab.a("SDCardTileCache", 6)) goto _L2; else goto _L1
_L1:
        String s = String.valueOf(obj);
        Log.e("SDCardTileCache", (new StringBuilder(String.valueOf(s).length() + 12)).append("shutDown(): ").append(s).toString());
          goto _L2
    }

    public final void k_()
    {
        Object obj;
        Object obj1;
        ArrayList arraylist;
        com.google.android.m4b.maps.ay.k.c();
        arraylist = new ArrayList();
        obj1 = new ArrayList();
        obj = new ArrayList();
        HashMap hashmap = f;
        hashmap;
        JVM INSTR monitorenter ;
        Iterator iterator = f.values().iterator();
_L7:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        b b1 = (b)iterator.next();
        b1.a;
        JVM INSTR tableswitch 0 1: default 486
    //                   0 100
    //                   1 203;
           goto _L3 _L4 _L5
_L4:
        arraylist.add(com.google.android.m4b.maps.be.d.a(b1.b, b1.c, b1.d, b1.e));
        if (l != null)
        {
            a a2 = l;
            aa aa1 = b1.f;
            a2.b.put(aa1.a(), aa1);
        }
        if (b1.h != null)
        {
            ((ArrayList) (obj1)).add(Pair.create(b1.h, b1.f));
        }
_L3:
        if (true) goto _L7; else goto _L6
_L6:
        obj;
        hashmap;
        JVM INSTR monitorexit ;
        throw obj;
_L5:
        ((ArrayList) (obj)).add(b1);
          goto _L7
_L2:
        j = 0;
        f.clear();
        hashmap;
        JVM INSTR monitorexit ;
        if (arraylist.size() <= 0) goto _L9; else goto _L8
_L8:
        int i1 = g.a(arraylist);
        IOException ioexception;
        if (i1 == -1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
_L10:
        Pair pair;
        for (obj1 = ((ArrayList) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((com.google.android.m4b.maps.bd.d)pair.first).a(((aa)pair.second).a(), i1, (aa)pair.second))
        {
            pair = (Pair)((Iterator) (obj1)).next();
        }

        break; /* Loop/switch isn't completed */
        ioexception;
        if (ab.a("SDCardTileCache", 6))
        {
            Log.e("SDCardTileCache", "Error writing in the cache", ioexception);
        }
        i1 = 1;
        if (true) goto _L10; else goto _L9
_L9:
        obj = ((ArrayList) (obj)).iterator();
_L16:
        if (!((Iterator) (obj)).hasNext()) goto _L12; else goto _L11
_L11:
        obj1 = (b)((Iterator) (obj)).next();
        if (((b) (obj1)).d <= 0) goto _L14; else goto _L13
_L13:
        i1 = g.a(((b) (obj1)).b, ((b) (obj1)).c, ((b) (obj1)).d);
        if (i1 != -1) goto _L14; else goto _L15
_L15:
        i1 = 2;
_L17:
        if (((b) (obj1)).h != null)
        {
            ((b) (obj1)).h.a(((b) (obj1)).g, i1, null);
        }
          goto _L16
        ioexception;
        i1 = 1;
          goto _L17
_L12:
        if (l != null)
        {
            a a1 = l;
            a1.a.offer(new a.b(a1, (byte)0));
            l.b();
        }
        return;
_L14:
        i1 = 0;
          goto _L17
    }

}
