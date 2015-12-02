// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.device_id;

import android.app.AlarmManager;
import android.content.Context;
import com.facebook.common.time.a;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.device_id:
//            UniqueDeviceIdBroadcastSender, l, g, a, 
//            b, c

class e extends d
{

    final b a;

    private e(b b1)
    {
        a = b1;
        super();
    }

    e(b b1, c c)
    {
        this(b1);
    }

    public UniqueDeviceIdBroadcastSender a()
    {
        return new UniqueDeviceIdBroadcastSender((l)a(com/facebook/device_id/l), (a)a(com/facebook/common/time/a), (Context)e().a(android/content/Context), (AlarmManager)e().a(android/app/AlarmManager), b(com/facebook/device_id/g), c(com/facebook/device_id/a));
    }

    public Object b()
    {
        return a();
    }
}
