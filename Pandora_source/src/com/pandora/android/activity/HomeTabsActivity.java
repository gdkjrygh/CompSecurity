// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.graphics.Point;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.h;
import android.support.v4.app.k;
import android.support.v4.app.n;
import android.support.v4.content.f;
import android.support.v4.content.j;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import com.pandora.android.data.a;
import com.pandora.android.provider.b;
import com.pandora.android.util.ReclickableTabHost;
import com.pandora.android.util.af;
import com.pandora.android.util.p;
import com.pandora.android.util.q;
import com.pandora.android.util.s;
import com.pandora.radio.data.SearchDescriptor;
import com.pandora.radio.data.y;
import com.pandora.radio.provider.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p.ca.ac;
import p.ca.ad;
import p.ca.ak;
import p.ca.ap;
import p.ca.r;
import p.ca.x;
import p.cw.c;
import p.dd.ag;
import p.dd.av;
import p.dd.az;

// Referenced classes of package com.pandora.android.activity:
//            BaseAdFragmentActivity, i, h, c, 
//            f, g, PandoraIntent, e, 
//            PandoraIntentFilter, a

public class HomeTabsActivity extends BaseAdFragmentActivity
    implements com.pandora.android.activity.i, com.pandora.android.util.ReclickableTabHost.a
{
    private static interface a
    {

        public abstract void a(x x1);
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        private static final b g[];
        final com.pandora.android.activity.f e;
        final p f;

        public static b valueOf(String s1)
        {
            return (b)Enum.valueOf(com/pandora/android/activity/HomeTabsActivity$b, s1);
        }

        public static b[] values()
        {
            return (b[])g.clone();
        }

        static 
        {
            a = new b("STATIONS", 0, p.ca.ap.f(), p.a);
            b = new b("FEED", 1, p.ca.r.e(), p.j);
            c = new b("PROFILE", 2, p.ca.ad.n_(), p.l);
            d = new b("SETTINGS", 3, p.ca.ak.f(), p.r);
            g = (new b[] {
                a, b, c, d
            });
        }

        private b(String s1, int i1, f f1, p p1)
        {
            super(s1, i1);
            e = f1;
            f = p1;
        }
    }

    public static interface c
    {

        public abstract void a(int i1);

        public abstract void a(Fragment fragment, int i1);

        public abstract void b(int i1);
    }

    public static class d extends Handler
    {

        private final WeakReference a;

        public void handleMessage(Message message)
        {
            if ((HomeTabsActivity)a.get() == null)
            {
                return;
            }
            switch (message.what)
            {
            default:
                super.handleMessage(message);
                return;

            case 123: // '{'
                ((Runnable)message.obj).run();
                break;
            }
        }

        public d(HomeTabsActivity hometabsactivity)
        {
            a = new WeakReference(hometabsactivity);
        }
    }

    private static class e
        implements Runnable
    {

        private Intent a;
        private com.pandora.android.coachmark.e b;
        private int c;
        private WeakReference d;

        public void run()
        {
            if (a.getBooleanExtra("showCoachmark", false)) goto _L2; else goto _L1
_L1:
            return;
_L2:
            com.pandora.android.coachmark.e.e e1 = (com.pandora.android.coachmark.e.e)Enum.valueOf(com/pandora/android/coachmark/e$e, a.getStringExtra("showCoachmarkType"));
            static class _cls5
            {

                static final int a[];
                static final int b[];
                static final int c[];
                static final int d[];

                static 
                {
                    d = new int[com.pandora.android.coachmark.e.e.values().length];
                    try
                    {
                        d[com.pandora.android.coachmark.e.e.d.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror40) { }
                    try
                    {
                        d[com.pandora.android.coachmark.e.e.q.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror39) { }
                    c = new int[p.cw.b.a.values().length];
                    try
                    {
                        c[p.cw.b.a.a.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror38) { }
                    try
                    {
                        c[p.cw.b.a.e.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror37) { }
                    try
                    {
                        c[p.cw.b.a.c.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror36) { }
                    try
                    {
                        c[p.cw.b.a.d.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror35) { }
                    try
                    {
                        c[p.cw.b.a.b.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror34) { }
                    b = new int[b.values().length];
                    try
                    {
                        b[com.pandora.android.activity.b.a.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror33) { }
                    try
                    {
                        b[com.pandora.android.activity.b.b.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror32) { }
                    try
                    {
                        b[com.pandora.android.activity.b.c.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror31) { }
                    try
                    {
                        b[b.d.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror30) { }
                    a = new int[com.pandora.android.util.p.values().length];
                    try
                    {
                        a[p.j.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror29) { }
                    try
                    {
                        a[p.k.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror28) { }
                    try
                    {
                        a[p.n.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror27) { }
                    try
                    {
                        a[p.m.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror26) { }
                    try
                    {
                        a[p.q.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror25) { }
                    try
                    {
                        a[p.p.ordinal()] = 6;
                    }
                    catch (NoSuchFieldError nosuchfielderror24) { }
                    try
                    {
                        a[p.o.ordinal()] = 7;
                    }
                    catch (NoSuchFieldError nosuchfielderror23) { }
                    try
                    {
                        a[p.l.ordinal()] = 8;
                    }
                    catch (NoSuchFieldError nosuchfielderror22) { }
                    try
                    {
                        a[p.u.ordinal()] = 9;
                    }
                    catch (NoSuchFieldError nosuchfielderror21) { }
                    try
                    {
                        a[p.r.ordinal()] = 10;
                    }
                    catch (NoSuchFieldError nosuchfielderror20) { }
                    try
                    {
                        a[p.s.ordinal()] = 11;
                    }
                    catch (NoSuchFieldError nosuchfielderror19) { }
                    try
                    {
                        a[p.t.ordinal()] = 12;
                    }
                    catch (NoSuchFieldError nosuchfielderror18) { }
                    try
                    {
                        a[p.v.ordinal()] = 13;
                    }
                    catch (NoSuchFieldError nosuchfielderror17) { }
                    try
                    {
                        a[p.w.ordinal()] = 14;
                    }
                    catch (NoSuchFieldError nosuchfielderror16) { }
                    try
                    {
                        a[p.z.ordinal()] = 15;
                    }
                    catch (NoSuchFieldError nosuchfielderror15) { }
                    try
                    {
                        a[p.x.ordinal()] = 16;
                    }
                    catch (NoSuchFieldError nosuchfielderror14) { }
                    try
                    {
                        a[p.y.ordinal()] = 17;
                    }
                    catch (NoSuchFieldError nosuchfielderror13) { }
                    try
                    {
                        a[p.A.ordinal()] = 18;
                    }
                    catch (NoSuchFieldError nosuchfielderror12) { }
                    try
                    {
                        a[p.a.ordinal()] = 19;
                    }
                    catch (NoSuchFieldError nosuchfielderror11) { }
                    try
                    {
                        a[p.b.ordinal()] = 20;
                    }
                    catch (NoSuchFieldError nosuchfielderror10) { }
                    try
                    {
                        a[p.c.ordinal()] = 21;
                    }
                    catch (NoSuchFieldError nosuchfielderror9) { }
                    try
                    {
                        a[p.d.ordinal()] = 22;
                    }
                    catch (NoSuchFieldError nosuchfielderror8) { }
                    try
                    {
                        a[p.e.ordinal()] = 23;
                    }
                    catch (NoSuchFieldError nosuchfielderror7) { }
                    try
                    {
                        a[p.f.ordinal()] = 24;
                    }
                    catch (NoSuchFieldError nosuchfielderror6) { }
                    try
                    {
                        a[p.h.ordinal()] = 25;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        a[p.i.ordinal()] = 26;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        a[p.E.ordinal()] = 27;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        a[p.D.ordinal()] = 28;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[p.B.ordinal()] = 29;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[p.C.ordinal()] = 30;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls5.d[e1.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                if (com.pandora.android.coachmark.e.f())
                {
                    Object obj = (HomeTabsActivity)d.get();
                    if (obj != null)
                    {
                        obj = ((HomeTabsActivity) (obj)).findViewById(c);
                        com.pandora.android.util.q.a(b, ((View) (obj)));
                        return;
                    }
                }
                break;

            case 2: // '\002'
                SearchDescriptor searchdescriptor = (SearchDescriptor)a.getParcelableExtra("intent_search_descriptor");
                com.pandora.android.util.q.a(b, searchdescriptor.e());
                return;
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

        private e(Intent intent, com.pandora.android.coachmark.e e1, HomeTabsActivity hometabsactivity, int i1)
        {
            a = intent;
            b = e1;
            c = i1;
            d = new WeakReference(hometabsactivity);
        }

    }


    private static int R[] = {
        0x7f100015
    };
    private g A;
    private h B;
    private View C;
    private com.pandora.android.activity.h D;
    private LinkedHashSet E;
    private long F;
    private d G;
    private FrameLayout H;
    private View I;
    private int J;
    private boolean K;
    private ViewGroup L;
    private MenuItem M;
    private boolean N;
    private boolean O;
    private x P;
    private android.support.v4.app.n.a Q;
    private c S;
    private android.support.v4.app.h.b T;
    p.cw.b.a o;
    private ReclickableTabHost p;
    private ViewPager z;

    public HomeTabsActivity()
    {
        J = r();
        N = false;
        O = false;
        P = null;
        Q = new android.support.v4.app.n.a() {

            final HomeTabsActivity a;

            public void a(android.support.v4.content.i i1, Cursor cursor)
            {
                boolean flag = false;
                int j1;
                if (cursor != null)
                {
                    j1 = cursor.getCount();
                } else
                {
                    j1 = 0;
                }
                i1 = com.pandora.android.activity.HomeTabsActivity.a(a);
                if (j1 > 0)
                {
                    flag = true;
                }
                i1.a(flag);
            }

            public android.support.v4.content.i onCreateLoader(int i1, Bundle bundle)
            {
                bundle = a;
                Uri uri = com.pandora.android.inbox.b.a;
                String s1 = (new StringBuilder()).append(com.pandora.android.inbox.b.r).append(" AND ").append(com.pandora.android.inbox.b.q).toString();
                return new f(bundle, uri, new String[] {
                    "isSeen"
                }, s1, null, null);
            }

            public void onLoadFinished(android.support.v4.content.i i1, Object obj)
            {
                a(i1, (Cursor)obj);
            }

            public void onLoaderReset(android.support.v4.content.i i1)
            {
                com.pandora.android.activity.HomeTabsActivity.a(a).a(false);
            }

            
            {
                a = HomeTabsActivity.this;
                super();
            }
        };
        S = new c() {

            final HomeTabsActivity a;
            private b b[];

            public void a(int i1)
            {
                Fragment fragment = b[i1].e.a;
                if (fragment != null)
                {
                    com.pandora.android.activity.HomeTabsActivity.a(a, new a(this, fragment) {

                        final Fragment a;
                        final _cls3 b;

                        public void a(x x1)
                        {
                            boolean flag;
                            if (a == x1)
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                            x1.b(flag);
                        }

            
            {
                b = _pcls3;
                a = fragment;
                super();
            }
                    });
                }
            }

            public void a(Fragment fragment, int i1)
            {
                b[i1].e.a = fragment;
                HomeTabsActivity.e(a).b();
                a.R();
            }

            public void b(int i1)
            {
                com.pandora.android.activity.HomeTabsActivity.a(a, true);
                a.f((new StringBuilder()).append("homeTab Changed to (pending): ").append(b[i1].e.b).toString());
                com.pandora.android.activity.HomeTabsActivity.b(a);
                com.pandora.android.provider.b.a.b().f().b();
                Object obj = b[i1].e;
                a.f((new StringBuilder()).append("homeTab Changed to (actual): ").append(((com.pandora.android.activity.f) (obj)).b).toString());
                a.v();
                com.pandora.android.activity.HomeTabsActivity.c(a).removeMessages(123);
                obj = new Runnable(this, ((com.pandora.android.activity.f) (obj))) {

                    final com.pandora.android.activity.f a;
                    final _cls3 b;

                    public void run()
                    {
                        x x1 = (x)a.a;
                        com.pandora.android.activity.HomeTabsActivity.a(b.a, x1, true);
                        x1.b(a.a(false));
                        if (HomeTabsActivity.d(b.a) != null)
                        {
                            b.a.a(HomeTabsActivity.d(b.a), true);
                            com.pandora.android.activity.HomeTabsActivity.a(b.a, null);
                        }
                    }

            
            {
                b = _pcls3;
                a = f1;
                super();
            }
                };
                obj = com.pandora.android.activity.HomeTabsActivity.c(a).obtainMessage(123, obj);
                com.pandora.android.activity.HomeTabsActivity.c(a).sendMessageDelayed(((Message) (obj)), 250L);
                a.ae();
                a.af();
            }

            
            {
                a = HomeTabsActivity.this;
                super();
                b = b.values();
            }
        };
        T = new android.support.v4.app.h.b() {

            final HomeTabsActivity a;

            public void a()
            {
                a.f((new StringBuilder()).append("onBackStackChanged, current count: ").append(com.pandora.android.activity.HomeTabsActivity.f(a).e()).toString());
                if (com.pandora.android.activity.HomeTabsActivity.f(a).e() <= 0)
                {
                    HomeTabsActivity.g(a).setVisibility(8);
                    com.pandora.android.activity.HomeTabsActivity.h(a).setVisibility(0);
                    k k1 = com.pandora.android.activity.HomeTabsActivity.f(a).a();
                    Fragment fragment = com.pandora.android.activity.HomeTabsActivity.a(a).d();
                    k1.c(fragment);
                    k1.b();
                    com.pandora.android.activity.HomeTabsActivity.a(a, (x)fragment, false);
                } else
                {
                    com.pandora.android.activity.HomeTabsActivity.h(a).setVisibility(8);
                    HomeTabsActivity.g(a).setVisibility(0);
                }
                a.ae();
                a.af();
                a.invalidateOptionsMenu();
            }

            
            {
                a = HomeTabsActivity.this;
                super();
            }
        };
        D = new com.pandora.android.activity.h();
    }

    private b a(p p1)
    {
        if (p1 != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        switch (com.pandora.android.activity._cls5.a[p1.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
        case 2: // '\002'
            return com.pandora.android.activity.b.b;

        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
            return com.pandora.android.activity.b.c;

        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
            return b.d;

        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
        case 24: // '\030'
        case 25: // '\031'
        case 26: // '\032'
            return com.pandora.android.activity.b.a;

        case 27: // '\033'
        case 28: // '\034'
        case 29: // '\035'
        case 30: // '\036'
            break;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    static g a(HomeTabsActivity hometabsactivity)
    {
        return hometabsactivity.A;
    }

    static x a(HomeTabsActivity hometabsactivity, x x1)
    {
        hometabsactivity.P = x1;
        return x1;
    }

    private void a(int i1, boolean flag)
    {
        if (E == null)
        {
            f((new StringBuilder()).append("setActionVisibility called, menu items have not been setup. menuItemId = ").append(i1).toString());
            return;
        }
        for (Iterator iterator = E.iterator(); iterator.hasNext();)
        {
            com.pandora.android.data.a a1 = (com.pandora.android.data.a)iterator.next();
            if (a1.b == i1)
            {
                if (a1.c != null)
                {
                    a1.c.setVisible(flag);
                    return;
                } else
                {
                    f((new StringBuilder()).append("setActionVisibility called, but menu item is null").append(a1.toString()).toString());
                    return;
                }
            }
        }

        f((new StringBuilder()).append("setActionVisibility called, but menu item not found. menuItemId = ").append(i1).toString());
    }

    public static void a(Activity activity)
    {
        Bundle bundle = new Bundle(3);
        bundle.putBoolean("intent_show_force_screen", true);
        bundle.putSerializable("intent_page_name", p.c);
        a(activity, bundle);
    }

    public static void a(Activity activity, Bundle bundle)
    {
        com.pandora.android.activity.c.a().a(activity, com/pandora/android/activity/HomeTabsActivity, 0x24000000, bundle);
    }

    private void a(a a1)
    {
        for (Iterator iterator = D.a().iterator(); iterator.hasNext();)
        {
            x x1 = (x)iterator.next();
            try
            {
                a1.a(x1);
            }
            catch (Exception exception)
            {
                a("doToFragmentAction.run", exception);
            }
        }

    }

    static void a(HomeTabsActivity hometabsactivity, a a1)
    {
        hometabsactivity.a(a1);
    }

    static void a(HomeTabsActivity hometabsactivity, x x1, boolean flag)
    {
        hometabsactivity.b(x1, flag);
    }

    private void a(p.cw.b.a a1)
    {
        com.pandora.android.activity._cls5.c[a1.ordinal()];
        JVM INSTR tableswitch 1 5: default 44
    //                   1 72
    //                   2 72
    //                   3 91
    //                   4 91
    //                   5 158;
           goto _L1 _L2 _L2 _L3 _L3 _L4
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("updateNowPlayingIcon: unknown state ").append(a1).toString());
_L2:
        if (M != null)
        {
            M.setVisible(false);
        }
_L6:
        return;
_L3:
        if (M != null)
        {
            a1 = M.getActionView();
            if (a1 != null)
            {
                a1 = (ImageView)a1.findViewById(0x7f1001cb);
                a1.setImageResource(0x7f020132);
                M.setActionView(a1);
                M.setVisible(true);
                return;
            } else
            {
                invalidateOptionsMenu();
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (M != null)
        {
            a1 = M.getActionView();
            if (a1 != null)
            {
                a1 = (ImageView)a1.findViewById(0x7f1001cb);
                a1.setImageResource(0x7f020220);
                ((AnimationDrawable)a1.getDrawable()).start();
                M.setActionView(a1);
                M.setVisible(true);
                return;
            } else
            {
                invalidateOptionsMenu();
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    static boolean a(HomeTabsActivity hometabsactivity, boolean flag)
    {
        hometabsactivity.K = flag;
        return flag;
    }

    public static String[] aj()
    {
        b ab1[] = b.values();
        String as[] = new String[ab1.length];
        for (int i1 = 0; i1 < ab1.length; i1++)
        {
            as[i1] = ab1[i1].e.b;
        }

        return as;
    }

    private r ak()
    {
        return (r)A.a(A.f(com.pandora.android.activity.b.b.ordinal()));
    }

    private b al()
    {
        return b.values()[A.e(p.getCurrentTab())];
    }

    private void am()
    {
        if (p != null)
        {
            ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(p.getApplicationWindowToken(), 0);
        }
    }

    private boolean an()
    {
        boolean flag1 = true;
        if (E == null)
        {
            flag1 = false;
        } else
        {
            for (Iterator iterator = E.iterator(); iterator.hasNext(); ((com.pandora.android.data.a)iterator.next()).c.setVisible(false)) { }
            com.pandora.android.data.a aa1[] = b.values()[al().ordinal()].e.a(this, false);
            int k1 = aa1.length;
            int i1 = 0;
            boolean flag = false;
            while (i1 < k1) 
            {
                com.pandora.android.data.a a1 = aa1[i1];
                if (a1.b == 0x7f10000f)
                {
                    flag = true;
                }
                if (g(a1.b))
                {
                    a1.c.setVisible(true);
                } else
                {
                    int l1 = aa1.length;
                    int j1 = 0;
                    while (j1 < l1) 
                    {
                        if (aa1[j1].b == a1.b)
                        {
                            a1.c.setVisible(true);
                        }
                        j1++;
                    }
                }
                i1++;
            }
            if (flag)
            {
                a(o);
                return true;
            }
        }
        return flag1;
    }

    private void ao()
    {
        if (!ap().d())
        {
            I.setVisibility(8);
            return;
        } else
        {
            I.setVisibility(0);
            return;
        }
    }

    private i ap()
    {
        return com.pandora.android.provider.b.a.b().y();
    }

    public static void b(Activity activity)
    {
        Bundle bundle = new Bundle();
        bundle.putSerializable("intent_page_name", p.m);
        a(activity, bundle);
    }

    public static void b(Activity activity, Bundle bundle)
    {
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle(4);
        }
        bundle1.putBoolean("intent_show_force_screen", true);
        bundle1.putSerializable("intent_page_name", p.d);
        bundle1.putBoolean("intent_search_add_variety", true);
        a(activity, bundle1);
    }

    static void b(HomeTabsActivity hometabsactivity)
    {
        hometabsactivity.am();
    }

    private void b(x x1, boolean flag)
    {
        f(String.format("notifyNewTop: %s (fromTabClick=%b)", new Object[] {
            x1.getClass().getName(), Boolean.valueOf(flag)
        }));
        d(true);
        Iterator iterator = D.a().iterator();
        while (iterator.hasNext()) 
        {
            x x2 = (x)iterator.next();
            boolean flag1;
            if (x1 == x2)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            x2.a(flag1, flag);
        }
        H();
    }

    public static boolean b(String s1)
    {
        try
        {
            s1 = c(s1);
            com.pandora.android.provider.b.a.C().a(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            return false;
        }
        return true;
    }

    private static Intent c(String s1)
        throws RuntimeException
    {
        PandoraIntent pandoraintent;
        pandoraintent = new PandoraIntent("show_page");
        pandoraintent.putExtra("intent_show_force_screen", true);
        pandoraintent.setFlags(0x24000000);
        p p1 = com.pandora.android.data.n.a.valueOf(s1).a();
        Object obj = p1;
        if (p1 == null)
        {
            try
            {
                throw new RuntimeException((new StringBuilder()).append(s1).append(" doesn't map to any valid PageName enum element").toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = g(s1);
            }
            if (obj == null)
            {
                throw new RuntimeException((new StringBuilder()).append("No mapping exists between screen '").append(s1).append("' and a HomeTab!").toString());
            }
            obj = ((b) (obj)).f;
        }
        return pandoraintent.putExtra("intent_page_name", ((java.io.Serializable) (obj)));
    }

    static d c(HomeTabsActivity hometabsactivity)
    {
        return hometabsactivity.G;
    }

    public static void c(Activity activity, Bundle bundle)
    {
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle(2);
        }
        bundle1.putSerializable("intent_page_name", p.a);
        bundle1.putSerializable("intent_search_result_consumer", new com.pandora.radio.util.c(null));
        a(activity, bundle1);
    }

    private void c(Intent intent)
    {
        b b1;
        p p1;
        if (intent == null)
        {
            p.df.a.a("HomeTabsActivity", "HomeTabsActivity.handleIntent() --> Intent was null");
            return;
        }
        if (intent.getExtras() == null)
        {
            p.df.a.a("HomeTabsActivity", "HomeTabsActivity.handleIntent() --> Missing extras bundle");
            setIntent(null);
            return;
        }
        Bundle bundle = intent.getExtras();
        p.df.a.a("HomeTabsActivity", (new StringBuilder()).append("HomeTabsActivity.handleIntent() --> ").append(intent).append(", ").append(bundle.toString()).toString());
        p1 = (p)intent.getSerializableExtra("intent_page_name");
        b1 = a(p1);
        if (b1 == null)
        {
            p.df.a.a("HomeTabsActivity", "HomeTabsActivity.handleIntent() --> Missing or unrecognized INTENT_PAGE");
            setIntent(null);
            return;
        }
        boolean flag1 = intent.getBooleanExtra("intent_show_force_screen", false);
        boolean flag;
        long l1;
        if (F == 0L)
        {
            l1 = -1L;
        } else
        {
            l1 = System.currentTimeMillis() - F;
        }
        if (!flag1 && l1 > 0L && l1 < 8000L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            p.df.a.a("HomeTabsActivity", (new StringBuilder()).append("HomeTabsActivity.handleIntent() --> Ignore Tab change : ").append(b1).append(", forceScreen = ").append(flag1).append(", pauseTime = ").append(l1).toString());
            setIntent(null);
            return;
        }
        com.pandora.android.activity._cls5.b[b1.ordinal()];
        JVM INSTR tableswitch 1 4: default 280
    //                   1 334
    //                   2 359
    //                   3 399
    //                   4 410;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        p.df.a.a("HomeTabsActivity", (new StringBuilder()).append("HomeTabsActivity.handleIntent() --> Unhandled intent : ").append(intent).toString());
        throw new IllegalArgumentException((new StringBuilder()).append("Invalid tab ").append(b1).toString());
_L2:
        intent = com.pandora.android.activity.e.a(this, p1, intent);
_L7:
        a(b1, intent);
        setIntent(null);
        F = 0L;
        return;
_L3:
        x x1 = com.pandora.android.activity.e.b(this, p1, intent);
        if (p1 == p.j)
        {
            int i1 = intent.getIntExtra("intent_sub_page_name", 0);
            ak().a(i1);
            intent = x1;
        } else
        {
            intent = x1;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        intent = com.pandora.android.activity.e.c(this, p1, intent);
        continue; /* Loop/switch isn't completed */
_L5:
        intent = com.pandora.android.activity.e.d(this, p1, intent);
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void c(boolean flag)
    {
        am();
        if (!ag().c())
        {
            boolean flag1 = ad();
            if (flag1)
            {
                a("tabs_back_pressed", true);
            }
            if (!flag1 && !flag)
            {
                finish();
                return;
            }
        }
    }

    static x d(HomeTabsActivity hometabsactivity)
    {
        return hometabsactivity.P;
    }

    public static void d(Activity activity, Bundle bundle)
    {
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle(2);
        }
        bundle1.putSerializable("intent_page_name", p.f);
        bundle1.putBoolean("intent_show_force_screen", true);
        a(activity, bundle1);
    }

    static com.pandora.android.activity.h e(HomeTabsActivity hometabsactivity)
    {
        return hometabsactivity.D;
    }

    public static void e(Activity activity, Bundle bundle)
    {
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle(2);
            bundle1.putParcelable("intent_search_results", null);
        }
        bundle1.putSerializable("intent_page_name", p.b);
        a(activity, bundle1);
    }

    static h f(HomeTabsActivity hometabsactivity)
    {
        return hometabsactivity.B;
    }

    static View g(HomeTabsActivity hometabsactivity)
    {
        return hometabsactivity.C;
    }

    private static b g(String s1)
    {
        b ab1[] = b.values();
        int j1 = ab1.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            b b1 = ab1[i1];
            if (b1.e.b.equalsIgnoreCase(s1))
            {
                return b1;
            }
        }

        p.df.a.a("HomeTabsActivity", (new StringBuilder()).append("HomeTabsActivity.getHomeTabByName(").append(s1).append(") --> invalid tab name. No such tab exists!").toString());
        return null;
    }

    private static boolean g(int i1)
    {
        boolean flag1 = false;
        int ai1[] = R;
        int k1 = ai1.length;
        int j1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (j1 < k1)
                {
                    if (ai1[j1] != i1)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            j1++;
        } while (true);
    }

    static ViewPager h(HomeTabsActivity hometabsactivity)
    {
        return hometabsactivity.z;
    }

    public static int r()
    {
        return 1;
    }

    protected PandoraIntentFilter B()
    {
        PandoraIntentFilter pandoraintentfilter = super.B();
        pandoraintentfilter.a("add_music_seed_success");
        pandoraintentfilter.a("delete_music_seed_success");
        return pandoraintentfilter;
    }

    public void N()
    {
    }

    protected boolean Q()
    {
        return false;
    }

    protected void a(Context context, Intent intent, String s1)
    {
        super.a(context, intent, s1);
        if (s1.equals(com.pandora.android.activity.PandoraIntent.a("add_music_seed_success")))
        {
            U();
            context = intent.getStringExtra("intent_station_token");
            Toast.makeText(this, getString(0x7f080079, new Object[] {
                intent.getStringExtra("intent_music_display_string"), ap().a(this, context).d()
            }), 1).show();
        } else
        if (s1.equals(com.pandora.android.activity.PandoraIntent.a("delete_music_seed_success")))
        {
            U();
            context = intent.getStringExtra("intent_station_token");
            Toast.makeText(this, getString(0x7f080135, new Object[] {
                intent.getStringExtra("intent_music_display_string"), ap().a(this, context).d()
            }), 1).show();
            return;
        }
    }

    void a(b b1, x x1)
    {
        v();
        if (b1 != al())
        {
            P = x1;
            p.setCurrentTab(A.f(b1.ordinal()));
        } else
        {
            if (!A.e())
            {
                P = x1;
                return;
            }
            if (x1 != null)
            {
                a(x1, true);
                return;
            }
        }
    }

    public void a(com.pandora.android.ads.h.b b1)
    {
    }

    public void a(com.pandora.android.ads.h.b b1, int i1, int j1, boolean flag, boolean flag1)
    {
        if (i1 == 0)
        {
            return;
        }
        ViewGroup viewgroup = p();
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)viewgroup.getLayoutParams();
        if (ag() instanceof r)
        {
            b1 = n();
            android.widget.RelativeLayout.LayoutParams layoutparams1 = (android.widget.RelativeLayout.LayoutParams)b1.getLayoutParams();
            layoutparams1.addRule(2, 0);
            b1.setLayoutParams(layoutparams1);
            layoutparams.setMargins(0, 0, 0, ((r)ag()).g());
            viewgroup.setLayoutParams(layoutparams);
            if (flag)
            {
                viewgroup.setBackgroundColor(0);
            } else
            if (m() == 1)
            {
                viewgroup.setBackgroundColor(0xff000000);
            } else
            {
                viewgroup.setBackgroundColor(0);
            }
            e(true);
            return;
        } else
        {
            layoutparams.setMargins(0, 0, 0, 0);
            viewgroup.setLayoutParams(layoutparams);
            super.a(b1, i1, j1, flag, flag1);
            return;
        }
    }

    public void a(String s1, boolean flag)
    {
        if (t())
        {
            super.a(s1, flag);
        }
    }

    public void a(x x1, boolean flag)
    {
        k k1 = B.a();
        k1.a(0, 0);
        Fragment fragment = (Fragment)x1;
        D.a(x1);
        k1.b(A.d());
        if (flag)
        {
            k1.a(0x7f050007, 0x7f050008);
        }
        k1.b(0x7f10019d, fragment, null);
        k1.a(0);
        k1.a(null);
        k1.b();
        B.b();
        b(x1, false);
    }

    protected boolean a(Context context, Intent intent)
    {
        for (Iterator iterator = D.a().iterator(); iterator.hasNext();)
        {
            if (((x)iterator.next()).a(intent))
            {
                return true;
            }
        }

        return super.a(context, intent);
    }

    protected Uri aa()
    {
        p p1 = (p)getIntent().getSerializableExtra("intent_page_name");
        if (p1 == p.t && a(p1) == b.d)
        {
            return (new android.net.Uri.Builder()).scheme("pandorav2").path("showPrivacySettings").build();
        } else
        {
            return super.aa();
        }
    }

    protected boolean ab()
    {
        return true;
    }

    public boolean ad()
    {
        if (B.e() <= 0)
        {
            return false;
        }
        if (D.g())
        {
            a("FinishFragment called but backstack is empty!!!", new Exception());
            return false;
        }
        Fragment fragment = D.d();
        B.d();
        if (ah())
        {
            b(D.f(), false);
        }
        k k1 = B.a();
        k1.a(0);
        k1.a(fragment);
        k1.b();
        return true;
    }

    public void ae()
    {
        x x1 = ag();
        if (x1 != null && ((Fragment)x1).isAdded())
        {
            setTitle(x1.d());
        }
        K = false;
    }

    public void af()
    {
        boolean flag = false;
        if (ag() != null)
        {
            flag = ag().i();
        }
        g(flag | ah());
    }

    public x ag()
    {
        if (D.e() > 0)
        {
            return D.f();
        } else
        {
            return (x)A.d();
        }
    }

    public boolean ah()
    {
        return D.e() > 0;
    }

    public ac ai()
    {
        x x1 = ag();
        if (x1 instanceof ac)
        {
            return (ac)x1;
        } else
        {
            return null;
        }
    }

    public void d(int i1)
    {
        i1 = A.e(i1);
        if (b.values()[i1].e.a != null)
        {
            S.b(i1);
        }
    }

    public void e(int i1)
    {
        a(i1, true);
    }

    public void f(int i1)
    {
        a(i1, false);
    }

    public void g(boolean flag)
    {
        boolean flag1;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        i(flag1);
        f(flag);
        if (!flag)
        {
            setTitle("");
        }
        super.g(flag);
    }

    protected void k()
    {
        com.pandora.android.activity.c c1 = com.pandora.android.activity.c.a();
        c1.d(this);
        c1.b(com/pandora/android/activity/HomeTabsActivity);
    }

    protected IntentFilter l()
    {
        return B();
    }

    protected int m()
    {
        com.pandora.android.ads.b b1 = (com.pandora.android.ads.b)ag();
        if (b1 != null)
        {
            J = b1.l_();
        }
        return J;
    }

    protected ViewGroup n()
    {
        return H;
    }

    protected int o()
    {
        return 0x7f10019b;
    }

    public void onBackPressed()
    {
        c(false);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        B = f();
        if (!com.pandora.android.util.s.l())
        {
            O = true;
            setContentView(0x7f04005e);
            getWindow().setBackgroundDrawable(null);
            L = (ViewGroup)((ViewGroup)findViewById(0x1020002)).getChildAt(0);
            H = (FrameLayout)findViewById(0x7f10019a);
            p = (ReclickableTabHost)findViewById(0x1020012);
            p.setHostActivity(this);
            p.setup();
            I = findViewById(0x1020013);
            z = (ViewPager)findViewById(0x7f10019c);
            z.setOffscreenPageLimit(com.pandora.android.activity.g.a(b.values()));
            A = new g(this, p, z, S, b.values());
            p.setOnCurrentTabClickedListener(this);
            C = findViewById(0x7f10019d);
            B.a(T);
            G = new d(this);
            b(0x7f02022f);
            c(0x7f02019d);
            super.setTitle("");
            g(false);
            b(((Bundle) (null)));
            g().a(1, null, Q);
            bundle = getIntent();
            if (ab())
            {
                z.post(new e(bundle, w, this, 0x7f100080));
                return;
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuinflater = getMenuInflater();
        E = new LinkedHashSet();
        b ab1[] = b.values();
        int k1 = ab1.length;
        for (int i1 = 0; i1 < k1; i1++)
        {
            com.pandora.android.data.a aa1[] = ab1[i1].e.a(this, true);
            int l1 = aa1.length;
            for (int j1 = 0; j1 < l1; j1++)
            {
                com.pandora.android.data.a a2 = aa1[j1];
                if (!g(a2.b))
                {
                    E.add(a2);
                }
            }

        }

        E.remove(com.pandora.android.data.a.e);
        E.add(com.pandora.android.data.a.e);
        Iterator iterator = E.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.pandora.android.data.a a1 = (com.pandora.android.data.a)iterator.next();
            menuinflater.inflate(a1.a, menu);
            a1.c = menu.findItem(a1.b);
            if (a1.b == 0x7f10000f)
            {
                M = a1.c;
                com.pandora.android.activity.a.a(menu, menuinflater, new android.view.View.OnClickListener() {

                    final HomeTabsActivity a;

                    public void onClick(View view)
                    {
                        com.pandora.android.activity.a.d(a, 0x7f10000f);
                    }

            
            {
                a = HomeTabsActivity.this;
                super();
            }
                });
            }
        } while (true);
        com.pandora.android.activity.a.a(menu, menuinflater);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDeleteStationSuccess(p.dd.p p1)
    {
        U();
        ao();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (G != null)
        {
            G.removeMessages(123);
        }
        b ab1[] = b.values();
        int j1 = ab1.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            ab1[i1].e.a = null;
        }

        if (!com.pandora.android.util.s.l());
    }

    public void onDismissStationRecommendation(av av1)
    {
        if (av1.a)
        {
            com.pandora.android.provider.b.a.b().n().a();
            return;
        } else
        {
            U();
            return;
        }
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        setIntent(intent);
        if (ab())
        {
            z.post(new e(intent, w, this, 0x7f100080));
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (((Fragment)ag()).onOptionsItemSelected(menuitem))
        {
            return true;
        }
        if (com.pandora.android.activity.a.d(this, menuitem.getItemId()))
        {
            return true;
        }
        if (menuitem.getItemId() == 0x102002c)
        {
            c(true);
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected void onPause()
    {
        super.onPause();
        am();
        F = System.currentTimeMillis();
    }

    public void onPlayerStateChange(ag ag1)
    {
        o = ag1.a;
        a(o);
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        if (isFinishing())
        {
            p.df.a.a("HomeTabsActivity", "HomeTabsActivity.onPrepareOptionsMenu() --> isFinishing = TRUE");
            return super.onPrepareOptionsMenu(menu);
        } else
        {
            return an();
        }
    }

    protected void onResume()
    {
        super.onResume();
        ao();
        c(getIntent());
        a(o);
        if (!O)
        {
            com.pandora.android.util.af.a().a(ag().v());
        }
        O = false;
    }

    protected void onStart()
    {
        super.onStart();
        N = true;
    }

    public void onStop()
    {
        super.onStop();
        N = false;
    }

    public void onSubscriptionExpired(az az)
    {
        super.onSubscriptionExpired(az);
    }

    protected ViewGroup p()
    {
        return (ViewGroup)findViewById(o());
    }

    protected boolean q()
    {
        return false;
    }

    public void s()
    {
    }

    public void setTitle(CharSequence charsequence)
    {
        if (!ah() && ag() != null && !ag().i())
        {
            super.setTitle("");
            return;
        } else
        {
            super.setTitle(charsequence);
            return;
        }
    }

    public boolean t()
    {
        com.pandora.android.ads.b b1 = (com.pandora.android.ads.b)ag();
        if (b1 != null)
        {
            return b1.a();
        } else
        {
            return false;
        }
    }

    public Point u()
    {
        return null;
    }

    public void v()
    {
        while (!N || B.e() <= 0) 
        {
            return;
        }
        int i1 = B.b(0).a();
        B.a(i1, 1);
        D.c();
        ae();
    }

}
