// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.graphics.Point;
import android.os.Handler;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;

public final class bgb
{

    public static final TimeInterpolator a = new msy(0.52F, 0.3F, 0.12F, 1.0F);
    public static final TimeInterpolator b = new AccelerateInterpolator(1.0F);
    public static final TimeInterpolator c = new AccelerateInterpolator(1.5F);
    public static final TimeInterpolator d = new msy(0.24F, 1.0F, 0.32F, 1.0F);
    public static final TimeInterpolator e = new msy(0.0F, 0.0F, 0.6F, 1.0F);
    public static final TimeInterpolator f = new bgc();
    private static final TimeInterpolator g = new msy(0.24F, 1.0F, 0.32F, 1.0F);

    public static void a(Handler handler, bdo bdo, float f1, float f2, float f3, float f4, float f5, float f6)
    {
        handler.removeCallbacksAndMessages(null);
        handler.post(new bgd(handler, bdo, 300L, f1, f2, f3, 0.5F, 0.5F, f6));
    }

    public static void a(View view)
    {
        view.setY((float)b.b(view.getContext()).y * 0.075F);
        view.setAlpha(0.0F);
        view.animate().setStartDelay(100L).setDuration(300L).setInterpolator(g).y(0.0F).alpha(1.0F);
    }

    public static void a(View aview[], boolean flag)
    {
        boolean flag1 = false;
        Point point = b.b(aview[0].getContext());
        float f1 = 0.075F * (float)point.y;
        int ai[] = new int[2];
        int k1 = 0;
        int i = -1;
        for (int j = 1; j < aview.length;)
        {
            View view1 = aview[j];
            view1.getLocationOnScreen(ai);
            int i2 = ai[0];
            int l1 = k1;
            int l = i;
            if (view1.getWidth() + i2 >= 0)
            {
                l1 = k1;
                l = i;
                if (ai[0] < point.x)
                {
                    l = i;
                    if (i < 0)
                    {
                        l = j;
                    }
                    l1 = k1 + 1;
                }
            }
            j++;
            k1 = l1;
            i = l;
        }

        ObjectAnimator aobjectanimator[] = new ObjectAnimator[aview.length * 2];
        int i1 = 0;
        int k;
        do
        {
            k = ((flag1) ? 1 : 0);
            if (i1 >= aview.length)
            {
                break;
            }
            View view = aview[i1];
            view.setY(f1);
            view.setAlpha(0.0F);
            aobjectanimator[i1 * 2] = ObjectAnimator.ofFloat(view, "y", new float[] {
                f1, 0.0F
            });
            aobjectanimator[i1 * 2 + 1] = ObjectAnimator.ofFloat(view, "alpha", new float[] {
                0.0F, 1.0F
            });
            i1++;
        } while (true);
        do
        {
            while (k < aview.length * 2) 
            {
                long l3 = 100L;
                long l2 = 400L;
                int j1 = k / 2;
                if (j1 > 0)
                {
                    float f2;
                    if (j1 < i)
                    {
                        f2 = 0.0F;
                    } else
                    if (j1 >= i + k1)
                    {
                        f2 = 1.0F;
                    } else
                    {
                        f2 = (float)(j1 - i) / (float)(k1 - 1);
                    }
                    l3 = (long)(f2 * 200F + (1.0F - f2) * 100F);
                    l2 = 400L - l3;
                }
                aobjectanimator[k].setStartDelay(l3);
                aobjectanimator[k].setDuration(l2);
                aobjectanimator[k].setInterpolator(g);
                k++;
            }
            aview = new AnimatorSet();
            aview.playTogether(aobjectanimator);
            aview.start();
            return;
        } while (true);
    }

}
