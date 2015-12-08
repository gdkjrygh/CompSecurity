// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.kik.android.a;
import com.kik.android.c.e;
import com.kik.android.c.f;
import com.kik.cache.SmileyImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kik.android.chat.KikApplication;
import kik.android.util.DeviceUtils;
import kik.android.util.ad;

// Referenced classes of package kik.android.widget:
//            dm, dn, do, dp, 
//            dq, dk, dr, ds, 
//            dt, du, cx

public final class dl
    implements android.view.View.OnTouchListener
{
    private final class a extends cx
    {

        int b[];
        final dl c;
        private List d;

        public final View a(MotionEvent motionevent)
        {
            Iterator iterator;
            if (d == null)
            {
                return null;
            }
            getContentView().getLocationOnScreen(b);
            iterator = d.iterator();
_L2:
            View view;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_124;
            }
            view = (View)iterator.next();
            if (view == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            boolean flag;
            view.getLocationOnScreen(b);
            flag = (new Rect(b[0], b[1], b[0] + view.getWidth(), b[1] + view.getHeight())).contains((int)motionevent.getRawX(), (int)motionevent.getRawY());
            if (flag)
            {
                return view;
            }
            continue; /* Loop/switch isn't completed */
            return null;
            Exception exception;
            exception;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public final void a()
        {
            if (d != null)
            {
                Iterator iterator = d.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    View view = (View)iterator.next();
                    if (view != null)
                    {
                        view.setSelected(false);
                    }
                } while (true);
            }
        }

        public final void a(List list)
        {
            d = list;
        }

        public a(View view)
        {
            c = dl.this;
            super(view);
            b = new int[2];
        }
    }

    private static final class b
    {

        public final String a;

        public b(String s1)
        {
            a = s1;
        }
    }

    public static abstract class c
    {

        public abstract void a();

        public c()
        {
        }
    }


    private static final int d = KikApplication.a(9);
    private static final int e = KikApplication.a(10) * -1;
    private static final int f = KikApplication.a(16);
    private static final int g = KikApplication.a(8);
    private static final int h = KikApplication.a(10);
    private static final int i = KikApplication.a(15);
    private static final int j = KikApplication.a(8);
    private static final int k = KikApplication.a(8);
    private View A;
    private dk B;
    private android.view.ViewTreeObserver.OnScrollChangedListener C;
    private android.widget.AdapterView.OnItemClickListener D;
    private android.widget.AdapterView.OnItemLongClickListener E;
    private android.view.View.OnClickListener F;
    private android.view.View.OnClickListener G;
    int a[];
    protected com.kik.android.a b;
    protected f c;
    private boolean l;
    private boolean m;
    private Context n;
    private int o;
    private int p;
    private int q;
    private int r;
    private LayoutInflater s;
    private Message t;
    private c u;
    private PopupWindow v;
    private a w;
    private ad x;
    private View y;
    private View z;

    public dl(ad ad1, Context context, View view, View view1, com.kik.android.a a1, f f1)
    {
        a = new int[2];
        m = false;
        C = new dm(this);
        D = new dn(this);
        E = new do(this);
        F = new dp(this);
        G = new dq(this);
        x = ad1;
        n = context;
        y = view;
        A = view1;
        l = true;
        s = LayoutInflater.from(n);
        p = n.getResources().getConfiguration().orientation;
        t = ad1.obtainMessage();
        t.setTarget(ad1);
        b = a1;
        c = f1;
    }

    private void a(View view, View view1)
    {
        if (view != null && view1 != null)
        {
            int i1 = e();
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x80000000), android.view.View.MeasureSpec.makeMeasureSpec(view1.getResources().getDisplayMetrics().heightPixels, 0x80000000));
            int ai[] = new int[2];
            view1.getLocationOnScreen(ai);
            int j1 = ai[0];
            float f1 = (float)view1.getMeasuredWidth() / 2.0F;
            if (view != null)
            {
                float f2 = (float)view.getMeasuredWidth() / 2.0F;
                i1 = (int)((float)(i1 - j1 - g()) - f1 - f2);
                view1 = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
                view1.setMargins(((android.view.ViewGroup.MarginLayoutParams) (view1)).leftMargin, ((android.view.ViewGroup.MarginLayoutParams) (view1)).topMargin, i1, ((android.view.ViewGroup.MarginLayoutParams) (view1)).bottomMargin);
                view.setLayoutParams(view1);
                return;
            }
        }
    }

    private void a(View view, boolean flag)
    {
        View view1;
        if (view != null)
        {
            if ((view1 = view.findViewById(0x7f0e01e0)) == null || !(view1 instanceof SmileyImageView) || ((SmileyImageView)view1).a())
            {
                Object obj = view.getTag();
                if (obj instanceof b)
                {
                    if (view != null)
                    {
                        view = ((View) (view.getTag()));
                        if (view instanceof b)
                        {
                            view = ((b)view).a;
                            b.b("Smiley Store Opened").a("Smiley Category", view).b();
                            obj = new Bundle();
                            if (view != null)
                            {
                                ((Bundle) (obj)).putString("launch_card", com.kik.android.c.e.b(view));
                            }
                            t.setData(((Bundle) (obj)));
                            k();
                        }
                    }
                    view = null;
                } else
                if (obj instanceof e)
                {
                    obj = (e)obj;
                    c.a(((e) (obj)));
                    view = new Bundle();
                    if (obj != null)
                    {
                        view.putString("smiley_key", ((e) (obj)).f());
                    }
                    b.b("Smiley Clicked").a("Smiley", ((e) (obj)).f()).a("Is Alternate Smiley Tray", flag).a("Smiley Identifier", ((e) (obj)).e()).b();
                } else
                {
                    Bundle bundle = new Bundle();
                    view = "https://my.kik.com/";
                    if (DeviceUtils.c())
                    {
                        view = "https://kik-shop-dev.herokuapp.com";
                    }
                    bundle.putString("launch_card", view);
                    b.b("Smiley Store Opened").b();
                    view = bundle;
                }
                t.setData(view);
                k();
                return;
            }
        }
    }

    static void a(dl dl1, View view)
    {
        if (view != null && (view.getTag() instanceof e))
        {
            e e1 = (e)view.getTag();
            dl1.c.b(e1);
            dl1.c.b();
            if (e1 != null && view != null)
            {
                String s1 = e1.g();
                ArrayList arraylist = new ArrayList();
                View view2 = dl1.s.inflate(0x7f030018, null);
                Object obj1 = dl1.c.a(s1);
                Object obj = (LinearLayout)view2.findViewById(0x7f0e0096);
                obj1 = ((List) (obj1)).iterator();
                boolean flag1;
                for (boolean flag = true; ((Iterator) (obj1)).hasNext(); flag = flag1)
                {
                    e e2 = (e)((Iterator) (obj1)).next();
                    SmileyImageView smileyimageview = new SmileyImageView(dl1.n);
                    smileyimageview.e(0x7f0202a7);
                    smileyimageview.setBackgroundDrawable(dl1.n.getResources().getDrawable(0x7f0202a0));
                    smileyimageview.setLayoutParams(new android.widget.LinearLayout.LayoutParams(dl1.r, dl1.q));
                    smileyimageview.setPadding(g / 2, g / 2, g / 2, g / 2);
                    smileyimageview.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                    smileyimageview.a(e2, com.kik.android.c.f.e());
                    smileyimageview.setOnClickListener(dl1.G);
                    flag1 = flag;
                    if (flag)
                    {
                        android.view.ViewGroup.MarginLayoutParams marginlayoutparams1 = (android.view.ViewGroup.MarginLayoutParams)smileyimageview.getLayoutParams();
                        marginlayoutparams1.setMargins(marginlayoutparams1.leftMargin + KikApplication.a(8), marginlayoutparams1.topMargin, marginlayoutparams1.rightMargin, marginlayoutparams1.bottomMargin);
                        smileyimageview.setLayoutParams(marginlayoutparams1);
                        flag1 = false;
                    }
                    ((LinearLayout) (obj)).addView(smileyimageview);
                    smileyimageview.setTag(e2);
                    smileyimageview.setId(0x7f0e01e0);
                    if (e2 != null)
                    {
                        smileyimageview.setContentDescription((new StringBuilder("AUTOMATION_SMILEY_TRAY_ALTERNATE_SMILEY_")).append(e2.g()).toString());
                    }
                    arraylist.add(smileyimageview);
                }

                obj1 = new ImageView(dl1.n);
                ((ImageView) (obj1)).setBackgroundDrawable(dl1.n.getResources().getDrawable(0x7f0202a0));
                ((ImageView) (obj1)).setLayoutParams(new android.widget.LinearLayout.LayoutParams(dl1.r, dl1.q));
                ((ImageView) (obj1)).setScaleType(android.widget.ImageView.ScaleType.CENTER);
                ((ImageView) (obj1)).setImageResource(0x7f02020b);
                ((ImageView) (obj1)).setTag(new b(s1));
                ((ImageView) (obj1)).setOnClickListener(dl1.G);
                ((ImageView) (obj1)).setContentDescription("AUTOMATION_SMILEY_TRAY_ALTERNATE_STORE");
                android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)((ImageView) (obj1)).getLayoutParams();
                marginlayoutparams.setMargins(marginlayoutparams.leftMargin, marginlayoutparams.topMargin, marginlayoutparams.rightMargin + KikApplication.a(8), marginlayoutparams.bottomMargin);
                ((ImageView) (obj1)).setLayoutParams(marginlayoutparams);
                ((LinearLayout) (obj)).addView(((View) (obj1)));
                arraylist.add(obj1);
                obj = dl1. new a(view2);
                ((a) (obj)).setBackgroundDrawable(new BitmapDrawable());
                ((a) (obj)).setContentView(view2);
                ((a) (obj)).setOutsideTouchable(true);
                ((a) (obj)).a(arraylist);
                dl1.b.b("Smiley Alternate Tray Opened").a("Smiley Category", s1).b();
                if (dl1.w != null)
                {
                    dl1.w.dismiss();
                }
                dl1.w = ((a) (obj));
                dl1.w.setOnDismissListener(new dr(dl1, view));
                dl1.w.a(view, dl1.y);
            }
            if (view != null)
            {
                View view1 = view.findViewById(0x7f0e01e1);
                if (view1 != null)
                {
                    view1.setVisibility(4);
                }
                if (dl1.B != null)
                {
                    dl1.B.c();
                }
            }
            if (view != null)
            {
                if (dl1.B != null)
                {
                    dl1.B.a(e1);
                }
                view.setBackgroundResource(0x7f0200ad);
            }
        }
    }

    static void a(dl dl1, View view, boolean flag)
    {
        dl1.a(view, flag);
    }

    static int[] a(dl dl1)
    {
        return dl1.j();
    }

    static void b(dl dl1, View view)
    {
        if (view != null)
        {
            if (dl1.B != null)
            {
                dl1.B.a(null);
            }
            view.setBackgroundResource(0x7f0202a0);
        }
    }

    static boolean b(dl dl1)
    {
        dl1.l = true;
        return true;
    }

    private int e()
    {
        return A.getMeasuredWidth() - A.getPaddingLeft() - A.getPaddingRight();
    }

    private int f()
    {
        if (m)
        {
            return j;
        } else
        {
            return f;
        }
    }

    private int g()
    {
        if (m)
        {
            return k;
        } else
        {
            return i;
        }
    }

    private int h()
    {
        return (e() - g() * 2 - f() * 2) / r;
    }

    private boolean i()
    {
        int i1 = h();
        return (int)Math.ceil((double)o / (double)i1) > 3;
    }

    private int[] j()
    {
        int ai[] = new int[2];
        if (y != null)
        {
            y.getLocationInWindow(ai);
        }
        return ai;
    }

    private void k()
    {
        x.sendMessage(t);
        t = x.obtainMessage();
        d();
    }

    public final void a(c c1)
    {
        u = c1;
    }

    public final boolean a()
    {
        return c != null && !c.a();
    }

    public final boolean b()
    {
        return v.isShowing();
    }

    public final boolean c()
    {
        if (!l) goto _L2; else goto _L1
_L1:
        Object obj;
        if (y != null)
        {
            y.getViewTreeObserver().addOnScrollChangedListener(C);
        }
        p = n.getResources().getConfiguration().orientation;
        int i1;
        int k1;
        int j3;
        if (p == 2)
        {
            obj = s.inflate(0x7f030096, null);
            B = null;
            ds ds1 = new ds(this, ((View) (obj)));
            View view1 = ((View) (obj)).findViewById(0x7f0e01dd);
            List list = c.d();
            r = n.getResources().getDrawable(0x7f02027f).getIntrinsicWidth() + g;
            q = n.getResources().getDrawable(0x7f02027f).getIntrinsicHeight() + g;
            o = Math.min(20, list.size()) + 1;
            Object obj1 = (LinearLayout)((View) (obj)).findViewById(0x7f0e0096);
            i1 = 0;
            while (i1 < o - 1 && i1 < list.size()) 
            {
                View view2 = s.inflate(0x7f030099, ((android.view.ViewGroup) (obj1)), false);
                SmileyImageView smileyimageview = (SmileyImageView)view2.findViewById(0x7f0e01e0);
                smileyimageview.e(0x7f0202a7);
                smileyimageview.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                smileyimageview.setPadding(g / 2, g / 2, g / 2, g / 2);
                view2.setBackgroundDrawable(view2.getContext().getResources().getDrawable(0x7f0202a0));
                view2.setLayoutParams(new android.widget.LinearLayout.LayoutParams(r, q));
                smileyimageview = (SmileyImageView)view2.findViewById(0x7f0e01e0);
                View view3 = view2.findViewById(0x7f0e01e1);
                com.kik.android.c.f.b b1 = (com.kik.android.c.f.b)list.get(i1);
                e e1 = b1.b();
                smileyimageview.a(e1, com.kik.android.c.f.e());
                smileyimageview.setId(0x7f0e01e0);
                view2.setTag(e1);
                if (b1.c())
                {
                    view3.setVisibility(0);
                    view3.setBackgroundResource(0x7f0202b0);
                } else
                if (b1.d())
                {
                    view3.setVisibility(0);
                    view3.setBackgroundResource(0x7f0202b1);
                } else
                {
                    view3.setVisibility(4);
                }
                view2.setOnLongClickListener(ds1);
                view2.setOnClickListener(F);
                if (e1 != null)
                {
                    view2.setContentDescription((new StringBuilder("AUTOMATION_SMILEY_TRAY_SMILEY_")).append(e1.g()).toString());
                }
                ((LinearLayout) (obj1)).addView(view2);
                i1++;
            }
            if (view1 != null)
            {
                int ai[];
                int ai1[];
                ImageView imageview;
                int j2;
                int l2;
                int i3;
                if (a())
                {
                    i1 = 0;
                } else
                {
                    i1 = 8;
                }
                view1.setVisibility(i1);
            }
            imageview = new ImageView(n);
            imageview.setBackgroundDrawable(n.getResources().getDrawable(0x7f0202a0));
            imageview.setLayoutParams(new android.widget.LinearLayout.LayoutParams(r, q));
            imageview.setScaleType(android.widget.ImageView.ScaleType.CENTER);
            imageview.setImageResource(0x7f02020b);
            imageview.setTag(Integer.valueOf(o - 1));
            imageview.setOnClickListener(F);
            imageview.setContentDescription("AUTOMATION_SMILEY_TRAY_STORE");
            ((LinearLayout) (obj1)).addView(imageview);
            a(((View) (obj)).findViewById(0x7f0e01de), y);
            z = ((View) (obj));
        } else
        {
            ai = s.inflate(0x7f030097, null);
            Object obj2 = ai.findViewById(0x7f0e01dd);
            if (obj2 != null)
            {
                if (a())
                {
                    i1 = 0;
                } else
                {
                    i1 = 8;
                }
                ((View) (obj2)).setVisibility(i1);
            }
            obj2 = (GridView)ai.findViewById(0x7f0e01df);
            B = new dk(ai.getContext(), c);
            r = B.a();
            q = B.b();
            o = B.getCount();
            if (i())
            {
                m = true;
            }
            if (i())
            {
                B.a(h() * 3 - 1);
            }
            ((GridView) (obj2)).setColumnWidth(r);
            ((GridView) (obj2)).setAdapter(B);
            ((GridView) (obj2)).setOnItemClickListener(D);
            ((GridView) (obj2)).setOnItemLongClickListener(E);
            a(ai.findViewById(0x7f0e01de), y);
            z = ai;
        }
        ai = j();
        l2 = e();
        i3 = g();
        j3 = h();
        obj1 = z.findViewById(0x7f0e01dd);
        if (p == 2)
        {
            k1 = h;
        } else
        {
            k1 = f();
        }
        j2 = k1 * 2;
        i1 = j2;
        if (obj1 != null)
        {
            i1 = j2;
            if (((View) (obj1)).getVisibility() == 0)
            {
                ((View) (obj1)).measure(android.view.View.MeasureSpec.makeMeasureSpec(((View) (obj1)).getResources().getDisplayMetrics().widthPixels, 0x80000000), android.view.View.MeasureSpec.makeMeasureSpec(((View) (obj1)).getResources().getDisplayMetrics().heightPixels, 0x80000000));
                i1 = ((View) (obj1)).getMeasuredHeight();
                i1 = ((android.view.ViewGroup.MarginLayoutParams)((View) (obj1)).getLayoutParams()).bottomMargin + (k1 + i1);
            }
        }
        if (p == 2)
        {
            i1 = i1 + q + d;
        } else
        {
            int k2 = (int)Math.ceil((double)o / (double)j3);
            int l1 = k2;
            if (k2 > 3)
            {
                l1 = 3;
            }
            i1 = i1 + l1 * q + d;
        }
        ai1 = new int[4];
        ai1[0] = l2 - i3 * 2;
        ai1[1] = i1;
        ai1[2] = g() + A.getPaddingLeft();
        ai1[3] = ai[1] - i1 - e;
        v = new PopupWindow(z, -2, -2);
        v.setBackgroundDrawable(new BitmapDrawable());
        v.setContentView(z);
        v.setHeight(ai1[1]);
        v.setWidth(ai1[0]);
        v.setOnDismissListener(new dt(this));
        v.setOutsideTouchable(true);
        v.setTouchInterceptor(this);
        ai = v;
        if (ai != null && ai.getContentView() != null) goto _L4; else goto _L3
_L3:
        v.showAtLocation(y, 0, ai1[2], ai1[3]);
        ai = j();
        a[0] = ai[0];
        a[1] = ai[1];
        c.i();
        return true;
_L4:
        View view = ai.getContentView().findViewById(0x7f0e01dd);
        boolean flag1 = false;
        int j1;
        boolean flag;
        if (p == 2)
        {
            ai = ai.getContentView().findViewById(0x7f0e0096);
            j1 = h;
        } else
        {
            ai = ai.getContentView().findViewById(0x7f0e01df);
            j1 = f();
        }
        flag = flag1;
        if (view != null)
        {
            flag = flag1;
            if (view.getVisibility() == 0)
            {
                flag = true;
            }
        }
        if (ai != null)
        {
            int i2;
            if (flag)
            {
                i2 = 0;
            } else
            {
                i2 = j1;
            }
            ai.setPadding(j1, i2, j1, j1);
        }
        if (true) goto _L3; else goto _L2
_L2:
        return false;
    }

    public final void d()
    {
        if (u != null)
        {
            u.a();
        }
        v.dismiss();
        if (w != null)
        {
            w.dismiss();
        }
        l = false;
        if (y != null)
        {
            y.getViewTreeObserver().removeOnScrollChangedListener(C);
        }
        (new Handler()).postDelayed(new du(this), 200L);
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent != null && w != null)
        {
            w.a();
            view = w.a(motionevent);
            if (view != null)
            {
                switch (motionevent.getAction())
                {
                default:
                    return false;

                case 1: // '\001'
                    a(view, true);
                    return false;

                case 2: // '\002'
                    view.setSelected(true);
                    break;
                }
                return false;
            }
        }
        return false;
    }

}
