// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.text.AllCapsTransformationMethod;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.CompoundButton;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            TintTypedArray, ViewUtils, DrawableUtils, TintManager

public class SwitchCompat extends CompoundButton
{
    private class ThumbAnimation extends Animation
    {

        final float mDiff;
        final float mEndPosition;
        final float mStartPosition;
        final SwitchCompat this$0;

        protected void applyTransformation(float f, Transformation transformation)
        {
            setThumbPosition(mStartPosition + mDiff * f);
        }

        private ThumbAnimation(float f, float f1)
        {
            this$0 = SwitchCompat.this;
            super();
            mStartPosition = f;
            mEndPosition = f1;
            mDiff = f1 - f;
        }

    }


    private static final String ACCESSIBILITY_EVENT_CLASS_NAME = "android.widget.Switch";
    private static final int CHECKED_STATE_SET[] = {
        0x10100a0
    };
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int THUMB_ANIMATION_DURATION = 250;
    private static final int TOUCH_MODE_DOWN = 1;
    private static final int TOUCH_MODE_DRAGGING = 2;
    private static final int TOUCH_MODE_IDLE = 0;
    private int mMinFlingVelocity;
    private Layout mOffLayout;
    private Layout mOnLayout;
    private ThumbAnimation mPositionAnimator;
    private boolean mShowText;
    private boolean mSplitTrack;
    private int mSwitchBottom;
    private int mSwitchHeight;
    private int mSwitchLeft;
    private int mSwitchMinWidth;
    private int mSwitchPadding;
    private int mSwitchRight;
    private int mSwitchTop;
    private TransformationMethod mSwitchTransformationMethod;
    private int mSwitchWidth;
    private final Rect mTempRect;
    private ColorStateList mTextColors;
    private CharSequence mTextOff;
    private CharSequence mTextOn;
    private TextPaint mTextPaint;
    private Drawable mThumbDrawable;
    private float mThumbPosition;
    private int mThumbTextPadding;
    private int mThumbWidth;
    private final TintManager mTintManager;
    private int mTouchMode;
    private int mTouchSlop;
    private float mTouchX;
    private float mTouchY;
    private Drawable mTrackDrawable;
    private VelocityTracker mVelocityTracker;

    public SwitchCompat(Context context)
    {
        this(context, null);
    }

    public SwitchCompat(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, android.support.v7.appcompat.R.attr.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mVelocityTracker = VelocityTracker.obtain();
        mTempRect = new Rect();
        mTextPaint = new TextPaint(1);
        Resources resources = getResources();
        mTextPaint.density = resources.getDisplayMetrics().density;
        attributeset = TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.SwitchCompat, i, 0);
        mThumbDrawable = attributeset.getDrawable(android.support.v7.appcompat.R.styleable.SwitchCompat_android_thumb);
        if (mThumbDrawable != null)
        {
            mThumbDrawable.setCallback(this);
        }
        mTrackDrawable = attributeset.getDrawable(android.support.v7.appcompat.R.styleable.SwitchCompat_track);
        if (mTrackDrawable != null)
        {
            mTrackDrawable.setCallback(this);
        }
        mTextOn = attributeset.getText(android.support.v7.appcompat.R.styleable.SwitchCompat_android_textOn);
        mTextOff = attributeset.getText(android.support.v7.appcompat.R.styleable.SwitchCompat_android_textOff);
        mShowText = attributeset.getBoolean(android.support.v7.appcompat.R.styleable.SwitchCompat_showText, true);
        mThumbTextPadding = attributeset.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.SwitchCompat_thumbTextPadding, 0);
        mSwitchMinWidth = attributeset.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.SwitchCompat_switchMinWidth, 0);
        mSwitchPadding = attributeset.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.SwitchCompat_switchPadding, 0);
        mSplitTrack = attributeset.getBoolean(android.support.v7.appcompat.R.styleable.SwitchCompat_splitTrack, false);
        i = attributeset.getResourceId(android.support.v7.appcompat.R.styleable.SwitchCompat_switchTextAppearance, 0);
        if (i != 0)
        {
            setSwitchTextAppearance(context, i);
        }
        mTintManager = attributeset.getTintManager();
        attributeset.recycle();
        context = ViewConfiguration.get(context);
        mTouchSlop = context.getScaledTouchSlop();
        mMinFlingVelocity = context.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    private void animateThumbToCheckedState(final boolean newCheckedState)
    {
        if (mPositionAnimator != null)
        {
            cancelPositionAnimator();
        }
        float f1 = mThumbPosition;
        float f;
        if (newCheckedState)
        {
            f = 1.0F;
        } else
        {
            f = 0.0F;
        }
        mPositionAnimator = new ThumbAnimation(f1, f);
        mPositionAnimator.setDuration(250L);
        mPositionAnimator.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final SwitchCompat this$0;
            final boolean val$newCheckedState;

            public void onAnimationEnd(Animation animation)
            {
                if (mPositionAnimator == animation)
                {
                    animation = SwitchCompat.this;
                    float f2;
                    if (newCheckedState)
                    {
                        f2 = 1.0F;
                    } else
                    {
                        f2 = 0.0F;
                    }
                    animation.setThumbPosition(f2);
                    mPositionAnimator = null;
                }
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
            }

            
            {
                this$0 = SwitchCompat.this;
                newCheckedState = flag;
                super();
            }
        });
        startAnimation(mPositionAnimator);
    }

    private void cancelPositionAnimator()
    {
        if (mPositionAnimator != null)
        {
            clearAnimation();
            mPositionAnimator = null;
        }
    }

    private void cancelSuperTouch(MotionEvent motionevent)
    {
        motionevent = MotionEvent.obtain(motionevent);
        motionevent.setAction(3);
        super.onTouchEvent(motionevent);
        motionevent.recycle();
    }

    private static float constrain(float f, float f1, float f2)
    {
        if (f < f1)
        {
            return f1;
        }
        if (f > f2)
        {
            return f2;
        } else
        {
            return f;
        }
    }

    private boolean getTargetCheckedState()
    {
        return mThumbPosition > 0.5F;
    }

    private int getThumbOffset()
    {
        float f;
        if (ViewUtils.isLayoutRtl(this))
        {
            f = 1.0F - mThumbPosition;
        } else
        {
            f = mThumbPosition;
        }
        return (int)(f * (float)getThumbScrollRange() + 0.5F);
    }

    private int getThumbScrollRange()
    {
        if (mTrackDrawable != null)
        {
            Rect rect1 = mTempRect;
            mTrackDrawable.getPadding(rect1);
            Rect rect;
            if (mThumbDrawable != null)
            {
                rect = DrawableUtils.getOpticalBounds(mThumbDrawable);
            } else
            {
                rect = DrawableUtils.INSETS_NONE;
            }
            return mSwitchWidth - mThumbWidth - rect1.left - rect1.right - rect.left - rect.right;
        } else
        {
            return 0;
        }
    }

    private boolean hitThumb(float f, float f1)
    {
        if (mThumbDrawable != null)
        {
            int k = getThumbOffset();
            mThumbDrawable.getPadding(mTempRect);
            int i = mSwitchTop;
            int j = mTouchSlop;
            k = (k + mSwitchLeft) - mTouchSlop;
            int l = mThumbWidth;
            int i1 = mTempRect.left;
            int j1 = mTempRect.right;
            int k1 = mTouchSlop;
            int l1 = mSwitchBottom;
            int i2 = mTouchSlop;
            if (f > (float)k && f < (float)(l + k + i1 + j1 + k1) && f1 > (float)(i - j) && f1 < (float)(l1 + i2))
            {
                return true;
            }
        }
        return false;
    }

    private Layout makeLayout(CharSequence charsequence)
    {
        if (mSwitchTransformationMethod != null)
        {
            charsequence = mSwitchTransformationMethod.getTransformation(charsequence, this);
        }
        TextPaint textpaint = mTextPaint;
        int i;
        if (charsequence != null)
        {
            i = (int)Math.ceil(Layout.getDesiredWidth(charsequence, mTextPaint));
        } else
        {
            i = 0;
        }
        return new StaticLayout(charsequence, textpaint, i, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, true);
    }

    private void setSwitchTypefaceByIndex(int i, int j)
    {
        Typeface typeface = null;
        i;
        JVM INSTR tableswitch 1 3: default 28
    //                   1 35
    //                   2 42
    //                   3 49;
           goto _L1 _L2 _L3 _L4
_L1:
        setSwitchTypeface(typeface, j);
        return;
_L2:
        typeface = Typeface.SANS_SERIF;
        continue; /* Loop/switch isn't completed */
_L3:
        typeface = Typeface.SERIF;
        continue; /* Loop/switch isn't completed */
_L4:
        typeface = Typeface.MONOSPACE;
        if (true) goto _L1; else goto _L5
_L5:
    }

    private void setThumbPosition(float f)
    {
        mThumbPosition = f;
        invalidate();
    }

    private void stopDrag(MotionEvent motionevent)
    {
        float f;
        boolean flag1;
        boolean flag2;
        flag1 = true;
        mTouchMode = 0;
        boolean flag;
        if (motionevent.getAction() == 1 && isEnabled())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag2 = isChecked();
        if (!flag) goto _L2; else goto _L1
_L1:
        mVelocityTracker.computeCurrentVelocity(1000);
        f = mVelocityTracker.getXVelocity();
        if (Math.abs(f) <= (float)mMinFlingVelocity) goto _L4; else goto _L3
_L3:
        if (!ViewUtils.isLayoutRtl(this)) goto _L6; else goto _L5
_L5:
        if (f >= 0.0F)
        {
            flag1 = false;
        }
_L8:
        if (flag1 != flag2)
        {
            playSoundEffect(0);
        }
        setChecked(flag1);
        cancelSuperTouch(motionevent);
        return;
_L6:
        if (f <= 0.0F)
        {
            flag1 = false;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        flag1 = getTargetCheckedState();
        continue; /* Loop/switch isn't completed */
_L2:
        flag1 = flag2;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void draw(Canvas canvas)
    {
        Rect rect = mTempRect;
        int j = mSwitchLeft;
        int i1 = mSwitchTop;
        int k1 = mSwitchRight;
        int j1 = mSwitchBottom;
        int l1 = j + getThumbOffset();
        Object obj;
        int i;
        if (mThumbDrawable != null)
        {
            obj = DrawableUtils.getOpticalBounds(mThumbDrawable);
        } else
        {
            obj = DrawableUtils.INSETS_NONE;
        }
        if (mTrackDrawable != null)
        {
            mTrackDrawable.getPadding(rect);
            int i2 = rect.left;
            int k;
            int l;
            if (obj != null)
            {
                i = j;
                if (((Rect) (obj)).left > rect.left)
                {
                    i = j + (((Rect) (obj)).left - rect.left);
                }
                if (((Rect) (obj)).top > rect.top)
                {
                    j = (((Rect) (obj)).top - rect.top) + i1;
                } else
                {
                    j = i1;
                }
                l = k1;
                if (((Rect) (obj)).right > rect.right)
                {
                    l = k1 - (((Rect) (obj)).right - rect.right);
                }
                if (((Rect) (obj)).bottom > rect.bottom)
                {
                    k = j1 - (((Rect) (obj)).bottom - rect.bottom);
                } else
                {
                    k = j1;
                }
            } else
            {
                k = j1;
                l = i1;
                i = j;
                j = l;
                l = k1;
            }
            mTrackDrawable.setBounds(i, j, l, k);
            i = i2 + l1;
        } else
        {
            i = l1;
        }
        if (mThumbDrawable != null)
        {
            mThumbDrawable.getPadding(rect);
            j = i - rect.left;
            i = i + mThumbWidth + rect.right;
            mThumbDrawable.setBounds(j, i1, i, j1);
            obj = getBackground();
            if (obj != null)
            {
                DrawableCompat.setHotspotBounds(((Drawable) (obj)), j, i1, i, j1);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f, float f1)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            super.drawableHotspotChanged(f, f1);
        }
        if (mThumbDrawable != null)
        {
            DrawableCompat.setHotspot(mThumbDrawable, f, f1);
        }
        if (mTrackDrawable != null)
        {
            DrawableCompat.setHotspot(mTrackDrawable, f, f1);
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        int ai[] = getDrawableState();
        if (mThumbDrawable != null)
        {
            mThumbDrawable.setState(ai);
        }
        if (mTrackDrawable != null)
        {
            mTrackDrawable.setState(ai);
        }
        invalidate();
    }

    public int getCompoundPaddingLeft()
    {
        int i;
        if (!ViewUtils.isLayoutRtl(this))
        {
            i = super.getCompoundPaddingLeft();
        } else
        {
            int j = super.getCompoundPaddingLeft() + mSwitchWidth;
            i = j;
            if (!TextUtils.isEmpty(getText()))
            {
                return j + mSwitchPadding;
            }
        }
        return i;
    }

    public int getCompoundPaddingRight()
    {
        int i;
        if (ViewUtils.isLayoutRtl(this))
        {
            i = super.getCompoundPaddingRight();
        } else
        {
            int j = super.getCompoundPaddingRight() + mSwitchWidth;
            i = j;
            if (!TextUtils.isEmpty(getText()))
            {
                return j + mSwitchPadding;
            }
        }
        return i;
    }

    public boolean getShowText()
    {
        return mShowText;
    }

    public boolean getSplitTrack()
    {
        return mSplitTrack;
    }

    public int getSwitchMinWidth()
    {
        return mSwitchMinWidth;
    }

    public int getSwitchPadding()
    {
        return mSwitchPadding;
    }

    public CharSequence getTextOff()
    {
        return mTextOff;
    }

    public CharSequence getTextOn()
    {
        return mTextOn;
    }

    public Drawable getThumbDrawable()
    {
        return mThumbDrawable;
    }

    public int getThumbTextPadding()
    {
        return mThumbTextPadding;
    }

    public Drawable getTrackDrawable()
    {
        return mTrackDrawable;
    }

    public void jumpDrawablesToCurrentState()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            super.jumpDrawablesToCurrentState();
            if (mThumbDrawable != null)
            {
                mThumbDrawable.jumpToCurrentState();
            }
            if (mTrackDrawable != null)
            {
                mTrackDrawable.jumpToCurrentState();
            }
            cancelPositionAnimator();
        }
    }

    protected int[] onCreateDrawableState(int i)
    {
        int ai[] = super.onCreateDrawableState(i + 1);
        if (isChecked())
        {
            mergeDrawableStates(ai, CHECKED_STATE_SET);
        }
        return ai;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        Object obj = mTempRect;
        int ai[] = mTrackDrawable;
        Object obj1;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        if (ai != null)
        {
            ai.getPadding(((Rect) (obj)));
        } else
        {
            ((Rect) (obj)).setEmpty();
        }
        l = mSwitchTop;
        i1 = mSwitchBottom;
        j1 = ((Rect) (obj)).top;
        k1 = ((Rect) (obj)).bottom;
        obj1 = mThumbDrawable;
        if (ai != null)
        {
            if (mSplitTrack && obj1 != null)
            {
                Rect rect = DrawableUtils.getOpticalBounds(((Drawable) (obj1)));
                ((Drawable) (obj1)).copyBounds(((Rect) (obj)));
                obj.left = ((Rect) (obj)).left + rect.left;
                obj.right = ((Rect) (obj)).right - rect.right;
                int i = canvas.save();
                canvas.clipRect(((Rect) (obj)), android.graphics.Region.Op.DIFFERENCE);
                ai.draw(canvas);
                canvas.restoreToCount(i);
            } else
            {
                ai.draw(canvas);
            }
        }
        k = canvas.save();
        if (obj1 != null)
        {
            ((Drawable) (obj1)).draw(canvas);
        }
        if (getTargetCheckedState())
        {
            obj = mOnLayout;
        } else
        {
            obj = mOffLayout;
        }
        if (obj != null)
        {
            ai = getDrawableState();
            if (mTextColors != null)
            {
                mTextPaint.setColor(mTextColors.getColorForState(ai, 0));
            }
            mTextPaint.drawableState = ai;
            int j;
            int l1;
            if (obj1 != null)
            {
                obj1 = ((Drawable) (obj1)).getBounds();
                j = ((Rect) (obj1)).left;
                j = ((Rect) (obj1)).right + j;
            } else
            {
                j = getWidth();
            }
            j /= 2;
            l1 = ((Layout) (obj)).getWidth() / 2;
            l = (l + j1 + (i1 - k1)) / 2;
            i1 = ((Layout) (obj)).getHeight() / 2;
            canvas.translate(j - l1, l - i1);
            ((Layout) (obj)).draw(canvas);
        }
        canvas.restoreToCount(k);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        accessibilityevent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        CharSequence charsequence;
        CharSequence charsequence1;
label0:
        {
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
                accessibilitynodeinfo.setClassName("android.widget.Switch");
                if (isChecked())
                {
                    charsequence = mTextOn;
                } else
                {
                    charsequence = mTextOff;
                }
                if (!TextUtils.isEmpty(charsequence))
                {
                    charsequence1 = accessibilitynodeinfo.getText();
                    if (!TextUtils.isEmpty(charsequence1))
                    {
                        break label0;
                    }
                    accessibilitynodeinfo.setText(charsequence);
                }
            }
            return;
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(charsequence1).append(' ').append(charsequence);
        accessibilitynodeinfo.setText(stringbuilder);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        boolean flag1 = false;
        super.onLayout(flag, i, j, k, l);
        if (mThumbDrawable != null)
        {
            Rect rect = mTempRect;
            Rect rect1;
            if (mTrackDrawable != null)
            {
                mTrackDrawable.getPadding(rect);
            } else
            {
                rect.setEmpty();
            }
            rect1 = DrawableUtils.getOpticalBounds(mThumbDrawable);
            j = Math.max(0, rect1.left - rect.left);
            i = Math.max(0, rect1.right - rect.right);
        } else
        {
            j = 0;
            i = ((flag1) ? 1 : 0);
        }
        if (ViewUtils.isLayoutRtl(this))
        {
            k = getPaddingLeft() + j;
            l = (mSwitchWidth + k) - j - i;
        } else
        {
            l = getWidth() - getPaddingRight() - i;
            k = i + (j + (l - mSwitchWidth));
        }
        getGravity() & 0x70;
        JVM INSTR lookupswitch 2: default 148
    //                   16: 220
    //                   80: 254;
           goto _L1 _L2 _L3
_L1:
        j = getPaddingTop();
        i = mSwitchHeight + j;
_L5:
        mSwitchLeft = k;
        mSwitchTop = j;
        mSwitchBottom = i;
        mSwitchRight = l;
        return;
_L2:
        j = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2 - mSwitchHeight / 2;
        i = mSwitchHeight + j;
        continue; /* Loop/switch isn't completed */
_L3:
        i = getHeight() - getPaddingBottom();
        j = i - mSwitchHeight;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void onMeasure(int i, int j)
    {
        int j1 = 0;
        if (mShowText)
        {
            if (mOnLayout == null)
            {
                mOnLayout = makeLayout(mTextOn);
            }
            if (mOffLayout == null)
            {
                mOffLayout = makeLayout(mTextOff);
            }
        }
        Rect rect = mTempRect;
        int k;
        int l;
        int i1;
        int k1;
        int l1;
        if (mThumbDrawable != null)
        {
            mThumbDrawable.getPadding(rect);
            l = mThumbDrawable.getIntrinsicWidth() - rect.left - rect.right;
            k = mThumbDrawable.getIntrinsicHeight();
        } else
        {
            k = 0;
            l = 0;
        }
        if (mShowText)
        {
            i1 = Math.max(mOnLayout.getWidth(), mOffLayout.getWidth()) + mThumbTextPadding * 2;
        } else
        {
            i1 = 0;
        }
        mThumbWidth = Math.max(i1, l);
        if (mTrackDrawable != null)
        {
            mTrackDrawable.getPadding(rect);
            l = mTrackDrawable.getIntrinsicHeight();
        } else
        {
            rect.setEmpty();
            l = j1;
        }
        l1 = rect.left;
        k1 = rect.right;
        j1 = k1;
        i1 = l1;
        if (mThumbDrawable != null)
        {
            rect = DrawableUtils.getOpticalBounds(mThumbDrawable);
            i1 = Math.max(l1, rect.left);
            j1 = Math.max(k1, rect.right);
        }
        i1 = Math.max(mSwitchMinWidth, j1 + (i1 + mThumbWidth * 2));
        k = Math.max(l, k);
        mSwitchWidth = i1;
        mSwitchHeight = k;
        super.onMeasure(i, j);
        if (getMeasuredHeight() < k)
        {
            setMeasuredDimension(ViewCompat.getMeasuredWidthAndState(this), k);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onPopulateAccessibilityEvent(accessibilityevent);
        CharSequence charsequence;
        if (isChecked())
        {
            charsequence = mTextOn;
        } else
        {
            charsequence = mTextOff;
        }
        if (charsequence != null)
        {
            accessibilityevent.getText().add(charsequence);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        mVelocityTracker.addMovement(motionevent);
        MotionEventCompat.getActionMasked(motionevent);
        JVM INSTR tableswitch 0 3: default 44
    //                   0 50
    //                   1 295
    //                   2 94
    //                   3 295;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        return super.onTouchEvent(motionevent);
_L2:
        float f = motionevent.getX();
        float f3 = motionevent.getY();
        if (isEnabled() && hitThumb(f, f3))
        {
            mTouchMode = 1;
            mTouchX = f;
            mTouchY = f3;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        switch (mTouchMode)
        {
        case 1: // '\001'
            float f1 = motionevent.getX();
            float f4 = motionevent.getY();
            if (Math.abs(f1 - mTouchX) > (float)mTouchSlop || Math.abs(f4 - mTouchY) > (float)mTouchSlop)
            {
                mTouchMode = 2;
                getParent().requestDisallowInterceptTouchEvent(true);
                mTouchX = f1;
                mTouchY = f4;
                return true;
            }
            break;

        case 2: // '\002'
            float f6 = motionevent.getX();
            int i = getThumbScrollRange();
            float f2 = f6 - mTouchX;
            float f5;
            if (i != 0)
            {
                f2 /= i;
            } else
            if (f2 > 0.0F)
            {
                f2 = 1.0F;
            } else
            {
                f2 = -1F;
            }
            f5 = f2;
            if (ViewUtils.isLayoutRtl(this))
            {
                f5 = -f2;
            }
            f2 = constrain(f5 + mThumbPosition, 0.0F, 1.0F);
            if (f2 != mThumbPosition)
            {
                mTouchX = f6;
                setThumbPosition(f2);
            }
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (mTouchMode == 2)
        {
            stopDrag(motionevent);
            super.onTouchEvent(motionevent);
            return true;
        }
        mTouchMode = 0;
        mVelocityTracker.clear();
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void setChecked(boolean flag)
    {
        super.setChecked(flag);
        flag = isChecked();
        if (getWindowToken() != null && ViewCompat.isLaidOut(this) && isShown())
        {
            animateThumbToCheckedState(flag);
            return;
        }
        cancelPositionAnimator();
        float f;
        if (flag)
        {
            f = 1.0F;
        } else
        {
            f = 0.0F;
        }
        setThumbPosition(f);
    }

    public void setShowText(boolean flag)
    {
        if (mShowText != flag)
        {
            mShowText = flag;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean flag)
    {
        mSplitTrack = flag;
        invalidate();
    }

    public void setSwitchMinWidth(int i)
    {
        mSwitchMinWidth = i;
        requestLayout();
    }

    public void setSwitchPadding(int i)
    {
        mSwitchPadding = i;
        requestLayout();
    }

    public void setSwitchTextAppearance(Context context, int i)
    {
        context = context.obtainStyledAttributes(i, android.support.v7.appcompat.R.styleable.TextAppearance);
        ColorStateList colorstatelist = context.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor);
        if (colorstatelist != null)
        {
            mTextColors = colorstatelist;
        } else
        {
            mTextColors = getTextColors();
        }
        i = context.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize, 0);
        if (i != 0 && (float)i != mTextPaint.getTextSize())
        {
            mTextPaint.setTextSize(i);
            requestLayout();
        }
        setSwitchTypefaceByIndex(context.getInt(android.support.v7.appcompat.R.styleable.TextAppearance_android_typeface, -1), context.getInt(android.support.v7.appcompat.R.styleable.TextAppearance_android_textStyle, -1));
        if (context.getBoolean(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps, false))
        {
            mSwitchTransformationMethod = new AllCapsTransformationMethod(getContext());
        } else
        {
            mSwitchTransformationMethod = null;
        }
        context.recycle();
    }

    public void setSwitchTypeface(Typeface typeface)
    {
        if (mTextPaint.getTypeface() != typeface)
        {
            mTextPaint.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setSwitchTypeface(Typeface typeface, int i)
    {
        boolean flag = false;
        if (i > 0)
        {
            float f;
            int j;
            if (typeface == null)
            {
                typeface = Typeface.defaultFromStyle(i);
            } else
            {
                typeface = Typeface.create(typeface, i);
            }
            setSwitchTypeface(typeface);
            if (typeface != null)
            {
                j = typeface.getStyle();
            } else
            {
                j = 0;
            }
            i = ~j & i;
            typeface = mTextPaint;
            if ((i & 1) != 0)
            {
                flag = true;
            }
            typeface.setFakeBoldText(flag);
            typeface = mTextPaint;
            if ((i & 2) != 0)
            {
                f = -0.25F;
            } else
            {
                f = 0.0F;
            }
            typeface.setTextSkewX(f);
            return;
        } else
        {
            mTextPaint.setFakeBoldText(false);
            mTextPaint.setTextSkewX(0.0F);
            setSwitchTypeface(typeface);
            return;
        }
    }

    public void setTextOff(CharSequence charsequence)
    {
        mTextOff = charsequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charsequence)
    {
        mTextOn = charsequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable)
    {
        mThumbDrawable = drawable;
        requestLayout();
    }

    public void setThumbResource(int i)
    {
        setThumbDrawable(mTintManager.getDrawable(i));
    }

    public void setThumbTextPadding(int i)
    {
        mThumbTextPadding = i;
        requestLayout();
    }

    public void setTrackDrawable(Drawable drawable)
    {
        mTrackDrawable = drawable;
        requestLayout();
    }

    public void setTrackResource(int i)
    {
        setTrackDrawable(mTintManager.getDrawable(i));
    }

    public void toggle()
    {
        boolean flag;
        if (!isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setChecked(flag);
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return super.verifyDrawable(drawable) || drawable == mThumbDrawable || drawable == mTrackDrawable;
    }




/*
    static ThumbAnimation access$102(SwitchCompat switchcompat, ThumbAnimation thumbanimation)
    {
        switchcompat.mPositionAnimator = thumbanimation;
        return thumbanimation;
    }

*/

}
