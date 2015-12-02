// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.titlebar;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.common.w.n;
import com.facebook.config.a.b;
import com.facebook.config.server.j;
import com.facebook.h;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.orca.fbwebrtc.l;
import com.facebook.push.mqtt.bu;
import com.facebook.push.mqtt.v;
import com.facebook.q;
import com.facebook.widget.f;
import com.facebook.widget.titlebar.a;
import com.facebook.widget.titlebar.d;
import com.google.common.a.es;
import java.util.List;

// Referenced classes of package com.facebook.orca.common.ui.titlebar:
//            TitleBarBackButton, TitleBarDefaultTextTitle, q, r, 
//            s, t, z, u, 
//            w, v, ac

public class TitleBar extends f
    implements a
{

    private javax.inject.a a;
    private v b;
    private com.facebook.config.a.a c;
    private av d;
    private TitleBarBackButton e;
    private View f;
    private ViewGroup g;
    private ViewGroup h;
    private ImageView i;
    private TitleBarDefaultTextTitle j;
    private View k;
    private LinearLayout l;
    private TextView m;
    private View n;
    private View o;
    private String p;
    private boolean q;
    private boolean r;
    private boolean s;
    private com.facebook.base.broadcast.q t;
    private List u;
    private com.facebook.widget.titlebar.b v;
    private com.facebook.orca.common.b.a w;
    private l x;
    private Paint y;
    private com.facebook.widget.d.a z;

    public TitleBar(Context context)
    {
        super(context);
        u = es.d();
        a(context, ((AttributeSet) (null)));
    }

    public TitleBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        u = es.d();
        a(context, attributeset);
    }

    public TitleBar(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        u = es.d();
        a(context, attributeset);
    }

    private void a(Context context, AttributeSet attributeset)
    {
        t t1 = getInjector();
        a = t1.b(com/facebook/config/server/j);
        b = (v)t1.a(com/facebook/push/mqtt/v);
        c = (com.facebook.config.a.a)t1.a(com/facebook/config/a/a);
        w = (com.facebook.orca.common.b.a)t1.a(com/facebook/orca/common/b/a);
        d = (av)t1.a(com/facebook/analytics/av);
        x = (l)t1.a(com/facebook/orca/fbwebrtc/l);
        attributeset = context.obtainStyledAttributes(attributeset, q.TitleBar);
        p = com.facebook.common.w.n.a(attributeset.getString(q.TitleBar_title));
        r = attributeset.getBoolean(q.TitleBar_hasProgressBar, true);
        q = attributeset.getBoolean(q.TitleBar_hasBackButton, true);
        attributeset.recycle();
        setContentView(k.orca_titlebar);
        e = (TitleBarBackButton)getView(i.titlebar_back_button);
        f = getView(i.titlebar_container);
        j = (TitleBarDefaultTextTitle)getView(i.titlebar_default_text_title);
        g = (ViewGroup)getView(i.titlebar_main_container);
        h = (ViewGroup)getView(i.titlebar_text_container);
        i = (ImageView)getView(i.titlebar_menu_arrow);
        l = (LinearLayout)getView(i.titlebar_button_container);
        m = (TextView)getView(i.call_status_text);
        n = getView(i.orca_titlebar_divebar_button_overlay_view_holder);
        j.setText(p);
        attributeset = new IntentFilter();
        attributeset.addAction("com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED");
        attributeset.addAction("com.facebook.mqtt.ACTION_MQTT_CONFIG_CHANGED");
        attributeset.addAction("com.facebook.orca.login.AuthStateMachineMonitor.LOGIN_COMPLETE");
        attributeset.addAction("com.facebook.orca.login.AuthStateMachineMonitor.LOGOUT_COMPLETE");
        attributeset.addAction("com.facebook.orca.fbwebrtc.CALL_STATUS_AND_DURATION_UPDATE");
        t = new com.facebook.orca.common.ui.titlebar.q(this, context, attributeset);
        g.setOnClickListener(new r(this));
        m.setOnClickListener(new s(this));
        if (c.h() == b.DEVELOPMENT)
        {
            setWillNotDraw(false);
        }
        if (!q)
        {
            e.setVisibility(8);
        }
        e.setOnClickListener(new com.facebook.orca.common.ui.titlebar.t(this));
        d();
        y = new Paint();
        y.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        y.setAntiAlias(true);
        y.setColor(0xff000000);
    }

    private void a(View view, View view1)
    {
        ViewGroup viewgroup = (ViewGroup)view.getParent();
        int i1 = viewgroup.indexOfChild(view);
        viewgroup.removeView(view);
        viewgroup.addView(view1, i1);
    }

    static void a(TitleBar titlebar)
    {
        titlebar.e();
    }

    static void a(TitleBar titlebar, z z1, int i1)
    {
        titlebar.a(z1, i1);
    }

    private void a(z z1, int i1)
    {
        if (i1 < u.size())
        {
            d d1 = (d)u.get(i1);
            if (d1.c())
            {
                boolean flag;
                if (!d1.e())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                z1.setSelected(flag);
                d1.a(flag);
            }
            if (v != null)
            {
                a(d1.g());
                v.a(d1);
                return;
            }
        }
    }

    private void a(String s1)
    {
        if (s1 == null)
        {
            return;
        }
        Context context = getContext();
        s1 = (new cb("click")).g(s1).f("button");
        if (context instanceof com.facebook.analytics.d)
        {
            s1.e(((com.facebook.analytics.d)context).g_().toString());
        }
        d.a(s1);
    }

    static void b(TitleBar titlebar)
    {
        titlebar.f();
    }

    static com.facebook.widget.d.a c(TitleBar titlebar)
    {
        return titlebar.z;
    }

    private void c()
    {
        Activity activity = (Activity)getContext();
        a("titlebar_back_button");
        activity.onBackPressed();
    }

    static ViewGroup d(TitleBar titlebar)
    {
        return titlebar.g;
    }

    private void d()
    {
        boolean flag1 = false;
        for (int i1 = l.getChildCount(); i1 < u.size(); i1++)
        {
            z z1 = new z(getContext());
            z1.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
            l.addView(z1);
            z1.setOnClickListener(new u(this, i1));
            if (i1 == 0)
            {
                z1.setId(i.title_button_1);
            }
        }

        int k1 = 0;
        boolean flag = false;
        while (k1 < u.size()) 
        {
            z z2 = (z)l.getChildAt(k1);
            d d1 = (d)u.get(k1);
            z2.setImageDrawable(d1.b());
            z2.setText(d1.h());
            z2.setButtonWidth(d1.i());
            byte byte0;
            if (d1.f())
            {
                byte0 = 4;
            } else
            {
                byte0 = 0;
            }
            z2.setVisibility(byte0);
            z2.setSelected(d1.e());
            if (d1.d())
            {
                z2.setShowProgress(s);
                flag = true;
            }
            k1++;
        }
        for (int l1 = u.size(); l1 < l.getChildCount(); l1++)
        {
            z z3 = (z)l.getChildAt(l1);
            z3.setVisibility(8);
            z3.setShowProgress(false);
        }

        if (r)
        {
            if (flag)
            {
                j.setProgressBarVisibility(8);
            } else
            {
                TitleBarDefaultTextTitle titlebardefaulttexttitle = j;
                int j1;
                if (s)
                {
                    j1 = ((flag1) ? 1 : 0);
                } else
                {
                    j1 = 4;
                }
                titlebardefaulttexttitle.setProgressBarVisibility(j1);
            }
        } else
        {
            j.setProgressBarVisibility(8);
        }
        e();
        f();
    }

    static l e(TitleBar titlebar)
    {
        return titlebar.x;
    }

    private void e()
    {
        j j1 = (j)a.b();
        boolean flag;
        if (com.facebook.base.b.a() && j1.a() != j1.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            f.setBackgroundDrawable(new ColorDrawable(Color.rgb(0, 255, 0)));
            return;
        } else
        {
            setColorScheme(w.FACEBOOK);
            return;
        }
    }

    private void f()
    {
        if (x.a())
        {
            m.setVisibility(0);
            m.setText(x.b());
            return;
        } else
        {
            m.setVisibility(8);
            return;
        }
    }

    static void f(TitleBar titlebar)
    {
        titlebar.c();
    }

    private void setColorScheme(w w1)
    {
        e.setColorScheme(w1);
        for (int i1 = 0; i1 < l.getChildCount(); i1++)
        {
            ((z)l.getChildAt(i1)).setColorScheme(w1);
        }

        switch (com.facebook.orca.common.ui.titlebar.v.b[w1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            f.setBackgroundResource(h.orca_title_bar_background);
            return;

        case 2: // '\002'
            f.setBackgroundResource(h.orca_title_bar_sms_background);
            break;
        }
    }

    public void a(boolean flag)
    {
        int i1;
        s = flag;
        if (!r)
        {
            return;
        }
        i1 = 0;
        do
        {
            if (i1 >= u.size())
            {
                break MISSING_BLOCK_LABEL_107;
            }
            if (((d)u.get(i1)).d())
            {
                ((z)l.getChildAt(i1)).setShowProgress(flag);
                i1 = 1;
                break MISSING_BLOCK_LABEL_64;
            }
            i1++;
        } while (true);
_L2:
        if (i1 != 0)
        {
            j.setProgressBarVisibility(8);
            return;
        }
        if (flag)
        {
            j.setProgressBarVisibility(0);
            return;
        } else
        {
            j.setProgressBarVisibility(4);
            return;
        }
        i1 = 0;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean a()
    {
        return w != com.facebook.orca.common.b.a.FB4A;
    }

    public void b()
    {
        if (o == null)
        {
            return;
        } else
        {
            a(o, n);
            o = null;
            return;
        }
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        if (c.h() != b.DEVELOPMENT) goto _L2; else goto _L1
_L1:
        com.facebook.orca.common.ui.titlebar.v.a[b.f().ordinal()];
        JVM INSTR tableswitch 1 3: default 60
    //                   1 103
    //                   2 116
    //                   3 129;
           goto _L3 _L4 _L5 _L6
_L3:
        y.setColor(0xff000000);
_L8:
        int i1 = com.facebook.common.w.j.a(getContext(), 10F);
        canvas.drawCircle(canvas.getWidth() - i1, i1, i1 / 2, y);
_L2:
        return;
_L4:
        y.setColor(0xffff0000);
        continue; /* Loop/switch isn't completed */
_L5:
        y.setColor(-256);
        continue; /* Loop/switch isn't completed */
_L6:
        y.setColor(-1);
        if (true) goto _L8; else goto _L7
_L7:
    }

    public List getButtonSpecs()
    {
        return u;
    }

    public View getCustomTitleView()
    {
        return k;
    }

    public com.facebook.widget.titlebar.b getOnToolbarButtonListener()
    {
        return v;
    }

    public String getTitle()
    {
        return p;
    }

    public View getTitleBarDivebarButtonOverlay()
    {
        if (o != null)
        {
            return o;
        } else
        {
            o = new ac(getContext());
            o.setLayoutParams(n.getLayoutParams());
            a(n, o);
            return o;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        t.a();
        e();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        t.b();
    }

    public void setButtonSpecs(List list)
    {
        u = es.a(list);
        d();
    }

    public void setCustomTitleView(View view)
    {
        k = view;
        if (h.getChildCount() > 1)
        {
            h.removeViewAt(1);
        }
        if (view != null)
        {
            h.addView(view);
            view.setVisibility(0);
            j.setVisibility(8);
            return;
        } else
        {
            j.setVisibility(0);
            return;
        }
    }

    public void setHasBackButton(boolean flag)
    {
        q = flag;
        TitleBarBackButton titlebarbackbutton = e;
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        titlebarbackbutton.setVisibility(i1);
    }

    public void setHasProgressBar(boolean flag)
    {
        boolean flag1;
        if (r != flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        r = flag;
        if (flag1)
        {
            d();
        }
    }

    public void setOnToolbarButtonListener(com.facebook.widget.titlebar.b b1)
    {
        v = b1;
    }

    public void setQuickActionMenuListener(com.facebook.widget.d.a a1)
    {
        z = a1;
    }

    public void setTitle(int i1)
    {
        p = getResources().getString(i1);
        j.setText(p);
    }

    public void setTitle(String s1)
    {
        p = s1;
        j.setText(s1);
    }
}
