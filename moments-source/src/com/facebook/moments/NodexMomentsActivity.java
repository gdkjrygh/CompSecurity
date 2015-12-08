// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.moments;

import android.content.ComponentName;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.facebook.nodex.resources.NodexResources;
import com.facebook.nodex.startup.splashscreen.AbstractNodexSplashActivity;
import java.util.HashSet;
import java.util.Set;

public class NodexMomentsActivity extends AbstractNodexSplashActivity
{

    private Animation f;
    private Animation g;
    private Animation h;
    private Animation i;
    private Animation j;
    private View k;
    private View l;
    private TextView m;
    private TextView n;
    private boolean o;
    private boolean p;

    public NodexMomentsActivity()
    {
    }

    private int a(String s)
    {
        return getResources().getIdentifier(s, "anim", getPackageName());
    }

    static View a(NodexMomentsActivity nodexmomentsactivity)
    {
        return nodexmomentsactivity.l;
    }

    private View b(String s)
    {
        return findViewById(c.b(s));
    }

    static TextView b(NodexMomentsActivity nodexmomentsactivity)
    {
        return nodexmomentsactivity.m;
    }

    static Animation c(NodexMomentsActivity nodexmomentsactivity)
    {
        return nodexmomentsactivity.h;
    }

    static boolean d(NodexMomentsActivity nodexmomentsactivity)
    {
        nodexmomentsactivity.p = true;
        return true;
    }

    static void e(NodexMomentsActivity nodexmomentsactivity)
    {
        nodexmomentsactivity.q();
    }

    static void f(NodexMomentsActivity nodexmomentsactivity)
    {
        nodexmomentsactivity.p();
    }

    private void n()
    {
        k = b("image_logo");
        l = b("text_logo");
        m = (TextView)b("logo_note_text");
        n = (TextView)b("loading_text");
        f = AnimationUtils.loadAnimation(this, a("login_nux_image_logo_enter"));
        i = AnimationUtils.loadAnimation(this, a("login_nux_image_logo_loading"));
        g = AnimationUtils.loadAnimation(this, a("login_nux_text_logo_enter"));
        h = AnimationUtils.loadAnimation(this, a("login_nux_subtitle_fade_in"));
        j = AnimationUtils.loadAnimation(this, a("login_nux_loading_fade_in"));
    }

    private void o()
    {
        o = true;
        g.setAnimationListener(new _cls1());
        h.setAnimationListener(new _cls2());
        k.startAnimation(f);
        l.startAnimation(g);
    }

    private void p()
    {
        k.startAnimation(i);
        n.setVisibility(0);
        n.startAnimation(j);
    }

    private void q()
    {
        l();
        PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("fresh_install_nux_shown", true).commit();
    }

    protected final String a()
    {
        return "nodex_moments_activity";
    }

    protected final String b()
    {
        return null;
    }

    protected final String c()
    {
        return null;
    }

    protected final String d()
    {
        return null;
    }

    protected final String e()
    {
        return "nodex_upgrading_message_string";
    }

    protected final String f()
    {
        return "nodex_main_app_loading_message_string";
    }

    protected final String g()
    {
        return getPackageName();
    }

    protected final Uri h()
    {
        return Uri.parse("content://com.facebook.moments");
    }

    protected final ComponentName i()
    {
        return new ComponentName(this, "com.facebook.moments.login.LoginActivity");
    }

    protected final Set j()
    {
        return new HashSet();
    }

    protected final void k()
    {
        super.k();
        n();
    }

    protected final void m()
    {
        if (PreferenceManager.getDefaultSharedPreferences(this).getBoolean("fresh_install_nux_shown", false) || p)
        {
            super.m();
        }
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        if (flag && !o)
        {
            o();
        }
    }

    private class _cls1
        implements android.view.animation.Animation.AnimationListener
    {

        final NodexMomentsActivity a;

        public void onAnimationEnd(Animation animation)
        {
            NodexMomentsActivity.a(a).setVisibility(4);
            NodexMomentsActivity.b(a).setVisibility(0);
            NodexMomentsActivity.b(a).startAnimation(NodexMomentsActivity.c(a));
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
        }

        _cls1()
        {
            a = NodexMomentsActivity.this;
            super();
        }
    }


    private class _cls2
        implements android.view.animation.Animation.AnimationListener
    {

        final NodexMomentsActivity a;

        public void onAnimationEnd(Animation animation)
        {
            NodexMomentsActivity.d(a);
            NodexMomentsActivity.e(a);
            NodexMomentsActivity.f(a);
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
        }

        _cls2()
        {
            a = NodexMomentsActivity.this;
            super();
        }
    }

}
