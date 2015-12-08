// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;

import android.content.Context;
import android.location.Location;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.nielsen.app.sdk:
//            a, h, c, b, 
//            AppNative, AppScheduler, f, AppLocationManager, 
//            AppRequestManager

class AppConfig extends Thread
    implements Closeable
{

    public static final String A = "-";
    public static final String B = "tagVar";
    public static final String C = "is";
    public static final String D = "result";
    public static final String E = "then";
    public static final String F = "else";
    public static final String G = "cond";
    public static final String H = "name";
    public static final String I = "value";
    public static final String J = "type";
    public static final String K = "sdk_nuidts";
    public static final String L = "sdk_adidts";
    public static final String M = "sdk_appdisablesent";
    public static final String N = "sdk_useroptoutsent";
    public static final String O = "sdk_appdisablets";
    public static final String P = "sdk_maxLogMsgLength";
    public static final String Q = "sdk_tsvFdCid";
    public static final String R = "sdk_tsvPcCid";
    public static final String S = "sdk_assetid";
    public static final String T = "content";
    public static final String U = "radio";
    public static final String V = "ad";
    public static final String W = "st,a";
    public static final String X = "";
    public static final String Y = "id3";
    public static final String Z = "mtvr";
    public static final String a = "150";
    public static final String aA = "";
    public static final String aB = "86400";
    public static final String aC = "id3";
    public static final String aD = "interval";
    public static final String aE = "";
    public static final String aF = "0";
    public static final String aG = "%7C";
    public static final String aH = "";
    public static final String aI = "radio,content";
    public static final String aJ = "false";
    public static final String aK = "3";
    public static final String aL = "";
    public static final String aM = "";
    public static final String aN = "140";
    public static final String aO = "1800";
    public static final String aP = "0";
    public static final String aQ = "S";
    public static final String aR = "D";
    public static final String aS = "nol_";
    public static final String aT = "nol_errorURL";
    public static final String aU = "nol_error_message";
    public static final String aV = "nol_errlogInterval";
    public static final String aW = "nol_appdma";
    public static final String aX = "nol_appcountrycode";
    public static final String aY = "nol_provider";
    public static final String aZ = "nol_gpsPrecision";
    public static final String aa = "dpr";
    public static final String ab = "drm";
    public static final String ac = "ocr";
    public static final String ad = "vc";
    public static final String ae = "dprid3";
    public static final String af = "interval";
    public static final String ag = "episode";
    public static final String ah = "stream";
    public static final String ai = "impression";
    public static final String aj = "daypart";
    public static final String ak = "secure-|!nol_sfcode!|.imrworldwide.com";
    public static final String al = "https://secure-|!nol_sfcode!|.imrworldwide.com/cgi-bin/cfg?cfgv=150&longitude=|![nol_longitude]!|&latitude=|![nol_latitude]!|&apid=|!nol_appid!|&apv=|!nol_appversion!|&apn=|!nol_appname!|&sdkv=|!nol_sdkversion!|&nuid=|!nol_nuid!|&osver=|!nol_osversion!|&devtypid=|!nol_devtypeid!|&devid=|![nol_deviceId]!|&fmt=json&adf=|![nol_appdisable]!|&uoo=|![nol_useroptout]!|&sfcode=|![nol_sfcode]!|&ccode=|![nol_countrycode]!|&dma=|![nol_dma]!||![nol_appParams]!|";
    public static final String am = "http://secure-|!nol_sfcode!|.imrworldwide.com/cgi-bin/error?message=|!(nol_error_message)!|,c13_|![nol_appid]!|,c16_|![nol_sdkv]!|,c8_|![nol_devGroup]!|,c7_|![nol_osGroup]!|,c10_|![nol_platform]!|,c17_|![nol_stationId]!|,c18_|![nol_assetid]!|,c6_|![nol_product]!|,ci_|![nol_clientid]!|";
    public static final String an = "NLSDK (|!nol_osver!|,|!nol_devtypeid!| BUILD/|!nol_sdkver!|) |!nol_appid!|/|!nol_appver!|";
    public static final String ao = "";
    public static final String ap = "";
    public static final String aq = "RAW ID3 default controller";
    public static final String ar = "X100zdCIGeIlgZnkYj6UvQ==";
    public static final String as = "99";
    public static final String at = "us";
    public static final String au = "<No AppId>";
    public static final String av = "Nielsen SDK";
    public static final String aw = "app.1.0.0";
    public static final String ax = "";
    public static final String ay = "";
    public static final String az = "1";
    public static final int b = 4;
    public static final String bA = "nol_customExtension";
    public static final String bB = "nol_id3Map";
    public static final String bC = "nol_md5Seed";
    public static final String bD = "nol_xorSeed";
    public static final String bE = "nol_tagMap";
    public static final String bF = "nol_TAGS";
    public static final String bG = "nol_segmentTimeSpent";
    public static final String bH = "nol_timeSpentViewing";
    public static final String bI = "nol_cadence";
    public static final String bJ = "nol_timer";
    public static final String bK = "nol_product";
    public static final String bL = "nol_xorPrdct";
    public static final String bM = "nol_url";
    public static final String bN = "nol_defaults";
    public static final String bO = "nol_cidNull";
    public static final String bP = "nol_serverTime";
    public static final String bQ = "nol_weekStartUTC";
    public static final String bR = "nol_weekEndUTC";
    public static final String bS = "nol_startDayTimeOffset";
    public static final String bT = "nol_GMTOffset";
    public static final String bU = "nol_wmDayQhr";
    public static final String bV = "nol_wmDay";
    public static final String bW = "nol_weekQhr";
    public static final String bX = "nol_localDay";
    public static final String bY = "nol_dayQhr";
    public static final String bZ = "nol_period";
    public static final String ba = "nol_longitude";
    public static final String bb = "nol_latitude";
    public static final String bc = "nol_sfcode";
    public static final String bd = "nol_nuid";
    public static final String be = "nol_appid";
    public static final String bf = "nol_appver";
    public static final String bg = "nol_appname";
    public static final String bh = "nol_channelName";
    public static final String bi = "nol_sdkver";
    public static final String bj = "nol_sdkv";
    public static final String bk = "nol_osversion";
    public static final String bl = "nol_devtypeid";
    public static final String bm = "nol_useroptout";
    public static final String bn = "nol_useroptUrl";
    public static final String bo = "nol_appdisable";
    public static final String bp = "nol_disabled";
    public static final String bq = "nol_panelFlag";
    public static final String br = "nol_disableNuidUA";
    public static final String bs = "nol_metro";
    public static final String bt = "nol_backgroundMode";
    public static final String bu = "nol_breakout";
    public static final String bv = "nol_GLOBALS";
    public static final String bw = "nol_nslApiDbg";
    public static final String bx = "nol_devDebug";
    public static final String by = "nol_clientCMSmap";
    public static final String bz = "nol_contentType";
    public static final String c = "CMD_FLUSH";
    public static final String cA = "nol_stationIdDefault";
    public static final String cB = "nol_id3Seq";
    public static final String cC = "nol_id3ClockSrc";
    public static final String cD = "nol_id3FirstTs";
    public static final String cE = "nol_id3Data";
    public static final String cF = "nol_id3Raw";
    public static final String cG = "nol_tsvURL";
    public static final String cH = "nol_stationURL";
    public static final String cI = "nol_tagPresence";
    public static final String cJ = "nol_breakout";
    public static final String cK = "nol_currSeg";
    public static final String cL = "nol_duration";
    public static final String cM = "nol_random";
    public static final String cN = "nol_devtime";
    public static final String cO = "nol_devtimezone";
    public static final String cP = "nol_vidtype";
    public static final String cQ = "nol_ac";
    public static final String cR = "nol_c3";
    public static final String cS = "nol_davState";
    public static final String cT = "nol_assetid";
    public static final String cU = "nol_deviceId";
    public static final String cV = "nol_ocrtag";
    public static final String cW = "nol_intrvlThrshld";
    public static final String cX = "nol_id3IntrvlGp";
    public static final String cY = "nol_chnlCountThrshld";
    public static final String cZ = "nol_userAgent";
    public static final String ca = "nol_nextPeriod";
    public static final String cb = "nol_week";
    public static final String cc = "nol_nextWeek";
    public static final String cd = "nol_clientid";
    public static final String ce = "nol_vcid";
    public static final String cf = "nol_dpr";
    public static final String cg = "nol_drm";
    public static final String ch = "nol_httpProtocol";
    public static final String ci = "nol_sendTimer";
    public static final String cj = "nol_fdTimeCode";
    public static final String ck = "nol_pcTimeCode";
    public static final String cl = "nol_pccid";
    public static final String cm = "nol_fdcid";
    public static final String cn = "nol_creditFlag";
    public static final String co = "nol_creditValue";
    public static final String cp = "nol_segmentLength";
    public static final String cq = "nol_segmentValue";
    public static final String cr = "nol_segmentPrefix";
    public static final String cs = "nol_maxLength";
    public static final String ct = "nol_sendQual";
    public static final String cu = "nol_id3Delimiter";
    public static final String cv = "nol_maxPingCount";
    public static final String cw = "nol_unQualSegmentValue";
    public static final String cx = "nol_forward";
    public static final String cy = "nol_tsvFlag";
    public static final String cz = "nol_stationId";
    public static final String d = "onPlay";
    public static final String dA = "nol_sdkversion";
    public static final String dB = "nol_commentRadio";
    public static final String dC = "nol_tsvFlagDefault";
    public static final String dD = "nol_stationType";
    public static final String dE = "nol_stnevt";
    public static final String dF = "nol_caSeed";
    public static final String dG = "nol_osver";
    public static final String dH = "nol_clocksrc";
    public static final String dI = "nol_osGroup";
    public static final String dJ = "nol_platform";
    public static final String dK = "nol_chapter";
    public static final String dL = "nol_adURL";
    public static final String dM = "nol_nielsenDomain";
    public static final String dN = "nol_configLifespan";
    public static final String dO = "nol_configIncrement";
    public static final String dP = "nol_tsvBreakoutMap";
    public static final String dQ = "nol_countrycode2";
    public static final String dR = "nol_fdoffset";
    public static final String dS = "nol_pcoffset";
    public static final String dT = "nol_cmsoffset";
    public static final String dU = "(apid)";
    public static final String dV = "apid";
    public static final String dW = "(apv)";
    public static final String dX = "apv";
    public static final String dY = "(apn)";
    public static final String dZ = "apn";
    public static final String da = "nol_sysVolume";
    public static final String db = "nol_muteState";
    public static final String dc = "nol_iagData";
    public static final String dd = "nol_length";
    public static final String de = "nol_pd";
    public static final String df = "nol_sid";
    public static final String dg = "nol_tfid";
    public static final String dh = "nol_prod";
    public static final String di = "nol_title";
    public static final String dj = "nol_category";
    public static final String dk = "nol_censuscategory";
    public static final String dl = "nol_iagcategory";
    public static final String dm = "nol_nWebAddress";
    public static final String dn = "nol_pccid";
    public static final String _flddo = "nol_fdcid";
    public static final String dp = "nol_watermark";
    public static final String dq = "nol_pcoffset";
    public static final String dr = "nol_fdoffset";
    public static final String ds = "nol_breakout";
    public static final String dt = "nol_comment";
    public static final String du = "nol_comment%d";
    public static final String dv = "nol_url_override";
    public static final String dw = "nol_appparams";
    public static final String dx = "nol_cidPrefix";
    public static final String dy = "nol_sdkDelimiter";
    public static final String dz = "nol_appversion";
    public static final String e = "onPlay";
    public static final String eA = "clientid";
    public static final String eB = "vcid";
    public static final String eC = "sid";
    public static final String eD = "tfid";
    public static final String eE = "pd";
    public static final String eF = "prod";
    public static final String eG = "sdkv";
    public static final String eH = "nuid";
    public static final String eI = "osver";
    public static final String eJ = "devtypid";
    public static final String eK = "devid";
    public static final String eL = "fmt";
    public static final String eM = "adf";
    public static final String eN = "uoo";
    public static final String eO = "(longitude)";
    public static final String eP = "longitude";
    public static final String eQ = "(latitude)";
    public static final String eR = "latitude";
    public static final String eS = "type";
    public static final String eT = "stationType";
    public static final String eU = "(provider)";
    public static final String eV = "(comment)";
    public static final String eW = "metro";
    public static final String eX = "category";
    public static final String eY = "censuscategory";
    public static final String eZ = "iag_";
    public static final String ea = "(appid)";
    public static final String eb = "appid";
    public static final String ec = "appId";
    public static final String ed = "(appversion)";
    public static final String ee = "appversion";
    public static final String ef = "appVersion";
    public static final String eg = "(appname)";
    public static final String eh = "appname";
    public static final String ei = "appName";
    public static final String ej = "(dma)";
    public static final String ek = "dma";
    public static final String el = "(ccode)";
    public static final String em = "ccode";
    public static final String en = "(sfcode)";
    public static final String eo = "sfcode";
    public static final String ep = "tv";
    public static final String eq = "(channelName)";
    public static final String er = "channelName";
    public static final String es = "channelname";
    public static final String et = "assetId";
    public static final String eu = "assetid";
    public static final String ev = "ocrtag";
    public static final String ew = "(title)";
    public static final String ex = "(category)";
    public static final String ey = "(censuscategory)";
    public static final String ez = "length";
    public static final String f = "onAssetIdChanged";
    public static final String fA = "&pr=iag.epi,%s";
    public static final String fB = "&pr=iag.seg,%s";
    public static final String fC = "&pr=iag.seg,1";
    public static final String fD = "&pr=iag.pd,%s";
    public static final String fE = "&pr=iag.oad,%s";
    public static final String fF = "&pr=iag.ap,mid";
    public static final String fG = "&pr=iag.ap,post";
    public static final String fH = "&pr=iag.ap,pre";
    public static final String fI = "&pr=iag.brn,%s";
    public static final String fJ = "&pr=iag.cte,%s";
    public static final String fK = "&pr=iag.cp,soc";
    public static final String fL = "ipod";
    public static final String fM = "pod";
    public static final String fN = "iapt";
    public static final String fO = "apt";
    public static final String fP = "0";
    public static final String fQ = "1";
    public static final String fR = "2";
    public static final long fS = 0L;
    public static final long fT = 90L;
    public static final long fU = 600L;
    public static final long fV = -1L;
    public static final long fW = 0L;
    public static final long fX = 5L;
    public static final long fY = 30L;
    public static final long fZ = 60L;
    public static final String fa = "iagcategory";
    public static final String fb = "clientid";
    public static final String fc = "icust1";
    public static final String fd = "title";
    public static final String fe = "iag";
    public static final String ff = "sid";
    public static final String fg = "ifp";
    public static final String fh = "sid";
    public static final String fi = "fp";
    public static final String fj = "midroll";
    public static final String fk = "postroll";
    public static final String fl = "preroll";
    public static final String fm = "segment";
    public static final String fn = "bcr";
    public static final String fo = "brn";
    public static final String fp = "cte";
    public static final String fq = "pgm";
    public static final String fr = "seg";
    public static final String fs = "pd";
    public static final String ft = "oad";
    public static final String fu = "epi";
    public static final String fv = "iag_seg";
    public static final String fw = "&pr=iag";
    public static final String fx = "&pr=iag.%s,%s";
    public static final String fy = "&pr=iag.pgm,%s";
    public static final String fz = "&pr=iag.pgm,general";
    public static final String g = "tsv";
    private static AppConfig gG = null;
    public static final long ga = 600L;
    public static final long gb = 60L;
    public static final long gc = 500L;
    public static final long gd = 250L;
    public static final long ge = 1000L;
    public static final long gf = 0x15180L;
    public static final long gg = 3600L;
    public static final int gh = 90;
    public static final int gi = 15;
    public static final int gj = 10;
    public static final boolean gk = false;
    public static final char gl = 32;
    public static final char gm = 83;
    public static final char gn = 68;
    public static final String go = "baseServerTime";
    public static final String gp = "baseDeviceTime";
    public static final String gq = "0";
    public static final String gr = "\"nol_devdebug\":\"true\"";
    private static final int gs = 500;
    public static final String h = "stn";
    public static final String i = "onViewWon";
    public static final String j = "onWeekEndUTC";
    public static final String k = "onId3FdCidChanged";
    public static final String l = "onId3PcCidChanged";
    public static final String m = "onPingSend";
    public static final String n = "onComplete";
    public static final String o = "onSendId3";
    public static final String p = "onId3Detected";
    public static final String q = "onSendId3,onId3Detected";
    public static final String r = "onCmsDetected";
    public static final String s = "onLoadMetadata";
    public static final String t = "onLoadMetadata,onCmsDetected";
    public static final String u = "nol_serviceFilter";
    public static final String v = "nol_eventFilter";
    public static final String w = "nol_tagFilter";
    public static final String x = "++";
    public static final String y = "--";
    public static final String z = "+";
    private h gA;
    private String gB;
    private boolean gC;
    private boolean gD;
    private boolean gE;
    private boolean gF;
    private boolean gH;
    private long gI;
    private a gJ;
    private f gK;
    private b gt;
    private AppScheduler gu;
    private int gv;
    private String gw;
    private AppRequestManager gx;
    private com.nielsen.app.sdk.b gy;
    private AppNative gz;

    private AppConfig(Context context, JSONObject jsonobject, f f1)
    {
label0:
        {
            super();
            gt = null;
            gu = null;
            gv = 0;
            gw = "https://secure-|!nol_sfcode!|.imrworldwide.com/cgi-bin/cfg?cfgv=150&longitude=|![nol_longitude]!|&latitude=|![nol_latitude]!|&apid=|!nol_appid!|&apv=|!nol_appversion!|&apn=|!nol_appname!|&sdkv=|!nol_sdkversion!|&nuid=|!nol_nuid!|&osver=|!nol_osversion!|&devtypid=|!nol_devtypeid!|&devid=|![nol_deviceId]!|&fmt=json&adf=|![nol_appdisable]!|&uoo=|![nol_useroptout]!|&sfcode=|![nol_sfcode]!|&ccode=|![nol_countrycode]!|&dma=|![nol_dma]!||![nol_appParams]!|";
            gx = null;
            gy = null;
            gz = null;
            gA = null;
            gB = "NLSDK (|!nol_osver!|,|!nol_devtypeid!| BUILD/|!nol_sdkver!|) |!nol_appid!|/|!nol_appver!|";
            gC = false;
            gD = false;
            gE = false;
            gF = false;
            gH = true;
            gI = 0L;
            gJ = null;
            gK = null;
            if (f1 != null)
            {
                gK = f1;
            }
            gA = com.nielsen.app.sdk.a.m();
            gz = com.nielsen.app.sdk.a.q();
            gy = com.nielsen.app.sdk.a.u();
            gx = com.nielsen.app.sdk.a.t();
            gD = gA.a();
            gC = gA.d();
            HashMap hashmap = new HashMap();
            hashmap.put("nol_appid", "(apid)");
            hashmap.put("appid", "(apid)");
            hashmap.put("nol_appversion", "(apv)");
            hashmap.put("appversion", "(apv)");
            hashmap.put("nol_appname", "(apn)");
            hashmap.put("appname", "(apn)");
            hashmap.put("nol_appdma", "(dma)");
            hashmap.put("nol_appcountrycode", "(ccode)");
            hashmap.put("nol_sfcode", "(sfcode)");
            hashmap.put("nol_dpr", "tv");
            hashmap.put("nol_assetid", "assetid");
            hashmap.put("assetid", "assetId");
            hashmap.put("nol_stationType", "stationType");
            hashmap.put("nol_channelName", "(channelName)");
            hashmap.put("nol_ocrtag", "ocrtag");
            hashmap.put("nol_title", "(title)");
            hashmap.put("nol_category", "(category)");
            hashmap.put("nol_censuscategory", "(censuscategory)");
            hashmap.put("nol_length", "length");
            hashmap.put("nol_clientid", "clientid");
            hashmap.put("nol_vcid", "vcid");
            hashmap.put("nol_sid", "sid");
            hashmap.put("nol_tfid", "tfid");
            hashmap.put("nol_pd", "pd");
            hashmap.put("nol_prod", "prod");
            hashmap.put("nol_metro", "metro");
            hashmap.put("nol_provider", "(provider)");
            hashmap.put("nol_latitude", "(latitude)");
            hashmap.put("nol_longitude", "(longitude)");
            hashmap.put("nol_comment", "(comment)");
            hashmap.put("nol_sdkversion", "sdkv");
            com.nielsen.app.sdk.c.a('I', "Default CMS map parameters length(%d)", new Object[] {
                Integer.valueOf(hashmap.size())
            });
            HashMap hashmap1 = new HashMap();
            if (jsonobject != null)
            {
                String s1;
                for (context = jsonobject.keys(); context.hasNext(); hashmap1.put(f1.toLowerCase(Locale.getDefault()), s1))
                {
                    f1 = (String)context.next();
                    s1 = jsonobject.getString(f1);
                }

                com.nielsen.app.sdk.c.a('I');
                context = (String)hashmap1.get("nol_nslApiDbg".toLowerCase(Locale.getDefault()));
                long l1;
                boolean flag;
                if (context != null)
                {
                    flag = a(context);
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    if (flag)
                    {
                        com.nielsen.app.sdk.c.a('W');
                    }
                    com.nielsen.app.sdk.c.a(flag);
                    Iterator iterator;
                    String s2;
                    Object obj;
                    if (flag)
                    {
                        context = "true";
                    } else
                    {
                        context = "false";
                    }
                    com.nielsen.app.sdk.c.a('I', "%s = %s", new Object[] {
                        "nol_nslApiDbg", context
                    });
                }
                f1 = (String)hashmap1.get("sfcode".toLowerCase(Locale.getDefault()));
                context = f1;
                if (f1 == null)
                {
                    context = (String)hashmap1.get("nol_sfcode".toLowerCase(Locale.getDefault()));
                }
                f1 = context;
                if (context == null)
                {
                    f1 = "us";
                }
                hashmap1.put("nol_sfcode", f1);
                hashmap1.put("sfcode", f1);
                f1 = (String)hashmap1.get("apid".toLowerCase(Locale.getDefault()));
                context = f1;
                if (f1 == null)
                {
                    context = (String)hashmap1.get("appid".toLowerCase(Locale.getDefault()));
                }
                f1 = context;
                if (context == null)
                {
                    f1 = (String)hashmap1.get("nol_appid".toLowerCase(Locale.getDefault()));
                }
                context = f1;
                if (f1 == null)
                {
                    context = "<No AppId>";
                }
                hashmap1.put("nol_appid", context);
                hashmap1.put("appid", context);
                hashmap1.put("apid", context);
                f1 = (String)hashmap1.get("apn".toLowerCase(Locale.getDefault()));
                context = f1;
                if (f1 == null)
                {
                    context = (String)hashmap1.get("appname".toLowerCase(Locale.getDefault()));
                }
                f1 = context;
                if (context == null)
                {
                    f1 = (String)hashmap1.get("nol_appname".toLowerCase(Locale.getDefault()));
                }
                context = f1;
                if (f1 == null)
                {
                    context = "Nielsen SDK";
                }
                hashmap1.put("nol_appname", context);
                hashmap1.put("appname", context);
                hashmap1.put("apn", context);
                f1 = (String)hashmap1.get("apv".toLowerCase(Locale.getDefault()));
                context = f1;
                if (f1 == null)
                {
                    context = (String)hashmap1.get("nol_appver".toLowerCase(Locale.getDefault()));
                }
                f1 = context;
                if (context == null)
                {
                    f1 = (String)hashmap1.get("appversion".toLowerCase(Locale.getDefault()));
                }
                context = f1;
                if (f1 == null)
                {
                    context = (String)hashmap1.get("nol_appversion".toLowerCase(Locale.getDefault()));
                }
                f1 = context;
                if (context == null)
                {
                    f1 = "app.1.0.0";
                }
                hashmap1.put("nol_appversion", f1);
                hashmap1.put("appversion", f1);
                hashmap1.put("nol_appver", f1);
                hashmap1.put("apv", f1);
                f1 = (String)hashmap1.get("dma".toLowerCase(Locale.getDefault()));
                context = f1;
                if (f1 == null)
                {
                    context = (String)hashmap1.get("nol_appdma".toLowerCase(Locale.getDefault()));
                }
                f1 = context;
                if (context == null)
                {
                    f1 = "";
                }
                hashmap1.put("nol_appdma", f1);
                hashmap1.put("dma", f1);
                f1 = (String)hashmap1.get("ccode".toLowerCase(Locale.getDefault()));
                context = f1;
                if (f1 == null)
                {
                    context = (String)hashmap1.get("nol_appcountrycode".toLowerCase(Locale.getDefault()));
                }
                f1 = context;
                if (context == null)
                {
                    f1 = "1";
                }
                hashmap1.put("nol_appcountrycode", f1);
                hashmap1.put("ccode", f1);
                context = "";
                for (iterator = jsonobject.keys(); iterator.hasNext();)
                {
                    s2 = (String)iterator.next();
                    obj = jsonobject.get(s2);
                    f1 = context;
                    if (s2.compareToIgnoreCase("nol_url_override") != 0)
                    {
                        f1 = context;
                        if (s2.compareToIgnoreCase("nol_appparams") != 0)
                        {
                            f1 = context;
                            if (s2.compareToIgnoreCase("nol_nslApiDbg") != 0)
                            {
                                f1 = context;
                                if (s2.compareToIgnoreCase("nol_devDebug") != 0)
                                {
                                    f1 = context;
                                    if (s2.compareToIgnoreCase("devtypid") != 0)
                                    {
                                        f1 = context;
                                        if (s2.compareToIgnoreCase("appversion") != 0)
                                        {
                                            f1 = context;
                                            if (s2.compareToIgnoreCase("longitude") != 0)
                                            {
                                                f1 = context;
                                                if (s2.compareToIgnoreCase("latitude") != 0)
                                                {
                                                    f1 = context;
                                                    if (s2.compareToIgnoreCase("appname") != 0)
                                                    {
                                                        f1 = context;
                                                        if (s2.compareToIgnoreCase("appid") != 0)
                                                        {
                                                            f1 = context;
                                                            if (s2.compareToIgnoreCase("apid") != 0)
                                                            {
                                                                f1 = context;
                                                                if (s2.compareToIgnoreCase("apv") != 0)
                                                                {
                                                                    f1 = context;
                                                                    if (s2.compareToIgnoreCase("apn") != 0)
                                                                    {
                                                                        f1 = context;
                                                                        if (s2.compareToIgnoreCase("osver") != 0)
                                                                        {
                                                                            f1 = context;
                                                                            if (s2.compareToIgnoreCase("devid") != 0)
                                                                            {
                                                                                f1 = context;
                                                                                if (s2.compareToIgnoreCase("sdkv") != 0)
                                                                                {
                                                                                    f1 = context;
                                                                                    if (s2.compareToIgnoreCase("nuid") != 0)
                                                                                    {
                                                                                        f1 = context;
                                                                                        if (s2.compareToIgnoreCase("fmt") != 0)
                                                                                        {
                                                                                            f1 = context;
                                                                                            if (s2.compareToIgnoreCase("adf") != 0)
                                                                                            {
                                                                                                f1 = context;
                                                                                                if (s2.compareToIgnoreCase("uoo") != 0)
                                                                                                {
                                                                                                    f1 = (new StringBuilder()).append(context).append(String.format("&%s=%s", new Object[] {
                                                                                                        s2.toString(), gA.k(obj.toString())
                                                                                                    })).toString();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    hashmap1.put(s2.toString(), obj.toString());
                    context = f1;
                }

                hashmap1.put("nol_appparams", context);
                jsonobject = (String)hashmap1.get("longitude".toLowerCase(Locale.getDefault()));
                context = jsonobject;
                if (jsonobject == null)
                {
                    context = (String)hashmap1.get("nol_longitude".toLowerCase(Locale.getDefault()));
                }
                jsonobject = context;
                if (context == null)
                {
                    jsonobject = "";
                }
                hashmap1.put("nol_longitude", jsonobject);
                hashmap1.put("longitude", jsonobject);
                jsonobject = (String)hashmap1.get("latitude".toLowerCase(Locale.getDefault()));
                context = jsonobject;
                if (jsonobject == null)
                {
                    context = (String)hashmap1.get("nol_latitude".toLowerCase(Locale.getDefault()));
                }
                jsonobject = context;
                if (context == null)
                {
                    jsonobject = "";
                }
                hashmap1.put("nol_latitude", jsonobject);
                hashmap1.put("latitude", jsonobject);
                hashmap1.put("nol_appdisable", "");
                hashmap1.put("nol_useroptout", "");
                hashmap1.put("nol_contentType", "radio,content");
                hashmap1.put("baseServerTime", "0");
                hashmap1.put("baseDeviceTime", "0");
                hashmap1.put("nol_drm", "3");
                hashmap1.put("nol_panelFlag", "false");
                hashmap1.put("nol_id3Delimiter", "%7C");
                hashmap1.put("nol_cidNull", "X100zdCIGeIlgZnkYj6UvQ==");
                hashmap1.put("nol_backgroundMode", Boolean.toString(false));
                hashmap1.put("nol_devtypeid", gA.o());
                hashmap1.put("nol_nuid", gA.getNuid());
                hashmap1.put("nol_osversion", com.nielsen.app.sdk.h.m());
                hashmap1.put("nol_osver", com.nielsen.app.sdk.h.m());
                hashmap1.put("osver", com.nielsen.app.sdk.h.m());
                hashmap1.put("nol_sdkversion", com.nielsen.app.sdk.h.p());
                hashmap1.put("nol_sdkv", com.nielsen.app.sdk.h.p());
                hashmap1.put("sdkv", com.nielsen.app.sdk.h.p());
                hashmap1.put("nol_sdkver", com.nielsen.app.sdk.h.q());
                com.nielsen.app.sdk.c.a('I', "Default global data parameters length(%d)", new Object[] {
                    Integer.valueOf(hashmap1.size())
                });
            }
            hashmap1.put("nol_errorURL", "http://secure-|!nol_sfcode!|.imrworldwide.com/cgi-bin/error?message=|!(nol_error_message)!|,c13_|![nol_appid]!|,c16_|![nol_sdkv]!|,c8_|![nol_devGroup]!|,c7_|![nol_osGroup]!|,c10_|![nol_platform]!|,c17_|![nol_stationId]!|,c18_|![nol_assetid]!|,c6_|![nol_product]!|,ci_|![nol_clientid]!|");
            hashmap1.put("nol_tsvFlag", "99");
            hashmap1.put("baseServerTime", "0");
            hashmap1.put("baseDeviceTime", "0");
            gy.b("nol_errorURL", "http://secure-|!nol_sfcode!|.imrworldwide.com/cgi-bin/error?message=|!(nol_error_message)!|,c13_|![nol_appid]!|,c16_|![nol_sdkv]!|,c8_|![nol_devGroup]!|,c7_|![nol_osGroup]!|,c10_|![nol_platform]!|,c17_|![nol_stationId]!|,c18_|![nol_assetid]!|,c6_|![nol_product]!|,ci_|![nol_clientid]!|");
            com.nielsen.app.sdk.c.a('I', "Full data global set -- Length(%d)", new Object[] {
                Integer.valueOf(hashmap1.size())
            });
            gJ = new a(hashmap, hashmap1);
            gJ.a(0, "RAW ID3 default controller", "id3", "interval", "", null);
            gE = true;
            gF = false;
            l1 = gz.a();
            gJ.a(l1);
            gJ.a(null);
            jsonobject = gy.b("nol_userAgent", "");
            if (jsonobject != null)
            {
                context = jsonobject;
                if (!jsonobject.isEmpty())
                {
                    break label0;
                }
            }
            f1 = new boolean[1];
            f1[0] = 0;
            jsonobject = gJ.a("NLSDK (|!nol_osver!|,|!nol_devtypeid!| BUILD/|!nol_sdkver!|) |!nol_appid!|/|!nol_appver!|", f1);
            context = jsonobject;
            if (f1[0] != 0)
            {
                context = jsonobject;
                if (jsonobject != null)
                {
                    context = jsonobject;
                    if (!jsonobject.isEmpty())
                    {
                        gy.a("nol_userAgent", jsonobject);
                        context = jsonobject;
                    }
                }
            }
        }
        gB = context;
        gz.b(l1);
        gJ.a();
        gu = com.nielsen.app.sdk.a.p();
    }

    static b a(AppConfig appconfig, b b1)
    {
        appconfig.gt = b1;
        return b1;
    }

    public static AppConfig a(Context context, JSONObject jsonobject, f f1)
    {
        com/nielsen/app/sdk/AppConfig;
        JVM INSTR monitorenter ;
        if (gG == null)
        {
            context = new AppConfig(context, jsonobject, f1);
            gG = context;
            context.start();
        }
        context = gG;
        com/nielsen/app/sdk/AppConfig;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    static AppRequestManager a(AppConfig appconfig)
    {
        return appconfig.gx;
    }

    static String a(AppConfig appconfig, String s1)
    {
        appconfig.gw = s1;
        return s1;
    }

    static boolean a(AppConfig appconfig, boolean flag)
    {
        appconfig.gF = flag;
        return flag;
    }

    static AppNative b(AppConfig appconfig)
    {
        return appconfig.gz;
    }

    static h c(AppConfig appconfig)
    {
        return appconfig.gA;
    }

    static boolean d(AppConfig appconfig)
    {
        return appconfig.gC;
    }

    static boolean e(AppConfig appconfig)
    {
        return appconfig.gD;
    }

    static int f(AppConfig appconfig)
    {
        return appconfig.gv;
    }

    static AppScheduler g(AppConfig appconfig)
    {
        return appconfig.gu;
    }

    static int h(AppConfig appconfig)
    {
        int i1 = appconfig.gv;
        appconfig.gv = i1 + 1;
        return i1;
    }

    static String i(AppConfig appconfig)
    {
        return appconfig.gw;
    }

    static b j(AppConfig appconfig)
    {
        return appconfig.gt;
    }

    static a k(AppConfig appconfig)
    {
        return appconfig.gJ;
    }

    public long a(int i1, String s1, long l1)
    {
        return Long.parseLong(a(i1, s1, String.valueOf(l1)));
    }

    public long a(long l1, char ac1[])
    {
label0:
        {
            long l4 = 0L;
            long l3;
            if (l1 > 0L)
            {
                l3 = l1;
            } else
            {
                l3 = com.nielsen.app.sdk.h.g();
            }
            if (h() && gH)
            {
                l1 = a("baseServerTime", 0L);
                long l2;
                if (l1 != 0L)
                {
                    l2 = a("baseDeviceTime", 0L);
                    if (l2 == 0L)
                    {
                        l1 = l4;
                    }
                } else
                {
                    l2 = 0L;
                }
                gI = l2 - l1;
                gH = false;
            }
            l1 = l3 - gI;
            if (ac1 != null)
            {
                if (!gH)
                {
                    break label0;
                }
                ac1[0] = 'D';
            }
            return l1;
        }
        ac1[0] = 'S';
        return l1;
    }

    public long a(String s1, long l1)
    {
        s1 = b(s1);
        if (s1 != null)
        {
            l1 = Long.parseLong(s1);
        }
        return l1;
    }

    public String a()
    {
        return gB;
    }

    public String a(int i1, String s1, String s2)
    {
        Map map = a(i1);
        String s3 = s2;
        if (map != null)
        {
            Iterator iterator = map.keySet().iterator();
label0:
            do
            {
                do
                {
                    s3 = s2;
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    s3 = (String)iterator.next();
                } while (s3.compareToIgnoreCase(s1) != 0);
                s3 = (String)map.get(s3);
            } while (s3 == null);
        }
        return s3;
    }

    public String a(String s1, String s2)
    {
        s1 = b(s1);
        if (s1 == null)
        {
            return s2;
        } else
        {
            return s1;
        }
    }

    public Map a(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        Map map;
        if (gJ == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        map = gJ.a(i1);
        this;
        JVM INSTR monitorexit ;
        return map;
        throw new Exception("There is no set of parameters yet");
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(f f1)
    {
        gK = f1;
    }

    public void a(String s1, int i1)
    {
        b(s1, String.valueOf(i1));
    }

    public void a(boolean flag)
    {
        if (gA == null)
        {
            throw new Exception("disableApi() failed. mUtils is not initialized");
        }
        if (gA.a() != flag)
        {
            gD = flag;
            gA.b(true);
            gA.a(flag);
            String s1;
            if (gD)
            {
                s1 = "true";
            } else
            {
                s1 = "false";
            }
            gJ.a("nol_appdisable", s1);
            if (flag || !flag && !gC)
            {
                if (flag)
                {
                    com.nielsen.app.sdk.c.a('I', "App SDK disabled by APP DISABLE -- Goodbye!", new Object[0]);
                } else
                {
                    com.nielsen.app.sdk.c.a('I', "App SDK enabled by APP ENABLE -- Sending Hello ping", new Object[0]);
                }
                d();
                if (gu.c("AppTaskConfig") != null)
                {
                    gu.b("AppTaskConfig");
                }
                gt = new b(gu, 5000L);
                if (gt == null)
                {
                    throw new Exception("Could not instantiate config retry task. No config request will happen");
                } else
                {
                    gu.a("AppTaskConfig");
                    return;
                }
            }
        }
    }

    public boolean a(int i1, String s1, boolean flag)
    {
        return a(a(i1, s1, String.valueOf(flag)));
    }

    public boolean a(String s1)
    {
        return s1 != null && !s1.isEmpty() && (s1.compareToIgnoreCase("true") == 0 || s1.compareToIgnoreCase("yes") == 0 || s1.compareToIgnoreCase("1") == 0);
    }

    public boolean a(String s1, boolean flag)
    {
        s1 = b(s1);
        if (s1 != null)
        {
            flag = a(s1);
        }
        return flag;
    }

    public String b(String s1)
    {
        if (gJ != null)
        {
            return gJ.a(s1);
        } else
        {
            throw new Exception("There is no set of parameters yet");
        }
    }

    public Map b()
    {
        if (gJ == null)
        {
            throw new Exception("No global parameters data recevied yet");
        } else
        {
            return gJ.d();
        }
    }

    public void b(int i1, String s1, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        Map map = a(i1);
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        map.put(s1, s2);
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public void b(String s1, long l1)
    {
        b(s1, String.valueOf(l1));
    }

    public void b(String s1, String s2)
    {
        if (gJ != null)
        {
            gJ.a(s1, s2);
            return;
        } else
        {
            throw new Exception("There is no set of parameters yet");
        }
    }

    public void b(String s1, boolean flag)
    {
        b(s1, String.valueOf(flag));
    }

    public a c()
    {
        return gJ;
    }

    boolean c(String s1)
    {
        if (!s1.isEmpty()) goto _L2; else goto _L1
_L1:
        boolean flag1;
        com.nielsen.app.sdk.c.a(3, 'E', "Config file is empty", new Object[0]);
        flag1 = false;
_L134:
        return flag1;
_L2:
        gF = false;
        Object obj1 = new HashMap();
        Object obj3 = new HashMap();
        Object obj6 = new HashMap();
        Object obj7 = new HashMap();
        Object obj8 = new HashMap();
        Object obj9 = new ArrayList();
        Object obj10 = new ArrayList();
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        Object obj12;
        Object obj13;
        obj12 = new JSONObject(s1);
        obj13 = ((JSONObject) (obj12)).getJSONObject("nol_GLOBALS");
        if (obj13 != null)
        {
            break MISSING_BLOCK_LABEL_287;
        }
        com.nielsen.app.sdk.c.a(3, 'E', "No data under key = %s", new Object[] {
            "nol_GLOBALS"
        });
        Object obj;
        Object obj2;
        Object obj4;
        Object obj5;
        Object obj11;
        Object obj14;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        if (obj9 != null)
        {
            ((List) (obj9)).clear();
        }
        if (obj6 != null)
        {
            ((Map) (obj6)).clear();
        }
        if (obj7 != null)
        {
            ((Map) (obj7)).clear();
        }
        if (obj10 != null)
        {
            ((List) (obj10)).clear();
        }
        if (arraylist != null)
        {
            arraylist.clear();
        }
        if (obj3 != null)
        {
            ((Map) (obj3)).clear();
        }
        if (obj1 != null)
        {
            ((Map) (obj1)).clear();
        }
        if (arraylist1 != null)
        {
            arraylist1.clear();
        }
        if (obj8 != null)
        {
            ((Map) (obj8)).clear();
        }
        Object obj15;
        Object obj16;
        Object obj17;
        Iterator iterator;
        boolean flag;
        long l2;
        long l3;
        try
        {
            gJ.f();
            gJ.a(0, "RAW ID3 default controller", "id3", "interval", "", null);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.nielsen.app.sdk.c.a(s1, true, 'I', "URL parser interrupted. General exception", new Object[0]);
        }
        return false;
        i1 = 0;
        k1 = 0;
        j1 = 0;
        obj14 = ((JSONObject) (obj13)).keys();
_L27:
        if (!((Iterator) (obj14)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj15 = (String)((Iterator) (obj14)).next();
        obj = ((JSONObject) (obj13)).get(((String) (obj15)));
        if (!(obj instanceof JSONObject)) goto _L4; else goto _L3
_L3:
        obj5 = (JSONObject)obj;
        obj11 = ((JSONObject) (obj5)).keys();
        l1 = j1;
        if (((String) (obj15)).compareToIgnoreCase("nol_eventFilter") == 0) goto _L6; else goto _L5
_L5:
        if (((String) (obj15)).compareToIgnoreCase("nol_serviceFilter") != 0) goto _L8; else goto _L7
_L7:
        l1 = j1;
_L6:
        j2 = l1;
        i2 = k1;
        if (!((Iterator) (obj11)).hasNext()) goto _L10; else goto _L9
_L9:
        obj2 = (String)((Iterator) (obj11)).next();
        obj4 = ((JSONObject) (obj5)).get(((String) (obj2)));
        if (!(obj4 instanceof JSONArray)) goto _L12; else goto _L11
_L11:
        if (((Map) (obj3)).containsKey(obj2)) goto _L14; else goto _L13
_L13:
        obj = new ArrayList();
        ((Map) (obj3)).put(obj2, obj);
_L21:
        obj4 = (JSONArray)obj4;
        j1 = 0;
_L22:
        if (j1 >= ((JSONArray) (obj4)).length()) goto _L12; else goto _L15
_L15:
        obj15 = ((JSONArray) (obj4)).getJSONObject(j1);
        if (obj == null) goto _L17; else goto _L16
_L16:
        obj15 = new AppRule(((JSONObject) (obj15)));
        if (((AppRule) (obj15)).isValid()) goto _L19; else goto _L18
_L18:
        ((AppRule) (obj15)).close();
        j1 = 1;
          goto _L20
_L14:
        obj = (List)((Map) (obj3)).get(obj2);
          goto _L21
_L19:
        ((List) (obj)).add(obj15);
        j1++;
          goto _L22
_L17:
        com.nielsen.app.sdk.c.a(3, 'I', "Unexpected JSON object filter(%s) under filter(%s)", new Object[] {
            obj2, "nol_eventFilter"
        });
        j1 = l1;
          goto _L20
_L8:
        if (((String) (obj15)).compareToIgnoreCase("nol_id3Map") != 0 && ((String) (obj15)).compareToIgnoreCase("nol_tsvBreakoutMap") != 0) goto _L24; else goto _L23
_L23:
        obj = new HashMap();
        if (!((Map) (obj1)).containsKey(obj15))
        {
            ((Map) (obj1)).put(obj15, obj);
        }
        for (; ((Iterator) (obj11)).hasNext(); ((Map) (obj)).put(obj2, ((JSONObject) (obj5)).getString(((String) (obj2)))))
        {
            obj2 = (String)((Iterator) (obj11)).next();
        }

          goto _L25
        obj12;
        obj = obj8;
        obj11 = obj7;
        obj2 = obj6;
        obj4 = arraylist;
        obj5 = obj10;
        obj6 = obj9;
        obj8 = obj1;
        obj7 = obj3;
        obj3 = arraylist1;
        obj1 = obj11;
        obj9 = obj12;
_L140:
        com.nielsen.app.sdk.c.a(((Throwable) (obj9)), true, 3, 'E', "Config received, failed parsing. Length = %d", new Object[] {
            Integer.valueOf(s1.length())
        });
        if (obj6 != null)
        {
            ((List) (obj6)).clear();
        }
        if (obj2 != null)
        {
            ((Map) (obj2)).clear();
        }
        if (obj1 != null)
        {
            ((Map) (obj1)).clear();
        }
        if (obj5 != null)
        {
            ((List) (obj5)).clear();
        }
        if (obj4 != null)
        {
            ((List) (obj4)).clear();
        }
        if (obj7 != null)
        {
            ((Map) (obj7)).clear();
        }
        if (obj8 != null)
        {
            ((Map) (obj8)).clear();
        }
        if (obj3 != null)
        {
            ((List) (obj3)).clear();
        }
        if (obj != null)
        {
            ((Map) (obj)).clear();
        }
        try
        {
            gJ.f();
            gJ.a(0, "RAW ID3 default controller", "id3", "interval", "", null);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.nielsen.app.sdk.c.a(s1, true, 'I', "URL parser interrupted. General exception", new Object[0]);
        }
        return false;
_L25:
        if (j1 == 0) goto _L27; else goto _L26
_L26:
        if (k1 != 0) goto _L29; else goto _L28
_L28:
        com.nielsen.app.sdk.c.a(3, 'E', "No processor map defined on key = %s", new Object[] {
            "nol_tagMap"
        });
        if (obj9 != null)
        {
            ((List) (obj9)).clear();
        }
        if (obj6 != null)
        {
            ((Map) (obj6)).clear();
        }
        if (obj7 != null)
        {
            ((Map) (obj7)).clear();
        }
        if (obj10 != null)
        {
            ((List) (obj10)).clear();
        }
        if (arraylist != null)
        {
            arraylist.clear();
        }
        if (obj3 != null)
        {
            ((Map) (obj3)).clear();
        }
        if (obj1 != null)
        {
            ((Map) (obj1)).clear();
        }
        if (arraylist1 != null)
        {
            arraylist1.clear();
        }
        if (obj8 != null)
        {
            ((Map) (obj8)).clear();
        }
        try
        {
            gJ.f();
            gJ.a(0, "RAW ID3 default controller", "id3", "interval", "", null);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.nielsen.app.sdk.c.a(s1, true, 'I', "URL parser interrupted. General exception", new Object[0]);
        }
        return false;
_L24:
        if (((String) (obj15)).compareToIgnoreCase("nol_clientCMSmap") != 0) goto _L31; else goto _L30
_L30:
        if (!((Iterator) (obj11)).hasNext()) goto _L33; else goto _L32
_L32:
        obj = (String)((Iterator) (obj11)).next();
        ((Map) (obj8)).put(obj, ((JSONObject) (obj5)).getString(((String) (obj))));
        i1 = 1;
          goto _L30
_L31:
        if (((String) (obj15)).compareToIgnoreCase("nol_tagMap") != 0) goto _L35; else goto _L34
_L34:
        flag = true;
        l1 = 1;
_L38:
        j2 = j1;
        i2 = ((flag) ? 1 : 0);
        if (!((Iterator) (obj11)).hasNext()) goto _L10; else goto _L36
_L36:
        obj = (String)((Iterator) (obj11)).next();
        obj2 = ((JSONObject) (obj5)).get(((String) (obj)));
        if (!(obj2 instanceof JSONArray))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj2 = (JSONArray)obj2;
        k1 = 0;
_L147:
        if (k1 >= ((JSONArray) (obj2)).length()) goto _L38; else goto _L37
_L37:
        obj4 = ((JSONArray) (obj2)).getString(k1);
        if (((String) (obj)).compareToIgnoreCase("nol_product") != 0) goto _L40; else goto _L39
_L39:
        ((List) (obj10)).add(obj4);
          goto _L41
_L40:
        if (((String) (obj)).compareToIgnoreCase("nol_cadence") != 0) goto _L43; else goto _L42
_L42:
        arraylist.add(obj4);
          goto _L41
        s1;
        obj5 = obj9;
        obj4 = obj10;
        obj2 = arraylist;
        obj = arraylist1;
_L139:
        if (obj5 != null)
        {
            ((List) (obj5)).clear();
        }
        if (obj6 != null)
        {
            ((Map) (obj6)).clear();
        }
        if (obj7 != null)
        {
            ((Map) (obj7)).clear();
        }
        if (obj4 != null)
        {
            ((List) (obj4)).clear();
        }
        if (obj2 != null)
        {
            ((List) (obj2)).clear();
        }
        if (obj3 != null)
        {
            ((Map) (obj3)).clear();
        }
        if (obj1 != null)
        {
            ((Map) (obj1)).clear();
        }
        if (obj != null)
        {
            ((List) (obj)).clear();
        }
        if (obj8 != null)
        {
            ((Map) (obj8)).clear();
        }
        try
        {
            gJ.f();
            gJ.a(0, "RAW ID3 default controller", "id3", "interval", "", null);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.nielsen.app.sdk.c.a(((Throwable) (obj)), true, 'I', "URL parser interrupted. General exception", new Object[0]);
        }
        throw s1;
_L43:
        if (((String) (obj)).compareToIgnoreCase("nol_url") != 0) goto _L45; else goto _L44
_L44:
        arraylist1.add(obj4);
          goto _L41
_L45:
        com.nielsen.app.sdk.c.a(3, 'E', "Unexpected JSON array(%s) under object(%s)", new Object[] {
            obj, "nol_tagMap"
        });
        j1 = 1;
          goto _L38
        if (!(obj2 instanceof JSONObject)) goto _L38; else goto _L46
_L46:
        if (((String) (obj)).compareToIgnoreCase("nol_defaults") != 0)
        {
            break MISSING_BLOCK_LABEL_1604;
        }
        obj15 = (JSONObject)obj2;
        obj16 = ((JSONObject) (obj15)).keys();
_L50:
        if (!((Iterator) (obj16)).hasNext()) goto _L38; else goto _L47
_L47:
        obj17 = (String)((Iterator) (obj16)).next();
        obj2 = (String)((JSONObject) (obj15)).get(((String) (obj17)));
        if (((String) (obj17)).compareToIgnoreCase("nol_maxLength") != 0) goto _L49; else goto _L48
_L48:
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_1526;
        }
        if (!((String) (obj2)).isEmpty())
        {
            gy.a(((String) (obj17)), ((String) (obj2)));
        }
_L52:
        ((Map) (obj6)).put(obj17, obj2);
          goto _L50
_L49:
        if (((String) (obj17)).compareToIgnoreCase("nol_tsvFlag") != 0) goto _L52; else goto _L51
_L51:
        obj4 = "99";
        obj = obj4;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_1578;
        }
        obj = obj4;
        if (!((String) (obj2)).isEmpty())
        {
            obj = obj2;
        }
        gy.a(((String) (obj17)), ((String) (obj)));
        ((Map) (obj6)).put("nol_tsvFlagDefault", obj);
          goto _L52
        com.nielsen.app.sdk.c.a(3, 'E', "Unexpected JSON object(%s) under object(%s)", new Object[] {
            obj, "nol_tagMap"
        });
        j1 = 1;
        k1 = l1;
          goto _L25
_L35:
        com.nielsen.app.sdk.c.a(3, 'E', "Unexpected JSON object(%s) under object(%s)", new Object[] {
            obj15, "nol_GLOBALS"
        });
        j1 = 1;
          goto _L26
_L4:
        if (!(obj instanceof JSONArray)) goto _L54; else goto _L53
_L53:
        obj2 = (JSONArray)obj;
        l1 = 0;
_L148:
        if (l1 >= ((JSONArray) (obj2)).length()) goto _L25; else goto _L55
_L55:
        obj = ((JSONArray) (obj2)).get(l1);
        if (((String) (obj15)).compareToIgnoreCase("nol_customExtension") != 0) goto _L57; else goto _L56
_L56:
        ((List) (obj9)).add((String)obj);
          goto _L58
_L57:
        if (((String) (obj15)).compareToIgnoreCase("nol_tagFilter") != 0) goto _L60; else goto _L59
_L59:
        obj4 = (JSONObject)obj;
        if (((Map) (obj3)).containsKey(obj15))
        {
            break MISSING_BLOCK_LABEL_1799;
        }
        obj = new ArrayList();
        ((Map) (obj3)).put(obj15, obj);
_L61:
        obj4 = new AppRule(((JSONObject) (obj4)));
        if (((AppRule) (obj4)).isValid())
        {
            break MISSING_BLOCK_LABEL_1815;
        }
        j1 = 1;
          goto _L25
        obj = (List)((Map) (obj3)).get(obj15);
          goto _L61
        ((List) (obj)).add(obj4);
          goto _L58
_L60:
        com.nielsen.app.sdk.c.a(3, 'E', "Unexpected JSON array(%s) under filter(%s)", new Object[] {
            obj15, "nol_GLOBALS"
        });
        j1 = 1;
          goto _L25
_L54:
        obj2 = (String)obj;
        if (((String) (obj15)).compareToIgnoreCase("nol_nslApiDbg") != 0) goto _L63; else goto _L62
_L62:
        flag1 = a(((String) (obj2)));
        com.nielsen.app.sdk.c.a(flag1);
        if (!flag1) goto _L65; else goto _L64
_L64:
        com.nielsen.app.sdk.c.a('I');
_L66:
        com.nielsen.app.sdk.c.a('I', "%s = %s", new Object[] {
            "nol_nslApiDbg", ((String) (obj2)).toString()
        });
        obj = obj2;
_L71:
        ((Map) (obj7)).put(obj15, obj);
          goto _L25
_L65:
        com.nielsen.app.sdk.c.a('W');
          goto _L66
_L63:
        if (((String) (obj15)).compareToIgnoreCase("nol_id3Delimiter") != 0) goto _L68; else goto _L67
_L67:
        if (obj2 == null) goto _L70; else goto _L69
_L69:
        obj = obj2;
        if (!((String) (obj2)).isEmpty()) goto _L71; else goto _L70
_L68:
        if (((String) (obj15)).compareToIgnoreCase("nol_errorURL") != 0)
        {
            break MISSING_BLOCK_LABEL_2034;
        }
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_2001;
        }
        if (!((String) (obj2)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_2016;
        }
        obj = gy.b("nol_errorURL", "http://secure-|!nol_sfcode!|.imrworldwide.com/cgi-bin/error?message=|!(nol_error_message)!|,c13_|![nol_appid]!|,c16_|![nol_sdkv]!|,c8_|![nol_devGroup]!|,c7_|![nol_osGroup]!|,c10_|![nol_platform]!|,c17_|![nol_stationId]!|,c18_|![nol_assetid]!|,c6_|![nol_product]!|,ci_|![nol_clientid]!|");
          goto _L71
        gy.a("nol_errorURL", ((String) (obj2)));
        obj = obj2;
          goto _L71
        if (((String) (obj15)).compareToIgnoreCase("nol_errlogInterval") != 0) goto _L73; else goto _L72
_L72:
        if (obj2 == null) goto _L75; else goto _L74
_L74:
        obj4 = obj2;
        if (!((String) (obj2)).isEmpty()) goto _L76; else goto _L75
_L76:
        l2 = Long.valueOf(((String) (obj4))).longValue();
        obj = obj4;
        if (l2 <= 0L) goto _L71; else goto _L77
_L77:
        gy.a("nol_errlogInterval", l2);
        obj = obj4;
          goto _L71
_L73:
        if (((String) (obj15)).compareToIgnoreCase("nol_serverTime") != 0) goto _L79; else goto _L78
_L78:
        if (obj2 == null) goto _L81; else goto _L80
_L80:
        if (((String) (obj2)).isEmpty()) goto _L81; else goto _L82
_L82:
        obj = ((String) (obj2)).replace(",", "");
        obj2 = obj;
        obj = ((String) (obj)).trim();
        obj2 = obj;
        l2 = com.nielsen.app.sdk.h.g();
        obj2 = obj;
        l3 = Long.parseLong(((String) (obj)));
        if (l3 <= 0L) goto _L84; else goto _L83
_L83:
        obj2 = obj;
        obj11 = Long.toString(l3);
        obj2 = obj;
        obj5 = Long.toString(l2);
        obj4 = obj;
        obj2 = obj11;
        obj = obj5;
_L143:
        obj5 = obj2;
        obj2 = obj;
        obj = obj4;
_L149:
        ((Map) (obj7)).put("baseServerTime", obj5);
        ((Map) (obj7)).put("baseDeviceTime", obj2);
        com.nielsen.app.sdk.c.a('I', "Base times used: ServerTime(%s) DeviceTime(%s)", new Object[] {
            obj5, obj2
        });
          goto _L71
_L79:
        if (((String) (obj15)).compareToIgnoreCase("nol_useroptUrl") != 0) goto _L86; else goto _L85
_L85:
        if (obj2 == null) goto _L88; else goto _L87
_L87:
        if (((String) (obj2)).isEmpty()) goto _L88; else goto _L89
_L89:
        obj = obj2;
        if (((String) (obj2)).contains("?")) goto _L71; else goto _L90
_L90:
        obj = String.format("%s?n=|!%s!|", new Object[] {
            obj2, "nol_nuid"
        });
          goto _L71
_L86:
        obj = obj2;
        if (((String) (obj15)).compareToIgnoreCase("nol_gpsPrecision") != 0) goto _L71; else goto _L91
_L91:
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_2352;
        }
        obj = obj2;
        if (!((String) (obj2)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_2359;
        }
        obj = Long.toString(1000L);
        gy.a(((String) (obj15)), ((String) (obj)));
          goto _L71
_L29:
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_2396;
        }
        com.nielsen.app.sdk.c.a('I', "There was no CMS map on config to merge with. Key = %s", new Object[] {
            "nol_clientCMSmap"
        });
        obj = (String)((Map) (obj7)).get("nol_stationIdDefault");
        if (obj == null) goto _L93; else goto _L92
_L92:
        if (!((String) (obj)).isEmpty()) goto _L94; else goto _L93
_L93:
        obj = (String)((Map) (obj7)).get("nol_stationId");
        if (obj == null) goto _L96; else goto _L95
_L95:
        if (!((String) (obj)).isEmpty()) goto _L97; else goto _L96
_L96:
        ((Map) (obj7)).put("nol_stationIdDefault", "");
_L94:
        obj = (String)((Map) (obj7)).get("nol_contentType");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_2484;
        }
        if (!((String) (obj)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_2497;
        }
        ((Map) (obj7)).put("nol_contentType", "radio,content");
        obj = (String)((Map) (obj7)).get("nol_errorURL");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_2521;
        }
        if (!((String) (obj)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_2721;
        }
        ((Map) (obj7)).put("nol_errorURL", gy.b("nol_errorURL", "http://secure-|!nol_sfcode!|.imrworldwide.com/cgi-bin/error?message=|!(nol_error_message)!|,c13_|![nol_appid]!|,c16_|![nol_sdkv]!|,c8_|![nol_devGroup]!|,c7_|![nol_osGroup]!|,c10_|![nol_platform]!|,c17_|![nol_stationId]!|,c18_|![nol_assetid]!|,c6_|![nol_product]!|,ci_|![nol_clientid]!|"));
_L98:
        obj15 = ((JSONObject) (obj12)).getJSONArray("nol_TAGS");
        if (obj15 != null)
        {
            break MISSING_BLOCK_LABEL_2735;
        }
        com.nielsen.app.sdk.c.a(3, 'E', "No data processors defined on key = %s", new Object[] {
            "nol_TAGS"
        });
        if (obj9 != null)
        {
            ((List) (obj9)).clear();
        }
        if (obj6 != null)
        {
            ((Map) (obj6)).clear();
        }
        if (obj7 != null)
        {
            ((Map) (obj7)).clear();
        }
        if (obj10 != null)
        {
            ((List) (obj10)).clear();
        }
        if (arraylist != null)
        {
            arraylist.clear();
        }
        if (obj3 != null)
        {
            ((Map) (obj3)).clear();
        }
        if (obj1 != null)
        {
            ((Map) (obj1)).clear();
        }
        if (arraylist1 != null)
        {
            arraylist1.clear();
        }
        if (obj8 != null)
        {
            ((Map) (obj8)).clear();
        }
        try
        {
            gJ.f();
            gJ.a(0, "RAW ID3 default controller", "id3", "interval", "", null);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.nielsen.app.sdk.c.a(s1, true, 'I', "URL parser interrupted. General exception", new Object[0]);
        }
        return false;
_L97:
        ((Map) (obj7)).put("nol_stationIdDefault", obj);
          goto _L94
        gy.a("nol_errorURL", ((String) (obj)));
          goto _L98
        obj11 = "";
        obj14 = "";
        obj12 = "";
        obj13 = "";
        l1 = ((JSONArray) (obj15)).length();
        i1 = 0;
_L110:
        if (i1 >= l1) goto _L100; else goto _L99
_L99:
        obj17 = ((JSONArray) (obj15)).getJSONObject(i1);
        iterator = ((JSONObject) (obj17)).keys();
        obj16 = new HashMap(((Map) (obj6)));
        obj = obj14;
        obj4 = obj13;
        obj2 = obj11;
        obj5 = obj12;
_L151:
        if (!iterator.hasNext()) goto _L102; else goto _L101
_L101:
        obj11 = (String)iterator.next();
        obj12 = ((JSONObject) (obj17)).get(((String) (obj11)));
        if (!(obj12 instanceof JSONObject)) goto _L104; else goto _L103
_L103:
        if (((String) (obj11)).compareToIgnoreCase("nol_defaults") != 0) goto _L106; else goto _L105
_L105:
        obj12 = (JSONObject)obj12;
        obj13 = ((JSONObject) (obj12)).keys();
_L108:
        obj11 = obj2;
        if (!((Iterator) (obj13)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj11 = (String)((Iterator) (obj13)).next();
        ((Map) (obj16)).put(obj11, ((JSONObject) (obj12)).getString(((String) (obj11))));
        if (true) goto _L108; else goto _L107
_L106:
        com.nielsen.app.sdk.c.a(3, 'E', "Unexpected JSON object(%s) under array(%s)", new Object[] {
            obj11, "nol_TAGS"
        });
        k1 = 1;
        obj11 = obj2;
        obj12 = obj5;
        obj13 = obj4;
        obj14 = obj;
_L142:
        gJ.a(i1, ((String) (obj14)), ((String) (obj13)), ((String) (obj12)), ((String) (obj11)), ((Map) (obj16)));
        ((Map) (obj16)).clear();
        if (k1 != 0) goto _L100; else goto _L109
_L109:
        i1++;
        j1 = k1;
          goto _L110
_L104:
        if (((String) (obj11)).compareToIgnoreCase("nol_comment") != 0) goto _L112; else goto _L111
_L111:
        obj = (String)obj12;
        com.nielsen.app.sdk.c.a('I', "Loading processor(%s)", new Object[] {
            obj
        });
        obj11 = obj2;
        obj2 = obj4;
        obj4 = obj5;
        obj5 = obj11;
          goto _L113
_L112:
        k1 = ((String) (obj11)).compareToIgnoreCase("nol_product");
        if (k1 != 0) goto _L115; else goto _L114
_L114:
        obj11 = (String)((List) (obj10)).get(Integer.parseInt((String)obj12));
        obj4 = obj5;
        obj5 = obj2;
        obj2 = obj11;
          goto _L113
        obj4;
        obj11 = (String)obj12;
        obj4 = obj5;
        obj5 = obj2;
        obj2 = obj11;
          goto _L113
_L115:
        k1 = ((String) (obj11)).compareToIgnoreCase("nol_cadence");
        if (k1 != 0) goto _L117; else goto _L116
_L116:
        obj11 = (String)arraylist.get(Integer.parseInt((String)obj12));
        obj5 = obj2;
        obj2 = obj4;
        obj4 = obj11;
          goto _L113
        obj5;
        obj11 = (String)obj12;
        obj5 = obj2;
        obj2 = obj4;
        obj4 = obj11;
          goto _L113
_L117:
        k1 = ((String) (obj11)).compareToIgnoreCase("nol_url");
        if (k1 != 0) goto _L119; else goto _L118
_L118:
        obj2 = (String)arraylist1.get(Integer.parseInt((String)obj12));
_L129:
        obj11 = obj2;
        if (((List) (obj9)).isEmpty()) goto _L107; else goto _L120
_L120:
        k1 = 0;
_L152:
        if (k1 >= ((List) (obj9)).size()) goto _L122; else goto _L121
_L121:
        obj13 = (String)((List) (obj9)).get(k1);
        if (obj13 == null) goto _L124; else goto _L123
_L123:
        if (((String) (obj13)).isEmpty()) goto _L124; else goto _L125
_L125:
        obj12 = (String)((Map) (obj7)).get(obj13);
        if (obj12 == null) goto _L127; else goto _L126
_L126:
        obj11 = obj12;
        if (!((String) (obj12)).isEmpty()) goto _L128; else goto _L127
_L128:
        obj2 = ((String) (obj2)).replace(String.format("|![%s]!|", new Object[] {
            obj13
        }), ((CharSequence) (obj11)));
          goto _L124
        obj2;
        obj2 = (String)obj12;
          goto _L129
_L119:
        ((Map) (obj16)).put(obj11, (String)obj12);
        obj11 = obj2;
          goto _L107
_L100:
        gJ.a(((Map) (obj8)), ((Map) (obj7)));
        gJ.b(((Map) (obj1)));
        gJ.c(((Map) (obj3)));
        l2 = gz.a();
        gJ.a(l2);
        gJ.a(null);
        obj4 = new boolean[1];
        obj4[0] = 0;
        obj = gJ.a("nol_useroptUrl");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_3514;
        }
        if (((String) (obj)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_3514;
        }
        obj = gJ.a(((String) (obj)), ((boolean []) (obj4)));
        if (!obj4[0] || obj == null)
        {
            break MISSING_BLOCK_LABEL_3514;
        }
        if (!((String) (obj)).isEmpty())
        {
            gA.c(((String) (obj)));
        }
        obj = gJ.a("nol_userAgent");
        if (obj == null) goto _L131; else goto _L130
_L130:
        if (!((String) (obj)).isEmpty()) goto _L132; else goto _L131
_L131:
        obj2 = gy.b("nol_userAgent", "");
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_3566;
        }
        obj = obj2;
        if (!((String) (obj2)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_3624;
        }
        obj2 = gJ.a("NLSDK (|!nol_osver!|,|!nol_devtypeid!| BUILD/|!nol_sdkver!|) |!nol_appid!|/|!nol_appver!|", ((boolean []) (obj4)));
        obj = obj2;
        if (!obj4[0])
        {
            break MISSING_BLOCK_LABEL_3624;
        }
        obj = obj2;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_3624;
        }
        obj = obj2;
        if (((String) (obj2)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_3624;
        }
        gy.a("nol_userAgent", ((String) (obj2)));
        obj = obj2;
_L136:
        gB = ((String) (obj));
        gz.b(l2);
        gJ.a();
        flag1 = true;
        if (obj9 != null)
        {
            ((List) (obj9)).clear();
        }
        if (obj6 != null)
        {
            ((Map) (obj6)).clear();
        }
        if (obj7 != null)
        {
            ((Map) (obj7)).clear();
        }
        if (obj10 != null)
        {
            ((List) (obj10)).clear();
        }
        if (arraylist != null)
        {
            arraylist.clear();
        }
        if (obj3 != null)
        {
            ((Map) (obj3)).clear();
        }
        if (obj1 != null)
        {
            ((Map) (obj1)).clear();
        }
        if (arraylist1 != null)
        {
            arraylist1.clear();
        }
        if (obj8 == null) goto _L134; else goto _L133
_L133:
        ((Map) (obj8)).clear();
        return true;
_L132:
        obj2 = gJ.a(((String) (obj)), ((boolean []) (obj4)));
        obj = obj2;
        if (!obj4[0]) goto _L136; else goto _L135
_L135:
        obj = obj2;
        if (obj2 == null) goto _L136; else goto _L137
_L137:
        obj = obj2;
        if (((String) (obj2)).isEmpty()) goto _L136; else goto _L138
_L138:
        gy.a("nol_userAgent", ((String) (obj2)));
        obj = obj2;
          goto _L136
        s1;
        obj6 = null;
        obj = null;
        obj2 = null;
        obj4 = null;
        obj5 = null;
        obj3 = null;
        obj1 = null;
        obj8 = null;
        obj7 = null;
          goto _L139
        s1;
        obj7 = null;
        obj6 = null;
        obj = null;
        obj2 = null;
        obj4 = null;
        obj5 = null;
        obj3 = null;
        obj8 = null;
          goto _L139
        s1;
        obj8 = null;
        obj7 = null;
        obj6 = null;
        obj = null;
        obj2 = null;
        obj4 = null;
        obj5 = null;
          goto _L139
        s1;
        obj8 = null;
        obj7 = null;
        obj = null;
        obj2 = null;
        obj4 = null;
        obj5 = null;
          goto _L139
        s1;
        obj8 = null;
        obj = null;
        obj2 = null;
        obj4 = null;
        obj5 = null;
          goto _L139
        s1;
        obj = null;
        obj2 = null;
        obj4 = null;
        obj5 = null;
          goto _L139
        s1;
        obj = null;
        obj2 = null;
        obj4 = null;
        obj5 = obj9;
          goto _L139
        s1;
        obj = null;
        obj2 = null;
        obj4 = obj10;
        obj5 = obj9;
          goto _L139
        s1;
        obj = null;
        obj2 = arraylist;
        obj4 = obj10;
        obj5 = obj9;
          goto _L139
        s1;
        obj9 = obj7;
        obj10 = obj8;
        obj11 = obj6;
        obj8 = obj;
        obj7 = obj1;
        obj6 = obj2;
        obj = obj3;
        obj2 = obj4;
        obj4 = obj5;
        obj5 = obj11;
        obj3 = obj9;
        obj1 = obj10;
          goto _L139
        obj9;
        obj4 = null;
        obj5 = null;
        obj6 = null;
        obj7 = null;
        obj8 = null;
        obj1 = null;
        obj2 = null;
        obj3 = null;
        obj = null;
          goto _L140
        obj9;
        obj3 = null;
        obj4 = null;
        obj5 = null;
        obj6 = null;
        obj7 = null;
        obj8 = obj1;
        obj = null;
        obj1 = null;
        obj2 = null;
          goto _L140
        obj9;
        obj2 = null;
        obj10 = null;
        obj4 = null;
        obj5 = null;
        obj6 = null;
        obj7 = obj3;
        obj8 = obj1;
        obj1 = null;
        obj = null;
        obj3 = obj10;
          goto _L140
        obj9;
        obj2 = obj6;
        obj4 = null;
        obj5 = null;
        obj6 = null;
        obj7 = obj3;
        obj8 = obj1;
        obj1 = null;
        obj10 = null;
        obj = null;
        obj3 = obj4;
        obj4 = obj10;
          goto _L140
        obj9;
        obj2 = obj6;
        obj5 = null;
        obj6 = null;
        obj8 = obj3;
        obj10 = obj1;
        obj1 = obj7;
        obj = null;
        obj4 = null;
        obj3 = null;
        obj7 = obj8;
        obj8 = obj10;
          goto _L140
        obj9;
        obj5 = null;
        obj12 = null;
        obj10 = obj3;
        obj11 = obj1;
        obj = obj8;
        obj1 = obj7;
        obj2 = obj6;
        obj3 = null;
        obj4 = null;
        obj6 = obj12;
        obj7 = obj10;
        obj8 = obj11;
          goto _L140
        obj4;
        obj2 = obj7;
        obj5 = null;
        obj7 = obj9;
        obj10 = obj3;
        obj = obj8;
        obj3 = null;
        obj8 = obj1;
        obj11 = null;
        obj9 = obj4;
        obj1 = obj2;
        obj2 = obj6;
        obj4 = obj11;
        obj6 = obj7;
        obj7 = obj10;
          goto _L140
        obj4;
        obj = obj8;
        obj2 = obj7;
        obj5 = obj10;
        obj7 = obj9;
        obj11 = null;
        obj8 = obj3;
        obj10 = obj1;
        obj12 = null;
        obj9 = obj4;
        obj1 = obj2;
        obj2 = obj6;
        obj3 = obj11;
        obj4 = obj12;
        obj6 = obj7;
        obj7 = obj8;
        obj8 = obj10;
          goto _L140
        obj11;
        obj = obj8;
        obj2 = obj7;
        obj5 = obj10;
        obj10 = null;
        obj4 = obj6;
        obj7 = obj3;
        obj6 = obj9;
        obj8 = obj1;
        obj9 = obj11;
        obj1 = obj2;
        obj2 = obj4;
        obj3 = obj10;
        obj4 = arraylist;
          goto _L140
        obj;
          goto _L141
_L102:
        obj14 = obj;
        obj13 = obj4;
        obj12 = obj5;
        obj11 = obj2;
        k1 = j1;
          goto _L142
_L84:
        obj5 = "0";
        obj2 = "0";
        obj4 = obj;
        obj = obj5;
          goto _L143
_L81:
        obj5 = "0";
        obj4 = obj2;
        obj = "0";
        obj2 = obj5;
          goto _L143
_L33:
        l1 = i1;
        i1 = k1;
        k1 = l1;
          goto _L144
_L12:
        j1 = l1;
          goto _L20
_L146:
        l1 = i1;
        i1 = k1;
        k1 = l1;
          goto _L144
_L20:
        if (j1 != 0) goto _L146; else goto _L145
_L145:
        l1 = j1;
          goto _L6
_L41:
        k1++;
          goto _L147
_L10:
        j1 = j2;
        k1 = i1;
        i1 = i2;
_L144:
        l1 = i1;
        i1 = k1;
        k1 = l1;
          goto _L25
_L58:
        l1++;
          goto _L148
_L70:
        obj = "%7C";
          goto _L71
_L75:
        obj4 = "86400";
          goto _L76
        obj;
_L141:
        obj5 = "0";
        obj4 = "0";
        obj = obj2;
        obj2 = obj4;
          goto _L149
_L88:
        obj = "";
          goto _L71
_L113:
        obj14 = obj;
        obj13 = obj2;
        obj12 = obj4;
        obj11 = obj5;
        k1 = j1;
        if (j1 != 0) goto _L142; else goto _L150
_L150:
        obj11 = obj2;
        obj2 = obj5;
        obj5 = obj4;
        obj4 = obj11;
          goto _L151
_L127:
        obj11 = "";
          goto _L128
_L124:
        k1++;
          goto _L152
_L122:
        obj11 = obj2;
        obj2 = obj4;
        obj4 = obj5;
        obj5 = obj11;
          goto _L113
_L107:
        obj2 = obj4;
        obj4 = obj5;
        obj5 = obj11;
          goto _L113
    }

    public void close()
    {
        this;
        JVM INSTR monitorenter ;
        com.nielsen.app.sdk.c.a('I', "AppConfig - close()", new Object[0]);
        if (gu != null)
        {
            gu.b("AppTaskConfig");
        }
        gx = null;
        gG = null;
        gt = null;
        gu = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void d()
    {
        gv = 0;
    }

    public void d(String s1)
    {
        if (gA == null)
        {
            throw new Exception("userOptOut() failed. mUtils is not initialized");
        }
        if (s1.compareToIgnoreCase("nielsenappsdk://1") != 0 && s1.compareToIgnoreCase("nielsenappsdk://0") != 0)
        {
            throw new Exception((new StringBuilder("Invalid response received from webpage (")).append(s1).append(")").toString());
        }
        if (!gA.a(s1))
        {
            com.nielsen.app.sdk.c.a('I', "Opt out state has NOT changed (%s)", new Object[] {
                s1
            });
        } else
        {
            gA.c(true);
            gA.b(s1);
            gC = gA.d();
            gJ.a("nol_useroptout", String.valueOf(gC));
            if (gC || !gC && !gD)
            {
                if (gC)
                {
                    com.nielsen.app.sdk.c.a('I', "App SDK disabled by USER OPT OUT -- Goodbye!", new Object[0]);
                } else
                {
                    com.nielsen.app.sdk.c.a('I', "App SDK enabled by USER OPT IN -- Sending Hello Ping", new Object[0]);
                }
                d();
                if (gu.c("AppTaskConfig") != null)
                {
                    gu.b("AppTaskConfig");
                }
                gt = new b(gu, 5000L);
                if (gt == null)
                {
                    throw new Exception("Could not instantiate config retry task. No config request will happen");
                } else
                {
                    gu.a("AppTaskConfig");
                    return;
                }
            }
        }
    }

    public String e()
    {
        return gA.f();
    }

    public int f()
    {
        return gJ.e();
    }

    public void g()
    {
        com.nielsen.app.sdk.c.a('I', "Remove current config update task", new Object[0]);
        if (gu.c("AppTaskConfig") != null)
        {
            gu.b("AppTaskConfig");
        }
        if (gK != null)
        {
            long l1 = a("nol_configLifespan", 0x15180L);
            long l2 = a("nol_configIncrement", 3600L);
            gK.a(l1, l2);
            com.nielsen.app.sdk.c.a('I', "Setup refresh task with interval(%d) and increment(%d)", new Object[] {
                Long.valueOf(l1), Long.valueOf(l2)
            });
        }
        String s1 = a("nol_maxLength", "1800");
        gy.a("nol_maxLength", s1);
        s1 = a("nol_errlogInterval", "86400");
        gy.a("nol_errlogInterval", s1);
        gy.a("sdk_maxLogMsgLength", "140");
        gF = true;
    }

    public boolean h()
    {
        return gF;
    }

    public boolean i()
    {
        return gE;
    }

    public void run()
    {
        AppLocationManager applocationmanager = com.nielsen.app.sdk.a.v();
        if (!applocationmanager.a()) goto _L2; else goto _L1
_L1:
        String s2;
        String s3;
        int i1;
        s2 = "";
        s3 = "";
        i1 = 10;
_L17:
        Location location = applocationmanager.c();
        if (location == null) goto _L4; else goto _L3
_L3:
        double d1;
        double d2;
        long l1;
        d1 = location.getLongitude();
        d2 = location.getLatitude();
        l1 = gy.b("nol_gpsPrecision", 1000L);
        if (l1 < 0x186a0L) goto _L6; else goto _L5
_L5:
        Object obj;
        String s1;
        s1 = String.format(Locale.getDefault(), "%.0f", new Object[] {
            Double.valueOf(d2)
        });
        obj = String.format(Locale.getDefault(), "%.0f", new Object[] {
            Double.valueOf(d1)
        });
        int j1 = i1;
_L12:
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        if (!s1.isEmpty() && gJ != null)
        {
            gJ.a("nol_latitude", s1);
            gJ.a("latitude", s1);
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        if (!((String) (obj)).isEmpty() && gJ != null)
        {
            gJ.a("nol_longitude", ((String) (obj)));
            gJ.a("longitude", ((String) (obj)));
        }
        applocationmanager.b();
        if (j1 > 0) goto _L2; else goto _L7
_L7:
        com.nielsen.app.sdk.c.a('I', "Could not get GPS location", new Object[0]);
_L2:
        if (gA == null) goto _L9; else goto _L8
_L8:
        i1 = 10;
_L11:
        j1 = i1;
        if (gA.isReady())
        {
            break; /* Loop/switch isn't completed */
        }
        i1--;
        j1 = i1;
        if (i1 < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        Thread.sleep(500L);
        if (true) goto _L11; else goto _L10
        obj;
        com.nielsen.app.sdk.c.a(((Throwable) (obj)), true, 'E', "Exception while waiting for the device id", new Object[0]);
_L9:
        return;
_L6:
        if (l1 < 10000L || l1 >= 0x186a0L)
        {
            break MISSING_BLOCK_LABEL_366;
        }
        s1 = String.format(Locale.getDefault(), "%.1f", new Object[] {
            Double.valueOf(d2)
        });
        obj = String.format(Locale.getDefault(), "%.1f", new Object[] {
            Double.valueOf(d1)
        });
        j1 = i1;
          goto _L12
        if (l1 < 1000L || l1 >= 10000L)
        {
            break MISSING_BLOCK_LABEL_435;
        }
        s1 = String.format(Locale.getDefault(), "%.2f", new Object[] {
            Double.valueOf(d2)
        });
        obj = String.format(Locale.getDefault(), "%.2f", new Object[] {
            Double.valueOf(d1)
        });
        j1 = i1;
          goto _L12
        if (l1 < 100L || l1 >= 1000L)
        {
            break MISSING_BLOCK_LABEL_504;
        }
        s1 = String.format(Locale.getDefault(), "%.3f", new Object[] {
            Double.valueOf(d2)
        });
        obj = String.format(Locale.getDefault(), "%.3f", new Object[] {
            Double.valueOf(d1)
        });
        j1 = i1;
          goto _L12
        if (l1 < 10L || l1 >= 100L)
        {
            break MISSING_BLOCK_LABEL_573;
        }
        s1 = String.format(Locale.getDefault(), "%.4f", new Object[] {
            Double.valueOf(d2)
        });
        obj = String.format(Locale.getDefault(), "%.4f", new Object[] {
            Double.valueOf(d1)
        });
        j1 = i1;
          goto _L12
        obj = s3;
        s1 = s2;
        j1 = i1;
        if (l1 < 1L) goto _L12; else goto _L13
_L13:
        obj = s3;
        s1 = s2;
        j1 = i1;
        if (l1 >= 10L) goto _L12; else goto _L14
_L14:
        s1 = String.format(Locale.getDefault(), "%.5f", new Object[] {
            Double.valueOf(d2)
        });
        obj = String.format(Locale.getDefault(), "%.5f", new Object[] {
            Double.valueOf(d1)
        });
        j1 = i1;
          goto _L12
_L4:
        Thread.sleep(500L);
        obj = s3;
        s1 = s2;
        j1 = i1;
        if (location != null) goto _L12; else goto _L15
_L15:
        j1 = i1 - 1;
        i1 = j1;
        if (j1 >= 0) goto _L17; else goto _L16
_L16:
        obj = s3;
        s1 = s2;
          goto _L12
_L10:
        if (j1 > 0)
        {
            break MISSING_BLOCK_LABEL_797;
        }
        com.nielsen.app.sdk.c.a('W', "Could not get the DeviceId. Google Play Service didn't respond fast enough", new Object[0]);
_L18:
        if (!gD && !gC)
        {
            com.nielsen.app.sdk.c.a('I', "Sending Hello ping..", new Object[0]);
            d();
            gt = new b(gu, 5000L);
            if (gt == null)
            {
                throw new Exception("Could not instantiate config retry task. No config request will happen");
            }
            continue; /* Loop/switch isn't completed */
        }
          goto _L9
        if (gJ != null)
        {
            gJ.a("nol_deviceId", gA.getDeviceId());
        }
          goto _L18
        if (gu == null) goto _L9; else goto _L19
_L19:
        gu.a("AppTaskConfig");
        return;
          goto _L12
    }


    private class a
    {

        Map a;
        Map b;
        String c;
        final AppConfig d;
        private long e;
        private boolean f;
        private int g;
        private String h;
        private Map i;
        private String j;
        private List k;
        private Map l;
        private boolean m;
        private List n;

        public long a(long l1, long l2, long l3, String s1)
        {
            if (b())
            {
                return AppConfig.b(d).urlParserCalculatePosition(e, l1, l2, l3, s1);
            } else
            {
                return -1L;
            }
        }

        public String a(String s1)
        {
            this;
            JVM INSTR monitorenter ;
            if (l == null) goto _L2; else goto _L1
_L1:
            s1 = (String)l.get(s1);
_L4:
            this;
            JVM INSTR monitorexit ;
            return s1;
_L2:
            s1 = "";
            if (true) goto _L4; else goto _L3
_L3:
            s1;
            throw s1;
        }

        public String a(String s1, boolean aflag[])
        {
            String s2;
            String s3;
            String s4;
            s4 = "";
            s2 = s4;
            s3 = s4;
            if (!b())
            {
                break MISSING_BLOCK_LABEL_138;
            }
            s3 = s4;
            if (s1 == null)
            {
                break MISSING_BLOCK_LABEL_138;
            }
            s2 = s4;
            if (s1.isEmpty())
            {
                return "";
            }
            s2 = s4;
            String as1[] = new String[1];
            as1[0] = "";
            s2 = s4;
            s4 = AppConfig.b(d).a(e, s1, aflag, as1);
            s3 = s4;
            if (aflag[0])
            {
                break MISSING_BLOCK_LABEL_138;
            }
            s2 = s4;
            com.nielsen.app.sdk.c.a(1, 'E', "Could not parse(%s). Error(%s)", new Object[] {
                s1, as1[0]
            });
            return s4;
            aflag;
            com.nielsen.app.sdk.c.a(aflag, true, 1, 'E', "Could not parse(%s)", new Object[] {
                s1
            });
            s3 = s2;
            return s3;
        }

        public Map a(int i1)
        {
            this;
            JVM INSTR monitorenter ;
            Map map = (Map)n.get(i1);
            this;
            JVM INSTR monitorexit ;
            return map;
            Exception exception;
            exception;
            throw exception;
        }

        public Map a(HashMap hashmap)
        {
            if (e == 0L)
            {
                break MISSING_BLOCK_LABEL_20;
            }
            if (hashmap == null)
            {
                break MISSING_BLOCK_LABEL_27;
            }
            if (hashmap.isEmpty())
            {
                break MISSING_BLOCK_LABEL_27;
            }
            a(((Map) (null)), ((Map) (hashmap)));
            if (j == null || j.isEmpty())
            {
                break MISSING_BLOCK_LABEL_143;
            }
            hashmap = new boolean[1];
            hashmap[0] = 0;
            String s1 = a(j, ((boolean []) (hashmap)));
            if (hashmap[0] != 0 && s1 != null)
            {
                try
                {
                    if (!s1.isEmpty())
                    {
                        hashmap = new JSONObject(s1);
                        String s2;
                        for (Iterator iterator = hashmap.keys(); iterator.hasNext(); a(s2, (String)hashmap.get(s2)))
                        {
                            s2 = (String)iterator.next();
                        }

                    }
                }
                // Misplaced declaration of an exception variable
                catch (HashMap hashmap)
                {
                    com.nielsen.app.sdk.c.a(hashmap, true, 1, 'E', "Could not parse the CMS data", new Object[0]);
                }
            }
            return l;
        }

        public Map a(Map map)
        {
            return a(((Map) (null)), map);
        }

        public Map a(Map map, Map map1)
        {
            if (map != null && !map.isEmpty())
            {
                String s2;
                String s4;
                for (Iterator iterator1 = map.keySet().iterator(); iterator1.hasNext(); i.put(s2, s4))
                {
                    String s1 = (String)iterator1.next();
                    s4 = (String)map.get(s1);
                    for (s1 = s1.trim(); (s1.startsWith("(") || s1.startsWith("<")) && (s1.endsWith(")") || s1.endsWith(">")); s1 = s1.substring(1, s1.length() - 1)) { }
                    for (s2 = s4.trim(); (s2.startsWith("(") || s2.startsWith("<")) && (s2.endsWith(")") || s2.endsWith(">")); s2 = s2.substring(1, s2.length() - 1)) { }
                    i.put(s1, s4);
                }

                j = (new JSONObject(i)).toString();
                j = j.replaceAll("\\s", "");
                j = j.replace(":\"", ":\"|![");
                j = j.replace("\",", "]!|\",");
                j = j.replace("\"}", "]!|\"}");
            }
            if (l == null || l.isEmpty())
            {
                m = true;
            }
            if (map1 == null || map1.isEmpty()) goto _L2; else goto _L1
_L1:
            Iterator iterator = map1.keySet().iterator();
_L3:
            String s3;
            Object obj;
            boolean flag;
            if (!iterator.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            obj = (String)iterator.next();
            s3 = (String)map1.get(obj);
            map = null;
            Iterator iterator2 = i.keySet().iterator();
            String s6;
            do
            {
                if (!iterator2.hasNext())
                {
                    break MISSING_BLOCK_LABEL_529;
                }
                s6 = (String)iterator2.next();
            } while (s6.compareToIgnoreCase(((String) (obj))) != 0);
            map = (String)i.get(s6);
            flag = true;
_L4:
            if (flag)
            {
                obj = i.keySet().iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    String s5 = (String)((Iterator) (obj)).next();
                    if (map.compareToIgnoreCase((String)i.get(s5)) == 0)
                    {
                        a(s5, s3);
                    }
                }
            } else
            {
                a(((String) (obj)), s3);
            }
            if (true) goto _L3; else goto _L2
_L2:
            return l;
            flag = false;
              goto _L4
        }

        public Map a(JSONObject jsonobject)
        {
            HashMap hashmap = new HashMap();
            String s1;
            for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); hashmap.put(s1, (String)jsonobject.get(s1)))
            {
                s1 = (String)iterator.next();
            }

            return a(hashmap);
        }

        public void a()
        {
            e = 0L;
        }

        public void a(int i1, String s1, String s2, String s3, String s4, Map map)
        {
            this;
            JVM INSTR monitorenter ;
            HashMap hashmap;
            hashmap = new HashMap();
            hashmap.put("nol_comment", s1);
            hashmap.put("nol_product", s2);
            hashmap.put("nol_cadence", s3);
            hashmap.put("nol_url", s4);
            if (map == null)
            {
                break MISSING_BLOCK_LABEL_114;
            }
            for (s1 = map.keySet().iterator(); s1.hasNext(); hashmap.put(s2, (String)map.get(s2)))
            {
                s2 = (String)s1.next();
            }

            break MISSING_BLOCK_LABEL_114;
            s1;
            throw s1;
            if (i1 >= n.size())
            {
                break MISSING_BLOCK_LABEL_153;
            }
            n.remove(i1);
            n.add(i1, hashmap);
_L1:
            this;
            JVM INSTR monitorexit ;
            return;
            n.add(hashmap);
              goto _L1
        }

        public void a(long l1)
        {
            e = l1;
            m = true;
        }

        public void a(String s1, int i1)
        {
            g = i1;
            h = s1;
        }

        public void a(String s1, String s2)
        {
            this;
            JVM INSTR monitorenter ;
            String s3;
            if (l == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            s3 = (String)l.put(s1, s2);
            if (m || s2 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            if (s3 == null)
            {
                break MISSING_BLOCK_LABEL_47;
            }
            if (s3.compareTo(s2) == 0)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            k.add(s1);
            this;
            JVM INSTR monitorexit ;
            return;
            s1;
            throw s1;
        }

        public boolean a(List list, Map map, boolean flag)
        {
            Object obj2;
            Map map1;
            AppRule apprule;
            if (list == null)
            {
                return false;
            }
            int i1;
            int k1;
            if (map != null && !map.isEmpty() && !flag)
            {
                obj2 = new HashMap(l);
                String s1;
                for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); ((Map) (obj2)).put(s1, (String)map.get(s1)))
                {
                    s1 = (String)iterator.next();
                }

                map1 = l;
            } else
            {
                if (map != null && !map.isEmpty())
                {
                    String s2;
                    for (Iterator iterator1 = map.keySet().iterator(); iterator1.hasNext(); a(s2, (String)map.get(s2)))
                    {
                        s2 = (String)iterator1.next();
                    }

                }
                obj2 = l;
                map1 = l;
            }
            k1 = list.size();
            i1 = 0;
            if (i1 >= k1) goto _L2; else goto _L1
_L1:
            apprule = (AppRule)list.get(i1);
            if (apprule != null) goto _L4; else goto _L3
_L3:
            com.nielsen.app.sdk.c.a(3, 'E', "Could not parse filter(%i) on (%s)", new Object[] {
                Integer.valueOf(i1), list.toString()
            });
_L6:
            i1++;
            break MISSING_BLOCK_LABEL_112;
_L4:
            Object obj;
            Object obj1;
            obj1 = apprule.getTagVarName();
            obj = apprule.getTagVarValue();
            obj1 = (String)map1.get(obj1);
            if (obj1 == null || ((String) (obj1)).isEmpty() || ((String) (obj1)).compareToIgnoreCase(((String) (obj))) != 0) goto _L6; else goto _L5
_L5:
            String s3;
            boolean flag4;
            s3 = apprule.getIsType();
            obj = apprule.getIsValue();
            obj1 = (String)map1.get(obj);
            if (obj1 != null && !((String) (obj1)).isEmpty())
            {
                obj = obj1;
            }
            flag4 = false;
            int l1 = apprule.getConditionSize();
            boolean flag1;
            int j1;
            j1 = 0;
            flag1 = true;
_L63:
            if (j1 >= l1) goto _L8; else goto _L7
_L7:
            Object obj4 = apprule.getCondition(j1);
            obj1 = obj;
            if (obj4 == null) goto _L10; else goto _L9
_L9:
            obj1 = obj;
            if (((String) (obj4)).isEmpty()) goto _L10; else goto _L11
_L11:
            obj1 = obj;
            if (!((String) (obj4)).startsWith("nol_")) goto _L10; else goto _L12
_L12:
            Object obj3 = (String)map1.get(obj4);
            if (obj3 == null) goto _L14; else goto _L13
_L13:
            obj1 = obj3;
            if (!((String) (obj3)).isEmpty()) goto _L15; else goto _L14
_L15:
            obj3 = obj1;
            if (!((String) (obj1)).isEmpty())
            {
                break MISSING_BLOCK_LABEL_499;
            }
            if (((String) (obj4)).compareToIgnoreCase("nol_fdcid") == 0)
            {
                break MISSING_BLOCK_LABEL_493;
            }
            obj3 = obj1;
            if (((String) (obj4)).compareToIgnoreCase("nol_pccid") != 0)
            {
                break MISSING_BLOCK_LABEL_499;
            }
            obj3 = h;
            String s4;
            obj = ((String) (obj)).trim();
            obj3 = ((String) (obj3)).trim();
            obj4 = Pattern.compile((new StringBuilder("\\b")).append(((String) (obj))).append("\\b").toString());
            s4 = (new StringBuilder("\\b")).append(((String) (obj3))).append("\\b").toString();
            obj1 = Pattern.compile(s4);
            if (s3.compareToIgnoreCase("+") != 0) goto _L17; else goto _L16
_L16:
            if (!flag1) goto _L19; else goto _L18
_L18:
            flag1 = false;
            if (((String) (obj)).isEmpty() || ((String) (obj3)).isEmpty()) goto _L21; else goto _L20
_L20:
            if (((String) (obj)).compareTo(((String) (obj3))) != 0) goto _L23; else goto _L22
_L22:
            flag4 = true;
              goto _L24
_L23:
            flag4 = ((Pattern) (obj1)).matcher(((CharSequence) (obj))).find();
              goto _L24
_L19:
            boolean flag5;
            boolean flag6;
            flag6 = false;
            flag5 = flag6;
            if (((String) (obj)).isEmpty()) goto _L26; else goto _L25
_L25:
            flag5 = flag6;
            if (((String) (obj3)).isEmpty()) goto _L26; else goto _L27
_L27:
            if (((String) (obj)).compareTo(((String) (obj3))) != 0) goto _L29; else goto _L28
_L28:
            flag5 = true;
              goto _L26
_L29:
            flag5 = ((Pattern) (obj1)).matcher(((CharSequence) (obj))).find();
              goto _L26
_L17:
            if (s3.compareToIgnoreCase("-") != 0) goto _L31; else goto _L30
_L30:
            if (!flag1) goto _L33; else goto _L32
_L32:
            boolean flag2 = false;
            if (!((String) (obj)).isEmpty() && !((String) (obj3)).isEmpty())
            {
                if (((String) (obj)).compareTo(((String) (obj3))) == 0)
                {
                    break MISSING_BLOCK_LABEL_1561;
                }
                break MISSING_BLOCK_LABEL_744;
            }
              goto _L21
_L33:
            boolean flag3;
            flag3 = false;
            flag2 = flag3;
            if (((String) (obj)).isEmpty()) goto _L35; else goto _L34
_L34:
            flag2 = flag3;
            if (!((String) (obj3)).isEmpty())
            {
                if (((String) (obj)).compareTo(((String) (obj3))) != 0 && !((Pattern) (obj1)).matcher(((CharSequence) (obj))).find())
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
            }
              goto _L35
_L31:
            if (s3.compareToIgnoreCase("++") != 0) goto _L37; else goto _L36
_L36:
            if (!flag1) goto _L39; else goto _L38
_L38:
            flag1 = false;
            if (((String) (obj)).isEmpty() || ((String) (obj3)).isEmpty()) goto _L21; else goto _L40
_L40:
            if (((String) (obj)).compareTo(((String) (obj3))) != 0) goto _L42; else goto _L41
_L41:
            flag4 = true;
              goto _L24
_L42:
            flag4 = ((Pattern) (obj4)).matcher(s4).find();
              goto _L24
_L39:
            flag7 = false;
            flag5 = flag7;
            if (((String) (obj)).isEmpty()) goto _L44; else goto _L43
_L43:
            flag5 = flag7;
            if (((String) (obj3)).isEmpty()) goto _L44; else goto _L45
_L45:
            if (((String) (obj)).compareTo(((String) (obj3))) != 0) goto _L47; else goto _L46
_L46:
            flag5 = true;
              goto _L44
_L47:
            flag5 = ((Pattern) (obj4)).matcher(s4).find();
              goto _L44
_L37:
            obj1 = obj;
            if (s3.compareToIgnoreCase("--") != 0) goto _L10; else goto _L48
_L48:
            if (!flag1) goto _L50; else goto _L49
_L49:
            flag2 = false;
            if (!((String) (obj)).isEmpty() && !((String) (obj3)).isEmpty())
            {
                if (((String) (obj)).compareTo(((String) (obj3))) == 0)
                {
                    break MISSING_BLOCK_LABEL_1561;
                }
                break MISSING_BLOCK_LABEL_992;
            }
              goto _L21
_L50:
            flag2 = false;
            flag3 = flag2;
            if (((String) (obj)).isEmpty()) goto _L52; else goto _L51
_L51:
            flag3 = flag2;
            if (!((String) (obj3)).isEmpty())
            {
                if (((String) (obj)).compareTo(((String) (obj3))) != 0 && !((Pattern) (obj4)).matcher(s4).find())
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
            }
              goto _L52
_L8:
            if (flag1) goto _L6; else goto _L53
_L53:
            if (!flag4) goto _L55; else goto _L54
_L54:
            if (apprule.getResultSize() <= 0) goto _L57; else goto _L56
_L56:
            obj = apprule.getResults();
_L62:
            if (obj == null) goto _L6; else goto _L58
_L58:
            if (((Map) (obj)).isEmpty()) goto _L6; else goto _L59
_L59:
            obj4 = ((Map) (obj)).keySet().iterator();
_L61:
            if (!((Iterator) (obj4)).hasNext()) goto _L6; else goto _L60
_L60:
            s4 = (String)((Iterator) (obj4)).next();
            obj3 = (String)((Map) (obj)).get(s4);
            obj1 = obj3;
            if (obj3 == null)
            {
                break MISSING_BLOCK_LABEL_1232;
            }
            obj1 = obj3;
            if (((String) (obj3)).isEmpty())
            {
                break MISSING_BLOCK_LABEL_1232;
            }
            obj1 = obj3;
            if (!((String) (obj3)).startsWith("nol_"))
            {
                break MISSING_BLOCK_LABEL_1232;
            }
            s3 = (String)map1.get(obj3);
            obj1 = obj3;
            if (s3 == null)
            {
                break MISSING_BLOCK_LABEL_1232;
            }
            obj1 = obj3;
            if (!s3.isEmpty())
            {
                obj1 = s3;
            }
            if (s4.compareToIgnoreCase("nol_disabled") != 0 || obj1 == null)
            {
                break MISSING_BLOCK_LABEL_1289;
            }
            if (((String) (obj1)).compareToIgnoreCase(Boolean.TRUE.toString()) == 0)
            {
                com.nielsen.app.sdk.c.a('I', "(%s) disabled by rule: %s", new Object[] {
                    g(), apprule.toString()
                });
            }
            if (map == null)
            {
                break MISSING_BLOCK_LABEL_1359;
            }
            if (map.isEmpty() || flag)
            {
                break MISSING_BLOCK_LABEL_1359;
            }
            ((Map) (obj2)).put(s4, obj1);
              goto _L61
            obj;
            com.nielsen.app.sdk.c.a(3, 'E', "Cound not evaluate conditions on rule", new Object[0]);
              goto _L6
_L57:
            obj = apprule.getThen();
              goto _L62
_L55:
            obj = apprule.getElse();
              goto _L62
            a(s4, ((String) (obj1)));
              goto _L61
_L2:
            if (map != null && !map.isEmpty() && !flag)
            {
                l.putAll(((Map) (obj2)));
            }
            return true;
_L21:
            flag4 = false;
            flag1 = false;
              goto _L24
_L10:
            obj = obj1;
              goto _L24
_L14:
            obj1 = "";
              goto _L15
_L24:
            j1++;
              goto _L63
_L26:
            if (flag4 && flag5)
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
              goto _L24
            boolean flag7;
            if (!((Pattern) (obj1)).matcher(((CharSequence) (obj))).find())
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            flag1 = false;
              goto _L24
_L35:
            if (flag4 && flag2)
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
              goto _L24
_L44:
            if (flag4 && flag5)
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
              goto _L24
            if (!((Pattern) (obj4)).matcher(s4).find())
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            flag1 = false;
              goto _L24
_L52:
            flag2 = flag1;
            if (!flag4)
            {
                break MISSING_BLOCK_LABEL_1561;
            }
            flag2 = flag1;
            if (!flag3)
            {
                break MISSING_BLOCK_LABEL_1561;
            }
            flag4 = true;
              goto _L24
            flag1 = flag2;
            flag4 = false;
              goto _L24
        }

        public String b(String s1)
        {
            String s2;
            String s3;
            s3 = "";
            s2 = s3;
            if (s1 == null) goto _L2; else goto _L1
_L1:
            if (s1.startsWith("nol_")) goto _L4; else goto _L3
_L3:
            s2 = s3;
_L2:
            return s2;
_L4:
            s2 = (String)i.get(s1);
            s1 = s2;
            if (s2 == null)
            {
                return "";
            }
_L7:
            if (s1.startsWith("("))
            {
                break; /* Loop/switch isn't completed */
            }
            s2 = s1;
            if (!s1.startsWith("<")) goto _L2; else goto _L5
_L5:
            if (s1.endsWith(")"))
            {
                break; /* Loop/switch isn't completed */
            }
            s2 = s1;
            if (!s1.endsWith(">")) goto _L2; else goto _L6
_L6:
            s1 = s1.substring(1, s1.length() - 1);
              goto _L7
        }

        public Map b(JSONObject jsonobject)
        {
            HashMap hashmap = new HashMap();
            String s1;
            for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); hashmap.put(s1, (String)jsonobject.get(s1)))
            {
                s1 = (String)iterator.next();
            }

            return a(((Map) (null)), hashmap);
        }

        public void b(Map map)
        {
            a.putAll(map);
        }

        public boolean b()
        {
            if (e == 0L)
            {
                com.nielsen.app.sdk.c.a('W', "updateDictionary() failed. No native URL parser object.", new Object[0]);
                return false;
            }
            if (!m) goto _L2; else goto _L1
_L1:
            AppConfig.b(d).a(e, (HashMap)l);
            m = false;
            k.clear();
_L4:
            return true;
_L2:
            if (!k.isEmpty())
            {
                HashMap hashmap = new HashMap();
                String s1;
                for (Iterator iterator = k.iterator(); iterator.hasNext(); hashmap.put(s1, (String)l.get(s1)))
                {
                    s1 = (String)iterator.next();
                }

                AppConfig.b(d).a(e, hashmap);
                k.clear();
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public boolean b(long l1, long l2, long l3, String s1)
        {
            long l5 = (l1 - l3) + l2;
            String s2 = a("nol_weekEndUTC");
            long l4;
            if (s2 != null && !s2.isEmpty())
            {
                l4 = Long.parseLong(s2);
            } else
            {
                l4 = l5;
            }
            if (!f && l5 > l4 && g == 6)
            {
                List list = f("onWeekEndUTC");
                if (list != null)
                {
                    a(list, null, true);
                }
                com.nielsen.app.sdk.c.a('I', "Applying Week End filter : name(%s) period(%s) end(%s) start(%s)", new Object[] {
                    a("nol_week"), a("nol_period"), a("nol_weekEndUTC"), a("nol_weekStartUTC")
                });
                f = true;
            }
            if (b())
            {
                return AppConfig.b(d).urlParserCalculateVariable(e, l1, l2, l3, s1);
            } else
            {
                return false;
            }
        }

        public String c()
        {
            String s1;
            if (!b())
            {
                break MISSING_BLOCK_LABEL_40;
            }
            s1 = AppConfig.b(d).urlParserProcessIagData(e);
            return s1;
            Exception exception;
            exception;
            com.nielsen.app.sdk.c.a(exception, true, 1, 'E', "Could not parse IAG string", new Object[0]);
            return "";
        }

        public void c(String s1)
        {
            this;
            JVM INSTR monitorenter ;
            l.remove(s1);
            k.remove(s1);
            this;
            JVM INSTR monitorexit ;
            return;
            s1;
            throw s1;
        }

        public void c(Map map)
        {
            b.putAll(map);
        }

        public Map d()
        {
            return l;
        }

        public boolean d(String s1)
        {
            s1 = (String)l.get(s1);
            return d.a(s1);
        }

        public int e()
        {
            return n.size();
        }

        public Map e(String s1)
        {
            return (Map)a.get(s1);
        }

        public List f(String s1)
        {
            return (List)b.get(s1);
        }

        public void f()
        {
            n.clear();
        }

        public String g()
        {
            return c;
        }

        public void g(String s1)
        {
            c = s1;
        }

        public a(a a1)
        {
            d = AppConfig.this;
            super();
            e = 0L;
            f = false;
            g = 0;
            h = "X100zdCIGeIlgZnkYj6UvQ==";
            i = new HashMap();
            j = "";
            k = new LinkedList();
            l = new HashMap();
            m = true;
            n = new LinkedList();
            a = new HashMap();
            b = new HashMap();
            c = "";
            a.putAll(a1.a);
            b.putAll(a1.b);
            l.putAll(a1.l);
            j = a1.j;
            i.putAll(a1.i);
        }

        public a(Map map, Map map1)
        {
            d = AppConfig.this;
            super();
            e = 0L;
            f = false;
            g = 0;
            h = "X100zdCIGeIlgZnkYj6UvQ==";
            i = new HashMap();
            j = "";
            k = new LinkedList();
            l = new HashMap();
            m = true;
            n = new LinkedList();
            a = new HashMap();
            b = new HashMap();
            c = "";
            a(map, map1);
        }
    }


    private class b extends AppScheduler.AppTask
    {

        public static final String a = "AppTaskConfig";
        public static final int b = 0x927c0;
        public static final int c = 5000;
        public static final int d = 1;
        final AppConfig e;

        public boolean execute()
        {
            try
            {
                (e. new ConfigRequest(AppConfig.a(e))).startRequest();
            }
            catch (Exception exception)
            {
                com.nielsen.app.sdk.c.a(exception, true, 2, 'E', "There is no utilities object to execute the request", new Object[0]);
                return false;
            }
            return false;
        }

        public b(AppScheduler appscheduler, long l1)
        {
            e = AppConfig.this;
            appscheduler.getClass();
            super(appscheduler, "AppTaskConfig", 1L, l1);
        }

        private class ConfigRequest extends AppRequestManager.AppRequestHandler
        {

            public static final int BUFFER_SIZE = 0x3e800;
            public static final String REQUEST_NAME = "ConfigRequest";
            public static final int TIMEOUT_CONNECTION = 60000;
            public static final int TIMEOUT_DATA = 60000;
            final AppConfig a;
            private AppRequestManager.AppRequest b;

            private void a()
            {
                if (AppConfig.f(a) < 4)
                {
                    if (AppConfig.g(a) != null)
                    {
                        AppConfig.g(a).a("AppTaskConfig");
                    }
                    AppConfig.h(a);
                } else
                {
                    if (AppConfig.f(a) == 4)
                    {
                        AppLogUploader apploguploader = com.nielsen.app.sdk.a.r();
                        if (apploguploader != null)
                        {
                            apploguploader.b();
                        }
                        com.nielsen.app.sdk.c.a(2, 'E', "Config not received, %s", new Object[] {
                            AppConfig.i(a)
                        });
                        if (AppConfig.g(a).c("AppTaskConfig") != null)
                        {
                            AppConfig.g(a).b("AppTaskConfig");
                        }
                        AppConfig.a(a, a. new b(AppConfig.g(a), 0x927c0L));
                        if (AppConfig.j(a) == null)
                        {
                            throw new Exception("Could not instantiate config retry task. No config request will happen");
                        }
                        AppConfig.h(a);
                    }
                    if (AppConfig.g(a) != null)
                    {
                        AppConfig.g(a).a("AppTaskConfig");
                        return;
                    }
                }
            }

            private void b()
            {
                Object obj = com.nielsen.app.sdk.a.r();
                if (obj != null)
                {
                    ((AppLogUploader) (obj)).b();
                }
                obj = com.nielsen.app.sdk.a.s();
                ((e) (obj)).e();
                long l1 = a.a("nol_sendTimer", 90L);
                String s1 = a.a();
                new AppTaskUploader(AppConfig.g(a), 1000L * l1, s1);
                AppConfig.g(a).a("AppUpload");
                com.nielsen.app.sdk.c.a('I', "START UPLOAD task now. Period(%d)", new Object[] {
                    Long.valueOf(l1)
                });
                ((e) (obj)).f();
                a.g();
                com.nielsen.app.sdk.c.a(1, "Config file successfully loaded and parsed.", new Object[0]);
            }

            private void c()
            {
                com.nielsen.app.sdk.a.s().e();
                com.nielsen.app.sdk.c.a('I', "STOP UPLOAD task now", new Object[0]);
                AppScheduler.AppTask apptask = AppConfig.g(a).c("AppUpload");
                if (apptask != null)
                {
                    apptask.execute();
                }
            }

            public void onError(String s1, long l1, Exception exception)
            {
                try
                {
                    com.nielsen.app.sdk.c.a(9, 'E', "Failed to get config response", new Object[0]);
                    if (AppSdk.a())
                    {
                        Log.d("AppSdk", "AppConfig Nielsen AppSDK: Failed sending config request");
                    }
                    a();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    com.nielsen.app.sdk.c.a(exception, true, 9, 'E', "Failed to get config response; failed retry", new Object[0]);
                }
            }

            public void onFinish(String s1, long l1, String s2)
            {
                boolean flag;
                boolean flag1;
                try
                {
                    com.nielsen.app.sdk.c.a('I', "CONFIG response: %s", new Object[] {
                        s2
                    });
                    flag = AppConfig.c(a).e();
                    flag1 = AppConfig.c(a).c();
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    com.nielsen.app.sdk.c.a(s1, true, 2, 'E', "Could not finalize download of config file", new Object[0]);
                    return;
                }
                if (!flag && !flag1)
                {
                    break MISSING_BLOCK_LABEL_157;
                }
                if (!flag1)
                {
                    break MISSING_BLOCK_LABEL_67;
                }
                AppConfig.c(a).b(false);
                if (!flag)
                {
                    break MISSING_BLOCK_LABEL_83;
                }
                AppConfig.c(a).c(false);
                if (AppConfig.d(a) || AppConfig.e(a))
                {
                    if (AppSdk.a())
                    {
                        Log.d("AppSdk", "AppConfig Nielsen AppSDK: Successfully sent opt out/disable ping");
                    }
                    com.nielsen.app.sdk.c.a('I', "Goodbye ping... USER OPT OUT / APP SDK DISABLE finished", new Object[0]);
                    AppConfig.a(a, false);
                    c();
                    return;
                }
                com.nielsen.app.sdk.c.a('I', "Hello ping... USER OPT IN / APP SDK ENABLE finished", new Object[0]);
                if (s2 == null)
                {
                    break MISSING_BLOCK_LABEL_253;
                }
                if (s2.isEmpty())
                {
                    break MISSING_BLOCK_LABEL_253;
                }
                com.nielsen.app.sdk.c.a('I', "Receive content to parse.", new Object[0]);
                if (!a.c(s2))
                {
                    if (AppSdk.a())
                    {
                        Log.d("AppSdk", "AppConfig Nielsen AppSDK: Successfully received config; failed parsing");
                    }
                    a();
                    return;
                }
                if (AppSdk.a())
                {
                    Log.d("AppSdk", "AppConfig Nielsen AppSDK: Successfully received config; parse succesful");
                }
                b();
                return;
                com.nielsen.app.sdk.c.a('I', "Received empty config file. Keep retrying", new Object[0]);
                if (AppSdk.a())
                {
                    Log.d("AppSdk", "AppConfig Nielsen AppSDK: Received empty config");
                }
                a();
                return;
            }

            public void onIdle(String s1, long l1)
            {
            }

            public void onStart(String s1, long l1)
            {
            }

            public void onUpdate(String s1, long l1, long l2, long l3, 
                    String s2)
            {
            }

            public void startRequest()
            {
                String s1 = (new StringBuilder("%%%")).append(AppConfig.c(a).getNuid()).append("%%%").toString();
                try
                {
                    b.get(s1, AppConfig.i(a));
                    return;
                }
                catch (InterruptedException interruptedexception)
                {
                    com.nielsen.app.sdk.c.a('E', "startRequest failed. Exception: %s", new Object[] {
                        interruptedexception
                    });
                }
            }

            public ConfigRequest(AppRequestManager apprequestmanager)
            {
                a = AppConfig.this;
                apprequestmanager.getClass();
                super(apprequestmanager, "ConfigRequest");
                b = null;
                if (!AppConfig.c(AppConfig.this).r())
                {
                    throw new Exception("No Network connection. Device is currently offline");
                }
                long l1 = AppConfig.b(AppConfig.this).a();
                if (l1 == 0L)
                {
                    throw new Exception("No URL parser object instantiated");
                }
                AppConfig.k(AppConfig.this).a(l1);
                boolean flag = AppConfig.c(AppConfig.this).c();
                if (flag)
                {
                    a a1 = AppConfig.k(AppConfig.this);
                    boolean aflag[];
                    int i1;
                    boolean flag1;
                    if (AppConfig.e(AppConfig.this))
                    {
                        apprequestmanager = "true";
                    } else
                    {
                        apprequestmanager = "false";
                    }
                    a1.a("nol_appdisable", apprequestmanager);
                } else
                {
                    AppConfig.k(AppConfig.this).a("nol_appdisable", "");
                }
                flag1 = AppConfig.c(AppConfig.this).e();
                if (flag1)
                {
                    a1 = AppConfig.k(AppConfig.this);
                    if (AppConfig.d(AppConfig.this))
                    {
                        apprequestmanager = "true";
                    } else
                    {
                        apprequestmanager = "false";
                    }
                    a1.a("nol_useroptout", apprequestmanager);
                } else
                {
                    AppConfig.k(AppConfig.this).a("nol_useroptout", "");
                }
                if (!flag && !flag1 || !AppConfig.e(AppConfig.this) && !AppConfig.d(AppConfig.this))
                {
                    apprequestmanager = AppConfig.k(AppConfig.this).a("latitude");
                    AppConfig.k(AppConfig.this).a("nol_latitude", apprequestmanager);
                    apprequestmanager = AppConfig.k(AppConfig.this).a("longitude");
                    AppConfig.k(AppConfig.this).a("nol_longitude", apprequestmanager);
                } else
                {
                    AppConfig.k(AppConfig.this).a("nol_latitude", "");
                    AppConfig.k(AppConfig.this).a("nol_longitude", "");
                }
                apprequestmanager = AppConfig.k(AppConfig.this).a("nol_url_override");
                if (apprequestmanager == null || apprequestmanager.isEmpty())
                {
                    i1 = com.nielsen.app.sdk.h.s();
                    apprequestmanager = (new StringBuilder()).append("https://secure-|!nol_sfcode!|.imrworldwide.com/cgi-bin/cfg?cfgv=150&longitude=|![nol_longitude]!|&latitude=|![nol_latitude]!|&apid=|!nol_appid!|&apv=|!nol_appversion!|&apn=|!nol_appname!|&sdkv=|!nol_sdkversion!|&nuid=|!nol_nuid!|&osver=|!nol_osversion!|&devtypid=|!nol_devtypeid!|&devid=|![nol_deviceId]!|&fmt=json&adf=|![nol_appdisable]!|&uoo=|![nol_useroptout]!|&sfcode=|![nol_sfcode]!|&ccode=|![nol_countrycode]!|&dma=|![nol_dma]!||![nol_appParams]!|").append("&rnd=").append(String.valueOf(i1)).toString();
                } else
                {
                    com.nielsen.app.sdk.c.a('I', "USING URL OVERRIDE", new Object[0]);
                }
                aflag = new boolean[1];
                aflag[0] = false;
                AppConfig.a(AppConfig.this, AppConfig.k(AppConfig.this).a(apprequestmanager, aflag));
                if (aflag[0] && AppConfig.i(AppConfig.this) != null && !AppConfig.i(AppConfig.this).isEmpty())
                {
                    if (AppConfig.i(AppConfig.this).contains("?"))
                    {
                        com.nielsen.app.sdk.c.a('I', "Config request. Sending message: %s", new Object[] {
                            AppConfig.i(AppConfig.this)
                        });
                        apprequestmanager = AppConfig.a(AppConfig.this);
                        apprequestmanager.getClass();
                        b = new AppRequestManager.AppRequest(apprequestmanager, "ConfigRequest", this, 60000, 60000, 0x3e800);
                    } else
                    {
                        com.nielsen.app.sdk.c.a(3, 'E', "Missing query string in config url (%s)", new Object[] {
                            AppConfig.i(AppConfig.this)
                        });
                    }
                }
                AppConfig.b(AppConfig.this).b(l1);
                AppConfig.k(AppConfig.this).a();
            }
        }

    }


    private class AppRule
        implements Closeable
    {

        final AppConfig a;
        private boolean b;
        private String c;
        private String d;
        private List e;
        private String f;
        private String g;
        private Map h;
        private Map i;
        private Map j;

        public void close()
        {
            if (i != null)
            {
                i.clear();
            }
            i = null;
            if (h != null)
            {
                h.clear();
            }
            h = null;
            if (j != null)
            {
                j.clear();
            }
            j = null;
            if (e != null)
            {
                e.clear();
            }
            e = null;
        }

        public String getCondition(int i1)
        {
            return (String)e.get(i1);
        }

        public int getConditionSize()
        {
            return e.size();
        }

        public Map getElse()
        {
            return i;
        }

        public int getElseSize()
        {
            return i.size();
        }

        public String getIsType()
        {
            return f;
        }

        public String getIsValue()
        {
            return g;
        }

        public int getResultSize()
        {
            return j.size();
        }

        public Map getResults()
        {
            return j;
        }

        public String getTagVarName()
        {
            return c;
        }

        public String getTagVarValue()
        {
            return d;
        }

        public Map getThen()
        {
            return h;
        }

        public int getThenSize()
        {
            return h.size();
        }

        public boolean isValid()
        {
            return b;
        }

        public String toString()
        {
            Object obj1 = (new StringBuilder("TagVar( name=")).append(c).append(" value=").append(d).append(" ) ").toString();
            Object obj = obj1;
            if (!e.isEmpty())
            {
                obj = (new StringBuilder()).append(((String) (obj1))).append("Condition( ").toString();
                for (int i1 = 0; i1 < e.size(); i1++)
                {
                    obj1 = (String)e.get(i1);
                    obj = (new StringBuilder()).append(((String) (obj))).append(((String) (obj1))).append(" ").toString();
                }

                obj = (new StringBuilder()).append(((String) (obj))).append(") ").toString();
            }
            obj1 = (new StringBuilder()).append(((String) (obj))).append("Is( type=").append(f).append(" value=").append(g).append(" )").toString();
            obj = obj1;
            if (!h.isEmpty())
            {
                obj = (new StringBuilder()).append(((String) (obj1))).append(" Then( ").toString();
                for (obj1 = h.keySet().iterator(); ((Iterator) (obj1)).hasNext();)
                {
                    String s1 = (String)((Iterator) (obj1)).next();
                    String s4 = (String)h.get(s1);
                    obj = (new StringBuilder()).append(((String) (obj))).append(s1).append("=").append(s4).append(" ").toString();
                }

                obj = (new StringBuilder()).append(((String) (obj))).append(")").toString();
            }
            obj1 = obj;
            if (!i.isEmpty())
            {
                obj = (new StringBuilder()).append(((String) (obj))).append(" Else( ").toString();
                for (obj1 = i.keySet().iterator(); ((Iterator) (obj1)).hasNext();)
                {
                    String s2 = (String)((Iterator) (obj1)).next();
                    String s5 = (String)i.get(s2);
                    obj = (new StringBuilder()).append(((String) (obj))).append(s2).append("=").append(s5).append(" ").toString();
                }

                obj1 = (new StringBuilder()).append(((String) (obj))).append(")").toString();
            }
            obj = obj1;
            if (!j.isEmpty())
            {
                obj = (new StringBuilder()).append(((String) (obj1))).append(" Result( ").toString();
                for (Iterator iterator = j.keySet().iterator(); iterator.hasNext();)
                {
                    String s3 = (String)iterator.next();
                    String s6 = (String)j.get(s3);
                    obj = (new StringBuilder()).append(((String) (obj))).append(s3).append("=").append(s6).append(" ").toString();
                }

                obj = (new StringBuilder()).append(((String) (obj))).append(")").toString();
            }
            return ((String) (obj));
        }

        public AppRule(AppRule apprule)
        {
            a = AppConfig.this;
            super();
            b = false;
            c = "";
            d = "";
            e = new LinkedList();
            f = "";
            g = "";
            h = new HashMap();
            i = new HashMap();
            j = new HashMap();
            f = apprule.f;
            g = apprule.g;
            i.putAll(apprule.i);
            h.putAll(apprule.h);
            j.putAll(apprule.j);
            c = apprule.c;
            d = apprule.d;
            e.addAll(apprule.e);
        }

        public AppRule(JSONObject jsonobject)
        {
            a = AppConfig.this;
            super();
            b = false;
            c = "";
            d = "";
            e = new LinkedList();
            f = "";
            g = "";
            h = new HashMap();
            i = new HashMap();
            j = new HashMap();
            b = false;
            if (jsonobject == null)
            {
                com.nielsen.app.sdk.c.a(3, 'E', "There is no rule to parse", new Object[0]);
                return;
            }
            appconfig = jsonobject.getJSONObject("tagVar");
            if (AppConfig.this == null) goto _L2; else goto _L1
_L1:
            c = getString("name");
            d = getString("value");
            appconfig = jsonobject.getJSONObject("is");
            if (AppConfig.this == null) goto _L4; else goto _L3
_L3:
            f = getString("type");
            g = getString("value");
            String s1;
            int i1;
            try
            {
                appconfig = jsonobject.getJSONArray("cond");
            }
            // Misplaced declaration of an exception variable
            catch (AppConfig appconfig)
            {
                com.nielsen.app.sdk.c.a(3, 'E', "There should be \"%s\" JSON array on current filter(%s)", new Object[] {
                    "cond", jsonobject.toString()
                });
                return;
            }
            if (AppConfig.this == null)
            {
                break MISSING_BLOCK_LABEL_366;
            }
            i1 = 0;
            if (i1 >= length())
            {
                break; /* Loop/switch isn't completed */
            }
            s1 = getString(i1);
            e.add(s1);
            i1++;
            if (true) goto _L6; else goto _L5
_L6:
            break MISSING_BLOCK_LABEL_180;
_L2:
            try
            {
                com.nielsen.app.sdk.c.a(3, 'E', "There must be a \"tagVar\" statement on filter(%s)", new Object[] {
                    jsonobject.toString()
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (AppConfig appconfig)
            {
                com.nielsen.app.sdk.c.a(3, 'E', "There should be \"%s\" on current filter(%s)", new Object[] {
                    "tagVar", jsonobject.toString()
                });
            }
            return;
_L4:
            try
            {
                com.nielsen.app.sdk.c.a(3, 'E', "There must be a \"is\" statement on filter(%s)", new Object[] {
                    jsonobject.toString()
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (AppConfig appconfig)
            {
                com.nielsen.app.sdk.c.a(3, 'E', "There should be \"%s\" on current filter(%s)", new Object[] {
                    "is", jsonobject.toString()
                });
            }
            return;
_L5:
            if (e.size() <= 0)
            {
                com.nielsen.app.sdk.c.a(3, 'E', "There should be at least one value on current condition(%s)", new Object[] {
                    JSONArray.this.toString()
                });
                return;
            }
            break MISSING_BLOCK_LABEL_386;
            com.nielsen.app.sdk.c.a(3, 'E', "There must be a \"cond\" statement on filter(%s)", new Object[] {
                jsonobject.toString()
            });
            return;
            Iterator iterator;
            String s2;
            String s5;
            try
            {
                appconfig = jsonobject.getJSONObject("then");
            }
            // Misplaced declaration of an exception variable
            catch (AppConfig appconfig)
            {
                com.nielsen.app.sdk.c.a(3, 'E', "There must be \"%s\" on filter declaration(%s)", new Object[] {
                    "then", jsonobject.toString()
                });
                return;
            }
            if (AppConfig.this == null)
            {
                break MISSING_BLOCK_LABEL_505;
            }
            for (iterator = keys(); iterator.hasNext(); h.put(s2, s5))
            {
                s2 = (String)iterator.next();
                s5 = getString(s2);
            }

            if (h.size() <= 0)
            {
                com.nielsen.app.sdk.c.a(3, 'E', "There should be at least one name/value on current object(%s)", new Object[] {
                    JSONObject.this.toString()
                });
                return;
            }
            break MISSING_BLOCK_LABEL_530;
            com.nielsen.app.sdk.c.a(3, 'E', "There must be a \"%s\" statement on filter(%s)", new Object[] {
                "then", jsonobject.toString()
            });
            return;
            appconfig = jsonobject.getJSONObject("else");
            if (AppConfig.this != null)
            {
                try
                {
                    String s3;
                    String s6;
                    for (Iterator iterator1 = keys(); iterator1.hasNext(); i.put(s3, s6))
                    {
                        s3 = (String)iterator1.next();
                        s6 = getString(s3);
                    }

                }
                // Misplaced declaration of an exception variable
                catch (AppConfig appconfig)
                {
                    try
                    {
                        com.nielsen.app.sdk.c.a(3, 'E', "Could not parse \"%s\" on filter(%s)", new Object[] {
                            "else", jsonobject.toString()
                        });
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (AppConfig appconfig) { }
                }
            }
            appconfig = jsonobject.getJSONObject("result");
            if (AppConfig.this != null)
            {
                try
                {
                    String s4;
                    String s7;
                    for (Iterator iterator2 = keys(); iterator2.hasNext(); j.put(s4, s7))
                    {
                        s4 = (String)iterator2.next();
                        s7 = getString(s4);
                    }

                }
                // Misplaced declaration of an exception variable
                catch (AppConfig appconfig)
                {
                    try
                    {
                        com.nielsen.app.sdk.c.a(3, 'E', "Could not parse \"%s\" on filter(%s)", new Object[] {
                            "result", jsonobject.toString()
                        });
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (AppConfig appconfig) { }
                }
            }
            b = true;
            return;
        }
    }

}
