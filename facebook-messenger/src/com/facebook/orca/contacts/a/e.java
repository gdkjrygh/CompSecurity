// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.a;

import com.facebook.config.a.d;
import com.facebook.f.n;
import com.facebook.prefs.shared.ae;
import javax.inject.a;

public class e
    implements a
{

    private static final ae a = n.a("contacts_upload_divebar_nux_android");
    private final com.facebook.prefs.shared.d b;
    private final com.facebook.config.a.a c;

    public e(com.facebook.prefs.shared.d d1, com.facebook.config.a.a a1)
    {
        b = d1;
        c = a1;
    }

    public Boolean a()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (c.i() == d.FB4A)
        {
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
