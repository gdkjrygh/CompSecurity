// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.verification;

import Jo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.fragments.settings.WebFragment;

public class URLVerificationFragment extends WebFragment
{
    public static interface a
    {

        public abstract void a();

        public abstract void b();
    }

    final class b extends WebViewClient
    {

        private URLVerificationFragment a;

        public final void onPageFinished(WebView webview, String s)
        {
            super.onPageFinished(webview, s);
            URLVerificationFragment.a(a, false);
        }

        public final boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            URLVerificationFragment.a(a, true);
            Timber.b(URLVerificationFragment.m(), "CASH-LOG: Loading the URL: %s", new Object[] {
                s
            });
            URLVerificationFragment.b(a, false);
            if (!s.equals("https://support.snapchat.com/success")) goto _L2; else goto _L1
_L1:
            URLVerificationFragment.b(a, true);
            URLVerificationFragment.c(a, true);
_L4:
            if (URLVerificationFragment.a(a))
            {
                URLVerificationFragment.b(a);
            }
            return URLVerificationFragment.a(a);
_L2:
            if (s.equals("https://support.snapchat.com/failure"))
            {
                URLVerificationFragment.b(a, true);
                URLVerificationFragment.c(a, false);
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        private b()
        {
            a = URLVerificationFragment.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }


    private static final String f = com/snapchat/android/fragments/verification/URLVerificationFragment.getSimpleName();
    public a a;
    public boolean d;
    public boolean e;

    public URLVerificationFragment()
    {
    }

    static void a(URLVerificationFragment urlverificationfragment, boolean flag)
    {
        if (flag)
        {
            urlverificationfragment.d(0x7f0d04c0).setVisibility(0);
            return;
        } else
        {
            urlverificationfragment.d(0x7f0d04c0).setVisibility(8);
            return;
        }
    }

    static boolean a(URLVerificationFragment urlverificationfragment)
    {
        return urlverificationfragment.d;
    }

    static void b(URLVerificationFragment urlverificationfragment)
    {
        Jo.a(urlverificationfragment.getActivity(), urlverificationfragment.mFragmentLayout);
        urlverificationfragment.getActivity().onBackPressed();
    }

    static boolean b(URLVerificationFragment urlverificationfragment, boolean flag)
    {
        urlverificationfragment.d = flag;
        return flag;
    }

    static boolean c(URLVerificationFragment urlverificationfragment, boolean flag)
    {
        urlverificationfragment.e = flag;
        return flag;
    }

    static String m()
    {
        return f;
    }

    private void n()
    {
        if (a != null)
        {
            if (e)
            {
                AnalyticsEvents.v();
                a.a();
            } else
            {
                if (d)
                {
                    AnalyticsEvents.w();
                } else
                {
                    AnalyticsEvents.x();
                }
                a.b();
            }
        }
        a = null;
    }

    public final void a(String s)
    {
        s = Uri.parse(s).buildUpon();
        s.appendQueryParameter("success_url", "https://support.snapchat.com/success");
        s.appendQueryParameter("failure_url", "https://support.snapchat.com/failure");
        s.appendQueryParameter("client", "chartreuse");
        s = s.build().toString();
        Timber.b(f, "CASH-LOG: Setting the URL to %s", new Object[] {
            s
        });
        super.a(s);
    }

    protected final com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode b()
    {
        return com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode.DRAW_BELOW_FOR_ADJUSTABLE_UI;
    }

    public final boolean f()
    {
        n();
        return false;
    }

    protected final void h()
    {
        n();
        getActivity().onBackPressed();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f0400e7, viewgroup, false);
        a(bundle);
        b.getSettings().setJavaScriptEnabled(true);
        b.setWebViewClient(new b((byte)0));
        return mFragmentLayout;
    }

}
