// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import com.fitbit.bluetooth.e;
import com.fitbit.bluetooth.g;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceVersion;
import com.fitbit.data.domain.device.TrackerType;
import com.fitbit.e.a;
import com.fitbit.galileo.GalileoTrackerType;
import com.fitbit.mixpanel.MixPanelTrackingHelper;
import com.fitbit.savedstate.UISavedState;
import com.fitbit.synclair.SynclairError;
import com.fitbit.synclair.SynclairManager;
import com.fitbit.synclair.config.bean.DeviceScreenBean;
import com.fitbit.synclair.operation.info.SynclairOperationInfo;
import com.fitbit.synclair.ui.a.f;
import com.fitbit.synclair.ui.controller.SynclairType;
import com.fitbit.synclair.ui.controller.b;
import com.fitbit.synclair.ui.controller.c;
import com.fitbit.synclair.ui.states.SynclairScreenState;
import com.fitbit.synclair.ui.states.b.d;
import com.fitbit.ui.BluetoothMessagesController;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.ui.s;
import com.fitbit.util.ProgressDialogFragment;
import com.fitbit.util.SimpleConfirmDialogFragment;
import com.fitbit.util.ad;
import com.fitbit.util.p;

// Referenced classes of package com.fitbit.synclair.ui:
//            SynclairActivity_, SynclairFragment

public class SynclairActivity extends FitbitActivity
{
    public static final class ExitMessageTypes extends Enum
    {

        public static final ExitMessageTypes a;
        public static final ExitMessageTypes b;
        public static final ExitMessageTypes c;
        private static final ExitMessageTypes d[];

        public static ExitMessageTypes valueOf(String s1)
        {
            return (ExitMessageTypes)Enum.valueOf(com/fitbit/synclair/ui/SynclairActivity$ExitMessageTypes, s1);
        }

        public static ExitMessageTypes[] values()
        {
            return (ExitMessageTypes[])d.clone();
        }

        static 
        {
            a = new ExitMessageTypes("SKIP_INFO", 0);
            b = new ExitMessageTypes("CANCEL_PAIRING", 1);
            c = new ExitMessageTypes("CANCEL_UPDATE", 2);
            d = (new ExitMessageTypes[] {
                a, b, c
            });
        }

        private ExitMessageTypes(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    public static final String a = "SynclairActivity";
    public static final String b = "EXTRA_CANCEL_RESULT_REASON";
    public static final int c = 7687;
    private static final String i = "com.fitbit.synclair.ui.TAG_SYNCLAIR_FRAGMENT";
    private static final String j = "com.fitbit.synclair.ui.TAG_PROGRESS_DIALOG_FRAGMENT";
    private static final String k = "com.fitbit.synclair.ui.TAG_BT_HANDLED_DIALOG_FRAGMENT";
    private static final String l = "com.fitbit.synclair.ui.TAG_CANCEL_DIALOG";
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean J;
    private boolean K;
    private SynclairError L;
    private boolean M;
    private e N;
    private com.fitbit.util.SimpleConfirmDialogFragment.a O;
    protected TrackerType d;
    protected String e;
    protected String f;
    protected String g;
    protected Boolean h;
    private f m;
    private int n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public SynclairActivity()
    {
        n = 0;
        o = false;
        p = false;
        q = false;
        r = false;
        s = false;
        t = false;
        u = false;
        v = false;
        w = false;
        x = false;
        y = false;
        z = false;
        A = false;
        B = false;
        C = false;
        D = false;
        E = false;
        F = false;
        J = false;
        K = true;
        L = null;
        M = false;
        N = new e() {

            final SynclairActivity a;

            protected void l()
            {
                SynclairManager synclairmanager = a.D().g();
                if (synclairmanager.D() && !synclairmanager.Q())
                {
                    a.J();
                    a.I();
                }
            }

            
            {
                a = SynclairActivity.this;
                super();
            }
        };
        O = new com.fitbit.util.SimpleConfirmDialogFragment.a() {

            final SynclairActivity a;

            public void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
            {
                simpleconfirmdialogfragment = a.D().f().u();
                if (SynclairType.a.name().equalsIgnoreCase(a.e))
                {
                    if (a.D() != null && a.D().f().r())
                    {
                        a.D().f().a(SynclairScreenState.g);
                        return;
                    }
                    if (SynclairScreenState.g.equals(simpleconfirmdialogfragment) || SynclairScreenState.f.equals(simpleconfirmdialogfragment))
                    {
                        com.fitbit.mixpanel.f.a(new com.fitbit.mixpanel.e(com.fitbit.synclair.c.j().k().a()));
                    } else
                    {
                        com.fitbit.mixpanel.f.a(new com.fitbit.mixpanel.d(com.fitbit.synclair.c.j().k().a()));
                    }
                }
                if (SynclairType.b.name().equalsIgnoreCase(a.e) && SynclairScreenState.g.equals(simpleconfirmdialogfragment))
                {
                    com.fitbit.mixpanel.f.a(new com.fitbit.mixpanel.g(a.L()));
                }
                a.I();
            }

            public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
            {
            }

            public void c(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
            {
            }

            
            {
                a = SynclairActivity.this;
                super();
            }
        };
    }

    public static Intent a(Context context, String s1, String s2, String s3, boolean flag)
    {
        return com.fitbit.synclair.ui.SynclairActivity_.a(context).a(s1).b(s3).c(s2).a(Boolean.valueOf(flag)).a();
    }

    static e a(SynclairActivity synclairactivity)
    {
        return synclairactivity.N;
    }

    public static void a(Context context, TrackerType trackertype)
    {
        com.fitbit.synclair.ui.SynclairActivity_.a(context).a(SynclairType.a.name()).a(trackertype).a(ab()).b(7687);
    }

    public static void a(Context context, String s1, String s2)
    {
        com.fitbit.synclair.ui.SynclairActivity_.a(context).a(SynclairType.b.name()).b(s2).c(s1).a(ab()).b(7687);
    }

    static void a(SynclairActivity synclairactivity, com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType synclairoperationtype)
    {
        synclairactivity.b(synclairoperationtype);
    }

    private static int ab()
    {
        return 0x24000000;
    }

    private SynclairFragment ac()
    {
        return (SynclairFragment)getSupportFragmentManager().findFragmentByTag("com.fitbit.synclair.ui.TAG_SYNCLAIR_FRAGMENT");
    }

    private boolean ad()
    {
        SynclairFragment synclairfragment;
        if (D() != null)
        {
            if (((synclairfragment = ac()) == null || synclairfragment.e()) && D().f().A())
            {
                D().f().j().K();
                D().f().E();
                return true;
            }
        }
        return false;
    }

    private boolean ae()
    {
        return ac() != null && ac().f();
    }

    private boolean af()
    {
        return J && Boolean.FALSE.equals(((b)D().f()).s());
    }

    private SimpleConfirmDialogFragment ag()
    {
        if (SynclairType.a.name().equalsIgnoreCase(e))
        {
            return ah();
        }
        if (SynclairType.b.name().equalsIgnoreCase(e))
        {
            return ai();
        } else
        {
            com.fitbit.e.a.a("SynclairActivity", "ControllerType is absent when creating cancel DefaultBackPressedDialog", new Object[0]);
            return null;
        }
    }

    private SimpleConfirmDialogFragment ah()
    {
        return SimpleConfirmDialogFragment.a(O, 0x7f0802c2, 0x7f08050c, 0x7f080506, 0x7f080505);
    }

    private SimpleConfirmDialogFragment ai()
    {
        return SimpleConfirmDialogFragment.a(O, 0x7f0802c2, 0x7f08050c, 0x7f080508, 0x7f080507);
    }

    private SimpleConfirmDialogFragment aj()
    {
        return SimpleConfirmDialogFragment.a(O, 0x7f080503, 0x7f08050c, 0x7f080517, 0x7f080516);
    }

    private void b(com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType synclairoperationtype)
    {
        N.c();
        q = false;
        if (synclairoperationtype == com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType.j)
        {
            ((com.fitbit.synclair.ui.a.c)D()).h();
        } else
        if (synclairoperationtype == com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType.f)
        {
            ((com.fitbit.synclair.ui.a.c)D()).i();
            return;
        }
    }

    public boolean A()
    {
        return p;
    }

    public int B()
    {
        return n;
    }

    public void C()
    {
        n = n + 1;
    }

    public f D()
    {
        return m;
    }

    public void E()
    {
        I();
    }

    public void F()
    {
        p = true;
        m.g().I();
    }

    public void G()
    {
        H();
    }

    public void H()
    {
        m.g().J();
        finish();
    }

    public void I()
    {
        if (m.g() instanceof com.fitbit.synclair.c)
        {
            Object obj = (com.fitbit.synclair.c)m.g();
            if (((com.fitbit.synclair.c) (obj)).p() != null)
            {
                obj = an.a().a(((com.fitbit.synclair.c) (obj)).p());
                if (obj != null)
                {
                    UISavedState.a(((Device) (obj)));
                    com.fitbit.multipledevice.a.a().a(com.fitbit.serverinteraction.SynclairApi.SyncTrigger.a, false);
                }
                if (obj != null && !((Device) (obj)).h().equals(DeviceVersion.ARIA) && !((Device) (obj)).h().equals(DeviceVersion.MOTIONBIT))
                {
                    UISavedState.k();
                }
                UISavedState.f(false);
            }
        }
        if (m.g().F())
        {
            H();
        } else
        if (!com.fitbit.synclair.SynclairManager.SynclairManagerState.c.equals(m.g().B()))
        {
            F();
            return;
        }
    }

    public void J()
    {
        a(getString(0x7f08008d), ((Intent) (null)));
    }

    public void K()
    {
        ProgressDialogFragment progressdialogfragment = ProgressDialogFragment.b(0, 0x7f080336, null);
        progressdialogfragment.setCancelable(false);
        com.fitbit.util.ad.a(getSupportFragmentManager(), "com.fitbit.synclair.ui.TAG_PROGRESS_DIALOG_FRAGMENT", progressdialogfragment);
    }

    public String L()
    {
        if (f == null)
        {
            return h().a();
        } else
        {
            return f;
        }
    }

    public String M()
    {
        return g;
    }

    public String N()
    {
        return e;
    }

    public void a(com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType synclairoperationtype)
    {
        Object obj = com.fitbit.util.p.c(com.fitbit.galileo.a.f.a(((com.fitbit.synclair.a)D().g()).i()));
        if (obj == null)
        {
            obj = "";
        } else
        {
            obj = ((Device) (obj)).j();
        }
        obj = getString(0x7f080515, new Object[] {
            obj, getString(0x7f08050d)
        });
        synclairoperationtype = SimpleConfirmDialogFragment.a(new com.fitbit.util.SimpleConfirmDialogFragment.a(synclairoperationtype) {

            final com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType a;
            final SynclairActivity b;

            public void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
            {
                com.fitbit.synclair.ui.SynclairActivity.a(b).d();
            /* block-local class not found */
            class _cls1 {}

                if (!(new com.fitbit.bluetooth.c(new _cls1())).a())
                {
                    com.fitbit.synclair.ui.SynclairActivity.a(b, a);
                }
            }

            public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
            {
            }

            public void c(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
            {
            }

            
            {
                b = SynclairActivity.this;
                a = synclairoperationtype;
                super();
            }
        }, 0x7f080486, 0, 0, -1, ((String) (obj)));
        synclairoperationtype.setCancelable(false);
        com.fitbit.util.ad.a(getSupportFragmentManager(), "com.fitbit.synclair.ui.TAG_BT_HANDLED_DIALOG_FRAGMENT", synclairoperationtype);
    }

    public void a(com.fitbit.synclair.ui.states.c.b b1, boolean flag)
    {
        SynclairFragment synclairfragment = ac();
        if (synclairfragment == null)
        {
            m.f().C();
            return;
        } else
        {
            synclairfragment.a(D().f().y().a(b1), flag);
            return;
        }
    }

    public void a(String s1)
    {
        b((new StringBuilder()).append("Illegal synclair operation result: ").append(s1).toString());
    }

    public void a(String s1, Intent intent)
    {
        Intent intent1 = intent;
        if (intent == null)
        {
            intent1 = new Intent();
        }
        intent1.putExtra("EXTRA_CANCEL_RESULT_REASON", s1);
        setResult(0, intent1);
    }

    public void a(boolean flag)
    {
        o = flag;
    }

    public boolean a(SynclairError synclairerror)
    {
        if (L != null && synclairerror != null)
        {
            return L.equals(synclairerror);
        } else
        {
            return false;
        }
    }

    public void b(SynclairError synclairerror)
    {
        L = synclairerror;
    }

    public void b(com.fitbit.synclair.ui.states.c.b b1, boolean flag)
    {
        com.fitbit.synclair.ui.states.d.b b2 = m.f().y().a(b1);
        if (b1 != null)
        {
            Object obj = b1.a();
            if (obj != null && K)
            {
                obj = ((DeviceScreenBean) (obj)).j();
                if (SynclairType.a.name().equalsIgnoreCase(e))
                {
                    TrackerType trackertype = com.fitbit.synclair.c.j().k();
                    if (trackertype != null)
                    {
                        MixPanelTrackingHelper.a(((String) (obj)), b1, e, trackertype.a());
                    }
                }
                if (SynclairType.b.name().equalsIgnoreCase(e))
                {
                    GalileoTrackerType galileotrackertype = com.fitbit.synclair.b.j().g();
                    if (galileotrackertype != null)
                    {
                        MixPanelTrackingHelper.a(((String) (obj)), b1, e, galileotrackertype.name());
                    }
                }
            }
        }
        b1 = ac();
        FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
        SynclairFragment synclairfragment = b2.a();
        com.fitbit.e.a.a("SynclairActivity", "fragment started %s", new Object[] {
            synclairfragment.getClass().getName()
        });
        synclairfragment.a(b2, flag);
        if (b1 == null)
        {
            fragmenttransaction.add(0x7f110009, synclairfragment, "com.fitbit.synclair.ui.TAG_SYNCLAIR_FRAGMENT");
        } else
        {
            fragmenttransaction.replace(0x7f110009, synclairfragment, "com.fitbit.synclair.ui.TAG_SYNCLAIR_FRAGMENT");
        }
        fragmenttransaction.commit();
        K = true;
    }

    public void b(String s1)
    {
        com.fitbit.e.a.f("SynclairActivity", s1, new Object[0]);
        F();
    }

    public void b(boolean flag)
    {
        q = flag;
    }

    public void c(boolean flag)
    {
        s = flag;
    }

    public void d(boolean flag)
    {
        r = flag;
    }

    public void e(boolean flag)
    {
        t = flag;
    }

    public void f(boolean flag)
    {
        u = flag;
    }

    public boolean f()
    {
        return o;
    }

    protected void g()
    {
        while (M || o) 
        {
            return;
        }
        if (m.g().D())
        {
            m.g().J();
        }
        m.f().C();
        m.f().d();
    }

    public void g(boolean flag)
    {
        v = flag;
    }

    public TrackerType h()
    {
        return d;
    }

    public void h(boolean flag)
    {
        x = flag;
    }

    public void i(boolean flag)
    {
        y = flag;
    }

    public boolean i()
    {
        return q;
    }

    public void j(boolean flag)
    {
        w = flag;
    }

    public boolean j()
    {
        return s;
    }

    public void k(boolean flag)
    {
        z = flag;
    }

    public boolean k()
    {
        return r;
    }

    public void l(boolean flag)
    {
        B = flag;
    }

    public boolean l()
    {
        return r || s;
    }

    public void m(boolean flag)
    {
        C = flag;
    }

    public boolean m()
    {
        return t;
    }

    public void n(boolean flag)
    {
        A = flag;
    }

    public boolean n()
    {
        return u;
    }

    public void o(boolean flag)
    {
        D = flag;
    }

    public boolean o()
    {
        return v;
    }

    public void onBackPressed()
    {
        if (ae() || ad()) goto _L2; else goto _L1
_L1:
        Object obj = (SimpleConfirmDialogFragment)getSupportFragmentManager().findFragmentByTag("com.fitbit.synclair.ui.TAG_CANCEL_DIALOG");
        if (obj != null) goto _L2; else goto _L3
_L3:
        if (!af()) goto _L5; else goto _L4
_L4:
        com.fitbit.ui.s.a(this, getResources().getString(0x7f080482), 0).i();
_L7:
        if (obj != null)
        {
            com.fitbit.util.ad.a(getSupportFragmentManager(), "com.fitbit.synclair.ui.TAG_CANCEL_DIALOG", ((android.support.v4.app.Fragment) (obj)));
        }
_L2:
        return;
_L5:
        obj = D().f().i();
        if (obj != null)
        {
            static class _cls4
            {

                static final int a[];

                static 
                {
                    a = new int[ExitMessageTypes.values().length];
                    try
                    {
                        a[com.fitbit.synclair.ui.ExitMessageTypes.b.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[com.fitbit.synclair.ui.ExitMessageTypes.c.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[com.fitbit.synclair.ui.ExitMessageTypes.a.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (com.fitbit.synclair.ui._cls4.a[((ExitMessageTypes) (obj)).ordinal()])
            {
            default:
                throw new IllegalArgumentException((new StringBuilder()).append("this ExitMessageTypes don't processed").append(obj).toString());

            case 1: // '\001'
                obj = ah();
                break;

            case 2: // '\002'
                obj = ai();
                break;

            case 3: // '\003'
                obj = aj();
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        SimpleConfirmDialogFragment simpleconfirmdialogfragment = ag();
        obj = simpleconfirmdialogfragment;
        if (simpleconfirmdialogfragment != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        I();
        break; /* Loop/switch isn't completed */
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        com.fitbit.e.a.a("SynclairActivity", "onCreate()", new Object[0]);
        R().a("com.fitbit.bluetooth.BluetoothUtils.ACTION_BLUETOOTH_RESET_REQUEST");
        m = com.fitbit.synclair.ui.states.a.a(this, SynclairType.valueOf(e), L());
        Object obj = (com.fitbit.synclair.a)m.g();
        if (obj != null && com.fitbit.synclair.SynclairManager.SynclairManagerState.b.equals(((com.fitbit.synclair.a) (obj)).B()))
        {
            obj = ((com.fitbit.synclair.a) (obj)).C();
            boolean flag;
            if (obj != null && com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType.f.equals(((SynclairOperationInfo) (obj)).c()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o = flag;
            com.fitbit.e.a.a("SynclairActivity", "restore sendingFirmwareToTracker:%s", new Object[] {
                Boolean.valueOf(o)
            });
        }
        if (o)
        {
            m.f().h();
            K = false;
            m.d(this);
        } else
        if (bundle != null || Boolean.TRUE.equals(h))
        {
            boolean flag1;
            if (bundle != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            com.fitbit.e.a.a("SynclairActivity", "Usual restore not null savedInstanceState:%s, restoreFromNotification:%s", new Object[] {
                Boolean.valueOf(flag1), h
            });
            M = true;
            m.f().h();
            m.f().F();
            I();
        } else
        {
            com.fitbit.e.a.a("SynclairActivity", "creating new Synclair Activity instance", new Object[0]);
            m.a();
        }
        setTitle(m.f().b());
        bundle = getSupportActionBar();
        if (bundle != null)
        {
            bundle.setHomeButtonEnabled(false);
            bundle.setDisplayHomeAsUpEnabled(false);
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        com.fitbit.e.a.a("SynclairActivity", "onDestroy()", new Object[0]);
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        com.fitbit.e.a.a("SynclairActivity", "onNewIntent()", new Object[0]);
    }

    protected void onPause()
    {
        super.onPause();
        N.d();
    }

    protected void onResume()
    {
        super.onResume();
        if (!com.fitbit.bluetooth.g.g())
        {
            J();
            I();
            return;
        } else
        {
            N.c();
            return;
        }
    }

    public void p(boolean flag)
    {
        F = flag;
    }

    public boolean p()
    {
        return x;
    }

    public void q(boolean flag)
    {
        J = flag;
    }

    public boolean q()
    {
        return y;
    }

    public void r(boolean flag)
    {
        E = flag;
    }

    public boolean r()
    {
        return w;
    }

    public boolean s()
    {
        return z;
    }

    public boolean s(boolean flag)
    {
        if (!flag)
        {
            b("negative result of starting operation");
        }
        return flag;
    }

    public boolean t()
    {
        return B;
    }

    public boolean u()
    {
        return C;
    }

    public boolean v()
    {
        return A;
    }

    public boolean w()
    {
        return D;
    }

    public boolean x()
    {
        return F;
    }

    public boolean y()
    {
        return J;
    }

    public boolean z()
    {
        return E;
    }
}
