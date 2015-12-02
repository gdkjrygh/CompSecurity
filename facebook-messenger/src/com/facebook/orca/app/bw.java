// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.common.hardware.PhoneIsoCountryCode;
import com.facebook.inject.d;
import com.facebook.orca.annotations.LoggedInUserPhoneNumber;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.facebook.user.i;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class bw extends d
{

    final h a;

    private bw(h h)
    {
        a = h;
        super();
    }

    bw(h h, com.facebook.orca.app.i j)
    {
        this(h);
    }

    public i a()
    {
        return new i((PhoneNumberUtil)a(com/facebook/phonenumbers/PhoneNumberUtil), b(java/lang/String, com/facebook/common/hardware/PhoneIsoCountryCode), b(java/lang/String, com/facebook/orca/annotations/LoggedInUserPhoneNumber));
    }

    public Object b()
    {
        return a();
    }
}
