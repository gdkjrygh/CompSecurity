// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero;

import android.telephony.TelephonyManager;
import com.facebook.common.hardware.k;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.zero:
//            c, d

class s extends d
{

    final c a;

    private s(c c)
    {
        a = c;
        super();
    }

    s(c c, com.facebook.zero.d d1)
    {
        this(c);
    }

    public com.facebook.zero.server.d a()
    {
        return new com.facebook.zero.server.d((TelephonyManager)a(android/telephony/TelephonyManager), (k)a(com/facebook/common/hardware/k));
    }

    public Object b()
    {
        return a();
    }
}
