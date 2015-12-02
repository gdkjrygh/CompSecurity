// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import android.net.wifi.WifiManager;
import com.facebook.common.hardware.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.base.c:
//            a, b

class bi extends d
{

    final a a;

    private bi(a a1)
    {
        a = a1;
        super();
    }

    bi(a a1, b b1)
    {
        this(a1);
    }

    public ab a()
    {
        return new ab((WifiManager)e().a(android/net/wifi/WifiManager));
    }

    public Object b()
    {
        return a();
    }
}
