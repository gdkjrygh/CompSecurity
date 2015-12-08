// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.explore;

import com.pinterest.activity.explore.adapter.ExploreBaseAdapter;
import com.pinterest.common.async.BackgroundResult;
import java.util.List;

// Referenced classes of package com.pinterest.activity.explore:
//            ExploreFragment

class > extends BackgroundResult
{

    final ExploreFragment this$0;

    public void onFinish(Object obj)
    {
        if ((obj instanceof List) && ExploreFragment.access$000(ExploreFragment.this) != null)
        {
            ((ExploreBaseAdapter)ExploreFragment.access$100(ExploreFragment.this)).setRecentCategories((List)obj);
        }
    }

    eAdapter()
    {
        this$0 = ExploreFragment.this;
        super();
    }
}
