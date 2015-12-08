// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.challengehandler;

import com.worklight.wlclient.api.challengehandler.BaseDeviceAuthChallengeHandler;
import org.json.JSONException;
import org.json.JSONObject;

public class NoProvisioningChallengeHandler extends BaseDeviceAuthChallengeHandler
{

    public NoProvisioningChallengeHandler(String s)
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
            getDeviceAuthDataAsync(jsonobject.getString("token"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new RuntimeException("Error retrieving device data - JSON error");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new RuntimeException("Error retrieving device data");
        }
    }

    public void handleFailure(JSONObject jsonobject)
    {
    }

    public void handleSuccess(JSONObject jsonobject)
    {
    }

    protected void onDeviceAuthDataReady(JSONObject jsonobject)
        throws JSONException
    {
        JSONObject jsonobject1 = new JSONObject();
        jsonobject1.put("ID", jsonobject);
        submitChallengeAnswer(jsonobject1);
    }
}
