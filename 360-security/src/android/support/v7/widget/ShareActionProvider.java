// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.support.v4.view.d;
import android.support.v7.internal.widget.ActivityChooserModel;
import android.support.v7.internal.widget.ActivityChooserView;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class ShareActionProvider extends d
{
    public static interface a
    {

        public abstract boolean a(ShareActionProvider shareactionprovider, Intent intent);
    }

    private class b
        implements android.support.v7.internal.widget.ActivityChooserModel.OnChooseActivityListener
    {

        final ShareActionProvider a;

        public boolean onChooseActivity(ActivityChooserModel activitychoosermodel, Intent intent)
        {
            if (a.mOnShareTargetSelectedListener != null)
            {
                a.mOnShareTargetSelectedListener.a(a, intent);
            }
            return false;
        }

        private b()
        {
            a = ShareActionProvider.this;
            super();
        }

    }

    private class c
        implements android.view.MenuItem.OnMenuItemClickListener
    {

        final ShareActionProvider a;

        public boolean onMenuItemClick(MenuItem menuitem)
        {
            menuitem = ActivityChooserModel.get(a.mContext, a.mShareHistoryFileName).chooseActivity(menuitem.getItemId());
            if (menuitem != null)
            {
                menuitem.addFlags(0x80000);
                a.mContext.startActivity(menuitem);
            }
            return true;
        }

        private c()
        {
            a = ShareActionProvider.this;
            super();
        }

    }


    private static final int DEFAULT_INITIAL_ACTIVITY_COUNT = 4;
    public static final String DEFAULT_SHARE_HISTORY_FILE_NAME = "share_history.xml";
    private final Context mContext;
    private int mMaxShownActivityCount;
    private android.support.v7.internal.widget.ActivityChooserModel.OnChooseActivityListener mOnChooseActivityListener;
    private final c mOnMenuItemClickListener = new c();
    private a mOnShareTargetSelectedListener;
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
            mOnChooseActivityListener = new b();
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
        mContext.getTheme().resolveAttribute(android.support.v7.a.a.b.actionModeShareDrawable, ((TypedValue) (obj)), true);
        activitychooserview.setExpandActivityOverflowButtonDrawable(mContext.getResources().getDrawable(((TypedValue) (obj)).resourceId));
        activitychooserview.setProvider(this);
        activitychooserview.setDefaultActionButtonContentDescription(android.support.v7.a.a.h.abc_shareactionprovider_share_with_application);
        activitychooserview.setExpandActivityOverflowButtonContentDescription(android.support.v7.a.a.h.abc_shareactionprovider_share_with);
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
            submenu = submenu.addSubMenu(0, l, l, mContext.getString(android.support.v7.a.a.h.abc_activity_chooser_view_see_all));
            for (int j = 0; j < k; j++)
            {
                ResolveInfo resolveinfo1 = activitychoosermodel.getActivity(j);
                submenu.add(0, j, j, resolveinfo1.loadLabel(packagemanager)).setIcon(resolveinfo1.loadIcon(packagemanager)).setOnMenuItemClickListener(mOnMenuItemClickListener);
            }

        }
    }

    public void setOnShareTargetSelectedListener(a a1)
    {
        mOnShareTargetSelectedListener = a1;
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
