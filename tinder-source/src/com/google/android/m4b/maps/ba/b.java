// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ba;

import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ac.c;
import com.google.android.m4b.maps.bo.bp;
import com.google.android.m4b.maps.bo.bq;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bo.m;
import com.google.android.m4b.maps.cq.e;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

public final class b
{

    private static final int a = 31 - Integer.numberOfLeadingZeros(256);
    private static byte b[] = {
        76, 84, 73, 80, 10
    };
    private a c;
    private a d;
    private a e;
    private a f;

    public b()
    {
    }

    private static int a(int i, int j)
    {
        return i << 30 - j - a;
    }

    public final a a()
    {
        if (d == null && c != null && c.i(4))
        {
            d = c.f(4);
        }
        return d;
    }

    public final byte[] a(byte abyte0[])
    {
        Object obj;
        byte byte1;
        byte1 = 0;
        obj = b;
        if (abyte0.length >= obj.length + 0) goto _L2; else goto _L1
_L1:
        int i = byte1;
_L4:
        obj = abyte0;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_184;
        }
        obj = new byte[4];
        System.arraycopy(abyte0, 5, obj, 0, 4);
        i = obj[0];
        byte byte0 = obj[1];
        byte1 = obj[2];
        i = obj[3] & 0xff | ((i & 0xff) << 24 | (byte0 & 0xff) << 16 | (byte1 & 0xff) << 8);
        int j;
        j = Math.abs(i);
        obj = new ByteArrayInputStream(abyte0, 9, j);
        if (i >= 0)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        obj = new GZIPInputStream(((InputStream) (obj)));
        c = new a(e.a);
        c.a(((InputStream) (obj)));
        ((InputStream) (obj)).close();
        d = null;
        i = j + 9;
        obj = new byte[abyte0.length - i];
        System.arraycopy(abyte0, i, obj, 0, obj.length);
        return ((byte []) (obj));
_L2:
        for (int k = 0; k < obj.length; k++)
        {
            i = byte1;
            if (abyte0[k + 0] != obj[k])
            {
                continue; /* Loop/switch isn't completed */
            }
        }

        i = 1;
        if (true) goto _L4; else goto _L3
_L3:
        obj;
_L6:
        ((IOException) (obj)).printStackTrace();
        return abyte0;
        IOException ioexception;
        ioexception;
        abyte0 = ((byte []) (obj));
        obj = ioexception;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final String[] b()
    {
        a a1;
        int i;
        i = 0;
        a1 = a();
        if (a1 != null) goto _L2; else goto _L1
_L1:
        String as[] = new String[0];
_L4:
        return as;
_L2:
        int j = a1.j(1);
        String as1[] = new String[j];
        do
        {
            as = as1;
            if (i >= j)
            {
                continue;
            }
            as1[i] = a1.d(1, i);
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final String[] c()
    {
        a a1;
        int i;
        i = 0;
        a1 = a();
        if (a1 != null) goto _L2; else goto _L1
_L1:
        String as[] = new String[0];
_L4:
        return as;
_L2:
        int j = a1.j(2);
        String as1[] = new String[j];
        do
        {
            as = as1;
            if (i >= j)
            {
                continue;
            }
            as1[i] = a1.d(2, i);
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final List d()
    {
        if (e == null && c != null && c.i(5))
        {
            e = c.f(5);
        }
        a a1 = e;
        if (a1 == null)
        {
            return new ArrayList();
        }
        if (f == null && c != null && c.i(1))
        {
            f = c.f(1);
        }
        int j1 = com.google.android.m4b.maps.ac.c.a(f, 4);
        ArrayList arraylist = new ArrayList();
        int k = c.j(3);
        for (int i = 0; i < k; i++)
        {
            arraylist.add(c.c(3, i));
        }

        ArrayList arraylist1 = new ArrayList();
        int k1 = a1.j(1);
        int j = 0;
        while (j < k1) 
        {
            a a2 = a1.c(1, j);
            ArrayList arraylist2 = new ArrayList();
            java.util.HashMap hashmap = ax.b();
            Object obj2 = arraylist.iterator();
            while (((Iterator) (obj2)).hasNext()) 
            {
                Object obj = (a)((Iterator) (obj2)).next();
                String s = ((a) (obj)).c(2, 0).g(2);
                Object obj1;
                int i1;
                int i2;
                if (((a) (obj)).d(1) == 0)
                {
                    obj = ((a) (obj)).f(3);
                    obj1 = com.google.android.m4b.maps.bw.c.a(((a) (obj)).f(31));
                    int l = a(com.google.android.m4b.maps.ac.c.a(((a) (obj)), 32), j1);
                    int l1 = a(com.google.android.m4b.maps.ac.c.a(((a) (obj)), 33), j1);
                    obj = new g(l / 2, l1 / 2);
                    obj = m.a(((g) (obj1)).e(((g) (obj))), ((g) (obj1)).f(((g) (obj))));
                } else
                {
                    obj = null;
                    obj1 = null;
                }
                hashmap.put(s, new bq(s, ((g) (obj1)), ((m) (obj))));
            }
            if (a2 != null)
            {
                i2 = a2.j(1);
                for (i1 = 0; i1 < i2; i1++)
                {
                    obj2 = a2.c(1, i1).g(1);
                    obj1 = (bq)hashmap.get(obj2);
                    obj = obj1;
                    if (obj1 == null)
                    {
                        obj = new bq(((String) (obj2)), null, null);
                    }
                    arraylist2.add(obj);
                }

            }
            obj = null;
            if (a2 != null)
            {
                obj = a2.g(2);
                if (obj == null)
                {
                    obj = new byte[0];
                } else
                {
                    obj = ((String) (obj)).getBytes();
                }
            }
            arraylist1.add(new bp(arraylist2, ((byte []) (obj))));
            j++;
        }
        return arraylist1;
    }

}
