// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.input;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;

public class PastePopupMenu
    implements android.view.View.OnClickListener
{
    public static interface PastePopupMenuDelegate
    {

        public abstract void paste();
    }


    private final PopupWindow mContainer;
    private final Context mContext;
    private final PastePopupMenuDelegate mDelegate;
    private final int mLineOffsetY;
    private final View mParent;
    private View mPasteView;
    private final int mPasteViewLayout;
    private int mPositionX;
    private int mPositionY;
    private int mRawPositionX;
    private int mRawPositionY;
    private int mStatusBarHeight;
    private final int mWidthOffsetX;

    public PastePopupMenu(View view, PastePopupMenuDelegate pastepopupmenudelegate)
    {
        mParent = view;
        mDelegate = pastepopupmenudelegate;
        mContext = view.getContext();
        mContainer = new PopupWindow(mContext, null, 0x10102c8);
        mContainer.setSplitTouchEnabled(true);
        mContainer.setClippingEnabled(false);
        mContainer.setAnimationStyle(0);
        mContainer.setWidth(-2);
        mContainer.setHeight(-2);
        mPasteView = null;
        view = mContext.getTheme().obtainStyledAttributes(new int[] {
            0x1010314
        });
        mPasteViewLayout = view.getResourceId(view.getIndex(0), 0);
        view.recycle();
        mLineOffsetY = (int)TypedValue.applyDimension(1, 5F, mContext.getResources().getDisplayMetrics());
        mWidthOffsetX = (int)TypedValue.applyDimension(1, 30F, mContext.getResources().getDisplayMetrics());
        int i = mContext.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (i > 0)
        {
            mStatusBarHeight = mContext.getResources().getDimensionPixelSize(i);
        }
    }

    private void paste()
    {
        mDelegate.paste();
    }

    private void positionAt(int i, int j)
    {
        if (mRawPositionX == i && mRawPositionY == j && isShowing())
        {
            return;
        }
        mRawPositionX = i;
        mRawPositionY = j;
        View view = mContainer.getContentView();
        int k = view.getMeasuredWidth();
        int l = view.getMeasuredHeight();
        mPositionX = (int)((float)i - (float)k / 2.0F);
        mPositionY = j - l - mLineOffsetY;
        int ai[] = new int[2];
        mParent.getLocationInWindow(ai);
        ai[0] = ai[0] + mPositionX;
        ai[1] = ai[1] + mPositionY;
        j = 0;
        if (mParent.getSystemUiVisibility() == 0)
        {
            j = mStatusBarHeight;
        }
        l = mContext.getResources().getDisplayMetrics().widthPixels;
        if (ai[1] < j)
        {
            View view1 = mContainer.getContentView();
            j = view1.getMeasuredWidth();
            k = view1.getMeasuredHeight();
            ai[1] = ai[1] + k;
            ai[1] = ai[1] + mLineOffsetY;
            k = mWidthOffsetX / 2;
            if (i + j < l)
            {
                ai[0] = ai[0] + (j / 2 + k);
            } else
            {
                ai[0] = ai[0] - (j / 2 + k);
            }
        } else
        {
            ai[0] = Math.max(0, ai[0]);
            ai[0] = Math.min(l - k, ai[0]);
        }
        if (!isShowing())
        {
            mContainer.showAtLocation(mParent, 0, ai[0], ai[1]);
            return;
        } else
        {
            mContainer.update(ai[0], ai[1], -1, -1);
            return;
        }
    }

    private void updateContent()
    {
        if (mPasteView == null)
        {
            int i = mPasteViewLayout;
            LayoutInflater layoutinflater = (LayoutInflater)mContext.getSystemService("layout_inflater");
            if (layoutinflater != null)
            {
                mPasteView = layoutinflater.inflate(i, null);
            }
            if (mPasteView == null)
            {
                throw new IllegalArgumentException("Unable to inflate TextEdit paste window");
            }
            i = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            mPasteView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
            mPasteView.measure(i, i);
            mPasteView.setOnClickListener(this);
        }
        mContainer.setContentView(mPasteView);
    }

    public void hide()
    {
        mContainer.dismiss();
    }

    public boolean isShowing()
    {
        return mContainer.isShowing();
    }

    public void onClick(View view)
    {
        paste();
        hide();
    }

    public void showAt(int i, int j)
    {
        updateContent();
        positionAt(i, j);
    }
}
