// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.a;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            aj, a, di

class b extends aj
{

    private static final String ID;
    private final com.google.android.gms.tagmanager.a aqc;

    public b(Context context)
    {
        this(a.W(context));
    }

    b(com.google.android.gms.tagmanager.a a1)
    {
        super(ID, new String[0]);
        aqc = a1;
    }

    public com.google.android.gms.internal.d.a B(Map map)
    {
        map = aqc.pa();
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
        ID = a.u.toString();
    }
}
