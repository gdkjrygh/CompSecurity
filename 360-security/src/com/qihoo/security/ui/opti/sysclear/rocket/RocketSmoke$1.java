// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.opti.sysclear.rocket;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.qihoo.security.ui.opti.sysclear.rocket:
//            RocketSmoke

static final class  extends Handler
{

    public void handleMessage(Message message)
    {
label0:
        {
label1:
            {
                if (message.what == 22)
                {
                    message = RocketSmoke.getBounds();
                    if (message != null)
                    {
                        RocketSmoke.a(true);
                        int i = message.width();
                        RocketSmoke.a(290F, RocketSmoke.a() - 20F, i);
                        RocketSmoke.a(180F, RocketSmoke.a() + 20F, 0.0F);
                        long l = System.currentTimeMillis() - RocketSmoke.b();
                        if (l >= 1000L)
                        {
                            break label0;
                        }
                        if (l >= 600L)
                        {
                            break label1;
                        }
                        sendEmptyMessageDelayed(22, 40L);
                    }
                }
                return;
            }
            RocketSmoke.a(30F);
            sendEmptyMessageDelayed(22, 5L);
            return;
        }
        RocketSmoke.a(false);
    }

    ()
    {
    }
}
