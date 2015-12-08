// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.weight.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.util.Pair;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import com.fitbit.customui.FatPicker;
import com.fitbit.customui.WeightPicker;
import com.fitbit.data.bl.fs;
import com.fitbit.data.bl.gd;
import com.fitbit.data.domain.BodyFat;
import com.fitbit.data.domain.BodyFatLogEntry;
import com.fitbit.data.domain.BodyWeight;
import com.fitbit.data.domain.WeightLogEntry;
import com.fitbit.data.domain.r;
import com.fitbit.home.ui.DetailActivity;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.ui.s;
import com.fitbit.util.bf;
import com.fitbit.util.bq;
import com.fitbit.util.f;
import com.fitbit.util.format.e;
import com.fitbit.weight.Fat;
import com.fitbit.weight.Weight;
import java.util.Date;
import java.util.List;

public class WeightLogActivity extends FitbitActivity
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, android.view.View.OnClickListener, com.fitbit.customui.WeightPicker.a
{

    public static final String a = "com.fitbit.weight.ui.EXTRA_DATE";
    private WeightPicker b;
    private FatPicker c;
    private Button d;
    private Date e;
    private View f;
    private boolean g;

    public WeightLogActivity()
    {
    }

    static boolean a(WeightLogActivity weightlogactivity, boolean flag)
    {
        weightlogactivity.g = flag;
        return flag;
    }

    private Bundle f()
    {
        Bundle bundle = new Bundle(1);
        bundle.putSerializable("com.fitbit.weight.ui.EXTRA_DATE", e);
        return bundle;
    }

    public void a(Loader loader, Pair pair)
    {
        com.fitbit.data.domain.WeightLogEntry.WeightUnits weightunits = r.a();
        if (pair != null)
        {
            Weight weight;
            if (pair.second == null || ((BodyFat)pair.second).c().b() == 0.0D)
            {
                loader = new Fat(-1D);
            } else
            {
                loader = ((BodyFat)pair.second).c();
            }
            weight = ((WeightLogEntry)pair.first).a();
            pair = loader;
            loader = weight;
        } else
        {
            loader = new Weight(0.0D, weightunits);
            pair = new Fat(-1D);
        }
        b.a(loader.a(weightunits));
        c.a(pair);
        b.a(this);
        d.setEnabled(true);
        if (f.getVisibility() != 0)
        {
            f.setVisibility(0);
            loader = AnimationUtils.loadAnimation(this, 0x10a0000);
            loader.setDuration(150L);
            f.setAnimation(loader);
        }
    }

    public void a(com.fitbit.data.domain.WeightLogEntry.WeightUnits weightunits)
    {
        r.a(this, weightunits);
    }

    public void onClick(View view)
    {
        if (b != null && c != null)
        {
            Bundle bundle = new Bundle();
            Weight weight = (Weight)b.g();
            view = new BodyWeight();
            view.a(weight);
            Fat fat = (Fat)c.g();
            bundle.putSerializable("weight", view);
            double d1;
            if (fat.b() != -1D)
            {
                view = new BodyFat();
                view.a(fat);
                bundle.putSerializable("fat", view);
            } else
            {
                view = null;
            }
            bundle.putSerializable("date", e);
            if (view == null)
            {
                d1 = 0.0D;
            } else
            {
                d1 = view.c().b();
            }
            if (view != null && (d1 < 5D || d1 > 75D) && d1 != -1D)
            {
                s.a(this, getString(0x7f080184, new Object[] {
                    com.fitbit.util.format.e.a(5D, 0), com.fitbit.util.format.e.a(75D, 0), com.fitbit.util.format.e.a(d1, 1)
                }), 1).i();
                return;
            }
            if (weight.b() > 0.0D)
            {
                if (!g)
                {
                    g = true;
                    com.fitbit.util.f.a(new com.fitbit.util.f.a(this, bundle) {

                        final WeightLogActivity a;

                        public void a(Activity activity)
                        {
                            activity = (Date)g().getSerializable("date");
                            BodyWeight bodyweight = (BodyWeight)g().getSerializable("weight");
                            BodyFat bodyfat = (BodyFat)g().getSerializable("fat");
                            WeightLogEntry weightlogentry = new WeightLogEntry();
                            weightlogentry.setLogDate(activity);
                            weightlogentry.a(bodyweight.c());
                            if (bodyfat != null)
                            {
                                bodyfat.a(activity);
                                BodyFatLogEntry bodyfatlogentry = new BodyFatLogEntry();
                                bodyfatlogentry.a(bodyfat.c());
                                bodyfatlogentry.setLogDate(activity);
                                gd.a().a(weightlogentry, bodyfatlogentry, a);
                                return;
                            } else
                            {
                                gd.a().a(weightlogentry, a);
                                return;
                            }
                        }

                        public void a(Object obj)
                        {
                            b((Activity)obj);
                        }

                        public void b(Activity activity)
                        {
                            super.a(activity);
                            WeightLogActivity.a(a, false);
                        }

                        public void b(Object obj)
                        {
                            a((Activity)obj);
                        }

            
            {
                a = WeightLogActivity.this;
                super(activity, bundle);
            }
                    });
                    bq.a(this);
                    DetailActivity.a(this);
                    return;
                }
            } else
            {
                s.a(this, getString(0x7f080298), 1).i();
                return;
            }
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f040033);
        d = (Button)findViewById(0x7f110162);
        d.setEnabled(false);
        d.setOnClickListener(this);
        e = (Date)getIntent().getSerializableExtra("com.fitbit.weight.ui.EXTRA_DATE");
        b = (WeightPicker)findViewById(0x7f11015f);
        c = (FatPicker)findViewById(0x7f110161);
        c.f();
        c.a(true);
        f = findViewById(0x1020002);
        f.setVisibility(4);
        getSupportLoaderManager().initLoader(0, f(), this);
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        bundle = (Date)bundle.get("com.fitbit.weight.ui.EXTRA_DATE");
        return new bf(getApplicationContext(), bundle) {

            final Date a;
            final WeightLogActivity b;

            protected Pair a()
            {
                List list = gd.a().b(a);
                Object obj = null;
                if (list.size() != 0)
                {
                    BodyFatLogEntry bodyfatlogentry = com.fitbit.data.bl.f.a().b(((WeightLogEntry)list.get(list.size() - 1)).getLogDate());
                    if (bodyfatlogentry != null)
                    {
                        obj = new BodyFat();
                        ((BodyFat) (obj)).a(bodyfatlogentry.getLogDate());
                        ((BodyFat) (obj)).a(bodyfatlogentry.a().b());
                    } else
                    {
                        obj = (BodyFat)fs.a().a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.BODY_FAT, ((WeightLogEntry)list.get(list.size() - 1)).getLogDate());
                    }
                    obj = new Pair(list.get(list.size() - 1), obj);
                }
                return ((Pair) (obj));
            }

            protected Object f_()
            {
                return a();
            }

            
            {
                b = WeightLogActivity.this;
                a = date;
                super(context);
            }
        };
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (Pair)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }
}
