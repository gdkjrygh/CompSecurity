// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import com.mopub.common.AdFormat;
import com.mopub.common.util.ResponseHeader;
import com.mopub.network.HeaderUtils;
import java.util.Map;

public class AdTypeTranslator
{

    public static final String BANNER_SUFFIX = "_banner";
    public static final String INTERSTITIAL_SUFFIX = "_interstitial";

    public AdTypeTranslator()
    {
    }

    public static String getCustomEventName(AdFormat adformat, String s, String s1, Map map)
    {
        if ("custom".equalsIgnoreCase(s))
        {
            return HeaderUtils.extractHeader(map, ResponseHeader.CUSTOM_EVENT_NAME);
        }
        if ("json".equalsIgnoreCase(s))
        {
            return CustomEventType.MOPUB_NATIVE.toString();
        }
        if ("html".equalsIgnoreCase(s) || "mraid".equalsIgnoreCase(s))
        {
            if (AdFormat.INTERSTITIAL.equals(adformat))
            {
                adformat = CustomEventType.a((new StringBuilder()).append(s).append("_interstitial").toString());
            } else
            {
                adformat = CustomEventType.a((new StringBuilder()).append(s).append("_banner").toString());
            }
            return adformat.toString();
        }
        if ("interstitial".equalsIgnoreCase(s))
        {
            return CustomEventType.a((new StringBuilder()).append(s1).append("_interstitial").toString()).toString();
        } else
        {
            return CustomEventType.a((new StringBuilder()).append(s).append("_banner").toString()).toString();
        }
    }

    private class CustomEventType extends Enum
    {

        public static final CustomEventType GOOGLE_PLAY_SERVICES_BANNER;
        public static final CustomEventType GOOGLE_PLAY_SERVICES_INTERSTITIAL;
        public static final CustomEventType HTML_BANNER;
        public static final CustomEventType HTML_INTERSTITIAL;
        public static final CustomEventType MILLENNIAL_BANNER;
        public static final CustomEventType MILLENNIAL_INTERSTITIAL;
        public static final CustomEventType MOPUB_NATIVE;
        public static final CustomEventType MRAID_BANNER;
        public static final CustomEventType MRAID_INTERSTITIAL;
        public static final CustomEventType UNSPECIFIED;
        public static final CustomEventType VAST_VIDEO_INTERSTITIAL;
        private static final CustomEventType c[];
        private final String a;
        private final String b;

        static CustomEventType a(String s)
        {
            CustomEventType acustomeventtype[] = values();
            int j = acustomeventtype.length;
            for (int i = 0; i < j; i++)
            {
                CustomEventType customeventtype = acustomeventtype[i];
                if (customeventtype.a.equals(s))
                {
                    return customeventtype;
                }
            }

            return UNSPECIFIED;
        }

        public static CustomEventType valueOf(String s)
        {
            return (CustomEventType)Enum.valueOf(com/mopub/mobileads/AdTypeTranslator$CustomEventType, s);
        }

        public static CustomEventType[] values()
        {
            return (CustomEventType[])c.clone();
        }

        public final String toString()
        {
            return b;
        }

        static 
        {
            GOOGLE_PLAY_SERVICES_BANNER = new CustomEventType("GOOGLE_PLAY_SERVICES_BANNER", 0, "admob_native_banner", "com.mopub.mobileads.GooglePlayServicesBanner");
            GOOGLE_PLAY_SERVICES_INTERSTITIAL = new CustomEventType("GOOGLE_PLAY_SERVICES_INTERSTITIAL", 1, "admob_full_interstitial", "com.mopub.mobileads.GooglePlayServicesInterstitial");
            MILLENNIAL_BANNER = new CustomEventType("MILLENNIAL_BANNER", 2, "millennial_native_banner", "com.mopub.mobileads.MillennialBanner");
            MILLENNIAL_INTERSTITIAL = new CustomEventType("MILLENNIAL_INTERSTITIAL", 3, "millennial_full_interstitial", "com.mopub.mobileads.MillennialInterstitial");
            MRAID_BANNER = new CustomEventType("MRAID_BANNER", 4, "mraid_banner", "com.mopub.mraid.MraidBanner");
            MRAID_INTERSTITIAL = new CustomEventType("MRAID_INTERSTITIAL", 5, "mraid_interstitial", "com.mopub.mraid.MraidInterstitial");
            HTML_BANNER = new CustomEventType("HTML_BANNER", 6, "html_banner", "com.mopub.mobileads.HtmlBanner");
            HTML_INTERSTITIAL = new CustomEventType("HTML_INTERSTITIAL", 7, "html_interstitial", "com.mopub.mobileads.HtmlInterstitial");
            VAST_VIDEO_INTERSTITIAL = new CustomEventType("VAST_VIDEO_INTERSTITIAL", 8, "vast_interstitial", "com.mopub.mobileads.VastVideoInterstitial");
            MOPUB_NATIVE = new CustomEventType("MOPUB_NATIVE", 9, "mopub_native", "com.mopub.nativeads.MoPubCustomEventNative");
            UNSPECIFIED = new CustomEventType("UNSPECIFIED", 10, "", null);
            c = (new CustomEventType[] {
                GOOGLE_PLAY_SERVICES_BANNER, GOOGLE_PLAY_SERVICES_INTERSTITIAL, MILLENNIAL_BANNER, MILLENNIAL_INTERSTITIAL, MRAID_BANNER, MRAID_INTERSTITIAL, HTML_BANNER, HTML_INTERSTITIAL, VAST_VIDEO_INTERSTITIAL, MOPUB_NATIVE, 
                UNSPECIFIED
            });
        }

        private CustomEventType(String s, int i, String s1, String s2)
        {
            super(s, i);
            a = s1;
            b = s2;
        }
    }

}
