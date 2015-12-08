// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.a;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            aj, cs, dh

class ah extends aj
{

    private static final String ID;
    private final cs WL;

    public ah(cs cs1)
    {
        super(ID, new String[0]);
        WL = cs1;
    }

    public boolean jX()
    {
        return false;
    }

    public com.google.android.gms.internal.d.a x(Map map)
    {
        map = WL.lx();
        if (map == null)
        {
            return dh.lT();
        } else
        {
            return dh.r(map);
        }
    }

    static 
    {
        ID = a.I.toString();
    }
}
