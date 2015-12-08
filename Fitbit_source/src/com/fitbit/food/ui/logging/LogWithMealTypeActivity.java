// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.AsyncTaskLoader;
import android.support.v4.content.Loader;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.fitbit.data.domain.MealType;
import com.fitbit.food.ui.logging.views.ChooseMealTypeView;
import com.fitbit.home.ui.f;
import com.fitbit.home.ui.l;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.ui.s;
import com.fitbit.util.av;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class LogWithMealTypeActivity extends FitbitActivity
    implements android.content.DialogInterface.OnCancelListener, android.support.v4.app.LoaderManager.LoaderCallbacks
{

    protected Date A;
    protected MealType B;
    protected ChooseMealTypeView C;
    protected View D;
    protected AtomicBoolean E;
    protected boolean F;
    private f a;

    public LogWithMealTypeActivity()
    {
        B = null;
        E = new AtomicBoolean(false);
        F = false;
    }

    static f a(LogWithMealTypeActivity logwithmealtypeactivity)
    {
        return logwithmealtypeactivity.a;
    }

    protected abstract void a(Activity activity);

    public void a(Loader loader, av av1)
    {
        av1.b();
        JVM INSTR tableswitch -3 -1: default 32
    //                   -3 107
    //                   -2 32
    //                   -1 47;
           goto _L1 _L2 _L1 _L3
_L1:
        s.a(this, 0x7f08056e, 0).i();
        finish();
_L5:
        return;
_L3:
        if (!F)
        {
            a.d();
        }
        F = true;
        a(av1);
        if (D.getVisibility() == 0) goto _L5; else goto _L4
_L4:
        loader = AnimationUtils.loadAnimation(this, 0x10a0000);
        D.startAnimation(loader);
        D.setVisibility(0);
        return;
_L2:
        a.a(null);
        return;
    }

    protected abstract void a(MealType mealtype);

    protected abstract void a(av av1);

    protected void c()
    {
        D.setVisibility(4);
        C.a(new com.fitbit.food.ui.logging.views.ChooseMealTypeView.a() {

            final LogWithMealTypeActivity a;

            public void a(ChooseMealTypeView choosemealtypeview)
            {
                a.a(choosemealtypeview.a());
            }

            
            {
                a = LogWithMealTypeActivity.this;
                super();
            }
        });
        a = new l(this, 0x7f1100a4, new com.fitbit.home.ui.l.a() {

            final LogWithMealTypeActivity a;

            public void a(l l1)
            {
                LogWithMealTypeActivity.a(a).c();
                a.getSupportLoaderManager().restartLoader(a.e(), null, a);
            }

            
            {
                a = LogWithMealTypeActivity.this;
                super();
            }
        }, this);
        a.c();
        getSupportLoaderManager().initLoader(e(), null, this);
    }

    protected abstract int e();

    protected abstract void k();

    protected abstract void l();

    protected abstract void m();

    protected abstract AsyncTaskLoader n();

    protected void o()
    {
        if (E.compareAndSet(false, true))
        {
            m();
            k();
            com.fitbit.util.f.a(new com.fitbit.util.f.a(this) {

                final LogWithMealTypeActivity a;

                public void a(Activity activity)
                {
                    a.a(activity);
                    a.E.set(false);
                }

                public void a(Object obj)
                {
                    b((Activity)obj);
                }

                public void b(Activity activity)
                {
                    a.l();
                }

                public void b(Object obj)
                {
                    a((Activity)obj);
                }

            
            {
                a = LogWithMealTypeActivity.this;
                super(activity);
            }
            });
        }
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        getSupportLoaderManager().getLoader(e()).stopLoading();
        finish();
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        return n();
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (av)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    protected void onResume()
    {
        super.onResume();
        if (C != null)
        {
            C.d();
        }
    }
}
