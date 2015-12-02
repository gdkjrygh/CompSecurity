// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.f;

import com.facebook.inject.d;
import com.facebook.prefs.shared.ae;

// Referenced classes of package com.facebook.f:
//            n

public class o extends d
{

    private final ae a;

    public o(String s)
    {
        a = n.a(s);
    }

    public Boolean a()
    {
        com.facebook.prefs.shared.d d1 = (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d);
        boolean flag;
        if (d1.a() && d1.a(a, false))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public Object b()
    {
        return a();
    }
}
