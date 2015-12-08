// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.challengehandler;

import android.content.Context;
import android.content.Intent;
import com.worklight.common.Logger;
import com.worklight.common.security.AppAuthenticityToken;
import com.worklight.nativeandroid.common.WLUtils;
import com.worklight.wlclient.api.WLClient;
import com.worklight.wlclient.api.challengehandler.WLChallengeHandler;
import com.worklight.wlclient.ui.UIActivity;
import java.util.ResourceBundle;
import org.json.JSONException;
import org.json.JSONObject;

public class AuthenticityChallengeHandler extends WLChallengeHandler
{

    private static final String AUTH_FAIL_ID = "WLClient.authFailure";
    private static final String CLOSE_ID = "WLClient.close";
    private static final String INIT_FAILURE_TITLE_ID = "WLClient.wlclientInitFailure";
    private static final String RESOURCE_BUNDLE = "com/worklight/wlclient/messages";
    private static Logger logger = Logger.getInstance("AuthenticityChallengeHandler");

    public AuthenticityChallengeHandler(String s)
    {
        super(s);
    }

    public volatile void handleChallenge(Object obj)
    {
        handleChallenge((JSONObject)obj);
    }

    public void handleChallenge(JSONObject jsonobject)
    {
        try
        {
            jsonobject = jsonobject.getString("WL-Challenge-Data");
            submitChallengeAnswer((new AppAuthenticityToken()).a1(WLClient.getInstance().getContext(), jsonobject.substring(0, jsonobject.indexOf('+'))));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            logger.debug(jsonobject.getMessage());
        }
    }

    public void handleFailure(JSONObject jsonobject)
    {
        jsonobject = WLUtils.getMessagesBundle();
        Context context = WLClient.getInstance().getContext();
        Intent intent = new Intent(context, com/worklight/wlclient/ui/UIActivity);
        intent.putExtra("action", "exit");
        intent.putExtra("dialogue_message", jsonobject.getString("WLClient.authFailure"));
        intent.putExtra("dialogue_title", jsonobject.getString("WLClient.wlclientInitFailure"));
        intent.putExtra("positive_button_text", jsonobject.getString("WLClient.close"));
        context.startActivity(intent);
    }

    public void handleSuccess(JSONObject jsonobject)
    {
    }

}
