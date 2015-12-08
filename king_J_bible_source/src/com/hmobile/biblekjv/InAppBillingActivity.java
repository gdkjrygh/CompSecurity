// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import android.widget.Button;
import com.android.vending.billing.IInAppBillingService;
import com.hmobile.common.Utils;
import com.hmobile.util.IabHelper;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class InAppBillingActivity extends Activity
{

    static final String SKU_Pay = "remove_ads";
    static final String TAG = "HollyBible";
    static boolean mIsPayed = false;
    Button btnpay;
    IabHelper mHelper;
    com.hmobile.util.IabHelper.OnIabPurchaseFinishedListener mPurchaseFinishedListener;
    IInAppBillingService mService;
    ServiceConnection mServiceConn;
    JSONArray skuArray;
    ArrayList updateProductData;

    public InAppBillingActivity()
    {
        mServiceConn = new ServiceConnection() {

            final InAppBillingActivity this$0;

            public void onServiceConnected(ComponentName componentname, IBinder ibinder)
            {
                Utils.LogInfo("in onServiceConnected **********************");
                mService = com.android.vending.billing.IInAppBillingService.Stub.asInterface(ibinder);
                componentname = new ArrayList();
                componentname.add("android.test.purchased");
                skuArray = new JSONArray(componentname);
                ibinder = new Bundle();
                ibinder.putStringArrayList("ITEM_ID_LIST", componentname);
                componentname = mService.getSkuDetails(3, getPackageName(), "inapp", ibinder);
                if (componentname.getInt("RESPONSE_CODE") != 0)
                {
                    break MISSING_BLOCK_LABEL_303;
                }
                componentname = componentname.getStringArrayList("DETAILS_LIST");
                Utils.LogInfo((new StringBuilder("RESPONSE LIST SIZE********************** ")).append(componentname.size()).toString());
                componentname = componentname.iterator();
_L2:
                if (!componentname.hasNext())
                {
                    return;
                }
                ibinder = (String)componentname.next();
                Utils.LogInfo("in FOR LOOP**********************");
                Object obj = new JSONObject(ibinder);
                ibinder = ((JSONObject) (obj)).getString("productId");
                obj = ((JSONObject) (obj)).getString("price");
                Utils.LogInfo((new StringBuilder("BEFORE IF PRICE********************** ")).append(((String) (obj))).toString());
                if (ibinder.equals("android.test.purchased"))
                {
                    Utils.LogInfo((new StringBuilder("in SKU PRICE ********************** ")).append(((String) (obj))).toString());
                    ibinder = (PendingIntent)mService.getBuyIntent(3, getPackageName(), ibinder, "inapp", "").getParcelable("BUY_INTENT");
                    startIntentSenderForResult(ibinder.getIntentSender(), 1001, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
                }
                if (true) goto _L2; else goto _L1
_L1:
                componentname;
            }

            public void onServiceDisconnected(ComponentName componentname)
            {
                mService = null;
            }

            
            {
                this$0 = InAppBillingActivity.this;
                super();
            }
        };
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        String s;
        if (i != 1001)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        intent.getIntExtra("RESPONSE_CODE", 0);
        s = intent.getStringExtra("INAPP_PURCHASE_DATA");
        intent.getStringExtra("INAPP_DATA_SIGNATURE");
        if (j != -1)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        intent = (new JSONObject(s)).getString("productId");
        Utils.LogInfo((new StringBuilder("You have bought the ")).append(intent).toString());
        return;
        intent;
        Utils.LogInfo("Failed to parse purchase data.");
        intent.printStackTrace();
        return;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030023);
        btnpay = (Button)findViewById(0x7f0e00aa);
        getString(0x7f0700ca);
        bindService(new Intent("com.android.vending.billing.InAppBillingService.BIND"), mServiceConn, 1);
        btnpay.setOnClickListener(new android.view.View.OnClickListener() {

            final InAppBillingActivity this$0;

            public void onClick(View view)
            {
                ArrayList arraylist;
                Bundle bundle1 = mService.getPurchases(3, getPackageName(), "inapp", null);
                if (bundle1.getInt("RESPONSE_CODE") != 0)
                {
                    break MISSING_BLOCK_LABEL_108;
                }
                view = bundle1.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                arraylist = bundle1.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                bundle1.getStringArrayList("INAPP_DATA_SIGNATURE");
                bundle1.getString("INAPP_CONTINUATION_TOKEN");
                int i = 0;
_L2:
                if (i >= arraylist.size())
                {
                    return;
                }
                String s = (String)arraylist.get(i);
                s = (String)view.get(i);
                i++;
                if (true) goto _L2; else goto _L1
_L1:
                view;
                view.printStackTrace();
            }

            
            {
                this$0 = InAppBillingActivity.this;
                super();
            }
        });
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (mService != null)
        {
            unbindService(mServiceConn);
        }
    }

}
