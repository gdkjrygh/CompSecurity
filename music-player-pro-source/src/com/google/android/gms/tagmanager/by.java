// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cd, di, dh

abstract class by extends cd
{

    public by(String s)
    {
        super(s);
    }

    protected boolean a(com.google.android.gms.internal.d.a a1, com.google.android.gms.internal.d.a a2, Map map)
    {
        a1 = di.k(a1);
        a2 = di.k(a2);
        if (a1 == di.qZ() || a2 == di.qZ())
        {
            return false;
        } else
        {
            return a(((dh) (a1)), ((dh) (a2)), map);
        }
    }

    protected abstract boolean a(dh dh, dh dh1, Map map);
}
