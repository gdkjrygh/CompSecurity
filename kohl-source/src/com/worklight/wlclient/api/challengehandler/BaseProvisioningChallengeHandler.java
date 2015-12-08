// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api.challengehandler;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.worklight.common.Logger;
import com.worklight.common.WLConfig;
import com.worklight.common.security.WLDeviceAuthManager;
import com.worklight.wlclient.WLRequest;
import com.worklight.wlclient.api.WLClient;
import com.worklight.wlclient.api.WLErrorCode;
import com.worklight.wlclient.api.WLFailResponse;
import java.security.KeyStoreException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.wlclient.api.challengehandler:
//            BaseDeviceAuthChallengeHandler

public abstract class BaseProvisioningChallengeHandler extends BaseDeviceAuthChallengeHandler
{

    private static final String ALLOWED_PARAM_NAME = "allowed";
    private static final String APPLICATION_ID = "applicationId";
    private static final String APPLICATION_PROVISION_ENTITY = "application";
    private static final String BAD_TOKEN_RESPONSE = "bad token";
    private static final String CERTIFICATE = "certificate";
    private static final String CSR_PARAM_NAME = "CSR";
    private static final String DEVICE_ID = "deviceId";
    private static final String ENTITY_JSON_KEY = "entity";
    private static final String GROUP_ID = "groupId";
    private static final String GROUP_PROVISION_ENTITY = "group:";
    private static final String ID_PARAM_NAME = "ID";
    private static final int MAX_NUMBER_OF_FAILURES = 3;
    private static final int RSA_KEY_SIZE = 512;
    private static final String TOKEN_PARAM_NAME = "token";
    private static Logger logger = Logger.getInstance("BaseProvisioningChallengeHandler");
    private int numOfFailures;
    private String provisioningEntity;

    public BaseProvisioningChallengeHandler(String s)
    {
        super(s);
        numOfFailures = 0;
    }

    private boolean isCertificateChallengeResponse(JSONObject jsonobject)
    {
        return jsonobject.has("certificate");
    }

    private void shouldStartProvisioning(JSONObject jsonobject)
    {
        if (jsonobject.getJSONObject("ID").getBoolean("allowed"))
        {
            createCustomCsr(jsonobject);
            return;
        }
        try
        {
            submitChallengeAnswer(null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            logger.error("Failed to get from the challenge JSON object", jsonobject);
        }
        throw new RuntimeException(jsonobject);
    }

    private void validateSharedUserId()
    {
        Object obj;
        try
        {
            if (provisioningEntity.equalsIgnoreCase("application"))
            {
                return;
            }
        }
        catch (Exception exception)
        {
            throw new RuntimeException(exception);
        }
        obj = WLClient.getInstance().getContext();
        obj = ((Context) (obj)).getPackageManager().getPackageInfo(((Context) (obj)).getPackageName(), 0).sharedUserId;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        if (!((String) (obj)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_92;
        }
        throw new RuntimeException((new StringBuilder()).append("The provisioningEntity '").append(provisioningEntity).append("' requires a sharedUserId to be defined in the <manifest> element of AndroidManifest.xml").toString());
    }

    public void clearDeviceProvisioningCertificate()
    {
        try
        {
            WLDeviceAuthManager.getInstance().removeEntityKeyStoreValues(provisioningEntity);
            return;
        }
        catch (KeyStoreException keystoreexception)
        {
            logger.error("Failed to clear the device provisioning certificate", keystoreexception);
        }
    }

    protected abstract void createCustomCsr(JSONObject jsonobject);

    public volatile void handleChallenge(Object obj)
    {
        handleChallenge((JSONObject)obj);
    }

    public void handleChallenge(JSONObject jsonobject)
    {
        WLDeviceAuthManager wldeviceauthmanager;
        WLClient wlclient = WLClient.getInstance();
        wldeviceauthmanager = WLDeviceAuthManager.getInstance();
        wldeviceauthmanager.init(wlclient.getContext());
        JSONObject jsonobject1;
        jsonobject1 = jsonobject.getJSONObject("ID");
        provisioningEntity = jsonobject1.getString("entity");
        if (isCertificateChallengeResponse(jsonobject))
        {
            wldeviceauthmanager.saveCertificate(provisioningEntity, jsonobject.getString("certificate"), getRealm());
            getDeviceAuthDataAsync(jsonobject1.getString("token"));
            return;
        }
        validateSharedUserId();
        if (wldeviceauthmanager.isCertificateExists(provisioningEntity))
        {
            getDeviceAuthDataAsync(jsonobject1.getString("token"));
            return;
        }
        try
        {
            shouldStartProvisioning(jsonobject);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            logger.error("Failed to get from the challenge JSON object", jsonobject);
            throw new RuntimeException(jsonobject);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            logger.error("Failed to handle the challenge", jsonobject);
        }
        throw new RuntimeException(jsonobject);
    }

    public void handleFailure(JSONObject jsonobject)
    {
        Object obj = null;
        try
        {
            jsonobject = jsonobject.getString("reason");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            logger.error("Failed to get from the response JSON object", jsonobject);
            jsonobject = ((JSONObject) (obj));
        }
        if (jsonobject != null && jsonobject.equalsIgnoreCase("bad token"))
        {
            if (numOfFailures < 3)
            {
                numOfFailures = numOfFailures + 1;
                activeRequest.resendRequest();
                return;
            } else
            {
                jsonobject = new WLFailResponse(WLErrorCode.UNEXPECTED_ERROR, jsonobject, null);
                activeRequest.processFailureResponse(jsonobject);
                return;
            }
        }
        clearDeviceProvisioningCertificate();
        obj = jsonobject;
        if (jsonobject == null)
        {
            obj = "";
        }
        jsonobject = new WLFailResponse(WLErrorCode.UNEXPECTED_ERROR, ((String) (obj)), null);
        activeRequest.processFailureResponse(jsonobject);
    }

    protected void onDeviceAuthDataReady(JSONObject jsonobject)
    {
        Object obj = WLDeviceAuthManager.getInstance();
        try
        {
            jsonobject = ((WLDeviceAuthManager) (obj)).signDeviceAuth(jsonobject.toString(), provisioningEntity, true);
            obj = new JSONObject();
            ((JSONObject) (obj)).put("ID", jsonobject);
            submitChallengeAnswer(obj);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            logger.error("Failed to create the challenge reponse JSON object", jsonobject);
            throw new RuntimeException(jsonobject);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            logger.error("Failed to submit the challenge reponse JSON object", jsonobject);
        }
        throw new RuntimeException(jsonobject);
    }

    protected void submitCustomCsr(JSONObject jsonobject, JSONObject jsonobject1)
    {
        JSONObject jsonobject2;
        WLDeviceAuthManager wldeviceauthmanager;
        WLClient wlclient;
        wldeviceauthmanager = WLDeviceAuthManager.getInstance();
        wlclient = WLClient.getInstance();
        jsonobject2 = jsonobject;
        if (jsonobject == null)
        {
            jsonobject2 = new JSONObject();
        }
        if (!provisioningEntity.equalsIgnoreCase("application")) goto _L2; else goto _L1
_L1:
        jsonobject2.put("applicationId", WLConfig.getInstance().getAppId());
_L4:
        jsonobject2.put("token", jsonobject1.getJSONObject("ID").getString("token"));
        if (!jsonobject2.has("deviceId"))
        {
            jsonobject2.put("deviceId", wldeviceauthmanager.getDeviceUUID(wlclient.getContext()));
        }
        wldeviceauthmanager.generateKeyPair(provisioningEntity, 512);
        jsonobject = wldeviceauthmanager.signCsr(jsonobject2, provisioningEntity);
        jsonobject1 = new JSONObject();
        jsonobject1.put("CSR", jsonobject);
        submitChallengeAnswer(jsonobject1);
        return;
_L2:
        if (provisioningEntity.indexOf("group:") == 0)
        {
            jsonobject2.put("groupId", provisioningEntity.substring(6));
        }
        if (true) goto _L4; else goto _L3
_L3:
        jsonobject;
        logger.error("Failed to build the CSR JSON object", jsonobject);
        throw new RuntimeException(jsonobject);
        jsonobject;
        logger.error("Failed to submit CSR", jsonobject);
        throw new RuntimeException(jsonobject);
    }

}
