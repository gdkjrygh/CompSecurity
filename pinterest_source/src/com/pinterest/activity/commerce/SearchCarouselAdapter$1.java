// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import android.view.View;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.commerce:
//            SearchCarouselAdapter

class this._cls0
    implements android.view.hCarouselAdapter._cls1
{

    final SearchCarouselAdapter this$0;

    public void onClick(View view)
    {
        Events.post(new Navigation(Location.SEARCH_PIN_COMMERCE, SearchCarouselAdapter.access$000(SearchCarouselAdapter.this)));
    }

    ()
    {
        this$0 = SearchCarouselAdapter.this;
        super();
    }
}
