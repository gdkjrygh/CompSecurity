// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.explore;

import android.os.Handler;
import com.pinterest.kit.log.PLog;

// Referenced classes of package com.pinterest.activity.explore:
//            ContextualExploreFragment

class this._cls0
    implements Runnable
{

    final ContextualExploreFragment this$0;

    public void run()
    {
        ContextualExploreFragment.access$500(ContextualExploreFragment.this);
        if (isAdded() && isActive() && ContextualExploreFragment.access$600(ContextualExploreFragment.this) != null)
        {
            PLog.log("Rescheduling another runnable for dumping impressions", new Object[0]);
            ContextualExploreFragment.access$600(ContextualExploreFragment.this).postDelayed(this, 30000L);
        }
    }

    ()
    {
        this$0 = ContextualExploreFragment.this;
        super();
    }
}
