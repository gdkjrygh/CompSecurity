// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TableLayout;
import android.widget.TextView;
import com.fitbit.customui.HeartRatePicker;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.heartrate.HeartRateZone;
import com.fitbit.heartrate.HeartRate;
import com.fitbit.profile.ui.a;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.ui.HeartRateZoneView;
import com.fitbit.ui.s;
import com.fitbit.util.ag;
import java.io.Serializable;

public class HeartRateCustomZoneActivity extends FitbitActivity
    implements android.support.v4.app.LoaderManager.LoaderCallbacks
{
    static final class HRZoneSaveModel
        implements Serializable
    {

        private static final long serialVersionUID = 1L;
        boolean enabledCustomZone;
        int lowerLimit;
        int upperLimit;

        public void a(b b1)
        {
            enabledCustomZone = b1.a();
            upperLimit = b1.b();
            lowerLimit = b1.c();
        }

        HRZoneSaveModel()
        {
        }
    }

    private class a
    {

        final HeartRateCustomZoneActivity a;
        private final View b;

        public int a()
        {
            return (int)Math.round(((HeartRate)((HeartRatePicker)b.findViewById(0x7f1103d1)).g()).b());
        }

        public void a(int i1)
        {
            ((TextView)b.findViewById(0x7f1103d0)).setText(i1);
        }

        public void b()
        {
            HeartRatePicker heartratepicker = (HeartRatePicker)b.findViewById(0x7f1103d1);
            heartratepicker.f();
            heartratepicker.a(true);
            heartratepicker.a(new com.fitbit.customui.MeasurablePicker.a(this) {

                final a a;

                public void a(HeartRate heartrate)
                {
                    com.fitbit.settings.ui.HeartRateCustomZoneActivity.a(a.a, heartrate);
                }

                public volatile void a(Object obj)
                {
                    a((HeartRate)obj);
                }

            
            {
                a = a1;
                super();
            }
            });
        }

        public void b(int i1)
        {
            ((HeartRatePicker)b.findViewById(0x7f1103d1)).a(new HeartRate(i1));
        }

        public a(View view)
        {
            a = HeartRateCustomZoneActivity.this;
            super();
            b = view;
        }
    }

    final class b
    {

        final HeartRateCustomZoneActivity a;
        private boolean b;
        private int c;
        private int d;

        public void a(int i1)
        {
            c = i1;
        }

        public void a(Profile profile)
        {
            if (profile != null)
            {
                b = profile.C();
                c = profile.B();
                d = profile.z();
            }
        }

        public void a(HRZoneSaveModel hrzonesavemodel)
        {
            if (hrzonesavemodel != null)
            {
                b = hrzonesavemodel.enabledCustomZone;
                c = hrzonesavemodel.upperLimit;
                d = hrzonesavemodel.lowerLimit;
            }
        }

        public void a(boolean flag)
        {
            b = flag;
        }

        public boolean a()
        {
            return b;
        }

        public int b()
        {
            return c;
        }

        public void b(int i1)
        {
            d = i1;
        }

        public int c()
        {
            return d;
        }

        public int d()
        {
            while (b && (c == 0 || c < 30 || c > 220 || c - d < 1)) 
            {
                return 0x7f080183;
            }
            return 0;
        }

        public int e()
        {
            while (b && (d == 0 || d < 30 || d > 220 || c - d < 1)) 
            {
                return 0x7f080183;
            }
            return 0;
        }

        b()
        {
            a = HeartRateCustomZoneActivity.this;
            super();
        }
    }


    private static final String h = "HeartRateCustomZoneActivity";
    private static final String i = "com.fitbit.device.ui.HeartRateCustomZoneActivity.EXTRA_SAVE_MODEL";
    protected HeartRateZoneView a;
    protected CheckBox b;
    protected TableLayout c;
    protected View d;
    protected View e;
    protected View f;
    protected View g;
    private Profile j;
    private b k;
    private HRZoneSaveModel l;
    private boolean m;
    private boolean n;
    private Handler o;
    private Runnable p;

    public HeartRateCustomZoneActivity()
    {
        m = false;
        n = false;
        o = new Handler(Looper.getMainLooper());
        p = new Runnable() {

            final HeartRateCustomZoneActivity a;

            public void run()
            {
                a.f.setVisibility(0);
                a.f.setAnimation(AnimationUtils.loadAnimation(a, 0x7f050009));
            }

            
            {
                a = HeartRateCustomZoneActivity.this;
                super();
            }
        };
    }

    static b a(HeartRateCustomZoneActivity heartratecustomzoneactivity)
    {
        return heartratecustomzoneactivity.k;
    }

    private void a(HeartRate heartrate)
    {
        if (!n)
        {
            p();
            n();
        }
    }

    static void a(HeartRateCustomZoneActivity heartratecustomzoneactivity, HeartRate heartrate)
    {
        heartratecustomzoneactivity.a(heartrate);
    }

    private void a(boolean flag)
    {
        if (flag)
        {
            if (d.getParent() == null)
            {
                LayoutInflater.from(this).inflate(0x7f040147, c);
                c.addView(d);
            }
            if (e.getParent() == null)
            {
                LayoutInflater.from(this).inflate(0x7f040147, c);
                c.addView(e);
            }
            return;
        } else
        {
            c.removeAllViews();
            return;
        }
    }

    static boolean b(HeartRateCustomZoneActivity heartratecustomzoneactivity)
    {
        return heartratecustomzoneactivity.n;
    }

    static void c(HeartRateCustomZoneActivity heartratecustomzoneactivity)
    {
        heartratecustomzoneactivity.n();
    }

    private void h()
    {
        k = new b();
        k.a(j);
        k.a(l);
    }

    private void i()
    {
        int j1 = k.e();
        int i1 = k.c();
        (new a(e)).b(i1);
        HeartRateZoneView heartratezoneview = a;
        if (j1 != 0)
        {
            i1 = 0;
        }
        heartratezoneview.e(i1);
    }

    private void j()
    {
        int j1 = k.d();
        int i1 = k.b();
        (new a(d)).b(i1);
        HeartRateZoneView heartratezoneview = a;
        if (j1 != 0)
        {
            i1 = 0;
        }
        heartratezoneview.d(i1);
    }

    private void k()
    {
        b.setChecked(k.a());
    }

    private boolean l()
    {
        boolean flag;
        if (k.e() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (k.d() > 0)
        {
            flag = true;
        }
        if (flag)
        {
            s.a(this, getString(0x7f080183), 1).i();
            return false;
        } else
        {
            return true;
        }
    }

    private void m()
    {
        a.c(ag.d().b());
        a.b(ag.c().b());
        a.a(ag.b().b());
    }

    private void n()
    {
        n = true;
        i();
        j();
        a.a(k.a());
        a(k.a());
        n = false;
    }

    private void o()
    {
        f.setVisibility(8);
        if (g.getVisibility() != 0)
        {
            g.setAnimation(AnimationUtils.loadAnimation(this, 0x7f050009));
            g.setVisibility(0);
        }
    }

    private void p()
    {
        a a1 = new a(e);
        a a2 = new a(d);
        k.b(a1.a());
        k.a(a2.a());
    }

    public void a(Loader loader, Profile profile)
    {
        if (profile == null)
        {
            finish();
            return;
        } else
        {
            o.removeCallbacks(p);
            a(profile);
            o();
            return;
        }
    }

    void a(Profile profile)
    {
        j = profile;
        h();
        m();
        k();
        n();
    }

    protected void e()
    {
        d = LayoutInflater.from(this).inflate(0x7f040143, c, false);
        e = LayoutInflater.from(this).inflate(0x7f040143, c, false);
        a a1 = new a(d);
        a1.a(0x7f08036e);
        a1.b();
        a1 = new a(e);
        a1.a(0x7f08031b);
        a1.b();
        b.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final HeartRateCustomZoneActivity a;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                if (com.fitbit.settings.ui.HeartRateCustomZoneActivity.a(a) != null)
                {
                    com.fitbit.settings.ui.HeartRateCustomZoneActivity.a(a).a(flag);
                    if (!HeartRateCustomZoneActivity.b(a))
                    {
                        HeartRateCustomZoneActivity.c(a);
                    }
                }
            }

            
            {
                a = HeartRateCustomZoneActivity.this;
                super();
            }
        });
        o.postDelayed(p, 500L);
        getSupportLoaderManager().initLoader(23, null, this);
    }

    protected void f()
    {
        CheckBox checkbox = b;
        boolean flag;
        if (!b.isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        checkbox.setChecked(flag);
    }

    protected void g()
    {
        p();
        if (!l())
        {
            return;
        } else
        {
            j.e(k.a());
            j.a(k.c());
            j.b(k.b());
            an.a().a(j, this);
            finish();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            l = (HRZoneSaveModel)bundle.get("com.fitbit.device.ui.HeartRateCustomZoneActivity.EXTRA_SAVE_MODEL");
        }
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        return new com.fitbit.profile.ui.a(this, false);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        o.removeCallbacks(p);
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (Profile)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    protected void onPause()
    {
        m = false;
        super.onPause();
    }

    protected void onResume()
    {
        m = true;
        super.onResume();
        if (k != null)
        {
            n();
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (k != null)
        {
            HRZoneSaveModel hrzonesavemodel = new HRZoneSaveModel();
            hrzonesavemodel.a(k);
            bundle.putSerializable("com.fitbit.device.ui.HeartRateCustomZoneActivity.EXTRA_SAVE_MODEL", hrzonesavemodel);
        }
    }
}
