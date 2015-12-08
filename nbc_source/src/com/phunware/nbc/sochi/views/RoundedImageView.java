// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;

// Referenced classes of package com.phunware.nbc.sochi.views:
//            RoundedDrawable

public class RoundedImageView extends ImageView
{

    static final boolean $assertionsDisabled;
    public static final float DEFAULT_BORDER_WIDTH = 0F;
    public static final float DEFAULT_RADIUS = 0F;
    private static final android.widget.ImageView.ScaleType SCALE_TYPES[];
    public static final String TAG = "RoundedImageView";
    private ColorStateList borderColor;
    private float borderWidth;
    private float cornerRadius;
    private boolean isOval;
    private Drawable mBackgroundDrawable;
    private Drawable mDrawable;
    private int mResource;
    private android.widget.ImageView.ScaleType mScaleType;
    private boolean mutateBackground;

    public RoundedImageView(Context context)
    {
        super(context);
        cornerRadius = 0.0F;
        borderWidth = 0.0F;
        borderColor = ColorStateList.valueOf(0xff000000);
        isOval = false;
        mutateBackground = false;
    }

    public RoundedImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public RoundedImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        cornerRadius = 0.0F;
        borderWidth = 0.0F;
        borderColor = ColorStateList.valueOf(0xff000000);
        isOval = false;
        mutateBackground = false;
        context = context.obtainStyledAttributes(attributeset, air.com.nbcuni.com.nbcsports.liveextra.R.styleable.RoundedImageView, i, 0);
        i = context.getInt(0, -1);
        if (i >= 0)
        {
            setScaleType(SCALE_TYPES[i]);
        } else
        {
            setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        }
        cornerRadius = context.getDimensionPixelSize(1, -1);
        borderWidth = context.getDimensionPixelSize(2, -1);
        if (cornerRadius < 0.0F)
        {
            cornerRadius = 0.0F;
        }
        if (borderWidth < 0.0F)
        {
            borderWidth = 0.0F;
        }
        borderColor = context.getColorStateList(3);
        if (borderColor == null)
        {
            borderColor = ColorStateList.valueOf(0xff000000);
        }
        mutateBackground = context.getBoolean(4, false);
        isOval = context.getBoolean(5, false);
        updateDrawableAttrs();
        updateBackgroundDrawableAttrs(true);
        context.recycle();
    }

    private Drawable resolveResource()
    {
        Resources resources = getResources();
        if (resources == null)
        {
            return null;
        }
        Object obj = null;
        Drawable drawable = obj;
        if (mResource != 0)
        {
            try
            {
                drawable = resources.getDrawable(mResource);
            }
            catch (Exception exception)
            {
                Log.w("RoundedImageView", (new StringBuilder()).append("Unable to find resource: ").append(mResource).toString(), exception);
                mResource = 0;
                exception = obj;
            }
        }
        return RoundedDrawable.fromDrawable(drawable);
    }

    private void updateAttrs(Drawable drawable)
    {
        if (drawable != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (drawable instanceof RoundedDrawable)
        {
            ((RoundedDrawable)drawable).setScaleType(mScaleType).setCornerRadius(cornerRadius).setBorderWidth(borderWidth).setBorderColor(borderColor).setOval(isOval);
            return;
        }
        if (drawable instanceof LayerDrawable)
        {
            drawable = (LayerDrawable)drawable;
            int i = 0;
            int j = drawable.getNumberOfLayers();
            while (i < j) 
            {
                updateAttrs(drawable.getDrawable(i));
                i++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void updateBackgroundDrawableAttrs(boolean flag)
    {
        if (mutateBackground)
        {
            if (flag)
            {
                mBackgroundDrawable = RoundedDrawable.fromDrawable(mBackgroundDrawable);
            }
            updateAttrs(mBackgroundDrawable);
        }
    }

    private void updateDrawableAttrs()
    {
        updateAttrs(mDrawable);
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        invalidate();
    }

    public int getBorderColor()
    {
        return borderColor.getDefaultColor();
    }

    public ColorStateList getBorderColors()
    {
        return borderColor;
    }

    public float getBorderWidth()
    {
        return borderWidth;
    }

    public float getCornerRadius()
    {
        return cornerRadius;
    }

    public android.widget.ImageView.ScaleType getScaleType()
    {
        return mScaleType;
    }

    public boolean isMutateBackground()
    {
        return mutateBackground;
    }

    public boolean isOval()
    {
        return isOval;
    }

    public void setBackground(Drawable drawable)
    {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        mBackgroundDrawable = drawable;
        updateBackgroundDrawableAttrs(true);
        super.setBackgroundDrawable(mBackgroundDrawable);
    }

    public void setBorderColor(int i)
    {
        setBorderColor(ColorStateList.valueOf(i));
    }

    public void setBorderColor(ColorStateList colorstatelist)
    {
        if (!borderColor.equals(colorstatelist))
        {
            if (colorstatelist == null)
            {
                colorstatelist = ColorStateList.valueOf(0xff000000);
            }
            borderColor = colorstatelist;
            updateDrawableAttrs();
            updateBackgroundDrawableAttrs(false);
            if (borderWidth > 0.0F)
            {
                invalidate();
                return;
            }
        }
    }

    public void setBorderWidth(float f)
    {
        if (borderWidth == f)
        {
            return;
        } else
        {
            borderWidth = f;
            updateDrawableAttrs();
            updateBackgroundDrawableAttrs(false);
            invalidate();
            return;
        }
    }

    public void setBorderWidth(int i)
    {
        setBorderWidth(getResources().getDimension(i));
    }

    public void setCornerRadius(float f)
    {
        if (cornerRadius == f)
        {
            return;
        } else
        {
            cornerRadius = f;
            updateDrawableAttrs();
            updateBackgroundDrawableAttrs(false);
            return;
        }
    }

    public void setCornerRadius(int i)
    {
        setCornerRadius(getResources().getDimension(i));
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        mResource = 0;
        mDrawable = RoundedDrawable.fromBitmap(bitmap);
        updateDrawableAttrs();
        super.setImageDrawable(mDrawable);
    }

    public void setImageDrawable(Drawable drawable)
    {
        mResource = 0;
        mDrawable = RoundedDrawable.fromDrawable(drawable);
        updateDrawableAttrs();
        super.setImageDrawable(mDrawable);
    }

    public void setImageResource(int i)
    {
        if (mResource != i)
        {
            mResource = i;
            mDrawable = resolveResource();
            updateDrawableAttrs();
            super.setImageDrawable(mDrawable);
        }
    }

    public void setImageURI(Uri uri)
    {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setMutateBackground(boolean flag)
    {
        if (mutateBackground == flag)
        {
            return;
        } else
        {
            mutateBackground = flag;
            updateBackgroundDrawableAttrs(true);
            invalidate();
            return;
        }
    }

    public void setOval(boolean flag)
    {
        isOval = flag;
        updateDrawableAttrs();
        updateBackgroundDrawableAttrs(false);
        invalidate();
    }

    public void setScaleType(android.widget.ImageView.ScaleType scaletype)
    {
        if (!$assertionsDisabled && scaletype == null)
        {
            throw new AssertionError();
        }
        if (mScaleType == scaletype) goto _L2; else goto _L1
_L1:
        mScaleType = scaletype;
        static class _cls1
        {

            static final int $SwitchMap$android$widget$ImageView$ScaleType[];

            static 
            {
                $SwitchMap$android$widget$ImageView$ScaleType = new int[android.widget.ImageView.ScaleType.values().length];
                try
                {
                    $SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.CENTER.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.FIT_START.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.FIT_END.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.FIT_XY.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.android.widget.ImageView.ScaleType[scaletype.ordinal()];
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
        updateDrawableAttrs();
        updateBackgroundDrawableAttrs(false);
        invalidate();
_L2:
        return;
_L4:
        super.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        if (true) goto _L6; else goto _L5
_L5:
    }

    static 
    {
        boolean flag;
        if (!com/phunware/nbc/sochi/views/RoundedImageView.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
        SCALE_TYPES = (new android.widget.ImageView.ScaleType[] {
            android.widget.ImageView.ScaleType.MATRIX, android.widget.ImageView.ScaleType.FIT_XY, android.widget.ImageView.ScaleType.FIT_START, android.widget.ImageView.ScaleType.FIT_CENTER, android.widget.ImageView.ScaleType.FIT_END, android.widget.ImageView.ScaleType.CENTER, android.widget.ImageView.ScaleType.CENTER_CROP, android.widget.ImageView.ScaleType.CENTER_INSIDE
        });
    }
}
