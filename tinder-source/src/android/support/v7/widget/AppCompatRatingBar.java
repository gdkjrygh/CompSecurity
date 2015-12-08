// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.support.v4.c.a.d;
import android.support.v4.view.x;
import android.support.v7.internal.widget.TintManager;
import android.support.v7.internal.widget.TintTypedArray;
import android.util.AttributeSet;
import android.widget.RatingBar;

public class AppCompatRatingBar extends RatingBar
{

    private static final int TINT_ATTRS[] = {
        0x101013b, 0x101013c
    };
    private Bitmap mSampleTile;

    public AppCompatRatingBar(Context context)
    {
        this(context, null);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, android.support.v7.appcompat.R.attr.ratingBarStyle);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        if (TintManager.SHOULD_BE_USED)
        {
            context = TintTypedArray.obtainStyledAttributes(getContext(), attributeset, TINT_ATTRS, i, 0);
            attributeset = context.getDrawableIfKnown(0);
            if (attributeset != null)
            {
                setIndeterminateDrawable(tileifyIndeterminate(attributeset));
            }
            attributeset = context.getDrawableIfKnown(1);
            if (attributeset != null)
            {
                setProgressDrawable(tileify(attributeset, false));
            }
            context.recycle();
        }
    }

    private Shape getDrawableShape()
    {
        return new RoundRectShape(new float[] {
            5F, 5F, 5F, 5F, 5F, 5F, 5F, 5F
        }, null, null);
    }

    private Drawable tileify(Drawable drawable, boolean flag)
    {
        boolean flag1 = false;
        if (drawable instanceof d)
        {
            Drawable drawable1 = ((d)drawable).a();
            if (drawable1 != null)
            {
                drawable1 = tileify(drawable1, flag);
                ((d)drawable).a(drawable1);
            }
        } else
        {
            if (drawable instanceof LayerDrawable)
            {
                drawable = (LayerDrawable)drawable;
                int k = drawable.getNumberOfLayers();
                Drawable adrawable[] = new Drawable[k];
                int i = 0;
                while (i < k) 
                {
                    int l = drawable.getId(i);
                    Drawable drawable2 = drawable.getDrawable(i);
                    if (l == 0x102000d || l == 0x102000f)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    adrawable[i] = tileify(drawable2, flag);
                    i++;
                }
                LayerDrawable layerdrawable = new LayerDrawable(adrawable);
                for (int j = ((flag1) ? 1 : 0); j < k; j++)
                {
                    layerdrawable.setId(j, drawable.getId(j));
                }

                return layerdrawable;
            }
            if (drawable instanceof BitmapDrawable)
            {
                Object obj = ((BitmapDrawable)drawable).getBitmap();
                if (mSampleTile == null)
                {
                    mSampleTile = ((Bitmap) (obj));
                }
                drawable = new ShapeDrawable(getDrawableShape());
                obj = new BitmapShader(((Bitmap) (obj)), android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.CLAMP);
                drawable.getPaint().setShader(((android.graphics.Shader) (obj)));
                if (flag)
                {
                    return new ClipDrawable(drawable, 3, 1);
                } else
                {
                    return drawable;
                }
            }
        }
        return drawable;
    }

    private Drawable tileifyIndeterminate(Drawable drawable)
    {
        Object obj = drawable;
        if (drawable instanceof AnimationDrawable)
        {
            drawable = (AnimationDrawable)drawable;
            int j = drawable.getNumberOfFrames();
            obj = new AnimationDrawable();
            ((AnimationDrawable) (obj)).setOneShot(drawable.isOneShot());
            for (int i = 0; i < j; i++)
            {
                Drawable drawable1 = tileify(drawable.getFrame(i), true);
                drawable1.setLevel(10000);
                ((AnimationDrawable) (obj)).addFrame(drawable1, drawable.getDuration(i));
            }

            ((AnimationDrawable) (obj)).setLevel(10000);
        }
        return ((Drawable) (obj));
    }

    protected void onMeasure(int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        super.onMeasure(i, j);
        if (mSampleTile != null)
        {
            setMeasuredDimension(x.a(mSampleTile.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
