// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.app.Activity;
import android.widget.ListAdapter;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.widgets.list.HeadedListAdapter;
import com.google.android.apps.wallet.widgets.list.ListItemBinder;
import com.google.android.apps.wallet.widgets.list.MergedListAdapter;
import com.google.android.apps.wallet.widgets.list.SimpleListAdapter;
import com.google.android.apps.wallet.wobs.list.FastWoblListAdapter;
import com.google.android.apps.wallet.wobs.list.LayoutMatcher;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordListActivity, PurchaseRecord, PurchaseRecordListItemBinder

public class DividedPurchaseRecordAdapterWrapper
{

    private static final String TAG;
    private final Activity activity;
    private SimpleListAdapter completedList;
    private FastWoblListAdapter fastWoblCompletedList;
    private final Provider fastWoblListAdapterProvider;
    private FastWoblListAdapter fastWoblPendingList;
    private final LayoutMatcher layoutMatcher;
    private final HeadedListAdapter mCompletedListAdapter;
    private final MergedListAdapter mMergedListAdapter = new MergedListAdapter();
    private final HeadedListAdapter mPendingListAdapter;
    private SimpleListAdapter pendingList;

    DividedPurchaseRecordAdapterWrapper(Activity activity1, LayoutMatcher layoutmatcher, Provider provider, com.google.android.apps.wallet.widgets.list.HeadedListAdapter.Builder builder)
    {
        activity = activity1;
        layoutMatcher = layoutmatcher;
        fastWoblListAdapterProvider = provider;
        mPendingListAdapter = builder.withDefaultHeaderView(activity1).build();
        mCompletedListAdapter = builder.withDefaultHeaderView(activity1).build();
    }

    private void checkAdaptersNotNull()
    {
        if (pendingList != null && completedList != null || fastWoblPendingList != null && fastWoblCompletedList != null)
        {
            return;
        } else
        {
            throw new IllegalStateException("adapters not initialized");
        }
    }

    private static int findFirstCompleted(List list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if (!((PurchaseRecord)list.get(i)).isPending())
            {
                return i;
            }
        }

        return list.size();
    }

    private void initHeaders()
    {
        mPendingListAdapter.setHeaderText(activity.getString(com.google.android.apps.walletnfcrel.R.string.purchase_record_list_header_pending));
        mCompletedListAdapter.setHeaderText(activity.getString(com.google.android.apps.walletnfcrel.R.string.purchase_record_list_header_completed));
    }

    private List toListItems(List list)
    {
        java.util.ArrayList arraylist = Lists.newArrayList();
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            list = (PurchaseRecord)iterator.next();
            Object obj = list.getRenderOutput();
            obj = layoutMatcher.getLayoutForListView(((com.google.wallet.proto.NanoWalletWobl.RenderOutput) (obj)));
            if (obj != null)
            {
                arraylist.add(new com.google.android.apps.wallet.wobs.list.FastWoblListAdapter.ListItem(list.getId(), ((com.google.wallet.proto.NanoWalletWobl.Layout) (obj)).compiledWobl, ((com.google.wallet.proto.NanoWalletWobl.Layout) (obj)).compiledWoblFingerprint, null));
            } else
            {
                String s = TAG;
                list = String.valueOf(list.getId());
                if (list.length() != 0)
                {
                    list = "No listview layout for PurchaseRecord: ".concat(list);
                } else
                {
                    list = new String("No listview layout for PurchaseRecord: ");
                }
                WLog.e(s, list);
            }
        }

        return arraylist;
    }

    private void updateHeaderVisibility()
    {
        com.google.android.apps.wallet.widgets.list.HeadedListAdapter.FixedViewVisibility fixedviewvisibility;
        HeadedListAdapter headedlistadapter;
        boolean flag;
        if (pendingList != null && !pendingList.isEmpty() || fastWoblPendingList != null && !fastWoblPendingList.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        headedlistadapter = mPendingListAdapter;
        if (flag)
        {
            fixedviewvisibility = com.google.android.apps.wallet.widgets.list.HeadedListAdapter.FixedViewVisibility.VISIBLE;
        } else
        {
            fixedviewvisibility = com.google.android.apps.wallet.widgets.list.HeadedListAdapter.FixedViewVisibility.GONE;
        }
        headedlistadapter.setHeaderVisibility(fixedviewvisibility);
        headedlistadapter = mCompletedListAdapter;
        if (flag)
        {
            fixedviewvisibility = com.google.android.apps.wallet.widgets.list.HeadedListAdapter.FixedViewVisibility.VISIBLE_UNLESS_EMPTY;
        } else
        {
            fixedviewvisibility = com.google.android.apps.wallet.widgets.list.HeadedListAdapter.FixedViewVisibility.GONE;
        }
        headedlistadapter.setHeaderVisibility(fixedviewvisibility);
    }

    public final void clearAdapters()
    {
        checkAdaptersNotNull();
        if (pendingList != null)
        {
            pendingList.clearItems();
            completedList.clearItems();
            return;
        } else
        {
            fastWoblPendingList.clear();
            fastWoblCompletedList.clear();
            return;
        }
    }

    public final ListAdapter getAdapter()
    {
        checkAdaptersNotNull();
        return mMergedListAdapter;
    }

    public final void init()
    {
        boolean flag;
        if (pendingList == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Already initialized for MRF-style rendering");
        initHeaders();
        fastWoblPendingList = (FastWoblListAdapter)fastWoblListAdapterProvider.get();
        mPendingListAdapter.setAdapter(fastWoblPendingList);
        fastWoblCompletedList = (FastWoblListAdapter)fastWoblListAdapterProvider.get();
        mCompletedListAdapter.setAdapter(fastWoblCompletedList);
        mMergedListAdapter.setAdapters(new ListAdapter[] {
            mPendingListAdapter, mCompletedListAdapter
        });
        updateHeaderVisibility();
    }

    public final void init(ListItemBinder listitembinder, ListItemBinder listitembinder1)
    {
        boolean flag;
        if (fastWoblPendingList == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Already initialized for WOBL rendering");
        initHeaders();
        pendingList = new SimpleListAdapter(listitembinder);
        ((PurchaseRecordListItemBinder)listitembinder).setCount(pendingList.getCount());
        mPendingListAdapter.setAdapter(pendingList);
        completedList = new SimpleListAdapter(listitembinder1);
        ((PurchaseRecordListItemBinder)listitembinder1).setCount(completedList.getCount());
        mCompletedListAdapter.setAdapter(completedList);
        mMergedListAdapter.setAdapters(new ListAdapter[] {
            mPendingListAdapter, mCompletedListAdapter
        });
        updateHeaderVisibility();
    }

    public final void onReloadAllPurchaseRecords(List list, boolean flag)
    {
        checkAdaptersNotNull();
        List list1;
        int i;
        if (flag)
        {
            i = findFirstCompleted(list);
        } else
        {
            i = 0;
        }
        list1 = list.subList(0, i);
        list = list.subList(i, list.size());
        if (pendingList != null)
        {
            pendingList.setItems(list1);
            completedList.setItems(list);
        } else
        {
            fastWoblPendingList.setItems(toListItems(list1));
            fastWoblCompletedList.setItems(toListItems(list));
        }
        updateHeaderVisibility();
    }

    static 
    {
        TAG = PurchaseRecordListActivity.TAG;
    }
}
