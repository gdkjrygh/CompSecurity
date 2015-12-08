// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.base;

import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustEvent;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.kit.log.PLog;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.base:
//            ApplicationInfo

class r extends BaseApiResponseHandler
{

    final nstallId this$0;

    public void onSuccess(PinterestJsonObject pinterestjsonobject)
    {
        super.onSuccess(pinterestjsonobject);
        PLog.info("Report install successful", new Object[0]);
        AnalyticsApi.a("install_submit");
        Preferences.persisted().set("PREF_FIRST_LAUNCH", false);
        pinterestjsonobject = new AdjustEvent("6mxvu6");
        pinterestjsonobject.a("unauth_id", ApplicationInfo.getInstallId());
        Adjust.a(pinterestjsonobject);
    }

    nObject()
    {
        this$0 = this._cls0.this;
        super();
    }
}
