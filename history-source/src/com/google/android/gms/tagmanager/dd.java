// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cd, di

abstract class dd extends cd
{

    public dd(String s)
    {
        super(s);
    }

    protected boolean a(com.google.android.gms.internal.d.a a1, com.google.android.gms.internal.d.a a2, Map map)
    {
        a1 = di.j(a1);
        a2 = di.j(a2);
        if (a1 == di.ra() || a2 == di.ra())
        {
            return false;
        } else
        {
            return a(((String) (a1)), ((String) (a2)), map);
        }
    }

    protected abstract boolean a(String s, String s1, Map map);
}
