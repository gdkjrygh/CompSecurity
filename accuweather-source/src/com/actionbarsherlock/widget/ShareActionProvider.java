// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import com.actionbarsherlock.view.ActionProvider;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.SubMenu;

// Referenced classes of package com.actionbarsherlock.widget:
//            ActivityChooserModel, ActivityChooserView

public class ShareActionProvider extends ActionProvider
{
    public static interface OnShareTargetSelectedListener
    {

        public abstract boolean onShareTargetSelected(ShareActionProvider shareactionprovider, Intent intent);
    }

    private class ShareAcitivityChooserModelPolicy
        implements ActivityChooserModel.OnChooseActivityListener
    {

        final ShareActionProvider this$0;

        public boolean onChooseActivity(ActivityChooserModel activitychoosermodel, Intent intent)
        {
            if (mOnShareTargetSelectedListener != null)
            {
                return mOnShareTargetSelectedListener.onShareTargetSelected(ShareActionProvider.this, intent);
            } else
            {
                return false;
            }
        }

        private ShareAcitivityChooserModelPolicy()
        {
            this$0 = ShareActionProvider.this;
            super();
        }

    }

    private class ShareMenuItemOnMenuItemClickListener
        implements com.actionbarsherlock.view.MenuItem.OnMenuItemClickListener
    {

        final ShareActionProvider this$0;

        public boolean onMenuItemClick(MenuItem menuitem)
        {
            menuitem = ActivityChooserModel.get(mContext, mShareHistoryFileName).chooseActivity(menuitem.getItemId());
            if (menuitem != null)
            {
                mContext.startActivity(menuitem);
            }
            return true;
        }

        private ShareMenuItemOnMenuItemClickListener()
        {
            this$0 = ShareActionProvider.this;
            super();
        }

    }


    private static final int DEFAULT_INITIAL_ACTIVITY_COUNT = 4;
    public static final String DEFAULT_SHARE_HISTORY_FILE_NAME = "share_history.xml";
    private final Context mContext;
    private int mMaxShownActivityCount;
    private ActivityChooserModel.OnChooseActivityListener mOnChooseActivityListener;
    private final ShareMenuItemOnMenuItemClickListener mOnMenuItemClickListener = new ShareMenuItemOnMenuItemClickListener();
    private OnShareTargetSelectedListener mOnShareTargetSelectedListener;
    private String mShareHistoryFileName;

    public ShareActionProvider(Context context)
    {
        super(context);
        mMaxShownActivityCount = 4;
        mShareHistoryFileName = "share_history.xml";
        mContext = context;
    }

    private void setActivityChooserPolicyIfNeeded()
    {
        if (mOnShareTargetSelectedListener == null)
        {
            return;
        }
        if (mOnChooseActivityListener == null)
        {
            mOnChooseActivityListener = new ShareAcitivityChooserModelPolicy();
        }
        ActivityChooserModel.get(mContext, mShareHistoryFileName).setOnChooseActivityListener(mOnChooseActivityListener);
    }

    public boolean hasSubMenu()
    {
        return true;
    }

    public View onCreateActionView()
    {
        Object obj = ActivityChooserModel.get(mContext, mShareHistoryFileName);
        ActivityChooserView activitychooserview = new ActivityChooserView(mContext);
        activitychooserview.setActivityChooserModel(((ActivityChooserModel) (obj)));
        obj = new TypedValue();
        mContext.getTheme().resolveAttribute(com.actionbarsherlock.R.attr.actionModeShareDrawable, ((TypedValue) (obj)), true);
        activitychooserview.setExpandActivityOverflowButtonDrawable(mContext.getResources().getDrawable(((TypedValue) (obj)).resourceId));
        activitychooserview.setProvider(this);
        activitychooserview.setDefaultActionButtonContentDescription(com.actionbarsherlock.R.string.abs__shareactionprovider_share_with_application);
        activitychooserview.setExpandActivityOverflowButtonContentDescription(com.actionbarsherlock.R.string.abs__shareactionprovider_share_with);
        return activitychooserview;
    }

    public void onPrepareSubMenu(SubMenu submenu)
    {
        submenu.clear();
        ActivityChooserModel activitychoosermodel = ActivityChooserModel.get(mContext, mShareHistoryFileName);
        android.content.pm.PackageManager packagemanager = mContext.getPackageManager();
        int k = activitychoosermodel.getActivityCount();
        int l = Math.min(k, mMaxShownActivityCount);
        for (int i = 0; i < l; i++)
        {
            ResolveInfo resolveinfo = activitychoosermodel.getActivity(i);
            submenu.add(0, i, i, resolveinfo.loadLabel(packagemanager)).setIcon(resolveinfo.loadIcon(packagemanager)).setOnMenuItemClickListener(mOnMenuItemClickListener);
        }

        if (l < k)
        {
            submenu = submenu.addSubMenu(0, l, l, mContext.getString(com.actionbarsherlock.R.string.more));
            for (int j = 0; j < k; j++)
            {
                ResolveInfo resolveinfo1 = activitychoosermodel.getActivity(j);
                submenu.add(0, j, j, resolveinfo1.loadLabel(packagemanager)).setIcon(resolveinfo1.loadIcon(packagemanager)).setOnMenuItemClickListener(mOnMenuItemClickListener);
            }

        }
    }

    public void setOnShareTargetSelectedListener(OnShareTargetSelectedListener onsharetargetselectedlistener)
    {
        mOnShareTargetSelectedListener = onsharetargetselectedlistener;
        setActivityChooserPolicyIfNeeded();
    }

    public void setShareHistoryFileName(String s)
    {
        mShareHistoryFileName = s;
        setActivityChooserPolicyIfNeeded();
    }

    public void setShareIntent(Intent intent)
    {
        ActivityChooserModel.get(mContext, mShareHistoryFileName).setIntent(intent);
    }



}
