// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v7.app.ActionBar;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

// Referenced classes of package android.support.v7.internal.widget:
//            ActionBarContainer, ActionBarView

public class ActionBarOverlayLayout extends FrameLayout
{

    static final int mActionBarSizeAttr[];
    private ActionBar mActionBar;
    private View mActionBarBottom;
    private int mActionBarHeight;
    private View mActionBarTop;
    private ActionBarView mActionView;
    private ActionBarContainer mContainerView;
    private View mContent;
    private final Rect mZeroRect;

    public ActionBarOverlayLayout(Context context)
    {
        super(context);
        mZeroRect = new Rect(0, 0, 0, 0);
        init(context);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mZeroRect = new Rect(0, 0, 0, 0);
        init(context);
    }

    private boolean applyInsets(View view, Rect rect, boolean flag, boolean flag1, boolean flag2, boolean flag3)
    {
        boolean flag5 = false;
        view = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
        boolean flag4 = flag5;
        if (flag)
        {
            flag4 = flag5;
            if (((android.widget.FrameLayout.LayoutParams) (view)).leftMargin != rect.left)
            {
                flag4 = true;
                view.leftMargin = rect.left;
            }
        }
        flag = flag4;
        if (flag1)
        {
            flag = flag4;
            if (((android.widget.FrameLayout.LayoutParams) (view)).topMargin != rect.top)
            {
                flag = true;
                view.topMargin = rect.top;
            }
        }
        flag1 = flag;
        if (flag3)
        {
            flag1 = flag;
            if (((android.widget.FrameLayout.LayoutParams) (view)).rightMargin != rect.right)
            {
                flag1 = true;
                view.rightMargin = rect.right;
            }
        }
        flag = flag1;
        if (flag2)
        {
            flag = flag1;
            if (((android.widget.FrameLayout.LayoutParams) (view)).bottomMargin != rect.bottom)
            {
                flag = true;
                view.bottomMargin = rect.bottom;
            }
        }
        return flag;
    }

    private void init(Context context)
    {
        context = getContext().getTheme().obtainStyledAttributes(mActionBarSizeAttr);
        mActionBarHeight = context.getDimensionPixelSize(0, 0);
        context.recycle();
    }

    void pullChildren()
    {
        if (mContent == null)
        {
            mContent = findViewById(android.support.v7.appcompat.R.id.action_bar_activity_content);
            if (mContent == null)
            {
                mContent = findViewById(0x1020002);
            }
            mActionBarTop = findViewById(android.support.v7.appcompat.R.id.top_action_bar);
            mContainerView = (ActionBarContainer)findViewById(android.support.v7.appcompat.R.id.action_bar_container);
            mActionView = (ActionBarView)findViewById(android.support.v7.appcompat.R.id.action_bar);
            mActionBarBottom = findViewById(android.support.v7.appcompat.R.id.split_action_bar);
        }
    }

    public void setActionBar(ActionBar actionbar)
    {
        mActionBar = actionbar;
    }

    static 
    {
        mActionBarSizeAttr = (new int[] {
            android.support.v7.appcompat.R.attr.actionBarSize
        });
    }
}
