// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.kik.android.c.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kik.a.d.z;
import kik.android.chat.KikApplication;
import kik.android.util.cv;

// Referenced classes of package kik.android.chat.fragment:
//            rq, rm, rp, rr, 
//            rn, ro

public final class rl extends android.support.v7.widget.RecyclerView.a
{
    public static interface a
    {

        public abstract void a(String s1);

        public abstract void a(String s1, View view);

        public abstract boolean a(MotionEvent motionevent, int i1);
    }


    private final double a = 153D;
    private final int b = KikApplication.e(0x7f0c0087);
    private final int c = KikApplication.a(10);
    private final int d = KikApplication.a(20);
    private final int e = KikApplication.a(26);
    private final int f = KikApplication.a(13);
    private final int g = KikApplication.a(6);
    private final int h = KikApplication.a(16);
    private final int i = KikApplication.a(10);
    private final int j = KikApplication.a(48);
    private final int k = KikApplication.a(9);
    private final int l;
    private final long m = 100L;
    private a n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private long t;
    private List u;
    private List v;

    public rl()
    {
        l = f + g;
        o = KikApplication.e(0x7f0c003c);
        p = 0;
        q = 0;
        r = 0;
        s = 0;
        t = 0L;
        u = new ArrayList();
        v = new ArrayList();
    }

    private int a(Paint paint, int i1)
    {
        Object obj = (z)u.get(i1);
        if (((z) (obj)).b() == kik.a.d.z.a.a)
        {
            obj = ((z) (obj)).c();
            i1 = l;
            return Math.max((int)paint.measureText(((CharSequence) (obj)), 0, ((CharSequence) (obj)).length()) + i1 * 2, j + g * 2);
        } else
        {
            return c + g * 2;
        }
    }

    static a a(rl rl1)
    {
        return rl1.n;
    }

    static List b(rl rl1)
    {
        return rl1.u;
    }

    public final int a()
    {
        return u.size();
    }

    public final int a(int i1)
    {
        return ((z)u.get(i1)).b().a();
    }

    public final android.support.v7.widget.RecyclerView.t a(ViewGroup viewgroup, int i1)
    {
        if (r <= 0)
        {
            r = viewgroup.getWidth();
        }
        Object obj = kik.a.d.z.a.a(i1);
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[kik.a.d.z.a.values().length];
                try
                {
                    a[kik.a.d.z.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        switch (_cls1.a[((kik.a.d.z.a) (obj)).ordinal()])
        {
        default:
            viewgroup = (FrameLayout)LayoutInflater.from(viewgroup.getContext()).inflate(0x7f03005f, viewgroup, false);
            cv.a(viewgroup.findViewById(0x7f0e013b).getBackground(), b);
            return new rq(viewgroup);

        case 1: // '\001'
            viewgroup = (FrameLayout)LayoutInflater.from(viewgroup.getContext()).inflate(0x7f03005e, viewgroup, false);
            break;
        }
        obj = (TextView)viewgroup.findViewById(0x7f0e013c);
        View view = viewgroup.findViewById(0x7f0e013b);
        cv.a(view.getBackground(), o);
        view.getBackground().setAlpha(153);
        int j1 = ((TextView) (obj)).getPaddingLeft();
        i1 = ((TextView) (obj)).getPaddingRight();
        if (((TextView) (obj)).getPaddingLeft() - q >= c)
        {
            j1 -= q;
            i1 -= q;
        } else
        {
            j1 = q + j1;
            i1 = q + i1;
        }
        ((TextView) (obj)).setPadding(Math.min(j1, d), ((TextView) (obj)).getPaddingTop(), Math.min(i1, d), ((TextView) (obj)).getPaddingBottom());
        if (p != 0)
        {
            ((TextView) (obj)).setTextColor(p);
        }
        viewgroup.setOnClickListener(new rm(this, view, ((TextView) (obj))));
        return new rp(viewgroup);
    }

    public final rl a(a a1)
    {
        n = a1;
        return this;
    }

    public final void a(int i1, int j1)
    {
        int i2;
        boolean flag;
        int j2;
        flag = false;
        q = 0;
        s = j1;
        j2 = i1 - (l + i);
        TextPaint textpaint = new TextPaint();
        textpaint.setTextSize(h);
        textpaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        textpaint.setTypeface(Typeface.DEFAULT);
        int k1 = a() - 1;
        i2 = 0;
        for (; k1 >= j1; k1--)
        {
            i2 += a(((Paint) (textpaint)), k1);
        }

        if (i2 <= j2 || i2 > i1) goto _L2; else goto _L1
_L1:
        int l1 = i2 - j2;
_L4:
        q = l1 / (a() - j1) / 2;
        return;
_L2:
        l1 = ((flag) ? 1 : 0);
        if (i2 > i1)
        {
            l1 = ((flag) ? 1 : 0);
            if (i2 - i1 < i)
            {
                l1 = i2 - i1 - i;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(android.support.v7.widget.RecyclerView.t t1, int i1)
    {
        t1 = (rr)t1;
        if (i1 < a() && t1 != null && ((rr) (t1)).a != null)
        {
            Object obj = ((rr) (t1)).a;
            ((View) (obj)).setOnTouchListener(new rn(this, i1));
            if (i1 == 0)
            {
                cv.b(((View) (obj))).d(k);
            }
            if (t1 instanceof rp)
            {
                obj = (rp)t1;
                obj.j = ((z)u.get(i1)).c();
                ((rp) (obj)).k.setText(((rp) (obj)).j);
                obj = ((rp)t1).k;
                ((TextView) (obj)).measure(0, 0);
                if (((TextView) (obj)).getMeasuredWidth() <= j)
                {
                    int j1 = Math.min(d + q, e);
                    ((TextView) (obj)).setPadding(Math.min(d + q, e), ((TextView) (obj)).getPaddingTop(), j1, ((TextView) (obj)).getPaddingBottom());
                }
            } else
            if (t1 instanceof rq)
            {
                ((View) (obj)).setOnClickListener(new ro(this, i1));
            }
            if (i1 >= s && !v.contains(Integer.valueOf(i1)))
            {
                v.add(Integer.valueOf(i1));
                ((rr) (t1)).a.setTranslationX(r);
                t1 = ObjectAnimator.ofFloat(((rr) (t1)).a, View.TRANSLATION_X, new float[] {
                    (float)r, 0.0F
                });
                t1.setStartDelay(t);
                t1.start();
                return;
            }
        }
    }

    public final void a(List list, Context context, kik.android.e.f f1)
    {
        v.clear();
        list = new ArrayList(list);
        if (context != null && f1 != null)
        {
            for (int i1 = 0; i1 < list.size(); i1++)
            {
                z z1 = (z)list.get(i1);
                if (z1.b() == kik.a.d.z.a.a)
                {
                    z1.a(com.kik.android.c.f.a(context, z1.c(), null, 21, false, f1));
                    list.set(i1, z1);
                }
            }

            Collections.reverse(list);
        }
        u = list;
    }

    public final void b(int i1)
    {
        o = i1;
    }

    public final void c(int i1)
    {
        p = i1;
    }

    public final int d(int i1)
    {
        TextPaint textpaint;
        int j1;
        q = 0;
        textpaint = new TextPaint();
        textpaint.setTextSize(h);
        textpaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        textpaint.setTypeface(Typeface.DEFAULT);
        j1 = a();
        if (j1 > 0) goto _L2; else goto _L1
_L1:
        int k1 = -1;
_L4:
        return k1;
_L2:
        j1--;
        k1 = 0;
label0:
        do
        {
label1:
            {
                if (j1 < 0)
                {
                    break label1;
                }
                int l1 = k1 + a(textpaint, j1);
                k1 = j1;
                if (l1 >= i1)
                {
                    break label0;
                }
                j1--;
                k1 = l1;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return 0;
    }

    public final void d()
    {
        t = 250L;
    }
}
