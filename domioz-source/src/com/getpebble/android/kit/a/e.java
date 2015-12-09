// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.getpebble.android.kit.a;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.getpebble.android.kit.a:
//            f, h, g

final class e
{

    static final Map a;
    static final Map b;
    private static final Charset h = Charset.forName("UTF-8");
    public final int c;
    public final f d;
    public final h e;
    public final int f;
    public final Object g;

    private e(int i, f f1, h h1, int j, Object obj)
    {
        c = i;
        d = f1;
        e = h1;
        f = j;
        g = obj;
    }

    static e a(int i, f f1, h h1, int j)
    {
        return new e(i, f1, h1, h1.e, Long.valueOf(j));
    }

    static e a(int i, f f1, h h1, Object obj)
    {
        int j = 0x7fffffff;
        if (h1 != h.a)
        {
            j = h1.e;
        } else
        if (f1 == f.a)
        {
            j = ((byte[])obj).length;
        } else
        if (f1 == f.b)
        {
            j = ((String)obj).getBytes(h).length;
        }
        if (j > 65535)
        {
            throw new g();
        } else
        {
            return new e(i, f1, h1, j, obj);
        }
    }

    static 
    {
        boolean flag = false;
        a = new HashMap();
        Object aobj[] = com.getpebble.android.kit.a.f.values();
        int k = aobj.length;
        for (int i = 0; i < k; i++)
        {
            f f1 = aobj[i];
            a.put(f1.name().toLowerCase(), f1);
        }

        b = new HashMap();
        aobj = com.getpebble.android.kit.a.h.values();
        k = aobj.length;
        for (int j = ((flag) ? 1 : 0); j < k; j++)
        {
            h h1 = aobj[j];
            b.put(Integer.valueOf(h1.e), h1);
        }

    }
}
