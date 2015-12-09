// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;

// Referenced classes of package com.paypal.android.sdk:
//            dz, dy, fa, ew, 
//            ff, fb, eo, ez, 
//            gd, em, ek, ep

public final class eu
{

    private ViewGroup a;
    private ViewGroup b;
    private fa c;
    private LinearLayout d;
    private TextView e;
    private LinearLayout f;
    private TextView g;
    private TextView h;
    private ez i;
    private eo j;
    private fa k;
    private ff l;
    private ff m;
    private ew n;

    public eu(Context context, boolean flag)
    {
        b = dz.a(context);
        d = dz.a(b);
        LinearLayout linearlayout = dz.b(d);
        e = new TextView(context);
        dz.a(e, "0dip", "0dip", "0dip", "14dip");
        e.setTextSize(24F);
        e.setTextColor(dy.a);
        linearlayout.addView(e);
        dz.a(e, -2, -2);
        c = new fa(context, "description");
        c.d.setTypeface(dy.r);
        linearlayout.addView(c.a);
        dz.a(c.a);
        dz.a(linearlayout);
        if (flag)
        {
            n = new ew(context);
            linearlayout.addView(n.a());
            dz.a(linearlayout);
            l = new ff(context);
            linearlayout.addView(l.a());
        } else
        {
            i = new ez(context);
            linearlayout.addView(i.a);
            dz.a(i.a);
            dz.a(linearlayout);
            k = new fa(context, "00 / 0000");
            linearlayout.addView(k.a);
            dz.a(k.a);
        }
        m = new ff(context);
        m.a(context, new fb());
        linearlayout.addView(m.a());
        g = new TextView(context);
        g.setId(43002);
        dz.b(g);
        linearlayout.addView(g);
        dz.a(g, -1, -2);
        dz.b(g, null, "20dip", null, "10dip");
        g.setVisibility(8);
        f = dz.a(context, true, 43001, linearlayout);
        h = new TextView(context);
        dz.a(h);
        h.setText("init");
        f.addView(h);
        j = new eo(context);
        d.addView(j.a);
        dz.a(j.a, -2, -2);
        dz.a(j.a, 17, 1.0F);
        a = b;
    }

    public final View a()
    {
        return a;
    }

    public final void a(Context context, ep ep)
    {
        if (l != null)
        {
            l.a(context, ep);
        }
    }

    public final void a(Context context, fb fb1)
    {
        if (m != null)
        {
            m.a(context, fb1);
        }
    }

    public final void a(SpannableString spannablestring)
    {
        if (gd.d(spannablestring))
        {
            g.setText(spannablestring);
            g.setVisibility(0);
            return;
        } else
        {
            g.setVisibility(8);
            return;
        }
    }

    public final void a(android.view.View.OnClickListener onclicklistener)
    {
        if (n != null)
        {
            n.a(onclicklistener);
        }
    }

    public final void a(String s)
    {
        n.a(s);
    }

    public final void a(String s, Bitmap bitmap, String s1)
    {
        i.b.setText(s);
        i.c.setImageBitmap(bitmap);
        k.c.setText(s1);
    }

    public final void a(String s, String s1)
    {
        c.d.setText(s);
        c.c.setText(s1);
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            if (gd.b())
            {
                h.setText(ek.a(em.a));
            } else
            {
                h.setText(ek.a(em.E));
            }
            n.b();
            return;
        } else
        {
            h.setText(ek.a(em.C));
            i.a.setVisibility(0);
            k.a.setVisibility(0);
            k.d.setText(ek.a(em.ah));
            return;
        }
    }

    public final TextView b()
    {
        return e;
    }

    public final void b(android.view.View.OnClickListener onclicklistener)
    {
        f.setOnClickListener(onclicklistener);
    }

    public final void b(boolean flag)
    {
        if (f != null)
        {
            f.setEnabled(flag);
        }
    }

    public final void c()
    {
        c.a();
    }

    public final void c(android.view.View.OnClickListener onclicklistener)
    {
        if (l != null)
        {
            l.a(onclicklistener);
        }
    }

    public final TextView d()
    {
        return j.b;
    }

    public final void d(android.view.View.OnClickListener onclicklistener)
    {
        if (m != null)
        {
            m.a(onclicklistener);
        }
    }

    public final View e()
    {
        if (l != null)
        {
            return l.a();
        } else
        {
            return null;
        }
    }

    public final View f()
    {
        if (m != null)
        {
            return m.a();
        } else
        {
            return null;
        }
    }
}
