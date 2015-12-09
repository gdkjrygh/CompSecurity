// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse.volley;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.browse.BrowseAgentCallback;
import com.netflix.mediaclient.service.browse.BrowseVideoSentinels;
import com.netflix.mediaclient.service.webclient.model.BillboardDetails;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseException;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseUtils;
import com.netflix.mediaclient.service.webclient.volley.FalcorServerException;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClientRequest;
import com.netflix.mediaclient.servicemgr.LoMo;
import com.netflix.mediaclient.servicemgr.LoMoType;
import com.netflix.mediaclient.servicemgr.Video;
import com.netflix.mediaclient.util.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FetchVideosRequest extends FalcorVolleyWebClientRequest
{

    private static final String TAG = "nf_service_browse_fetchvideosrequest";
    private final int fromVideo;
    private final String listType;
    private final LoMo mLoMo;
    private final String pqlQuery;
    private final BrowseAgentCallback responseCallback;
    private final int toVideo;

    public FetchVideosRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, String s, LoMo lomo, int i, int j, BrowseAgentCallback browseagentcallback)
    {
        super(context, configurationagentinterface);
        responseCallback = browseagentcallback;
        mLoMo = lomo;
        fromVideo = i;
        toVideo = j;
        listType = s;
        pqlQuery = (new StringBuilder("['")).append(s).append("','").append(mLoMo.getId()).append("',{'to':").append(j).append(",'from':").append(i).append("},['summary','billboardDetail']]").toString();
        if (Log.isLoggable("nf_service_browse_fetchvideosrequest", 2))
        {
            Log.v("nf_service_browse_fetchvideosrequest", (new StringBuilder()).append("PQL = ").append(pqlQuery).toString());
        }
    }

    public static List buildVideoList(LoMoType lomotype, JsonObject jsonobject, int i, int j, boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        int l = 0;
        boolean flag1 = false;
        boolean flag3 = false;
        int k = j;
        j = ((flag1) ? 1 : 0);
        while (k >= i) 
        {
            Object obj = Integer.toString(k);
            boolean flag2;
            int i1;
            int j1;
            if (jsonobject.has(((String) (obj))))
            {
                flag3 = true;
                obj = getSummaryByLomoType(lomotype, jsonobject.getAsJsonObject(((String) (obj))));
                arraylist.add(0, obj);
                flag2 = flag3;
                i1 = l;
                j1 = j;
                if (Log.isLoggable("nf_service_browse_fetchvideosrequest", 2))
                {
                    l++;
                    flag2 = flag3;
                    i1 = l;
                    j1 = j;
                    if (obj != null)
                    {
                        flag2 = flag3;
                        i1 = l;
                        j1 = j;
                        if (StringUtils.isNotEmpty(((Video) (obj)).getBoxshotURL()))
                        {
                            flag2 = flag3;
                            i1 = l;
                            j1 = j;
                            if (((Video) (obj)).getBoxshotURL().contains(".webp"))
                            {
                                j1 = j + 1;
                                i1 = l;
                                flag2 = flag3;
                            }
                        }
                    }
                }
            } else
            {
                flag2 = flag3;
                i1 = l;
                j1 = j;
                if (flag3)
                {
                    flag2 = flag3;
                    i1 = l;
                    j1 = j;
                    if (flag)
                    {
                        Log.d("nf_service_browse_fetchvideosrequest", String.format("Adding sentinel at index %s", new Object[] {
                            obj
                        }));
                        arraylist.add(0, BrowseVideoSentinels.getUnavailableVideoSummary());
                        flag2 = flag3;
                        i1 = l;
                        j1 = j;
                    }
                }
            }
            k--;
            flag3 = flag2;
            l = i1;
            j = j1;
        }
        if (Log.isLoggable("nf_service_browse_fetchvideosrequest", 2) && l > 0 && j > 0)
        {
            Log.d("nf_service_browse_fetchvideosrequest", String.format("videoCount:%d webpCount %d (%d%%)", new Object[] {
                Integer.valueOf(l), Integer.valueOf(j), Integer.valueOf((j * 100) / l)
            }));
        }
        return arraylist;
    }

    private static Video getSummaryByLomoType(LoMoType lomotype, JsonObject jsonobject)
    {
        if (lomotype == LoMoType.BILLBOARD)
        {
            if (Log.isLoggable("nf_service_browse_fetchvideosrequest", 3))
            {
                Log.d("nf_service_browse_fetchvideosrequest", "Found billboard row - getting summary");
            }
            return (Video)FalcorParseUtils.getGson().fromJson(jsonobject, com/netflix/mediaclient/service/webclient/model/BillboardDetails);
        } else
        {
            return (Video)FalcorParseUtils.getPropertyObject(jsonobject, "summary", com/netflix/mediaclient/service/webclient/model/branches/Video$Summary);
        }
    }

    protected List getPQLQueries()
    {
        return Arrays.asList(new String[] {
            pqlQuery
        });
    }

    protected void onFailure(int i)
    {
        if (responseCallback != null)
        {
            responseCallback.onVideosFetched(Collections.emptyList(), i);
        }
    }

    protected volatile void onSuccess(Object obj)
    {
        onSuccess((List)obj);
    }

    protected void onSuccess(List list)
    {
        if (responseCallback != null)
        {
            responseCallback.onVideosFetched(list, 0);
        }
    }

    protected volatile Object parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        return parseFalcorResponse(s);
    }

    protected List parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        if (!Log.isLoggable("nf_service_browse_fetchvideosrequest", 2));
        long l = System.nanoTime();
        JsonObject jsonobject = FalcorParseUtils.getDataObj("nf_service_browse_fetchvideosrequest", s);
        if (FalcorParseUtils.isEmpty(jsonobject))
        {
            return new ArrayList();
        }
        int i;
        int j;
        long l1;
        boolean flag;
        try
        {
            jsonobject = jsonobject.getAsJsonObject(listType).getAsJsonObject(mLoMo.getId());
        }
        catch (Exception exception)
        {
            Log.v("nf_service_browse_fetchvideosrequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
            throw new FalcorParseException("Does not contain required fields", exception);
        }
        s = mLoMo.getType();
        i = fromVideo;
        j = toVideo;
        if (!mLoMo.isBillboard())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s = buildVideoList(s, jsonobject, i, j, flag);
        l1 = System.nanoTime();
        i = (toVideo - fromVideo) + 1;
        l = 0L + TimeUnit.MILLISECONDS.convert(l1 - l, TimeUnit.NANOSECONDS);
        Log.d("nf_service_browse_fetchvideosrequest", String.format(" parsing took %d ms for %d videos - average %d ms", new Object[] {
            Long.valueOf(l), Integer.valueOf(i), Long.valueOf(l / (long)i)
        }));
        return s;
    }
}
