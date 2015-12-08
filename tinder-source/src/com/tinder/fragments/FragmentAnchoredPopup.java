// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.a.e;
import com.facebook.a.f;
import com.facebook.a.g;
import com.facebook.a.i;
import com.tinder.cards.CardStackLayout;
import com.tinder.managers.ManagerApp;
import com.tinder.utils.ad;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.tinder.fragments:
//            bd

public class FragmentAnchoredPopup extends Fragment
{
    static final class Strategy extends Enum
    {

        public static final Strategy a;
        private static final Strategy b[];

        public static Strategy valueOf(String s1)
        {
            return (Strategy)Enum.valueOf(com/tinder/fragments/FragmentAnchoredPopup$Strategy, s1);
        }

        public static Strategy[] values()
        {
            return (Strategy[])b.clone();
        }

        static 
        {
            a = new Strategy("GAMEPAD");
            b = (new Strategy[] {
                a
            });
        }

        private Strategy(String s1)
        {
            super(s1, 0);
        }
    }

    public static interface a
    {

        public abstract void a();
    }

    public static abstract class b
    {

        public b()
        {
        }
    }


    private View A;
    private LinearLayout B;
    private LinearLayout C;
    private int D;
    private boolean E;
    private Bitmap F[];
    private boolean G;
    public Context a;
    protected Handler b;
    protected ImageView c;
    protected ImageView d;
    protected i e;
    protected float f;
    protected RelativeLayout g;
    protected boolean h;
    protected int i;
    protected View j;
    protected float k;
    protected View l;
    protected Strategy m;
    protected Object n[];
    protected final Runnable o = new Runnable() {

        final FragmentAnchoredPopup a;

        public final void run()
        {
            FragmentAnchoredPopup.a(a, (bd)a.n[0]);
            a.f = FragmentAnchoredPopup.a(a).q.getScaleX();
        }

            
            {
                a = FragmentAnchoredPopup.this;
                super();
            }
    };
    Runnable p;
    Runnable q;
    Runnable r;
    LinearLayout s;
    a t;
    protected final Runnable u = new Runnable() {

        final FragmentAnchoredPopup a;

        public final void run()
        {
            ArrayList arraylist = new ArrayList();
            arraylist.add(Integer.valueOf(0x7f0e0134));
            arraylist.add(Integer.valueOf(0x7f0e012f));
            arraylist.add(Integer.valueOf(0x7f0e0136));
            arraylist.add(Integer.valueOf(0x7f0e0130));
            arraylist.add(Integer.valueOf(0x7f0e0138));
            arraylist.add(Integer.valueOf(0x7f0e012e));
            Iterator iterator = arraylist.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                int i1 = ((Integer)iterator.next()).intValue();
                if (a.b(i1) != null)
                {
                    a.b(i1).setVisibility(4);
                }
            } while (true);
            arraylist.add(Integer.valueOf(0x7f0e0129));
            arraylist.add(Integer.valueOf(0x7f0e0128));
            FragmentAnchoredPopup.a(a, new Bitmap[1]);
            Canvas acanvas[] = new Canvas[1];
            CardStackLayout cardstacklayout = FragmentAnchoredPopup.a(a).p;
            Paint paint = new Paint();
            PorterDuffXfermode porterduffxfermode = new PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR);
            ViewGroup viewgroup = (ViewGroup)FragmentAnchoredPopup.a(a).q.findViewById(a.i);
            View view = viewgroup.getChildAt(0);
            a.j.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener(this, acanvas, viewgroup, paint, porterduffxfermode, cardstacklayout, view, arraylist) {

                final Canvas a[];
                final ViewGroup b;
                final Paint c;
                final PorterDuffXfermode d;
                final CardStackLayout e;
                final View f;
                final ArrayList g;
                final _cls2 h;

                public final void onLayoutChange(View view, int i1, int j1, int k1, int l1, int i2, int j2, 
                        int k2, int l2)
                {
                    ManagerApp.d();
                    ManagerApp.n().post(new Runnable(this) {

                        final _cls1 a;

                        public final void run()
                        {
                            if (a.h.a.h)
                            {
                                return;
                            }
                            a.h.a.h = true;
                            FragmentAnchoredPopup.b(a.h.a)[0] = Bitmap.createBitmap(a.h.a.d.getWidth(), a.h.a.d.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
                            a.a[0] = new Canvas(FragmentAnchoredPopup.b(a.h.a)[0]);
                            FragmentAnchoredPopup.b(a.h.a)[0].eraseColor(0);
                            a.a[0].drawColor(a.h.a.getResources().getColor(0x7f0d0109));
                            Object obj = ad.a(a.b);
                            a.c.setColor(-1);
                            a.c.setXfermode(a.d);
                            int i1 = -((ad.a(a.h.a.b(0x7f0e012e)).y - (ad.a(a.e).y + a.e.getMeasuredHeight())) / 2);
                            a.a[0].drawCircle(((Point) (obj)).x + a.h.a.l.getMeasuredWidth() / 2, (float)((Point) (obj)).y + a.h.a.k + (float)((a.b.getMeasuredHeight() - a.f.getMeasuredHeight()) / 2), ((float)a.f.getMeasuredWidth() * a.h.a.f) / 2.0F, a.c);
                            a.a[0].drawBitmap(FragmentAnchoredPopup.b(a.h.a)[0], 0.0F, 0.0F, null);
                            a.h.a.d.setImageBitmap(FragmentAnchoredPopup.b(a.h.a)[0]);
                            obj = a.g.iterator();
                            do
                            {
                                if (!((Iterator) (obj)).hasNext())
                                {
                                    break;
                                }
                                int j1 = ((Integer)((Iterator) (obj)).next()).intValue();
                                if (j1 != a.h.a.i)
                                {
                                    a.h.a.b(j1).setTranslationY(i1);
                                }
                            } while (true);
                            obj = (android.widget.RelativeLayout.LayoutParams)a.h.a.c.getLayoutParams();
                            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(5, a.h.a.i);
                            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(7, a.h.a.i);
                            a.h.a.c.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
                            a.h.a.g.setPivotY((float)ad.a(a.h.a.c).y - a.h.a.k / 4F);
                            a.h.a.g.setPivotX(ad.a(a.h.a.l).x + a.h.a.l.getMeasuredWidth() / 2);
                            FragmentAnchoredPopup.c(a.h.a);
                            FragmentAnchoredPopup.d(a.h.a);
                        }

            
            {
                a = _pcls1;
                super();
            }
                    });
                }

            
            {
                h = _pcls2;
                a = acanvas;
                b = viewgroup;
                c = paint;
                d = porterduffxfermode;
                e = cardstacklayout;
                f = view;
                g = arraylist;
                super();
            }
            });
        }

            
            {
                a = FragmentAnchoredPopup.this;
                super();
            }
    };
    private bd v;
    private Runnable w;
    private ArrayList x;
    private ArrayList y;
    private boolean z;

    public FragmentAnchoredPopup()
    {
        b = new Handler();
    }

    static bd a(FragmentAnchoredPopup fragmentanchoredpopup)
    {
        return fragmentanchoredpopup.v;
    }

    static bd a(FragmentAnchoredPopup fragmentanchoredpopup, bd bd)
    {
        fragmentanchoredpopup.v = bd;
        return bd;
    }

    private static void a(ViewGroup viewgroup, View view)
    {
        viewgroup.removeAllViews();
        if (view != null)
        {
            viewgroup.addView(view);
        }
    }

    static Bitmap[] a(FragmentAnchoredPopup fragmentanchoredpopup, Bitmap abitmap[])
    {
        fragmentanchoredpopup.F = abitmap;
        return abitmap;
    }

    static Bitmap[] b(FragmentAnchoredPopup fragmentanchoredpopup)
    {
        return fragmentanchoredpopup.F;
    }

    static void c(FragmentAnchoredPopup fragmentanchoredpopup)
    {
        fragmentanchoredpopup.g();
    }

    static boolean d(FragmentAnchoredPopup fragmentanchoredpopup)
    {
        fragmentanchoredpopup.E = true;
        return true;
    }

    private Pair e()
    {
        static final class _cls6
        {

            static final int a[];

            static 
            {
                a = new int[Strategy.values().length];
                try
                {
                    a[Strategy.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        switch (_cls6.a[m.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return new Pair(o, u);
        }
    }

    static a e(FragmentAnchoredPopup fragmentanchoredpopup)
    {
        return fragmentanchoredpopup.t;
    }

    static e f(FragmentAnchoredPopup fragmentanchoredpopup)
    {
        return fragmentanchoredpopup.h();
    }

    private void f()
    {
        if (!z)
        {
            z = true;
            B = (LinearLayout)b(0x7f0e012a);
            s = (LinearLayout)b(0x7f0e012c);
            C = (LinearLayout)b(0x7f0e012d);
            A = b(0x7f0e0124);
            g = (RelativeLayout)b(0x7f0e0126);
            d = (ImageView)b(0x7f0e0125);
            if (D == 80)
            {
                c = (ImageView)b(0x7f0e0129);
                e = com.facebook.a.i.b();
                if (d != null)
                {
                    d.setOnClickListener(new android.view.View.OnClickListener() {

                        final FragmentAnchoredPopup a;

                        public final void onClick(View view)
                        {
                            if (com.tinder.fragments.FragmentAnchoredPopup.e(a) != null)
                            {
                                com.tinder.fragments.FragmentAnchoredPopup.e(a).a();
                            }
                            a.b();
                        }

            
            {
                a = FragmentAnchoredPopup.this;
                super();
            }
                    });
                }
                x = new ArrayList();
                x.add((ImageView)b(0x7f0e0129));
                y = new ArrayList();
                y.add(b(0x7f0e012d));
                j.measure(0, 0);
                c.measure(0, 0);
                if (A != null)
                {
                    A.measure(0, 0);
                }
                c.measure(0, 0);
                ((Runnable)e().second).run();
                if (E)
                {
                    g();
                    return;
                }
            } else
            {
                throw new IllegalArgumentException("Not implemented!");
            }
        }
    }

    private void g()
    {
        b.post(new Runnable() {

            final FragmentAnchoredPopup a;

            public final void run()
            {
                com.tinder.fragments.FragmentAnchoredPopup.f(a).a(0.0D).b(1.0D).a(new g(this) {

                    final _cls4 a;

                    public final void onSpringActivate(e e1)
                    {
                        a.a.j.setVisibility(0);
                        a.a.h = true;
                    }

                    public final void onSpringAtRest(e e1)
                    {
                        com.tinder.fragments.FragmentAnchoredPopup.g(a.a);
                        if (FragmentAnchoredPopup.h(a.a) != null)
                        {
                            FragmentAnchoredPopup.h(a.a).run();
                        }
                    }

                    public final void onSpringEndStateChange(e e1)
                    {
                    }

                    public final void onSpringUpdate(e e1)
                    {
                        ad.a(a.a.d, (float)Math.min(1.0D, e1.d.a));
                        ad.c(a.a.g, (float)e1.d.a);
                    }

            
            {
                a = _pcls4;
                super();
            }
                });
            }

            
            {
                a = FragmentAnchoredPopup.this;
                super();
            }
        });
    }

    static boolean g(FragmentAnchoredPopup fragmentanchoredpopup)
    {
        fragmentanchoredpopup.G = false;
        return false;
    }

    private e h()
    {
        return e.a().c(200D).a(com.facebook.a.f.a(42D, 7D));
    }

    static Runnable h(FragmentAnchoredPopup fragmentanchoredpopup)
    {
        return fragmentanchoredpopup.w;
    }

    static Runnable i(FragmentAnchoredPopup fragmentanchoredpopup)
    {
        return fragmentanchoredpopup.p;
    }

    public final void a()
    {
        f();
        if (G)
        {
            return;
        }
        if (r != null)
        {
            r.run();
        }
        G = true;
        j.setVisibility(4);
    }

    public final void a(int i1)
    {
        f();
        Iterator iterator = x.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ImageView imageview = (ImageView)iterator.next();
            if (imageview != null)
            {
                imageview.setColorFilter(i1);
            }
        } while (true);
        iterator = y.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            View view = (View)iterator.next();
            if (view != null)
            {
                view.setBackgroundColor(i1);
            }
        } while (true);
    }

    public final transient void a(int i1, Strategy strategy, Object aobj[])
    {
        z = false;
        D = 80;
        a = getActivity();
        i = i1;
        l = b(i1);
        m = strategy;
        n = aobj;
        ((Runnable)e().first).run();
    }

    public final void a(Drawable drawable)
    {
        if (l != null)
        {
            View view;
            if (l instanceof ViewGroup)
            {
                view = ((ViewGroup)l).getChildAt(0);
            } else
            {
                view = l;
            }
            ad.a(view, drawable);
        }
    }

    public final View b(int i1)
    {
        if (j != null)
        {
            return j.findViewById(i1);
        } else
        {
            return null;
        }
    }

    public final void b()
    {
        f();
        if (G)
        {
            return;
        }
        if (q != null)
        {
            q.run();
        }
        G = true;
        e e1 = h().a(1.0D).b(0.0D);
        e1.b = true;
        j.setVisibility(0);
        e1.a(new g() {

            final FragmentAnchoredPopup a;

            public final void onSpringActivate(e e2)
            {
            }

            public final void onSpringAtRest(e e2)
            {
                com.tinder.fragments.FragmentAnchoredPopup.g(a);
                FragmentAnchoredPopup.a(a, null);
                a.j.setVisibility(8);
                if (com.tinder.fragments.FragmentAnchoredPopup.i(a) != null)
                {
                    com.tinder.fragments.FragmentAnchoredPopup.i(a).run();
                }
            }

            public final void onSpringEndStateChange(e e2)
            {
            }

            public final void onSpringUpdate(e e2)
            {
                ad.a(a.d, (float)Math.min(1.0D, e2.d.a));
                ad.c(a.g, (float)e2.d.a);
                ad.c(a.l, (float)e2.d.a);
            }

            
            {
                a = FragmentAnchoredPopup.this;
                super();
            }
        });
    }

    public final boolean c()
    {
        return j != null && j.getVisibility() == 0;
    }

    public final void d()
    {
        if (j != null)
        {
            j.setVisibility(8);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030048, viewgroup, false);
        layoutinflater.setVisibility(8);
        j = layoutinflater;
        return layoutinflater;
    }

    public void setBottomView(View view)
    {
        f();
        if (C != null)
        {
            a(C, view);
        }
    }

    public void setCenterView(View view)
    {
        f();
        if (s != null)
        {
            a(s, view);
        }
    }

    public void setTopView(View view)
    {
        f();
        if (B != null)
        {
            a(B, view);
        }
    }
}
