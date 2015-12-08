// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.explore;

import android.view.View;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.explore:
//            ExploreFragment

class this._cls0
    implements android.view.er
{

    final ExploreFragment this$0;

    public void onClick(View view)
    {
        Events.post(new Navigation(Location.SEARCH, ""));
    }

    ()
    {
        this$0 = ExploreFragment.this;
        super();
    }
}
