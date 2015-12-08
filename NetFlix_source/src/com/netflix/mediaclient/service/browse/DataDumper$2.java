// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.Genre;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            SimpleBrowseAgentCallback, DataDumper, BrowseWebClient

class gentCallback extends SimpleBrowseAgentCallback
{

    final DataDumper this$0;

    public void onGenresFetched(List list, int i)
    {
        super.onGenresFetched(list, i);
        Log.v("DataDumper", (new StringBuilder()).append("genres fetched, count: ").append(list.size()).toString());
        ArrayList arraylist = new ArrayList(list);
        Genre genre;
        for (list = list.iterator(); list.hasNext(); DataDumper.access$100(DataDumper.this).fetchGenreVideos(genre, 0, 250, new deosCallback(DataDumper.this, genre, arraylist)))
        {
            genre = (Genre)list.next();
            DataDumper.access$000(DataDumper.this).put(genre, null);
        }

    }

    nt()
    {
        this$0 = DataDumper.this;
        super();
    }
}
