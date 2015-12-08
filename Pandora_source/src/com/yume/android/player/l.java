// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.yume.android.sdk.YuMeControlBarInfo;

// Referenced classes of package com.yume.android.player:
//            B, C, D, ag, 
//            E, J

final class l
{

    RelativeLayout a;
    int b;
    int c;
    FrameLayout d;
    boolean e;
    boolean f;
    private B g;
    private LinearLayout h;
    private LinearLayout i;
    private RelativeLayout j;
    private RelativeLayout k;
    private RelativeLayout l;

    public l(YuMeControlBarInfo yumecontrolbarinfo)
    {
        g = B.a();
        b = 10;
        c = 0;
        d = null;
        e = false;
        f = false;
        l = null;
        c = yumecontrolbarinfo.height;
        b = yumecontrolbarinfo.elementSpacing;
    }

    final void a(RelativeLayout relativelayout)
    {
        l = relativelayout;
        try
        {
            if (l != null && k != null)
            {
                k.addView(l);
                k.bringChildToFront(l);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RelativeLayout relativelayout)
        {
            g.c("Exception adding CB Timer Layout.");
        }
        relativelayout.printStackTrace();
    }

    final void a(C c1)
    {
        android.widget.ImageView imageview = c1.a();
        if (imageview != null)
        {
            c1 = c1.d();
            if (c1 != null)
            {
                g.b((new StringBuilder("Displaying CB Overlay: ")).append(ag.e(((D) (c1)).b)).append(", Id: ").append(((D) (c1)).a).toString());
                c1 = ((D) (c1)).j;
                if (c1 == E.b || c1 == E.c)
                {
                    j.addView(imageview);
                } else
                if (c1 == E.d || c1 == E.e)
                {
                    k.addView(imageview);
                    if (l != null)
                    {
                        k.bringChildToFront(l);
                        return;
                    }
                }
            }
        }
    }

    final void a(boolean flag)
    {
        if (f)
        {
            return;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
        alphaanimation.setDuration(1000L);
        a.startAnimation(alphaanimation);
        a.setVisibility(0);
        if (j != null)
        {
            j.setVisibility(0);
        }
        if (k != null)
        {
            k.setVisibility(0);
        }
        f = true;
        return;
        Exception exception;
        exception;
        g.c("Exception showing Control Bars.");
        exception.printStackTrace();
        return;
    }

    final boolean a()
    {
        if (a == null && h == null && i == null && j == null && k == null) goto _L2; else goto _L1
_L1:
        android.content.Context context;
        return false;
_L2:
        if ((context = J.D()) == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        int i1 = J.B();
        a = new RelativeLayout(context);
        if (a == null)
        {
            break; /* Loop/switch isn't completed */
        }
        j = new RelativeLayout(context);
        if (j == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        h = new LinearLayout(context);
        if (h == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        k = new RelativeLayout(context);
        if (k == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = new LinearLayout(context);
        if (i == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (h != null)
        {
            android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(i1, c);
            layoutparams.addRule(10, -1);
            GradientDrawable gradientdrawable = new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[] {
                0xc0101010, 0xc0888888
            });
            gradientdrawable.setCornerRadius(0.0F);
            h.setBackgroundDrawable(gradientdrawable);
            a.addView(h, layoutparams);
            h.addView(j);
        }
        if (i != null)
        {
            android.widget.RelativeLayout.LayoutParams layoutparams1 = new android.widget.RelativeLayout.LayoutParams(i1, c);
            layoutparams1.addRule(12, -1);
            GradientDrawable gradientdrawable1 = new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP, new int[] {
                0xc0101010, 0xc0888888
            });
            gradientdrawable1.setCornerRadius(0.0F);
            i.setBackgroundDrawable(gradientdrawable1);
            a.addView(i, layoutparams1);
            i.addView(k);
        }
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    final void b()
    {
        if (e && a != null)
        {
            a.removeAllViews();
            android.view.ViewParent viewparent = a.getParent();
            if (viewparent != null)
            {
                ((ViewGroup)viewparent).removeView(a);
            }
            e = false;
            f = false;
        }
        a = null;
        h = null;
        i = null;
        k = null;
        j = null;
        d = null;
    }

    final void b(C c1)
    {
        android.widget.ImageView imageview = c1.a();
        if (imageview != null)
        {
            c1 = c1.d();
            if (c1 != null)
            {
                g.b((new StringBuilder("Removing CB Overlay: ")).append(ag.e(((D) (c1)).b)).append(", Id: ").append(((D) (c1)).a).toString());
                c1 = ((D) (c1)).j;
                if (c1 == E.b || c1 == E.c)
                {
                    j.removeView(imageview);
                } else
                if (c1 == E.d || c1 == E.e)
                {
                    k.removeView(imageview);
                    return;
                }
            }
        }
    }

    final void b(boolean flag)
    {
        if (!f)
        {
            return;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
        alphaanimation.setDuration(1000L);
        a.startAnimation(alphaanimation);
        a.setVisibility(8);
        if (j != null)
        {
            j.setVisibility(8);
        }
        if (k != null)
        {
            k.setVisibility(8);
        }
        f = false;
        return;
        Exception exception;
        exception;
        g.c("Exception hiding Control Bars.");
        exception.printStackTrace();
        return;
    }

    final void c()
    {
        if (a != null)
        {
            int i1 = J.B();
            int j1 = J.C();
            int k1 = J.g();
            Object obj = a.getLayoutParams();
            if (obj != null)
            {
                obj.width = i1;
                obj.height = j1 - k1;
            } else
            {
                obj = new android.view.ViewGroup.LayoutParams(i1, j1 - k1);
            }
            a.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            if (d != null && a != null)
            {
                obj = d.getLayoutParams();
                if (obj != null)
                {
                    obj.width = a.getLayoutParams().width;
                    obj.height = a.getLayoutParams().height;
                    d.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
                }
            }
            if (h != null)
            {
                obj = (android.widget.RelativeLayout.LayoutParams)h.getLayoutParams();
                if (obj != null)
                {
                    obj.width = i1;
                    obj.height = c;
                    h.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
                }
            }
            if (i != null)
            {
                obj = (android.widget.RelativeLayout.LayoutParams)i.getLayoutParams();
                if (obj != null)
                {
                    obj.width = i1;
                    obj.height = c;
                    i.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
                }
            }
        }
    }

    public final void d()
    {
        Activity activity;
        if (!e)
        {
            if ((activity = (Activity)J.E()) != null)
            {
                d = new FrameLayout(J.D());
                d.setLayoutParams(a.getLayoutParams());
                d.addView(a);
                activity.addContentView(d, d.getLayoutParams());
                e = true;
                f = true;
                return;
            }
        }
    }
}
