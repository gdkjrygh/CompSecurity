// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.makeramen.roundedimageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;

// Referenced classes of package com.makeramen.roundedimageview:
//            RoundedDrawable

public class RoundedImageView extends ImageView
{

    public static final android.graphics.Shader.TileMode a;
    static final boolean b;
    private static final android.widget.ImageView.ScaleType c[];
    private float d;
    private float e;
    private ColorStateList f;
    private boolean g;
    private boolean h;
    private android.graphics.Shader.TileMode i;
    private android.graphics.Shader.TileMode j;
    private ColorFilter k;
    private boolean l;
    private boolean m;
    private int n;
    private Drawable o;
    private Drawable p;
    private android.widget.ImageView.ScaleType q;

    public RoundedImageView(Context context)
    {
        super(context);
        d = 0.0F;
        e = 0.0F;
        f = ColorStateList.valueOf(0xff000000);
        g = false;
        h = false;
        i = a;
        j = a;
        k = null;
        l = false;
        m = false;
    }

    public RoundedImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public RoundedImageView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        d = 0.0F;
        e = 0.0F;
        f = ColorStateList.valueOf(0xff000000);
        g = false;
        h = false;
        i = a;
        j = a;
        k = null;
        l = false;
        m = false;
        context = context.obtainStyledAttributes(attributeset, R.styleable.RoundedImageView, i1, 0);
        i1 = context.getInt(R.styleable.RoundedImageView_android_scaleType, -1);
        if (i1 >= 0)
        {
            setScaleType(c[i1]);
        } else
        {
            setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        }
        d = context.getDimensionPixelSize(R.styleable.RoundedImageView_riv_corner_radius, -1);
        e = context.getDimensionPixelSize(R.styleable.RoundedImageView_riv_border_width, -1);
        if (d < 0.0F)
        {
            d = 0.0F;
        }
        if (e < 0.0F)
        {
            e = 0.0F;
        }
        f = context.getColorStateList(R.styleable.RoundedImageView_riv_border_color);
        if (f == null)
        {
            f = ColorStateList.valueOf(0xff000000);
        }
        h = context.getBoolean(R.styleable.RoundedImageView_riv_mutate_background, false);
        g = context.getBoolean(R.styleable.RoundedImageView_riv_oval, false);
        i1 = context.getInt(R.styleable.RoundedImageView_riv_tile_mode, -2);
        if (i1 != -2)
        {
            setTileModeX(a(i1));
            setTileModeY(a(i1));
        }
        i1 = context.getInt(R.styleable.RoundedImageView_riv_tile_mode_x, -2);
        if (i1 != -2)
        {
            setTileModeX(a(i1));
        }
        i1 = context.getInt(R.styleable.RoundedImageView_riv_tile_mode_y, -2);
        if (i1 != -2)
        {
            setTileModeY(a(i1));
        }
        b();
        a(true);
        context.recycle();
    }

    private static android.graphics.Shader.TileMode a(int i1)
    {
        switch (i1)
        {
        default:
            return null;

        case 0: // '\0'
            return android.graphics.Shader.TileMode.CLAMP;

        case 1: // '\001'
            return android.graphics.Shader.TileMode.REPEAT;

        case 2: // '\002'
            return android.graphics.Shader.TileMode.MIRROR;
        }
    }

    private Drawable a()
    {
        Object obj = null;
        Resources resources = getResources();
        if (resources == null)
        {
            return null;
        }
        Drawable drawable = obj;
        if (n != 0)
        {
            try
            {
                drawable = resources.getDrawable(n);
            }
            catch (Exception exception)
            {
                Log.w("RoundedImageView", (new StringBuilder()).append("Unable to find resource: ").append(n).toString(), exception);
                n = 0;
                exception = obj;
            }
        }
        return RoundedDrawable.a(drawable);
    }

    private void a(Drawable drawable)
    {
        if (drawable != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (drawable instanceof RoundedDrawable)
        {
            ((RoundedDrawable)drawable).a(q).a(d).b(e).a(f).a(g).a(i).b(j);
            c();
            return;
        }
        if (drawable instanceof LayerDrawable)
        {
            drawable = (LayerDrawable)drawable;
            int i1 = 0;
            int j1 = drawable.getNumberOfLayers();
            while (i1 < j1) 
            {
                a(drawable.getDrawable(i1));
                i1++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void a(boolean flag)
    {
        if (h)
        {
            if (flag)
            {
                p = RoundedDrawable.a(p);
            }
            a(p);
        }
    }

    private void b()
    {
        a(o);
    }

    private void c()
    {
        if (o != null && m)
        {
            o = o.mutate();
            if (l)
            {
                o.setColorFilter(k);
            }
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        invalidate();
    }

    public int getBorderColor()
    {
        return f.getDefaultColor();
    }

    public ColorStateList getBorderColors()
    {
        return f;
    }

    public float getBorderWidth()
    {
        return e;
    }

    public float getCornerRadius()
    {
        return d;
    }

    public android.widget.ImageView.ScaleType getScaleType()
    {
        return q;
    }

    public android.graphics.Shader.TileMode getTileModeX()
    {
        return i;
    }

    public android.graphics.Shader.TileMode getTileModeY()
    {
        return j;
    }

    public void setBackground(Drawable drawable)
    {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        p = drawable;
        a(true);
        super.setBackgroundDrawable(p);
    }

    public void setBorderColor(int i1)
    {
        setBorderColor(ColorStateList.valueOf(i1));
    }

    public void setBorderColor(ColorStateList colorstatelist)
    {
        if (!f.equals(colorstatelist))
        {
            if (colorstatelist == null)
            {
                colorstatelist = ColorStateList.valueOf(0xff000000);
            }
            f = colorstatelist;
            b();
            a(false);
            if (e > 0.0F)
            {
                invalidate();
                return;
            }
        }
    }

    public void setBorderWidth(float f1)
    {
        if (e == f1)
        {
            return;
        } else
        {
            e = f1;
            b();
            a(false);
            invalidate();
            return;
        }
    }

    public void setBorderWidth(int i1)
    {
        setBorderWidth(getResources().getDimension(i1));
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        if (k != colorfilter)
        {
            k = colorfilter;
            l = true;
            m = true;
            c();
            invalidate();
        }
    }

    public void setCornerRadius(float f1)
    {
        if (d == f1)
        {
            return;
        } else
        {
            d = f1;
            b();
            a(false);
            return;
        }
    }

    public void setCornerRadiusDimen(int i1)
    {
        setCornerRadius(getResources().getDimension(i1));
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        n = 0;
        o = RoundedDrawable.a(bitmap);
        b();
        super.setImageDrawable(o);
    }

    public void setImageDrawable(Drawable drawable)
    {
        n = 0;
        o = RoundedDrawable.a(drawable);
        b();
        super.setImageDrawable(o);
    }

    public void setImageResource(int i1)
    {
        if (n != i1)
        {
            n = i1;
            o = a();
            b();
            super.setImageDrawable(o);
        }
    }

    public void setImageURI(Uri uri)
    {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean flag)
    {
        g = flag;
        b();
        a(false);
        invalidate();
    }

    public void setScaleType(android.widget.ImageView.ScaleType scaletype)
    {
        if (!b && scaletype == null)
        {
            throw new AssertionError();
        }
        if (q == scaletype) goto _L2; else goto _L1
_L1:
        q = scaletype;
        class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[android.widget.ImageView.ScaleType.values().length];
                try
                {
                    a[android.widget.ImageView.ScaleType.CENTER.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[android.widget.ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[android.widget.ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[android.widget.ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[android.widget.ImageView.ScaleType.FIT_START.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[android.widget.ImageView.ScaleType.FIT_END.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[android.widget.ImageView.ScaleType.FIT_XY.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[scaletype.ordinal()];
        JVM INSTR tableswitch 1 7: default 80
    //                   1 99
    //                   2 99
    //                   3 99
    //                   4 99
    //                   5 99
    //                   6 99
    //                   7 99;
           goto _L3 _L4 _L4 _L4 _L4 _L4 _L4 _L4
_L3:
        super.setScaleType(scaletype);
_L6:
        b();
        a(false);
        invalidate();
_L2:
        return;
_L4:
        super.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void setTileModeX(android.graphics.Shader.TileMode tilemode)
    {
        if (i == tilemode)
        {
            return;
        } else
        {
            i = tilemode;
            b();
            a(false);
            invalidate();
            return;
        }
    }

    public void setTileModeY(android.graphics.Shader.TileMode tilemode)
    {
        if (j == tilemode)
        {
            return;
        } else
        {
            j = tilemode;
            b();
            a(false);
            invalidate();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!com/makeramen/roundedimageview/RoundedImageView.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        a = android.graphics.Shader.TileMode.CLAMP;
        c = (new android.widget.ImageView.ScaleType[] {
            android.widget.ImageView.ScaleType.MATRIX, android.widget.ImageView.ScaleType.FIT_XY, android.widget.ImageView.ScaleType.FIT_START, android.widget.ImageView.ScaleType.FIT_CENTER, android.widget.ImageView.ScaleType.FIT_END, android.widget.ImageView.ScaleType.CENTER, android.widget.ImageView.ScaleType.CENTER_CROP, android.widget.ImageView.ScaleType.CENTER_INSIDE
        });
    }
}
