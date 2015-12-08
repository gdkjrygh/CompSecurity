// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.Checkable;
import android.widget.RelativeLayout;
import com.nineoldandroids.a.a;
import com.nineoldandroids.a.k;

public class EffectThumbLayout extends RelativeLayout
    implements Checkable
{

    private static final boolean h;
    private static final Interpolator i = new DecelerateInterpolator(1.0F);
    public long a;
    private boolean b;
    private boolean c;
    private int d;
    private int e;
    private View f;
    private View g;
    private k j;
    private com.nineoldandroids.a.a.a k;
    private com.nineoldandroids.a.a.a l;

    public EffectThumbLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = -1L;
        e = 0;
        k = new com.nineoldandroids.a.a.a() {

            final EffectThumbLayout a;

            public void a(a a1)
            {
            }

            public void b(a a1)
            {
                if (com.aviary.android.feather.sdk.widget.EffectThumbLayout.a(a) != null)
                {
                    com.aviary.android.feather.sdk.widget.EffectThumbLayout.a(a).setVisibility(4);
                }
            }

            public void c(a a1)
            {
            }

            public void d(a a1)
            {
            }

            
            {
                a = EffectThumbLayout.this;
                super();
            }
        };
        l = new com.nineoldandroids.a.a.a() {

            final EffectThumbLayout a;

            public void a(a a1)
            {
                if (com.aviary.android.feather.sdk.widget.EffectThumbLayout.a(a) != null)
                {
                    com.aviary.android.feather.sdk.widget.EffectThumbLayout.a(a).setVisibility(0);
                }
            }

            public void b(a a1)
            {
            }

            public void c(a a1)
            {
            }

            public void d(a a1)
            {
            }

            
            {
                a = EffectThumbLayout.this;
                super();
            }
        };
        a(context, attributeset, 0);
    }

    static View a(EffectThumbLayout effectthumblayout)
    {
        return effectthumblayout.f;
    }

    private void a(Context context, AttributeSet attributeset, int i1)
    {
        d = context.getTheme().obtainStyledAttributes(attributeset, com.aviary.android.feather.sdk.R.styleable.AviaryEffectThumbLayout, i1, 0).getInteger(0, 200);
    }

    private void c()
    {
        k k1 = getAnimator();
        if (k1 != null)
        {
            k1.g();
            k1.b();
        }
    }

    private k getAnimator()
    {
        if (j == null)
        {
            j = com.nineoldandroids.a.k.a(g, "translationY", new float[] {
                0.0F, 0.0F
            });
            j.c(d);
            j.a(i);
        }
        return j;
    }

    public void a()
    {
        if (h)
        {
            if (!c)
            {
                c = true;
                a(d, false);
            }
            return;
        } else
        {
            setIsOpened(true);
            return;
        }
    }

    protected void a(int i1, boolean flag)
    {
        float f2 = 0.0F;
        if (f == null || g == null || getHandler() == null)
        {
            return;
        }
        e = f.getMeasuredHeight() + f.getPaddingTop() + f.getPaddingBottom();
        float f1;
        if (flag)
        {
            f1 = -e;
        } else
        {
            f1 = 0.0F;
        }
        if (!flag)
        {
            f2 = -e;
        }
        if (e <= 0)
        {
            post(new Runnable(i1, flag) {

                final int a;
                final boolean b;
                final EffectThumbLayout c;

                public void run()
                {
                    c.a(a, b);
                }

            
            {
                c = EffectThumbLayout.this;
                a = i1;
                b = flag;
                super();
            }
            });
            return;
        }
        c();
        k k1 = getAnimator();
        k1.a(new float[] {
            f1, f2
        });
        com.nineoldandroids.a.a.a a1;
        if (flag)
        {
            a1 = k;
        } else
        {
            a1 = l;
        }
        k1.a(a1);
        k1.a();
    }

    public void b()
    {
        if (h)
        {
            if (c)
            {
                c = false;
                a(d, true);
            }
            return;
        } else
        {
            setIsOpened(false);
            return;
        }
    }

    public boolean isChecked()
    {
        return b;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        c = isChecked();
        f = findViewById(com.aviary.android.feather.sdk.R.id.aviary_hidden);
        g = findViewById(com.aviary.android.feather.sdk.R.id.aviary_image);
        setIsOpened(c);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
    }

    public void setChecked(boolean flag)
    {
        if (b != flag)
        {
            b = flag;
        }
    }

    public void setIsOpened(boolean flag)
    {
        boolean flag1;
label0:
        {
            flag1 = false;
            if (flag != c)
            {
                Log.i("EffectThumbLayout", (new StringBuilder()).append("setIsOpened(").append(a).append("): ").append(flag).toString());
                if (f != null && g != null && getHandler() != null)
                {
                    break label0;
                }
            }
            return;
        }
        e = f.getHeight() + f.getPaddingBottom() + f.getPaddingTop();
        if (e <= 0)
        {
            post(new Runnable(flag) {

                final boolean a;
                final EffectThumbLayout b;

                public void run()
                {
                    b.setIsOpened(a);
                }

            
            {
                b = EffectThumbLayout.this;
                a = flag;
                super();
            }
            });
            return;
        }
        c = flag;
        Object obj = f;
        int i1;
        if (c)
        {
            i1 = 0;
        } else
        {
            i1 = 4;
        }
        ((View) (obj)).setVisibility(i1);
        if (h)
        {
            c();
            obj = g;
            float f1;
            if (flag)
            {
                f1 = -e;
            } else
            {
                f1 = 0.0F;
            }
            ((View) (obj)).setTranslationY(f1);
            return;
        }
        obj = (android.widget.RelativeLayout.LayoutParams)g.getLayoutParams();
        i1 = ((flag1) ? 1 : 0);
        if (flag)
        {
            i1 = e;
        }
        obj.bottomMargin = i1;
        g.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
    }

    public void setSelected(boolean flag)
    {
        super.setSelected(flag);
    }

    public void toggle()
    {
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT > 10)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
    }
}
