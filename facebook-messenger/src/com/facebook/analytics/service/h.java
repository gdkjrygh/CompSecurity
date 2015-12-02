// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.service;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.base.broadcast.o;
import com.facebook.common.time.a;
import com.facebook.debug.log.b;

// Referenced classes of package com.facebook.analytics.service:
//            a

class h extends o
{

    final com.facebook.analytics.service.a a;

    public h(com.facebook.analytics.service.a a1, Context context, IntentFilter intentfilter)
    {
        a = a1;
        super(context, intentfilter);
    }

    public void a(Context context, Intent intent)
    {
        context = intent.getAction();
        long l = com.facebook.analytics.service.a.b(a).a();
        if ("android.intent.action.SCREEN_ON".equals(context))
        {
            b.a(com.facebook.analytics.service.a.d(), "Screen on, maybe sending pending events, turning event throttling off.");
            if (com.facebook.analytics.service.a.e())
            {
                com.facebook.analytics.service.a.c(a);
            }
            com.facebook.analytics.service.a.a(a, true);
            com.facebook.analytics.service.a.a(a, l);
            a.b(null);
        } else
        if ("android.intent.action.SCREEN_OFF".equals(context))
        {
            b.a(com.facebook.analytics.service.a.d(), "Screen off, event uploading throttled to once per hour.");
            if (!com.facebook.analytics.service.a.e())
            {
                com.facebook.analytics.service.a.d(a);
            }
            com.facebook.analytics.service.a.a(a, -1L);
            com.facebook.analytics.service.a.a(a, false);
            return;
        }
    }
}
