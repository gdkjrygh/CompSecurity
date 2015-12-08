// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.cash;

import TE;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import rZ;

// Referenced classes of package com.snapchat.android.fragments.cash:
//            TransactionHistoryFragment

final class <init> extends WebViewClient
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

    private (TransactionHistoryFragment transactionhistoryfragment)
    {
        b = transactionhistoryfragment;
        super();
        a = false;
    }

    a(TransactionHistoryFragment transactionhistoryfragment, byte byte0)
    {
        this(transactionhistoryfragment);
    }
}
