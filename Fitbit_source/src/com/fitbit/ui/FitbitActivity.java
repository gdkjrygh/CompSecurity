// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.NavUtils;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import com.fitbit.AppUpdateManager;
import com.fitbit.ApplicationForegroundController;
import com.fitbit.FitBitApplication;
import com.fitbit.analytics.google.ga.AnalyticsContainer;
import com.fitbit.data.bl.an;
import com.fitbit.dncs.ui.DncsPairingRequestDialogController;
import com.fitbit.galileo.ui.sync.b;
import com.fitbit.home.ui.HomeActivity;
import com.fitbit.home.ui.HomeNavigationItem;
import com.fitbit.mixpanel.f;
import com.fitbit.pedometer.c;
import com.fitbit.savedstate.k;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.serverinteraction.restrictions.RestrictionsController;
import com.fitbit.util.PushNotificationsController;
import com.fitbit.util.SimpleConfirmDialogFragment;
import com.fitbit.util.af;
import com.fitbit.util.ar;
import com.fitbit.util.fonts.CustomTypefaceSpan;
import com.fitbit.util.fonts.FitbitFont;
import com.fitbit.util.i.a;
import com.fitbit.util.i.d;
import com.fitbit.util.i.g;
import com.google.android.gms.common.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.ui:
//            s, BluetoothMessagesController, b

public class FitbitActivity extends ActionBarActivity
    implements com.fitbit.savedstate.k.a
{
    public static class GooglePlayServicesDialogFragment extends DialogFragment
    {

        private android.content.DialogInterface.OnCancelListener a;

        public static GooglePlayServicesDialogFragment a(int i1, int j1)
        {
            Bundle bundle = new Bundle();
            bundle.putInt("error-code", i1);
            bundle.putInt("request-code", j1);
            GooglePlayServicesDialogFragment googleplayservicesdialogfragment = new GooglePlayServicesDialogFragment();
            googleplayservicesdialogfragment.setArguments(bundle);
            return googleplayservicesdialogfragment;
        }

        public void a(android.content.DialogInterface.OnCancelListener oncancellistener)
        {
            a = oncancellistener;
        }

        public Dialog onCreateDialog(Bundle bundle)
        {
            int i1 = getArguments().getInt("error-code");
            int j1 = getArguments().getInt("request-code");
            return com.google.android.gms.common.e.a(i1, getActivity(), j1, a);
        }

        public GooglePlayServicesDialogFragment()
        {
            setArguments(new Bundle());
        }
    }


    public static final String G = "EXTRA_PENDING_MESSAGE";
    protected static final String H = (new StringBuilder()).append(com/fitbit/ui/FitbitActivity.getName()).append(".TAG_ALERT_DIALOG").toString();
    private static final String a = com/fitbit/ui/FitbitActivity.getSimpleName();
    private static final List b = new ArrayList();
    protected b I;
    private ar c;
    private PushNotificationsController d;
    private BluetoothMessagesController e;
    private c f;
    private com.fitbit.ui.b g;
    private com.fitbit.ui.c.a h;
    private final List i;
    private boolean j;
    private boolean k;
    private boolean l;
    private final BroadcastReceiver m = new BroadcastReceiver() {

        final FitbitActivity a;

        public void onReceive(Context context, Intent intent)
        {
            HomeActivity.a(a);
        }

            
            {
                a = FitbitActivity.this;
                super();
            }
    };
    private final com.fitbit.util.ar.a n = new com.fitbit.util.ar.a() {

        final FitbitActivity a;

        public void j()
        {
            com.fitbit.ui.FitbitActivity.a(a).a(com.fitbit.serverinteraction.restrictions.RestrictionsController.PresenceListener.OfflineReason.a);
        }

        public void l_()
        {
            if (!ServerGateway.a().e())
            {
                com.fitbit.ui.FitbitActivity.a(a).a();
            }
        }

            
            {
                a = FitbitActivity.this;
                super();
            }
    };
    private final com.fitbit.serverinteraction.restrictions.RestrictionsController.PresenceListener o = new com.fitbit.serverinteraction.restrictions.RestrictionsController.PresenceListener() {

        final FitbitActivity a;

        public void a()
        {
            a.runOnUiThread(new Runnable(this) {

                final _cls3 a;

                public void run()
                {
                    a.a.m_();
                }

            
            {
                a = _pcls3;
                super();
            }
            });
        }

        public void a(com.fitbit.serverinteraction.restrictions.RestrictionsController.PresenceListener.OfflineReason offlinereason)
        {
            a.runOnUiThread(new Runnable(this) {

                final _cls3 a;

                public void run()
                {
                    a.a.t_();
                }

            
            {
                a = _pcls3;
                super();
            }
            });
        }

            
            {
                a = FitbitActivity.this;
                super();
            }
    };

    public FitbitActivity()
    {
        j = false;
        k = false;
        l = true;
        ArrayList arraylist = new ArrayList();
        arraylist.add(new a());
        arraylist.add(new g());
        i = Collections.unmodifiableList(arraylist);
    }

    public static List Z()
    {
        ArrayList arraylist;
        synchronized (b)
        {
            arraylist = new ArrayList(b);
        }
        return arraylist;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static com.fitbit.serverinteraction.restrictions.RestrictionsController.PresenceListener a(FitbitActivity fitbitactivity)
    {
        return fitbitactivity.o;
    }

    private void h()
    {
        SimpleConfirmDialogFragment simpleconfirmdialogfragment = (SimpleConfirmDialogFragment)getSupportFragmentManager().findFragmentByTag(H);
        if (simpleconfirmdialogfragment != null && simpleconfirmdialogfragment.getDialog() != null)
        {
            simpleconfirmdialogfragment.getDialog().hide();
            simpleconfirmdialogfragment.getDialog().show();
        }
    }

    private boolean k()
    {
        try
        {
            getPackageManager().getPackageInfo("com.android.vending", 0);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return false;
        }
        return true;
    }

    private void l()
    {
        TypedValue typedvalue = new TypedValue();
        getTheme().resolveAttribute(0x7f010178, typedvalue, true);
        int i1 = aa();
        if (i1 != typedvalue.data)
        {
            setTaskDescription(new android.app.ActivityManager.TaskDescription(null, null, i1));
        }
    }

    private void m()
    {
        boolean flag1 = true;
        ActivityInfo activityinfo = getPackageManager().getActivityInfo(getComponentName(), 129);
        boolean flag = flag1;
        try
        {
            if (activityinfo.metaData != null)
            {
                flag = activityinfo.metaData.getBoolean("fitbit.HOME_AS_UP", true);
            }
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            com.fitbit.e.a.f(a, "failed to check for homeAsUp", namenotfoundexception, new Object[0]);
            flag = flag1;
        }
        if (getSupportActionBar() != null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(flag);
        }
        return;
    }

    protected final boolean O()
    {
        return j;
    }

    public final boolean P()
    {
        return k;
    }

    public final boolean Q()
    {
        if (com.fitbit.util.b.a.a(17))
        {
            return isDestroyed();
        } else
        {
            return false;
        }
    }

    protected final BluetoothMessagesController R()
    {
        return e;
    }

    protected final com.fitbit.ui.b S()
    {
        return g;
    }

    protected final PushNotificationsController T()
    {
        return d;
    }

    public final c U()
    {
        return f;
    }

    public final com.fitbit.ui.c.a V()
    {
        return h;
    }

    protected void W()
    {
        int i1 = com.google.android.gms.common.e.a(this);
        switch (i1)
        {
        default:
            if (com.google.android.gms.common.e.c(i1) && k())
            {
                k(i1);
                return;
            } else
            {
                a(i1);
                return;
            }

        case 0: // '\0'
            o_();
            return;
        }
    }

    protected void X()
    {
        finish();
    }

    protected int Y()
    {
        return 0;
    }

    protected void a(int i1)
    {
        com.fitbit.e.a.f(getClass().getSimpleName(), String.format("Google Play Services not able to be received on this machine, bail %s", new Object[] {
            Integer.valueOf(i1)
        }), new Object[0]);
        finish();
    }

    public void a(Class class1)
    {
        if (class1.equals(com/fitbit/savedstate/k))
        {
            n_();
        }
    }

    protected int aa()
    {
        TypedValue typedvalue = new TypedValue();
        getTheme().resolveAttribute(0x7f01000c, typedvalue, true);
        return typedvalue.data;
    }

    protected void c(HomeNavigationItem homenavigationitem)
    {
        if (homenavigationitem == null)
        {
            HomeActivity.c(this);
        } else
        {
            HomeActivity.a(this, homenavigationitem);
        }
        finish();
    }

    protected void k(int i1)
    {
        Object obj = getSupportFragmentManager().findFragmentByTag("google-play-services-error-dialog");
        FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
        if (obj != null)
        {
            fragmenttransaction.remove(((android.support.v4.app.Fragment) (obj)));
        }
        obj = com.fitbit.ui.GooglePlayServicesDialogFragment.a(i1, Y());
        ((GooglePlayServicesDialogFragment) (obj)).setCancelable(true);
        ((GooglePlayServicesDialogFragment) (obj)).a(new android.content.DialogInterface.OnCancelListener() {

            final FitbitActivity a;

            public void onCancel(DialogInterface dialoginterface)
            {
                a.X();
            }

            
            {
                a = FitbitActivity.this;
                super();
            }
        });
        ((GooglePlayServicesDialogFragment) (obj)).show(fragmenttransaction, "google-play-services-error-dialog");
    }

    protected void m_()
    {
    }

    protected void n_()
    {
    }

    protected void o_()
    {
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (l && intent != null && intent.getExtras() != null && intent.hasExtra("EXTRA_PENDING_MESSAGE"))
        {
            com.fitbit.ui.s.a(this, intent.getExtras().getString("EXTRA_PENDING_MESSAGE"), 1).i();
        }
    }

    protected void onApplyThemeResource(android.content.res.Resources.Theme theme, int i1, boolean flag)
    {
        super.onApplyThemeResource(theme, i1, flag);
        if (com.fitbit.util.b.a.a(21))
        {
            l();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        I = com.fitbit.galileo.ui.sync.b.a(this);
        d = new PushNotificationsController(this);
        e = new BluetoothMessagesController(this, bundle);
        f = new c(this);
        g = new com.fitbit.ui.b(this);
        c = new ar(n);
        h = new com.fitbit.ui.c.a();
        m();
    }

    public View onCreateView(View view, String s1, Context context, AttributeSet attributeset)
    {
        view = super.onCreateView(view, s1, context, attributeset);
        for (Iterator iterator = i.iterator(); iterator.hasNext();)
        {
            view = ((d)iterator.next()).a(view, s1, context, attributeset);
        }

        return view;
    }

    protected void onDestroy()
    {
        f.h();
        com.fitbit.mixpanel.f.f();
        FitBitApplication.a().c().b();
        com.fitbit.analytics.core.a.b();
        super.onDestroy();
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 82 && af.b())
        {
            openOptionsMenu();
            return true;
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            break;
        }
        if (NavUtils.getParentActivityIntent(this) == null)
        {
            onBackPressed();
        } else
        {
            NavUtils.navigateUpFromSameTask(this);
        }
        return true;
    }

    protected void onPause()
    {
        k = false;
        synchronized (b)
        {
            b.remove(this);
        }
        com.fitbit.dncs.c.a().b(this);
        d.a();
        e.b();
        f.a();
        g.a();
        c.b(this);
        ApplicationForegroundController.a().b(this);
        AppUpdateManager.a().b(this);
        LocalBroadcastManager.getInstance(this).unregisterReceiver(m);
        ServerGateway.a().b().a(o);
        super.onPause();
        com.fitbit.savedstate.k.b(this);
        return;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void onPostResume()
    {
        DncsPairingRequestDialogController.a().a(this);
        com.fitbit.dncs.c.a().a(this);
        d.b();
        e.a();
        f.b();
        g.b();
        super.onPostResume();
        h();
        n_();
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        j = true;
    }

    protected void onResume()
    {
        k = true;
        synchronized (b)
        {
            if (!b.contains(this))
            {
                b.add(this);
            }
        }
        AppUpdateManager.a().a(this);
        ApplicationForegroundController.a().a(this);
        if (!ServerGateway.a().f() && an.a().g())
        {
            HomeActivity.a(this);
        }
        LocalBroadcastManager.getInstance(this).registerReceiver(m, new IntentFilter("com.fitbit.controllers.ServerGatewayController.ACTION_CREDENTIALS_EXPIRED"));
        c.a(this);
        ServerGateway.a().b().b(o);
        super.onResume();
        com.fitbit.savedstate.k.a(this);
        com.fitbit.mixpanel.f.a(this);
        com.fitbit.mixpanel.f.b(this);
        return;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        j = false;
    }

    protected void onTitleChanged(CharSequence charsequence, int i1)
    {
        charsequence = SpannableString.valueOf(charsequence);
        if (!TextUtils.isEmpty(charsequence))
        {
            Object aobj[] = charsequence.getSpans(0, charsequence.length(), com/fitbit/util/fonts/CustomTypefaceSpan);
            if (aobj == null || aobj.length == 0)
            {
                charsequence.setSpan(new CustomTypefaceSpan(p_().a(this, Typeface.DEFAULT)), 0, charsequence.length(), 33);
            }
        }
        super.onTitleChanged(charsequence, i1);
    }

    protected FitbitFont p_()
    {
        return FitbitFont.h;
    }

    public void setSupportActionBar(Toolbar toolbar)
    {
        super.setSupportActionBar(toolbar);
        m();
    }

    protected final void t(boolean flag)
    {
        l = flag;
    }

    protected void t_()
    {
    }

}
