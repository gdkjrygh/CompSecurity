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
import com.pandora.android.activity.PandoraIntentFilter;
import com.pandora.android.util.s;
import com.pandora.radio.data.af;
import com.pandora.radio.data.l;
import java.text.MessageFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p.cc.b;
import p.cc.d;
import p.cm.aa;
import p.cm.e;
import p.cm.f;
import p.cm.q;
import p.cm.z;
import p.dd.v;
import p.de.a;

// Referenced classes of package com.pandora.android.iap:
//            f

public class c
    implements p.de.a
{
    public static abstract class a
        implements p.cc.b.d
    {

        private Activity a;
        private String b;

        public void a(p.cc.c c1, p.cc.e e1)
        {
            p.df.a.a("GoogleInApp", (new StringBuilder()).append("onIapPurchaseFinished response: ").append(c1).toString());
            if (c1.d())
            {
                p.df.a.a("GoogleInApp", (new StringBuilder()).append("onIapPurchaseFinished is failure: ").append(e1).toString());
                switch (c1.a())
                {
                default:
                    s.e(a);
                    // fall through

                case -1005: 
                    com.pandora.android.iap.f.a();
                    break;
                }
                return;
            } else
            {
                (new p.cm.s()).execute(new Void[0]);
                p.df.a.a("GoogleInApp", (new StringBuilder()).append("onIapPurchaseFinished success: ").append(e1).toString());
                a(e1);
                return;
            }
        }

        protected abstract void a(p.cc.e e1);

        public a(Activity activity, String s1)
        {
            a = activity;
            b = s1;
        }
    }


    p.cc.b.a a;
    private Activity b;
    private boolean c;
    private p.cc.e d;
    private p.cc.e e;
    private boolean f;
    private b g;
    private String h;
    private String i;
    private String j;
    private HashMap k;

    c()
    {
        k = new HashMap();
        a = new p.cc.b.a() {

            final c a;

            public void a(p.cc.e e1, p.cc.c c1)
            {
                if (c1.c())
                {
                    p.df.a.a("GoogleInApp", (new StringBuilder()).append("Consumed purchase: ").append(e1).toString());
                    return;
                } else
                {
                    p.df.a.a("GoogleInApp", (new StringBuilder()).append("Failed to consumed purchase: ").append(e1).toString());
                    return;
                }
            }

            
            {
                a = c.this;
                super();
            }
        };
        p.df.a.a("GoogleInApp", "Start");
    }

    static Activity a(c c1)
    {
        return c1.b;
    }

    static void a(c c1, boolean flag)
    {
        c1.b(flag);
    }

    private void a(d d1)
    {
        Iterator iterator = d1.c("subs").iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s2 = (String)iterator.next();
            if (s2.equals(i))
            {
                continue;
            }
            p.df.a.a("GoogleInApp", (new StringBuilder()).append("** Listener owns back-reved sub sku: ").append(s2).toString());
            i = s2;
            break;
        } while (true);
        d1 = d1.c("inapp").iterator();
        do
        {
            if (!d1.hasNext())
            {
                break;
            }
            String s1 = (String)d1.next();
            if (!s1.startsWith("pandora.android.subscriptions.endofmonth"))
            {
                continue;
            }
            p.df.a.a("GoogleInApp", (new StringBuilder()).append("** Listener owns p2p sku: ").append(s1).toString());
            j = s1;
            break;
        } while (true);
    }

    private boolean a(long l1)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(5, calendar.getActualMaximum(5));
        long l2 = calendar.getTimeInMillis();
        calendar.set(5, calendar.getActualMinimum(5));
        long l3 = calendar.getTimeInMillis();
        boolean flag;
        if (l3 <= l1 && l1 <= l2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.df.a.a("GoogleInApp", MessageFormat.format("withinThisMonth: Start {0}, End {1}, target {2}, within {3}", new Object[] {
            new Date(l3), new Date(l2), new Date(l1), Boolean.valueOf(flag)
        }));
        return flag;
    }

    static boolean a(c c1, long l1)
    {
        return c1.a(l1);
    }

    static p.cc.e b(c c1)
    {
        return c1.d;
    }

    private void b(boolean flag)
    {
        p.df.a.a("GoogleInApp", (new StringBuilder()).append("subSupported: ").append(flag).toString());
        f = flag;
    }

    static String c(c c1)
    {
        return c1.i;
    }

    static b d(c c1)
    {
        return c1.g;
    }

    static String e(c c1)
    {
        return c1.j;
    }

    static HashMap f(c c1)
    {
        return c1.k;
    }

    static p.cc.e g(c c1)
    {
        return c1.e;
    }

    private void h()
    {
        boolean flag = true;
        p.df.a.a("GoogleInApp", String.format("validateSkus: %s,  %s", new Object[] {
            i, j
        }));
        if (!g.a("inapp", j) || !g.a("subs", i))
        {
            flag = false;
        }
        b(flag);
    }

    public void a()
    {
        p.df.a.a("GoogleInApp", "Shutdown");
        if (g != null)
        {
            g.a();
        }
        g = null;
    }

    public void a(Activity activity)
    {
        this;
        JVM INSTR monitorenter ;
        b = activity;
        if (e()) goto _L2; else goto _L1
_L1:
        p.df.a.a("GoogleInApp", "inApp is not supported");
        s.e(activity);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        activity = new PandoraIntentFilter();
        activity.a("can_subscribe_result");
        if (!c)
        {
            a(true);
            com.pandora.android.provider.b.a.C().a(new BroadcastReceiver() {

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
                            com.pandora.android.provider.b.a.C().a(this);
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
                                com.pandora.android.activity.a.a(com.pandora.android.iap.c.a(b), com.pandora.android.provider.b.a.d().f());
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
                                b.b(new p.cc.e(null, intent, s1, context, null));
                                return;
                            }
                        } else
                        {
                            context = c.c(b);
                            intent = com.pandora.android.provider.b.a.d().d();
                            p.df.a.a("GoogleInApp", "Launching purchase flow");
                            a a1 = new a(this, com.pandora.android.iap.c.a(b), context) {

                                final _cls1 a;

                                protected void a(p.cc.e e1)
                                {
                                    p.df.a.a("GoogleInApp", "Sending monthly sub to backend");
                                    a.b.b(e1);
                                }

            
            {
                a = _pcls1;
                super(activity, s1);
            }
                            };
                            com.pandora.android.iap.c.d(b).a(com.pandora.android.iap.c.a(b), context, "subs", 130, a1, intent);
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
                b = c.this;
                super();
            }
            }, activity);
            (new f()).execute(new Object[] {
                (Void)null
            });
        }
        if (true) goto _L4; else goto _L3
_L3:
        activity;
        throw activity;
    }

    public void a(Activity activity, String s1, p.cc.b.d d1)
    {
        this;
        JVM INSTR monitorenter ;
        b = activity;
        if (e()) goto _L2; else goto _L1
_L1:
        p.df.a.a("GoogleInApp", "inApp is not supported");
        s.e(activity);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!c)
        {
            a(true);
            (new e(com.pandora.android.provider.b.a.b().e(), new p.cm.e.a(s1, d1) {

                final String a;
                final p.cc.b.d b;
                final c c;

                public void a(boolean flag, String s2)
                {
                    if (flag)
                    {
                        if (com.pandora.android.iap.c.d(c).a("inapp", a))
                        {
                            s2 = (p.cc.e)com.pandora.android.iap.c.f(c).get(a);
                            if (s2 != null)
                            {
                                b.a(new p.cc.c(0, null), s2);
                                return;
                            } else
                            {
                                com.pandora.android.iap.c.d(c).a(com.pandora.android.iap.c.a(c), a, "inapp", 130, b, null);
                                return;
                            }
                        } else
                        {
                            com.pandora.android.iap.f.a();
                            p.df.a.c("GoogleInApp", "Cannot complete purchase because sku %s is invalid:", new Object[] {
                                a
                            });
                            s.e(com.pandora.android.iap.c.a(c));
                            return;
                        }
                    } else
                    {
                        com.pandora.android.iap.f.a();
                        s.e(com.pandora.android.iap.c.a(c));
                        return;
                    }
                }

            
            {
                c = c.this;
                a = s1;
                b = d1;
                super();
            }
            })).execute(new String[] {
                s1
            });
        }
        if (true) goto _L4; else goto _L3
_L3:
        activity;
        throw activity;
    }

    public void a(l l1)
    {
        p.df.a.a("GoogleInApp", "Check Inventory");
        if (s.a(l1.a) || s.a(l1.b))
        {
            if (j == null || i == null)
            {
                p.df.a.a("GoogleInApp", "ERROR: empty SKUs!");
                b(false);
                return;
            }
        } else
        {
            j = l1.a;
            i = l1.b;
            p.df.a.a("GoogleInApp", (new StringBuilder()).append("Monthly SKU: ").append(i).toString());
            p.df.a.a("GoogleInApp", (new StringBuilder()).append("EndOfMonth SKU: ").append(j).toString());
        }
        if (s.a(l1.c))
        {
            if (h == null)
            {
                p.df.a.a("GoogleInApp", "ERROR: No key found!");
                b(false);
                return;
            } else
            {
                (new p.cm.s()).execute(new Void[0]);
                return;
            }
        }
        if (!l1.c.equals(h))
        {
            h = l1.c;
            p.df.a.a("GoogleInApp", (new StringBuilder()).append("Goog key: ").append(h).toString());
            if (g != null)
            {
                g.a();
                g = null;
            }
            g = new b(com.pandora.android.provider.b.a.h(), h);
            g.a(new p.cc.b.c() {

                final c a;

                public void a(p.cc.c c1)
                {
                    com.pandora.android.iap.c.a(a, com.pandora.android.iap.c.d(a).b());
                    if (!c1.c())
                    {
                        p.df.a.a("GoogleInApp", (new StringBuilder()).append("ERROR: Problem setting up In-app Billing: ").append(c1).toString());
                        return;
                    } else
                    {
                        p.df.a.a("GoogleInApp", "IapHelper setup complete");
                        (new p.cm.s()).execute(new Void[0]);
                        return;
                    }
                }

            
            {
                a = c.this;
                super();
            }
            });
            return;
        } else
        {
            (new p.cm.s()).execute(new Void[0]);
            return;
        }
    }

    public void a(boolean flag)
    {
        p.df.a.a("GoogleInApp", (new StringBuilder()).append("setRequestLock: ").append(flag).toString());
        c = flag;
    }

    public boolean a(int i1, int j1, Intent intent)
    {
        a(false);
        StringBuilder stringbuilder = (new StringBuilder()).append("handleActivityResult: ").append(i1).append(j1);
        String s1;
        if (intent == null)
        {
            s1 = null;
        } else
        {
            s1 = intent.getDataString();
        }
        p.df.a.a("GoogleInApp", stringbuilder.append(s1).toString());
        return g.a(i1, j1, intent);
    }

    public boolean a(p.cc.e e1)
    {
        p.df.a.a("GoogleInApp", "Calling consume sync");
        try
        {
            g.a(e1);
        }
        catch (p.cc.a a1)
        {
            p.df.a.a("GoogleInApp", (new StringBuilder()).append("Consume failed for: ").append(e1).toString());
            return false;
        }
        return true;
    }

    public void b()
    {
        p.df.a.a("GoogleInApp", "Initing");
        a(false);
        f = false;
        com.pandora.android.provider.b.a.b().b(this);
    }

    public void b(Activity activity)
    {
        this;
        JVM INSTR monitorenter ;
        b = activity;
        if (e()) goto _L2; else goto _L1
_L1:
        p.df.a.a("GoogleInApp", "inApp is not supported");
        s.e(activity);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        activity = new PandoraIntentFilter();
        activity.a("get_usage_result");
        if (!c)
        {
            a(true);
            com.pandora.android.provider.b.a.C().a(new BroadcastReceiver() {

                final c a;

                public void onReceive(Context context, Intent intent)
                {
label0:
                    {
                        context = intent.getAction();
                        if (PandoraIntent.a("get_usage_result").equals(context))
                        {
                            com.pandora.android.provider.b.a.C().a(this);
                            boolean flag = intent.getBooleanExtra("intent_is_capped", false);
                            p.df.a.a("GoogleInApp", (new StringBuilder()).append("purchaseEndOfMonthFromGoogle isCapped: ").append(flag).toString());
                            if (!flag)
                            {
                                break label0;
                            }
                            context = com.pandora.android.iap.c.e(a);
                            intent = com.pandora.android.provider.b.a.d().d();
                            p.df.a.a("GoogleInApp", "Launching purchase flow");
                            a a1 = new a(this, com.pandora.android.iap.c.a(a), context) {

                                final _cls2 a;

                                protected void a(p.cc.e e1)
                                {
                                    p.df.a.a("GoogleInApp", "Sending P2P to backend");
                                    a.a.c(e1);
                                }

            
            {
                a = _pcls2;
                super(activity, s1);
            }
                            };
                            com.pandora.android.iap.c.d(a).a(com.pandora.android.iap.c.a(a), context, "inapp", 130, a1, intent);
                        }
                        return;
                    }
                    s.d(com.pandora.android.iap.c.a(a));
                }

            
            {
                a = c.this;
                super();
            }
            }, activity);
            (new q()).execute(new Object[] {
                (Void)null
            });
        }
        if (true) goto _L4; else goto _L3
_L3:
        activity;
        throw activity;
    }

    public void b(p.cc.e e1)
    {
        (new aa()).execute(new Object[] {
            e1
        });
    }

    public String c()
    {
        return i;
    }

    public void c(p.cc.e e1)
    {
        (new z()).execute(new Object[] {
            e1
        });
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }

    public String d()
    {
        return j;
    }

    public boolean e()
    {
        return f;
    }

    public boolean f()
    {
        p.df.a.a("GoogleInApp", "Query inventory...");
        Object obj;
        obj = g.a(false, null, null);
        a(((d) (obj)));
        if (!((d) (obj)).b(i)) goto _L2; else goto _L1
_L1:
        d = ((d) (obj)).a(i);
        p.df.a.a("GoogleInApp", (new StringBuilder()).append("Account owns monthly sub: ").append(d).toString());
_L7:
        if (!((d) (obj)).b(j)) goto _L4; else goto _L3
_L3:
        p.df.a.a("GoogleInApp", "Account owns P2P item");
        e = ((d) (obj)).a(j);
        PandoraIntentFilter pandoraintentfilter = new PandoraIntentFilter();
        pandoraintentfilter.a("get_usage_result");
        com.pandora.android.provider.b.a.C().a(new BroadcastReceiver() {

            final c a;

            public void onReceive(Context context, Intent intent)
            {
                context = intent.getAction();
                if (PandoraIntent.a("get_usage_result").equals(context))
                {
                    com.pandora.android.provider.b.a.C().a(this);
                    if (intent.getBooleanExtra("intent_is_capped", false) && com.pandora.android.iap.c.a(a, c.g(a).d()) && c.g(a).e() == 0)
                    {
                        p.df.a.a("GoogleInApp", "Provisioning capped p2p owner...");
                        com.pandora.android.iap.f.a();
                        a.c(c.g(a));
                    }
                }
            }

            
            {
                a = c.this;
                super();
            }
        }, pandoraintentfilter);
        (new q()).execute(new Object[] {
            (Void)null
        });
_L8:
        Object obj1 = ((d) (obj)).c("inapp");
        if (obj1 == null) goto _L6; else goto _L5
_L5:
        k.clear();
        obj1 = ((List) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            p.cc.e e1 = ((d) (obj)).a((String)((Iterator) (obj1)).next());
            if (e1.e() == 0)
            {
                k.put(e1.c(), e1);
            }
        } while (true);
          goto _L6
_L9:
        h();
        return true;
_L2:
        p.df.a.a("GoogleInApp", "Account does not own monthly sub");
        d = null;
          goto _L7
_L4:
        p.df.a.a("GoogleInApp", "Account does not own a P2P");
        e = null;
          goto _L8
_L6:
label0:
        {
            if (!((d) (obj)).b("android.test.purchased"))
            {
                break label0;
            }
            p.df.a.a("GoogleInApp", "Account owns test item");
            obj = ((d) (obj)).a("android.test.purchased");
            g.a(((p.cc.e) (obj)), a);
        }
          goto _L9
        try
        {
            p.df.a.a("GoogleInApp", "Account does not own test item");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            p.df.a.a("GoogleInApp", (new StringBuilder()).append("ERROR: queryInventory: ").append(((p.cc.a) (obj)).getMessage()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            p.df.a.a("GoogleInApp", (new StringBuilder()).append("ERROR: queryInventory: ").append(((IllegalStateException) (obj)).getMessage()).toString());
        }
          goto _L9
    }

    public boolean g()
    {
        return d != null;
    }

    public void onInAppSubscriptionData(v v1)
    {
        p.df.a.a("GoogleInApp", "onInAppSubscriptionData");
        a(v1.a);
    }
}
