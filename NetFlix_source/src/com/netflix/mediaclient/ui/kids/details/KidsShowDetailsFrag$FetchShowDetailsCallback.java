// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.details;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.ShowDetails;

// Referenced classes of package com.netflix.mediaclient.ui.kids.details:
//            KidsShowDetailsFrag

private class requestId extends LoggingManagerCallback
{

    private final long requestId;
    final KidsShowDetailsFrag this$0;

    public void onShowDetailsFetched(ShowDetails showdetails, int i)
    {
        super.onShowDetailsFetched(showdetails, i);
        if (requestId != KidsShowDetailsFrag.access$300(KidsShowDetailsFrag.this))
        {
            Log.v("KidsShowDetailsFrag", "Ignoring stale callback");
            return;
        }
        if (i != 0)
        {
            Log.w("KidsShowDetailsFrag", "Invalid status code");
            KidsShowDetailsFrag.access$400(KidsShowDetailsFrag.this);
            return;
        }
        if (showdetails == null)
        {
            Log.v("KidsShowDetailsFrag", "No details in response");
            KidsShowDetailsFrag.access$400(KidsShowDetailsFrag.this);
            return;
        } else
        {
            KidsShowDetailsFrag.access$500(KidsShowDetailsFrag.this, showdetails);
            return;
        }
    }

    public (long l)
    {
        this$0 = KidsShowDetailsFrag.this;
        super("KidsShowDetailsFrag");
        requestId = l;
    }
}
