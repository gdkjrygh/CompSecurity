// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.cmpevents.legacy;

import android.content.Context;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.UserData;
import com.netflix.mediaclient.service.pushnotification.MessageData;
import com.netflix.mediaclient.service.pushnotification.UserFeedbackOnReceivedPushNotification;
import com.netflix.mediaclient.util.DeviceUtils;
import com.netflix.mediaclient.webapi.AuthorizationCredentials;
import com.netflix.mediaclient.webapi.CommonRequestParameters;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.logging.cmpevents.legacy:
//            BaseCmpEvent, NotificationFeedbackCommand

public class NotificationFeedback extends BaseCmpEvent
    implements Runnable
{

    private static final String DATA_CHANNEL = "channel";
    private static final String DATA_EVENT_GUID = "eventGuid";
    private static final String DATA_MESSAGE_GUID = "messageGuid";
    private static final String DATA_MESSAGE_ID = "messageId";
    private static final String EVENT_NAME = "CMP_MESSAGE_READ";
    private static final String TAG = "nf_rest";
    private static final String VALUE_CHANNEL = "PUSH";
    private Context mContext;
    private UserFeedbackOnReceivedPushNotification mFeedback;
    private MessageData mMsg;

    public NotificationFeedback(Context context, MessageData messagedata, UserFeedbackOnReceivedPushNotification userfeedbackonreceivedpushnotification, UserData userdata)
    {
        super(userdata);
        mContext = context;
        mUser = userdata;
        mFeedback = userfeedbackonreceivedpushnotification;
        mMsg = messagedata;
    }

    private JSONObject getEvent(String s, CommonRequestParameters commonrequestparameters, AuthorizationCredentials authorizationcredentials)
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        addIfNotNull(jsonobject, "appName", "Android");
        addIfNotNull(jsonobject, "time", (new StringBuilder()).append("").append(System.currentTimeMillis()).toString());
        Object obj = new JSONArray();
        jsonobject.put("events", obj);
        JSONObject jsonobject1 = new JSONObject();
        ((JSONArray) (obj)).put(jsonobject1);
        addIfNotNull(jsonobject1, "name", "CMP_MESSAGE_READ");
        obj = new JSONObject();
        jsonobject1.put("data", obj);
        if (mMsg != null)
        {
            addIfNotNull(((JSONObject) (obj)), "messageId", mMsg.getGuid());
            addIfNotNull(((JSONObject) (obj)), "messageGuid", mMsg.getMessageGuid());
            addIfNotNull(((JSONObject) (obj)), "eventGuid", mMsg.getGuid());
        }
        if (mFeedback != null)
        {
            ((JSONObject) (obj)).put("action", mFeedback.getValue());
        }
        if (mMsg.getOriginator() != null)
        {
            ((JSONObject) (obj)).put("senderApp", mMsg.getOriginator());
        } else
        {
            ((JSONObject) (obj)).put("senderApp", "Android");
        }
        ((JSONObject) (obj)).put("channel", "PUSH");
        addIfNotNull(((JSONObject) (obj)), "esn", s);
        addIfNotNull(((JSONObject) (obj)), "device_type", commonrequestparameters.deviceType);
        addIfNotNull(((JSONObject) (obj)), "os_version", commonrequestparameters.osVersion);
        addIfNotNull(((JSONObject) (obj)), "device_cat", commonrequestparameters.deviceCategory);
        addIfNotNull(((JSONObject) (obj)), "app_version", commonrequestparameters.appVersion);
        addIfNotNull(((JSONObject) (obj)), "ui_version", commonrequestparameters.uiVersion);
        addIfNotNull(((JSONObject) (obj)), "geolocation_country", commonrequestparameters.geolocationCountry);
        addIfNotNull(((JSONObject) (obj)), "languages", commonrequestparameters.languages);
        addIfNotNull(((JSONObject) (obj)), "accountCountry", commonrequestparameters.country);
        addIfNotNull(((JSONObject) (obj)), "user_id", commonrequestparameters.userId);
        if (authorizationcredentials != null)
        {
            addIfNotNull(((JSONObject) (obj)), "netflixId", authorizationcredentials.netflixId);
            addIfNotNull(((JSONObject) (obj)), "secureNetflixId", authorizationcredentials.secureNetflixId);
        }
        if (DeviceUtils.isLandscape(mContext))
        {
            ((JSONObject) (obj)).put("orientation", "landscape");
            return jsonobject;
        } else
        {
            ((JSONObject) (obj)).put("orientation", "portrait");
            return jsonobject;
        }
    }

    public void run()
    {
        try
        {
            Object obj = new AuthorizationCredentials(mUser.netflixId, mUser.secureNetflixId);
            CommonRequestParameters commonrequestparameters = getCommonRequestParameters(mContext);
            JSONObject jsonobject = getEvent(mUser.esn, commonrequestparameters, ((AuthorizationCredentials) (obj)));
            obj = new NotificationFeedbackCommand(mUser.esn, ((AuthorizationCredentials) (obj)), commonrequestparameters, jsonobject, mUser.currentProfileUserId);
            Log.d("nf_rest", "Executing NotificationFeedbackCommand WebAPI call start");
            obj = ((NotificationFeedbackCommand) (obj)).execute();
            Log.d("nf_rest", "Executing NotificationFeedbackCommand WebAPI call done");
            if (Log.isLoggable("nf_rest", 3))
            {
                Log.d("nf_rest", (new StringBuilder()).append("NotificationFeedbackCommand response: ").append(((String) (obj))).toString());
            }
            return;
        }
        catch (Throwable throwable)
        {
            Log.e("nf_rest", "Failed to execute both WebAPI call!", throwable);
        }
    }
}
