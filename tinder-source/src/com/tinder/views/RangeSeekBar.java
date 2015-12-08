// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.ImageView;
import java.math.BigDecimal;

public class RangeSeekBar extends ImageView
{
    private static final class NumberType extends Enum
    {

        private static final NumberType $VALUES[];
        public static final NumberType BIG_DECIMAL;
        public static final NumberType BYTE;
        public static final NumberType DOUBLE;
        public static final NumberType FLOAT;
        public static final NumberType INTEGER;
        public static final NumberType LONG;
        public static final NumberType SHORT;

        public static NumberType fromNumber(Number number)
            throws IllegalArgumentException
        {
            if (number instanceof Long)
            {
                return LONG;
            }
            if (number instanceof Double)
            {
                return DOUBLE;
            }
            if (number instanceof Integer)
            {
                return INTEGER;
            }
            if (number instanceof Float)
            {
                return FLOAT;
            }
            if (number instanceof Short)
            {
                return SHORT;
            }
            if (number instanceof Byte)
            {
                return BYTE;
            }
            if (number instanceof BigDecimal)
            {
                return BIG_DECIMAL;
            } else
            {
                throw new IllegalArgumentException((new StringBuilder("Number class '")).append(number.getClass().getName()).append("' is not supported").toString());
            }
        }

        public static NumberType valueOf(String s)
        {
            return (NumberType)Enum.valueOf(com/tinder/views/RangeSeekBar$NumberType, s);
        }

        public static NumberType[] values()
        {
            return (NumberType[])$VALUES.clone();
        }

        public final Number toNumber(double d)
        {
            static class _cls1
            {

                static final int $SwitchMap$com$tinder$views$RangeSeekBar$NumberType[];

                static 
                {
                    $SwitchMap$com$tinder$views$RangeSeekBar$NumberType = new int[NumberType.values().length];
                    try
                    {
                        $SwitchMap$com$tinder$views$RangeSeekBar$NumberType[NumberType.LONG.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror6) { }
                    try
                    {
                        $SwitchMap$com$tinder$views$RangeSeekBar$NumberType[NumberType.DOUBLE.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        $SwitchMap$com$tinder$views$RangeSeekBar$NumberType[NumberType.INTEGER.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        $SwitchMap$com$tinder$views$RangeSeekBar$NumberType[NumberType.FLOAT.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        $SwitchMap$com$tinder$views$RangeSeekBar$NumberType[NumberType.SHORT.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$com$tinder$views$RangeSeekBar$NumberType[NumberType.BYTE.ordinal()] = 6;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$tinder$views$RangeSeekBar$NumberType[NumberType.BIG_DECIMAL.ordinal()] = 7;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls1..SwitchMap.com.tinder.views.RangeSeekBar.NumberType[ordinal()])
            {
            default:
                throw new InstantiationError((new StringBuilder("can't convert ")).append(this).append(" to a Number object").toString());

            case 1: // '\001'
                return new Long((long)d);

            case 2: // '\002'
                return Double.valueOf(d);

            case 3: // '\003'
                return new Integer((int)d);

            case 4: // '\004'
                return new Float(d);

            case 5: // '\005'
                return new Short((short)(int)d);

            case 6: // '\006'
                return new Byte((byte)(int)d);

            case 7: // '\007'
                return new BigDecimal(d);
            }
        }

        static 
        {
            LONG = new NumberType("LONG", 0);
            DOUBLE = new NumberType("DOUBLE", 1);
            INTEGER = new NumberType("INTEGER", 2);
            FLOAT = new NumberType("FLOAT", 3);
            SHORT = new NumberType("SHORT", 4);
            BYTE = new NumberType("BYTE", 5);
            BIG_DECIMAL = new NumberType("BIG_DECIMAL", 6);
            $VALUES = (new NumberType[] {
                LONG, DOUBLE, INTEGER, FLOAT, SHORT, BYTE, BIG_DECIMAL
            });
        }

        private NumberType(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface OnRangeSeekBarChangeListener
    {

        public abstract void onRangeSeekBarValuesChanged(RangeSeekBar rangeseekbar, Object obj, Object obj1);
    }

    private static final class Thumb extends Enum
    {

        private static final Thumb $VALUES[];
        public static final Thumb MAX;
        public static final Thumb MIN;

        public static Thumb valueOf(String s)
        {
            return (Thumb)Enum.valueOf(com/tinder/views/RangeSeekBar$Thumb, s);
        }

        public static Thumb[] values()
        {
            return (Thumb[])$VALUES.clone();
        }

        static 
        {
            MIN = new Thumb("MIN", 0);
            MAX = new Thumb("MAX", 1);
            $VALUES = (new Thumb[] {
                MIN, MAX
            });
        }

        private Thumb(String s, int i)
        {
            super(s, i);
        }
    }


    public static final int ACTION_POINTER_INDEX_MASK = 65280;
    public static final int ACTION_POINTER_INDEX_SHIFT = 8;
    public static final int ACTION_POINTER_UP = 6;
    public static final int DEFAULT_COLOR = Color.argb(255, 51, 181, 229);
    public static final int INVALID_POINTER_ID = 255;
    private float HALF_HEIGHT_THUMB;
    private float HALF_WIDTH_THUMB;
    private float PADDING;
    private float WIDTH_THUMB;
    private Number mAbsoluteMaxValue;
    private double mAbsoluteMaxValuePrim;
    private Number mAbsoluteMinValue;
    private double mAbsoluteMinValuePrim;
    private int mActivePointerId;
    private Bitmap mBitmapThumbImage;
    private Bitmap mBitmapThumbImagePressed;
    private float mDownMotionX;
    private boolean mIsDragging;
    private float mLineHeight;
    private double mNormalizedMaxValue;
    private double mNormalizedMinValue;
    private NumberType mNumberType;
    private OnRangeSeekBarChangeListener mOnRangeSeekBarChangeListener;
    private final Paint mPaint = new Paint(1);
    private final Paint mPaintThumb = new Paint(1);
    private RectF mRect;
    private int mScaledTouchSlop;
    private boolean mShouldNotifyWhileDragging;
    private int mSliderPrimaryColor;
    private int mSliderSecondaryColor;
    private int mThumbColor;
    private Thumb mThumbPressed;

    public RangeSeekBar(Bitmap bitmap, Bitmap bitmap1, Number number, Number number1, Context context)
        throws IllegalArgumentException
    {
        super(context);
        mActivePointerId = 255;
        mNormalizedMinValue = 0.0D;
        mNormalizedMaxValue = 1.0D;
        mThumbPressed = null;
        mShouldNotifyWhileDragging = false;
        mSliderSecondaryColor = 0xff888888;
        mSliderPrimaryColor = DEFAULT_COLOR;
        mBitmapThumbImage = bitmap;
        mBitmapThumbImagePressed = bitmap1;
        WIDTH_THUMB = mBitmapThumbImage.getWidth();
        HALF_WIDTH_THUMB = WIDTH_THUMB * 0.5F;
        HALF_HEIGHT_THUMB = (float)mBitmapThumbImage.getHeight() * 0.5F;
        mLineHeight = 0.3F * HALF_HEIGHT_THUMB;
        mAbsoluteMinValue = number;
        mAbsoluteMaxValue = number1;
        mAbsoluteMinValuePrim = number.doubleValue();
        mAbsoluteMaxValuePrim = number1.doubleValue();
        mNumberType = NumberType.fromNumber(number);
        setFocusable(true);
        setFocusableInTouchMode(true);
        init();
        mRect = new RectF(PADDING, ((float)getHeight() - mLineHeight) * 0.5F, (float)getWidth() - PADDING, ((float)getHeight() + mLineHeight) * 0.5F);
    }

    private void attemptClaimDrag()
    {
        if (getParent() != null)
        {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    private void drawThumb(float f, boolean flag, Canvas canvas)
    {
        Bitmap bitmap;
        if (flag)
        {
            bitmap = mBitmapThumbImagePressed;
        } else
        {
            bitmap = mBitmapThumbImage;
        }
        canvas.drawBitmap(bitmap, f - HALF_WIDTH_THUMB, 0.5F * (float)getHeight() - HALF_HEIGHT_THUMB, mPaintThumb);
    }

    private Thumb evalPressedThumb(float f)
    {
        Thumb thumb;
        boolean flag;
        boolean flag1;
        thumb = null;
        flag = isInThumbRange(f, mNormalizedMinValue);
        flag1 = isInThumbRange(f, mNormalizedMaxValue);
        if (!flag || !flag1) goto _L2; else goto _L1
_L1:
        if (f / (float)getWidth() <= 0.5F) goto _L4; else goto _L3
_L3:
        thumb = Thumb.MIN;
_L6:
        return thumb;
_L4:
        return Thumb.MAX;
_L2:
        if (flag)
        {
            return Thumb.MIN;
        }
        if (flag1)
        {
            return Thumb.MAX;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void init()
    {
        mScaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    private boolean isInThumbRange(float f, double d)
    {
        return Math.abs(f - normalizedToScreen(d)) <= HALF_WIDTH_THUMB;
    }

    private float normalizedToScreen(double d)
    {
        return (float)((double)PADDING + (double)((float)getWidth() - 2.0F * PADDING) * d);
    }

    private Number normalizedToValue(double d)
    {
        return mNumberType.toNumber(mAbsoluteMinValuePrim + (mAbsoluteMaxValuePrim - mAbsoluteMinValuePrim) * d);
    }

    private void onSecondaryPointerUp(MotionEvent motionevent)
    {
        int i = (motionevent.getAction() & 0xff00) >> 8;
        if (motionevent.getPointerId(i) == mActivePointerId)
        {
            if (i == 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            mDownMotionX = motionevent.getX(i);
            mActivePointerId = motionevent.getPointerId(i);
        }
    }

    private double screenToNormalized(float f)
    {
        int i = getWidth();
        if ((float)i <= PADDING * 2.0F)
        {
            return 0.0D;
        } else
        {
            return Math.min(1.0D, Math.max(0.0D, (f - PADDING) / ((float)i - PADDING * 2.0F)));
        }
    }

    private void trackTouchEvent(MotionEvent motionevent)
    {
        float f = motionevent.getX(motionevent.findPointerIndex(mActivePointerId));
        if (Thumb.MIN.equals(mThumbPressed))
        {
            setNormalizedMinValue(screenToNormalized(f));
        } else
        if (Thumb.MAX.equals(mThumbPressed))
        {
            setmNormalizedMaxValue(screenToNormalized(f));
            return;
        }
    }

    private double valueToNormalized(Number number)
    {
        if (0.0D == mAbsoluteMaxValuePrim - mAbsoluteMinValuePrim)
        {
            return 0.0D;
        } else
        {
            return (number.doubleValue() - mAbsoluteMinValuePrim) / (mAbsoluteMaxValuePrim - mAbsoluteMinValuePrim);
        }
    }

    public Number getAbsoluteMaxValue()
    {
        return mAbsoluteMaxValue;
    }

    public Number getAbsoluteMinValue()
    {
        return mAbsoluteMinValue;
    }

    public Number getSelectedMaxValue()
    {
        return normalizedToValue(mNormalizedMaxValue);
    }

    public Number getSelectedMinValue()
    {
        return normalizedToValue(mNormalizedMinValue);
    }

    public boolean isNotifyWhileDraggingOn()
    {
        return mShouldNotifyWhileDragging;
    }

    protected void onDraw(Canvas canvas)
    {
        this;
        JVM INSTR monitorenter ;
        super.onDraw(canvas);
        mRect.left = PADDING;
        mRect.right = (float)getWidth() - PADDING;
        mRect.top = ((float)getHeight() - mLineHeight) * 0.5F;
        mRect.bottom = ((float)getHeight() + mLineHeight) * 0.5F;
        mPaint.setStyle(android.graphics.Paint.Style.FILL);
        mPaint.setColor(mSliderSecondaryColor);
        mPaint.setAntiAlias(true);
        canvas.drawRect(mRect, mPaint);
        mRect.left = normalizedToScreen(mNormalizedMinValue);
        mRect.right = normalizedToScreen(mNormalizedMaxValue);
        mPaint.setColor(mSliderPrimaryColor);
        canvas.drawRect(mRect, mPaint);
        drawThumb(normalizedToScreen(mNormalizedMinValue), Thumb.MIN.equals(mThumbPressed), canvas);
        drawThumb(normalizedToScreen(mNormalizedMaxValue), Thumb.MAX.equals(mThumbPressed), canvas);
        this;
        JVM INSTR monitorexit ;
        return;
        canvas;
        throw canvas;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        PADDING = (float)getPaddingLeft() + HALF_WIDTH_THUMB;
        super.onLayout(flag, i, j, k, l);
    }

    protected void onMeasure(int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        if (android.view.View.MeasureSpec.getMode(i) == 0)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        i = android.view.View.MeasureSpec.getSize(i);
_L1:
        int l = mBitmapThumbImage.getHeight();
        int k = l;
        if (android.view.View.MeasureSpec.getMode(j) != 0)
        {
            k = Math.min(l, android.view.View.MeasureSpec.getSize(j));
        }
        setMeasuredDimension(i, k);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
        i = 200;
          goto _L1
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (Bundle)parcelable;
        super.onRestoreInstanceState(parcelable.getParcelable("SUPER"));
        mNormalizedMinValue = parcelable.getDouble("MIN");
        mNormalizedMaxValue = parcelable.getDouble("MAX");
    }

    protected Parcelable onSaveInstanceState()
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("SUPER", super.onSaveInstanceState());
        bundle.putDouble("MIN", mNormalizedMinValue);
        bundle.putDouble("MAX", mNormalizedMaxValue);
        return bundle;
    }

    void onStartTrackingTouch()
    {
        mIsDragging = true;
    }

    void onStopTrackingTouch()
    {
        mIsDragging = false;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (!isEnabled())
        {
            return false;
        }
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 6: default 60
    //                   0 62
    //                   1 250
    //                   2 142
    //                   3 364
    //                   4 60
    //                   5 324
    //                   6 356;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7
_L1:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_364;
_L8:
        return true;
_L2:
        mActivePointerId = motionevent.getPointerId(motionevent.getPointerCount() - 1);
        mDownMotionX = motionevent.getX(motionevent.findPointerIndex(mActivePointerId));
        mThumbPressed = evalPressedThumb(mDownMotionX);
        if (mThumbPressed == null)
        {
            return super.onTouchEvent(motionevent);
        }
        setPressed(true);
        invalidate();
        onStartTrackingTouch();
        trackTouchEvent(motionevent);
        attemptClaimDrag();
        continue; /* Loop/switch isn't completed */
_L4:
        if (mThumbPressed != null)
        {
            if (mIsDragging)
            {
                trackTouchEvent(motionevent);
            } else
            if (Math.abs(motionevent.getX(motionevent.findPointerIndex(mActivePointerId)) - mDownMotionX) > (float)mScaledTouchSlop)
            {
                setPressed(true);
                invalidate();
                onStartTrackingTouch();
                trackTouchEvent(motionevent);
                attemptClaimDrag();
            }
            if (mShouldNotifyWhileDragging && mOnRangeSeekBarChangeListener != null)
            {
                mOnRangeSeekBarChangeListener.onRangeSeekBarValuesChanged(this, getSelectedMinValue(), getSelectedMaxValue());
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (mIsDragging)
        {
            trackTouchEvent(motionevent);
            onStopTrackingTouch();
            setPressed(false);
        } else
        {
            onStartTrackingTouch();
            trackTouchEvent(motionevent);
            onStopTrackingTouch();
        }
        mThumbPressed = null;
        invalidate();
        if (mOnRangeSeekBarChangeListener != null)
        {
            mOnRangeSeekBarChangeListener.onRangeSeekBarValuesChanged(this, getSelectedMinValue(), getSelectedMaxValue());
        }
        continue; /* Loop/switch isn't completed */
_L6:
        int i = motionevent.getPointerCount() - 1;
        mDownMotionX = motionevent.getX(i);
        mActivePointerId = motionevent.getPointerId(i);
_L9:
        invalidate();
        if (true) goto _L8; else goto _L7
_L7:
        onSecondaryPointerUp(motionevent);
          goto _L9
        if (mIsDragging)
        {
            onStopTrackingTouch();
            setPressed(false);
        }
          goto _L9
    }

    public void setLineHeight(float f)
    {
        mLineHeight = f;
        mRect = new RectF(PADDING, ((float)getHeight() - mLineHeight) * 0.5F, (float)getWidth() - PADDING, ((float)getHeight() + mLineHeight) * 0.5F);
    }

    public void setNormalizedMinValue(double d)
    {
        mNormalizedMinValue = Math.max(0.0D, Math.min(1.0D, Math.min(d, mNormalizedMaxValue)));
        invalidate();
    }

    public void setNotifyWhileDragging(boolean flag)
    {
        mShouldNotifyWhileDragging = flag;
    }

    public void setOnRangeSeekBarChangeListener(OnRangeSeekBarChangeListener onrangeseekbarchangelistener)
    {
        mOnRangeSeekBarChangeListener = onrangeseekbarchangelistener;
    }

    public void setPadding(int i, int j, int k, int l)
    {
        super.setPadding(i, j, k, l);
        PADDING = HALF_WIDTH_THUMB + (float)i;
    }

    public void setSelectedMaxValue(Number number)
    {
        if (0.0D == mAbsoluteMaxValuePrim - mAbsoluteMinValuePrim)
        {
            setmNormalizedMaxValue(1.0D);
            return;
        } else
        {
            setmNormalizedMaxValue(valueToNormalized(number));
            return;
        }
    }

    public void setSelectedMinValue(Number number)
    {
        if (0.0D == mAbsoluteMaxValuePrim - mAbsoluteMinValuePrim)
        {
            setNormalizedMinValue(0.0D);
            return;
        } else
        {
            setNormalizedMinValue(valueToNormalized(number));
            return;
        }
    }

    public void setSliderPrimaryColor(int i)
    {
        mSliderPrimaryColor = i;
    }

    public void setSliderSecondaryColor(int i)
    {
        mSliderSecondaryColor = i;
    }

    public void setThumbColor(int i)
    {
        mPaintThumb.setColorFilter(new PorterDuffColorFilter(i, android.graphics.PorterDuff.Mode.SRC_IN));
    }

    public void setmNormalizedMaxValue(double d)
    {
        mNormalizedMaxValue = Math.max(0.0D, Math.min(1.0D, Math.max(d, mNormalizedMinValue)));
        invalidate();
    }

}
