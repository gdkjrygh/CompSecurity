// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListPopupWindow;
import android.widget.ListView;
import org.chromium.ui.base.ViewAndroidDelegate;

public class DropdownPopupWindow extends ListPopupWindow
{

    ListAdapter mAdapter;
    private float mAnchorHeight;
    private final View mAnchorView;
    private float mAnchorWidth;
    private float mAnchorX;
    private float mAnchorY;
    private final Context mContext;
    private android.view.View.OnLayoutChangeListener mLayoutChangeListener;
    private android.widget.PopupWindow.OnDismissListener mOnDismissListener;
    private final ViewAndroidDelegate mViewAndroidDelegate;

    public DropdownPopupWindow(Context context, ViewAndroidDelegate viewandroiddelegate)
    {
        super(context, null, 0, R.style.DropdownPopupWindow);
        mContext = context;
        mViewAndroidDelegate = viewandroiddelegate;
        mAnchorView = mViewAndroidDelegate.acquireAnchorView();
        mAnchorView.setId(R.id.dropdown_popup_window);
        mAnchorView.setTag(this);
        mLayoutChangeListener = new android.view.View.OnLayoutChangeListener() {

            final DropdownPopupWindow this$0;

            public void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
                    int k1, int l1)
            {
                if (view == mAnchorView)
                {
                    show();
                }
            }

            
            {
                this$0 = DropdownPopupWindow.this;
                super();
            }
        };
        mAnchorView.addOnLayoutChangeListener(mLayoutChangeListener);
        super.setOnDismissListener(new android.widget.PopupWindow.OnDismissListener() {

            final DropdownPopupWindow this$0;

            public void onDismiss()
            {
                if (mOnDismissListener != null)
                {
                    mOnDismissListener.onDismiss();
                }
                mAnchorView.removeOnLayoutChangeListener(mLayoutChangeListener);
                mAnchorView.setTag(null);
                mViewAndroidDelegate.releaseAnchorView(mAnchorView);
            }

            
            {
                this$0 = DropdownPopupWindow.this;
                super();
            }
        });
        setAnchorView(mAnchorView);
    }

    private int measureContentWidth()
    {
        int j = 0;
        View view = null;
        if (mAdapter == null)
        {
            return 0;
        }
        int k = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int l = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        for (int i = 0; i < mAdapter.getCount(); i++)
        {
            view = mAdapter.getView(i, view, null);
            view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
            view.measure(k, l);
            j = Math.max(j, view.getMeasuredWidth());
        }

        return j;
    }

    public void setAdapter(ListAdapter listadapter)
    {
        mAdapter = listadapter;
        super.setAdapter(listadapter);
    }

    public void setAnchorRect(float f, float f1, float f2, float f3)
    {
        mAnchorWidth = f2;
        mAnchorHeight = f3;
        mAnchorX = f;
        mAnchorY = f1;
        if (mAnchorView != null)
        {
            mViewAndroidDelegate.setAnchorViewPosition(mAnchorView, mAnchorX, mAnchorY, mAnchorWidth, mAnchorHeight);
        }
    }

    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener ondismisslistener)
    {
        mOnDismissListener = ondismisslistener;
    }

    public void show()
    {
        setInputMethodMode(1);
        int i = measureContentWidth();
        if ((float)i / mContext.getResources().getDisplayMetrics().density > mAnchorWidth)
        {
            setContentWidth(i);
            Rect rect = new Rect();
            mAnchorView.getWindowVisibleDisplayFrame(rect);
            if (getWidth() > rect.width())
            {
                setWidth(rect.width());
            }
        } else
        {
            setWidth(-2);
        }
        mViewAndroidDelegate.setAnchorViewPosition(mAnchorView, mAnchorX, mAnchorY, mAnchorWidth, mAnchorHeight);
        super.show();
        getListView().setDividerHeight(0);
    }




}
