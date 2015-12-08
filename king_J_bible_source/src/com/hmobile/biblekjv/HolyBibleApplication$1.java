// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.android.vending.billing.IInAppBillingService;
import com.hmobile.common.NotificationCenter;
import com.hmobile.common.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

// Referenced classes of package com.hmobile.biblekjv:
//            HolyBibleApplication

class vice
    implements ServiceConnection
{

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        HolyBibleApplication.mService = com.android.vending.billing.ub.asInterface(ibinder);
        componentname = new ArrayList();
        componentname.add(HolyBibleApplication.access$0().getString(0x7f0700b9));
        ibinder = new Bundle();
        ibinder.putStringArrayList("ITEM_ID_LIST", componentname);
        componentname = HolyBibleApplication.mService.getSkuDetails(3, HolyBibleApplication.access$0().getPackageName(), "inapp", ibinder);
        if (componentname.getInt("RESPONSE_CODE") != 0) goto _L2; else goto _L1
_L1:
        componentname = componentname.getStringArrayList("DETAILS_LIST").iterator();
_L3:
        if (componentname.hasNext())
        {
            break MISSING_BLOCK_LABEL_99;
        }
_L2:
        NotificationCenter.Instance().postNotification("purchase");
        return;
        try
        {
            ibinder = new JSONObject((String)componentname.next());
            String s = ibinder.getString("productId");
            ibinder.getString("price");
            s.equalsIgnoreCase(HolyBibleApplication.access$0().getString(0x7f0700b9));
            HolyBibleApplication.isPurchased = HolyBibleApplication.isItemPurchased();
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname)
        {
            return;
        }
          goto _L3
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        HolyBibleApplication.mService = null;
        Utils.LogInfo("in onServiceDisconnected **********************");
    }

    vice()
    {
    }
}
