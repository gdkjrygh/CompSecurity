// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.helper.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.Location;
import android.text.TextUtils;
import com.apptentive.android.sdk.prefence.KohlsApptentivePreference;
import com.google.gson.Gson;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.helper.db.DBOperationsHelper;
import com.kohls.mcommerce.opal.wallet.util.Appconfig;
import com.kohls.mcommerce.opal.wallet.util.RewardCache;
import com.kohls.mcommerce.opal.wallet.util.WalletCache;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

public class PreferenceHelper
{

    private boolean acceptLic;
    private final Context appContext;
    private Gson gson;

    public PreferenceHelper(Context context)
    {
        appContext = context;
    }

    private SharedPreferences getDefaultSharePreference()
    {
        return appContext.getSharedPreferences("KohlsPreference", 0);
    }

    private Gson getGson()
    {
        if (gson == null)
        {
            gson = new Gson();
        }
        return gson;
    }

    public void clearApptentiveAndForsee()
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putBoolean("forsee", false);
        editor.commit();
        (new KohlsApptentivePreference(KohlsPhoneApplication.getContext())).setApptentivePreference(false);
    }

    public void clearSessionAndUserProfileFromListOrRegistry(String s, String s1)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        if (s != null)
        {
            editor.remove(s);
        }
        if (s1 != null)
        {
            editor.remove(s1);
        }
        editor.commit();
    }

    public void clearUserCredentialAndInfo(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.remove("access_token");
        editor.remove("refresh_token");
        if (flag)
        {
            editor.remove("user_name");
        }
        editor.remove("sign_in_time");
        editor.remove("expire_time");
        editor.remove("secure_time");
        editor.remove("user_loyalty_id");
        editor.remove("user_id");
        editor.remove(Appconfig.WALLET_ID);
        editor.remove("error_update");
        editor.remove(Appconfig.PREFERENCE_ID);
        editor.remove("hash");
        editor.remove("timestamp");
        editor.remove("user_lastname");
        editor.apply();
        WalletCache.clear(appContext, Appconfig.WALLET_KOHLS_CASH_CACHE);
        WalletCache.clear(appContext, Appconfig.WALLET_OFFERS_CACHE);
        WalletCache.clear(appContext, "rpwallet");
        RewardCache.clear(appContext);
        clearSessionAndUserProfileFromListOrRegistry("ListJsessionId", "ListUserProfile");
    }

    public void deletePref(String s)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.remove(s);
        editor.commit();
    }

    public String getAccessToken()
    {
        return getDefaultSharePreference().getString("access_token", null);
    }

    public long getAccessTokenExpireTime()
    {
        return getDefaultSharePreference().getLong("expire_time", 0L);
    }

    public String getAppConfiguration()
    {
        return getDefaultSharePreference().getString("kohlsAppConfig", null);
    }

    public String getCMSPageName()
    {
        return getDefaultSharePreference().getString("PREF_CMS_PAGENAME", "homepage");
    }

    public String getCartID()
    {
        return getDefaultSharePreference().getString("cartID", null);
    }

    public long getCatalogCacheTime()
    {
        return getDefaultSharePreference().getLong("PREF_CATALOG_CACHE", 0L);
    }

    public long getCategoryCacheTime()
    {
        return getDefaultSharePreference().getLong("PREF_CATEGORY_CACHE", 0L);
    }

    public long getCmsCacheTime()
    {
        return getDefaultSharePreference().getLong("PREF_CMS_CACHE", 0L);
    }

    public String getCreateorGetUserForList()
    {
        return getDefaultSharePreference().getString("ListUserProfile", null);
    }

    public String getCreateorGetUserForRegistry()
    {
        return getDefaultSharePreference().getString("RegistryUserProfile", null);
    }

    public long getCurrentTimeForUpgradeAlertInterval()
    {
        return getDefaultSharePreference().getLong("Current_Time_Alert_Upgrade_Interval", -1L);
    }

    public String getDigestedMessage()
    {
        return getDefaultSharePreference().getString("PREF_DIGESTED_MSG", null);
    }

    public String getErrorTimestamp()
    {
        return getDefaultSharePreference().getString("error_update", "");
    }

    public String getExpiryStringTime()
    {
        return getDefaultSharePreference().getString("PREF_STRING_MSG", null);
    }

    public String getFaqUrl()
    {
        return getDefaultSharePreference().getString("faq", "");
    }

    public String getFirstInstallValue()
    {
        return getDefaultSharePreference().getString("first_install", "");
    }

    public String getFirstName()
    {
        return getDefaultSharePreference().getString("first_name", "");
    }

    public boolean getFlagForOmnitureListLanding()
    {
        return getDefaultSharePreference().getBoolean("flag_omniture_called_for_list_landing", false);
    }

    public boolean getHasUserDiscardedUpgrade()
    {
        return getDefaultSharePreference().getBoolean("CONSTANT_DISMISS_UPGRADE", false);
    }

    public long getIdleTimeStart()
    {
        return getDefaultSharePreference().getLong("idle_time", 0L);
    }

    public boolean getIsForseeDebug()
    {
        return getDefaultSharePreference().getBoolean("kohlsForseeConfig", false);
    }

    public String getLastName()
    {
        return getDefaultSharePreference().getString("last_name", "");
    }

    public Location getLastUserLocation()
    {
        String s = getDefaultSharePreference().getString("userlocation", "");
        if (s != null && s.length() > 0)
        {
            return (Location)getGson().fromJson(s, android/location/Location);
        } else
        {
            return null;
        }
    }

    public String getListJsessionId()
    {
        return getDefaultSharePreference().getString("ListJsessionId", null);
    }

    public Location getLocationFromGeofence()
    {
        String s = getDefaultSharePreference().getString("LOCATION_FROM_DIGBY", "");
        if (s != null && s.length() > 0)
        {
            return (Location)getGson().fromJson(s, android/location/Location);
        } else
        {
            return null;
        }
    }

    public String getLoyaltyID()
    {
        return getDefaultSharePreference().getString("loyalty", null);
    }

    public String getLoyaltyMode()
    {
        return getDefaultSharePreference().getString("mode", "");
    }

    public String getOmnitureSecureServer()
    {
        return getDefaultSharePreference().getString("omniture_secure_server", "ww8.kohls.com");
    }

    public String getOmnitureServer()
    {
        return getDefaultSharePreference().getString("omniture_server", "ww9.kohls.com");
    }

    public ArrayList getPreferenceId()
    {
        ArrayList arraylist;
        Object obj;
        obj = getDefaultSharePreference().getString(Appconfig.PREFERENCE_ID, null);
        arraylist = new ArrayList();
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = new JSONArray(((String) (obj)));
        int i = 0;
_L3:
        if (i >= ((JSONArray) (obj)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(((JSONArray) (obj)).optString(i));
        i++;
        if (true) goto _L3; else goto _L2
        JSONException jsonexception;
        jsonexception;
        jsonexception.printStackTrace();
_L2:
        return arraylist;
    }

    public String getProgramDetailsContent()
    {
        return getDefaultSharePreference().getString("programdetail", "");
    }

    public String getProgramDetailsHeader()
    {
        return getDefaultSharePreference().getString("programheader", "");
    }

    public String getRefreshToken()
    {
        return getDefaultSharePreference().getString("refresh_token", "");
    }

    public long getRegistryCacheTime()
    {
        return getDefaultSharePreference().getLong("PREF_CMS_CACHE", 0L);
    }

    public String getRegistryJsessionId()
    {
        return getDefaultSharePreference().getString("RegistryJsessionId", null);
    }

    public String getSearchedFileName(String s)
    {
        return getDefaultSharePreference().getString(s, "");
    }

    public long getSecureTime()
    {
        return getDefaultSharePreference().getLong("secure_time", 0L);
    }

    public String getServerError(String s)
    {
        return getDefaultSharePreference().getString(s, "");
    }

    public String getShoppingBagCount()
    {
        return getDefaultSharePreference().getString("shopping_bag_count", "0");
    }

    public String getShoppingBagSubTotal()
    {
        return getDefaultSharePreference().getString("shopping_bag_subtotal", "0");
    }

    public long getSignInTime()
    {
        return getDefaultSharePreference().getLong("sign_in_time", 0L);
    }

    public String getSignedInUserEmail()
    {
        return getDefaultSharePreference().getString("email_address", null);
    }

    public String getSignedInUserId()
    {
        return getDefaultSharePreference().getString("user_id", null);
    }

    public String getSignedInUserName()
    {
        return getDefaultSharePreference().getString("user_name", null);
    }

    public String getSignedinUserLastName()
    {
        return getDefaultSharePreference().getString("user_lastname", null);
    }

    public String getSigninStatus()
    {
        return getDefaultSharePreference().getString("signinshown", "");
    }

    public String getString(String s, String s1)
    {
        return getDefaultSharePreference().getString(s, s1);
    }

    public String getTermsandConditionUrl()
    {
        return getDefaultSharePreference().getString("tnc", "");
    }

    public boolean getTwitterAuthorizationStatus()
    {
        return getDefaultSharePreference().getBoolean("twitter_is_user_authorized", false);
    }

    public String getTwitterOauthTokenKey()
    {
        return getDefaultSharePreference().getString("oauth_token", null);
    }

    public String getTwitterOauthTokenSecret()
    {
        return getDefaultSharePreference().getString("oauth_token_secret", null);
    }

    public String getUserMailId()
    {
        return getDefaultSharePreference().getString("email_address", "");
    }

    public boolean getUserSignInStatus()
    {
        return getDefaultSharePreference().getBoolean("user_signed_in_status", false);
    }

    public com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store getUserStore()
    {
        String s = getDefaultSharePreference().getString("userstore", "");
        return (com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store)getGson().fromJson(s, com/kohls/mcommerce/opal/framework/vo/StoreLocatorVO$Payload$Store);
    }

    public String getWalletHash()
    {
        return getDefaultSharePreference().getString("hash", null);
    }

    public String getWalletId()
    {
        return getDefaultSharePreference().getString(Appconfig.WALLET_ID, "");
    }

    public String getWalletTimestamp()
    {
        return getDefaultSharePreference().getString("timestamp", null);
    }

    public String isAppVersionChanged()
    {
        return getDefaultSharePreference().getString("appVersion", "");
    }

    public boolean isEulaAccepted()
    {
        return getDefaultSharePreference().getBoolean("lic-acceptance", acceptLic);
    }

    public boolean isFirstScan()
    {
        return getDefaultSharePreference().getBoolean("PREF_FIRST_SCAN", true);
    }

    public boolean isFirstVisualSearch()
    {
        return getDefaultSharePreference().getBoolean("PREF_FIRST_VISUAL_SEARCH", true);
    }

    public boolean isForseeSurveyShown()
    {
        return getDefaultSharePreference().getBoolean("forsee", false);
    }

    public boolean isGeoFenceBroken()
    {
        return getDefaultSharePreference().getBoolean("CONSTANT_FROM_DIGBY", false);
    }

    public boolean isOmniChannelEnabledinPref()
    {
        return getDefaultSharePreference().getBoolean("PREF_OMNICHANNEL_ENABLED", false);
    }

    public boolean isPresentInSharedPref(String s)
    {
        return getDefaultSharePreference().contains(s);
    }

    public void removeUserStore()
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.remove("userstore");
        editor.apply();
    }

    public void saveAppCofiguration(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
            editor.putString("kohlsAppConfig", s);
            editor.apply();
        }
    }

    public void saveCartID(String s)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putString("cartID", s);
        editor.apply();
    }

    public void saveCreaeOrGetUserForListOrRegistry(String s, String s1)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putString(s, s1);
        editor.commit();
    }

    public void saveCustomerName(String s, String s1)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putString("user_name", s);
        editor.putString("user_lastname", s1);
        editor.commit();
    }

    public void saveEulaPrefernces(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putBoolean("lic-acceptance", flag);
        acceptLic = flag;
        editor.apply();
    }

    public void saveLastUserLocation(Location location)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putString("userlocation", getGson().toJson(location));
        editor.apply();
    }

    public void saveListOrRegistrySessionPref(String s, String s1)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putString(s, s1);
        editor.commit();
    }

    public void saveShoppingBagSubTotalAndCount(String s)
    {
        saveShoppingBagSubTotalAndCount(null, s);
    }

    public void saveShoppingBagSubTotalAndCount(String s, String s1)
    {
        Object obj = new DBOperationsHelper();
        if (s == null)
        {
            s = String.valueOf(((DBOperationsHelper) (obj)).count("ShoppingBag"));
        }
        obj = getDefaultSharePreference().edit();
        ((android.content.SharedPreferences.Editor) (obj)).putString("shopping_bag_subtotal", s1);
        ((android.content.SharedPreferences.Editor) (obj)).putString("shopping_bag_count", s);
        ((android.content.SharedPreferences.Editor) (obj)).apply();
    }

    public void saveString(String s, String s1)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putString(s, s1);
        editor.commit();
    }

    public void saveTwitterOauth(String s, String s1)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putString("oauth_token", s);
        editor.putString("oauth_token_secret", s1);
        editor.apply();
    }

    public void saveUserCredentialsAndInfo(String s, String s1, String s2, long l, String s3, String s4, 
            String s5, String s6, String s7, String s8, String s9, String s10)
    {
        long l1 = System.currentTimeMillis() / 1000L;
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putString("access_token", s);
        editor.putString("refresh_token", s1);
        editor.putString("user_name", s2);
        editor.putString("user_lastname", s7);
        editor.putString("email_address", s3);
        editor.putLong("sign_in_time", l1);
        editor.putLong("expire_time", l);
        editor.putString("PREF_DIGESTED_MSG", s5);
        editor.putString("PREF_STRING_MSG", s6);
        editor.putLong("secure_time", l1);
        editor.putString("user_id", s4);
        editor.putString("loyalty", s8);
        editor.putString("hash", s9);
        editor.putString("timestamp", s10);
        editor.commit();
    }

    public void saveUserName(String s)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putString("user_name", s);
        editor.apply();
    }

    public void saveUserStore(com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store store)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putString("userstore", getGson().toJson(store));
        editor.apply();
    }

    public void setAppVersionFlag(Context context)
    {
        try
        {
            Object obj = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            context = ((PackageInfo) (obj)).versionName;
            int i = ((PackageInfo) (obj)).versionCode;
            obj = getDefaultSharePreference().edit();
            ((android.content.SharedPreferences.Editor) (obj)).putString("appVersion", (new StringBuilder()).append(context).append("").append(i).toString());
            ((android.content.SharedPreferences.Editor) (obj)).commit();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
    }

    public void setCMSPageName(String s)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putString("PREF_CMS_PAGENAME", s);
        editor.apply();
    }

    public void setCacheTimeCMS(long l)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putLong("PREF_CMS_CACHE", l);
        editor.apply();
    }

    public void setCacheTimeCatalog(long l)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putLong("PREF_CATALOG_CACHE", l);
        editor.apply();
    }

    public void setCacheTimeCategory(long l)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putLong("PREF_CATEGORY_CACHE", l);
        editor.apply();
    }

    public void setCacheTimeRegistry(long l)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putLong("PREF_CMS_CACHE", l);
        editor.apply();
    }

    public void setCurrentTimeForUpgradeAlertInterval(long l)
    {
        if (l > 0L)
        {
            android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
            editor.putLong("Current_Time_Alert_Upgrade_Interval", l);
            editor.commit();
        }
    }

    public void setDigbyNotification(boolean flag, Location location)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putBoolean("CONSTANT_FROM_DIGBY", flag);
        editor.putString("LOCATION_FROM_DIGBY", getGson().toJson(location));
        editor.commit();
    }

    public void setErrorTimestamp(String s)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putString("error_update", s);
        editor.commit();
    }

    public void setFaqUrl(String s)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putString("faq", s);
        editor.commit();
    }

    public void setFirstInstallValue(String s)
    {
        s = getDefaultSharePreference().edit();
        s.putString("first_install", "NO");
        s.commit();
    }

    public void setFlagForOmnitureListLanding(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putBoolean("flag_omniture_called_for_list_landing", flag);
        editor.commit();
    }

    public void setForseeSurveyFlag()
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putBoolean("forsee", true);
        editor.commit();
    }

    public void setHasUserDiscardedUpgrade(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putBoolean("CONSTANT_DISMISS_UPGRADE", flag);
        editor.commit();
    }

    public void setIdleTime()
    {
        long l = System.currentTimeMillis() / 1000L;
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putLong("idle_time", l);
        editor.apply();
    }

    public void setIsFirstScan(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putBoolean("PREF_FIRST_SCAN", flag);
        editor.apply();
    }

    public void setIsFirstVisualSearch(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putBoolean("PREF_FIRST_VISUAL_SEARCH", flag);
        editor.apply();
    }

    public void setIsForseeDebug(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putBoolean("kohlsForseeConfig", flag);
        editor.apply();
    }

    public void setLoyaltyID(String s)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putString("loyalty", s);
        editor.apply();
    }

    public void setLoyaltyMode(String s)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putString("mode", s);
        editor.commit();
    }

    public void setOmnichannelEnabled(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putBoolean("PREF_OMNICHANNEL_ENABLED", flag);
        editor.apply();
    }

    public void setOmnichannelFlagOverride(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putBoolean("PREF_OMNICHANNEL_OVERRIDE", flag);
        editor.apply();
    }

    public void setOmnitureSecureServer(String s)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putString("omniture_secure_server", s);
        editor.commit();
    }

    public void setOmnitureServer(String s)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putString("omniture_server", s);
        editor.commit();
    }

    public void setPreferenceId(ArrayList arraylist)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        JSONArray jsonarray = new JSONArray();
        if (arraylist == null)
        {
            editor.remove(Appconfig.PREFERENCE_ID);
            editor.commit();
            return;
        }
        for (int i = 0; i < arraylist.size(); i++)
        {
            jsonarray.put(arraylist.get(i));
        }

        if (!arraylist.isEmpty())
        {
            editor.putString(Appconfig.PREFERENCE_ID, jsonarray.toString());
        }
        editor.commit();
    }

    public void setProgramDetailsContent(String s)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putString("programdetail", s);
        editor.commit();
    }

    public void setProgramDetailsHeader(String s)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putString("programheader", s);
        editor.commit();
    }

    public void setRegLandingPageName(String s)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putString("PREF_CMS_PAGENAME", s);
        editor.apply();
    }

    public void setSearchedFileName(String s, String s1)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putString(s, s1);
        editor.commit();
    }

    public void setServerError(String s, String s1)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putString(s, s1);
        editor.commit();
    }

    public void setSigninStatus(String s)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putString("signinshown", s);
        editor.commit();
    }

    public void setTermsandConditionUrl(String s)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putString("tnc", s);
        editor.commit();
    }

    public void setTwitterAutorizationStatus(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putBoolean("twitter_is_user_authorized", flag);
        editor.apply();
    }

    public void setUserMailId(String s)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putString("email_address", s);
        editor.apply();
    }

    public void setUserSignInStatus(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putBoolean("user_signed_in_status", flag);
        editor.apply();
    }

    public void setWalletId(String s)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putString(Appconfig.WALLET_ID, s);
        editor.commit();
    }

    public void updateAppSecureTime()
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putLong("secure_time", System.currentTimeMillis() / 1000L);
        editor.apply();
    }

    public void updateUserCredentialsTokens(String s, String s1, String s2, String s3)
    {
        android.content.SharedPreferences.Editor editor = getDefaultSharePreference().edit();
        editor.putString("access_token", s);
        editor.putString("refresh_token", s1);
        editor.putString("hash", s2);
        editor.putString("timestamp", s3);
        editor.putLong("sign_in_time", System.currentTimeMillis() / 1000L);
        editor.commit();
    }

    public boolean wantOmnichannelFlagOverride()
    {
        return getDefaultSharePreference().getBoolean("PREF_OMNICHANNEL_OVERRIDE", false);
    }
}
