// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.adapter;

import java.util.List;

// Referenced classes of package com.pinterest.activity.search.adapter:
//            ActionFilterAdapter

class this._cls0
    implements Runnable
{

    final ActionFilterAdapter this$0;

    public void run()
    {
        _items.clear();
        ActionFilterAdapter.access$002(ActionFilterAdapter.this, null);
        _topItems.clear();
        ActionFilterAdapter.access$102(ActionFilterAdapter.this, null);
        notifyDataSetChanged();
    }

    A()
    {
        this$0 = ActionFilterAdapter.this;
        super();
    }
}
