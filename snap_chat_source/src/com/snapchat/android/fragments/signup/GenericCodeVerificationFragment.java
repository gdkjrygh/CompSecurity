// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.signup;

import Iq;
import Jo;
import OJ;
import PF;
import android.content.IntentFilter;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.snapchat.android.Timber;
import com.snapchat.android.receiver.SmsReceiver;
import com.snapchat.android.util.fragment.SnapchatFragment;
import java.util.concurrent.TimeUnit;

public abstract class GenericCodeVerificationFragment extends SnapchatFragment
{
    final class a extends PF
    {

        private GenericCodeVerificationFragment a;

        public final void a()
        {
            if (!a.isAdded())
            {
                return;
            } else
            {
                GenericCodeVerificationFragment.c(a);
                a.t();
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
                GenericCodeVerificationFragment.b(a);
                a.t();
                return;
            }
        }

        public a(int j, long l, Handler handler)
        {
            a = GenericCodeVerificationFragment.this;
            super(j, l, handler);
            GenericCodeVerificationFragment.a(GenericCodeVerificationFragment.this, j);
            t();
        }
    }


    public EditText a;
    public Button b;
    public ProgressBar c;
    private TextView d;
    private View e;
    private a f;
    private int g;
    private Handler h;
    private SmsReceiver i;

    public GenericCodeVerificationFragment()
    {
        h = new Handler();
    }

    static int a(GenericCodeVerificationFragment genericcodeverificationfragment, int j)
    {
        genericcodeverificationfragment.g = j;
        return j;
    }

    static a a(GenericCodeVerificationFragment genericcodeverificationfragment)
    {
        return genericcodeverificationfragment.f;
    }

    static a b(GenericCodeVerificationFragment genericcodeverificationfragment)
    {
        genericcodeverificationfragment.f = null;
        return null;
    }

    static int c(GenericCodeVerificationFragment genericcodeverificationfragment)
    {
        int j = genericcodeverificationfragment.g;
        genericcodeverificationfragment.g = j - 1;
        return j;
    }

    public final void a(String s1)
    {
        if (s1 == null)
        {
            d.setText("");
            s1 = d;
            byte byte0;
            if (a.getVisibility() == 0)
            {
                byte0 = 4;
            } else
            {
                byte0 = 8;
            }
            s1.setVisibility(byte0);
            e.setVisibility(4);
            return;
        } else
        {
            d.setVisibility(0);
            d.setText(s1);
            e.setVisibility(0);
            return;
        }
    }

    protected final com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode b()
    {
        return com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode.DRAW_BELOW_FOR_ADJUSTABLE_UI;
    }

    public abstract void h();

    public abstract void m();

    public abstract String n();

    public final void o()
    {
        ((TextView)d(0x7f0d00fe)).setText(n());
        a = (EditText)d(0x7f0d0103);
        d = (TextView)d(0x7f0d0105);
        e = d(0x7f0d0104);
        b = (Button)d(0x7f0d0530);
        Button button = b;
        getActivity().getAssets();
        Iq.a(button);
        c = (ProgressBar)d(0x7f0d0108);
        if (a.requestFocus())
        {
            Jo.g(getActivity());
        }
    }

    public void onPause()
    {
        super.onPause();
        Timber.c("GenericCodeVerificationFragment", "unregisterSmsReceiver()", new Object[0]);
        if (i != null)
        {
            getActivity().unregisterReceiver(i);
            i = null;
        }
    }

    public void onResume()
    {
        super.onResume();
        Timber.c("GenericCodeVerificationFragment", "registerSmsReceiver()", new Object[0]);
        if (i == null)
        {
            i = new SmsReceiver();
            getActivity().registerReceiver(i, new IntentFilter("android.provider.Telephony.SMS_RECEIVED"));
        }
    }

    public void onVerificationCodeReceivedEvent(OJ oj)
    {
        if (TextUtils.isEmpty(a.getText()) && b.isClickable())
        {
            a.setText(oj.code);
            b.performClick();
        }
    }

    public final void p()
    {
        b.setOnClickListener(new android.view.View.OnClickListener() {

            private GenericCodeVerificationFragment a;

            public final void onClick(View view)
            {
                a.c.setVisibility(0);
                if (GenericCodeVerificationFragment.a(a) != null)
                {
                    GenericCodeVerificationFragment.a(a).c();
                    GenericCodeVerificationFragment.b(a);
                }
                a.b.setText("");
                a.b.setClickable(false);
                a.a.setEnabled(false);
                if (a.a.length() < 6)
                {
                    a.m();
                    return;
                } else
                {
                    a.h();
                    return;
                }
            }

            
            {
                a = GenericCodeVerificationFragment.this;
                super();
            }
        });
    }

    public final void q()
    {
        a.addTextChangedListener(new TextWatcher() {

            private GenericCodeVerificationFragment a;

            public final void afterTextChanged(Editable editable)
            {
                a.a(null);
                a.t();
            }

            public final void beforeTextChanged(CharSequence charsequence, int j, int k, int l)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int j, int k, int l)
            {
            }

            
            {
                a = GenericCodeVerificationFragment.this;
                super();
            }
        });
        e.setOnClickListener(new android.view.View.OnClickListener() {

            private GenericCodeVerificationFragment a;

            public final void onClick(View view)
            {
                a.a(null);
                a.a.setText("");
                a.a.requestFocus();
            }

            
            {
                a = GenericCodeVerificationFragment.this;
                super();
            }
        });
    }

    public final void s()
    {
        f = new a((int)TimeUnit.MINUTES.toSeconds(1L), TimeUnit.SECONDS.toMillis(1L), h);
        f.e();
    }

    public final void t()
    {
        if (a.length() >= 6)
        {
            b.setText(0x7f080216);
            b.setClickable(true);
            b.setEnabled(true);
            return;
        }
        if (f == null)
        {
            b.setText(0x7f0801e7);
            b.setClickable(true);
            b.setEnabled(true);
            return;
        } else
        {
            b.setText((new StringBuilder()).append(getString(0x7f0801e7)).append(" ").append(g).toString());
            b.setEnabled(false);
            return;
        }
    }
}
