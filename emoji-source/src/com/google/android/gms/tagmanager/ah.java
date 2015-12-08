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
    private final cs aev;

    public ah(cs cs1)
    {
        super(ID, new String[0]);
        aev = cs1;
    }

    public boolean lh()
    {
        return false;
    }

    public com.google.android.gms.internal.d.a w(Map map)
    {
        map = aev.mH();
        if (map == null)
        {
            return dh.nd();
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
