// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse.volley;

import android.content.Context;
import com.netflix.mediaclient.service.browse.BrowseAgentCallback;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseException;
import com.netflix.mediaclient.service.webclient.volley.FalcorServerException;
import com.netflix.mediaclient.servicemgr.VideoList;

// Referenced classes of package com.netflix.mediaclient.service.browse.volley:
//            FetchSimilarVideosRequest

public static class  extends FetchSimilarVideosRequest
{

    protected volatile void onSuccess(Object obj)
    {
        super.onSuccess((VideoList)obj);
    }

    protected volatile Object parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        return super.parseFalcorResponse(s);
    }

    public (Context context, com.netflix.mediaclient.service.PersonRequest personrequest, String s, int i, BrowseAgentCallback browseagentcallback)
    {
        super(context, personrequest, , s, i, browseagentcallback, null);
    }
}
