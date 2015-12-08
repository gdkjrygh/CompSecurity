// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.widget.ListViewAutoScrollHelper;
import android.support.v7.internal.widget.ListViewCompat;
import android.view.MotionEvent;
import android.view.View;
import java.lang.reflect.Field;

// Referenced classes of package android.support.v7.widget:
//            ListPopupWindow

private static final class setCacheColorHint extends ListViewCompat
{

    private boolean mDrawsInPressedState;
    private boolean mHijackFocus;
    private boolean mListSelectionHidden;
    private ListViewAutoScrollHelper mScrollHelper;

    public final boolean hasFocus()
    {
        return mHijackFocus || super.hasFocus();
    }

    public final boolean hasWindowFocus()
    {
        return mHijackFocus || super.hasWindowFocus();
    }

    public final boolean isFocused()
    {
        return mHijackFocus || super.isFocused();
    }

    public final boolean isInTouchMode()
    {
        return mHijackFocus && mListSelectionHidden || super.isInTouchMode();
    }

    public final boolean onForwardedEvent(MotionEvent motionevent, int i)
    {
        boolean flag;
        int j;
        boolean flag1;
        boolean flag2;
        flag1 = true;
        flag2 = true;
        flag = false;
        j = MotionEventCompat.getActionMasked(motionevent);
        j;
        JVM INSTR tableswitch 1 3: default 44
    //                   1 129
    //                   2 132
    //                   3 120;
           goto _L1 _L2 _L3 _L4
_L1:
        flag1 = flag2;
        i = ((flag) ? 1 : 0);
_L10:
        if (!flag1 || i != 0)
        {
            mDrawsInPressedState = false;
            setPressed(false);
            drawableStateChanged();
        }
        if (!flag1) goto _L6; else goto _L5
_L5:
        if (mScrollHelper == null)
        {
            mScrollHelper = new ListViewAutoScrollHelper(this);
        }
        mScrollHelper.setEnabled(true);
        mScrollHelper.onTouch(this, motionevent);
_L8:
        return flag1;
_L4:
        flag1 = false;
        i = ((flag) ? 1 : 0);
        continue; /* Loop/switch isn't completed */
_L2:
        flag1 = false;
_L3:
        int k = motionevent.findPointerIndex(i);
        if (k < 0)
        {
            flag1 = false;
            i = ((flag) ? 1 : 0);
            continue; /* Loop/switch isn't completed */
        }
        i = (int)motionevent.getX(k);
        int l = (int)motionevent.getY(k);
        k = pointToPosition(i, l);
        if (k == -1)
        {
            i = 1;
            continue; /* Loop/switch isn't completed */
        }
        View view = getChildAt(k - getFirstVisiblePosition());
        float f = i;
        float f1 = l;
        mDrawsInPressedState = true;
        setPressed(true);
        layoutChildren();
        setSelection(k);
        Drawable drawable = getSelector();
        float f2;
        float f3;
        Object obj;
        boolean flag3;
        if (drawable != null && k != -1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            drawable.setVisible(false, false);
        }
        obj = super.mSelectorRect;
        ((Rect) (obj)).set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        obj.left = ((Rect) (obj)).left - super.mSelectionLeftPadding;
        obj.top = ((Rect) (obj)).top - super.mSelectionTopPadding;
        obj.right = ((Rect) (obj)).right + super.mSelectionRightPadding;
        obj.bottom = ((Rect) (obj)).bottom + super.mSelectionBottomPadding;
        flag1 = super.mIsChildViewEnabled.getBoolean(this);
        if (view.isEnabled() == flag1)
        {
            break MISSING_BLOCK_LABEL_408;
        }
        obj = super.mIsChildViewEnabled;
        if (!flag1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((Field) (obj)).set(this, Boolean.valueOf(flag1));
        if (k != -1)
        {
            try
            {
                refreshDrawableState();
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                illegalaccessexception.printStackTrace();
            }
        }
        if (i != 0)
        {
            obj = super.mSelectorRect;
            f2 = ((Rect) (obj)).exactCenterX();
            f3 = ((Rect) (obj)).exactCenterY();
            if (getVisibility() == 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            drawable.setVisible(flag1, false);
            DrawableCompat.setHotspot(drawable, f2, f3);
        }
        drawable = getSelector();
        if (drawable != null && k != -1)
        {
            DrawableCompat.setHotspot(drawable, f, f1);
        }
        setSelectorEnabled(false);
        refreshDrawableState();
        flag3 = true;
        i = ((flag) ? 1 : 0);
        flag1 = flag3;
        if (j == 1)
        {
            performItemClick(view, k, getItemIdAtPosition(k));
            i = ((flag) ? 1 : 0);
            flag1 = flag3;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (mScrollHelper == null) goto _L8; else goto _L7
_L7:
        mScrollHelper.setEnabled(false);
        return flag1;
        if (true) goto _L10; else goto _L9
_L9:
    }

    protected final boolean touchModeDrawsInPressedStateCompat()
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
        super(context, 0x7f010134);
        mHijackFocus = flag;
        setCacheColorHint(0);
    }
}
