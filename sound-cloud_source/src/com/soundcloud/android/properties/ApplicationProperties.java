// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.properties;

import android.content.res.Resources;
import android.os.Build;
import com.soundcloud.java.checks.Preconditions;
import com.soundcloud.java.objects.MoreObjects;
import com.soundcloud.java.strings.Strings;
import java.util.Locale;

public class ApplicationProperties
{
    public static final class BuildType extends Enum
    {

        private static final BuildType $VALUES[];
        public static final BuildType ALPHA;
        public static final BuildType BETA;
        public static final BuildType DEBUG;
        public static final BuildType RELEASE;
        private final String feedbackEmail;
        private final String playbackFeedbackEmail;

        public static BuildType valueOf(String s)
        {
            return (BuildType)Enum.valueOf(com/soundcloud/android/properties/ApplicationProperties$BuildType, s);
        }

        public static BuildType[] values()
        {
            return (BuildType[])$VALUES.clone();
        }

        static 
        {
            DEBUG = new BuildType("DEBUG", 0, "android-dev@soundcloud.com", "skippy@soundcloud.com");
            ALPHA = new BuildType("ALPHA", 1, "android-alpha-logs@soundcloud.com", "android-alpha-logs-playback@soundcloud.com");
            BETA = new BuildType("BETA", 2, "android-beta-logs@soundcloud.com", "android-beta-logs-playback@soundcloud.com");
            RELEASE = new BuildType("RELEASE", 3, null, null);
            $VALUES = (new BuildType[] {
                DEBUG, ALPHA, BETA, RELEASE
            });
        }



        private BuildType(String s, int i, String s1, String s2)
        {
            super(s, i);
            feedbackEmail = s1;
            playbackFeedbackEmail = s2;
        }
    }


    private static final String ALPHA_LOGS_EMAIL = "android-alpha-logs@soundcloud.com";
    private static final String ALPHA_PLAYBACK_LOGS_EMAIL = "android-alpha-logs-playback@soundcloud.com";
    private static final String BETA_LOGS_EMAIL = "android-beta-logs@soundcloud.com";
    private static final String BETA_PLAYBACK_LOGS_EMAIL = "android-beta-logs-playback@soundcloud.com";
    private static BuildType BUILD_TYPE;
    private static final String DEV_LOGS_EMAIL = "android-dev@soundcloud.com";
    private static final String DEV_PLAYBACK_LOGS_EMAIL = "skippy@soundcloud.com";
    private static boolean GOOGLE_PLUS_ENABLED;
    protected static final boolean IS_RUNNING_ON_DEVICE;
    protected static final boolean IS_RUNNING_ON_EMULATOR;
    private static boolean VERBOSE_LOGGING;
    private final String castReceiverAppId;

    public ApplicationProperties(Resources resources)
    {
        Preconditions.checkNotNull(resources, "Resources should not be null");
        String s = resources.getString(0x7f070244);
        Preconditions.checkArgument(Strings.isNotBlank(s), "Build type not found in application package resources");
        BUILD_TYPE = BuildType.valueOf(s.toUpperCase(Locale.US));
        VERBOSE_LOGGING = resources.getBoolean(0x7f0d000d);
        GOOGLE_PLUS_ENABLED = resources.getBoolean(0x7f0d000c);
        castReceiverAppId = resources.getString(0x7f070249);
    }

    public String getBuildType()
    {
        return BUILD_TYPE.name();
    }

    public String getCastReceiverAppId()
    {
        return castReceiverAppId;
    }

    public String getFeedbackEmail()
    {
        return BUILD_TYPE.feedbackEmail;
    }

    public String getPlaybackFeedbackEmail()
    {
        return BUILD_TYPE.playbackFeedbackEmail;
    }

    public boolean isAlphaBuild()
    {
        return BuildType.ALPHA.equals(BUILD_TYPE);
    }

    public boolean isDebugBuild()
    {
        return BuildType.DEBUG.equals(BUILD_TYPE);
    }

    public boolean isDevBuildRunningOnDevice()
    {
        return isDebugBuild() && IS_RUNNING_ON_DEVICE;
    }

    public boolean isGooglePlusEnabled()
    {
        return GOOGLE_PLUS_ENABLED;
    }

    public boolean isReleaseBuild()
    {
        return BuildType.RELEASE.equals(BUILD_TYPE);
    }

    public boolean isRunningOnDevice()
    {
        return IS_RUNNING_ON_DEVICE;
    }

    public boolean shouldAllowFeedback()
    {
        return BuildType.ALPHA.equals(BUILD_TYPE) || BuildType.BETA.equals(BUILD_TYPE) || BuildType.DEBUG.equals(BUILD_TYPE);
    }

    public boolean shouldEnableNetworkProxy()
    {
        return isDebugBuild() && IS_RUNNING_ON_DEVICE;
    }

    public boolean shouldReportCrashes()
    {
        return !IS_RUNNING_ON_EMULATOR && IS_RUNNING_ON_DEVICE && !BuildType.DEBUG.equals(BUILD_TYPE) && BUILD_TYPE != null;
    }

    public boolean shouldUseBigNotifications()
    {
        return android.os.Build.VERSION.SDK_INT >= 16;
    }

    public boolean shouldUseMediaStyleNotifications()
    {
        return android.os.Build.VERSION.SDK_INT >= 21;
    }

    public String toString()
    {
        return MoreObjects.toStringHelper(this).add("buildType", BUILD_TYPE).add("isDevice", IS_RUNNING_ON_DEVICE).add("isEmulator", IS_RUNNING_ON_EMULATOR).toString();
    }

    public boolean useVerboseLogging()
    {
        return VERBOSE_LOGGING;
    }

    static 
    {
label0:
        {
            boolean flag1 = false;
            boolean flag;
            if (Build.PRODUCT != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            IS_RUNNING_ON_DEVICE = flag;
            if (!"google_sdk".equals(Build.PRODUCT) && !"sdk".equals(Build.PRODUCT) && !"full_x86".equals(Build.PRODUCT))
            {
                flag = flag1;
                if (!"sdk_x86".equals(Build.PRODUCT))
                {
                    break label0;
                }
            }
            flag = true;
        }
        IS_RUNNING_ON_EMULATOR = flag;
    }
}
