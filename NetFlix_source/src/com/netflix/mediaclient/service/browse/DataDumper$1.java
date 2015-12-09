// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.LoMo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            SimpleBrowseAgentCallback, DataDumper, BrowseWebClient

class gentCallback extends SimpleBrowseAgentCallback
{

    final DataDumper this$0;

    public void onLoMosFetched(List list, int i)
    {
        super.onLoMosFetched(list, i);
        Log.v("DataDumper", (new StringBuilder()).append("lomos fetched, count: ").append(list.size()).toString());
        ArrayList arraylist = new ArrayList(list);
        LoMo lomo;
        for (list = list.iterator(); list.hasNext(); DataDumper.access$100(DataDumper.this).fetchVideos(lomo, 0, 250, new deosCallback(DataDumper.this, lomo, arraylist)))
        {
            lomo = (LoMo)list.next();
            DataDumper.access$000(DataDumper.this).put(lomo, null);
        }

    }

    nt()
    {
        this$0 = DataDumper.this;
        super();
    }
}
