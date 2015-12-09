// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing;

import java.util.EnumMap;
import java.util.Map;

// Referenced classes of package com.google.zxing:
//            ResultMetadataType, l, BarcodeFormat

public final class k
{

    private final String a;
    private final byte b[];
    private l c[];
    private final BarcodeFormat d;
    private Map e;
    private final long f;

    public k(String s, byte abyte0[], l al[], BarcodeFormat barcodeformat)
    {
        this(s, abyte0, al, barcodeformat, System.currentTimeMillis());
    }

    public k(String s, byte abyte0[], l al[], BarcodeFormat barcodeformat, long l1)
    {
        a = s;
        b = abyte0;
        c = al;
        d = barcodeformat;
        e = null;
        f = l1;
    }

    public String a()
    {
        return a;
    }

    public void a(ResultMetadataType resultmetadatatype, Object obj)
    {
        if (e == null)
        {
            e = new EnumMap(com/google/zxing/ResultMetadataType);
        }
        e.put(resultmetadatatype, obj);
    }

    public void a(Map map)
    {
label0:
        {
            if (map != null)
            {
                if (e != null)
                {
                    break label0;
                }
                e = map;
            }
            return;
        }
        e.putAll(map);
    }

    public void a(l al[])
    {
        l al1[] = c;
        if (al1 == null)
        {
            c = al;
        } else
        if (al != null && al.length > 0)
        {
            l al2[] = new l[al1.length + al.length];
            System.arraycopy(al1, 0, al2, 0, al1.length);
            System.arraycopy(al, 0, al2, al1.length, al.length);
            c = al2;
            return;
        }
    }

    public byte[] b()
    {
        return b;
    }

    public l[] c()
    {
        return c;
    }

    public BarcodeFormat d()
    {
        return d;
    }

    public Map e()
    {
        return e;
    }

    public long f()
    {
        return f;
    }

    public String toString()
    {
        return a;
    }
}
