// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.graphics.drawable.DrawableWrapper;
import android.widget.AbsListView;
import android.widget.ListView;
import java.lang.reflect.Field;

public class ListViewCompat extends ListView
{
    private static final class GateKeeperDrawable extends DrawableWrapper
    {

        boolean mEnabled;

        public final void draw(Canvas canvas)
        {
            if (mEnabled)
            {
                super.draw(canvas);
            }
        }

        public final void setHotspot(float f, float f1)
        {
            if (mEnabled)
            {
                super.setHotspot(f, f1);
            }
        }

        public final void setHotspotBounds(int i, int j, int k, int l)
        {
            if (mEnabled)
            {
                super.setHotspotBounds(i, j, k, l);
            }
        }

        public final boolean setState(int ai[])
        {
            if (mEnabled)
            {
                return super.setState(ai);
            } else
            {
                return false;
            }
        }

        public final boolean setVisible(boolean flag, boolean flag1)
        {
            if (mEnabled)
            {
                return super.setVisible(flag, flag1);
            } else
            {
                return false;
            }
        }

        public GateKeeperDrawable(Drawable drawable)
        {
            super(drawable);
            mEnabled = true;
        }
    }


    private static final int STATE_SET_NOTHING[] = {
        0
    };
    public Field mIsChildViewEnabled;
    public int mSelectionBottomPadding;
    public int mSelectionLeftPadding;
    public int mSelectionRightPadding;
    public int mSelectionTopPadding;
    private GateKeeperDrawable mSelector;
    public final Rect mSelectorRect = new Rect();

    public ListViewCompat(Context context, int i)
    {
        super(context, null, 0x7f010134);
        mSelectionLeftPadding = 0;
        mSelectionTopPadding = 0;
        mSelectionRightPadding = 0;
        mSelectionBottomPadding = 0;
        try
        {
            mIsChildViewEnabled = android/widget/AbsListView.getDeclaredField("mIsChildViewEnabled");
            mIsChildViewEnabled.setAccessible(true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
    }

    protected void dispatchDraw(Canvas canvas)
    {
        if (!mSelectorRect.isEmpty())
        {
            Drawable drawable = getSelector();
            if (drawable != null)
            {
                drawable.setBounds(mSelectorRect);
                drawable.draw(canvas);
            }
        }
        super.dispatchDraw(canvas);
    }

    public void drawableStateChanged()
    {
        boolean flag = true;
        super.drawableStateChanged();
        setSelectorEnabled(true);
        Drawable drawable = getSelector();
        if (drawable != null)
        {
            if (!touchModeDrawsInPressedStateCompat() || !isPressed())
            {
                flag = false;
            }
            if (flag)
            {
                drawable.setState(getDrawableState());
            }
        }
    }

    public void setSelector(Drawable drawable)
    {
        Object obj;
        if (drawable != null)
        {
            obj = new GateKeeperDrawable(drawable);
        } else
        {
            obj = null;
        }
        mSelector = ((GateKeeperDrawable) (obj));
        super.setSelector(mSelector);
        obj = new Rect();
        if (drawable != null)
        {
            drawable.getPadding(((Rect) (obj)));
        }
        mSelectionLeftPadding = ((Rect) (obj)).left;
        mSelectionTopPadding = ((Rect) (obj)).top;
        mSelectionRightPadding = ((Rect) (obj)).right;
        mSelectionBottomPadding = ((Rect) (obj)).bottom;
    }

    public final void setSelectorEnabled(boolean flag)
    {
        if (mSelector != null)
        {
            mSelector.mEnabled = flag;
        }
    }

    public boolean touchModeDrawsInPressedStateCompat()
    {
        return false;
    }

}
