// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.daydream;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import p.cw.c;

// Referenced classes of package com.pandora.android.daydream:
//            a

public static class >
{

    private float a;
    private float b;
    private WeakReference c;
    private ObjectAnimator d;
    private boolean e;

    static ObjectAnimator a(> >, ObjectAnimator objectanimator)
    {
        >.d = objectanimator;
        return objectanimator;
    }

    static boolean a(d d1)
    {
        return d1.e;
    }

    static WeakReference b(e e1)
    {
        return e1.c;
    }

    static ObjectAnimator c(c c1)
    {
        return c1.d;
    }

    public int a()
    {
        float f = ((ImageView)c.get()).getWidth();
        float f1 = ((ImageView)c.get()).getHeight();
        if (f > f1)
        {
            f = (f * b) / a - f1;
        } else
        {
            f = (f1 * a) / b - f;
        }
        return Math.round(f / 2.0F);
    }

    public void a(float f, float f1)
    {
        a = f;
        b = f1;
    }

    public void b()
    {
        ImageView imageview = (ImageView)c.get();
        float f = imageview.getWidth();
        f = imageview.getHeight();
        if (imageview == null)
        {
            return;
        }
        int j = a();
        String s;
        int i;
        if (c.z.s().getResources().getConfiguration().orientation == 1)
        {
            s = "scrollX";
            i = imageview.getScrollX();
        } else
        {
            s = "scrollY";
            i = imageview.getScrollY();
        }
        e = false;
        d = ObjectAnimator.ofInt(imageview, s, new int[] {
            i, j
        });
        d.addListener(new AnimatorListenerAdapter(s, j) {

            final String a;
            final int b;
            final a.a c;

            public void onAnimationEnd(Animator animator)
            {
                if (a.a.a(c))
                {
                    return;
                } else
                {
                    a.a.a(c, ObjectAnimator.ofInt(a.a.b(c).get(), a, new int[] {
                        b, -b
                    }));
                    com.pandora.android.daydream.a.a.c(c).setRepeatCount(-1);
                    com.pandora.android.daydream.a.a.c(c).setRepeatMode(2);
                    com.pandora.android.daydream.a.a.c(c).setDuration(25000L);
                    com.pandora.android.daydream.a.a.c(c).start();
                    return;
                }
            }

            
            {
                c = a.a.this;
                a = s;
                b = i;
                super();
            }
        });
        d.setDuration(Math.abs(((i - j) * 12500) / j));
        d.start();
    }

    public void c()
    {
        if (d == null)
        {
            return;
        } else
        {
            e = true;
            d.end();
            d = null;
            ImageView imageview = (ImageView)c.get();
            imageview.setScrollX(0);
            imageview.setScrollY(0);
            return;
        }
    }

    public rAdapter(ImageView imageview)
    {
        c = new WeakReference(imageview);
    }
}
