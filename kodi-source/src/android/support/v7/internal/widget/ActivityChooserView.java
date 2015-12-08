// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ActionProvider;
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
import android.widget.ListView;
import android.widget.TextView;

// Referenced classes of package android.support.v7.internal.widget:
//            ActivityChooserModel, TintTypedArray

public class ActivityChooserView extends ViewGroup
{
    private class ActivityChooserViewAdapter extends BaseAdapter
    {

        private ActivityChooserModel mDataModel;
        private boolean mHighlightDefaultActivity;
        private int mMaxActivityCount;
        private boolean mShowDefaultActivity;
        private boolean mShowFooterView;
        final ActivityChooserView this$0;

        public int getActivityCount()
        {
            return mDataModel.getActivityCount();
        }

        public int getCount()
        {
            int j = mDataModel.getActivityCount();
            int i = j;
            if (!mShowDefaultActivity)
            {
                i = j;
                if (mDataModel.getDefaultActivity() != null)
                {
                    i = j - 1;
                }
            }
            j = Math.min(i, mMaxActivityCount);
            i = j;
            if (mShowFooterView)
            {
                i = j + 1;
            }
            return i;
        }

        public ActivityChooserModel getDataModel()
        {
            return mDataModel;
        }

        public ResolveInfo getDefaultActivity()
        {
            return mDataModel.getDefaultActivity();
        }

        public Object getItem(int i)
        {
            int j;
            switch (getItemViewType(i))
            {
            default:
                throw new IllegalArgumentException();

            case 1: // '\001'
                return null;

            case 0: // '\0'
                j = i;
                break;
            }
            if (!mShowDefaultActivity)
            {
                j = i;
                if (mDataModel.getDefaultActivity() != null)
                {
                    j = i + 1;
                }
            }
            return mDataModel.getActivity(j);
        }

        public long getItemId(int i)
        {
            return (long)i;
        }

        public int getItemViewType(int i)
        {
            return !mShowFooterView || i != getCount() - 1 ? 0 : 1;
        }

        public boolean getShowDefaultActivity()
        {
            return mShowDefaultActivity;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            getItemViewType(i);
            JVM INSTR tableswitch 0 1: default 28
        //                       0 107
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
            view1 = LayoutInflater.from(getContext()).inflate(android.support.v7.appcompat.R.layout.abc_activity_chooser_view_list_item, viewgroup, false);
            view1.setId(1);
            ((TextView)view1.findViewById(android.support.v7.appcompat.R.id.title)).setText(getContext().getString(android.support.v7.appcompat.R.string.abc_activity_chooser_view_see_all));
_L6:
            return view1;
_L2:
            if (view == null) goto _L8; else goto _L7
_L7:
            view1 = view;
            if (view.getId() == android.support.v7.appcompat.R.id.list_item) goto _L9; else goto _L8
_L8:
            view1 = LayoutInflater.from(getContext()).inflate(android.support.v7.appcompat.R.layout.abc_activity_chooser_view_list_item, viewgroup, false);
_L9:
            view = getContext().getPackageManager();
            viewgroup = (ImageView)view1.findViewById(android.support.v7.appcompat.R.id.icon);
            ResolveInfo resolveinfo = (ResolveInfo)getItem(i);
            viewgroup.setImageDrawable(resolveinfo.loadIcon(view));
            ((TextView)view1.findViewById(android.support.v7.appcompat.R.id.title)).setText(resolveinfo.loadLabel(view));
            if (mShowDefaultActivity && i == 0 && mHighlightDefaultActivity)
            {
                ViewCompat.setActivated(view1, true);
            } else
            {
                ViewCompat.setActivated(view1, false);
            }
            return view1;
        }

        public int getViewTypeCount()
        {
            return 3;
        }

        public int measureContentWidth()
        {
            int k = mMaxActivityCount;
            mMaxActivityCount = 0x7fffffff;
            int j = 0;
            View view = null;
            int l = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            int i1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            int j1 = getCount();
            for (int i = 0; i < j1; i++)
            {
                view = getView(i, view, null);
                view.measure(l, i1);
                j = Math.max(j, view.getMeasuredWidth());
            }

            mMaxActivityCount = k;
            return j;
        }

        public void setDataModel(ActivityChooserModel activitychoosermodel)
        {
            ActivityChooserModel activitychoosermodel1 = mAdapter.getDataModel();
            if (activitychoosermodel1 != null && isShown())
            {
                activitychoosermodel1.unregisterObserver(mModelDataSetOberver);
            }
            mDataModel = activitychoosermodel;
            if (activitychoosermodel != null && isShown())
            {
                activitychoosermodel.registerObserver(mModelDataSetOberver);
            }
            notifyDataSetChanged();
        }

        public void setMaxActivityCount(int i)
        {
            if (mMaxActivityCount != i)
            {
                mMaxActivityCount = i;
                notifyDataSetChanged();
            }
        }

        public void setShowDefaultActivity(boolean flag, boolean flag1)
        {
            if (mShowDefaultActivity != flag || mHighlightDefaultActivity != flag1)
            {
                mShowDefaultActivity = flag;
                mHighlightDefaultActivity = flag1;
                notifyDataSetChanged();
            }
        }

        public void setShowFooterView(boolean flag)
        {
            if (mShowFooterView != flag)
            {
                mShowFooterView = flag;
                notifyDataSetChanged();
            }
        }
    }

    private class Callbacks
        implements android.view.View.OnClickListener, android.view.View.OnLongClickListener, android.widget.AdapterView.OnItemClickListener, android.widget.PopupWindow.OnDismissListener
    {

        final ActivityChooserView this$0;

        private void notifyOnDismissListener()
        {
            if (mOnDismissListener != null)
            {
                mOnDismissListener.onDismiss();
            }
        }

        public void onClick(View view)
        {
            if (view == mDefaultActivityButton)
            {
                dismissPopup();
                view = mAdapter.getDefaultActivity();
                int i = mAdapter.getDataModel().getActivityIndex(view);
                view = mAdapter.getDataModel().chooseActivity(i);
                if (view != null)
                {
                    view.addFlags(0x80000);
                    getContext().startActivity(view);
                }
                return;
            }
            if (view == mExpandActivityOverflowButton)
            {
                mIsSelectingDefaultActivity = false;
                showPopupUnchecked(mInitialActivityCount);
                return;
            } else
            {
                throw new IllegalArgumentException();
            }
        }

        public void onDismiss()
        {
            notifyOnDismissListener();
            if (mProvider != null)
            {
                mProvider.subUiVisibilityChanged(false);
            }
        }

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            ((ActivityChooserViewAdapter)adapterview.getAdapter()).getItemViewType(i);
            JVM INSTR tableswitch 0 1: default 32
        //                       0 50
        //                       1 40;
               goto _L1 _L2 _L3
_L1:
            throw new IllegalArgumentException();
_L3:
            showPopupUnchecked(0x7fffffff);
_L5:
            return;
_L2:
            dismissPopup();
            if (!mIsSelectingDefaultActivity)
            {
                break; /* Loop/switch isn't completed */
            }
            if (i > 0)
            {
                mAdapter.getDataModel().setDefaultActivity(i);
                return;
            }
            if (true) goto _L5; else goto _L4
_L4:
            if (!mAdapter.getShowDefaultActivity())
            {
                i++;
            }
            adapterview = mAdapter.getDataModel().chooseActivity(i);
            if (adapterview != null)
            {
                adapterview.addFlags(0x80000);
                getContext().startActivity(adapterview);
                return;
            }
            if (true) goto _L5; else goto _L6
_L6:
        }

        public boolean onLongClick(View view)
        {
            if (view == mDefaultActivityButton)
            {
                if (mAdapter.getCount() > 0)
                {
                    mIsSelectingDefaultActivity = true;
                    showPopupUnchecked(mInitialActivityCount);
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
            context.recycle();
        }
    }


    private final LinearLayoutCompat mActivityChooserContent;
    private final ActivityChooserViewAdapter mAdapter;
    private final Callbacks mCallbacks;
    private int mDefaultActionButtonContentDescription;
    private final FrameLayout mDefaultActivityButton;
    private final FrameLayout mExpandActivityOverflowButton;
    private final ImageView mExpandActivityOverflowButtonImage;
    private int mInitialActivityCount;
    private boolean mIsAttachedToWindow;
    private boolean mIsSelectingDefaultActivity;
    private final int mListPopupMaxWidth;
    private ListPopupWindow mListPopupWindow;
    private final DataSetObserver mModelDataSetOberver;
    private android.widget.PopupWindow.OnDismissListener mOnDismissListener;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener mOnGlobalLayoutListener;
    ActionProvider mProvider;

    private ListPopupWindow getListPopupWindow()
    {
        if (mListPopupWindow == null)
        {
            mListPopupWindow = new ListPopupWindow(getContext());
            mListPopupWindow.setAdapter(mAdapter);
            mListPopupWindow.setAnchorView(this);
            mListPopupWindow.setModal(true);
            mListPopupWindow.setOnItemClickListener(mCallbacks);
            mListPopupWindow.setOnDismissListener(mCallbacks);
        }
        return mListPopupWindow;
    }

    private void showPopupUnchecked(int i)
    {
        if (mAdapter.getDataModel() == null)
        {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(mOnGlobalLayoutListener);
        ListPopupWindow listpopupwindow;
        int j;
        int k;
        boolean flag;
        if (mDefaultActivityButton.getVisibility() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = mAdapter.getActivityCount();
        if (flag)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (i != 0x7fffffff && k > i + j)
        {
            mAdapter.setShowFooterView(true);
            mAdapter.setMaxActivityCount(i - 1);
        } else
        {
            mAdapter.setShowFooterView(false);
            mAdapter.setMaxActivityCount(i);
        }
        listpopupwindow = getListPopupWindow();
        if (!listpopupwindow.isShowing())
        {
            if (mIsSelectingDefaultActivity || !flag)
            {
                mAdapter.setShowDefaultActivity(true, flag);
            } else
            {
                mAdapter.setShowDefaultActivity(false, false);
            }
            listpopupwindow.setContentWidth(Math.min(mAdapter.measureContentWidth(), mListPopupMaxWidth));
            listpopupwindow.show();
            if (mProvider != null)
            {
                mProvider.subUiVisibilityChanged(true);
            }
            listpopupwindow.getListView().setContentDescription(getContext().getString(android.support.v7.appcompat.R.string.abc_activitychooserview_choose_application));
        }
    }

    public boolean dismissPopup()
    {
        if (isShowingPopup())
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

    public ActivityChooserModel getDataModel()
    {
        return mAdapter.getDataModel();
    }

    public boolean isShowingPopup()
    {
        return getListPopupWindow().isShowing();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        ActivityChooserModel activitychoosermodel = mAdapter.getDataModel();
        if (activitychoosermodel != null)
        {
            activitychoosermodel.registerObserver(mModelDataSetOberver);
        }
        mIsAttachedToWindow = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        Object obj = mAdapter.getDataModel();
        if (obj != null)
        {
            ((ActivityChooserModel) (obj)).unregisterObserver(mModelDataSetOberver);
        }
        obj = getViewTreeObserver();
        if (((ViewTreeObserver) (obj)).isAlive())
        {
            ((ViewTreeObserver) (obj)).removeGlobalOnLayoutListener(mOnGlobalLayoutListener);
        }
        if (isShowingPopup())
        {
            dismissPopup();
        }
        mIsAttachedToWindow = false;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        mActivityChooserContent.layout(0, 0, k - i, l - j);
        if (!isShowingPopup())
        {
            dismissPopup();
        }
    }

    protected void onMeasure(int i, int j)
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

    public void setActivityChooserModel(ActivityChooserModel activitychoosermodel)
    {
        mAdapter.setDataModel(activitychoosermodel);
        if (isShowingPopup())
        {
            dismissPopup();
            showPopup();
        }
    }

    public void setDefaultActionButtonContentDescription(int i)
    {
        mDefaultActionButtonContentDescription = i;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i)
    {
        String s = getContext().getString(i);
        mExpandActivityOverflowButtonImage.setContentDescription(s);
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable)
    {
        mExpandActivityOverflowButtonImage.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i)
    {
        mInitialActivityCount = i;
    }

    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener ondismisslistener)
    {
        mOnDismissListener = ondismisslistener;
    }

    public void setProvider(ActionProvider actionprovider)
    {
        mProvider = actionprovider;
    }

    public boolean showPopup()
    {
        if (isShowingPopup() || !mIsAttachedToWindow)
        {
            return false;
        } else
        {
            mIsSelectingDefaultActivity = false;
            showPopupUnchecked(mInitialActivityCount);
            return true;
        }
    }







/*
    static boolean access$602(ActivityChooserView activitychooserview, boolean flag)
    {
        activitychooserview.mIsSelectingDefaultActivity = flag;
        return flag;
    }

*/



}
