// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ac;

import com.google.android.m4b.maps.ae.b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

// Referenced classes of package com.google.android.m4b.maps.ac:
//            a, b

public final class c
{

    private static boolean a = false;

    public static int a(a a1, int i)
    {
        return a(a1, i, 0);
    }

    public static int a(a a1, int i, int j)
    {
        int k = j;
        if (a1 != null)
        {
            k = j;
            try
            {
                if (a1.i(i))
                {
                    k = a1.d(i);
                }
            }
            // Misplaced declaration of an exception variable
            catch (a a1)
            {
                return j;
            }
            // Misplaced declaration of an exception variable
            catch (a a1)
            {
                return j;
            }
        }
        return k;
    }

    public static int a(com.google.android.m4b.maps.ac.b b1, InputStream inputstream, a a1)
    {
        boolean flag = true;
        long l = com.google.android.m4b.maps.ac.a.a(inputstream, true);
        if (l == -1L)
        {
            return -1;
        }
        if ((7L & l) != 2L)
        {
            throw new IOException("Message expected");
        }
        int i = (int)(l >>> 3);
        b1 = (com.google.android.m4b.maps.ac.b)b1.a(i);
        if (a1.d.b() != 0)
        {
            flag = false;
        }
        if (!flag || a1.c != null && b1 != null && b1 != a1.c)
        {
            throw new IllegalArgumentException();
        } else
        {
            a1.c = b1;
            a1.e = null;
            a1.a(inputstream, (int)com.google.android.m4b.maps.ac.a.a(inputstream, false));
            return i;
        }
    }

    public static long a(a a1, long l)
    {
        long l1 = l;
        if (a1 != null)
        {
            l1 = l;
            try
            {
                if (a1.i(3))
                {
                    l1 = a1.e(3);
                }
            }
            // Misplaced declaration of an exception variable
            catch (a a1)
            {
                return l;
            }
            // Misplaced declaration of an exception variable
            catch (a a1)
            {
                return l;
            }
        }
        return l1;
    }

    public static a a(a a1)
    {
        a a2 = new a(a1.c);
        a2.a(a1.c());
        return a2;
    }

    public static a a(com.google.android.m4b.maps.ac.b b1, DataInput datainput)
    {
        b1 = new a(b1);
        datainput = a(datainput);
        b1.a(datainput);
        if (datainput.read() != -1)
        {
            throw new IOException();
        } else
        {
            datainput.close();
            return b1;
        }
    }

    public static InputStream a(DataInput datainput)
    {
        int i = datainput.readInt();
        datainput = new com.google.android.m4b.maps.ap.b((InputStream)datainput, Math.abs(i));
        if (i < 0)
        {
            a = true;
            return new GZIPInputStream(datainput);
        } else
        {
            return datainput;
        }
    }

    public static void a(DataOutput dataoutput, a a1)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        a1.b(bytearrayoutputstream);
        a1 = bytearrayoutputstream.toByteArray();
        dataoutput.writeInt(a1.length);
        dataoutput.write(a1);
    }

    public static a b(a a1, int i)
    {
        a a2 = a1.a(i);
        a1.b(i, a2);
        return a2;
    }

    public static DataInput b(a a1)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        a(new DataOutputStream(bytearrayoutputstream), a1);
        return new DataInputStream(new ByteArrayInputStream(bytearrayoutputstream.toByteArray()));
    }

    public static a c(a a1, int i)
    {
        a a2 = a1.a(i);
        a1.a(i, a2);
        return a2;
    }

}
