// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.logging.Logger;

// Referenced classes of package ar.com.hjg.pngj:
//            x

public final class r
{

    public static final Logger a = Logger.getLogger("ar.com.pngj");
    public static String b = "ISO-8859-1";
    public static Charset c = Charset.forName("ISO-8859-1");
    public static String d = "UTF-8";
    public static Charset e = Charset.forName("UTF-8");
    private static ThreadLocal f = new ThreadLocal() {

        protected final volatile Object initialValue()
        {
            return Boolean.FALSE;
        }

    };

    public static double a(int i)
    {
        return (double)i / 100000D;
    }

    static final int a(int i, int j, int k)
    {
        int j1 = (i + j) - k;
        int l;
        int i1;
        if (j1 >= i)
        {
            l = j1 - i;
        } else
        {
            l = i - j1;
        }
        if (j1 >= j)
        {
            i1 = j1 - j;
        } else
        {
            i1 = j - j1;
        }
        if (j1 >= k)
        {
            j1 -= k;
        } else
        {
            j1 = k - j1;
        }
        if (l <= i1 && l <= j1)
        {
            return i;
        }
        if (i1 <= j1)
        {
            return j;
        } else
        {
            return k;
        }
    }

    public static int a(InputStream inputstream)
    {
        int i;
        try
        {
            i = inputstream.read();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new x("error reading byte", inputstream);
        }
        return i;
    }

    public static int a(byte abyte0[], int i)
    {
        return abyte0[i] & 0xff;
    }

    public static byte[] a()
    {
        return (new byte[] {
            -119, 80, 78, 71, 13, 10, 26, 10
        });
    }

    public static int b(InputStream inputstream)
    {
        int i;
        int j;
        int k;
        int l;
        try
        {
            i = inputstream.read();
            j = inputstream.read();
            k = inputstream.read();
            l = inputstream.read();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new x("error reading Int4", inputstream);
        }
        if (i == -1 || j == -1 || k == -1 || l == -1)
        {
            return -1;
        } else
        {
            return i << 24 | j << 16 | (k << 8) + l;
        }
    }

    public static int b(byte abyte0[], int i)
    {
        return (abyte0[i] & 0xff) << 8 | abyte0[i + 1] & 0xff;
    }

    public static final int c(byte abyte0[], int i)
    {
        return (abyte0[i] & 0xff) << 24 | (abyte0[i + 1] & 0xff) << 16 | (abyte0[i + 2] & 0xff) << 8 | abyte0[i + 3] & 0xff;
    }

}
