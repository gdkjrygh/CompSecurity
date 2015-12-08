// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments;

import Bt;
import Gc;
import II;
import Jo;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.snapchat.android.Timber;
import com.snapchat.android.api2.LogoutTask;
import com.snapchat.android.database.SharedPreferenceKey;
import com.snapchat.android.util.HtmlTagHandler;
import com.snapchat.android.util.fragment.SnapchatFragment;
import lX;

public class TermsOfUseFragment extends SnapchatFragment
{

    private final lX a;
    private final Bt b;
    private final HtmlTagHandler c;
    private TextView d;

    public TermsOfUseFragment()
    {
        this(new lX(), Bt.a());
    }

    private TermsOfUseFragment(lX lx, Bt bt)
    {
        c = new HtmlTagHandler();
        a = lx;
        b = bt;
    }

    static void a(TermsOfUseFragment termsofusefragment)
    {
        termsofusefragment.h();
    }

    static Bt b(TermsOfUseFragment termsofusefragment)
    {
        return termsofusefragment.b;
    }

    static lX c(TermsOfUseFragment termsofusefragment)
    {
        return termsofusefragment.a;
    }

    private void h()
    {
        Gc gc = (new Gc(getActivity())).b(0x7f0802de);
        gc.k = true;
        gc.a(0x7f0802dd, new Gc.a() {

            private TermsOfUseFragment a;

            public final void a(Gc gc1)
            {
                TermsOfUseFragment.c(a);
                (new LogoutTask()).a(com.snapchat.android.api2.LogoutTask.LogoutReason.TERMS_OF_USE, new String[0]).execute();
                gc1 = a.getActivity();
                gc1.setResult(1);
                gc1.finish();
            }

            
            {
                a = TermsOfUseFragment.this;
                super();
            }
        }).b(0x7f08007f, null).b();
    }

    public final boolean f()
    {
        h();
        return true;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f0400f7, viewgroup, false);
        layoutinflater = (TextView)d(0x7f0d0514);
        viewgroup = (TextView)d(0x7f0d0515);
        bundle = Html.fromHtml(getString(0x7f0802df), null, c);
        Timber.c("TermsOfUseFragment", (new StringBuilder("styledHtml: ")).append(bundle).toString(), new Object[0]);
        viewgroup.setText(bundle);
        d(0x7f0d0510).setOnClickListener(new android.view.View.OnClickListener() {

            private TermsOfUseFragment a;

            public final void onClick(View view)
            {
                TermsOfUseFragment.a(a);
            }

            
            {
                a = TermsOfUseFragment.this;
                super();
            }
        });
        d = (TextView)d(0x7f0d0511);
        d.setOnClickListener(new android.view.View.OnClickListener() {

            private TermsOfUseFragment a;

            public final void onClick(View view)
            {
                II.b(SharedPreferenceKey.DEVELOPER_OPTIONS_SHOW_TERMS_OF_USE.getKey(), false);
                TermsOfUseFragment.b(a);
                Bt.af();
                view = a.getActivity();
                view.setResult(-1);
                view.finish();
            }

            
            {
                a = TermsOfUseFragment.this;
                super();
            }
        });
        bundle = (ImageView)d(0x7f0d0513);
        float f1 = Jo.c(getActivity());
        int i;
        int j;
        int k;
        if (f1 <= 450F)
        {
            Timber.c("TermsOfUseFragment", (new StringBuilder("Small screen configuration - screenheight ")).append(f1).toString(), new Object[0]);
            k = 0x7f020276;
            j = 0x7f0a0156;
            i = 0x7f0a0153;
            f1 = 0.85F;
        } else
        if (f1 <= 800F)
        {
            Timber.c("TermsOfUseFragment", (new StringBuilder("Normal screen configuration - screenheight ")).append(f1).toString(), new Object[0]);
            k = 0x7f020275;
            j = 0x7f0a0155;
            i = 0x7f0a0152;
            f1 = 0.9F;
        } else
        {
            Timber.c("TermsOfUseFragment", (new StringBuilder("Large screen configuration - screenheight ")).append(f1).toString(), new Object[0]);
            k = 0x7f020274;
            j = 0x7f0a0154;
            i = 0x7f0a0151;
            f1 = 1.0F;
        }
        bundle.setImageResource(k);
        bundle = getResources();
        layoutinflater.setTextSize(0, bundle.getDimensionPixelSize(j));
        layoutinflater.setLineSpacing(0.0F, f1);
        viewgroup.setTextSize(0, bundle.getDimensionPixelSize(i));
        viewgroup.setLineSpacing(0.0F, f1);
        return mFragmentLayout;
    }

    public void onResume()
    {
        super.onResume();
        ac().setSoftInputMode(3);
    }
}
