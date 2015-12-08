// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import aop;
import aoz;
import apn;
import arl;
import arp;
import arr;
import asc;
import asd;
import ase;
import asf;
import asg;
import com.facebook.FacebookRequestError;
import com.facebook.Request;
import com.facebook.Session;
import com.facebook.model.GraphUser;
import de;
import java.lang.ref.WeakReference;

// Referenced classes of package com.facebook.widget:
//            ToolTipPopup

public class LoginButton extends Button
{

    private arl a;
    private GraphUser b;
    private Session c;
    private boolean d;
    private boolean e;
    private String f;
    private String g;
    private asd h;
    private String i;
    private android.view.View.OnClickListener j;
    private boolean k;
    private ToolTipPopup.Style l;
    private ToolTipMode m;
    private long n;
    private ToolTipPopup o;

    public LoginButton(Context context)
    {
        super(context);
        b = null;
        c = null;
        h = new asd();
        i = "fb_login_view_usage";
        l = ToolTipPopup.Style.a;
        m = ToolTipMode.a;
        n = 6000L;
        a(context);
        e();
    }

    public LoginButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = null;
        c = null;
        h = new asd();
        i = "fb_login_view_usage";
        l = ToolTipPopup.Style.a;
        m = ToolTipMode.a;
        n = 6000L;
        if (attributeset.getStyleAttribute() == 0)
        {
            setGravity(17);
            setTextColor(getResources().getColor(0x7f0f00c8));
            setTextSize(0, getResources().getDimension(0x7f0c00b7));
            setTypeface(Typeface.DEFAULT_BOLD);
            if (isInEditMode())
            {
                setBackgroundColor(getResources().getColor(0x7f0f00c3));
                f = "Log in with Facebook";
            } else
            {
                setBackgroundResource(0x7f020116);
                setCompoundDrawablesWithIntrinsicBounds(0x7f020128, 0, 0, 0);
                setCompoundDrawablePadding(getResources().getDimensionPixelSize(0x7f0c00b2));
                setPadding(getResources().getDimensionPixelSize(0x7f0c00b4), getResources().getDimensionPixelSize(0x7f0c00b6), getResources().getDimensionPixelSize(0x7f0c00b5), getResources().getDimensionPixelSize(0x7f0c00b3));
            }
        }
        a(attributeset);
        if (!isInEditMode())
        {
            a(context);
        }
    }

    public LoginButton(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        b = null;
        c = null;
        h = new asd();
        i = "fb_login_view_usage";
        l = ToolTipPopup.Style.a;
        m = ToolTipMode.a;
        n = 6000L;
        a(attributeset);
        a(context);
    }

    public static arl a(LoginButton loginbutton)
    {
        return loginbutton.a;
    }

    static asf a()
    {
        return null;
    }

    static GraphUser a(LoginButton loginbutton, GraphUser graphuser)
    {
        loginbutton.b = graphuser;
        return graphuser;
    }

    private void a(AttributeSet attributeset)
    {
        attributeset = getContext().obtainStyledAttributes(attributeset, apn.b);
        d = attributeset.getBoolean(0, true);
        e = attributeset.getBoolean(1, true);
        f = attributeset.getString(2);
        g = attributeset.getString(3);
        attributeset.recycle();
    }

    static void a(LoginButton loginbutton, arr arr1)
    {
        if (arr1 != null && arr1.d && loginbutton.getVisibility() == 0)
        {
            loginbutton.a(arr1.c);
        }
    }

    private void a(String s)
    {
        o = new ToolTipPopup(s, this);
        o.f = l;
        o.g = n;
        s = o;
        if (((ToolTipPopup) (s)).b.get() != null)
        {
            s.d = new asg(((ToolTipPopup) (s)).c);
            ((TextView)((ToolTipPopup) (s)).d.findViewById(0x7f11030f)).setText(((ToolTipPopup) (s)).a);
            View view;
            int i1;
            int j1;
            if (((ToolTipPopup) (s)).f == ToolTipPopup.Style.a)
            {
                asg.a(((ToolTipPopup) (s)).d).setBackgroundResource(0x7f02013e);
                asg.b(((ToolTipPopup) (s)).d).setImageResource(0x7f02013f);
                asg.c(((ToolTipPopup) (s)).d).setImageResource(0x7f020140);
                asg.d(((ToolTipPopup) (s)).d).setImageResource(0x7f020141);
            } else
            {
                asg.a(((ToolTipPopup) (s)).d).setBackgroundResource(0x7f02013a);
                asg.b(((ToolTipPopup) (s)).d).setImageResource(0x7f02013b);
                asg.c(((ToolTipPopup) (s)).d).setImageResource(0x7f02013c);
                asg.d(((ToolTipPopup) (s)).d).setImageResource(0x7f02013d);
            }
            view = ((Activity)((ToolTipPopup) (s)).c).getWindow().getDecorView();
            i1 = view.getWidth();
            j1 = view.getHeight();
            s.a();
            if (((ToolTipPopup) (s)).b.get() != null)
            {
                ((View)((ToolTipPopup) (s)).b.get()).getViewTreeObserver().addOnScrollChangedListener(((ToolTipPopup) (s)).h);
            }
            ((ToolTipPopup) (s)).d.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x80000000), android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x80000000));
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

    private static boolean a(Context context)
    {
        if (context != null)
        {
            Session session = Session.g();
            if (session != null)
            {
                return session.a();
            }
            if (arp.a(context) != null && Session.a(context) != null)
            {
                return true;
            }
        }
        return false;
    }

    public static GraphUser b(LoginButton loginbutton)
    {
        return loginbutton.b;
    }

    public static String b()
    {
        return null;
    }

    public static Fragment c()
    {
        return null;
    }

    public static boolean c(LoginButton loginbutton)
    {
        return loginbutton.d;
    }

    public static asd d(LoginButton loginbutton)
    {
        return loginbutton.h;
    }

    private void d()
    {
        if (o != null)
        {
            o.dismiss();
            o = null;
        }
    }

    public static String e(LoginButton loginbutton)
    {
        return loginbutton.i;
    }

    private void e()
    {
        super.setOnClickListener(new ase(this, (byte)0));
        f();
        if (!isInEditMode())
        {
            a = new arl(getContext(), new asc(this, (byte)0));
            g();
        }
    }

    public static android.view.View.OnClickListener f(LoginButton loginbutton)
    {
        return loginbutton.j;
    }

    private void f()
    {
        if (a != null && arl.a() != null)
        {
            String s;
            if (g != null)
            {
                s = g;
            } else
            {
                s = getResources().getString(0x7f0805ff);
            }
            setText(s);
            return;
        }
        String s1;
        if (f != null)
        {
            s1 = f;
        } else
        {
            s1 = getResources().getString(0x7f0805fd);
        }
        setText(s1);
    }

    private void g()
    {
label0:
        {
            if (e)
            {
                Session session = arl.a();
                if (session == null)
                {
                    break label0;
                }
                if (session != c)
                {
                    Request.a(new Request[] {
                        Request.a(session, new aop(session) {

                            private Session a;
                            private LoginButton b;

                            public final void a(GraphUser graphuser, aoz aoz1)
                            {
                                Session session1 = a;
                                LoginButton.a(b);
                                if (session1 == arl.a())
                                {
                                    LoginButton.a(b, graphuser);
                                    LoginButton.a();
                                }
                                if (aoz1.b != null)
                                {
                                    graphuser = aoz1.b.e;
                                }
                            }

            
            {
                b = LoginButton.this;
                a = session;
                super();
            }
                        })
                    });
                    c = session;
                }
            }
            return;
        }
        b = null;
    }

    public static void g(LoginButton loginbutton)
    {
        loginbutton.g();
    }

    public static void h(LoginButton loginbutton)
    {
        loginbutton.f();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (a != null && !a.d)
        {
            arl arl1 = a;
            if (!arl1.d)
            {
                IntentFilter intentfilter = new IntentFilter();
                intentfilter.addAction("com.facebook.sdk.ACTIVE_SESSION_SET");
                intentfilter.addAction("com.facebook.sdk.ACTIVE_SESSION_UNSET");
                arl1.c.a(arl1.b, intentfilter);
                if (Session.g() != null)
                {
                    Session.g().a(arl1.a);
                }
                arl1.d = true;
            }
            g();
            f();
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (a != null)
        {
            arl arl1 = a;
            if (arl1.d)
            {
                Session session = Session.g();
                if (session != null)
                {
                    session.b(arl1.a);
                }
                arl1.c.a(arl1.b);
                arl1.d = false;
            }
        }
        d();
    }

    protected void onDraw(Canvas canvas)
    {
label0:
        {
            super.onDraw(canvas);
            if (!k && m != ToolTipMode.c && !isInEditMode())
            {
                k = true;
                if (m != ToolTipMode.b)
                {
                    break label0;
                }
                a(getResources().getString(0x7f08062a));
            }
            return;
        }
        (new AsyncTask(arp.a(getContext())) {

            private String a;
            private LoginButton b;

            protected final Object doInBackground(Object aobj[])
            {
                return arp.a(a, false);
            }

            protected final void onPostExecute(Object obj)
            {
                obj = (arr)obj;
                LoginButton.a(b, ((arr) (obj)));
            }

            
            {
                b = LoginButton.this;
                a = s;
                super();
            }
        }).execute(null);
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        e();
    }

    protected void onVisibilityChanged(View view, int i1)
    {
        super.onVisibilityChanged(view, i1);
        if (i1 != 0)
        {
            d();
        }
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        j = onclicklistener;
    }

    static 
    {
        com/facebook/widget/LoginButton.getName();
    }

    private class ToolTipMode extends Enum
    {

        public static final ToolTipMode a;
        public static final ToolTipMode b;
        public static final ToolTipMode c;
        private static final ToolTipMode d[];

        public static ToolTipMode valueOf(String s)
        {
            return (ToolTipMode)Enum.valueOf(com/facebook/widget/LoginButton$ToolTipMode, s);
        }

        public static ToolTipMode[] values()
        {
            return (ToolTipMode[])d.clone();
        }

        static 
        {
            a = new ToolTipMode("DEFAULT", 0);
            b = new ToolTipMode("DISPLAY_ALWAYS", 1);
            c = new ToolTipMode("NEVER_DISPLAY", 2);
            d = (new ToolTipMode[] {
                a, b, c
            });
        }

        private ToolTipMode(String s, int i1)
        {
            super(s, i1);
        }
    }

}
