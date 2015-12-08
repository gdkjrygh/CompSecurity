// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.activity;

import com.pinterest.api.model.ModelHelper;
import com.pinterest.base.Services;
import com.pinterest.common.async.BackgroundTask;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.kit.utils.SearchTypeaheadUtils;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.activity.task.activity:
//            MainActivity

class cacheVersionInfo extends BackgroundTask
{

    PinterestJsonObject cacheVersionInfo;
    final MainActivity this$0;

    public void run()
    {
        SearchTypeaheadUtils.persistCacheInfo(cacheVersionInfo);
        boolean flag = Preferences.persisted().getBoolean("PREF_TYPEAHEAD_CACHE_READY", false);
        if (!cacheVersionInfo.a("is_latest_version").booleanValue() || ModelHelper.getSearchTypeaheadTableSize() == 0L)
        {
            Preferences.persisted().set("PREF_TYPEAHEAD_CACHE_READY", false);
            flag = false;
        }
        if (!flag)
        {
            Services.startTypeaheadCacheService();
        }
    }

    public (PinterestJsonObject pinterestjsonobject)
    {
        this$0 = MainActivity.this;
        super();
        cacheVersionInfo = pinterestjsonobject;
    }
}
