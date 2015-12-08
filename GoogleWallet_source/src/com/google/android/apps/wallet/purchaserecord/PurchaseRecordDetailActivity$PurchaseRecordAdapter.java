// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.ViewGroup;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.util.List;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            FixedFragmentStatePagerAdapter, PurchaseRecordDetailActivity, PurchaseRecordDetailFragment, PurchaseRecord

final class <init> extends FixedFragmentStatePagerAdapter
{

    private List purchaseRecords;
    final PurchaseRecordDetailActivity this$0;

    public final int getCount()
    {
        return purchaseRecords.size();
    }

    public final Fragment getItem(int i)
    {
        PurchaseRecordDetailFragment purchaserecorddetailfragment = (PurchaseRecordDetailFragment)purchaseRecordDetailFragmentProvider.get();
        purchaserecorddetailfragment.setPurchaseRecord((PurchaseRecord)purchaseRecords.get(i));
        return purchaserecorddetailfragment;
    }

    public final String getItemId(int i)
    {
        Object obj = (PurchaseRecord)purchaseRecords.get(i);
        String s = ((PurchaseRecord) (obj)).getId();
        obj = String.valueOf(((PurchaseRecord) (obj)).getStatus());
        return (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(obj).length())).append(s).append("-").append(((String) (obj))).toString();
    }

    public final int getItemPosition(Object obj)
    {
        Object obj1 = (PurchaseRecordDetailFragment)obj;
        obj = ((PurchaseRecordDetailFragment) (obj1)).getPurchaseRecordId();
        obj1 = ((PurchaseRecordDetailFragment) (obj1)).getPurchaseRecordStatus();
        int i = Iterables.indexOf(purchaseRecords, PurchaseRecordDetailActivity.access$1400(((String) (obj)), ((Integer) (obj1))));
        if (i >= 0)
        {
            return i;
        } else
        {
            return -2;
        }
    }

    final PurchaseRecord getPurchaseRecord(int i)
    {
        return (PurchaseRecord)purchaseRecords.get(i);
    }

    public final void setPrimaryItem(ViewGroup viewgroup, int i, Object obj)
    {
        super.setPrimaryItem(viewgroup, i, obj);
        if (i < purchaseRecords.size())
        {
            purchaseRecordId = ((PurchaseRecord)purchaseRecords.get(i)).getId();
        }
    }

    final void setPurchaseRecords(List list)
    {
        purchaseRecords = list;
        notifyDataSetChanged();
    }

    private (FragmentManager fragmentmanager)
    {
        this$0 = PurchaseRecordDetailActivity.this;
        super(fragmentmanager);
        purchaseRecords = Lists.newArrayList();
    }

    purchaseRecords(FragmentManager fragmentmanager, purchaseRecords purchaserecords)
    {
        this(fragmentmanager);
    }
}
