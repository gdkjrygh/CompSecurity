// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.base.broadcast.q;

// Referenced classes of package com.facebook.orca.notify:
//            av

class ba extends q
{

    final av a;

    ba(av av1, Context context, IntentFilter intentfilter)
    {
        a = av1;
        super(context, intentfilter);
    }

    public void a(Context context, Intent intent)
    {
        if ("com.facebook.orca.login.AuthStateMachineMonitor.LOGIN_COMPLETE".equals(intent.getAction()))
        {
            av.a(a);
        }
    }
}
