// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.widget.ListViewAutoScrollHelper;
import android.support.v7.internal.widget.ListViewCompat;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            ListPopupWindow

private static class setCacheColorHint extends ListViewCompat
{

    private ViewPropertyAnimatorCompat mClickAnimation;
    private boolean mDrawsInPressedState;
    private boolean mHijackFocus;
    private boolean mListSelectionHidden;
    private ListViewAutoScrollHelper mScrollHelper;

    private void clearPressedItem()
    {
        mDrawsInPressedState = false;
        setPressed(false);
        drawableStateChanged();
        if (mClickAnimation != null)
        {
            mClickAnimation.cancel();
            mClickAnimation = null;
        }
    }

    private void clickPressedItem(View view, int i)
    {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    private void setPressedItem(View view, int i, float f, float f1)
    {
        mDrawsInPressedState = true;
        setPressed(true);
        layoutChildren();
        setSelection(i);
        positionSelectorLikeTouchCompat(i, view, f, f1);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    public boolean hasFocus()
    {
        return mHijackFocus || super.hasFocus();
    }

    public boolean hasWindowFocus()
    {
        return mHijackFocus || super.hasWindowFocus();
    }

    public boolean isFocused()
    {
        return mHijackFocus || super.isFocused();
    }

    public boolean isInTouchMode()
    {
        return mHijackFocus && mListSelectionHidden || super.isInTouchMode();
    }

    public boolean onForwardedEvent(MotionEvent motionevent, int i)
    {
        int j = MotionEventCompat.getActionMasked(motionevent);
        j;
        JVM INSTR tableswitch 1 3: default 36
    //                   1 108
    //                   2 227
    //                   3 100;
           goto _L1 _L2 _L3 _L4
_L3:
        break MISSING_BLOCK_LABEL_227;
_L1:
        boolean flag;
        i = 0;
        flag = true;
_L7:
        if (!flag || i != 0)
        {
            clearPressedItem();
        }
        if (!flag) goto _L6; else goto _L5
_L5:
        if (mScrollHelper == null)
        {
            mScrollHelper = new ListViewAutoScrollHelper(this);
        }
        mScrollHelper.setEnabled(true);
        mScrollHelper.onTouch(this, motionevent);
_L9:
        return flag;
_L4:
        i = 0;
        flag = false;
          goto _L7
_L2:
        flag = false;
_L10:
        int k;
        int l;
        k = motionevent.findPointerIndex(i);
        if (k < 0)
        {
            i = 0;
            flag = false;
        } else
        {
label0:
            {
                i = (int)motionevent.getX(k);
                k = (int)motionevent.getY(k);
                l = pointToPosition(i, k);
                if (l != -1)
                {
                    break label0;
                }
                i = 1;
            }
        }
          goto _L7
        View view = getChildAt(l - getFirstVisiblePosition());
        setPressedItem(view, l, i, k);
        if (j == 1)
        {
            clickPressedItem(view, l);
        }
          goto _L1
_L6:
        if (mScrollHelper == null) goto _L9; else goto _L8
_L8:
        mScrollHelper.setEnabled(false);
        return flag;
        flag = true;
          goto _L10
    }

    protected boolean touchModeDrawsInPressedStateCompat()
    {
        return mDrawsInPressedState || super.touchModeDrawsInPressedStateCompat();
    }


/*
    static boolean access$502( , boolean flag)
    {
        .mListSelectionHidden = flag;
        return flag;
    }

*/

    public mListSelectionHidden(Context context, boolean flag)
    {
        super(context, null, android.support.v7.appcompat.stSelectionHidden);
        mHijackFocus = flag;
        setCacheColorHint(0);
    }
}
