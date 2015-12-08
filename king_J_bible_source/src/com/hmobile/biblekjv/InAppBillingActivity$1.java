// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.android.vending.billing.IInAppBillingService;
import com.hmobile.common.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.hmobile.biblekjv:
//            InAppBillingActivity

class this._cls0
    implements ServiceConnection
{

    final InAppBillingActivity this$0;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        Utils.LogInfo("in onServiceConnected **********************");
        mService = com.android.vending.billing.ub.asInterface(ibinder);
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

    vice()
    {
        this$0 = InAppBillingActivity.this;
        super();
    }
}
