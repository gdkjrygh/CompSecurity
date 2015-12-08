// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse.volley;

import android.content.Context;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.browse.BrowseAgentCallback;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseException;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseUtils;
import com.netflix.mediaclient.service.webclient.volley.FalcorServerException;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClientRequest;
import com.netflix.mediaclient.servicemgr.KidsCharacterDetails;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse.volley:
//            FetchKidsCharacterDetailsRequest

public class RefreshKidsCharacterDetails extends FalcorVolleyWebClientRequest
{

    private static final Boolean DATA_CHANGED = Boolean.valueOf(true);
    private static final String FIELD_CHARACTER = "characters";
    private static final String TAG = "nf_kidscharacter";
    private final String mCharacterId;
    private final String pqlQuery1;
    private final BrowseAgentCallback responseCallback;

    protected RefreshKidsCharacterDetails(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, String s, BrowseAgentCallback browseagentcallback)
    {
        super(context, configurationagentinterface);
        mCharacterId = s;
        responseCallback = browseagentcallback;
        pqlQuery1 = String.format("['characters', '%s', 'watchNext', ['summary', 'detail', 'bookmark']]", new Object[] {
            mCharacterId
        });
        if (Log.isLoggable("nf_kidscharacter", 2))
        {
            Log.v("nf_kidscharacter", (new StringBuilder()).append("PQL = ").append(pqlQuery1).toString());
        }
    }

    protected List getPQLQueries()
    {
        return Arrays.asList(new String[] {
            pqlQuery1
        });
    }

    protected void onFailure(int i)
    {
        if (responseCallback != null)
        {
            responseCallback.onKidsCharacterDetailsFetched(null, DATA_CHANGED, i);
        }
    }

    protected void onSuccess(KidsCharacterDetails kidscharacterdetails)
    {
        if (responseCallback != null)
        {
            responseCallback.onKidsCharacterDetailsFetched(kidscharacterdetails, DATA_CHANGED, 0);
        }
    }

    protected volatile void onSuccess(Object obj)
    {
        onSuccess((KidsCharacterDetails)obj);
    }

    protected KidsCharacterDetails parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        if (Log.isLoggable("nf_kidscharacter", 2))
        {
            Log.v("nf_kidscharacter", (new StringBuilder()).append("String response to parse = ").append(s).toString());
        }
        JsonObject jsonobject = FalcorParseUtils.getDataObj("nf_kidscharacter", s);
        if (FalcorParseUtils.isEmpty(jsonobject))
        {
            throw new FalcorParseException("RefreshKidsCharacterDetails empty!!!");
        }
        try
        {
            jsonobject = jsonobject.getAsJsonObject("characters").getAsJsonObject(mCharacterId);
        }
        catch (Exception exception)
        {
            Log.v("nf_kidscharacter", (new StringBuilder()).append("String response to parse = ").append(s).toString());
            throw new FalcorParseException("response missing expected json objects", exception);
        }
        s = new com.netflix.mediaclient.service.webclient.model.KidsCharacterDetails();
        FetchKidsCharacterDetailsRequest.insertWatchNext(jsonobject, s);
        return s;
    }

    protected volatile Object parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        return parseFalcorResponse(s);
    }

}
