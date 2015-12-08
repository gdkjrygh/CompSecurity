// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.f;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            o, cl

public abstract class bf extends o
{

    private static final String a;
    private static final String b;

    public bf(String s)
    {
        super(s, new String[] {
            a, b
        });
    }

    public final com.google.android.gms.internal.h.a a(Map map)
    {
        for (Iterator iterator = map.values().iterator(); iterator.hasNext();)
        {
            if ((com.google.android.gms.internal.h.a)iterator.next() == com.google.android.gms.tagmanager.cl.f())
            {
                return cl.a(Boolean.valueOf(false));
            }
        }

        com.google.android.gms.internal.h.a a1 = (com.google.android.gms.internal.h.a)map.get(a);
        com.google.android.gms.internal.h.a a2 = (com.google.android.gms.internal.h.a)map.get(b);
        boolean flag;
        if (a1 == null || a2 == null)
        {
            flag = false;
        } else
        {
            flag = a(a1, a2, map);
        }
        return cl.a(Boolean.valueOf(flag));
    }

    public final boolean a()
    {
        return true;
    }

    protected abstract boolean a(com.google.android.gms.internal.h.a a1, com.google.android.gms.internal.h.a a2, Map map);

    public final volatile String b()
    {
        return super.b();
    }

    public final volatile Set c()
    {
        return super.c();
    }

    static 
    {
        a = f.p.toString();
        b = f.q.toString();
    }
}
