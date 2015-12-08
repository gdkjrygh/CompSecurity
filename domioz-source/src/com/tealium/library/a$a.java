// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tealium.library;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.tealium.library:
//            l, C, a, s

final class b extends BroadcastReceiver
    implements l
{

    private int a;
    private boolean b;
    private a c;

    public final void a(Object obj, C c1, String s1)
    {
        if (a != -1)
        {
            c1.c("device_battery_percent", (new StringBuilder()).append(a).toString());
        }
        c1.c("device_ischarging", (new StringBuilder()).append(b).toString());
    }

    public final void onReceive(Context context, Intent intent)
    {
label0:
        {
            boolean flag1 = false;
            if (intent == null)
            {
                return;
            }
            int i = intent.getIntExtra("level", -1);
            int j = intent.getIntExtra("scale", -1);
            int k = intent.getIntExtra("status", -1);
            if (i >= 0 && j >= 0)
            {
                a = Math.round(((float)i / (float)j) * 100F);
                context = com.tealium.library.a.a(c);
                boolean flag;
                if (a <= 20)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                context.b(flag);
            } else
            {
                a = -1;
                com.tealium.library.a.a(c).b(false);
            }
            if (k != 2)
            {
                flag = flag1;
                if (k != 5)
                {
                    break label0;
                }
            }
            flag = true;
        }
        b = flag;
    }

    tReceiver(a a1)
    {
        c = a1;
        super();
        a = -1;
        b = false;
    }
}
