// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.device_id;

import com.facebook.common.init.NeedsHighPriorityInitOnBackgroundThread;
import com.facebook.inject.a.a;
import com.facebook.inject.a.g;
import com.facebook.inject.aj;
import com.facebook.inject.c;

// Referenced classes of package com.facebook.device_id:
//            l, f, g, d, 
//            UniqueDeviceIdBroadcastSender, e, a

public class b extends c
{

    public b()
    {
    }

    protected void a()
    {
        a(com/facebook/device_id/l).a(new f(this, null)).a();
        a(com/facebook/device_id/g).a(new d(this, null));
        a(com/facebook/device_id/UniqueDeviceIdBroadcastSender).a(new e(this, null));
        a(com/facebook/base/c, com/facebook/common/init/NeedsHighPriorityInitOnBackgroundThread).a(com/facebook/device_id/l);
        c(com/facebook/auth/a/b).a(com/facebook/device_id/UniqueDeviceIdBroadcastSender);
        c(com/facebook/device_id/a);
    }
}
