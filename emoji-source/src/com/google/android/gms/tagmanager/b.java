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
    private final com.google.android.gms.tagmanager.a aej;

    public b(Context context)
    {
        this(a.M(context));
    }

    b(com.google.android.gms.tagmanager.a a1)
    {
        super(ID, new String[0]);
        aej = a1;
    }

    public boolean lh()
    {
        return false;
    }

    public com.google.android.gms.internal.d.a w(Map map)
    {
        map = aej.ld();
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
        ID = a.u.toString();
    }
}
