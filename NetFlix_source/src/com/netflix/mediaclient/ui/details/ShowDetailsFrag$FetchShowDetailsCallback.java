// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.details;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.ShowDetails;

// Referenced classes of package com.netflix.mediaclient.ui.details:
//            ShowDetailsFrag

private class requestId extends LoggingManagerCallback
{

    private final long requestId;
    final ShowDetailsFrag this$0;

    public void onShowDetailsFetched(ShowDetails showdetails, int i)
    {
        super.onShowDetailsFetched(showdetails, i);
        if (requestId != ShowDetailsFrag.access$000(ShowDetailsFrag.this) || ShowDetailsFrag.access$100(ShowDetailsFrag.this))
        {
            Log.v("ShowDetailsFrag", "Ignoring stale callback");
            return;
        }
        ShowDetailsFrag.access$202(ShowDetailsFrag.this, false);
        if (i != 0)
        {
            Log.w("ShowDetailsFrag", "Invalid status code");
            showErrorView();
            return;
        }
        if (showdetails == null)
        {
            Log.v("ShowDetailsFrag", "No details in response");
            showErrorView();
            return;
        } else
        {
            showDetailsView(showdetails);
            return;
        }
    }

    public Q(long l)
    {
        this$0 = ShowDetailsFrag.this;
        super("ShowDetailsFrag");
        requestId = l;
    }
}
