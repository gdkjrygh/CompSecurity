// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;

public class bt extends Fragment
{

    public static final String a = com/tinder/fragments/bt.getSimpleName();
    private ProgressBar b;
    private WebView c;

    public bt()
    {
    }

    static ProgressBar a(bt bt1)
    {
        return bt1.b;
    }

    public static bt a(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("url", s);
        s = new bt();
        s.setArguments(bundle);
        return s;
    }

    static WebView b(bt bt1)
    {
        return bt1.c;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        return layoutinflater.inflate(0x7f030059, viewgroup, false);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        c = (WebView)view.findViewById(0x7f0e0196);
        b = (ProgressBar)view.findViewById(0x7f0e0197);
        view = getArguments().getString("url");
        c.getSettings().setJavaScriptEnabled(true);
        c.setWebChromeClient(new WebChromeClient() {

            final bt a;

            public final void onProgressChanged(WebView webview, int i)
            {
                bt.a(a).setProgress(i);
                if (i == 100)
                {
                    bt.a(a).animate().alpha(0.0F).setListener(new AnimatorListenerAdapter(this) {

                        final _cls1 a;

                        public final void onAnimationEnd(Animator animator)
                        {
                            bt.a(a.a).setVisibility(8);
                        }

            
            {
                a = _pcls1;
                super();
            }
                    });
                    bt.b(a).setAlpha(0.0F);
                    bt.b(a).animate().alpha(1.0F);
                }
            }

            
            {
                a = bt.this;
                super();
            }
        });
        c.loadUrl(view);
    }

}
