// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.PropertyValuesHolder;
import android.graphics.Rect;
import android.view.View;

final class dci
{

    public final PropertyValuesHolder a;
    public final PropertyValuesHolder b;
    public final PropertyValuesHolder c;
    public final PropertyValuesHolder d;

    public dci(dbd dbd1, View view, Rect rect)
    {
        a = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[] {
            0.0F, 0.0F
        });
        b = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[] {
            0.0F, 0.0F
        });
        c = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[] {
            0.0F, 0.0F
        });
        d = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[] {
            0.0F, 0.0F
        });
        a(dbd1, view, rect, true);
    }

    final void a(dbd dbd1, View view, Rect rect, boolean flag)
    {
        float f = (float)rect.width() / (float)view.getMeasuredWidth();
        float f1 = (float)rect.height() / (float)view.getMeasuredHeight();
        int j = rect.centerX();
        int i;
        int k;
        if (dbd1.a)
        {
            i = dbd1.i;
        } else
        {
            i = 0;
        }
        j = (i + j) - view.getLeft() - view.getMeasuredWidth() / 2;
        k = rect.centerY();
        if (dbd1.a)
        {
            i = 0;
        } else
        {
            i = dbd1.i;
        }
        i = (i + k) - view.getTop() - view.getMeasuredHeight() / 2;
        a.setFloatValues(new float[] {
            (float)j, 0.0F
        });
        b.setFloatValues(new float[] {
            (float)i, 0.0F
        });
        c.setFloatValues(new float[] {
            f, 1.0F
        });
        d.setFloatValues(new float[] {
            f1, 1.0F
        });
        if (flag)
        {
            view.setTranslationX(j);
            view.setTranslationY(i);
            view.setScaleX(f);
            view.setScaleY(f1);
        }
    }
}
