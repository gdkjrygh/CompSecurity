// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.apps.photos.transition.ClipAnimationImageView;

public final class imz extends am
    implements android.view.View.OnTouchListener
{

    Rect a;
    private float ad;
    private float ae;
    private int af;
    private azh ag;
    private azh ah;
    private ClipAnimationImageView b;
    private Drawable c;
    private int d;
    private Rect e;
    private gap f;
    private float g;
    private float h;

    public imz()
    {
        d = ine.a;
        ag = new ina(this);
        ah = new inb(this);
    }

    static int a(imz imz1, int i)
    {
        imz1.d = i;
        return i;
    }

    static Drawable a(imz imz1, Drawable drawable)
    {
        imz1.c = drawable;
        return drawable;
    }

    static ClipAnimationImageView a(imz imz1)
    {
        return imz1.b;
    }

    public static imz a(Rect rect, gap gap1, Rect rect1, float f1, int i)
    {
        imz imz1 = new imz();
        imz1.e = rect;
        imz1.f = gap1;
        imz1.a = rect1;
        imz1.g = f1;
        return imz1;
    }

    static void a(imz imz1, boolean flag)
    {
        imz1.a(true);
    }

    static int b(imz imz1)
    {
        return imz1.d;
    }

    private void b(boolean flag)
    {
        b = (ClipAnimationImageView)super.R.findViewById(s.bo);
        fli fli1 = (fli)olm.a(O_(), fli);
        if (flag)
        {
            ((amh)olm.a(O_(), amh)).a(f).a(fli1.e()).a(ag);
        }
        ((amh)olm.a(O_(), amh)).a(f).a(ayt.b(af, af)).a(ah);
    }

    static Drawable c(imz imz1)
    {
        return imz1.c;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = (FrameLayout)layoutinflater.inflate(b.AG, null);
        layoutinflater.setOnTouchListener(this);
        if (bundle != null)
        {
            f = (gap)bundle.getParcelable("media_model");
            g = bundle.getFloat("original_aspect_ratio");
            af = bundle.getInt("override_size");
            return layoutinflater;
        } else
        {
            viewgroup = O_().getWindow().getDecorView();
            af = Math.max(Math.round(viewgroup.getWidth()), Math.round(viewgroup.getHeight()));
            return layoutinflater;
        }
    }

    public final void a(View view, Bundle bundle)
    {
        if (bundle == null)
        {
            b(true);
            return;
        } else
        {
            b(false);
            view.findViewById(s.bn).setAlpha(0.87F);
            return;
        }
    }

    void a(boolean flag)
    {
        float f1;
        float f9;
        int ai[];
        android.animation.TimeInterpolator timeinterpolator;
        Object obj;
        ObjectAnimator objectanimator;
        ObjectAnimator objectanimator1;
        ObjectAnimator objectanimator2;
        ObjectAnimator objectanimator3;
        ObjectAnimator objectanimator4;
        if (flag)
        {
            d = ine.b;
        } else
        {
            d = ine.c;
        }
        ai = new int[2];
        super.R.getLocationOnScreen(ai);
        f1 = a.width() / a.height();
        if (g <= f1) goto _L2; else goto _L1
_L1:
        float f2;
        float f3;
        float f4;
        float f5;
        if (g > 1.0F)
        {
            f4 = (float)Math.ceil((float)a.width() / g);
            f3 = ((g - 1.0F) / 2.0F) * f4;
            f2 = f4;
        } else
        {
            f4 = a.width();
            f2 = f4;
            f3 = 0.0F;
        }
        f5 = ((float)a.height() - f4) / 2.0F;
        float f7;
        float f10;
        android.widget.FrameLayout.LayoutParams layoutparams;
        if (flag)
        {
            f9 = e.width();
            float f6 = f9;
            if (g > 1.0F)
            {
                f6 = f9 * g;
            }
            if (g > 1.0F)
            {
                h = f6 / f2 / g;
                f6 = f4;
                f4 = f5;
                f5 = f3;
                f3 = f6;
            } else
            {
                h = f6 / f2;
                f6 = f3;
                f3 = f4;
                f4 = f5;
                f5 = f6;
            }
        } else
        {
            float f8 = f3;
            f3 = f4;
            f4 = f5;
            f5 = f8;
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        timeinterpolator = b.d(O_());
        ad = (float)e.left - ((1.0F / h - 1.0F) / 2.0F) * (h * f2);
        ae = (float)e.top - (f3 - (float)e.height()) / 2.0F - (float)a.top;
        b = (ClipAnimationImageView)super.R.findViewById(s.bo);
        b.setX(ad);
        b.setY(ae);
        b.setScaleX(h);
        b.setScaleY(h);
        obj = (android.widget.FrameLayout.LayoutParams)b.getLayoutParams();
        obj.width = Math.round(f2);
        obj.height = Math.round(f3);
        b.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        b.a(iwr.a, 0.0F, (int)f2, (int)f3, 1.0F / g);
        obj = new AnimatorSet();
        objectanimator = ObjectAnimator.ofFloat(b, "x", new float[] {
            f5
        });
        objectanimator1 = ObjectAnimator.ofFloat(b, "y", new float[] {
            f4
        });
        objectanimator2 = ObjectAnimator.ofFloat(b, "scaleX", new float[] {
            1.0F
        });
        objectanimator3 = ObjectAnimator.ofFloat(b, "scaleY", new float[] {
            1.0F
        });
        objectanimator4 = ObjectAnimator.ofFloat(b, "clipAnimationPosition", new float[] {
            0.0F, 1.0F
        });
        ((AnimatorSet) (obj)).addListener(new inc(this));
        ((AnimatorSet) (obj)).setInterpolator(timeinterpolator);
        ((AnimatorSet) (obj)).setDuration(250L);
        ((AnimatorSet) (obj)).playTogether(new Animator[] {
            objectanimator, objectanimator1, objectanimator2, objectanimator3, objectanimator4
        });
        ((AnimatorSet) (obj)).start();
        super.R.findViewById(s.bn).animate().alpha(0.87F).setDuration(250L).setListener(null).start();
_L6:
        return;
_L2:
        if (g > 1.0F)
        {
            f4 = a.height();
            f2 = f4;
            f3 = 0.0F;
        } else
        {
            f4 = (float)Math.ceil((float)a.height() * g);
            f3 = ((1.0F / g - 1.0F) / 2.0F) * f4;
            f2 = f4;
        }
        f5 = ((float)a.width() - f2) / 2.0F;
        if (flag)
        {
            f10 = e.height();
            f7 = f10;
            if (g < 1.0F)
            {
                f7 = f10 / g;
            }
            if (g > 1.0F)
            {
                h = f7 / f4;
                f7 = f3;
                f3 = f4;
                f4 = f7;
                continue; /* Loop/switch isn't completed */
            }
            h = (f7 / f4) * g;
        }
        f7 = f3;
        f3 = f4;
        f4 = f7;
        continue; /* Loop/switch isn't completed */
_L4:
        b.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        b.setX(f5);
        b.setY(f4);
        layoutparams = (android.widget.FrameLayout.LayoutParams)b.getLayoutParams();
        layoutparams.width = Math.round(f2);
        layoutparams.height = Math.round(f3);
        if (c == null) goto _L6; else goto _L5
_L5:
        b.setImageDrawable(c);
        return;
        if (true) goto _L8; else goto _L7
_L8:
        break MISSING_BLOCK_LABEL_182;
_L7:
    }

    public final void e(Bundle bundle)
    {
        bundle.putParcelable("media_model", f);
        bundle.putFloat("original_aspect_ratio", g);
        bundle.putInt("override_size", af);
    }

    public final void n()
    {
        if (c != null)
        {
            c = null;
        }
        super.n();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        if (d == ine.b || d == ine.c)
        {
            r();
        }
        return true;
    }

    public final void r()
    {
        android.animation.TimeInterpolator timeinterpolator = b.d(O_());
        if (e == null)
        {
            h = 0.0F;
            ad = (float)(a.width() / 2) - (float)b.getWidth() / 2.0F;
            ae = (float)(a.height() / 2) - (float)b.getHeight() / 2.0F;
        }
        d = ine.d;
        b.a = true;
        b.setBackgroundColor(0);
        Object obj = b;
        int i = iwr.b;
        float f1;
        ObjectAnimator objectanimator;
        ObjectAnimator objectanimator1;
        ObjectAnimator objectanimator2;
        ObjectAnimator objectanimator3;
        ObjectAnimator objectanimator4;
        int j;
        if (g > 1.0F)
        {
            f1 = (float)b.getWidth() * g;
        } else
        {
            f1 = b.getWidth();
        }
        j = Math.round(f1);
        if (g > 1.0F)
        {
            f1 = b.getHeight();
        } else
        {
            f1 = (float)b.getHeight() / g;
        }
        ((ClipAnimationImageView) (obj)).a(i, 0.0F, j, Math.round(f1), 1.0F / g);
        obj = new AnimatorSet();
        objectanimator = ObjectAnimator.ofFloat(b, "x", new float[] {
            ad
        });
        objectanimator1 = ObjectAnimator.ofFloat(b, "y", new float[] {
            ae
        });
        objectanimator2 = ObjectAnimator.ofFloat(b, "scaleX", new float[] {
            h
        });
        objectanimator3 = ObjectAnimator.ofFloat(b, "scaleY", new float[] {
            h
        });
        objectanimator4 = ObjectAnimator.ofFloat(b, "clipAnimationPosition", new float[] {
            0.0F, 1.0F
        });
        ((AnimatorSet) (obj)).addListener(new ind(this));
        ((AnimatorSet) (obj)).setInterpolator(timeinterpolator);
        ((AnimatorSet) (obj)).setDuration(250L);
        ((AnimatorSet) (obj)).playTogether(new Animator[] {
            objectanimator, objectanimator1, objectanimator2, objectanimator3, objectanimator4
        });
        ((AnimatorSet) (obj)).start();
        super.R.findViewById(s.bn).animate().alpha(0.0F).setDuration(250L).setListener(null).start();
    }
}
