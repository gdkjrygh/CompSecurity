// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.base;

import com.pinterest.analytics.PinterestDeepLinkMetaData;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.kit.log.PLog;
import java.util.Map;
import java.util.TreeMap;

final class 
    implements Runnable
{

    public final void run()
    {
        TreeMap treemap = new TreeMap();
        String s = PinterestDeepLinkMetaData.c();
        if (s != null)
        {
            treemap.put("data", s);
            PLog.info("INSTALL_METADATA submitting: %s", new Object[] {
                s
            });
        }
        class _cls1 extends BaseApiResponseHandler
        {

            final ApplicationInfo._cls2 this$0;

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

            _cls1()
            {
                this$0 = ApplicationInfo._cls2.this;
                super();
            }
        }

        AnalyticsApi.a(treemap, new _cls1());
    }

    ()
    {
    }
}
