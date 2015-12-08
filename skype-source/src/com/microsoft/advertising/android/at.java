// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;

// Referenced classes of package com.microsoft.advertising.android:
//            b, by, as, af, 
//            j, g, d, v

final class at extends b
{

    private int e;
    private Animation f;
    private Animation g;
    private final j h;
    private by.c i;

    public at(Context context, g g1, j j)
    {
        super(context, g1, null);
        setLayoutParams(by.a());
        h = j;
        f = new AlphaAnimation(0.0F, 1.0F);
        f.setDuration(150L);
        f.setFillAfter(true);
        g = new AlphaAnimation(1.0F, 0.0F);
        g.setDuration(150L);
        g.setFillAfter(true);
        i = new by.c(context, j) {

            final at a;
            private final j b;

            public final boolean onSingleTapUp(MotionEvent motionevent)
            {
                return b.c(a.a);
            }

            
            {
                a = at.this;
                b = j1;
                super(context);
            }
        };
        setOnTouchListener(i);
    }

    private static LinearLayout a(Context context)
    {
        LinearLayout linearlayout = new LinearLayout(context);
        linearlayout.setLayoutParams(by.a());
        linearlayout.setOrientation(1);
        int j = (int)(5F * context.getResources().getDisplayMetrics().density);
        linearlayout.setPadding(j, 0, j, 0);
        linearlayout.setBackgroundColor(0xff000000);
        linearlayout.setGravity(17);
        return linearlayout;
    }

    private void a(String s, String s1)
    {
        LinearLayout linearlayout = a(getContext());
        linearlayout.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener(s1, s, linearlayout) {

            final at a;
            private final String b;
            private final String c;
            private final LinearLayout d;

            public final void onGlobalLayout()
            {
                if (b.equals(""))
                {
                    v v1 = v.a(a.getContext(), c, 17, 12, a.getHeight(), true, 2);
                    d.addView(v1);
                    v1.setTextColor(-1);
                    v1.setGravity(17);
                    v1.setTextColor(Color.argb(255, 20, 184, 105));
                } else
                {
                    v v2 = v.a(a.getContext(), c, 17, 13, a.getHeight() / 2, true, 1);
                    d.addView(v2);
                    v2.setTypeface(Typeface.DEFAULT_BOLD);
                    v2.setTextColor(Color.argb(255, 20, 184, 105));
                    v v3 = v.a(a.getContext(), b, 15, 12, a.getHeight() / 2, false, 1);
                    d.addView(v3);
                    v3.setTextColor(Color.argb(255, 73, 119, 193));
                    v2.a(new v.a(this, v2, v3) {

                        final _cls2 a;
                        private final v b;
                        private final v c;

                        public final void a()
                        {
                            b.setGravity(17);
                            if (c.getTextSize() > b.getTextSize())
                            {
                                c.setTextSize(b.getTextSize());
                            }
                            c.setGravity(17);
                        }

            
            {
                a = _pcls2;
                b = v1;
                c = v2;
                super();
            }
                    });
                }
                d.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }

            
            {
                a = at.this;
                b = s;
                c = s1;
                d = linearlayout;
                super();
            }
        });
        addView(linearlayout);
    }

    public final boolean a(d d, b.a a1)
    {
        if (d == null || !(d instanceof as))
        {
            return false;
        }
        af.a(new Object[] {
            a1
        });
        super.setAdLoadedListener(a1);
        a = d;
        d = (as)d;
        if (d.i() != null)
        {
            a1 = d.i();
            LinearLayout linearlayout = a(getContext());
            linearlayout.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener(a1, linearlayout) {

                final at a;
                private final String b;
                private final LinearLayout c;

                public final void onGlobalLayout()
                {
                    v v1 = v.a(a.getContext(), b, 15, 12, a.getHeight(), false, 2);
                    c.addView(v1);
                    v1.setTextColor(-1);
                    v1.setGravity(17);
                    c.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }

            
            {
                a = at.this;
                b = s;
                c = linearlayout;
                super();
            }
            });
            addView(linearlayout);
        }
        if (d.k() != null)
        {
            a(d.h(), d.k());
        }
        if (d.j() != null)
        {
            a(d.h(), d.j());
        }
        super.r();
        e = getChildCount() - 1;
        return true;
    }

    public final void b()
    {
        int l = getChildCount();
        if (l <= 1) goto _L2; else goto _L1
_L1:
        int j;
        int k;
        int i1;
        if (e + 1 == l)
        {
            j = 0;
        } else
        {
            j = e + 1;
        }
        i1 = e;
        k = 0;
_L6:
        if (k < l) goto _L4; else goto _L3
_L3:
        getChildAt(j).startAnimation(f);
        getChildAt(i1).startAnimation(g);
        e = j;
_L2:
        return;
_L4:
        if (k == j || k == i1)
        {
            getChildAt(k).setVisibility(0);
        } else
        {
            getChildAt(k).clearAnimation();
            getChildAt(k).setVisibility(4);
        }
        k++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void t()
    {
    }
}
