// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.NinePatchDrawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Colors;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.log.PLog;
import com.pinterest.ui.grid.dialog.AdditionalPinFeedbackDialog;
import com.pinterest.ui.grid.pin.PinMultiLineTextDrawable;

public class PinGridCellHidden extends View
{

    protected static final int PADDING_ITEM = (int)Resources.dimension(0x7f0a0191);
    protected static final int PADDING_SIDE = (int)Resources.dimension(0x7f0a0195);
    protected static final String STR_SUBTITLE = Resources.string(0x7f070601);
    protected static final String STR_THANKS = Resources.string(0x7f07058a);
    protected static final String STR_TITLE = Resources.string(0x7f070596);
    private Rect _cellPadding;
    private GestureDetector _gestureDetector;
    private int _measuredHeight;
    private int _measuredWidth;
    private boolean _overrideClicks;
    private Pin _pin;
    private NinePatchDrawable _pinMask;
    private PinMultiLineTextDrawable _subtitleDrawable;
    private PinMultiLineTextDrawable _titleDrawable;
    android.view.GestureDetector.SimpleOnGestureListener onGestureListener;

    public PinGridCellHidden(Context context)
    {
        this(context, null);
    }

    public PinGridCellHidden(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PinGridCellHidden(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _cellPadding = new Rect();
        _measuredHeight = 0;
        _measuredWidth = 0;
        _overrideClicks = false;
        _titleDrawable = new PinMultiLineTextDrawable();
        _subtitleDrawable = new PinMultiLineTextDrawable();
        onGestureListener = new _cls1();
        init();
    }

    private void drawOverlay(Canvas canvas)
    {
        _pinMask.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        _pinMask.draw(canvas);
    }

    private void drawSubtitle(Canvas canvas)
    {
        _subtitleDrawable.draw(canvas);
    }

    private void drawTitle(Canvas canvas)
    {
        _titleDrawable.draw(canvas);
    }

    private void init()
    {
        _pinMask = (NinePatchDrawable)Resources.drawable(0x7f0200be);
        _pinMask.getPadding(_cellPadding);
        _gestureDetector = new GestureDetector(getContext(), onGestureListener);
    }

    private void showPinFeedbackDialog()
    {
        Events.post(new DialogEvent(AdditionalPinFeedbackDialog.newInstance(_pin)));
    }

    private void unTouchAll()
    {
        _titleDrawable.setPressed(false);
        _subtitleDrawable.setPressed(false);
        invalidate();
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        boolean flag = super.dispatchTouchEvent(motionevent);
        if (motionevent.getAction() == 3)
        {
            onGestureListener.onScroll(null, null, 0.0F, 0.0F);
        }
        return flag | _gestureDetector.onTouchEvent(motionevent);
    }

    protected void onDraw(Canvas canvas)
    {
        if (_pin != null)
        {
            drawTitle(canvas);
            if (ModelHelper.isValid(_pin.getHiddenState()) && _pin.getHiddenState().intValue() == 1)
            {
                drawSubtitle(canvas);
            }
            drawOverlay(canvas);
        }
        super.onDraw(canvas);
    }

    protected void onMeasure(int i, int j)
    {
        _measuredWidth = android.view.View.MeasureSpec.getSize(i);
        _measuredHeight = android.view.View.MeasureSpec.getSize(j);
        PLog.info((new StringBuilder("PinGridCellHidden.onMeasure: height")).append(_measuredHeight).toString(), new Object[0]);
        if (_measuredWidth < 0)
        {
            _measuredWidth = 100;
        }
        if (_pin != null)
        {
            _measuredHeight = 0;
            if (ModelHelper.isValid(_pin.getHiddenState()) && _pin.getHiddenState().intValue() == 1)
            {
                _titleDrawable.setText(STR_TITLE);
            } else
            {
                _titleDrawable.setText(STR_THANKS);
            }
            _titleDrawable.setY(_measuredHeight);
            _titleDrawable.setWidth(_measuredWidth);
            _titleDrawable.setTextSize(Resources.dimension(0x7f0a01d9));
            _titleDrawable.setPadding(PADDING_SIDE, PADDING_ITEM, PADDING_SIDE, PADDING_ITEM);
            _titleDrawable.setColor(Colors.TEXT_DARK);
            _titleDrawable.measure();
            _measuredHeight = _measuredHeight + _titleDrawable.getHeight();
            if (ModelHelper.isValid(_pin.getHiddenState()) && _pin.getHiddenState().intValue() == 1)
            {
                _subtitleDrawable.setY(_measuredHeight);
                _subtitleDrawable.setWidth(_measuredWidth);
                _subtitleDrawable.setTextSize(Resources.dimension(0x7f0a01d9));
                _subtitleDrawable.setPadding(PADDING_SIDE, 0, PADDING_SIDE, PADDING_ITEM);
                _subtitleDrawable.setColor(Colors.TEXT_DARK);
                _subtitleDrawable.setTypeface(Typeface.DEFAULT_BOLD);
                _subtitleDrawable.setText(STR_SUBTITLE);
                _subtitleDrawable.measure();
                _measuredHeight = _measuredHeight + _subtitleDrawable.getHeight();
            }
            _measuredHeight = _measuredHeight + _cellPadding.height();
        }
        super.onMeasure(i, j);
        setMeasuredDimension(_measuredWidth, _measuredHeight);
    }

    public void setOverrideClicks(boolean flag)
    {
        _overrideClicks = flag;
    }

    public void setPin(Pin pin, boolean flag)
    {
        if (pin == null)
        {
            return;
        }
        boolean flag1;
        if (_pin != null && _pin.getUid().equals(pin.getUid()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        _pin = pin;
        if (!flag1)
        {
            _titleDrawable.prepareForReuse();
            _subtitleDrawable.prepareForReuse();
        }
        unTouchAll();
        requestLayout();
    }

    public void setPressed(boolean flag)
    {
        super.setPressed(flag);
        if (!flag)
        {
            unTouchAll();
        }
    }








    private class _cls1 extends android.view.GestureDetector.SimpleOnGestureListener
    {

        public boolean isDown;
        public final int minTouch = ViewConfiguration.getPressedStateDuration();
        final PinGridCellHidden this$0;
        public final int touchDelay = ViewConfiguration.getTapTimeout();

        public boolean onDown(MotionEvent motionevent)
        {
            resolveTouch(motionevent, true, false);
            return true;
        }

        public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
        {
            resolveTouch(null, false, true);
            return true;
        }

        public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
        {
            resolveTouch(null, false, true);
            return true;
        }

        public boolean onSingleTapUp(MotionEvent motionevent)
        {
            int i = (int)(motionevent.getDownTime() - motionevent.getEventTime());
            class _cls1
                implements Runnable
            {

                final _cls1 this$1;

                public void run()
                {
                    unTouchAll();
                }

                _cls1()
                {
                    this$1 = _cls1.this;
                    super();
                }
            }

            if (i < touchDelay)
            {
                i = touchDelay - i;
            } else
            {
                i = minTouch;
            }
            resolveTouch(motionevent, true, true);
            postDelayed(new _cls1(), i);
            if (_titleDrawable.isPressed())
            {
                if (_pin.shouldShowPromoterInGrid())
                {
                    Pinalytics.a(ElementType.PIN_FEEDBACK_BUTTON_STATE_REASON_PROMOTED, ComponentType.PIN_FEEDBACK_PIN_CELL_HIDDEN_NO_REASON);
                } else
                {
                    Pinalytics.a(ElementType.PIN_FEEDBACK_BUTTON_STATE_REASON_PFY, ComponentType.PIN_FEEDBACK_PIN_CELL_HIDDEN_NO_REASON);
                }
                if (!_overrideClicks && _pin.getHiddenState().intValue() != 2)
                {
                    showPinFeedbackDialog();
                }
                playSoundEffect(0);
            }
            return true;
        }

        public void resolveTouch(MotionEvent motionevent, boolean flag, boolean flag1)
        {
            unTouchAll();
            if (isEnabled() && (isDown != flag || flag1) && motionevent != null && (_titleDrawable.getBounds().contains((int)motionevent.getX(), (int)motionevent.getY()) || _subtitleDrawable.getBounds().contains((int)motionevent.getX(), (int)motionevent.getY())))
            {
                _titleDrawable.setPressed(true);
                _subtitleDrawable.setPressed(true);
            }
            isDown = flag;
            if (flag1)
            {
                invalidate();
                return;
            } else
            {
                postInvalidateDelayed(touchDelay);
                return;
            }
        }

        _cls1()
        {
            this$0 = PinGridCellHidden.this;
            super();
            isDown = false;
        }
    }

}
