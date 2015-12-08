// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.fragment;

import com.pinterest.common.async.BackgroundTask;
import com.pinterest.offline.OfflineDataInfo;
import com.pinterest.ui.text.PTextView;

// Referenced classes of package com.pinterest.activity.settings.fragment:
//            OfflineBoardsSettingsFragment

class cacheSize extends BackgroundTask
{

    public String cacheSize;
    final cacheSize this$1;

    public void onFinish()
    {
        super.onFinish();
        if (OfflineBoardsSettingsFragment.access$300(_fld0) != null)
        {
            OfflineBoardsSettingsFragment.access$300(_fld0).setText(cacheSize);
        }
    }

    public void run()
    {
        cacheSize = OfflineDataInfo.g().toString();
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
        cacheSize = "";
    }
}
