// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.Map;

// Referenced classes of package com.admarvel.android.ads:
//            Utils, AdMarvelAd

public class AdMarvelUtils
{
    public static final class ErrorReason extends Enum
    {

        public static final ErrorReason AD_REQUEST_IN_PROCESS_EXCEPTION;
        public static final ErrorReason AD_REQUEST_MISSING_XML_ELEMENTS;
        public static final ErrorReason AD_REQUEST_SDK_TYPE_UNSUPPORTED;
        public static final ErrorReason AD_REQUEST_XML_PARSING_EXCEPTION;
        public static final ErrorReason AD_UNIT_NOT_ABLE_TO_RENDER;
        public static final ErrorReason BOT_USER_AGENT_FOUND;
        private static final ErrorReason ENUM$VALUES[];
        public static final ErrorReason NETWORK_CONNECTIVITY_DISRUPTED;
        public static final ErrorReason NO_AD_FOUND;
        public static final ErrorReason NO_BANNER_FOUND;
        public static final ErrorReason NO_NETWORK_CONNECTIVITY;
        public static final ErrorReason NO_USER_AGENT_FOUND;
        public static final ErrorReason PARTNER_ID_NOT_PRESENT;
        public static final ErrorReason SITE_ID_AND_PARTNER_ID_DO_NOT_MATCH;
        public static final ErrorReason SITE_ID_NOT_PRESENT;
        public static final ErrorReason SITE_ID_OR_PARTNER_ID_NOT_PRESENT;

        public static ErrorReason valueOf(String s)
        {
            return (ErrorReason)Enum.valueOf(com/admarvel/android/ads/AdMarvelUtils$ErrorReason, s);
        }

        public static ErrorReason[] values()
        {
            ErrorReason aerrorreason[] = ENUM$VALUES;
            int i = aerrorreason.length;
            ErrorReason aerrorreason1[] = new ErrorReason[i];
            System.arraycopy(aerrorreason, 0, aerrorreason1, 0, i);
            return aerrorreason1;
        }

        static 
        {
            SITE_ID_OR_PARTNER_ID_NOT_PRESENT = new ErrorReason("SITE_ID_OR_PARTNER_ID_NOT_PRESENT", 0);
            SITE_ID_AND_PARTNER_ID_DO_NOT_MATCH = new ErrorReason("SITE_ID_AND_PARTNER_ID_DO_NOT_MATCH", 1);
            BOT_USER_AGENT_FOUND = new ErrorReason("BOT_USER_AGENT_FOUND", 2);
            NO_BANNER_FOUND = new ErrorReason("NO_BANNER_FOUND", 3);
            NO_AD_FOUND = new ErrorReason("NO_AD_FOUND", 4);
            NO_USER_AGENT_FOUND = new ErrorReason("NO_USER_AGENT_FOUND", 5);
            SITE_ID_NOT_PRESENT = new ErrorReason("SITE_ID_NOT_PRESENT", 6);
            PARTNER_ID_NOT_PRESENT = new ErrorReason("PARTNER_ID_NOT_PRESENT", 7);
            NO_NETWORK_CONNECTIVITY = new ErrorReason("NO_NETWORK_CONNECTIVITY", 8);
            NETWORK_CONNECTIVITY_DISRUPTED = new ErrorReason("NETWORK_CONNECTIVITY_DISRUPTED", 9);
            AD_REQUEST_XML_PARSING_EXCEPTION = new ErrorReason("AD_REQUEST_XML_PARSING_EXCEPTION", 10);
            AD_REQUEST_IN_PROCESS_EXCEPTION = new ErrorReason("AD_REQUEST_IN_PROCESS_EXCEPTION", 11);
            AD_UNIT_NOT_ABLE_TO_RENDER = new ErrorReason("AD_UNIT_NOT_ABLE_TO_RENDER", 12);
            AD_REQUEST_MISSING_XML_ELEMENTS = new ErrorReason("AD_REQUEST_MISSING_XML_ELEMENTS", 13);
            AD_REQUEST_SDK_TYPE_UNSUPPORTED = new ErrorReason("AD_REQUEST_SDK_TYPE_UNSUPPORTED", 14);
            ENUM$VALUES = (new ErrorReason[] {
                SITE_ID_OR_PARTNER_ID_NOT_PRESENT, SITE_ID_AND_PARTNER_ID_DO_NOT_MATCH, BOT_USER_AGENT_FOUND, NO_BANNER_FOUND, NO_AD_FOUND, NO_USER_AGENT_FOUND, SITE_ID_NOT_PRESENT, PARTNER_ID_NOT_PRESENT, NO_NETWORK_CONNECTIVITY, NETWORK_CONNECTIVITY_DISRUPTED, 
                AD_REQUEST_XML_PARSING_EXCEPTION, AD_REQUEST_IN_PROCESS_EXCEPTION, AD_UNIT_NOT_ABLE_TO_RENDER, AD_REQUEST_MISSING_XML_ELEMENTS, AD_REQUEST_SDK_TYPE_UNSUPPORTED
            });
        }

        private ErrorReason(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class SDKAdNetwork extends Enum
    {

        public static final SDKAdNetwork ADCOLONY;
        public static final SDKAdNetwork ADMARVEL;
        public static final SDKAdNetwork ADMOB;
        public static final SDKAdNetwork AMAZON;
        private static final SDKAdNetwork ENUM$VALUES[];
        public static final SDKAdNetwork GREYSTRIPE;
        public static final SDKAdNetwork MEDIALETS;
        public static final SDKAdNetwork MILLENNIAL;
        public static final SDKAdNetwork PINSIGHT;
        public static final SDKAdNetwork PULSE3D;
        public static final SDKAdNetwork RHYTHM;

        public static SDKAdNetwork valueOf(String s)
        {
            return (SDKAdNetwork)Enum.valueOf(com/admarvel/android/ads/AdMarvelUtils$SDKAdNetwork, s);
        }

        public static SDKAdNetwork[] values()
        {
            SDKAdNetwork asdkadnetwork[] = ENUM$VALUES;
            int i = asdkadnetwork.length;
            SDKAdNetwork asdkadnetwork1[] = new SDKAdNetwork[i];
            System.arraycopy(asdkadnetwork, 0, asdkadnetwork1, 0, i);
            return asdkadnetwork1;
        }

        static 
        {
            ADMOB = new SDKAdNetwork("ADMOB", 0);
            GREYSTRIPE = new SDKAdNetwork("GREYSTRIPE", 1);
            MEDIALETS = new SDKAdNetwork("MEDIALETS", 2);
            RHYTHM = new SDKAdNetwork("RHYTHM", 3);
            MILLENNIAL = new SDKAdNetwork("MILLENNIAL", 4);
            ADMARVEL = new SDKAdNetwork("ADMARVEL", 5);
            AMAZON = new SDKAdNetwork("AMAZON", 6);
            ADCOLONY = new SDKAdNetwork("ADCOLONY", 7);
            PINSIGHT = new SDKAdNetwork("PINSIGHT", 8);
            PULSE3D = new SDKAdNetwork("PULSE3D", 9);
            ENUM$VALUES = (new SDKAdNetwork[] {
                ADMOB, GREYSTRIPE, MEDIALETS, RHYTHM, MILLENNIAL, ADMARVEL, AMAZON, ADCOLONY, PINSIGHT, PULSE3D
            });
        }

        private SDKAdNetwork(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String PATH = "/data/com.admarvel.android.admarvelcachedads";
    private WeakReference contextReference;

    public AdMarvelUtils(Context context)
    {
        contextReference = new WeakReference(context);
    }

    public static void appendParams(StringBuilder stringbuilder, String s, String s1)
        throws UnsupportedEncodingException
    {
        Utils.appendParams(stringbuilder, s, s1);
    }

    public static String captureTargetingParams(Map map, String s)
        throws Exception
    {
        return Utils.captureTargetingParams(map, s);
    }

    public static String encodeString(String s)
    {
        return Utils.encodeString(s);
    }

    public static String getDeviceConnectivitiy(Context context)
    {
        return Utils.getDeviceConnectivitiy(context);
    }

    public static int getDeviceHeight(Context context)
    {
        return Utils.getDeviceHeight(context);
    }

    public static int getDeviceWidth(Context context)
    {
        return Utils.getDeviceWidth(context);
    }

    public static int getErrorCode(ErrorReason errorreason)
    {
        return Utils.getErrorCode(errorreason);
    }

    public static ErrorReason getErrorReason(int i)
    {
        return Utils.getErrorReason(i);
    }

    public static String getSDKVersion()
    {
        return "2.4.2.1";
    }

    public static String getSDKVersionDate()
    {
        return "2013-12-13";
    }

    public static String getSupportedInterfaceOrientations(Activity activity)
    {
        return Utils.getSupportedInterfaceOrientations(activity);
    }

    public static String getUserAgent(Context context, Handler handler)
    {
        return (new Utils(context, handler)).getUserAgent();
    }

    public static final boolean isNetworkAvailable(Context context)
    {
        return Utils.isNetworkAvailable(context);
    }

    public void firePixel(AdMarvelAd admarvelad)
    {
        (new Utils((Context)contextReference.get())).firePixel(admarvelad);
    }

    public void firePixel(String s)
    {
        (new Utils((Context)contextReference.get())).firePixel(s);
    }

    public void firePixelUsingHTTP(String s, Handler handler)
    {
        (new Utils((Context)contextReference.get())).firePixelUsingHTTP(s, handler);
    }

    public String getUserAgent()
    {
        return (new Utils((Context)contextReference.get())).getUserAgent();
    }
}
