// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings.password;

import CU;
import Da;
import Dg;
import Eh;
import Ei;
import IC;
import Iq;
import Jo;
import LY;
import Mf;
import Oi;
import Up;
import Ur;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.snapchat.android.fragments.addfriends.LeftSwipeContentFragment;
import com.snapchat.android.fragments.settings.SecurityGhostFragment;
import com.snapchat.android.util.emoji.Emoji;
import com.snapchat.android.util.fragment.SnapchatFragment;
import com.squareup.otto.Bus;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.snapchat.android.fragments.settings.password:
//            PasswordStrength, PasswordValidationFragment

public class ChangePasswordFragment extends SnapchatFragment
{

    protected EditText a;
    protected TextView b;
    protected View c;
    protected EditText d;
    protected Button e;
    protected View f;
    protected PasswordStrength g;
    private View h;
    private TextView i;
    private View j;
    private TextView k;
    private final Set l;
    private final Ei m;
    private String n;
    private String o;
    private int p;
    private int q;
    private Eh r = new Eh() {

        private ChangePasswordFragment a;

        public final void a(CU cu)
        {
            int i1 = Ei.a(cu);
            if (ChangePasswordFragment.a(a).contains(Integer.valueOf(i1)))
            {
                ChangePasswordFragment.a(a).remove(Integer.valueOf(i1));
                if (cu instanceof Dg)
                {
                    a.a((Dg)cu);
                } else
                if (cu instanceof Da)
                {
                    ChangePasswordFragment.a(a, (Da)cu);
                    return;
                }
            }
        }

            
            {
                a = ChangePasswordFragment.this;
                super();
            }
    };

    public ChangePasswordFragment()
    {
        this(Ei.a());
    }

    private ChangePasswordFragment(Ei ei)
    {
        g = PasswordStrength.UNKNOWN;
        l = new HashSet();
        m = ei;
    }

    static Set a(ChangePasswordFragment changepasswordfragment)
    {
        return changepasswordfragment.l;
    }

    static void a(ChangePasswordFragment changepasswordfragment, Da da)
    {
        if (da.b)
        {
            Mf.a().a(new Oi(new PasswordValidationFragment()));
            return;
        }
        if (da.a.a().booleanValue())
        {
            Mf.a().a(new Oi(SecurityGhostFragment.a(IC.a(null, 0x7f080248, new Object[0]))));
            return;
        } else
        {
            changepasswordfragment.d.setText("");
            changepasswordfragment.e.setVisibility(8);
            changepasswordfragment.f.setVisibility(8);
            changepasswordfragment.b.setVisibility(8);
            changepasswordfragment.a(da.a.b());
            return;
        }
    }

    private void a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            h.setVisibility(0);
            i.setText(s);
            i.setVisibility(0);
            a.requestFocus();
            return;
        } else
        {
            h.setVisibility(8);
            i.setVisibility(8);
            return;
        }
    }

    static void b(ChangePasswordFragment changepasswordfragment)
    {
        changepasswordfragment.a(((String) (null)));
    }

    static void c(ChangePasswordFragment changepasswordfragment)
    {
        changepasswordfragment.m();
    }

    static Ei d(ChangePasswordFragment changepasswordfragment)
    {
        return changepasswordfragment.m;
    }

    static void e(ChangePasswordFragment changepasswordfragment)
    {
        if (changepasswordfragment.d.length() >= changepasswordfragment.a.length() && !TextUtils.equals(changepasswordfragment.a.getText(), changepasswordfragment.d.getText()))
        {
            changepasswordfragment.j.setVisibility(0);
            changepasswordfragment.k.setText(0x7f0801c3);
            changepasswordfragment.k.setVisibility(0);
            return;
        } else
        {
            changepasswordfragment.j.setVisibility(8);
            changepasswordfragment.k.setVisibility(8);
            return;
        }
    }

    private void m()
    {
        static final class _cls9
        {

            static final int a[];

            static 
            {
                a = new int[PasswordStrength.values().length];
                try
                {
                    a[PasswordStrength.MEDIUM.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[PasswordStrength.STRONG.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[PasswordStrength.VERYSTRONG.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls9.a[g.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 50
    //                   2 87
    //                   3 87;
           goto _L1 _L2 _L3 _L3
_L1:
        b.setVisibility(8);
_L4:
        h();
        return;
_L2:
        String s;
        int i1;
        s = n;
        i1 = p;
_L5:
        b.setVisibility(0);
        b.setText(s);
        b.setTextColor(i1);
        if (true) goto _L4; else goto _L3
_L3:
        s = o;
        i1 = q;
          goto _L5
    }

    protected final void a(Dg dg)
    {
        if (TextUtils.equals(a.getText(), dg.a))
        {
            PasswordStrength passwordstrength = PasswordStrength.fromValue(dg.b.a());
            c.setVisibility(8);
            b.setVisibility(0);
            g = passwordstrength;
            if (passwordstrength == PasswordStrength.TOO_WEAK || passwordstrength == PasswordStrength.UNKNOWN)
            {
                a(dg.b.b());
            }
        }
        m();
    }

    protected final com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode b()
    {
        return com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode.DRAW_BELOW_FOR_ADJUSTABLE_UI;
    }

    public final void e()
    {
        super.e();
        Jo.a(getActivity(), ac().getDecorView().getRootView());
    }

    public final boolean f()
    {
        if (d(LeftSwipeContentFragment.SETTINGS_FRAGMENT.tag()))
        {
            return true;
        } else
        {
            return super.f();
        }
    }

    protected final void h()
    {
        if (TextUtils.equals(a.getText(), d.getText()) && g != PasswordStrength.UNKNOWN && g != PasswordStrength.TOO_WEAK)
        {
            e.setText(0x7f080222);
            e.setClickable(true);
            e.setVisibility(0);
            return;
        } else
        {
            e.setVisibility(8);
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f040029, viewgroup, false);
        layoutinflater = getResources();
        layoutinflater.getString(0x7f0801c7, new Object[] {
            LY.a(Emoji.CONFUSED_FACE)
        });
        n = layoutinflater.getString(0x7f0801c5, new Object[] {
            LY.a(Emoji.OK_HAND_SIGN)
        });
        o = layoutinflater.getString(0x7f0801c6, new Object[] {
            LY.a(Emoji.SMILING_FACE_WITH_SUNGLASSES)
        });
        layoutinflater.getColor(0x7f0c004b);
        p = layoutinflater.getColor(0x7f0c0049);
        q = layoutinflater.getColor(0x7f0c004a);
        a = (EditText)d(0x7f0d0123);
        b = (TextView)d(0x7f0d0125);
        h = d(0x7f0d0124);
        i = (TextView)d(0x7f0d0127);
        c = d(0x7f0d0126);
        d = (EditText)d(0x7f0d0128);
        j = d(0x7f0d0129);
        k = (TextView)d(0x7f0d012a);
        e = (Button)d(0x7f0d012b);
        layoutinflater = e;
        getActivity().getAssets();
        Iq.a(layoutinflater);
        f = d(0x7f0d012c);
        d(0x7f0d011f).setOnClickListener(new android.view.View.OnClickListener() {

            private ChangePasswordFragment a;

            public final void onClick(View view)
            {
                Jo.a(a.getActivity(), a.getView());
                a.getActivity().onBackPressed();
            }

            
            {
                a = ChangePasswordFragment.this;
                super();
            }
        });
        a.addTextChangedListener(new TextWatcher() {

            private ChangePasswordFragment a;

            public final void afterTextChanged(Editable editable)
            {
                a.g = PasswordStrength.UNKNOWN;
                a.d.setText("");
                ChangePasswordFragment.b(a);
                ChangePasswordFragment.c(a);
            }

            public final void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            
            {
                a = ChangePasswordFragment.this;
                super();
            }
        });
        a.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            private ChangePasswordFragment a;

            public final void onFocusChange(View view, boolean flag)
            {
                if (!flag && !TextUtils.isEmpty(a.a.getText()))
                {
                    view = ChangePasswordFragment.a(a);
                    Ei ei = ChangePasswordFragment.d(a);
                    FragmentActivity fragmentactivity = a.getActivity();
                    String s = a.a.getText().toString();
                    Intent intent = ei.c(fragmentactivity);
                    intent.putExtra("op_code", 1018);
                    intent.putExtra("new_password", s);
                    view.add(Integer.valueOf(ei.a(fragmentactivity, intent)));
                    a.c.setVisibility(0);
                    a.b.setVisibility(8);
                }
            }

            
            {
                a = ChangePasswordFragment.this;
                super();
            }
        });
        h.setOnClickListener(new android.view.View.OnClickListener() {

            private ChangePasswordFragment a;

            public final void onClick(View view)
            {
                a.a.setText("");
                ChangePasswordFragment.b(a);
            }

            
            {
                a = ChangePasswordFragment.this;
                super();
            }
        });
        d.addTextChangedListener(new TextWatcher() {

            private ChangePasswordFragment a;

            public final void afterTextChanged(Editable editable)
            {
                ChangePasswordFragment.e(a);
                a.h();
            }

            public final void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            
            {
                a = ChangePasswordFragment.this;
                super();
            }
        });
        j.setOnClickListener(new android.view.View.OnClickListener() {

            private ChangePasswordFragment a;

            public final void onClick(View view)
            {
                a.d.setText("");
                ChangePasswordFragment.e(a);
            }

            
            {
                a = ChangePasswordFragment.this;
                super();
            }
        });
        e.setOnClickListener(new android.view.View.OnClickListener() {

            private ChangePasswordFragment a;

            public final void onClick(View view)
            {
                view = ChangePasswordFragment.a(a);
                Ei ei = ChangePasswordFragment.d(a);
                FragmentActivity fragmentactivity = a.getActivity();
                String s = a.a.getText().toString();
                Intent intent = ei.c(fragmentactivity);
                intent.putExtra("op_code", 1017);
                intent.putExtra("new_password", s);
                view.add(Integer.valueOf(ei.a(fragmentactivity, intent)));
                a.e.setClickable(false);
                a.e.setText("");
                a.f.setVisibility(0);
            }

            
            {
                a = ChangePasswordFragment.this;
                super();
            }
        });
        return mFragmentLayout;
    }

    public void onPause()
    {
        super.onPause();
        m.b(1018, r);
        m.b(1017, r);
        l.clear();
    }

    public void onResume()
    {
        super.onResume();
        m.a(1018, r);
        m.a(1017, r);
    }

    public void onVisible()
    {
        super.onVisible();
        if (a.requestFocus())
        {
            Jo.g(getActivity());
        }
    }
}
