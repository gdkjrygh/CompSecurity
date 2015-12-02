// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.inject.d;
import com.facebook.phonenumbers.PhoneNumberUtil;

// Referenced classes of package com.facebook.orca.app:
//            fl, dv, dw

class et extends d
{

    final dv a;

    private et(dv dv)
    {
        a = dv;
        super();
    }

    et(dv dv, dw dw)
    {
        this(dv);
    }

    public fl a()
    {
        return new fl(b(com/facebook/phonenumbers/PhoneNumberUtil));
    }

    public Object b()
    {
        return a();
    }
}
