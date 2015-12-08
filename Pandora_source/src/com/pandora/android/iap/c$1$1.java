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
        p.df.a.a("GoogleInApp", "Sending monthly sub to backend");
        a.a.b(e);
    }

    ver(ver ver, Activity activity, String s)
    {
        a = ver;
        super(activity, s);
    }

    // Unreferenced inner class com/pandora/android/iap/c$1

/* anonymous class */
    class c._cls1 extends BroadcastReceiver
    {

        static final boolean a;
        final c b;

        public void onReceive(Context context, Intent intent)
        {
            boolean flag;
            boolean flag2;
label0:
            {
                context = intent.getAction();
                if (PandoraIntent.a("can_subscribe_result").equals(context))
                {
                    b.a.C().a(this);
                    flag = intent.getBooleanExtra("intent_can_susbscribe", true);
                    boolean flag1 = intent.getBooleanExtra("intent_vendor_disabled", false);
                    flag2 = b.g();
                    p.df.a.a("GoogleInApp", (new StringBuilder()).append("PurchaseFromGoogle canSubscribe: ").append(flag).append(", hasGoogleSubscription: ").append(flag2).append(", isVendorDisabled: ").append(flag1).toString());
                    if (!flag1)
                    {
                        break label0;
                    }
                    p.df.a.a("GoogleInApp", "vendor is disabled, launching web interface");
                    if (!s.l())
                    {
                        com.pandora.android.activity.a.a(com.pandora.android.iap.c.a(b), b.a.d().f());
                    }
                    b.a(false);
                }
                return;
            }
            if (flag)
            {
                if (flag2)
                {
                    p.df.a.a("GoogleInApp", "Restoring subscription");
                    b.a(false);
                    context = com.pandora.android.iap.c.b(b).c();
                    intent = com.pandora.android.iap.c.b(b).f();
                    String s1 = com.pandora.android.iap.c.b(b).b();
                    if (!a && (intent == null || context == null || s1 == null))
                    {
                        throw new AssertionError();
                    }
                    if (s.a(com.pandora.android.iap.c.a(b)))
                    {
                        com.pandora.android.activity.a.a(com.pandora.android.iap.c.a(b), s1, intent, context);
                        return;
                    } else
                    {
                        b.b(new e(null, intent, s1, context, null));
                        return;
                    }
                } else
                {
                    context = c.c(b);
                    intent = b.a.d().d();
                    p.df.a.a("GoogleInApp", "Launching purchase flow");
                    c._cls1._cls1 _lcls1 = new c._cls1._cls1(this, com.pandora.android.iap.c.a(b), context);
                    c.d(b).a(com.pandora.android.iap.c.a(b), context, "subs", 130, _lcls1, intent);
                    return;
                }
            } else
            {
                s.e(com.pandora.android.iap.c.a(b));
                return;
            }
        }

        static 
        {
            boolean flag;
            if (!com/pandora/android/iap/c.desiredAssertionStatus())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a = flag;
        }

            
            {
                b = c1;
                super();
            }
    }

}
