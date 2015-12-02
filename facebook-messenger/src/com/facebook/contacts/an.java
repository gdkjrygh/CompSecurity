// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts;

import com.facebook.inject.d;
import com.facebook.phonenumbers.PhoneNumberUtil;

// Referenced classes of package com.facebook.contacts:
//            a, b

class an extends d
{

    final a a;

    private an(a a1)
    {
        a = a1;
        super();
    }

    an(a a1, b b1)
    {
        this(a1);
    }

    public PhoneNumberUtil a()
    {
        return PhoneNumberUtil.getInstance();
    }

    public Object b()
    {
        return a();
    }
}
