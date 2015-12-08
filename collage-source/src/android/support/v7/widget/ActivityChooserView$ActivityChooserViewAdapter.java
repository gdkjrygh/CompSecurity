// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.support.v4.view.ViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package android.support.v7.widget:
//            ActivityChooserView, ActivityChooserModel

private class <init> extends BaseAdapter
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

    public boolean getShowDefaultActivity()
    {
        return mShowDefaultActivity;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        getItemViewType(i);
        JVM INSTR tableswitch 0 1: default 28
    //                   0 107
    //                   1 36;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException();
_L3:
        if (view == null) goto _L5; else goto _L4
_L4:
        View view1 = view;
        if (view.getId() == 1) goto _L6; else goto _L5
_L5:
        view1 = LayoutInflater.from(getContext()).inflate(android.support.v7.appcompat.ItemViewType, viewgroup, false);
        view1.setId(1);
        ((TextView)view1.findViewById(android.support.v7.appcompat.ItemViewType)).setText(getContext().getString(android.support.v7.appcompat.ItemViewType));
_L6:
        return view1;
_L2:
        if (view == null) goto _L8; else goto _L7
_L7:
        view1 = view;
        if (view.getId() == android.support.v7.appcompat.ItemViewType) goto _L9; else goto _L8
_L8:
        view1 = LayoutInflater.from(getContext()).inflate(android.support.v7.appcompat.ItemViewType, viewgroup, false);
_L9:
        view = getContext().getPackageManager();
        viewgroup = (ImageView)view1.findViewById(android.support.v7.appcompat.ItemViewType);
        ResolveInfo resolveinfo = (ResolveInfo)getItem(i);
        viewgroup.setImageDrawable(resolveinfo.loadIcon(view));
        ((TextView)view1.findViewById(android.support.v7.appcompat.Item)).setText(resolveinfo.loadLabel(view));
        if (mShowDefaultActivity && i == 0 && mHighlightDefaultActivity)
        {
            ViewCompat.setActivated(view1, true);
            return view1;
        } else
        {
            ViewCompat.setActivated(view1, false);
            return view1;
        }
    }

    public int getViewTypeCount()
    {
        return 3;
    }

    public int measureContentWidth()
    {
        int i = 0;
        int k = mMaxActivityCount;
        mMaxActivityCount = 0x7fffffff;
        int l = android.view.rViewAdapter.mMaxActivityCount(0, 0);
        int i1 = android.view.rViewAdapter.mMaxActivityCount(0, 0);
        int j1 = getCount();
        View view = null;
        int j = 0;
        for (; i < j1; i++)
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
        ActivityChooserModel activitychoosermodel1 = ActivityChooserView.access$000(ActivityChooserView.this).getDataModel();
        if (activitychoosermodel1 != null && isShown())
        {
            activitychoosermodel1.unregisterObserver(ActivityChooserView.access$1100(ActivityChooserView.this));
        }
        mDataModel = activitychoosermodel;
        if (activitychoosermodel != null && isShown())
        {
            activitychoosermodel.registerObserver(ActivityChooserView.access$1100(ActivityChooserView.this));
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

    private ()
    {
        this$0 = ActivityChooserView.this;
        super();
        mMaxActivityCount = 4;
    }

    mMaxActivityCount(mMaxActivityCount mmaxactivitycount)
    {
        this();
    }
}
