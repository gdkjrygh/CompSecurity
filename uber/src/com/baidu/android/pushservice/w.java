// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.android.pushservice;

import com.baidu.android.pushservice.util.f;

// Referenced classes of package com.baidu.android.pushservice:
//            PushService, PushSDK

class w
    implements Runnable
{

    final PushService a;

    w(PushService pushservice)
    {
        a = pushservice;
        super();
    }

    public void run()
    {
        boolean flag1 = true;
        a.stopSelf();
        PushSDK.destroy();
        boolean flag;
        if (PushService.access$000(a) > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (a.getPackageName().equals(f.B(a.getApplicationContext())))
        {
            flag1 = false;
        }
        if (flag & flag1)
        {
            a.onDestroy();
        }
    }
}
