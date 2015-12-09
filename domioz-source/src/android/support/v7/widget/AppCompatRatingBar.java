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
import android.support.v4.a.a.i;
import android.support.v4.view.bp;
import android.support.v7.a.b;
import android.support.v7.internal.widget.ax;
import android.support.v7.internal.widget.az;
import android.util.AttributeSet;
import android.widget.RatingBar;

public class AppCompatRatingBar extends RatingBar
{

    private static final int a[] = {
        0x101013b, 0x101013c
    };
    private Bitmap b;

    public AppCompatRatingBar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, b.E);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        if (ax.a)
        {
            context = az.a(getContext(), attributeset, a, j);
            attributeset = context.b(0);
            if (attributeset != null)
            {
                setIndeterminateDrawable(a(attributeset));
            }
            attributeset = context.b(1);
            if (attributeset != null)
            {
                setProgressDrawable(a(attributeset, false));
            }
            context.b();
        }
    }

    private Drawable a(Drawable drawable)
    {
        Object obj = drawable;
        if (drawable instanceof AnimationDrawable)
        {
            drawable = (AnimationDrawable)drawable;
            int k = drawable.getNumberOfFrames();
            obj = new AnimationDrawable();
            ((AnimationDrawable) (obj)).setOneShot(drawable.isOneShot());
            for (int j = 0; j < k; j++)
            {
                Drawable drawable1 = a(drawable.getFrame(j), true);
                drawable1.setLevel(10000);
                ((AnimationDrawable) (obj)).addFrame(drawable1, drawable.getDuration(j));
            }

            ((AnimationDrawable) (obj)).setLevel(10000);
        }
        return ((Drawable) (obj));
    }

    private Drawable a(Drawable drawable, boolean flag)
    {
        boolean flag1 = false;
        if (drawable instanceof i)
        {
            Drawable drawable1 = ((i)drawable).a();
            if (drawable1 != null)
            {
                drawable1 = a(drawable1, flag);
                ((i)drawable).a(drawable1);
            }
        } else
        {
            if (drawable instanceof LayerDrawable)
            {
                drawable = (LayerDrawable)drawable;
                int l = drawable.getNumberOfLayers();
                Drawable adrawable[] = new Drawable[l];
                int j = 0;
                while (j < l) 
                {
                    int i1 = drawable.getId(j);
                    Drawable drawable2 = drawable.getDrawable(j);
                    if (i1 == 0x102000d || i1 == 0x102000f)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    adrawable[j] = a(drawable2, flag);
                    j++;
                }
                LayerDrawable layerdrawable = new LayerDrawable(adrawable);
                for (int k = ((flag1) ? 1 : 0); k < l; k++)
                {
                    layerdrawable.setId(k, drawable.getId(k));
                }

                return layerdrawable;
            }
            if (drawable instanceof BitmapDrawable)
            {
                Object obj = ((BitmapDrawable)drawable).getBitmap();
                if (b == null)
                {
                    b = ((Bitmap) (obj));
                }
                drawable = new ShapeDrawable(new RoundRectShape(new float[] {
                    5F, 5F, 5F, 5F, 5F, 5F, 5F, 5F
                }, null, null));
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

    protected void onMeasure(int j, int k)
    {
        this;
        JVM INSTR monitorenter ;
        super.onMeasure(j, k);
        if (b != null)
        {
            setMeasuredDimension(bp.a(b.getWidth() * getNumStars(), j, 0), getMeasuredHeight());
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
