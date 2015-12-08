// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import com.worklight.wlclient.WLAuthorizationManagerInternal;
import com.worklight.wlclient.WLClientInstanceIdListener;
import com.worklight.wlclient.api.WLAuthorizationException;
import com.worklight.wlclient.api.WLAuthorizationPersistencePolicy;
import com.worklight.wlclient.api.WLErrorCode;
import com.worklight.wlclient.api.WLFailResponse;
import com.worklight.wlclient.api.WLResponse;
import com.worklight.wlclient.api.WLResponseListener;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WLAuthorizationManagerPlugin extends CordovaPlugin
{

    public WLAuthorizationManagerPlugin()
    {
    }

    private JSONObject buildFailResponseJSON(WLFailResponse wlfailresponse)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("status", wlfailresponse.getStatus());
            jsonobject.put("statusText", wlfailresponse.getErrorCode().getDescription());
            jsonobject.put("responseText", wlfailresponse.getResponseText());
            jsonobject.put("wlFailureStatus", wlfailresponse.getErrorCode().name());
        }
        // Misplaced declaration of an exception variable
        catch (WLFailResponse wlfailresponse)
        {
            throw new RuntimeException("Failed to add JSON property");
        }
        return jsonobject;
    }

    public boolean execute(String s, JSONArray jsonarray, final CallbackContext callbackContext)
        throws JSONException
    {
        if (s.equals("getCachedAuthorizationHeader"))
        {
            callbackContext.success(WLAuthorizationManagerInternal.getInstance().getCachedAuthorizationHeader());
            return true;
        }
        if (s.equals("getClientInstanceIdHeader"))
        {
            s = new WLClientInstanceIdListener() {

                final WLAuthorizationManagerPlugin this$0;
                final CallbackContext val$callbackContext;

                public void onFailure(WLAuthorizationException wlauthorizationexception)
                {
                    callbackContext.error(buildFailResponseJSON(wlauthorizationexception.getWLFailResponse()));
                }

                public void onSuccess(String s1)
                {
                    callbackContext.success(s1);
                }

            
            {
                this$0 = WLAuthorizationManagerPlugin.this;
                callbackContext = callbackcontext;
                super();
            }
            };
            WLAuthorizationManagerInternal.getInstance().getClientInstanceIdHeader(s);
            return true;
        }
        if (s.equals("invokeTokenRequestWithGrantCode"))
        {
            s = jsonarray.getString(0);
            jsonarray = new WLResponseListener() {

                final WLAuthorizationManagerPlugin this$0;
                final CallbackContext val$callbackContext;

                public void onFailure(WLFailResponse wlfailresponse)
                {
                    callbackContext.error(buildFailResponseJSON(wlfailresponse));
                }

                public void onSuccess(WLResponse wlresponse)
                {
                    callbackContext.success(WLAuthorizationManagerInternal.getInstance().getCachedAuthorizationHeader());
                }

            
            {
                this$0 = WLAuthorizationManagerPlugin.this;
                callbackContext = callbackcontext;
                super();
            }
            };
            WLAuthorizationManagerInternal.getInstance().invokeTokenRequestWithGrantCode(s, jsonarray);
            return true;
        }
        if (s.equals("getClientId"))
        {
            callbackContext.success(WLAuthorizationManagerInternal.getInstance().getClientId());
            return true;
        }
        if (s.equals("getWlSessionId"))
        {
            callbackContext.success(WLAuthorizationManagerInternal.getInstance().getWlSessionId());
            return true;
        }
        if (s.equals("getUserIdentity"))
        {
            callbackContext.success(WLAuthorizationManagerInternal.getInstance().getUserIdentity());
            return true;
        }
        if (s.equals("getDeviceIdentity"))
        {
            callbackContext.success(WLAuthorizationManagerInternal.getInstance().getDeviceIdentity());
            return true;
        }
        if (s.equals("getAppIdentity"))
        {
            callbackContext.success(WLAuthorizationManagerInternal.getInstance().getAppIdentity());
            return true;
        }
        if (s.equals("deleteAllAuthData"))
        {
            WLAuthorizationManagerInternal.getInstance().clearRegistration();
            callbackContext.success();
            return true;
        }
        if (s.equals("setAuthorizationPersistencePolicy"))
        {
            s = jsonarray.getString(0).toUpperCase();
            boolean flag = true;
            if (s.equals("NEVER"))
            {
                WLAuthorizationManagerInternal.getInstance().setAuthorizationPersistencePolicy(WLAuthorizationPersistencePolicy.NEVER);
            } else
            if (s.equals("ALWAYS"))
            {
                WLAuthorizationManagerInternal.getInstance().setAuthorizationPersistencePolicy(WLAuthorizationPersistencePolicy.ALWAYS);
            } else
            {
                flag = false;
                WLAuthorizationManagerInternal.getInstance().setAuthorizationPersistencePolicy(WLAuthorizationPersistencePolicy.NEVER);
                callbackContext.error("The specified persistence policy is not supported. Reverting to WLAuthorizationPerisistencePolicyNever");
            }
            if (flag)
            {
                callbackContext.success();
            }
            return true;
        } else
        {
            return false;
        }
    }

}
