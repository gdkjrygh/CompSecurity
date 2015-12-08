// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c.a;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPInputStream;

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

    public static byte[] a(String s)
    {
        return b(s);
    }

    public static byte[] a(byte abyte0[])
    {
        boolean flag = false;
        int k = abyte0.length;
        int i;
        if (abyte0 == null)
        {
            try
            {
                throw new NullPointerException("Cannot serialize a null array.");
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[]) { }
            byte abyte1[];
            int j;
            if (!a)
            {
                throw new AssertionError((new StringBuilder("IOExceptions only come from GZipping, which is turned off: ")).append(abyte0.getMessage()).toString());
            } else
            {
                return null;
            }
        }
        if (k >= 0)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        throw new IllegalArgumentException((new StringBuilder("Cannot have length offset: ")).append(k).toString());
        if (k + 0 > abyte0.length)
        {
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", new Object[] {
                Integer.valueOf(0), Integer.valueOf(k), Integer.valueOf(abyte0.length)
            }));
        }
        j = k / 3;
        if (k % 3 > 0)
        {
            i = 4;
        } else
        {
            i = 0;
        }
        abyte1 = new byte[i + j * 4];
        j = 0;
        i = ((flag) ? 1 : 0);
_L2:
        if (j >= k - 2)
        {
            break; /* Loop/switch isn't completed */
        }
        a(abyte0, j + 0, 3, abyte1, i);
        j += 3;
        i += 4;
        if (true) goto _L2; else goto _L1
_L1:
        if (j >= k)
        {
            break MISSING_BLOCK_LABEL_215;
        }
        a(abyte0, j + 0, k - j, abyte1, i);
        i += 4;
        if (i > abyte1.length - 1)
        {
            break MISSING_BLOCK_LABEL_237;
        }
        abyte0 = new byte[i];
        System.arraycopy(abyte1, 0, abyte0, 0, i);
        return abyte0;
        return abyte1;
    }

    private static byte[] a(byte abyte0[], int i)
    {
        byte abyte1[];
        byte abyte2[];
        byte abyte3[];
        int j;
        int k;
        int l;
        if (abyte0 == null)
        {
            throw new NullPointerException("Cannot decode null source array.");
        }
        if (i + 0 > abyte0.length)
        {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and process %d bytes.", new Object[] {
                Integer.valueOf(abyte0.length), Integer.valueOf(0), Integer.valueOf(i)
            }));
        }
        if (i == 0)
        {
            return new byte[0];
        }
        if (i < 4)
        {
            throw new IllegalArgumentException((new StringBuilder("Base64-encoded string must have at least four characters, but length specified was ")).append(i).toString());
        }
        abyte2 = c;
        abyte1 = new byte[(i * 3) / 4];
        abyte3 = new byte[4];
        l = 0;
        k = 0;
        j = 0;
_L9:
        int i1;
        if (l >= i + 0)
        {
            break MISSING_BLOCK_LABEL_606;
        }
        i1 = abyte2[abyte0[l] & 0xff];
        if (i1 < -5) goto _L2; else goto _L1
_L1:
        if (i1 < -1) goto _L4; else goto _L3
_L3:
        i1 = k + 1;
        abyte3[k] = abyte0[l];
        if (i1 <= 3) goto _L6; else goto _L5
_L5:
        if (j < 0 || j + 2 >= abyte1.length)
        {
            throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", new Object[] {
                Integer.valueOf(abyte1.length), Integer.valueOf(j)
            }));
        }
        byte abyte4[] = c;
        if (abyte3[2] == 61)
        {
            k = abyte4[abyte3[0]];
            abyte1[j] = (byte)(((abyte4[abyte3[1]] & 0xff) << 12 | (k & 0xff) << 18) >>> 16);
            k = 1;
        } else
        if (abyte3[3] == 61)
        {
            k = abyte4[abyte3[0]];
            i1 = abyte4[abyte3[1]];
            k = (abyte4[abyte3[2]] & 0xff) << 6 | ((k & 0xff) << 18 | (i1 & 0xff) << 12);
            abyte1[j] = (byte)(k >>> 16);
            abyte1[j + 1] = (byte)(k >>> 8);
            k = 2;
        } else
        {
            k = abyte4[abyte3[0]];
            i1 = abyte4[abyte3[1]];
            byte byte0 = abyte4[abyte3[2]];
            k = abyte4[abyte3[3]] & 0xff | ((k & 0xff) << 18 | (i1 & 0xff) << 12 | (byte0 & 0xff) << 6);
            abyte1[j] = (byte)(k >> 16);
            abyte1[j + 1] = (byte)(k >> 8);
            abyte1[j + 2] = (byte)k;
            k = 3;
        }
        k += j;
        if (abyte0[l] != 61) goto _L8; else goto _L7
_L7:
        abyte0 = new byte[k];
        System.arraycopy(abyte1, 0, abyte0, 0, k);
        return abyte0;
_L2:
        throw new IOException(String.format("Bad Base64 input character decimal %d in array position %d", new Object[] {
            Integer.valueOf(abyte0[l] & 0xff), Integer.valueOf(l)
        }));
_L8:
        j = 0;
_L10:
        i1 = l + 1;
        l = k;
        k = j;
        j = l;
        l = i1;
          goto _L9
_L6:
        k = j;
        j = i1;
          goto _L10
_L4:
        int j1 = j;
        j = k;
        k = j1;
          goto _L10
        k = j;
          goto _L7
    }

    private static byte[] a(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        int j1 = 0;
        byte abyte2[] = b;
        int l;
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

    private static byte[] b(String s)
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
        byte abyte1[] = a(s, s.length);
        if (abyte1.length < 4 || 35615 != (abyte1[0] & 0xff | abyte1[1] << 8 & 0xff00)) goto _L2; else goto _L1
_L1:
        byte abyte2[] = new byte[2048];
        Object obj2 = new ByteArrayOutputStream();
        Object obj = new ByteArrayInputStream(abyte1);
        s = new GZIPInputStream(((java.io.InputStream) (obj)));
_L5:
        int i = s.read(abyte2);
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

    static 
    {
        boolean flag;
        if (!c/a/a.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
