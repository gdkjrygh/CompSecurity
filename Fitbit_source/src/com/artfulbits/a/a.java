// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.a;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.Date;

public final class com.artfulbits.a.a
{
    static final class a
    {

        private final byte a[];
        private int b;

        public final String a()
        {
            int i;
            byte abyte0[] = a;
            i = b;
            b = i + 1;
            i = abyte0[i];
            abyte0 = a;
            int j = b;
            b = j + 1;
            j = abyte0[j];
            abyte0 = a;
            int k = b;
            b = k + 1;
            k = abyte0[k];
            abyte0 = a;
            int l = b;
            b = l + 1;
            i = abyte0[l] & 0xff | ((i & 0xff) << 24 | 0 | (j & 0xff) << 16 | (k & 0xff) << 8);
            String s = new String(a, b, i, "US-ASCII");
            b = b + i;
            return s;
            UnsupportedEncodingException unsupportedencodingexception;
            unsupportedencodingexception;
            s = null;
_L2:
            unsupportedencodingexception.printStackTrace();
            return s;
            unsupportedencodingexception;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public final void a(int i)
        {
            b = b + 1;
        }

        public final long b()
        {
            byte abyte0[] = a;
            int i = b;
            b = i + 1;
            long l = abyte0[i];
            abyte0 = a;
            i = b;
            b = i + 1;
            long l1 = abyte0[i];
            abyte0 = a;
            i = b;
            b = i + 1;
            long l2 = abyte0[i];
            abyte0 = a;
            i = b;
            b = i + 1;
            long l3 = abyte0[i];
            abyte0 = a;
            i = b;
            b = i + 1;
            long l4 = abyte0[i];
            abyte0 = a;
            i = b;
            b = i + 1;
            long l5 = abyte0[i];
            abyte0 = a;
            i = b;
            b = i + 1;
            long l6 = abyte0[i];
            abyte0 = a;
            i = b;
            b = i + 1;
            return 0L | (l & 255L) << 56 | (l1 & 255L) << 48 | (l2 & 255L) << 40 | (l3 & 255L) << 32 | (l4 & 255L) << 24 | (l5 & 255L) << 16 | (l6 & 255L) << 8 | (long)abyte0[i] & 255L;
        }

        public a(byte abyte0[])
        {
            a = abyte0;
        }
    }


    private final String a;
    private final String b;
    private final String c;
    private final long d;
    private final long e;

    private com.artfulbits.a.a(byte abyte0[])
    {
        abyte0 = new a(abyte0);
        abyte0.a(1);
        a = abyte0.a();
        d = abyte0.b();
        e = abyte0.b();
        b = abyte0.a();
        c = abyte0.a();
    }

    public static com.artfulbits.a.a a(Class class1, String s, String s1, byte abyte0[], byte abyte1[])
    {
        s = b(class1, s);
        if (s == null)
        {
            class1 = a(class1, s1);
        } else
        {
            class1 = s;
        }
        if (class1 != null)
        {
            s = new BigInteger(1, abyte0);
            s1 = new BigInteger(1, abyte1);
            abyte0 = new ByteArrayOutputStream(class1.length);
            int j = (s1.bitLength() + 7) / 8;
            int i = 0;
            while (i < class1.length) 
            {
                abyte1 = new byte[Math.min(class1.length - i, j)];
                System.arraycopy(class1, i, abyte1, 0, abyte1.length);
                abyte1 = (new BigInteger(1, abyte1)).modPow(s, s1).toByteArray();
                if (abyte1[0] == 0)
                {
                    abyte0.write(abyte1, 1, abyte1.length - 1);
                } else
                {
                    abyte0.write(abyte1, 0, abyte1.length);
                }
                i += j;
            }
            return new com.artfulbits.a.a(abyte0.toByteArray());
        } else
        {
            return null;
        }
    }

    private static byte[] a(Class class1, String s)
    {
        Object obj = null;
        s = class1.getResourceAsStream(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        ByteArrayOutputStream bytearrayoutputstream;
        class1 = new byte[512];
        bytearrayoutputstream = new ByteArrayOutputStream();
_L3:
        int i = s.read(class1);
        if (i <= 0) goto _L2; else goto _L1
_L1:
        bytearrayoutputstream.write(class1, 0, i);
          goto _L3
        s;
        class1 = null;
_L5:
        s.printStackTrace();
_L4:
        s = obj;
        if (!TextUtils.isEmpty(class1))
        {
            s = (new BigInteger(class1, 10)).toByteArray();
        }
        return s;
_L2:
        if (bytearrayoutputstream.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        class1 = bytearrayoutputstream.toString("US-ASCII");
_L6:
        s.close();
          goto _L4
        s;
          goto _L5
        class1 = null;
          goto _L6
        class1 = null;
          goto _L4
    }

    private static byte[] b(Class class1, String s)
    {
        Object obj;
        Object obj1;
        byte abyte0[];
        abyte0 = null;
        obj1 = null;
        obj = obj1;
        s = class1.getResourceAsStream(s);
        obj = abyte0;
        if (s == null) goto _L2; else goto _L1
_L1:
        obj = obj1;
        class1 = new ByteArrayOutputStream(128);
        obj = obj1;
        abyte0 = new byte[128];
_L4:
        obj = obj1;
        int i = s.read(abyte0);
        if (i <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        class1.write(abyte0, 0, i);
        if (true) goto _L4; else goto _L3
        class1;
        class1.printStackTrace();
_L2:
        return ((byte []) (obj));
_L3:
        obj = obj1;
        class1 = class1.toByteArray();
        obj = class1;
        s.close();
        return class1;
    }

    public final String a()
    {
        return c;
    }

    public final boolean b()
    {
        while (d > e || c() || a == null || b == null) 
        {
            return false;
        }
        return true;
    }

    public final boolean c()
    {
        long l = System.currentTimeMillis();
        return e < l || l < d;
    }

    public final boolean d()
    {
        return d == 0L || e == 0L || a == null || b == null;
    }

    public final String e()
    {
        return a;
    }

    public final Date f()
    {
        return new Date(e);
    }

    public final Date g()
    {
        return new Date(d);
    }

    public final String h()
    {
        return b;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(b).append("; ").append(a).append("; ").append(c).toString();
    }
}
