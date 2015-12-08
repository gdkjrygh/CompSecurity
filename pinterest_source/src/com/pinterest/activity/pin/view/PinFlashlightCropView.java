// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.pinterest.activity.task.education.event.EducationEvent;
import com.pinterest.activity.task.education.view.EducationPulsarView;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.spring.SpringInterpolator;

// Referenced classes of package com.pinterest.activity.pin.view:
//            PinCloseupImageView

public class PinFlashlightCropView extends PinCloseupImageView
{

    private static final int FRAME_MOVEMENT_HINT_REPEAT_DELAY = 4000;
    private static final float FRAME_MOVEMENT_HINT_SCALE_FACTOR = 1.2F;
    private static final float INITIAL_FRAME_TO_SCROLLVIEW_SIZE_RATIO = 0.7F;
    private EducationPulsarView _bottomLeftPulsar;
    private float _cornerHandleBreadth;
    private float _cornerHandleLength;
    private FlashlightCropperMoveListener _flashlightCropperMoveListener;
    private AnimatorSet _frameMovementAnimatorSet;
    private Runnable _frameMovementHintRunnable;
    private RectF _frameRect;
    private boolean _hasTransitionedFrame;
    private RectF _imageRect;
    private boolean _isCropEnabled;
    private boolean _isInFirstExperience;
    private float _lastX;
    private float _lastY;
    private float _minFrameSize;
    private int _overlayColor;
    private Paint _paintFrame;
    private Paint _paintOverlay;
    private Paint _paintTranslucent;
    private int _parentScrollViewHeight;
    private AnimatorSet _reverseFrameMovementAnimatorSet;
    private ScaleGestureDetector _scaleGestureDetector;
    private boolean _shouldAllowMoveAction;
    private boolean _shouldDismissEducation;
    private boolean _showCropWindow;
    private RectF _tempFrameRect;
    private EducationPulsarView _topRightPulsar;
    private TouchArea _touchArea;
    private int _touchPadding;
    private int _transluscentColor;
    private int _viewHeight;
    private int _viewWidth;

    public PinFlashlightCropView(Context context)
    {
        super(context);
        _touchArea = TouchArea.OUT_OF_BOUNDS;
        _isCropEnabled = true;
        _overlayColor = 0x66000000;
        _transluscentColor = 0xc000000;
        _viewWidth = 0;
        _viewHeight = 0;
        _showCropWindow = false;
        _shouldAllowMoveAction = true;
        _isInFirstExperience = false;
        _shouldDismissEducation = false;
        initializeLayout();
    }

    public PinFlashlightCropView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        _touchArea = TouchArea.OUT_OF_BOUNDS;
        _isCropEnabled = true;
        _overlayColor = 0x66000000;
        _transluscentColor = 0xc000000;
        _viewWidth = 0;
        _viewHeight = 0;
        _showCropWindow = false;
        _shouldAllowMoveAction = true;
        _isInFirstExperience = false;
        _shouldDismissEducation = false;
        initializeLayout();
    }

    private void animateFrameRectTransition()
    {
        _hasTransitionedFrame = true;
        ImageView imageview = getFlashlightButton();
        if (imageview != null)
        {
            RectF rectf = new RectF();
            RectF rectf1 = new RectF(_frameRect);
            int i = imageview.getHeight() - imageview.getPaddingTop() * 2;
            int j = imageview.getWidth() - imageview.getPaddingLeft() * 2;
            int k = (imageview.getTop() + getPaddingTop() + i) / 2;
            int l = (imageview.getLeft() + getPaddingLeft() + j) / 2;
            float f2 = rectf1.width() / rectf1.height();
            float f1 = i;
            float f = j;
            if (rectf1.width() > rectf1.height())
            {
                f1 = f / f2;
                f2 = rectf1.height() / f1;
            } else
            {
                f = f1 * f2;
                f2 = rectf1.width() / f;
            }
            setRectDimensions(rectf, f, f1, l, k);
            startFrameTransition(imageview, rectf1, f2, f, f1);
        }
    }

    private void checkMoveBounds()
    {
        float f = _frameRect.left - _imageRect.left;
        if (f < 0.0F)
        {
            RectF rectf = _frameRect;
            rectf.left = rectf.left - f;
            rectf = _frameRect;
            rectf.right = rectf.right - f;
        }
        f = _frameRect.right - _imageRect.right;
        if (f > 0.0F)
        {
            RectF rectf1 = _frameRect;
            rectf1.left = rectf1.left - f;
            rectf1 = _frameRect;
            rectf1.right = rectf1.right - f;
        }
        f = _frameRect.top - _imageRect.top;
        if (f < 0.0F)
        {
            RectF rectf2 = _frameRect;
            rectf2.top = rectf2.top - f;
            rectf2 = _frameRect;
            rectf2.bottom = rectf2.bottom - f;
        }
        f = _frameRect.bottom - _imageRect.bottom;
        if (f > 0.0F)
        {
            RectF rectf3 = _frameRect;
            rectf3.top = rectf3.top - f;
            rectf3 = _frameRect;
            rectf3.bottom = rectf3.bottom - f;
        }
    }

    private void checkScaleBounds()
    {
        float f = _frameRect.left - _imageRect.left;
        float f1 = _frameRect.right - _imageRect.right;
        float f2 = _frameRect.top - _imageRect.top;
        float f3 = _frameRect.bottom - _imageRect.bottom;
        if (f < 0.0F)
        {
            RectF rectf = _frameRect;
            rectf.left = rectf.left - f;
        }
        if (f1 > 0.0F)
        {
            RectF rectf1 = _frameRect;
            rectf1.right = rectf1.right - f1;
        }
        if (f2 < 0.0F)
        {
            RectF rectf2 = _frameRect;
            rectf2.top = rectf2.top - f2;
        }
        if (f3 > 0.0F)
        {
            RectF rectf3 = _frameRect;
            rectf3.bottom = rectf3.bottom - f3;
        }
    }

    private void checkTouchArea(float f, float f1)
    {
        if (isInsideCorner(f, f1, _frameRect.left, _frameRect.top))
        {
            _touchArea = TouchArea.LEFT_TOP;
            return;
        }
        if (isInsideCorner(f, f1, _frameRect.right, _frameRect.top))
        {
            _touchArea = TouchArea.RIGHT_TOP;
            return;
        }
        if (isInsideCorner(f, f1, _frameRect.left, _frameRect.bottom))
        {
            _touchArea = TouchArea.LEFT_BOTTOM;
            return;
        }
        if (isInsideCorner(f, f1, _frameRect.right, _frameRect.bottom))
        {
            _touchArea = TouchArea.RIGHT_BOTTOM;
            return;
        }
        if (isInsideFrame(f, f1))
        {
            _touchArea = TouchArea.INSIDE;
            return;
        } else
        {
            _touchArea = TouchArea.OUT_OF_BOUNDS;
            return;
        }
    }

    private void drawCornerHandles(Canvas canvas)
    {
        float f = _frameRect.left;
        float f1 = _frameRect.top;
        float f2 = _frameRect.left;
        float f3 = _cornerHandleLength;
        float f4 = _frameRect.top;
        canvas.drawRect(f, f1, f3 + f2, _cornerHandleBreadth + f4, _paintFrame);
        f = _frameRect.left;
        f1 = _frameRect.top;
        f2 = _cornerHandleBreadth;
        f3 = _frameRect.left;
        f4 = _cornerHandleBreadth;
        float f5 = _frameRect.top;
        canvas.drawRect(f, f2 + f1, f4 + f3, _cornerHandleLength + f5, _paintFrame);
        f = _frameRect.right;
        f1 = _cornerHandleLength;
        f2 = _frameRect.top;
        f3 = _frameRect.right;
        f4 = _frameRect.top;
        canvas.drawRect(f - f1, f2, f3, _cornerHandleBreadth + f4, _paintFrame);
        f = _frameRect.right;
        f1 = _cornerHandleBreadth;
        f2 = _frameRect.top;
        f3 = _cornerHandleBreadth;
        f4 = _frameRect.right;
        f5 = _frameRect.top;
        canvas.drawRect(f - f1, f3 + f2, f4, _cornerHandleLength + f5, _paintFrame);
        f = _frameRect.left;
        f1 = _frameRect.bottom;
        f2 = _cornerHandleBreadth;
        f3 = _frameRect.left;
        canvas.drawRect(f, f1 - f2, _cornerHandleLength + f3, _frameRect.bottom, _paintFrame);
        f = _frameRect.left;
        f1 = _frameRect.bottom;
        f2 = _cornerHandleLength;
        f3 = _frameRect.left;
        canvas.drawRect(f, f1 - f2, _cornerHandleBreadth + f3, _frameRect.bottom - _cornerHandleBreadth, _paintFrame);
        canvas.drawRect(_frameRect.right - _cornerHandleLength, _frameRect.bottom - _cornerHandleBreadth, _frameRect.right, _frameRect.bottom, _paintFrame);
        canvas.drawRect(_frameRect.right - _cornerHandleBreadth, _frameRect.bottom - _cornerHandleLength, _frameRect.right, _frameRect.bottom - _cornerHandleBreadth, _paintFrame);
    }

    private void drawOverlay(Canvas canvas)
    {
        canvas.drawRect(_imageRect.left, _imageRect.top, _imageRect.right, _frameRect.top, _paintOverlay);
        canvas.drawRect(_imageRect.left, _frameRect.bottom, _imageRect.right, _imageRect.bottom, _paintOverlay);
        canvas.drawRect(_imageRect.left, _frameRect.top, _frameRect.left, _frameRect.bottom, _paintOverlay);
        canvas.drawRect(_frameRect.right, _frameRect.top, _imageRect.right, _frameRect.bottom, _paintOverlay);
    }

    private ObjectAnimator getAnimatorForPulsar(View view, float f, int i)
    {
        float f1 = view.getX();
        float f2 = view.getY();
        float f3 = i;
        float f4 = f / 2.0F;
        float f5 = i;
        f /= 2.0F;
        return ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[] {
            PropertyValuesHolder.ofFloat("x", new float[] {
                f1, f3 * f4 + f1
            }), PropertyValuesHolder.ofFloat("y", new float[] {
                f2, f2 - f5 * f
            })
        });
    }

    private AnimatorListenerAdapter getAnimatorListener(final AnimatorSet animatorSet, final RectF originalFrameRect, final float pulsarSize)
    {
        return new _cls4();
    }

    private ValueAnimator getFrameMovementHintAnimator(final RectF originalFrameRect, float f, float f1)
    {
        ValueAnimator valueanimator = ValueAnimator.ofFloat(new float[] {
            f, f1
        });
        valueanimator.addUpdateListener(new _cls5());
        return valueanimator;
    }

    private void initCropFrame()
    {
        int i = (int)((float)_viewWidth * 0.15F);
        int j = (int)((float)_parentScrollViewHeight * 0.15F);
        int k = (int)((float)_viewWidth * 0.85F);
        int l = (int)((float)_parentScrollViewHeight * 0.85F);
        _frameRect = new RectF(i, j, k, l);
        _tempFrameRect = new RectF(_frameRect);
        _imageRect = new RectF(0.0F, 0.0F, _viewWidth, _viewHeight);
        if (!_hasTransitionedFrame)
        {
            animateFrameRectTransition();
        }
        if (_flashlightCropperMoveListener != null)
        {
            _flashlightCropperMoveListener.onCropperMoveEnd(_tempFrameRect, _viewWidth, _viewHeight);
        }
    }

    private void initializeLayout()
    {
        super.setShouldAllowLongClick(false);
        _touchPadding = (int)Resources.dimension(0x7f0a012b);
        _minFrameSize = Resources.dimension(0x7f0a012c);
        _hasTransitionedFrame = false;
        _paintFrame = new Paint();
        _paintOverlay = new Paint();
        _paintTranslucent = new Paint();
        _paintOverlay.setColor(_overlayColor);
        _paintOverlay.setStyle(android.graphics.Paint.Style.FILL);
        _paintFrame.setStyle(android.graphics.Paint.Style.FILL);
        _paintFrame.setColor(-1);
        _paintTranslucent.setStyle(android.graphics.Paint.Style.FILL);
        _paintTranslucent.setColor(_transluscentColor);
        _cornerHandleLength = Resources.dimension(0x7f0a012a);
        _cornerHandleBreadth = Resources.dimension(0x7f0a0129);
        _scaleGestureDetector = new ScaleGestureDetector(getContext(), new ScaleListener(null));
        disableQuickScale();
    }

    private boolean isFrameValid(RectF rectf)
    {
        return rectf.left < rectf.right && rectf.top < rectf.bottom;
    }

    private boolean isHeightTooSmall(RectF rectf)
    {
        return rectf.height() < _minFrameSize;
    }

    private boolean isInsideCorner(float f, float f1, float f2, float f3)
    {
        f -= f2;
        f1 -= f3;
        return Math.pow(_touchPadding, 2D) >= (double)(f * f + f1 * f1);
    }

    private boolean isInsideFrame(float f, float f1)
    {
        return _frameRect.contains(f, f1);
    }

    private boolean isWidthTooSmall(RectF rectf)
    {
        return rectf.width() < _minFrameSize;
    }

    private void moveFrame(float f, float f1)
    {
        _frameRect.offset(f, f1);
        checkMoveBounds();
    }

    private void moveLeftBottomCorner(float f, float f1)
    {
        RectF rectf = _frameRect;
        rectf.left = rectf.left + f;
        rectf = _frameRect;
        rectf.bottom = rectf.bottom + f1;
        if (isWidthTooSmall(_frameRect))
        {
            f = _minFrameSize;
            f1 = _frameRect.width();
            RectF rectf1 = _frameRect;
            rectf1.left = rectf1.left - (f - f1);
        }
        if (isHeightTooSmall(_frameRect))
        {
            f = _minFrameSize;
            f1 = _frameRect.height();
            RectF rectf2 = _frameRect;
            rectf2.bottom = (f - f1) + rectf2.bottom;
        }
        checkScaleBounds();
    }

    private void moveLeftTopCorner(float f, float f1)
    {
        RectF rectf = _frameRect;
        rectf.left = rectf.left + f;
        rectf = _frameRect;
        rectf.top = rectf.top + f1;
        if (isWidthTooSmall(_frameRect))
        {
            f = _minFrameSize;
            f1 = _frameRect.width();
            RectF rectf1 = _frameRect;
            rectf1.left = rectf1.left - (f - f1);
        }
        if (isHeightTooSmall(_frameRect))
        {
            f = _minFrameSize;
            f1 = _frameRect.height();
            RectF rectf2 = _frameRect;
            rectf2.top = rectf2.top - (f - f1);
        }
        checkScaleBounds();
    }

    private void moveRightBottomCorner(float f, float f1)
    {
        RectF rectf = _frameRect;
        rectf.right = rectf.right + f;
        rectf = _frameRect;
        rectf.bottom = rectf.bottom + f1;
        if (isWidthTooSmall(_frameRect))
        {
            f = _minFrameSize;
            f1 = _frameRect.width();
            RectF rectf1 = _frameRect;
            rectf1.right = (f - f1) + rectf1.right;
        }
        if (isHeightTooSmall(_frameRect))
        {
            f = _minFrameSize;
            f1 = _frameRect.height();
            RectF rectf2 = _frameRect;
            rectf2.bottom = (f - f1) + rectf2.bottom;
        }
        checkScaleBounds();
    }

    private void moveRightTopCorner(float f, float f1)
    {
        RectF rectf = _frameRect;
        rectf.right = rectf.right + f;
        rectf = _frameRect;
        rectf.top = rectf.top + f1;
        if (isWidthTooSmall(_frameRect))
        {
            f = _minFrameSize;
            f1 = _frameRect.width();
            RectF rectf1 = _frameRect;
            rectf1.right = (f - f1) + rectf1.right;
        }
        if (isHeightTooSmall(_frameRect))
        {
            f = _minFrameSize;
            f1 = _frameRect.height();
            RectF rectf2 = _frameRect;
            rectf2.top = rectf2.top - (f - f1);
        }
        checkScaleBounds();
    }

    private void onCancel()
    {
        _touchArea = TouchArea.OUT_OF_BOUNDS;
        invalidate();
    }

    private void onDown(MotionEvent motionevent)
    {
        if (_flashlightCropperMoveListener != null)
        {
            _flashlightCropperMoveListener.onCropperMoveStart(_frameRect, _viewWidth, _viewHeight);
        }
        invalidate();
        _lastX = motionevent.getX();
        _lastY = motionevent.getY();
        checkTouchArea(motionevent.getX(), motionevent.getY());
    }

    private void onMove(MotionEvent motionevent)
    {
        float f;
        float f1;
        f = motionevent.getX() - _lastX;
        f1 = motionevent.getY() - _lastY;
        if (_touchArea == TouchArea.OUT_OF_BOUNDS) goto _L2; else goto _L1
_L1:
        _cls8..SwitchMap.com.pinterest.activity.pin.view.PinFlashlightCropView.TouchArea[_touchArea.ordinal()];
        JVM INSTR tableswitch 1 5: default 76
    //                   1 97
    //                   2 106
    //                   3 115
    //                   4 124
    //                   5 133;
           goto _L2 _L3 _L4 _L5 _L6 _L7
_L2:
        invalidate();
        _lastX = motionevent.getX();
        _lastY = motionevent.getY();
        return;
_L3:
        moveFrame(f, f1);
        continue; /* Loop/switch isn't completed */
_L4:
        moveLeftTopCorner(f, f1);
        continue; /* Loop/switch isn't completed */
_L5:
        moveRightTopCorner(f, f1);
        continue; /* Loop/switch isn't completed */
_L6:
        moveLeftBottomCorner(f, f1);
        continue; /* Loop/switch isn't completed */
_L7:
        moveRightBottomCorner(f, f1);
        if (true) goto _L2; else goto _L8
_L8:
    }

    private void onUp()
    {
        if (_flashlightCropperMoveListener != null)
        {
            _flashlightCropperMoveListener.onCropperMoveEnd(_frameRect, _viewWidth, _viewHeight);
        }
        if (_shouldDismissEducation)
        {
            Events.post(new EducationEvent(com.pinterest.activity.task.education.event.EducationEvent.Type.DISMISS));
        }
        _touchArea = TouchArea.OUT_OF_BOUNDS;
        invalidate();
    }

    private void setRectDimensions(RectF rectf, float f, float f1, float f2, float f3)
    {
        rectf.top = f3 - f1 / 2.0F;
        rectf.left = f2 - f / 2.0F;
        rectf.right = f / 2.0F + f2;
        rectf.bottom = f1 / 2.0F + f3;
    }

    private void showFrameMovementHint(float f)
    {
        RectF rectf = new RectF(_frameRect);
        _frameMovementAnimatorSet = new AnimatorSet();
        _frameMovementAnimatorSet.setInterpolator(new LinearInterpolator());
        _frameMovementAnimatorSet.setDuration(Constants.ANIM_SPEED_SLOW);
        ValueAnimator valueanimator = getFrameMovementHintAnimator(rectf, 1.0F, 1.2F);
        ObjectAnimator objectanimator2 = new ObjectAnimator();
        ObjectAnimator objectanimator3 = new ObjectAnimator();
        ObjectAnimator objectanimator1 = objectanimator3;
        ObjectAnimator objectanimator = objectanimator2;
        if (_topRightPulsar != null)
        {
            objectanimator1 = objectanimator3;
            objectanimator = objectanimator2;
            if (_bottomLeftPulsar != null)
            {
                objectanimator = getAnimatorForPulsar(_topRightPulsar, f, 1);
                objectanimator1 = getAnimatorForPulsar(_bottomLeftPulsar, f, -1);
            }
        }
        _frameMovementAnimatorSet.playTogether(new Animator[] {
            valueanimator, objectanimator, objectanimator1
        });
        _frameMovementAnimatorSet.addListener(getAnimatorListener(_frameMovementAnimatorSet, rectf, f));
        _frameMovementAnimatorSet.start();
    }

    private void startFrameTransition(ImageView imageview, RectF rectf, float f, final float finalStartWidth, final float finalStartHeight)
    {
        float f1 = imageview.getTop() + imageview.getPaddingTop();
        float f2 = imageview.getLeft() + imageview.getPaddingLeft();
        float f3 = rectf.top;
        rectf = ValueAnimator.ofFloat(new float[] {
            f2, rectf.left
        });
        rectf.addUpdateListener(new _cls1());
        ValueAnimator valueanimator = ValueAnimator.ofFloat(new float[] {
            f1, f3
        });
        valueanimator.addUpdateListener(new _cls2());
        ValueAnimator valueanimator1 = ValueAnimator.ofFloat(new float[] {
            1.0F, f
        });
        valueanimator1.addUpdateListener(new _cls3());
        ViewHelper.setVisibility(imageview, 4);
        imageview = new AnimatorSet();
        imageview.playTogether(new Animator[] {
            rectf, valueanimator, valueanimator1
        });
        imageview.setDuration(Constants.ANIM_SPEED_NORMAL);
        imageview.setInterpolator(new SpringInterpolator(0.8F, 0.4F));
        imageview.start();
    }

    public void disableQuickScale()
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            _scaleGestureDetector.setQuickScaleEnabled(false);
        }
    }

    protected void dispatchDraw(Canvas canvas)
    {
        super.dispatchDraw(canvas);
        if (_showCropWindow)
        {
            drawOverlay(canvas);
            canvas.drawRect(_frameRect.left, _frameRect.top, _frameRect.right, _frameRect.bottom, _paintTranslucent);
            drawCornerHandles(canvas);
        }
    }

    public RectF getCropperRect()
    {
        return new RectF(_frameRect);
    }

    public int getViewHeight()
    {
        return _viewHeight;
    }

    public int getViewWidth()
    {
        return _viewWidth;
    }

    public void hidePulsarsIfShown()
    {
        _isInFirstExperience = false;
        if (_frameMovementHintRunnable != null)
        {
            removeCallbacks(_frameMovementHintRunnable);
        }
        if (_frameMovementAnimatorSet != null && _frameMovementAnimatorSet.isRunning())
        {
            _frameMovementAnimatorSet.cancel();
        }
        if (_reverseFrameMovementAnimatorSet != null && _reverseFrameMovementAnimatorSet.isRunning())
        {
            _reverseFrameMovementAnimatorSet.cancel();
        }
        if (_topRightPulsar != null && _bottomLeftPulsar != null)
        {
            _topRightPulsar.hidePulsar();
            _bottomLeftPulsar.hidePulsar();
        }
    }

    public boolean isInsideFrameOrCorners(MotionEvent motionevent)
    {
        float f = motionevent.getX();
        float f1 = motionevent.getY();
        return isInsideFrame(f, f1) || isInsideCorner(f, f1, _frameRect.left, _frameRect.top) || isInsideCorner(f, f1, _frameRect.right, _frameRect.top) || isInsideCorner(f, f1, _frameRect.left, _frameRect.bottom) || isInsideCorner(f, f1, _frameRect.right, _frameRect.bottom);
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        final int oldHeight = getHeight();
        final int oldWidth = getWidth();
        super.onConfigurationChanged(configuration);
        post(new _cls7());
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return _showCropWindow;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        _viewWidth = k - i - getPaddingLeft() - getPaddingRight();
        _viewHeight = l - j - getPaddingTop() - getPaddingBottom();
        if (_showCropWindow)
        {
            initCropFrame();
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (_showCropWindow && !_isCropEnabled)
        {
            return false;
        }
        if (!_showCropWindow)
        {
            return super.onTouchEvent(motionevent);
        }
        if (isInsideFrameOrCorners(motionevent) || _scaleGestureDetector.isInProgress() || _touchArea != TouchArea.OUT_OF_BOUNDS || _isInFirstExperience) goto _L2; else goto _L1
_L1:
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 1 1: default 92
    //                   1 94;
           goto _L3 _L4
_L3:
        return true;
_L4:
        float f = _frameRect.centerX();
        float f1 = _frameRect.centerY();
        moveFrame(motionevent.getX() - f, motionevent.getY() - f1);
        invalidate();
        if (_flashlightCropperMoveListener != null)
        {
            _flashlightCropperMoveListener.onCropperMoveEnd(_frameRect, _viewWidth, _viewHeight);
        }
        if (true) goto _L3; else goto _L2
_L2:
        if (isInsideFrameOrCorners(motionevent) || _scaleGestureDetector.isInProgress())
        {
            _scaleGestureDetector.onTouchEvent(motionevent);
        }
        switch (motionevent.getAction() & 0xff)
        {
        case 4: // '\004'
        default:
            return false;

        case 0: // '\0'
            _shouldAllowMoveAction = true;
            onDown(motionevent);
            return true;

        case 2: // '\002'
            if (!_scaleGestureDetector.isInProgress() && _shouldAllowMoveAction && !_isInFirstExperience)
            {
                onMove(motionevent);
                if (_touchArea != TouchArea.OUT_OF_BOUNDS)
                {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            }
            return true;

        case 3: // '\003'
            if (!_isInFirstExperience)
            {
                getParent().requestDisallowInterceptTouchEvent(false);
                onCancel();
            }
            return true;

        case 1: // '\001'
            getParent().requestDisallowInterceptTouchEvent(false);
            onUp();
            return true;

        case 5: // '\005'
            if (_isInFirstExperience)
            {
                hidePulsarsIfShown();
                _shouldDismissEducation = true;
            }
            return true;

        case 6: // '\006'
            _shouldAllowMoveAction = false;
            return true;
        }
    }

    public void setFlashlightCropperMoveListener(FlashlightCropperMoveListener flashlightcroppermovelistener)
    {
        _flashlightCropperMoveListener = flashlightcroppermovelistener;
    }

    public void setParentScrollViewHeight(int i)
    {
        _parentScrollViewHeight = i;
    }

    public void setShowCropWindow(boolean flag)
    {
        _showCropWindow = flag;
        requestLayout();
    }

    public void startFirstFlashlightExperience()
    {
        _isInFirstExperience = true;
        _topRightPulsar = new EducationPulsarView(getContext());
        _bottomLeftPulsar = new EducationPulsarView(getContext());
        final int pulsarSize = (int)Resources.dimension(0x7f0a01ae);
        float f = _frameRect.left;
        float f1 = _frameRect.width();
        float f2 = pulsarSize / 2;
        float f3 = _frameRect.top;
        float f4 = _frameRect.height();
        float f5 = pulsarSize / 2;
        _topRightPulsar.setX((f + f1 * 0.65F) - f2);
        _topRightPulsar.setY((f3 + f4 * 0.35F) - f5);
        f = _frameRect.left;
        f1 = _frameRect.width();
        f2 = pulsarSize / 2;
        f3 = _frameRect.top;
        f4 = _frameRect.height();
        f5 = pulsarSize / 2;
        _bottomLeftPulsar.setX((f + f1 * 0.35F) - f2);
        _bottomLeftPulsar.setY((f3 + f4 * 0.65F) - f5);
        addView(_topRightPulsar);
        addView(_bottomLeftPulsar);
        _topRightPulsar.setVisibility(0);
        _bottomLeftPulsar.setVisibility(0);
        _topRightPulsar.animatePulsar();
        _bottomLeftPulsar.animatePulsar();
        _frameMovementHintRunnable = new _cls6();
        postDelayed(_frameMovementHintRunnable, 1333L);
    }









/*
    static AnimatorSet access$202(PinFlashlightCropView pinflashlightcropview, AnimatorSet animatorset)
    {
        pinflashlightcropview._reverseFrameMovementAnimatorSet = animatorset;
        return animatorset;
    }

*/








    private class TouchArea extends Enum
    {

        private static final TouchArea $VALUES[];
        public static final TouchArea INSIDE;
        public static final TouchArea LEFT_BOTTOM;
        public static final TouchArea LEFT_TOP;
        public static final TouchArea OUT_OF_BOUNDS;
        public static final TouchArea RIGHT_BOTTOM;
        public static final TouchArea RIGHT_TOP;

        public static TouchArea valueOf(String s)
        {
            return (TouchArea)Enum.valueOf(com/pinterest/activity/pin/view/PinFlashlightCropView$TouchArea, s);
        }

        public static TouchArea[] values()
        {
            return (TouchArea[])$VALUES.clone();
        }

        static 
        {
            OUT_OF_BOUNDS = new TouchArea("OUT_OF_BOUNDS", 0);
            INSIDE = new TouchArea("INSIDE", 1);
            LEFT_TOP = new TouchArea("LEFT_TOP", 2);
            RIGHT_TOP = new TouchArea("RIGHT_TOP", 3);
            LEFT_BOTTOM = new TouchArea("LEFT_BOTTOM", 4);
            RIGHT_BOTTOM = new TouchArea("RIGHT_BOTTOM", 5);
            $VALUES = (new TouchArea[] {
                OUT_OF_BOUNDS, INSIDE, LEFT_TOP, RIGHT_TOP, LEFT_BOTTOM, RIGHT_BOTTOM
            });
        }

        private TouchArea(String s, int i)
        {
            super(s, i);
        }
    }


    private class _cls4 extends AnimatorListenerAdapter
    {

        private boolean _canceled;
        final PinFlashlightCropView this$0;
        final AnimatorSet val$animatorSet;
        final RectF val$originalFrameRect;
        final float val$pulsarSize;

        public void onAnimationCancel(Animator animator)
        {
            _canceled = true;
        }

        public void onAnimationEnd(Animator animator)
        {
            if (!_canceled)
            {
                _canceled = true;
                _reverseFrameMovementAnimatorSet = new AnimatorSet();
                _reverseFrameMovementAnimatorSet.setInterpolator(new LinearInterpolator());
                _reverseFrameMovementAnimatorSet.setDuration(Constants.ANIM_SPEED_SLOW);
                ValueAnimator valueanimator = getFrameMovementHintAnimator(originalFrameRect, 1.2F, 1.0F);
                ObjectAnimator objectanimator1 = new ObjectAnimator();
                ObjectAnimator objectanimator2 = new ObjectAnimator();
                ObjectAnimator objectanimator = objectanimator2;
                animator = objectanimator1;
                if (_topRightPulsar != null)
                {
                    objectanimator = objectanimator2;
                    animator = objectanimator1;
                    if (_bottomLeftPulsar != null)
                    {
                        animator = getAnimatorForPulsar(_topRightPulsar, pulsarSize, -1);
                        objectanimator = getAnimatorForPulsar(_bottomLeftPulsar, pulsarSize, 1);
                    }
                }
                _reverseFrameMovementAnimatorSet.playTogether(new Animator[] {
                    valueanimator, animator, objectanimator
                });
                _reverseFrameMovementAnimatorSet.start();
                class _cls1 extends AnimatorListenerAdapter
                {

                    private boolean _reverseCanceled;
                    final _cls4 this$1;

                    public void onAnimationCancel(Animator animator1)
                    {
                        _reverseCanceled = true;
                    }

                    public void onAnimationEnd(Animator animator1)
                    {
                        _reverseFrameMovementAnimatorSet.removeAllListeners();
                        if (_reverseCanceled)
                        {
                            removeCallbacks(_frameMovementHintRunnable);
                            return;
                        } else
                        {
                            postDelayed(_frameMovementHintRunnable, 4000L);
                            return;
                        }
                    }

                    public void onAnimationStart(Animator animator1)
                    {
                        _reverseCanceled = false;
                    }

                _cls1()
                {
                    this$1 = _cls4.this;
                    super();
                }
                }

                _reverseFrameMovementAnimatorSet.addListener(new _cls1());
            } else
            {
                removeCallbacks(_frameMovementHintRunnable);
            }
            animatorSet.removeAllListeners();
        }

        public void onAnimationStart(Animator animator)
        {
            _canceled = false;
        }

        _cls4()
        {
            this$0 = PinFlashlightCropView.this;
            originalFrameRect = rectf;
            pulsarSize = f;
            animatorSet = animatorset;
            super();
        }
    }


    private class _cls5
        implements android.animation.ValueAnimator.AnimatorUpdateListener
    {

        final PinFlashlightCropView this$0;
        final RectF val$originalFrameRect;

        public void onAnimationUpdate(ValueAnimator valueanimator)
        {
            float f = ((Float)valueanimator.getAnimatedValue()).floatValue();
            float f1 = originalFrameRect.height();
            float f2 = originalFrameRect.width();
            float f3 = _frameRect.centerX();
            float f4 = _frameRect.centerY();
            setRectDimensions(_frameRect, f2 * f, f1 * f, f3, f4);
            invalidate();
        }

        _cls5()
        {
            this$0 = PinFlashlightCropView.this;
            originalFrameRect = rectf;
            super();
        }
    }


    private class FlashlightCropperMoveListener
    {

        public abstract void onCropperMoveEnd(RectF rectf, int i, int j);

        public abstract void onCropperMoveStart(RectF rectf, int i, int j);
    }


    private class ScaleListener extends android.view.ScaleGestureDetector.SimpleOnScaleGestureListener
    {

        final PinFlashlightCropView this$0;

        public boolean onScale(ScaleGestureDetector scalegesturedetector)
        {
            float f1 = 1.0F;
            float f2 = scalegesturedetector.getFocusX();
            float f3 = scalegesturedetector.getFocusY();
            float f;
            if (scalegesturedetector.getPreviousSpanX() > 0.0F)
            {
                f = scalegesturedetector.getCurrentSpanX() / scalegesturedetector.getPreviousSpanX();
            } else
            {
                f = 1.0F;
            }
            if (scalegesturedetector.getPreviousSpanY() > 0.0F)
            {
                f1 = scalegesturedetector.getCurrentSpanY() / scalegesturedetector.getPreviousSpanY();
            }
            f *= _frameRect.width();
            f1 *= _frameRect.height();
            _tempFrameRect.top = Math.max(_imageRect.top, f3 - f1 / 2.0F);
            _tempFrameRect.left = Math.max(_imageRect.left, f2 - f / 2.0F);
            _tempFrameRect.right = Math.min(_imageRect.right, f / 2.0F + f2);
            _tempFrameRect.bottom = Math.min(_imageRect.bottom, f1 / 2.0F + f3);
            if (!isWidthTooSmall(_tempFrameRect) && !isHeightTooSmall(_tempFrameRect) && isFrameValid(_tempFrameRect))
            {
                _frameRect.set(_tempFrameRect);
                invalidate();
            }
            return true;
        }

        public boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
        {
            return true;
        }

        private ScaleListener()
        {
            this$0 = PinFlashlightCropView.this;
            super();
        }

        ScaleListener(_cls1 _pcls1)
        {
            this();
        }
    }


    private class _cls8
    {

        static final int $SwitchMap$com$pinterest$activity$pin$view$PinFlashlightCropView$TouchArea[];

        static 
        {
            $SwitchMap$com$pinterest$activity$pin$view$PinFlashlightCropView$TouchArea = new int[TouchArea.values().length];
            try
            {
                $SwitchMap$com$pinterest$activity$pin$view$PinFlashlightCropView$TouchArea[TouchArea.INSIDE.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$pinterest$activity$pin$view$PinFlashlightCropView$TouchArea[TouchArea.LEFT_TOP.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$pinterest$activity$pin$view$PinFlashlightCropView$TouchArea[TouchArea.RIGHT_TOP.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$pinterest$activity$pin$view$PinFlashlightCropView$TouchArea[TouchArea.LEFT_BOTTOM.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$pinterest$activity$pin$view$PinFlashlightCropView$TouchArea[TouchArea.RIGHT_BOTTOM.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$pinterest$activity$pin$view$PinFlashlightCropView$TouchArea[TouchArea.OUT_OF_BOUNDS.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls1
        implements android.animation.ValueAnimator.AnimatorUpdateListener
    {

        final PinFlashlightCropView this$0;

        public void onAnimationUpdate(ValueAnimator valueanimator)
        {
            float f = ((Float)valueanimator.getAnimatedValue()).floatValue();
            _frameRect.left = f;
        }

        _cls1()
        {
            this$0 = PinFlashlightCropView.this;
            super();
        }
    }


    private class _cls2
        implements android.animation.ValueAnimator.AnimatorUpdateListener
    {

        final PinFlashlightCropView this$0;

        public void onAnimationUpdate(ValueAnimator valueanimator)
        {
            float f = ((Float)valueanimator.getAnimatedValue()).floatValue();
            _frameRect.top = f;
        }

        _cls2()
        {
            this$0 = PinFlashlightCropView.this;
            super();
        }
    }


    private class _cls3
        implements android.animation.ValueAnimator.AnimatorUpdateListener
    {

        final PinFlashlightCropView this$0;
        final float val$finalStartHeight;
        final float val$finalStartWidth;

        public void onAnimationUpdate(ValueAnimator valueanimator)
        {
            float f = ((Float)valueanimator.getAnimatedValue()).floatValue();
            float f1 = finalStartHeight;
            float f2 = finalStartWidth;
            _frameRect.right = f * f2 + _frameRect.left;
            _frameRect.bottom = f1 * f + _frameRect.top;
            invalidate();
        }

        _cls3()
        {
            this$0 = PinFlashlightCropView.this;
            finalStartHeight = f;
            finalStartWidth = f1;
            super();
        }
    }


    private class _cls7
        implements Runnable
    {

        final PinFlashlightCropView this$0;
        final int val$oldHeight;
        final int val$oldWidth;

        public void run()
        {
            int i = getHeight();
            int j = getWidth();
            if (i != oldHeight || j != oldWidth)
            {
                Events.post(new PinCloseupImageViewResizeEvent(_galleryItem.getPin()));
            }
        }

        _cls7()
        {
            this$0 = PinFlashlightCropView.this;
            oldHeight = i;
            oldWidth = j;
            super();
        }

        private class PinCloseupImageViewResizeEvent
        {

            private Pin _pin;

            public final Pin getPin()
            {
                return _pin;
            }

            public PinCloseupImageViewResizeEvent(Pin pin)
            {
                _pin = pin;
            }
        }

    }


    private class _cls6
        implements Runnable
    {

        final PinFlashlightCropView this$0;
        final int val$pulsarSize;

        public void run()
        {
            showFrameMovementHint(pulsarSize);
        }

        _cls6()
        {
            this$0 = PinFlashlightCropView.this;
            pulsarSize = i;
            super();
        }
    }

}
