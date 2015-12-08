// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.cash;

import Bt;
import IC;
import Ll;
import Mf;
import Mv;
import Oi;
import PG;
import Pi;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.api2.cash.square.data.CardBrand;
import com.snapchat.android.api2.cash.square.data.ErrorType;
import com.snapchat.android.fragments.settings.LeftSwipeSettingFragment;
import com.snapchat.android.fragments.settings.WebFragment;
import com.snapchat.android.util.eventbus.ShowDialogEvent;
import com.squareup.otto.Bus;
import java.util.Iterator;
import java.util.List;
import nB;
import nP;
import nb;
import ni;
import np;
import nz;
import ok;
import oo;

// Referenced classes of package com.snapchat.android.fragments.cash:
//            SecurityCodeFragment

public class CashSettingsFragment extends LeftSwipeSettingFragment
{

    public nb a;
    protected AlertDialog b;
    private ImageView c;
    private TextView d;
    private RelativeLayout e;
    private ImageView f;
    private ProgressBar g;
    private RelativeLayout h;
    private CheckBox i;
    private TextView j;
    private TextView k;
    private ProgressBar l;
    private View m;

    public CashSettingsFragment()
    {
        SnapchatApplication.getDIComponent().a(this);
    }

    static ProgressBar a(CashSettingsFragment cashsettingsfragment)
    {
        return cashsettingsfragment.g;
    }

    protected static ok a(String s, oo.b b1)
    {
        return new oo(s, b1);
    }

    protected static ok a(oo.b b1)
    {
        return new oo(b1);
    }

    static void a(CompoundButton compoundbutton, View view, ProgressBar progressbar, boolean flag, String s)
    {
        PG.a(new Runnable(flag, compoundbutton, progressbar, view, s) {

            private boolean a;
            private CompoundButton b;
            private ProgressBar c;
            private View d;
            private String e;

            public final void run()
            {
                if (a != b.isChecked())
                {
                    b.setTag(Boolean.valueOf(true));
                }
                b.setChecked(a);
                b.setVisibility(0);
                c.setVisibility(8);
                d.setEnabled(true);
                if (e != null)
                {
                    Mf.a().a(new ShowDialogEvent(com.snapchat.android.util.eventbus.ShowDialogEvent.DialogType.TOAST, e));
                }
            }

            
            {
                a = flag;
                b = compoundbutton;
                c = progressbar;
                d = view;
                e = s;
                super();
            }
        });
    }

    static void a(CashSettingsFragment cashsettingsfragment, Integer integer)
    {
        cashsettingsfragment.a(integer);
    }

    private void a(Integer integer)
    {
        PG.a(new Runnable(integer) {

            private Integer a;
            private CashSettingsFragment b;

            public final void run()
            {
                CashSettingsFragment.a(b).setVisibility(8);
                if (Bt.aE())
                {
                    CashSettingsFragment.f(b);
                } else
                {
                    CashSettingsFragment.g(b);
                }
                CashSettingsFragment.h(b);
                if (a != null)
                {
                    Mf.a().a(new ShowDialogEvent(com.snapchat.android.util.eventbus.ShowDialogEvent.DialogType.TOAST, a.intValue()));
                }
            }

            
            {
                b = CashSettingsFragment.this;
                a = integer;
                super();
            }
        });
    }

    static ImageView b(CashSettingsFragment cashsettingsfragment)
    {
        return cashsettingsfragment.f;
    }

    static CheckBox c(CashSettingsFragment cashsettingsfragment)
    {
        return cashsettingsfragment.i;
    }

    static RelativeLayout d(CashSettingsFragment cashsettingsfragment)
    {
        return cashsettingsfragment.h;
    }

    static ProgressBar e(CashSettingsFragment cashsettingsfragment)
    {
        return cashsettingsfragment.l;
    }

    static void f(CashSettingsFragment cashsettingsfragment)
    {
        cashsettingsfragment.n();
    }

    static void g(CashSettingsFragment cashsettingsfragment)
    {
        cashsettingsfragment.o();
    }

    protected static np h()
    {
        return new nz();
    }

    static void h(CashSettingsFragment cashsettingsfragment)
    {
        cashsettingsfragment.p();
    }

    protected static nP l()
    {
        return new nP();
    }

    protected static SecurityCodeFragment m()
    {
        return new SecurityCodeFragment();
    }

    private void n()
    {
        String s = Bt.aG();
        if (s != null)
        {
            d.setText(s);
        }
        s = Bt.aF();
        if (s != null)
        {
            c.setImageResource(CardBrand.getDrawable(CardBrand.valueOf(s)));
        }
        c.setVisibility(0);
        f.setVisibility(0);
        e.setEnabled(false);
        h.setEnabled(true);
        i.setEnabled(true);
        i.setAlpha(1.0F);
        j.setTextColor(0xff000000);
        k.setTextColor(0xff000000);
    }

    private void o()
    {
        d.setText(0x7f08026c);
        c.setVisibility(8);
        f.setVisibility(8);
        e.setEnabled(true);
        h.setEnabled(false);
        i.setEnabled(false);
        i.setAlpha(0.4F);
        j.setTextColor(0xff888888);
        k.setTextColor(0xff888888);
    }

    private void p()
    {
        if (!Bt.aI())
        {
            m.setEnabled(false);
            m.setAlpha(0.4F);
            return;
        } else
        {
            m.setEnabled(true);
            m.setAlpha(1.0F);
            return;
        }
    }

    protected final oo.b a(SecurityCodeFragment securitycodefragment, boolean flag)
    {
        return new oo.b(flag, securitycodefragment) {

            final CashSettingsFragment a;
            private boolean b;
            private SecurityCodeFragment c;

            public final void a()
            {
                PG.a(new Runnable(this) {

                    private _cls11 a;

                    public final void run()
                    {
                        CashSettingsFragment.d(a.a).setEnabled(true);
                        CashSettingsFragment.c(a.a).setVisibility(0);
                        CashSettingsFragment.e(a.a).setVisibility(8);
                    }

            
            {
                a = _pcls11;
                super();
            }
                });
                Bt.n(b);
                if (c != null)
                {
                    c.l();
                }
            }

            public final void a(int i1)
            {
                ErrorType errortype;
                String s;
                boolean flag1;
                flag1 = false;
                s = (new StringBuilder()).append(IC.a(null, 0x7f08005d, new Object[0])).append('\n').append(IC.a(null, 0x7f0801ee, new Object[0])).toString();
                errortype = ErrorType.UNKNOWN;
                i1;
                JVM INSTR lookupswitch 2: default 76
            //                           400: 142
            //                           429: 191;
                   goto _L1 _L2 _L3
_L1:
                CheckBox checkbox = CashSettingsFragment.c(a);
                RelativeLayout relativelayout = CashSettingsFragment.d(a);
                ProgressBar progressbar = CashSettingsFragment.e(a);
                if (!b)
                {
                    flag1 = true;
                }
                CashSettingsFragment.a(checkbox, relativelayout, progressbar, flag1, s);
                if (c != null)
                {
                    c.a(errortype, i1);
                }
                return;
_L2:
                s = (new StringBuilder()).append(IC.a(null, 0x7f08015f, new Object[0])).append('\n').append(IC.a(null, 0x7f0801ee, new Object[0])).toString();
                errortype = ErrorType.INVALID_PASSCODE;
                continue; /* Loop/switch isn't completed */
_L3:
                s = (new StringBuilder()).append(IC.a(null, 0x7f0802d7, new Object[0])).append('\n').append(IC.a(null, 0x7f0801ef, new Object[0])).toString();
                errortype = ErrorType.TOO_MANY_ATTEMPTS;
                if (true) goto _L1; else goto _L4
_L4:
            }

            
            {
                a = CashSettingsFragment.this;
                b = flag;
                c = securitycodefragment;
                super();
            }
        };
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f040026, viewgroup, false);
        c = (ImageView)d(0x7f0d010e);
        d = (TextView)d(0x7f0d010f);
        e = (RelativeLayout)d(0x7f0d010d);
        f = (ImageView)d(0x7f0d0110);
        g = (ProgressBar)d(0x7f0d0111);
        h = (RelativeLayout)d(0x7f0d0112);
        i = (CheckBox)d(0x7f0d0113);
        j = (TextView)d(0x7f0d0114);
        k = (TextView)d(0x7f0d0115);
        l = (ProgressBar)d(0x7f0d0116);
        m = d(0x7f0d0118);
        d(0x7f0d0080).setOnClickListener(new android.view.View.OnClickListener() {

            private CashSettingsFragment a;

            public final void onClick(View view)
            {
                a.getActivity().onBackPressed();
            }

            
            {
                a = CashSettingsFragment.this;
                super();
            }
        });
        i.setChecked(Bt.aJ());
        e.setOnClickListener(new android.view.View.OnClickListener() {

            final CashSettingsFragment a;

            public final void onClick(View view)
            {
                view = new nB((byte)0);
                view.mListener = new np.a(this) {

                    private _cls4 a;

                    public final void a(np np1)
                    {
                    }

                    public final void a(np np1, List list, boolean flag)
                    {
                        if (list != null)
                        {
                            np1 = list.iterator();
                            do
                            {
                                if (!np1.hasNext())
                                {
                                    break;
                                }
                                list = (np)np1.next();
                                if (list.d())
                                {
                                    list.a(null);
                                }
                            } while (true);
                        }
                        CashSettingsFragment.a(a.a, null);
                    }

                    public final void b(np np1)
                    {
                    }

                    public final void b(np np1, List list, boolean flag)
                    {
                        CashSettingsFragment.a(a.a, Integer.valueOf(0x7f080151));
                    }

            
            {
                a = _pcls4;
                super();
            }
                };
                view.a(null);
            }

            
            {
                a = CashSettingsFragment.this;
                super();
            }
        });
        f.setOnClickListener(new android.view.View.OnClickListener() {

            final CashSettingsFragment a;

            public final void onClick(View view)
            {
                view = new android.app.AlertDialog.Builder(a.getActivity());
                view.setTitle(0x7f08030a);
                view.setMessage(0x7f080309);
                view.setCancelable(true);
                view.setPositiveButton(0x7f080323, new android.content.DialogInterface.OnClickListener(this) {

                    final _cls5 a;

                    public final void onClick(DialogInterface dialoginterface, int i1)
                    {
                        CashSettingsFragment.a(a.a).setVisibility(0);
                        CashSettingsFragment.b(a.a).setVisibility(8);
                        dialoginterface = CashSettingsFragment.l();
                        dialoginterface.mListener = new np.a(this) {

                            private _cls1 a;

                            public final void a(np np)
                            {
                            }

                            public final void a(np np, List list, boolean flag)
                            {
                                CashSettingsFragment.a(a.a.a, null);
                            }

                            public final void b(np np)
                            {
                                CashSettingsFragment.a(a.a.a, Integer.valueOf(0x7f080081));
                            }

                            public final void b(np np, List list, boolean flag)
                            {
                                CashSettingsFragment.a(a.a.a, Integer.valueOf(0x7f080081));
                            }

            
            {
                a = _pcls1;
                super();
            }
                        };
                        dialoginterface.a(null);
                    }

            
            {
                a = _pcls5;
                super();
            }
                });
                view.setNegativeButton(0x7f080196, null);
                a.b = view.create();
                a.b.show();
            }

            
            {
                a = CashSettingsFragment.this;
                super();
            }
        });
        h.setOnClickListener(new android.view.View.OnClickListener() {

            private CashSettingsFragment a;

            public final void onClick(View view)
            {
                view = CashSettingsFragment.c(a);
                boolean flag;
                if (!CashSettingsFragment.c(a).isChecked())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view.setChecked(flag);
            }

            
            {
                a = CashSettingsFragment.this;
                super();
            }
        });
        i.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final CashSettingsFragment a;

            public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                if (compoundbutton.getTag() != null)
                {
                    compoundbutton.setTag(null);
                    return;
                } else
                {
                    CashSettingsFragment.d(a).setEnabled(false);
                    CashSettingsFragment.c(a).setVisibility(8);
                    CashSettingsFragment.e(a).setVisibility(0);
                    compoundbutton = CashSettingsFragment.h();
                    compoundbutton.mListener = new np.a(this, flag) {

                        private boolean a;
                        private _cls7 b;

                        public final void a(np np)
                        {
                        }

                        public final void a(np np, List list, boolean flag)
                        {
                            flag = true;
                            if (list == null || list.isEmpty())
                            {
                                if (!a)
                                {
                                    np = CashSettingsFragment.m();
                                    list = b.a;
                                    CashSettingsFragment.c(b.a);
                                    np.a = list. new SecurityCodeFragment.a(np) {

                                        private SecurityCodeFragment a;
                                        private CashSettingsFragment b;

                                        public final void a()
                                        {
                                            CashSettingsFragment.a(CashSettingsFragment.c(b), CashSettingsFragment.d(b), CashSettingsFragment.e(b), true, null);
                                        }

                                        public final void a(String s)
                                        {
                                            CashSettingsFragment.a(s, b.a(a, false)).execute();
                                        }

                                        public final void b()
                                        {
                                            CashSettingsFragment.a(CashSettingsFragment.c(b), CashSettingsFragment.d(b), CashSettingsFragment.e(b), true, null);
                                        }

            
            {
                b = CashSettingsFragment.this;
                a = securitycodefragment;
                super();
            }
                                    };
                                    Mf.a().a(new Oi(np));
                                    return;
                                } else
                                {
                                    np = b.a;
                                    CashSettingsFragment.c(b.a);
                                    CashSettingsFragment.a(np.a(null, true)).execute();
                                    return;
                                }
                            }
                            np = (new StringBuilder()).append(IC.a(null, 0x7f08005d, new Object[0])).append('\n').append(IC.a(null, 0x7f0801ee, new Object[0])).toString();
                            list = CashSettingsFragment.c(b.a);
                            RelativeLayout relativelayout = CashSettingsFragment.d(b.a);
                            ProgressBar progressbar = CashSettingsFragment.e(b.a);
                            if (a)
                            {
                                flag = false;
                            }
                            CashSettingsFragment.a(list, relativelayout, progressbar, flag, np);
                        }

                        public final void b(np np)
                        {
                        }

                        public final void b(np np, List list, boolean flag)
                        {
                            flag = false;
                            np = (new StringBuilder()).append(IC.a(null, 0x7f08005d, new Object[0])).append('\n').append(IC.a(null, 0x7f0801ee, new Object[0])).toString();
                            list = CashSettingsFragment.c(b.a);
                            RelativeLayout relativelayout = CashSettingsFragment.d(b.a);
                            ProgressBar progressbar = CashSettingsFragment.e(b.a);
                            if (!a)
                            {
                                flag = true;
                            }
                            CashSettingsFragment.a(list, relativelayout, progressbar, flag, np);
                        }

            
            {
                b = _pcls7;
                a = flag;
                super();
            }
                    };
                    compoundbutton.a(null);
                    return;
                }
            }

            
            {
                a = CashSettingsFragment.this;
                super();
            }
        });
        m.setOnClickListener(new android.view.View.OnClickListener() {

            private CashSettingsFragment a;

            public final void onClick(View view)
            {
                if (a.a.b("SQUARE"))
                {
                    view = a.a.a("SQUARE");
                    a.getActivity();
                    view.a(a.getString(0x7f080273));
                    return;
                } else
                {
                    nb.a();
                    return;
                }
            }

            
            {
                a = CashSettingsFragment.this;
                super();
            }
        });
        d(0x7f0d0119).setOnClickListener(new android.view.View.OnClickListener() {

            private CashSettingsFragment a;

            public final void onClick(View view)
            {
                view = Mf.a();
                Pi.a();
                view.a(new Oi(new WebFragment(Pi.e(), a.getString(0x7f080272), true, "/ca/snapcash")));
            }

            
            {
                a = CashSettingsFragment.this;
                super();
            }
        });
        if (Bt.aE() && a.b(Bt.aC()))
        {
            n();
        } else
        {
            o();
        }
        p();
        return mFragmentLayout;
    }

    public void updateCardDetailsViewOnDetailsProvided(Mv mv)
    {
        a(((Integer) (null)));
    }
}
