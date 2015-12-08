// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.signup;

import Br;
import Bt;
import Iq;
import Jo;
import KO;
import Ll;
import Mf;
import Sw;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.style.ForegroundColorSpan;
import android.util.Patterns;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.analytics.RegistrationAnalytics;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.database.SharedPreferenceKey;
import com.snapchat.android.fragments.captcha.CaptchaFragment;
import com.snapchat.android.fragments.verification.NewUserPhoneVerificationFragment;
import com.snapchat.android.ui.window.WindowConfiguration;
import com.snapchat.android.util.AlertDialogUtils;
import com.snapchat.android.util.RegistrationStringKey;
import com.snapchat.android.util.crypto.DeviceToken;
import com.snapchat.android.util.crypto.DeviceTokenManager;
import com.snapchat.android.util.fragment.SnapchatFragment;
import dA;
import eg;
import iY;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.inject.Provider;
import jn;
import jp;
import jq;
import jv;
import mI;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.snapchat.android.fragments.signup:
//            PickUsernameFragment

public class SignupFragment extends SnapchatFragment
    implements mI.b
{

    static final eg a = eg.a("gmail", "hotmail", "yahoo", "ymail", "outlook", "aol", new String[0]);
    private static int l = -1;
    private static int m = -1;
    private boolean A;
    private final Provider B;
    private final DeviceTokenManager C;
    private android.app.DatePickerDialog.OnDateSetListener D = new android.app.DatePickerDialog.OnDateSetListener() {

        private SignupFragment a;

        public final void onDateSet(DatePicker datepicker, int i1, int j1, int k1)
        {
label0:
            {
                boolean flag1 = false;
                datepicker = new GregorianCalendar(i1, j1, k1);
                SignupFragment signupfragment = a;
                boolean flag;
                if (SignupFragment.l(a) || SignupFragment.m(a).get(1) != datepicker.get(1))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                SignupFragment.c(signupfragment, flag);
                signupfragment = a;
                if (SignupFragment.n(a) || SignupFragment.m(a).get(2) != datepicker.get(2))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                SignupFragment.d(signupfragment, flag);
                signupfragment = a;
                if (!SignupFragment.o(a))
                {
                    flag = flag1;
                    if (SignupFragment.m(a).get(5) == datepicker.get(5))
                    {
                        break label0;
                    }
                }
                flag = true;
            }
            SignupFragment.e(signupfragment, flag);
            if (SignupFragment.m(a).get(1) != datepicker.get(1) || SignupFragment.m(a).get(2) != datepicker.get(2) || SignupFragment.m(a).get(5) != datepicker.get(5))
            {
                SignupFragment.a(a, datepicker);
                SignupFragment.p(a).setText((new SimpleDateFormat("MM/dd/yyyy")).format(SignupFragment.m(a).getTime()));
                SignupFragment.d(a);
            }
        }

            
            {
                a = SignupFragment.this;
                super();
            }
    };
    String b;
    EditText c;
    EditText d;
    GregorianCalendar e;
    View f;
    Button g;
    TextView h;
    int i;
    public KO j;
    private final RegistrationAnalytics k;
    private FragmentActivity n;
    private int o;
    private TextView p;
    private int q;
    private int r;
    private EditText s;
    private ImageView t;
    private TextView u;
    private ImageView v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public SignupFragment()
    {
        this(new WindowConfiguration());
    }

    public SignupFragment(WindowConfiguration windowconfiguration)
    {
        Mf.a();
        Provider provider = Br.UNSAFE_USER_PROVIDER;
        DeviceTokenManager devicetokenmanager = DeviceTokenManager.getInstance();
        RegistrationAnalytics registrationanalytics = RegistrationAnalytics.a();
        Bt.a();
        this(provider, devicetokenmanager, registrationanalytics, windowconfiguration);
    }

    private SignupFragment(Provider provider, DeviceTokenManager devicetokenmanager, RegistrationAnalytics registrationanalytics, WindowConfiguration windowconfiguration)
    {
        super(windowconfiguration);
        w = false;
        x = false;
        y = false;
        z = false;
        A = false;
        i = 0;
        SnapchatApplication.getDIComponent().a(this);
        B = provider;
        C = devicetokenmanager;
        k = registrationanalytics;
    }

    static FragmentActivity a(SignupFragment signupfragment)
    {
        return signupfragment.n;
    }

    static GregorianCalendar a(SignupFragment signupfragment, GregorianCalendar gregoriancalendar)
    {
        signupfragment.e = gregoriancalendar;
        return gregoriancalendar;
    }

    private void a(String s1)
    {
        if (s1 == null)
        {
            h.setText("");
            h.setVisibility(4);
            t.setVisibility(4);
            b(false);
            return;
        } else
        {
            h.setText(s1);
            h.setVisibility(0);
            t.setVisibility(0);
            b(true);
            h.setLinksClickable(false);
            return;
        }
    }

    private void a(String s1, boolean flag, List list, boolean flag1)
    {
        PickUsernameFragment pickusernamefragment = new PickUsernameFragment(super.mWindowConfiguration);
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(s1))
        {
            bundle.putString("defaultUsername", s1);
            bundle.putBoolean("defaultUsernameStatus", flag);
            if (list != null && !list.isEmpty())
            {
                bundle.putStringArrayList("usernameSuggestions", new ArrayList(list));
            }
        }
        bundle.putBoolean("registrationRecovery", flag1);
        pickusernamefragment.setArguments(bundle);
        a(o, ((android.support.v4.app.Fragment) (pickusernamefragment)), com/snapchat/android/fragments/signup/PickUsernameFragment.getSimpleName());
    }

    static boolean a(SignupFragment signupfragment, boolean flag)
    {
        signupfragment.w = flag;
        return flag;
    }

    static RegistrationAnalytics b(SignupFragment signupfragment)
    {
        return signupfragment.k;
    }

    private void b(String s1)
    {
        if (s1 == null)
        {
            u.setText("");
            u.setVisibility(4);
            v.setVisibility(4);
            return;
        } else
        {
            u.setText(s1);
            u.setVisibility(0);
            v.setVisibility(0);
            return;
        }
    }

    static boolean b(SignupFragment signupfragment, boolean flag)
    {
        signupfragment.x = flag;
        return flag;
    }

    static EditText c(SignupFragment signupfragment)
    {
        return signupfragment.c;
    }

    static boolean c(SignupFragment signupfragment, boolean flag)
    {
        signupfragment.y = flag;
        return flag;
    }

    static void d(SignupFragment signupfragment)
    {
        signupfragment.m();
    }

    static boolean d(SignupFragment signupfragment, boolean flag)
    {
        signupfragment.z = flag;
        return flag;
    }

    static void e(SignupFragment signupfragment)
    {
        signupfragment.a(((String) (null)));
    }

    static boolean e(SignupFragment signupfragment, boolean flag)
    {
        signupfragment.A = flag;
        return flag;
    }

    static boolean f(SignupFragment signupfragment)
    {
        return signupfragment.w;
    }

    static String g(SignupFragment signupfragment)
    {
        return signupfragment.b;
    }

    static void h(SignupFragment signupfragment)
    {
        signupfragment.b(((String) (null)));
    }

    static boolean h()
    {
        return true;
    }

    static boolean i(SignupFragment signupfragment)
    {
        return signupfragment.x;
    }

    static void j(SignupFragment signupfragment)
    {
        signupfragment.d.getOnFocusChangeListener().onFocusChange(null, false);
        Object obj = new DatePickerDialog(signupfragment.n, signupfragment.D, signupfragment.e.get(1), signupfragment.e.get(2), signupfragment.e.get(5));
        ((DatePickerDialog) (obj)).getDatePicker().setMaxDate((new Date()).getTime());
        ((DatePickerDialog) (obj)).show();
        Jo.a(signupfragment.n, signupfragment.s);
        signupfragment = signupfragment.k;
        obj = new jn();
        ((RegistrationAnalytics) (signupfragment)).mBlizzardEventLogger.a(((kl) (obj)));
    }

    static EditText k(SignupFragment signupfragment)
    {
        return signupfragment.d;
    }

    static boolean l(SignupFragment signupfragment)
    {
        return signupfragment.y;
    }

    static GregorianCalendar m(SignupFragment signupfragment)
    {
        return signupfragment.e;
    }

    private void m()
    {
        if (!TextUtils.isEmpty(c.getText()) && !TextUtils.isEmpty(d.getText()) && !TextUtils.isEmpty(s.getText()))
        {
            g.setVisibility(0);
            g.setText(0x7f080166);
            g.setClickable(true);
            return;
        } else
        {
            g.setVisibility(8);
            return;
        }
    }

    static boolean n(SignupFragment signupfragment)
    {
        return signupfragment.z;
    }

    static boolean o(SignupFragment signupfragment)
    {
        return signupfragment.A;
    }

    static EditText p(SignupFragment signupfragment)
    {
        return signupfragment.s;
    }

    public final void a(int i1, String s1)
    {
        if (!isAdded())
        {
            return;
        }
        f.setVisibility(8);
        g.setVisibility(8);
        switch (i1)
        {
        default:
            m();
            AlertDialogUtils.a(n, s1);
            return;

        case -200: 
            k.a(iY.EMAIL_INVALID, i);
            a(s1);
            return;

        case -201: 
            k.a(iY.EMAIL_EXISTS, i);
            a(s1);
            return;

        case 7: // '\007'
            k.a(iY.PASSWORD_TOO_SHORT, i);
            b(s1);
            return;

        case 8: // '\b'
            k.a(iY.PASSWORD_TOO_COMMON, i);
            b(s1);
            return;

        case 9: // '\t'
            k.a(iY.PASSWORD_TOO_EASY, i);
            b(s1);
            return;

        case 10: // '\n'
            k.a(iY.PASSWORD_TOO_SIMILAR_TO_USERNAME, i);
            b(s1);
            return;

        case 11: // '\013'
            k.a(iY.PASSWORD_TOO_SIMILAR_TO_EMAIL, i);
            break;
        }
        b(s1);
    }

    public final void a(Sw sw)
    {
        if (isAdded())
        {
            Br br = (Br)B.get();
            if (br != null)
            {
                Bt.a(sw);
                br.i();
            }
            a(sw.l(), sw.m().booleanValue(), sw.n(), false);
            if (sw.i() && sw.k())
            {
                C.onGetDeviceTokenTaskCompleted(new DeviceToken(sw.h(), sw.j()));
            }
        }
        sw = k;
        boolean flag = y;
        boolean flag1 = z;
        boolean flag2 = A;
        int i1 = i;
        jv jv1 = new jv();
        jv1.editBirthdayYear = Boolean.valueOf(flag);
        jv1.editBirthdayMonth = Boolean.valueOf(flag1);
        jv1.editBirthdayDay = Boolean.valueOf(flag2);
        jv1.attemptCount = Long.valueOf(i1);
        ((RegistrationAnalytics) (sw)).mBlizzardEventLogger.a(jv1);
    }

    protected final com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode b()
    {
        return com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode.DRAW_BELOW_FOR_ADJUSTABLE_UI;
    }

    final void b(boolean flag)
    {
        int j1 = c.getPaddingLeft();
        int k1 = c.getPaddingTop();
        int l1 = c.getPaddingBottom();
        EditText edittext = c;
        int i1;
        if (flag)
        {
            i1 = r;
        } else
        {
            i1 = q;
        }
        edittext.setPadding(j1, k1, i1, l1);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        n = (FragmentActivity)activity;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        int i1;
        int j1;
        i1 = 0;
        mFragmentLayout = layoutinflater.inflate(0x7f0400d1, viewgroup, false);
        if (l == -1)
        {
            l = getResources().getColor(0x7f0c005c);
        }
        if (m == -1)
        {
            m = getResources().getColor(0x7f0c005d);
        }
        e = (GregorianCalendar)GregorianCalendar.getInstance();
        e.add(1, -1);
        o = viewgroup.getId();
        q = getResources().getDimensionPixelSize(0x7f0a0065) + getResources().getDimensionPixelSize(0x7f0a006e);
        r = q + getResources().getDimensionPixelSize(0x7f0a006b);
        p = (TextView)d(0x7f0d0479);
        c = (EditText)d(0x7f0d047a);
        h = (TextView)d(0x7f0d047c);
        t = (ImageView)d(0x7f0d047b);
        d = (EditText)d(0x7f0d047d);
        u = (TextView)d(0x7f0d047f);
        v = (ImageView)d(0x7f0d047e);
        s = (EditText)d(0x7f0d0480);
        g = (Button)d(0x7f0d0482);
        RegistrationStringKey.REG_SIGN_UP_TITLE.setTextViewIfNeeded(p);
        RegistrationStringKey.REG_EMAIL_HINT.setTextViewHintIfNeeded(c);
        RegistrationStringKey.REG_NEW_PASSWORD_HINT.setTextViewHintIfNeeded(d);
        RegistrationStringKey.REG_BIRTHDAY_HINT.setTextViewHintIfNeeded(s);
        d(0x7f0d0478).setOnClickListener(new android.view.View.OnClickListener() {

            private SignupFragment a;

            public final void onClick(View view)
            {
                Jo.a(SignupFragment.a(a), view);
                SignupFragment.a(a).onBackPressed();
            }

            
            {
                a = SignupFragment.this;
                super();
            }
        });
        c.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            private SignupFragment a;

            public final void onFocusChange(View view, boolean flag)
            {
                if (!flag) goto _L2; else goto _L1
_L1:
                view = SignupFragment.b(a);
                jp jp1 = new jp();
                ((RegistrationAnalytics) (view)).mBlizzardEventLogger.a(jp1);
_L4:
                return;
_L2:
                SignupFragment signupfragment;
                String as[];
                String as1[];
                String s2;
                SignupFragment.a(a, false);
                view = SignupFragment.c(a).getText().toString().trim().toLowerCase(Locale.US);
                signupfragment = a;
                as = view.split("@");
                if (as.length != 2)
                {
                    continue; /* Loop/switch isn't completed */
                }
                as1 = as[1].split("\\.");
                if (as1.length != 2)
                {
                    continue; /* Loop/switch isn't completed */
                }
                s2 = as1[0];
                if (!TextUtils.isEmpty(s2) && !SignupFragment.a.contains(s2))
                {
                    break; /* Loop/switch isn't completed */
                }
                view = null;
_L7:
                if (view != null)
                {
                    view = (new StringBuilder()).append(as[0]).append("@").append(view).append(".").append(as1[1]).toString();
                    SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
                    String s1 = signupfragment.getString(0x7f080101, new Object[] {
                        view
                    });
                    int k1 = s1.indexOf(view);
                    spannablestringbuilder.append(s1);
                    spannablestringbuilder.setSpan(new ForegroundColorSpan(0xff0000ff), k1, view.length() + k1, 0);
                    spannablestringbuilder.setSpan(new ForegroundColorSpan(0xff000000), 0, k1, 0);
                    spannablestringbuilder.setSpan(new ForegroundColorSpan(0xff000000), k1 + view.length(), s1.length(), 0);
                    signupfragment.h.setText(spannablestringbuilder);
                    signupfragment.h.setVisibility(0);
                    signupfragment.b(false);
                    signupfragment.h.setLinksClickable(true);
                    signupfragment.b = view;
                    return;
                }
                if (true) goto _L4; else goto _L3
_L3:
                eG eg1 = SignupFragment.a.a();
_L8:
                if (!eg1.hasNext()) goto _L6; else goto _L5
_L5:
                int l1;
                view = (String)eg1.next();
                l1 = StringUtils.getLevenshteinDistance(view, s2);
                if (l1 > 2 || l1 <= 0) goto _L8; else goto _L7
_L6:
                view = null;
                  goto _L7
            }

            
            {
                a = SignupFragment.this;
                super();
            }
        });
        viewgroup = AccountManager.get(n.getApplicationContext()).getAccounts();
        j1 = viewgroup.length;
_L3:
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_618;
        }
        layoutinflater = viewgroup[i1];
        if (!Patterns.EMAIL_ADDRESS.matcher(((Account) (layoutinflater)).name).matches()) goto _L2; else goto _L1
_L1:
        if (layoutinflater == null)
        {
            c.setHint(0x7f0802ab);
        } else
        {
            c.setText(((Account) (layoutinflater)).name);
        }
        c.addTextChangedListener(new TextWatcher() {

            private SignupFragment a;

            public final void afterTextChanged(Editable editable)
            {
                SignupFragment.d(a);
                SignupFragment.e(a);
                if (!SignupFragment.f(a))
                {
                    SignupFragment.a(a, true);
                }
                SignupFragment.h();
            }

            public final void beforeTextChanged(CharSequence charsequence, int k1, int l1, int i2)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int k1, int l1, int i2)
            {
            }

            
            {
                a = SignupFragment.this;
                super();
            }
        });
        t.setOnClickListener(new android.view.View.OnClickListener() {

            private SignupFragment a;

            public final void onClick(View view)
            {
                SignupFragment.c(a).setText("");
            }

            
            {
                a = SignupFragment.this;
                super();
            }
        });
        if (c.requestFocus())
        {
            Jo.g(n);
        }
        h.setOnClickListener(new android.view.View.OnClickListener() {

            private SignupFragment a;

            public final void onClick(View view)
            {
                if (!dA.c(SignupFragment.g(a)))
                {
                    SignupFragment.c(a).setText(SignupFragment.g(a));
                }
            }

            
            {
                a = SignupFragment.this;
                super();
            }
        });
        d.setTypeface(Typeface.DEFAULT);
        d.setTransformationMethod(new PasswordTransformationMethod());
        d.addTextChangedListener(new TextWatcher() {

            private SignupFragment a;

            public final void afterTextChanged(Editable editable)
            {
                SignupFragment.d(a);
                SignupFragment.h(a);
                if (!SignupFragment.i(a))
                {
                    SignupFragment.b(a, true);
                }
            }

            public final void beforeTextChanged(CharSequence charsequence, int k1, int l1, int i2)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int k1, int l1, int i2)
            {
            }

            
            {
                a = SignupFragment.this;
                super();
            }
        });
        d.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            private SignupFragment a;

            public final boolean onEditorAction(TextView textview, int k1, KeyEvent keyevent)
            {
                SignupFragment.j(a);
                return true;
            }

            
            {
                a = SignupFragment.this;
                super();
            }
        });
        d.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            private SignupFragment a;

            public final void onFocusChange(View view, boolean flag)
            {
                if (flag)
                {
                    view = SignupFragment.b(a);
                    jq jq1 = new jq();
                    ((RegistrationAnalytics) (view)).mBlizzardEventLogger.a(jq1);
                    return;
                } else
                {
                    SignupFragment.b(a, false);
                    return;
                }
            }

            
            {
                a = SignupFragment.this;
                super();
            }
        });
        v.setOnClickListener(new android.view.View.OnClickListener() {

            private SignupFragment a;

            public final void onClick(View view)
            {
                SignupFragment.k(a).setText("");
            }

            
            {
                a = SignupFragment.this;
                super();
            }
        });
        s.setOnTouchListener(new android.view.View.OnTouchListener() {

            private SignupFragment a;

            public final boolean onTouch(View view, MotionEvent motionevent)
            {
                view = SignupFragment.k(a).getOnFocusChangeListener();
                if (1 == motionevent.getAction() && view != null)
                {
                    SignupFragment.j(a);
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                a = SignupFragment.this;
                super();
            }
        });
        g.setOnClickListener(new android.view.View.OnClickListener() {

            final SignupFragment a;

            public final void onClick(View view)
            {
                GregorianCalendar gregoriancalendar = (GregorianCalendar)GregorianCalendar.getInstance();
                gregoriancalendar.add(1, -13);
                if (!SignupFragment.m(a).before(gregoriancalendar))
                {
                    (new android.app.AlertDialog.Builder(a.getActivity())).setMessage(a.getString(0x7f0802b7)).setCancelable(false).setPositiveButton(0x7f0801bc, new android.content.DialogInterface.OnClickListener(this, view) {

                        private View a;
                        private _cls4 b;

                        public final void onClick(DialogInterface dialoginterface, int i1)
                        {
                            Jo.a(SignupFragment.a(b.a), a);
                            b.a.getActivity().onBackPressed();
                        }

            
            {
                b = _pcls4;
                a = view;
                super();
            }
                    }).show();
                } else
                {
                    view = a;
                    Bt.af();
                    if (view.o_())
                    {
                        ((SignupFragment) (view)).f.setVisibility(0);
                        ((SignupFragment) (view)).g.setClickable(false);
                        ((SignupFragment) (view)).g.setText("");
                        String s1 = ((SignupFragment) (view)).c.getText().toString().trim().toLowerCase(Locale.US);
                        String s2 = ((SignupFragment) (view)).d.getText().toString().trim();
                        view.i = ((SignupFragment) (view)).i + 1;
                        ((SignupFragment) (view)).j.e();
                        (new mI(s1, s2, ((SignupFragment) (view)).e, view)).execute();
                        return;
                    }
                }
            }

            
            {
                a = SignupFragment.this;
                super();
            }
        });
        layoutinflater = g;
        n.getAssets();
        Iq.a(layoutinflater);
        f = d(0x7f0d0483);
        return mFragmentLayout;
_L2:
        i1++;
          goto _L3
        layoutinflater = null;
          goto _L1
    }

    public void onDetach()
    {
        super.onDetach();
        n = null;
    }

    public void onResume()
    {
        boolean flag2 = false;
        super.onResume();
        ad();
        if (Bt.w())
        {
            a(null, false, null, true);
        } else
        {
            boolean flag3 = SharedPreferenceKey.IS_LOGGED_IN.getBoolean();
            boolean flag;
            boolean flag1;
            if (Bt.x() || Bt.y())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = flag2;
            if (flag3)
            {
                flag1 = flag2;
                if (Bt.B())
                {
                    flag1 = flag2;
                    if (flag)
                    {
                        flag1 = true;
                    }
                }
            }
            if (flag1)
            {
                if (!Bt.e())
                {
                    NewUserPhoneVerificationFragment newuserphoneverificationfragment = new NewUserPhoneVerificationFragment(super.mWindowConfiguration);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("registrationRecovery", true);
                    newuserphoneverificationfragment.setArguments(bundle);
                    a(o, newuserphoneverificationfragment, com/snapchat/android/fragments/verification/NewUserPhoneVerificationFragment.getSimpleName());
                    return;
                } else
                {
                    CaptchaFragment captchafragment = new CaptchaFragment(super.mWindowConfiguration);
                    Bundle bundle1 = new Bundle();
                    bundle1.putBoolean("registrationRecovery", true);
                    captchafragment.setArguments(bundle1);
                    a(o, captchafragment, com/snapchat/android/fragments/captcha/CaptchaFragment.getSimpleName());
                    return;
                }
            }
        }
    }

}
