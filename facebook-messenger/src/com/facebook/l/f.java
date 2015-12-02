// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.l;

import android.content.Context;
import android.content.Intent;
import com.facebook.c.b;
import com.facebook.c.c;
import com.facebook.push.mqtt.cj;

// Referenced classes of package com.facebook.l:
//            g, c

class f
    implements b
{

    final com.facebook.l.c a;

    f(com.facebook.l.c c1)
    {
        a = c1;
        super();
    }

    public void a(Context context, Intent intent, c c1)
    {
        if (!"com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
        context = cj.fromValue(intent.getIntExtra("event", -1));
        g.a[context.ordinal()];
        JVM INSTR tableswitch 1 1: default 48
    //                   1 49;
           goto _L2 _L3
_L2:
        return;
_L3:
        com.facebook.l.c.c(a);
        return;
    }
}
