// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            PopupWindowCompat

public class IcsListPopupWindow
{
    private static class DropDownListView extends ListView
    {

        private boolean mHijackFocus;
        private boolean mListSelectionHidden;

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


        public DropDownListView(Context context, boolean flag)
        {
            super(context, null, com.actionbarsherlock.R.attr.dropDownListViewStyle);
            mHijackFocus = flag;
            setCacheColorHint(0);
        }
    }

    private class ListSelectorHider
        implements Runnable
    {

        final IcsListPopupWindow this$0;

        public void run()
        {
            clearListSelection();
        }

        private ListSelectorHider()
        {
            this$0 = IcsListPopupWindow.this;
            super();
        }

        ListSelectorHider(ListSelectorHider listselectorhider)
        {
            this();
        }
    }

    private class PopupDataSetObserver extends DataSetObserver
    {

        final IcsListPopupWindow this$0;

        public void onChanged()
        {
            if (isShowing())
            {
                show();
            }
        }

        public void onInvalidated()
        {
            dismiss();
        }

        private PopupDataSetObserver()
        {
            this$0 = IcsListPopupWindow.this;
            super();
        }

        PopupDataSetObserver(PopupDataSetObserver popupdatasetobserver)
        {
            this();
        }
    }

    private class PopupScrollListener
        implements android.widget.AbsListView.OnScrollListener
    {

        final IcsListPopupWindow this$0;

        public void onScroll(AbsListView abslistview, int i, int j, int k)
        {
        }

        public void onScrollStateChanged(AbsListView abslistview, int i)
        {
            if (i == 1 && !isInputMethodNotNeeded() && mPopup.getContentView() != null)
            {
                mHandler.removeCallbacks(mResizePopupRunnable);
                mResizePopupRunnable.run();
            }
        }

        private PopupScrollListener()
        {
            this$0 = IcsListPopupWindow.this;
            super();
        }

        PopupScrollListener(PopupScrollListener popupscrolllistener)
        {
            this();
        }
    }

    private class PopupTouchInterceptor
        implements android.view.View.OnTouchListener
    {

        final IcsListPopupWindow this$0;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            int i;
            int j;
            int k;
            i = motionevent.getAction();
            j = (int)motionevent.getX();
            k = (int)motionevent.getY();
            if (i != 0 || mPopup == null || !mPopup.isShowing() || j < 0 || j >= mPopup.getWidth() || k < 0 || k >= mPopup.getHeight()) goto _L2; else goto _L1
_L1:
            mHandler.postDelayed(mResizePopupRunnable, 250L);
_L4:
            return false;
_L2:
            if (i == 1)
            {
                mHandler.removeCallbacks(mResizePopupRunnable);
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        private PopupTouchInterceptor()
        {
            this$0 = IcsListPopupWindow.this;
            super();
        }

        PopupTouchInterceptor(PopupTouchInterceptor popuptouchinterceptor)
        {
            this();
        }
    }

    private class ResizePopupRunnable
        implements Runnable
    {

        final IcsListPopupWindow this$0;

        public void run()
        {
            if (mDropDownList != null && mDropDownList.getCount() > mDropDownList.getChildCount() && mDropDownList.getChildCount() <= mListItemExpandMaximum)
            {
                mPopup.setInputMethodMode(2);
                show();
            }
        }

        private ResizePopupRunnable()
        {
            this$0 = IcsListPopupWindow.this;
            super();
        }

        ResizePopupRunnable(ResizePopupRunnable resizepopuprunnable)
        {
            this();
        }
    }


    private static final int EXPAND_LIST_TIMEOUT = 250;
    public static final int POSITION_PROMPT_ABOVE = 0;
    public static final int POSITION_PROMPT_BELOW = 1;
    private ListAdapter mAdapter;
    private Context mContext;
    private View mDropDownAnchorView;
    private int mDropDownHeight;
    private int mDropDownHorizontalOffset;
    private DropDownListView mDropDownList;
    private Drawable mDropDownListHighlight;
    private int mDropDownVerticalOffset;
    private boolean mDropDownVerticalOffsetSet;
    private int mDropDownWidth;
    private Handler mHandler;
    private final ListSelectorHider mHideSelector;
    private android.widget.AdapterView.OnItemClickListener mItemClickListener;
    private android.widget.AdapterView.OnItemSelectedListener mItemSelectedListener;
    private int mListItemExpandMaximum;
    private boolean mModal;
    private DataSetObserver mObserver;
    private final PopupWindowCompat mPopup;
    private int mPromptPosition;
    private View mPromptView;
    private final ResizePopupRunnable mResizePopupRunnable;
    private final PopupScrollListener mScrollListener;
    private Rect mTempRect;
    private final PopupTouchInterceptor mTouchInterceptor;

    public IcsListPopupWindow(Context context)
    {
        this(context, null, com.actionbarsherlock.R.attr.listPopupWindowStyle);
    }

    public IcsListPopupWindow(Context context, AttributeSet attributeset, int i)
    {
        mDropDownHeight = -2;
        mDropDownWidth = -2;
        mListItemExpandMaximum = 0x7fffffff;
        mPromptPosition = 0;
        mResizePopupRunnable = new ResizePopupRunnable(null);
        mTouchInterceptor = new PopupTouchInterceptor(null);
        mScrollListener = new PopupScrollListener(null);
        mHideSelector = new ListSelectorHider(null);
        mHandler = new Handler();
        mTempRect = new Rect();
        mContext = context;
        mPopup = new PopupWindowCompat(context, attributeset, i);
        mPopup.setInputMethodMode(1);
    }

    public IcsListPopupWindow(Context context, AttributeSet attributeset, int i, int j)
    {
        mDropDownHeight = -2;
        mDropDownWidth = -2;
        mListItemExpandMaximum = 0x7fffffff;
        mPromptPosition = 0;
        mResizePopupRunnable = new ResizePopupRunnable(null);
        mTouchInterceptor = new PopupTouchInterceptor(null);
        mScrollListener = new PopupScrollListener(null);
        mHideSelector = new ListSelectorHider(null);
        mHandler = new Handler();
        mTempRect = new Rect();
        mContext = context;
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            mPopup = new PopupWindowCompat(new ContextThemeWrapper(context, j), attributeset, i);
        } else
        {
            mPopup = new PopupWindowCompat(context, attributeset, i, j);
        }
        mPopup.setInputMethodMode(1);
    }

    private int buildDropDown()
    {
        int i;
        int j;
        j = 0;
        i = 0;
        if (mDropDownList != null) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj2;
        View view;
        Object obj3;
        boolean flag;
        obj3 = mContext;
        int k;
        if (mModal)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        mDropDownList = new DropDownListView(((Context) (obj3)), flag);
        if (mDropDownListHighlight != null)
        {
            mDropDownList.setSelector(mDropDownListHighlight);
        }
        mDropDownList.setAdapter(mAdapter);
        mDropDownList.setOnItemClickListener(mItemClickListener);
        mDropDownList.setFocusable(true);
        mDropDownList.setFocusableInTouchMode(true);
        mDropDownList.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final IcsListPopupWindow this$0;

            public void onItemSelected(AdapterView adapterview, View view1, int j1, long l1)
            {
                if (j1 != -1)
                {
                    adapterview = mDropDownList;
                    if (adapterview != null)
                    {
                        adapterview.mListSelectionHidden = false;
                    }
                }
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                this$0 = IcsListPopupWindow.this;
                super();
            }
        });
        mDropDownList.setOnScrollListener(mScrollListener);
        if (mItemSelectedListener != null)
        {
            mDropDownList.setOnItemSelectedListener(mItemSelectedListener);
        }
        obj2 = mDropDownList;
        view = mPromptView;
        obj = obj2;
        if (view == null) goto _L4; else goto _L3
_L3:
        obj = new LinearLayout(((Context) (obj3)));
        ((LinearLayout) (obj)).setOrientation(1);
        obj3 = new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0F);
        mPromptPosition;
        JVM INSTR tableswitch 0 1: default 212
    //                   0 391
    //                   1 376;
           goto _L5 _L6 _L7
_L5:
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(mDropDownWidth, 0x80000000), 0);
        obj2 = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
        i = view.getMeasuredHeight() + ((android.widget.LinearLayout.LayoutParams) (obj2)).topMargin + ((android.widget.LinearLayout.LayoutParams) (obj2)).bottomMargin;
_L4:
        mPopup.setContentView(((View) (obj)));
        break MISSING_BLOCK_LABEL_258;
_L7:
        ((LinearLayout) (obj)).addView(((View) (obj2)), ((android.view.ViewGroup.LayoutParams) (obj3)));
        ((LinearLayout) (obj)).addView(view);
        continue; /* Loop/switch isn't completed */
_L6:
        ((LinearLayout) (obj)).addView(view);
        ((LinearLayout) (obj)).addView(((View) (obj2)), ((android.view.ViewGroup.LayoutParams) (obj3)));
        continue; /* Loop/switch isn't completed */
_L2:
        Object obj1 = (ViewGroup)mPopup.getContentView();
        obj1 = mPromptView;
        i = j;
        if (obj1 != null)
        {
            android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)((View) (obj1)).getLayoutParams();
            i = ((View) (obj1)).getMeasuredHeight() + layoutparams.topMargin + layoutparams.bottomMargin;
        }
        j = 0;
        obj = mPopup.getBackground();
        if (obj != null)
        {
            ((Drawable) (obj)).getPadding(mTempRect);
            k = mTempRect.top + mTempRect.bottom;
            j = k;
            if (!mDropDownVerticalOffsetSet)
            {
                mDropDownVerticalOffset = -mTempRect.top;
                j = k;
            }
        }
        int l;
        if (mPopup.getInputMethodMode() == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l = getMaxAvailableHeight(mDropDownAnchorView, mDropDownVerticalOffset, flag);
        if (mDropDownHeight == -1)
        {
            return l + j;
        }
        int i1 = measureHeightOfChildren(0, 0, -1, l - i, -1);
        l = i;
        if (i1 > 0)
        {
            l = i + j;
        }
        return i1 + l;
        if (true) goto _L5; else goto _L8
_L8:
    }

    private int getMaxAvailableHeight(View view, int i, boolean flag)
    {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int ai[] = new int[2];
        view.getLocationOnScreen(ai);
        int j = rect.bottom;
        if (flag)
        {
            j = view.getContext().getResources().getDisplayMetrics().heightPixels;
        }
        j = Math.max(j - (ai[1] + view.getHeight()) - i, (ai[1] - rect.top) + i);
        i = j;
        if (mPopup.getBackground() != null)
        {
            mPopup.getBackground().getPadding(mTempRect);
            i = j - (mTempRect.top + mTempRect.bottom);
        }
        return i;
    }

    private boolean isInputMethodNotNeeded()
    {
        return mPopup.getInputMethodMode() == 2;
    }

    private int measureHeightOfChildren(int i, int j, int k, int l, int i1)
    {
        ListAdapter listadapter = mAdapter;
        if (listadapter != null) goto _L2; else goto _L1
_L1:
        j = mDropDownList.getListPaddingTop() + mDropDownList.getListPaddingBottom();
_L4:
        return j;
_L2:
        int i2 = mDropDownList.getListPaddingTop() + mDropDownList.getListPaddingBottom();
        int j1;
        int k1;
        int l1;
        boolean flag;
        if (mDropDownList.getDividerHeight() > 0 && mDropDownList.getDivider() != null)
        {
            j1 = mDropDownList.getDividerHeight();
        } else
        {
            j1 = 0;
        }
        flag = false;
        k1 = k;
        if (k == -1)
        {
            k1 = listadapter.getCount() - 1;
        }
        l1 = j;
        k = i2;
        j = ((flag) ? 1 : 0);
        do
        {
label0:
            {
                if (l1 > k1)
                {
                    return k;
                }
                View view = mAdapter.getView(l1, null, mDropDownList);
                if (mDropDownList.getCacheColorHint() != 0)
                {
                    view.setDrawingCacheBackgroundColor(mDropDownList.getCacheColorHint());
                }
                measureScrapChild(view, l1, i);
                int j2 = k;
                if (l1 > 0)
                {
                    j2 = k + j1;
                }
                k = j2 + view.getMeasuredHeight();
                if (k < l)
                {
                    break label0;
                }
                if (i1 < 0 || l1 <= i1 || j <= 0 || k == l)
                {
                    return l;
                }
            }
            if (true)
            {
                continue;
            }
            int k2 = j;
            if (i1 >= 0)
            {
                k2 = j;
                if (l1 >= i1)
                {
                    k2 = k;
                }
            }
            l1++;
            j = k2;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void measureScrapChild(View view, int i, int j)
    {
        android.widget.AbsListView.LayoutParams layoutparams1 = (android.widget.AbsListView.LayoutParams)view.getLayoutParams();
        android.widget.AbsListView.LayoutParams layoutparams = layoutparams1;
        if (layoutparams1 == null)
        {
            layoutparams = new android.widget.AbsListView.LayoutParams(-1, -2, 0);
            view.setLayoutParams(layoutparams);
        }
        j = ViewGroup.getChildMeasureSpec(j, mDropDownList.getPaddingLeft() + mDropDownList.getPaddingRight(), layoutparams.width);
        i = layoutparams.height;
        if (i > 0)
        {
            i = android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
        } else
        {
            i = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(j, i);
    }

    public void clearListSelection()
    {
        DropDownListView dropdownlistview = mDropDownList;
        if (dropdownlistview != null)
        {
            dropdownlistview.mListSelectionHidden = true;
            dropdownlistview.requestLayout();
        }
    }

    public void dismiss()
    {
        mPopup.dismiss();
        if (mPromptView != null)
        {
            android.view.ViewParent viewparent = mPromptView.getParent();
            if (viewparent instanceof ViewGroup)
            {
                ((ViewGroup)viewparent).removeView(mPromptView);
            }
        }
        mPopup.setContentView(null);
        mDropDownList = null;
        mHandler.removeCallbacks(mResizePopupRunnable);
    }

    public ListView getListView()
    {
        return mDropDownList;
    }

    public boolean isShowing()
    {
        return mPopup.isShowing();
    }

    public void setAdapter(ListAdapter listadapter)
    {
        if (mObserver != null) goto _L2; else goto _L1
_L1:
        mObserver = new PopupDataSetObserver(null);
_L4:
        mAdapter = listadapter;
        if (mAdapter != null)
        {
            listadapter.registerDataSetObserver(mObserver);
        }
        if (mDropDownList != null)
        {
            mDropDownList.setAdapter(mAdapter);
        }
        return;
_L2:
        if (mAdapter != null)
        {
            mAdapter.unregisterDataSetObserver(mObserver);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setAnchorView(View view)
    {
        mDropDownAnchorView = view;
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        mPopup.setBackgroundDrawable(drawable);
    }

    public void setContentWidth(int i)
    {
        Drawable drawable = mPopup.getBackground();
        if (drawable != null)
        {
            drawable.getPadding(mTempRect);
            mDropDownWidth = mTempRect.left + mTempRect.right + i;
            return;
        } else
        {
            mDropDownWidth = i;
            return;
        }
    }

    public void setHorizontalOffset(int i)
    {
        mDropDownHorizontalOffset = i;
    }

    public void setInputMethodMode(int i)
    {
        mPopup.setInputMethodMode(i);
    }

    public void setModal(boolean flag)
    {
        mModal = true;
        mPopup.setFocusable(flag);
    }

    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener ondismisslistener)
    {
        mPopup.setOnDismissListener(ondismisslistener);
    }

    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        mItemClickListener = onitemclicklistener;
    }

    public void setPromptPosition(int i)
    {
        mPromptPosition = i;
    }

    public void setSelection(int i)
    {
        DropDownListView dropdownlistview = mDropDownList;
        if (isShowing() && dropdownlistview != null)
        {
            dropdownlistview.mListSelectionHidden = false;
            dropdownlistview.setSelection(i);
            if (dropdownlistview.getChoiceMode() != 0)
            {
                dropdownlistview.setItemChecked(i, true);
            }
        }
    }

    public void setVerticalOffset(int i)
    {
        mDropDownVerticalOffset = i;
        mDropDownVerticalOffsetSet = true;
    }

    public void show()
    {
        int i;
        int j;
        byte byte0;
        byte byte1;
        boolean flag;
        boolean flag1;
        byte0 = 0;
        byte1 = -1;
        j = buildDropDown();
        i = 0;
        flag = false;
        flag1 = isInputMethodNotNeeded();
        if (!mPopup.isShowing()) goto _L2; else goto _L1
_L1:
        if (mDropDownWidth == -1)
        {
            i = -1;
        } else
        if (mDropDownWidth == -2)
        {
            i = mDropDownAnchorView.getWidth();
        } else
        {
            i = mDropDownWidth;
        }
        if (mDropDownHeight != -1) goto _L4; else goto _L3
_L3:
        if (!flag1)
        {
            j = -1;
        }
        if (flag1)
        {
            PopupWindowCompat popupwindowcompat = mPopup;
            if (mDropDownWidth == -1)
            {
                byte0 = byte1;
            } else
            {
                byte0 = 0;
            }
            popupwindowcompat.setWindowLayoutMode(byte0, 0);
        } else
        {
            PopupWindowCompat popupwindowcompat1 = mPopup;
            if (mDropDownWidth == -1)
            {
                byte0 = -1;
            }
            popupwindowcompat1.setWindowLayoutMode(byte0, -1);
        }
_L8:
        mPopup.setOutsideTouchable(true);
        mPopup.update(mDropDownAnchorView, mDropDownHorizontalOffset, mDropDownVerticalOffset, i, j);
_L6:
        return;
_L4:
        if (mDropDownHeight != -2)
        {
            j = mDropDownHeight;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (mDropDownWidth == -1)
        {
            i = -1;
        } else
        if (mDropDownWidth == -2)
        {
            mPopup.setWidth(mDropDownAnchorView.getWidth());
        } else
        {
            mPopup.setWidth(mDropDownWidth);
        }
        if (mDropDownHeight == -1)
        {
            j = -1;
        } else
        if (mDropDownHeight == -2)
        {
            mPopup.setHeight(j);
            j = ((flag) ? 1 : 0);
        } else
        {
            mPopup.setHeight(mDropDownHeight);
            j = ((flag) ? 1 : 0);
        }
        mPopup.setWindowLayoutMode(i, j);
        mPopup.setOutsideTouchable(true);
        mPopup.setTouchInterceptor(mTouchInterceptor);
        mPopup.showAsDropDown(mDropDownAnchorView, mDropDownHorizontalOffset, mDropDownVerticalOffset);
        mDropDownList.setSelection(-1);
        if (!mModal || mDropDownList.isInTouchMode())
        {
            clearListSelection();
        }
        if (mModal) goto _L6; else goto _L5
_L5:
        mHandler.post(mHideSelector);
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }






}
