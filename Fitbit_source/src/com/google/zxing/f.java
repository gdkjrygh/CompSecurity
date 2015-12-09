// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing;

import com.google.zxing.aztec.b;
import com.google.zxing.oned.o;
import com.google.zxing.qrcode.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

// Referenced classes of package com.google.zxing:
//            j, NotFoundException, ReaderException, DecodeHintType, 
//            BarcodeFormat, b, k

public final class f
    implements j
{

    private Map a;
    private j b[];

    public f()
    {
    }

    private k c(com.google.zxing.b b1)
        throws NotFoundException
    {
        if (b == null) goto _L2; else goto _L1
_L1:
        j aj[];
        int i;
        int k;
        aj = b;
        k = aj.length;
        i = 0;
_L3:
        Object obj;
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = aj[i];
        obj = ((j) (obj)).a(b1, a);
        return ((k) (obj));
        ReaderException readerexception;
        readerexception;
        i++;
        if (true) goto _L3; else goto _L2
_L2:
        throw com.google.zxing.NotFoundException.a();
    }

    public k a(com.google.zxing.b b1)
        throws NotFoundException
    {
        a(((Map) (null)));
        return c(b1);
    }

    public k a(com.google.zxing.b b1, Map map)
        throws NotFoundException
    {
        a(map);
        return c(b1);
    }

    public void a()
    {
        if (b != null)
        {
            j aj[] = b;
            int k = aj.length;
            for (int i = 0; i < k; i++)
            {
                aj[i].a();
            }

        }
    }

    public void a(Map map)
    {
        boolean flag1 = false;
        a = map;
        Collection collection;
        ArrayList arraylist;
        boolean flag;
        if (map != null && map.containsKey(DecodeHintType.d))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (map == null)
        {
            collection = null;
        } else
        {
            collection = (Collection)map.get(DecodeHintType.c);
        }
        arraylist = new ArrayList();
        if (collection != null)
        {
            if (collection.contains(com.google.zxing.BarcodeFormat.o) || collection.contains(BarcodeFormat.p) || collection.contains(BarcodeFormat.h) || collection.contains(BarcodeFormat.g) || collection.contains(com.google.zxing.BarcodeFormat.b) || collection.contains(BarcodeFormat.c) || collection.contains(BarcodeFormat.d) || collection.contains(BarcodeFormat.e) || collection.contains(BarcodeFormat.i) || collection.contains(BarcodeFormat.m) || collection.contains(BarcodeFormat.n))
            {
                flag1 = true;
            }
            if (flag1 && !flag)
            {
                arraylist.add(new o(map));
            }
            if (collection.contains(BarcodeFormat.l))
            {
                arraylist.add(new a());
            }
            if (collection.contains(BarcodeFormat.f))
            {
                arraylist.add(new com.google.zxing.datamatrix.a());
            }
            if (collection.contains(com.google.zxing.BarcodeFormat.a))
            {
                arraylist.add(new b());
            }
            if (collection.contains(BarcodeFormat.k))
            {
                arraylist.add(new com.google.zxing.pdf417.b());
            }
            if (collection.contains(BarcodeFormat.j))
            {
                arraylist.add(new com.google.zxing.b.a());
            }
            if (flag1 && flag)
            {
                arraylist.add(new o(map));
            }
        }
        if (arraylist.isEmpty())
        {
            if (!flag)
            {
                arraylist.add(new o(map));
            }
            arraylist.add(new a());
            arraylist.add(new com.google.zxing.datamatrix.a());
            arraylist.add(new b());
            arraylist.add(new com.google.zxing.pdf417.b());
            arraylist.add(new com.google.zxing.b.a());
            if (flag)
            {
                arraylist.add(new o(map));
            }
        }
        b = (j[])arraylist.toArray(new j[arraylist.size()]);
    }

    public k b(com.google.zxing.b b1)
        throws NotFoundException
    {
        if (b == null)
        {
            a(((Map) (null)));
        }
        return c(b1);
    }
}
