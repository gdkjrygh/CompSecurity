// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.makeramen;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.pinterest.kit.utils.DrawableUtils;

// Referenced classes of package com.makeramen:
//            RoundedDrawable

public class RoundedImageView extends ImageView
{

    public static final float DEFAULT_BORDER = 0F;
    public static final float DEFAULT_RADIUS = 0F;
    private static final android.widget.ImageView.ScaleType SCALE_TYPES[];
    public static final String TAG = "RoundedImageView";
    private Drawable mBackgroundDrawable;
    private ColorStateList mBorderColor;
    private float mBorderWidth;
    private final float mCornerRadii[] = {
        0.0F, 0.0F, 0.0F, 0.0F
    };
    private Drawable mDrawable;
    private boolean mOval;
    private boolean mRoundBackground;
    private android.widget.ImageView.ScaleType mScaleType;

    public RoundedImageView(Context context)
    {
        super(context);
        mBorderWidth = 0.0F;
        mBorderColor = ColorStateList.valueOf(0xff000000);
        mRoundBackground = false;
        mOval = false;
    }

    public RoundedImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public RoundedImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mBorderWidth = 0.0F;
        mBorderColor = ColorStateList.valueOf(0xff000000);
        mRoundBackground = false;
        mOval = false;
        context = context.obtainStyledAttributes(attributeset, com.pinterest.R.styleable.RoundedImageView, i, 0);
        i = context.getInt(0, -1);
        float f;
        boolean flag;
        int k;
        if (i >= 0)
        {
            setScaleType(SCALE_TYPES[i]);
        } else
        {
            setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        }
        f = context.getDimensionPixelSize(1, -1);
        mCornerRadii[0] = context.getDimensionPixelSize(2, -1);
        mCornerRadii[1] = context.getDimensionPixelSize(3, -1);
        mCornerRadii[2] = context.getDimensionPixelSize(5, -1);
        mCornerRadii[3] = context.getDimensionPixelSize(4, -1);
        k = mCornerRadii.length;
        i = 0;
        flag = false;
        while (i < k) 
        {
            if (mCornerRadii[i] < 0.0F)
            {
                mCornerRadii[i] = 0.0F;
            } else
            {
                flag = true;
            }
            i++;
        }
        if (f < 0.0F)
        {
            if (isInEditMode())
            {
                f = 3F;
            } else
            {
                f = (int)getResources().getDimension(0x7f0a00f5);
            }
        }
        if (!flag)
        {
            int j = mCornerRadii.length;
            for (i = 0; i < j; i++)
            {
                mCornerRadii[i] = f;
            }

        }
        mBorderWidth = context.getDimensionPixelSize(6, -1);
        if (mBorderWidth < 0.0F)
        {
            mBorderWidth = 0.0F;
        }
        mBorderColor = context.getColorStateList(7);
        if (mBorderColor == null)
        {
            mBorderColor = ColorStateList.valueOf(0xff000000);
        }
        mRoundBackground = false;
        mOval = false;
        if (mDrawable instanceof RoundedDrawable)
        {
            updateDrawableAttrs((RoundedDrawable)mDrawable);
        }
        if (mRoundBackground)
        {
            if (!(mBackgroundDrawable instanceof RoundedDrawable))
            {
                setBackgroundDrawable(mBackgroundDrawable);
            }
            if (mBackgroundDrawable instanceof RoundedDrawable)
            {
                updateDrawableAttrs((RoundedDrawable)mBackgroundDrawable);
            }
        }
    }

    private void updateDrawableAttrs(Drawable drawable)
    {
        if (drawable != null && (drawable instanceof RoundedDrawable))
        {
            drawable = (RoundedDrawable)drawable;
            drawable.a(mScaleType);
            drawable.a((int)mBorderWidth);
            drawable.a(mBorderColor);
            drawable.a(mOval);
            if (mCornerRadii != null)
            {
                drawable.a(mCornerRadii[0], mCornerRadii[1], mCornerRadii[2], mCornerRadii[3]);
                return;
            }
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        invalidate();
    }

    public float getBorder()
    {
        return mBorderWidth;
    }

    public int getBorderColor()
    {
        return mBorderColor.getDefaultColor();
    }

    public ColorStateList getBorderColors()
    {
        return mBorderColor;
    }

    public float getCornerRadius()
    {
        return getMaxCornerRadius();
    }

    public float getCornerRadius(int i)
    {
        return mCornerRadii[i];
    }

    public float getMaxCornerRadius()
    {
        float f = 0.0F;
        float af[] = mCornerRadii;
        int j = af.length;
        for (int i = 0; i < j; i++)
        {
            f = Math.max(af[i], f);
        }

        return f;
    }

    public android.widget.ImageView.ScaleType getScaleType()
    {
        return mScaleType;
    }

    public boolean isOval()
    {
        return mOval;
    }

    public boolean isRoundBackground()
    {
        return mRoundBackground;
    }

    public void setBackground(Drawable drawable)
    {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        if (mRoundBackground && drawable != null)
        {
            mBackgroundDrawable = RoundedDrawable.a(drawable, (int)mBorderWidth, mBorderColor);
            updateDrawableAttrs(mBackgroundDrawable);
        } else
        {
            mBackgroundDrawable = drawable;
        }
        super.setBackgroundDrawable(mBackgroundDrawable);
    }

    public void setBorderColor(int i)
    {
        setBorderColors(ColorStateList.valueOf(i));
    }

    public void setBorderColors(ColorStateList colorstatelist)
    {
        if (!mBorderColor.equals(colorstatelist))
        {
            ColorStateList colorstatelist1;
            if (colorstatelist != null)
            {
                colorstatelist1 = colorstatelist;
            } else
            {
                colorstatelist1 = ColorStateList.valueOf(0xff000000);
            }
            mBorderColor = colorstatelist1;
            if (mDrawable instanceof RoundedDrawable)
            {
                ((RoundedDrawable)mDrawable).a(colorstatelist);
            }
            if (mRoundBackground && (mBackgroundDrawable instanceof RoundedDrawable))
            {
                ((RoundedDrawable)mBackgroundDrawable).a(colorstatelist);
            }
            if (mBorderWidth > 0.0F)
            {
                invalidate();
                return;
            }
        }
    }

    public void setBorderWidth(int i)
    {
        if (mBorderWidth == (float)i)
        {
            return;
        }
        mBorderWidth = i;
        if (mDrawable instanceof RoundedDrawable)
        {
            ((RoundedDrawable)mDrawable).a(i);
        }
        if (mRoundBackground && (mBackgroundDrawable instanceof RoundedDrawable))
        {
            ((RoundedDrawable)mBackgroundDrawable).a(i);
        }
        invalidate();
    }

    public void setCornerRadius(float f)
    {
        setCornerRadius(f, f, f, f);
    }

    public void setCornerRadius(float f, float f1, float f2, float f3)
    {
        if (mCornerRadii[0] == f && mCornerRadii[1] == f1 && mCornerRadii[2] == f3 && mCornerRadii[3] == f2)
        {
            return;
        } else
        {
            mCornerRadii[0] = f;
            mCornerRadii[1] = f1;
            mCornerRadii[3] = f2;
            mCornerRadii[2] = f3;
            updateDrawableAttrs(mDrawable);
            updateDrawableAttrs(mBackgroundDrawable);
            invalidate();
            return;
        }
    }

    public void setCornerRadius(int i, float f)
    {
        if (mCornerRadii[i] == f)
        {
            return;
        } else
        {
            mCornerRadii[i] = f;
            updateDrawableAttrs(mDrawable);
            updateDrawableAttrs(mBackgroundDrawable);
            invalidate();
            return;
        }
    }

    public void setCornerRadiusDimen(int i)
    {
        float f = getResources().getDimension(i);
        setCornerRadius(f, f, f, f);
    }

    public void setCornerRadiusDimen(int i, int j)
    {
        setCornerRadius(i, getResources().getDimensionPixelSize(j));
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        if (bitmap != null)
        {
            mDrawable = new RoundedDrawable(bitmap);
            updateDrawableAttrs((RoundedDrawable)mDrawable);
        } else
        {
            mDrawable = null;
        }
        super.setImageDrawable(mDrawable);
    }

    public void setImageDrawable(Drawable drawable)
    {
        if (drawable != null)
        {
            mDrawable = RoundedDrawable.a(drawable);
            updateDrawableAttrs((RoundedDrawable)mDrawable);
        } else
        {
            mDrawable = null;
        }
        super.setImageDrawable(mDrawable);
    }

    public void setImageResource(int i)
    {
        super.setImageResource(i);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean flag)
    {
        mOval = flag;
        if (mDrawable instanceof RoundedDrawable)
        {
            ((RoundedDrawable)mDrawable).a(flag);
        }
        if (mRoundBackground && (mBackgroundDrawable instanceof RoundedDrawable))
        {
            ((RoundedDrawable)mBackgroundDrawable).a(flag);
        }
        invalidate();
    }

    public void setRoundBackground(boolean flag)
    {
        if (mRoundBackground == flag)
        {
            return;
        }
        mRoundBackground = flag;
        if (!flag) goto _L2; else goto _L1
_L1:
        if (mBackgroundDrawable instanceof RoundedDrawable)
        {
            updateDrawableAttrs(mBackgroundDrawable);
        } else
        {
            setBackgroundDrawable(mBackgroundDrawable);
        }
_L4:
        invalidate();
        return;
_L2:
        if (mBackgroundDrawable instanceof RoundedDrawable)
        {
            ((RoundedDrawable)mBackgroundDrawable).a(0);
            ((RoundedDrawable)mBackgroundDrawable).a(0.0F);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setScaleType(android.widget.ImageView.ScaleType scaletype)
    {
        if (scaletype == null)
        {
            throw new NullPointerException();
        }
        if (mScaleType == scaletype) goto _L2; else goto _L1
_L1:
        mScaleType = scaletype;
        _cls1.a[scaletype.ordinal()];
        JVM INSTR tableswitch 1 7: default 76
    //                   1 165
    //                   2 165
    //                   3 165
    //                   4 165
    //                   5 165
    //                   6 165
    //                   7 165;
           goto _L3 _L4 _L4 _L4 _L4 _L4 _L4 _L4
_L3:
        super.setScaleType(scaletype);
_L6:
        if ((mDrawable instanceof RoundedDrawable) && ((RoundedDrawable)mDrawable).a() != scaletype)
        {
            ((RoundedDrawable)mDrawable).a(scaletype);
        }
        if ((mBackgroundDrawable instanceof RoundedDrawable) && ((RoundedDrawable)mBackgroundDrawable).a() != scaletype)
        {
            ((RoundedDrawable)mBackgroundDrawable).a(scaletype);
        }
        setWillNotCacheDrawing(true);
        requestLayout();
        invalidate();
_L2:
        return;
_L4:
        super.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void setTintedDrawable(Drawable drawable, int i)
    {
        if (drawable != null)
        {
            drawable = RoundedDrawable.a(drawable).mutate();
            updateDrawableAttrs((RoundedDrawable)drawable);
            mDrawable = DrawableUtils.tintIcon(drawable, i);
        } else
        {
            mDrawable = null;
        }
        super.setImageDrawable(mDrawable);
    }

    static 
    {
        SCALE_TYPES = (new android.widget.ImageView.ScaleType[] {
            android.widget.ImageView.ScaleType.MATRIX, android.widget.ImageView.ScaleType.FIT_XY, android.widget.ImageView.ScaleType.FIT_START, android.widget.ImageView.ScaleType.FIT_CENTER, android.widget.ImageView.ScaleType.FIT_END, android.widget.ImageView.ScaleType.CENTER, android.widget.ImageView.ScaleType.CENTER_CROP, android.widget.ImageView.ScaleType.CENTER_INSIDE
        });
    }

    private class _cls1
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

}
