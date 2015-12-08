// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login.widget;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.AccessToken;
import com.facebook.Profile;
import com.facebook.i;
import com.facebook.internal.L;
import com.facebook.internal.U;
import com.facebook.l;
import com.facebook.login.g;
import com.facebook.login.o;
import com.facebook.s;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.login.widget:
//            f, h, i, c, 
//            a, d

public class LoginButton extends l
{
    static final class a
    {

        com.facebook.login.a a;
        List b;
        L c;
        g d;

        a()
        {
            a = com.facebook.login.a.c;
            b = Collections.emptyList();
            c = null;
            d = g.a;
        }
    }

    private final class b
        implements android.view.View.OnClickListener
    {

        final LoginButton a;

        public final void onClick(View view)
        {
            LoginButton.a(a, view);
            Object obj1 = a.getContext();
            AccessToken accesstoken = AccessToken.a();
            int i1;
            if (accesstoken != null)
            {
                if (LoginButton.c(a))
                {
                    Object obj = a.getResources().getString(com.facebook.O.f.com_facebook_loginview_log_out_action);
                    String s1 = a.getResources().getString(com.facebook.O.f.com_facebook_loginview_cancel_action);
                    view = Profile.a();
                    if (view != null && ((Profile) (view)).a != null)
                    {
                        view = String.format(a.getResources().getString(com.facebook.O.f.com_facebook_loginview_logged_in_as), new Object[] {
                            ((Profile) (view)).a
                        });
                    } else
                    {
                        view = a.getResources().getString(com.facebook.O.f.com_facebook_loginview_logged_in_using_facebook);
                    }
                    obj1 = new android.app.AlertDialog.Builder(((Context) (obj1)));
                    ((android.app.AlertDialog.Builder) (obj1)).setMessage(view).setCancelable(true).setPositiveButton(((CharSequence) (obj)), new d(this)).setNegativeButton(s1, null);
                    ((android.app.AlertDialog.Builder) (obj1)).create().show();
                } else
                {
                    a.d();
                    com.facebook.login.o.b();
                }
            } else
            {
                view = a.d();
                view.b = a.c.a;
                view.a = a.c.d;
                if (L.b.equals(LoginButton.d(a).c))
                {
                    if (((l) (a)).b != null)
                    {
                        view.b(((l) (a)).b, LoginButton.d(a).b);
                    } else
                    {
                        view.b(LoginButton.e(a), LoginButton.d(a).b);
                    }
                } else
                if (((l) (a)).b != null)
                {
                    view.a(((l) (a)).b, LoginButton.d(a).b);
                } else
                {
                    view.a(LoginButton.f(a), LoginButton.d(a).b);
                }
            }
            view = com.facebook.a.a.a(a.getContext());
            obj = new Bundle();
            if (accesstoken != null)
            {
                i1 = 0;
            } else
            {
                i1 = 1;
            }
            ((Bundle) (obj)).putInt("logging_in", i1);
            view.a(com.facebook.login.widget.LoginButton.g(a), ((Bundle) (obj)), true);
        }

        private b()
        {
            a = LoginButton.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }

    public static final class c extends Enum
    {

        public static final c a;
        public static final c b;
        public static final c c;
        public static c d;
        private static final c g[];
        int e;
        private String f;

        public static c a(int i1)
        {
            c ac[] = values();
            int k1 = ac.length;
            for (int j1 = 0; j1 < k1; j1++)
            {
                c c1 = ac[j1];
                if (c1.e == i1)
                {
                    return c1;
                }
            }

            return null;
        }

        public static c valueOf(String s1)
        {
            return (c)Enum.valueOf(com/facebook/login/widget/LoginButton$c, s1);
        }

        public static c[] values()
        {
            return (c[])g.clone();
        }

        public final String toString()
        {
            return f;
        }

        static 
        {
            a = new c("AUTOMATIC", 0, "automatic", 0);
            b = new c("DISPLAY_ALWAYS", 1, "display_always", 1);
            c = new c("NEVER_DISPLAY", 2, "never_display", 2);
            g = (new c[] {
                a, b, c
            });
            d = a;
        }

        private c(String s1, int i1, String s2, int j1)
        {
            super(s1, i1);
            f = s2;
            e = j1;
        }
    }


    private static final String d = com/facebook/login/widget/LoginButton.getName();
    a c;
    private boolean e;
    private String f;
    private String g;
    private String h;
    private boolean i;
    private int j;
    private c k;
    private long l;
    private f m;
    private i n;
    private o o;

    public LoginButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, 0, "fb_login_button_create");
        c = new a();
        h = "fb_login_view_usage";
        j = f.b.a;
        l = 6000L;
    }

    public LoginButton(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1, "fb_login_button_create");
        c = new a();
        h = "fb_login_view_usage";
        j = f.b.a;
        l = 6000L;
    }

    static Activity a(LoginButton loginbutton)
    {
        return loginbutton.b();
    }

    static void a(LoginButton loginbutton, View view)
    {
        loginbutton.a(view);
    }

    static void a(LoginButton loginbutton, com.facebook.internal.U.b b1)
    {
        if (b1 != null && b1.c && loginbutton.getVisibility() == 0)
        {
            loginbutton.b(b1.b);
        }
    }

    static void b(LoginButton loginbutton)
    {
        loginbutton.f();
    }

    private void b(String s1)
    {
        m = new f(s1, this);
        m.f = j;
        m.g = l;
        s1 = m;
        if (((f) (s1)).b.get() != null)
        {
            s1.d = new f.a(s1, ((f) (s1)).c);
            ((TextView)((f) (s1)).d.findViewById(com.facebook.O.d.com_facebook_tooltip_bubble_view_text_body)).setText(((f) (s1)).a);
            View view;
            int i1;
            int j1;
            if (((f) (s1)).f == f.b.a)
            {
                com.facebook.login.widget.f.a.a(((f) (s1)).d).setBackgroundResource(com.facebook.O.c.com_facebook_tooltip_blue_background);
                com.facebook.login.widget.f.a.b(((f) (s1)).d).setImageResource(com.facebook.O.c.com_facebook_tooltip_blue_bottomnub);
                com.facebook.login.widget.f.a.c(((f) (s1)).d).setImageResource(com.facebook.O.c.com_facebook_tooltip_blue_topnub);
                com.facebook.login.widget.f.a.d(((f) (s1)).d).setImageResource(com.facebook.O.c.com_facebook_tooltip_blue_xout);
            } else
            {
                com.facebook.login.widget.f.a.a(((f) (s1)).d).setBackgroundResource(com.facebook.O.c.com_facebook_tooltip_black_background);
                com.facebook.login.widget.f.a.b(((f) (s1)).d).setImageResource(com.facebook.O.c.com_facebook_tooltip_black_bottomnub);
                com.facebook.login.widget.f.a.c(((f) (s1)).d).setImageResource(com.facebook.O.c.com_facebook_tooltip_black_topnub);
                com.facebook.login.widget.f.a.d(((f) (s1)).d).setImageResource(com.facebook.O.c.com_facebook_tooltip_black_xout);
            }
            view = ((Activity)((f) (s1)).c).getWindow().getDecorView();
            i1 = view.getWidth();
            j1 = view.getHeight();
            s1.b();
            if (((f) (s1)).b.get() != null)
            {
                ((View)((f) (s1)).b.get()).getViewTreeObserver().addOnScrollChangedListener(((f) (s1)).h);
            }
            ((f) (s1)).d.measure(android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x80000000), android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x80000000));
            s1.e = new PopupWindow(((f) (s1)).d, ((f) (s1)).d.getMeasuredWidth(), ((f) (s1)).d.getMeasuredHeight());
            ((f) (s1)).e.showAsDropDown((View)((f) (s1)).b.get());
            if (((f) (s1)).e != null && ((f) (s1)).e.isShowing())
            {
                if (((f) (s1)).e.isAboveAnchor())
                {
                    ((f) (s1)).d.b();
                } else
                {
                    ((f) (s1)).d.a();
                }
            }
            if (((f) (s1)).g > 0L)
            {
                ((f) (s1)).d.postDelayed(new h(s1), ((f) (s1)).g);
            }
            ((f) (s1)).e.setTouchable(true);
            ((f) (s1)).d.setOnClickListener(new com.facebook.login.widget.i(s1));
        }
    }

    private int c(String s1)
    {
        return a(s1) + (getCompoundPaddingLeft() + getCompoundDrawablePadding()) + getCompoundPaddingRight();
    }

    static boolean c(LoginButton loginbutton)
    {
        return loginbutton.e;
    }

    static a d(LoginButton loginbutton)
    {
        return loginbutton.c;
    }

    static Activity e(LoginButton loginbutton)
    {
        return loginbutton.b();
    }

    private void e()
    {
        if (m != null)
        {
            m.a();
            m = null;
        }
    }

    static Activity f(LoginButton loginbutton)
    {
        return loginbutton.b();
    }

    private void f()
    {
        Resources resources = getResources();
        if (!isInEditMode() && AccessToken.a() != null)
        {
            String s1;
            if (g != null)
            {
                s1 = g;
            } else
            {
                s1 = resources.getString(com.facebook.O.f.com_facebook_loginview_log_out_button);
            }
            setText(s1);
            return;
        }
        if (f != null)
        {
            setText(f);
            return;
        }
        String s3 = resources.getString(com.facebook.O.f.com_facebook_loginview_log_in_button_long);
        int i1 = getWidth();
        String s2 = s3;
        if (i1 != 0)
        {
            s2 = s3;
            if (c(s3) > i1)
            {
                s2 = resources.getString(com.facebook.O.f.com_facebook_loginview_log_in_button);
            }
        }
        setText(s2);
    }

    static String g(LoginButton loginbutton)
    {
        return loginbutton.h;
    }

    protected final int a()
    {
        return com.facebook.internal.m.b.a.a();
    }

    protected final void a(Context context, AttributeSet attributeset, int i1, int j1)
    {
        super.a(context, attributeset, i1, j1);
        super.a = new b((byte)0);
        k = c.d;
        context = context.getTheme().obtainStyledAttributes(attributeset, com.facebook.O.h.com_facebook_login_view, i1, j1);
        e = context.getBoolean(com.facebook.O.h.com_facebook_login_view_com_facebook_confirm_logout, true);
        f = context.getString(com.facebook.O.h.com_facebook_login_view_com_facebook_login_text);
        g = context.getString(com.facebook.O.h.com_facebook_login_view_com_facebook_logout_text);
        k = c.a(context.getInt(com.facebook.O.h.com_facebook_login_view_com_facebook_tooltip_mode, c.d.e));
        context.recycle();
        if (isInEditMode())
        {
            setBackgroundColor(getResources().getColor(com.facebook.O.a.com_facebook_blue));
            f = "Log in with Facebook";
        } else
        {
            n = new com.facebook.login.widget.c(this);
        }
        f();
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    protected final int c()
    {
        return com.facebook.O.g.com_facebook_loginview_default_style;
    }

    final o d()
    {
        if (o == null)
        {
            o = com.facebook.login.o.a();
        }
        return o;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (n != null && !n.c)
        {
            n.a();
            f();
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (n != null)
        {
            i i1 = n;
            if (i1.c)
            {
                i1.b.unregisterReceiver(i1.a);
                i1.c = false;
            }
        }
        e();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (i || isInEditMode()) goto _L2; else goto _L1
_L1:
        i = true;
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[c.values().length];
                try
                {
                    a[c.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[c.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[c.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[k.ordinal()];
        JVM INSTR tableswitch 1 2: default 56
    //                   1 57
    //                   2 83;
           goto _L2 _L3 _L4
_L2:
        return;
_L3:
        canvas = U.a(getContext());
        s.d().execute(new com.facebook.login.widget.a(this, canvas));
        return;
_L4:
        b(getResources().getString(com.facebook.O.f.com_facebook_tooltip_default));
        return;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        f();
    }

    protected void onMeasure(int i1, int j1)
    {
        Object obj = getPaint().getFontMetrics();
        j1 = getCompoundPaddingTop();
        float f1 = Math.abs(((android.graphics.Paint.FontMetrics) (obj)).top);
        int k1 = (int)Math.ceil(Math.abs(((android.graphics.Paint.FontMetrics) (obj)).bottom) + f1);
        int l1 = getCompoundPaddingBottom();
        Resources resources = getResources();
        String s1 = f;
        obj = s1;
        if (s1 == null)
        {
            obj = resources.getString(com.facebook.O.f.com_facebook_loginview_log_in_button_long);
            int i2 = c(((String) (obj)));
            if (resolveSize(i2, i1) < i2)
            {
                obj = resources.getString(com.facebook.O.f.com_facebook_loginview_log_in_button);
            }
        }
        int j2 = c(((String) (obj)));
        s1 = g;
        obj = s1;
        if (s1 == null)
        {
            obj = resources.getString(com.facebook.O.f.com_facebook_loginview_log_out_button);
        }
        setMeasuredDimension(resolveSize(Math.max(j2, c(((String) (obj)))), i1), l1 + (k1 + j1));
    }

    protected void onVisibilityChanged(View view, int i1)
    {
        super.onVisibilityChanged(view, i1);
        if (i1 != 0)
        {
            e();
        }
    }

}
