// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.base.broadcast.q;

// Referenced classes of package com.facebook.orca.chatheads:
//            ChatHeadService

class r extends q
{

    final ChatHeadService a;

    r(ChatHeadService chatheadservice, Context context, IntentFilter intentfilter)
    {
        a = chatheadservice;
        super(context, intentfilter);
    }

    public void a(Context context, Intent intent)
    {
        if (intent.getAction().equals("com.facebook.orca.login.AuthStateMachineMonitor.LOGOUT_COMPLETE"))
        {
            ChatHeadService.e(a);
        }
    }
}
