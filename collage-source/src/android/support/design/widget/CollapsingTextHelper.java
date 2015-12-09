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
import android.graphics.RectF;
import android.graphics.Typeface;
import android.support.v4.text.TextDirectionHeuristicCompat;
import android.support.v4.text.TextDirectionHeuristicsCompat;
import android.support.v4.view.GravityCompat;
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
    private static final Paint DEBUG_DRAW_PAINT;
    private static final boolean USE_SCALING_TEXTURE;
    private boolean mBoundsChanged;
    private final Rect mCollapsedBounds = new Rect();
    private float mCollapsedDrawX;
    private float mCollapsedDrawY;
    private int mCollapsedShadowColor;
    private float mCollapsedShadowDx;
    private float mCollapsedShadowDy;
    private float mCollapsedShadowRadius;
    private int mCollapsedTextColor;
    private int mCollapsedTextGravity;
    private float mCollapsedTextSize;
    private Typeface mCollapsedTypeface;
    private final RectF mCurrentBounds = new RectF();
    private float mCurrentDrawX;
    private float mCurrentDrawY;
    private float mCurrentTextSize;
    private Typeface mCurrentTypeface;
    private boolean mDrawTitle;
    private final Rect mExpandedBounds = new Rect();
    private float mExpandedDrawX;
    private float mExpandedDrawY;
    private float mExpandedFraction;
    private int mExpandedShadowColor;
    private float mExpandedShadowDx;
    private float mExpandedShadowDy;
    private float mExpandedShadowRadius;
    private int mExpandedTextColor;
    private int mExpandedTextGravity;
    private float mExpandedTextSize;
    private Bitmap mExpandedTitleTexture;
    private Typeface mExpandedTypeface;
    private boolean mIsRtl;
    private Interpolator mPositionInterpolator;
    private float mScale;
    private CharSequence mText;
    private final TextPaint mTextPaint = new TextPaint();
    private Interpolator mTextSizeInterpolator;
    private CharSequence mTextToDraw;
    private float mTextureAscent;
    private float mTextureDescent;
    private Paint mTexturePaint;
    private boolean mUseTexture;
    private final View mView;

    public CollapsingTextHelper(View view)
    {
        mExpandedTextGravity = 16;
        mCollapsedTextGravity = 16;
        mExpandedTextSize = 15F;
        mCollapsedTextSize = 15F;
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

    private void calculateBaseOffsets()
    {
        float f;
        int i;
        boolean flag = true;
        float f1 = 0.0F;
        float f2 = mCurrentTextSize;
        calculateUsingTextSize(mCollapsedTextSize);
        int j;
        if (mTextToDraw != null)
        {
            f = mTextPaint.measureText(mTextToDraw, 0, mTextToDraw.length());
        } else
        {
            f = 0.0F;
        }
        j = mCollapsedTextGravity;
        if (mIsRtl)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        i = GravityCompat.getAbsoluteGravity(j, i);
        i & 0x70;
        JVM INSTR lookupswitch 2: default 104
    //                   48: 396
    //                   80: 381;
           goto _L1 _L2 _L3
_L1:
        mCollapsedDrawY = ((mTextPaint.descent() - mTextPaint.ascent()) / 2.0F - mTextPaint.descent()) + (float)mCollapsedBounds.centerY();
_L13:
        i & 7;
        JVM INSTR lookupswitch 2: default 172
    //                   1: 419
    //                   5: 438;
           goto _L4 _L5 _L6
_L4:
        mCollapsedDrawX = mCollapsedBounds.left;
_L14:
        calculateUsingTextSize(mExpandedTextSize);
        f = f1;
        if (mTextToDraw != null)
        {
            f = mTextPaint.measureText(mTextToDraw, 0, mTextToDraw.length());
        }
        j = mExpandedTextGravity;
        if (mIsRtl)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        i = GravityCompat.getAbsoluteGravity(j, i);
        i & 0x70;
        JVM INSTR lookupswitch 2: default 280
    //                   48: 476
    //                   80: 461;
           goto _L7 _L8 _L9
_L7:
        mExpandedDrawY = ((mTextPaint.descent() - mTextPaint.ascent()) / 2.0F - mTextPaint.descent()) + (float)mExpandedBounds.centerY();
_L15:
        i & 7;
        JVM INSTR lookupswitch 2: default 348
    //                   1: 499
    //                   5: 518;
           goto _L10 _L11 _L12
_L10:
        mExpandedDrawX = mExpandedBounds.left;
_L16:
        clearTexture();
        setInterpolatedTextSize(f2);
        return;
_L3:
        mCollapsedDrawY = mCollapsedBounds.bottom;
          goto _L13
_L2:
        mCollapsedDrawY = (float)mCollapsedBounds.top - mTextPaint.ascent();
          goto _L13
_L5:
        mCollapsedDrawX = (float)mCollapsedBounds.centerX() - f / 2.0F;
          goto _L14
_L6:
        mCollapsedDrawX = (float)mCollapsedBounds.right - f;
          goto _L14
_L9:
        mExpandedDrawY = mExpandedBounds.bottom;
          goto _L15
_L8:
        mExpandedDrawY = (float)mExpandedBounds.top - mTextPaint.ascent();
          goto _L15
_L11:
        mExpandedDrawX = (float)mExpandedBounds.centerX() - f / 2.0F;
          goto _L16
_L12:
        mExpandedDrawX = (float)mExpandedBounds.right - f;
          goto _L16
    }

    private void calculateCurrentOffsets()
    {
        calculateOffsets(mExpandedFraction);
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

    private void calculateOffsets(float f)
    {
        interpolateBounds(f);
        mCurrentDrawX = lerp(mExpandedDrawX, mCollapsedDrawX, f, mPositionInterpolator);
        mCurrentDrawY = lerp(mExpandedDrawY, mCollapsedDrawY, f, mPositionInterpolator);
        setInterpolatedTextSize(lerp(mExpandedTextSize, mCollapsedTextSize, f, mTextSizeInterpolator));
        if (mCollapsedTextColor != mExpandedTextColor)
        {
            mTextPaint.setColor(blendColors(mExpandedTextColor, mCollapsedTextColor, f));
        } else
        {
            mTextPaint.setColor(mCollapsedTextColor);
        }
        mTextPaint.setShadowLayer(lerp(mExpandedShadowRadius, mCollapsedShadowRadius, f, null), lerp(mExpandedShadowDx, mCollapsedShadowDx, f, null), lerp(mExpandedShadowDy, mCollapsedShadowDy, f, null), blendColors(mExpandedShadowColor, mCollapsedShadowColor, f));
        ViewCompat.postInvalidateOnAnimation(mView);
    }

    private void calculateUsingTextSize(float f)
    {
        boolean flag2 = true;
        if (mText != null)
        {
            if (isClose(f, mCollapsedTextSize))
            {
                float f1 = mCollapsedBounds.width();
                f = mCollapsedTextSize;
                mScale = 1.0F;
                float f2;
                CharSequence charsequence;
                boolean flag;
                boolean flag1;
                if (mCurrentTypeface != mCollapsedTypeface)
                {
                    mCurrentTypeface = mCollapsedTypeface;
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            {
                f1 = mExpandedBounds.width();
                f2 = mExpandedTextSize;
                if (mCurrentTypeface != mExpandedTypeface)
                {
                    mCurrentTypeface = mExpandedTypeface;
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (isClose(f, mExpandedTextSize))
                {
                    mScale = 1.0F;
                    f = f2;
                } else
                {
                    mScale = f / mExpandedTextSize;
                    f = f2;
                }
            }
            if (f1 > 0.0F)
            {
                flag1 = flag2;
                if (mCurrentTextSize == f)
                {
                    flag1 = flag2;
                    if (!mBoundsChanged)
                    {
                        if (flag)
                        {
                            flag1 = flag2;
                        } else
                        {
                            flag1 = false;
                        }
                    }
                }
                mCurrentTextSize = f;
                mBoundsChanged = false;
            } else
            {
                flag1 = flag;
            }
            if (mTextToDraw == null || flag1)
            {
                mTextPaint.setTextSize(mCurrentTextSize);
                mTextPaint.setTypeface(mCurrentTypeface);
                charsequence = TextUtils.ellipsize(mText, mTextPaint, f1, android.text.TextUtils.TruncateAt.END);
                if (!TextUtils.equals(charsequence, mTextToDraw))
                {
                    mTextToDraw = charsequence;
                    mIsRtl = calculateIsRtl(mTextToDraw);
                    return;
                }
            }
        }
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
            calculateOffsets(0.0F);
            mTextureAscent = mTextPaint.ascent();
            mTextureDescent = mTextPaint.descent();
            int i = Math.round(mTextPaint.measureText(mTextToDraw, 0, mTextToDraw.length()));
            int j = Math.round(mTextureDescent - mTextureAscent);
            if (i > 0 && j > 0)
            {
                mExpandedTitleTexture = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
                (new Canvas(mExpandedTitleTexture)).drawText(mTextToDraw, 0, mTextToDraw.length(), 0.0F, (float)j - mTextPaint.descent(), mTextPaint);
                if (mTexturePaint == null)
                {
                    mTexturePaint = new Paint(3);
                    return;
                }
            }
        }
    }

    private void interpolateBounds(float f)
    {
        mCurrentBounds.left = lerp(mExpandedBounds.left, mCollapsedBounds.left, f, mPositionInterpolator);
        mCurrentBounds.top = lerp(mExpandedDrawY, mCollapsedDrawY, f, mPositionInterpolator);
        mCurrentBounds.right = lerp(mExpandedBounds.right, mCollapsedBounds.right, f, mPositionInterpolator);
        mCurrentBounds.bottom = lerp(mExpandedBounds.bottom, mCollapsedBounds.bottom, f, mPositionInterpolator);
    }

    private static boolean isClose(float f, float f1)
    {
        return Math.abs(f - f1) < 0.001F;
    }

    private static float lerp(float f, float f1, float f2, Interpolator interpolator)
    {
        float f3 = f2;
        if (interpolator != null)
        {
            f3 = interpolator.getInterpolation(f2);
        }
        return AnimationUtils.lerp(f, f1, f3);
    }

    private Typeface readFontFamilyTypeface(int i)
    {
        TypedArray typedarray = mView.getContext().obtainStyledAttributes(i, new int[] {
            0x10103ac
        });
        Object obj = typedarray.getString(0);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        obj = Typeface.create(((String) (obj)), 0);
        typedarray.recycle();
        return ((Typeface) (obj));
        typedarray.recycle();
        return null;
        Exception exception;
        exception;
        typedarray.recycle();
        throw exception;
    }

    private static boolean rectEquals(Rect rect, int i, int j, int k, int l)
    {
        return rect.left == i && rect.top == j && rect.right == k && rect.bottom == l;
    }

    private void setInterpolatedTextSize(float f)
    {
        calculateUsingTextSize(f);
        boolean flag;
        if (USE_SCALING_TEXTURE && mScale != 1.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mUseTexture = flag;
        if (mUseTexture)
        {
            ensureExpandedTexture();
        }
        ViewCompat.postInvalidateOnAnimation(mView);
    }

    public void draw(Canvas canvas)
    {
        int i = canvas.save();
        if (mTextToDraw != null && mDrawTitle)
        {
            float f4 = mCurrentDrawX;
            float f3 = mCurrentDrawY;
            float f;
            float f2;
            boolean flag;
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
                f = mTextureAscent * mScale;
                float f1 = mTextureDescent;
                f1 = mScale;
            } else
            {
                f = mTextPaint.ascent() * mScale;
                mTextPaint.descent();
                f2 = mScale;
            }
            f2 = f3;
            if (flag)
            {
                f2 = f3 + f;
            }
            if (mScale != 1.0F)
            {
                canvas.scale(mScale, mScale, f4, f2);
            }
            if (flag)
            {
                canvas.drawBitmap(mExpandedTitleTexture, f4, f2, mTexturePaint);
            } else
            {
                canvas.drawText(mTextToDraw, 0, mTextToDraw.length(), f4, f2, mTextPaint);
            }
        }
        canvas.restoreToCount(i);
    }

    int getCollapsedTextColor()
    {
        return mCollapsedTextColor;
    }

    int getCollapsedTextGravity()
    {
        return mCollapsedTextGravity;
    }

    float getCollapsedTextSize()
    {
        return mCollapsedTextSize;
    }

    Typeface getCollapsedTypeface()
    {
        if (mCollapsedTypeface != null)
        {
            return mCollapsedTypeface;
        } else
        {
            return Typeface.DEFAULT;
        }
    }

    int getExpandedTextColor()
    {
        return mExpandedTextColor;
    }

    int getExpandedTextGravity()
    {
        return mExpandedTextGravity;
    }

    float getExpandedTextSize()
    {
        return mExpandedTextSize;
    }

    Typeface getExpandedTypeface()
    {
        if (mExpandedTypeface != null)
        {
            return mExpandedTypeface;
        } else
        {
            return Typeface.DEFAULT;
        }
    }

    float getExpansionFraction()
    {
        return mExpandedFraction;
    }

    CharSequence getText()
    {
        return mText;
    }

    void onBoundsChanged()
    {
        boolean flag;
        if (mCollapsedBounds.width() > 0 && mCollapsedBounds.height() > 0 && mExpandedBounds.width() > 0 && mExpandedBounds.height() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mDrawTitle = flag;
    }

    public void recalculate()
    {
        if (mView.getHeight() > 0 && mView.getWidth() > 0)
        {
            calculateBaseOffsets();
            calculateCurrentOffsets();
        }
    }

    void setCollapsedBounds(int i, int j, int k, int l)
    {
        if (!rectEquals(mCollapsedBounds, i, j, k, l))
        {
            mCollapsedBounds.set(i, j, k, l);
            mBoundsChanged = true;
            onBoundsChanged();
        }
    }

    void setCollapsedTextAppearance(int i)
    {
        TypedArray typedarray = mView.getContext().obtainStyledAttributes(i, android.support.design.R.styleable.TextAppearance);
        if (typedarray.hasValue(android.support.design.R.styleable.TextAppearance_android_textColor))
        {
            mCollapsedTextColor = typedarray.getColor(android.support.design.R.styleable.TextAppearance_android_textColor, mCollapsedTextColor);
        }
        if (typedarray.hasValue(android.support.design.R.styleable.TextAppearance_android_textSize))
        {
            mCollapsedTextSize = typedarray.getDimensionPixelSize(android.support.design.R.styleable.TextAppearance_android_textSize, (int)mCollapsedTextSize);
        }
        mCollapsedShadowColor = typedarray.getInt(android.support.design.R.styleable.TextAppearance_android_shadowColor, 0);
        mCollapsedShadowDx = typedarray.getFloat(android.support.design.R.styleable.TextAppearance_android_shadowDx, 0.0F);
        mCollapsedShadowDy = typedarray.getFloat(android.support.design.R.styleable.TextAppearance_android_shadowDy, 0.0F);
        mCollapsedShadowRadius = typedarray.getFloat(android.support.design.R.styleable.TextAppearance_android_shadowRadius, 0.0F);
        typedarray.recycle();
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            mCollapsedTypeface = readFontFamilyTypeface(i);
        }
        recalculate();
    }

    void setCollapsedTextColor(int i)
    {
        if (mCollapsedTextColor != i)
        {
            mCollapsedTextColor = i;
            recalculate();
        }
    }

    void setCollapsedTextGravity(int i)
    {
        if (mCollapsedTextGravity != i)
        {
            mCollapsedTextGravity = i;
            recalculate();
        }
    }

    void setCollapsedTextSize(float f)
    {
        if (mCollapsedTextSize != f)
        {
            mCollapsedTextSize = f;
            recalculate();
        }
    }

    void setCollapsedTypeface(Typeface typeface)
    {
        if (mCollapsedTypeface != typeface)
        {
            mCollapsedTypeface = typeface;
            recalculate();
        }
    }

    void setExpandedBounds(int i, int j, int k, int l)
    {
        if (!rectEquals(mExpandedBounds, i, j, k, l))
        {
            mExpandedBounds.set(i, j, k, l);
            mBoundsChanged = true;
            onBoundsChanged();
        }
    }

    void setExpandedTextAppearance(int i)
    {
        TypedArray typedarray = mView.getContext().obtainStyledAttributes(i, android.support.design.R.styleable.TextAppearance);
        if (typedarray.hasValue(android.support.design.R.styleable.TextAppearance_android_textColor))
        {
            mExpandedTextColor = typedarray.getColor(android.support.design.R.styleable.TextAppearance_android_textColor, mExpandedTextColor);
        }
        if (typedarray.hasValue(android.support.design.R.styleable.TextAppearance_android_textSize))
        {
            mExpandedTextSize = typedarray.getDimensionPixelSize(android.support.design.R.styleable.TextAppearance_android_textSize, (int)mExpandedTextSize);
        }
        mExpandedShadowColor = typedarray.getInt(android.support.design.R.styleable.TextAppearance_android_shadowColor, 0);
        mExpandedShadowDx = typedarray.getFloat(android.support.design.R.styleable.TextAppearance_android_shadowDx, 0.0F);
        mExpandedShadowDy = typedarray.getFloat(android.support.design.R.styleable.TextAppearance_android_shadowDy, 0.0F);
        mExpandedShadowRadius = typedarray.getFloat(android.support.design.R.styleable.TextAppearance_android_shadowRadius, 0.0F);
        typedarray.recycle();
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            mExpandedTypeface = readFontFamilyTypeface(i);
        }
        recalculate();
    }

    void setExpandedTextColor(int i)
    {
        if (mExpandedTextColor != i)
        {
            mExpandedTextColor = i;
            recalculate();
        }
    }

    void setExpandedTextGravity(int i)
    {
        if (mExpandedTextGravity != i)
        {
            mExpandedTextGravity = i;
            recalculate();
        }
    }

    void setExpandedTextSize(float f)
    {
        if (mExpandedTextSize != f)
        {
            mExpandedTextSize = f;
            recalculate();
        }
    }

    void setExpandedTypeface(Typeface typeface)
    {
        if (mExpandedTypeface != typeface)
        {
            mExpandedTypeface = typeface;
            recalculate();
        }
    }

    void setExpansionFraction(float f)
    {
        f = MathUtils.constrain(f, 0.0F, 1.0F);
        if (f != mExpandedFraction)
        {
            mExpandedFraction = f;
            calculateCurrentOffsets();
        }
    }

    void setPositionInterpolator(Interpolator interpolator)
    {
        mPositionInterpolator = interpolator;
        recalculate();
    }

    void setText(CharSequence charsequence)
    {
        if (charsequence == null || !charsequence.equals(mText))
        {
            mText = charsequence;
            mTextToDraw = null;
            clearTexture();
            recalculate();
        }
    }

    void setTextSizeInterpolator(Interpolator interpolator)
    {
        mTextSizeInterpolator = interpolator;
        recalculate();
    }

    void setTypefaces(Typeface typeface)
    {
        mExpandedTypeface = typeface;
        mCollapsedTypeface = typeface;
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
        DEBUG_DRAW_PAINT = null;
        if (DEBUG_DRAW_PAINT != null)
        {
            DEBUG_DRAW_PAINT.setAntiAlias(true);
            DEBUG_DRAW_PAINT.setColor(-65281);
        }
    }
}
