// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui.setup;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.fitbit.bluetooth.g;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.dg;
import com.fitbit.data.bl.exceptions.IncorrectTimestampException;
import com.fitbit.data.bl.exceptions.NetworkTimeoutException;
import com.fitbit.data.bl.fj;
import com.fitbit.data.bl.fm;
import com.fitbit.data.bl.o;
import com.fitbit.galileo.ui.sync.SyncUICase;
import com.fitbit.galileo.ui.sync.a;
import com.fitbit.galileo.ui.sync.b;
import com.fitbit.onboarding.OnboardingFragmentActivity;
import com.fitbit.pedometer.c;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.serverinteraction.restrictions.RestrictionInfo;
import com.fitbit.serverinteraction.restrictions.RestrictionsController;
import com.fitbit.ui.s;
import com.fitbit.util.RetryDialogFragment;
import com.fitbit.util.SimpleConfirmDialogFragment;
import com.fitbit.util.ar;
import com.fitbit.util.bf;
import java.util.List;

public abstract class AbstractChooseTrackerActivity extends OnboardingFragmentActivity
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, android.widget.AdapterView.OnItemClickListener, com.fitbit.util.SimpleConfirmDialogFragment.a
{
    public class a extends com.fitbit.home.ui.g
    {

        private static final int b = 1214;
        final AbstractChooseTrackerActivity a;

        public void a()
        {
            super.a();
            a.getSupportLoaderManager().restartLoader(0, null, a);
            dg.d().c(com.fitbit.device.ui.setup.AbstractChooseTrackerActivity.b(a));
        }

        public void a(Exception exception)
        {
            super.a(exception);
            com.fitbit.device.ui.setup.AbstractChooseTrackerActivity.a(a, exception);
            dg.d().c(com.fitbit.device.ui.setup.AbstractChooseTrackerActivity.b(a));
        }

        public a(FragmentActivity fragmentactivity)
        {
            a = AbstractChooseTrackerActivity.this;
            super(fragmentactivity, 1214);
        }
    }

    private static class b extends bf
    {

        public List a()
        {
            return o.a().b();
        }

        public Object f_()
        {
            return a();
        }

        public b(Context context)
        {
            super(context);
        }
    }

    public class c extends com.fitbit.home.ui.g
    {

        private static final int b = 1212;
        final AbstractChooseTrackerActivity a;

        public void a()
        {
            super.a();
            com.fitbit.device.ui.setup.AbstractChooseTrackerActivity.a(a).a(fj.a(a, false));
        }

        public void a(Exception exception)
        {
            super.a(exception);
            com.fitbit.device.ui.setup.AbstractChooseTrackerActivity.a(a, exception);
            dg.d().c(com.fitbit.device.ui.setup.AbstractChooseTrackerActivity.b(a));
        }

        public c(FragmentActivity fragmentactivity)
        {
            a = AbstractChooseTrackerActivity.this;
            super(fragmentactivity, 1212);
        }
    }


    public static final int a = 2011;
    private static final String f = "com.fitbit.onboarding.setup.ChooseTrackerActivity.TAG_RETRY_DIALOG";
    protected View b;
    protected ListView c;
    protected View d;
    protected List e;
    private boolean g;
    private boolean h;
    private c i;
    private a j;

    public AbstractChooseTrackerActivity()
    {
        g = false;
        i = new c(this);
        j = new a(this);
    }

    static a a(AbstractChooseTrackerActivity abstractchoosetrackeractivity)
    {
        return abstractchoosetrackeractivity.j;
    }

    protected static void a(Activity activity, com.fitbit.galileo.ui.sync.b b1)
    {
        SyncUICase syncuicase = b1.d();
        com.fitbit.galileo.ui.sync.a a1 = b1.e();
        b1.c(null);
        static class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[SyncUICase.values().length];
                try
                {
                    a[SyncUICase.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[SyncUICase.g.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[SyncUICase.j.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[SyncUICase.l.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[SyncUICase.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.fitbit.device.ui.setup._cls2.a[syncuicase.ordinal()])
        {
        default:
            if (!com.fitbit.bluetooth.g.c(activity));
            return;

        case 1: // '\001'
            s.a(activity, activity.getString(0x7f08053e), 1).i();
            return;

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            s.a(activity, a1.c, 1).i();
            break;
        }
    }

    static void a(AbstractChooseTrackerActivity abstractchoosetrackeractivity, Exception exception)
    {
        abstractchoosetrackeractivity.a(exception);
    }

    private void a(Exception exception)
    {
        g = false;
        c.post(new Runnable(exception) {

            final Exception a;
            final AbstractChooseTrackerActivity b;

            public void run()
            {
                if (b.P())
                {
                    FragmentTransaction fragmenttransaction = b.getSupportFragmentManager().beginTransaction();
                    Object obj = (RetryDialogFragment)b.getSupportFragmentManager().findFragmentByTag("com.fitbit.onboarding.setup.ChooseTrackerActivity.TAG_RETRY_DIALOG");
                    if (obj != null)
                    {
                        fragmenttransaction.detach(((android.support.v4.app.Fragment) (obj)));
                    }
                    obj = ServerGateway.a().b().a();
                    RestrictionInfo restrictioninfo = ServerGateway.a().b().c();
                    if (a != null && (a instanceof IncorrectTimestampException))
                    {
                        b.getIntent().putExtra("EXTRA_PENDING_MESSAGE", b.getString(0x7f080286));
                        b.setResult(0, b.getIntent());
                        b.finish();
                        return;
                    }
                    boolean flag = ar.c(b);
                    if (obj != null && flag)
                    {
                        if (obj == com.fitbit.serverinteraction.restrictions.RestrictionsController.PresenceListener.OfflineReason.d && restrictioninfo != null)
                        {
                            obj = RetryDialogFragment.a(b, 0x7f08048f, restrictioninfo.d());
                        } else
                        {
                            obj = RetryDialogFragment.a(b, 0x7f08048f, ((com.fitbit.serverinteraction.restrictions.RestrictionsController.PresenceListener.OfflineReason) (obj)).a(b, ServerGateway.a().b()));
                        }
                    } else
                    if (flag)
                    {
                        if (a != null && (a instanceof NetworkTimeoutException))
                        {
                            if (an.a().g())
                            {
                                obj = RetryDialogFragment.a(b, 0x7f08048f, 0x7f08048e);
                            } else
                            {
                                obj = RetryDialogFragment.a(b, 0x7f08048f, 0x7f080352);
                            }
                        } else
                        {
                            obj = RetryDialogFragment.a(b, 0x7f08048f, 0x7f08018e);
                        }
                    } else
                    {
                        obj = RetryDialogFragment.a(b, 0x7f08048f, 0x7f08048e);
                    }
                    fragmenttransaction.add(((android.support.v4.app.Fragment) (obj)), "com.fitbit.onboarding.setup.ChooseTrackerActivity.TAG_RETRY_DIALOG").commit();
                    return;
                } else
                {
                    com.fitbit.device.ui.setup.AbstractChooseTrackerActivity.a(b, true);
                    return;
                }
            }

            
            {
                b = AbstractChooseTrackerActivity.this;
                a = exception;
                super();
            }
        });
    }

    static boolean a(AbstractChooseTrackerActivity abstractchoosetrackeractivity, boolean flag)
    {
        abstractchoosetrackeractivity.g = flag;
        return flag;
    }

    static boolean b(AbstractChooseTrackerActivity abstractchoosetrackeractivity)
    {
        return abstractchoosetrackeractivity.h;
    }

    private void f()
    {
        h = dg.d().f();
        dg.d().c(true);
        i.a(fm.a(this, false));
    }

    protected abstract ListAdapter a(List list);

    public void a(Loader loader, List list)
    {
        e = list;
        if (list != null)
        {
            c.setAdapter(a(e));
        }
    }

    public void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
        f();
    }

    public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
        finish();
    }

    protected void c()
    {
        com.fitbit.util.b.a.a(getResources().getDrawable(0x7f020226), d);
        c.setOnItemClickListener(this);
        c.setEmptyView(b);
    }

    public void c(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
    }

    public void finish()
    {
        super.finish();
        com.fitbit.multipledevice.a.a().d();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = (RetryDialogFragment)getSupportFragmentManager().findFragmentByTag("com.fitbit.onboarding.setup.ChooseTrackerActivity.TAG_RETRY_DIALOG");
        if (bundle != null)
        {
            getSupportFragmentManager().beginTransaction().detach(bundle).commit();
        }
        f();
    }

    public Loader onCreateLoader(int k, Bundle bundle)
    {
        return new b(this);
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (List)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    protected void onPostResume()
    {
        super.onPostResume();
        U().e();
    }

    protected void onResume()
    {
        super.onResume();
        if (g)
        {
            a(((Exception) (null)));
        }
    }
}
