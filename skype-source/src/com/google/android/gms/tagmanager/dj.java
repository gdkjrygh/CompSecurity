// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.e;
import com.google.android.gms.internal.f;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cj, cl, c

final class dj extends cj
{

    private static final String a;
    private static final String b;
    private static final String c;
    private final c d;

    public dj(c c1)
    {
        super(a, new String[] {
            b
        });
        d = c1;
    }

    public final void b(Map map)
    {
        Object obj = (com.google.android.gms.internal.h.a)map.get(b);
        if (obj != null && obj != cl.a())
        {
            if ((obj = com.google.android.gms.tagmanager.cl.e(((com.google.android.gms.internal.h.a) (obj)))) instanceof List)
            {
                obj = ((List)obj).iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    Object obj1 = ((Iterator) (obj)).next();
                    if (obj1 instanceof Map)
                    {
                        obj1 = (Map)obj1;
                        d.a(((Map) (obj1)));
                    }
                }
            }
        }
        map = (com.google.android.gms.internal.h.a)map.get(c);
        if (map != null && map != cl.a())
        {
            if ((map = cl.a(map)) != com.google.android.gms.tagmanager.cl.e())
            {
                d.a(map);
                return;
            }
        }
    }

    static 
    {
        a = e.N.toString();
        b = f.dv.toString();
        c = f.M.toString();
    }
}
