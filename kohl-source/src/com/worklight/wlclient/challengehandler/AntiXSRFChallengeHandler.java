// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.challengehandler;

import com.worklight.common.Logger;
import com.worklight.wlclient.api.WLClient;
import com.worklight.wlclient.api.challengehandler.WLChallengeHandler;
import org.json.JSONException;
import org.json.JSONObject;

public class AntiXSRFChallengeHandler extends WLChallengeHandler
{

    private static final String PROTOCOL_ERROR_MESSAGE = "Application will exit because wrong JSON arrived when processing it from AntiXSRFChallengeHandler with ";
    private static Logger logger = Logger.getInstance("AntiXSRFChallengeHandler");

    public AntiXSRFChallengeHandler(String s)
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
            jsonobject = jsonobject.getString("WL-Instance-Id");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            logger.error((new StringBuilder()).append("Application will exit because wrong JSON arrived when processing it from AntiXSRFChallengeHandler with ").append(jsonobject.getMessage()).toString(), jsonobject);
            throw new RuntimeException("Application will exit because wrong JSON arrived when processing it from AntiXSRFChallengeHandler with ");
        }
        WLClient.getInstance().addGlobalHeader("WL-Instance-Id", jsonobject);
        submitChallengeAnswer(null);
    }

    public void handleFailure(JSONObject jsonobject)
    {
    }

    public void handleSuccess(JSONObject jsonobject)
    {
    }

}
