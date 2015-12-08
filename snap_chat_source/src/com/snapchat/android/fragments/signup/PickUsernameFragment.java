// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.signup;

import Br;
import Bt;
import CU;
import Dk;
import Eh;
import Ei;
import FV;
import II;
import Iq;
import Jo;
import LY;
import PG;
import Qd;
import RK;
import Ti;
import UF;
import Uz;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.snapchat.android.LoginAndSignupActivity;
import com.snapchat.android.analytics.RegistrationAnalytics;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.database.SharedPreferenceKey;
import com.snapchat.android.fragments.verification.NewUserPhoneVerificationFragment;
import com.snapchat.android.ui.window.WindowConfiguration;
import com.snapchat.android.util.AlertDialogUtils;
import com.snapchat.android.util.RegistrationStringKey;
import com.snapchat.android.util.emoji.Emoji;
import com.snapchat.android.util.fragment.SnapchatFragment;
import jK;
import jL;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import js;
import km;
import kn;
import mA;
import oD;
import oO;
import org.apache.commons.lang3.StringUtils;
import pi;
import pn;

public class PickUsernameFragment extends SnapchatFragment
{
    public static final class UsernameState extends Enum
    {

        private static final UsernameState $VALUES[];
        public static final UsernameState CLEAR;
        public static final UsernameState INVALID;
        public static final UsernameState IN_PROGRESS;
        public static final UsernameState RED_X;
        public static final UsernameState VALID;
        public final int progressBarVisibility;
        public final int redXVisibility;
        public final int thumbsDownVisibility;
        public final int thumbsUpVisibility;

        public static UsernameState valueOf(String s1)
        {
            return (UsernameState)Enum.valueOf(com/snapchat/android/fragments/signup/PickUsernameFragment$UsernameState, s1);
        }

        public static UsernameState[] values()
        {
            return (UsernameState[])$VALUES.clone();
        }

        static 
        {
            VALID = new UsernameState("VALID", 0, 0, 4, 4, 4);
            INVALID = new UsernameState("INVALID", 1, 4, 0, 4, 4);
            IN_PROGRESS = new UsernameState("IN_PROGRESS", 2, 4, 4, 0, 4);
            RED_X = new UsernameState("RED_X", 3, 4, 4, 4, 0);
            CLEAR = new UsernameState("CLEAR", 4, 4, 4, 4, 4);
            $VALUES = (new UsernameState[] {
                VALID, INVALID, IN_PROGRESS, RED_X, CLEAR
            });
        }

        private UsernameState(String s1, int i1, int j1, int k1, int l1, int i2)
        {
            super(s1, i1);
            thumbsUpVisibility = j1;
            thumbsDownVisibility = k1;
            progressBarVisibility = l1;
            redXVisibility = i2;
        }
    }

    final class a extends oD
        implements oS.a
    {

        private String a;
        private PickUsernameFragment b;

        private void a()
        {
            if (!b.isAdded())
            {
                return;
            } else
            {
                PickUsernameFragment.o(b).setVisibility(8);
                return;
            }
        }

        final void a(RK rk, pi pi1)
        {
            if (b.isAdded())
            {
                PickUsernameFragment.n(b).setVisibility(4);
                PickUsernameFragment.o(b).setText(0x7f080216);
                PickUsernameFragment.o(b).setClickable(true);
            }
            if (pi1.c() && rk != null) goto _L2; else goto _L1
_L1:
            a();
_L4:
            return;
_L2:
            if (StringUtils.isEmpty(rk.n()))
            {
                break; /* Loop/switch isn't completed */
            }
            if (b.isAdded())
            {
                a();
                int i1;
                if (rk == null)
                {
                    pi1 = null;
                } else
                {
                    pi1 = rk.n();
                }
                if (rk == null)
                {
                    i1 = 0x7ffffffa;
                } else
                {
                    i1 = rk.o().intValue();
                }
                switch (i1)
                {
                case 70: // 'F'
                default:
                    b.m();
                    AlertDialogUtils.a(PickUsernameFragment.b(b), pi1);
                    return;

                case 68: // 'D'
                    b.a(pi1);
                    b.a(UsernameState.RED_X);
                    PickUsernameFragment.g(b).a(km.USERNAME_SAME_AS_PASSWORD);
                    return;

                case 69: // 'E'
                    b.a(pi1);
                    b.a(UsernameState.RED_X);
                    PickUsernameFragment.g(b).a(km.USERNAME_TOO_SHORT);
                    return;

                case 71: // 'G'
                    b.a(pi1);
                    b.a(UsernameState.RED_X);
                    PickUsernameFragment.g(b).a(km.USERNAME_INVALID);
                    return;

                case 72: // 'H'
                    b.a(pi1);
                    break;
                }
                b.a(UsernameState.RED_X);
                PickUsernameFragment.g(b).a(km.USERNAME_EXISTS);
                return;
            }
            if (true) goto _L4; else goto _L3
_L3:
            if (!b.isAdded()) goto _L6; else goto _L5
_L5:
            Bt.a(rk.d());
            pi1 = rk.d().p();
            Bt.b(pi1);
            II.a(SharedPreferenceKey.LAST_SUCCESSFUL_LOGIN_USERNAME.getKey(), pi1);
            b.getActivity();
            LoginAndSignupActivity.a(rk.x());
            PickUsernameFragment.k(b);
            if (Bt.y()) goto _L8; else goto _L7
_L7:
            PickUsernameFragment.k(b);
            if (Bt.x()) goto _L8; else goto _L9
_L9:
            Bt.e(false);
            RegistrationAnalytics.a(false);
_L11:
            mUser.i();
            PickUsernameFragment.p(b);
_L6:
            pi1 = PickUsernameFragment.g(b);
            String s1 = a;
            boolean flag = PickUsernameFragment.q(b);
            boolean flag1 = PickUsernameFragment.r(b);
            String s2 = PickUsernameFragment.s(b);
            int j1 = PickUsernameFragment.t(b);
            jL jl = new jL();
            if (!flag)
            {
                rk = kn.DEFAULT_SUGGESTION;
            } else
            if (!flag1)
            {
                rk = kn.OTHER_SUGGESTION;
            } else
            {
                rk = kn.CUSTOM;
            }
            jl.username = s1;
            jl.usernameType = rk;
            jl.usernameSuggestion = s2;
            jl.usernameIndexPos = Long.valueOf(j1);
            ((RegistrationAnalytics) (pi1)).mBlizzardEventLogger.a(jl);
            return;
_L8:
            RegistrationAnalytics.a(true);
            if (true) goto _L11; else goto _L10
_L10:
        }

        public final void execute()
        {
            b.a(UsernameState.CLEAR);
            PickUsernameFragment.n(b).setVisibility(0);
            PickUsernameFragment.o(b).setClickable(false);
            PickUsernameFragment.o(b).setText("");
            super.execute();
        }

        protected final String getPath()
        {
            return "/loq/register_username";
        }

        public final pn getRequestPayload()
        {
            String s1 = String.valueOf(System.currentTimeMillis());
            Uz uz = (new Uz()).a(a);
            uz.timestamp = s1;
            uz.reqToken = mA.a(s1);
            PickUsernameFragment.k(b);
            uz.username = Bt.S();
            return new oO(uz);
        }

        public final void onJsonResult(Object obj, pi pi1)
        {
            PG.a(new Runnable(this, (RK)obj, pi1) {

                private RK a;
                private pi b;
                private a c;

                public final void run()
                {
                    c.a(a, b);
                }

            
            {
                c = a1;
                a = rk;
                b = pi;
                super();
            }
            });
        }

        public a(String s1)
        {
            b = PickUsernameFragment.this;
            super();
            a = s1;
            registerCallback(RK, this);
        }
    }


    private String A;
    private int B;
    private final Set C;
    private Eh D = new Eh() {

        private PickUsernameFragment a;

        public final void a(CU cu)
        {
            int i1 = Ei.a(cu);
            if (PickUsernameFragment.a(a).contains(Integer.valueOf(i1)))
            {
                PickUsernameFragment.a(a).remove(Integer.valueOf(i1));
                if (cu instanceof Dk)
                {
                    PickUsernameFragment.a(a, (Dk)cu);
                }
            }
        }

            
            {
                a = PickUsernameFragment.this;
                super();
            }
    };
    private final Ei E;
    private final RegistrationAnalytics a;
    private final Bt b;
    private FragmentActivity c;
    private View d;
    private ImageView e;
    private TextView f;
    private EditText g;
    private ProgressBar h;
    private Button i;
    private int j;
    private TextView k;
    private View l;
    private TextView m;
    private TextView n;
    private TextView o;
    private ProgressBar p;
    private HorizontalScrollView q;
    private LinearLayout r;
    private boolean s;
    private Handler t;
    private Resources u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public PickUsernameFragment()
    {
        this(Ei.a(), RegistrationAnalytics.a(), Bt.a(), new WindowConfiguration());
    }

    private PickUsernameFragment(Ei ei, RegistrationAnalytics registrationanalytics, Bt bt, WindowConfiguration windowconfiguration)
    {
        super(windowconfiguration);
        s = false;
        w = false;
        x = false;
        y = false;
        z = false;
        A = "";
        B = -1;
        C = new HashSet();
        E = ei;
        a = registrationanalytics;
        b = bt;
    }

    public PickUsernameFragment(WindowConfiguration windowconfiguration)
    {
        this(Ei.a(), RegistrationAnalytics.a(), Bt.a(), windowconfiguration);
    }

    static int a(PickUsernameFragment pickusernamefragment, int i1)
    {
        pickusernamefragment.B = i1;
        return i1;
    }

    static String a(PickUsernameFragment pickusernamefragment, String s1)
    {
        pickusernamefragment.A = s1;
        return s1;
    }

    static Set a(PickUsernameFragment pickusernamefragment)
    {
        return pickusernamefragment.C;
    }

    static void a(PickUsernameFragment pickusernamefragment, Dk dk)
    {
        Object obj;
        boolean flag1;
        flag1 = true;
        obj = dk.b;
        if (obj != null) goto _L2; else goto _L1
_L1:
        pickusernamefragment.a(((String) (null)));
        pickusernamefragment.b(true);
        pickusernamefragment.a(UsernameState.CLEAR);
_L6:
        return;
_L2:
        String s1;
        String s2;
        boolean flag2;
        s1 = ((UF) (obj)).b();
        s2 = ((UF) (obj)).a();
        obj = ((UF) (obj)).c();
        flag2 = dk.a;
        if (!TextUtils.equals(s1, pickusernamefragment.g.getText())) goto _L4; else goto _L3
_L3:
        boolean flag;
        if (pickusernamefragment.h.getVisibility() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L4; else goto _L5
_L5:
        flag = true;
_L7:
        if (flag)
        {
            pickusernamefragment.a(s2);
            if (s2 != null)
            {
                flag1 = false;
            }
            pickusernamefragment.b(flag1);
            if (flag1)
            {
                dk = UsernameState.VALID;
            } else
            {
                dk = UsernameState.INVALID;
            }
            pickusernamefragment.a(((UsernameState) (dk)));
            if (flag2)
            {
                if (flag1)
                {
                    dk = Collections.emptyList();
                } else
                {
                    dk = ((Dk) (obj));
                }
                pickusernamefragment.a(((List) (dk)));
                return;
            }
        }
        if (true) goto _L6; else goto _L4
_L4:
        flag = false;
          goto _L7
    }

    static boolean a(PickUsernameFragment pickusernamefragment, boolean flag)
    {
        pickusernamefragment.z = flag;
        return flag;
    }

    static FragmentActivity b(PickUsernameFragment pickusernamefragment)
    {
        return pickusernamefragment.c;
    }

    private void b(boolean flag)
    {
        if (flag)
        {
            i.setVisibility(0);
            return;
        } else
        {
            i.setVisibility(8);
            return;
        }
    }

    static boolean b(PickUsernameFragment pickusernamefragment, boolean flag)
    {
        pickusernamefragment.x = flag;
        return flag;
    }

    static boolean c(PickUsernameFragment pickusernamefragment)
    {
        return pickusernamefragment.s;
    }

    static boolean c(PickUsernameFragment pickusernamefragment, boolean flag)
    {
        pickusernamefragment.s = flag;
        return flag;
    }

    static boolean d(PickUsernameFragment pickusernamefragment)
    {
        return pickusernamefragment.x;
    }

    static boolean e(PickUsernameFragment pickusernamefragment)
    {
        pickusernamefragment.y = true;
        return true;
    }

    static EditText f(PickUsernameFragment pickusernamefragment)
    {
        return pickusernamefragment.g;
    }

    static RegistrationAnalytics g(PickUsernameFragment pickusernamefragment)
    {
        return pickusernamefragment.a;
    }

    static LinearLayout h(PickUsernameFragment pickusernamefragment)
    {
        return pickusernamefragment.r;
    }

    static int i(PickUsernameFragment pickusernamefragment)
    {
        return pickusernamefragment.v;
    }

    static HorizontalScrollView j(PickUsernameFragment pickusernamefragment)
    {
        return pickusernamefragment.q;
    }

    static Bt k(PickUsernameFragment pickusernamefragment)
    {
        return pickusernamefragment.b;
    }

    static Ei l(PickUsernameFragment pickusernamefragment)
    {
        return pickusernamefragment.E;
    }

    static void m(PickUsernameFragment pickusernamefragment)
    {
        pickusernamefragment.n();
    }

    static ProgressBar n(PickUsernameFragment pickusernamefragment)
    {
        return pickusernamefragment.h;
    }

    private void n()
    {
        t.removeCallbacksAndMessages(null);
    }

    static Button o(PickUsernameFragment pickusernamefragment)
    {
        return pickusernamefragment.i;
    }

    private void o()
    {
        a(j, new NewUserPhoneVerificationFragment(super.mWindowConfiguration), com/snapchat/android/fragments/verification/NewUserPhoneVerificationFragment.getSimpleName());
    }

    static void p(PickUsernameFragment pickusernamefragment)
    {
        pickusernamefragment.o();
    }

    static boolean q(PickUsernameFragment pickusernamefragment)
    {
        return pickusernamefragment.y;
    }

    static boolean r(PickUsernameFragment pickusernamefragment)
    {
        return pickusernamefragment.z;
    }

    static String s(PickUsernameFragment pickusernamefragment)
    {
        return pickusernamefragment.A;
    }

    static int t(PickUsernameFragment pickusernamefragment)
    {
        return pickusernamefragment.B;
    }

    protected final void a(UsernameState usernamestate)
    {
        if (l.getVisibility() == 0 && (usernamestate == UsernameState.VALID || usernamestate == UsernameState.INVALID))
        {
            return;
        } else
        {
            m.setVisibility(usernamestate.thumbsUpVisibility);
            n.setVisibility(usernamestate.thumbsDownVisibility);
            p.setVisibility(usernamestate.progressBarVisibility);
            l.setVisibility(usernamestate.redXVisibility);
            return;
        }
    }

    protected final void a(String s1)
    {
        if (s1 == null)
        {
            k.setVisibility(8);
            return;
        } else
        {
            k.setVisibility(0);
            k.setText(s1);
            return;
        }
    }

    protected final void a(List list)
    {
        if (list != null)
        {
            r.removeAllViews();
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) 
            {
                String s1 = (String)iterator.next();
                TextView textview = new TextView(getActivity());
                textview.setFilters(new InputFilter[] {
                    new android.text.InputFilter.LengthFilter(0x7f0e0003)
                });
                textview.setText(s1);
                textview.setOnClickListener(new android.view.View.OnClickListener(textview, s1, list) {

                    private TextView a;
                    private String b;
                    private List c;
                    private PickUsernameFragment d;

                    public final void onClick(View view)
                    {
                        PickUsernameFragment.c(d, true);
                        PickUsernameFragment.f(d).setText(a.getText());
                        PickUsernameFragment.f(d).setSelection(a.getText().length());
                        PickUsernameFragment.c(d, false);
                        PickUsernameFragment.a(d, b);
                        PickUsernameFragment.a(d, c.indexOf(b));
                        PickUsernameFragment.a(d, false);
                    }

            
            {
                d = PickUsernameFragment.this;
                a = textview;
                b = s1;
                c = list;
                super();
            }
                });
                r.addView(textview, new android.view.ViewGroup.LayoutParams(-2, -2));
            }
        }
    }

    protected final com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode b()
    {
        return com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode.DRAW_BELOW_FOR_ADJUSTABLE_UI;
    }

    public final boolean f()
    {
        (new FV(c)).show();
        return true;
    }

    protected final boolean h()
    {
        return w && !y;
    }

    protected final void m()
    {
        n();
        if (!TextUtils.isEmpty(g.getText()))
        {
            Handler handler = t;
            int i1;
            if (!s)
            {
                i1 = 1;
            } else
            {
                i1 = 2;
            }
            handler.sendEmptyMessageDelayed(i1, 500L);
        }
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        c = (FragmentActivity)activity;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f0400ad, null);
        u = getResources();
        e = (ImageView)d(0x7f0d003a);
        d = d(0x7f0d03b1);
        f = (TextView)d(0x7f0d03b2);
        o = (TextView)d(0x7f0d03b4);
        h = (ProgressBar)d(0x7f0d03be);
        g = (EditText)d(0x7f0d03b5);
        RegistrationStringKey.REG_PICK_USERNAME_TITLE.setTextViewIfNeeded(f);
        RegistrationStringKey.REG_PICK_USERNAME_HINT.setTextViewHintIfNeeded(g);
        RegistrationStringKey.REG_PICK_USERNAME_DESC.setTextViewIfNeeded(o);
        p = (ProgressBar)d(0x7f0d03b9);
        m = (TextView)d(0x7f0d03b7);
        m.setText(LY.a(Emoji.THUMBS_UP_SIGN));
        n = (TextView)d(0x7f0d03b8);
        n.setText(LY.a(Emoji.THUMBS_DOWN_SIGN));
        i = (Button)d(0x7f0d03b3);
        Object obj = getArguments();
        layoutinflater = "";
        bundle = Collections.emptyList();
        boolean flag;
        boolean flag1;
        if (obj != null)
        {
            if (((Bundle) (obj)).containsKey("defaultUsername"))
            {
                layoutinflater = ((Bundle) (obj)).getString("defaultUsername");
            }
            int i1;
            if (((Bundle) (obj)).containsKey("defaultUsernameStatus"))
            {
                flag = ((Bundle) (obj)).getBoolean("defaultUsernameStatus");
            } else
            {
                flag = false;
            }
            if (((Bundle) (obj)).containsKey("usernameSuggestions"))
            {
                bundle = ((Bundle) (obj)).getStringArrayList("usernameSuggestions");
            }
            if (((Bundle) (obj)).containsKey("registrationRecovery"))
            {
                flag1 = ((Bundle) (obj)).getBoolean("registrationRecovery");
            } else
            {
                flag1 = false;
            }
        } else
        {
            flag = false;
            layoutinflater = "";
            flag1 = false;
        }
        obj = e;
        if (flag1)
        {
            i1 = 0;
        } else
        {
            i1 = 4;
        }
        ((ImageView) (obj)).setVisibility(i1);
        if (flag1)
        {
            d.setOnClickListener(new android.view.View.OnClickListener() {

                private PickUsernameFragment a;

                public final void onClick(View view)
                {
                    Jo.a(PickUsernameFragment.b(a), view);
                    PickUsernameFragment.b(a).onBackPressed();
                }

            
            {
                a = PickUsernameFragment.this;
                super();
            }
            });
        }
        if (TextUtils.isEmpty(layoutinflater))
        {
            layoutinflater = Bt.S();
            if (TextUtils.isEmpty(layoutinflater))
            {
                break MISSING_BLOCK_LABEL_719;
            }
            i1 = layoutinflater.indexOf('@');
            if (i1 == -1)
            {
                break MISSING_BLOCK_LABEL_719;
            }
            layoutinflater = layoutinflater.substring(0, i1).toLowerCase(Locale.ENGLISH).replaceAll("[^a-z0-9-_\\.]", "");
        }
        if (!TextUtils.isEmpty(layoutinflater))
        {
            g.setText(layoutinflater);
            g.setSelection(g.getText().length());
            w = true;
        }
        g.addTextChangedListener(new TextWatcher() {

            private PickUsernameFragment a;

            public final void afterTextChanged(Editable editable)
            {
                a.a(null);
                a.a(UsernameState.CLEAR);
                if (!PickUsernameFragment.c(a))
                {
                    a.a(Collections.emptyList());
                    PickUsernameFragment.a(a, true);
                }
                a.m();
                if (!PickUsernameFragment.d(a))
                {
                    PickUsernameFragment.b(a, true);
                }
                PickUsernameFragment.e(a);
            }

            public final void beforeTextChanged(CharSequence charsequence, int j1, int k1, int l1)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int j1, int k1, int l1)
            {
            }

            
            {
                a = PickUsernameFragment.this;
                super();
            }
        });
        g.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            private PickUsernameFragment a;

            public final void onFocusChange(View view, boolean flag2)
            {
                if (flag2)
                {
                    RegistrationAnalytics registrationanalytics = PickUsernameFragment.g(a);
                    js js1;
                    if (a.h())
                    {
                        view = PickUsernameFragment.f(a).getText().toString();
                    } else
                    {
                        view = null;
                    }
                    js1 = new js();
                    js1.usernameSuggestion = view;
                    registrationanalytics.mBlizzardEventLogger.a(js1);
                    return;
                } else
                {
                    PickUsernameFragment.b(a, false);
                    return;
                }
            }

            
            {
                a = PickUsernameFragment.this;
                super();
            }
        });
        g.setInputType(0x80000);
        if (g.requestFocus())
        {
            Jo.g(c);
        }
        k = (TextView)d(0x7f0d03bb);
        l = d(0x7f0d03ba);
        l.setOnClickListener(new android.view.View.OnClickListener() {

            private PickUsernameFragment a;

            public final void onClick(View view)
            {
                a.a(null);
                PickUsernameFragment.f(a).setText("");
            }

            
            {
                a = PickUsernameFragment.this;
                super();
            }
        });
        q = (HorizontalScrollView)d(0x7f0d03bc);
        r = (LinearLayout)d(0x7f0d03bd);
        v = u.getDimensionPixelOffset(0x7f0a006d);
        r.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            private PickUsernameFragment a;

            public final void onGlobalLayout()
            {
                boolean flag2 = false;
                int l1 = PickUsernameFragment.h(a).getWidth();
                int i2 = PickUsernameFragment.f(a).getWidth();
                Object obj1 = PickUsernameFragment.j(a);
                int j1;
                int k1;
                if (l1 < i2)
                {
                    j1 = PickUsernameFragment.i(a);
                } else
                {
                    j1 = 0;
                }
                if (l1 < i2)
                {
                    k1 = PickUsernameFragment.i(a);
                } else
                {
                    k1 = 0;
                }
                ((HorizontalScrollView) (obj1)).setPadding(j1, 0, k1, 0);
                obj1 = (android.widget.FrameLayout.LayoutParams)PickUsernameFragment.h(a).getLayoutParams();
                j1 = ((flag2) ? 1 : 0);
                if (l1 - i2 > 0)
                {
                    j1 = ((flag2) ? 1 : 0);
                    if (l1 - i2 < PickUsernameFragment.i(a) * 2)
                    {
                        j1 = 1;
                    }
                }
                if (((android.widget.FrameLayout.LayoutParams) (obj1)).gravity != j1)
                {
                    obj1.gravity = j1;
                    PickUsernameFragment.h(a).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
                }
            }

            
            {
                a = PickUsernameFragment.this;
                super();
            }
        });
        t = new Handler() {

            private PickUsernameFragment a;

            public final void handleMessage(Message message)
            {
                boolean flag2 = true;
                if (PickUsernameFragment.b(a) != null && (message.what == 1 || message.what == 2))
                {
                    Set set = PickUsernameFragment.a(a);
                    Ei ei = PickUsernameFragment.l(a);
                    FragmentActivity fragmentactivity = PickUsernameFragment.b(a);
                    PickUsernameFragment.k(a);
                    String s1 = Bt.S();
                    String s2 = PickUsernameFragment.f(a).getText().toString();
                    if (message.what != 1)
                    {
                        flag2 = false;
                    }
                    message = ei.c(fragmentactivity);
                    message.putExtra("op_code", 1020);
                    message.putExtra("email", s1);
                    message.putExtra("requested_username", s2);
                    message.putExtra("refresh_suggestions", flag2);
                    set.add(Integer.valueOf(ei.a(fragmentactivity, message)));
                    a.a(UsernameState.IN_PROGRESS);
                }
            }

            
            {
                a = PickUsernameFragment.this;
                super();
            }
        };
        layoutinflater = i;
        c.getAssets();
        Iq.a(layoutinflater);
        i.setVisibility(8);
        i.setOnClickListener(new android.view.View.OnClickListener() {

            private PickUsernameFragment a;

            public final void onClick(View view)
            {
                view = PickUsernameFragment.f(a).getText().toString().trim();
                PickUsernameFragment.m(a);
                (a. new a(view)).execute();
                Jo.a(PickUsernameFragment.b(a), PickUsernameFragment.f(a));
            }

            
            {
                a = PickUsernameFragment.this;
                super();
            }
        });
        if (flag)
        {
            a(UsernameState.VALID);
            a(bundle);
            b(true);
        } else
        {
            m();
        }
        layoutinflater = a;
        bundle = new jK();
        ((RegistrationAnalytics) (layoutinflater)).mBlizzardEventLogger.a(bundle);
        j = viewgroup.getId();
        return mFragmentLayout;
        layoutinflater = "";
        break MISSING_BLOCK_LABEL_408;
    }

    public void onDetach()
    {
        super.onDetach();
        c = null;
    }

    public void onPause()
    {
        super.onPause();
        n();
        E.b(1020, D);
        C.clear();
    }

    public void onResume()
    {
        super.onResume();
        if (Bt.q() != null)
        {
            o();
        }
        E.a(1020, D);
        if (!h())
        {
            m();
        }
    }
}
