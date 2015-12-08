// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendapin.adapter;

import java.util.List;

// Referenced classes of package com.pinterest.activity.sendapin.adapter:
//            PeopleSearchAdapter

class val.newItems
    implements Runnable
{

    final PeopleSearchAdapter this$0;
    final List val$newItems;
    final String val$query;

    public void run()
    {
        if (val$query.equals(_currentQuery))
        {
            PeopleSearchAdapter.access$002(PeopleSearchAdapter.this, val$newItems);
        }
        notifyDataSetChanged();
    }

    ()
    {
        this$0 = final_peoplesearchadapter;
        val$query = s;
        val$newItems = List.this;
        super();
    }
}
