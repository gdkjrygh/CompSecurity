// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cc, dh

abstract class dc extends cc
{

    public dc(String s)
    {
        super(s);
    }

    protected boolean a(com.google.android.gms.internal.d.a a1, com.google.android.gms.internal.d.a a2, Map map)
    {
        a1 = dh.j(a1);
        a2 = dh.j(a2);
        if (a1 == dh.nc() || a2 == dh.nc())
        {
            return false;
        } else
        {
            return a(((String) (a1)), ((String) (a2)), map);
        }
    }

    protected abstract boolean a(String s, String s1, Map map);
}
