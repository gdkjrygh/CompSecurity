// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.a;

import com.facebook.config.a.b;
import com.facebook.config.a.d;
import com.facebook.f.n;
import com.facebook.prefs.shared.ae;
import javax.inject.a;

public class i
    implements a
{

    private static final ae a = n.a("messenger_invite_by_phone_android");
    private final com.facebook.prefs.shared.d b;
    private final com.facebook.config.a.a c;

    public i(com.facebook.prefs.shared.d d1, com.facebook.config.a.a a1)
    {
        b = d1;
        c = a1;
    }

    public Boolean a()
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            flag = flag1;
            if (c.i() != d.MESSENGER)
            {
                break label0;
            }
            if (c.h() != b.DEVELOPMENT)
            {
                flag = flag1;
                if (!b.a(a, false))
                {
                    break label0;
                }
            }
            flag = true;
        }
        return Boolean.valueOf(flag);
    }

    public Object b()
    {
        return a();
    }

}
