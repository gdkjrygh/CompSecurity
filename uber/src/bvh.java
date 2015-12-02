// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;

public final class bvh
{

    private ViewGroup a;
    private ViewGroup b;
    private bvn c;
    private LinearLayout d;
    private TextView e;
    private LinearLayout f;
    private TextView g;
    private TextView h;
    private bvm i;
    private bvb j;
    private bvn k;
    private bvs l;
    private bvs m;
    private bvj n;

    public bvh(Context context, boolean flag)
    {
        b = bum.a(context);
        d = bum.a(b);
        LinearLayout linearlayout = bum.b(d);
        e = new TextView(context);
        bum.a(e, "0dip", "0dip", "0dip", "14dip");
        e.setTextSize(24F);
        e.setTextColor(bul.a);
        linearlayout.addView(e);
        bum.a(e, -2, -2);
        c = new bvn(context, "description");
        c.d.setTypeface(bul.r);
        linearlayout.addView(c.a);
        bum.a(c.a);
        bum.a(linearlayout);
        if (flag)
        {
            n = new bvj(context);
            linearlayout.addView(n.a());
            bum.a(linearlayout);
            l = new bvs(context);
            linearlayout.addView(l.a());
        } else
        {
            i = new bvm(context);
            linearlayout.addView(i.a);
            bum.a(i.a);
            bum.a(linearlayout);
            k = new bvn(context, "00 / 0000");
            linearlayout.addView(k.a);
            bum.a(k.a);
        }
        m = new bvs(context);
        m.a(context, new bvo());
        linearlayout.addView(m.a());
        g = new TextView(context);
        g.setId(43002);
        bum.b(g);
        linearlayout.addView(g);
        bum.a(g, -1, -2);
        bum.b(g, null, "20dip", null, "10dip");
        g.setVisibility(8);
        f = bum.a(context, true, 43001, linearlayout);
        h = new TextView(context);
        bum.a(h);
        h.setText("init");
        f.addView(h);
        j = new bvb(context);
        d.addView(j.a);
        bum.a(j.a, -2, -2);
        bum.a(j.a, 17, 1.0F);
        a = b;
    }

    public final View a()
    {
        return a;
    }

    public final void a(Context context, bvc bvc)
    {
        if (l != null)
        {
            l.a(context, bvc);
        }
    }

    public final void a(Context context, bvo bvo1)
    {
        if (m != null)
        {
            m.a(context, bvo1);
        }
    }

    public final void a(SpannableString spannablestring)
    {
        if (bwq.d(spannablestring))
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
            if (bwq.a())
            {
                h.setText(bux.a(buz.a));
            } else
            {
                h.setText(bux.a(buz.E));
            }
            n.b();
            return;
        } else
        {
            h.setText(bux.a(buz.C));
            i.a.setVisibility(0);
            k.a.setVisibility(0);
            k.d.setText(bux.a(buz.ah));
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
