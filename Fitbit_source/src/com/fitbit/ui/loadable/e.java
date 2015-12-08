// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.loadable;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

// Referenced classes of package com.fitbit.ui.loadable:
//            b, c, d

public class e extends b
{

    private float a;
    private int e;
    private Animation f;

    public e(Context context, ImageView imageview)
    {
        this(context, imageview, 0.0F, 0);
    }

    public e(Context context, ImageView imageview, float f1, int i)
    {
        super(context, imageview);
        context.getResources();
        a(context, f1, i);
    }

    public e(Context context, ImageView imageview, Animation animation)
    {
        this(context, imageview);
        f = animation;
    }

    private Drawable a(Bitmap bitmap)
    {
        if (a <= 0.0F)
        {
            return new c(bitmap);
        } else
        {
            return new d(bitmap, a, e);
        }
    }

    private Drawable a(Drawable drawable)
    {
        if (drawable == null)
        {
            return null;
        } else
        {
            return a(((BitmapDrawable)drawable).getBitmap());
        }
    }

    public Animation a()
    {
        return f;
    }

    public void a(Context context, float f1, int i)
    {
        if (i == 0)
        {
            i = 0x7f0f0029;
        } else
        {
            i = context.getResources().getColor(i);
        }
        e = i;
        if (f1 <= 0.0F)
        {
            f1 = 0.0F;
        } else
        {
            f1 = TypedValue.applyDimension(1, f1, context.getResources().getDisplayMetrics());
        }
        a = f1;
    }

    public void a(Animation animation)
    {
        f = animation;
    }

    public void onBitmapFailed(Drawable drawable)
    {
        super.onBitmapFailed(a(drawable));
    }

    public void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
    {
        if (c != null)
        {
            if (f != null)
            {
                c.startAnimation(AnimationUtils.makeInAnimation(b, false));
            }
            bitmap = a(bitmap);
            c.setImageDrawable(bitmap);
        }
    }

    public void onPrepareLoad(Drawable drawable)
    {
        super.onPrepareLoad(a(drawable));
    }
}
