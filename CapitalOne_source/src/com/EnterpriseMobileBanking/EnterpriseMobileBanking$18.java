// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.app.ProgressDialog;
import android.view.View;
import com.EnterpriseMobileBanking.Plugins.COFBusy;
import com.EnterpriseMobileBanking.Plugins.COFBusyIndicator;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;

// Referenced classes of package com.EnterpriseMobileBanking:
//            EnterpriseMobileBanking

class this._cls0
    implements Runnable
{

    final EnterpriseMobileBanking this$0;

    public void run()
    {
        EnterpriseMobileBanking.access$1100(EnterpriseMobileBanking.this).getRootView().setVisibility(0);
        if (EnterpriseMobileBanking.access$400(EnterpriseMobileBanking.this).isShowing())
        {
            EnterpriseMobileBanking.access$400(EnterpriseMobileBanking.this).dismiss();
        }
        JSONArray jsonarray = new JSONArray();
        jsonarray.put(getString(0x7f0900f9));
        jsonarray.put(true);
        jsonarray.put(30);
        COFBusyIndicator.setBusy(new COFBusy(EnterpriseMobileBanking.this, EnterpriseMobileBanking.access$1200(EnterpriseMobileBanking.this), jsonarray, null, true));
    }

    ()
    {
        this$0 = EnterpriseMobileBanking.this;
        super();
    }
}
