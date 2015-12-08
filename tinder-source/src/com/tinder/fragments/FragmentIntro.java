// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.text.Html;
import android.text.Layout;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.d;
import com.facebook.login.LoginBehavior;
import com.facebook.login.widget.LoginButton;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.f;
import com.viewpagerindicator.CirclePageIndicator;

public final class FragmentIntro extends Fragment
{
    private static class TinderURLSpan extends URLSpan
    {

        public void updateDrawState(TextPaint textpaint)
        {
            super.updateDrawState(textpaint);
            textpaint.setUnderlineText(false);
            textpaint.setFakeBoldText(true);
        }

        public TinderURLSpan(String s)
        {
            super(s);
        }
    }

    public static interface a
        extends com.facebook.f
    {

        public abstract void d();

        public abstract d z_();
    }

    public static interface b
    {

        public abstract void e();

        public abstract void f();
    }

    private final class c extends LinkMovementMethod
    {

        final FragmentIntro a;

        public final boolean onTouchEvent(TextView textview, Spannable spannable, MotionEvent motionevent)
        {
label0:
            {
                if (motionevent.getAction() == 1)
                {
                    int i = (int)motionevent.getX();
                    int j = (int)motionevent.getY();
                    int k = textview.getTotalPaddingLeft();
                    int l = textview.getTotalPaddingTop();
                    int i1 = textview.getScrollX();
                    int j1 = textview.getScrollY();
                    Layout layout = textview.getLayout();
                    i = layout.getOffsetForHorizontal(layout.getLineForVertical((j - l) + j1), (i - k) + i1);
                    URLSpan aurlspan[] = (URLSpan[])spannable.getSpans(i, i, android/text/style/URLSpan);
                    if (aurlspan.length != 0)
                    {
                        spannable = aurlspan[0].getURL();
                        if (spannable.endsWith("#terms"))
                        {
                            textview.clearFocus();
                            if (a.d != null)
                            {
                                a.d.e();
                                return true;
                            }
                        } else
                        {
                            if (!spannable.endsWith("#privacy"))
                            {
                                break label0;
                            }
                            textview.clearFocus();
                            if (a.d != null)
                            {
                                a.d.f();
                            }
                        }
                        return true;
                    }
                }
                return super.onTouchEvent(textview, spannable, motionevent);
            }
            return false;
        }

        private c()
        {
            a = FragmentIntro.this;
            super();
        }

        c(byte byte0)
        {
            this();
        }
    }


    protected ViewPager a;
    protected LoginButton b;
    TextView c;
    b d;
    a e;
    f f;

    public FragmentIntro()
    {
    }

    public final void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        d d1 = e.z_();
        if (d1 != null)
        {
            d1.a(i, j, intent);
        }
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        ManagerApp.h().a(this);
        if (activity instanceof b)
        {
            d = (b)activity;
        }
        if (activity instanceof a)
        {
            e = (a)activity;
        }
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03009f, viewgroup, false);
        a = (ViewPager)layoutinflater.findViewById(0x7f0e02e7);
        viewgroup = (CirclePageIndicator)layoutinflater.findViewById(0x7f0e02e6);
        b = (LoginButton)layoutinflater.findViewById(0x7f0e02eb);
        b.setReadPermissions(f.b());
        b.setFragment(this);
        c = (TextView)layoutinflater.findViewById(0x7f0e02e9);
        c.setText(Html.fromHtml(getString(0x7f0601fa)));
        c.setMovementMethod(new c((byte)0));
        c.setHighlightColor(getResources().getColor(0x7f0d0107));
        bundle = c;
        Spannable spannable = (Spannable)bundle.getText();
        URLSpan aurlspan[] = (URLSpan[])spannable.getSpans(0, spannable.length(), android/text/style/URLSpan);
        int j = aurlspan.length;
        for (int i = 0; i < j; i++)
        {
            URLSpan urlspan = aurlspan[i];
            int k = spannable.getSpanStart(urlspan);
            int l = spannable.getSpanEnd(urlspan);
            spannable.removeSpan(urlspan);
            spannable.setSpan(new TinderURLSpan(urlspan.getURL()), k, l, 0);
        }

        bundle.setText(spannable);
        layoutinflater.findViewById(0x7f0e02ea).setOnClickListener(new android.view.View.OnClickListener() {

            final FragmentIntro a;

            public final void onClick(View view)
            {
                if (a.e != null)
                {
                    a.e.d();
                }
                LoginButton loginbutton = a.b;
                if (ManagerApp.b)
                {
                    view = LoginBehavior.a;
                } else
                {
                    view = LoginBehavior.c;
                }
                loginbutton.setLoginBehavior(view);
                a.b.performClick();
            }

            
            {
                a = FragmentIntro.this;
                super();
            }
        });
        bundle = new com.tinder.adapters.ak(getChildFragmentManager());
        a.setAdapter(bundle);
        viewgroup.setFillColor(getResources().getColor(0x7f0d008b));
        viewgroup.setPageColor(getResources().getColor(0x7f0d0113));
        viewgroup.setStrokeColor(getResources().getColor(0x7f0d008b));
        viewgroup.setViewPager(a);
        viewgroup.setCurrentItem(0);
        return layoutinflater;
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (e != null)
        {
            view = b;
            bundle = e.z_();
            a a1 = e;
            view.getLoginManager().a(bundle, a1);
        }
    }
}
