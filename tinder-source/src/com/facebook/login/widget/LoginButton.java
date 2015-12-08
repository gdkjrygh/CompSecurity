// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login.widget;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
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
import com.facebook.appevents.AppEventsLogger;
import com.facebook.c;
import com.facebook.e;
import com.facebook.g;
import com.facebook.internal.LoginAuthorizationType;
import com.facebook.internal.m;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginBehavior;
import com.facebook.login.d;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.login.widget:
//            ToolTipPopup

public class LoginButton extends e
{
    public static final class ToolTipMode extends Enum
    {

        public static final ToolTipMode a;
        public static final ToolTipMode b;
        public static final ToolTipMode c;
        public static ToolTipMode d;
        private static final ToolTipMode g[];
        int e;
        private String f;

        public static ToolTipMode a(int i1)
        {
            ToolTipMode atooltipmode[] = values();
            int k1 = atooltipmode.length;
            for (int j1 = 0; j1 < k1; j1++)
            {
                ToolTipMode tooltipmode = atooltipmode[j1];
                if (tooltipmode.e == i1)
                {
                    return tooltipmode;
                }
            }

            return null;
        }

        public static ToolTipMode valueOf(String s)
        {
            return (ToolTipMode)Enum.valueOf(com/facebook/login/widget/LoginButton$ToolTipMode, s);
        }

        public static ToolTipMode[] values()
        {
            return (ToolTipMode[])g.clone();
        }

        public final String toString()
        {
            return f;
        }

        static 
        {
            a = new ToolTipMode("AUTOMATIC", 0, "automatic", 0);
            b = new ToolTipMode("DISPLAY_ALWAYS", 1, "display_always", 1);
            c = new ToolTipMode("NEVER_DISPLAY", 2, "never_display", 2);
            g = (new ToolTipMode[] {
                a, b, c
            });
            d = a;
        }

        private ToolTipMode(String s, int i1, String s1, int j1)
        {
            super(s, i1);
            f = s1;
            e = j1;
        }
    }

    static final class a
    {

        DefaultAudience a;
        List b;
        LoginAuthorizationType c;
        LoginBehavior d;

        public final void a(List list)
        {
            if (LoginAuthorizationType.b.equals(c))
            {
                throw new UnsupportedOperationException("Cannot call setReadPermissions after setPublishPermissions has been called.");
            } else
            {
                b = list;
                c = LoginAuthorizationType.a;
                return;
            }
        }

        public final void b(List list)
        {
            if (LoginAuthorizationType.a.equals(c))
            {
                throw new UnsupportedOperationException("Cannot call setPublishPermissions after setReadPermissions has been called.");
            }
            if (com.facebook.internal.m.a(list))
            {
                throw new IllegalArgumentException("Permissions for publish actions cannot be null or empty.");
            } else
            {
                b = list;
                c = LoginAuthorizationType.b;
                return;
            }
        }

        a()
        {
            a = DefaultAudience.c;
            b = Collections.emptyList();
            c = null;
            d = LoginBehavior.a;
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
                if (com.facebook.login.widget.LoginButton.c(a))
                {
                    Object obj = a.getResources().getString(com.facebook.p.e.com_facebook_loginview_log_out_action);
                    String s = a.getResources().getString(com.facebook.p.e.com_facebook_loginview_cancel_action);
                    view = Profile.a();
                    if (view != null && ((Profile) (view)).a != null)
                    {
                        view = String.format(a.getResources().getString(com.facebook.p.e.com_facebook_loginview_logged_in_as), new Object[] {
                            ((Profile) (view)).a
                        });
                    } else
                    {
                        view = a.getResources().getString(com.facebook.p.e.com_facebook_loginview_logged_in_using_facebook);
                    }
                    obj1 = new android.app.AlertDialog.Builder(((Context) (obj1)));
                    ((android.app.AlertDialog.Builder) (obj1)).setMessage(view).setCancelable(true).setPositiveButton(((CharSequence) (obj)), new android.content.DialogInterface.OnClickListener(this) {

                        final b a;

                        public final void onClick(DialogInterface dialoginterface, int i1)
                        {
                            a.a.getLoginManager();
                            com.facebook.login.d.b();
                        }

            
            {
                a = b1;
                super();
            }
                    }).setNegativeButton(s, null);
                    ((android.app.AlertDialog.Builder) (obj1)).create().show();
                } else
                {
                    a.getLoginManager();
                    com.facebook.login.d.b();
                }
            } else
            {
                view = a.getLoginManager();
                view.b = a.getDefaultAudience();
                view.a = a.getLoginBehavior();
                if (LoginAuthorizationType.b.equals(com.facebook.login.widget.LoginButton.d(a).c))
                {
                    if (a.getFragment() != null)
                    {
                        view.b(a.getFragment(), com.facebook.login.widget.LoginButton.d(a).b);
                    } else
                    {
                        view.b(com.facebook.login.widget.LoginButton.e(a), com.facebook.login.widget.LoginButton.d(a).b);
                    }
                } else
                if (a.getFragment() != null)
                {
                    view.a(a.getFragment(), com.facebook.login.widget.LoginButton.d(a).b);
                } else
                {
                    view.a(LoginButton.f(a), com.facebook.login.widget.LoginButton.d(a).b);
                }
            }
            view = AppEventsLogger.c(a.getContext());
            obj = new Bundle();
            if (accesstoken != null)
            {
                i1 = 0;
            } else
            {
                i1 = 1;
            }
            ((Bundle) (obj)).putInt("logging_in", i1);
            view.b(com.facebook.login.widget.LoginButton.g(a), ((Bundle) (obj)));
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


    private static final String b = com/facebook/login/widget/LoginButton.getName();
    private boolean c;
    private String d;
    private String e;
    private a f;
    private String g;
    private boolean h;
    private ToolTipPopup.Style i;
    private ToolTipMode j;
    private long k;
    private ToolTipPopup l;
    private c m;
    private d n;

    public LoginButton(Context context)
    {
        super(context, null, 0, 0, "fb_login_button_create", "fb_login_button_did_tap");
        f = new a();
        g = "fb_login_view_usage";
        i = ToolTipPopup.Style.a;
        k = 6000L;
    }

    public LoginButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, 0, 0, "fb_login_button_create", "fb_login_button_did_tap");
        f = new a();
        g = "fb_login_view_usage";
        i = ToolTipPopup.Style.a;
        k = 6000L;
    }

    public LoginButton(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1, 0, "fb_login_button_create", "fb_login_button_did_tap");
        f = new a();
        g = "fb_login_view_usage";
        i = ToolTipPopup.Style.a;
        k = 6000L;
    }

    static Activity a(LoginButton loginbutton)
    {
        return loginbutton.getActivity();
    }

    private void a()
    {
        if (l != null)
        {
            l.a();
            l = null;
        }
    }

    static void a(LoginButton loginbutton, View view)
    {
        if (((e) (loginbutton)).a != null)
        {
            ((e) (loginbutton)).a.onClick(view);
        }
    }

    static void a(LoginButton loginbutton, com.facebook.internal.m.b b1)
    {
        if (b1 != null && b1.c && loginbutton.getVisibility() == 0)
        {
            loginbutton.b(b1.b);
        }
    }

    private void b()
    {
        Resources resources = getResources();
        if (!isInEditMode() && AccessToken.a() != null)
        {
            String s;
            if (e != null)
            {
                s = e;
            } else
            {
                s = resources.getString(com.facebook.p.e.com_facebook_loginview_log_out_button);
            }
            setText(s);
            return;
        }
        if (d != null)
        {
            setText(d);
            return;
        }
        String s2 = resources.getString(com.facebook.p.e.com_facebook_loginview_log_in_button_long);
        int i1 = getWidth();
        String s1 = s2;
        if (i1 != 0)
        {
            s1 = s2;
            if (c(s2) > i1)
            {
                s1 = resources.getString(com.facebook.p.e.com_facebook_loginview_log_in_button);
            }
        }
        setText(s1);
    }

    static void b(LoginButton loginbutton)
    {
        loginbutton.b();
    }

    private void b(String s)
    {
        l = new ToolTipPopup(s, this);
        l.f = i;
        l.g = k;
        s = l;
        if (((ToolTipPopup) (s)).b.get() != null)
        {
            s.d = new ToolTipPopup.a(s, ((ToolTipPopup) (s)).c);
            ((TextView)((ToolTipPopup) (s)).d.findViewById(com.facebook.p.c.com_facebook_tooltip_bubble_view_text_body)).setText(((ToolTipPopup) (s)).a);
            View view;
            int i1;
            int j1;
            if (((ToolTipPopup) (s)).f == ToolTipPopup.Style.a)
            {
                ToolTipPopup.a.a(((ToolTipPopup) (s)).d).setBackgroundResource(com.facebook.p.b.com_facebook_tooltip_blue_background);
                ToolTipPopup.a.b(((ToolTipPopup) (s)).d).setImageResource(com.facebook.p.b.com_facebook_tooltip_blue_bottomnub);
                com.facebook.login.widget.ToolTipPopup.a.c(((ToolTipPopup) (s)).d).setImageResource(com.facebook.p.b.com_facebook_tooltip_blue_topnub);
                com.facebook.login.widget.ToolTipPopup.a.d(((ToolTipPopup) (s)).d).setImageResource(com.facebook.p.b.com_facebook_tooltip_blue_xout);
            } else
            {
                ToolTipPopup.a.a(((ToolTipPopup) (s)).d).setBackgroundResource(com.facebook.p.b.com_facebook_tooltip_black_background);
                ToolTipPopup.a.b(((ToolTipPopup) (s)).d).setImageResource(com.facebook.p.b.com_facebook_tooltip_black_bottomnub);
                com.facebook.login.widget.ToolTipPopup.a.c(((ToolTipPopup) (s)).d).setImageResource(com.facebook.p.b.com_facebook_tooltip_black_topnub);
                com.facebook.login.widget.ToolTipPopup.a.d(((ToolTipPopup) (s)).d).setImageResource(com.facebook.p.b.com_facebook_tooltip_black_xout);
            }
            view = ((Activity)((ToolTipPopup) (s)).c).getWindow().getDecorView();
            i1 = view.getWidth();
            j1 = view.getHeight();
            s.b();
            if (((ToolTipPopup) (s)).b.get() != null)
            {
                ((View)((ToolTipPopup) (s)).b.get()).getViewTreeObserver().addOnScrollChangedListener(((ToolTipPopup) (s)).h);
            }
            ((ToolTipPopup) (s)).d.measure(android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x80000000), android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x80000000));
            s.e = new PopupWindow(((ToolTipPopup) (s)).d, ((ToolTipPopup) (s)).d.getMeasuredWidth(), ((ToolTipPopup) (s)).d.getMeasuredHeight());
            ((ToolTipPopup) (s)).e.showAsDropDown((View)((ToolTipPopup) (s)).b.get());
            if (((ToolTipPopup) (s)).e != null && ((ToolTipPopup) (s)).e.isShowing())
            {
                if (((ToolTipPopup) (s)).e.isAboveAnchor())
                {
                    ((ToolTipPopup) (s)).d.b();
                } else
                {
                    ((ToolTipPopup) (s)).d.a();
                }
            }
            if (((ToolTipPopup) (s)).g > 0L)
            {
                ((ToolTipPopup) (s)).d.postDelayed(new ToolTipPopup._cls2(s), ((ToolTipPopup) (s)).g);
            }
            ((ToolTipPopup) (s)).e.setTouchable(true);
            ((ToolTipPopup) (s)).d.setOnClickListener(new ToolTipPopup._cls3(s));
        }
    }

    private int c(String s)
    {
        return a(s) + (getCompoundPaddingLeft() + getCompoundDrawablePadding()) + getCompoundPaddingRight();
    }

    static boolean c(LoginButton loginbutton)
    {
        return loginbutton.c;
    }

    static a d(LoginButton loginbutton)
    {
        return loginbutton.f;
    }

    static Activity e(LoginButton loginbutton)
    {
        return loginbutton.getActivity();
    }

    static Activity f(LoginButton loginbutton)
    {
        return loginbutton.getActivity();
    }

    static String g(LoginButton loginbutton)
    {
        return loginbutton.g;
    }

    protected final void a(Context context, AttributeSet attributeset, int i1, int j1)
    {
        super.a(context, attributeset, i1, j1);
        setInternalOnClickListener(new b((byte)0));
        j = com.facebook.login.widget.ToolTipMode.d;
        context = context.getTheme().obtainStyledAttributes(attributeset, com.facebook.p.g.com_facebook_login_view, i1, j1);
        c = context.getBoolean(com.facebook.p.g.com_facebook_login_view_com_facebook_confirm_logout, true);
        d = context.getString(com.facebook.p.g.com_facebook_login_view_com_facebook_login_text);
        e = context.getString(com.facebook.p.g.com_facebook_login_view_com_facebook_logout_text);
        j = ToolTipMode.a(context.getInt(com.facebook.p.g.com_facebook_login_view_com_facebook_tooltip_mode, com.facebook.login.widget.ToolTipMode.d.e));
        context.recycle();
        if (isInEditMode())
        {
            setBackgroundColor(getResources().getColor(com.facebook.p.a.com_facebook_blue));
            d = "Log in with Facebook";
        } else
        {
            m = new c() {

                final LoginButton d;

                protected final void a()
                {
                    LoginButton.b(d);
                }

            
            {
                d = LoginButton.this;
                super();
            }
            };
        }
        b();
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    public DefaultAudience getDefaultAudience()
    {
        return f.a;
    }

    protected int getDefaultRequestCode()
    {
        return com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.a.a();
    }

    protected int getDefaultStyleResource()
    {
        return com.facebook.p.f.com_facebook_loginview_default_style;
    }

    public LoginBehavior getLoginBehavior()
    {
        return f.d;
    }

    public d getLoginManager()
    {
        if (n == null)
        {
            n = com.facebook.login.d.a();
        }
        return n;
    }

    List getPermissions()
    {
        return f.b;
    }

    public long getToolTipDisplayTime()
    {
        return k;
    }

    public ToolTipMode getToolTipMode()
    {
        return j;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (m != null && !m.c)
        {
            m.b();
            b();
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (m != null)
        {
            c c1 = m;
            if (c1.c)
            {
                c1.b.a(c1.a);
                c1.c = false;
            }
        }
        a();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (h || isInEditMode()) goto _L2; else goto _L1
_L1:
        h = true;
        static final class _cls3
        {

            static final int a[];

            static 
            {
                a = new int[ToolTipMode.values().length];
                try
                {
                    a[ToolTipMode.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[ToolTipMode.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.facebook.login.widget.ToolTipMode.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls3.a[j.ordinal()];
        JVM INSTR tableswitch 1 2: default 56
    //                   1 57
    //                   2 83;
           goto _L2 _L3 _L4
_L2:
        return;
_L3:
        canvas = com.facebook.internal.m.a(getContext());
        com.facebook.g.e().execute(new Runnable(canvas) {

            final String a;
            final LoginButton b;

            public final void run()
            {
                com.facebook.internal.m.b b1 = com.facebook.internal.m.a(a, false);
                LoginButton.a(b).runOnUiThread(new Runnable(this, b1) {

                    final com.facebook.internal.m.b a;
                    final _cls1 b;

                    public final void run()
                    {
                        LoginButton.a(b.b, a);
                    }

            
            {
                b = _pcls1;
                a = b1;
                super();
            }
                });
            }

            
            {
                b = LoginButton.this;
                a = s;
                super();
            }
        });
        return;
_L4:
        b(getResources().getString(com.facebook.p.e.com_facebook_tooltip_default));
        return;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        b();
    }

    protected void onMeasure(int i1, int j1)
    {
        Object obj = getPaint().getFontMetrics();
        j1 = getCompoundPaddingTop();
        float f1 = Math.abs(((android.graphics.Paint.FontMetrics) (obj)).top);
        int k1 = (int)Math.ceil(Math.abs(((android.graphics.Paint.FontMetrics) (obj)).bottom) + f1);
        int l1 = getCompoundPaddingBottom();
        Resources resources = getResources();
        String s = d;
        obj = s;
        if (s == null)
        {
            obj = resources.getString(com.facebook.p.e.com_facebook_loginview_log_in_button_long);
            int i2 = c(((String) (obj)));
            if (resolveSize(i2, i1) < i2)
            {
                obj = resources.getString(com.facebook.p.e.com_facebook_loginview_log_in_button);
            }
        }
        int j2 = c(((String) (obj)));
        s = e;
        obj = s;
        if (s == null)
        {
            obj = resources.getString(com.facebook.p.e.com_facebook_loginview_log_out_button);
        }
        setMeasuredDimension(resolveSize(Math.max(j2, c(((String) (obj)))), i1), l1 + (k1 + j1));
    }

    protected void onVisibilityChanged(View view, int i1)
    {
        super.onVisibilityChanged(view, i1);
        if (i1 != 0)
        {
            a();
        }
    }

    public void setDefaultAudience(DefaultAudience defaultaudience)
    {
        f.a = defaultaudience;
    }

    public void setLoginBehavior(LoginBehavior loginbehavior)
    {
        f.d = loginbehavior;
    }

    void setLoginManager(d d1)
    {
        n = d1;
    }

    void setProperties(a a1)
    {
        f = a1;
    }

    public void setPublishPermissions(List list)
    {
        f.b(list);
    }

    public transient void setPublishPermissions(String as[])
    {
        f.b(Arrays.asList(as));
    }

    public void setReadPermissions(List list)
    {
        f.a(list);
    }

    public transient void setReadPermissions(String as[])
    {
        f.a(Arrays.asList(as));
    }

    public void setToolTipDisplayTime(long l1)
    {
        k = l1;
    }

    public void setToolTipMode(ToolTipMode tooltipmode)
    {
        j = tooltipmode;
    }

    public void setToolTipStyle(ToolTipPopup.Style style)
    {
        i = style;
    }

}
