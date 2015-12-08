// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import Jo;
import Mf;
import Ms;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;
import com.squareup.otto.Bus;

public class ColorPickerView extends RelativeLayout
{
    final class a extends Animation
    {

        private final int a;
        private final int b;
        private final View c;

        protected final void applyTransformation(float f1, Transformation transformation)
        {
            transformation = c.getLayoutParams();
            if (transformation == null)
            {
                return;
            } else
            {
                transformation.width = (int)((float)a + (float)b * f1);
                c.setLayoutParams(transformation);
                return;
            }
        }

        public final boolean willChangeBounds()
        {
            return true;
        }

        public a(int i1, int j1, View view)
        {
            a = i1;
            b = j1 - i1;
            c = view;
        }
    }


    private static final int a[] = {
        0xffff0000, -65383, 0xffcc00ff, 0xff0000ff, 0xff00ffff, 0xff25e805, -256, -24064, 0xffa95e1b, 0xff000000, 
        -1
    };
    private boolean b;
    private boolean c;
    private ScaleAnimation d;
    private TranslateAnimation e;
    private a f;
    private View g;
    private View h;
    private View i;
    private int j[];
    private float k[];
    private Handler l;
    private Runnable m;

    public ColorPickerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = false;
        c = false;
        j = new int[2];
        k = new float[3];
        l = new Handler();
        m = new Runnable() {

            final ColorPickerView a;

            public final void run()
            {
                if (!ColorPickerView.a(a) && ColorPickerView.b(a))
                {
                    ColorPickerView.d(a).startAnimation(ColorPickerView.c(a));
                    ColorPickerView.f(a).startAnimation(ColorPickerView.e(a));
                    ColorPickerView.g(a).setAnimationListener(new android.view.animation.Animation.AnimationListener(this) {

                        private _cls1 a;

                        public final void onAnimationEnd(Animation animation)
                        {
                        }

                        public final void onAnimationRepeat(Animation animation)
                        {
                        }

                        public final void onAnimationStart(Animation animation)
                        {
                            animation = new AlphaAnimation(0.0F, 1.0F);
                            animation.setDuration(140L);
                            animation.setFillAfter(true);
                            a.a.findViewById(0x7f0d0554).startAnimation(animation);
                            a.a.findViewById(0x7f0d0553).startAnimation(animation);
                        }

            
            {
                a = _pcls1;
                super();
            }
                    });
                    ColorPickerView.h(a).startAnimation(ColorPickerView.g(a));
                    ColorPickerView.a(a, true);
                }
            }

            
            {
                a = ColorPickerView.this;
                super();
            }
        };
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(0x7f04010e, this, true);
        h = findViewById(0x7f0d0557);
        context = findViewById(0x7f0d0558);
        i = findViewById(0x7f0d0556);
        g = findViewById(0x7f0d0552);
        attributeset = new android.view.View.OnTouchListener() {

            final ColorPickerView a;

            public final boolean onTouch(View view, MotionEvent motionevent)
            {
                switch (motionevent.getAction())
                {
                default:
                    return true;

                case 0: // '\0'
                    ColorPickerView.a(a, motionevent);
                    ColorPickerView.b(a, true);
                    ColorPickerView.j(a).postDelayed(ColorPickerView.i(a), 300L);
                    return true;

                case 1: // '\001'
                    ColorPickerView.b(a, false);
                    ColorPickerView.j(a).removeCallbacks(ColorPickerView.i(a));
                    view = new AlphaAnimation(1.0F, 0.0F);
                    view.setDuration(200L);
                    view.setFillAfter(true);
                    view.setAnimationListener(new android.view.animation.Animation.AnimationListener(this) {

                        private _cls2 a;

                        public final void onAnimationEnd(Animation animation)
                        {
                            animation = new ScaleAnimation(26F, 1.0F, 1.0F, 1.0F, 1, 1.0F, 1, 0.5F);
                            animation.setDuration(140L);
                            ColorPickerView.f(a.a).startAnimation(animation);
                            animation = new TranslateAnimation((int)Jo.a(-23.5F, a.a.getContext()), 0.0F, 0.0F, 0.0F);
                            animation.setDuration(140L);
                            animation.setFillAfter(true);
                            ColorPickerView.d(a.a).startAnimation(animation);
                            animation = new a(ColorPickerView.h(a.a).getWidth(), (int)Jo.a(12F, a.a.getContext()), ColorPickerView.h(a.a));
                            animation.setDuration(140L);
                            ColorPickerView.h(a.a).startAnimation(animation);
                        }

                        public final void onAnimationRepeat(Animation animation)
                        {
                        }

                        public final void onAnimationStart(Animation animation)
                        {
                        }

            
            {
                a = _pcls2;
                super();
            }
                    });
                    if (ColorPickerView.a(a))
                    {
                        a.findViewById(0x7f0d0554).startAnimation(view);
                        a.findViewById(0x7f0d0553).startAnimation(view);
                    }
                    ColorPickerView.a(a, false);
                    return true;

                case 2: // '\002'
                    ColorPickerView.a(a, motionevent);
                    return true;

                case 3: // '\003'
                    ColorPickerView.b(a, false);
                    return true;
                }
            }

            
            {
                a = ColorPickerView.this;
                super();
            }
        };
        g.setOnTouchListener(attributeset);
        i.setOnTouchListener(attributeset);
        context.setOnTouchListener(attributeset);
        h.setOnTouchListener(attributeset);
        e = new TranslateAnimation(0.0F, (int)Jo.a(-23.5F, getContext()), 0.0F, 0.0F);
        e.setDuration(140L);
        e.setFillAfter(true);
        f = new a((int)Jo.a(12F, getContext()), (int)Jo.a(36F, getContext()), g);
        f.setDuration(140L);
        d = new ScaleAnimation(1.0F, 26F, 1.0F, 1.0F, 1, 1.0F, 1, 0.5F);
        d.setDuration(140L);
        d.setFillAfter(true);
    }

    static void a(ColorPickerView colorpickerview, MotionEvent motionevent)
    {
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        i1 = (int)motionevent.getRawY();
        k1 = (int)motionevent.getRawX();
        j1 = colorpickerview.g.getHeight() / 11;
        colorpickerview.g.getLocationOnScreen(colorpickerview.j);
        i2 = colorpickerview.j[1];
        l1 = colorpickerview.j[0] + colorpickerview.g.getWidth();
        if ((float)k1 >= (float)l1 - 4F * Jo.a(12F, colorpickerview.getContext()) && i1 <= j1 * 12 + i2) goto _L2; else goto _L1
_L1:
        motionevent = colorpickerview.getResources().getDisplayMetrics();
        colorpickerview.k[0] = ((float)i1 * 360F) / (float)((DisplayMetrics) (motionevent)).heightPixels;
        if (k1 < ((DisplayMetrics) (motionevent)).widthPixels / 2)
        {
            colorpickerview.k[1] = 1.0F;
            colorpickerview.k[2] = ((float)k1 * 2.0F) / (float)((DisplayMetrics) (motionevent)).widthPixels;
        } else
        {
            colorpickerview.k[1] = 2.0F - ((float)k1 * 2.0F) / (float)((DisplayMetrics) (motionevent)).widthPixels;
            colorpickerview.k[2] = 1.0F;
        }
        j1 = Color.HSVToColor(colorpickerview.k);
_L4:
        colorpickerview.a(j1);
        return;
_L2:
        if (i1 < i2 + j1)
        {
            i1 = a[0];
        } else
        if (i1 < j1 * 2 + i2)
        {
            i1 = a[1];
        } else
        if (i1 < j1 * 3 + i2)
        {
            i1 = a[2];
        } else
        if (i1 < j1 * 4 + i2)
        {
            i1 = a[3];
        } else
        if (i1 < j1 * 5 + i2)
        {
            i1 = a[4];
        } else
        if (i1 < j1 * 6 + i2)
        {
            i1 = a[5];
        } else
        if (i1 < j1 * 7 + i2)
        {
            i1 = a[6];
        } else
        if (i1 < (j1 << 3) + i2)
        {
            i1 = a[7];
        } else
        if (i1 < j1 * 9 + i2)
        {
            i1 = a[8];
        } else
        if (i1 < j1 * 10 + i2)
        {
            i1 = a[9];
        } else
        {
            i1 = a[10];
        }
        if ((float)k1 < (float)l1 - Jo.a(12F, colorpickerview.getContext()) && (float)k1 >= (float)l1 - Jo.a(12F, colorpickerview.getContext()) * 2.0F)
        {
            Color.colorToHSV(i1, colorpickerview.k);
            motionevent = colorpickerview.k;
            motionevent[1] = motionevent[1] * 0.5F;
            if (i1 == a[9])
            {
                j1 = Color.argb(255, 140, 140, 140);
            } else
            if (i1 == a[3])
            {
                j1 = Color.argb(255, 108, 171, 255);
            } else
            if (i1 == a[10])
            {
                j1 = Color.argb(120, 255, 255, 255);
            } else
            {
                j1 = Color.HSVToColor(colorpickerview.k);
            }
        } else
        {
            j1 = i1;
            if ((float)k1 < (float)l1 - Jo.a(12F, colorpickerview.getContext()) * 2.0F)
            {
                Color.colorToHSV(i1, colorpickerview.k);
                motionevent = colorpickerview.k;
                motionevent[2] = motionevent[2] * 0.6F;
                if (i1 == a[9])
                {
                    j1 = Color.argb(80, 0, 0, 0);
                } else
                if (i1 == a[10])
                {
                    j1 = Color.argb(255, 200, 200, 200);
                } else
                {
                    j1 = Color.HSVToColor(colorpickerview.k);
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static boolean a(ColorPickerView colorpickerview)
    {
        return colorpickerview.c;
    }

    static boolean a(ColorPickerView colorpickerview, boolean flag)
    {
        colorpickerview.c = flag;
        return flag;
    }

    static boolean b(ColorPickerView colorpickerview)
    {
        return colorpickerview.b;
    }

    static boolean b(ColorPickerView colorpickerview, boolean flag)
    {
        colorpickerview.b = flag;
        return flag;
    }

    static TranslateAnimation c(ColorPickerView colorpickerview)
    {
        return colorpickerview.e;
    }

    static View d(ColorPickerView colorpickerview)
    {
        return colorpickerview.i;
    }

    static ScaleAnimation e(ColorPickerView colorpickerview)
    {
        return colorpickerview.d;
    }

    static View f(ColorPickerView colorpickerview)
    {
        return colorpickerview.h;
    }

    static a g(ColorPickerView colorpickerview)
    {
        return colorpickerview.f;
    }

    static View h(ColorPickerView colorpickerview)
    {
        return colorpickerview.g;
    }

    static Runnable i(ColorPickerView colorpickerview)
    {
        return colorpickerview.m;
    }

    static Handler j(ColorPickerView colorpickerview)
    {
        return colorpickerview.l;
    }

    public void a(int i1)
    {
        Mf.a().a(new Ms(i1));
    }

}
