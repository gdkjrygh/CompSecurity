// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj.chunks;

import ar.com.hjg.pngj.r;
import ar.com.hjg.pngj.v;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.InflaterInputStream;

// Referenced classes of package ar.com.hjg.pngj.chunks:
//            g, h, c

public final class a
{

    public static final byte a[] = a("IHDR");
    public static final byte b[] = a("PLTE");
    public static final byte c[] = a("IDAT");
    public static final byte d[] = a("IEND");
    private static byte e[] = new byte[4096];

    public static String a(byte abyte0[])
    {
        try
        {
            abyte0 = new String(abyte0, r.b);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new g(abyte0);
        }
        return abyte0;
    }

    public static String a(byte abyte0[], int i, int j)
    {
        try
        {
            abyte0 = new String(abyte0, i, j, r.b);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new g(abyte0);
        }
        return abyte0;
    }

    public static List a(List list, c c1)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            h h1 = (h)list.next();
            if (c1.a(h1))
            {
                arraylist.add(h1);
            }
        } while (true);
        return arraylist;
    }

    private static void a(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        byte abyte0[] = e;
        abyte0;
        JVM INSTR monitorenter ;
_L1:
        int i = inputstream.read(e);
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        outputstream.write(e, 0, i);
          goto _L1
        inputstream;
        abyte0;
        JVM INSTR monitorexit ;
        throw inputstream;
        abyte0;
        JVM INSTR monitorexit ;
    }

    public static byte[] a(String s)
    {
        try
        {
            s = s.getBytes(r.b);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new g(s);
        }
        return s;
    }

    public static String b(byte abyte0[])
    {
        try
        {
            abyte0 = new String(abyte0, r.d);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new g(abyte0);
        }
        return abyte0;
    }

    public static String b(byte abyte0[], int i, int j)
    {
        try
        {
            abyte0 = new String(abyte0, i, j, r.d);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new g(abyte0);
        }
        return abyte0;
    }

    public static boolean b(String s)
    {
        return Character.isUpperCase(s.charAt(0));
    }

    public static int c(byte abyte0[])
    {
        for (int i = 0; i < abyte0.length; i++)
        {
            if (abyte0[i] == 0)
            {
                return i;
            }
        }

        return -1;
    }

    public static boolean c(String s)
    {
        return Character.isUpperCase(s.charAt(1));
    }

    public static byte[] c(byte abyte0[], int i, int j)
    {
        try
        {
            abyte0 = new InflaterInputStream(new ByteArrayInputStream(abyte0, i, j));
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            a(abyte0, bytearrayoutputstream);
            abyte0.close();
            bytearrayoutputstream.close();
            abyte0 = bytearrayoutputstream.toByteArray();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new v(abyte0);
        }
        return abyte0;
    }

    public static boolean d(String s)
    {
        return !Character.isUpperCase(s.charAt(3));
    }

}
