// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashSet;

// Referenced classes of package com.google.android.m4b.maps.bv:
//            d, v

public final class s
{
    static final class a
        implements Comparable
    {

        public final File a;
        public final String b;
        public final long c;
        boolean d;

        public final int compareTo(Object obj)
        {
            obj = (a)obj;
            if (c < ((a) (obj)).c)
            {
                return -1;
            }
            if (c > ((a) (obj)).c)
            {
                return 1;
            } else
            {
                return b.compareTo(((a) (obj)).b);
            }
        }

        public final boolean equals(Object obj)
        {
            if (this == obj)
            {
                return true;
            }
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            } else
            {
                obj = (a)obj;
                return b.equals(((a) (obj)).b);
            }
        }

        public final int hashCode()
        {
            return b.hashCode();
        }

        public final String toString()
        {
            return b;
        }

        public a(File file)
        {
            d = true;
            a = file;
            b = file.getName();
            c = file.lastModified();
        }
    }

    static final class b extends v
    {

        public final void a(a a1)
        {
            a a2 = (a)b(a1.b);
            if (a2 != null)
            {
                a2.d = false;
            }
            a(a1.b, a1);
        }

        protected final void a(Object obj)
        {
            obj = (a)obj;
            if (((a) (obj)).d && !((a) (obj)).a.delete())
            {
                obj = String.valueOf(((a) (obj)).a);
                com.google.android.m4b.maps.bv.d.a((new StringBuilder(String.valueOf(obj).length() + 28)).append("Failed to delete cache file ").append(((String) (obj))).toString());
            }
        }

        public b()
        {
            super(100);
        }
    }


    File a;
    private final b b = new b();
    private final HashSet c = new HashSet();
    private final int d = 3;
    private final String e;

    public s(String s1)
    {
        e = s1;
        a();
    }

    private File a(String s1)
    {
        return new File(a, s1);
    }

    private void a()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        File file = new File(e);
        if (file.isDirectory() || file.mkdirs()) goto _L2; else goto _L1
_L1:
        Object obj = String.valueOf(e);
        if (((String) (obj)).length() == 0) goto _L4; else goto _L3
_L3:
        obj = "Could not open cache directory ".concat(((String) (obj)));
_L5:
        com.google.android.m4b.maps.bv.d.a(((String) (obj)));
_L9:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        obj = new String("Could not open cache directory ");
          goto _L5
        Exception exception;
        exception;
        throw exception;
_L2:
        String as[];
        a aa[];
        System.currentTimeMillis();
        as = file.list();
        System.currentTimeMillis();
        a = file;
        aa = new a[as.length];
        int i = 0;
_L7:
        if (i >= as.length)
        {
            break; /* Loop/switch isn't completed */
        }
        aa[i] = new a(a(as[i]));
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        int j;
        System.currentTimeMillis();
        Arrays.sort(aa);
        System.currentTimeMillis();
        j = aa.length;
        i = ((flag) ? 1 : 0);
_L11:
        if (i >= j) goto _L9; else goto _L8
_L8:
        as = aa[i];
        if (((a) (as)).a.isFile())
        {
            b.a(as);
        }
        i++;
        if (true) goto _L11; else goto _L10
_L10:
          goto _L9
    }

    private void a(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        b.c(a1.b);
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        throw a1;
    }

    public static void a(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
    }

    private byte[] a(a a1, long l)
    {
        if (System.currentTimeMillis() - a1.c > l)
        {
            String s1 = String.valueOf(a1);
            com.google.android.m4b.maps.bv.d.a((new StringBuilder(String.valueOf(s1).length() + 20)).append("Expired cache file: ").append(s1).toString());
            a(a1);
            return null;
        }
        Object obj1 = new DataInputStream(new FileInputStream(a1.a));
        Object obj = obj1;
        byte abyte0[] = new byte[(int)a1.a.length()];
        obj = obj1;
        ((DataInputStream) (obj1)).readFully(abyte0);
        a(((Closeable) (obj1)));
        return abyte0;
        Object obj2;
        obj2;
        obj1 = null;
_L6:
        obj = obj1;
        Object obj3 = String.valueOf(obj2);
        obj = obj1;
        com.google.android.m4b.maps.bv.d.a((new StringBuilder(String.valueOf(obj3).length() + 27)).append("Could not find cache file: ").append(((String) (obj3))).toString());
        a(((Closeable) (obj1)));
        a(a1);
        return null;
        obj3;
        obj1 = null;
_L4:
        obj = obj1;
        obj3 = String.valueOf(obj3);
        obj = obj1;
        com.google.android.m4b.maps.bv.d.a((new StringBuilder(String.valueOf(obj3).length() + 27)).append("Could not read cache file: ").append(((String) (obj3))).toString());
        a(((Closeable) (obj1)));
        a(a1);
        return null;
        obj;
        obj3 = null;
        obj1 = obj;
_L2:
        a(((Closeable) (obj3)));
        a(a1);
        throw obj1;
        obj1;
        obj3 = obj;
        if (true) goto _L2; else goto _L1
_L1:
        obj3;
        if (true) goto _L4; else goto _L3
_L3:
        obj3;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(byte abyte0[], String s1)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        obj4 = null;
        obj = null;
        obj1 = null;
        obj3 = null;
        obj2 = null;
        if (s1 == null || s1.length() < 5)
        {
            throw new IllegalArgumentException("persistentKey");
        }
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        s1 = a(s1);
        obj = obj4;
        obj1 = obj3;
        this;
        JVM INSTR monitorenter ;
        obj = obj2;
        obj1 = new FileOutputStream(s1);
        ((OutputStream) (obj1)).write(abyte0);
        a(((Closeable) (obj1)));
        obj = obj2;
        b.a(new a(s1));
        obj = obj2;
        this;
        JVM INSTR monitorexit ;
        a(((Closeable) (null)));
        return;
        Exception exception;
        exception;
        abyte0 = ((byte []) (obj));
_L6:
        obj = abyte0;
        this;
        JVM INSTR monitorexit ;
        obj = abyte0;
        obj1 = abyte0;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            abyte0 = s1;
        }
        finally
        {
            obj = obj1;
        }
_L4:
        s1 = String.valueOf(abyte0);
        throw new IOException((new StringBuilder(String.valueOf(s1).length() + 27)).append("Couldn't create cache file ").append(s1).toString());
        obj1;
        s1 = abyte0;
        abyte0 = ((byte []) (obj1));
_L2:
        a(((Closeable) (obj)));
        if (s1 != null)
        {
            s1.delete();
        }
        throw abyte0;
        abyte0;
        s1 = null;
        obj = obj1;
        if (true) goto _L2; else goto _L1
_L1:
        abyte0;
        abyte0 = null;
        if (true) goto _L4; else goto _L3
_L3:
        exception;
        abyte0 = ((byte []) (obj1));
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final boolean a(String s1, long l)
    {
        this;
        JVM INSTR monitorenter ;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        if (s1.length() >= 5)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        throw new IllegalArgumentException("persistentKey");
        s1;
        this;
        JVM INSTR monitorexit ;
        throw s1;
        if (l >= 1L)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        throw new IllegalArgumentException("shelfLife");
        long l1;
        l1 = System.currentTimeMillis();
        s1 = (a)b.b(s1);
        if (s1 == null) goto _L2; else goto _L1
_L1:
        long l2 = ((a) (s1)).c;
        if (l1 - l2 > l) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    final byte[] b(String s1, long l)
    {
        this;
        JVM INSTR monitorenter ;
        s1 = (a)b.b(s1);
        if (s1 != null) goto _L2; else goto _L1
_L1:
        s1 = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return s1;
_L2:
        s1 = a(s1, l);
        if (true) goto _L4; else goto _L3
_L3:
        s1;
        throw s1;
    }
}
