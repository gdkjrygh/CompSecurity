// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.adapter;

import java.util.List;

// Referenced classes of package com.pinterest.activity.search.adapter:
//            ActionFilterGridAdapter

class this._cls0
    implements Runnable
{

    final ActionFilterGridAdapter this$0;

    public void run()
    {
        _items.clear();
        notifyDataSetChanged();
    }

    ()
    {
        this$0 = ActionFilterGridAdapter.this;
        super();
    }
}
