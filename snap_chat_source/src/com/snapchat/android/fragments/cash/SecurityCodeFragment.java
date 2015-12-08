// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.cash;

import IC;
import Jo;
import Mf;
import NT;
import PG;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.snapchat.android.api2.cash.square.data.ErrorType;
import com.snapchat.android.ui.cash.CardCvvEditText;
import com.snapchat.android.util.fragment.SnapchatFragment;
import com.squareup.otto.Bus;
import sp;

public class SecurityCodeFragment extends SnapchatFragment
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(String s);

        public abstract void b();
    }

    final class b
        implements sp
    {

        private SecurityCodeFragment a;

        public final void a()
        {
            SecurityCodeFragment.d(a).setVisibility(8);
        }

        public final void b()
        {
            if (SecurityCodeFragment.f(a) == null)
            {
                throw new RuntimeException("Forgot to set a callback on SecurityCodeFragment!");
            }
            if (SecurityCodeFragment.g(a))
            {
                SecurityCodeFragment.b(a, false);
                SecurityCodeFragment.h(a).setBackgroundColor(0xff000000);
            }
            SecurityCodeFragment.d(a).setVisibility(0);
            SecurityCodeFragment.b(a).setEnabled(false);
            SecurityCodeFragment.f(a).a(SecurityCodeFragment.b(a).b());
        }

        public final void c()
        {
        }

        private b()
        {
            a = SecurityCodeFragment.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }


    public a a;
    private CardCvvEditText b;
    private View c;
    private TextView d;
    private View e;
    private boolean f;
    private boolean g;
    private boolean h;

    public SecurityCodeFragment()
    {
        g = false;
        h = false;
    }

    static TextView a(SecurityCodeFragment securitycodefragment)
    {
        return securitycodefragment.d;
    }

    static void a(View view)
    {
        view = ObjectAnimator.ofFloat(view, View.ALPHA, new float[] {
            0.6F, 1.0F
        });
        view.setDuration(1000L);
        view.start();
    }

    static boolean a(SecurityCodeFragment securitycodefragment, boolean flag)
    {
        securitycodefragment.f = flag;
        return flag;
    }

    static CardCvvEditText b(SecurityCodeFragment securitycodefragment)
    {
        return securitycodefragment.b;
    }

    static String b(ErrorType errortype, int i)
    {
        String s = (new StringBuilder()).append(IC.a(null, 0x7f08005d, new Object[0])).append('\n').append(IC.a(null, 0x7f0801ee, new Object[0])).toString();
        i;
        JVM INSTR lookupswitch 3: default 76
    //                   409: 167
    //                   422: 122
    //                   429: 167;
           goto _L1 _L2 _L3 _L2
_L1:
        if (errortype == null || errortype == ErrorType.UNKNOWN) goto _L5; else goto _L4
_L4:
        static final class _cls5
        {

            static final int a[];

            static 
            {
                a = new int[ErrorType.values().length];
                try
                {
                    a[ErrorType.INVALID_PASSCODE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[ErrorType.TOO_MANY_ATTEMPTS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[ErrorType.BLOCKED_CARD.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls5.a[errortype.ordinal()];
        JVM INSTR tableswitch 1 3: default 120
    //                   1 212
    //                   2 254
    //                   3 296;
           goto _L5 _L6 _L7 _L8
_L5:
        return s;
_L3:
        s = (new StringBuilder()).append(IC.a(null, 0x7f08015f, new Object[0])).append('\n').append(IC.a(null, 0x7f0801ee, new Object[0])).toString();
          goto _L1
_L2:
        s = (new StringBuilder()).append(IC.a(null, 0x7f0802d7, new Object[0])).append('\n').append(IC.a(null, 0x7f0801ef, new Object[0])).toString();
          goto _L1
_L6:
        return (new StringBuilder()).append(IC.a(null, 0x7f08015f, new Object[0])).append('\n').append(IC.a(null, 0x7f0801ee, new Object[0])).toString();
_L7:
        return (new StringBuilder()).append(IC.a(null, 0x7f0802d7, new Object[0])).append('\n').append(IC.a(null, 0x7f0801ef, new Object[0])).toString();
_L8:
        return (new StringBuilder()).append(IC.a(null, 0x7f08008b, new Object[0])).append('\n').append(IC.a(null, 0x7f0801ed, new Object[0])).toString();
    }

    static boolean b(SecurityCodeFragment securitycodefragment, boolean flag)
    {
        securitycodefragment.g = flag;
        return flag;
    }

    static boolean c(SecurityCodeFragment securitycodefragment)
    {
        securitycodefragment.h = true;
        return true;
    }

    static View d(SecurityCodeFragment securitycodefragment)
    {
        return securitycodefragment.c;
    }

    static View e(SecurityCodeFragment securitycodefragment)
    {
        return securitycodefragment.mFragmentLayout;
    }

    static a f(SecurityCodeFragment securitycodefragment)
    {
        return securitycodefragment.a;
    }

    static boolean g(SecurityCodeFragment securitycodefragment)
    {
        return securitycodefragment.g;
    }

    static View h(SecurityCodeFragment securitycodefragment)
    {
        return securitycodefragment.mFragmentLayout;
    }

    public final void a(ErrorType errortype, int i)
    {
        PG.a(new Runnable(errortype, i) {

            private ErrorType a;
            private int b;
            private SecurityCodeFragment c;

            public final void run()
            {
                SecurityCodeFragment.a(c, false);
                SecurityCodeFragment.a(c).setText(SecurityCodeFragment.b(a, b));
                if (!ErrorType.isNonRecoverableError(a))
                {
                    SecurityCodeFragment.b(c).setText("");
                    SecurityCodeFragment.b(c).setEnabled(true);
                    if (SecurityCodeFragment.b(c).requestFocus())
                    {
                        Jo.h(c.getActivity());
                    }
                } else
                {
                    SecurityCodeFragment.c(c);
                }
                SecurityCodeFragment.d(c).setVisibility(8);
                SecurityCodeFragment.e(c).setBackgroundColor(c.getResources().getColor(0x7f0c0059));
                SecurityCodeFragment.b(c, true);
            }

            
            {
                c = SecurityCodeFragment.this;
                a = errortype;
                b = i;
                super();
            }
        });
    }

    public final boolean f()
    {
        if (!f && a != null)
        {
            if (h)
            {
                a.b();
            } else
            {
                a.a();
            }
        }
        a = null;
        return false;
    }

    protected final void h()
    {
        Jo.a(getActivity(), mFragmentLayout);
        getActivity().onBackPressed();
    }

    public final boolean k_()
    {
        return true;
    }

    public final void l()
    {
        PG.a(new Runnable() {

            private SecurityCodeFragment a;

            public final void run()
            {
                SecurityCodeFragment.a(a, true);
                a.h();
            }

            
            {
                a = SecurityCodeFragment.this;
                super();
            }
        });
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f040022, viewgroup, false);
        b = (CardCvvEditText)d(0x7f0d00e5);
        b.setValidatedInputCallback(new b((byte)0));
        b.addTextChangedListener(new TextWatcher(b) {

            private boolean a;
            private View b;

            public final void afterTextChanged(Editable editable)
            {
                if (!a)
                {
                    SecurityCodeFragment.a(b);
                    a = true;
                }
            }

            public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
            {
            }

            
            {
                b = view;
                super();
                a = false;
            }
        });
        b.setAlpha(0.6F);
        if (b.requestFocus())
        {
            Jo.h(getActivity());
        }
        c = d(0x7f0d00e7);
        d = (TextView)d(0x7f0d00ea);
        e = d(0x7f0d00e9);
        e.setOnClickListener(new android.view.View.OnClickListener() {

            private SecurityCodeFragment a;

            public final void onClick(View view)
            {
                a.h();
            }

            
            {
                a = SecurityCodeFragment.this;
                super();
            }
        });
        return mFragmentLayout;
    }

    public void onVisible()
    {
        super.onVisible();
        Mf.a().a(new NT(false));
    }
}
