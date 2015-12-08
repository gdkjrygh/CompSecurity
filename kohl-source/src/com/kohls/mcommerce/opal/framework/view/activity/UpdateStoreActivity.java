// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.kohls.mcommerce.opal.common.ui.toast.ToastUtility;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.framework.view.adapter.StoreInfoAdapter;
import com.kohls.mcommerce.opal.helper.actionbar.ActionBarHelper;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            FindinStoreActivity

public class UpdateStoreActivity extends FindinStoreActivity
{

    public UpdateStoreActivity()
    {
    }

    protected void initializeViews(Bundle bundle)
    {
        if (bundle.getBoolean("FromEditBag") || bundle.getBoolean("isFromCheckoutScreen"))
        {
            mIsUpdateStore = true;
            selectedQuantity = bundle.getInt("FromEditBagQuantity");
        } else
        {
            mIsUpdateStore = false;
            selectedQuantity = 0;
        }
        super.initializeViews(bundle);
    }

    public void setStore(String s)
    {
        dismissDialog();
        stopLocationUpdates();
        Intent intent = new Intent();
        intent.putExtra("SELECTED_STORE", s);
        setResult(110, intent);
        finish();
    }

    protected void updateActionBarViews()
    {
        getActionBarHelper().showActionBarForUpdateStore(getString(0x7f08052a));
        attachActionItemListener();
    }

    public void updateViewsOnSuccess(Object obj)
    {
        dismissDialog();
        if (obj instanceof String)
        {
            obj = (String)obj;
            getActionBarHelper().updateShopingBagCount();
            if (!((String) (obj)).contains(getString(0x7f0804f0)))
            {
                ((com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store)mStoreData.get(mStoreInfoAdapter.getItemPosition())).setErrorMess(((String) (obj)));
                mStoreInfoAdapter.notifyDataSetChanged();
                return;
            } else
            {
                ToastUtility.showAddToBagToastMessages(getActionBar().getHeight(), ((String) (obj)));
                ((com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store)mStoreData.get(mStoreInfoAdapter.getItemPosition())).setErrorMess("");
                mStoreInfoAdapter.notifyDataSetChanged();
                return;
            }
        }
        if (mLayout != null && mLayout.getVisibility() == 0)
        {
            mLayout.setVisibility(8);
        }
        if (mHintText != null)
        {
            mHintText.setVisibility(8);
        }
        if (storeListView != null)
        {
            storeListView.setVisibility(0);
        }
        if (mSuggContainer != null)
        {
            mSuggContainer.setVisibility(8);
        }
        if ((obj instanceof SparseArray) && (SparseArray)obj != null && ((SparseArray)obj).size() > 0)
        {
            mStoreData = UtilityMethods.asList((SparseArray)obj);
            if (mStoreData != null && mStoreData.size() > 0)
            {
                mIsShowAllStore = true;
                (new FindinStoreActivity.ToggleStoreTask(this)).execute(new Boolean[] {
                    Boolean.valueOf(mIsShowAllStore)
                });
                return;
            } else
            {
                showNoStoreFound();
                return;
            }
        } else
        {
            showNoStoreFound();
            return;
        }
    }
}
