// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.cash;

import Bt;
import Gx;
import IC;
import Ij;
import Iq;
import Jo;
import PG;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.api2.cash.blockers.CardInputError;
import com.snapchat.android.ui.cash.CardCvvEditText;
import com.snapchat.android.ui.cash.CardExpiryEditText;
import com.snapchat.android.ui.cash.CardNumberEditText;
import com.snapchat.android.ui.cash.ZipEditText;
import com.snapchat.android.util.AlertDialogUtils;
import com.snapchat.android.util.fragment.SnapchatFragment;
import nq;
import sp;

public class CardLinkFragment extends SnapchatFragment
    implements nq
{
    public static interface a
    {

        public abstract void a(String s1, String s2, String s3, String s4, nq nq1);

        public abstract void e();
    }

    static final class b
        implements TextWatcher
    {

        private TextView a;
        private ImageView b;

        public final void afterTextChanged(Editable editable)
        {
        }

        public final void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
        {
        }

        public final void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
        {
            if (a.getVisibility() == 0)
            {
                a.setText("");
                a.setVisibility(4);
                b.setVisibility(8);
            }
        }

        b(TextView textview, ImageView imageview)
        {
            a = textview;
            b = imageview;
        }
    }


    public a a;
    private ScrollView b;
    private CardNumberEditText c;
    private ImageView d;
    private TextView e;
    private CardExpiryEditText f;
    private ImageView g;
    private TextView h;
    private CardCvvEditText i;
    private ImageView j;
    private ImageView k;
    private TextView l;
    private ZipEditText m;
    private ImageView n;
    private TextView o;
    private Button p;
    private ProgressBar q;
    private boolean r;
    private boolean s;
    private Animation t;
    private boolean u;

    public CardLinkFragment()
    {
        r = true;
        s = false;
    }

    static void a(CardLinkFragment cardlinkfragment)
    {
        if (cardlinkfragment.p.getVisibility() == 0)
        {
            cardlinkfragment.p.setEnabled(false);
            cardlinkfragment.p.setClickable(false);
            cardlinkfragment.p.setVisibility(8);
        }
    }

    static void a(CardLinkFragment cardlinkfragment, EditText edittext)
    {
        if (edittext.requestFocus())
        {
            Jo.h(cardlinkfragment.getActivity());
        }
    }

    static void a(CardLinkFragment cardlinkfragment, CardInputError cardinputerror)
    {
        cardlinkfragment.b.pageScroll(33);
        cardlinkfragment.e.setText(b(cardinputerror));
        cardlinkfragment.e.setVisibility(0);
        cardlinkfragment.d.setVisibility(0);
        cardlinkfragment.c.startAnimation(cardlinkfragment.t);
        cardlinkfragment.c.requestFocus();
    }

    static CardNumberEditText b(CardLinkFragment cardlinkfragment)
    {
        return cardlinkfragment.c;
    }

    private static String b(CardInputError cardinputerror)
    {
        static final class _cls6
        {

            static final int a[];

            static 
            {
                a = new int[CardInputError.values().length];
                try
                {
                    a[CardInputError.INVALID_CARD_NUMBER.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[CardInputError.BLOCKED_CARD.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[CardInputError.INVALID_EXPIRATION.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[CardInputError.INVALID_SECURITY_CODE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[CardInputError.INVALID_POSTAL_CODE.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[CardInputError.CARD_TYPE_UNSUPPORTED.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[CardInputError.UNSUPPORTED_REGION.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[CardInputError.TOO_MANY_ATTEMPTS.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[CardInputError.NETWORK_FAILURE.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls6.a[cardinputerror.ordinal()])
        {
        default:
            return (new StringBuilder()).append(IC.a(null, 0x7f08005d, new Object[0])).append(" ").append(IC.a(null, 0x7f0801ee, new Object[0])).toString();

        case 6: // '\006'
        case 7: // '\007'
            return IC.a(null, 0x7f080090, new Object[0]);

        case 1: // '\001'
            return (new StringBuilder()).append(IC.a(null, 0x7f08015e, new Object[0])).append(" ").append(IC.a(null, 0x7f0801ee, new Object[0])).toString();

        case 3: // '\003'
        case 4: // '\004'
            return (new StringBuilder()).append(IC.a(null, 0x7f080160, new Object[0])).append(" ").append(IC.a(null, 0x7f0801ee, new Object[0])).toString();

        case 5: // '\005'
            return (new StringBuilder()).append(IC.a(null, 0x7f080161, new Object[0])).append(" ").append(IC.a(null, 0x7f0801ee, new Object[0])).toString();

        case 8: // '\b'
            return (new StringBuilder()).append(IC.a(null, 0x7f0802d7, new Object[0])).append(" ").append(IC.a(null, 0x7f0801ef, new Object[0])).toString();

        case 2: // '\002'
            return (new StringBuilder()).append(IC.a(null, 0x7f08008b, new Object[0])).append(" ").append(IC.a(null, 0x7f0801ed, new Object[0])).toString();

        case 9: // '\t'
            return (new StringBuilder()).append(IC.a(null, 0x7f080198, new Object[0])).append(" ").append(IC.a(null, 0x7f0801fb, new Object[0])).toString();
        }
    }

    static void b(CardLinkFragment cardlinkfragment, CardInputError cardinputerror)
    {
        cardlinkfragment.h.setText(b(cardinputerror));
        cardlinkfragment.h.setVisibility(0);
        cardlinkfragment.g.setVisibility(0);
        cardlinkfragment.f.startAnimation(cardlinkfragment.t);
        cardlinkfragment.f.requestFocus();
    }

    static void c(CardLinkFragment cardlinkfragment, CardInputError cardinputerror)
    {
        cardlinkfragment.l.setText(b(cardinputerror));
        cardlinkfragment.l.setVisibility(0);
        cardlinkfragment.k.setVisibility(0);
        cardlinkfragment.j.setVisibility(8);
        cardlinkfragment.i.startAnimation(cardlinkfragment.t);
        cardlinkfragment.i.requestFocus();
    }

    static boolean c(CardLinkFragment cardlinkfragment)
    {
        if (Ij.a(cardlinkfragment.c.a()))
        {
            CardExpiryEditText cardexpiryedittext = cardlinkfragment.f;
            boolean flag;
            if (!TextUtils.isEmpty(cardexpiryedittext.getText()) && cardexpiryedittext.c)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                CardCvvEditText cardcvvedittext = cardlinkfragment.i;
                if (!TextUtils.isEmpty(cardcvvedittext.getText()) && cardcvvedittext.a)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    ZipEditText zipedittext = cardlinkfragment.m;
                    if (!TextUtils.isEmpty(zipedittext.getText()) && zipedittext.a)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (flag)
                    {
                        cardlinkfragment.p.setText(0x7f080216);
                        cardlinkfragment.p.setEnabled(true);
                        cardlinkfragment.p.setClickable(true);
                        cardlinkfragment.p.setVisibility(0);
                        if (cardlinkfragment.r)
                        {
                            cardlinkfragment.b.post(cardlinkfragment. new Runnable() {

                                private CardLinkFragment a;

                                public final void run()
                                {
                                    CardLinkFragment.n(a);
                                    CardLinkFragment.o(a).fullScroll(130);
                                }

            
            {
                a = CardLinkFragment.this;
                super();
            }
                            });
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static CardExpiryEditText d(CardLinkFragment cardlinkfragment)
    {
        return cardlinkfragment.f;
    }

    static void d(CardLinkFragment cardlinkfragment, CardInputError cardinputerror)
    {
        cardlinkfragment.o.setText(b(cardinputerror));
        cardlinkfragment.o.setVisibility(0);
        cardlinkfragment.n.setVisibility(0);
        cardlinkfragment.m.startAnimation(cardlinkfragment.t);
        cardlinkfragment.m.requestFocus();
        cardlinkfragment.b.pageScroll(130);
    }

    static CardCvvEditText e(CardLinkFragment cardlinkfragment)
    {
        return cardlinkfragment.i;
    }

    static void e(CardLinkFragment cardlinkfragment, CardInputError cardinputerror)
    {
        FragmentActivity fragmentactivity = cardlinkfragment.getActivity();
        _cls6.a[cardinputerror.ordinal()];
        JVM INSTR tableswitch 6 7: default 36
    //                   6 57
    //                   7 57;
           goto _L1 _L2 _L2
_L1:
        cardlinkfragment = IC.a(null, 0x7f08005d, new Object[0]);
_L4:
        AlertDialogUtils.b(fragmentactivity, cardlinkfragment, b(cardinputerror));
        return;
_L2:
        cardlinkfragment = IC.a(null, 0x7f08008f, new Object[0]);
        if (true) goto _L4; else goto _L3
_L3:
    }

    static ImageView f(CardLinkFragment cardlinkfragment)
    {
        return cardlinkfragment.j;
    }

    static ZipEditText g(CardLinkFragment cardlinkfragment)
    {
        return cardlinkfragment.m;
    }

    static void h(CardLinkFragment cardlinkfragment)
    {
        cardlinkfragment.e.setText(null);
        cardlinkfragment.e.setVisibility(4);
        cardlinkfragment.d.setVisibility(8);
        cardlinkfragment.h.setText(null);
        cardlinkfragment.h.setVisibility(4);
        cardlinkfragment.g.setVisibility(8);
        cardlinkfragment.l.setText(null);
        cardlinkfragment.l.setVisibility(4);
        cardlinkfragment.k.setVisibility(8);
        cardlinkfragment.o.setText(null);
        cardlinkfragment.o.setVisibility(4);
        cardlinkfragment.n.setVisibility(8);
    }

    static Button i(CardLinkFragment cardlinkfragment)
    {
        return cardlinkfragment.p;
    }

    static ProgressBar j(CardLinkFragment cardlinkfragment)
    {
        return cardlinkfragment.q;
    }

    static a k(CardLinkFragment cardlinkfragment)
    {
        return cardlinkfragment.a;
    }

    static boolean l(CardLinkFragment cardlinkfragment)
    {
        cardlinkfragment.u = true;
        return true;
    }

    static boolean m(CardLinkFragment cardlinkfragment)
    {
        return cardlinkfragment.mIsVisible;
    }

    static boolean n(CardLinkFragment cardlinkfragment)
    {
        cardlinkfragment.r = false;
        return false;
    }

    static ScrollView o(CardLinkFragment cardlinkfragment)
    {
        return cardlinkfragment.b;
    }

    public final void a()
    {
        AnalyticsEvents.i(s);
        PG.a(new Runnable() {

            private CardLinkFragment a;

            public final void run()
            {
                CardLinkFragment.l(a);
                FragmentActivity fragmentactivity = a.getActivity();
                if (CardLinkFragment.m(a) && fragmentactivity != null)
                {
                    fragmentactivity.onBackPressed();
                }
            }

            
            {
                a = CardLinkFragment.this;
                super();
            }
        });
    }

    public final void a(CardInputError cardinputerror)
    {
        PG.a(new Runnable(cardinputerror) {

            private CardInputError a;
            private CardLinkFragment b;

            public final void run()
            {
                _cls6.a[a.ordinal()];
                JVM INSTR tableswitch 1 5: default 44
            //                           1 86
            //                           2 86
            //                           3 100
            //                           4 100
            //                           5 125;
                   goto _L1 _L2 _L2 _L3 _L3 _L4
_L1:
                CardLinkFragment.e(b, a);
_L6:
                AnalyticsEvents.o(a.name());
                CardLinkFragment.j(b).setVisibility(8);
                CardLinkFragment.c(b);
                return;
_L2:
                CardLinkFragment.a(b, a);
                continue; /* Loop/switch isn't completed */
_L3:
                CardLinkFragment.b(b, a);
                CardLinkFragment.c(b, a);
                continue; /* Loop/switch isn't completed */
_L4:
                CardLinkFragment.d(b, a);
                if (true) goto _L6; else goto _L5
_L5:
            }

            
            {
                b = CardLinkFragment.this;
                a = cardinputerror;
                super();
            }
        });
    }

    protected final com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode b()
    {
        return com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode.DRAW_BELOW_FOR_ADJUSTABLE_UI;
    }

    public final boolean f()
    {
        if (!u)
        {
            a.e();
        }
        a = null;
        Jo.a(getActivity(), mFragmentLayout);
        return false;
    }

    public final boolean k_()
    {
        return true;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f040023, viewgroup, false);
        layoutinflater = (TextView)d(0x7f0d00ed);
        viewgroup = (ImageView)d(0x7f0d003a);
        p = (Button)d(0x7f0d00ef);
        bundle = getArguments();
        if (bundle != null && bundle.getBoolean("use_default_green"))
        {
            layoutinflater.setTextColor(getResources().getColor(0x7f0c003d));
            viewgroup.setBackgroundResource(0x7f020010);
            p.setBackgroundResource(0x7f020238);
        } else
        {
            layoutinflater.setTextColor(getResources().getColor(0x7f0c0064));
            viewgroup.setBackgroundResource(0x7f0200a1);
            p.setBackgroundResource(0x7f0200a3);
        }
        b = (ScrollView)d(0x7f0d00ee);
        d(0x7f0d00ec).setOnClickListener(new android.view.View.OnClickListener() {

            private CardLinkFragment a;

            public final void onClick(View view)
            {
                a.getActivity().onBackPressed();
            }

            
            {
                a = CardLinkFragment.this;
                super();
            }
        });
        c = (CardNumberEditText)d(0x7f0d00f0);
        c.setValidatedInputCallback(new sp() {

            private CardLinkFragment a;

            public final void a()
            {
                CardLinkFragment.a(a);
                Object obj = CardLinkFragment.b(a);
                boolean flag;
                if (((CardNumberEditText) (obj)).a().length() == 16)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag && !Ij.a(((CardNumberEditText) (obj)).a()))
                {
                    obj = CardInputError.INVALID_CARD_NUMBER;
                } else
                {
                    obj = null;
                }
                if (obj != null)
                {
                    a.a(((CardInputError) (obj)));
                }
            }

            public final void b()
            {
                if (!CardLinkFragment.c(a))
                {
                    CardLinkFragment.d(a).requestFocus();
                }
            }

            public final void c()
            {
            }

            
            {
                a = CardLinkFragment.this;
                super();
            }
        });
        c.setCustomSelectionActionModeCallback(new Gx());
        d = (ImageView)d(0x7f0d00f1);
        d.setOnClickListener(new android.view.View.OnClickListener() {

            private CardLinkFragment a;

            public final void onClick(View view)
            {
                CardLinkFragment.b(a).setText(null);
                CardLinkFragment.a(a, CardLinkFragment.b(a));
            }

            
            {
                a = CardLinkFragment.this;
                super();
            }
        });
        e = (TextView)d(0x7f0d00f2);
        c.addTextChangedListener(new b(e, d));
        c.requestFocus();
        f = (CardExpiryEditText)d(0x7f0d00f3);
        f.setValidatedInputCallback(new sp() {

            private CardLinkFragment a;

            public final void a()
            {
                CardLinkFragment.a(a);
            }

            public final void b()
            {
                if (!CardLinkFragment.c(a))
                {
                    CardLinkFragment.e(a).requestFocus();
                }
            }

            public final void c()
            {
                CardLinkFragment.b(a).requestFocus();
            }

            
            {
                a = CardLinkFragment.this;
                super();
            }
        });
        f.setCustomSelectionActionModeCallback(new Gx());
        g = (ImageView)d(0x7f0d00f4);
        g.setOnClickListener(new android.view.View.OnClickListener() {

            private CardLinkFragment a;

            public final void onClick(View view)
            {
                CardLinkFragment.d(a).setText(null);
                CardLinkFragment.a(a, CardLinkFragment.d(a));
            }

            
            {
                a = CardLinkFragment.this;
                super();
            }
        });
        h = (TextView)d(0x7f0d00f5);
        f.addTextChangedListener(new b(h, g));
        i = (CardCvvEditText)d(0x7f0d00e5);
        i.setValidatedInputCallback(new sp() {

            private CardLinkFragment a;

            public final void a()
            {
                CardLinkFragment.a(a);
                CardLinkFragment.f(a).setVisibility(8);
            }

            public final void b()
            {
                if (!CardLinkFragment.c(a))
                {
                    CardLinkFragment.g(a).requestFocus();
                }
                CardLinkFragment.f(a).setVisibility(0);
            }

            public final void c()
            {
                CardLinkFragment.d(a).requestFocus();
            }

            
            {
                a = CardLinkFragment.this;
                super();
            }
        });
        i.setCustomSelectionActionModeCallback(new Gx());
        k = (ImageView)d(0x7f0d00f7);
        k.setOnClickListener(new android.view.View.OnClickListener() {

            private CardLinkFragment a;

            public final void onClick(View view)
            {
                CardLinkFragment.e(a).setText(null);
                CardLinkFragment.a(a, CardLinkFragment.e(a));
            }

            
            {
                a = CardLinkFragment.this;
                super();
            }
        });
        l = (TextView)d(0x7f0d00f8);
        j = (ImageView)d(0x7f0d00f6);
        i.addTextChangedListener(new b(l, k));
        m = (ZipEditText)d(0x7f0d00e6);
        m.setValidatedInputCallback(new sp() {

            private CardLinkFragment a;

            public final void a()
            {
                CardLinkFragment.a(a);
            }

            public final void b()
            {
                CardLinkFragment.c(a);
            }

            public final void c()
            {
                CardLinkFragment.e(a).requestFocus();
            }

            
            {
                a = CardLinkFragment.this;
                super();
            }
        });
        m.setCustomSelectionActionModeCallback(new Gx());
        n = (ImageView)d(0x7f0d00f9);
        n.setOnClickListener(new android.view.View.OnClickListener() {

            private CardLinkFragment a;

            public final void onClick(View view)
            {
                CardLinkFragment.g(a).setText(null);
                CardLinkFragment.a(a, CardLinkFragment.g(a));
            }

            
            {
                a = CardLinkFragment.this;
                super();
            }
        });
        o = (TextView)d(0x7f0d00fa);
        m.addTextChangedListener(new b(o, n));
        layoutinflater = p;
        getActivity().getAssets();
        Iq.a(layoutinflater);
        p.setOnClickListener(new android.view.View.OnClickListener() {

            private CardLinkFragment a;

            public final void onClick(View view)
            {
                int i1 = 0;
                CardLinkFragment.h(a);
                CardLinkFragment.i(a).setText("");
                CardLinkFragment.i(a).setClickable(false);
                CardLinkFragment.j(a).setVisibility(0);
                view = CardLinkFragment.k(a);
                String s1 = CardLinkFragment.b(a).a();
                CardExpiryEditText cardexpiryedittext = CardLinkFragment.d(a);
                StringBuilder stringbuilder = new StringBuilder();
                for (; i1 < cardexpiryedittext.getText().length(); i1++)
                {
                    char c1 = cardexpiryedittext.getText().charAt(i1);
                    if (Character.isDigit(c1))
                    {
                        stringbuilder.append(c1);
                    }
                }

                view.a(s1, stringbuilder.toString(), CardLinkFragment.e(a).b(), CardLinkFragment.g(a).getText().toString().trim(), a);
            }

            
            {
                a = CardLinkFragment.this;
                super();
            }
        });
        q = (ProgressBar)d(0x7f0d00fc);
        t = AnimationUtils.loadAnimation(getActivity(), 0x7f050005);
        return mFragmentLayout;
    }

    public void onVisible()
    {
        super.onVisible();
        Jo.h(getActivity());
        s = false;
        if (Bt.aE())
        {
            AlertDialogUtils.b(getActivity(), getString(0x7f08021b), getString(0x7f08021c));
            AnalyticsEvents.u();
            s = true;
        }
    }
}
