// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.a;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            aj, dh

class p extends aj
{

    private static final String ID;
    private final String aeU;

    public p(String s)
    {
        super(ID, new String[0]);
        aeU = s;
    }

    public boolean lh()
    {
        return true;
    }

    public com.google.android.gms.internal.d.a w(Map map)
    {
        if (aeU == null)
        {
            return dh.nd();
        } else
        {
            return dh.r(aeU);
        }
    }

    static 
    {
        ID = a.D.toString();
    }
}
