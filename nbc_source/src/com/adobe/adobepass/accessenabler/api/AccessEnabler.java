// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.api;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.adobe.adobepass.accessenabler.models.MetadataKey;
import com.adobe.adobepass.accessenabler.utils.Log;
import com.google.gson.Gson;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.adobe.adobepass.accessenabler.api:
//            AccessEnablerException, AccessEnablerContext, PassiveAuthnWebView, AccessEnablerService, 
//            IAccessEnablerDelegate

public class AccessEnabler
{
    public static class Factory
    {

        private static AccessEnabler instance;

        public static AccessEnabler getInstance(Context context1)
            throws AccessEnablerException
        {
            com/adobe/adobepass/accessenabler/api/AccessEnabler;
            JVM INSTR monitorenter ;
            if (instance == null)
            {
                instance = new AccessEnabler(context1);
            }
            context1 = instance;
            com/adobe/adobepass/accessenabler/api/AccessEnabler;
            JVM INSTR monitorexit ;
            return context1;
            context1;
            com/adobe/adobepass/accessenabler/api/AccessEnabler;
            JVM INSTR monitorexit ;
            throw context1;
        }


        public Factory()
        {
        }
    }


    public static final int ACCESS_ENABLER_STATUS_ERROR = 0;
    public static final int ACCESS_ENABLER_STATUS_SUCCESS = 1;
    public static final String ADOBEPASS_REDIRECT_URL = URLEncoder.encode("adobepass://android.app");
    public static final String CLIENT_TYPE_ANDROID = "android";
    public static final String GENERIC_AUTHENTICATION_ERROR = "Generic Authentication Error";
    public static final String GENERIC_AUTHORIZATION_ERROR = "Generic Authorization Error";
    public static final String INTERNAL_AUTHENTICATION_ERROR = "Internal Authentication Error";
    public static final String INTERNAL_AUTHORIZATION_ERROR = "Internal Authorization Error";
    public static final String INTERNAL_ERROR = "Internal Error";
    private static final String LOG_TAG = "AccessEnabler";
    public static final String METADATA_ARG_RESOURCE_ID = "resource_id";
    public static final String METADATA_ARG_USER_META = "user_metadata_name";
    public static final int METADATA_KEY_DEVICE_ID = 2;
    public static final int METADATA_KEY_INVALID = 255;
    public static final int METADATA_KEY_TTL_AUTHN = 0;
    public static final int METADATA_KEY_TTL_AUTHZ = 1;
    public static final int METADATA_KEY_USER_META = 3;
    static final int OP_CODE_CHECK_AUTHN = 2;
    static final int OP_CODE_CHECK_AUTHZ = 5;
    static final int OP_CODE_CHECK_PREAUTHZ_RESOURCES = 11;
    static final int OP_CODE_GET_AUTHN = 3;
    static final int OP_CODE_GET_AUTHN_TOKEN = 4;
    static final int OP_CODE_GET_AUTHZ = 6;
    static final int OP_CODE_GET_METADATA = 9;
    static final int OP_CODE_GET_SELECTED_PROVIDER = 8;
    static final String OP_CODE_KEY = "op_code";
    static final int OP_CODE_LOGOUT = 10;
    static final int OP_CODE_SET_REQUESTOR = 0;
    static final int OP_CODE_SET_REQUESTOR_COMPLETE = 12;
    static final int OP_CODE_SET_REQUESTOR_FOR_SP = 1;
    static final int OP_CODE_SET_SELECTED_PROVIDER = 7;
    static final String OP_VALUE_FORCE_AUTHN = "force_authn";
    static final String OP_VALUE_GENERIC_DATA = "generic_data";
    static final String OP_VALUE_METADATA_KEY = "metadata_key";
    static final String OP_VALUE_MVPD_ID = "mvpd_id";
    static final String OP_VALUE_REQUESTOR_ID = "requestor_id";
    static final String OP_VALUE_RESOURCE_ID = "resource_id";
    static final String OP_VALUE_SP_URL = "sp_url";
    static final String OP_VALUE_SP_URLS = "sp_urls";
    public static final String PASSIVE_AUTHN_REDIRECT_URL = "/completePassiveAuthentication";
    public static final String PROVIDER_NOT_AVAILABLE_ERROR = "Provider not Available Error";
    public static final String PROVIDER_NOT_SELECTED_ERROR = "Provider not Selected Error";
    public static final String SC_410_ON_SET_REQUESTOR_ERROR_MESSAGE = "API version too old. Please update your application.";
    public static final String SP_URL_DOMAIN_NAME = "adobe.com";
    public static final String SP_URL_PATH_CHECK_PREAUTHORIZED_RESOURCES = "/preauthorize";
    public static final String SP_URL_PATH_GET_AUTHENTICATION = "/authenticate/saml";
    public static final String SP_URL_PATH_GET_AUTHENTICATION_TOKEN = "/sessionDevice";
    public static final String SP_URL_PATH_GET_AUTHORIZATION_TOKEN = "/authorizeDevice";
    public static final String SP_URL_PATH_GET_METADATA = "/getMetadataDevice";
    public static final String SP_URL_PATH_GET_SHORT_MEDIA_TOKEN = "/deviceShortAuthorize";
    public static final String SP_URL_PATH_GET_USER_METADATA = "/usermetadata";
    public static final String SP_URL_PATH_LOGOUT = "/logout";
    public static final String SP_URL_PATH_PASSIVE_COOKIE_DOMAINS = "/cookieDomains";
    public static final String SP_URL_PATH_SET_REQUESTOR = "/config/";
    public static final String USER_AUTHENTICATED = "";
    public static final String USER_NOT_AUTHENTICATED_ERROR = "User Not Authenticated Error";
    public static final String USER_NOT_AUTHORIZED_ERROR = "User not Authorized Error";
    private Context appContext;
    private AccessEnablerContext context;
    private String deviceId;
    private final Handler handler;
    private PassiveAuthnWebView passiveAuthnWebView;
    private String signedRequestorId;

    private AccessEnabler(Context context1)
        throws AccessEnablerException
    {
        handler = new Handler() {

            final AccessEnabler this$0;

            public void handleMessage(Message message)
            {
                message = message.getData();
                String s = message.getString("url");
                Object obj = message.getStringArrayList("domains");
                HashMap hashmap = new HashMap();
                String s1;
                for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); hashmap.put(s1, message.getStringArrayList(s1)))
                {
                    s1 = (String)((Iterator) (obj)).next();
                }

                doPassiveAuthnAuthentication(s, hashmap);
            }

            
            {
                this$0 = AccessEnabler.this;
                super();
            }
        };
        appContext = context1;
        try
        {
            context = new AccessEnablerContext(context1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context1)
        {
            throw new AccessEnablerException(context1);
        }
        deviceId = android.provider.Settings.Secure.getString(context1.getContentResolver(), "android_id");
    }


    private String convertMapToString(Map map)
    {
        String s;
        boolean flag;
        try
        {
            s = (new Gson()).toJson(map);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            Log.e("AccessEnabler", (new StringBuilder()).append("Error converting Map to String: ").append(Arrays.toString(map.getStackTrace())).toString());
            return null;
        }
        map = s;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        flag = s.equals("null");
        map = s;
        if (flag)
        {
            map = null;
        }
        return map;
    }

    private void doPassiveAuthnAuthentication(String s, Map map)
    {
        passiveAuthnWebView.addCookies(map);
        passiveAuthnWebView.loadUrl(s);
    }

    protected static AccessEnabler getCurrentInstance()
    {
        com/adobe/adobepass/accessenabler/api/AccessEnabler;
        JVM INSTR monitorenter ;
        AccessEnabler accessenabler = Factory.instance;
        com/adobe/adobepass/accessenabler/api/AccessEnabler;
        JVM INSTR monitorexit ;
        return accessenabler;
        Exception exception;
        exception;
        com/adobe/adobepass/accessenabler/api/AccessEnabler;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void checkAuthentication()
    {
        Intent intent = new Intent(appContext, com/adobe/adobepass/accessenabler/api/AccessEnablerService);
        Bundle bundle = new Bundle();
        bundle.putInt("op_code", 2);
        intent.putExtras(bundle);
        appContext.startService(intent);
    }

    public void checkAuthorization(String s)
    {
        Intent intent = new Intent(appContext, com/adobe/adobepass/accessenabler/api/AccessEnablerService);
        Bundle bundle = new Bundle();
        bundle.putInt("op_code", 5);
        bundle.putString("resource_id", s);
        bundle.putString("generic_data", null);
        intent.putExtras(bundle);
        appContext.startService(intent);
    }

    public void checkAuthorization(String s, Map map)
    {
        Intent intent = new Intent(appContext, com/adobe/adobepass/accessenabler/api/AccessEnablerService);
        Bundle bundle = new Bundle();
        bundle.putInt("op_code", 5);
        bundle.putString("resource_id", s);
        bundle.putString("generic_data", convertMapToString(map));
        intent.putExtras(bundle);
        appContext.startService(intent);
    }

    public void checkPreauthorizedResources(ArrayList arraylist)
    {
        Intent intent = new Intent(appContext, com/adobe/adobepass/accessenabler/api/AccessEnablerService);
        Bundle bundle = new Bundle();
        bundle.putInt("op_code", 11);
        bundle.putStringArrayList("resource_id", arraylist);
        intent.putExtras(bundle);
        appContext.startService(intent);
    }

    public void enableLogging(boolean flag)
    {
        Log.setEnabled(flag);
    }

    public void getAuthentication()
    {
        Intent intent = new Intent(appContext, com/adobe/adobepass/accessenabler/api/AccessEnablerService);
        Bundle bundle = new Bundle();
        bundle.putInt("op_code", 3);
        bundle.putBoolean("force_authn", false);
        bundle.putString("generic_data", null);
        intent.putExtras(bundle);
        appContext.startService(intent);
    }

    public void getAuthentication(boolean flag, Map map)
    {
        Intent intent = new Intent(appContext, com/adobe/adobepass/accessenabler/api/AccessEnablerService);
        Bundle bundle = new Bundle();
        bundle.putInt("op_code", 3);
        bundle.putBoolean("force_authn", flag);
        bundle.putString("generic_data", convertMapToString(map));
        intent.putExtras(bundle);
        appContext.startService(intent);
    }

    public void getAuthenticationToken()
    {
        Intent intent = new Intent(appContext, com/adobe/adobepass/accessenabler/api/AccessEnablerService);
        Bundle bundle = new Bundle();
        bundle.putInt("op_code", 4);
        intent.putExtras(bundle);
        appContext.startService(intent);
    }

    public void getAuthorization(String s)
    {
        Intent intent = new Intent(appContext, com/adobe/adobepass/accessenabler/api/AccessEnablerService);
        Bundle bundle = new Bundle();
        bundle.putInt("op_code", 6);
        bundle.putString("resource_id", s);
        intent.putExtras(bundle);
        appContext.startService(intent);
    }

    public void getAuthorization(String s, Map map)
    {
        Intent intent = new Intent(appContext, com/adobe/adobepass/accessenabler/api/AccessEnablerService);
        Bundle bundle = new Bundle();
        bundle.putInt("op_code", 6);
        bundle.putString("resource_id", s);
        bundle.putString("generic_data", convertMapToString(map));
        intent.putExtras(bundle);
        appContext.startService(intent);
    }

    public AccessEnablerContext getContext()
    {
        return context;
    }

    public IAccessEnablerDelegate getDelegate()
    {
        return context._flddelegate;
    }

    protected String getDeviceId()
    {
        return deviceId;
    }

    public Handler getHandler()
    {
        return handler;
    }

    public void getMetadata(MetadataKey metadatakey)
    {
        Intent intent = new Intent(appContext, com/adobe/adobepass/accessenabler/api/AccessEnablerService);
        Bundle bundle = new Bundle();
        bundle.putInt("op_code", 9);
        bundle.putSerializable("metadata_key", metadatakey);
        intent.putExtras(bundle);
        appContext.startService(intent);
    }

    public void getSelectedProvider()
    {
        Intent intent = new Intent(appContext, com/adobe/adobepass/accessenabler/api/AccessEnablerService);
        Bundle bundle = new Bundle();
        bundle.putInt("op_code", 8);
        intent.putExtras(bundle);
        appContext.startService(intent);
    }

    protected String getSignedRequestorId()
    {
        return signedRequestorId;
    }

    public String getVersion()
    {
        return "1.8";
    }

    public void logout()
    {
        Intent intent = new Intent(appContext, com/adobe/adobepass/accessenabler/api/AccessEnablerService);
        Bundle bundle = new Bundle();
        bundle.putInt("op_code", 10);
        intent.putExtras(bundle);
        appContext.startService(intent);
    }

    public void setDelegate(IAccessEnablerDelegate iaccessenablerdelegate)
    {
        context._flddelegate = iaccessenablerdelegate;
    }

    public void setRequestor(String s, String s1)
    {
        signedRequestorId = s1;
        passiveAuthnWebView = PassiveAuthnWebView.getInstance(appContext, context);
        s1 = new Intent(appContext, com/adobe/adobepass/accessenabler/api/AccessEnablerService);
        Bundle bundle = new Bundle();
        bundle.putInt("op_code", 0);
        bundle.putString("requestor_id", s);
        s1.putExtras(bundle);
        appContext.startService(s1);
    }

    public void setRequestor(String s, String s1, ArrayList arraylist)
    {
        signedRequestorId = s1;
        passiveAuthnWebView = PassiveAuthnWebView.getInstance(appContext, context);
        s1 = new Intent(appContext, com/adobe/adobepass/accessenabler/api/AccessEnablerService);
        Bundle bundle = new Bundle();
        bundle.putInt("op_code", 1);
        bundle.putString("requestor_id", s);
        bundle.putStringArrayList("sp_urls", arraylist);
        s1.putExtras(bundle);
        appContext.startService(s1);
    }

    public void setSelectedProvider(String s)
    {
        Intent intent = new Intent(appContext, com/adobe/adobepass/accessenabler/api/AccessEnablerService);
        Bundle bundle = new Bundle();
        bundle.putInt("op_code", 7);
        bundle.putString("mvpd_id", s);
        intent.putExtras(bundle);
        appContext.startService(intent);
    }

    public void useHttps(boolean flag)
    {
        AccessEnablerService.USE_HTTPS = flag;
    }


}
