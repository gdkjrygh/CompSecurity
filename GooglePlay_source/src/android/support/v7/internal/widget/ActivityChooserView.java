// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.ListPopupWindow;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

// Referenced classes of package android.support.v7.internal.widget:
//            TintTypedArray

public final class ActivityChooserView extends ViewGroup
{
    private final class ActivityChooserViewAdapter extends BaseAdapter
    {

        final ActivityChooserView this$0;

        public final int getCount()
        {
            throw new NullPointerException();
        }

        public final Object getItem(int i)
        {
            switch (getItemViewType(i))
            {
            default:
                throw new IllegalArgumentException();

            case 0: // '\0'
                throw new NullPointerException();

            case 1: // '\001'
                return null;
            }
        }

        public final long getItemId(int i)
        {
            return (long)i;
        }

        public final int getItemViewType(int i)
        {
            return 0;
        }

        public final View getView(int i, View view, ViewGroup viewgroup)
        {
            getItemViewType(i);
            JVM INSTR tableswitch 0 1: default 28
        //                       0 104
        //                       1 36;
               goto _L1 _L2 _L3
_L1:
            throw new IllegalArgumentException();
_L3:
            if (view == null) goto _L5; else goto _L4
_L4:
            View view1 = view;
            if (view.getId() == 1) goto _L6; else goto _L5
_L5:
            view1 = LayoutInflater.from(getContext()).inflate(0x7f040008, viewgroup, false);
            view1.setId(1);
            ((TextView)view1.findViewById(0x7f0d0075)).setText(getContext().getString(0x7f100006));
_L6:
            return view1;
_L2:
            if (view == null) goto _L8; else goto _L7
_L7:
            view1 = view;
            if (view.getId() == 0x7f0d00b7) goto _L9; else goto _L8
_L8:
            view1 = LayoutInflater.from(getContext()).inflate(0x7f040008, viewgroup, false);
_L9:
            view = getContext().getPackageManager();
            viewgroup = (ImageView)view1.findViewById(0x7f0d006b);
            ResolveInfo resolveinfo = (ResolveInfo)getItem(i);
            viewgroup.setImageDrawable(resolveinfo.loadIcon(view));
            ((TextView)view1.findViewById(0x7f0d0075)).setText(resolveinfo.loadLabel(view));
            ViewCompat.setActivated(view1, false);
            return view1;
        }

        public final int getViewTypeCount()
        {
            return 3;
        }
    }

    private final class Callbacks
        implements android.view.View.OnClickListener, android.view.View.OnLongClickListener, android.widget.AdapterView.OnItemClickListener, android.widget.PopupWindow.OnDismissListener
    {

        final ActivityChooserView this$0;

        public final void onClick(View view)
        {
            if (view == mDefaultActivityButton)
            {
                dismissPopup();
                throw new NullPointerException();
            }
            if (view == mExpandActivityOverflowButton)
            {
                mIsSelectingDefaultActivity = false;
                throw ActivityChooserView.this0;
                return;
            } else
            {
                throw new IllegalArgumentException();
            }
        }

        public final void onDismiss()
        {
        }

        public final void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            ((ActivityChooserViewAdapter)adapterview.getAdapter()).getItemViewType(i);
            JVM INSTR tableswitch 0 1: default 32
        //                       0 50
        //                       1 40;
               goto _L1 _L2 _L3
_L1:
            throw new IllegalArgumentException();
_L3:
            throw ActivityChooserView.this0x7fffffff;
_L5:
            return;
_L2:
            dismissPopup();
            if (mIsSelectingDefaultActivity)
            {
                if (i > 0)
                {
                    throw new NullPointerException();
                }
            } else
            {
                throw new NullPointerException();
            }
            if (true) goto _L5; else goto _L4
_L4:
        }

        public final boolean onLongClick(View view)
        {
            if (view == mDefaultActivityButton)
            {
                if (mAdapter.getCount() > 0)
                {
                    mIsSelectingDefaultActivity = true;
                    throw ActivityChooserView.this0;
                }
                return true;
            } else
            {
                throw new IllegalArgumentException();
            }
        }
    }

    public static class InnerLayout extends LinearLayoutCompat
    {

        private static final int TINT_ATTRS[] = {
            0x10100d4
        };


        public InnerLayout(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            context = TintTypedArray.obtainStyledAttributes(context, attributeset, TINT_ATTRS);
            setBackgroundDrawable(context.getDrawable(0));
            ((TintTypedArray) (context)).mWrapped.recycle();
        }
    }


    private final LinearLayoutCompat mActivityChooserContent;
    private final ActivityChooserViewAdapter mAdapter;
    private final Callbacks mCallbacks;
    private final FrameLayout mDefaultActivityButton;
    private final FrameLayout mExpandActivityOverflowButton;
    private boolean mIsAttachedToWindow;
    private boolean mIsSelectingDefaultActivity;
    private ListPopupWindow mListPopupWindow;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener mOnGlobalLayoutListener;

    private ListPopupWindow getListPopupWindow()
    {
        if (mListPopupWindow == null)
        {
            mListPopupWindow = new ListPopupWindow(getContext());
            mListPopupWindow.setAdapter(mAdapter);
            mListPopupWindow.mDropDownAnchorView = this;
            mListPopupWindow.setModal$1385ff();
            mListPopupWindow.mItemClickListener = mCallbacks;
            mListPopupWindow.setOnDismissListener(mCallbacks);
        }
        return mListPopupWindow;
    }

    private boolean isShowingPopup()
    {
        return getListPopupWindow().mPopup.isShowing();
    }

    public final boolean dismissPopup()
    {
        if (getListPopupWindow().mPopup.isShowing())
        {
            getListPopupWindow().dismiss();
            ViewTreeObserver viewtreeobserver = getViewTreeObserver();
            if (viewtreeobserver.isAlive())
            {
                viewtreeobserver.removeGlobalOnLayoutListener(mOnGlobalLayoutListener);
            }
        }
        return true;
    }

    protected final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        mIsAttachedToWindow = true;
    }

    protected final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        ViewTreeObserver viewtreeobserver = getViewTreeObserver();
        if (viewtreeobserver.isAlive())
        {
            viewtreeobserver.removeGlobalOnLayoutListener(mOnGlobalLayoutListener);
        }
        if (isShowingPopup())
        {
            dismissPopup();
        }
        mIsAttachedToWindow = false;
    }

    protected final void onLayout(boolean flag, int i, int j, int k, int l)
    {
        mActivityChooserContent.layout(0, 0, k - i, l - j);
        if (!isShowingPopup())
        {
            dismissPopup();
        }
    }

    protected final void onMeasure(int i, int j)
    {
        LinearLayoutCompat linearlayoutcompat = mActivityChooserContent;
        int k = j;
        if (mDefaultActivityButton.getVisibility() != 0)
        {
            k = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(j), 0x40000000);
        }
        measureChild(linearlayoutcompat, i, k);
        setMeasuredDimension(linearlayoutcompat.getMeasuredWidth(), linearlayoutcompat.getMeasuredHeight());
    }





/*
    static boolean access$602(ActivityChooserView activitychooserview, boolean flag)
    {
        activitychooserview.mIsSelectingDefaultActivity = flag;
        return flag;
    }

*/


}
