// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration.drm;

import android.content.Context;
import android.os.Build;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.configuration.PlayerTypeFactory;
import com.netflix.mediaclient.servicemgr.ErrorLogging;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.PreferenceUtils;
import com.netflix.mediaclient.util.StringUtils;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.configuration.drm:
//            WidevineDrmManager, WidevineMediaDrmEngine, DrmManager, LegacyDrmManager

public final class DrmManagerRegistry
{

    private static final String DRM_SYSTEM_ID_FORCE_LEGACY = "FORCE_LEGACY";
    private static final String DRM_SYSTEM_ID_LEGACY = "LEGACY";
    private static final String NEXUS7_DEB_DEVICE = "deb";
    private static final String NEXUS7_FLO_DEVICE = "flo";
    protected static final String TAG = "nf_drm";
    private static String currentDrmSystem;
    private static boolean disableWidevine;
    private static DrmManager instance;
    private static boolean mPlayerRequiredAdaptivePlayback;
    private static String mSecurityLevel;
    private static WidevineMediaDrmEngine mWidevineMediaDrmEngine;
    private static String previousDrmSystem;

    private DrmManagerRegistry()
    {
    }

    private static void clearKeys(String s)
    {
        getWidevineDrmManager().clearKeys(s);
    }

    private static void clearLicense(byte abyte0[])
    {
        getWidevineMediaDrmEngine().clearLicense(abyte0);
    }

    public static DrmManager createDrmManager(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, com.netflix.mediaclient.service.ServiceAgent.UserAgentInterface useragentinterface, ErrorLogging errorlogging, DrmManager.DrmReadyCallback drmreadycallback)
    {
        com/netflix/mediaclient/service/configuration/drm/DrmManagerRegistry;
        JVM INSTR monitorenter ;
        int i;
        i = AndroidUtils.getAndroidVersion();
        previousDrmSystem = PreferenceUtils.getStringPref(context, "nf_drm_system_id", "LEGACY");
        if (i < 19)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        mSecurityLevel = WidevineDrmManager.getMediaDrmSecurityLevels();
        mPlayerRequiredAdaptivePlayback = PlayerTypeFactory.isJPlayer2(PlayerTypeFactory.getCurrentType(context));
        disableWidevine = configurationagentinterface.isDisableWidevine();
        if (i < 18) goto _L2; else goto _L1
_L1:
        if (!isWidevineDrmAllowed()) goto _L2; else goto _L3
_L3:
        instance = new WidevineDrmManager(context, useragentinterface, errorlogging, drmreadycallback);
_L6:
        if (instance.getDrmType() != 0)
        {
            break MISSING_BLOCK_LABEL_256;
        }
        if (!disableWidevine) goto _L5; else goto _L4
_L4:
        currentDrmSystem = "FORCE_LEGACY";
_L7:
        PreferenceUtils.putStringPref(context, "nf_drm_system_id", currentDrmSystem);
_L8:
        if (Log.isLoggable("nf_drm", 3))
        {
            Log.d("nf_drm", (new StringBuilder()).append("currentDrmSystem : ").append(currentDrmSystem).append(", previousDrmSystem : ").append(previousDrmSystem).toString());
        }
        context = instance;
        com/netflix/mediaclient/service/configuration/drm/DrmManagerRegistry;
        JVM INSTR monitorexit ;
        return context;
_L2:
        if (Log.isLoggable("nf_drm", 3))
        {
            Log.d("nf_drm", (new StringBuilder()).append("LegacyDrmManager for devices running android version = ").append(i).toString());
        }
        instance = new LegacyDrmManager(drmreadycallback);
          goto _L6
        configurationagentinterface;
        Log.e("nf_drm", "Unable to create WidevineDrmManager, default to LegacyDrmManager", configurationagentinterface);
        instance = new LegacyDrmManager(drmreadycallback);
          goto _L6
        context;
        throw context;
_L5:
        currentDrmSystem = "LEGACY";
          goto _L7
        currentDrmSystem = PreferenceUtils.getStringPref(context, "nf_drm_system_id", null);
          goto _L8
    }

    private static void createWidevineMediaDrmEngine()
    {
        mWidevineMediaDrmEngine = new WidevineMediaDrmEngine();
    }

    private static byte[] decrypt(byte abyte0[], byte abyte1[])
    {
        return getWidevineDrmManager().decrypt(abyte0, abyte1);
    }

    public static boolean drmSupportsHd()
    {
        return isCurrentDrmWidevine() && isWidevineLevel1Supported();
    }

    private static byte[] encrypt(byte abyte0[], byte abyte1[])
    {
        return getWidevineDrmManager().encrypt(abyte0, abyte1);
    }

    private static byte[] getChallenge(byte abyte0[])
    {
        return getWidevineMediaDrmEngine().getChallenge(abyte0);
    }

    public static String getDrmInfo()
    {
        if (instance == null)
        {
            return "";
        }
        if (instance.getDrmType() == 1)
        {
            return (new StringBuilder()).append("WV").append(mSecurityLevel).toString();
        }
        if (instance.getDrmType() == 0)
        {
            return "MGK";
        } else
        {
            return "X";
        }
    }

    private static byte[] getNccpSessionKeyRequest()
    {
        return getWidevineDrmManager().getNccpSessionKeyRequest();
    }

    private static byte[][] getSecureStops()
    {
        return (byte[][])(byte[][])getWidevineMediaDrmEngine().getSecureStops().toArray();
    }

    private static WidevineDrmManager getWidevineDrmManager()
    {
        if (isWidevineDrmAllowed())
        {
            return (WidevineDrmManager)instance;
        } else
        {
            throw new IllegalStateException("Private static method is called through JNI on non Widevine supported JB MR2+ device. That should not happen!");
        }
    }

    public static WidevineMediaDrmEngine getWidevineMediaDrmEngine()
    {
        if (isWidevineDrmAllowed() && mWidevineMediaDrmEngine == null)
        {
            createWidevineMediaDrmEngine();
        }
        return mWidevineMediaDrmEngine;
    }

    public static boolean isChangeToWidevineFromLegacy()
    {
        return isDrmSystemChanged() && "FORCE_LEGACY".equals(previousDrmSystem);
    }

    public static boolean isCurrentDrmWidevine()
    {
        if (instance != null)
        {
            return instance.getDrmType() == 1;
        } else
        {
            return false;
        }
    }

    public static boolean isDevicePredeterminedToUseWV()
    {
        return "flo".equals(Build.DEVICE) || "deb".equals(Build.DEVICE);
    }

    public static boolean isDrmSystemChanged()
    {
        if (Log.isLoggable("nf_drm", 3))
        {
            Log.d("nf_drm", (new StringBuilder()).append("currentDrmSystem : ").append(currentDrmSystem).append(", previousDrmSystem : ").append(previousDrmSystem).toString());
        }
        if (StringUtils.isEmpty(currentDrmSystem))
        {
            Log.e("nf_drm", "DrmManager instance is not created");
        } else
        if (!currentDrmSystem.equals(previousDrmSystem) && (!isLegacyDrmSystem(currentDrmSystem) || !isLegacyDrmSystem(previousDrmSystem)))
        {
            Log.d("nf_drm", "DrmSystemChanged");
            return true;
        }
        return false;
    }

    private static boolean isLegacyDrmSystem(String s)
    {
        return StringUtils.isEmpty(s) || "LEGACY".equals(s) || "FORCE_LEGACY".equals(s);
    }

    private static boolean isPlatformDrmSupported()
    {
        return isWidevineDrmAllowed();
    }

    public static boolean isWidevineDrmAllowed()
    {
        boolean flag = true;
        if (!disableWidevine)
        {
            int i = AndroidUtils.getAndroidVersion();
            if (i > 18)
            {
                if (!WidevineDrmManager.isWidewineSupported() || !isWidevineLevel1Supported() || !mPlayerRequiredAdaptivePlayback)
                {
                    flag = false;
                }
                return flag;
            }
            if (i == 18 && isDevicePredeterminedToUseWV() && WidevineDrmManager.isWidewineSupported())
            {
                if (Log.isLoggable("nf_drm", 3))
                {
                    Log.d("nf_drm", (new StringBuilder()).append("API level = ").append(i).append(" and Build.DEVICE =").append(Build.DEVICE).append(". Using WidevineDrmManager").toString());
                    Log.d("nf_drm", "Flo/Deb devices running JB MR2  WITH Widevine support");
                }
                return true;
            }
        }
        return false;
    }

    private static boolean isWidevineLevel1Supported()
    {
        return "L1".equalsIgnoreCase(mSecurityLevel);
    }

    private static void releaseSecureStops(byte abyte0[])
    {
        getWidevineMediaDrmEngine().releaseSecureStops(abyte0);
    }

    private static boolean restoreKeys(String s, String s1, String s2)
    {
        return getWidevineDrmManager().restoreKeys(s, s1, s2);
    }

    private static byte[] sign(byte abyte0[])
    {
        return getWidevineDrmManager().sign(abyte0);
    }

    private static byte[] storeLicense(byte abyte0[])
    {
        return getWidevineMediaDrmEngine().storeLicense(abyte0);
    }

    private static boolean updateKeyResponse(byte abyte0[], byte abyte1[], byte abyte2[], String s)
    {
        return getWidevineDrmManager().updateNccpSessionKeyResponse(abyte0, abyte1, abyte2, s);
    }

    private static boolean verify(byte abyte0[], byte abyte1[])
    {
        return getWidevineDrmManager().verify(abyte0, abyte1);
    }
}
