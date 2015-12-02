// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol;

import com.facebook.common.hardware.PhoneIsoCountryCode;
import com.facebook.contacts.g.a.h;
import com.facebook.inject.d;
import com.facebook.phonenumbers.PhoneNumberUtil;

// Referenced classes of package com.facebook.orca.protocol:
//            d, e

class x extends d
{

    final com.facebook.orca.protocol.d a;

    private x(com.facebook.orca.protocol.d d1)
    {
        a = d1;
        super();
    }

    x(com.facebook.orca.protocol.d d1, e e)
    {
        this(d1);
    }

    public h a()
    {
        return new h((PhoneNumberUtil)a(com/facebook/phonenumbers/PhoneNumberUtil), b(java/lang/String, com/facebook/common/hardware/PhoneIsoCountryCode));
    }

    public Object b()
    {
        return a();
    }
}
