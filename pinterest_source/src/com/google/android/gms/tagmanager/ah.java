// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.a;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            aj, ct, di

class ah extends aj
{

    private static final String ID;
    private final ct aqo;

    public ah(ct ct1)
    {
        super(ID, new String[0]);
        aqo = ct1;
    }

    public com.google.android.gms.internal.d.a B(Map map)
    {
        map = aqo.qE();
        if (map == null)
        {
            return di.rb();
        } else
        {
            return di.u(map);
        }
    }

    public boolean pe()
    {
        return false;
    }

    static 
    {
        ID = a.K.toString();
    }
}
