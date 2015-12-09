// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.content.SharedPreferences;
import com.cardinalblue.android.a.a;
import com.cardinalblue.android.b.d;
import com.cardinalblue.android.b.k;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            IGsonable

public class PICDeviceConfig
    implements IGsonable
{
    public static class InAppNotification
        implements IGsonable
    {

        public InAppNotificationSetting uncreatedCollage;
        public InAppNotificationSetting unfinishedCollage;

        public String toString()
        {
            return (new StringBuilder()).append("unfinished_collage : ").append(unfinishedCollage.toString()).append("\n").append("uncreated_collage : ").append(uncreatedCollage.toString()).toString();
        }

        public InAppNotification()
        {
            unfinishedCollage = new InAppNotificationSetting();
            unfinishedCollage.enable = true;
            unfinishedCollage.delayMs = 0x5265c00L;
            uncreatedCollage = new InAppNotificationSetting();
            uncreatedCollage.enable = true;
            uncreatedCollage.delayMs = 0x5265c00L;
        }
    }

    public static class InAppNotificationSetting
        implements IGsonable
    {

        public long delayMs;
        public boolean enable;

        public String toString()
        {
            return (new StringBuilder()).append("delay_ms = ").append(delayMs).append(", enable = ").append(enable).toString();
        }

        public InAppNotificationSetting()
        {
        }
    }

    public static class PICDeviceConfigDefault extends PICDeviceConfig
    {

        public PICDeviceConfigDefault()
        {
            mInterstitialProb = 0.0F;
            mIsNativeAdsEnabled = false;
            mNativeAdsProvider = NativeAdFactory.AdType.ADMOB.name;
            mIsVideoAdsEnabled = false;
            mExpiredDay = 3F;
            mAmplitudeSubsamplingProb = 0.005F;
            mReminderNotification = new InAppNotification();
            mFacebookInviteEnabled = true;
        }
    }

    public static class PICServerDeviceConfig
    {

        private PICDeviceConfig mConfig;

        public PICDeviceConfig getConfig()
        {
            return mConfig;
        }

        private PICServerDeviceConfig()
        {
            mConfig = new PICDeviceConfigDefault();
        }
    }

    public static class RatePrompt
        implements IGsonable
    {

        public int minDays;
        public int minUses;

        public String toString()
        {
            return (new StringBuilder()).append("min_uses=").append(minUses).append(", min_days=").append(minDays).toString();
        }

        public RatePrompt()
        {
            minUses = 2;
            minDays = -1;
        }
    }


    public static final long DEFAULT_REMINDER_NOTIFICATION_DELAY = 0x5265c00L;
    private static final String TAG_AMPLITUDE_SUBSAMPLING_PROB = "amplitude_subsampling_probability";
    private static final String TAG_FACEBOOK_INVITE_ENABLED = "enabled_fb_invite";
    private static final String TAG_GALLERY_BANNER_ENABLED = "gallery_banner_enabled";
    private static final String TAG_INTERSTITIAL_PROBABILITY = "interstitial_probability";
    private static final String TAG_NATIVE_ADS_ENABLED = "native_ads_enabled";
    private static final String TAG_NATIVE_ADS_PROVIDER = "native_ads_provider";
    private static final String TAG_RATE_PROMPT = "rate_prompt";
    private static final String TAG_REMINDER_NOTIFICATION = "reminder_notification";
    private static final String TAG_VIDEO_AD_ENABLED = "video_ads_enabled";
    private static final String TAG_VIDEO_AD_EXPIRED_DAY = "video_ads_expired_day";
    float mAmplitudeSubsamplingProb;
    float mExpiredDay;
    boolean mFacebookInviteEnabled;
    boolean mGalleryBannerEnabled;
    float mInterstitialProb;
    boolean mIsNativeAdsEnabled;
    boolean mIsVideoAdsEnabled;
    String mNativeAdsProvider;
    RatePrompt mRatePrompt;
    InAppNotification mReminderNotification;

    private PICDeviceConfig()
    {
        mRatePrompt = new RatePrompt();
        mReminderNotification = new InAppNotification();
    }


    public static long getUncreatedNotificationDelayMs()
    {
        SharedPreferences sharedpreferences = k.j();
        if (d.a() && sharedpreferences.contains("pref_key_test_uncreated_notification_delay_milliseconds"))
        {
            return sharedpreferences.getLong("pref_key_test_uncreated_notification_delay_milliseconds", 0x5265c00L);
        } else
        {
            return ((com.cardinalblue.android.piccollage.lib.d)a.a(com/cardinalblue/android/piccollage/lib/d)).a().getUncreatedCollageNotiSetting().delayMs;
        }
    }

    public static long getUnfinishedNotificationDelayMs()
    {
        SharedPreferences sharedpreferences = k.j();
        if (d.a() && sharedpreferences.contains("pref_key_test_unfinished_notification_delay_milliseconds"))
        {
            return sharedpreferences.getLong("pref_key_test_unfinished_notification_delay_milliseconds", 0x5265c00L);
        } else
        {
            return ((com.cardinalblue.android.piccollage.lib.d)a.a(com/cardinalblue/android/piccollage/lib/d)).a().getUnfinishedCollageNotiSetting().delayMs;
        }
    }

    public float getAmplitudeSubsamplingProb()
    {
        return mAmplitudeSubsamplingProb;
    }

    public float getInterstitialProb()
    {
        return mInterstitialProb;
    }

    public String getNativeAdProvider()
    {
        return mNativeAdsProvider;
    }

    public int getRatePromptMinUses()
    {
        return mRatePrompt.minUses;
    }

    public InAppNotificationSetting getUncreatedCollageNotiSetting()
    {
        return mReminderNotification.uncreatedCollage;
    }

    public InAppNotificationSetting getUnfinishedCollageNotiSetting()
    {
        return mReminderNotification.unfinishedCollage;
    }

    public float getVideoAdsExpiredDay()
    {
        return mExpiredDay;
    }

    public boolean isFacebookInviteEnabled()
    {
        return mFacebookInviteEnabled;
    }

    public boolean isGalleryBannerEnabled()
    {
        return mGalleryBannerEnabled;
    }

    public boolean isNativeAdsEnabled()
    {
        return mIsNativeAdsEnabled;
    }

    public boolean isVideoAdsEnabled()
    {
        return mIsVideoAdsEnabled;
    }

    public String toString()
    {
        return (new StringBuilder()).append("interstitial_probability").append(": ").append(mInterstitialProb).append(", ").append("native_ads_enabled").append(": ").append(mIsNativeAdsEnabled).append(", ").append("native_ads_provider").append(": ").append(mNativeAdsProvider).append(", ").append("gallery_banner_enabled").append(": ").append(mGalleryBannerEnabled).append(", ").append("video_ads_enabled").append(": ").append(mIsVideoAdsEnabled).append(", ").append("video_ads_expired_day").append(": ").append(mExpiredDay).append("amplitude_subsampling_probability").append(": ").append(mAmplitudeSubsamplingProb).append("rate_prompt").append(": ").append(mRatePrompt).append("enabled_fb_invite").append(": ").append(mFacebookInviteEnabled).append("reminder_notification").append(": ").append(mReminderNotification.toString()).toString();
    }
}
