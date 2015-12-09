// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.a.f;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPOutputStream;

// Referenced classes of package com.android.slyce.report.a.f:
//            b

public class a
{

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

    static int a(byte abyte0[], int i, byte abyte1[], int j, int k)
    {
        return b(abyte0, i, abyte1, j, k);
    }

    public static String a(byte abyte0[])
    {
        Object obj = null;
        try
        {
            abyte0 = a(abyte0, 0, abyte0.length, 0);
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

    public static String a(byte abyte0[], int i, int j, int k)
    {
        abyte0 = b(abyte0, i, j, k);
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

    static byte[] a(int i)
    {
        return c(i);
    }

    private static byte[] a(byte abyte0[], int i, int j, byte abyte1[], int k, int l)
    {
        int j1 = 0;
        byte abyte2[] = b(l);
        int i1;
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
        return b(abyte0, abyte1, i, j);
    }

    private static int b(byte abyte0[], int i, byte abyte1[], int j, int k)
    {
        if (abyte0 == null)
        {
            throw new NullPointerException("Source array was null.");
        }
        if (abyte1 == null)
        {
            throw new NullPointerException("Destination array was null.");
        }
        if (i < 0 || i + 3 >= abyte0.length)
        {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", new Object[] {
                Integer.valueOf(abyte0.length), Integer.valueOf(i)
            }));
        }
        if (j < 0 || j + 2 >= abyte1.length)
        {
            throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", new Object[] {
                Integer.valueOf(abyte1.length), Integer.valueOf(j)
            }));
        }
        byte abyte2[] = c(k);
        if (abyte0[i + 2] == 61)
        {
            abyte1[j] = (byte)(((abyte2[abyte0[i]] & 0xff) << 18 | (abyte2[abyte0[i + 1]] & 0xff) << 12) >>> 16);
            return 1;
        }
        if (abyte0[i + 3] == 61)
        {
            i = (abyte2[abyte0[i]] & 0xff) << 18 | (abyte2[abyte0[i + 1]] & 0xff) << 12 | (abyte2[abyte0[i + 2]] & 0xff) << 6;
            abyte1[j] = (byte)(i >>> 16);
            abyte1[j + 1] = (byte)(i >>> 8);
            return 2;
        } else
        {
            i = (abyte2[abyte0[i]] & 0xff) << 18 | (abyte2[abyte0[i + 1]] & 0xff) << 12 | (abyte2[abyte0[i + 2]] & 0xff) << 6 | abyte2[abyte0[i + 3]] & 0xff;
            abyte1[j] = (byte)(i >> 16);
            abyte1[j + 1] = (byte)(i >> 8);
            abyte1[j + 2] = (byte)i;
            return 3;
        }
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

    public static byte[] b(byte abyte0[], int i, int j, int k)
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
            throw new IllegalArgumentException((new StringBuilder()).append("Cannot have negative offset: ").append(i).toString());
        }
        if (j < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Cannot have length offset: ").append(j).toString());
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
            obj2 = new b(((java.io.OutputStream) (obj)), k | 1);
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
            obj1 = new GZIPOutputStream(((java.io.OutputStream) (obj2)));
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
            ((b) (obj2)).close();
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
            ((b) (obj1)).close();
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
            break MISSING_BLOCK_LABEL_203;
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

    private static byte[] b(byte abyte0[], byte abyte1[], int i, int j)
    {
        a(abyte1, 0, i, abyte0, 0, j);
        return abyte0;
    }

    private static final byte[] c(int i)
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

    static 
    {
        boolean flag;
        if (!com/android/slyce/report/a/f/a.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
