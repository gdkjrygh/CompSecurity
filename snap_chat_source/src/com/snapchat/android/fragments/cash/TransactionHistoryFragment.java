// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.cash;

import Ll;
import TE;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.fragments.settings.WebFragment;
import rZ;

public class TransactionHistoryFragment extends WebFragment
{
    final class a extends WebViewClient
    {

        private boolean a;
        private TransactionHistoryFragment b;

        public final void onPageFinished(WebView webview, String s)
        {
            super.onPageFinished(webview, s);
            if (b.a != null)
            {
                s = b.a.a();
                if (s == null)
                {
                    throw new RuntimeException("We shouldn't ever be creating a SquareRequestTask with a null CashAuthToken!");
                }
                webview.loadUrl((new StringBuilder("javascript:var authorizationToken='Bearer ")).append(s.a()).append("';").toString());
                a = true;
                TransactionHistoryFragment.a(b);
            }
        }

        public final boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            if (!a)
            {
                return false;
            } else
            {
                webview = new Intent("android.intent.action.VIEW", Uri.parse(s));
                b.startActivity(webview);
                return true;
            }
        }

        private a()
        {
            b = TransactionHistoryFragment.this;
            super();
            a = false;
        }

        a(byte byte0)
        {
            this();
        }
    }


    public rZ a;

    public TransactionHistoryFragment()
    {
        SnapchatApplication.getDIComponent().a(this);
    }

    public TransactionHistoryFragment(String s)
    {
        super(null, s);
        SnapchatApplication.getDIComponent().a(this);
    }

    static void a(TransactionHistoryFragment transactionhistoryfragment)
    {
        transactionhistoryfragment.d(0x7f0d04c0).setVisibility(8);
    }

    public final void a(String s)
    {
        s = Uri.parse(s).buildUpon();
        s.appendQueryParameter("client", "chartreuse");
        super.a(s.build().toString());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f0400e7, viewgroup, false);
        a(bundle);
        b.getSettings().setJavaScriptEnabled(true);
        b.setWebViewClient(new a((byte)0));
        return mFragmentLayout;
    }
}
