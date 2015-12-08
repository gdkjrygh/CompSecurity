// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.a;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            aj, di

class p extends aj
{

    private static final String ID;
    private final String TU;

    public p(String s)
    {
        super(ID, new String[0]);
        TU = s;
    }

    public com.google.android.gms.internal.d.a B(Map map)
    {
        if (TU == null)
        {
            return di.rb();
        } else
        {
            return di.u(TU);
        }
    }

    public boolean pe()
    {
        return true;
    }

    static 
    {
        ID = a.D.toString();
    }
}
