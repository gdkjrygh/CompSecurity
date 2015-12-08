// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public final class zza extends Enum
{

    public static final zza zzA;
    public static final zza zzB;
    public static final zza zzC;
    public static final zza zzD;
    public static final zza zzE;
    public static final zza zzF;
    public static final zza zzG;
    public static final zza zzH;
    public static final zza zzI;
    public static final zza zzJ;
    public static final zza zzK;
    public static final zza zzL;
    public static final zza zzM;
    public static final zza zzN;
    public static final zza zzO;
    public static final zza zzP;
    public static final zza zzQ;
    public static final zza zzR;
    public static final zza zzS;
    public static final zza zzT;
    public static final zza zzU;
    public static final zza zzV;
    public static final zza zzW;
    public static final zza zzX;
    public static final zza zzY;
    public static final zza zzZ;
    public static final zza zzaA;
    public static final zza zzaB;
    public static final zza zzaC;
    public static final zza zzaD;
    public static final zza zzaE;
    public static final zza zzaF;
    public static final zza zzaG;
    public static final zza zzaH;
    public static final zza zzaI;
    public static final zza zzaJ;
    public static final zza zzaK;
    public static final zza zzaL;
    public static final zza zzaM;
    public static final zza zzaN;
    public static final zza zzaO;
    public static final zza zzaP;
    public static final zza zzaQ;
    public static final zza zzaR;
    public static final zza zzaS;
    public static final zza zzaT;
    public static final zza zzaU;
    public static final zza zzaV;
    public static final zza zzaW;
    public static final zza zzaX;
    public static final zza zzaY;
    public static final zza zzaZ;
    public static final zza zzaa;
    public static final zza zzab;
    public static final zza zzac;
    public static final zza zzad;
    public static final zza zzae;
    public static final zza zzaf;
    public static final zza zzag;
    public static final zza zzah;
    public static final zza zzai;
    public static final zza zzaj;
    public static final zza zzak;
    public static final zza zzal;
    public static final zza zzam;
    public static final zza zzan;
    public static final zza zzao;
    public static final zza zzap;
    public static final zza zzaq;
    public static final zza zzar;
    public static final zza zzas;
    public static final zza zzat;
    public static final zza zzau;
    public static final zza zzav;
    public static final zza zzaw;
    public static final zza zzax;
    public static final zza zzay;
    public static final zza zzaz;
    public static final zza zzba;
    public static final zza zzbb;
    public static final zza zzbc;
    public static final zza zzbd;
    public static final zza zzbe;
    public static final zza zzbf;
    public static final zza zzbg;
    public static final zza zzbh;
    private static final zza zzbi[];
    public static final zza zzu;
    public static final zza zzv;
    public static final zza zzw;
    public static final zza zzx;
    public static final zza zzy;
    public static final zza zzz;
    private final String name;

    private zza(String s, int i, String s1)
    {
        super(s, i);
        name = s1;
    }

    public static zza valueOf(String s)
    {
        return (zza)Enum.valueOf(com/google/android/gms/internal/zza, s);
    }

    public static zza[] values()
    {
        return (zza[])zzbi.clone();
    }

    public final String toString()
    {
        return name;
    }

    static 
    {
        zzu = new zza("ADVERTISER_ID", 0, "_aid");
        zzv = new zza("ADVERTISING_TRACKING_ENABLED", 1, "_ate");
        zzw = new zza("APP_ID", 2, "_ai");
        zzx = new zza("APP_NAME", 3, "_an");
        zzy = new zza("APP_VERSION", 4, "_av");
        zzz = new zza("ARBITRARY_JAVASCRIPT", 5, "_jsm");
        zzA = new zza("CONSTANT", 6, "_c");
        zzB = new zza("COOKIE", 7, "_k");
        zzC = new zza("CUSTOM_VAR", 8, "_v");
        zzD = new zza("CONTAINER_VERSION", 9, "_ctv");
        zzE = new zza("DEBUG_MODE", 10, "_dbg");
        zzF = new zza("DEVICE_NAME", 11, "_dn");
        zzG = new zza("DEVICE_TYPE", 12, "_dt");
        zzH = new zza("DOM_ELEMENT", 13, "_d");
        zzI = new zza("ELEMENT_TEXT", 14, "_et");
        zzJ = new zza("ELEMENT_URL", 15, "_eu");
        zzK = new zza("EVENT", 16, "_e");
        zzL = new zza("FUNCTION_CALL", 17, "_func");
        zzM = new zza("JS_GLOBAL", 18, "_j");
        zzN = new zza("LANGUAGE", 19, "_l");
        zzO = new zza("OS_VERSION", 20, "_ov");
        zzP = new zza("PLATFORM", 21, "_p");
        zzQ = new zza("RANDOM", 22, "_r");
        zzR = new zza("REFERRER", 23, "_f");
        zzS = new zza("RESOLUTION", 24, "_rs");
        zzT = new zza("RUNTIME_VERSION", 25, "_rv");
        zzU = new zza("SDK_VERSION", 26, "_sv");
        zzV = new zza("SIMPLE_MAP", 27, "_smm");
        zzW = new zza("TIME", 28, "_t");
        zzX = new zza("URL", 29, "_u");
        zzY = new zza("ADWORDS_CLICK_REFERRER", 30, "_awcr");
        zzZ = new zza("DEVICE_ID", 31, "_did");
        zzaa = new zza("ENCODE", 32, "_enc");
        zzab = new zza("GTM_VERSION", 33, "_gtmv");
        zzac = new zza("HASH", 34, "_hsh");
        zzad = new zza("INSTALL_REFERRER", 35, "_ir");
        zzae = new zza("JOINER", 36, "_jn");
        zzaf = new zza("MOBILE_ADWORDS_UNIQUE_ID", 37, "_awid");
        zzag = new zza("REGEX_GROUP", 38, "_reg");
        zzah = new zza("DATA_LAYER_WRITE", 39, "_dlw");
        zzai = new zza("LOWERCASE_STRING", 40, "_ls");
        zzaj = new zza("UPPERCASE_STRING", 41, "_us");
        zzak = new zza("EXPERIMENT_ENABLED", 42, "_ee");
        zzal = new zza("IN_EXPERIMENT", 43, "_ie");
        zzam = new zza("EXPERIMENT_VARIATION_INDEX", 44, "_evi");
        zzan = new zza("AUDIENCE_LISTS", 45, "_aud");
        zzao = new zza("CSS_SELECTOR", 46, "_sel");
        zzap = new zza("REGEX", 47, "_re");
        zzaq = new zza("STARTS_WITH", 48, "_sw");
        zzar = new zza("ENDS_WITH", 49, "_ew");
        zzas = new zza("CONTAINS", 50, "_cn");
        zzat = new zza("EQUALS", 51, "_eq");
        zzau = new zza("LESS_THAN", 52, "_lt");
        zzav = new zza("LESS_EQUALS", 53, "_le");
        zzaw = new zza("GREATER_THAN", 54, "_gt");
        zzax = new zza("GREATER_EQUALS", 55, "_ge");
        zzay = new zza("ARBITRARY_PIXEL", 56, "_img");
        zzaz = new zza("ARBITRARY_HTML", 57, "_html");
        zzaA = new zza("GOOGLE_TAG_MANAGER", 58, "_gtm");
        zzaB = new zza("GOOGLE_ANALYTICS", 59, "_ga");
        zzaC = new zza("ADWORDS_CONVERSION", 60, "_awct");
        zzaD = new zza("SMART_PIXEL", 61, "_sp");
        zzaE = new zza("FLOODLIGHT_COUNTER", 62, "_flc");
        zzaF = new zza("FLOODLIGHT_SALES", 63, "_fls");
        zzaG = new zza("BIZO_INSIGHT", 64, "_bzi");
        zzaH = new zza("QUANTCAST_MEASUREMENT", 65, "_qcm");
        zzaI = new zza("TARGUS_ADVISOR", 66, "_ta");
        zzaJ = new zza("MEDIAPLEX_ROI", 67, "_mpr");
        zzaK = new zza("COMSCORE_MEASUREMENT", 68, "_csm");
        zzaL = new zza("TURN_CONVERSION", 69, "_tc");
        zzaM = new zza("TURN_DATA_COLLECTION", 70, "_tdc");
        zzaN = new zza("MEDIA6DEGREES_UNIVERSAL_PIXEL", 71, "_m6d");
        zzaO = new zza("UNIVERSAL_ANALYTICS", 72, "_ua");
        zzaP = new zza("MEDIAPLEX_MCT", 73, "_mpm");
        zzaQ = new zza("VISUAL_DNA_CONVERSION", 74, "_vdc");
        zzaR = new zza("GOOGLE_AFFILIATE_NETWORK", 75, "_gan");
        zzaS = new zza("MARIN_SOFTWARE", 76, "_ms");
        zzaT = new zza("ADROLL_SMART_PIXEL", 77, "_asp");
        zzaU = new zza("CONFIGURATION_VALUE", 78, "_cv");
        zzaV = new zza("CRITEO", 79, "_crt");
        zzaW = new zza("TRUSTED_STORES", 80, "_ts");
        zzaX = new zza("CLICK_TALE_STANDARD", 81, "_cts");
        zzaY = new zza("LINK_CLICK_LISTENER", 82, "_lcl");
        zzaZ = new zza("FORM_SUBMIT_LISTENER", 83, "_fsl");
        zzba = new zza("TIMER_LISTENER", 84, "_tl");
        zzbb = new zza("CLICK_LISTENER", 85, "_cl");
        zzbc = new zza("JS_ERROR_LISTENER", 86, "_jel");
        zzbd = new zza("HISTORY_LISTENER", 87, "_hl");
        zzbe = new zza("AJAX_SUBMIT_LISTENER", 88, "_ajl");
        zzbf = new zza("YOU_TUBE_LISTENER", 89, "_ytl");
        zzbg = new zza("ELEMENT_ATTRIBUTE", 90, "_ea");
        zzbh = new zza("ORDERED_LIST", 91, "_ol");
        zzbi = (new zza[] {
            zzu, zzv, zzw, zzx, zzy, zzz, zzA, zzB, zzC, zzD, 
            zzE, zzF, zzG, zzH, zzI, zzJ, zzK, zzL, zzM, zzN, 
            zzO, zzP, zzQ, zzR, zzS, zzT, zzU, zzV, zzW, zzX, 
            zzY, zzZ, zzaa, zzab, zzac, zzad, zzae, zzaf, zzag, zzah, 
            zzai, zzaj, zzak, zzal, zzam, zzan, zzao, zzap, zzaq, zzar, 
            zzas, zzat, zzau, zzav, zzaw, zzax, zzay, zzaz, zzaA, zzaB, 
            zzaC, zzaD, zzaE, zzaF, zzaG, zzaH, zzaI, zzaJ, zzaK, zzaL, 
            zzaM, zzaN, zzaO, zzaP, zzaQ, zzaR, zzaS, zzaT, zzaU, zzaV, 
            zzaW, zzaX, zzaY, zzaZ, zzba, zzbb, zzbc, zzbd, zzbe, zzbf, 
            zzbg, zzbh
        });
    }
}
