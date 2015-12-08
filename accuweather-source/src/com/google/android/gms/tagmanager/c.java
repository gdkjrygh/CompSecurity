// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.a;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            aj, a, dh

class c extends aj
{

    private static final String ID;
    private final com.google.android.gms.tagmanager.a aeg;

    public c(Context context)
    {
        this(a.J(context));
    }

    c(com.google.android.gms.tagmanager.a a1)
    {
        super(ID, new String[0]);
        aeg = a1;
    }

    public boolean lc()
    {
        return false;
    }

    public com.google.android.gms.internal.d.a w(Map map)
    {
        boolean flag;
        if (!aeg.isLimitAdTrackingEnabled())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return dh.r(Boolean.valueOf(flag));
    }

    static 
    {
        ID = a.v.toString();
    }
}
