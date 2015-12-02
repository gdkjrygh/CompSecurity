// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.c2dm;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.analytics.cn;
import com.facebook.common.hardware.o;
import com.facebook.common.w.n;
import com.facebook.debug.log.b;
import com.facebook.inject.t;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;
import com.facebook.push.fbpushdata.FbPushDataHandlerService;
import com.facebook.push.g;
import com.facebook.push.h;

// Referenced classes of package com.facebook.push.c2dm:
//            c, m, C2DMRegistrar

public class C2DMService extends IntentService
{

    private static final Class a = com/facebook/push/c2dm/C2DMService;
    private C2DMRegistrar b;
    private m c;
    private d d;
    private cn e;

    public C2DMService()
    {
        super("C2DMReceiver");
    }

    private void a()
    {
        e e1 = d.b();
        e1.a(com.facebook.push.c2dm.c.g, System.currentTimeMillis());
        e1.a();
    }

    private void a(int i)
    {
        e.b(h.C2DM.toString(), "gcm_deleted_messages", i);
    }

    static void a(Context context, Intent intent)
    {
        m m1;
        m1 = (m)t.a(context).a(com/facebook/push/c2dm/m);
        m1.a.a();
        intent.setClass(context, com/facebook/push/c2dm/C2DMService);
        context = context.startService(intent);
        boolean flag;
        if (context != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            m1.a.b();
            com.facebook.debug.log.b.d(a, "Failed to start service");
        }
        return;
        context;
        m1.a.b();
        com.facebook.debug.log.b.d(a, "Failed to start service");
        throw context;
    }

    private void a(Intent intent)
    {
        String s = intent.getStringExtra("registration_id");
        String s1 = intent.getStringExtra("error");
        intent = intent.getStringExtra("unregistered");
        if (com.facebook.debug.log.b.b(3))
        {
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("dmControl: registrationId = ").append(s).append(", error = ").append(s1).append(", removed = ").append(intent).toString());
        }
        C2DMRegistrar c2dmregistrar = b;
        boolean flag;
        if (intent != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c2dmregistrar.a(s, s1, flag);
    }

    private void b(Intent intent)
    {
        com.facebook.debug.log.b.b(a, "Received handleMessage");
        intent = intent.getExtras();
        if (intent != null)
        {
            if ("deleted_messages".equals(intent.getString("message_type")))
            {
                a(intent.getInt("total_deleted", 1));
            } else
            if (!n.a(intent.getString("notification")))
            {
                a();
                FbPushDataHandlerService.a(this, intent.getString("notification"), g.C2DM);
                return;
            }
        }
    }

    public void onCreate()
    {
        super.onCreate();
        com.facebook.base.a.g.a(this);
        t t1 = t.a(this);
        b = (C2DMRegistrar)t1.a(com/facebook/push/c2dm/C2DMRegistrar);
        c = (m)t1.a(com/facebook/push/c2dm/m);
        d = (d)t1.a(com/facebook/prefs/shared/d);
        e = (cn)t1.a(com/facebook/analytics/cn);
    }

    public final void onHandleIntent(Intent intent)
    {
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_13;
        }
        String s = intent.getAction();
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        c.a.b();
        return;
        if (!intent.getAction().equals("com.google.android.c2dm.intent.REGISTRATION")) goto _L2; else goto _L1
_L1:
        a(intent);
_L5:
        c.a.b();
        return;
_L2:
        if (!intent.getAction().equals("com.google.android.c2dm.intent.RECEIVE")) goto _L4; else goto _L3
_L3:
        b(intent);
          goto _L5
        intent;
        c.a.b();
        throw intent;
_L4:
        if (!intent.getAction().equals("com.google.android.c2dm.intent.RETRY")) goto _L5; else goto _L6
_L6:
        b.a();
          goto _L5
    }

}
