// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings.displayname;

import Bt;
import Iq;
import Jo;
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
import com.snapchat.android.fragments.settings.LeftSwipeSettingFragment;
import com.snapchat.android.model.Friend;
import com.snapchat.android.model.FriendAction;
import com.snapchat.android.util.fragment.SnapchatFragment;
import mh;

public class DisplayNameSettingsFragment extends LeftSwipeSettingFragment
    implements mh.a
{

    private EditText a;
    private Button b;
    private View c;
    private View d;
    private TextView e;
    private TextView f;
    private View g;
    private Bt h;

    public DisplayNameSettingsFragment()
    {
        this(Bt.a());
    }

    private DisplayNameSettingsFragment(Bt bt)
    {
        h = bt;
    }

    static EditText a(DisplayNameSettingsFragment displaynamesettingsfragment)
    {
        return displaynamesettingsfragment.a;
    }

    private void a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            d.setVisibility(0);
            e.setText(s);
            e.setVisibility(0);
            return;
        } else
        {
            d.setVisibility(8);
            e.setVisibility(8);
            return;
        }
    }

    static View b(DisplayNameSettingsFragment displaynamesettingsfragment)
    {
        return displaynamesettingsfragment.d;
    }

    static TextView c(DisplayNameSettingsFragment displaynamesettingsfragment)
    {
        return displaynamesettingsfragment.e;
    }

    static void d(DisplayNameSettingsFragment displaynamesettingsfragment)
    {
        displaynamesettingsfragment.a(((String) (null)));
    }

    static TextView e(DisplayNameSettingsFragment displaynamesettingsfragment)
    {
        return displaynamesettingsfragment.f;
    }

    static View f(DisplayNameSettingsFragment displaynamesettingsfragment)
    {
        return displaynamesettingsfragment.g;
    }

    static Bt g(DisplayNameSettingsFragment displaynamesettingsfragment)
    {
        return displaynamesettingsfragment.h;
    }

    static Button h(DisplayNameSettingsFragment displaynamesettingsfragment)
    {
        return displaynamesettingsfragment.b;
    }

    static View i(DisplayNameSettingsFragment displaynamesettingsfragment)
    {
        return displaynamesettingsfragment.c;
    }

    public final void a(FriendAction friendaction, boolean flag, String s)
    {
        if (!super.isAdded())
        {
            return;
        }
        if (flag)
        {
            getActivity().onBackPressed();
            return;
        } else
        {
            a(s);
            c.setVisibility(8);
            b.setVisibility(8);
            h();
            return;
        }
    }

    public final void e()
    {
        super.e();
        Jo.a(getActivity(), ac().getDecorView().getRootView());
    }

    protected final void h()
    {
        byte byte0 = 8;
        c.setVisibility(8);
        TextView textview;
        if (!TextUtils.isEmpty(a.getText()) && !TextUtils.equals(Bt.J(), a.getText()))
        {
            b.setVisibility(0);
            b.setText(0x7f080294);
            b.setClickable(true);
            a.requestFocus();
        } else
        {
            b.setVisibility(8);
        }
        g.setVisibility(8);
        textview = f;
        if (!TextUtils.isEmpty(Bt.J()))
        {
            byte0 = 0;
        }
        textview.setVisibility(byte0);
    }

    protected final void j_()
    {
        getActivity().onBackPressed();
    }

    protected final boolean o_()
    {
        return super.isAdded();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f040066, viewgroup, false);
        d(0x7f0d0280).setOnClickListener(new android.view.View.OnClickListener() {

            private DisplayNameSettingsFragment a;

            public final void onClick(View view)
            {
                Jo.a(a.getActivity(), a.getView());
                a.getActivity().onBackPressed();
            }

            
            {
                a = DisplayNameSettingsFragment.this;
                super();
            }
        });
        f = (TextView)d(0x7f0d0287);
        g = d(0x7f0d0288);
        b = (Button)d(0x7f0d0289);
        layoutinflater = b;
        getActivity().getAssets();
        Iq.a(layoutinflater);
        c = d(0x7f0d028a);
        d = d(0x7f0d0285);
        e = (TextView)d(0x7f0d0286);
        d.setOnClickListener(new android.view.View.OnClickListener() {

            private DisplayNameSettingsFragment a;

            public final void onClick(View view)
            {
                DisplayNameSettingsFragment.a(a).setText("");
                DisplayNameSettingsFragment.b(a).setVisibility(8);
                DisplayNameSettingsFragment.c(a).setVisibility(8);
            }

            
            {
                a = DisplayNameSettingsFragment.this;
                super();
            }
        });
        a = (EditText)d(0x7f0d0284);
        if (!TextUtils.isEmpty(Bt.K()))
        {
            a.setText(Bt.K());
        }
        a.addTextChangedListener(new TextWatcher() {

            private DisplayNameSettingsFragment a;

            public final void afterTextChanged(Editable editable)
            {
                a.h();
                DisplayNameSettingsFragment.d(a);
            }

            public final void beforeTextChanged(CharSequence charsequence, int j, int k, int l)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int j, int k, int l)
            {
            }

            
            {
                a = DisplayNameSettingsFragment.this;
                super();
            }
        });
        a.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            private DisplayNameSettingsFragment a;

            public final void onFocusChange(View view, boolean flag)
            {
                if (flag)
                {
                    Jo.h(a.getActivity());
                }
            }

            
            {
                a = DisplayNameSettingsFragment.this;
                super();
            }
        });
        f.setOnClickListener(new android.view.View.OnClickListener() {

            private DisplayNameSettingsFragment a;

            public final void onClick(View view)
            {
                DisplayNameSettingsFragment.e(a).setVisibility(8);
                DisplayNameSettingsFragment.f(a).setVisibility(0);
                DisplayNameSettingsFragment.g(a);
                view = Bt.J();
                DisplayNameSettingsFragment.g(a);
                view = new mh(new Friend(Bt.q()), FriendAction.SET_DISPLAY_NAME, view);
                view.mFriendActionCompleteCallback = a;
                view.mAnalyticsContext = com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.SETTINGS_DISPLAYNAME_CHANGE;
                view.mShowFailureDialog = false;
                view.execute();
            }

            
            {
                a = DisplayNameSettingsFragment.this;
                super();
            }
        });
        b.setOnClickListener(new android.view.View.OnClickListener() {

            private DisplayNameSettingsFragment a;

            public final void onClick(View view)
            {
                DisplayNameSettingsFragment.h(a).setText("");
                DisplayNameSettingsFragment.h(a).setClickable(false);
                DisplayNameSettingsFragment.i(a).setVisibility(0);
                DisplayNameSettingsFragment.g(a);
                view = Bt.q();
                DisplayNameSettingsFragment.g(a);
                view = new Friend(view, Bt.K());
                String s = ((Friend) (view)).mDisplayName;
                view.a(DisplayNameSettingsFragment.a(a).getText().toString().trim());
                view = new mh(view, FriendAction.SET_DISPLAY_NAME, s);
                view.mFriendActionCompleteCallback = a;
                view.mAnalyticsContext = com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.SETTINGS_DISPLAYNAME_CHANGE;
                view.mShowFailureDialog = false;
                view.execute();
            }

            
            {
                a = DisplayNameSettingsFragment.this;
                super();
            }
        });
        h();
        return mFragmentLayout;
    }

    public void onVisible()
    {
        super.onVisible();
        h();
    }
}
