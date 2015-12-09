// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.customerevents.legacy;

import android.content.Context;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.UserData;
import com.netflix.mediaclient.webapi.AuthorizationCredentials;
import com.netflix.mediaclient.webapi.CommonRequestParameters;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.logging.customerevents.legacy:
//            BaseCustomerEvent, CustomerEventCommand

public class MdpFromDeepLink extends BaseCustomerEvent
    implements Runnable
{

    private static final String NAME = "Mobile UI MDP Opened from Deeplink";
    private Context mContext;
    private String mDepplinkParams;

    public MdpFromDeepLink(Context context, UserData userdata, String s)
    {
        super(userdata);
        mContext = context;
        mDepplinkParams = s;
    }

    private JSONArray getEvents(String s, CommonRequestParameters commonrequestparameters, AuthorizationCredentials authorizationcredentials, String s1)
        throws JSONException
    {
        JSONArray jsonarray = new JSONArray();
        JSONObject jsonobject = new JSONObject();
        jsonarray.put(jsonobject);
        long l = System.currentTimeMillis();
        jsonobject.put("EventName", "Mobile UI MDP Opened from Deeplink");
        jsonobject.put("EventTime", l);
        jsonobject.put("Esn", s);
        jsonobject.put("data", getEvent(s, commonrequestparameters, authorizationcredentials, l, s1));
        return jsonarray;
    }

    public void run()
    {
        try
        {
            Object obj = new AuthorizationCredentials(mUser.netflixId, mUser.secureNetflixId);
            Object obj1 = getCommonRequestParameters(mContext);
            obj1 = getEvents(mUser.esn, ((CommonRequestParameters) (obj1)), ((AuthorizationCredentials) (obj)), mDepplinkParams);
            obj = new CustomerEventCommand(mUser.esn, ((AuthorizationCredentials) (obj)), ((JSONArray) (obj1)).toString());
            Log.d("nf_rest", "Executing MdpFromDeepLink WebAPI call start");
            obj = ((CustomerEventCommand) (obj)).execute();
            Log.d("nf_rest", "Executing MdpFromDeepLink WebAPI call done");
            if (Log.isLoggable("nf_rest", 3))
            {
                Log.d("nf_rest", (new StringBuilder()).append("MdpFromDeepLink response: ").append(((String) (obj))).toString());
            }
            return;
        }
        catch (Throwable throwable)
        {
            Log.e("nf_rest", "Failed to execute MdpFromDeepLink call!", throwable);
        }
    }
}
