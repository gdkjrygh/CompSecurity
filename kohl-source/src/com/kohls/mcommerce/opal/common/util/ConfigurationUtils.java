// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.apptentive.android.sdk.prefence.KohlsApptentivePreference;
import com.fsr.tracker.TrackerEventListener;
import com.fsr.tracker.app.TrackingContext;
import com.fsr.tracker.domain.Configuration;
import com.fsr.tracker.domain.MeasureConfiguration;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.po.ConfigurationPO;
import com.kohls.mcommerce.opal.common.ui.components.UpgradeDialog;
import com.kohls.mcommerce.opal.common.value.CommonValues;
import com.kohls.mcommerce.opal.framework.controller.impl.ConfigurationConrollerImpl;
import com.kohls.mcommerce.opal.framework.vo.ConfigurationVO;
import com.kohls.mcommerce.opal.helper.adapter.AdapterHelper;
import com.kohls.mcommerce.opal.helper.adapter.AdapterProcedure;
import com.kohls.mcommerce.opal.helper.preference.PreferenceHelper;

// Referenced classes of package com.kohls.mcommerce.opal.common.util:
//            UtilityMethods, ForseeUtils, ConfigurationUpdateObserver

public class ConfigurationUtils
    implements TrackerEventListener
{

    boolean isUpgradeNeeded;
    private com.kohls.mcommerce.opal.framework.vo.ConfigurationVO.PayLoad.Config mConfig;
    private ConfigurationUpdateObserver mConfigObserver;

    public ConfigurationUtils()
    {
        mConfig = null;
        isUpgradeNeeded = false;
    }

    private void initialiseOmniture(boolean flag)
    {
        if (flag)
        {
            KohlsPhoneApplication.getInstance().initOmniture(true);
        }
    }

    private void initializeAppTracking()
    {
        if (CommonValues.getInstance().isEnableForseeFeedback())
        {
            Configuration configuration = Configuration.defaultConfiguration(KohlsPhoneApplication.getContext().getString(0x7f08021c));
            TrackingContext.start(KohlsPhoneApplication.getInstance(), configuration);
            if (TrackingContext.Instance() != null)
            {
                TrackingContext.Instance().setTrackerEventListener(this);
            }
        }
    }

    private void setAppLibrariesProperties()
    {
        initialiseForsee(false);
        initialiseOmniture(mConfig.isOmnitureEnabled().equals("true"));
    }

    private void setAppProperties()
    {
        CommonValues commonvalues = CommonValues.getInstance();
        if (mConfig != null)
        {
            if (mConfig.isForseeEnabled() != null)
            {
                commonvalues.setEnableForseeFeedback(mConfig.isForseeEnabled().equals("true"));
                commonvalues.setEnableAnalytics(mConfig.isOmnitureEnabled().equals("true"));
            }
            if (mConfig.isDigbyEnabled() != null)
            {
                commonvalues.setEnableDigby(mConfig.isDigbyEnabled().equals("true"));
            }
            if (!TextUtils.isEmpty(mConfig.getIdleTimeout()))
            {
                commonvalues.setIdleTimeOut(Integer.parseInt(mConfig.getIdleTimeout()));
            }
            if (!TextUtils.isEmpty(mConfig.getSigninTimeout()))
            {
                commonvalues.setSignInTimeOut(Integer.parseInt(mConfig.getSigninTimeout()));
            }
            if (mConfig.isMFPNotificationEnabled() != null)
            {
                commonvalues.setMFPNotificationEnabled(mConfig.isMFPNotificationEnabled().equals("true"));
            }
        }
    }

    private void setConficurationProp()
    {
        setAppProperties();
        setAppLibrariesProperties();
    }

    public void fetchAppConfigFromApi(ConfigurationUpdateObserver configurationupdateobserver)
    {
        mConfigObserver = configurationupdateobserver;
        configurationupdateobserver = new ConfigurationPO();
        configurationupdateobserver.setType("config");
        (new AdapterHelper(AdapterProcedure.CONFIGURATION_DATA, configurationupdateobserver, new ConfigurationConrollerImpl())).performTask();
    }

    public com.kohls.mcommerce.opal.framework.vo.ConfigurationVO.PayLoad.Config getConfig()
    {
        return mConfig;
    }

    public void initAppConfig()
    {
        String s = KohlsPhoneApplication.getInstance().getKohlsPref().getAppConfiguration();
        Object obj = s;
        if (s == null)
        {
            obj = UtilityMethods.loadJSONFromAsset(KohlsPhoneApplication.getContext(), "default_config");
        }
        obj = (ConfigurationVO)UtilityMethods.getModelFromJsonString(((String) (obj)), com/kohls/mcommerce/opal/framework/vo/ConfigurationVO);
        if (((ConfigurationVO) (obj)).getPayload() != null && ((ConfigurationVO) (obj)).getPayload().getConfig() != null)
        {
            mConfig = ((ConfigurationVO) (obj)).getPayload().getConfig();
            setConficurationProp();
            fetchAppConfigFromApi(null);
        }
        initializeAppTracking();
    }

    public void initialiseForsee(boolean flag)
    {
        CommonValues commonvalues = CommonValues.getInstance();
        boolean flag1 = (new KohlsApptentivePreference(KohlsPhoneApplication.getContext())).isApptentivesurveyShown();
        if (commonvalues.isEnableForseeFeedback() && !flag1)
        {
            ForseeUtils.initialiseForsee(KohlsPhoneApplication.getInstance(), Integer.parseInt(mConfig.getForsee_DefaultDaysSinceFirstLaunch()), Integer.parseInt(mConfig.getForsee_DefaultLaunchCount()), Integer.parseInt(mConfig.getForsee_DefaultRepeatDaysAfterDecline()), Integer.parseInt(mConfig.getForsee_DefaultRepeatDaysAfterComplete()), 0, flag);
            return;
        } else
        {
            ForseeUtils.disableForsee();
            return;
        }
    }

    public boolean isUpgradeNeeded()
    {
        return isUpgradeNeeded;
    }

    public void notifyExitForesee()
    {
        if (CommonValues.getInstance().isEnableForseeFeedback())
        {
            ForseeUtils.foreseeAppExit();
            return;
        } else
        {
            ForseeUtils.disableForsee();
            return;
        }
    }

    public void onInviteAccepted(MeasureConfiguration measureconfiguration)
    {
    }

    public void onInviteDeclined(MeasureConfiguration measureconfiguration)
    {
    }

    public void onInvitePresented(MeasureConfiguration measureconfiguration)
    {
        KohlsPhoneApplication.getInstance().getKohlsPref().setForseeSurveyFlag();
    }

    public void onSamplingCheckCompleted(MeasureConfiguration measureconfiguration, boolean flag)
    {
    }

    public void onSurveyAborted(MeasureConfiguration measureconfiguration)
    {
    }

    public void onSurveyCompleted(MeasureConfiguration measureconfiguration)
    {
    }

    public void removeConfigUpdateObserver()
    {
        mConfigObserver = null;
    }

    public void updateConfigVOInPreferences(ConfigurationVO configurationvo)
    {
        if (configurationvo != null)
        {
            String s = UtilityMethods.createJsonFromModel(configurationvo);
            KohlsPhoneApplication.getInstance().getKohlsPref().saveAppCofiguration(s);
            mConfig = configurationvo.getPayload().getConfig();
            setConficurationProp();
            if (mConfigObserver != null)
            {
                mConfigObserver.onConfigUpdated();
            }
        }
    }

    public void validateVersion(UpgradeDialog upgradedialog, Context context)
    {
        String s1;
        context = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        s1 = ((PackageInfo) (context)).versionName;
        if (mConfig == null || TextUtils.isEmpty(s1) || context == null)
        {
            break MISSING_BLOCK_LABEL_277;
        }
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        String s = mConfig.getAppAndroidVersion();
        String as[] = s1.split("\\.");
        i = Integer.parseInt(as[0]);
        j = Integer.parseInt(as[1]);
        k = ((PackageInfo) (context)).versionCode;
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_277;
        }
        context = s.split("\\.");
        l = Integer.parseInt(context[0]);
        i1 = Integer.parseInt(context[1]);
        j1 = Integer.parseInt(context[2]);
        if (l <= i) goto _L2; else goto _L1
_L1:
        isUpgradeNeeded = true;
_L5:
        if (!isUpgradeNeeded)
        {
            break MISSING_BLOCK_LABEL_277;
        }
        if (mConfig.getForceAndroidUpgrade().equalsIgnoreCase("true"))
        {
            upgradedialog.launchUpgradeDialog(true);
            return;
        }
        break MISSING_BLOCK_LABEL_216;
_L2:
        if (l != i || i1 <= j) goto _L4; else goto _L3
_L3:
        try
        {
            isUpgradeNeeded = true;
        }
        // Misplaced declaration of an exception variable
        catch (UpgradeDialog upgradedialog)
        {
            upgradedialog.printStackTrace();
            return;
        }
          goto _L5
_L4:
        if (l != i || i1 != j || j1 <= k) goto _L5; else goto _L6
_L6:
        isUpgradeNeeded = true;
          goto _L5
        long l1;
        long l2;
        context = KohlsPhoneApplication.getInstance().getKohlsPref();
        l1 = Long.parseLong(mConfig.getAlertUpgradeInterval());
        l2 = context.getCurrentTimeForUpgradeAlertInterval();
        boolean flag;
        if (System.currentTimeMillis() / 1000L - l2 > l1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_277;
        }
        upgradedialog.launchUpgradeDialog(false);
        return;
    }
}
