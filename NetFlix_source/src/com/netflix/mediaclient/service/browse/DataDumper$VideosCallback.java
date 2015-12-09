// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.LoMo;
import java.util.LinkedHashMap;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            SimpleBrowseAgentCallback, DataDumper

private class todo extends SimpleBrowseAgentCallback
{

    private final LoMo lomo;
    final DataDumper this$0;
    private final List todo;

    public void onVideosFetched(List list, int i)
    {
        if (DataDumper.access$200(DataDumper.this))
        {
            return;
        }
        super.onVideosFetched(list, i);
        if (i != 0)
        {
            Log.e("DataDumper", "Bummer!  Invalid status code during data dump :(");
            DataDumper.access$202(DataDumper.this, true);
            todo.clear();
        } else
        {
            DataDumper.access$000(DataDumper.this).put(lomo, list);
            todo.remove(lomo);
        }
        if (todo.size() == 0)
        {
            Log.v("DataDumper", "--LoMo data collection complete--");
            DataDumper.access$300(DataDumper.this, DataDumper.access$000(DataDumper.this));
            return;
        } else
        {
            Log.v("DataDumper", (new StringBuilder()).append("Remaining request count: ").append(todo.size()).toString());
            return;
        }
    }

    public (LoMo lomo1, List list)
    {
        this$0 = DataDumper.this;
        super();
        lomo = lomo1;
        todo = list;
    }
}
