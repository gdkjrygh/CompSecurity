// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package in.srain.cube.views.ptr.header;

import afA;
import afC;
import afE;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import in.srain.cube.views.ptr.PtrFrameLayout;

public class MaterialHeader extends View
    implements afA
{

    private afE a;
    private float b;
    private PtrFrameLayout c;
    private Animation d = new Animation() {

        private MaterialHeader a;

        public final void applyTransformation(float f, Transformation transformation)
        {
            MaterialHeader.a(a, 1.0F - f);
            MaterialHeader.b(a).setAlpha((int)(255F * MaterialHeader.a(a)));
            a.invalidate();
        }

            
            {
                a = MaterialHeader.this;
                super();
            }
    };

    public MaterialHeader(Context context)
    {
        super(context);
        b = 1.0F;
        a();
    }

    public MaterialHeader(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = 1.0F;
        a();
    }

    public MaterialHeader(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = 1.0F;
        a();
    }

    static float a(MaterialHeader materialheader)
    {
        return materialheader.b;
    }

    static float a(MaterialHeader materialheader, float f)
    {
        materialheader.b = f;
        return f;
    }

    private void a()
    {
        a = new afE(getContext(), this);
        afE afe = a;
        afe.b = -1;
        afe.a.v = -1;
        a.setCallback(this);
    }

    static afE b(MaterialHeader materialheader)
    {
        return materialheader.a;
    }

    static Animation c(MaterialHeader materialheader)
    {
        return materialheader.d;
    }

    public final void a(PtrFrameLayout ptrframelayout)
    {
        b = 1.0F;
        a.stop();
    }

    public final void a(PtrFrameLayout ptrframelayout, boolean flag, byte byte0, int i, int j, float f, float f1)
    {
        f = Math.min(1.0F, f1);
        if (byte0 == 2)
        {
            a.setAlpha((int)(255F * f));
            a.a.a(true);
            ptrframelayout = a;
            f1 = Math.min(0.8F, f * 0.8F);
            ((afE) (ptrframelayout)).a.a(0.0F);
            ((afE) (ptrframelayout)).a.b(f1);
            ptrframelayout = a;
            f1 = Math.min(1.0F, f);
            ((afE) (ptrframelayout)).a.d(f1);
            a.a.c((f * 2.0F + (-0.25F + 0.4F * f)) * 0.5F);
            invalidate();
        }
    }

    public final void b(PtrFrameLayout ptrframelayout)
    {
    }

    public final void c(PtrFrameLayout ptrframelayout)
    {
        a.setAlpha(255);
        a.start();
    }

    public final void d(PtrFrameLayout ptrframelayout)
    {
        a.stop();
    }

    public void invalidateDrawable(Drawable drawable)
    {
        if (drawable == a)
        {
            invalidate();
            return;
        } else
        {
            super.invalidateDrawable(drawable);
            return;
        }
    }

    protected void onDraw(Canvas canvas)
    {
        int i = canvas.save();
        Rect rect = a.getBounds();
        canvas.translate(getPaddingLeft() + (getMeasuredWidth() - a.getIntrinsicWidth()) / 2, getPaddingTop());
        canvas.scale(b, b, rect.exactCenterX(), rect.exactCenterY());
        a.draw(canvas);
        canvas.restoreToCount(i);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        i = a.getIntrinsicHeight();
        a.setBounds(0, 0, i, i);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, android.view.View.MeasureSpec.makeMeasureSpec(a.getIntrinsicHeight() + getPaddingTop() + getPaddingBottom(), 0x40000000));
    }

    public void setColorSchemeColors(int ai[])
    {
        afE afe = a;
        afe.a.a(ai);
        afe.a.k = 0;
        invalidate();
    }

    public void setPtrFrameLayout(PtrFrameLayout ptrframelayout)
    {
        afC afc = new afC() {

            private MaterialHeader c;

            public final void run()
            {
                c.startAnimation(MaterialHeader.c(c));
            }

            
            {
                c = MaterialHeader.this;
                super();
            }
        };
        d.setDuration(200L);
        d.setAnimationListener(new android.view.animation.Animation.AnimationListener(afc) {

            private afC a;

            public final void onAnimationEnd(Animation animation)
            {
                a.a();
            }

            public final void onAnimationRepeat(Animation animation)
            {
            }

            public final void onAnimationStart(Animation animation)
            {
            }

            
            {
                a = afc;
                super();
            }
        });
        c = ptrframelayout;
        c.setRefreshCompleteHook(afc);
    }
}
