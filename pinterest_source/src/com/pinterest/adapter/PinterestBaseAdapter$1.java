// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.adapter;

import java.util.HashMap;

// Referenced classes of package com.pinterest.adapter:
//            PinterestBaseAdapter

class it> extends com.pinterest.api.model.>
{

    final PinterestBaseAdapter this$0;
    final com.pinterest.api.model.p val$dataListener;

    public void onChange(int i, boolean flag)
    {
        _cachedItemHeights.put(Integer.valueOf(i), null);
        val$dataListener.nge(i, flag);
        notifyDataSetChanged();
    }

    public void onStart(boolean flag)
    {
        val$dataListener.rt(flag);
    }

    public void onStop()
    {
        val$dataListener.p();
    }

    ()
    {
        this$0 = final_pinterestbaseadapter;
        val$dataListener = com.pinterest.api.model.l.dataListener.this;
        super();
    }
}
