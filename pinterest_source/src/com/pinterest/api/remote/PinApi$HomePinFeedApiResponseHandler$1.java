// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.google.gson.JsonPrimitive;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.PinFeed;
import com.pinterest.base.StopWatch;
import com.pinterest.common.async.BackgroundTask;
import com.pinterest.kit.data.DiskCache;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.reporting.CrashReporting;
import java.io.File;

// Referenced classes of package com.pinterest.api.remote:
//            PinApi

class a extends BackgroundTask
{

    final PinterestJsonObject a;
    final a b;
    private Feed c;

    public void onFinish()
    {
        super.onFinish();
        b.Success(c);
        long l = DiskCache.getCacheFile("MY_HOME_FEED").length();
        StopWatch.get().putAuxData("ttrfp_tmp_log", "sts_hf_fsize_post_write", new JsonPrimitive(new Long(l)));
    }

    public void run()
    {
        c = new PinFeed(a, cess._mth600(b));
        if (c == null)
        {
            CrashReporting.a(new NullPointerException((new StringBuilder("Failed to construct PinFeed response [")).append(a).append("] baseUrl [").append(cess._mth700(b)).append("] with json parser").toString()));
            return;
        }
        ((PinFeed)c).isHomeFeed = true;
        PinApi.a((PinFeed)c);
        try
        {
            Preferences.user().set("PREF_HOME_FEED_STREAMING", false);
            DiskCache.setJsonObject("MY_HOME_FEED", a);
            return;
        }
        catch (Exception exception)
        {
            CrashReporting.a(new Exception((new StringBuilder("MY_HOME_FEED org_msg:")).append(exception.getMessage()).append(" response [").append(a).append("]").toString()));
        }
    }

    ( , PinterestJsonObject pinterestjsonobject)
    {
        b = ;
        a = pinterestjsonobject;
        super();
    }
}
