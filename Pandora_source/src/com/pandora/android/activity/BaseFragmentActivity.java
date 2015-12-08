// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.j;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import com.pandora.android.ads.VideoAdManager;
import com.pandora.android.ads.g;
import com.pandora.android.artist.a;
import com.pandora.android.coachmark.CoachmarkBuilder;
import com.pandora.android.coachmark.e;
import com.pandora.android.data.r;
import com.pandora.android.eureka.dialog.PandoraMediaRouteActionProvider;
import com.pandora.android.iap.d;
import com.pandora.android.util.ah;
import com.pandora.android.util.ai;
import com.pandora.android.util.m;
import com.pandora.android.util.s;
import com.pandora.radio.data.aa;
import com.pandora.radio.util.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p.bz.y;
import p.ca.bg;
import p.cp.b;
import p.cw.c;
import p.cx.i;
import p.cx.p;
import p.cx.t;
import p.cx.v;
import p.dd.az;

// Referenced classes of package com.pandora.android.activity:
//            b, ForegroundMonitorService, c, InterstitialBaseActivity, 
//            a, GlobalBroadcastReceiver, PandoraIntent

public abstract class BaseFragmentActivity extends ActionBarActivity
    implements com.pandora.android.coachmark.CoachmarkLayout.a
{
    protected class a
        implements android.support.v4.view.d.b
    {

        protected boolean a;
        final BaseFragmentActivity b;
        private PandoraMediaRouteActionProvider c;
        private String d;

        private void c()
        {
            boolean flag;
            if (c != null && c.d())
            {
                flag = false;
            } else
            {
                flag = a;
            }
            if (flag)
            {
                d();
                return;
            } else
            {
                b.V();
                return;
            }
        }

        private void d()
        {
            if (d == null)
            {
                b.T();
                return;
            } else
            {
                b.e(d);
                return;
            }
        }

        public void a()
        {
            a(((String) (null)));
        }

        public void a(String s1)
        {
            d = s1;
            a = true;
            c();
        }

        public void a(boolean flag)
        {
            c();
        }

        public void b()
        {
            a = false;
            c();
        }

        protected a()
        {
            b = BaseFragmentActivity.this;
            super();
            a = false;
        }
    }


    private String A;
    private ActionBar B;
    private AlertDialog C;
    private m D;
    private boolean E;
    private ServiceConnection F;
    private List o;
    private com.pandora.android.activity.b p;
    private boolean q;
    protected IntentFilter r;
    protected boolean s;
    protected AlertDialog t;
    protected boolean u;
    protected boolean v;
    protected e w;
    protected a x;
    protected BroadcastReceiver y;
    private ProgressDialog z;

    public BaseFragmentActivity()
    {
        o = new ArrayList();
        p = com.pandora.android.activity.b.a();
        v = false;
        x = new a();
        y = new BroadcastReceiver() {

            final BaseFragmentActivity a;

            public void onReceive(Context context, Intent intent)
            {
                a.a(context, intent, intent.getAction());
            }

            
            {
                a = BaseFragmentActivity.this;
                super();
            }
        };
        F = new ServiceConnection() {

            final BaseFragmentActivity a;

            public void onServiceConnected(ComponentName componentname, IBinder ibinder)
            {
            }

            public void onServiceDisconnected(ComponentName componentname)
            {
            }

            
            {
                a = BaseFragmentActivity.this;
                super();
            }
        };
    }

    private String b(String s1)
    {
        return String.format(Locale.US, "[%s - %d] %s", new Object[] {
            getClass().getSimpleName(), Integer.valueOf(hashCode()), s1
        });
    }

    private void c(boolean flag)
    {
        bg.a(this, Uri.parse(p.cp.b.c()), null, null, new android.content.DialogInterface.OnDismissListener() {

            final BaseFragmentActivity a;

            public void onDismiss(DialogInterface dialoginterface)
            {
                com.pandora.android.provider.b.a.C().a(new PandoraIntent("cmd_ack_trial_expired"));
            }

            
            {
                a = BaseFragmentActivity.this;
                super();
            }
        });
    }

    private void m()
    {
        r = l();
        if (r != null)
        {
            com.pandora.android.provider.b.a.C().a(y, r);
        }
    }

    private void n()
    {
        if (r != null)
        {
            com.pandora.android.provider.b.a.C().a(y);
            r = null;
        }
    }

    private boolean o()
    {
        return B != null;
    }

    private void p()
    {
        if (w == null)
        {
            w = new e(this);
        }
    }

    public boolean E()
    {
        return s;
    }

    protected void K()
    {
        com.pandora.android.provider.b.a.b().o().a(false);
    }

    protected void L()
    {
        com.pandora.android.util.k.a().a(com.pandora.android.util.k.a().a(this, com.pandora.android.util.k.a.a));
        com.pandora.android.provider.b.a.b().o().a(true);
    }

    public boolean M()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (o())
        {
            flag = flag1;
            if ((B.a() & 4) != 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    public void N()
    {
        p.a(this);
    }

    protected void O()
    {
        Intent intent = new Intent(this, com/pandora/android/activity/ForegroundMonitorService);
        intent.putExtra("intent_activity_name", getClass().getSimpleName());
        bindService(intent, F, 1);
        E = true;
    }

    protected void P()
    {
        unbindService(F);
        E = false;
    }

    protected boolean Q()
    {
        return true;
    }

    public void R()
    {
        n();
        m();
    }

    public void S()
    {
        x.a();
    }

    protected void T()
    {
        e(Y());
    }

    public void U()
    {
        x.b();
    }

    protected void V()
    {
        if (!o()) goto _L2; else goto _L1
_L1:
        b(false);
_L4:
        X();
        return;
_L2:
        if (z != null)
        {
            z.dismiss();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void W()
    {
    }

    public void X()
    {
    }

    protected String Y()
    {
        return getString(0x7f080133);
    }

    protected void Z()
    {
        if (o())
        {
            B.b(false);
            B.a(new ColorDrawable(0xff000000));
        }
    }

    protected abstract void a(Context context, Intent intent, String s1);

    public void a(View view, android.support.v7.app.ActionBar.LayoutParams layoutparams)
    {
        if (o())
        {
            B.a(view, layoutparams);
        }
    }

    public void a(CoachmarkBuilder coachmarkbuilder)
    {
        Object obj = coachmarkbuilder.e();
        static class _cls5
        {

            static final int a[];

            static 
            {
                a = new int[com.pandora.android.coachmark.e.e.values().length];
                try
                {
                    a[com.pandora.android.coachmark.e.e.p.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.pandora.android.coachmark.e.e.s.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.pandora.android.coachmark.e.e.v.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.pandora.android.coachmark.e.e.u.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.pandora.android.coachmark.e.e.w.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.pandora.android.activity._cls5.a[((com.pandora.android.coachmark.e.e) (obj)).ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            com.pandora.android.artist.a.a(this, (com.pandora.radio.data.c)coachmarkbuilder.o());
            return;

        case 2: // '\002'
            obj = (String)coachmarkbuilder.o();
            com.pandora.android.iap.d.d.a().a(coachmarkbuilder.a(), ((String) (obj)));
            return;

        case 3: // '\003'
        case 4: // '\004'
            com.pandora.android.iap.d.d.a().a(coachmarkbuilder.a(), null);
            return;

        case 5: // '\005'
            com.pandora.android.ads.VideoAdManager.c.a().q();
            break;
        }
        obj = coachmarkbuilder.f();
        String s1 = (String)coachmarkbuilder.f("stationId");
        coachmarkbuilder = (r)com.pandora.android.provider.c.a((String)coachmarkbuilder.f("videoAdDataUUID"));
        p.df.a.a("BaseFragmentActivity", (new StringBuilder()).append("resume video. ").append(obj).toString());
        com.pandora.android.ads.VideoAdManager.c.a().a(com.pandora.android.provider.c.a(coachmarkbuilder), false);
        com.pandora.android.provider.b.a.b().o().a(com.pandora.radio.util.k.p.w, ((com.pandora.radio.data.b) (obj)), -1, -1, false, s1, true, coachmarkbuilder.t(), coachmarkbuilder.n());
    }

    public void a(CoachmarkBuilder coachmarkbuilder, aa aa1)
    {
        boolean flag;
        p();
        flag = w.a(coachmarkbuilder);
        com.pandora.android.activity._cls5.a[coachmarkbuilder.e().ordinal()];
        JVM INSTR tableswitch 1 1: default 44
    //                   1 45;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (flag)
        {
            com.pandora.android.artist.a.a((com.pandora.radio.data.c)aa1, com.pandora.android.artist.a.a.c);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void a(String s1, Exception exception)
    {
        p.df.a.c("BaseFragmentActivity", b(s1), exception);
    }

    protected boolean a(Context context, Intent intent)
    {
        return false;
    }

    public boolean a(com.pandora.android.util.k.a a1)
    {
        return true;
    }

    protected Uri aa()
    {
        return null;
    }

    protected boolean ab()
    {
        return false;
    }

    public e ac()
    {
        return w;
    }

    public void b(int i1)
    {
        if (o())
        {
            B.b(i1);
        }
    }

    public void c(int i1)
    {
        if (o())
        {
            B.a(i1);
        }
    }

    public void d(String s1)
    {
        x.a(s1);
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        if (ai.a().a(keyevent))
        {
            return true;
        } else
        {
            return super.dispatchKeyEvent(keyevent);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        if (!v && motionevent.getAction() == 0)
        {
            com.pandora.android.provider.b.a.b().z().a();
        }
        return super.dispatchTouchEvent(motionevent);
    }

    protected void e(String s1)
    {
        if (!o()) goto _L2; else goto _L1
_L1:
        b(true);
_L6:
        W();
_L4:
        return;
_L2:
        if (z == null || !z.isShowing())
        {
            break; /* Loop/switch isn't completed */
        }
        if (s1.equals(A))
        {
            continue; /* Loop/switch isn't completed */
        }
        z.dismiss();
        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        A = s1;
        z = new ProgressDialog(new ContextThemeWrapper(this, 0x1030073));
        z.setProgressStyle(0);
        z.setMessage(A);
        z.setIndeterminate(true);
        z.setCancelable(false);
        z.show();
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void f(String s1)
    {
        p.df.a.c("BaseFragmentActivity", b(s1));
    }

    public void f(boolean flag)
    {
        if (!o())
        {
            break MISSING_BLOCK_LABEL_23;
        }
        B.f(flag);
        getActionBar().setHomeButtonEnabled(flag);
        return;
        NoSuchMethodError nosuchmethoderror;
        nosuchmethoderror;
    }

    public void finish()
    {
        super.finish();
        com.pandora.android.activity.b.c(this);
    }

    public void g(boolean flag)
    {
        if (o())
        {
            B.c(flag);
        }
    }

    public void h(boolean flag)
    {
        if (o())
        {
            B.d(flag);
        }
    }

    public void i(boolean flag)
    {
        if (o())
        {
            B.a(flag);
        }
    }

    public void j(boolean flag)
    {
        if (o())
        {
            B.e(flag);
        }
    }

    protected void k()
    {
        com.pandora.android.activity.c.a().c(this);
    }

    protected abstract IntentFilter l();

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        switch (i1)
        {
        default:
            super.onActivityResult(i1, j1, intent);
            return;

        case 123: // '{'
            com.pandora.android.activity.InterstitialBaseActivity.a(this, j1);
            com.pandora.android.ads.c.b().d();
            return;

        case 128: 
            p.bx.d.a().a(this, i1, j1, intent);
            return;

        case 130: 
            com.pandora.android.iap.d.d.a().d().a(i1, j1, intent);
            break;
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (w != null)
        {
            w.a(configuration, this);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        f("onCreate");
        requestWindowFeature(5);
        super.onCreate(bundle);
        B = h();
        if (!u)
        {
            boolean flag;
            if (!com.pandora.android.activity.b.a(this, aa()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            q = flag;
            if (!q)
            {
                setVolumeControlStream(3);
                k();
                m();
                com.pandora.android.activity.c.a().a(this);
                s = true;
                f(true);
                g(true);
                if (com.pandora.android.util.s.q())
                {
                    ah.a(this).a(this);
                }
                D = new m(this);
                if (ab())
                {
                    p();
                    return;
                }
            }
        }
    }

    protected void onDestroy()
    {
        f("onDestroy");
        super.onDestroy();
        for (Iterator iterator = o.iterator(); iterator.hasNext();)
        {
            v v1 = (v)iterator.next();
            try
            {
                v1.a();
            }
            catch (Exception exception) { }
        }

        n();
        U();
        if (t != null)
        {
            t.dismiss();
            t = null;
        }
        if (p.d() == 0)
        {
            com.pandora.android.provider.b.a.e().a(new y());
        }
        com.pandora.android.activity.c.a().b(this);
        s = false;
        if (com.pandora.android.util.s.q())
        {
            ah.a(this).b(this);
        }
        if (w != null)
        {
            w.d();
        }
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 25 || i1 == 24)
        {
            com.pandora.android.provider.b.a.b().z().a();
        }
        return super.onKeyDown(i1, keyevent);
    }

    public boolean onKeyUp(int i1, KeyEvent keyevent)
    {
        if (i1 == 4 && w != null && w.e())
        {
            return true;
        } else
        {
            return super.onKeyUp(i1, keyevent);
        }
    }

    protected void onNewIntent(Intent intent)
    {
        f("onNewIntent");
        super.onNewIntent(intent);
        com.pandora.android.activity.c.a().a(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        boolean flag1 = com.pandora.android.activity.a.a(this, menuitem.getItemId());
        boolean flag = flag1;
        if (!flag1)
        {
            flag = com.pandora.android.activity.a.a(this, menuitem.getItemId(), M());
        }
        flag1 = flag;
        if (!flag)
        {
            flag1 = com.pandora.android.activity.a.b(this, menuitem.getItemId());
        }
        return flag1;
    }

    protected void onPause()
    {
        f("onPause");
        super.onPause();
        com.pandora.android.provider.b.a.b().r().b();
        if (D != null)
        {
            D.c();
        }
        if (C != null && C.isShowing())
        {
            C.setOnDismissListener(null);
            C.dismiss();
        }
        if (!q)
        {
            com.pandora.android.provider.b.a.b().c(this);
            com.pandora.android.provider.b.a.e().b(this);
        }
        com.pandora.android.activity.GlobalBroadcastReceiver.a().a(this);
        s = false;
    }

    protected void onPostCreate(Bundle bundle)
    {
        super.onPostCreate(bundle);
        U();
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        if (bundle.getBoolean("state_waiting_spinner_active"))
        {
            S();
        }
        if (w != null)
        {
            w.a(bundle, this);
        }
    }

    protected void onResume()
    {
        f("onResume");
        super.onResume();
        com.pandora.android.provider.b.a.b().r().a();
        if (u) goto _L2; else goto _L1
_L1:
        if (!q)
        {
            boolean flag;
            if (!com.pandora.android.activity.b.a(this, null))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            q = flag;
        }
        if (!q) goto _L2; else goto _L3
_L3:
        return;
_L2:
        if (D != null)
        {
            D.b();
        }
        com.pandora.android.provider.b.a.b().b(this);
        com.pandora.android.provider.b.a.e().c(this);
        com.pandora.android.activity.GlobalBroadcastReceiver.a().a(this);
        s = true;
        p.bx.b b1 = p.bx.d.a();
        if (com.pandora.android.activity.a.h(this) && b1.f())
        {
            b1.b(false);
            b1.a(this, new p.bx.b.a(this) {

                final FragmentActivity a;
                final BaseFragmentActivity b;

                public void a()
                {
                    p.df.a.c("BaseFragmentActivity", "BaseFragmentActivity.authorizeFacebook() --> Facebook Auth Success : auto-share enabled");
                    com.pandora.android.activity.a.c(a);
                }

                public void b()
                {
                    p.df.a.c("BaseFragmentActivity", "BaseFragmentActivity.authorizeFacebook() --> Facebook Auth Failure : auto-share remaining off");
                }

            
            {
                b = BaseFragmentActivity.this;
                a = fragmentactivity;
                super();
            }
            });
        }
        if (com.pandora.android.util.s.q())
        {
            ah.a(this).c(this);
            return;
        }
        if (true) goto _L3; else goto _L4
_L4:
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        if (Q())
        {
            super.onSaveInstanceState(bundle);
        }
        if (w != null)
        {
            w.a(bundle);
        }
    }

    public boolean onSearchRequested()
    {
        com.pandora.android.provider.b.a.C().a(new PandoraIntent("show_create_station"));
        return true;
    }

    protected void onStart()
    {
        f("onStart");
        super.onStart();
        if (D != null)
        {
            D.a();
        }
        if (!p.b()) goto _L2; else goto _L1
_L1:
        L();
_L4:
        if (!E)
        {
            O();
        }
        return;
_L2:
        if (com.pandora.android.util.k.a().b())
        {
            com.pandora.android.util.k.a().a(com.pandora.android.util.k.a().a(this, com.pandora.android.util.k.a.b));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onStop()
    {
        f("onStop");
        super.onStop();
        if (D != null)
        {
            D.d();
        }
        U();
        if (p.c())
        {
            K();
        }
        if (!E)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        P();
        return;
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        p.df.a.c("BaseFragmentActivity", "IllegalArgumentException while unbinding service: ", illegalargumentexception);
        return;
    }

    public void onSubscriptionExpired(az az1)
    {
        if (az1.b)
        {
            c(az1.a);
            com.pandora.android.provider.b.a.b().p().a();
        }
    }
}
