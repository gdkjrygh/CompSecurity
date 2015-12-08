// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v4.text.TextDirectionHeuristicCompat;
import android.support.v4.text.TextDirectionHeuristicsCompat;
import android.support.v4.view.ViewCompat;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.design.widget:
//            AnimationUtils, MathUtils

final class CollapsingTextHelper
{

    private static final boolean DEBUG_DRAW = false;
    private static final Paint DEBUG_DRAW_PAINT = null;
    private static final boolean USE_SCALING_TEXTURE;
    private final Rect mCollapsedBounds = new Rect();
    private int mCollapsedTextColor;
    private float mCollapsedTextSize;
    private int mCollapsedTextVerticalGravity;
    private float mCollapsedTop;
    private float mCurrentLeft;
    private float mCurrentRight;
    private float mCurrentTextSize;
    private float mCurrentTop;
    private final Rect mExpandedBounds = new Rect();
    private float mExpandedFraction;
    private int mExpandedTextColor;
    private float mExpandedTextSize;
    private int mExpandedTextVerticalGravity;
    private Bitmap mExpandedTitleTexture;
    private float mExpandedTop;
    private boolean mIsRtl;
    private Interpolator mPositionInterpolator;
    private float mScale;
    private CharSequence mText;
    private final TextPaint mTextPaint = new TextPaint();
    private Interpolator mTextSizeInterpolator;
    private CharSequence mTextToDraw;
    private float mTextWidth;
    private float mTextureAscent;
    private float mTextureDescent;
    private Paint mTexturePaint;
    private boolean mUseTexture;
    private final View mView;

    public CollapsingTextHelper(View view)
    {
        mExpandedTextVerticalGravity = 16;
        mCollapsedTextVerticalGravity = 16;
        mView = view;
        mTextPaint.setAntiAlias(true);
    }

    private static int blendColors(int i, int j, float f)
    {
        float f1 = 1.0F - f;
        float f2 = Color.alpha(i);
        float f3 = Color.alpha(j);
        float f4 = Color.red(i);
        float f5 = Color.red(j);
        float f6 = Color.green(i);
        float f7 = Color.green(j);
        float f8 = Color.blue(i);
        float f9 = Color.blue(j);
        return Color.argb((int)(f2 * f1 + f3 * f), (int)(f4 * f1 + f5 * f), (int)(f6 * f1 + f7 * f), (int)(f1 * f8 + f9 * f));
    }

    private void calculateBaselines()
    {
        mTextPaint.setTextSize(mCollapsedTextSize);
        mCollapsedTextVerticalGravity;
        JVM INSTR lookupswitch 2: default 40
    //                   48: 200
    //                   80: 185;
           goto _L1 _L2 _L3
_L1:
        mCollapsedTop = ((mTextPaint.descent() - mTextPaint.ascent()) / 2.0F - mTextPaint.descent()) + (float)mCollapsedBounds.centerY();
_L7:
        mTextPaint.setTextSize(mExpandedTextSize);
        mExpandedTextVerticalGravity;
        JVM INSTR lookupswitch 2: default 120
    //                   48: 238
    //                   80: 223;
           goto _L4 _L5 _L6
_L5:
        break MISSING_BLOCK_LABEL_238;
_L4:
        mExpandedTop = ((mTextPaint.descent() - mTextPaint.ascent()) / 2.0F - mTextPaint.descent()) + (float)mExpandedBounds.centerY();
_L8:
        mTextureAscent = mTextPaint.ascent();
        mTextureDescent = mTextPaint.descent();
        clearTexture();
        return;
_L3:
        mCollapsedTop = mCollapsedBounds.bottom;
          goto _L7
_L2:
        mCollapsedTop = (float)mCollapsedBounds.top - mTextPaint.ascent();
          goto _L7
_L6:
        mExpandedTop = mExpandedBounds.bottom;
          goto _L8
        mExpandedTop = (float)mExpandedBounds.top - mTextPaint.ascent();
          goto _L8
    }

    private boolean calculateIsRtl(CharSequence charsequence)
    {
        boolean flag = true;
        TextDirectionHeuristicCompat textdirectionheuristiccompat;
        if (ViewCompat.getLayoutDirection(mView) != 1)
        {
            flag = false;
        }
        if (flag)
        {
            textdirectionheuristiccompat = TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL;
        } else
        {
            textdirectionheuristiccompat = TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
        }
        return textdirectionheuristiccompat.isRtl(charsequence, 0, charsequence.length());
    }

    private void calculateOffsets()
    {
        float f = mExpandedFraction;
        mCurrentLeft = interpolate(mExpandedBounds.left, mCollapsedBounds.left, f, mPositionInterpolator);
        mCurrentTop = interpolate(mExpandedTop, mCollapsedTop, f, mPositionInterpolator);
        mCurrentRight = interpolate(mExpandedBounds.right, mCollapsedBounds.right, f, mPositionInterpolator);
        setInterpolatedTextSize(interpolate(mExpandedTextSize, mCollapsedTextSize, f, mTextSizeInterpolator));
        if (mCollapsedTextColor != mExpandedTextColor)
        {
            mTextPaint.setColor(blendColors(mExpandedTextColor, mCollapsedTextColor, f));
        } else
        {
            mTextPaint.setColor(mCollapsedTextColor);
        }
        ViewCompat.postInvalidateOnAnimation(mView);
    }

    private void clearTexture()
    {
        if (mExpandedTitleTexture != null)
        {
            mExpandedTitleTexture.recycle();
            mExpandedTitleTexture = null;
        }
    }

    private void ensureExpandedTexture()
    {
        if (mExpandedTitleTexture == null && !mExpandedBounds.isEmpty() && !TextUtils.isEmpty(mTextToDraw))
        {
            mTextPaint.setTextSize(mExpandedTextSize);
            mTextPaint.setColor(mExpandedTextColor);
            int i = Math.round(mTextPaint.measureText(mTextToDraw, 0, mTextToDraw.length()));
            int j = Math.round(mTextPaint.descent() - mTextPaint.ascent());
            mTextWidth = i;
            if (i > 0 || j > 0)
            {
                mExpandedTitleTexture = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
                (new Canvas(mExpandedTitleTexture)).drawText(mTextToDraw, 0, mTextToDraw.length(), 0.0F, (float)j - mTextPaint.descent(), mTextPaint);
                if (mTexturePaint == null)
                {
                    mTexturePaint = new Paint();
                    mTexturePaint.setAntiAlias(true);
                    mTexturePaint.setFilterBitmap(true);
                    return;
                }
            }
        }
    }

    private static float interpolate(float f, float f1, float f2, Interpolator interpolator)
    {
        float f3 = f2;
        if (interpolator != null)
        {
            f3 = interpolator.getInterpolation(f2);
        }
        return AnimationUtils.lerp(f, f1, f3);
    }

    private static boolean isClose(float f, float f1)
    {
        return Math.abs(f - f1) < 0.001F;
    }

    private void setInterpolatedTextSize(float f)
    {
        boolean flag1 = true;
        if (mText == null)
        {
            return;
        }
        float f1;
        boolean flag;
        if (isClose(f, mCollapsedTextSize))
        {
            f1 = mCollapsedBounds.width();
            f = mCollapsedTextSize;
            mScale = 1.0F;
        } else
        {
            float f2 = mExpandedBounds.width();
            f1 = mExpandedTextSize;
            if (isClose(f, mExpandedTextSize))
            {
                mScale = 1.0F;
                f = f1;
                f1 = f2;
            } else
            {
                mScale = f / mExpandedTextSize;
                f = f1;
                f1 = f2;
            }
        }
        if (f1 > 0.0F)
        {
            CharSequence charsequence;
            if (mCurrentTextSize != f)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mCurrentTextSize = f;
        } else
        {
            flag = false;
        }
        if (mTextToDraw == null || flag)
        {
            mTextPaint.setTextSize(mCurrentTextSize);
            charsequence = TextUtils.ellipsize(mText, mTextPaint, f1, android.text.TextUtils.TruncateAt.END);
            if (mTextToDraw == null || !mTextToDraw.equals(charsequence))
            {
                mTextToDraw = charsequence;
            }
            mIsRtl = calculateIsRtl(mTextToDraw);
            mTextWidth = mTextPaint.measureText(mTextToDraw, 0, mTextToDraw.length());
        }
        if (!USE_SCALING_TEXTURE || mScale == 1.0F)
        {
            flag1 = false;
        }
        mUseTexture = flag1;
        if (mUseTexture)
        {
            ensureExpandedTexture();
        }
        ViewCompat.postInvalidateOnAnimation(mView);
    }

    public final void draw(Canvas canvas)
    {
        int i = canvas.save();
        if (mTextToDraw != null)
        {
            boolean flag1 = mIsRtl;
            float f;
            float f1;
            float f2;
            float f3;
            boolean flag;
            if (flag1)
            {
                f = mCurrentRight;
            } else
            {
                f = mCurrentLeft;
            }
            f3 = mCurrentTop;
            if (mUseTexture && mExpandedTitleTexture != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mTextPaint.setTextSize(mCurrentTextSize);
            if (flag)
            {
                f2 = mTextureAscent * mScale;
            } else
            {
                mTextPaint.ascent();
                f2 = 0.0F;
                mTextPaint.descent();
            }
            f1 = f3;
            if (flag)
            {
                f1 = f3 + f2;
            }
            if (mScale != 1.0F)
            {
                canvas.scale(mScale, mScale, f, f1);
            }
            if (flag1)
            {
                f -= mTextWidth;
            }
            if (flag)
            {
                canvas.drawBitmap(mExpandedTitleTexture, f, f1, mTexturePaint);
            } else
            {
                canvas.drawText(mTextToDraw, 0, mTextToDraw.length(), f, f1, mTextPaint);
            }
        }
        canvas.restoreToCount(i);
    }

    final int getCollapsedTextColor()
    {
        return mCollapsedTextColor;
    }

    final float getCollapsedTextSize()
    {
        return mCollapsedTextSize;
    }

    final int getExpandedTextColor()
    {
        return mExpandedTextColor;
    }

    final float getExpandedTextSize()
    {
        return mExpandedTextSize;
    }

    final float getExpansionFraction()
    {
        return mExpandedFraction;
    }

    final CharSequence getText()
    {
        return mText;
    }

    public final void recalculate()
    {
        if (mView.getHeight() > 0 && mView.getWidth() > 0)
        {
            calculateBaselines();
            calculateOffsets();
        }
    }

    final void setCollapsedBounds(int i, int j, int k, int l)
    {
        mCollapsedBounds.set(i, j, k, l);
    }

    final void setCollapsedTextAppearance(int i)
    {
        TypedArray typedarray = mView.getContext().obtainStyledAttributes(i, android.support.design.R.styleable.TextAppearance);
        if (typedarray.hasValue(android.support.design.R.styleable.TextAppearance_android_textColor))
        {
            mCollapsedTextColor = typedarray.getColor(android.support.design.R.styleable.TextAppearance_android_textColor, 0);
        }
        if (typedarray.hasValue(android.support.design.R.styleable.TextAppearance_android_textSize))
        {
            mCollapsedTextSize = typedarray.getDimensionPixelSize(android.support.design.R.styleable.TextAppearance_android_textSize, 0);
        }
        typedarray.recycle();
        recalculate();
    }

    final void setCollapsedTextColor(int i)
    {
        if (mCollapsedTextColor != i)
        {
            mCollapsedTextColor = i;
            recalculate();
        }
    }

    final void setCollapsedTextSize(float f)
    {
        if (mCollapsedTextSize != f)
        {
            mCollapsedTextSize = f;
            recalculate();
        }
    }

    final void setCollapsedTextVerticalGravity(int i)
    {
        i &= 0x70;
        if (mCollapsedTextVerticalGravity != i)
        {
            mCollapsedTextVerticalGravity = i;
            recalculate();
        }
    }

    final void setExpandedBounds(int i, int j, int k, int l)
    {
        mExpandedBounds.set(i, j, k, l);
    }

    final void setExpandedTextAppearance(int i)
    {
        TypedArray typedarray = mView.getContext().obtainStyledAttributes(i, android.support.design.R.styleable.TextAppearance);
        if (typedarray.hasValue(android.support.design.R.styleable.TextAppearance_android_textColor))
        {
            mExpandedTextColor = typedarray.getColor(android.support.design.R.styleable.TextAppearance_android_textColor, 0);
        }
        if (typedarray.hasValue(android.support.design.R.styleable.TextAppearance_android_textSize))
        {
            mExpandedTextSize = typedarray.getDimensionPixelSize(android.support.design.R.styleable.TextAppearance_android_textSize, 0);
        }
        typedarray.recycle();
        recalculate();
    }

    final void setExpandedTextColor(int i)
    {
        if (mExpandedTextColor != i)
        {
            mExpandedTextColor = i;
            recalculate();
        }
    }

    final void setExpandedTextSize(float f)
    {
        if (mExpandedTextSize != f)
        {
            mExpandedTextSize = f;
            recalculate();
        }
    }

    final void setExpandedTextVerticalGravity(int i)
    {
        i &= 0x70;
        if (mExpandedTextVerticalGravity != i)
        {
            mExpandedTextVerticalGravity = i;
            recalculate();
        }
    }

    final void setExpansionFraction(float f)
    {
        f = MathUtils.constrain(f, 0.0F, 1.0F);
        if (f != mExpandedFraction)
        {
            mExpandedFraction = f;
            calculateOffsets();
        }
    }

    final void setPositionInterpolator(Interpolator interpolator)
    {
        mPositionInterpolator = interpolator;
        recalculate();
    }

    final void setText(CharSequence charsequence)
    {
        if (charsequence == null || !charsequence.equals(mText))
        {
            mText = charsequence;
            mTextToDraw = null;
            clearTexture();
            recalculate();
        }
    }

    final void setTextSizeInterpolator(Interpolator interpolator)
    {
        mTextSizeInterpolator = interpolator;
        recalculate();
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT < 18)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        USE_SCALING_TEXTURE = flag;
    }
}
