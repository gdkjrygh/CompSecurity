// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.details;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.KidsCharacterDetails;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;

// Referenced classes of package com.netflix.mediaclient.ui.kids.details:
//            KidsCharacterDetailsFrag, KidsDetailsViewGroup

private class isRefresh extends LoggingManagerCallback
{

    private final Boolean isRefresh;
    private final long requestId;
    final KidsCharacterDetailsFrag this$0;

    public void onKidsCharacterDetailsFetched(KidsCharacterDetails kidscharacterdetails, Boolean boolean1, int i)
    {
        super.onKidsCharacterDetailsFetched(kidscharacterdetails, boolean1, i);
        if (isRefresh.booleanValue() && !boolean1.booleanValue())
        {
            Log.v("KidsCharacterDetailsFrag", "refreshCase data not changed - nothing to do");
            return;
        }
        long l = KidsCharacterDetailsFrag.access$200(KidsCharacterDetailsFrag.this);
        if (isRefresh.booleanValue())
        {
            l = KidsCharacterDetailsFrag.access$300(KidsCharacterDetailsFrag.this);
        }
        if (requestId != l)
        {
            Log.v("KidsCharacterDetailsFrag", "Ignoring stale callback");
            return;
        }
        if (i != 0)
        {
            Log.w("KidsCharacterDetailsFrag", "Invalid status code");
            KidsCharacterDetailsFrag.access$400(KidsCharacterDetailsFrag.this);
            return;
        }
        if (kidscharacterdetails == null)
        {
            Log.v("KidsCharacterDetailsFrag", "No details in response");
            KidsCharacterDetailsFrag.access$400(KidsCharacterDetailsFrag.this);
            return;
        }
        if (isRefresh.booleanValue())
        {
            KidsCharacterDetailsFrag.access$500(KidsCharacterDetailsFrag.this).updateDetails(kidscharacterdetails);
            return;
        } else
        {
            KidsCharacterDetailsFrag.access$600(KidsCharacterDetailsFrag.this, kidscharacterdetails);
            return;
        }
    }

    public (long l, Boolean boolean1)
    {
        this$0 = KidsCharacterDetailsFrag.this;
        super("KidsCharacterDetailsFrag");
        requestId = l;
        isRefresh = boolean1;
    }
}
