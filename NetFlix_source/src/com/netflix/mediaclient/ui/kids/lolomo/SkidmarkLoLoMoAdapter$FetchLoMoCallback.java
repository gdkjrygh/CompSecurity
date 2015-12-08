// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.lolomo;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.LoMo;
import com.netflix.mediaclient.servicemgr.LoMoType;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.kids.lolomo:
//            SkidmarkLoLoMoAdapter

private class requestId extends LoggingManagerCallback
{

    private final long requestId;
    final SkidmarkLoLoMoAdapter this$0;

    private void handleResult(List list, int i)
    {
        if (requestId != SkidmarkLoLoMoAdapter.access$400(SkidmarkLoLoMoAdapter.this))
        {
            Log.v("SkidmarkLoLoMoAdapter", "Ignoring stale onLoMosFetched callback");
        } else
        {
            if (i != 0)
            {
                Log.w("SkidmarkLoLoMoAdapter", "Invalid status code");
                notifyDataSetChanged();
                return;
            }
            if (list == null || list.size() <= 0)
            {
                Log.v("SkidmarkLoLoMoAdapter", "No loMos in response");
                notifyDataSetChanged();
                return;
            }
            if (Log.isLoggable("SkidmarkLoLoMoAdapter", 2))
            {
                Log.v("SkidmarkLoLoMoAdapter", (new StringBuilder()).append("Got ").append(list.size()).append(" items").toString());
            }
            SkidmarkLoLoMoAdapter.access$500(SkidmarkLoLoMoAdapter.this).clear();
            SkidmarkLoLoMoAdapter.access$602(SkidmarkLoLoMoAdapter.this, list.size());
            list = list.iterator();
            while (list.hasNext()) 
            {
                LoMo lomo = (LoMo)list.next();
                SkidmarkLoLoMoAdapter.access$500(SkidmarkLoLoMoAdapter.this).put(lomo, new ArrayList(10));
                Log.v("SkidmarkLoLoMoAdapter", (new StringBuilder()).append("Fetching videos for lomo: ").append(lomo.getId()).append(", type: ").append(lomo.getType()).toString());
                if (lomo.getType() == LoMoType.CONTINUE_WATCHING)
                {
                    manager.fetchCWVideos(0, 2, new k(SkidmarkLoLoMoAdapter.this, lomo));
                } else
                {
                    manager.fetchVideos(lomo, 0, 4, new k(SkidmarkLoLoMoAdapter.this, lomo));
                }
                if (lomo.getType() == LoMoType.CHARACTERS)
                {
                    int _tmp = SkidmarkLoLoMoAdapter.access$608(SkidmarkLoLoMoAdapter.this);
                    manager.fetchVideos(lomo, 5, 10 - 1, new k(SkidmarkLoLoMoAdapter.this, lomo));
                }
            }
        }
    }

    public void onLoMosFetched(List list, int i)
    {
        super.onLoMosFetched(list, i);
        handleResult(list, i);
    }

    public k(long l)
    {
        this$0 = SkidmarkLoLoMoAdapter.this;
        super("SkidmarkLoLoMoAdapter");
        requestId = l;
    }
}
