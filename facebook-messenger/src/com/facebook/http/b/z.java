// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.b;

import com.facebook.common.hardware.PhoneIsoCountryCode;
import com.facebook.http.protocol.q;
import com.facebook.inject.d;
import java.util.Locale;

// Referenced classes of package com.facebook.http.b:
//            w, x

class z extends d
{

    final w a;

    private z(w w)
    {
        a = w;
        super();
    }

    z(w w, x x)
    {
        this(w);
    }

    public q a()
    {
        return new q(b(java/util/Locale), b(java/lang/String, com/facebook/common/hardware/PhoneIsoCountryCode));
    }

    public Object b()
    {
        return a();
    }
}
