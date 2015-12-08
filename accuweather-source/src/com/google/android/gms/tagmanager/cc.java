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

    private static final String afv;
    private static final String ags;

    public cc(String s)
    {
        super(s, new String[] {
            afv, ags
        });
    }

    protected abstract boolean a(com.google.android.gms.internal.d.a a1, com.google.android.gms.internal.d.a a2, Map map);

    public boolean lc()
    {
        return true;
    }

    public com.google.android.gms.internal.d.a w(Map map)
    {
        for (Iterator iterator = map.values().iterator(); iterator.hasNext();)
        {
            if ((com.google.android.gms.internal.d.a)iterator.next() == dh.mY())
            {
                return dh.r(Boolean.valueOf(false));
            }
        }

        com.google.android.gms.internal.d.a a1 = (com.google.android.gms.internal.d.a)map.get(afv);
        com.google.android.gms.internal.d.a a2 = (com.google.android.gms.internal.d.a)map.get(ags);
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
        afv = b.bi.toString();
        ags = b.bj.toString();
    }
}
