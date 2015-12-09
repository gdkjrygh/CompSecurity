// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.threading;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.fitbit.util.threading:
//            c, FitbitHandlerThread

class a
    implements Runnable
{

    final Intent a;
    final a b;

    public void run()
    {
        b.b.a(a);
    }

    r(r r, Intent intent)
    {
        b = r;
        a = intent;
        super();
    }

    // Unreferenced inner class com/fitbit/util/threading/c$1

/* anonymous class */
    class c._cls1 extends BroadcastReceiver
    {

        final c a;

        public void onReceive(Context context, Intent intent)
        {
            if (!c.a(a) && !c.b(a))
            {
                return;
            }
            if (c.c(a) == null)
            {
                a.a(intent);
                return;
            } else
            {
                FitbitHandlerThread.a(c.c(a), new c._cls1._cls1(this, intent));
                return;
            }
        }

            
            {
                a = c1;
                super();
            }
    }

}
