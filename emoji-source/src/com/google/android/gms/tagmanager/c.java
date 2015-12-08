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
    private final com.google.android.gms.tagmanager.a aej;

    public c(Context context)
    {
        this(a.M(context));
    }

    c(com.google.android.gms.tagmanager.a a1)
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
        boolean flag;
        if (!aej.isLimitAdTrackingEnabled())
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
