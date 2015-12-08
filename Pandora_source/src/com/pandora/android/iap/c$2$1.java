// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.iap;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.j;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.radio.data.af;
import p.cc.e;
import p.df.a;

// Referenced classes of package com.pandora.android.iap:
//            c

class nit> extends nit>
{

    final a a;

    protected void a(e e)
    {
        p.df.a.a("GoogleInApp", "Sending P2P to backend");
        a.a.c(e);
    }

    ver(ver ver, Activity activity, String s)
    {
        a = ver;
        super(activity, s);
    }

    // Unreferenced inner class com/pandora/android/iap/c$2

/* anonymous class */
    class c._cls2 extends BroadcastReceiver
    {

        final c a;

        public void onReceive(Context context, Intent intent)
        {
label0:
            {
                context = intent.getAction();
                if (PandoraIntent.a("get_usage_result").equals(context))
                {
                    b.a.C().a(this);
                    boolean flag = intent.getBooleanExtra("intent_is_capped", false);
                    p.df.a.a("GoogleInApp", (new StringBuilder()).append("purchaseEndOfMonthFromGoogle isCapped: ").append(flag).toString());
                    if (!flag)
                    {
                        break label0;
                    }
                    context = com.pandora.android.iap.c.e(a);
                    intent = b.a.d().d();
                    p.df.a.a("GoogleInApp", "Launching purchase flow");
                    c._cls2._cls1 _lcls1 = new c._cls2._cls1(this, com.pandora.android.iap.c.a(a), context);
                    c.d(a).a(com.pandora.android.iap.c.a(a), context, "inapp", 130, _lcls1, intent);
                }
                return;
            }
            s.d(com.pandora.android.iap.c.a(a));
        }

            
            {
                a = c1;
                super();
            }
    }

}
