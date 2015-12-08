// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.ViewGroup;
import android.view.Window;
import com.admarvel.android.offline.AdmarvelOfflineUtils;
import com.admarvel.android.offline.model.AdMarvelLinkedAD;
import com.admarvel.android.util.Logging;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.admarvel.android.ads:
//            Version, Utils

public class AdFetcher
{
    public static final class Adtype extends Enum
    {

        public static final Adtype BANNER;
        private static final Adtype ENUM$VALUES[];
        public static final Adtype INTERSTITIAL;

        public static Adtype valueOf(String s)
        {
            return (Adtype)Enum.valueOf(com/admarvel/android/ads/AdFetcher$Adtype, s);
        }

        public static Adtype[] values()
        {
            Adtype aadtype[] = ENUM$VALUES;
            int i = aadtype.length;
            Adtype aadtype1[] = new Adtype[i];
            System.arraycopy(aadtype, 0, aadtype1, 0, i);
            return aadtype1;
        }

        static 
        {
            BANNER = new Adtype("BANNER", 0);
            INTERSTITIAL = new Adtype("INTERSTITIAL", 1);
            ENUM$VALUES = (new Adtype[] {
                BANNER, INTERSTITIAL
            });
        }

        private Adtype(String s, int i)
        {
            super(s, i);
        }
    }

    private static class Buffer
    {

        public byte buffer[];
        public int bytes;

        private Buffer()
        {
            buffer = null;
            bytes = 0;
        }

        Buffer(Buffer buffer1)
        {
            this();
        }
    }

    public class GoogleAdvertiserID
    {

        private final Context context;
        final AdFetcher this$0;

        public String getAdvId()
        {
            String s = null;
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info;
            try
            {
                info = AdvertisingIdClient.getAdvertisingIdInfo(context.getApplicationContext());
            }
            catch (IllegalStateException illegalstateexception)
            {
                Logging.log((new StringBuilder("IllegalStateException ")).append(illegalstateexception.getMessage()).append(" in fetching ADvID").toString());
                return null;
            }
            catch (GooglePlayServicesRepairableException googleplayservicesrepairableexception)
            {
                Logging.log((new StringBuilder("GooglePlayServicesRepairableException ")).append(googleplayservicesrepairableexception.getMessage()).append(" in fetching ADvID").toString());
                return null;
            }
            catch (IOException ioexception)
            {
                Logging.log((new StringBuilder("IOException ")).append(ioexception.getMessage()).append(" in fetching ADvID").toString());
                return null;
            }
            catch (GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception)
            {
                Logging.log((new StringBuilder("GooglePlayServicesNotAvailableException ")).append(googleplayservicesnotavailableexception.getMessage()).append(" in fetching ADvID").toString());
                return null;
            }
            if (info == null)
            {
                break MISSING_BLOCK_LABEL_22;
            }
            s = info.getId();
            return s;
        }

        public GoogleAdvertiserID(Context context1)
        {
            this$0 = AdFetcher.this;
            super();
            context = context1;
        }
    }


    private static final String ADMARVEL_ENDPOINT = "http://ads.admarvel.com/fam/androidGetAd.php";
    private static final String FACEBOOK_ATTRIBUTION_ID_COLUMN_NAME = "aid";
    private static final String FACEBOOK_ATTRIBUTION_ID_PREFIX = "FBATTRID:";
    private static final Uri FACEBOOK_ATTRIBUTION_ID_URI = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
    private static final String SDK_SUPPORTED = Version.getSDKSupported();

    public AdFetcher()
    {
    }

    private String buildParamString(Adtype adtype, Context context, int i, String s, Map map, String s1, String s2, 
            int j, String s3, Handler handler, boolean flag, boolean flag1)
    {
        StringBuilder stringbuilder;
        int k;
        stringbuilder = new StringBuilder();
        String s4;
        boolean flag2;
        try
        {
            s4 = Utils.captureTargetingParams(map, "||");
            Utils.appendParams(stringbuilder, "site_id", s2);
            Utils.appendParams(stringbuilder, "partner_id", s1);
            Utils.appendParams(stringbuilder, "timeout", String.valueOf(5000));
            Utils.appendParams(stringbuilder, "version", "1.5");
            Utils.appendParams(stringbuilder, "language", "java");
            Utils.appendParams(stringbuilder, "format", "android");
            Utils.appendParams(stringbuilder, "sdk_version", "2.4.2.1");
            Utils.appendParams(stringbuilder, "sdk_version_date", "2013-12-13");
            Utils.appendParams(stringbuilder, "sdk_supported", SDK_SUPPORTED);
            Utils.appendParams(stringbuilder, "device_model", Build.MODEL);
            Utils.appendParams(stringbuilder, "device_name", Build.ID);
            Utils.appendParams(stringbuilder, "device_systemversion", android.os.Build.VERSION.RELEASE);
            Utils.appendParams(stringbuilder, "retrynum", String.valueOf(j));
            Utils.appendParams(stringbuilder, "excluded_banners", s3);
        }
        // Misplaced declaration of an exception variable
        catch (Adtype adtype)
        {
            Logging.log(Log.getStackTraceString(adtype));
            return null;
        }
        if (i != 2) goto _L2; else goto _L1
_L1:
        Utils.appendParams(stringbuilder, "device_orientation", "landscape");
_L24:
        Utils.appendParams(stringbuilder, "device_connectivity", s);
        j = Utils.getDeviceWidth(context);
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        Utils.appendParams(stringbuilder, "resolution_width", String.valueOf(j));
        Utils.appendParams(stringbuilder, "max_image_width", String.valueOf(j));
        k = Utils.getDeviceHeight(context);
        if (k <= 0)
        {
            break MISSING_BLOCK_LABEL_248;
        }
        Utils.appendParams(stringbuilder, "resolution_height", String.valueOf(k));
        Utils.appendParams(stringbuilder, "max_image_height", String.valueOf(k));
        Utils.appendParams(stringbuilder, "device_density", (new StringBuilder()).append(Utils.getDeviceDensity(context)).toString());
        Utils.appendParams(stringbuilder, "device_os", "Android");
        if (!adtype.equals(Adtype.BANNER)) goto _L4; else goto _L3
_L3:
        Utils.appendParams(stringbuilder, "adtype", "banner");
_L26:
        if (i != 2) goto _L6; else goto _L5
_L5:
        s = String.valueOf(k);
_L27:
        if (i != 2) goto _L8; else goto _L7
_L7:
        map = String.valueOf(j);
_L28:
        s1 = new Utils(context, handler);
        Utils.appendParams(stringbuilder, "device_details", (new StringBuilder("brand:")).append(Build.BRAND).append(",model:").append(Build.MODEL).append(",width:").append(s).append(",height:").append(map).append(",os:").append(android.os.Build.VERSION.RELEASE).append(",ua:").append(s1.getUserAgent()).toString());
        i = 1;
        Class.forName("com.admarvel.android.admarvelspeechkitadapter.Speech").newInstance();
_L32:
        if (i != 0) goto _L10; else goto _L9
_L9:
        Logging.log("voice is not being supported because Speech kit class not found");
_L29:
        if (context == null) goto _L12; else goto _L11
_L11:
        s = context.getPackageName();
_L33:
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_468;
        }
        if (s.length() > 0)
        {
            Utils.appendParams(stringbuilder, "app_identifier", s);
        }
        if (!(context instanceof Activity)) goto _L14; else goto _L13
_L13:
        s = (Activity)context;
        if (s == null) goto _L14; else goto _L15
_L15:
        s2 = (ViewGroup)s.getWindow().findViewById(0x1020002);
        s1 = Boolean.valueOf(false);
        s = s1;
        if (Version.getAndroidSDKVersion() < 11) goto _L17; else goto _L16
_L16:
        flag2 = adtype.equals(Adtype.BANNER);
        if (!flag2) goto _L19; else goto _L18
_L18:
        map = s1;
        s = ((String) (android/view/ViewGroup.getMethod("isHardwareAccelerated", new Class[0]).invoke(s2, null)));
        adtype = s1;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_590;
        }
        adtype = s1;
        map = s1;
        if (!(s instanceof Boolean))
        {
            break MISSING_BLOCK_LABEL_590;
        }
        map = s1;
        adtype = (Boolean)s;
        s = adtype;
        map = adtype;
        if (!adtype.booleanValue()) goto _L17; else goto _L20
_L20:
        s = adtype;
        if (!flag) goto _L17; else goto _L21
_L21:
        s = adtype;
        map = adtype;
        if (Utils.detectDeviceForWebViewCrash())
        {
            s = Boolean.valueOf(false);
        }
_L17:
        Utils.appendParams(stringbuilder, "hardware_accelerated", s.toString());
_L14:
        Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
        Class.forName("com.google.android.gms.common.GooglePlayServicesNotAvailableException");
        Class.forName("com.google.android.gms.common.GooglePlayServicesRepairableException");
        i = 1;
_L34:
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_695;
        }
        adtype = (new GoogleAdvertiserID(context)).getAdvId();
        if (adtype == null)
        {
            break MISSING_BLOCK_LABEL_695;
        }
        Utils.appendParams(stringbuilder, "android_advertising_id", adtype);
        if (s4 == null)
        {
            break MISSING_BLOCK_LABEL_718;
        }
        if (s4.length() > 0)
        {
            Utils.appendParams(stringbuilder, "target_params", s4);
        }
        if (!flag1) goto _L23; else goto _L22
_L22:
        Utils.appendParams(stringbuilder, "auto-scaling", "true");
_L31:
        return stringbuilder.toString();
_L2:
        Utils.appendParams(stringbuilder, "device_orientation", "portrait");
          goto _L24
_L4:
        if (!adtype.equals(Adtype.INTERSTITIAL)) goto _L26; else goto _L25
_L25:
        Utils.appendParams(stringbuilder, "adtype", "interstitial");
          goto _L26
_L6:
        s = String.valueOf(j);
          goto _L27
_L8:
        map = String.valueOf(k);
          goto _L28
_L10:
label0:
        {
            if (!Utils.isPermissionGranted(context, "android.permission.RECORD_AUDIO"))
            {
                break MISSING_BLOCK_LABEL_851;
            }
            if (!Utils.isMediaVolumeOff(context))
            {
                break label0;
            }
            Utils.appendParams(stringbuilder, "admarvel_audio_level", "1");
        }
          goto _L29
        Utils.appendParams(stringbuilder, "admarvel_audio_level", "2");
          goto _L29
        Logging.log("voice is not being supported because record Audio permissions not added in manifest file.");
          goto _L29
        adtype;
        Logging.log(Log.getStackTraceString(adtype));
        s = map;
          goto _L17
_L19:
        s = s1;
        if (!adtype.equals(Adtype.INTERSTITIAL)) goto _L17; else goto _L30
_L30:
        s = Boolean.valueOf(true);
          goto _L17
_L23:
        Utils.appendParams(stringbuilder, "auto-scaling", "false");
          goto _L31
        s;
        i = 0;
          goto _L32
        s;
        i = 0;
          goto _L32
_L12:
        s = null;
          goto _L33
        adtype;
        i = 0;
          goto _L34
    }

    private boolean comparatorCheck(String s, String s1, String s2)
    {
        if (s.equals("=="))
        {
            if (!s1.equals(s2))
            {
                return false;
            }
            break MISSING_BLOCK_LABEL_206;
        }
        if (s.equals("!="))
        {
            if (!s1.equals(s2))
            {
                break MISSING_BLOCK_LABEL_206;
            }
            break MISSING_BLOCK_LABEL_204;
        }
        if (!s.equals("gt")) goto _L2; else goto _L1
_L2:
        if (s.equals("lt"))
        {
            if (!isLessThan(s2, s1))
            {
                return false;
            }
            break MISSING_BLOCK_LABEL_206;
        }
        if (s.equals("=x"))
        {
            if (!s1.equals(s2))
            {
                return false;
            }
            break MISSING_BLOCK_LABEL_206;
        }
        if (s.equals("!x"))
        {
            if (s1.equals(s2))
            {
                return false;
            }
            break MISSING_BLOCK_LABEL_206;
        }
        if (s.equals("=~"))
        {
            if (!s2.contains(s1))
            {
                return false;
            }
            break MISSING_BLOCK_LABEL_206;
        }
        if (!s.equals("!~"))
        {
            break MISSING_BLOCK_LABEL_206;
        }
        flag1 = s2.contains(s1);
        if (flag1)
        {
            return false;
        }
        break MISSING_BLOCK_LABEL_206;
        s;
        Logging.log((new StringBuilder(String.valueOf(s.getMessage()))).append("Offline SDK:").append("Exception in offline comparatorCheck ").toString());
        return false;
_L4:
        return true;
_L1:
        boolean flag;
        boolean flag1;
        if (isGreater(s2, s1))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (flag)
        {
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private HashMap discardNonMatchingAd(Context context, HashMap hashmap, HashMap hashmap1)
    {
        AdMarvelLinkedAD admarvellinkedad;
        HashMap hashmap3;
        HashMap hashmap2;
        Iterator iterator;
        String s;
        File file;
        try
        {
            hashmap2 = (HashMap)AdmarvelOfflineUtils.readObjectFromFile("/banner_folder_map", "/banner_folder_map", context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Logging.log((new StringBuilder(String.valueOf(context.getMessage()))).append("Offline SDK:").append("Exception in offline discardNonMatchingAd ").toString());
            return null;
        }
        if (hashmap2 == null)
        {
            return null;
        }
        iterator = hashmap.keySet().iterator();
_L13:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        admarvellinkedad = (AdMarvelLinkedAD)hashmap.get((Integer)iterator.next());
        hashmap3 = admarvellinkedad.getAdTargetingOption();
        s = (new StringBuilder(String.valueOf(context.getSharedPreferences("admarvel_preferences", 0).getString("childDirectory", "NULL")))).append("/").append((String)hashmap2.get(String.valueOf(admarvellinkedad.getAdId()))).append("/").append(String.valueOf(admarvellinkedad.getAdId())).append(".xml").toString();
        Logging.log((new StringBuilder("Offline SDK:Path of banner selected")).append(s).toString());
        file = new File(s);
        if (file.exists()) goto _L4; else goto _L3
_L3:
        Logging.log((new StringBuilder("Offline SDK:Ad rejected beacause it is not downloaded yet")).append(s).toString());
_L7:
        if (!file.exists() || isAdExpired(admarvellinkedad.getEndDate()) || !isAdStarted(admarvellinkedad.getStartDate())) goto _L6; else goto _L5
_L5:
        if (hashmap3 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (isValidAd(hashmap3, hashmap1))
        {
            continue; /* Loop/switch isn't completed */
        }
_L6:
        iterator.remove();
        continue; /* Loop/switch isn't completed */
_L4:
label0:
        {
            if (!isAdExpired(admarvellinkedad.getEndDate()))
            {
                break label0;
            }
            Logging.log("Offline SDK:Ad rejected beacause it is Expired ");
        }
          goto _L7
        if (isAdStarted(admarvellinkedad.getStartDate())) goto _L9; else goto _L8
_L8:
        Logging.log("Offline SDK:Ad rejected beacause campaign not started yet");
          goto _L7
_L9:
        if (hashmap3 == null) goto _L7; else goto _L10
_L10:
        if (isValidAd(hashmap3, hashmap1)) goto _L7; else goto _L11
_L11:
        Logging.log("Offline SDK:Ad rejected beacause targetOption doesnot matched");
          goto _L7
_L2:
        return hashmap;
        if (true) goto _L13; else goto _L12
_L12:
    }

    private String fetchAdFromLocal(Adtype adtype, Context context, String s, int i, String s1, Map map, String s2, 
            String s3, int j, String s4, boolean flag, Handler handler, boolean flag1)
    {
        if (context == null)
        {
            return null;
        }
        s = (HashMap)AdmarvelOfflineUtils.readObjectFromFile("/site_id_banner_map", "/site_id_banner_map", context);
        if (s == null)
        {
            return null;
        }
        ArrayList arraylist = (ArrayList)s.get(s3);
        if (arraylist == null)
        {
            return null;
        }
        s = (HashMap)AdmarvelOfflineUtils.readObjectFromFile("/ad_link_object", "/ad_link_object", context);
        if (s == null)
        {
            return null;
        }
        Iterator iterator = s.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                adtype = getTargetParams(adtype, context, i, s1, map, s2, s3, j, s4, handler, flag1);
                Logging.log((new StringBuilder("Offline SDK:postString: &site_id=")).append(s3).append("&partner_id=").append(s2).append(adtype).toString());
                adtype = discardNonMatchingAd(context, s, adtype);
                if (adtype == null)
                {
                    return null;
                }
                break;
            }
            if (!arraylist.contains(String.valueOf((Integer)iterator.next())))
            {
                iterator.remove();
            }
        } while (true);
        adtype = getAdBasedOnWeightAndPriority(adtype);
        if (adtype == null)
        {
            return null;
        }
        s = (HashMap)AdmarvelOfflineUtils.readObjectFromFile("/banner_folder_map", "/banner_folder_map", context);
        if (s == null)
        {
            return null;
        }
        adtype = (String)s.get(String.valueOf(adtype.getAdId()));
        s = context.getSharedPreferences("admarvel_preferences", 0);
        if (s == null)
        {
            return null;
        }
        context = (new StringBuilder(String.valueOf(s.getString("childDirectory", "NULL")))).append("/").append(adtype).toString();
        s = s.edit();
        s.putString("banner_folder", adtype);
        s.commit();
        if (adtype != null)
        {
            adtype = AdmarvelOfflineUtils.readData(context, (new StringBuilder(String.valueOf(adtype.split("_")[0]))).append(".xml").toString());
            Logging.log((new StringBuilder("Offline SDK:Admarvel XML Response:")).append(adtype).toString());
            return adtype;
        } else
        {
            return null;
        }
    }

    private HashMap filterAdsByCampaignPriority(HashMap hashmap, int i)
    {
        HashMap hashmap1 = new HashMap();
        Iterator iterator = hashmap.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return hashmap1;
            }
            try
            {
                Integer integer = (Integer)iterator.next();
                AdMarvelLinkedAD admarvellinkedad = (AdMarvelLinkedAD)hashmap.get(integer);
                if (admarvellinkedad.getCampaignPriority() == i)
                {
                    hashmap1.put(integer, admarvellinkedad);
                }
            }
            // Misplaced declaration of an exception variable
            catch (HashMap hashmap)
            {
                Logging.log((new StringBuilder(String.valueOf(hashmap.getMessage()))).append("Offline SDK:").append("Exception in offline filterAdsByCampaignPriority").toString());
                return null;
            }
        } while (true);
    }

    private AdMarvelLinkedAD getAdBasedOnWeight(HashMap hashmap, boolean flag)
    {
        boolean flag1 = false;
        if (flag) goto _L2; else goto _L1
_L1:
        int j;
        int l;
        float f;
        float f1;
        float af[][];
        Iterator iterator;
        Integer integer;
        int k;
        try
        {
            int i = hashmap.size();
            af = (int[][])Array.newInstance(Integer.TYPE, new int[] {
                i, 2
            });
            iterator = hashmap.keySet().iterator();
        }
        // Misplaced declaration of an exception variable
        catch (HashMap hashmap)
        {
            Logging.log((new StringBuilder(String.valueOf(hashmap.getMessage()))).append("Offline SDK:").append("Exception in offline getAdBasedOnWeight").toString());
            return null;
        }
        j = 0;
        k = 0;
        if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
        j = af[af.length - 1][0] + 1;
        k = (int)((Math.random() * 100D * (double)j) % (double)j);
        l = af.length;
        j = ((flag1) ? 1 : 0);
          goto _L5
_L4:
        integer = (Integer)iterator.next();
        af[j][0] = ((AdMarvelLinkedAD)hashmap.get(integer)).getAdWeight() + k;
        af[j][1] = ((AdMarvelLinkedAD)hashmap.get(integer)).getAdId();
        k = af[j][0];
        j++;
        if (true)
        {
            break MISSING_BLOCK_LABEL_53;
        }
_L13:
        if (af[j][0] < k) goto _L7; else goto _L6
_L6:
        return (AdMarvelLinkedAD)hashmap.get(Integer.valueOf(af[j][1]));
_L2:
        j = hashmap.size();
        af = (float[][])Array.newInstance(Float.TYPE, new int[] {
            j, 2
        });
        iterator = hashmap.keySet().iterator();
        j = 0;
        f = 0.0F;
_L10:
        if (iterator.hasNext()) goto _L9; else goto _L8
_L8:
        f1 = af[af.length - 1][0] + 1.0F;
        f = f1;
        if (f1 < 1.0F)
        {
            f = 1.0F;
        }
        f = (float)((Math.random() * 100D * (double)f) % (double)f);
        k = af.length;
        j = 0;
_L11:
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        if (af[j][0] < f)
        {
            break MISSING_BLOCK_LABEL_420;
        }
        return (AdMarvelLinkedAD)hashmap.get(Integer.valueOf((int)af[j][1]));
_L9:
        integer = (Integer)iterator.next();
        af[j][0] = ((AdMarvelLinkedAD)hashmap.get(integer)).getDeliveryPriority() + f;
        af[j][1] = ((AdMarvelLinkedAD)hashmap.get(integer)).getAdId();
        f = af[j][0];
        j++;
          goto _L10
        j++;
          goto _L11
_L5:
        if (j < l) goto _L13; else goto _L12
_L12:
        return null;
_L7:
        j++;
          goto _L5
        if (true) goto _L13; else goto _L14
_L14:
    }

    private AdMarvelLinkedAD getAdBasedOnWeightAndPriority(HashMap hashmap)
    {
_L7:
        int i;
        if (i <= 10) goto _L2; else goto _L1
_L1:
        hashmap = filterAdsByCampaignPriority(hashmap, 0);
        if (hashmap.size() <= 0) goto _L4; else goto _L3
_L2:
        HashMap hashmap2 = filterAdsByCampaignPriority(hashmap, i);
        if (hashmap2.size() > 0)
        {
            if (hashmap2.size() == 1)
            {
                return (AdMarvelLinkedAD)((java.util.Map.Entry)hashmap2.entrySet().iterator().next()).getValue();
            } else
            {
                return getAdBasedOnWeight(hashmap2, true);
            }
        }
          goto _L5
_L3:
        if (hashmap.size() == 1)
        {
            return (AdMarvelLinkedAD)((java.util.Map.Entry)hashmap.entrySet().iterator().next()).getValue();
        }
        hashmap = getAdBasedOnWeight(hashmap, false);
        return hashmap;
_L4:
        return null;
        try
        {
            new HashMap();
            HashMap hashmap1 = filterAdsByCampaignPriority(hashmap, -1);
            if (hashmap1.size() > 0)
            {
                if (hashmap1.size() == 1)
                {
                    return (AdMarvelLinkedAD)((java.util.Map.Entry)hashmap1.entrySet().iterator().next()).getValue();
                } else
                {
                    return getAdBasedOnWeight(hashmap1, false);
                }
            }
        }
        // Misplaced declaration of an exception variable
        catch (HashMap hashmap)
        {
            Logging.log((new StringBuilder(String.valueOf(hashmap.getMessage()))).append("Offline SDK:").append("Exception in offline getAdBasedOnWeightAndPriority").toString());
            return null;
        }
        i = 1;
        continue; /* Loop/switch isn't completed */
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private String getFacebookAttributionId(Context context)
    {
        String s;
        Cursor cursor;
        s = null;
        cursor = context.getContentResolver().query(FACEBOOK_ATTRIBUTION_ID_URI, new String[] {
            "aid"
        }, null, null, null);
        if (cursor == null) goto _L2; else goto _L1
_L1:
        boolean flag = cursor.moveToFirst();
        if (flag) goto _L3; else goto _L2
_L2:
        context = s;
        if (cursor != null)
        {
            cursor.close();
            context = s;
        }
_L5:
        return context;
_L3:
        s = cursor.getString(cursor.getColumnIndex("aid"));
        context = s;
        if (cursor == null) goto _L5; else goto _L4
_L4:
        cursor.close();
        return s;
        context;
        if (cursor != null)
        {
            cursor.close();
        }
        throw context;
    }

    private String getFacebookAttributionKeyword(Context context)
    {
        if (context != null)
        {
            if ((context = getFacebookAttributionId(context)) != null && context.length() > 0)
            {
                return (new StringBuilder("FBATTRID:")).append(context).toString();
            }
        }
        return null;
    }

    private HashMap getTargetParams(Adtype adtype, Context context, int i, String s, Map map, String s1, String s2, 
            int j, String s3, Handler handler, boolean flag)
    {
        s2 = new HashMap();
        boolean flag1;
        if (context == null)
        {
            s = null;
        } else
        {
            try
            {
                s = context.getSharedPreferences("admarvel_preferences", 0);
            }
            // Misplaced declaration of an exception variable
            catch (Adtype adtype)
            {
                Logging.log(Log.getStackTraceString(adtype));
                return null;
            }
        }
        if (s == null)
        {
            return null;
        }
        if (!s.getString("country_code", "NULL").equals("NULL"))
        {
            s2.put("country_code", s.getString("country_code", "NULL"));
        }
        if (!s.getString("region", "NULL").equals("NULL"))
        {
            s2.put("region", s.getString("region", "NULL"));
        }
        if (!s.getString("city", "NULL").equals("NULL"))
        {
            s2.put("city", s.getString("city", "NULL"));
        }
        if (!s.getString("postal_code", "NULL").equals("NULL"))
        {
            s2.put("postal_code", s.getString("postal_code", "NULL"));
        }
        if (!s.getString("latitude", "NULL").equals("NULL"))
        {
            s2.put("latitude", s.getString("latitude", "NULL"));
        }
        if (!s.getString("longitude", "NULL").equals("NULL"))
        {
            s2.put("longitude", s.getString("longitude", "NULL"));
        }
        if (!s.getString("dma_code", "NULL").equals("NULL"))
        {
            s2.put("dma_code", s.getString("dma_code", "NULL"));
        }
        if (!s.getString("area_code", "NULL").equals("NULL"))
        {
            s2.put("area_code", s.getString("area_code", "NULL"));
        }
        if (!s.getString("carrier", "NULL").equals("NULL"))
        {
            s2.put("carrier", s.getString("carrier", "NULL"));
        }
        s2.put("sdk_version", "2.4.2.1");
        s2.put("device_model", Build.MODEL);
        s2.put("device_name", Build.ID);
        s2.put("device_systemversion", android.os.Build.VERSION.RELEASE);
        s2.put("sdk_version_date", "2013-12-13");
        s2.put("sdk_supported", SDK_SUPPORTED);
        s2.put("retrynum", String.valueOf(j));
        s2.put("excluded_banners", s3);
        i = Utils.getDeviceWidth(context);
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_552;
        }
        s2.put("resolution_width", String.valueOf(i));
        s2.put("max_image_width", String.valueOf(i));
        i = Utils.getDeviceHeight(context);
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_585;
        }
        s2.put("resolution_height", String.valueOf(i));
        s2.put("max_image_height", String.valueOf(i));
        s2.put("device_density", (new StringBuilder()).append(Utils.getDeviceDensity(context)).toString());
        s2.put("device_os", "Android");
        if (!adtype.equals(Adtype.BANNER)) goto _L2; else goto _L1
_L1:
        s2.put("adtype", "banner");
_L14:
        if (!(context instanceof Activity)) goto _L4; else goto _L3
_L3:
        context = (Activity)context;
        if (context == null) goto _L4; else goto _L5
_L5:
        s3 = (ViewGroup)context.getWindow().findViewById(0x1020002);
        s1 = Boolean.valueOf(false);
        context = s1;
        if (Version.getAndroidSDKVersion() < 11) goto _L7; else goto _L6
_L6:
        flag1 = adtype.equals(Adtype.BANNER);
        if (!flag1) goto _L9; else goto _L8
_L8:
        s = s1;
        context = ((Context) (android/view/ViewGroup.getMethod("isHardwareAccelerated", new Class[0]).invoke(s3, null)));
        adtype = s1;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_754;
        }
        adtype = s1;
        s = s1;
        if (!(context instanceof Boolean))
        {
            break MISSING_BLOCK_LABEL_754;
        }
        s = s1;
        adtype = (Boolean)context;
        context = adtype;
        s = adtype;
        if (!adtype.booleanValue()) goto _L7; else goto _L10
_L10:
        context = adtype;
        if (!flag) goto _L7; else goto _L11
_L11:
        context = adtype;
        s = adtype;
        if (Utils.detectDeviceForWebViewCrash())
        {
            context = Boolean.valueOf(false);
        }
_L7:
        s2.put("hardware_accelerated", context.toString());
_L4:
        if (map == null)
        {
            break; /* Loop/switch isn't completed */
        }
        s2.putAll(map);
        break; /* Loop/switch isn't completed */
_L2:
        if (adtype.equals(Adtype.INTERSTITIAL))
        {
            s2.put("adtype", "interstitial");
        }
        continue; /* Loop/switch isn't completed */
        adtype;
        Logging.log(Log.getStackTraceString(adtype));
        context = s;
        continue; /* Loop/switch isn't completed */
_L9:
        context = s1;
        if (adtype.equals(Adtype.INTERSTITIAL))
        {
            context = Boolean.valueOf(true);
        }
        if (true) goto _L7; else goto _L12
_L12:
        return s2;
        if (true) goto _L14; else goto _L13
_L13:
    }

    private boolean isAdExpired(long l)
    {
        if (l >= 0L)
        {
            System.currentTimeMillis();
            Calendar.getInstance().getTimeInMillis();
            if (l < System.currentTimeMillis())
            {
                return true;
            }
        }
        return false;
    }

    private boolean isAdStarted(long l)
    {
        return l <= System.currentTimeMillis();
    }

    private boolean isGreater(String s, String s1)
    {
        boolean flag = true;
        if (Pattern.compile("-?[0-9]+").matcher(s).matches() && Pattern.compile("-?[0-9]+").matcher(s1).matches())
        {
            if (Integer.valueOf(s).intValue() > Integer.valueOf(s1).intValue())
            {
                return true;
            }
            break MISSING_BLOCK_LABEL_228;
        }
        if (Pattern.compile("^[-]?(0|[1-9][0-9]*)(\\.[0-9]+)?([eE][+-]?[0-9]+)?$").matcher(s).matches() && Pattern.compile("^[-]?(0|[1-9][0-9]*)(\\.[0-9]+)?([eE][+-]?[0-9]+)?$").matcher(s1).matches())
        {
            if (Double.valueOf(s).doubleValue() <= Double.valueOf(s1).doubleValue())
            {
                break MISSING_BLOCK_LABEL_228;
            }
            break MISSING_BLOCK_LABEL_225;
        }
        int i = s.compareToIgnoreCase(s1);
        if (i > 0)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_228;
        s;
        Logging.log((new StringBuilder(String.valueOf(s.getMessage()))).append("Offline SDK:").append("Exception in offline isGreater ").toString());
        return false;
        s;
        Logging.log((new StringBuilder(String.valueOf(s.getMessage()))).append("Offline SDK:").append("Exception in offline isGreater ").toString());
        return false;
        s;
        Logging.log((new StringBuilder(String.valueOf(s.getMessage()))).append("Offline SDK:").append("Exception in offline isGreater ").toString());
        flag = false;
        return flag;
        return false;
    }

    private boolean isLessThan(String s, String s1)
    {
        if (Pattern.compile("-?[0-9]+").matcher(s).matches() && Pattern.compile("-?[0-9]+").matcher(s1).matches())
        {
            if (Integer.valueOf(s).intValue() >= Integer.valueOf(s1).intValue())
            {
                return false;
            }
            break MISSING_BLOCK_LABEL_221;
        }
        if (Pattern.compile("^[-]?(0|[1-9][0-9]*)(\\.[0-9]+)?([eE][+-]?[0-9]+)?$").matcher(s).matches() && Pattern.compile("^[-]?(0|[1-9][0-9]*)(\\.[0-9]+)?([eE][+-]?[0-9]+)?$").matcher(s1).matches())
        {
            if (Double.valueOf(s).doubleValue() < Double.valueOf(s1).doubleValue())
            {
                break MISSING_BLOCK_LABEL_221;
            }
            break MISSING_BLOCK_LABEL_219;
        }
        int i = s1.compareToIgnoreCase(s);
        if (i < 0)
        {
            return false;
        }
        break MISSING_BLOCK_LABEL_221;
        s;
        Logging.log((new StringBuilder(String.valueOf(s.getMessage()))).append("Offline SDK:").append("Exception in offline isLessThan ").toString());
        return false;
        s;
        Logging.log((new StringBuilder(String.valueOf(s.getMessage()))).append("Offline SDK:").append("Exception in offline isLessThan ").toString());
        return false;
        s;
        Logging.log((new StringBuilder(String.valueOf(s.getMessage()))).append("Offline SDK:").append("Exception in offline isLessThan ").toString());
        return false;
        return true;
    }

    private boolean isValidAd(HashMap hashmap, HashMap hashmap1)
    {
        Iterator iterator = hashmap.keySet().iterator();
_L2:
        if (!iterator.hasNext())
        {
            return true;
        }
        String s;
        Iterator iterator1;
        s = (String)iterator.next();
        if (!hashmap1.containsKey(s))
        {
            break MISSING_BLOCK_LABEL_107;
        }
        iterator1 = ((ArrayList)hashmap.get(s)).iterator();
        boolean flag;
        do
        {
            if (!iterator1.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            String as[] = (String[])iterator1.next();
            flag = comparatorCheck(as[0], as[1], (String)hashmap1.get(s));
        } while (flag);
        break; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L1
_L1:
        return false;
        return false;
        hashmap;
        Logging.log((new StringBuilder(String.valueOf(hashmap.getMessage()))).append("Offline SDK:").append("Exception in offline isValidAd ").toString());
        return false;
    }

    public String fetchAd(Adtype adtype, Context context, String s, int i, String s1, Map map, String s2, 
            String s3, int j, String s4, boolean flag, Handler handler, boolean flag1, boolean flag2)
    {
        HashMap hashmap;
        hashmap = new HashMap();
        if (context == null)
        {
            return null;
        }
        if (map == null) goto _L2; else goto _L1
_L1:
        map;
        JVM INSTR monitorenter ;
        hashmap.putAll(map);
        map;
        JVM INSTR monitorexit ;
_L2:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        hashmap.put("RESPONSE_TYPE", "xml");
_L3:
        try
        {
            map = getFacebookAttributionKeyword(context);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            map = null;
        }
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        if (hashmap.get("RTBID") == null)
        {
            hashmap.put("RTBID", map);
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        if (hashmap.get("UNIQUE_ID") == null)
        {
            hashmap.put("UNIQUE_ID", s);
        }
        adtype = buildParamString(adtype, context, i, s1, hashmap, s2, s3, j, s4, handler, flag1, flag2);
        Logging.log((new StringBuilder("postString: ")).append(adtype).toString());
        if (adtype == null)
        {
            return null;
        }
        break MISSING_BLOCK_LABEL_215;
        adtype;
        map;
        JVM INSTR monitorexit ;
        try
        {
            throw adtype;
        }
        // Misplaced declaration of an exception variable
        catch (Adtype adtype)
        {
            Logging.log(Log.getStackTraceString(adtype));
        }
        return null;
        hashmap.put("RESPONSE_TYPE", "xml_with_xhtml");
          goto _L3
        int k;
        try
        {
            s = (HttpURLConnection)(new URL("http://ads.admarvel.com/fam/androidGetAd.php")).openConnection();
            s.setRequestMethod("POST");
            s.setDoOutput(true);
            s.setDoInput(true);
            s.setUseCaches(false);
            s.setRequestProperty("User-Agent", (new Utils(context, handler)).getUserAgent());
            s.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            s.setRequestProperty("Content-Length", Integer.toString(adtype.length()));
            s.setConnectTimeout(2000);
            s.setReadTimeout(10000);
            s.getOutputStream().write(adtype.getBytes());
            i = s.getResponseCode();
            j = s.getContentLength();
            Logging.log((new StringBuilder("Error Code: ")).append(i).toString());
            Logging.log((new StringBuilder("Content Length: ")).append(j).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Adtype adtype)
        {
            Logging.log(Log.getStackTraceString(adtype));
            return null;
        }
        if (i != 200)
        {
            break MISSING_BLOCK_LABEL_619;
        }
        context = (InputStream)s.getContent();
        adtype = new ArrayList();
        i = 8192;
        j = 0;
_L9:
        if (i != -1) goto _L5; else goto _L4
_L4:
        context.close();
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_619;
        }
        context = new byte[j];
        j = 0;
        i = 0;
_L10:
        if (i < adtype.size()) goto _L7; else goto _L6
_L6:
        adtype = new String(context);
_L11:
        adtype = adtype.toString();
        Logging.log((new StringBuilder("Admarvel XML Response:")).append(new String(adtype)).toString());
        return adtype;
_L5:
        s = new byte[8192];
        k = context.read(s, 0, 8192);
        i = k;
        if (k <= 0) goto _L9; else goto _L8
_L8:
        s1 = new Buffer(null);
        s1.buffer = s;
        s1.bytes = k;
        j += k;
        adtype.add(s1);
        i = k;
          goto _L9
_L7:
        int l;
        s = (Buffer)adtype.get(i);
        System.arraycopy(((Buffer) (s)).buffer, 0, context, j, ((Buffer) (s)).bytes);
        l = ((Buffer) (s)).bytes;
        j += l;
        i++;
          goto _L10
        adtype = "";
          goto _L11
    }

    public String fetchOfflineAd(Adtype adtype, Context context, String s, int i, String s1, Map map, String s2, 
            String s3, int j, String s4, boolean flag, Handler handler, boolean flag1, boolean flag2)
    {
        HashMap hashmap;
        if (context == null)
        {
            return null;
        }
        hashmap = new HashMap();
        context.getSharedPreferences("admarvel_preferences", 0);
        if (map == null) goto _L2; else goto _L1
_L1:
        map;
        JVM INSTR monitorenter ;
        hashmap.putAll(map);
        map;
        JVM INSTR monitorexit ;
_L2:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        hashmap.put("RESPONSE_TYPE", "xml");
_L3:
        String s5;
        try
        {
            s5 = getFacebookAttributionKeyword(context);
        }
        catch (Exception exception)
        {
            exception = null;
        }
        if (s5 == null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        if (hashmap.get("RTBID") == null)
        {
            hashmap.put("RTBID", s5);
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        if (hashmap.get("UNIQUE_ID") == null)
        {
            hashmap.put("UNIQUE_ID", s);
        }
        return fetchAdFromLocal(adtype, context, s, i, s1, map, s2, s3, j, s4, flag, handler, flag1);
        adtype;
        map;
        JVM INSTR monitorexit ;
        try
        {
            throw adtype;
        }
        // Misplaced declaration of an exception variable
        catch (Adtype adtype)
        {
            Logging.log(Log.getStackTraceString(adtype));
        }
        return null;
        hashmap.put("RESPONSE_TYPE", "xml_with_xhtml");
          goto _L3
    }

}
