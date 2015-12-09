// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.widget.TextView;

public final class gdc extends Drawable
    implements android.graphics.drawable.Drawable.Callback
{

    private SparseArray a;
    private int b;
    private int c;
    private int d;

    private gdc(Context context)
    {
        a = new SparseArray();
        b = context.getResources().getDimensionPixelSize(0x7f0c00d7);
    }

    public static Drawable a(Context context, TextView textview, int i, cue cue1)
    {
        Drawable drawable = textview.getCompoundDrawables()[0];
        Drawable drawable1;
        if (drawable instanceof gdc)
        {
            context = (gdc)drawable;
        } else
        {
            context = new gdc(context);
        }
        drawable1 = (Drawable)((gdc) (context)).a.get(i);
        drawable = drawable1;
        if (drawable1 == null)
        {
            drawable = (Drawable)cue1.a();
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            context.a(i);
            ((gdc) (context)).a.append(i, drawable);
            drawable.setCallback(context);
            context.a();
        }
        a(textview, ((Drawable) (context)));
        return drawable;
    }

    private void a()
    {
        d = 0;
        c = 0;
        for (int i = 0; i < a.size(); i++)
        {
            Drawable drawable = (Drawable)a.valueAt(i);
            d = Math.max(d, drawable.getIntrinsicHeight());
            int j = c;
            c = drawable.getIntrinsicWidth() + j;
        }

        if (b > 0 && a.size() > 0)
        {
            c = c + b * (a.size() - 1);
        }
        setBounds(0, 0, c, d);
        invalidateSelf();
    }

    private void a(int i)
    {
        Drawable drawable = (Drawable)a.get(i);
        if (drawable != null)
        {
            a.remove(i);
            drawable.setCallback(null);
            a();
        }
    }

    public static void a(TextView textview, int i)
    {
        Object obj = textview.getCompoundDrawables()[0];
        if (obj instanceof gdc)
        {
            gdc gdc1 = (gdc)obj;
            gdc1.a(i);
            obj = gdc1;
            if (gdc1.a.size() == 0)
            {
                obj = null;
            }
        } else
        {
            obj = null;
        }
        a(textview, ((Drawable) (obj)));
    }

    private static void a(TextView textview, Drawable drawable)
    {
        ctz.a(true, "Direction should be between 0 and 3.");
        Drawable adrawable[] = textview.getCompoundDrawables();
        adrawable[0] = drawable;
        textview.setCompoundDrawablesWithIntrinsicBounds(adrawable[0], adrawable[1], adrawable[2], adrawable[3]);
    }

    public final void draw(Canvas canvas)
    {
        int i = 0;
        int j = 0;
        for (; i < a.size(); i++)
        {
            Drawable drawable = (Drawable)a.valueAt(i);
            canvas.save();
            canvas.translate(j, (float)d / 2.0F - (float)drawable.getIntrinsicHeight() / 2.0F);
            drawable.draw(canvas);
            j += drawable.getIntrinsicWidth() + b;
            canvas.restore();
        }

    }

    public final int getIntrinsicHeight()
    {
        return d;
    }

    public final int getIntrinsicWidth()
    {
        return c;
    }

    public final int getOpacity()
    {
        return 0;
    }

    public final void invalidateDrawable(Drawable drawable)
    {
        invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
    {
        scheduleSelf(runnable, l);
    }

    public final void setAlpha(int i)
    {
        for (int j = 0; j < a.size(); j++)
        {
            ((Drawable)a.valueAt(j)).setAlpha(i);
        }

    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        for (int i = 0; i < a.size(); i++)
        {
            ((Drawable)a.valueAt(i)).setColorFilter(colorfilter);
        }

    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable)
    {
        unscheduleSelf(runnable);
    }
}
