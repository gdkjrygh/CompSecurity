// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lolomo;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.lolomo:
//            BaseLoLoMoAdapter

private class numItems extends LoggingManagerCallback
{

    private final int numItems;
    private final long requestId;
    final BaseLoLoMoAdapter this$0;

    private void handleResult(List list, int i)
    {
        BaseLoLoMoAdapter.access$002(BaseLoLoMoAdapter.this, true);
        BaseLoLoMoAdapter.access$102(BaseLoLoMoAdapter.this, false);
        if (requestId != BaseLoLoMoAdapter.access$200(BaseLoLoMoAdapter.this))
        {
            Log.v("BaseLoLoMoAdapter", "Ignoring stale onLoMosFetched callback");
            return;
        }
        BaseLoLoMoAdapter.access$302(BaseLoLoMoAdapter.this, false);
        onDataLoaded(i);
        if (i != 0)
        {
            Log.w("BaseLoLoMoAdapter", "Invalid status code");
            BaseLoLoMoAdapter.access$002(BaseLoLoMoAdapter.this, false);
            notifyDataSetChanged();
            return;
        }
        if (list == null || list.size() <= 0)
        {
            Log.v("BaseLoLoMoAdapter", "No loMos in response");
            BaseLoLoMoAdapter.access$002(BaseLoLoMoAdapter.this, false);
            notifyDataSetChanged();
            return;
        }
        if (list.size() < numItems)
        {
            BaseLoLoMoAdapter.access$002(BaseLoLoMoAdapter.this, false);
        }
        if (Log.isLoggable("BaseLoLoMoAdapter", 2))
        {
            Log.v("BaseLoLoMoAdapter", (new StringBuilder()).append("Got ").append(list.size()).append(" items, expected ").append(numItems).append(", hasMoreData: ").append(BaseLoLoMoAdapter.access$000(BaseLoLoMoAdapter.this)).toString());
        }
        updateLoMoData(list);
    }

    public void onGenresFetched(List list, int i)
    {
        super.onGenresFetched(list, i);
        handleResult(list, i);
    }

    public void onLoMosFetched(List list, int i)
    {
        super.onLoMosFetched(list, i);
        handleResult(list, i);
    }

    public (long l, int i)
    {
        this$0 = BaseLoLoMoAdapter.this;
        super("BaseLoLoMoAdapter");
        requestId = l;
        numItems = i;
    }
}
