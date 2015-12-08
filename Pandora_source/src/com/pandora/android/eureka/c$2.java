// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.eureka;

import android.os.Handler;
import android.os.Looper;
import java.util.Timer;
import java.util.TimerTask;
import p.by.f;

// Referenced classes of package com.pandora.android.eureka:
//            c

class a extends TimerTask
{

    final c a;

    public void run()
    {
        c.b(a).cancel();
        c.a(a, null);
        if (c.c(a) < 2)
        {
            if (!a.E())
            {
                c.c("haven't gotten a status update - trying again");
                (new Handler(Looper.getMainLooper())).post(new Runnable() {

                    final c._cls2 a;

                    public void run()
                    {
                        a.a.a(false);
                    }

            
            {
                a = c._cls2.this;
                super();
            }
                });
            }
            return;
        } else
        {
            c.a(a, 0);
            c.c("never got any status updates - disconnecting");
            c.d(a).d();
            return;
        }
    }

    _cls1.a(c c1)
    {
        a = c1;
        super();
    }
}
