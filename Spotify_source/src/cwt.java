// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class cwt
{

    private static final byte a[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 43, 47
    };
    private static boolean b;

    private cwt()
    {
    }

    public static String a(byte abyte0[])
    {
        Object obj = null;
        try
        {
            abyte0 = a(abyte0, abyte0.length);
        }
        catch (IOException ioexception)
        {
            abyte0 = obj;
            if (!b)
            {
                throw new AssertionError(ioexception.getMessage());
            }
        }
        if (!b && abyte0 == null)
        {
            throw new AssertionError();
        } else
        {
            return abyte0;
        }
    }

    private static String a(byte abyte0[], int i)
    {
        if (abyte0 == null)
        {
            throw new NullPointerException("Cannot serialize a null array.");
        }
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Cannot have length offset: ")).append(i).toString());
        }
        if (i > abyte0.length)
        {
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", new Object[] {
                Integer.valueOf(0), Integer.valueOf(i), Integer.valueOf(abyte0.length)
            }));
        }
        int k = i / 3;
        Object obj;
        int j;
        if (i % 3 > 0)
        {
            j = 4;
        } else
        {
            j = 0;
        }
        obj = new byte[j + (k << 2)];
        j = 0;
        for (k = 0; k < i - 2;)
        {
            a(abyte0, k, 3, ((byte []) (obj)), j);
            k += 3;
            j += 4;
        }

        int l = j;
        if (k < i)
        {
            a(abyte0, k, i - k, ((byte []) (obj)), j);
            l = j + 4;
        }
        if (l <= obj.length - 1)
        {
            abyte0 = new byte[l];
            System.arraycopy(obj, 0, abyte0, 0, l);
        } else
        {
            abyte0 = ((byte []) (obj));
        }
        try
        {
            obj = new String(abyte0, "US-ASCII");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            return new String(abyte0);
        }
        return ((String) (obj));
    }

    private static byte[] a(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        int j1 = 0;
        byte abyte2[] = a;
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

    static 
    {
        boolean flag;
        if (!cwt.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }
}
