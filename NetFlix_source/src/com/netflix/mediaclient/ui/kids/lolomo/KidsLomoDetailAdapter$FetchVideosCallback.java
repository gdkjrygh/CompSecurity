// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.lolomo;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.kids.lolomo:
//            KidsLomoDetailAdapter

private class numItems extends LoggingManagerCallback
{

    private final int numItems;
    private final long requestId;
    final KidsLomoDetailAdapter this$0;

    private void handleResponse(List list, int i)
    {
        KidsLomoDetailAdapter.access$002(KidsLomoDetailAdapter.this, true);
        if (requestId != KidsLomoDetailAdapter.access$100(KidsLomoDetailAdapter.this))
        {
            Log.v("KidsLomoDetailAdapter", "Ignoring stale callback");
            return;
        }
        KidsLomoDetailAdapter.access$202(KidsLomoDetailAdapter.this, false);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        Log.w("KidsLomoDetailAdapter", "Invalid status code");
        KidsLomoDetailAdapter.access$002(KidsLomoDetailAdapter.this, false);
        notifyDataSetChanged();
        KidsLomoDetailAdapter.access$400(KidsLomoDetailAdapter.this, i);
        return;
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        if (list.size() > 0)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        Log.v("KidsLomoDetailAdapter", "No videos in response");
        KidsLomoDetailAdapter.access$002(KidsLomoDetailAdapter.this, false);
        notifyDataSetChanged();
        KidsLomoDetailAdapter.access$400(KidsLomoDetailAdapter.this, i);
        return;
        if (list.size() < numItems)
        {
            KidsLomoDetailAdapter.access$002(KidsLomoDetailAdapter.this, false);
        }
        if (Log.isLoggable("KidsLomoDetailAdapter", 2))
        {
            Log.v("KidsLomoDetailAdapter", (new StringBuilder()).append("Got ").append(list.size()).append(" items, expected ").append(numItems).append(", hasMoreData: ").append(KidsLomoDetailAdapter.access$000(KidsLomoDetailAdapter.this)).toString());
        }
        videoData.addAll(list);
        KidsLomoDetailAdapter.access$312(KidsLomoDetailAdapter.this, list.size());
        notifyDataSetChanged();
        KidsLomoDetailAdapter.access$400(KidsLomoDetailAdapter.this, i);
        return;
        list;
        KidsLomoDetailAdapter.access$400(KidsLomoDetailAdapter.this, i);
        throw list;
    }

    public void onCWVideosFetched(List list, int i)
    {
        super.onCWVideosFetched(list, i);
        handleResponse(list, i);
    }

    public void onVideosFetched(List list, int i)
    {
        super.onVideosFetched(list, i);
        handleResponse(list, i);
    }

    public (long l, int i)
    {
        this$0 = KidsLomoDetailAdapter.this;
        super("KidsLomoDetailAdapter");
        requestId = l;
        numItems = i;
    }
}
