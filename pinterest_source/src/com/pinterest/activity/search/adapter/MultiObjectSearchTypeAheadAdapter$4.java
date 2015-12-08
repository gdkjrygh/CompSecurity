// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.adapter;

import java.util.List;

// Referenced classes of package com.pinterest.activity.search.adapter:
//            MultiObjectSearchTypeAheadAdapter

class val.newData
    implements Runnable
{

    final MultiObjectSearchTypeAheadAdapter this$0;
    final List val$newData;

    public void run()
    {
        MultiObjectSearchTypeAheadAdapter.access$400(MultiObjectSearchTypeAheadAdapter.this, val$newData, com.pinterest.activity.search.event.G);
        notifyDataSetChanged();
    }

    ()
    {
        this$0 = final_multiobjectsearchtypeaheadadapter;
        val$newData = List.this;
        super();
    }
}
