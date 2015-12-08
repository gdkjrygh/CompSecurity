// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.stories;

import Jo;
import Jr;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.snapchat.android.Timber;
import dv;
import zr;
import zs;

public class StoriesScrollBar extends RelativeLayout
{

    final View a;
    final View b;
    zr c;
    android.support.v7.widget.RecyclerView.l d = new android.support.v7.widget.RecyclerView.l() {

        private StoriesScrollBar a;

        public final void a(RecyclerView recyclerview, int j1)
        {
            if (!StoriesScrollBar.c(a))
            {
                if (j1 == 0)
                {
                    StoriesScrollBar.g(a);
                    return;
                }
                if (j1 == 1)
                {
                    StoriesScrollBar.h(a);
                    return;
                }
            }
        }

        public final void a(RecyclerView recyclerview, int j1, int k1)
        {
            if (!StoriesScrollBar.c(a))
            {
                if (!StoriesScrollBar.d(a))
                {
                    recyclerview = StoriesScrollBar.e(a);
                    Object obj = (LinearLayoutManager)((zr) (recyclerview)).a.e;
                    j1 = recyclerview.b();
                    int l1 = ((LinearLayoutManager) (obj)).m();
                    float f1;
                    if (l1 < j1)
                    {
                        f1 = 0.0F;
                    } else
                    {
                        int i2 = ((zr) (recyclerview)).c.p();
                        f1 = recyclerview.c();
                        float f2 = i2 - j1;
                        float f3 = ((zr) (recyclerview)).a.getHeight();
                        obj = ((LinearLayoutManager) (obj)).a(l1);
                        float f4 = l1 - j1;
                        f1 = Math.max(Math.min((recyclerview.c() * f4 - (float)((View) (obj)).getTop()) / (f2 * f1 - f3), 1.0F), 0.0F);
                    }
                    if ((float)k1 * (f1 - StoriesScrollBar.f(a)) >= 0.0F)
                    {
                        StoriesScrollBar.a(a, f1);
                    }
                    StoriesScrollBar.a(a);
                    return;
                }
                if (StoriesScrollBar.f(a) != 0.0F)
                {
                    StoriesScrollBar.a(a, 0.0F);
                    StoriesScrollBar.a(a);
                    return;
                }
            }
        }

            
            {
                a = StoriesScrollBar.this;
                super();
            }
    };
    private final Context e;
    private final View f;
    private final View g;
    private final View h;
    private final TextView i;
    private final ObjectAnimator j;
    private boolean k;
    private float l;

    public StoriesScrollBar(Context context)
    {
        this(context, null, 0);
    }

    public StoriesScrollBar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public StoriesScrollBar(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        k = false;
        l = 0.0F;
        attributeset = (LayoutInflater)context.getSystemService("layout_inflater");
        e = context;
        f = attributeset.inflate(0x7f0400f0, this);
        g = findViewById(0x7f0d0502);
        a = g.findViewById(0x7f0d0504);
        b = g.findViewById(0x7f0d0503);
        h = g.findViewById(0x7f0d0505);
        i = (TextView)f.findViewById(0x7f0d0506);
        f.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() {

            private StoriesScrollBar a;

            public final void onLayoutChange(View view, int j1, int k1, int l1, int i2, int j2, int k2, 
                    int l2, int i3)
            {
                if (k1 == k2)
                {
                    return;
                } else
                {
                    view = a;
                    float f1 = ((StoriesScrollBar) (view)).c.a();
                    android.view.ViewGroup.LayoutParams layoutparams = ((StoriesScrollBar) (view)).a.getLayoutParams();
                    layoutparams.height = (int)(f1 * (float)((StoriesScrollBar) (view)).b.getHeight());
                    layoutparams.width = (int)view.getResources().getDimension(0x7f0a0128);
                    ((StoriesScrollBar) (view)).a.setLayoutParams(layoutparams);
                    StoriesScrollBar.a(a);
                    return;
                }
            }

            
            {
                a = StoriesScrollBar.this;
                super();
            }
        });
        j = ObjectAnimator.ofFloat(i, View.ALPHA, new float[] {
            1.0F, 0.0F
        });
        j.setDuration(500L);
        j.addListener(new Jr() {

            private StoriesScrollBar a;

            public final void onAnimationEnd(Animator animator)
            {
                StoriesScrollBar.b(a).setVisibility(8);
                StoriesScrollBar.b(a).setAlpha(1.0F);
            }

            
            {
                a = StoriesScrollBar.this;
                super();
            }
        });
    }

    static float a(StoriesScrollBar storiesscrollbar, float f1)
    {
        storiesscrollbar.l = f1;
        return f1;
    }

    private void a(float f1)
    {
        int i1 = (int)Jo.a(getResources().getDimension(0x7f0a012f), e);
        int l1 = (int)Jo.a(getResources().getDimension(0x7f0a0130), e);
        float f2 = (float)h.getHeight() / 2.0F;
        float f3 = (float)i.getHeight() / 2.0F;
        i.setY((f2 + f1) - f3);
        Object obj = (android.widget.RelativeLayout.LayoutParams)i.getLayoutParams();
        TextView textview;
        if (k)
        {
            ((android.widget.RelativeLayout.LayoutParams) (obj)).setMargins(0, 0, i1, 0);
        } else
        {
            ((android.widget.RelativeLayout.LayoutParams) (obj)).setMargins(0, 0, l1, 0);
        }
        i.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        textview = i;
        obj = c;
        f1 = l;
        f2 = ((zr) (obj)).a();
        if (f1 < f2)
        {
            int j1 = (int)((f1 / f2) * (float)(((zr) (obj)).c.o() - 1));
            obj = ((zr) (obj)).c.a(j1);
        } else
        {
            int k1 = (int)(((f1 - f2) / (1.0F - f2)) * (float)(((zr) (obj)).c.n() - 1));
            obj = ((zr) (obj)).c.b(k1);
        }
        textview.setText(((CharSequence) (obj)));
    }

    private void a(int i1)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)f.getLayoutParams();
        layoutparams.setMargins(0, i1, 0, 0);
        f.setLayoutParams(layoutparams);
    }

    static void a(StoriesScrollBar storiesscrollbar)
    {
        int i1 = storiesscrollbar.b.getTop();
        int j1 = storiesscrollbar.b.getBottom();
        int k1 = storiesscrollbar.h.getHeight();
        float f1 = i1;
        float f2 = storiesscrollbar.l;
        f1 = (float)(j1 - k1 - i1) * f2 + f1;
        storiesscrollbar.h.setY(f1);
        storiesscrollbar.a(f1);
    }

    static void a(StoriesScrollBar storiesscrollbar, int i1)
    {
        storiesscrollbar.a(i1);
    }

    private boolean a(boolean flag)
    {
        zr zr1;
        LinearLayoutManager linearlayoutmanager;
        int j1;
        int k1;
        int l1;
        int i2;
        k1 = ((android.widget.RelativeLayout.LayoutParams)f.getLayoutParams()).topMargin;
        zr1 = c;
        linearlayoutmanager = (LinearLayoutManager)zr1.a.e;
        l1 = zr.a(zr1.a);
        j1 = linearlayoutmanager.m();
        i2 = linearlayoutmanager.o();
        if (j1 != -1 && zr1.c.c(i2)) goto _L2; else goto _L1
_L1:
        int i1 = zr1.a.getHeight();
_L3:
        if (k1 != i1)
        {
            if (!flag)
            {
                a(i1);
            } else
            {
                f.getLayoutParams();
                ValueAnimator valueanimator = (ValueAnimator)dv.a(ValueAnimator.ofInt(new int[] {
                    k1, i1
                }));
                valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

                    private StoriesScrollBar a;

                    public final void onAnimationUpdate(ValueAnimator valueanimator1)
                    {
                        StoriesScrollBar.a(a, ((Integer)valueanimator1.getAnimatedValue()).intValue());
                    }

            
            {
                a = StoriesScrollBar.this;
                super();
            }
                });
                valueanimator.setDuration(200L);
                valueanimator.setInterpolator(new AccelerateDecelerateInterpolator());
                valueanimator.start();
            }
            return true;
        } else
        {
            return false;
        }
_L2:
        i1 = j1;
_L4:
label0:
        {
            if (i1 > i2)
            {
                break MISSING_BLOCK_LABEL_179;
            }
            if (!zr1.c.c(i1))
            {
                break label0;
            }
            if (i1 == j1)
            {
                i1 = zr1.b.a(zr1.a, i1).getHeight();
            } else
            {
                i1 = zr.a(linearlayoutmanager.a(i1)) - l1;
            }
        }
          goto _L3
        i1++;
          goto _L4
        Timber.e("StoriesScrollBarController", "This should not happen. At least one story item should be visible to show the scroll bar", new Object[0]);
        i1 = zr1.a.getHeight();
          goto _L3
    }

    static TextView b(StoriesScrollBar storiesscrollbar)
    {
        return storiesscrollbar.i;
    }

    private void b()
    {
        j.cancel();
        i.setVisibility(0);
    }

    static boolean c(StoriesScrollBar storiesscrollbar)
    {
        return storiesscrollbar.k;
    }

    static boolean d(StoriesScrollBar storiesscrollbar)
    {
        return storiesscrollbar.a(false);
    }

    static zr e(StoriesScrollBar storiesscrollbar)
    {
        return storiesscrollbar.c;
    }

    static float f(StoriesScrollBar storiesscrollbar)
    {
        return storiesscrollbar.l;
    }

    static void g(StoriesScrollBar storiesscrollbar)
    {
        storiesscrollbar.j.setStartDelay(1000L);
        storiesscrollbar.j.start();
    }

    static void h(StoriesScrollBar storiesscrollbar)
    {
        storiesscrollbar.b();
    }

    public final void a()
    {
        if (!k)
        {
            a(false);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 36
    //                   0 38
    //                   1 339
    //                   2 88
    //                   3 339;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        return true;
_L2:
        if (motionevent.getX() < (float)g.getLeft() || !c.c.q())
        {
            return false;
        }
        k = true;
        c.a(true);
        b();
_L4:
        float f1 = b.getY();
        float f3 = ((float)b.getHeight() + f1) - (float)h.getHeight();
        float f4 = motionevent.getY();
        LinearLayoutManager linearlayoutmanager;
        if (f4 < f1)
        {
            l = 0.0F;
        } else
        if (f4 > f3)
        {
            l = 1.0F;
            f1 = f3;
        } else
        {
            l = (f4 - f1) / (f3 - f1);
            f1 = f4;
        }
        h.setY(f1);
        a(f1);
        motionevent = c;
        f3 = l;
        linearlayoutmanager = (LinearLayoutManager)((zr) (motionevent)).a.e;
        if (f3 == 0.0F)
        {
            linearlayoutmanager.a(0, 0);
        } else
        {
            int k1 = ((zr) (motionevent)).c.p();
            float f2 = (float)((zr) (motionevent)).a.getHeight() - motionevent.c();
            if (f3 == 1.0F)
            {
                linearlayoutmanager.a(k1 - 1, (int)f2);
            } else
            {
                int i1 = motionevent.b();
                k1 -= i1;
                f3 = f3 * (float)(k1 - 1) + (float)i1;
                int i2 = (int)f3;
                float f5 = (f3 - (float)i1) / (float)k1;
                float f6 = i2;
                i1 = (int)(f5 * f2 - motionevent.c() * (f3 - f6));
                linearlayoutmanager.a((int)f3, i1);
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        k = false;
        c.a(false);
        a(true);
        int j1 = (int)Jo.a(getResources().getDimension(0x7f0a012f), e);
        int l1 = (int)Jo.a(getResources().getDimension(0x7f0a0130), e);
        motionevent = (android.widget.RelativeLayout.LayoutParams)i.getLayoutParams();
        ValueAnimator valueanimator = (ValueAnimator)dv.a(ValueAnimator.ofInt(new int[] {
            j1, l1
        }));
        valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(motionevent) {

            private android.widget.RelativeLayout.LayoutParams a;
            private StoriesScrollBar b;

            public final void onAnimationUpdate(ValueAnimator valueanimator1)
            {
                a.setMargins(0, 0, ((Integer)valueanimator1.getAnimatedValue()).intValue(), 0);
                StoriesScrollBar.b(b).setLayoutParams(a);
            }

            
            {
                b = StoriesScrollBar.this;
                a = layoutparams;
                super();
            }
        });
        valueanimator.addListener(new Jr() {

            private StoriesScrollBar a;

            public final void onAnimationEnd(Animator animator)
            {
                StoriesScrollBar.g(a);
            }

            
            {
                a = StoriesScrollBar.this;
                super();
            }
        });
        valueanimator.setDuration(200L);
        valueanimator.start();
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void setStoriesScrollBarController(zr zr1)
    {
        c = zr1;
    }
}
