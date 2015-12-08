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

class eiver extends BroadcastReceiver
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
                eiver eiver = new c.a(com.pandora.android.iap.c.a(a), context) {

                    final c._cls2 a;

                    protected void a(e e)
                    {
                        p.df.a.a("GoogleInApp", "Sending P2P to backend");
                        a.a.c(e);
                    }

            
            {
                a = c._cls2.this;
                super(activity, s1);
            }
                };
                c.d(a).a(com.pandora.android.iap.c.a(a), context, "inapp", 130, eiver, intent);
            }
            return;
        }
        s.d(com.pandora.android.iap.c.a(a));
    }

    <init>(c c1)
    {
        a = c1;
        super();
    }
}
