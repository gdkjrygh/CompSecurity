// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.login;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.base.broadcast.q;

// Referenced classes of package com.facebook.orca.login:
//            ai

class ak extends q
{

    final ai a;

    ak(ai ai1, Context context, IntentFilter intentfilter)
    {
        a = ai1;
        super(context, intentfilter);
    }

    public void a(Context context, Intent intent)
    {
        if ("com.facebook.orca.phonenumber.CONFIRMATION_CODE_RECEIVED".equals(intent.getAction()))
        {
            ai.a(a, intent);
        }
    }
}
