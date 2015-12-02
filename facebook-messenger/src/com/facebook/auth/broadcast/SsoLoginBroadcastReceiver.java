// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.base.a.g;
import com.facebook.c.l;
import com.facebook.config.a.d;
import com.facebook.debug.log.b;
import com.facebook.inject.t;
import com.google.common.base.Objects;

// Referenced classes of package com.facebook.auth.broadcast:
//            AutoSsoLoginService

public class SsoLoginBroadcastReceiver extends BroadcastReceiver
{

    private static final Class a = com/facebook/auth/broadcast/SsoLoginBroadcastReceiver;
    private l b;

    public SsoLoginBroadcastReceiver()
    {
    }

    private void a(Context context)
    {
        if (b == null)
        {
            g.a(context);
            b = (l)t.a(context).a(com/facebook/c/l);
        }
    }

    private void a(Context context, Intent intent)
    {
        d d1;
        String s;
        s = intent.getStringExtra("extra_product");
        d1 = null;
        d d2 = d.valueOf(s);
        d1 = d2;
_L1:
        Object obj;
        if (d1 == d.FB4A)
        {
            com.facebook.debug.log.b.b(a, "Received SSO login intent from FB4A. Starting AutoSsoLoginService.");
            intent = new Intent(intent);
            intent.setClass(context, com/facebook/auth/broadcast/AutoSsoLoginService);
            context.startService(intent);
            return;
        } else
        {
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Received SSO login intent from product ").append(s).toString());
            return;
        }
        obj;
        com.facebook.debug.log.b.e(a, "NullPointerException getting login action product.", ((Throwable) (obj)));
          goto _L1
        obj;
        com.facebook.debug.log.b.d(a, "IllegalArgumentException getting login action product. This is caused by receiving a broadcast from an app this version hasn't heard of.", ((Throwable) (obj)));
          goto _L1
    }

    public void onReceive(Context context, Intent intent)
    {
        a(context);
        String s = intent.getAction();
        if (Objects.equal(b.a("SSO_LOGIN"), s))
        {
            a(context, intent);
        }
    }

}
