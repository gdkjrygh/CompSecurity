// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.service.flow.login.GenderSelectionHelper;
import com.spotify.mobile.android.service.flow.login.ReorderableLinearLayout;
import com.spotify.mobile.android.service.flow.login.WebSignupHelper;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientInfo;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class dyc extends dxx
{

    private static final gip Y = gip.a("signup-v1-username-error");
    private static final gip Z = gip.a("signup-v1-birthdate-error");
    private static final gip a = gip.a("signup-v1-status");
    private static final gip aa = gip.a("signup-v1-other-error");
    private static final gip b = gip.a("signup-v1-email-error");
    private final dyn aA = new dyn() {

        final dyc a;

        private static String a(Map map, String s1)
        {
            s1 = new StringBuilder(s1);
            map = map.values().iterator();
            do
            {
                if (!map.hasNext())
                {
                    break;
                }
                String s2 = (String)map.next();
                if (!TextUtils.isEmpty(s2))
                {
                    s1.append("\n - ").append(s2);
                }
            } while (true);
            return s1.toString();
        }

        public final void a(int i1, Map map)
        {
            if (dyc.g(a) && dyc.j(a) != null && dyc.k(a) != null) goto _L2; else goto _L1
_L1:
            return;
_L2:
            dfj dfj1;
            dyc.j(a).setEnabled(true);
            dyc.k(a).setVisibility(8);
            dyc.d(0);
            dfj1 = new dfj(a.k(), dyc.l(a));
            dfj1.a(0x7f080179);
            i1;
            JVM INSTR lookupswitch 7: default 156
        //                       -1: 528
        //                       5: 572
        //                       10: 190
        //                       20: 221
        //                       100: 255
        //                       120: 616
        //                       130: 238;
               goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L9:
            break MISSING_BLOCK_LABEL_616;
_L3:
            dfj1.b(0x7f080174);
            dfj1.a(0x7f080171, dyc.o(a));
_L11:
            dyc.d(i1);
            dfj1.b().show();
            return;
_L6:
            dfj1.a(false);
            dfj1.b(0x7f080175);
            dfj1.a(0x7f080171, new android.content.DialogInterface.OnClickListener(this) {

                private _cls17 a;

                public final void onClick(DialogInterface dialoginterface, int i1)
                {
                    dyc.i(a.a).a(dyc.m(a.a));
                }

            
            {
                a = _pcls17;
                super();
            }
            });
              goto _L11
_L7:
            dyc.a(a, dyc.e(a), 0x7f080173);
            return;
_L10:
            dyc.a(a, dyc.e(a), 0x7f08028d);
            return;
_L8:
            Object obj;
            obj = new HashMap();
            ((Map) (obj)).putAll(map);
            dyc.a(a, dyc.e(a), (CharSequence)((Map) (obj)).remove("email"));
            dyc.a(a, dyc.n(a), (CharSequence)((Map) (obj)).remove("username"));
            dyc.a(a, dyc.c(a), (CharSequence)((Map) (obj)).remove("birth_year"));
            dyc.a(a, dyc.c(a), (CharSequence)((Map) (obj)).remove("birth_month"));
            dyc.a(a, dyc.c(a), (CharSequence)((Map) (obj)).remove("birth_day"));
            dyc.a(a, dyc.c(a), (CharSequence)((Map) (obj)).remove("birthdate"));
            if (((Map) (obj)).isEmpty()) goto _L1; else goto _L12
_L12:
            map = a.b(0x7f080502);
            obj = new StringBuilder(a(((Map) (obj)), ((String) (map))));
            if (((StringBuilder) (obj)).toString().equals(map))
            {
                ((StringBuilder) (obj)).append("\n - ").append(a.b(0x7f0802b4));
            }
            dfj1.a(false);
            dfj1.b(((StringBuilder) (obj)).toString());
            dfj1.a(0x7f080171, dyc.o(a));
              goto _L11
_L4:
            dfj1.a(false);
            dfj1.b(0x7f080172);
            dfj1.a(0x7f080177, dyc.p(a));
            dfj1.b(0x7f080178, dyc.q(a));
              goto _L11
_L5:
            dfj1.a(false);
            dfj1.b(0x7f08017a);
            dfj1.a(0x7f080177, dyc.p(a));
            dfj1.b(0x7f080176, dyc.o(a));
              goto _L11
            dfj1.a(false);
            dfj1.b(a(map, ""));
            dfj1.a(0x7f080171, dyc.q(a));
              goto _L11
        }

        public final void a(String s1, dva dva)
        {
            if (!dyc.g(a))
            {
                return;
            } else
            {
                dyc.i(a).a(s1, dyc.h(a), dva);
                return;
            }
        }

            
            {
                a = dyc.this;
                super();
            }
    };
    private final dyp aB = new dye(this, false);
    private final dxu aC = new dxu() {

        private dyc a;

        public final void a()
        {
            dyc.r(a).setText("");
            dyc.a(a, dyc.r(a), 0x7f080180);
        }

        public final void a(int i1)
        {
            dyc.a(dyc.r(a));
            dyc.r(a).setText(i1);
        }

            
            {
                a = dyc.this;
                super();
            }
    };
    private final android.content.DialogInterface.OnClickListener aD = new android.content.DialogInterface.OnClickListener() {

        public final void onClick(DialogInterface dialoginterface, int i1)
        {
            dialoginterface.dismiss();
        }

    };
    private final android.content.DialogInterface.OnClickListener aE = new android.content.DialogInterface.OnClickListener() {

        private dyc a;

        public final void onClick(DialogInterface dialoginterface, int i1)
        {
            if (dyc.j(a) != null)
            {
                dyc.j(a).performClick();
                return;
            } else
            {
                Assertion.b("Attempted to interact with null-button");
                return;
            }
        }

            
            {
                a = dyc.this;
                super();
            }
    };
    private final android.content.DialogInterface.OnClickListener aF = new android.content.DialogInterface.OnClickListener() {

        private dyc a;

        public final void onClick(DialogInterface dialoginterface, int i1)
        {
            dialoginterface = a.k();
            if (dialoginterface != null)
            {
                dialoginterface.a_().c();
                return;
            } else
            {
                Assertion.b("Attempted to pop back stack while detached");
                return;
            }
        }

            
            {
                a = dyc.this;
                super();
            }
    };
    private final android.content.DialogInterface.OnClickListener aG = new android.content.DialogInterface.OnClickListener() {

        private dyc a;

        public final void onClick(DialogInterface dialoginterface, int i1)
        {
            dialoginterface = a.k();
            if (dialoginterface != null)
            {
                dialoginterface.finish();
                return;
            } else
            {
                Assertion.b("Attempted to finish activity while detached");
                return;
            }
        }

            
            {
                a = dyc.this;
                super();
            }
    };
    private View aH;
    private final Map ab = new IdentityHashMap(2);
    private ggl ac;
    private Button ad;
    private EditText ae;
    private EditText af;
    private AutoCompleteTextView ag;
    private EditText ah;
    private ProgressBar ai;
    private GenderSelectionHelper aj;
    private TextView ak;
    private TextView al;
    private dfi am;
    private dyl an;
    private boolean ao;
    private boolean ap;
    private Calendar aq;
    private dyo ar;
    private dyx as;
    private dyj at;
    private int au;
    private ReorderableLinearLayout av;
    private final TextWatcher aw = new gbp() {

        private dyc a;

        public final void afterTextChanged(Editable editable)
        {
            dyl dyl1 = dyc.a(a);
            if (!dyl.b(editable.toString().trim()))
            {
                dyl1.a.a();
                return;
            } else
            {
                dyl1.a.b();
                return;
            }
        }

            
            {
                a = dyc.this;
                super();
            }
    };
    private final TextWatcher ax = new gbp() {

        private dyc a;

        public final void afterTextChanged(Editable editable)
        {
            dyl dyl1 = dyc.a(a);
            if (dyl.a(editable.toString()))
            {
                dyl1.a.c();
                return;
            } else
            {
                dyl1.a.d();
                return;
            }
        }

            
            {
                a = dyc.this;
                super();
            }
    };
    private final android.app.DatePickerDialog.OnDateSetListener ay = new android.app.DatePickerDialog.OnDateSetListener() {

        private dyc a;

        public final void onDateSet(DatePicker datepicker, int i1, int j1, int k1)
        {
            dyc.b(a);
            if (dyc.c(a) != null)
            {
                if ((datepicker = a.k()) != null)
                {
                    dyc.a(a, new GregorianCalendar(i1, j1, k1));
                    datepicker = DateFormat.getDateFormat(datepicker);
                    dyc.a(a).a((Calendar)dyc.d(a).clone());
                    dyc.c(a).setText(datepicker.format(dyc.d(a).getTime()));
                    return;
                }
            }
        }

            
            {
                a = dyc.this;
                super();
            }
    };
    private final dym az = new dym() {

        private dyc a;

        public final void a()
        {
            dyc.a(a, dyc.e(a), 0x7f08028d);
        }

        public final void b()
        {
            dyc.a(dyc.e(a));
        }

        public final void c()
        {
            dyc.a(a, dyc.f(a), 0x7f080293);
        }

        public final void d()
        {
            dyc.a(dyc.f(a));
        }

        public final void e()
        {
            dyc.a(dyc.f(a));
        }

        public final void f()
        {
            dyc.a(dyc.c(a));
        }

        public final void g()
        {
            dyc.a(a, dyc.c(a), 0x7f08017b);
        }

        public final void h()
        {
            dyc.a(a, dyc.c(a), 0x7f080181);
        }

            
            {
                a = dyc.this;
                super();
            }
    };

    public dyc()
    {
    }

    static dyp A(dyc dyc1)
    {
        return dyc1.aB;
    }

    static void B(dyc dyc1)
    {
        dyc1.ae.setInputType(dyc1.ae.getInputType() & 0xffffff6f | 0x80);
        dgo.a(dyc1.ae.getContext(), dyc1.ae, 0x7f0b0145);
    }

    static void C(dyc dyc1)
    {
        dyc1.ae.setInputType(dyc1.ae.getInputType() & 0xffffff7f | 0x90);
        dgo.a(dyc1.ae.getContext(), dyc1.ae, 0x7f0b0145);
    }

    static void D(dyc dyc1)
    {
        if (!dyc1.ap)
        {
            dyc1.ap = true;
            Object obj = dyc1.P();
            if (obj == null)
            {
                obj = Calendar.getInstance();
            }
            obj = new DatePickerDialog(dyc1.k(), dyc1.ay, ((Calendar) (obj)).get(1), ((Calendar) (obj)).get(2), ((Calendar) (obj)).get(5));
            ((DatePickerDialog) (obj)).setOnCancelListener(dyc1. new android.content.DialogInterface.OnCancelListener() {

                private dyc a;

                public final void onCancel(DialogInterface dialoginterface)
                {
                    dyc.b(a);
                }

            
            {
                a = dyc.this;
                super();
            }
            });
            ((DatePickerDialog) (obj)).setOnDismissListener(dyc1. new android.content.DialogInterface.OnDismissListener() {

                private dyc a;

                public final void onDismiss(DialogInterface dialoginterface)
                {
                    dyc.b(a);
                }

            
            {
                a = dyc.this;
                super();
            }
            });
            ((DatePickerDialog) (obj)).show();
        }
    }

    static void E(dyc dyc1)
    {
        dyc1.Q();
    }

    static gip F()
    {
        return a;
    }

    static gip I()
    {
        return aa;
    }

    static gip K()
    {
        return Z;
    }

    static gip L()
    {
        return Y;
    }

    static gip M()
    {
        return b;
    }

    private String N()
    {
        return gfy.a(ag).trim();
    }

    private String O()
    {
        return gfy.a(af).trim();
    }

    private Calendar P()
    {
        if (aq != null)
        {
            return (Calendar)aq.clone();
        } else
        {
            return null;
        }
    }

    private void Q()
    {
        String s1 = "";
        if (as.c)
        {
            s1 = as.b().e().toUpperCase(Locale.US);
        }
        if ("CA".equals(s1))
        {
            at.a(al, 0x7f08016f, 0x7f080170);
            ReorderableLinearLayout reorderablelinearlayout = av;
            Button button = ad;
            TextView textview = al;
            reorderablelinearlayout.a = button;
            reorderablelinearlayout.b = textview;
            reorderablelinearlayout.requestLayout();
            return;
        } else
        {
            at.a(al, 0x7f08016f, 0);
            return;
        }
    }

    public static dyc a()
    {
        return new dyc();
    }

    static dyl a(dyc dyc1)
    {
        return dyc1.an;
    }

    static dyo a(dyc dyc1, dyo dyo1)
    {
        dyc1.ar = dyo1;
        return dyo1;
    }

    static dyo a(dyc dyc1, dyp dyp)
    {
        return dyc1.a(dyp);
    }

    private dyo a(dyp dyp)
    {
        dme dme1 = ((dmj)dmz.a(dmj)).a(b(0x7f0805f1));
        return new dyo(O(), N(), P(), dyp, dme1);
    }

    static Calendar a(dyc dyc1, Calendar calendar)
    {
        dyc1.aq = calendar;
        return calendar;
    }

    static void a(TextView textview)
    {
        if (textview != null)
        {
            textview.setError(null);
        }
    }

    private void a(TextView textview, CharSequence charsequence)
    {
        if (textview == null || !o())
        {
            return;
        } else
        {
            textview.setError(charsequence);
            return;
        }
    }

    private void a(ImmutableList immutablelist)
    {
        immutablelist = new ArrayAdapter(k(), 0x1090003, immutablelist);
        ag.setAdapter(immutablelist);
    }

    static void a(dyc dyc1, TextView textview, int i1)
    {
        if (dyc1.o())
        {
            dyc1.a(textview, ((CharSequence) (dyc1.b(i1))));
        }
    }

    static void a(dyc dyc1, TextView textview, CharSequence charsequence)
    {
        dyc1.a(textview, charsequence);
    }

    static void a(dyc dyc1, ImmutableList immutablelist)
    {
        dyc1.a(immutablelist);
    }

    static void a(dyc dyc1, dyw dyw1, dyk dyk)
    {
        ctz.a(dyw1);
        ctz.a(dyk);
        if (!dyc1.p())
        {
            dyc1.at.a(dyw1, dyk);
        }
    }

    static void a(dyc dyc1, CharSequence charsequence)
    {
        dyc1.a(charsequence);
    }

    static void a(dyc dyc1, ArrayList arraylist)
    {
        if (!arraylist.isEmpty() && TextUtils.isEmpty(dyc1.N()) && !TextUtils.isEmpty((CharSequence)arraylist.get(0)))
        {
            dyc1.ag.setText((CharSequence)arraylist.get(0));
            b(dyc1.ar);
            dyc1.ar = dyc1.a(dyc1.aB);
        }
    }

    static void a(dyc dyc1, boolean flag)
    {
        if (flag)
        {
            dyc1.ad.setEnabled(false);
            dyc1.e(0x7f08028e);
            dyc1.ai.setVisibility(0);
            return;
        } else
        {
            dyc1.ad.setEnabled(true);
            dyc1.e(0x7f080291);
            dyc1.ai.setVisibility(8);
            return;
        }
    }

    static void a(dyo dyo1)
    {
        b(dyo1);
    }

    private void a(CharSequence charsequence)
    {
        if (ad == null)
        {
            return;
        } else
        {
            ad.setText(charsequence);
            return;
        }
    }

    public static void b(Activity activity)
    {
        Intent intent = activity.getIntent();
        int i1 = intent.getIntExtra("signup-v1-status", 0x80000000);
        if (i1 != 0x80000000)
        {
            activity = ((giq)dmz.a(giq)).a(activity).b();
            activity.a(a, i1);
            activity.a(b, intent.getStringExtra("signup-v1-email-error"));
            activity.a(Y, intent.getStringExtra("signup-v1-username-error"));
            activity.a(Z, intent.getStringExtra("signup-v1-birthdate-error"));
            activity.a(aa, intent.getStringExtra("signup-v1-other-error"));
            activity.a();
        }
    }

    private static void b(dyo dyo1)
    {
        if (dyo1 != null)
        {
            dyo1.a.a();
        }
    }

    static boolean b(dyc dyc1)
    {
        dyc1.ap = false;
        return false;
    }

    static EditText c(dyc dyc1)
    {
        return dyc1.ah;
    }

    static int d(int i1)
    {
        return i1;
    }

    static Calendar d(dyc dyc1)
    {
        return dyc1.aq;
    }

    static EditText e(dyc dyc1)
    {
        return dyc1.af;
    }

    private void e(int i1)
    {
        if (ad == null)
        {
            return;
        } else
        {
            a(ad.getContext().getString(i1));
            return;
        }
    }

    static EditText f(dyc dyc1)
    {
        return dyc1.ae;
    }

    static boolean g(dyc dyc1)
    {
        return dyc1.ao;
    }

    static String h(dyc dyc1)
    {
        return gfy.a(dyc1.ae);
    }

    static dyd i(dyc dyc1)
    {
        return (dyd)dyc1.H().a(dyc1);
    }

    static Button j(dyc dyc1)
    {
        return dyc1.ad;
    }

    static ProgressBar k(dyc dyc1)
    {
        return dyc1.ai;
    }

    static int l(dyc dyc1)
    {
        return dyc1.au;
    }

    static String m(dyc dyc1)
    {
        return dyc1.N();
    }

    static AutoCompleteTextView n(dyc dyc1)
    {
        return dyc1.ag;
    }

    static android.content.DialogInterface.OnClickListener o(dyc dyc1)
    {
        return dyc1.aF;
    }

    static android.content.DialogInterface.OnClickListener p(dyc dyc1)
    {
        return dyc1.aE;
    }

    static android.content.DialogInterface.OnClickListener q(dyc dyc1)
    {
        return dyc1.aG;
    }

    static TextView r(dyc dyc1)
    {
        return dyc1.ak;
    }

    static dyn s(dyc dyc1)
    {
        return dyc1.aA;
    }

    static void t(dyc dyc1)
    {
        WebSignupHelper websignuphelper = new WebSignupHelper(((dmj)dmz.a(dmj)).a(dyc1.b(0x7f0805f1)), dyc1.aA);
        Object obj = dyc1.O();
        websignuphelper.b.put("email", obj);
        obj = gfy.a(dyc1.ae);
        websignuphelper.b.put("password", obj);
        websignuphelper.b.put("password_repeat", obj);
        obj = dyc1.N();
        websignuphelper.b.put("username", obj);
        websignuphelper.b.put("postal_code", "1");
        obj = dyc1.aj.a;
        websignuphelper.b.put("gender", ((com.spotify.mobile.android.service.flow.login.GenderSelectionHelper.Gender) (obj)).mValue);
        dyc1 = (Calendar)ctz.a(dyc1.P());
        int i1 = dyc1.get(5);
        int j1 = dyc1.get(2);
        int k1 = dyc1.get(1);
        websignuphelper.b.put("birth_day", String.valueOf(i1));
        websignuphelper.b.put("birth_month", String.valueOf(j1 + 1));
        websignuphelper.b.put("birth_year", String.valueOf(k1));
        websignuphelper.b.put("iagree", "1");
        dmz.a(com/spotify/mobile/android/util/ClientInfo);
        dyc1 = com.spotify.mobile.android.service.flow.login.WebSignupHelper.UserCreationFlow.a;
        websignuphelper.b.put("creation_flow", dyc1.toString());
        dyc1 = com.spotify.mobile.android.service.flow.login.WebSignupHelper.UserCreationPoint.a;
        websignuphelper.b.put("creation_point", dyc1.toString());
        websignuphelper.a.b("", websignuphelper.b, new com.spotify.mobile.android.service.flow.login.WebSignupHelper._cls1(websignuphelper));
    }

    static void u(dyc dyc1)
    {
        dfj dfj1 = new dfj(dyc1.k(), dyc1.au);
        dfj1.a(dyc1.k().getString(0x7f08028f));
        dfj1.a(0x7f080177, dyc1.aE);
        dfj1.b(0x7f0804ef, dyc1.aD);
        dyc1.am = dfj1.b();
        dyc1.am.show();
    }

    static GenderSelectionHelper v(dyc dyc1)
    {
        return dyc1.aj;
    }

    static String w(dyc dyc1)
    {
        return dyc1.O();
    }

    static Calendar x(dyc dyc1)
    {
        return dyc1.P();
    }

    static dyo y(dyc dyc1)
    {
        return dyc1.ar;
    }

    static dyx z(dyc dyc1)
    {
        return dyc1.as;
    }

    public final void A()
    {
        super.A();
        java.util.Map.Entry entry;
        for (Iterator iterator = ab.entrySet().iterator(); iterator.hasNext(); ((EditText)entry.getKey()).removeTextChangedListener((TextWatcher)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        ac.b();
        ao = false;
        ((InputMethodManager)k().getSystemService("input_method")).hideSoftInputFromWindow(ae.getWindowToken(), 0);
        b(ar);
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = (View)ctz.a(layoutinflater.inflate(0x7f030096, viewgroup, false));
        av = (ReorderableLinearLayout)ctz.a(layoutinflater.findViewById(0x7f1103ad));
        af = (EditText)ctz.a(layoutinflater.findViewById(0x7f1103ae));
        ae = (EditText)ctz.a(layoutinflater.findViewById(0x7f110371));
        ag = (AutoCompleteTextView)ctz.a(layoutinflater.findViewById(0x7f110370));
        ah = (EditText)ctz.a(layoutinflater.findViewById(0x7f1103af));
        ak = (TextView)ctz.a(layoutinflater.findViewById(0x7f1103b0));
        aj = new GenderSelectionHelper(k(), viewgroup);
        ai = (ProgressBar)ctz.a(layoutinflater.findViewById(0x7f1103b2));
        ad = (Button)ctz.a(layoutinflater.findViewById(0x7f1103b1));
        aH = (View)ctz.a(layoutinflater.findViewById(0x7f11036e));
        al = (TextView)layoutinflater.findViewById(0x7f1103b3);
        ah.setInputType(0);
        Q();
        ab.put(af, aw);
        ab.put(ae, ax);
        return layoutinflater;
    }

    public final void a(Activity activity)
    {
        super.a(activity);
        ctz.a(activity);
        String s1 = activity.getString(0x7f0805f1);
        ctz.a(s1);
        as = new dyx(((dmj)dmz.a(dmj)).a(s1));
        at = new dyj(activity);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        ac = ggn.b(k(), ViewUri.ax);
        an = new dyl(az);
        au = 0x7f0b017f;
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        ctz.a(ad);
        if (bundle != null)
        {
            ag.setText(bundle.getString("user_name"));
            ah.setText(bundle.getString("birth_date_string"));
            aq = (Calendar)bundle.getSerializable("birth_date");
            aj.a(bundle.getInt("gender"));
            af.setText(bundle.getString("email"));
            ae.setText(bundle.getString("password"));
            a(ImmutableList.a(bundle.getStringArrayList("suggestions")));
        }
        aj.b = aC;
        ak.setOnClickListener(new android.view.View.OnClickListener() {

            private dyc a;

            public final void onClick(View view1)
            {
                dyc.v(a).c.show();
            }

            
            {
                a = dyc.this;
                super();
            }
        });
        ad.setOnClickListener(new android.view.View.OnClickListener() {

            private dyc a;

            public final void onClick(View view1)
            {
                boolean flag = false;
                dyc.a(a);
                if (!dyl.b(dyc.w(a)))
                {
                    dyc.a(a, dyc.e(a), 0x7f08028d);
                    flag = true;
                }
                dyc.a(a);
                if (dyl.a(dyc.h(a)))
                {
                    dyc.a(a, dyc.f(a), 0x7f080293);
                    flag = true;
                }
                if (TextUtils.isEmpty(dyc.m(a)))
                {
                    dyc.a(a, dyc.n(a), 0x7f08017c);
                    flag = true;
                }
                if (dyc.x(a) == null)
                {
                    dyc.a(a, dyc.c(a), 0x7f080503);
                    flag = true;
                } else
                {
                    dyc.a(a).a(dyc.x(a));
                }
                if (dyc.v(a).a == null)
                {
                    dyc.a(a, dyc.r(a), 0x7f080180);
                    flag = true;
                }
                if (flag)
                {
                    return;
                } else
                {
                    dyc.a(a, true);
                    dyc.a(dyc.y(a));
                    dyc.a(a, dyc.a(a, new dye(a, true)));
                    return;
                }
            }

            
            {
                a = dyc.this;
                super();
            }
        });
        aH.setOnClickListener(new android.view.View.OnClickListener() {

            final dyc a;

            private void a()
            {
                dyk dyk = new dyk(this) {

                    private _cls5 a;

                    public final void a()
                    {
                        dyc.i(a.a).a();
                    }

                    public final void b()
                    {
                        dyc.a(a.a, false);
                    }

                    public final void c()
                    {
                        dyc.a(a.a, false);
                    }

            
            {
                a = _pcls5;
                super();
            }
                };
                dyc.a(a, dyc.z(a).b(), dyk);
            }

            static void a(_cls5 _pcls5)
            {
                _pcls5.a();
            }

            public final void onClick(View view1)
            {
                if (dyc.z(a).c)
                {
                    a();
                    return;
                } else
                {
                    view1 = new dyy(this) {

                        private _cls5 a;

                        public final void a()
                        {
                            _cls5.a(a);
                        }

                        public final void b()
                        {
                            dyc.a(a.a, false);
                            dyc.s(a.a).a(-1, null);
                        }

            
            {
                a = _pcls5;
                super();
            }
                    };
                    dyc.a(a, true);
                    dyc.z(a).a = view1;
                    dyc.z(a).a();
                    return;
                }
            }

            
            {
                a = dyc.this;
                super();
            }
        });
        af.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            private dyc a;

            public final void onFocusChange(View view1, boolean flag)
            {
                if (!flag)
                {
                    dyc.a(dyc.y(a));
                    dyc.a(a, dyc.a(a, dyc.A(a)));
                }
            }

            
            {
                a = dyc.this;
                super();
            }
        });
        ae.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            private dyc a;

            public final void onFocusChange(View view1, boolean flag)
            {
                if (!flag)
                {
                    dyc.B(a);
                    view1 = dyc.a(a);
                    String s1 = dyc.h(a);
                    boolean flag1;
                    if (!TextUtils.isEmpty(s1))
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    if (!flag1)
                    {
                        ((dyl) (view1)).a.e();
                    } else
                    if (dyl.a(s1))
                    {
                        ((dyl) (view1)).a.c();
                    } else
                    {
                        ((dyl) (view1)).a.d();
                    }
                    dyc.a(dyc.y(a));
                    dyc.a(a, dyc.a(a, dyc.A(a)));
                    return;
                } else
                {
                    dyc.C(a);
                    return;
                }
            }

            
            {
                a = dyc.this;
                super();
            }
        });
        ag.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            final dyc a;

            public final void onFocusChange(View view1, boolean flag)
            {
                if (!flag)
                {
                    dyc.a(dyc.y(a));
                    dyc.a(a, dyc.a(a, dyc.A(a)));
                    dyc.n(a).dismissDropDown();
                } else
                {
                    view1 = dyc.n(a).getAdapter();
                    if (view1 != null && view1.getCount() > 0)
                    {
                        dyc.n(a).post(new Runnable(this) {

                            private _cls8 a;

                            public final void run()
                            {
                                dyc.n(a.a).showDropDown();
                            }

            
            {
                a = _pcls8;
                super();
            }
                        });
                        return;
                    }
                }
            }

            
            {
                a = dyc.this;
                super();
            }
        });
        ah.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            private dyc a;

            public final void onFocusChange(View view1, boolean flag)
            {
                if (flag)
                {
                    dyc.D(a);
                    return;
                } else
                {
                    dyc.a(dyc.y(a));
                    dyc.a(a, dyc.a(a, dyc.A(a)));
                    return;
                }
            }

            
            {
                a = dyc.this;
                super();
            }
        });
        ah.setOnClickListener(new android.view.View.OnClickListener() {

            private dyc a;

            public final void onClick(View view1)
            {
                ((InputMethodManager)a.k().getSystemService("input_method")).hideSoftInputFromWindow(dyc.c(a).getWindowToken(), 0);
                dyc.D(a);
            }

            
            {
                a = dyc.this;
                super();
            }
        });
        if (((giq)dmz.a(giq)).a(k()).a(a, -1) != -1)
        {
            a("Test it!");
        }
    }

    public final void d()
    {
        if (am != null && am.isShowing())
        {
            am.dismiss();
        }
        super.d();
    }

    public final void e(Bundle bundle)
    {
        int i1 = -1;
        bundle.putString("user_name", N());
        bundle.putString("birth_date_string", gfy.a(ah));
        bundle.putSerializable("birth_date", P());
        ArrayList arraylist;
        if (aj != null)
        {
            GenderSelectionHelper genderselectionhelper = aj;
            if (genderselectionhelper.a != null)
            {
                i1 = genderselectionhelper.a.ordinal();
            }
            bundle.putInt("gender", i1);
        } else
        {
            bundle.putInt("gender", -1);
        }
        bundle.putString("email", O());
        bundle.putString("password", gfy.a(ae));
        arraylist = new ArrayList();
        if (ag != null && ag.getAdapter() != null)
        {
            int j1 = 0;
            while (j1 < ag.getAdapter().getCount()) 
            {
                arraylist.add((String)ag.getAdapter().getItem(j1));
                j1++;
            }
        }
        bundle.putStringArrayList("suggestions", arraylist);
        super.e(bundle);
    }

    public final void z()
    {
        super.z();
        java.util.Map.Entry entry;
        for (Iterator iterator = ab.entrySet().iterator(); iterator.hasNext(); ((EditText)entry.getKey()).addTextChangedListener((TextWatcher)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        ac.a();
        ao = true;
        as.a = new dyy() {

            private dyc a;

            public final void a()
            {
                dyc.E(a);
            }

            public final void b()
            {
            }

            
            {
                a = dyc.this;
                super();
            }
        };
        as.a();
    }

}
