// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.widget;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
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
import com.actionbarsherlock.internal.widget.IcsLinearLayout;
import com.actionbarsherlock.internal.widget.IcsListPopupWindow;
import com.actionbarsherlock.view.ActionProvider;

// Referenced classes of package com.actionbarsherlock.widget:
//            ActivityChooserModel

class ActivityChooserView extends ViewGroup
    implements ActivityChooserModel.ActivityChooserModelClient
{
    private class ActivityChooserViewAdapter extends BaseAdapter
    {

        private static final int ITEM_VIEW_TYPE_ACTIVITY = 0;
        private static final int ITEM_VIEW_TYPE_COUNT = 3;
        private static final int ITEM_VIEW_TYPE_FOOTER = 1;
        public static final int MAX_ACTIVITY_COUNT_DEFAULT = 4;
        public static final int MAX_ACTIVITY_COUNT_UNLIMITED = 0x7fffffff;
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

        public int getHistorySize()
        {
            return mDataModel.getHistorySize();
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

        public int getMaxActivityCount()
        {
            return mMaxActivityCount;
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
            view1 = LayoutInflater.from(getContext()).inflate(com.actionbarsherlock.R.layout.abs__activity_chooser_view_list_item, viewgroup, false);
            view1.setId(1);
            ((TextView)view1.findViewById(com.actionbarsherlock.R.id.abs__title)).setText(mContext.getString(com.actionbarsherlock.R.string.abs__activity_chooser_view_see_all));
_L6:
            return view1;
_L2:
            if (view == null) goto _L8; else goto _L7
_L7:
            view1 = view;
            if (view.getId() == com.actionbarsherlock.R.id.abs__list_item) goto _L9; else goto _L8
_L8:
            view1 = LayoutInflater.from(getContext()).inflate(com.actionbarsherlock.R.layout.abs__activity_chooser_view_list_item, viewgroup, false);
_L9:
            view = mContext.getPackageManager();
            viewgroup = (ImageView)view1.findViewById(com.actionbarsherlock.R.id.abs__icon);
            ResolveInfo resolveinfo = (ResolveInfo)getItem(i);
            viewgroup.setImageDrawable(resolveinfo.loadIcon(view));
            ((TextView)view1.findViewById(com.actionbarsherlock.R.id.abs__title)).setText(resolveinfo.loadLabel(view));
            if (ActivityChooserView.IS_HONEYCOMB)
            {
                if (mShowDefaultActivity && i == 0 && mHighlightDefaultActivity)
                {
                    SetActivated.invoke(view1, true);
                } else
                {
                    SetActivated.invoke(view1, false);
                }
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
            int i = 0;
            do
            {
                if (i >= j1)
                {
                    mMaxActivityCount = k;
                    return j;
                }
                view = getView(i, view, null);
                view.measure(l, i1);
                j = Math.max(j, view.getMeasuredWidth());
                i++;
            } while (true);
        }

        public void setDataModel(ActivityChooserModel activitychoosermodel)
        {
            ActivityChooserModel activitychoosermodel1 = mAdapter.getDataModel();
            if (activitychoosermodel1 != null && isShown())
            {
                try
                {
                    activitychoosermodel1.unregisterObserver(mModelDataSetOberver);
                }
                catch (IllegalStateException illegalstateexception) { }
            }
            mDataModel = activitychoosermodel;
            if (activitychoosermodel != null && isShown())
            {
                try
                {
                    activitychoosermodel.registerObserver(mModelDataSetOberver);
                }
                // Misplaced declaration of an exception variable
                catch (ActivityChooserModel activitychoosermodel) { }
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

        private ActivityChooserViewAdapter()
        {
            this$0 = ActivityChooserView.this;
            super();
            mMaxActivityCount = 4;
            mShowDefaultActivity = true;
        }

        ActivityChooserViewAdapter(ActivityChooserViewAdapter activitychooserviewadapter)
        {
            this();
        }
    }

    private class Callbacks
        implements android.widget.AdapterView.OnItemClickListener, android.view.View.OnClickListener, android.view.View.OnLongClickListener, android.widget.PopupWindow.OnDismissListener
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
                    mContext.startActivity(view);
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
                mContext.startActivity(adapterview);
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

        private Callbacks()
        {
            this$0 = ActivityChooserView.this;
            super();
        }

        Callbacks(Callbacks callbacks)
        {
            this();
        }
    }

    private static class SetActivated
    {

        public static void invoke(View view, boolean flag)
        {
            view.setActivated(flag);
        }

        private SetActivated()
        {
        }
    }


    private static final boolean IS_HONEYCOMB;
    private final IcsLinearLayout mActivityChooserContent;
    private final Drawable mActivityChooserContentBackground;
    private final ActivityChooserViewAdapter mAdapter;
    private final Callbacks mCallbacks;
    private final Context mContext;
    private int mDefaultActionButtonContentDescription;
    private final FrameLayout mDefaultActivityButton;
    private final ImageView mDefaultActivityButtonImage;
    private final FrameLayout mExpandActivityOverflowButton;
    private final ImageView mExpandActivityOverflowButtonImage;
    private int mInitialActivityCount;
    private boolean mIsAttachedToWindow;
    private boolean mIsSelectingDefaultActivity;
    private final int mListPopupMaxWidth;
    private IcsListPopupWindow mListPopupWindow;
    private final DataSetObserver mModelDataSetOberver;
    private android.widget.PopupWindow.OnDismissListener mOnDismissListener;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener mOnGlobalLayoutListener;
    ActionProvider mProvider;

    public ActivityChooserView(Context context)
    {
        this(context, null);
    }

    public ActivityChooserView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mModelDataSetOberver = new DataSetObserver() {

            final ActivityChooserView this$0;

            public void onChanged()
            {
                super.onChanged();
                mAdapter.notifyDataSetChanged();
            }

            public void onInvalidated()
            {
                super.onInvalidated();
                mAdapter.notifyDataSetInvalidated();
            }

            
            {
                this$0 = ActivityChooserView.this;
                super();
            }
        };
        mOnGlobalLayoutListener = new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            final ActivityChooserView this$0;

            public void onGlobalLayout()
            {
                if (isShowingPopup())
                {
                    if (!isShown())
                    {
                        getListPopupWindow().dismiss();
                    } else
                    {
                        getListPopupWindow().show();
                        if (mProvider != null)
                        {
                            mProvider.subUiVisibilityChanged(true);
                            return;
                        }
                    }
                }
            }

            
            {
                this$0 = ActivityChooserView.this;
                super();
            }
        };
        mInitialActivityCount = 4;
        mContext = context;
        attributeset = context.obtainStyledAttributes(attributeset, com.actionbarsherlock.R.styleable.SherlockActivityChooserView, i, 0);
        mInitialActivityCount = attributeset.getInt(com.actionbarsherlock.R.styleable.SherlockActivityChooserView_initialActivityCount, 4);
        Drawable drawable = attributeset.getDrawable(com.actionbarsherlock.R.styleable.SherlockActivityChooserView_expandActivityOverflowButtonDrawable);
        attributeset.recycle();
        LayoutInflater.from(mContext).inflate(com.actionbarsherlock.R.layout.abs__activity_chooser_view, this, true);
        mCallbacks = new Callbacks(null);
        mActivityChooserContent = (IcsLinearLayout)findViewById(com.actionbarsherlock.R.id.abs__activity_chooser_view_content);
        mActivityChooserContentBackground = mActivityChooserContent.getBackground();
        mDefaultActivityButton = (FrameLayout)findViewById(com.actionbarsherlock.R.id.abs__default_activity_button);
        mDefaultActivityButton.setOnClickListener(mCallbacks);
        mDefaultActivityButton.setOnLongClickListener(mCallbacks);
        mDefaultActivityButtonImage = (ImageView)mDefaultActivityButton.findViewById(com.actionbarsherlock.R.id.abs__image);
        mExpandActivityOverflowButton = (FrameLayout)findViewById(com.actionbarsherlock.R.id.abs__expand_activities_button);
        mExpandActivityOverflowButton.setOnClickListener(mCallbacks);
        mExpandActivityOverflowButtonImage = (ImageView)mExpandActivityOverflowButton.findViewById(com.actionbarsherlock.R.id.abs__image);
        mExpandActivityOverflowButtonImage.setImageDrawable(drawable);
        mAdapter = new ActivityChooserViewAdapter(null);
        mAdapter.registerDataSetObserver(new DataSetObserver() {

            final ActivityChooserView this$0;

            public void onChanged()
            {
                super.onChanged();
                updateAppearance();
            }

            
            {
                this$0 = ActivityChooserView.this;
                super();
            }
        });
        context = context.getResources();
        mListPopupMaxWidth = Math.max(context.getDisplayMetrics().widthPixels / 2, context.getDimensionPixelSize(com.actionbarsherlock.R.dimen.abs__config_prefDialogWidth));
    }

    private IcsListPopupWindow getListPopupWindow()
    {
        if (mListPopupWindow == null)
        {
            mListPopupWindow = new IcsListPopupWindow(getContext());
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
        IcsListPopupWindow icslistpopupwindow;
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
        icslistpopupwindow = getListPopupWindow();
        if (!icslistpopupwindow.isShowing())
        {
            if (mIsSelectingDefaultActivity || !flag)
            {
                mAdapter.setShowDefaultActivity(true, flag);
            } else
            {
                mAdapter.setShowDefaultActivity(false, false);
            }
            icslistpopupwindow.setContentWidth(Math.min(mAdapter.measureContentWidth(), mListPopupMaxWidth));
            icslistpopupwindow.show();
            if (mProvider != null)
            {
                mProvider.subUiVisibilityChanged(true);
            }
            icslistpopupwindow.getListView().setContentDescription(mContext.getString(com.actionbarsherlock.R.string.abs__activitychooserview_choose_application));
        }
    }

    private void updateAppearance()
    {
        int i;
        int j;
        if (mAdapter.getCount() > 0)
        {
            mExpandActivityOverflowButton.setEnabled(true);
        } else
        {
            mExpandActivityOverflowButton.setEnabled(false);
        }
        i = mAdapter.getActivityCount();
        j = mAdapter.getHistorySize();
        if (i > 0 && j > 0)
        {
            mDefaultActivityButton.setVisibility(0);
            Object obj = mAdapter.getDefaultActivity();
            android.content.pm.PackageManager packagemanager = mContext.getPackageManager();
            mDefaultActivityButtonImage.setImageDrawable(((ResolveInfo) (obj)).loadIcon(packagemanager));
            if (mDefaultActionButtonContentDescription != 0)
            {
                obj = ((ResolveInfo) (obj)).loadLabel(packagemanager);
                obj = mContext.getString(mDefaultActionButtonContentDescription, new Object[] {
                    obj
                });
                mDefaultActivityButton.setContentDescription(((CharSequence) (obj)));
            }
            mAdapter.setShowDefaultActivity(false, false);
        } else
        {
            mDefaultActivityButton.setVisibility(8);
        }
        if (mDefaultActivityButton.getVisibility() == 0)
        {
            mActivityChooserContent.setBackgroundDrawable(mActivityChooserContentBackground);
            return;
        } else
        {
            mActivityChooserContent.setBackgroundDrawable(null);
            mActivityChooserContent.setPadding(0, 0, 0, 0);
            return;
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
            try
            {
                activitychoosermodel.registerObserver(mModelDataSetOberver);
            }
            catch (IllegalStateException illegalstateexception) { }
        }
        mIsAttachedToWindow = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        Object obj = mAdapter.getDataModel();
        if (obj != null)
        {
            try
            {
                ((ActivityChooserModel) (obj)).unregisterObserver(mModelDataSetOberver);
            }
            catch (IllegalStateException illegalstateexception) { }
        }
        obj = getViewTreeObserver();
        if (((ViewTreeObserver) (obj)).isAlive())
        {
            ((ViewTreeObserver) (obj)).removeGlobalOnLayoutListener(mOnGlobalLayoutListener);
        }
        mIsAttachedToWindow = false;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        mActivityChooserContent.layout(0, 0, k - i, l - j);
        if (getListPopupWindow().isShowing())
        {
            showPopupUnchecked(mAdapter.getMaxActivityCount());
            return;
        } else
        {
            dismissPopup();
            return;
        }
    }

    protected void onMeasure(int i, int j)
    {
        IcsLinearLayout icslinearlayout = mActivityChooserContent;
        int k = j;
        if (mDefaultActivityButton.getVisibility() != 0)
        {
            k = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(j), 0x40000000);
        }
        measureChild(icslinearlayout, i, k);
        setMeasuredDimension(icslinearlayout.getMeasuredWidth(), icslinearlayout.getMeasuredHeight());
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
        String s = mContext.getString(i);
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

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        IS_HONEYCOMB = flag;
    }













}
