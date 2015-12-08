// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.common.util.auth;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.po.GetCustomerProfilePO;
import com.kohls.mcommerce.opal.common.po.ResetMyPasswordPO;
import com.kohls.mcommerce.opal.common.po.SignInAndProfilePO;
import com.kohls.mcommerce.opal.common.po.SignInInfoPO;
import com.kohls.mcommerce.opal.common.po.TokenRegisrationPO;
import com.kohls.mcommerce.opal.common.util.ConfigurationUtils;
import com.kohls.mcommerce.opal.common.util.Logger;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.common.util.crypt.CryptUtil;
import com.kohls.mcommerce.opal.common.value.CommonValues;
import com.kohls.mcommerce.opal.framework.controller.ControllerFactory;
import com.kohls.mcommerce.opal.framework.controller.iface.IListRegistryController;
import com.kohls.mcommerce.opal.framework.vo.ProfileInfo;
import com.kohls.mcommerce.opal.helper.adapter.AdapterHelper;
import com.kohls.mcommerce.opal.helper.adapter.AdapterProcedure;
import com.kohls.mcommerce.opal.helper.adapter.listener.IAdapterListener;
import com.kohls.mcommerce.opal.helper.db.custom.DBShoppingBagHelper;
import com.kohls.mcommerce.opal.helper.preference.PreferenceHelper;
import com.kohls.mcommerce.opal.wallet.asynctask.RegisterEventAsyncTask;
import java.util.ArrayList;

public class AuthUtil
{

    private static AuthUtil mAuthUtil;
    public static boolean mIsUserSignedIn;
    private final Context mCtx;
    private IdleTimer mIdleTimer;
    private SecureTimer mSecureTimer;
    private String mUserName;
    private Activity secureActivity;

    private AuthUtil(Context context)
    {
        mCtx = context;
    }

    private void clearUserCredentialAndInfo()
    {
    /* block-local class not found */
    class SecureTimer {}

        if (mSecureTimer != null && mSecureTimer.isTimerRunning())
        {
            mSecureTimer.stopTimer();
            mSecureTimer = null;
        }
        KohlsPhoneApplication.getInstance().getKohlsPref().clearUserCredentialAndInfo(true);
    }

    public static AuthUtil getInstance(Context context)
    {
        com/kohls/mcommerce/opal/common/util/auth/AuthUtil;
        JVM INSTR monitorenter ;
        if (mAuthUtil == null)
        {
            mAuthUtil = new AuthUtil(context);
        }
        context = mAuthUtil;
        com/kohls/mcommerce/opal/common/util/auth/AuthUtil;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public void authenticateUser(String s, String s1, IAdapterListener iadapterlistener)
    {
        SignInAndProfilePO signinandprofilepo = new SignInAndProfilePO();
        signinandprofilepo.setuserId(s);
        signinandprofilepo.setpassword(s1);
        signinandprofilepo.setgrant_type("password");
        (new AdapterHelper(AdapterProcedure.SIGNIN_AND_PROFILE, signinandprofilepo, iadapterlistener)).performTask();
    }

    public void checkAndUpdateSecureScreen()
    {
        if (secureActivity != null && !secureActivity.isFinishing() && mCtx != null)
        {
            secureActivity.runOnUiThread(new _cls1());
        }
    }

    public boolean checkUserSessionValid()
    {
        PreferenceHelper preferencehelper = KohlsPhoneApplication.getInstance().getKohlsPref();
        long l2 = preferencehelper.getAccessTokenExpireTime();
        long l = preferencehelper.getSignInTime();
        long l1 = System.currentTimeMillis() / 1000L;
        if (l2 != 0L && l1 != 0L && l != 0L)
        {
            if (mSecureTimer != null && mSecureTimer.isTimerRunning())
            {
                l2 -= CommonValues.getInstance().getAccesstokenExpiry();
                Logger.debug("AuthUtil.111.", (new StringBuilder()).append("time left ").append(l1 - l).append(" expired time ==").append(l2).toString());
                boolean flag;
                if (l1 - l < l2)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    Logger.debug("AuthUtil..", (new StringBuilder()).append("").append(flag).toString());
                }
                return true;
            }
            boolean flag1;
            if (l1 - l < l2)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            setUserSignInStatus(flag1);
            return flag1;
        } else
        {
            return false;
        }
    }

    public void generateWalletId()
    {
    /* block-local class not found */
    class GetWalletIdTask {}

        (new GetWalletIdTask()).execute(new String[0]);
    }

    public String getErrorTimestamp()
    {
        return KohlsPhoneApplication.getInstance().getKohlsPref().getErrorTimestamp();
    }

    public String getFaqUrl()
    {
        return KohlsPhoneApplication.getInstance().getKohlsPref().getFaqUrl();
    }

    public String getFirstInstallValue()
    {
        return KohlsPhoneApplication.getInstance().getKohlsPref().getFirstInstallValue();
    }

    public String getLoyaltyIDFromPref()
    {
        CryptUtil cryptutil = new CryptUtil(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getKrj());
        String s1 = KohlsPhoneApplication.getInstance().getKohlsPref().getLoyaltyID();
        String s = "";
        if (!TextUtils.isEmpty(s1))
        {
            s = cryptutil.doDeCrypto(s1);
        }
        return s;
    }

    public String getLoyaltyMode()
    {
        return KohlsPhoneApplication.getInstance().getKohlsPref().getLoyaltyMode();
    }

    public ArrayList getPreferenceId()
    {
        return KohlsPhoneApplication.getInstance().getKohlsPref().getPreferenceId();
    }

    public String getPreviousUserMailIdFromPref()
    {
        CryptUtil cryptutil = new CryptUtil(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getKrj());
        String s1 = KohlsPhoneApplication.getInstance().getKohlsPref().getUserMailId();
        String s = "";
        if (!TextUtils.isEmpty(s1))
        {
            s = cryptutil.doDeCrypto(s1);
        }
        return s;
    }

    public String getProgramDetailsContent()
    {
        return KohlsPhoneApplication.getInstance().getKohlsPref().getProgramDetailsContent();
    }

    public String getProgramDetailsHeader()
    {
        return KohlsPhoneApplication.getInstance().getKohlsPref().getProgramDetailsHeader();
    }

    public String getRefreshTokenFromPref()
    {
        CryptUtil cryptutil = new CryptUtil(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getKrj());
        String s1 = KohlsPhoneApplication.getInstance().getKohlsPref().getRefreshToken();
        String s = "";
        if (!TextUtils.isEmpty(s1))
        {
            s = cryptutil.doDeCrypto(s1);
        }
        return s;
    }

    public String getSearchedFileName(String s)
    {
        return KohlsPhoneApplication.getInstance().getKohlsPref().getSearchedFileName(s);
    }

    public long getSecureTime()
    {
        return KohlsPhoneApplication.getInstance().getKohlsPref().getSecureTime();
    }

    public String getServerError(String s)
    {
        return KohlsPhoneApplication.getInstance().getKohlsPref().getServerError(s);
    }

    public String getSessionTimestamp()
    {
        return KohlsPhoneApplication.getInstance().getKohlsPref().getExpiryStringTime();
    }

    public String getSignedInUserEmailFromPref()
    {
        CryptUtil cryptutil = new CryptUtil(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getKrj());
        String s1 = KohlsPhoneApplication.getInstance().getKohlsPref().getSignedInUserEmail();
        String s = "";
        if (!TextUtils.isEmpty(s1))
        {
            s = cryptutil.doDeCrypto(s1);
        }
        return s;
    }

    public String getSignedInUserID()
    {
        CryptUtil cryptutil = new CryptUtil(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getKrj());
        String s1 = KohlsPhoneApplication.getInstance().getKohlsPref().getSignedInUserId();
        String s = s1;
        if (!TextUtils.isEmpty(s1))
        {
            s = cryptutil.doDeCrypto(s1);
        }
        return s;
    }

    public String getSignedInUserLastnameFromPref()
    {
        CryptUtil cryptutil = new CryptUtil(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getKrj());
        String s1 = KohlsPhoneApplication.getInstance().getKohlsPref().getSignedinUserLastName();
        String s = "";
        if (!TextUtils.isEmpty(s1))
        {
            s = cryptutil.doDeCrypto(s1);
        }
        return s;
    }

    public String getSignedInUsernameFromPref()
    {
        CryptUtil cryptutil = new CryptUtil(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getKrj());
        String s1 = KohlsPhoneApplication.getInstance().getKohlsPref().getSignedInUserName();
        String s = "";
        if (!TextUtils.isEmpty(s1))
        {
            s = cryptutil.doDeCrypto(s1);
        }
        return s;
    }

    public String getSigninStatus()
    {
        return KohlsPhoneApplication.getInstance().getKohlsPref().getSigninStatus();
    }

    public String getTermsandConditionUrl()
    {
        return KohlsPhoneApplication.getInstance().getKohlsPref().getTermsandConditionUrl();
    }

    public String getUserAccessTokenFromPref()
    {
        CryptUtil cryptutil = new CryptUtil(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getKrj());
        String s1 = KohlsPhoneApplication.getInstance().getKohlsPref().getAccessToken();
        String s = "";
        if (!TextUtils.isEmpty(s1))
        {
            s = cryptutil.doDeCrypto(s1);
        }
        return s;
    }

    public String getWalletHash()
    {
        CryptUtil cryptutil = new CryptUtil(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getKrj());
        String s1 = KohlsPhoneApplication.getInstance().getKohlsPref().getWalletHash();
        String s = s1;
        if (!TextUtils.isEmpty(s1))
        {
            s = cryptutil.doDeCrypto(s1);
        }
        return s;
    }

    public String getWalletId()
    {
        CryptUtil cryptutil = new CryptUtil(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getKrj());
        String s1 = KohlsPhoneApplication.getInstance().getKohlsPref().getWalletId();
        String s = "";
        if (!TextUtils.isEmpty(s1))
        {
            s = cryptutil.doDeCrypto(s1);
        }
        return s;
    }

    public String getWalletTimestamp()
    {
        CryptUtil cryptutil = new CryptUtil(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getKrj());
        String s1 = KohlsPhoneApplication.getInstance().getKohlsPref().getWalletTimestamp();
        String s = s1;
        if (!TextUtils.isEmpty(s1))
        {
            s = cryptutil.doDeCrypto(s1);
        }
        return s;
    }

    public boolean isSecureTimerRunning()
    {
        return mSecureTimer != null && mSecureTimer.isTimerRunning();
    }

    public boolean isUserSignedIn()
    {
        return KohlsPhoneApplication.getInstance().getKohlsPref().getUserSignInStatus();
    }

    public void resetIdleTimer()
    {
        KohlsPhoneApplication.getInstance().getKohlsPref().setIdleTime();
    }

    public void saveUserCredentialsAndInfo(String s, String s1, String s2, long l, String s3, ProfileInfo profileinfo, 
            String s4, String s5, String s6, String s7, String s8, String s9, String s10)
    {
        profileinfo = new CryptUtil(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getKrj());
        String s11 = profileinfo.doCrypto(s);
        String s12 = profileinfo.doCrypto(s1);
        String s13 = profileinfo.doCrypto(s2);
        s3 = profileinfo.doCrypto(s3);
        s = s9;
        if (!TextUtils.isEmpty(s9))
        {
            s = profileinfo.doCrypto(s9);
        }
        s1 = s10;
        if (!TextUtils.isEmpty(s10))
        {
            s1 = profileinfo.doCrypto(s10);
        }
        s7 = profileinfo.doCrypto(s7);
        s6 = profileinfo.doCrypto(s6);
        s2 = s8;
        if (!TextUtils.isEmpty(s8))
        {
            s2 = profileinfo.doCrypto(s8);
        }
        KohlsPhoneApplication.getInstance().getKohlsPref().saveUserCredentialsAndInfo(s11, s12, s13, l, s3, s6, s4, s5, s7, s2, s, s1);
        updateSecureTime();
        s = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getFirstInstallValue();
        if (TextUtils.isEmpty(s) || s.equalsIgnoreCase("YES"))
        {
            KohlsPhoneApplication.getInstance().getAuthenticationUtils().setFirstInstallValue("YES");
            if (!TextUtils.isEmpty(s2))
            {
                (new RegisterEventAsyncTask(mCtx)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[] {
                    "Download_Signin_NativeApp"
                });
            }
            KohlsPhoneApplication.getInstance().getAuthenticationUtils().setFirstInstallValue("NO");
        }
        if (KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getSpecificOfferListOn().equalsIgnoreCase("true"))
        {
            ControllerFactory.getListandRegistryController(null).getBlackFridayList();
        }
        CommonValues.getInstance();
    }

    public void saveUserSignedInCustomerName(String s, String s1)
    {
        CryptUtil cryptutil = new CryptUtil(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getKrj());
        s = cryptutil.doCrypto(s);
        s1 = cryptutil.doCrypto(s1);
        KohlsPhoneApplication.getInstance().getKohlsPref().saveCustomerName(s, s1);
    }

    public void sendGetCustomerProfileReq(IAdapterListener iadapterlistener)
    {
        GetCustomerProfilePO getcustomerprofilepo = new GetCustomerProfilePO();
        getcustomerprofilepo.setAccess_token(getUserAccessTokenFromPref());
        String s = getPreviousUserMailIdFromPref();
        if (s != null)
        {
            getcustomerprofilepo.setuid(s);
        }
        iadapterlistener = new AdapterHelper(AdapterProcedure.GET_CUSTOMER_PROFILE, getcustomerprofilepo, iadapterlistener);
        Logger.debug("AuthUtil", (new StringBuilder()).append("").append(getcustomerprofilepo).toString());
        iadapterlistener.performTask();
    }

    public void sendRefreshTokenReq(IAdapterListener iadapterlistener)
    {
        PreferenceHelper preferencehelper = KohlsPhoneApplication.getInstance().getKohlsPref();
        long l = preferencehelper.getAccessTokenExpireTime();
        long l1 = preferencehelper.getSignInTime();
        long l2 = System.currentTimeMillis() / 1000L;
        if (l != 0L && l2 != 0L && l1 != 0L)
        {
            boolean flag;
            if (l2 - l1 < l - (long)CommonValues.getInstance().getAccesstokenExpiry() && l2 - l1 >= 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag && mSecureTimer != null && mSecureTimer.isTimerRunning())
            {
                String s = getRefreshTokenFromPref();
                TokenRegisrationPO tokenregisrationpo = new TokenRegisrationPO();
                tokenregisrationpo.setGrant_type("refresh_token");
                tokenregisrationpo.setRefresh_token(s);
                tokenregisrationpo.setEmail(getPreviousUserMailIdFromPref());
                tokenregisrationpo.setFname(getSignedInUsernameFromPref());
                tokenregisrationpo.setLname(getSignedInUserLastnameFromPref());
                if (TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getWalletId()))
                {
                    generateWalletId();
                }
                tokenregisrationpo.setWalletId(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getWalletId());
                tokenregisrationpo.setUid(getSignedInUserID());
                (new AdapterHelper(AdapterProcedure.TOKEN_REGISRATION, tokenregisrationpo, iadapterlistener)).performTask();
            } else
            if (!flag)
            {
                iadapterlistener.onSuccess(null);
                return;
            }
        }
    }

    public void setEncodedLoyaltyID(String s)
    {
        s = (new CryptUtil(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getKrj())).doCrypto(s);
        KohlsPhoneApplication.getInstance().getKohlsPref().setLoyaltyID(s);
    }

    public void setErrorTimestamp(String s)
    {
        KohlsPhoneApplication.getInstance().getKohlsPref().setErrorTimestamp(s);
    }

    public void setFaqUrl(String s)
    {
        KohlsPhoneApplication.getInstance().getKohlsPref().setFaqUrl(s);
    }

    public void setFirstInstallValue(String s)
    {
        KohlsPhoneApplication.getInstance().getKohlsPref().setFirstInstallValue(s);
    }

    public void setLoyaltyMode(String s)
    {
        KohlsPhoneApplication.getInstance().getKohlsPref().setLoyaltyMode(s);
    }

    public void setPreferenceId(ArrayList arraylist)
    {
        KohlsPhoneApplication.getInstance().getKohlsPref().setPreferenceId(arraylist);
    }

    public void setProgramDetailsContent(String s)
    {
        KohlsPhoneApplication.getInstance().getKohlsPref().setProgramDetailsContent(s);
    }

    public void setProgramDetailsHeader(String s)
    {
        KohlsPhoneApplication.getInstance().getKohlsPref().setProgramDetailsHeader(s);
    }

    public void setSearchedFileName(String s, String s1)
    {
        KohlsPhoneApplication.getInstance().getKohlsPref().setSearchedFileName(s, s1);
    }

    public void setServerError(String s, String s1)
    {
        KohlsPhoneApplication.getInstance().getKohlsPref().setServerError(s, s1);
    }

    public void setSigninStatus(String s)
    {
        KohlsPhoneApplication.getInstance().getKohlsPref().setSigninStatus(s);
    }

    public void setTermsandConditionUrl(String s)
    {
        KohlsPhoneApplication.getInstance().getKohlsPref().setTermsandConditionUrl(s);
    }

    public void setUserName(String s)
    {
        s = (new CryptUtil(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getKrj())).doCrypto(s);
        KohlsPhoneApplication.getInstance().getKohlsPref().saveUserName(s);
    }

    public void setUserNewMailIdInPref(String s)
    {
        s = (new CryptUtil(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getKrj())).doCrypto(s);
        KohlsPhoneApplication.getInstance().getKohlsPref().setUserMailId(s);
    }

    public void setUserSignInStatus(boolean flag)
    {
        KohlsPhoneApplication.getInstance().getKohlsPref().setUserSignInStatus(flag);
        if (!flag)
        {
            clearUserCredentialAndInfo();
            if (UtilityMethods.isOmniChannelBagClientEnabled())
            {
                (new DBShoppingBagHelper()).deleteAll("ShoppingBag");
                KohlsPhoneApplication.getInstance().getKohlsPref().saveCartID(null);
            }
        }
    }

    public void setWalletId(String s)
    {
        s = (new CryptUtil(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getKrj())).doCrypto(s);
        KohlsPhoneApplication.getInstance().getKohlsPref().setWalletId(s);
    }

    public void startIdleTimer(Activity activity)
    {
        secureActivity = activity;
    /* block-local class not found */
    class IdleTimer {}

        if (mIdleTimer == null || !mIdleTimer.isIdleTimerRunning())
        {
            mIdleTimer = new IdleTimer(CommonValues.getInstance().getIdleTimeOut());
            mIdleTimer.startIdleTimer();
        }
    }

    public void startSigninTimer()
    {
        if (mSecureTimer == null || !mSecureTimer.isTimerRunning())
        {
            mSecureTimer = new SecureTimer(CommonValues.getInstance().getSignInTimeOut());
            mSecureTimer.startTimer();
        }
    }

    public void stopIdleTimer()
    {
        if (mIdleTimer != null)
        {
            mIdleTimer.stopIdleTimer();
        }
    }

    public void updateProfile(String s, IAdapterListener iadapterlistener)
    {
        ResetMyPasswordPO resetmypasswordpo = new ResetMyPasswordPO();
        resetmypasswordpo.getClass();
        com.kohls.mcommerce.opal.common.po.ResetMyPasswordPO.Params params = new com.kohls.mcommerce.opal.common.po.ResetMyPasswordPO.Params(resetmypasswordpo);
        params.getClass();
        com.kohls.mcommerce.opal.common.po.ResetMyPasswordPO.Params.PayLoad payload = new com.kohls.mcommerce.opal.common.po.ResetMyPasswordPO.Params.PayLoad(params);
        payload.getClass();
        com.kohls.mcommerce.opal.common.po.ResetMyPasswordPO.Params.PayLoad.Profile profile = new com.kohls.mcommerce.opal.common.po.ResetMyPasswordPO.Params.PayLoad.Profile(payload);
        profile.getClass();
        com.kohls.mcommerce.opal.common.po.ResetMyPasswordPO.Params.PayLoad.Profile.CustomerName customername = new com.kohls.mcommerce.opal.common.po.ResetMyPasswordPO.Params.PayLoad.Profile.CustomerName(profile);
        resetmypasswordpo.setAccess_token(getUserAccessTokenFromPref());
        customername.setFirstName(getSignedInUsernameFromPref());
        customername.setLastName(getSignedInUserLastnameFromPref());
        profile.setEmail(getPreviousUserMailIdFromPref());
        resetmypasswordpo.setAccess_token(getUserAccessTokenFromPref());
        profile.setLoyaltyId(s);
        profile.setCustomerName(customername);
        payload.setProfile(profile);
        params.setPayload(payload);
        resetmypasswordpo.setParams(params);
        (new AdapterHelper(AdapterProcedure.UPDATE_ACCOUNT, resetmypasswordpo, iadapterlistener)).performTask();
        iadapterlistener = new CryptUtil(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getKrj());
        if (!TextUtils.isEmpty(s))
        {
            s = iadapterlistener.doCrypto(s);
            KohlsPhoneApplication.getInstance().getKohlsPref().setLoyaltyID(s);
        }
    }

    public void updateResetMyPasswordDetails(String s, IAdapterListener iadapterlistener)
    {
        ResetMyPasswordPO resetmypasswordpo = new ResetMyPasswordPO();
        resetmypasswordpo.getClass();
        com.kohls.mcommerce.opal.common.po.ResetMyPasswordPO.Params params = new com.kohls.mcommerce.opal.common.po.ResetMyPasswordPO.Params(resetmypasswordpo);
        params.getClass();
        com.kohls.mcommerce.opal.common.po.ResetMyPasswordPO.Params.PayLoad payload = new com.kohls.mcommerce.opal.common.po.ResetMyPasswordPO.Params.PayLoad(params);
        payload.getClass();
        com.kohls.mcommerce.opal.common.po.ResetMyPasswordPO.Params.PayLoad.Profile profile = new com.kohls.mcommerce.opal.common.po.ResetMyPasswordPO.Params.PayLoad.Profile(payload);
        profile.getClass();
        com.kohls.mcommerce.opal.common.po.ResetMyPasswordPO.Params.PayLoad.Profile.CustomerName customername = new com.kohls.mcommerce.opal.common.po.ResetMyPasswordPO.Params.PayLoad.Profile.CustomerName(profile);
        resetmypasswordpo.setAccess_token(getUserAccessTokenFromPref());
        customername.setFirstName(getSignedInUsernameFromPref());
        customername.setLastName(getSignedInUserLastnameFromPref());
        profile.setPassword(s);
        profile.setEmail(getPreviousUserMailIdFromPref());
        profile.setCustomerName(customername);
        payload.setProfile(profile);
        params.setPayload(payload);
        resetmypasswordpo.setParams(params);
        (new AdapterHelper(AdapterProcedure.UPDATE_ACCOUNT, resetmypasswordpo, iadapterlistener)).performTask();
    }

    public void updateSecureTime()
    {
        if (isUserSignedIn())
        {
            startSigninTimer();
            KohlsPhoneApplication.getInstance().getKohlsPref().updateAppSecureTime();
        }
    }

    public void updateSignInInfoDetails(IAdapterListener iadapterlistener, String s, String s1, String s2)
    {
        SignInInfoPO signininfopo = new SignInInfoPO();
        signininfopo.getClass();
        com.kohls.mcommerce.opal.common.po.SignInInfoPO.Params params = new com.kohls.mcommerce.opal.common.po.SignInInfoPO.Params(signininfopo);
        params.getClass();
        com.kohls.mcommerce.opal.common.po.SignInInfoPO.Params.PayLoad payload = new com.kohls.mcommerce.opal.common.po.SignInInfoPO.Params.PayLoad(params);
        payload.getClass();
        com.kohls.mcommerce.opal.common.po.SignInInfoPO.Params.PayLoad.Profile profile = new com.kohls.mcommerce.opal.common.po.SignInInfoPO.Params.PayLoad.Profile(payload);
        profile.getClass();
        com.kohls.mcommerce.opal.common.po.SignInInfoPO.Params.PayLoad.Profile.CustomerName customername = new com.kohls.mcommerce.opal.common.po.SignInInfoPO.Params.PayLoad.Profile.CustomerName(profile);
        signininfopo.setAccess_token(getUserAccessTokenFromPref());
        customername.setFirstName(s);
        customername.setLastName(s1);
        profile.setEmail(s2);
        profile.setCustomerName(customername);
        payload.setProfile(profile);
        params.setPayload(payload);
        signininfopo.setParams(params);
        (new AdapterHelper(AdapterProcedure.UPDATE_ACCOUNT, signininfopo, iadapterlistener)).performTask();
    }

    public void updateUserCredentialsTokens(String s, String s1, String s2, String s3)
    {
        PreferenceHelper preferencehelper = KohlsPhoneApplication.getInstance().getKohlsPref();
        CryptUtil cryptutil = new CryptUtil(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getKrj());
        preferencehelper.updateUserCredentialsTokens(cryptutil.doCrypto(s), cryptutil.doCrypto(s1), cryptutil.doCrypto(s2), cryptutil.doCrypto(s3));
    }



    /* member class not found */
    class _cls1 {}

}
