// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.widget.SwitchCompat;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.fitbit.FitBitApplication;
import com.fitbit.alarm.ui.AlarmActivity;
import com.fitbit.analytics.google.ga.AnalyticsContainer;
import com.fitbit.bluetooth.g;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.bx;
import com.fitbit.data.bl.ei;
import com.fitbit.data.bl.fj;
import com.fitbit.data.bl.fm;
import com.fitbit.data.bl.fw;
import com.fitbit.data.domain.Alarm;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.data.domain.device.DeviceVersion;
import com.fitbit.data.domain.device.TrackerGoalType;
import com.fitbit.data.domain.device.TrackerHeartRateTrackingType;
import com.fitbit.data.domain.device.TrackerOption;
import com.fitbit.data.domain.device.TrackerSettings;
import com.fitbit.data.domain.device.c;
import com.fitbit.data.domain.device.d;
import com.fitbit.dncs.DncsHelper;
import com.fitbit.dncs.DncsPairingManager;
import com.fitbit.dncs.NotificationManager;
import com.fitbit.dncs.service.b;
import com.fitbit.galileo.service.GalileoServicesStateListener;
import com.fitbit.galileo.ui.sync.SyncUICase;
import com.fitbit.home.ui.i;
import com.fitbit.mixpanel.MixPanelPeopleProperty;
import com.fitbit.mixpanel.f;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.synclair.ui.SynclairActivity;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.ui.loadable.LoadablePicassoImageView;
import com.fitbit.ui.s;
import com.fitbit.util.SimpleConfirmDialogFragment;
import com.fitbit.util.ad;
import com.fitbit.util.b.a;
import com.fitbit.util.bh;
import com.fitbit.util.bj;
import com.fitbit.util.bo;
import com.fitbit.util.format.e;
import com.fitbit.util.o;
import java.util.Date;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.device.ui:
//            TrackerDetailsActivity_, DeviceView, a, ExerciseOptionsActivity_, 
//            TapGestureSelector_, TapGestureSelector, PrimaryGoalSelector_, PrimaryGoalSelector, 
//            GuideActivity_, OnDominantHandSelector_, OnDominantHandSelector, WristGlanceSelector_, 
//            WristGlanceSelector, GreetingSelector_, GreetingSelector, ScreenOrderSelector_, 
//            ScreenOrderSelector, ClockFaceSelector_, ClockFaceSelector, HeartRateTrackingSelector_, 
//            HeartRateTrackingSelector

public class TrackerDetailsActivity extends FitbitActivity
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, com.fitbit.galileo.ui.sync.b.a
{
    private static class a
    {

        private boolean a;
        private boolean b;
        private final View c;
        private final ProgressBar d;
        private final TextView e;
        private final TextView f;
        private final SwitchCompat g;

        private void g()
        {
            int i1 = 0;
            if (e())
            {
                g.setVisibility(8);
                d.setVisibility(0);
                return;
            }
            SwitchCompat switchcompat = g;
            if (!f())
            {
                i1 = 8;
            }
            switchcompat.setVisibility(i1);
            d.setVisibility(8);
        }

        public TextView a()
        {
            return f;
        }

        public void a(boolean flag)
        {
            a = flag;
            g();
        }

        public TextView b()
        {
            return e;
        }

        public void b(boolean flag)
        {
            b = flag;
            g();
        }

        public SwitchCompat c()
        {
            return g;
        }

        public void c(boolean flag)
        {
            if (c != null)
            {
                c.setEnabled(flag);
                if (g != null)
                {
                    g.setEnabled(flag);
                }
            }
        }

        public ProgressBar d()
        {
            return d;
        }

        public boolean e()
        {
            return a;
        }

        public boolean f()
        {
            return b;
        }

        public a(View view)
        {
            Object obj1 = null;
            super();
            a = false;
            b = false;
            c = view;
            Object obj;
            if (view == null)
            {
                obj = null;
            } else
            {
                obj = (ProgressBar)view.findViewById(0x102000d);
            }
            d = ((ProgressBar) (obj));
            if (view == null)
            {
                obj = null;
            } else
            {
                obj = (TextView)view.findViewById(0x1020015);
            }
            e = ((TextView) (obj));
            if (view == null)
            {
                obj = null;
            } else
            {
                obj = (TextView)view.findViewById(0x1020014);
            }
            f = ((TextView) (obj));
            if (view == null)
            {
                view = obj1;
            } else
            {
                view = (SwitchCompat)view.findViewById(0x7f110479);
            }
            g = view;
            g();
        }
    }

    private class b
    {

        final TrackerDetailsActivity a;
        private com.fitbit.galileo.ui.sync.a b;

        private void a()
        {
            a.h.setEnabled(true);
            a.c.setEnabled(false);
            a.c.setVisibility(0);
        }

        private void b()
        {
            a.h.setEnabled(true);
            a.c.setEnabled(true);
            a.c.setVisibility(0);
        }

        private void c()
        {
            a.h.setEnabled(true);
            a.c.setEnabled(true);
            a.c.setVisibility(0);
            if (com.fitbit.device.ui.TrackerDetailsActivity.e(a) != null)
            {
                com.fitbit.device.ui.TrackerDetailsActivity.a(a, com.fitbit.device.ui.TrackerDetailsActivity.e(a));
            }
        }

        private void d()
        {
            a.f.setVisibility(0);
        }

        private void e()
        {
            a.h.setEnabled(false);
            a.c.setVisibility(8);
            a.c.setEnabled(false);
            a.f.setVisibility(8);
        }

        void a(SyncUICase syncuicase, com.fitbit.galileo.ui.sync.a a1, boolean flag)
        {
            b = a1;
            a.i.setText(String.format(a.getString(0x7f080316), new Object[] {
                b.b
            }));
            if (!flag)
            {
                return;
            }
            e();
            static class _cls15
            {

                static final int a[];

                static 
                {
                    a = new int[SyncUICase.values().length];
                    try
                    {
                        a[SyncUICase.g.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror11) { }
                    try
                    {
                        a[SyncUICase.i.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror10) { }
                    try
                    {
                        a[SyncUICase.l.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror9) { }
                    try
                    {
                        a[SyncUICase.o.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror8) { }
                    try
                    {
                        a[SyncUICase.n.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror7) { }
                    try
                    {
                        a[SyncUICase.j.ordinal()] = 6;
                    }
                    catch (NoSuchFieldError nosuchfielderror6) { }
                    try
                    {
                        a[SyncUICase.k.ordinal()] = 7;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        a[SyncUICase.m.ordinal()] = 8;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        a[SyncUICase.e.ordinal()] = 9;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        a[SyncUICase.c.ordinal()] = 10;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[SyncUICase.d.ordinal()] = 11;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[SyncUICase.s.ordinal()] = 12;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (com.fitbit.device.ui._cls15.a[syncuicase.ordinal()])
            {
            default:
                c();
                return;

            case 10: // '\n'
                d();
                return;

            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 11: // '\013'
                a();
                return;

            case 12: // '\f'
                b();
                break;
            }
        }

        private b()
        {
            a = TrackerDetailsActivity.this;
            super();
        }

    }

    public class c extends com.fitbit.home.ui.g
    {

        private static final int b = 1213;
        final TrackerDetailsActivity a;

        public void a()
        {
            super.a();
            a(fj.a(a, true));
        }

        public void a(Exception exception)
        {
            super.a(exception);
        }

        public c(FragmentActivity fragmentactivity)
        {
            a = TrackerDetailsActivity.this;
            super(fragmentactivity, 1213);
        }
    }

    private class d extends com.fitbit.home.ui.g
    {

        final TrackerDetailsActivity a;

        public void a()
        {
            super.a();
            a.finish();
        }

        public void a(Exception exception)
        {
            super.a(exception);
        }

        public d()
        {
            a = TrackerDetailsActivity.this;
            super(TrackerDetailsActivity.this, 90);
        }
    }

    private class e extends com.fitbit.home.ui.b
    {

        final TrackerDetailsActivity a;

        public e()
        {
            a = TrackerDetailsActivity.this;
        /* block-local class not found */
        class _cls1 {}

            super(TrackerDetailsActivity.this, new _cls1(TrackerDetailsActivity.this));
        }
    }


    private static final String t = "Device Settings";
    private static final String u = "TrackerDetailsActivity";
    private static final String v = "TAG_UNPAIR_CONFIRMATION_DIALOG";
    private static final String w = "com.fitbit.device.ui.TrackerDetailsActivity.DIALOG_TAG_UPDATE_REQUIRED";
    private final i A = new i();
    private c B;
    private com.fitbit.home.ui.g C;
    private com.fitbit.util.threading.c D;
    private a E;
    protected View a;
    protected TextView b;
    protected ImageButton c;
    protected View d;
    protected SwitchCompat e;
    protected ProgressBar f;
    protected Button g;
    protected View h;
    protected TextView i;
    protected View j;
    protected View k;
    protected ViewGroup l;
    protected View m;
    protected TextView n;
    protected TextView o;
    protected View p;
    protected String q;
    protected com.fitbit.galileo.ui.sync.b r;
    protected GalileoServicesStateListener s;
    private LoadablePicassoImageView x;
    private Device y;
    private final b z = new b();

    public TrackerDetailsActivity()
    {
        B = new c(this);
        C = new d();
        D = new com.fitbit.util.threading.c() {

            final TrackerDetailsActivity a;

            public void a(Intent intent)
            {
                com.fitbit.device.ui.TrackerDetailsActivity.a(a);
            }

            
            {
                a = TrackerDetailsActivity.this;
                super();
            }
        };
    }

    public static Intent a(Context context, Device device)
    {
        return com.fitbit.device.ui.TrackerDetailsActivity_.a(context).a(device.c()).a();
    }

    private a a(int i1, CharSequence charsequence, android.view.View.OnClickListener onclicklistener)
    {
        if (l.getChildCount() == 0)
        {
            LayoutInflater.from(this).inflate(0x7f040100, l);
        }
        View view = LayoutInflater.from(this).inflate(0x7f0401ba, l, false);
        a a1 = new a(view);
        a1.a().setText(i1);
        if (!TextUtils.isEmpty(charsequence))
        {
            a1.b().setText(charsequence);
        } else
        {
            a1.b().setVisibility(8);
        }
        view.setOnClickListener(onclicklistener);
        l.addView(view);
        return a1;
    }

    private void a(Device device)
    {
        setTitle(device.j());
        b(device);
        c(device);
        f(device);
        d(device);
        e(device);
    }

    static void a(TrackerDetailsActivity trackerdetailsactivity)
    {
        trackerdetailsactivity.o();
    }

    static void a(TrackerDetailsActivity trackerdetailsactivity, Device device)
    {
        trackerdetailsactivity.a(device);
    }

    static void a(TrackerDetailsActivity trackerdetailsactivity, boolean flag)
    {
        trackerdetailsactivity.a(flag);
    }

    private void a(boolean flag)
    {
        if (y == null)
        {
            return;
        }
        if (!y.a(DeviceFeature.NOTIFICATIONS))
        {
            if (y.c(DeviceFeature.NOTIFICATIONS))
            {
                SimpleConfirmDialogFragment simpleconfirmdialogfragment = new SimpleConfirmDialogFragment(0x7f08036d, 0x7f0802c2);
                SimpleConfirmDialogFragment.a(simpleconfirmdialogfragment, getString(0x7f080482), getString(0x7f080483, new Object[] {
                    y.j()
                }), new com.fitbit.util.SimpleConfirmDialogFragment.a() {

                    final TrackerDetailsActivity a;

                    public void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment1)
                    {
                        a.i();
                    }

                    public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment1)
                    {
                        com.fitbit.device.ui.TrackerDetailsActivity.a(a);
                    }

                    public void c(SimpleConfirmDialogFragment simpleconfirmdialogfragment1)
                    {
                        com.fitbit.device.ui.TrackerDetailsActivity.a(a);
                    }

            
            {
                a = TrackerDetailsActivity.this;
                super();
            }
                });
                ad.a(getSupportFragmentManager(), "com.fitbit.device.ui.TrackerDetailsActivity.DIALOG_TAG_UPDATE_REQUIRED", simpleconfirmdialogfragment);
            }
            o();
            return;
        }
        if (!com.fitbit.dncs.service.b.a().d())
        {
            com.fitbit.ui.s.a(this, getString(0x7f08009c), 1).i();
            o();
            return;
        }
        if (com.fitbit.bluetooth.g.a(this))
        {
            o();
            return;
        }
        if (com.fitbit.bluetooth.g.a(this, r))
        {
            o();
            return;
        }
        if (com.fitbit.bluetooth.g.g())
        {
            String s1;
            MixPanelPeopleProperty mixpanelpeopleproperty;
            if (flag)
            {
                DncsPairingManager.a().a(y);
            } else
            {
                DncsPairingManager.a().b(y);
            }
            o();
            mixpanelpeopleproperty = MixPanelPeopleProperty.b;
            if (flag)
            {
                s1 = "On";
            } else
            {
                s1 = "Off";
            }
            com.fitbit.mixpanel.f.a(mixpanelpeopleproperty, s1);
            return;
        } else
        {
            E.a(true);
            com.fitbit.bluetooth.g.a(this, new com.fitbit.util.EnableBluetoothDialog.a(flag) {

                final boolean a;
                final TrackerDetailsActivity b;

                public void a()
                {
                    com.fitbit.device.ui.TrackerDetailsActivity.a(b);
                }

                public void b()
                {
                    com.fitbit.device.ui.TrackerDetailsActivity.a(b, a);
                }

                public void c()
                {
                    com.fitbit.device.ui.TrackerDetailsActivity.a(b);
                }

            
            {
                b = TrackerDetailsActivity.this;
                a = flag;
                super();
            }
            }, "BluetoothUtils.REQUEST_ENABLE_BLUETOOTH");
            return;
        }
    }

    public static void b(Context context, Device device)
    {
        com.fitbit.device.ui.TrackerDetailsActivity_.a(context).a(device.c()).b();
    }

    private void b(Device device)
    {
        byte byte0 = 8;
        if (com.fitbit.bluetooth.g.f() && device.a(DeviceFeature.WIRELESS_SYNC))
        {
            Button button = g;
            if (device.x())
            {
                byte0 = 0;
            }
            button.setVisibility(byte0);
            return;
        } else
        {
            g.setVisibility(8);
            return;
        }
    }

    static void b(TrackerDetailsActivity trackerdetailsactivity)
    {
        trackerdetailsactivity.l();
    }

    private void c(Device device)
    {
        e.setChecked(device.u());
        e.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener(device) {

            final Device a;
            final TrackerDetailsActivity b;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                boolean flag1 = true;
                if (com.fitbit.bluetooth.g.a(b))
                {
                    compoundbutton = b.e;
                    if (!flag)
                    {
                        flag = flag1;
                    } else
                    {
                        flag = false;
                    }
                    compoundbutton.setChecked(flag);
                } else
                {
                    if (flag && !ServerGateway.a().d())
                    {
                        a.a(flag, true);
                        com.fitbit.multipledevice.a.a().e();
                        return;
                    }
                    if (a.u() != flag)
                    {
                        a.b(flag);
                        return;
                    }
                }
            }

            
            {
                b = TrackerDetailsActivity.this;
                a = device;
                super();
            }
        });
        if (com.fitbit.bluetooth.g.f() && device.a(DeviceFeature.WIRELESS_SYNC))
        {
            k.setVisibility(8);
            d.setVisibility(0);
            return;
        } else
        {
            device = A.a(device.e(), this, 0x7f080157);
            k.setVisibility(0);
            d.setVisibility(8);
            b.setText(device);
            return;
        }
    }

    static void c(TrackerDetailsActivity trackerdetailsactivity)
    {
        trackerdetailsactivity.m();
    }

    static a d(TrackerDetailsActivity trackerdetailsactivity)
    {
        return trackerdetailsactivity.E;
    }

    private void d(Device device)
    {
        if (device != null && device.z() != null)
        {
            m.setVisibility(0);
            String s1 = device.j();
            n.setText(bh.a(this, 0x7f0802db, new String[] {
                s1
            }));
            o.setText(bh.a(this, 0x7f0802dc, new String[] {
                s1
            }));
            m.setOnClickListener(new android.view.View.OnClickListener(device) {

                final Device a;
                final TrackerDetailsActivity b;

                public void onClick(View view)
                {
                    if (b.P())
                    {
                        com.fitbit.device.ui.GuideActivity_.a(b).a(a.z()).b();
                    }
                }

            
            {
                b = TrackerDetailsActivity.this;
                a = device;
                super();
            }
            });
            return;
        } else
        {
            m.setVisibility(8);
            m.setOnClickListener(null);
            return;
        }
    }

    static Device e(TrackerDetailsActivity trackerdetailsactivity)
    {
        return trackerdetailsactivity.y;
    }

    private void e(Device device)
    {
        if (device != null && device.h() == DeviceVersion.SURGE && !com.fitbit.util.b.a.a(19))
        {
            p.setVisibility(0);
            return;
        } else
        {
            p.setVisibility(8);
            return;
        }
    }

    private void f(Device device)
    {
        String s1 = null;
        l.removeAllViews();
        TrackerSettings trackersettings = device.o();
        if (trackersettings == null)
        {
            trackersettings = new TrackerSettings();
            String s2;
            Alarm alarm;
            int i1;
            try
            {
                trackersettings.initFromPublicApiJsonObject(new JSONObject());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                com.fitbit.e.a.f("TrackerDetailsActivity", "The tracker settings could not be initialized from blank JSON Object", new Object[0]);
            }
        }
        if (com.fitbit.bluetooth.g.f() && (device.a(DeviceFeature.NOTIFICATIONS) || device.c(DeviceFeature.NOTIFICATIONS)) && trackersettings.a(TrackerOption.ENABLE_ANCS) != null)
        {
            i1 = bo.a(device);
            Object obj;
            if (!DncsHelper.a())
            {
                obj = Html.fromHtml(String.format(getString(0x7f0800a5), new Object[] {
                    getString(0x7f0800a4), com.fitbit.util.format.e.a(this, 0x7f080630, 0x7f0800a6)
                }));
            } else
            {
                obj = null;
            }
            E = a(i1, ((CharSequence) (obj)), new android.view.View.OnClickListener() {

                final TrackerDetailsActivity a;

                public void onClick(View view)
                {
                    if (com.fitbit.device.ui.TrackerDetailsActivity.d(a) != null && !com.fitbit.device.ui.TrackerDetailsActivity.d(a).e())
                    {
                        view = com.fitbit.device.ui.TrackerDetailsActivity.d(a).c();
                        TrackerDetailsActivity trackerdetailsactivity = a;
                        boolean flag;
                        if (!view.isChecked())
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        com.fitbit.device.ui.TrackerDetailsActivity.a(trackerdetailsactivity, flag);
                    }
                }

            
            {
                a = TrackerDetailsActivity.this;
                super();
            }
            });
            E.b(true);
            o();
            E.c(DncsHelper.a());
            E.b().setMovementMethod(LinkMovementMethod.getInstance());
            E.c().setOnClickListener(new android.view.View.OnClickListener() {

                final TrackerDetailsActivity a;

                public void onClick(View view)
                {
                    if (com.fitbit.device.ui.TrackerDetailsActivity.d(a) != null)
                    {
                        SwitchCompat switchcompat = com.fitbit.device.ui.TrackerDetailsActivity.d(a).c();
                        if (switchcompat == view)
                        {
                            com.fitbit.device.ui.TrackerDetailsActivity.a(a, switchcompat.isChecked());
                        }
                    }
                }

            
            {
                a = TrackerDetailsActivity.this;
                super();
            }
            });
        }
        if (com.fitbit.bluetooth.g.f() && device.a(DeviceFeature.PRIMARY_GOAL) && trackersettings.a(TrackerOption.PRIMARY_GOAL) != null)
        {
            a(0x7f0803b8, g(device), new android.view.View.OnClickListener() {

                final TrackerDetailsActivity a;

                public void onClick(View view)
                {
                    if (a.P())
                    {
                        com.fitbit.device.ui.PrimaryGoalSelector_.a().a(a.q).a().show(a.getSupportFragmentManager(), null);
                    }
                }

            
            {
                a = TrackerDetailsActivity.this;
                super();
            }
            });
        }
        if (com.fitbit.bluetooth.g.f() && device.a(DeviceFeature.WRIST_PLACEMENT) && trackersettings.a(TrackerOption.ON_DOMINANT_HAND) != null)
        {
            a(0x7f08037c, h(device), new android.view.View.OnClickListener() {

                final TrackerDetailsActivity a;

                public void onClick(View view)
                {
                    if (a.P())
                    {
                        com.fitbit.device.ui.OnDominantHandSelector_.a().a(a.q).a().show(a.getSupportFragmentManager(), null);
                    }
                }

            
            {
                a = TrackerDetailsActivity.this;
                super();
            }
            });
        }
        if (com.fitbit.bluetooth.g.f() && device.a(DeviceFeature.QUICK_VIEW) && trackersettings.a(TrackerOption.WATCH_CHECK) != null)
        {
            a(0x7f080339, k(device), new android.view.View.OnClickListener() {

                final TrackerDetailsActivity a;

                public void onClick(View view)
                {
                    if (a.P())
                    {
                        com.fitbit.device.ui.WristGlanceSelector_.a().a(a.q).a().show(a.getSupportFragmentManager(), null);
                    }
                }

            
            {
                a = TrackerDetailsActivity.this;
                super();
            }
            });
        }
        if (device.b(DeviceFeature.ALARMS))
        {
            alarm = com.fitbit.data.bl.b.a().a(new Date(), device.l());
            obj = s1;
            if (alarm != null)
            {
                obj = alarm.b(new Date());
            }
            s2 = getString(0x7f080330);
            s1 = s2;
            if (alarm != null)
            {
                s1 = s2;
                if (obj != null)
                {
                    s1 = com.fitbit.util.format.e.n(getApplicationContext(), ((Date) (obj)));
                    if (com.fitbit.util.o.i(((Date) (obj))))
                    {
                        obj = getString(0x7f080540);
                    } else
                    if (com.fitbit.util.o.q(((Date) (obj))))
                    {
                        obj = getString(0x7f080542);
                    } else
                    {
                        obj = com.fitbit.util.format.e.l(((Date) (obj))).toString();
                    }
                    s1 = getString(0x7f080413, new Object[] {
                        getString(0x7f080157, new Object[] {
                            obj, s1
                        })
                    });
                }
            }
            a(0x7f080349, s1, new android.view.View.OnClickListener() {

                final TrackerDetailsActivity a;

                public void onClick(View view)
                {
                    if (a.P())
                    {
                        a.j();
                    }
                }

            
            {
                a = TrackerDetailsActivity.this;
                super();
            }
            });
        }
        if (com.fitbit.bluetooth.g.f() && device.a(DeviceFeature.GREETING))
        {
            obj = trackersettings.a(TrackerOption.GREETING);
            if (obj != null)
            {
                a(0x7f080557, (CharSequence)((com.fitbit.data.domain.device.e) (obj)).c(), new android.view.View.OnClickListener() {

                    final TrackerDetailsActivity a;

                    public void onClick(View view)
                    {
                        if (a.P())
                        {
                            com.fitbit.device.ui.GreetingSelector_.a().a(a.q).a().show(a.getSupportFragmentManager(), null);
                        }
                    }

            
            {
                a = TrackerDetailsActivity.this;
                super();
            }
                });
            }
        }
        if (com.fitbit.bluetooth.g.f() && device.a(DeviceFeature.STATS_ORDERING) && trackersettings.a(TrackerOption.SCREEN_ORDER) != null)
        {
            a(0x7f0804ed, getString(0x7f0804ee), new android.view.View.OnClickListener() {

                final TrackerDetailsActivity a;

                public void onClick(View view)
                {
                    if (a.P())
                    {
                        com.fitbit.device.ui.ScreenOrderSelector_.a().a(a.q).a().show(a.getSupportFragmentManager(), null);
                    }
                }

            
            {
                a = TrackerDetailsActivity.this;
                super();
            }
            });
        }
        if (com.fitbit.bluetooth.g.f() && device.a(DeviceFeature.CLOCK_FACE) && trackersettings.a(TrackerOption.CLOCK_FACE) != null)
        {
            a(0x7f080102, getString(0x7f080103), new android.view.View.OnClickListener() {

                final TrackerDetailsActivity a;

                public void onClick(View view)
                {
                    if (a.P())
                    {
                        com.fitbit.device.ui.ClockFaceSelector_.a().a(a.q).a().show(a.getSupportFragmentManager(), null);
                    }
                }

            
            {
                a = TrackerDetailsActivity.this;
                super();
            }
            });
        }
        if (com.fitbit.bluetooth.g.f() && device.a(DeviceFeature.HEART_RATE) && trackersettings.a(TrackerOption.HEART_RATE_TRACKING) != null)
        {
            a(0x7f080242, i(device), new android.view.View.OnClickListener() {

                final TrackerDetailsActivity a;

                public void onClick(View view)
                {
                    if (a.P())
                    {
                        com.fitbit.device.ui.HeartRateTrackingSelector_.a().a(a.q).a().show(a.getSupportFragmentManager(), null);
                    }
                }

            
            {
                a = TrackerDetailsActivity.this;
                super();
            }
            });
        }
        if (com.fitbit.bluetooth.g.f() && device.a(DeviceFeature.EXERCISES) && trackersettings.a(TrackerOption.EXERCISES) != null)
        {
            a(0x7f0802e9, getString(0x7f080140), new android.view.View.OnClickListener() {

                final TrackerDetailsActivity a;

                public void onClick(View view)
                {
                    if (a.P())
                    {
                        com.fitbit.device.ui.ExerciseOptionsActivity_.a(a).a(a.q).a(0x10000000).b();
                    }
                }

            
            {
                a = TrackerDetailsActivity.this;
                super();
            }
            });
        }
        if (com.fitbit.bluetooth.g.f() && device.a(DeviceFeature.TAP_GESTURE) && trackersettings.a(TrackerOption.TAP_GESTURE) != null)
        {
            a(0x7f08035d, j(device), new android.view.View.OnClickListener() {

                final TrackerDetailsActivity a;

                public void onClick(View view)
                {
                    if (a.P())
                    {
                        com.fitbit.device.ui.TapGestureSelector_.a().a(a.q).a().show(a.getSupportFragmentManager(), null);
                    }
                }

            
            {
                a = TrackerDetailsActivity.this;
                super();
            }
            });
        }
    }

    private String g(Device device)
    {
        device = device.o();
        if (device != null)
        {
            device = device.a(TrackerOption.PRIMARY_GOAL);
            if (device != null && device.c() != null)
            {
                return ((TrackerGoalType)device.c()).getLocalizedName();
            } else
            {
                return "";
            }
        } else
        {
            return "";
        }
    }

    private String h(Device device)
    {
        device = device.o();
        if (device != null)
        {
            if (((Boolean)device.a(TrackerOption.ON_DOMINANT_HAND).c()).booleanValue())
            {
                return getString(0x7f080548);
            } else
            {
                return getString(0x7f080550);
            }
        } else
        {
            return getString(0x7f080550);
        }
    }

    private String i(Device device)
    {
        device = device.o();
        if (device != null)
        {
            device = device.a(TrackerOption.HEART_RATE_TRACKING);
            if (device != null && device.c() != null)
            {
                return ((TrackerHeartRateTrackingType)device.c()).getLocalizedName();
            } else
            {
                return "";
            }
        } else
        {
            return "";
        }
    }

    private String j(Device device)
    {
        String s1 = "";
        Object obj = device.o();
        List list = device.t();
        device = s1;
        if (obj != null)
        {
            device = s1;
            if (list != null)
            {
                obj = ((TrackerSettings) (obj)).a(TrackerOption.TAP_GESTURE);
                device = s1;
                if (obj != null)
                {
                    device = s1;
                    if (((com.fitbit.data.domain.device.e) (obj)).c() != null)
                    {
                        int i1 = list.indexOf(((com.fitbit.data.domain.device.e) (obj)).c());
                        device = s1;
                        if (i1 >= 0)
                        {
                            device = ((com.fitbit.data.domain.device.d)list.get(i1)).b();
                        }
                    }
                }
            }
        }
        return device;
    }

    private String k(Device device)
    {
        String s1 = "";
        Object obj = device.o();
        List list = device.B();
        device = s1;
        if (obj != null)
        {
            device = s1;
            if (list != null)
            {
                obj = ((TrackerSettings) (obj)).a(TrackerOption.WATCH_CHECK);
                device = s1;
                if (obj != null)
                {
                    device = s1;
                    if (((com.fitbit.data.domain.device.e) (obj)).c() != null)
                    {
                        int i1 = list.indexOf(((com.fitbit.data.domain.device.e) (obj)).c());
                        device = s1;
                        if (i1 >= 0)
                        {
                            device = ((com.fitbit.data.domain.device.f)list.get(i1)).b();
                        }
                    }
                }
            }
        }
        return device;
    }

    private void k()
    {
        if (y != null)
        {
            if (x == null)
            {
                x = (LoadablePicassoImageView)findViewById(0x7f1100ba);
                x.a(y.a());
            }
            ((TextView)findViewById(0x7f110348)).setText(y.j());
            ((TextView)findViewById(0x7f110349)).setText(getString(0x7f0801c4, new Object[] {
                y.m().a()
            }));
            TextView textview = (TextView)findViewById(0x7f11034a);
            com.fitbit.device.ui.DeviceView.a(y, textview);
            a(y);
            if (a.getVisibility() != 0)
            {
                android.view.animation.Animation animation = AnimationUtils.loadAnimation(this, 0x10a0000);
                a.startAnimation(animation);
                a.setVisibility(0);
            }
        }
    }

    private void l()
    {
        if (y != null)
        {
            C.a(fw.a(this, y.c()));
        }
    }

    private void m()
    {
        if (!com.fitbit.bluetooth.g.a(this)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        SyncUICase syncuicase = r.a(q);
        com.fitbit.galileo.ui.sync.a a1 = r.b(q);
        r.c(q);
        switch (com.fitbit.device.ui._cls15.a[syncuicase.ordinal()])
        {
        default:
            if (!com.fitbit.bluetooth.g.a(this, r) && !com.fitbit.bluetooth.g.c(this) && com.fitbit.bluetooth.g.c(this, new com.fitbit.util.EnableBluetoothDialog.a() {

        final TrackerDetailsActivity a;

        public void a()
        {
            com.fitbit.ui.s.a(a, 0x7f08008e, 1).i();
        }

        public void b()
        {
            com.fitbit.device.ui.TrackerDetailsActivity.c(a);
        }

        public void c()
        {
            com.fitbit.ui.s.a(a, 0x7f08008e, 1).i();
        }

            
            {
                a = TrackerDetailsActivity.this;
                super();
            }
    }, "BluetoothUtils.REQUEST_ENABLE_BLUETOOTH_FOR_SYNC"))
            {
                com.fitbit.e.a.a("TrackerDetailsActivity", "Starting galileo sync service from TrackerDetailsActivity", new Object[0]);
                com.fitbit.multipledevice.a.a().a(y.c(), com.fitbit.serverinteraction.SynclairApi.SyncTrigger.b, true);
                return;
            }
            break;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
            s.b(y.c());
            com.fitbit.ui.s.a(this, a1.c, 1).i();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void n()
    {
        Intent intent = getIntent();
        intent.putExtra("com.fitbit.device.ui.DevicesFragment.EXTRA_DEVICE_DETAILS_PENDING_MESSAGE", getString(0x7f080559));
        setResult(0, intent);
        finish();
    }

    private void o()
    {
        boolean flag1 = true;
        if (E != null)
        {
            com.fitbit.dncs.NotificationManager.NotificationsStatus notificationsstatus = NotificationManager.a().b(y);
            SwitchCompat switchcompat;
            boolean flag;
            if (q != null && q.equals(com.fitbit.dncs.service.b.a().c()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            E.a(flag);
            switchcompat = E.c();
            if (notificationsstatus == com.fitbit.dncs.NotificationManager.NotificationsStatus.d)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            switchcompat.setChecked(flag);
        }
    }

    protected void a(int i1, Intent intent)
    {
        if (intent != null && intent.getExtras() != null && intent.hasExtra("EXTRA_CANCEL_RESULT_REASON"))
        {
            com.fitbit.ui.s.a(this, intent.getExtras().getString("EXTRA_CANCEL_RESULT_REASON"), 1).i();
        }
    }

    public void a(Loader loader, Device device)
    {
        if (device == null)
        {
            n();
            return;
        } else
        {
            y = device;
            k();
            return;
        }
    }

    public void a(SyncUICase syncuicase, com.fitbit.galileo.ui.sync.a a1)
    {
    }

    public void a(String s1, SyncUICase syncuicase, com.fitbit.galileo.ui.sync.a a1)
    {
        if (bh.b(s1, q))
        {
            z.a(syncuicase, a1, true);
        }
    }

    public void b(SyncUICase syncuicase, com.fitbit.galileo.ui.sync.a a1)
    {
    }

    public void b(String s1, SyncUICase syncuicase, com.fitbit.galileo.ui.sync.a a1)
    {
        if (bh.b(s1, q))
        {
            z.a(syncuicase, a1, false);
        }
    }

    void c()
    {
        getSupportLoaderManager().restartLoader(88, null, this);
    }

    protected void d()
    {
        a.setVisibility(4);
        c.setLongClickable(false);
        c.setClickable(false);
        i.setMovementMethod(LinkMovementMethod.getInstance());
        com.fitbit.device.ui.a.a(this, 0x7f1101d5, getResources().getString(0x7f080252));
        com.fitbit.device.ui.a.a(this, 0x7f1101cd, getResources().getString(0x7f0804fb));
        getSupportLoaderManager().initLoader(200, null, this);
        k();
    }

    protected void e()
    {
        if (y != null)
        {
            SimpleConfirmDialogFragment simpleconfirmdialogfragment = SimpleConfirmDialogFragment.a(new com.fitbit.util.SimpleConfirmDialogFragment.a() {

                final TrackerDetailsActivity a;

                public void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment1)
                {
                    com.fitbit.device.ui.TrackerDetailsActivity.b(a);
                }

                public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment1)
                {
                }

                public void c(SimpleConfirmDialogFragment simpleconfirmdialogfragment1)
                {
                }

            
            {
                a = TrackerDetailsActivity.this;
                super();
            }
            }, 0x7f080147, 0x7f0802c2, -1, getString(0x7f080149, new Object[] {
                y.i()
            }));
            ad.a(getSupportFragmentManager(), "TAG_UNPAIR_CONFIRMATION_DIALOG", simpleconfirmdialogfragment);
        }
    }

    protected void f()
    {
        boolean flag2 = true;
        boolean flag = true;
        if (!e.isChecked() && !ServerGateway.a().d())
        {
            y.a(true, true);
            com.fitbit.multipledevice.a.a().e();
            SwitchCompat switchcompat = e;
            if (e.isChecked())
            {
                flag = false;
            }
            switchcompat.setChecked(flag);
        } else
        if (!com.fitbit.bluetooth.g.a(this))
        {
            SwitchCompat switchcompat1 = e;
            boolean flag1;
            if (!e.isChecked())
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            switchcompat1.setChecked(flag1);
            return;
        }
    }

    protected void g()
    {
        m();
    }

    protected void h()
    {
        m();
    }

    protected void i()
    {
        if (y != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        SyncUICase syncuicase = r.a(q);
        com.fitbit.galileo.ui.sync.a a1 = r.b(q);
        r.c(q);
        switch (com.fitbit.device.ui._cls15.a[syncuicase.ordinal()])
        {
        case 2: // '\002'
        case 4: // '\004'
        case 5: // '\005'
        case 7: // '\007'
        case 8: // '\b'
        default:
            if (!com.fitbit.bluetooth.g.a(this, r) && !com.fitbit.bluetooth.g.c(this) && com.fitbit.bluetooth.g.c(this, new com.fitbit.util.EnableBluetoothDialog.a() {

        final TrackerDetailsActivity a;

        public void a()
        {
            com.fitbit.ui.s.a(a, 0x7f08008d, 1).i();
        }

        public void b()
        {
            a.i();
        }

        public void c()
        {
            com.fitbit.ui.s.a(a, 0x7f08008d, 1).i();
        }

            
            {
                a = TrackerDetailsActivity.this;
                super();
            }
    }, "BluetoothUtils.REQUEST_ENABLE_BLUETOOTH_FOR_UPDATE"))
            {
                g.setVisibility(8);
                SynclairActivity.a(this, y.j(), y.d());
                return;
            }
            break;

        case 1: // '\001'
        case 3: // '\003'
        case 6: // '\006'
        case 9: // '\t'
            com.fitbit.ui.s.a(this, a1.c, 1).i();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void j()
    {
        if (y != null)
        {
            AlarmActivity.a(this, y);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (TextUtils.isEmpty(q))
        {
            finish();
            return;
        } else
        {
            B.a(fm.a(this, true));
            C = new d();
            C.a(new e());
            return;
        }
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        return new bj(this, bx.c()) {

            final TrackerDetailsActivity a;

            public Device b()
            {
                return an.a().a(a.q);
            }

            protected Intent f()
            {
                return ei.a(getContext(), true);
            }

            public Object f_()
            {
                return b();
            }

            
            {
                a = TrackerDetailsActivity.this;
                super(context, intentfilter);
            }
        };
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (Device)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    protected void onPause()
    {
        super.onPause();
        r.b(this);
        D.d();
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        menu.findItem(0x7f1104e0).setVisible(com.fitbit.multipledevice.b.a());
        return super.onPrepareOptionsMenu(menu);
    }

    protected void onResume()
    {
        super.onResume();
        com.fitbit.analytics.core.a.a(com.fitbit.analytics.core.Interaction.DEFAULTS.h);
        r.a(this);
        r.f();
        z.a(r.a(q), r.b(q), true);
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction(DncsPairingManager.a);
        intentfilter.addAction("com.fitbit.dncs.service.ACTION_DNCS_PAIRING_STATE_CHANGED");
        D.a(intentfilter);
        if (g != null && g.getVisibility() == 8)
        {
            b(an.a().a(q));
        }
        FitBitApplication.a().c().a(0x7f11000a).a("Device Settings");
    }
}
