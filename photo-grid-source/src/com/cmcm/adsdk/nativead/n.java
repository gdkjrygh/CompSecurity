// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.nativead;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.cleanmaster.ui.app.market.Ad;
import com.cmcm.adsdk.b.c.b;
import com.cmcm.adsdk.c.d;
import com.picksinit.PicksMob;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.cmcm.adsdk.nativead:
//            d, q, r, e, 
//            o, h, p

public abstract class n extends com.cmcm.adsdk.nativead.d
{

    protected Ad c;
    protected View d;
    protected q e;
    protected List f;
    protected e g;
    protected h h;
    protected Context i;
    protected String j;
    protected boolean k;
    protected boolean l;
    protected boolean m;
    private r n;
    private boolean o;

    public n(Context context, String s1, Ad ad, h h1)
    {
        k = false;
        l = false;
        m = false;
        n = null;
        o = false;
        i = context;
        j = s1;
        h = h1;
        c = ad;
        f = new ArrayList();
    }

    private void a(View view, List list)
    {
        com.cmcm.adsdk.b.c.b.a("CMPicksNativeAd", "registerView");
        if (view != null)
        {
            if (list.size() == 0)
            {
                com.cmcm.adsdk.b.c.b.a("CMPicksNativeAd", "clickableViews is  empty");
                return;
            }
            if (d != null && d != null)
            {
                View view1;
                for (Iterator iterator = f.iterator(); iterator.hasNext(); view1.setOnTouchListener(null))
                {
                    view1 = (View)iterator.next();
                    view1.setOnClickListener(null);
                }

                f.clear();
                com.cmcm.adsdk.b.c.b.a("CMPicksNativeAd", (new StringBuilder("unregisterView")).append(d.hashCode()).toString());
                d.setOnClickListener(null);
                d.setOnTouchListener(null);
                q();
                s();
                d = null;
            }
            e = new q(this, (byte)0);
            d = view;
            for (view = list.iterator(); view.hasNext(); list.setOnTouchListener(e))
            {
                list = (View)view.next();
                f.add(list);
                list.setOnClickListener(e);
            }

            if (m)
            {
                com.cmcm.adsdk.b.c.b.a("CMPicksNativeAd", "ignore view has on screen, report show");
                l();
                return;
            }
            com.cmcm.adsdk.b.c.b.a("CMPicksNativeAd", "check view has on screen and report show");
            r();
            com.cmcm.adsdk.b.c.b.a("CMPicksNativeAd", (new StringBuilder("has report show ?:")).append(a).toString());
            if (!a)
            {
                if (!com.cmcm.adsdk.c.d.a(i))
                {
                    com.cmcm.adsdk.b.c.b.a("CMPicksNativeAd", "lock screen,cancel schedule check view");
                    s();
                }
                com.cmcm.adsdk.b.c.b.a("CMPicksNativeAd", "register screen receiver");
                n = new r(this, (byte)0);
                view = new IntentFilter();
                view.addAction("android.intent.action.SCREEN_ON");
                view.addAction("android.intent.action.SCREEN_OFF");
                view.addAction("android.intent.action.USER_PRESENT");
                i.getApplicationContext().registerReceiver(n, view);
                return;
            }
        }
    }

    static void a(n n1)
    {
        n1.r();
    }

    private void a(List list, View view)
    {
        list.add(view);
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            for (int i1 = 0; i1 < view.getChildCount(); i1++)
            {
                a(list, view.getChildAt(i1));
            }

        }
    }

    static void b(n n1)
    {
        n1.q();
    }

    static void c(n n1)
    {
        n1.s();
    }

    static boolean d(n n1)
    {
        boolean flag1 = true;
        if (n1.d == null || n1.d.getVisibility() != 0 || n1.d.getParent() == null) goto _L2; else goto _L1
_L1:
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 11 && n1.d.getAlpha() <= 0.9F)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (flag) goto _L3; else goto _L2
_L2:
        flag1 = false;
_L5:
        return flag1;
_L3:
        Rect rect;
        int i1;
        rect = new Rect();
        if (!n1.d.getGlobalVisibleRect(rect))
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = rect.width();
        if ((double)(rect.height() * i1) >= ((double)(n1.d.getWidth() * n1.d.getHeight()) * 10D) / 100D) goto _L5; else goto _L4
_L4:
        return false;
    }

    static boolean e(n n1)
    {
        n1.o = true;
        return true;
    }

    static boolean f(n n1)
    {
        return n1.o;
    }

    private void q()
    {
        if (n != null && i != null)
        {
            com.cmcm.adsdk.b.c.b.a("CMPicksNativeAd", "unregister screen receiver");
            i.getApplicationContext().unregisterReceiver(n);
            n = null;
        }
    }

    private void r()
    {
        com.cmcm.adsdk.b.c.b.a("CMPicksNativeAd", "schedule check view impression");
        g = new e(new o(this));
        g.a();
    }

    private void s()
    {
        com.cmcm.adsdk.b.c.b.a("CMPicksNativeAd", "cancel schedule check view impression");
        if (g != null)
        {
            g.b();
            g = null;
        }
    }

    public abstract void a(Context context);

    public final void a(View view)
    {
        ArrayList arraylist = new ArrayList();
        a(((List) (arraylist)), view);
        a(view, ((List) (arraylist)));
    }

    public final void a(boolean flag)
    {
        l = flag;
    }

    public final void b(boolean flag)
    {
        m = flag;
    }

    public abstract boolean b(Context context);

    public final String c()
    {
        return "cm";
    }

    public final String d()
    {
        if (c != null)
        {
            return c.getTitle();
        } else
        {
            return null;
        }
    }

    public final String e()
    {
        if (c != null)
        {
            return c.getBackground();
        } else
        {
            return null;
        }
    }

    public final String f()
    {
        if (c != null)
        {
            return c.getPicUrl();
        } else
        {
            return null;
        }
    }

    public final String g()
    {
        if (c != null)
        {
            return c.getButtonTxt();
        } else
        {
            return null;
        }
    }

    public final String h()
    {
        if (c != null)
        {
            return c.getDesc();
        } else
        {
            return null;
        }
    }

    public final boolean i()
    {
        return !c.isAvailAble();
    }

    public final boolean j()
    {
        return false;
    }

    public abstract void k();

    public final void l()
    {
        StringBuilder stringbuilder = (new StringBuilder("picks ad handleImpression,title:")).append(d()).append(",this ad is new or has setReUseAd:");
        boolean flag;
        if (!a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.cmcm.adsdk.b.c.b.a("CMPicksNativeAd", stringbuilder.append(flag).toString());
        if (!a)
        {
            PicksMob.getInstance().showReport(i, j, c);
            a = true;
        }
    }

    public final void m()
    {
        com.cmcm.adsdk.b.c.b.a("CMPicksNativeAd", (new StringBuilder("ad title:")).append(c.getTitle()).append("isInstalled:").append(c.isInstalled()).toString());
        com.cmcm.adsdk.b.c.b.a("CMPicksNativeAd", "CMPicks handleClick");
        h.b(this);
        if (k)
        {
            return;
        }
        com.cmcm.adsdk.b.c.b.a("CMPicksNativeAd", "startLoading V");
        if (b == null) goto _L2; else goto _L1
_L1:
        com.cmcm.adsdk.b.c.b.a("CMPicksNativeAd", "mInnerClickListener !=null");
        p();
        k = true;
_L4:
        PicksMob.getInstance().onClickAdNoDialog(i, j, c, new p(this));
        return;
_L2:
        com.cmcm.adsdk.b.c.b.a("CMPicksNativeAd", (new StringBuilder("currentStatus=")).append(o).toString());
        if (!o && p())
        {
            a(i);
            k = true;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean n()
    {
        if (!i())
        {
            if (c.isDeepLink())
            {
                com.cmcm.adsdk.b.c.b.a("CMPicksNativeAd", "ad is deeplink");
                return true;
            }
            if (!com.cmcm.adsdk.c.d.a(i, c.getPkg()) && !c.isSubjectAd() && !c.isInstalled() && !c.isOpenInternal() && c.getAppShowType() != 50008)
            {
                return true;
            }
        }
        return false;
    }

    public final boolean o()
    {
        return c.getPriority() == 1;
    }

    public final boolean p()
    {
        return c.getMtType() == 8;
    }
}
