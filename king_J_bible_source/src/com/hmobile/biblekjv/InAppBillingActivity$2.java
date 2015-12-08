// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.android.vending.billing.IInAppBillingService;
import java.util.ArrayList;

// Referenced classes of package com.hmobile.biblekjv:
//            InAppBillingActivity

class this._cls0
    implements android.view.ivity._cls2
{

    final InAppBillingActivity this$0;

    public void onClick(View view)
    {
        ArrayList arraylist;
        Bundle bundle = mService.getPurchases(3, getPackageName(), "inapp", null);
        if (bundle.getInt("RESPONSE_CODE") != 0)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        view = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        arraylist = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        bundle.getStringArrayList("INAPP_DATA_SIGNATURE");
        bundle.getString("INAPP_CONTINUATION_TOKEN");
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

    vice()
    {
        this$0 = InAppBillingActivity.this;
        super();
    }
}
