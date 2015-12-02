// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import com.facebook.f.n;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;

// Referenced classes of package com.facebook.push.mqtt:
//            as, ar

public class a
    implements as
{

    public static final ae a = n.a("android_persistent_mqtt_service");
    private final d b;

    public a(d d1)
    {
        b = d1;
    }

    public ar a()
    {
        if (b.a(a, false))
        {
            return ar.ALWAYS;
        } else
        {
            return ar.APP_USE;
        }
    }

}
