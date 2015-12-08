// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;
import com.google.zxing.Result;
import com.google.zxing.client.android.CaptureActivity;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.Logger;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.helper.analytics.AnalyticsHelper;
import com.kohls.mcommerce.opal.helper.preference.PreferenceHelper;
import com.kohls.mcommerce.opal.wallet.digby.LPMessageDetailActivity;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            ScanHelpActivity

public class ScanActivity extends CaptureActivity
{

    public static final int REQUEST_SCAN_DISCOUNTS = 1003;
    public static final int REQUEST_SCAN_LOYALTYNUMBER = 1002;
    public static final int REQUEST_SCAN_PDP_REVIEWS = 1004;
    public static final int REQUEST_SCAN_PRODUCT_FOR_LIST = 1006;
    public static final int REQUEST_SCAN_REGISTRY = 1005;
    public static final int REQUEST_SCAN_SEARCHRESULTS = 1001;
    public static final String SCAN_REQUEST_TYPE = "scan_request";
    final String TAG = com/kohls/mcommerce/opal/framework/view/activity/ScanActivity.getName();
    private final int WALLET_CODE_SIZE = 13;
    private boolean isQRCode;
    private String listID;
    private String mListId;
    private String registryId;
    private int scanRequestType;

    public ScanActivity()
    {
        isQRCode = false;
    }

    private HashMap getKohlsCode(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        s = null;
_L8:
        return s;
_L2:
        String s1;
        HashMap hashmap;
        hashmap = new HashMap();
        s1 = s;
        try
        {
            isQRCode = false;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            hashmap.put("SCAN_PDP_BARCODE", s1);
            return hashmap;
        }
        s1 = s;
        listID = UtilityMethods.getListCopy(s);
        s1 = s;
        if (listID == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        s1 = s;
        if (listID.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        s1 = s;
        isQRCode = true;
        return hashmap;
        String s2;
        s1 = s;
        s2 = s;
        if (!s.startsWith("KOHLSQRCODE"))
        {
            break MISSING_BLOCK_LABEL_150;
        }
        s1 = s;
        s2 = s.substring(s.indexOf("=") + 1);
        s1 = s2;
        s = s2;
        if (s2.contains("http://"))
        {
            break MISSING_BLOCK_LABEL_141;
        }
        s1 = s2;
        s = (new StringBuilder()).append("http://").append(s2).toString();
        s1 = s;
        isQRCode = true;
        s2 = s;
        s1 = s2;
        if (!isQRCode) goto _L4; else goto _L3
_L3:
        s1 = s2;
        KohlsPhoneApplication.getInstance().getKohlsPref().saveString("scanType", "QRCODE");
_L11:
        s1 = s2;
        KohlsPhoneApplication.getInstance().getKohlsPref().saveString("scanCode", s2);
        s1 = s2;
        s = new URL(s2);
        s1 = s2;
        if (!s.getHost().contains("kohls.com"))
        {
            break MISSING_BLOCK_LABEL_398;
        }
        s1 = s2;
        s = s.getQuery();
        if (s == null) goto _L6; else goto _L5
_L5:
        s1 = s2;
        String as[] = s.split("&");
        s1 = s2;
        int j = as.length;
        int i = 0;
_L12:
        s = hashmap;
        if (i >= j) goto _L8; else goto _L7
_L7:
        s = as[i];
        s1 = s2;
        if (!s.startsWith("keyword")) goto _L10; else goto _L9
_L9:
        s1 = s2;
        hashmap.put("SCAN_PDP_QR", s.substring(s.indexOf("=") + 1));
        return hashmap;
_L4:
        s1 = s2;
        KohlsPhoneApplication.getInstance().getKohlsPref().saveString("scanType", "BARCODE");
          goto _L11
_L10:
        s1 = s2;
        if (!s.startsWith("id"))
        {
            break MISSING_BLOCK_LABEL_354;
        }
        s1 = s2;
        hashmap.put("SCAN_PMP_ID", s.substring(s.indexOf("=") + 1).replace("%2B", "+"));
        s1 = s2;
        if (!s.startsWith("sort"))
        {
            break MISSING_BLOCK_LABEL_387;
        }
        s1 = s2;
        hashmap.put("SCAN_PMP_SORT", s.substring(s.indexOf("=") + 1));
        i++;
          goto _L12
_L6:
        return null;
        return null;
          goto _L11
    }

    private HashMap getLoyaltyNumber(String s)
    {
        if (s == null)
        {
            return null;
        }
        HashMap hashmap = new HashMap();
        if (TextUtils.isDigitsOnly(s) && s.length() == 11)
        {
            hashmap.put("SCAN_LOYALTY_ID", s);
            return hashmap;
        } else
        {
            return null;
        }
    }

    public void handleDecode(Result result, Bitmap bitmap, float f)
    {
        Object obj;
        boolean flag;
        boolean flag1;
        Logger.debug(TAG, (new StringBuilder()).append("Original Scanned data === ").append(result).toString());
        bitmap = null;
        obj = null;
        flag = false;
        flag1 = false;
        if (result == null) goto _L2; else goto _L1
_L1:
        scanRequestType;
        JVM INSTR tableswitch 1001 1006: default 84
    //                   1001 157
    //                   1002 298
    //                   1003 317
    //                   1004 268
    //                   1005 347
    //                   1006 377;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        flag = flag1;
        bitmap = obj;
_L11:
        Logger.debug(TAG, (new StringBuilder()).append("Processed Scanned data === ").append(bitmap).toString());
_L2:
        HashMap hashmap;
        if (!flag)
        {
            if (bitmap == null)
            {
                Toast.makeText(this, getResources().getString(0x7f0803d6), 1).show();
                setResult(2, null);
                AnalyticsHelper.sendAnalyticsOnScanFail();
            } else
            {
                result = new Intent(this, com/kohls/mcommerce/opal/framework/view/activity/ScanHelpActivity);
                bitmap.put("registryId", registryId);
                result.putExtra("SCAN_DATA", bitmap);
                bitmap = new Bundle();
                bitmap.putString("listid", listID);
                result.putExtras(bitmap);
                setResult(-1, result);
                listID = null;
            }
        }
        finish();
        return;
_L4:
        hashmap = getKohlsCode(result.getText().trim());
        bitmap = hashmap;
        flag = flag1;
        if (result != null)
        {
            bitmap = hashmap;
            flag = flag1;
            if (!TextUtils.isEmpty(result.getText()))
            {
                bitmap = hashmap;
                flag = flag1;
                if (result.getText().length() > 13)
                {
                    bitmap = new Intent(getApplicationContext(), com/kohls/mcommerce/opal/wallet/digby/LPMessageDetailActivity);
                    bitmap.putExtra("isScanned", true);
                    bitmap.putExtra("messageId", result.getText().trim());
                    startActivity(bitmap);
                    flag = true;
                    bitmap = hashmap;
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L7:
        bitmap = new HashMap();
        bitmap.put("SCAN_PRODUCT_REVIEW", result.getText().trim());
        flag = flag1;
        continue; /* Loop/switch isn't completed */
_L5:
        bitmap = getLoyaltyNumber(result.getText().trim());
        flag = flag1;
        continue; /* Loop/switch isn't completed */
_L6:
        bitmap = new HashMap();
        bitmap.put("SCAN_DISCOUNT_ID", result.getText().trim());
        flag = flag1;
        continue; /* Loop/switch isn't completed */
_L8:
        bitmap = new HashMap();
        bitmap.put("SCAN_FIND_REGISTRY_ID", result.getText().trim());
        flag = flag1;
        continue; /* Loop/switch isn't completed */
_L9:
        bitmap = getKohlsCode(result.getText().trim());
        bitmap.put("product for list", result.getText().trim());
        flag = flag1;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        AnalyticsHelper.sendAnalyticsOnScannerStart();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        return true;
    }

    protected void onResume()
    {
        super.onResume();
        if (getIntent().hasExtra("scan_request"))
        {
            scanRequestType = getIntent().getExtras().getInt("scan_request");
        }
        if (getIntent().getExtras().getString("registryId") != null && !"".equals(getIntent().getExtras().getString("registryId")))
        {
            registryId = getIntent().getExtras().getString("registryId");
        }
        if (getIntent().getExtras() != null)
        {
            mListId = getIntent().getExtras().getString("list id");
        }
        if (getIntent().getBooleanExtra("LAUNCHED_FROM_TOOLS", false))
        {
            findViewById(0x7f0d01c7).setVisibility(0);
        }
        findViewById(0x7f0d01c6).setVisibility(0);
        findViewById(0x7f0d01c6).setOnClickListener(new android.view.View.OnClickListener() {

            final ScanActivity this$0;

            public void onClick(View view)
            {
                finish();
            }

            
            {
                this$0 = ScanActivity.this;
                super();
            }
        });
    }
}
