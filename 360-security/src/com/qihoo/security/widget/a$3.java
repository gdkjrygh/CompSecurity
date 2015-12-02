// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import java.util.List;

// Referenced classes of package com.qihoo.security.widget:
//            a

class ver extends BroadcastReceiver
{

    final a a;

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null)
        {
            context = intent.getAction();
            if (!"android.intent.action.SCREEN_OFF".equals(context))
            {
                continue;
            }
            if (com.qihoo.security.widget.a.d(a) && com.qihoo.security.widget.a.e(a) != null)
            {
                try
                {
                    if (com.qihoo.security.widget.a.f(a) == null || com.qihoo.security.widget.a.f(a).isEmpty() || !com.qihoo.security.widget.a.f(a).contains(Build.MODEL))
                    {
                        com.qihoo.security.widget.a.g(a);
                        com.qihoo.security.widget.a.h(a);
                        com.qihoo.security.widget.a.e(a).release();
                        com.qihoo.security.widget.a.a(a, null);
                        com.qihoo.security.widget.a.a(a, false);
                    }
                    com.qihoo.security.widget.a.i(a);
                    (new Thread(new Runnable() {

                        final a._cls3 a;

                        public void run()
                        {
                            com.qihoo.security.widget.a.c(a.a);
                            if (com.qihoo.security.widget.a.b(a.a) != null)
                            {
                                com.qihoo.security.widget.a.b(a.a).b(true);
                            }
                            com.qihoo.security.widget.a.a(a.a, true);
                        }

            
            {
                a = a._cls3.this;
                super();
            }
                    })).start();
                    if (com.qihoo.security.widget.a.b(a) != null)
                    {
                        com.qihoo.security.widget.a.b(a).b(false);
                    }
                    if (com.qihoo.security.widget.a.j(a) != null)
                    {
                        com.qihoo.security.widget.a.j(a).removeMessages(0);
                        com.qihoo.security.widget.a.j(a).sendEmptyMessageDelayed(0, 5000L);
                        return;
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    return;
                }
            }
        }
        do
        {
            return;
        } while (!"com.qihoo.security.action.TURN_OFF_LIGHT".equals(context) || com.qihoo.security.widget.a.b(a) == null);
        com.qihoo.security.widget.a.b(a).a();
    }

    _cls1.a(a a1)
    {
        a = a1;
        super();
    }
}
