// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.presentation.volley;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.webclient.volley.VolleyWebClientRequest;

public abstract class PresentationVolleyWebClientRequest extends VolleyWebClientRequest
{

    private static final String TAG = "nf_presentation";

    protected PresentationVolleyWebClientRequest()
    {
        super(1);
    }

    protected String getMethodType()
    {
        return "post";
    }

    protected String getUrl(String s)
    {
        storeReqNetflixId(getCurrentNetflixId());
        if (Log.isLoggable("nf_presentation", 2))
        {
            Log.v("nf_presentation", (new StringBuilder()).append("PresentationVolleyWebClientRequest URL = ").append(s).toString());
        }
        return s;
    }
}
