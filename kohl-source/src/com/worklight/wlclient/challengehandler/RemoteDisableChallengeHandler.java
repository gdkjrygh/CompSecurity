// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.challengehandler;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.worklight.common.Logger;
import com.worklight.common.WLConfig;
import com.worklight.nativeandroid.common.WLUtils;
import com.worklight.wlclient.api.WLClient;
import com.worklight.wlclient.api.challengehandler.WLChallengeHandler;
import com.worklight.wlclient.ui.UIActivity;
import java.util.ResourceBundle;
import org.json.JSONException;
import org.json.JSONObject;

public class RemoteDisableChallengeHandler extends WLChallengeHandler
{

    private static final String APPLICATION_DISABLED_ID = "WLClient.applicationDenied";
    private static final String CLOSE_ID = "WLClient.close";
    private static final String NOTIFICATION_TITLE_ID = "WLClient.notificationTitle";
    private static final String NOTIFY_MESAGE = "NOTIFY";
    private static final String PROTOCOL_DOWNLOAD_LINK = "downloadLink";
    private static final String PROTOCOL_ERROR_MESSAGE = "Protocol Error - could not parse JSON object";
    private static final String PROTOCOL_MESSAGE = "message";
    private static final String PROTOCOL_MESSAGE_ID = "messageId";
    private static final String PROTOCOL_MESSAGE_TYPE = "messageType";
    private static final String RESOURCE_BUNDLE = "com/worklight/wlclient/messages";
    private static final String UPGRADE_ID = "WLClient.upgrade";
    private static Logger logger = Logger.getInstance("RemoteDisableChallengeHandler");

    public RemoteDisableChallengeHandler(String s)
    {
        super(s);
    }

    private void createAndShowDisableDialogue(String s, String s1)
    {
        ResourceBundle resourcebundle = WLUtils.getMessagesBundle();
        Context context = WLClient.getInstance().getContext();
        if (!android/app/Activity.isAssignableFrom(context.getClass()))
        {
            logger.error("Worklight cannot show the dialog box showing that the device is disabled. Make sure that your WLClient instance has a context that is assignable from the Activity class, which is set in the WLClient.createInstance() method.");
            return;
        }
        Intent intent = new Intent(context, com/worklight/wlclient/ui/UIActivity);
        intent.putExtra("action", "wl_remoteDisableRealm");
        intent.putExtra("dialogue_message", s);
        intent.putExtra("dialogue_title", resourcebundle.getString("WLClient.applicationDenied"));
        intent.putExtra("positive_button_text", resourcebundle.getString("WLClient.close"));
        if (s1 != null && s1.length() != 0 && !s1.equalsIgnoreCase("null"))
        {
            intent.putExtra("download_link", s1);
            intent.putExtra("neutral_button_text", resourcebundle.getString("WLClient.upgrade"));
        }
        context.startActivity(intent);
    }

    private void createAndShowMessageDialogue(String s, String s1)
    {
        s1 = WLUtils.getMessagesBundle();
        Context context = WLClient.getInstance().getContext();
        Intent intent = new Intent(context, com/worklight/wlclient/ui/UIActivity);
        intent.putExtra("action", "notify");
        intent.putExtra("dialogue_message", s);
        intent.putExtra("dialogue_title", s1.getString("WLClient.notificationTitle"));
        intent.putExtra("positive_button_text", s1.getString("WLClient.close"));
        context.startActivity(intent);
    }

    private boolean isDisplayMessageDialogue(String s, String s1, String s2)
    {
        while (s2 == null || !s2.equalsIgnoreCase("NOTIFY") || s == null || !s.equalsIgnoreCase(s1)) 
        {
            return true;
        }
        return false;
    }

    public volatile void handleChallenge(Object obj)
    {
        handleChallenge((JSONObject)obj);
    }

    public void handleChallenge(JSONObject jsonobject)
    {
        String s1;
        String s = jsonobject.getString("message");
        s1 = jsonobject.getString("messageId");
        jsonobject = jsonobject.getString("messageType");
        if (isDisplayMessageDialogue(WLConfig.getInstance().readWLPref("messageId"), s1, jsonobject))
        {
            createAndShowMessageDialogue(s, s1);
            WLConfig.getInstance().writeWLPref("messageId", s1);
            return;
        }
        try
        {
            submitChallengeAnswer(s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            logger.error("Protocol Error - could not parse JSON object", jsonobject);
        }
        throw new RuntimeException("Protocol Error - could not parse JSON object");
    }

    public void handleFailure(JSONObject jsonobject)
    {
        String s1 = jsonobject.getString("message");
        String s = null;
        try
        {
            if (jsonobject.has("downloadLink"))
            {
                s = jsonobject.getString("downloadLink");
            }
            createAndShowDisableDialogue(s1, s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            logger.error("Protocol Error - could not parse JSON object", jsonobject);
        }
        throw new RuntimeException("Protocol Error - could not parse JSON object");
    }

    public void handleSuccess(JSONObject jsonobject)
    {
    }

}
