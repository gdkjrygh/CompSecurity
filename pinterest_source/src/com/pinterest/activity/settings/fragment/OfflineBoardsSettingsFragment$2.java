// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.fragment;

import android.os.Handler;
import com.pinterest.offline.OfflineDataRetriever;
import com.pinterest.ui.progress.SmallLoadingView;

// Referenced classes of package com.pinterest.activity.settings.fragment:
//            OfflineBoardsSettingsFragment

class this._cls0
    implements Runnable
{

    final OfflineBoardsSettingsFragment this$0;

    public void run()
    {
        if (OfflineBoardsSettingsFragment.access$200(OfflineBoardsSettingsFragment.this) != null)
        {
            SmallLoadingView smallloadingview = OfflineBoardsSettingsFragment.access$200(OfflineBoardsSettingsFragment.this);
            class _cls1 extends BackgroundTask
            {

                public String cacheSize;
                final OfflineBoardsSettingsFragment._cls2 this$1;

                public void onFinish()
                {
                    super.onFinish();
                    if (OfflineBoardsSettingsFragment.access$300(this$0) != null)
                    {
                        OfflineBoardsSettingsFragment.access$300(this$0).setText(cacheSize);
                    }
                }

                public void run()
                {
                    cacheSize = OfflineDataInfo.g().toString();
                }

            _cls1()
            {
                this$1 = OfflineBoardsSettingsFragment._cls2.this;
                super();
                cacheSize = "";
            }
            }

            int i;
            if (OfflineDataRetriever.d().c())
            {
                i = 0;
            } else
            {
                i = 8;
            }
            smallloadingview.setVisibility(i);
        }
        if (OfflineBoardsSettingsFragment.access$300(OfflineBoardsSettingsFragment.this) != null)
        {
            (new _cls1()).execute();
        }
        if (OfflineBoardsSettingsFragment.access$400(OfflineBoardsSettingsFragment.this) != null && isActive())
        {
            OfflineBoardsSettingsFragment.access$400(OfflineBoardsSettingsFragment.this).postDelayed(this, 3000L);
        }
    }

    _cls1()
    {
        this$0 = OfflineBoardsSettingsFragment.this;
        super();
    }
}
