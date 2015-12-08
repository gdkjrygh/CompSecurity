// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.category.fragment;

import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.category.fragment:
//            CategoryFragment

class this._cls0
    implements com.pinterest.base.iber
{

    final CategoryFragment this$0;

    public void onEventMainThread(com.pinterest.ui.grid.adEvent adevent)
    {
        stopStopwatch();
        Events.unregister(CategoryFragment.access$200(CategoryFragment.this), new Class[] {
            com/pinterest/ui/grid/PinGridCell$ImageLoadEvent
        });
    }

    A()
    {
        this$0 = CategoryFragment.this;
        super();
    }
}
