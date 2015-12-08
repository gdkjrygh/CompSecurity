// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.dynamicgrid;

import com.pinterest.adapter.PinGridAdapter;
import com.pinterest.api.model.Feed;
import com.pinterest.ui.grid.PinterestGridView;

// Referenced classes of package com.pinterest.activity.dynamicgrid:
//            DynamicGridFragment

class this._cls0
    implements com.pinterest.base.r
{

    final DynamicGridFragment this$0;

    public void onEventMainThread(com.pinterest.api.model.edStoryEvent edstoryevent)
    {
        edstoryevent = edstoryevent.getDismissedStory();
        if (((PinGridAdapter)DynamicGridFragment.access$000(DynamicGridFragment.this)).getDataSource() != null)
        {
            ((PinGridAdapter)DynamicGridFragment.access$100(DynamicGridFragment.this)).getDataSource().removeStory(edstoryevent);
        }
        ((PinGridAdapter)DynamicGridFragment.access$200(DynamicGridFragment.this)).notifyDataSetChanged();
        DynamicGridFragment.access$300(DynamicGridFragment.this).reset();
    }

    t()
    {
        this$0 = DynamicGridFragment.this;
        super();
    }
}
