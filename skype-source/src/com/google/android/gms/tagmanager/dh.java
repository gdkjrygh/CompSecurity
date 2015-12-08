// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.e;
import com.google.android.gms.internal.f;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            o, cl, c

final class dh extends o
{

    private static final String a;
    private static final String b;
    private static final String c;
    private final c d;

    public dh(c c1)
    {
        super(a, new String[] {
            b
        });
        d = c1;
    }

    public final com.google.android.gms.internal.h.a a(Map map)
    {
        Object obj = d.b(cl.a((com.google.android.gms.internal.h.a)map.get(b)));
        if (obj == null)
        {
            map = (com.google.android.gms.internal.h.a)map.get(c);
            if (map != null)
            {
                return map;
            } else
            {
                return com.google.android.gms.tagmanager.cl.f();
            }
        } else
        {
            return cl.a(obj);
        }
    }

    public final boolean a()
    {
        return false;
    }

    static 
    {
        a = e.i.toString();
        b = f.bH.toString();
        c = f.as.toString();
    }
}
