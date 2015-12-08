// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.verification;

import Bt;
import CU;
import Dm;
import Eh;
import Ei;
import Gc;
import IJ;
import Io;
import Iq;
import Jo;
import OJ;
import PF;
import PG;
import Rr;
import UT;
import UV;
import Ut;
import Uu;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.RegistrationAnalytics;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.receiver.SmsReceiver;
import com.snapchat.android.ui.window.WindowConfiguration;
import com.snapchat.android.util.AlertDialogUtils;
import com.snapchat.android.util.fragment.SnapchatFragment;
import fg;
import hm;
import jA;
import jD;
import jE;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import jo;
import jr;
import jt;
import jx;
import jz;
import oD;
import oO;
import pi;
import pn;

public abstract class PhoneVerificationFragment extends SnapchatFragment
{
    final class a extends PF
    {

        private PhoneVerificationFragment a;

        public final void a()
        {
            if (!a.isAdded())
            {
                return;
            } else
            {
                PhoneVerificationFragment.w(a);
                a.u();
                return;
            }
        }

        public final void b()
        {
            if (!a.isAdded())
            {
                return;
            } else
            {
                PhoneVerificationFragment.a(a, null);
                a.u();
                return;
            }
        }

        public a(int i1, long l1, Handler handler)
        {
            a = PhoneVerificationFragment.this;
            super(i1, l1, handler);
            PhoneVerificationFragment.a(PhoneVerificationFragment.this, i1);
            u();
        }
    }

    final class b extends oD
        implements oS.a
    {

        private final Ut.a a;
        private Ut.b b;
        private PhoneVerificationFragment c;

        protected final void a()
        {
            if (c.isAdded())
            {
                c.j.setVisibility(8);
                c.e.setEnabled(true);
            }
        }

        protected final void a(Uu uu)
        {
            if (!TextUtils.isEmpty(uu.b()))
            {
                Bt.x(uu.b());
            }
            if (c.isAdded())
            {
                PhoneVerificationFragment.a(c, null);
                PhoneVerificationFragment.c(c);
                c.h.requestFocus();
                PhoneVerificationFragment.a(c, c. new a((int)TimeUnit.MINUTES.toSeconds(1L), TimeUnit.SECONDS.toMillis(1L), PhoneVerificationFragment.v(c)));
                PhoneVerificationFragment.b(c).e();
                c.u();
                if (a == Ut.a.UPDATEPHONENUMBERWITHCALL)
                {
                    AlertDialogUtils.a(0x7f0800ce, c.d);
                }
            }
            RegistrationAnalytics.f();
        }

        protected final void a(String s1)
        {
            if (c.isAdded())
            {
                c.m = "";
                c.u();
                PhoneVerificationFragment.a(c, s1);
                Jo.a(c.d, c.e);
            }
            c.a(s1);
            RegistrationAnalytics.d();
        }

        public final void execute()
        {
            c.e.setEnabled(false);
            c.i.setText("");
            c.i.setEnabled(false);
            c.j.setVisibility(0);
            super.execute();
        }

        public final pi executeSynchronously()
        {
            pi pi1 = super.executeSynchronously();
            PG.a(new Runnable(this) {

                private b a;

                public final void run()
                {
                    a.a();
                }

            
            {
                a = b1;
                super();
            }
            });
            return pi1;
        }

        protected final String getPath()
        {
            return "/bq/phone_verify";
        }

        public final pn getRequestPayload()
        {
            Ut ut = (new Ut()).a(a.value).b(c.m).c(PhoneVerificationFragment.u(c)).a(Boolean.valueOf(c.z()));
            if (b != null)
            {
                ut.d(b.value);
            }
            return new oO(buildAuthPayload(ut));
        }

        public final void onJsonResult(Object obj, pi pi1)
        {
            obj = (Uu)obj;
            if (pi1.c() && obj != null && IJ.a(((Rr) (obj)).logged))
            {
                PG.a(new Runnable(this, ((Uu) (obj))) {

                    private Uu a;
                    private b b;

                    public final void run()
                    {
                        b.a(a);
                    }

            
            {
                b = b1;
                a = uu;
                super();
            }
                });
                return;
            }
            if (obj != null && ((Uu) (obj)).a())
            {
                obj = ((Rr) (obj)).message;
            } else
            {
                obj = pi1.mResponseMessage;
            }
            PG.a(new Runnable(this, ((String) (obj))) {

                private String a;
                private b b;

                public final void run()
                {
                    b.a(a);
                }

            
            {
                b = b1;
                a = s1;
                super();
            }
            });
        }

        public b(boolean flag, boolean flag1)
        {
            c = PhoneVerificationFragment.this;
            super();
            b = null;
            m = e.getText().toString();
            if (flag1)
            {
                a = Ut.a.REQUESTPHONEVERIFICATION;
                if (flag)
                {
                    b = Ut.b.TEXT;
                } else
                {
                    b = Ut.b.CALL;
                }
            } else
            if (flag)
            {
                a = Ut.a.UPDATEPHONENUMBER;
            } else
            {
                a = Ut.a.UPDATEPHONENUMBERWITHCALL;
            }
            registerCallback(Uu, this);
        }
    }


    private boolean A;
    private boolean B;
    private int C;
    private int D;
    private int E;
    private boolean F;
    private Eh G = new Eh() {

        private PhoneVerificationFragment a;

        public final void a(CU cu)
        {
            UV uv;
label0:
            {
                int i1 = Ei.a(cu);
                if (PhoneVerificationFragment.a(a).contains(Integer.valueOf(i1)))
                {
                    PhoneVerificationFragment.a(a).remove(Integer.valueOf(i1));
                    if (cu instanceof Dm)
                    {
                        cu = (Dm)cu;
                        uv = ((Dm) (cu)).b;
                        if (((Dm) (cu)).a)
                        {
                            AlertDialogUtils.b(a.getActivity(), a.getString(0x7f0802f8), a.getString(0x7f0802f7));
                        }
                        if (!IJ.a(uv.a()))
                        {
                            break label0;
                        }
                        a.a(uv);
                    }
                }
                return;
            }
            a.b(uv.b());
        }

            
            {
                a = PhoneVerificationFragment.this;
                super();
            }
    };
    private String a;
    private View b;
    protected final RegistrationAnalytics c;
    public FragmentActivity d;
    public EditText e;
    protected TextView f;
    protected View g;
    protected EditText h;
    public Button i;
    protected ProgressBar j;
    protected TextView k;
    protected TextView l;
    protected String m;
    protected boolean n;
    private View o;
    private TextView p;
    private Handler q;
    private a r;
    private AlertDialog s;
    private int t;
    private SmsReceiver u;
    private final Ei v;
    private final Set w;
    private boolean x;
    private boolean y;
    private boolean z;

    public PhoneVerificationFragment()
    {
        this(new WindowConfiguration());
    }

    public PhoneVerificationFragment(RegistrationAnalytics registrationanalytics, WindowConfiguration windowconfiguration)
    {
        this(registrationanalytics, windowconfiguration, Ei.a());
    }

    private PhoneVerificationFragment(RegistrationAnalytics registrationanalytics, WindowConfiguration windowconfiguration, Ei ei)
    {
        super(windowconfiguration);
        m = "";
        w = new HashSet();
        x = false;
        y = false;
        z = false;
        A = false;
        B = false;
        C = 0;
        D = 0;
        E = 0;
        n = false;
        F = true;
        c = registrationanalytics;
        v = ei;
    }

    public PhoneVerificationFragment(WindowConfiguration windowconfiguration)
    {
        RegistrationAnalytics registrationanalytics = RegistrationAnalytics.a();
        Bt.a();
        this(registrationanalytics, windowconfiguration, Ei.a());
    }

    static int a(PhoneVerificationFragment phoneverificationfragment, int i1)
    {
        phoneverificationfragment.t = i1;
        return i1;
    }

    static a a(PhoneVerificationFragment phoneverificationfragment, a a1)
    {
        phoneverificationfragment.r = a1;
        return a1;
    }

    static Set a(PhoneVerificationFragment phoneverificationfragment)
    {
        return phoneverificationfragment.w;
    }

    static void a(PhoneVerificationFragment phoneverificationfragment, com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode statusbardrawmode)
    {
        phoneverificationfragment.a(statusbardrawmode);
    }

    static void a(PhoneVerificationFragment phoneverificationfragment, String s1)
    {
        if (s1 == null)
        {
            phoneverificationfragment.p.setText("");
            phoneverificationfragment.p.setVisibility(4);
            phoneverificationfragment.o.setVisibility(4);
            return;
        } else
        {
            phoneverificationfragment.p.setVisibility(0);
            phoneverificationfragment.p.setText(s1);
            phoneverificationfragment.o.setVisibility(0);
            return;
        }
    }

    static boolean a(PhoneVerificationFragment phoneverificationfragment, boolean flag)
    {
        phoneverificationfragment.x = flag;
        return flag;
    }

    private static CharSequence[] a(String as[])
    {
        String as1[] = new String[as.length];
        Locale locale = Locale.getDefault();
        for (int i1 = 0; i1 < as.length; i1++)
        {
            String s1 = as[i1];
            Locale locale1 = new Locale(locale.getLanguage(), s1);
            as1[i1] = (new StringBuilder()).append(s1).append(" - ").append(locale1.getDisplayCountry()).toString();
        }

        return as1;
    }

    static a b(PhoneVerificationFragment phoneverificationfragment)
    {
        return phoneverificationfragment.r;
    }

    static String b(PhoneVerificationFragment phoneverificationfragment, String s1)
    {
        phoneverificationfragment.a = s1;
        return s1;
    }

    static void b(PhoneVerificationFragment phoneverificationfragment, com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode statusbardrawmode)
    {
        phoneverificationfragment.a(statusbardrawmode);
    }

    static boolean b(PhoneVerificationFragment phoneverificationfragment, boolean flag)
    {
        phoneverificationfragment.y = flag;
        return flag;
    }

    static void c(PhoneVerificationFragment phoneverificationfragment)
    {
        if (!TextUtils.isEmpty(phoneverificationfragment.m) && TextUtils.equals(phoneverificationfragment.e.getText(), phoneverificationfragment.m))
        {
            phoneverificationfragment.h.setVisibility(0);
            phoneverificationfragment.f.setVisibility(4);
            return;
        } else
        {
            phoneverificationfragment.h.setText("");
            phoneverificationfragment.h.setVisibility(8);
            phoneverificationfragment.f.setVisibility(8);
            phoneverificationfragment.g.setVisibility(8);
            return;
        }
    }

    static boolean d(PhoneVerificationFragment phoneverificationfragment)
    {
        return phoneverificationfragment.x;
    }

    static void e(PhoneVerificationFragment phoneverificationfragment)
    {
        phoneverificationfragment.e(((String) (null)));
    }

    private void e(String s1)
    {
        if (s1 == null)
        {
            f.setText("");
            s1 = f;
            byte byte0;
            if (h.getVisibility() == 0)
            {
                byte0 = 4;
            } else
            {
                byte0 = 8;
            }
            s1.setVisibility(byte0);
            g.setVisibility(4);
            return;
        } else
        {
            f.setVisibility(0);
            f.setText(s1);
            g.setVisibility(0);
            return;
        }
    }

    static boolean f(PhoneVerificationFragment phoneverificationfragment)
    {
        return phoneverificationfragment.y;
    }

    static boolean g(PhoneVerificationFragment phoneverificationfragment)
    {
        phoneverificationfragment.B = false;
        return false;
    }

    static boolean h(PhoneVerificationFragment phoneverificationfragment)
    {
        return phoneverificationfragment.B;
    }

    static int i(PhoneVerificationFragment phoneverificationfragment)
    {
        int i1 = phoneverificationfragment.D;
        phoneverificationfragment.D = i1 + 1;
        return i1;
    }

    static Ei j(PhoneVerificationFragment phoneverificationfragment)
    {
        return phoneverificationfragment.v;
    }

    static void k(PhoneVerificationFragment phoneverificationfragment)
    {
        Gc.b b1 = phoneverificationfragment. new Gc.b() {

            private PhoneVerificationFragment a;

            public final void a(int i1)
            {
                switch (i1)
                {
                default:
                    return;

                case 0: // '\0'
                    PhoneVerificationFragment.q(a);
                    a.u();
                    (a. new b(true, a.t())).execute();
                    a.c.a(com.snapchat.android.analytics.RegistrationAnalytics.PhoneVerificationMethod.TEXT, PhoneVerificationFragment.n(a));
                    return;

                case 1: // '\001'
                    a.u();
                    break;
                }
                (a. new b(false, a.t())).execute();
                a.c.a(com.snapchat.android.analytics.RegistrationAnalytics.PhoneVerificationMethod.CALL, PhoneVerificationFragment.n(a));
            }

            
            {
                a = PhoneVerificationFragment.this;
                super();
            }
        };
        Gc.a a1 = phoneverificationfragment. new Gc.a() {

            private PhoneVerificationFragment a;

            public final void a(Gc gc1)
            {
                a.c.a(com.snapchat.android.analytics.RegistrationAnalytics.PhoneVerificationMethod.CANCEL, PhoneVerificationFragment.n(a));
            }

            
            {
                a = PhoneVerificationFragment.this;
                super();
            }
        };
        Gc gc = new Gc(phoneverificationfragment.d);
        gc.h = phoneverificationfragment.getString(0x7f0801dc, new Object[] {
            phoneverificationfragment.e.getText()
        });
        gc.a(0x7f090000, b1).b(0x7f08007f, a1).b();
    }

    static boolean l(PhoneVerificationFragment phoneverificationfragment)
    {
        return phoneverificationfragment.z;
    }

    static int m(PhoneVerificationFragment phoneverificationfragment)
    {
        int i1 = phoneverificationfragment.C;
        phoneverificationfragment.C = i1 + 1;
        return i1;
    }

    static int n(PhoneVerificationFragment phoneverificationfragment)
    {
        return phoneverificationfragment.C;
    }

    static int o(PhoneVerificationFragment phoneverificationfragment)
    {
        int i1 = phoneverificationfragment.E;
        phoneverificationfragment.E = i1 + 1;
        return i1;
    }

    static int p(PhoneVerificationFragment phoneverificationfragment)
    {
        return phoneverificationfragment.E;
    }

    static void q(PhoneVerificationFragment phoneverificationfragment)
    {
        Timber.c("PhoneVerificationFragment", "registerSmsReceiver()", new Object[0]);
        if (phoneverificationfragment.u == null)
        {
            phoneverificationfragment.u = new SmsReceiver();
            phoneverificationfragment.getActivity().registerReceiver(phoneverificationfragment.u, new IntentFilter("android.provider.Telephony.SMS_RECEIVED"));
        }
    }

    static boolean r(PhoneVerificationFragment phoneverificationfragment)
    {
        phoneverificationfragment.A = true;
        return true;
    }

    static AlertDialog s(PhoneVerificationFragment phoneverificationfragment)
    {
        return phoneverificationfragment.s;
    }

    static boolean t(PhoneVerificationFragment phoneverificationfragment)
    {
        return phoneverificationfragment.A;
    }

    static String u(PhoneVerificationFragment phoneverificationfragment)
    {
        return phoneverificationfragment.a;
    }

    static Handler v(PhoneVerificationFragment phoneverificationfragment)
    {
        return phoneverificationfragment.q;
    }

    static int w(PhoneVerificationFragment phoneverificationfragment)
    {
        int i1 = phoneverificationfragment.t;
        phoneverificationfragment.t = i1 - 1;
        return i1;
    }

    public abstract void a(UT ut);

    protected final void a(UV uv)
    {
        if (!t()) goto _L2; else goto _L1
_L1:
        com.snapchat.android.analytics.PhoneVerificationAnalytics.VerificationType verificationtype = com.snapchat.android.analytics.PhoneVerificationAnalytics.VerificationType.VERIFIED_NUMBER;
_L4:
        (new EasyMetric("FORCE_PHONE_VERIFICATION_SUCCESS")).a("result", Io.a(verificationtype)).e();
        if (isAdded())
        {
            Bt.a(m);
            a(uv.e());
            w();
        }
        return;
_L2:
        if (Bt.e())
        {
            verificationtype = com.snapchat.android.analytics.PhoneVerificationAnalytics.VerificationType.VERIFIED_NEW_NUMBER;
        } else
        {
            verificationtype = com.snapchat.android.analytics.PhoneVerificationAnalytics.VerificationType.REGISTERED_NUMBER;
            RegistrationAnalytics registrationanalytics = c;
            int i1 = D;
            boolean flag;
            if (E > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (Bt.B() || RegistrationAnalytics.b())
            {
                jD jd = new jD();
                jd.attemptCount = Long.valueOf(i1);
                jd.hasResentCode = Boolean.valueOf(flag);
                registrationanalytics.mBlizzardEventLogger.a(jd);
            }
            if (Bt.C() && !Bt.g())
            {
                c.j();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(String s1)
    {
    }

    protected final void b(String s1)
    {
        boolean flag = true;
        if (isAdded())
        {
            u();
            j.setVisibility(4);
            e.setEnabled(true);
            h.setEnabled(true);
            e(s1);
        }
        n();
        RegistrationAnalytics.g();
        s1 = c;
        int i1 = D;
        if (E <= 0)
        {
            flag = false;
        }
        if (Bt.B() || RegistrationAnalytics.b())
        {
            jA ja = new jA();
            ja.attemptCount = Long.valueOf(i1);
            ja.hasResentCode = Boolean.valueOf(flag);
            ((RegistrationAnalytics) (s1)).mBlizzardEventLogger.a(ja);
        }
    }

    public final void b(boolean flag)
    {
        F = flag;
        if (b != null)
        {
            View view = b;
            int i1;
            if (flag)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            view.setVisibility(i1);
        }
    }

    public abstract void h();

    public UU.a m()
    {
        return UU.a.DEFAULT_TYPE;
    }

    protected void n()
    {
    }

    public final void o()
    {
        e.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            private PhoneVerificationFragment a;

            public final void onFocusChange(View view, boolean flag)
            {
                if (flag)
                {
                    PhoneVerificationFragment.a(a, com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode.DRAW_BELOW_FOR_ADJUSTABLE_UI);
                    Jo.h(a.getActivity());
                    view = a.c;
                    if (Bt.B() || RegistrationAnalytics.b())
                    {
                        jr jr1 = new jr();
                        ((RegistrationAnalytics) (view)).mBlizzardEventLogger.a(jr1);
                    }
                    return;
                } else
                {
                    PhoneVerificationFragment.a(a, false);
                    return;
                }
            }

            
            {
                a = PhoneVerificationFragment.this;
                super();
            }
        });
        e.addTextChangedListener(new TextWatcher() {

            private PhoneVerificationFragment a;

            public final void afterTextChanged(Editable editable)
            {
                a.m = "";
                if (PhoneVerificationFragment.b(a) != null)
                {
                    PhoneVerificationFragment.b(a).c();
                    PhoneVerificationFragment.a(a, null);
                }
                PhoneVerificationFragment.a(a, null);
                PhoneVerificationFragment.c(a);
                a.u();
                if (!PhoneVerificationFragment.d(a))
                {
                    PhoneVerificationFragment.a(a, true);
                }
            }

            public final void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            
            {
                a = PhoneVerificationFragment.this;
                super();
            }
        });
        o.setOnClickListener(new android.view.View.OnClickListener() {

            private PhoneVerificationFragment a;

            public final void onClick(View view)
            {
                PhoneVerificationFragment.a(a, null);
                a.e.setText("");
                a.e.requestFocus();
                RegistrationAnalytics.h();
            }

            
            {
                a = PhoneVerificationFragment.this;
                super();
            }
        });
        String s1 = ((TelephonyManager)d.getApplicationContext().getSystemService("phone")).getLine1Number();
        if (s1 != null)
        {
            e.setText(s1);
            RegistrationAnalytics.c();
        }
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        d = (FragmentActivity)activity;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f0400ac, null);
        s();
        q();
        v();
        o();
        p();
        return mFragmentLayout;
    }

    public void onDetach()
    {
        super.onDetach();
        d = null;
    }

    public void onPause()
    {
        Jo.a(getActivity(), mFragmentLayout);
        super.onPause();
        if (s != null)
        {
            s.dismiss();
        }
        v.b(1024, G);
        w.clear();
        Timber.c("PhoneVerificationFragment", "unregisterSmsReceiver()", new Object[0]);
        if (u != null)
        {
            getActivity().unregisterReceiver(u);
            u = null;
        }
    }

    public void onResume()
    {
        super.onResume();
        v.a(1024, G);
    }

    public void onVerificationCodeReceivedEvent(OJ oj)
    {
        if (TextUtils.isEmpty(h.getText()))
        {
            h.setText(oj.code);
            B = true;
            i.performClick();
        }
    }

    public final void p()
    {
        h.addTextChangedListener(new TextWatcher() {

            private PhoneVerificationFragment a;

            public final void afterTextChanged(Editable editable)
            {
                PhoneVerificationFragment.e(a);
                a.u();
                if (!PhoneVerificationFragment.f(a))
                {
                    PhoneVerificationFragment.b(a, true);
                }
                PhoneVerificationFragment.g(a);
            }

            public final void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            
            {
                a = PhoneVerificationFragment.this;
                super();
            }
        });
        h.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            private PhoneVerificationFragment a;

            public final void onFocusChange(View view, boolean flag)
            {
                if (flag)
                {
                    PhoneVerificationFragment.b(a, com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode.DRAW_BELOW_FOR_ADJUSTABLE_UI);
                    view = a.c;
                    flag = PhoneVerificationFragment.h(a);
                    if (Bt.B() || RegistrationAnalytics.b())
                    {
                        jt jt1 = new jt();
                        jt1.autofill = Boolean.valueOf(flag);
                        ((RegistrationAnalytics) (view)).mBlizzardEventLogger.a(jt1);
                    }
                    return;
                } else
                {
                    PhoneVerificationFragment.b(a, false);
                    return;
                }
            }

            
            {
                a = PhoneVerificationFragment.this;
                super();
            }
        });
        g.setOnClickListener(new android.view.View.OnClickListener() {

            private PhoneVerificationFragment a;

            public final void onClick(View view)
            {
                PhoneVerificationFragment.e(a);
                a.h.setText("");
                a.h.requestFocus();
                RegistrationAnalytics.i();
            }

            
            {
                a = PhoneVerificationFragment.this;
                super();
            }
        });
    }

    public final boolean p_()
    {
        return true;
    }

    public final void q()
    {
        Button button = i;
        getActivity().getAssets();
        Iq.a(button);
        i.setOnClickListener(new android.view.View.OnClickListener() {

            private PhoneVerificationFragment a;

            public final void onClick(View view)
            {
                if (!TextUtils.equals(a.e.getText(), a.m) || a.h.length() != 6) goto _L2; else goto _L1
_L1:
                a.x();
                PhoneVerificationFragment.i(a);
                view = PhoneVerificationFragment.a(a);
                Ei ei = PhoneVerificationFragment.j(a);
                FragmentActivity fragmentactivity = a.getActivity();
                String s1 = a.h.getText().toString();
                String s2 = a.m().name();
                Intent intent = ei.c(fragmentactivity);
                intent.putExtra("op_code", 1024);
                intent.putExtra("action", "verifyPhoneNumber");
                intent.putExtra("code", s1);
                intent.putExtra("type", s2);
                view.add(Integer.valueOf(ei.a(fragmentactivity, intent)));
                view = a.c;
                boolean flag = PhoneVerificationFragment.h(a);
                if (Bt.B() || RegistrationAnalytics.b())
                {
                    jz jz1 = new jz();
                    jz1.autofill = Boolean.valueOf(flag);
                    ((RegistrationAnalytics) (view)).mBlizzardEventLogger.a(jz1);
                }
_L4:
                return;
_L2:
                PhoneVerificationFragment.k(a);
                RegistrationAnalytics.e();
                if (PhoneVerificationFragment.l(a))
                {
                    break; /* Loop/switch isn't completed */
                }
                PhoneVerificationFragment.m(a);
                view = a.c;
                int i1 = PhoneVerificationFragment.n(a);
                if (Bt.B() || RegistrationAnalytics.b())
                {
                    jx jx1 = new jx();
                    jx1.attemptCount = Long.valueOf(i1);
                    ((RegistrationAnalytics) (view)).mBlizzardEventLogger.a(jx1);
                    return;
                }
                if (true) goto _L4; else goto _L3
_L3:
                PhoneVerificationFragment.o(a);
                view = a.c;
                int j1 = PhoneVerificationFragment.p(a);
                if (Bt.B() || RegistrationAnalytics.b())
                {
                    jE je = new jE();
                    je.attemptCount = Long.valueOf(j1);
                    ((RegistrationAnalytics) (view)).mBlizzardEventLogger.a(je);
                    return;
                }
                if (true) goto _L4; else goto _L5
_L5:
            }

            
            {
                a = PhoneVerificationFragment.this;
                super();
            }
        });
    }

    public void s()
    {
        e = (EditText)d(0x7f0d0100);
        p = (TextView)d(0x7f0d0102);
        o = d(0x7f0d0101);
        h = (EditText)d(0x7f0d0103);
        f = (TextView)d(0x7f0d0105);
        g = d(0x7f0d0104);
        i = (Button)d(0x7f0d0107);
        Button button = i;
        getActivity().getAssets();
        Iq.a(button);
        j = (ProgressBar)d(0x7f0d0108);
        k = (TextView)d(0x7f0d00fe);
        if (Bt.g())
        {
            k.setText(0x7f0801e0);
        }
        l = (TextView)d(0x7f0d03ae);
        b = d(0x7f0d03ad);
        b(F);
        q = new Handler();
    }

    protected final boolean t()
    {
        return n && TextUtils.equals(e.getText(), Bt.d());
    }

    protected void u()
    {
        if (TextUtils.isEmpty(e.getText()) || !n && TextUtils.equals(e.getText(), Bt.d()))
        {
            i.setVisibility(8);
            z = false;
            return;
        }
        if (!TextUtils.equals(e.getText(), m))
        {
            fg fg1 = fg.a();
            if (TextUtils.isEmpty(a) || fg1.a(e.getText().toString(), a))
            {
                i.setVisibility(0);
                i.setText(0x7f0800d5);
                i.setClickable(true);
                i.setEnabled(true);
            } else
            {
                i.setVisibility(8);
            }
            z = false;
            return;
        }
        i.setVisibility(0);
        z = false;
        if (h.length() == 6)
        {
            i.setText(0x7f0800d5);
            i.setClickable(true);
            i.setEnabled(true);
            return;
        }
        if (r == null)
        {
            i.setText(0x7f0801e7);
            i.setClickable(true);
            i.setEnabled(true);
        } else
        {
            i.setText((new StringBuilder()).append(getString(0x7f0801e7)).append(" ").append(t).toString());
            i.setEnabled(false);
        }
        z = true;
    }

    public final void v()
    {
        Object obj;
        TextView textview;
        String as[];
        int i1;
        textview = (TextView)d(0x7f0d00ff);
        as = Locale.getISOCountries();
        obj = Locale.getDefault().getCountry();
        i1 = 0;
_L5:
        if (i1 >= as.length) goto _L2; else goto _L1
_L1:
        if (!TextUtils.equals(((CharSequence) (obj)), as[i1])) goto _L4; else goto _L3
_L3:
        obj = new Pair(Integer.valueOf(i1), obj);
_L6:
        a = (String)((Pair) (obj)).second;
        CharSequence acharsequence[] = a(as);
        s = (new android.app.AlertDialog.Builder(d)).setInverseBackgroundForced(true).setSingleChoiceItems(acharsequence, ((Integer)((Pair) (obj)).first).intValue(), new android.content.DialogInterface.OnClickListener(as, textview, acharsequence) {

            private String a[];
            private TextView b;
            private CharSequence c[];
            private PhoneVerificationFragment d;

            public final void onClick(DialogInterface dialoginterface, int j1)
            {
                PhoneVerificationFragment.b(d, a[j1]);
                b.setText(c[j1]);
                d.u();
                dialoginterface.dismiss();
                PhoneVerificationFragment.r(d);
            }

            
            {
                d = PhoneVerificationFragment.this;
                a = as;
                b = textview;
                c = acharsequence;
                super();
            }
        }).setCancelable(true).setTitle(0x7f0800d1).create();
        textview.setText(acharsequence[((Integer)((Pair) (obj)).first).intValue()]);
        textview.setOnClickListener(new android.view.View.OnClickListener() {

            private PhoneVerificationFragment a;

            public final void onClick(View view)
            {
                PhoneVerificationFragment.s(a).show();
                RegistrationAnalytics registrationanalytics = a.c;
                if (!PhoneVerificationFragment.t(a))
                {
                    view = PhoneVerificationFragment.u(a);
                } else
                {
                    view = null;
                }
                if (Bt.B() || RegistrationAnalytics.b())
                {
                    jo jo1 = new jo();
                    jo1.country = view;
                    registrationanalytics.mBlizzardEventLogger.a(jo1);
                }
            }

            
            {
                a = PhoneVerificationFragment.this;
                super();
            }
        });
        return;
_L4:
        i1++;
          goto _L5
_L2:
        i1 = 0;
_L7:
label0:
        {
            if (i1 >= as.length)
            {
                break MISSING_BLOCK_LABEL_229;
            }
            if (!TextUtils.equals(Locale.US.getCountry(), as[i1]))
            {
                break label0;
            }
            obj = new Pair(Integer.valueOf(i1), Locale.US.getCountry());
        }
          goto _L6
        i1++;
          goto _L7
        obj = new Pair(Integer.valueOf(0), as[0]);
          goto _L6
    }

    protected void w()
    {
        h();
    }

    protected final void x()
    {
        e.setEnabled(false);
        h.setEnabled(false);
        i.setText("");
        i.setEnabled(false);
        j.setVisibility(0);
        if (r != null)
        {
            r.c();
            r = null;
        }
    }

    protected boolean z()
    {
        return true;
    }
}
