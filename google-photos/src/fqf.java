// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.RectF;

public final class fqf
{

    public float a;
    public float b;
    public RectF c;
    public float d;

    public fqf()
    {
        c = new RectF();
    }

    public final void a(ValueAnimator valueanimator, fqf fqf1)
    {
        valueanimator.setValues(new PropertyValuesHolder[] {
            PropertyValuesHolder.ofFloat("translate_x", new float[] {
                a, fqf1.a
            }), PropertyValuesHolder.ofFloat("translate_y", new float[] {
                b, fqf1.b
            }), PropertyValuesHolder.ofFloat("clip_left", new float[] {
                c.left, fqf1.c.left
            }), PropertyValuesHolder.ofFloat("clip_top", new float[] {
                c.top, fqf1.c.top
            }), PropertyValuesHolder.ofFloat("clip_right", new float[] {
                c.right, fqf1.c.right
            }), PropertyValuesHolder.ofFloat("clip_bottom", new float[] {
                c.bottom, fqf1.c.bottom
            }), PropertyValuesHolder.ofFloat("scale", new float[] {
                d, fqf1.d
            })
        });
    }
}
