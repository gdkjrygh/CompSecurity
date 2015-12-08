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
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.makeramen:
//            RoundedDrawable

public class RoundedImageView extends ImageView
{

    public static final int DEFAULT_BORDER_WIDTH = 0;
    public static final int DEFAULT_RADIUS = 0;
    private static final android.widget.ImageView.ScaleType SCALE_TYPES[];
    public static final String TAG = "RoundedImageView";
    private Drawable mBackgroundDrawable;
    private ColorStateList mBorderColor;
    private int mBorderWidth;
    private int mCornerRadius;
    private Drawable mDrawable;
    private boolean mOval;
    private int mResource;
    private boolean mRoundBackground;
    private android.widget.ImageView.ScaleType mScaleType;

    public RoundedImageView(Context context)
    {
        this(context, null);
    }

    public RoundedImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public RoundedImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mCornerRadius = 0;
        mBorderWidth = 0;
        mBorderColor = ColorStateList.valueOf(0xff000000);
        mOval = false;
        mRoundBackground = false;
        context = context.obtainStyledAttributes(attributeset, com.netflix.mediaclient.R.styleable.RoundedImageView, i, 0);
        i = context.getInt(0, -1);
        if (i >= 0)
        {
            setScaleType(SCALE_TYPES[i]);
        } else
        {
            setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        }
        mCornerRadius = context.getDimensionPixelSize(1, -1);
        mBorderWidth = context.getDimensionPixelSize(2, -1);
        if (mCornerRadius < 0)
        {
            mCornerRadius = 0;
        }
        if (mBorderWidth < 0)
        {
            mBorderWidth = 0;
        }
        mBorderColor = context.getColorStateList(3);
        if (mBorderColor == null)
        {
            mBorderColor = ColorStateList.valueOf(0xff000000);
        }
        mRoundBackground = context.getBoolean(4, false);
        mOval = context.getBoolean(5, false);
        updateDrawableAttrs();
        updateBackgroundDrawableAttrs();
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

    private void updateAttrs(Drawable drawable, boolean flag)
    {
        if (drawable != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (drawable instanceof RoundedDrawable)
        {
            drawable = ((RoundedDrawable)drawable).setScaleType(mScaleType);
            float f;
            int i;
            if (flag && !mRoundBackground)
            {
                f = 0.0F;
            } else
            {
                f = mCornerRadius;
            }
            drawable = drawable.setCornerRadius(f);
            if (flag && !mRoundBackground)
            {
                i = 0;
            } else
            {
                i = mBorderWidth;
            }
            drawable.setBorderWidth(i).setBorderColors(mBorderColor).setOval(mOval);
            return;
        }
        if (drawable instanceof LayerDrawable)
        {
            drawable = (LayerDrawable)drawable;
            int k = drawable.getNumberOfLayers();
            int j = 0;
            while (j < k) 
            {
                updateAttrs(drawable.getDrawable(j), flag);
                j++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void updateBackgroundDrawableAttrs()
    {
        updateAttrs(mBackgroundDrawable, true);
    }

    private void updateDrawableAttrs()
    {
        updateAttrs(mDrawable, false);
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        invalidate();
    }

    public int getBorderColor()
    {
        return mBorderColor.getDefaultColor();
    }

    public ColorStateList getBorderColors()
    {
        return mBorderColor;
    }

    public int getBorderWidth()
    {
        return mBorderWidth;
    }

    public int getCornerRadius()
    {
        return mCornerRadius;
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
        mBackgroundDrawable = RoundedDrawable.fromDrawable(drawable);
        updateBackgroundDrawableAttrs();
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
            if (colorstatelist == null)
            {
                colorstatelist = ColorStateList.valueOf(0xff000000);
            }
            mBorderColor = colorstatelist;
            updateDrawableAttrs();
            updateBackgroundDrawableAttrs();
            if (mBorderWidth > 0)
            {
                invalidate();
                return;
            }
        }
    }

    public void setBorderWidth(int i)
    {
        if (mBorderWidth == i)
        {
            return;
        } else
        {
            mBorderWidth = i;
            updateDrawableAttrs();
            updateBackgroundDrawableAttrs();
            invalidate();
            return;
        }
    }

    public void setCornerRadius(int i)
    {
        if (mCornerRadius == i)
        {
            return;
        } else
        {
            mCornerRadius = i;
            updateDrawableAttrs();
            updateBackgroundDrawableAttrs();
            return;
        }
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

    public void setOval(boolean flag)
    {
        mOval = flag;
        updateDrawableAttrs();
        updateBackgroundDrawableAttrs();
        invalidate();
    }

    public void setRoundBackground(boolean flag)
    {
        if (mRoundBackground == flag)
        {
            return;
        } else
        {
            mRoundBackground = flag;
            updateBackgroundDrawableAttrs();
            invalidate();
            return;
        }
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
        JVM INSTR tableswitch 1 7: default 76
    //                   1 94
    //                   2 94
    //                   3 94
    //                   4 94
    //                   5 94
    //                   6 94
    //                   7 94;
           goto _L3 _L4 _L4 _L4 _L4 _L4 _L4 _L4
_L3:
        super.setScaleType(scaletype);
_L6:
        updateDrawableAttrs();
        updateBackgroundDrawableAttrs();
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
        SCALE_TYPES = (new android.widget.ImageView.ScaleType[] {
            android.widget.ImageView.ScaleType.MATRIX, android.widget.ImageView.ScaleType.FIT_XY, android.widget.ImageView.ScaleType.FIT_START, android.widget.ImageView.ScaleType.FIT_CENTER, android.widget.ImageView.ScaleType.FIT_END, android.widget.ImageView.ScaleType.CENTER, android.widget.ImageView.ScaleType.CENTER_CROP, android.widget.ImageView.ScaleType.CENTER_INSIDE
        });
    }
}
