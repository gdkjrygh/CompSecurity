// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.presentation.volley;

import com.android.volley.VolleyError;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.presentation.PresentationRequest;
import com.netflix.mediaclient.service.logging.presentation.PresentationWebCallback;
import java.util.Map;

// Referenced classes of package com.netflix.mediaclient.service.logging.presentation.volley:
//            PresentationVolleyWebClientRequest

public class PresentationEventRequest extends PresentationVolleyWebClientRequest
{

    private static final String TAG = "nf_presentation";
    private final PresentationWebCallback mCallback;
    private final String mDeliveryRequestId;
    private final PresentationRequest mRequestObj;

    public PresentationEventRequest(String s, PresentationRequest presentationrequest, PresentationWebCallback presentationwebcallback)
    {
        mCallback = presentationwebcallback;
        mDeliveryRequestId = s;
        mRequestObj = presentationrequest;
    }

    public Map getParams()
    {
        Map map = mRequestObj.toRequestParams();
        if (Log.isLoggable("nf_presentation", 2))
        {
            Log.d("nf_presentation", (new StringBuilder()).append("params size ").append(map.toString().length()).toString());
        }
        return map;
    }

    protected void onFailure(int i)
    {
        if (Log.isLoggable("nf_presentation", 2))
        {
            Log.v("nf_presentation", (new StringBuilder()).append("presentationEvent FAIL : ").append(i).toString());
        }
        mCallback.onEventsDeliveryFailed(mDeliveryRequestId);
    }

    protected volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    protected void onSuccess(String s)
    {
        Log.v("nf_presentation", "presentationEvent OK : ");
        mCallback.onEventsDelivered(mDeliveryRequestId);
    }

    protected volatile Object parseResponse(String s)
        throws VolleyError
    {
        return parseResponse(s);
    }

    protected String parseResponse(String s)
        throws VolleyError
    {
        return "OK";
    }
}
