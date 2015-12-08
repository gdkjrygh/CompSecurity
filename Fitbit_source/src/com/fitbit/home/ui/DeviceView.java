// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fitbit.bluetooth.g;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.device.BatteryLevel;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.data.domain.device.DeviceVersion;
import com.fitbit.e.a;
import com.fitbit.galileo.service.GalileoServicesStateListener;
import com.fitbit.galileo.ui.sync.SyncUICase;
import com.fitbit.galileo.ui.sync.b;
import com.fitbit.ui.loadable.LoadablePicassoImageView;
import com.fitbit.util.bh;
import com.fitbit.util.p;
import java.util.List;

// Referenced classes of package com.fitbit.home.ui:
//            DeviceView_, a

public class DeviceView extends LinearLayout
    implements com.fitbit.galileo.ui.sync.b.a
{
    public static interface a
    {

        public abstract void a(Device device);
    }

    private class b
    {

        final DeviceView a;
        private com.fitbit.galileo.ui.sync.a b;
        private boolean c;

        private void a()
        {
            a.p.setVisibility(8);
            a.q.setVisibility(8);
            a.o.setVisibility(8);
            a.f.setVisibility(8);
            a.r.setVisibility(8);
            a.g.setVisibility(8);
            a.g.clearAnimation();
            a.c.setVisibility(8);
            a.d.setVisibility(8);
            a.e.setVisibility(8);
            com.fitbit.home.ui.DeviceView.a(a, false);
            if (a.s.getVisibility() == 0)
            {
                if (b.h)
                {
                    a.d.setVisibility(8);
                } else
                {
                    a.c.setVisibility(8);
                }
            }
            if (!com.fitbit.util.p.n() && c)
            {
                a.s.setVisibility(8);
                c = false;
            }
        }

        private void a(boolean flag, com.fitbit.galileo.ui.sync.a a1)
        {
            DeviceView.e(a);
            TextView textview = a.l;
            int i1;
            if (com.fitbit.home.ui.DeviceView.b(a) != null)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            textview.setVisibility(i1);
            if (com.fitbit.home.ui.DeviceView.b(a) == null)
            {
                a.l.setVisibility(8);
                a.k.setVisibility(8);
                a.m.setVisibility(8);
            } else
            {
                if (DeviceView.f(a) && !TextUtils.isEmpty(a1.g))
                {
                    a.l.setText(a1.g);
                    a.k.setVisibility(8);
                    a.m.setVisibility(8);
                    return;
                }
                if (com.fitbit.home.ui.DeviceView.b(a) != null)
                {
                    a.l.setText(a1.d);
                    if (flag)
                    {
                        a.k.setVisibility(8);
                        a.m.setVisibility(8);
                        return;
                    }
                    if (com.fitbit.home.ui.DeviceView.b(a).x())
                    {
                        a.l.setText(0x7f080369);
                        a.k.setVisibility(8);
                        a.m.setVisibility(8);
                        return;
                    }
                    a.k.setVisibility(0);
                    if (!com.fitbit.home.ui.DeviceView.b(a).a(DeviceFeature.WIRELESS_SYNC))
                    {
                        a.m.setVisibility(8);
                        return;
                    } else
                    {
                        a.m.setVisibility(0);
                        a.m.setImageDrawable(com.fitbit.home.ui.DeviceView.b(a).f().getSmallImage());
                        return;
                    }
                }
            }
        }

        private void b()
        {
            a.r.setVisibility(0);
            a.e.setVisibility(0);
            a.n.setText(b.e);
            a(false, b);
        }

        private void c()
        {
            Device device;
            device = com.fitbit.util.p.j();
            a(false, b);
            a.j.setVisibility(0);
            if (com.fitbit.bluetooth.g.f()) goto _L2; else goto _L1
_L1:
            return;
_L2:
            if (b.h)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (device == null || com.fitbit.util.p.c(device)) goto _L1; else goto _L3
_L3:
            a.o.setVisibility(0);
            return;
            if (device == null) goto _L1; else goto _L4
_L4:
            a.q.setVisibility(0);
            return;
        }

        private void d()
        {
            a.p.setVisibility(0);
            a.n.setText(b.e);
            a.d.setVisibility(0);
            a(false, b);
        }

        private void e()
        {
            k();
        }

        private void f()
        {
            k();
        }

        private void g()
        {
            a.n.setText(b.e);
            a(false, b);
            a.p.setVisibility(0);
            a.d.setVisibility(0);
        }

        private void h()
        {
            k();
        }

        private void i()
        {
            com.fitbit.home.ui.DeviceView.a(a, true);
            a.f();
            if (com.fitbit.util.p.n())
            {
                a.d.setVisibility(0);
                a.n.setText(b.e);
                return;
            } else
            {
                k();
                return;
            }
        }

        private void j()
        {
            i();
            c = true;
        }

        private void k()
        {
            a.n.setText(b.e);
            if (com.fitbit.util.p.j() != null)
            {
                a(false, b);
                if (!b.h)
                {
                    a.p.setVisibility(0);
                    a.d.setVisibility(0);
                    return;
                } else
                {
                    a.f.setVisibility(0);
                    a.c.setVisibility(0);
                    return;
                }
            }
            if (!b.h)
            {
                a.d.setVisibility(0);
                return;
            } else
            {
                a.c.setVisibility(0);
                return;
            }
        }

        private void l()
        {
            a(true, b);
            if (a.s.getVisibility() == 0)
            {
                if (b.h)
                {
                    a.c.setVisibility(0);
                } else
                {
                    a.d.setVisibility(0);
                }
            }
            a.g.setVisibility(0);
            a.post(DeviceView.d(a));
        }

        void a(SyncUICase syncuicase, com.fitbit.galileo.ui.sync.a a1)
        {
            SyncUICase syncuicase1 = a.a.d();
            if (com.fitbit.home.ui.DeviceView.a(syncuicase1))
            {
                syncuicase = syncuicase1;
            }
            b = a1;
            a();
            static class _cls4
            {

                static final int a[];

                static 
                {
                    a = new int[SyncUICase.values().length];
                    try
                    {
                        a[SyncUICase.a.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror14) { }
                    try
                    {
                        a[SyncUICase.c.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror13) { }
                    try
                    {
                        a[SyncUICase.b.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror12) { }
                    try
                    {
                        a[SyncUICase.d.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror11) { }
                    try
                    {
                        a[SyncUICase.g.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror10) { }
                    try
                    {
                        a[SyncUICase.e.ordinal()] = 6;
                    }
                    catch (NoSuchFieldError nosuchfielderror9) { }
                    try
                    {
                        a[SyncUICase.i.ordinal()] = 7;
                    }
                    catch (NoSuchFieldError nosuchfielderror8) { }
                    try
                    {
                        a[SyncUICase.j.ordinal()] = 8;
                    }
                    catch (NoSuchFieldError nosuchfielderror7) { }
                    try
                    {
                        a[SyncUICase.k.ordinal()] = 9;
                    }
                    catch (NoSuchFieldError nosuchfielderror6) { }
                    try
                    {
                        a[SyncUICase.l.ordinal()] = 10;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        a[SyncUICase.m.ordinal()] = 11;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        a[SyncUICase.n.ordinal()] = 12;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        a[SyncUICase.o.ordinal()] = 13;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[SyncUICase.r.ordinal()] = 14;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[SyncUICase.p.ordinal()] = 15;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (com.fitbit.home.ui._cls4.a[syncuicase.ordinal()])
            {
            default:
                c();
                return;

            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                l();
                return;

            case 4: // '\004'
            case 5: // '\005'
                i();
                return;

            case 6: // '\006'
                h();
                return;

            case 7: // '\007'
                g();
                return;

            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
                f();
                return;

            case 12: // '\f'
                d();
                return;

            case 13: // '\r'
                e();
                return;

            case 14: // '\016'
                b();
                return;

            case 15: // '\017'
                j();
                break;
            }
        }

        private b()
        {
            a = DeviceView.this;
            super();
        }

    }


    private static final String t = "DeviceView";
    private Device A;
    private boolean B;
    private boolean C;
    private a D;
    protected com.fitbit.galileo.ui.sync.b a;
    protected GalileoServicesStateListener b;
    protected ImageView c;
    protected ImageView d;
    protected ImageView e;
    protected ImageButton f;
    protected ImageView g;
    protected LoadablePicassoImageView h;
    protected TextView i;
    protected View j;
    protected ImageView k;
    protected TextView l;
    protected ImageView m;
    protected TextView n;
    protected ImageButton o;
    protected ImageButton p;
    protected ImageButton q;
    protected ImageButton r;
    protected View s;
    private final b u;
    private final android.view.animation.Animation.AnimationListener v;
    private final Runnable w;
    private final Runnable x;
    private Profile y;
    private Device z;

    public DeviceView(Context context)
    {
        super(context);
        u = new b();
        v = new android.view.animation.Animation.AnimationListener() {

            final DeviceView a;

            public void onAnimationEnd(Animation animation)
            {
                if (a.a != null)
                {
                    a.a.c(com.fitbit.home.ui.DeviceView.a(a));
                }
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
            }

            
            {
                a = DeviceView.this;
                super();
            }
        };
        w = new Runnable() {

            final DeviceView a;

            public void run()
            {
                while (a.a == null || !com.fitbit.home.ui.DeviceView.a(a.a.d()) || a.g == null || a.g.getAnimation() != null) 
                {
                    return;
                }
                a.g.startAnimation(AnimationUtils.loadAnimation(a.getContext(), 0x7f05000c));
            }

            
            {
                a = DeviceView.this;
                super();
            }
        };
        x = new Runnable() {

            final DeviceView a;

            public void run()
            {
                com.fitbit.util.a.b b1;
                if (com.fitbit.home.ui.DeviceView.b(a).h() == DeviceVersion.MOTIONBIT || com.fitbit.home.ui.DeviceView.b(a).h() == DeviceVersion.ULTRA || com.fitbit.home.ui.DeviceView.b(a).h() == DeviceVersion.CLASSIC || com.fitbit.home.ui.DeviceView.b(a).h() == DeviceVersion.ARIA)
                {
                    b1 = new com.fitbit.util.a.b(a.h, com.fitbit.home.ui.DeviceView.b(a).h().getDeviceIcon());
                } else
                {
                    b1 = new com.fitbit.util.a.b(a.h, DeviceView.c(a).a());
                }
                a.h.startAnimation(b1);
            }

            
            {
                a = DeviceView.this;
                super();
            }
        };
        B = false;
        C = false;
    }

    public DeviceView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        u = new b();
        v = new _cls1();
        w = new _cls2();
        x = new _cls3();
        B = false;
        C = false;
    }

    public DeviceView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        u = new b();
        v = new _cls1();
        w = new _cls2();
        x = new _cls3();
        B = false;
        C = false;
    }

    public static DeviceView a(Context context)
    {
        return com.fitbit.home.ui.DeviceView_.b(context);
    }

    static String a(DeviceView deviceview)
    {
        return deviceview.p();
    }

    static boolean a(SyncUICase syncuicase)
    {
        return b(syncuicase);
    }

    static boolean a(DeviceView deviceview, boolean flag)
    {
        deviceview.B = flag;
        return flag;
    }

    static Device b(DeviceView deviceview)
    {
        return deviceview.z;
    }

    private static boolean b(SyncUICase syncuicase)
    {
        return syncuicase == SyncUICase.a || syncuicase == SyncUICase.b;
    }

    static Device c(DeviceView deviceview)
    {
        return deviceview.A;
    }

    static Runnable d(DeviceView deviceview)
    {
        return deviceview.w;
    }

    static void e(DeviceView deviceview)
    {
        deviceview.o();
    }

    static boolean f(DeviceView deviceview)
    {
        return deviceview.s();
    }

    private void o()
    {
        Device device = com.fitbit.util.p.j();
        if (device != null)
        {
            A = an.a().a(device.c());
            if (A == null || A.h() == DeviceVersion.MOTIONBIT)
            {
                return;
            }
        }
        z = A;
    }

    private String p()
    {
        if (z != null)
        {
            return z.c();
        } else
        {
            return null;
        }
    }

    private boolean q()
    {
        if (y == null)
        {
            return true;
        }
        if (B)
        {
            return false;
        }
        if (y.s().size() == 0)
        {
            com.fitbit.e.a.a("DeviceView", "Unable to update DeviceView: profile doesn't have devices. Hidding DeviceView...", new Object[0]);
            return true;
        }
        if (com.fitbit.util.p.f(y.s()))
        {
            com.fitbit.e.a.a("DeviceView", "Unable to update DeviceView: profile has scales or motionbit. Hidding DeviceView...", new Object[0]);
            return true;
        } else
        {
            return false;
        }
    }

    private void r()
    {
        String s1 = p();
        u.a(a.a(s1), a.b(s1));
    }

    private boolean s()
    {
        return com.fitbit.home.ui.a.a().c();
    }

    protected void a()
    {
        n.setMovementMethod(LinkMovementMethod.getInstance());
        q.setFocusable(false);
        o.setFocusable(false);
        p.setFocusable(false);
        f.setFocusable(false);
        r.setFocusable(false);
        b();
    }

    public void a(SyncUICase syncuicase, com.fitbit.galileo.ui.sync.a a1)
    {
        if (p() == null)
        {
            u.a(syncuicase, a1);
            return;
        } else
        {
            r();
            return;
        }
    }

    public void a(a a1)
    {
        D = a1;
    }

    public void a(String s1, SyncUICase syncuicase, com.fitbit.galileo.ui.sync.a a1)
    {
        if (bh.b(s1, p()))
        {
            u.a(syncuicase, a1);
        }
    }

    public boolean a(Profile profile)
    {
        com.fitbit.galileo.service.GalileoServicesStateListener.GalileoState galileostate = b.c();
        String s1;
        if (galileostate != null)
        {
            s1 = galileostate.name();
        } else
        {
            s1 = "";
        }
        com.fitbit.e.a.a("DeviceView", "Updating DeviceView: GalileoState = %s", new Object[] {
            s1
        });
        y = profile;
        b();
        if (profile == null)
        {
            com.fitbit.e.a.a("DeviceView", "Unable to update DeviceView: profile is null", new Object[0]);
            C = false;
            return false;
        }
        a.f();
        r();
        if ((!C || galileostate == com.fitbit.galileo.service.GalileoServicesStateListener.GalileoState.a) && q())
        {
            C = false;
            return false;
        }
        if (z != null)
        {
            i.setText(z.i());
            j.setVisibility(0);
            C = true;
        }
        return true;
    }

    public void b()
    {
        A = com.fitbit.util.p.j();
        if (z == null || A == null) goto _L2; else goto _L1
_L1:
        if (z.c().equals(A.c())) goto _L4; else goto _L3
_L3:
        post(x);
        ViewCompat.setTransitionName(h, A.c());
_L2:
        z = A;
        return;
_L4:
        if (A.h() == DeviceVersion.MOTIONBIT || A.h() == DeviceVersion.ULTRA || A.h() == DeviceVersion.CLASSIC || A.h() == DeviceVersion.ARIA)
        {
            h.setImageResource(A.h().getDeviceIcon());
            ViewCompat.setTransitionName(h, A.c());
        } else
        if (A.a() != null)
        {
            h.a(A.a());
            ViewCompat.setTransitionName(h, (new StringBuilder()).append("trackerImage").append(A.c()).toString());
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void b(SyncUICase syncuicase, com.fitbit.galileo.ui.sync.a a1)
    {
        if (p() == null)
        {
            u.a(syncuicase, a1);
            return;
        } else
        {
            r();
            return;
        }
    }

    public void b(String s1, SyncUICase syncuicase, com.fitbit.galileo.ui.sync.a a1)
    {
        if (bh.b(s1, p()))
        {
            u.a(syncuicase, a1);
        }
    }

    public Device c()
    {
        return z;
    }

    public void d()
    {
        if (D != null)
        {
            D.a(c());
        }
    }

    public void e()
    {
        if (com.fitbit.multipledevice.b.a())
        {
            d();
        }
    }

    protected void f()
    {
        if (s.getVisibility() != 0)
        {
            Animation animation = AnimationUtils.loadAnimation(getContext(), 0x10a0000);
            s.setAnimation(animation);
            s.setVisibility(0);
        }
    }

    protected void g()
    {
        f();
    }

    protected void h()
    {
        f();
    }

    protected void i()
    {
        if (!B)
        {
            Animation animation = AnimationUtils.loadAnimation(getContext(), 0x10a0001);
            animation.setAnimationListener(v);
            s.setAnimation(animation);
            s.setVisibility(8);
            return;
        } else
        {
            f();
            return;
        }
    }

    public void j()
    {
        s.setVisibility(8);
    }

    public a k()
    {
        return D;
    }

    public void l()
    {
        if (a != null)
        {
            a.a(this);
            r();
        }
    }

    public void m()
    {
        if (a != null)
        {
            a.b(this);
        }
    }

    public void n()
    {
        r();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        a(y);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
    }
}
