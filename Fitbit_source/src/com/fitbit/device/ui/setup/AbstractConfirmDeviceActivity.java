// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui.setup;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.fitbit.data.bl.al;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.exceptions.MobileTrackBackOffException;
import com.fitbit.data.bl.exceptions.NetworkTimeoutException;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.bl.exceptions.ServerResponseException;
import com.fitbit.data.bl.exceptions.TrackerSigningKeyExpiredException;
import com.fitbit.data.domain.device.TrackerInfo;
import com.fitbit.data.domain.device.TrackerType;
import com.fitbit.home.ui.g;
import com.fitbit.mixpanel.MixPanelTrackingHelper;
import com.fitbit.mixpanel.d;
import com.fitbit.mixpanel.f;
import com.fitbit.multipledevice.a;
import com.fitbit.onboarding.login.LoginActivity;
import com.fitbit.pedometer.k;
import com.fitbit.savedstate.TrackerSyncPreferencesSavedState;
import com.fitbit.synclair.ui.SynclairActivity;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.ui.loadable.LoadablePicassoImageView;
import com.fitbit.ui.s;
import com.fitbit.util.SimpleConfirmDialogFragment;
import com.fitbit.util.ad;
import com.fitbit.util.i.b;
import com.fitbit.util.threading.c;
import org.json.JSONException;

public abstract class AbstractConfirmDeviceActivity extends FitbitActivity
{
    private class a extends g
    {

        final AbstractConfirmDeviceActivity a;

        public void a()
        {
            super.a();
            com.fitbit.device.ui.setup.AbstractConfirmDeviceActivity.b(a);
        }

        public a()
        {
            a = AbstractConfirmDeviceActivity.this;
            super(AbstractConfirmDeviceActivity.this, 212);
        }
    }

    private class b extends com.fitbit.home.ui.b
    {

        final AbstractConfirmDeviceActivity a;
        private com.fitbit.util.q.a b;

        public void a(Exception exception)
        {
            g();
            if (exception instanceof ServerResponseException)
            {
                exception = a.getString(((ServerResponseException)exception).a());
                s.a(a, exception, 1).i();
            } else
            {
                if (exception instanceof MobileTrackBackOffException)
                {
                    exception = (MobileTrackBackOffException)exception;
                    if (exception.c().equals(com.fitbit.data.bl.exceptions.MobileTrackBackOffException.BackOffType.c))
                    {
                        s.a(a, exception.getMessage(), 1).i();
                        d();
                        return;
                    } else
                    {
                        com.fitbit.device.ui.setup.AbstractConfirmDeviceActivity.a(a, exception.getMessage());
                        return;
                    }
                }
                if (exception instanceof NetworkTimeoutException)
                {
                    e();
                    return;
                }
                if (exception instanceof TrackerSigningKeyExpiredException)
                {
                    exception = s.a(a, 0x7f08015a, 0);
        /* block-local class not found */
        class _cls4 {}

                    exception.a(new _cls4());
                    exception.i();
                    return;
                }
                if (exception instanceof ServerCommunicationException)
                {
                    f();
                    return;
                }
                if (exception instanceof JSONException)
                {
                    c(b);
                    return;
                }
                if (exception != null)
                {
                    s.a(a, exception.getMessage(), 0).i();
                    return;
                }
            }
        }

        public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
        {
            super.b(simpleconfirmdialogfragment);
            a.setResult(-1);
            a.finish();
        }

        public b()
        {
            a = AbstractConfirmDeviceActivity.this;
        /* block-local class not found */
        class _cls1 {}

        /* block-local class not found */
        class _cls2 {}

            super(AbstractConfirmDeviceActivity.this, new _cls1(AbstractConfirmDeviceActivity.this), new _cls2(AbstractConfirmDeviceActivity.this));
        /* block-local class not found */
        class _cls3 {}

            b = new _cls3();
        }
    }


    private static final String i = "TAG_BATTERY_DRAIN_DIALOG";
    private static final String j = "TAG_BACK_OFF_DIALOG";
    private static final int k = 4905;
    protected TextView a;
    protected TextView b;
    protected LoadablePicassoImageView c;
    protected Button d;
    protected Button e;
    protected View f;
    protected TrackerType g;
    protected String h;
    private g l;
    private c m;

    public AbstractConfirmDeviceActivity()
    {
        m = new c() {

            final AbstractConfirmDeviceActivity a;

            public void a(Intent intent)
            {
                if ("com.fitbit.FitbitMobile.ChinaConfirmationDialogController.BLUETOOTH_ACTION_PERMISSION_RESPONSE".equals(intent.getAction()) && intent.getBooleanExtra("com.fitbit.FitbitMobile.ChinaConfirmationDialogController.ACTION_PERMISSION_RESPONSE_VALUE_KEY", false))
                {
                    com.fitbit.device.ui.setup.AbstractConfirmDeviceActivity.a(a);
                }
            }

            
            {
                a = AbstractConfirmDeviceActivity.this;
                super();
            }
        };
    }

    static void a(AbstractConfirmDeviceActivity abstractconfirmdeviceactivity)
    {
        abstractconfirmdeviceactivity.l();
    }

    static void a(AbstractConfirmDeviceActivity abstractconfirmdeviceactivity, String s)
    {
        abstractconfirmdeviceactivity.a(s);
    }

    private void a(String s)
    {
        s = SimpleConfirmDialogFragment.a(new com.fitbit.util.SimpleConfirmDialogFragment.a() {

            final AbstractConfirmDeviceActivity a;

            public void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
            {
                com.fitbit.device.ui.setup.AbstractConfirmDeviceActivity.b(a);
            }

            public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
            {
                com.fitbit.device.ui.setup.AbstractConfirmDeviceActivity.b(a);
            }

            public void c(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
            {
            }

            
            {
                a = AbstractConfirmDeviceActivity.this;
                super();
            }
        }, 0x7f08042e, 0, -1, s);
        ad.a(getSupportFragmentManager(), "TAG_BACK_OFF_DIALOG", s);
    }

    static void b(AbstractConfirmDeviceActivity abstractconfirmdeviceactivity)
    {
        abstractconfirmdeviceactivity.n();
    }

    static g c(AbstractConfirmDeviceActivity abstractconfirmdeviceactivity)
    {
        return abstractconfirmdeviceactivity.l;
    }

    private void j()
    {
        if (g == null)
        {
            d();
            return;
        } else
        {
            e();
            return;
        }
    }

    private void k()
    {
        l = new a();
        l.a(new b());
        l.a(al.a(this));
    }

    private void l()
    {
        TrackerSyncPreferencesSavedState.c(true);
        if (com.fitbit.bluetooth.g.b(this, new com.fitbit.util.EnableBluetoothDialog.a() {

        final AbstractConfirmDeviceActivity a;

        public void a()
        {
            a.i();
        }

        public void b()
        {
            com.fitbit.device.ui.setup.AbstractConfirmDeviceActivity.a(a);
        }

        public void c()
        {
            a.i();
        }

            
            {
                a = AbstractConfirmDeviceActivity.this;
                super();
            }
    }, "BluetoothUtils.REQUEST_ENABLE_BLUETOOTH"))
        {
            String s = g.a();
            com.fitbit.mixpanel.f.e();
            com.fitbit.mixpanel.f.a(s.toLowerCase());
            SynclairActivity.a(this, g);
        }
    }

    private String m()
    {
        if (g != null)
        {
            return g.a();
        } else
        {
            return h;
        }
    }

    private void n()
    {
        SimpleConfirmDialogFragment simpleconfirmdialogfragment = SimpleConfirmDialogFragment.a(new com.fitbit.util.SimpleConfirmDialogFragment.a() {

            final AbstractConfirmDeviceActivity a;

            public void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment1)
            {
                a.setResult(-1);
                a.finish();
            }

            public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment1)
            {
                a.setResult(-1);
                a.finish();
            }

            public void c(SimpleConfirmDialogFragment simpleconfirmdialogfragment1)
            {
            }

            
            {
                a = AbstractConfirmDeviceActivity.this;
                super();
            }
        }, 0x7f08042e, 0, -1, 0x7f0804d9);
        ad.a(getSupportFragmentManager(), "TAG_BATTERY_DRAIN_DIALOG", simpleconfirmdialogfragment);
    }

    protected void a(int i1, Intent intent)
    {
        setResult(-1, intent);
        finish();
    }

    protected void a(String s, boolean flag)
    {
        if (flag)
        {
            MixPanelTrackingHelper.a(com.fitbit.mixpanel.MixPanelTrackingHelper.PairingStatus.a);
            com.fitbit.mixpanel.f.a(new d(h));
        }
        if (TextUtils.isEmpty(s))
        {
            setResult(-1);
        } else
        {
            Intent intent = new Intent();
            intent.putExtra("EXTRA_CANCEL_RESULT_REASON", s);
            setResult(-1, intent);
        }
        finish();
    }

    protected void c()
    {
        j();
    }

    protected void d()
    {
        com.fitbit.util.i.b.a(f, 0x7f020226);
        if (com.fitbit.pedometer.k.a())
        {
            c.setImageResource(0x7f020192);
            return;
        } else
        {
            c.setImageResource(0x7f020191);
            return;
        }
    }

    protected void e()
    {
        if (g.d() != null)
        {
            com.fitbit.util.i.b.a(f, g.d().e(), g.d().f());
            c.a(g.d().i());
        }
    }

    protected void e_(int i1)
    {
        if (i1 == -1 && an.a().g())
        {
            com.fitbit.savedstate.k.a(g);
            h();
            return;
        } else
        {
            MixPanelTrackingHelper.a(com.fitbit.mixpanel.MixPanelTrackingHelper.PairingStatus.a);
            com.fitbit.mixpanel.f.a(new d(m()));
            setResult(-1);
            finish();
            return;
        }
    }

    protected void f()
    {
        if (g != null && g.a().equalsIgnoreCase("aria"))
        {
            g();
            return;
        }
        if (an.a().g())
        {
            h();
            return;
        } else
        {
            com.fitbit.multipledevice.a.a().c();
            LoginActivity.a(this, 4905);
            return;
        }
    }

    protected void g()
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(getString(0x7f08005b)));
        startActivity(intent);
        finish();
    }

    protected void h()
    {
        if (g != null)
        {
            l();
            return;
        } else
        {
            k();
            return;
        }
    }

    protected void i()
    {
        a(((String) (null)), true);
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        S().c();
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        MixPanelTrackingHelper.a(com.fitbit.mixpanel.MixPanelTrackingHelper.PairingStatus.a);
        com.fitbit.mixpanel.f.a(new d(m()));
    }

    protected void onPause()
    {
        super.onPause();
        m.d();
    }

    protected void onResume()
    {
        super.onResume();
        m.a(new IntentFilter("com.fitbit.FitbitMobile.ChinaConfirmationDialogController.BLUETOOTH_ACTION_PERMISSION_RESPONSE"));
    }

    protected void onResumeFragments()
    {
        super.onResumeFragments();
        if (ad.a(this, "TAG_BATTERY_DRAIN_DIALOG"))
        {
            n();
        }
    }
}
