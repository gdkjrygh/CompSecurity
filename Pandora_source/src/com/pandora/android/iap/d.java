// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.iap;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.j;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.activity.PandoraIntentFilter;
import com.pandora.android.activity.a;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.radio.data.af;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.pandora.android.iap:
//            b, a, c

public class com.pandora.android.iap.d
{
    private class a extends BroadcastReceiver
    {

        public List a;
        final com.pandora.android.iap.d b;
        private boolean c;

        public void a()
        {
            if (c)
            {
                return;
            } else
            {
                PandoraIntentFilter pandoraintentfilter = new PandoraIntentFilter();
                pandoraintentfilter.a("iap_complete");
                pandoraintentfilter.a("iap_error");
                com.pandora.android.provider.b.a.C().a(this, pandoraintentfilter);
                return;
            }
        }

        public void a(b b1)
        {
            if (b1 == null)
            {
                return;
            } else
            {
                a.add(b1);
                return;
            }
        }

        public void onReceive(Context context, Intent intent)
        {
            context = intent.getAction();
            p.df.a.a("InAppPurchaseManager", (new StringBuilder()).append("CompletionBroadcastReceiver: ").append(context).append(" =").append(a.size()).toString());
            if (s.a(context))
            {
                return;
            }
            if (com.pandora.android.iap.d.a(b) != null)
            {
                com.pandora.android.iap.d.a(b).a(false);
            }
            boolean flag;
            if (context.equals(PandoraIntent.a("iap_complete")))
            {
                flag = true;
            } else
            if (context.equals(PandoraIntent.a("iap_error")))
            {
                flag = false;
            } else
            {
                flag = false;
            }
            for (context = a.iterator(); context.hasNext(); ((b)context.next()).a(flag)) { }
            a.clear();
        }

        public a()
        {
            b = com.pandora.android.iap.d.this;
            super();
            c = false;
            a = new ArrayList();
        }
    }

    public static interface b
    {

        public abstract void a(boolean flag);
    }

    public static final class c extends Enum
    {

        public static final c a;
        public static final c b;
        public static final c c;
        private static final c d[];

        public static c valueOf(String s1)
        {
            return (c)Enum.valueOf(com/pandora/android/iap/d$c, s1);
        }

        public static c[] values()
        {
            return (c[])d.clone();
        }

        static 
        {
            a = new c("NoNeedToPay", 0);
            b = new c("SubscriptionsUnavailable", 1);
            c = new c("P2PUnavailable", 2);
            d = (new c[] {
                a, b, c
            });
        }

        private c(String s1, int j)
        {
            super(s1, j);
        }
    }

    public static class d extends com.pandora.radio.util.b
    {

        static com.pandora.android.iap.d a = null;

        public static com.pandora.android.iap.d a()
        {
            if (a == null)
            {
                a = new com.pandora.android.iap.d(com.pandora.android.provider.b.a.h(), com.pandora.android.provider.b.a);
                a.a();
            }
            return a;
        }

    }


    private Context a;
    private com.pandora.android.provider.b b;
    private Handler c;
    private com.pandora.android.iap.a d;
    private com.pandora.android.iap.c e;
    private com.pandora.android.iap.b f;
    private a g;

    com.pandora.android.iap.d(Context context, com.pandora.android.provider.b b1)
    {
        g = new a();
        a = context;
        b = b1;
        c = new Handler(Looper.getMainLooper());
        g.a();
    }

    static com.pandora.android.iap.c a(com.pandora.android.iap.d d1)
    {
        return d1.e;
    }

    private void c(Activity activity, String s1)
    {
        if ("P2P".equalsIgnoreCase(s1))
        {
            f.b(activity);
            return;
        }
        if (b() && d.a(s1))
        {
            d.a(activity, s1);
            return;
        } else
        {
            f.a(activity);
            return;
        }
    }

    private void d(Activity activity, String s1)
    {
        if ("P2P".equalsIgnoreCase(s1))
        {
            e.b(activity);
        } else
        {
            if (b() && d.a(s1))
            {
                d.a(activity, s1);
                return;
            }
            if (e.e())
            {
                e.a(activity);
                return;
            }
            if (!i())
            {
                b(activity, b.d().f());
                return;
            }
        }
    }

    protected com.pandora.android.iap.a a(Context context, Handler handler, com.pandora.android.provider.b b1)
    {
        return new com.pandora.android.iap.a(context, handler, b1);
    }

    final void a()
    {
        if (d == null && b())
        {
            d = a(a, c, b);
            d.a();
        }
        if (e == null)
        {
            e = f();
        }
        if (f == null)
        {
            f = g();
        }
    }

    public void a(Activity activity, String s1)
    {
        a(activity, s1, ((b) (null)));
    }

    public void a(Activity activity, String s1, b b1)
    {
        if (b1 != null)
        {
            g.a(b1);
        }
        if (c())
        {
            c(activity, s1);
            return;
        } else
        {
            d(activity, s1);
            return;
        }
    }

    public boolean a(com.pandora.radio.util.k.a a1)
    {
        return d != null && d.a(a1);
    }

    protected void b(Activity activity, String s1)
    {
        com.pandora.android.activity.a.a(activity, s1);
    }

    protected boolean b()
    {
        return !s.u();
    }

    protected boolean c()
    {
        return s.m();
    }

    public com.pandora.android.iap.c d()
    {
        return e;
    }

    public com.pandora.android.iap.b e()
    {
        return f;
    }

    protected com.pandora.android.iap.c f()
    {
        return new com.pandora.android.iap.c();
    }

    protected com.pandora.android.iap.b g()
    {
        return new com.pandora.android.iap.b(a);
    }

    public List h()
    {
        if (d != null)
        {
            return d.e();
        } else
        {
            return null;
        }
    }

    protected boolean i()
    {
        return s.l();
    }
}
