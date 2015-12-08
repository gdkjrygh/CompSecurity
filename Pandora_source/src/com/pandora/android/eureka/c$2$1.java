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

class a
    implements Runnable
{

    final a a;

    public void run()
    {
        a.a.a(false);
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/pandora/android/eureka/c$2

/* anonymous class */
    class c._cls2 extends TimerTask
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
                    (new Handler(Looper.getMainLooper())).post(new c._cls2._cls1(this));
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

            
            {
                a = c1;
                super();
            }
    }

}
