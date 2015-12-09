// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.a;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            aj, a, dh

class b extends aj
{

    private static final String ID;
    private final com.google.android.gms.tagmanager.a Wz;

    public b(Context context)
    {
        this(a.E(context));
    }

    b(com.google.android.gms.tagmanager.a a1)
    {
        super(ID, new String[0]);
        Wz = a1;
    }

    public boolean jX()
    {
        return false;
    }

    public com.google.android.gms.internal.d.a x(Map map)
    {
        map = Wz.jT();
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
        ID = a.u.toString();
    }
}
