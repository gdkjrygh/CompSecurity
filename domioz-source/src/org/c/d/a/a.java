// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.d.a;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

// Referenced classes of package org.c.d.a:
//            c, d, b

public class a
{

    public static final int DECODE = 0;
    public static final int DONT_GUNZIP = 4;
    public static final int DO_BREAK_LINES = 8;
    public static final int ENCODE = 1;
    public static final int GZIP = 2;
    public static final int NO_OPTIONS = 0;
    public static final int ORDERED = 32;
    public static final int URL_SAFE = 16;
    static final boolean a;
    private static final byte b[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 43, 47
    };
    private static final byte c[] = {
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
    private static final byte d[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 45, 95
    };
    private static final byte e[] = {
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
    private static final byte f[] = {
        45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 
        57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 
        74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 
        84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 
        99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 
        109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 
        119, 120, 121, 122
    };
    private static final byte g[] = {
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

    private a()
    {
    }

    static int a(byte abyte0[], byte abyte1[], int i)
    {
        return c(abyte0, abyte1, 0, i);
    }

    static byte[] a(int i)
    {
        return b(i);
    }

    private static byte[] a(byte abyte0[], int i, int j, byte abyte1[], int k, int l)
    {
        int j1 = 0;
        byte abyte2[];
        int i1;
        if ((l & 0x10) == 16)
        {
            abyte2 = d;
        } else
        if ((l & 0x20) == 32)
        {
            abyte2 = f;
        } else
        {
            abyte2 = b;
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

    static byte[] a(byte abyte0[], int i, byte abyte1[], int j)
    {
        return a(abyte0, 0, i, abyte1, 0, j);
    }

    static byte[] a(byte abyte0[], byte abyte1[], int i, int j)
    {
        return b(abyte0, abyte1, i, j);
    }

    private static final byte[] b(int i)
    {
        if ((i & 0x10) == 16)
        {
            return e;
        }
        if ((i & 0x20) == 32)
        {
            return g;
        } else
        {
            return c;
        }
    }

    private static byte[] b(byte abyte0[], byte abyte1[], int i, int j)
    {
        a(abyte1, 0, i, abyte0, 0, j);
        return abyte0;
    }

    private static int c(byte abyte0[], byte abyte1[], int i, int j)
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
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", new Object[] {
                Integer.valueOf(abyte0.length), Integer.valueOf(0)
            }));
        }
        if (i < 0 || i + 2 >= abyte1.length)
        {
            throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", new Object[] {
                Integer.valueOf(abyte1.length), Integer.valueOf(i)
            }));
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

    public static byte[] decode(String s)
    {
        return decode(s, 0);
    }

    public static byte[] decode(String s, int i)
    {
        Object obj1;
        IOException ioexception;
        ioexception = null;
        obj1 = null;
        if (s == null)
        {
            throw new NullPointerException("Input string was null.");
        }
        byte abyte0[] = s.getBytes("US-ASCII");
        s = abyte0;
_L6:
        Object obj;
        Object obj2;
        byte abyte1[];
        abyte1 = decode(((byte []) (s)), 0, s.length, i);
        byte abyte2[];
        if ((i & 4) != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (abyte1 == null || abyte1.length < 4 || i != 0 || 35615 != (abyte1[0] & 0xff | abyte1[1] << 8 & 0xff00)) goto _L2; else goto _L1
_L1:
        abyte2 = new byte[2048];
        obj2 = new ByteArrayOutputStream();
        obj = new ByteArrayInputStream(abyte1);
        s = new GZIPInputStream(((java.io.InputStream) (obj)));
_L5:
        i = s.read(abyte2);
        if (i < 0) goto _L4; else goto _L3
_L3:
        ((ByteArrayOutputStream) (obj2)).write(abyte2, 0, i);
          goto _L5
        ioexception;
        obj1 = s;
        s = ((String) (obj));
        obj = ioexception;
_L9:
        ((IOException) (obj)).printStackTrace();
        try
        {
            ((ByteArrayOutputStream) (obj2)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            ((GZIPInputStream) (obj1)).close();
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
            return abyte1;
        }
_L2:
        return abyte1;
        obj;
        s = s.getBytes();
          goto _L6
_L4:
        obj1 = ((ByteArrayOutputStream) (obj2)).toByteArray();
        try
        {
            ((ByteArrayOutputStream) (obj2)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2) { }
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
            return ((byte []) (obj1));
        }
        return ((byte []) (obj1));
        s;
        obj2 = null;
        obj = null;
        obj1 = ioexception;
_L8:
        try
        {
            ((ByteArrayOutputStream) (obj2)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2) { }
        try
        {
            ((GZIPInputStream) (obj1)).close();
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
        obj1 = ioexception;
        continue; /* Loop/switch isn't completed */
        s;
        obj1 = ioexception;
        continue; /* Loop/switch isn't completed */
        Object obj3;
        obj3;
        obj1 = s;
        s = ((String) (obj3));
        continue; /* Loop/switch isn't completed */
        obj3;
        obj = s;
        s = ((String) (obj3));
        if (true) goto _L8; else goto _L7
_L7:
        obj;
        obj2 = null;
        s = null;
          goto _L9
        obj;
        s = null;
          goto _L9
        obj3;
        s = ((String) (obj));
        obj = obj3;
          goto _L9
    }

    public static byte[] decode(byte abyte0[])
    {
        return decode(abyte0, 0, abyte0.length, 0);
    }

    public static byte[] decode(byte abyte0[], int i, int j, int k)
    {
        byte abyte1[];
        byte abyte2[];
        byte abyte3[];
        int l;
        int i1;
        int j1;
        if (abyte0 == null)
        {
            throw new NullPointerException("Cannot decode null source array.");
        }
        if (i < 0 || i + j > abyte0.length)
        {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and process %d bytes.", new Object[] {
                Integer.valueOf(abyte0.length), Integer.valueOf(i), Integer.valueOf(j)
            }));
        }
        if (j == 0)
        {
            return new byte[0];
        }
        if (j < 4)
        {
            throw new IllegalArgumentException((new StringBuilder("Base64-encoded string must have at least four characters, but length specified was ")).append(j).toString());
        }
        abyte2 = b(k);
        abyte1 = new byte[(j * 3) / 4];
        abyte3 = new byte[4];
        j1 = i;
        i1 = 0;
        l = 0;
_L9:
        int k1;
        if (j1 >= i + j)
        {
            break MISSING_BLOCK_LABEL_324;
        }
        k1 = abyte2[abyte0[j1] & 0xff];
        if (k1 < -5) goto _L2; else goto _L1
_L1:
        if (k1 < -1) goto _L4; else goto _L3
_L3:
        k1 = i1 + 1;
        abyte3[i1] = abyte0[j1];
        if (k1 <= 3) goto _L6; else goto _L5
_L5:
        i1 = c(abyte3, abyte1, l, k) + l;
        if (abyte0[j1] != 61) goto _L8; else goto _L7
_L7:
        abyte0 = new byte[i1];
        System.arraycopy(abyte1, 0, abyte0, 0, i1);
        return abyte0;
_L2:
        throw new IOException(String.format("Bad Base64 input character decimal %d in array position %d", new Object[] {
            Integer.valueOf(abyte0[j1] & 0xff), Integer.valueOf(j1)
        }));
_L8:
        l = 0;
_L10:
        k1 = j1 + 1;
        j1 = i1;
        i1 = l;
        l = j1;
        j1 = k1;
          goto _L9
_L6:
        i1 = l;
        l = k1;
          goto _L10
_L4:
        int l1 = l;
        l = i1;
        i1 = l1;
          goto _L10
        i1 = l;
          goto _L7
    }

    public static void decodeFileToFile(String s, String s1)
    {
        Object obj;
        byte abyte0[];
        abyte0 = decodeFromFile(s);
        obj = null;
        s1 = new BufferedOutputStream(new FileOutputStream(s1));
        s = s1;
        s1.write(abyte0);
        try
        {
            s1.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        obj;
        s = null;
_L4:
        throw obj;
        obj;
        s1 = s;
        s = ((String) (obj));
_L2:
        try
        {
            s1.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        throw s;
        s;
        s1 = ((String) (obj));
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        s = s1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static byte[] decodeFromFile(String s)
    {
        byte abyte0[];
        Object obj;
        Object obj2;
        int i;
        i = 0;
        obj2 = null;
        obj = null;
        abyte0 = obj2;
        s = new File(s);
        abyte0 = obj2;
        if (s.length() <= 0x7fffffffL) goto _L2; else goto _L1
_L1:
        abyte0 = obj2;
        try
        {
            throw new IOException((new StringBuilder("File is too big for this convenience method (")).append(s.length()).append(" bytes).").toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            abyte0 = obj;
        }
        finally { }
_L8:
        throw s;
_L6:
        byte abyte1[];
        int j;
        try
        {
            abyte0.close();
        }
        catch (Exception exception) { }
        throw s;
_L2:
        abyte0 = obj2;
        abyte1 = new byte[(int)s.length()];
        abyte0 = obj2;
        s = new c(new BufferedInputStream(new FileInputStream(s)), 0);
_L4:
        j = s.read(abyte1, i, 4096);
        if (j < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i += j;
        if (true) goto _L4; else goto _L3
_L3:
        abyte0 = new byte[i];
        System.arraycopy(abyte1, 0, abyte0, 0, i);
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return abyte0;
        }
        return abyte0;
        Object obj1;
        obj1;
        exception = s;
        s = ((String) (obj1));
        if (true) goto _L6; else goto _L5
_L5:
        obj1;
        exception = s;
        s = ((String) (obj1));
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static void decodeToFile(String s, String s1)
    {
        d d1 = new d(new FileOutputStream(s1), 0);
        s1 = d1;
        d1.write(s.getBytes("US-ASCII"));
        try
        {
            d1.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        s;
        s1 = null;
_L4:
        throw s;
        s;
_L2:
        try
        {
            s1.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        throw s;
        s;
        s1 = null;
        if (true) goto _L2; else goto _L1
_L1:
        s;
        s1 = d1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Object decodeToObject(String s)
    {
        return decodeToObject(s, 0, null);
    }

    public static Object decodeToObject(String s, int i, ClassLoader classloader)
    {
        Object obj;
        ClassLoader classloader1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        obj5 = null;
        obj = null;
        obj2 = null;
        obj4 = null;
        obj3 = null;
        classloader1 = null;
        s = decode(s, i);
        Object obj1 = new ByteArrayInputStream(s);
        if (classloader != null) goto _L2; else goto _L1
_L1:
        s = obj5;
        obj = obj1;
        classloader1 = obj4;
        obj2 = obj3;
        classloader = new ObjectInputStream(((java.io.InputStream) (obj1)));
_L4:
        s = classloader;
        obj = obj1;
        classloader1 = classloader;
        obj2 = classloader;
        obj3 = classloader.readObject();
        try
        {
            ((ByteArrayInputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            classloader.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return obj3;
        }
        return obj3;
_L2:
        s = obj5;
        obj = obj1;
        classloader1 = obj4;
        obj2 = obj3;
        classloader = new b(((java.io.InputStream) (obj1)), classloader);
        if (true) goto _L4; else goto _L3
_L3:
        classloader;
        obj = null;
        s = classloader1;
_L8:
        throw classloader;
        obj1;
        classloader = s;
        s = ((String) (obj1));
_L5:
        try
        {
            ((ByteArrayInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            classloader.close();
        }
        // Misplaced declaration of an exception variable
        catch (ClassLoader classloader) { }
        throw s;
        classloader;
        obj = null;
        s = ((String) (obj2));
_L6:
        throw classloader;
        s;
        obj1 = null;
        classloader = ((ClassLoader) (obj));
        obj = obj1;
          goto _L5
        classloader;
        s = classloader1;
        obj = obj1;
          goto _L6
        classloader;
        s = ((String) (obj2));
        obj = obj1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static void encode(ByteBuffer bytebuffer, ByteBuffer bytebuffer1)
    {
        byte abyte0[] = new byte[3];
        byte abyte1[] = new byte[4];
        for (; bytebuffer.hasRemaining(); bytebuffer1.put(abyte1))
        {
            int i = Math.min(3, bytebuffer.remaining());
            bytebuffer.get(abyte0, 0, i);
            b(abyte1, abyte0, i, 0);
        }

    }

    public static void encode(ByteBuffer bytebuffer, CharBuffer charbuffer)
    {
        byte abyte0[] = new byte[3];
        byte abyte1[] = new byte[4];
        while (bytebuffer.hasRemaining()) 
        {
            int i = Math.min(3, bytebuffer.remaining());
            bytebuffer.get(abyte0, 0, i);
            b(abyte1, abyte0, i, 0);
            i = 0;
            while (i < 4) 
            {
                charbuffer.put((char)(abyte1[i] & 0xff));
                i++;
            }
        }
    }

    public static String encodeBytes(byte abyte0[])
    {
        Object obj = null;
        try
        {
            abyte0 = encodeBytes(abyte0, 0, abyte0.length, 0);
        }
        catch (IOException ioexception)
        {
            abyte0 = obj;
            if (!a)
            {
                throw new AssertionError(ioexception.getMessage());
            }
        }
        if (!a && abyte0 == null)
        {
            throw new AssertionError();
        } else
        {
            return abyte0;
        }
    }

    public static String encodeBytes(byte abyte0[], int i)
    {
        return encodeBytes(abyte0, 0, abyte0.length, i);
    }

    public static String encodeBytes(byte abyte0[], int i, int j)
    {
        Object obj = null;
        try
        {
            abyte0 = encodeBytes(abyte0, i, j, 0);
        }
        catch (IOException ioexception)
        {
            abyte0 = obj;
            if (!a)
            {
                throw new AssertionError(ioexception.getMessage());
            }
        }
        if (!a && abyte0 == null)
        {
            throw new AssertionError();
        } else
        {
            return abyte0;
        }
    }

    public static String encodeBytes(byte abyte0[], int i, int j, int k)
    {
        abyte0 = encodeBytesToBytes(abyte0, i, j, k);
        String s;
        try
        {
            s = new String(abyte0, "US-ASCII");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            return new String(abyte0);
        }
        return s;
    }

    public static byte[] encodeBytesToBytes(byte abyte0[])
    {
        Object obj = null;
        try
        {
            abyte0 = encodeBytesToBytes(abyte0, 0, abyte0.length, 0);
        }
        catch (IOException ioexception)
        {
            abyte0 = obj;
            if (!a)
            {
                throw new AssertionError((new StringBuilder("IOExceptions only come from GZipping, which is turned off: ")).append(ioexception.getMessage()).toString());
            }
        }
        return abyte0;
    }

    public static byte[] encodeBytesToBytes(byte abyte0[], int i, int j, int k)
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
            throw new IllegalArgumentException((new StringBuilder("Cannot have negative offset: ")).append(i).toString());
        }
        if (j < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Cannot have length offset: ")).append(j).toString());
        }
        if (i + j > abyte0.length)
        {
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(abyte0.length)
            }));
        }
        if ((k & 2) == 0) goto _L2; else goto _L1
_L1:
        Object obj = new ByteArrayOutputStream();
        Object obj1;
        Object obj2;
        int l;
        int i1;
        boolean flag;
        int j1;
        int k1;
        int l1;
        try
        {
            obj2 = new d(((OutputStream) (obj)), k | 1);
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
        ((GZIPOutputStream) (obj1)).write(abyte0, i, j);
        ((GZIPOutputStream) (obj1)).close();
        try
        {
            ((GZIPOutputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[]) { }
        try
        {
            ((d) (obj2)).close();
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
            ((d) (obj1)).close();
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
        if ((k & 8) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i1 = j / 3;
        if (j % 3 > 0)
        {
            l = 4;
        } else
        {
            l = 0;
        }
        i1 = l + i1 * 4;
        l = i1;
        if (flag)
        {
            l = i1 + i1 / 76;
        }
        obj = new byte[l];
        i1 = 0;
        l = 0;
        for (j1 = 0; j1 < j - 2; j1 += 3)
        {
            a(abyte0, j1 + i, 3, ((byte []) (obj)), l, k);
            l1 = i1 + 4;
            i1 = l1;
            k1 = l;
            if (flag)
            {
                i1 = l1;
                k1 = l;
                if (l1 >= 76)
                {
                    obj[l + 4] = 10;
                    k1 = l + 1;
                    i1 = 0;
                }
            }
            l = k1 + 4;
        }

        i1 = l;
        if (j1 < j)
        {
            a(abyte0, j1 + i, j - j1, ((byte []) (obj)), l, k);
            i1 = l + 4;
        }
        abyte0 = ((byte []) (obj));
        if (i1 <= obj.length - 1)
        {
            abyte0 = new byte[i1];
            System.arraycopy(obj, 0, abyte0, 0, i1);
            return abyte0;
        } else
        {
            break MISSING_BLOCK_LABEL_201;
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
        Object obj4 = obj1;
        abyte0 = ((byte []) (obj));
        obj1 = ioexception;
        obj = obj2;
        obj2 = obj4;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static void encodeFileToFile(String s, String s1)
    {
        String s2 = encodeFromFile(s);
        s1 = new BufferedOutputStream(new FileOutputStream(s1));
        s = s1;
        s1.write(s2.getBytes("US-ASCII"));
        Object obj;
        try
        {
            s1.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        obj;
        s = null;
_L4:
        throw obj;
        obj;
        s1 = s;
        s = ((String) (obj));
_L2:
        try
        {
            s1.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        throw s;
        s;
        s1 = null;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        s = s1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String encodeFromFile(String s)
    {
        Object obj1;
        int i;
        i = 0;
        obj1 = null;
        Object obj;
        byte abyte0[];
        s = new File(s);
        abyte0 = new byte[Math.max((int)((double)s.length() * 1.3999999999999999D + 1.0D), 40)];
        obj = new c(new BufferedInputStream(new FileInputStream(s)), 1);
_L2:
        s = ((String) (obj));
        int j = ((c) (obj)).read(abyte0, i, 4096);
        if (j < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i += j;
        if (true) goto _L2; else goto _L1
_L1:
        s = ((String) (obj));
        obj1 = new String(abyte0, 0, i, "US-ASCII");
        try
        {
            ((c) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return ((String) (obj1));
        }
        return ((String) (obj1));
        obj1;
        s = null;
_L6:
        throw obj1;
        obj1;
        obj = s;
        s = ((String) (obj1));
_L4:
        try
        {
            ((c) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw s;
        s;
        obj = obj1;
        if (true) goto _L4; else goto _L3
_L3:
        obj1;
        s = ((String) (obj));
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static String encodeObject(Serializable serializable)
    {
        return encodeObject(serializable, 0);
    }

    public static String encodeObject(Serializable serializable, int i)
    {
        Object obj;
        Object obj1;
        Object obj4;
        ObjectOutputStream objectoutputstream;
        obj4 = null;
        obj1 = null;
        objectoutputstream = null;
        obj = null;
        if (serializable == null)
        {
            throw new NullPointerException("Cannot serialize a null object.");
        }
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        Object obj3;
        d d1;
        GZIPOutputStream gzipoutputstream;
        try
        {
            d1 = new d(bytearrayoutputstream, i | 1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj3)
        {
            serializable = null;
            obj4 = null;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj4 = null;
            obj3 = null;
            obj = obj1;
            obj1 = obj4;
            continue; /* Loop/switch isn't completed */
        }
        if ((i & 2) == 0) goto _L2; else goto _L1
_L1:
        Object obj2;
        d d2;
        ByteArrayOutputStream bytearrayoutputstream1;
        try
        {
            obj2 = new GZIPOutputStream(d1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj3)
        {
            serializable = null;
            obj4 = d1;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj3 = null;
            obj = obj1;
            obj1 = obj3;
            obj3 = d1;
        }
        obj = obj4;
        obj1 = obj2;
        d2 = d1;
        bytearrayoutputstream1 = bytearrayoutputstream;
        gzipoutputstream = ((GZIPOutputStream) (obj2));
        obj4 = new ObjectOutputStream(((OutputStream) (obj2)));
_L4:
        obj = obj4;
        obj1 = obj2;
        d2 = d1;
        bytearrayoutputstream1 = bytearrayoutputstream;
        objectoutputstream = ((ObjectOutputStream) (obj4));
        gzipoutputstream = ((GZIPOutputStream) (obj2));
        ((ObjectOutputStream) (obj4)).writeObject(serializable);
        try
        {
            ((ObjectOutputStream) (obj4)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Serializable serializable) { }
        try
        {
            ((GZIPOutputStream) (obj2)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Serializable serializable) { }
        try
        {
            d1.close();
        }
        // Misplaced declaration of an exception variable
        catch (Serializable serializable) { }
        try
        {
            bytearrayoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Serializable serializable) { }
        try
        {
            serializable = new String(bytearrayoutputstream.toByteArray(), "US-ASCII");
        }
        // Misplaced declaration of an exception variable
        catch (Serializable serializable)
        {
            return new String(bytearrayoutputstream.toByteArray());
        }
        return serializable;
_L2:
        obj4 = new ObjectOutputStream(d1);
        obj2 = null;
        if (true) goto _L4; else goto _L3
_L3:
        obj3;
        serializable = null;
        obj4 = null;
        bytearrayoutputstream = null;
_L8:
        obj1 = serializable;
        d2 = ((d) (obj4));
        bytearrayoutputstream1 = bytearrayoutputstream;
        throw obj3;
        serializable;
        bytearrayoutputstream = bytearrayoutputstream1;
        obj3 = d2;
_L6:
        try
        {
            ((ObjectOutputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            ((GZIPOutputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            ((OutputStream) (obj3)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            bytearrayoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw serializable;
        serializable;
        obj4 = null;
        obj3 = null;
        bytearrayoutputstream = null;
        obj = obj1;
        obj1 = obj4;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L6; else goto _L5
_L5:
        break MISSING_BLOCK_LABEL_48;
        obj3;
        obj = objectoutputstream;
        serializable = gzipoutputstream;
        obj4 = d1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static void encodeToFile(byte abyte0[], String s)
    {
        Object obj;
        if (abyte0 == null)
        {
            throw new NullPointerException("Data to encode was null.");
        }
        obj = null;
        d d1 = new d(new FileOutputStream(s), 1);
        s = d1;
        d1.write(abyte0);
        try
        {
            d1.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return;
        }
        abyte0;
        s = null;
_L4:
        throw abyte0;
        abyte0;
_L2:
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        throw abyte0;
        abyte0;
        s = obj;
        if (true) goto _L2; else goto _L1
_L1:
        abyte0;
        s = d1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        boolean flag;
        if (!org/c/d/a/a.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
