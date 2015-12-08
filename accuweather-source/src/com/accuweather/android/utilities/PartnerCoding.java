// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;

// Referenced classes of package com.accuweather.android.utilities:
//            Logger, PreferenceUtils

public class PartnerCoding
{
    public static class PartnerCodes
    {

        public static final String ACER_PARTNER_CODE = "androidacer";
        public static final String AMAZON_PARTNER_CODE = "androidamazonv2";
        public static final String AMINO_PARTNER_CODE = "androidamino";
        public static final String AMOBEE_TEST_PARTNER_CODE = "androidamobeetest";
        public static final String ANDROIDLITE_DEMO_PARTNER_CODE = "androidlitedemo";
        public static final String ANDROID_AMAZON_PHONE_PARTNER_CODE = "androidamazonphone";
        public static final String ANDROID_CLICK_N_KIDS_PARTNER_CODE = "androidclicknkids";
        public static final String ANDROID_LITE_PARTNER_CODE = "androidlite";
        public static final String ANDROID_PIT_PARTNER_CODE = "androidpit";
        public static final String ANDROID_UPGRADE_TEST_PARTNER_CODE = "androidupdgradetest";
        public static final String APPATTACH_PARTNER_CODE = "androidappattach";
        public static final String APPLOADED_AZUMI_PARTNER_CODE = "androidapploaded_azumi";
        public static final String APPLOADED_LANIX_PARTNER_CODE = "androidapploaded_lanix";
        public static final String APPLOADED_PARTNER_CODE = "androidapploaded";
        public static final String ATT_PARTNER_CODE = "androidatt";
        public static final String BARNES_AND_NOBLE_PARTNER_CODE = "androidbarnesandnoble";
        public static final String BOUYGUES_PARTNER_CODE = "androidbouygues";
        public static final String CISCO_PARTNER_CODE = "androidcisco";
        public static final String COBY_PARTNER_CODE = "androidcoby";
        public static final String DELL_PARTNER_CODE = "androiddell";
        public static final String DEUTSCHE_TELEKOM_PARTNER_CODE = "androiddeutschetelekom";
        public static final String DEUTSCHE_TELEKOM_PARTNER_CODE_AMSTERDAMN = "androiddeutschetelekom_amsterdamnetherlands";
        public static final String DEUTSCHE_TELEKOM_PARTNER_CODE_ATHENS = "androiddeutschetelekom_athensgreece";
        public static final String DEUTSCHE_TELEKOM_PARTNER_CODE_BERLIN = "androiddeutschetelekom _berlingermany";
        public static final String DEUTSCHE_TELEKOM_PARTNER_CODE_BRATISLAVA = "androiddeutschetelekom_bratislavaslovakia";
        public static final String DEUTSCHE_TELEKOM_PARTNER_CODE_BUCHAREST = "androiddeutschetelekom_bucharestromania";
        public static final String DEUTSCHE_TELEKOM_PARTNER_CODE_BUDAPEST = "androiddeutschetelekom_budapesthungary";
        public static final String DEUTSCHE_TELEKOM_PARTNER_CODE_PODGORICA = "androiddeutschetelekom_podgoricamontenegro";
        public static final String DEUTSCHE_TELEKOM_PARTNER_CODE_PRAGUE = "androiddeutschetelekom_pragueczechrepublic";
        public static final String DEUTSCHE_TELEKOM_PARTNER_CODE_SKOPJE = "androiddeutschetelekom_skopjemacedonia";
        public static final String DEUTSCHE_TELEKOM_PARTNER_CODE_SOFIA = "androiddeutschetelekom_sofiabulgaria";
        public static final String DEUTSCHE_TELEKOM_PARTNER_CODE_TIRANA = "androiddeutschetelekom_tiranaalbania";
        public static final String DEUTSCHE_TELEKOM_PARTNER_CODE_VIENNA = "androiddeutschetelekom_viennaaustria";
        public static final String DEUTSCHE_TELEKOM_PARTNER_CODE_WARSAW = "androiddeutschetelekom_warsawpoland";
        public static final String DOCOMO_PARTNER_CODE = "androiddocomo";
        public static final String FUHU_PARTNER_CODE = "androidfuhu";
        public static final String FUJITSU_PARTNER_CODE = "androidfujitsu";
        public static final String GETJAR_PARTNER_CODE = "androidgetjar";
        public static final String GOOGLE_PARTNER_CODE = "androidflagship3";
        public static final String GROUP_SENSE_PARTNER_CODE = "androidgroupsense";
        public static final String HISENSE_PARTNER_CODE = "androidhisense";
        public static final String HTC_PARTNER_CODE = "androidhtc";
        public static final String HUAWEI_PARTNER_CODE = "androidhuawei";
        public static final String ICONTROL_PARTNER_CODE = "androidicontrol";
        public static final String INTEL_PARTNER_CODE = "androidintel";
        public static final String LENOVO_PARTNER_CODE = "androidlenovo";
        public static final String MEDION_PARTNER_CODE = "androidmedion";
        public static final String METRO_PCS_PARTNER_CODE = "androidmetropcs";
        public static final String MICROMAX_PARTNER_CODE = "androidmicromax";
        public static final String MOBILE_WEAVER_PARTNER_CODE = "androidmobileweaver";
        public static final String MOBIROO_PARTNER_CODE = "androidmobiroo";
        public static final String MOTOROLA_PARTNER_CODE = "androidmotorola";
        public static final String NOOK_PARTNER_CODE = "androidflagnook";
        public static final String NTELOS_PARTNER_CODE = "androidntelos";
        public static final String O2_PARTNER_CODE = "androido2";
        public static final String OBREEY_PARTNER_CODE = "androidobreey";
        public static final String ORANGE_PARTNER_CODE = "androidorange";
        public static final String PANTECH_PARTNER_CODE = "androidpantech";
        public static final String PARTNER_CODE = "androidflagship3.3";
        public static final String PARTNER_CODE_FILE_NAME = "accuwx_pcode";
        public static final String PHILLIPS_PARTNER_CODE = "androidphillips";
        public static final String POCKETBOOK_USA_PARTNER_CODE = "androidpocketbookusa";
        public static final String POSTITIAL_PARTNER_CODE = "androidpostitial";
        public static final String SAMSUNG_PARTNER_CODE = "androidsamsung";
        public static final String SONY_ERICSSON_PARTNER_CODE = "androidsonyericsson";
        public static final String SONY_V3_PARTNER_CODE = "androidsony";
        public static final String SPRINT_XAD_PARTNER_CODE = "androidsprintxad";
        public static final String STREAMTV_PARTNER_CODE = "androidstreamtv";
        public static final String TCL_PARTNER_CODE = "androidtcl";
        public static final String TMOBILE_PARTNER_CODE = "androidtmobile";
        public static final String TOSHIBA_GMBH_APK_PARTNER_CODE = "androidtoshibagmbhapk";
        public static final String TOSHIBA_PARTNER_CODE = "androidtoshiba";
        public static final String TOYS_R_US_PARTNER_CODE = "androidapptoysrus";
        public static final String TRACPHONE_PARTNER_CODE = "androidtracfone";
        public static final String US_CELLULAR_PARTNER_CODE = "androiduscellular";
        public static final String VERIZON_PARTNER_CODE = "androidverizon";
        public static final String VIEWSONIC_PARTNER_CODE = "androidviewsonic";
        public static final String VODAFONE_PARTNER_CODE = "androidvodafone";
        public static final String WALMART_PARTNER_CODE = "HKCTablet";
        public static final String XIAOMI_PARTNER_CODE = "androidxiaomi";
        public static final String YANDEX_PARTNER_CODE = "androidyandex";
        public static final String ZINGARR_PARTNER_CODE = "androidzingarr";
        public static final String ZTE_PARTNER_CODE = "androidzte";

        public PartnerCodes()
        {
        }
    }


    private static final String AMOBEE_TEST_PARTNER_CODE_ADSPACE = "22761";
    private static final String APPATTACH = "appattach";
    private static final String APP_ATTACH_PARTNER_CODE_DELIMITER = "_";
    private static final String PRODUCTION_PARTNER_CODE_ADSPACE = "23569";
    private static final String PRODUCTION_POSTITIAL_AD_SPACE = "238700";
    private static final String TOYS_R_US_PARTNER_CODE_ADSPACE = "238510";
    private String partnerCode;

    public PartnerCoding()
    {
        partnerCode = "androidflagship3.3";
    }

    private String checkForStorageLocation(Context context, SharedPreferences sharedpreferences, String s, String s1, boolean flag)
    {
        Object obj = null;
        if (!TextUtils.isEmpty(s1))
        {
            if (flag)
            {
                return getAppAttachPartnerCode(sharedpreferences, s, s1);
            } else
            {
                writePartnerCode(sharedpreferences, s, s1);
                return s1;
            }
        }
        s1 = obj;
        String s2 = readPartnerCodeFromFile(s);
        s1 = s2;
        if (!TextUtils.isEmpty(s2))
        {
            break MISSING_BLOCK_LABEL_128;
        }
        s1 = s2;
        context = getPartnerCodeFromSharedPreferences(context);
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        s1 = context;
        writePartnerCode(sharedpreferences, s, partnerCode);
        s1 = context;
        try
        {
            context = partnerCode;
        }
        // Misplaced declaration of an exception variable
        catch (SharedPreferences sharedpreferences)
        {
            context = s1;
            if (Logger.isDebugEnabled())
            {
                sharedpreferences.printStackTrace();
                context = s1;
            }
        }
        break MISSING_BLOCK_LABEL_157;
        s1 = context;
        writePartnerCodeToFile(context, s);
        break MISSING_BLOCK_LABEL_157;
        s1 = s2;
        context = s2;
        if (!partnerCodeContainsTooManyAppAttachAppends(s2))
        {
            break MISSING_BLOCK_LABEL_157;
        }
        s1 = s2;
        context = extractCorrectAppAttachPartnerCodeAndRewrite(sharedpreferences, s, s2);
        return context;
    }

    private void createPathsIfNecessary(File file)
    {
        if (file != null)
        {
            file.mkdirs();
        }
    }

    private static boolean doesPackageSpecifyDefaultLocation(Context context)
    {
        return !TextUtils.isEmpty("");
    }

    public static String getAdSpace(Context context)
    {
        if ("androidapptoysrus".equals(getPartnerCodeFromSharedPreferences(context)))
        {
            return "238510";
        } else
        {
            return "23569";
        }
    }

    public static String getAndroidLitePartnerCode()
    {
        return "androidflagship3.3";
    }

    private String getAppAttachPartnerCode(SharedPreferences sharedpreferences, String s, String s1)
    {
        String s2 = null;
        String s4 = readPartnerCodeFromFile(s);
        s2 = s4;
        String s3;
        if (partnerCodeContainsTooManyAppAttachAppends(s4))
        {
            s2 = s4;
            try
            {
                return extractCorrectAppAttachPartnerCodeAndRewrite(sharedpreferences, s, s4);
            }
            // Misplaced declaration of an exception variable
            catch (SharedPreferences sharedpreferences)
            {
                s3 = s2;
            }
            break MISSING_BLOCK_LABEL_111;
        }
        s2 = s4;
        s3 = s4;
        if (s4.contains("_"))
        {
            break MISSING_BLOCK_LABEL_125;
        }
        s2 = s4;
        s1 = (new StringBuilder()).append(readPartnerCodeFromFile(s)).append("_").append(s1).toString();
        s2 = s1;
        writePartnerCodeToSharedPreferences(sharedpreferences, s1);
        s2 = s1;
        writePartnerCodeToFile(s1, s);
        return s1;
        if (Logger.isDebugEnabled())
        {
            sharedpreferences.printStackTrace();
            s3 = s2;
        }
        return s3;
    }

    private int getEndIndexOfFirstAppAttachVendorId(String s)
    {
        char c = "_".charAt(0);
        int k = 2;
        for (int j = 0; j < s.length();)
        {
            int i = k;
            if (s.charAt(j) == c)
            {
                k--;
                i = k;
                if (k == 0)
                {
                    return j;
                }
            }
            j++;
            k = i;
        }

        return -1;
    }

    private String getExternalStorageState()
    {
        return Environment.getExternalStorageState();
    }

    public static String getPartnerCodeFromSharedPreferences(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("pref_p_code", null);
    }

    public static String getPostitialAdSpace(Context context)
    {
        return "238700";
    }

    public static boolean isDefaultLocationPreload(Context context)
    {
        boolean flag = false;
        if (doesPackageSpecifyDefaultLocation(context) || PreferenceUtils.get(context, "default_location_added", false))
        {
            flag = true;
        }
        return flag;
    }

    public static boolean isPartnerCodedAmazonPhone(Context context)
    {
        context = getPartnerCodeFromSharedPreferences(context);
        if (context == null)
        {
            return false;
        } else
        {
            return context.equals("androidamazonphone");
        }
    }

    public static boolean isPartnerCodedAppAttach(Context context)
    {
        context = getPartnerCodeFromSharedPreferences(context);
        if (context == null)
        {
            return false;
        } else
        {
            return context.contains("androidappattach");
        }
    }

    public static boolean isPartnerCodedIcontrol(Context context)
    {
        context = getPartnerCodeFromSharedPreferences(context);
        if (context == null)
        {
            return false;
        } else
        {
            return context.equals("androidicontrol");
        }
    }

    public static boolean isPreload(Context context)
    {
        for (context = getPartnerCodeFromSharedPreferences(context); context == null || context.contains("androidflagship") || context.equals("androidamazonv2");)
        {
            return false;
        }

        return true;
    }

    private String readFromObjectInputStream(String s, ObjectInputStream objectinputstream)
        throws OptionalDataException, IOException
    {
        try
        {
            objectinputstream = (String)objectinputstream.readObject();
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            objectinputstream = s;
            if (Logger.isDebugEnabled())
            {
                classnotfoundexception.printStackTrace();
                return s;
            }
        }
        return objectinputstream;
    }

    private void writePartnerCode(SharedPreferences sharedpreferences, String s, String s1)
    {
        writePartnerCodeToSharedPreferences(sharedpreferences, s1);
        writePartnerCodeToFile(s1, s);
    }

    public final int countOccurrences(String s)
    {
        int j = 0;
        for (int i = 0; i < s.length();)
        {
            int k = j;
            if (s.charAt(i) == '_')
            {
                k = j + 1;
            }
            i++;
            j = k;
        }

        Logger.i(this, (new StringBuilder()).append("number of underscores in partnerCode is ").append(j).toString());
        return j;
    }

    protected String extractCorrectAppAttachPartnerCodeAndRewrite(SharedPreferences sharedpreferences, String s, String s1)
    {
        s1 = s1.substring(0, getEndIndexOfFirstAppAttachVendorId(s1));
        writePartnerCodeToSharedPreferences(sharedpreferences, s1);
        writePartnerCodeToFile(s1, s);
        return s1;
    }

    public void fixInvalidPartnerCodeIfRequired(Context context)
    {
        String s = getPartnerCodeFromSharedPreferences(context);
        if (s != null && s.contains("appattach"))
        {
            initializePartnerCode(context);
        }
    }

    public final File getExternalPartnerCodePath(Context context)
    {
        return new File((new StringBuilder()).append(Environment.getExternalStorageDirectory()).append("/Android/data/").append(context.getPackageName()).append("/").append("accuwx_pcode").toString());
    }

    public final File getInternalPartnerCodeFilePath(Context context)
    {
        return new File((new StringBuilder()).append(context.getFilesDir().toString()).append("/").append("accuwx_pcode").toString());
    }

    public final String getPartnerCodeFilePath(Context context)
    {
        if (isExternalStorageAvailable())
        {
            return getExternalPartnerCodePath(context).getAbsolutePath();
        } else
        {
            return getInternalPartnerCodeFilePath(context).getAbsolutePath();
        }
    }

    protected String getPreloadPartnerCodePath()
    {
        return "/etc/accuwx_pcode";
    }

    public void initializePartnerCode(Context context)
    {
        initializePartnerCode(context, "", false);
    }

    public void initializePartnerCode(Context context, String s, boolean flag)
    {
        SharedPreferences sharedpreferences;
        Logger.i(this, "initializePartnerCode()");
        sharedpreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String s1 = readPartnerCodeFromPreloadFile();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        writePartnerCodeToSharedPreferences(sharedpreferences, s1);
        writePartnerCodeToFile(s1, getPartnerCodeFilePath(context));
_L1:
        return;
        Exception exception;
        exception;
        if (Logger.isDebugEnabled())
        {
            exception.printStackTrace();
        }
        s = checkForStorageLocation(context, sharedpreferences, getPartnerCodeFilePath(context), s, flag);
        if (getPartnerCodeFromSharedPreferences(context) == null)
        {
            writePartnerCodeToSharedPreferences(sharedpreferences, s);
            return;
        }
          goto _L1
    }

    protected boolean isExternalStorageAvailable()
    {
        String s = getExternalStorageState();
        return "mounted".equals(s) || "mounted_ro".equals(s);
    }

    protected boolean partnerCodeContainsTooManyAppAttachAppends(String s)
    {
        return countOccurrences(s) > 1;
    }

    public final String readPartnerCodeFromFile(String s)
        throws IOException
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        obj2 = null;
        obj3 = null;
        obj1 = null;
        obj = obj3;
        s = new File(s);
        obj = obj3;
        createPathsIfNecessary(s.getParentFile());
        obj = obj3;
        s = new ObjectInputStream(new FileInputStream(s));
        obj = readFromObjectInputStream(null, s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        s.close();
_L2:
        return ((String) (obj));
        obj;
        s = ((String) (obj1));
        obj1 = obj;
_L5:
        obj = s;
        if (!Logger.isDebugEnabled())
        {
            break MISSING_BLOCK_LABEL_86;
        }
        obj = s;
        ((Exception) (obj1)).printStackTrace();
        obj = obj2;
        if (s == null) goto _L2; else goto _L1
_L1:
        s.close();
        return null;
        s;
_L4:
        if (obj != null)
        {
            ((ObjectInputStream) (obj)).close();
        }
        throw s;
        obj1;
        obj = s;
        s = ((String) (obj1));
        if (true) goto _L4; else goto _L3
_L3:
        obj1;
          goto _L5
        return ((String) (obj));
    }

    public final String readPartnerCodeFromPreloadFile()
    {
        Object obj;
        Object obj1;
        Object obj3;
        Object obj4;
        obj3 = null;
        obj1 = null;
        obj4 = null;
        obj = obj1;
        File file = new File(getPreloadPartnerCodePath());
        obj = obj1;
        createPathsIfNecessary(file.getParentFile());
        obj = obj1;
        obj1 = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        obj = ((BufferedReader) (obj1)).readLine();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        try
        {
            ((BufferedReader) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            return ((String) (obj));
        }
_L2:
        return ((String) (obj));
        Object obj2;
        obj2;
        obj1 = obj4;
_L5:
        obj = obj1;
        if (!Logger.isDebugEnabled())
        {
            break MISSING_BLOCK_LABEL_93;
        }
        obj = obj1;
        ((Exception) (obj2)).printStackTrace();
        obj = obj3;
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        try
        {
            ((BufferedReader) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        return null;
        obj1;
_L4:
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw obj1;
        obj2;
        obj = obj1;
        obj1 = obj2;
        if (true) goto _L4; else goto _L3
_L3:
        obj2;
          goto _L5
        return ((String) (obj));
    }

    public void setPartnerCode(String s)
    {
        partnerCode = s;
    }

    public final void writePartnerCodeToFile(String s, String s1)
    {
        Object obj;
        Object obj1;
        Logger.i(this, (new StringBuilder()).append("writePartnerCodeToFile with partnerCode ").append(s).toString());
        obj = new File(s1);
        createPathsIfNecessary(((File) (obj)).getParentFile());
        s1 = null;
        obj1 = null;
        obj = new ObjectOutputStream(new FileOutputStream(((File) (obj)).getAbsolutePath()));
        ((ObjectOutputStream) (obj)).writeObject(s);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        ((ObjectOutputStream) (obj)).close();
_L2:
        return;
        s;
        return;
        obj;
        s = obj1;
_L5:
        s1 = s;
        if (!Logger.isDebugEnabled())
        {
            continue; /* Loop/switch isn't completed */
        }
        s1 = s;
        ((IOException) (obj)).printStackTrace();
        if (s == null) goto _L2; else goto _L1
_L1:
        try
        {
            s.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        s;
_L4:
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        }
        throw s;
        s;
        s1 = ((String) (obj));
        if (true) goto _L4; else goto _L3
_L3:
        s1;
        s = ((String) (obj));
        obj = s1;
          goto _L5
    }

    protected void writePartnerCodeToSharedPreferences(SharedPreferences sharedpreferences, String s)
    {
        Logger.i(this, (new StringBuilder()).append("writePartnerCodeToSharedPreferences with partnerCode ").append(s).toString());
        sharedpreferences.edit().putString("pref_p_code", s).commit();
    }
}
