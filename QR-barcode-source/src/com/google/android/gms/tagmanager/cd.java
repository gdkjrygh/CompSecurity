// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            aj, di

abstract class cd extends aj
{

    private static final String apf;
    private static final String aqb;

    public cd(String s)
    {
        super(s, new String[] {
            apf, aqb
        });
    }

    public com.google.android.gms.internal.d.a C(Map map)
    {
        for (Iterator iterator = map.values().iterator(); iterator.hasNext();)
        {
            if ((com.google.android.gms.internal.d.a)iterator.next() == di.pK())
            {
                return di.u(Boolean.valueOf(false));
            }
        }

        com.google.android.gms.internal.d.a a1 = (com.google.android.gms.internal.d.a)map.get(apf);
        com.google.android.gms.internal.d.a a2 = (com.google.android.gms.internal.d.a)map.get(aqb);
        boolean flag;
        if (a1 == null || a2 == null)
        {
            flag = false;
        } else
        {
            flag = a(a1, a2, map);
        }
        return di.u(Boolean.valueOf(flag));
    }

    protected abstract boolean a(com.google.android.gms.internal.d.a a1, com.google.android.gms.internal.d.a a2, Map map);

    public boolean nN()
    {
        return true;
    }

    static 
    {
        apf = b.bw.toString();
        aqb = b.bx.toString();
    }
}
