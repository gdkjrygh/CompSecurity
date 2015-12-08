// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse.volley;

import android.content.Context;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseException;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseUtils;
import com.netflix.mediaclient.service.webclient.volley.FalcorServerException;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClientRequest;
import com.netflix.mediaclient.servicemgr.Video;
import java.util.Arrays;
import java.util.List;

public class LogBillboardActivityRequest extends FalcorVolleyWebClientRequest
{

    private static final String TAG = "LogBillboardActivityRequest";
    private final String pqlQuery;

    public LogBillboardActivityRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, Video video, com.netflix.mediaclient.service.browse.BrowseAgent.BillboardActivityType billboardactivitytype)
    {
        super(context, configurationagentinterface);
        pqlQuery = String.format("['logBillboardActivity', '%s', '%s']", new Object[] {
            video.getId(), billboardactivitytype.getName()
        });
        if (Log.isLoggable("LogBillboardActivityRequest", 2))
        {
            Log.v("LogBillboardActivityRequest", (new StringBuilder()).append("PQL = ").append(pqlQuery).toString());
        }
    }

    protected String getMethodType()
    {
        return FalcorParseUtils.getMethodNameGet();
    }

    protected List getPQLQueries()
    {
        return Arrays.asList(new String[] {
            pqlQuery
        });
    }

    protected void onFailure(int i)
    {
        Log.v("LogBillboardActivityRequest", (new StringBuilder()).append("onFailure, statusCode:").append(i).toString());
    }

    protected volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    protected void onSuccess(String s)
    {
        Log.v("LogBillboardActivityRequest", "onSuccess");
    }

    protected volatile Object parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        return parseFalcorResponse(s);
    }

    protected String parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        if (Log.isLoggable("LogBillboardActivityRequest", 2))
        {
            Log.v("LogBillboardActivityRequest", (new StringBuilder()).append("parseFalcorResponse: ").append(s).toString());
        }
        s = FalcorParseUtils.getDataObj("LogBillboardActivityRequest", s);
        if (FalcorParseUtils.isEmpty(s))
        {
            throw new FalcorParseException("Empty value");
        } else
        {
            return s.toString();
        }
    }
}
