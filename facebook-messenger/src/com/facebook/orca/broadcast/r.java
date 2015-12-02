// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.broadcast;

import com.facebook.config.a.d;
import com.facebook.f.n;
import com.facebook.prefs.shared.ae;
import javax.inject.a;

public class r
    implements a
{

    private static final ae a = n.a("messenger_broadcast_android");
    private final com.facebook.prefs.shared.d b;
    private final d c;

    public r(com.facebook.prefs.shared.d d1, d d2)
    {
        b = d1;
        c = d2;
    }

    public Boolean a()
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            if (c != d.MESSENGER)
            {
                flag = flag1;
                if (c != d.FB4A)
                {
                    break label0;
                }
            }
            flag = flag1;
            if (b.a(a, false))
            {
                flag = true;
            }
        }
        return Boolean.valueOf(flag);
    }

    public Object b()
    {
        return a();
    }

}
