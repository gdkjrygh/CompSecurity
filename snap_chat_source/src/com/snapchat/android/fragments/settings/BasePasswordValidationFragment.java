// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import Iq;
import Jo;
import Pi;
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
import com.snapchat.android.ui.LinkFriendlyTextView;
import com.snapchat.android.util.fragment.SnapchatFragment;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            LeftSwipeSettingFragment

public class BasePasswordValidationFragment extends LeftSwipeSettingFragment
{

    public EditText a;
    public Button b;
    public View c;
    private View d;
    private TextView e;

    public BasePasswordValidationFragment()
    {
    }

    public final void a(String s)
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

    public final void e()
    {
        super.e();
        Jo.a(getActivity(), ac().getDecorView().getRootView());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f0400cf, viewgroup, false);
        Pi.a();
        if (!Pi.d())
        {
            ((LinkFriendlyTextView)d(0x7f0d0339)).setText(0x7f0800fe);
        }
        d(0x7f0d046b).setOnClickListener(new android.view.View.OnClickListener() {

            private BasePasswordValidationFragment a;

            public final void onClick(View view)
            {
                Jo.a(a.getActivity(), a.getView());
                a.getActivity().onBackPressed();
            }

            
            {
                a = BasePasswordValidationFragment.this;
                super();
            }
        });
        b = (Button)d(0x7f0d0472);
        layoutinflater = b;
        getActivity().getAssets();
        Iq.a(layoutinflater);
        c = d(0x7f0d0473);
        d = d(0x7f0d0470);
        e = (TextView)d(0x7f0d0471);
        d.setOnClickListener(new android.view.View.OnClickListener() {

            private BasePasswordValidationFragment a;

            public final void onClick(View view)
            {
                a.a.setText("");
                a.a(null);
            }

            
            {
                a = BasePasswordValidationFragment.this;
                super();
            }
        });
        a = (EditText)d(0x7f0d046f);
        a.addTextChangedListener(new TextWatcher() {

            private BasePasswordValidationFragment a;

            public final void afterTextChanged(Editable editable)
            {
                editable = a;
                if (!TextUtils.isEmpty(((BasePasswordValidationFragment) (editable)).a.getText()))
                {
                    ((BasePasswordValidationFragment) (editable)).b.setText(0x7f080216);
                    ((BasePasswordValidationFragment) (editable)).b.setClickable(true);
                    ((BasePasswordValidationFragment) (editable)).b.setVisibility(0);
                } else
                {
                    ((BasePasswordValidationFragment) (editable)).b.setVisibility(8);
                }
                a.a(null);
            }

            public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
            {
            }

            
            {
                a = BasePasswordValidationFragment.this;
                super();
            }
        });
        return mFragmentLayout;
    }

    public void onResume()
    {
        super.onResume();
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
