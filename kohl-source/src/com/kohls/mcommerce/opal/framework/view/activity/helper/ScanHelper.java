// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity.helper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.framework.view.activity.BeautyOperations;
import com.kohls.mcommerce.opal.framework.view.activity.CollectionsActivity;
import com.kohls.mcommerce.opal.framework.view.activity.HomeActivity;
import com.kohls.mcommerce.opal.framework.view.activity.ProductDetailsActivity;
import com.kohls.mcommerce.opal.helper.analytics.AnalyticsHelper;
import java.util.HashMap;

public class ScanHelper
{

    private Activity mActivity;

    public ScanHelper(Activity activity)
    {
        mActivity = activity;
    }

    public void handleScanResult(int i, int j, Intent intent)
    {
        if (i != 2 && i != 1004) goto _L2; else goto _L1
_L1:
        if (j != -1 || !intent.hasExtra("SCAN_DATA")) goto _L4; else goto _L3
_L3:
        if (!UtilityMethods.isNetworkConnected(mActivity)) goto _L6; else goto _L5
_L5:
        HashMap hashmap;
        hashmap = (HashMap)intent.getExtras().getSerializable("SCAN_DATA");
        if (intent.getStringExtra("listid") != null)
        {
            (new BeautyOperations(mActivity, intent.getStringExtra("listid"))).showDialogFromQRcode();
        }
        if (hashmap.size() <= 0) goto _L8; else goto _L7
_L7:
        if (!hashmap.containsKey("SCAN_PMP_ID")) goto _L10; else goto _L9
_L9:
        intent = new Intent(mActivity, com/kohls/mcommerce/opal/framework/view/activity/HomeActivity);
        intent.putExtra("key_search_keyword", (String)hashmap.get("SCAN_PMP_ID"));
        intent.putExtra("INTENT_FROM_SCAN", true);
        intent.putExtra("key_is_from_search", true);
        intent.putExtra("open_screen_key", "open_product_matrix");
        intent.setFlags(0x4000000);
        mActivity.startActivity(intent);
_L8:
        return;
_L10:
        if (hashmap.containsKey("SCAN_PRODUCT_REVIEW"))
        {
            UtilityMethods.openRatingReviewActivity(mActivity, (String)hashmap.get("SCAN_PDP_BARCODE"), null);
            return;
        }
        if (hashmap.containsKey("SCAN_PMP_BARCODE_SEARCH_ID"))
        {
            intent = new Intent(mActivity, com/kohls/mcommerce/opal/framework/view/activity/HomeActivity);
            intent.putExtra("key_is_from_search", true);
            intent.putExtra("key_search_keyword", (String)hashmap.get("SCAN_PMP_BARCODE_SEARCH_ID"));
            intent.putExtra("INTENT_FROM_SCAN", true);
            intent.putExtra("open_screen_key", "open_product_matrix");
            intent.setFlags(0x4000000);
            mActivity.startActivity(intent);
            return;
        }
        intent = new Intent();
        intent.putExtra("key_category_id", (String)hashmap.get("SCAN_PDP_QR"));
        if (hashmap.get("SCAN_PDP_QR") != null && ((String)hashmap.get("SCAN_PDP_QR")).startsWith("c"))
        {
            intent.setClass(mActivity, com/kohls/mcommerce/opal/framework/view/activity/CollectionsActivity);
        } else
        {
            intent.setClass(mActivity, com/kohls/mcommerce/opal/framework/view/activity/ProductDetailsActivity);
        }
        intent.putExtra("key_upc_code", (String)hashmap.get("SCAN_PDP_BARCODE"));
        intent.putExtra("INTENT_FROM_SCAN", true);
        intent.putExtra("from", "ScanHelper");
        mActivity.startActivityForResult(intent, 3);
        return;
_L6:
        showScanErrorDialog(mActivity.getString(0x7f0803be));
        return;
_L4:
        if (j == 2)
        {
            showScanErrorDialog(mActivity.getString(0x7f0804a7));
            AnalyticsHelper.sendAnalyticsOnScanFail();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if ((i == 3 || i == 4) && j == 2)
        {
            showScanErrorDialog(mActivity.getString(0x7f08044c));
            AnalyticsHelper.sendAnalyticsOnScanFail();
            return;
        }
        if (true) goto _L8; else goto _L11
_L11:
    }

    public void showScanErrorDialog(String s)
    {
        UtilityMethods.getAlertDialog(mActivity, s, mActivity.getString(0x7f0804a3), mActivity.getString(0x7f0800c7), new _cls1()).show();
    }


    /* member class not found */
    class _cls1 {}

}
