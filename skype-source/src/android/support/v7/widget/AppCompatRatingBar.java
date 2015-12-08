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
import android.support.v4.graphics.drawable.d;
import android.support.v4.view.x;
import android.support.v7.internal.widget.o;
import android.support.v7.internal.widget.p;
import android.util.AttributeSet;
import android.widget.RatingBar;

public class AppCompatRatingBar extends RatingBar
{

    private static final int a[] = {
        0x101013b, 0x101013c
    };
    private Bitmap b;

    public AppCompatRatingBar(Context context)
    {
        this(context, null);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, android.support.v7.appcompat.a.a.ratingBarStyle);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        if (o.a)
        {
            context = p.a(getContext(), attributeset, a, i);
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
            int j = drawable.getNumberOfFrames();
            obj = new AnimationDrawable();
            ((AnimationDrawable) (obj)).setOneShot(drawable.isOneShot());
            for (int i = 0; i < j; i++)
            {
                Drawable drawable1 = a(drawable.getFrame(i), true);
                drawable1.setLevel(10000);
                ((AnimationDrawable) (obj)).addFrame(drawable1, drawable.getDuration(i));
            }

            ((AnimationDrawable) (obj)).setLevel(10000);
        }
        return ((Drawable) (obj));
    }

    private Drawable a(Drawable drawable, boolean flag)
    {
        if (!(drawable instanceof d)) goto _L2; else goto _L1
_L1:
        Drawable drawable1 = ((d)drawable).a();
        if (drawable1 != null)
        {
            drawable1 = a(drawable1, flag);
            ((d)drawable).a(drawable1);
        }
_L4:
        return drawable;
_L2:
        LayerDrawable layerdrawable;
        LayerDrawable layerdrawable1;
        int i;
        int j;
        if (!(drawable instanceof LayerDrawable))
        {
            continue; /* Loop/switch isn't completed */
        }
        layerdrawable1 = (LayerDrawable)drawable;
        j = layerdrawable1.getNumberOfLayers();
        drawable = new Drawable[j];
        i = 0;
        while (i < j) 
        {
            int k = layerdrawable1.getId(i);
            Drawable drawable2 = layerdrawable1.getDrawable(i);
            if (k == 0x102000d || k == 0x102000f)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            drawable[i] = a(drawable2, flag);
            i++;
        }
        layerdrawable = new LayerDrawable(drawable);
        i = 0;
_L5:
        drawable = layerdrawable;
        if (i >= j) goto _L4; else goto _L3
_L3:
        layerdrawable.setId(i, layerdrawable1.getId(i));
        i++;
          goto _L5
        if (!(drawable instanceof BitmapDrawable)) goto _L4; else goto _L6
_L6:
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

    protected void onMeasure(int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        super.onMeasure(i, j);
        if (b != null)
        {
            setMeasuredDimension(x.a(b.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
