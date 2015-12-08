// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.m;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public final class e
{
    public static final class a extends FilterOutputStream
    {

        private boolean a;
        private int b;
        private byte c[];
        private int d;
        private int e;
        private boolean f;
        private byte g[];
        private boolean h;
        private int i;
        private byte j[];

        public final void close()
        {
label0:
            {
                if (b > 0)
                {
                    if (!a)
                    {
                        break label0;
                    }
                    out.write(e.a(g, c, b, i));
                    b = 0;
                }
                super.close();
                c = null;
                out = null;
                return;
            }
            throw new IOException("Base64 input not properly padded.");
        }

        public final void write(int k)
        {
            if (!h) goto _L2; else goto _L1
_L1:
            out.write(k);
_L4:
            return;
_L2:
            if (!a)
            {
                break; /* Loop/switch isn't completed */
            }
            byte abyte0[] = c;
            int l = b;
            b = l + 1;
            abyte0[l] = (byte)k;
            if (b >= d)
            {
                out.write(e.a(g, c, d, i));
                e = e + 4;
                if (f && e >= 76)
                {
                    out.write(10);
                    e = 0;
                }
                b = 0;
                return;
            }
            if (true) goto _L4; else goto _L3
_L3:
            if (j[k & 0x7f] <= -5)
            {
                continue; /* Loop/switch isn't completed */
            }
            byte abyte1[] = c;
            int i1 = b;
            b = i1 + 1;
            abyte1[i1] = (byte)k;
            if (b < d) goto _L4; else goto _L5
_L5:
            k = e.a(c, g, i);
            out.write(g, 0, k);
            b = 0;
            return;
            if (j[k & 0x7f] == -5) goto _L4; else goto _L6
_L6:
            throw new IOException("Invalid character in Base64 data.");
        }

        public final void write(byte abyte0[], int k, int l)
        {
            if (h)
            {
                out.write(abyte0, k, l);
            } else
            {
                int i1 = 0;
                while (i1 < l) 
                {
                    write(abyte0[k + i1]);
                    i1++;
                }
            }
        }

        public a(OutputStream outputstream, int k)
        {
            boolean flag1 = true;
            super(outputstream);
            int l;
            boolean flag;
            if ((k & 8) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            f = flag;
            if ((k & 1) != 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            a = flag;
            if (a)
            {
                l = 3;
            } else
            {
                l = 4;
            }
            d = l;
            c = new byte[d];
            b = 0;
            e = 0;
            h = false;
            g = new byte[4];
            i = k;
            j = e.a(k);
        }
    }


    private static final byte a[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 43, 47
    };
    private static final byte b[] = {
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, 
        -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 
        54, 55, 56, 57, 58, 59, 60, 61, -9, -9, 
        -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 
        5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 
        15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 
        25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 
        29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
        39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 
        49, 50, 51, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9
    };
    private static final byte c[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 45, 95
    };
    private static final byte d[] = {
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, 
        -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 
        54, 55, 56, 57, 58, 59, 60, 61, -9, -9, 
        -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 
        5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 
        15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 
        25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 
        29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
        39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 
        49, 50, 51, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9
    };
    private static final byte e[] = {
        45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 
        57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 
        74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 
        84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 
        99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 
        109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 
        119, 120, 121, 122
    };
    private static final byte f[] = {
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, 
        -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 
        3, 4, 5, 6, 7, 8, 9, 10, -9, -9, 
        -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, 
        16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 
        26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 
        36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 
        41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 
        51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 
        61, 62, 63, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9
    };

    static int a(byte abyte0[], byte abyte1[], int i)
    {
        return b(abyte0, abyte1, 0, i);
    }

    public static String a(byte abyte0[])
    {
        boolean flag = false;
        Object obj = null;
        try
        {
            abyte0 = a(abyte0, abyte0.length, 0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            a(false);
            abyte0 = obj;
        }
        if (abyte0 != null)
        {
            flag = true;
        }
        a(flag);
        return abyte0;
    }

    public static String a(byte abyte0[], int i, int j)
    {
        byte abyte1[] = b(abyte0, i, j);
        String s;
        try
        {
            s = new String(abyte1, "US-ASCII");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return new String(abyte1);
        }
        abyte0 = s;
        if ((j & 0x10) == 0)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        i = s.length() - 1;
_L2:
        if (i <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (s.charAt(i) != '=')
        {
            break; /* Loop/switch isn't completed */
        }
        i--;
        if (true) goto _L2; else goto _L1
_L1:
        abyte0 = s;
        if (i != s.length() - 1)
        {
            abyte0 = s.substring(0, i + 1);
        }
        return abyte0;
    }

    private static void a(boolean flag)
    {
        if (!flag)
        {
            throw new RuntimeException(null);
        } else
        {
            return;
        }
    }

    static byte[] a(int i)
    {
        return b(i);
    }

    public static byte[] a(String s)
    {
        return a(s, 0);
    }

    public static byte[] a(String s, int i)
    {
        byte abyte1[];
        IOException ioexception;
        ioexception = null;
        abyte1 = null;
        if (s == null)
        {
            throw new NullPointerException("Input string was null.");
        }
        byte abyte0[] = s.getBytes("US-ASCII");
        s = abyte0;
_L4:
        Object obj;
        Object obj1;
        byte abyte2[];
        abyte2 = c(s, s.length, i);
        byte abyte3[];
        if ((i & 4) != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (abyte2.length < 4 || i != 0 || 35615 != (abyte2[0] & 0xff | abyte2[1] << 8 & 0xff00))
        {
            break MISSING_BLOCK_LABEL_325;
        }
        abyte3 = new byte[2048];
        obj1 = new ByteArrayOutputStream();
        obj = new ByteArrayInputStream(abyte2);
        s = new GZIPInputStream(((java.io.InputStream) (obj)));
_L3:
        i = s.read(abyte3);
        if (i < 0) goto _L2; else goto _L1
_L1:
        ((ByteArrayOutputStream) (obj1)).write(abyte3, 0, i);
          goto _L3
        ioexception;
        abyte1 = s;
        s = ((String) (obj));
        obj = ioexception;
_L7:
        ((IOException) (obj)).printStackTrace();
        try
        {
            ((ByteArrayOutputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            abyte1.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return abyte2;
        }
        return abyte2;
        obj;
        s = s.getBytes();
          goto _L4
_L2:
        abyte1 = ((ByteArrayOutputStream) (obj1)).toByteArray();
        try
        {
            ((ByteArrayOutputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            ((ByteArrayInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return abyte1;
        }
        return abyte1;
        s;
        obj1 = null;
        obj = null;
        abyte1 = ioexception;
_L6:
        try
        {
            ((ByteArrayOutputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        try
        {
            abyte1.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        try
        {
            ((ByteArrayInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw s;
        s;
        obj = null;
        abyte1 = ioexception;
        continue; /* Loop/switch isn't completed */
        s;
        abyte1 = ioexception;
        continue; /* Loop/switch isn't completed */
        Object obj2;
        obj2;
        abyte1 = s;
        s = ((String) (obj2));
        continue; /* Loop/switch isn't completed */
        obj2;
        obj = s;
        s = ((String) (obj2));
        if (true) goto _L6; else goto _L5
_L5:
        obj;
        obj1 = null;
        s = null;
          goto _L7
        obj;
        s = null;
          goto _L7
        obj2;
        s = ((String) (obj));
        obj = obj2;
          goto _L7
        return abyte2;
    }

    private static byte[] a(byte abyte0[], int i, int j, byte abyte1[], int k, int l)
    {
        int j1 = 0;
        byte abyte2[];
        int i1;
        if ((l & 0x10) == 16)
        {
            abyte2 = c;
        } else
        if ((l & 0x20) == 32)
        {
            abyte2 = e;
        } else
        {
            abyte2 = a;
        }
        if (j > 0)
        {
            l = (abyte0[i] << 24) >>> 8;
        } else
        {
            l = 0;
        }
        if (j > 1)
        {
            i1 = (abyte0[i + 1] << 24) >>> 16;
        } else
        {
            i1 = 0;
        }
        if (j > 2)
        {
            j1 = (abyte0[i + 2] << 24) >>> 24;
        }
        i = j1 | (i1 | l);
        switch (j)
        {
        default:
            return abyte1;

        case 3: // '\003'
            abyte1[k] = abyte2[i >>> 18];
            abyte1[k + 1] = abyte2[i >>> 12 & 0x3f];
            abyte1[k + 2] = abyte2[i >>> 6 & 0x3f];
            abyte1[k + 3] = abyte2[i & 0x3f];
            return abyte1;

        case 2: // '\002'
            abyte1[k] = abyte2[i >>> 18];
            abyte1[k + 1] = abyte2[i >>> 12 & 0x3f];
            abyte1[k + 2] = abyte2[i >>> 6 & 0x3f];
            abyte1[k + 3] = 61;
            return abyte1;

        case 1: // '\001'
            abyte1[k] = abyte2[i >>> 18];
            abyte1[k + 1] = abyte2[i >>> 12 & 0x3f];
            abyte1[k + 2] = 61;
            abyte1[k + 3] = 61;
            return abyte1;
        }
    }

    static byte[] a(byte abyte0[], byte abyte1[], int i, int j)
    {
        a(abyte1, 0, i, abyte0, 0, j);
        return abyte0;
    }

    private static int b(byte abyte0[], byte abyte1[], int i, int j)
    {
        if (abyte0 == null)
        {
            throw new NullPointerException("Source array was null.");
        }
        if (abyte1 == null)
        {
            throw new NullPointerException("Destination array was null.");
        }
        if (3 >= abyte0.length)
        {
            throw new IllegalArgumentException("Source array with length %d cannot have offset of %d and still process four bytes.");
        }
        if (i < 0 || i + 2 >= abyte1.length)
        {
            throw new IllegalArgumentException("Destination array with length %d cannot have offset of %d and still store three bytes.");
        }
        byte abyte2[] = b(j);
        if (abyte0[2] == 61)
        {
            abyte1[i] = (byte)(((abyte2[abyte0[0]] & 0xff) << 18 | (abyte2[abyte0[1]] & 0xff) << 12) >>> 16);
            return 1;
        }
        if (abyte0[3] == 61)
        {
            j = abyte2[abyte0[0]];
            j = (abyte2[abyte0[1]] & 0xff) << 12 | (j & 0xff) << 18 | (abyte2[abyte0[2]] & 0xff) << 6;
            abyte1[i] = (byte)(j >>> 16);
            abyte1[i + 1] = (byte)(j >>> 8);
            return 2;
        } else
        {
            j = abyte2[abyte0[0]];
            j = (abyte2[abyte0[1]] & 0xff) << 12 | (j & 0xff) << 18 | (abyte2[abyte0[2]] & 0xff) << 6 | abyte2[abyte0[3]] & 0xff;
            abyte1[i] = (byte)(j >> 16);
            abyte1[i + 1] = (byte)(j >> 8);
            abyte1[i + 2] = (byte)j;
            return 3;
        }
    }

    public static String b(byte abyte0[])
    {
        return a(abyte0, abyte0.length, 16);
    }

    private static final byte[] b(int i)
    {
        if ((i & 0x10) == 16)
        {
            return d;
        }
        if ((i & 0x20) == 32)
        {
            return f;
        } else
        {
            return b;
        }
    }

    private static byte[] b(byte abyte0[], int i, int j)
    {
        Object obj3;
        Exception exception;
        exception = null;
        obj3 = null;
        if (abyte0 == null)
        {
            throw new NullPointerException("Cannot serialize a null array.");
        }
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Cannot have length offset: ")).append(i).toString());
        }
        if (i + 0 > abyte0.length)
        {
            throw new IllegalArgumentException("Cannot have offset of %d and length of %d with array of length %d");
        }
        if ((j & 2) == 0) goto _L2; else goto _L1
_L1:
        Object obj = new ByteArrayOutputStream();
        Object obj1;
        Object obj2;
        int k;
        int l;
        boolean flag;
        int i1;
        int j1;
        int k1;
        try
        {
            obj2 = new a(((OutputStream) (obj)), j | 1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            obj2 = null;
            abyte0 = ((byte []) (obj));
            obj = obj2;
            obj2 = obj3;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj1 = null;
            obj2 = exception;
            obj3 = obj;
            continue; /* Loop/switch isn't completed */
        }
        try
        {
_L3:
            obj1 = new GZIPOutputStream(((OutputStream) (obj2)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            abyte0 = ((byte []) (obj));
            obj = obj2;
            obj2 = obj3;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj1 = obj2;
            obj2 = exception;
            obj3 = obj;
            continue; /* Loop/switch isn't completed */
        }
        ((GZIPOutputStream) (obj1)).write(abyte0, 0, i);
        ((GZIPOutputStream) (obj1)).close();
        try
        {
            ((GZIPOutputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[]) { }
        try
        {
            ((a) (obj2)).close();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[]) { }
        try
        {
            ((ByteArrayOutputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[]) { }
        abyte0 = ((ByteArrayOutputStream) (obj)).toByteArray();
        return abyte0;
        obj1;
        obj = null;
        abyte0 = null;
        obj2 = obj3;
_L6:
        throw obj1;
        exception;
        obj3 = abyte0;
        obj1 = obj;
        abyte0 = exception;
_L4:
        try
        {
            ((GZIPOutputStream) (obj2)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            ((a) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            ((ByteArrayOutputStream) (obj3)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw abyte0;
_L2:
        if ((j & 8) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l = i / 3;
        if (i % 3 > 0)
        {
            k = 4;
        } else
        {
            k = 0;
        }
        l = k + l * 4;
        k = l;
        if (flag)
        {
            k = l + l / 76;
        }
        obj = new byte[k];
        l = 0;
        k = 0;
        for (i1 = 0; i1 < i - 2; i1 += 3)
        {
            a(abyte0, i1 + 0, 3, ((byte []) (obj)), k, j);
            k1 = l + 4;
            l = k1;
            j1 = k;
            if (flag)
            {
                l = k1;
                j1 = k;
                if (k1 >= 76)
                {
                    obj[k + 4] = 10;
                    j1 = k + 1;
                    l = 0;
                }
            }
            k = j1 + 4;
        }

        l = k;
        if (i1 < i)
        {
            a(abyte0, i1 + 0, i - i1, ((byte []) (obj)), k, j);
            l = k + 4;
        }
        abyte0 = ((byte []) (obj));
        if (l <= obj.length - 1)
        {
            abyte0 = new byte[l];
            System.arraycopy(obj, 0, abyte0, 0, l);
            return abyte0;
        } else
        {
            break MISSING_BLOCK_LABEL_139;
        }
        abyte0;
        obj1 = null;
        obj3 = null;
        obj2 = exception;
        continue; /* Loop/switch isn't completed */
        abyte0;
        obj3 = obj1;
        obj1 = obj2;
        obj2 = obj3;
        obj3 = obj;
        if (true) goto _L4; else goto _L3
        IOException ioexception;
        ioexception;
        abyte0 = ((byte []) (obj1));
        Object obj4 = obj;
        obj1 = ioexception;
        obj = obj2;
        obj2 = abyte0;
        abyte0 = ((byte []) (obj4));
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static byte[] c(byte abyte0[])
    {
        return c(abyte0, abyte0.length, 0);
    }

    private static byte[] c(byte abyte0[], int i, int j)
    {
        byte abyte1[];
        byte abyte3[];
        byte abyte4[];
        int l;
        int i1;
        int j1;
        abyte1 = abyte0;
        i1 = i;
        if (i % 4 != 0)
        {
            abyte1 = new byte[(i / 4 + 1) * 4];
            System.arraycopy(abyte0, 0, abyte1, 0, abyte0.length);
            for (int k = i; k < abyte1.length; k++)
            {
                abyte1[k] = 61;
            }

            i1 = i + (abyte1.length - abyte0.length);
        }
        if (abyte1 == null)
        {
            throw new NullPointerException("Cannot decode null source array.");
        }
        if (i1 + 0 > abyte1.length)
        {
            throw new IllegalArgumentException("Source array with length %d cannot have offset of %d and process %d bytes.");
        }
        if (i1 == 0)
        {
            return new byte[0];
        }
        if (i1 < 4)
        {
            throw new IllegalArgumentException((new StringBuilder("Base64-encoded string must have at least four characters, but length specified was ")).append(i1).toString());
        }
        abyte3 = b(j);
        abyte0 = new byte[(i1 * 3) / 4];
        abyte4 = new byte[4];
        j1 = 0;
        l = 0;
        i = 0;
_L9:
        int k1;
        if (j1 >= i1 + 0)
        {
            break MISSING_BLOCK_LABEL_319;
        }
        k1 = abyte3[abyte1[j1] & 0xff];
        if (k1 < -5) goto _L2; else goto _L1
_L1:
        if (k1 < -1) goto _L4; else goto _L3
_L3:
        k1 = l + 1;
        abyte4[l] = abyte1[j1];
        if (k1 <= 3) goto _L6; else goto _L5
_L5:
        l = b(abyte4, abyte0, i, j) + i;
        if (abyte1[j1] != 61) goto _L8; else goto _L7
_L7:
        byte abyte2[] = new byte[l];
        System.arraycopy(abyte0, 0, abyte2, 0, l);
        return abyte2;
_L2:
        throw new IOException("Bad Base64 input character decimal %d in array position %d");
_L8:
        i = 0;
_L10:
        k1 = j1 + 1;
        j1 = l;
        l = i;
        i = j1;
        j1 = k1;
          goto _L9
_L6:
        l = i;
        i = k1;
          goto _L10
_L4:
        int l1 = i;
        i = l;
        l = l1;
          goto _L10
        l = i;
          goto _L7
    }

}
