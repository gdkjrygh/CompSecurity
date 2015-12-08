// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wl.plugin;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.ConfigurationUtils;
import com.kohls.mcommerce.opal.common.util.Logger;
import com.kohls.mcommerce.opal.common.util.ServerLogger;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.common.value.CommonValues;
import com.kohls.mcommerce.opal.helper.preference.PreferenceHelper;
import com.kohls.mcommerce.opal.wl.WLActivity;
import java.util.concurrent.ExecutorService;
import org.apache.cordova.CordovaActivity;
import org.apache.cordova.CordovaInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kohls.mcommerce.opal.wl.plugin:
//            BasePlugin

public class NativeHybridCommPlugin extends BasePlugin
{

    private static final String ACTION_GET_ORDER_INFO = "ACTION_GET_ORDER_INFO";
    private static final String ACTION_GET_VALUES = "GET_VALUES";
    private static final String ACTION_PERFORM_GO_SHOPPING = "PERFORM_GO_SHOPPING";
    private static final String ACTION_SCREEN_URL = "SCREEN_URL";
    private static final String ACTION_SET_CART_ID = "SET_CART_ID";
    private static final String ACTION_SET_SCREEN_TITLE = "SET_SCREEN_TITLE";
    private static final String GET_CONFIGURATIONS = "getConfiguration";
    private static final String LOG_MESSAGE = "LOG_MESSAGE";
    private static final String NATIVE_OPEN_DIALER = "openDialer";
    private static final String NATIVE_VAL_BUGSENSE_ENABLED = "bugsenseEnabled";
    private static final String NATIVE_VAL_DEBUG_MODE = "debugMode";
    private static final String NATIVE_VAL_OMNICHANNEL_ENABLE = "omnibagswitch";
    private static final String NATIVE_VAL_PLATFORM = "platform";
    private static final String NATIVE_VAL_VERSION = "version";
    private static final String OPEN_YES_TO_YOU_REWARDS = "openYesToYouRewards";
    private static final String TAG = com/kohls/mcommerce/opal/wl/plugin/NativeHybridCommPlugin.getSimpleName();

    public NativeHybridCommPlugin()
    {
    }

    private String appendClientName()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(";");
        stringbuffer.append("client");
        stringbuffer.append(":");
        stringbuffer.append("Android");
        return stringbuffer.toString();
    }

    private String getAppVersionNumber(CordovaActivity cordovaactivity)
    {
        try
        {
            cordovaactivity = cordovaactivity.getPackageManager().getPackageInfo(cordovaactivity.getPackageName(), 0);
            cordovaactivity = (new StringBuilder()).append(((PackageInfo) (cordovaactivity)).versionName).append(".").append(((PackageInfo) (cordovaactivity)).versionCode).toString();
        }
        // Misplaced declaration of an exception variable
        catch (CordovaActivity cordovaactivity)
        {
            cordovaactivity.printStackTrace();
            return "";
        }
        return cordovaactivity;
    }

    private String getConfigurations()
    {
        return UtilityMethods.createJsonFromModel(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig());
    }

    private String getNativeValues()
        throws Exception
    {
        JSONObject jsonobject = new JSONObject();
        WLActivity wlactivity = getWLActivity();
        jsonobject.put("platform", "android");
        jsonobject.put("debugMode", String.valueOf(false));
        jsonobject.put("bugsenseEnabled", String.valueOf(CommonValues.getInstance().isEnableBugSense()));
        jsonobject.put("version", getAppVersionNumber(wlactivity));
        jsonobject.put("omnibagswitch", UtilityMethods.isOmniChannelBagClientEnabled());
        return jsonobject.toString();
    }

    private String getOrderInfo()
        throws Exception
    {
        JSONObject jsonobject = new JSONObject();
        WLActivity wlactivity = getWLActivity();
        jsonobject.put("order_id", wlactivity.getOrderStatusOrderId());
        jsonobject.put("postal_code", wlactivity.getOrderStatusPostalCode());
        return jsonobject.toString();
    }

    private String getScreenUrl()
        throws Exception
    {
        return ((WLActivity)cordova.getActivity()).getScreenUrl();
    }

    private WLActivity getWLActivity()
        throws Exception
    {
        WLActivity wlactivity = (WLActivity)cordova.getActivity();
        if (wlactivity == null)
        {
            throw new Exception("Activity instance is null");
        } else
        {
            return wlactivity;
        }
    }

    private void handleError(Exception exception)
    {
        Logger.error(TAG, exception.getMessage());
        exception.getStackTrace();
        sendError();
    }

    private void logClientMessage(String s, String s1)
    {
        String s2 = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getPreviousUserMailIdFromPref();
        if (!TextUtils.isEmpty(s))
        {
            if (!TextUtils.isEmpty(s2))
            {
                s2 = (new StringBuilder()).append(";email:").append(s2).toString();
            } else
            {
                s2 = "";
            }
            if (!TextUtils.isEmpty(s1))
            {
                s = s.replace(s1, (new StringBuilder()).append(s2).append(";").append(appendClientName()).toString());
            }
            ServerLogger.error(s);
        }
    }

    private void openYesToYouReward(WLActivity wlactivity)
        throws Exception
    {
        wlactivity.runOnUiThread(new _cls3(wlactivity));
        wlactivity.endActivity();
    }

    private void performGoShopping(WLActivity wlactivity)
        throws Exception
    {
        wlactivity.runOnUiThread(new _cls2(wlactivity));
        wlactivity.endActivity();
    }

    private void setCartId(String s)
    {
        if (s != null && UtilityMethods.isOmniChannelBagClientEnabled())
        {
            KohlsPhoneApplication.getInstance().getKohlsPref().saveCartID(s);
        }
    }

    private void setScreenTitle(String s)
        throws Exception
    {
        WLActivity wlactivity = getWLActivity();
        wlactivity.runOnUiThread(new _cls4(wlactivity, s));
    }

    public void goToHomeScreen(WLActivity wlactivity)
        throws Exception
    {
        performGoShopping(wlactivity);
    }

    public boolean performAction(String s, JSONArray jsonarray)
        throws JSONException
    {
        if ("GET_VALUES".equals(s))
        {
            try
            {
                sendSuccess(getNativeValues());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                handleError(s);
                return true;
            }
            return true;
        }
        if ("SCREEN_URL".equals(s))
        {
            try
            {
                sendSuccess(getScreenUrl());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                handleError(s);
                return true;
            }
            return true;
        }
        if ("SET_SCREEN_TITLE".equals(s))
        {
            try
            {
                setScreenTitle(jsonarray.getString(0));
                sendSuccess();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                handleError(s);
                return true;
            }
            return true;
        }
        if ("PERFORM_GO_SHOPPING".equals(s))
        {
            try
            {
                performGoShopping(getWLActivity());
                sendSuccess();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                handleError(s);
                return true;
            }
            return true;
        }
        if ("openDialer".equals(s))
        {
            try
            {
                UtilityMethods.initiateCall(jsonarray.getString(0), getWLActivity());
                sendSuccess();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                handleError(s);
                return true;
            }
            return true;
        }
        if ("SET_CART_ID".equals(s))
        {
            try
            {
                setCartId(jsonarray.getString(0));
                sendSuccess();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                handleError(s);
                return true;
            }
            return true;
        }
        if ("ACTION_GET_ORDER_INFO".equals(s))
        {
            try
            {
                sendSuccess(getOrderInfo());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                handleError(s);
                return true;
            }
            return true;
        }
        if ("getConfiguration".equals(s))
        {
            cordova.getThreadPool().execute(new _cls1());
            return true;
        }
        if ("openYesToYouRewards".equals(s))
        {
            try
            {
                openYesToYouReward(getWLActivity());
                sendSuccess();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                handleError(s);
                return true;
            }
            return true;
        }
        if ("LOG_MESSAGE".equals(s))
        {
            String s1 = null;
            s = null;
            try
            {
                if (!jsonarray.isNull(0))
                {
                    s = jsonarray.getString(0);
                }
                if (!jsonarray.isNull(1))
                {
                    s1 = jsonarray.getString(1);
                }
                logClientMessage(s, s1);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                handleError(s);
                return true;
            }
            return true;
        } else
        {
            return false;
        }
    }



    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls1 {}

}
