// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.challengehandler;

import com.worklight.common.Logger;
import com.worklight.common.security.WLUserAuthManager;
import com.worklight.wlclient.api.WLClient;
import com.worklight.wlclient.api.challengehandler.WLChallengeHandler;
import org.json.JSONException;
import org.json.JSONObject;

public class UserAuthenticationChallengeHandler extends WLChallengeHandler
{

    private static final Logger logger = Logger.getInstance(com/worklight/wlclient/challengehandler/UserAuthenticationChallengeHandler.getName());
    public static final String realm = "wl_userCertificateAuthRealm";

    public UserAuthenticationChallengeHandler()
    {
        super("wl_userCertificateAuthRealm");
    }

    public volatile void handleChallenge(Object obj)
    {
        handleChallenge((JSONObject)obj);
    }

    public void handleChallenge(JSONObject jsonobject)
    {
        Object obj1 = WLClient.getInstance();
        Object obj = WLUserAuthManager.getInstance();
        ((WLUserAuthManager) (obj)).init(((WLClient) (obj1)).getContext());
        boolean flag = ((WLUserAuthManager) (obj)).doesValidCertificateExist();
        obj1 = jsonobject.optString("certificate");
        if (obj1 != null && ((String) (obj1)).length() > 0)
        {
            try
            {
                ((WLUserAuthManager) (obj)).saveCertificate(((String) (obj1)), "wl_userCertificateAuthRealm");
                submitChallengeAnswer(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                logger.error("Exception while saving certificate.", jsonobject);
            }
            return;
        }
        if (flag)
        {
            try
            {
                ((WLUserAuthManager) (obj)).clearKeystore();
            }
            catch (Throwable throwable)
            {
                logger.error("Exception while clearing keystore.", throwable);
            }
        }
        try
        {
            jsonobject = jsonobject.getJSONObject("ID").getJSONObject("requirements");
            WLUserAuthManager.getInstance().generateKeyPair(2048);
            jsonobject = ((WLUserAuthManager) (obj)).createSignedCSR(jsonobject);
            obj = new JSONObject();
            ((JSONObject) (obj)).put("CSR", jsonobject);
            submitChallengeAnswer(obj);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            logger.error("Error while getting CSR requirements from the challenge.", jsonobject);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            logger.error("Exception while generating CSR.", jsonobject);
        }
    }

    public void handleFailure(JSONObject jsonobject)
    {
    }

    public void handleSuccess(JSONObject jsonobject)
    {
        submitChallengeAnswer(null);
    }

}
