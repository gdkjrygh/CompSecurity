// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.support.v4.view.ViewCompat;
import android.util.DisplayMetrics;
import android.widget.ImageView;

final class CircleImageView extends ImageView
{
    private final class OvalShadow extends OvalShape
    {

        private int mCircleDiameter;
        private RadialGradient mRadialGradient;
        private Paint mShadowPaint;
        final CircleImageView this$0;

        public final void draw(Canvas canvas, Paint paint)
        {
            int i = getWidth();
            int j = getHeight();
            canvas.drawCircle(i / 2, j / 2, mCircleDiameter / 2 + mShadowRadius, mShadowPaint);
            canvas.drawCircle(i / 2, j / 2, mCircleDiameter / 2, paint);
        }

        public OvalShadow(int i, int j)
        {
            this$0 = CircleImageView.this;
            super();
            mShadowPaint = new Paint();
            mShadowRadius = i;
            mCircleDiameter = j;
            float f = mCircleDiameter / 2;
            float f1 = mCircleDiameter / 2;
            float f2 = mShadowRadius;
            circleimageview = android.graphics.Shader.TileMode.CLAMP;
            mRadialGradient = new RadialGradient(f, f1, f2, new int[] {
                0x3d000000, 0
            }, null, CircleImageView.this);
            mShadowPaint.setShader(mRadialGradient);
        }
    }


    android.view.animation.Animation.AnimationListener mListener;
    private int mShadowRadius;

    public CircleImageView(Context context)
    {
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        int i = (int)(20F * f * 2.0F);
        int j = (int)(1.75F * f);
        int k = (int)(0.0F * f);
        mShadowRadius = (int)(3.5F * f);
        if (elevationSupported())
        {
            context = new ShapeDrawable(new OvalShape());
            ViewCompat.setElevation(this, 4F * f);
        } else
        {
            context = new ShapeDrawable(new OvalShadow(mShadowRadius, i));
            ViewCompat.setLayerType(this, 1, context.getPaint());
            context.getPaint().setShadowLayer(mShadowRadius, k, j, 0x1e000000);
            i = mShadowRadius;
            setPadding(i, i, i, i);
        }
        context.getPaint().setColor(0xfffafafa);
        setBackgroundDrawable(context);
    }

    private static boolean elevationSupported()
    {
        return android.os.Build.VERSION.SDK_INT >= 21;
    }

    public final void onAnimationEnd()
    {
        super.onAnimationEnd();
        if (mListener != null)
        {
            mListener.onAnimationEnd(getAnimation());
        }
    }

    public final void onAnimationStart()
    {
        super.onAnimationStart();
        if (mListener != null)
        {
            mListener.onAnimationStart(getAnimation());
        }
    }

    protected final void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (!elevationSupported())
        {
            setMeasuredDimension(getMeasuredWidth() + mShadowRadius * 2, getMeasuredHeight() + mShadowRadius * 2);
        }
    }

    public final void setBackgroundColor(int i)
    {
        if (getBackground() instanceof ShapeDrawable)
        {
            ((ShapeDrawable)getBackground()).getPaint().setColor(i);
        }
    }



/*
    static int access$002(CircleImageView circleimageview, int i)
    {
        circleimageview.mShadowRadius = i;
        return i;
    }

*/
}
