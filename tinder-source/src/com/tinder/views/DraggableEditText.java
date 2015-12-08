// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.tinder.utils.CustomFont;
import com.tinder.utils.ad;

// Referenced classes of package com.tinder.views:
//            PermissiveEditText

public class DraggableEditText extends PermissiveEditText
{

    private RectF mBoundsRect;
    private GestureDetector mGestureDetector;
    private boolean mIsDraggable;
    private float mLastY;
    private int mPositionAboveKeyboard;

    public DraggableEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        ad.a(this, context, CustomFont.a(context, attributeset));
        init(context);
    }

    private void scrollVertical(int i)
    {
        if ((float)(getMeasuredHeight() + i) <= mBoundsRect.bottom && (float)i >= mBoundsRect.top)
        {
            setY(i);
            mLastY = i;
        }
    }

    public void animateTo(float f, float f1)
    {
        ObjectAnimator.ofFloat(this, "translationY", new float[] {
            f, f1
        }).start();
    }

    public void init(Context context)
    {
        mGestureDetector = new GestureDetector(getContext(), new android.view.GestureDetector.OnGestureListener() {

            final DraggableEditText this$0;

            public boolean onDown(MotionEvent motionevent)
            {
                return true;
            }

            public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
            {
                return false;
            }

            public void onLongPress(MotionEvent motionevent)
            {
            }

            public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
            {
                scrollVertical(Math.round(motionevent1.getRawY() + f) - getHeight() / 2);
                return true;
            }

            public void onShowPress(MotionEvent motionevent)
            {
            }

            public boolean onSingleTapUp(MotionEvent motionevent)
            {
                callOnClick();
                return true;
            }

            
            {
                this$0 = DraggableEditText.this;
                super();
            }
        });
    }

    public boolean isDraggable()
    {
        return mIsDraggable;
    }

    public boolean knowsKeyboardLocation()
    {
        return mPositionAboveKeyboard != 0;
    }

    public void moveAboveKeyboard(boolean flag)
    {
        int i = 0;
        measure(0, 0);
        if (!knowsKeyboardLocation())
        {
            Rect rect = new Rect();
            getRootView().getWindowVisibleDisplayFrame(rect);
            if (rect.bottom != ad.b(getContext()))
            {
                i = rect.bottom;
            }
            mPositionAboveKeyboard = i;
        }
        if (knowsKeyboardLocation())
        {
            float f = mPositionAboveKeyboard - getMeasuredHeight();
            if (flag)
            {
                animate().y(f).setInterpolator(new DecelerateInterpolator()).setDuration(300L).start();
            } else
            {
                setY(f);
            }
        }
        (new StringBuilder("pok ")).append(mPositionAboveKeyboard);
    }

    public boolean onAllowedTouchEvent(MotionEvent motionevent)
    {
        if (mIsDraggable)
        {
            return mGestureDetector.onTouchEvent(motionevent);
        }
        if (mIsEditable)
        {
            return super.onTouchEvent(motionevent);
        } else
        {
            return true;
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorinfo)
    {
        InputConnection inputconnection = super.onCreateInputConnection(editorinfo);
        editorinfo.imeOptions = editorinfo.imeOptions & 0xbfffffff;
        return inputconnection;
    }

    public boolean onKeyPreIme(int i, KeyEvent keyevent)
    {
        onEditorAction(i);
        return super.onKeyPreIme(i, keyevent);
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        moveAboveKeyboard(false);
    }

    public void resetToLastPosition()
    {
        if (mLastY != 0.0F)
        {
            measure(0, 0);
            animate().y(mLastY).setInterpolator(new DecelerateInterpolator()).setDuration(400L).start();
        }
    }

    public void setDragBounds(RectF rectf)
    {
        mBoundsRect = rectf;
    }

    public void setDraggable(boolean flag)
    {
        mIsDraggable = flag;
    }

}
