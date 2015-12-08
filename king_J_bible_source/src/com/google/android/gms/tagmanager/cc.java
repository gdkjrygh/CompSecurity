// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            aj, dh

abstract class cc extends aj
{

    private static final String XQ;
    private static final String YN;

    public cc(String s)
    {
        super(s, new String[] {
            XQ, YN
        });
    }

    protected abstract boolean a(com.google.android.gms.internal.d.a a1, com.google.android.gms.internal.d.a a2, Map map);

    public boolean jX()
    {
        return true;
    }

    public com.google.android.gms.internal.d.a x(Map map)
    {
        for (Iterator iterator = map.values().iterator(); iterator.hasNext();)
        {
            if ((com.google.android.gms.internal.d.a)iterator.next() == dh.lT())
            {
                return dh.r(Boolean.valueOf(false));
            }
        }

        com.google.android.gms.internal.d.a a1 = (com.google.android.gms.internal.d.a)map.get(XQ);
        com.google.android.gms.internal.d.a a2 = (com.google.android.gms.internal.d.a)map.get(YN);
        boolean flag;
        if (a1 == null || a2 == null)
        {
            flag = false;
        } else
        {
            flag = a(a1, a2, map);
        }
        return dh.r(Boolean.valueOf(flag));
    }

    static 
    {
        XQ = b.bi.toString();
        YN = b.bj.toString();
    }
}
