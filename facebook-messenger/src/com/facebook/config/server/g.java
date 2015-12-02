// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.config.server;

import android.telephony.TelephonyManager;
import com.facebook.config.b.a;
import com.facebook.inject.d;
import java.util.Locale;

// Referenced classes of package com.facebook.config.server:
//            q, d, e

class g extends d
{

    final com.facebook.config.server.d a;

    private g(com.facebook.config.server.d d1)
    {
        a = d1;
        super();
    }

    g(com.facebook.config.server.d d1, e e)
    {
        this(d1);
    }

    public q a()
    {
        return new q((a)a(com/facebook/config/b/a), (TelephonyManager)a(android/telephony/TelephonyManager), (Locale)a(java/util/Locale), com.facebook.config.server.d.a(a));
    }

    public Object b()
    {
        return a();
    }
}
