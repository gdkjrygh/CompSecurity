// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.coachmark;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.text.Html;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.pandora.android.util.i;
import com.pandora.radio.util.k;
import p.l.c;
import p.l.d;
import p.l.g;
import p.l.j;
import p.s.b;

// Referenced classes of package com.pandora.android.coachmark:
//            CoachmarkBuilder, Spotlight

public class CoachmarkLayout extends ViewGroup
    implements android.view.View.OnTouchListener
{
    public static interface a
    {

        public abstract void a(CoachmarkBuilder coachmarkbuilder);
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        private static final b f[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/pandora/android/coachmark/CoachmarkLayout$b, s);
        }

        public static b[] values()
        {
            return (b[])f.clone();
        }

        static 
        {
            a = new b("ACTION_HOME", 0);
            b = new b("TITLE", 1);
            c = new b("ACTION_ITEM", 2);
            d = new b("ACTION_OVERFLOW", 3);
            e = new b("SPINNER", 4);
            f = (new b[] {
                a, b, c, d, e
            });
        }

        private b(String s, int l)
        {
            super(s, l);
        }
    }

    private class c
        implements Runnable
    {

        final CoachmarkLayout a;

        public void run()
        {
            a.a(e.d.a);
            e.e e1 = CoachmarkLayout.a(a).e();
            if (e1 != null)
            {
                com.pandora.android.provider.b.a.b().o().a(e1.y, e1.z.i, false, e.d.a.g);
            }
        }

        private c()
        {
            a = CoachmarkLayout.this;
            super();
        }

    }

    public static final class d extends Enum
    {

        public static final d a;
        public static final d b;
        public static final d c;
        public static final d d;
        public static final d e;
        private static final d f[];

        public static d valueOf(String s)
        {
            return (d)Enum.valueOf(com/pandora/android/coachmark/CoachmarkLayout$d, s);
        }

        public static d[] values()
        {
            return (d[])f.clone();
        }

        static 
        {
            a = new d("LEFT", 0);
            b = new d("TOP", 1);
            c = new d("RIGHT", 2);
            d = new d("BOTTOM", 3);
            e = new d("CENTER", 4);
            f = (new d[] {
                a, b, c, d, e
            });
        }

        private d(String s, int l)
        {
            super(s, l);
        }
    }

    protected class e
    {

        final CoachmarkLayout a;

        public void onApplicationFocusChanged(p.bz.d d1)
        {
            a.a(com.pandora.android.coachmark.e.d.b);
            d1 = CoachmarkLayout.a(a).e();
            if (d1 != null)
            {
                com.pandora.android.provider.b.a.b().o().a(((e.e) (d1)).y, ((e.e) (d1)).z.i, false, com.pandora.android.coachmark.e.d.b.g);
            }
            com.pandora.android.provider.b.a.e().b(com.pandora.android.coachmark.CoachmarkLayout.c(a));
        }

        protected e()
        {
            a = CoachmarkLayout.this;
            super();
        }
    }


    d a;
    private Spotlight b;
    private View c;
    private int d;
    private CoachmarkBuilder e;
    private c f;
    private AnimatorSet g;
    private e h;

    public CoachmarkLayout(CoachmarkBuilder coachmarkbuilder)
    {
        this(coachmarkbuilder, null);
    }

    public CoachmarkLayout(CoachmarkBuilder coachmarkbuilder, AttributeSet attributeset)
    {
        this(coachmarkbuilder, attributeset, 0);
    }

    public CoachmarkLayout(CoachmarkBuilder coachmarkbuilder, AttributeSet attributeset, int l)
    {
        super(coachmarkbuilder.a(), attributeset, l);
        a = d.e;
        f = new c();
        a(coachmarkbuilder, attributeset, l);
    }

    private Animator a(View view)
    {
        return ObjectAnimator.ofFloat(view, "alpha", new float[] {
            0.0F, 1.0F
        }).setDuration(e.h);
    }

    private static AnimatorSet a(Animator animator, Animator animator1, Animator animator2, boolean flag)
    {
        AnimatorSet animatorset = new AnimatorSet();
        animator = animatorset.play(animator);
        if (animator1 != null)
        {
            if (flag)
            {
                animator.after(animator1);
            } else
            {
                animator.before(animator1);
            }
        }
        if (animator2 != null)
        {
            if (flag)
            {
                animator.after(animator2);
            } else
            {
                animator.before(animator2);
            }
        }
        animatorset.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorset;
    }

    static CoachmarkBuilder a(CoachmarkLayout coachmarklayout)
    {
        return coachmarklayout.e;
    }

    private d a(Rect rect)
    {
        int i1 = 0;
        int l = 1;
        int j1 = getMeasuredHeight();
        int k1 = getMeasuredWidth();
        if (rect.isEmpty())
        {
            return d.e;
        }
        int l1 = getResources().getConfiguration().orientation;
        int ai[] = new int[4];
        if (l1 == 1)
        {
            ai[0] = rect.top * k1;
            ai[1] = (j1 - rect.bottom) * k1;
        } else
        if (l1 == 2)
        {
            ai[2] = rect.left * j1;
            ai[3] = j1 * (k1 - rect.right);
        } else
        {
            return d.e;
        }
        while (l < ai.length) 
        {
            j1 = i1;
            if (ai[l] > ai[i1])
            {
                j1 = l;
            }
            l++;
            i1 = j1;
        }
        switch (i1)
        {
        default:
            return d.e;

        case 0: // '\0'
            return com.pandora.android.coachmark.d.b;

        case 1: // '\001'
            return com.pandora.android.coachmark.d.d;

        case 2: // '\002'
            return d.a;

        case 3: // '\003'
            return com.pandora.android.coachmark.d.c;
        }
    }

    public static void a(View view, boolean flag)
    {
        if (flag)
        {
            if (view.isHardwareAccelerated())
            {
                Paint paint = new Paint();
                paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.OVERLAY));
                view.setLayerType(2, paint);
                view.setDrawingCacheEnabled(false);
                return;
            } else
            {
                view.setLayerType(1, null);
                return;
            }
        } else
        {
            view.setLayerType(1, null);
            view.setDrawingCacheEnabled(false);
            return;
        }
    }

    private void a(CoachmarkBuilder coachmarkbuilder, AttributeSet attributeset, int l)
    {
        e = coachmarkbuilder;
        setWillNotDraw(false);
        d = e.a().getResources().getColor(0x7f0b001e);
        setClipChildren(false);
        a(((View) (this)), true);
        if (coachmarkbuilder.c() == null) goto _L2; else goto _L1
_L1:
        setSpotlight(coachmarkbuilder.c());
_L4:
        setDescriptionView(b(coachmarkbuilder));
        setOnTouchListener(this);
        setAlpha(0.0F);
        return;
_L2:
        if (coachmarkbuilder.d() != null)
        {
            setSpotlight(coachmarkbuilder.d());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void a(CoachmarkLayout coachmarklayout, View view)
    {
        coachmarklayout.setDescriptionView(view);
    }

    static void a(CoachmarkLayout coachmarklayout, Spotlight spotlight)
    {
        coachmarklayout.setSpotlight(spotlight);
    }

    static void a(CoachmarkLayout coachmarklayout, e.d d1)
    {
        coachmarklayout.b(d1);
    }

    private Animator b(View view)
    {
        return ObjectAnimator.ofFloat(view, "alpha", new float[] {
            1.0F, 0.0F
        }).setDuration(e.h);
    }

    private View b(CoachmarkBuilder coachmarkbuilder)
    {
        View view = coachmarkbuilder.a().getLayoutInflater().inflate(coachmarkbuilder.p(), this, false);
        Object obj1 = (ImageView)view.findViewById(0x7f100075);
        TextView textview = (TextView)view.findViewById(0x7f1000d2);
        TextView textview1 = (TextView)view.findViewById(0x7f1000d4);
        Object obj = (TextView)view.findViewById(0x7f1000ed);
        Button button = (Button)view.findViewById(0x7f1000d3);
        if (coachmarkbuilder.j())
        {
            p.l.c c1 = p.l.g.b(getContext()).a(coachmarkbuilder.i()).a(p.s.b.c);
            if (coachmarkbuilder.e() == e.e.p)
            {
                c1.a(new p.ab.d[] {
                    new i(getContext())
                });
            }
            c1.a(0x7f020295).a(((ImageView) (obj1)));
        } else
        {
            int l = coachmarkbuilder.h();
            if (l == 0)
            {
                ((ImageView) (obj1)).setVisibility(8);
            } else
            {
                ((ImageView) (obj1)).setImageResource(l);
            }
        }
        textview.setText(coachmarkbuilder.k());
        textview1.setText(Html.fromHtml(coachmarkbuilder.l()));
        obj1 = coachmarkbuilder.m();
        if (obj != null && !TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            ((TextView) (obj)).setText(Html.fromHtml(((String) (obj1))));
        }
        obj = coachmarkbuilder.n();
        if (com.pandora.radio.util.i.a(((String) (obj))))
        {
            button.setVisibility(8);
            return view;
        } else
        {
            button.setText(((CharSequence) (obj)));
            button.setOnClickListener(new android.view.View.OnClickListener(coachmarkbuilder) {

                final CoachmarkBuilder a;
                final CoachmarkLayout b;

                public void onClick(View view1)
                {
                    view1.setOnClickListener(null);
                    b.a(e.d.e);
                    com.pandora.android.provider.b.a.b().o().a(b.getType().y, b.getType().z.i, true, e.d.e.g);
                    view1 = CoachmarkLayout.a(b).a();
                    if (view1 instanceof a)
                    {
                        ((a)view1).a(a);
                    }
                }

            
            {
                b = CoachmarkLayout.this;
                a = coachmarkbuilder;
                super();
            }
            });
            return view;
        }
    }

    static void b(CoachmarkLayout coachmarklayout)
    {
        coachmarklayout.e();
    }

    private void b(e.d d1)
    {
        com.pandora.android.provider.b.a.e().a(new p.bz.g(p.bz.g.a.b, d1, new CoachmarkBuilder(e)));
    }

    static e c(CoachmarkLayout coachmarklayout)
    {
        return coachmarklayout.h;
    }

    private void e()
    {
        Animator animator1 = null;
        Animator animator2 = a(this);
        Animator animator;
        if (a())
        {
            animator = b.a(e.j);
        } else
        {
            animator = null;
        }
        if (c != null)
        {
            animator1 = a(c);
        }
        animator1.setDuration(e.i);
        a(animator2, animator, animator1, false).start();
        f();
        g();
        h();
    }

    private void f()
    {
        com.pandora.android.provider.b.a.e().a(new p.bz.g(p.bz.g.a.a, null, new CoachmarkBuilder(e)));
    }

    private void g()
    {
        long l = e.q();
        if (e.e)
        {
            if (l <= 0L)
            {
                l = 0L;
            }
            postDelayed(f, l);
        }
    }

    private Animator getEmptyAnimation()
    {
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(new View(getContext()), "alpha", new float[] {
            0.0F, 1.0F
        });
        objectanimator.setDuration(0L);
        return objectanimator;
    }

    private void h()
    {
        if (e.f)
        {
            h = new e();
            com.pandora.android.provider.b.a.e().c(h);
        }
    }

    private void setDescriptionView(View view)
    {
        if (c != null)
        {
            removeView(c);
        }
        c = view;
        addView(c, new android.view.ViewGroup.LayoutParams(-1, -2));
        c.setAlpha(0.0F);
    }

    private void setSpotlight(Pair pair)
    {
        setSpotlight(new Spotlight(e.a(), pair));
    }

    private void setSpotlight(Spotlight spotlight)
    {
        if (b != null)
        {
            removeView(b);
            b = null;
        }
        if (spotlight != null)
        {
            b = spotlight;
            addView(b, new android.view.ViewGroup.LayoutParams(-2, -2));
        }
    }

    private transient void setSpotlight(int ai[])
    {
        setSpotlight(new Spotlight(e.a(), ai));
    }

    void a(CoachmarkBuilder coachmarkbuilder)
    {
        e = coachmarkbuilder;
        Object obj = coachmarkbuilder.a();
        int ai[] = coachmarkbuilder.c();
        Object obj1 = coachmarkbuilder.d();
        coachmarkbuilder = null;
        Animator animator;
        AnimatorSet animatorset;
        if (ai != null)
        {
            coachmarkbuilder = new Spotlight(((Activity) (obj)), ai);
        } else
        if (obj1 != null)
        {
            coachmarkbuilder = new Spotlight(((Activity) (obj)), ((Pair) (obj1)));
        }
        obj1 = b(e);
        if (a())
        {
            obj = b.b(e.j);
        } else
        {
            obj = getEmptyAnimation();
        }
        ((Animator) (obj)).addListener(new AnimatorListenerAdapter() {

            final CoachmarkLayout a;

            public void onAnimationEnd(Animator animator1)
            {
                CoachmarkLayout.a(a, (Spotlight)null);
            }

            
            {
                a = CoachmarkLayout.this;
                super();
            }
        });
        if (coachmarkbuilder != null)
        {
            animator = coachmarkbuilder.a(e.j);
        } else
        {
            animator = getEmptyAnimation();
        }
        animator.addListener(new AnimatorListenerAdapter(coachmarkbuilder) {

            final Spotlight a;
            final CoachmarkLayout b;

            public void onAnimationStart(Animator animator1)
            {
                CoachmarkLayout.a(b, a);
            }

            
            {
                b = CoachmarkLayout.this;
                a = spotlight;
                super();
            }
        });
        coachmarkbuilder = b(c);
        coachmarkbuilder.addListener(new AnimatorListenerAdapter(((View) (obj1))) {

            final View a;
            final CoachmarkLayout b;

            public void onAnimationEnd(Animator animator1)
            {
                CoachmarkLayout.a(b, a);
                a.setAlpha(0.0F);
            }

            
            {
                b = CoachmarkLayout.this;
                a = view;
                super();
            }
        });
        obj1 = a(((View) (obj1)));
        animatorset = new AnimatorSet();
        animatorset.play(((Animator) (obj))).with(coachmarkbuilder);
        animatorset.play(((Animator) (obj))).before(animator);
        animatorset.play(coachmarkbuilder).before(((Animator) (obj1)));
        animatorset.start();
        g();
        h();
    }

    void a(e.d d1)
    {
        Animator animator1 = null;
        if (c())
        {
            return;
        }
        d();
        Animator animator2 = b(this);
        Animator animator;
        if (a())
        {
            animator = b.b(e.j);
        } else
        {
            animator = null;
        }
        if (c != null)
        {
            animator1 = b(c);
        }
        g = a(animator2, animator, animator1, true);
        g.addListener(new AnimatorListenerAdapter(d1) {

            final e.d a;
            final CoachmarkLayout b;

            public void onAnimationEnd(Animator animator3)
            {
                CoachmarkLayout.a(b, a);
            }

            
            {
                b = CoachmarkLayout.this;
                a = d1;
                super();
            }
        });
        g.start();
    }

    boolean a()
    {
        return b != null && !b.a();
    }

    void b()
    {
        postDelayed(new Runnable() {

            final CoachmarkLayout a;

            public void run()
            {
                com.pandora.android.coachmark.CoachmarkLayout.b(a);
            }

            
            {
                a = CoachmarkLayout.this;
                super();
            }
        }, 200L);
    }

    boolean c()
    {
        return g != null && g.isRunning();
    }

    void d()
    {
        removeCallbacks(f);
        f = null;
    }

    protected void dispatchDraw(Canvas canvas)
    {
        int i1 = getChildCount();
        for (int l = 0; l < i1; l++)
        {
            View view = getChildAt(l);
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.clipRect(0, 0, view.getWidth(), view.getHeight());
            view.draw(canvas);
            canvas.restore();
        }

    }

    CoachmarkBuilder getBuilder()
    {
        return e;
    }

    e.e getType()
    {
        return e.e();
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        requestLayout();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        d();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        canvas.drawColor(d);
    }

    protected void onLayout(boolean flag, int l, int i1, int j1, int k1)
    {
        Rect rect;
        rect = new Rect();
        if (b != null)
        {
            rect = b.getGlobalBounds();
            b.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
        if (c == null) goto _L2; else goto _L1
_L1:
        l = getMeasuredWidth();
        i1 = getMeasuredHeight();
        static class _cls7
        {

            static final int a[];

            static 
            {
                a = new int[d.values().length];
                try
                {
                    a[d.e.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.pandora.android.coachmark.d.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.pandora.android.coachmark.d.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[d.a.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.pandora.android.coachmark.d.c.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls7.a[a.ordinal()];
        JVM INSTR tableswitch 1 5: default 116
    //                   1 117
    //                   2 129
    //                   3 145
    //                   4 161
    //                   5 177;
           goto _L2 _L3 _L4 _L5 _L6 _L7
_L2:
        return;
_L3:
        c.layout(0, 0, l, i1);
        return;
_L4:
        c.layout(0, 0, l, rect.top);
        return;
_L5:
        c.layout(0, rect.bottom, l, i1);
        return;
_L6:
        c.layout(0, 0, rect.left, i1);
        return;
_L7:
        c.layout(rect.right, 0, l, i1);
        return;
    }

    protected void onMeasure(int l, int i1)
    {
        super.onMeasure(l, i1);
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(l), android.view.View.MeasureSpec.getSize(i1));
        if (b != null)
        {
            measureChild(b, l, i1);
        }
        if (c == null) goto _L2; else goto _L1
_L1:
        measureChild(c, l, i1);
        if (b == null) goto _L2; else goto _L3
_L3:
        Rect rect;
        int j1;
        int k1;
        j1 = getMeasuredWidth();
        k1 = getMeasuredHeight();
        c.getMeasuredWidth();
        l = c.getMeasuredHeight();
        rect = b.getGlobalBounds();
        i1 = Math.round((float)k1 / 2.0F - (float)l / 2.0F);
        float f1 = (float)k1 / 2.0F;
        if (Rect.intersects(rect, new Rect(0, i1, j1, Math.round((float)l / 2.0F + f1))))
        {
            a = a(rect);
        }
        l = k1;
        i1 = j1;
        _cls7.a[a.ordinal()];
        JVM INSTR tableswitch 1 5: default 204
    //                   1 210
    //                   2 233
    //                   3 233
    //                   4 248
    //                   5 248;
           goto _L4 _L5 _L6 _L6 _L7 _L7
_L5:
        break MISSING_BLOCK_LABEL_210;
_L4:
        i1 = j1;
        l = k1;
_L9:
        measureChild(c, android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(l, 0x40000000));
_L2:
        return;
_L6:
        l = k1 - rect.height();
        i1 = j1;
        continue; /* Loop/switch isn't completed */
_L7:
        i1 = j1 - rect.width();
        l = k1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        int i1;
        boolean flag = true;
        int l = Math.round(motionevent.getX());
        i1 = Math.round(motionevent.getY());
        if (b != null && !b.a() && b.getGlobalBounds().contains(l, i1))
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (motionevent.getAction() == 1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        view = e.e();
        if (!l) goto _L2; else goto _L1
_L1:
        com.pandora.android.provider.b.a.b().o().a(((e.e) (view)).y, ((e.e) (view)).z.i, true, null);
        if (e.d)
        {
            a(((e.d) (null)));
        }
_L6:
        flag = false;
_L4:
        return flag;
_L2:
        if (!i1 || !e.c)
        {
            continue; /* Loop/switch isn't completed */
        }
        a(com.pandora.android.coachmark.e.d.d);
        if (view == null) goto _L4; else goto _L3
_L3:
        com.pandora.android.provider.b.a.b().o().a(((e.e) (view)).y, ((e.e) (view)).z.i, false, com.pandora.android.coachmark.e.d.d.g);
        return true;
        if (!e.b) goto _L6; else goto _L5
_L5:
        return true;
    }
}
