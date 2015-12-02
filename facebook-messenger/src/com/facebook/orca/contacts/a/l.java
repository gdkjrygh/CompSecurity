// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.a;

import com.facebook.config.a.b;
import com.facebook.f.n;
import com.facebook.orca.prefs.o;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import javax.inject.a;

public class l
    implements a
{

    private static final ae a = n.a("messenger_contacts_invite_all_android");
    private final d b;
    private final com.facebook.config.a.a c;
    private final com.facebook.common.time.a d;

    public l(d d1, com.facebook.config.a.a a1, com.facebook.common.time.a a2)
    {
        b = d1;
        c = a1;
        d = a2;
    }

    public Boolean a()
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            boolean flag2 = b.a(o.G, false);
            long l1 = b.a(o.E, 0L);
            int i = b.a(o.F, 0);
            if (!b.a(a, false))
            {
                flag = flag1;
                if (c.h() == b.PUBLIC)
                {
                    break label0;
                }
            }
            flag = flag1;
            if (!flag2)
            {
                flag = flag1;
                if (i < 3)
                {
                    flag = flag1;
                    if (d.a() - l1 > 0x48190800L)
                    {
                        flag = true;
                    }
                }
            }
        }
        return Boolean.valueOf(flag);
    }

    public Object b()
    {
        return a();
    }

}
