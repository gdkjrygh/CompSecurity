// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kse extends Enum
{

    public static final kse A;
    public static final kse B;
    public static final kse C;
    public static final kse D;
    public static final kse E;
    public static final kse F;
    public static final kse G;
    public static final kse H;
    public static final kse I;
    public static final kse J;
    public static final kse K;
    public static final kse L;
    public static final kse M;
    public static final kse N;
    public static final kse O;
    public static final kse P;
    public static final kse Q;
    public static final kse R;
    private static kse S;
    private static kse T;
    private static kse U;
    private static kse V;
    private static kse W;
    private static kse X;
    private static kse Y;
    private static kse Z;
    public static final kse a;
    private static kse aA;
    private static kse aB;
    private static kse aC;
    private static kse aD;
    private static kse aE;
    private static kse aF;
    private static kse aG;
    private static kse aH;
    private static kse aI;
    private static kse aJ;
    private static kse aK;
    private static kse aL;
    private static kse aM;
    private static kse aN;
    private static kse aO;
    private static kse aP;
    private static kse aQ;
    private static kse aR;
    private static kse aS;
    private static kse aT;
    private static kse aU;
    private static kse aV;
    private static kse aW;
    private static kse aX;
    private static kse aY;
    private static kse aZ;
    private static kse aa;
    private static kse ab;
    private static kse ac;
    private static kse ad;
    private static kse ae;
    private static kse af;
    private static kse ag;
    private static kse ah;
    private static kse ai;
    private static kse aj;
    private static kse ak;
    private static kse al;
    private static kse am;
    private static kse an;
    private static kse ao;
    private static kse ap;
    private static kse aq;
    private static kse ar;
    private static kse as;
    private static kse at;
    private static kse au;
    private static kse av;
    private static kse aw;
    private static kse ax;
    private static kse ay;
    private static kse az;
    public static final kse b;
    private static kse ba;
    private static kse bb;
    private static kse bc;
    private static kse bd;
    private static final kse bf[];
    public static final kse c;
    public static final kse d;
    public static final kse e;
    public static final kse f;
    public static final kse g;
    public static final kse h;
    public static final kse i;
    public static final kse j;
    public static final kse k;
    public static final kse l;
    public static final kse m;
    public static final kse n;
    public static final kse o;
    public static final kse p;
    public static final kse q;
    public static final kse r;
    public static final kse s;
    public static final kse t;
    public static final kse u;
    public static final kse v;
    public static final kse w;
    public static final kse x;
    public static final kse y;
    public static final kse z;
    private final String be;

    private kse(String s1, int i1, String s2)
    {
        super(s1, i1);
        be = s2;
    }

    public static kse valueOf(String s1)
    {
        return (kse)Enum.valueOf(kse, s1);
    }

    public static kse[] values()
    {
        return (kse[])bf.clone();
    }

    public final String toString()
    {
        return be;
    }

    static 
    {
        a = new kse("ADVERTISER_ID", 0, "_aid");
        b = new kse("ADVERTISING_TRACKING_ENABLED", 1, "_ate");
        c = new kse("APP_ID", 2, "_ai");
        d = new kse("APP_NAME", 3, "_an");
        e = new kse("APP_VERSION", 4, "_av");
        S = new kse("ARBITRARY_JAVASCRIPT", 5, "_jsm");
        f = new kse("CONSTANT", 6, "_c");
        T = new kse("COOKIE", 7, "_k");
        g = new kse("CUSTOM_VAR", 8, "_v");
        h = new kse("CONTAINER_VERSION", 9, "_ctv");
        U = new kse("DEBUG_MODE", 10, "_dbg");
        i = new kse("DEVICE_NAME", 11, "_dn");
        V = new kse("DEVICE_TYPE", 12, "_dt");
        W = new kse("DOM_ELEMENT", 13, "_d");
        X = new kse("ELEMENT_TEXT", 14, "_et");
        Y = new kse("ELEMENT_URL", 15, "_eu");
        j = new kse("EVENT", 16, "_e");
        k = new kse("FUNCTION_CALL", 17, "_func");
        Z = new kse("JS_GLOBAL", 18, "_j");
        l = new kse("LANGUAGE", 19, "_l");
        m = new kse("OS_VERSION", 20, "_ov");
        n = new kse("PLATFORM", 21, "_p");
        o = new kse("RANDOM", 22, "_r");
        aa = new kse("REFERRER", 23, "_f");
        p = new kse("RESOLUTION", 24, "_rs");
        q = new kse("RUNTIME_VERSION", 25, "_rv");
        r = new kse("SDK_VERSION", 26, "_sv");
        ab = new kse("SIMPLE_MAP", 27, "_smm");
        s = new kse("TIME", 28, "_t");
        ac = new kse("URL", 29, "_u");
        t = new kse("ADWORDS_CLICK_REFERRER", 30, "_awcr");
        u = new kse("DEVICE_ID", 31, "_did");
        v = new kse("ENCODE", 32, "_enc");
        w = new kse("GTM_VERSION", 33, "_gtmv");
        x = new kse("HASH", 34, "_hsh");
        y = new kse("INSTALL_REFERRER", 35, "_ir");
        z = new kse("JOINER", 36, "_jn");
        A = new kse("MOBILE_ADWORDS_UNIQUE_ID", 37, "_awid");
        B = new kse("REGEX_GROUP", 38, "_reg");
        C = new kse("DATA_LAYER_WRITE", 39, "_dlw");
        D = new kse("LOWERCASE_STRING", 40, "_ls");
        E = new kse("UPPERCASE_STRING", 41, "_us");
        ad = new kse("EXPERIMENT_ENABLED", 42, "_ee");
        ae = new kse("IN_EXPERIMENT", 43, "_ie");
        af = new kse("EXPERIMENT_VARIATION_INDEX", 44, "_evi");
        ag = new kse("AUDIENCE_LISTS", 45, "_aud");
        ah = new kse("CSS_SELECTOR", 46, "_sel");
        ai = new kse("GA_CLIENT_ID", 47, "_gacid");
        aj = new kse("PRODUCT_SETTING_PROPERTY", 48, "_prodset");
        ak = new kse("GA_OPT_OUT_CLIENT", 49, "_gaoo_c");
        al = new kse("GA_OPT_OUT_SERVER", 50, "_gaoo_s");
        F = new kse("REGEX", 51, "_re");
        G = new kse("STARTS_WITH", 52, "_sw");
        H = new kse("ENDS_WITH", 53, "_ew");
        I = new kse("CONTAINS", 54, "_cn");
        J = new kse("EQUALS", 55, "_eq");
        K = new kse("LESS_THAN", 56, "_lt");
        L = new kse("LESS_EQUALS", 57, "_le");
        M = new kse("GREATER_THAN", 58, "_gt");
        N = new kse("GREATER_EQUALS", 59, "_ge");
        am = new kse("CSS_SELECTOR_PREDICATE", 60, "_css");
        O = new kse("ARBITRARY_PIXEL", 61, "_img");
        an = new kse("ARBITRARY_HTML", 62, "_html");
        ao = new kse("GOOGLE_TAG_MANAGER", 63, "_gtm");
        ap = new kse("GOOGLE_ANALYTICS", 64, "_ga");
        aq = new kse("ADWORDS_CONVERSION", 65, "_awct");
        ar = new kse("SMART_PIXEL", 66, "_sp");
        as = new kse("FLOODLIGHT_COUNTER", 67, "_flc");
        at = new kse("FLOODLIGHT_SALES", 68, "_fls");
        au = new kse("BIZO_INSIGHT", 69, "_bzi");
        av = new kse("QUANTCAST_MEASUREMENT", 70, "_qcm");
        aw = new kse("TARGUS_ADVISOR", 71, "_ta");
        ax = new kse("MEDIAPLEX_ROI", 72, "_mpr");
        ay = new kse("COMSCORE_MEASUREMENT", 73, "_csm");
        az = new kse("TURN_CONVERSION", 74, "_tc");
        aA = new kse("TURN_DATA_COLLECTION", 75, "_tdc");
        aB = new kse("MEDIA6DEGREES_UNIVERSAL_PIXEL", 76, "_m6d");
        P = new kse("UNIVERSAL_ANALYTICS", 77, "_ua");
        aC = new kse("MEDIAPLEX_MCT", 78, "_mpm");
        aD = new kse("VISUAL_DNA_CONVERSION", 79, "_vdc");
        aE = new kse("GOOGLE_AFFILIATE_NETWORK", 80, "_gan");
        aF = new kse("MARIN_SOFTWARE", 81, "_ms");
        aG = new kse("ADROLL_SMART_PIXEL", 82, "_asp");
        aH = new kse("CONFIGURATION_VALUE", 83, "_cv");
        aI = new kse("CRITEO", 84, "_crt");
        aJ = new kse("TRUSTED_STORES", 85, "_ts");
        aK = new kse("CLICK_TALE_STANDARD", 86, "_cts");
        aL = new kse("LINK_CLICK_LISTENER", 87, "_lcl");
        aM = new kse("FORM_SUBMIT_LISTENER", 88, "_fsl");
        Q = new kse("TIMER_LISTENER", 89, "_tl");
        aN = new kse("CLICK_LISTENER", 90, "_cl");
        aO = new kse("JS_ERROR_LISTENER", 91, "_jel");
        aP = new kse("HISTORY_LISTENER", 92, "_hl");
        aQ = new kse("AJAX_SUBMIT_LISTENER", 93, "_ajl");
        aR = new kse("YOU_TUBE_LISTENER", 94, "_ytl");
        aS = new kse("ELEMENT_ATTRIBUTE", 95, "_ea");
        aT = new kse("ELEMENT_CONTENT", 96, "_ec");
        aU = new kse("ELEMENT_MOVE", 97, "_em");
        aV = new kse("ELEMENT_SCRIPT", 98, "_esc");
        aW = new kse("ELEMENT_STYLE", 99, "_est");
        aX = new kse("ELEMENT_TEXT_TAG", 100, "_etx");
        aY = new kse("ORDERED_LIST", 101, "_ol");
        aZ = new kse("UNIVERSAL_ANALYTICS_EXPERIMENT", 102, "_uae");
        ba = new kse("GOOGLE_ANALYTICS_GLOBAL", 103, "_gag");
        bb = new kse("ADOMETRY", 104, "_adm");
        bc = new kse("ADWORDS_APP_USAGE_TRACKING", 105, "_awut");
        bd = new kse("PAGE_REDIRECT", 106, "_pr");
        R = new kse("APP_VERSION_NAME", 107, "_avn");
        bf = (new kse[] {
            a, b, c, d, e, S, f, T, g, h, 
            U, i, V, W, X, Y, j, k, Z, l, 
            m, n, o, aa, p, q, r, ab, s, ac, 
            t, u, v, w, x, y, z, A, B, C, 
            D, E, ad, ae, af, ag, ah, ai, aj, ak, 
            al, F, G, H, I, J, K, L, M, N, 
            am, O, an, ao, ap, aq, ar, as, at, au, 
            av, aw, ax, ay, az, aA, aB, P, aC, aD, 
            aE, aF, aG, aH, aI, aJ, aK, aL, aM, Q, 
            aN, aO, aP, aQ, aR, aS, aT, aU, aV, aW, 
            aX, aY, aZ, ba, bb, bc, bd, R
        });
    }
}
