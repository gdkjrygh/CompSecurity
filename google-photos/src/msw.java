// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class msw extends Enum
{

    private static msw A;
    private static msw B;
    private static msw C;
    private static msw D;
    private static msw E;
    private static msw F;
    private static msw G;
    private static msw H;
    private static msw I;
    private static msw J;
    private static msw K;
    private static msw L;
    private static msw M;
    private static msw N;
    private static msw O;
    private static msw P;
    private static msw Q;
    private static msw R;
    private static msw S;
    private static msw T;
    private static msw U;
    private static msw V;
    private static msw W;
    private static msw X;
    private static msw Y;
    private static msw Z;
    public static final msw a;
    private static msw aA;
    private static msw aB;
    private static msw aC;
    private static msw aD;
    private static msw aE;
    private static msw aF;
    private static msw aG;
    private static msw aH;
    private static msw aI;
    private static msw aJ;
    private static msw aK;
    private static msw aL;
    private static msw aM;
    private static msw aN;
    private static msw aO;
    private static msw aP;
    private static msw aQ;
    private static msw aR;
    private static msw aS;
    private static msw aT;
    private static msw aU;
    private static msw aV;
    private static msw aW;
    private static msw aX;
    private static msw aY;
    private static msw aZ;
    private static msw aa;
    private static msw ab;
    private static msw ac;
    private static msw ad;
    private static msw ae;
    private static msw af;
    private static msw ag;
    private static msw ah;
    private static msw ai;
    private static msw aj;
    private static msw ak;
    private static msw al;
    private static msw am;
    private static msw an;
    private static msw ao;
    private static msw ap;
    private static msw aq;
    private static msw ar;
    private static msw as;
    private static msw at;
    private static msw au;
    private static msw av;
    private static msw aw;
    private static msw ax;
    private static msw ay;
    private static msw az;
    private static msw b;
    private static msw ba;
    private static msw bb;
    private static msw bc;
    private static msw bd;
    private static msw be;
    private static final msw bh[];
    private static msw c;
    private static msw d;
    private static msw e;
    private static msw f;
    private static msw g;
    private static msw h;
    private static msw i;
    private static msw j;
    private static msw k;
    private static msw l;
    private static msw m;
    private static msw n;
    private static msw o;
    private static msw p;
    private static msw q;
    private static msw r;
    private static msw s;
    private static msw t;
    private static msw u;
    private static msw v;
    private static msw w;
    private static msw x;
    private static msw y;
    private static msw z;
    private final pvw bf;
    private final phl bg;

    private msw(String s1, int i1, String s2, Integer integer)
    {
        this(s1, i1, s2, integer, null);
    }

    private msw(String s1, int i1, String s2, Integer integer, Integer integer1)
    {
        super(s1, i1);
        bf = new pvw();
        bf.a = s2;
        bf.b = integer;
        if (integer1 != null)
        {
            bg = new phl();
            bg.a = integer1;
            return;
        } else
        {
            bg = null;
            return;
        }
    }

    public static msw valueOf(String s1)
    {
        return (msw)Enum.valueOf(msw, s1);
    }

    public static msw[] values()
    {
        return (msw[])bh.clone();
    }

    static 
    {
        b = new msw("HOME", 0, "str", Integer.valueOf(1));
        c = new msw("HOME_ALL_CIRCLES", 1, "str", Integer.valueOf(1), Integer.valueOf(1));
        d = new msw("HOME_SINGLE_CIRCLE", 2, "str", Integer.valueOf(1), Integer.valueOf(2));
        e = new msw("HOME_NEARBY", 3, "str", Integer.valueOf(1), Integer.valueOf(4));
        f = new msw("NOTIFICATIONS", 4, "str", Integer.valueOf(8));
        g = new msw("CIRCLE_PICKER", 5, "str", Integer.valueOf(10));
        h = new msw("EXPLORE_LANDING", 6, "xplr", Integer.valueOf(1));
        i = new msw("EXPLORE_TOPIC", 7, "xplr", Integer.valueOf(2));
        j = new msw("ABOUT", 8, "pr", Integer.valueOf(2));
        k = new msw("PHOTOS", 9, "pr", Integer.valueOf(3));
        l = new msw("VIDEOS", 10, "pr", Integer.valueOf(6));
        m = new msw("STREAM_VIEW", 11, "pr", Integer.valueOf(7));
        n = new msw("SEARCH_PEOPLE", 12, "pr", Integer.valueOf(10));
        o = new msw("REVIEWS", 13, "pr", Integer.valueOf(11));
        p = new msw("PERMA_LINK", 14, "pr", Integer.valueOf(12));
        q = new msw("WRITE_PLACE_REVIEW", 15, "pr", Integer.valueOf(13));
        r = new msw("GENERAL", 16, "Settings", Integer.valueOf(1));
        s = new msw("SYNC_CONTACTS", 17, "Settings", Integer.valueOf(10));
        t = new msw("CIRCLE_VIEW_PICKER", 18, "Settings", Integer.valueOf(11));
        u = new msw("INSTANT_UPLOAD", 19, "Settings", Integer.valueOf(12));
        v = new msw("PEOPLE", 20, "sg", Integer.valueOf(2));
        w = new msw("CIRCLE_PICKER_WIDGET", 21, "sg", Integer.valueOf(6));
        x = new msw("CIRCLES", 22, "sg", Integer.valueOf(7));
        y = new msw("CREATE_CIRCLE_VIEW", 23, "sg", Integer.valueOf(8));
        z = new msw("CIRCLE_MEMBERS", 24, "sg", Integer.valueOf(9));
        A = new msw("BLOCKED_CIRCLE", 25, "sg", Integer.valueOf(10));
        B = new msw("REMOVE_PEOPLE", 26, "sg", Integer.valueOf(11));
        C = new msw("DEVICE_SYNCED_CONTACTS_SUGGESTIONS", 27, "sg", Integer.valueOf(14));
        D = new msw("CIRCLE_SUGGESTIONS", 28, "sg", Integer.valueOf(16));
        E = new msw("PEOPLE_NOTIFICATIONS", 29, "sg", Integer.valueOf(17));
        F = new msw("FRIEND_SUGGESTIONS_VIEW", 30, "getstarted", Integer.valueOf(2));
        G = new msw("HANGOUT", 31, "h", Integer.valueOf(1));
        H = new msw("HANGOUT_START_NEW", 32, "h", Integer.valueOf(2));
        I = new msw("HANGOUT_PARTICIPANTS", 33, "h", Integer.valueOf(3));
        J = new msw("NOTIFICATIONS_WIDGET", 34, "nots", Integer.valueOf(1));
        K = new msw("NOTIFICATIONS_CIRCLE", 35, "nots", Integer.valueOf(2));
        L = new msw("NOTIFICATIONS_SYSTEM", 36, "nots", Integer.valueOf(3));
        M = new msw("PLUSONE", 37, "plusone", Integer.valueOf(1));
        N = new msw("PLATFORM_PLUS_ONE", 38, "plusone", Integer.valueOf(3));
        O = new msw("PLATFORM_THIRD_PARTY_APP", 39, "plusone", Integer.valueOf(2));
        P = new msw("EVENTS_HOME", 40, "oevt", Integer.valueOf(5));
        Q = new msw("LANDING_STREAM", 41, "oevt", Integer.valueOf(6));
        R = new msw("CREATE", 42, "oevt", Integer.valueOf(8));
        S = new msw("ATTENDEES", 43, "oevt", Integer.valueOf(9));
        T = new msw("SELECT_THEME", 44, "oevt", Integer.valueOf(10));
        U = new msw("OPTIONS", 45, "oevt", Integer.valueOf(11));
        V = new msw("SQUARE_LANDING", 46, "sq", Integer.valueOf(1));
        W = new msw("SQUARE_HOME", 47, "sq", Integer.valueOf(3));
        X = new msw("SQUARE_MEMBERS", 48, "sq", Integer.valueOf(4));
        Y = new msw("SQUARE_SEARCH", 49, "sq", Integer.valueOf(8));
        Z = new msw("MAIN_VIEW", 50, "oob", Integer.valueOf(1));
        aa = new msw("CAMERA_SYNC_VIEW", 51, "oob", Integer.valueOf(10));
        ab = new msw("PROFILE_SUSPENDED_VIEW", 52, "oob", Integer.valueOf(16));
        ac = new msw("ADD_PEOPLE_VIEW", 53, "oob", Integer.valueOf(18));
        ad = new msw("IMPROVE_CONTACTS_VIEW", 54, "oob", Integer.valueOf(19));
        ae = new msw("ADD_PROFILE_PHOTO_VIEW", 55, "oob", Integer.valueOf(20));
        af = new msw("ACCOUNT_PICKER_VIEW", 56, "oob", Integer.valueOf(22));
        ag = new msw("SEARCH_LANDING", 57, "se", Integer.valueOf(1));
        ah = new msw("UNKNOWN_VIEW", 58, "natapp", Integer.valueOf(0));
        ai = new msw("LEFT_NAV", 59, "natapp", Integer.valueOf(2));
        aj = new msw("THIRD_PARTY_APP_VIEW", 60, "natapp", Integer.valueOf(3));
        a = new msw("BACKGROUND", 61, "natapp", Integer.valueOf(4));
        ak = new msw("LOCATION_PLUS_MAP", 62, "lp", Integer.valueOf(1));
        al = new msw("LOCATION_PLUS_SHARING_SETTINGS", 63, "lp", Integer.valueOf(2));
        am = new msw("LOCATION_PLUS_FILTERING_SETTINGS", 64, "lp", Integer.valueOf(3));
        an = new msw("LOCATION_PLUS_LIST_SHARING_WITH_ME", 65, "lp", Integer.valueOf(4));
        ao = new msw("LOCATION_PLUS_WIDGET", 66, "lp", Integer.valueOf(5));
        ap = new msw("LOCATION_PLUS_NOTIFICATION", 67, "lp", Integer.valueOf(6));
        aq = new msw("LOCATION_PLUS_ONBOARDING", 68, "lp", Integer.valueOf(7));
        ar = new msw("LOCATION_PLUS_OPT_IN", 69, "lp", Integer.valueOf(8));
        as = new msw("SHAREBOX", 70, "ttn", Integer.valueOf(1));
        at = new msw("ACLWIDGET", 71, "ttn", Integer.valueOf(2));
        au = new msw("LOCATION", 72, "ttn", Integer.valueOf(3));
        av = new msw("CONTACTS_ACL_WIDGET", 73, "ttn", Integer.valueOf(4));
        aw = new msw("COMMENT_WIDGET", 74, "ttn", Integer.valueOf(5));
        ax = new msw("ALBUM_EDIT_VIEW", 75, "phst", Integer.valueOf(44));
        ay = new msw("HIGHLIGHTS", 76, "phst", Integer.valueOf(47));
        az = new msw("YOUR_PHOTOS", 77, "phst", Integer.valueOf(41));
        aA = new msw("ALL_PHOTOS", 78, "phst", Integer.valueOf(22));
        aB = new msw("ALBUM", 79, "phst", Integer.valueOf(4));
        aC = new msw("PHOTO", 80, "phst", Integer.valueOf(5));
        aD = new msw("TAG_MODE", 81, "phst", Integer.valueOf(50));
        aE = new msw("CAMERA_ROLL", 82, "phst", Integer.valueOf(53));
        aF = new msw("VIDEO", 83, "phst", Integer.valueOf(27));
        aG = new msw("CROP", 84, "phst", Integer.valueOf(28));
        aH = new msw("FILTER_EXPLORER", 85, "phst", Integer.valueOf(54));
        aI = new msw("APP_SHARE", 86, "phst", Integer.valueOf(58));
        aJ = new msw("APP_SHARE_PEOPLE", 87, "phst", Integer.valueOf(59));
        aK = new msw("APP_SHARE_CIRCLES", 88, "phst", Integer.valueOf(60));
        aL = new msw("LOCAL_FOLDERS", 89, "phst", Integer.valueOf(55));
        aM = new msw("LOCAL_FOLDER_PHOTOS", 90, "phst", Integer.valueOf(56));
        aN = new msw("AUTO_AWESOME_FOLDER", 91, "phst", Integer.valueOf(62));
        aO = new msw("VIDEO_FOLDER", 92, "phst", Integer.valueOf(61));
        aP = new msw("TRASH_FOLDER", 93, "phst", Integer.valueOf(57));
        aQ = new msw("PHOTOS_OF_USER", 94, "phst", Integer.valueOf(8));
        aR = new msw("EDIT_MODE", 95, "phst", Integer.valueOf(51));
        aS = new msw("ALL_ALBUMS", 96, "phst", Integer.valueOf(63));
        aT = new msw("ALBUM_PICKER", 97, "phst", Integer.valueOf(52));
        aU = new msw("PHOTO_PICKER", 98, "phst", Integer.valueOf(29));
        aV = new msw("HOME_TAB_LOCAL", 99, "phst", Integer.valueOf(64));
        aW = new msw("HOME_TAB_HIGHLIGHTS", 100, "phst", Integer.valueOf(65));
        aX = new msw("HOME_TAB_AUTO_AWESOME", 101, "phst", Integer.valueOf(66));
        aY = new msw("HOME_TAB_VIDEOS", 102, "phst", Integer.valueOf(67));
        aZ = new msw("HOME_TAB_ALL_PHOTOS", 103, "phst", Integer.valueOf(68));
        ba = new msw("HOME_TAB_ASSISTANT", 104, "phst", Integer.valueOf(71));
        bb = new msw("HOME_TAB_COMPILATION_LIST", 105, "phst", Integer.valueOf(72));
        bc = new msw("DOWNLOAD_PHOTOS_APP_PROMO", 106, "phst", Integer.valueOf(73));
        bd = new msw("STORIES_LIST", 107, "phst", Integer.valueOf(70));
        be = new msw("STORIES_STORY", 108, "boz", Integer.valueOf(2));
        bh = (new msw[] {
            b, c, d, e, f, g, h, i, j, k, 
            l, m, n, o, p, q, r, s, t, u, 
            v, w, x, y, z, A, B, C, D, E, 
            F, G, H, I, J, K, L, M, N, O, 
            P, Q, R, S, T, U, V, W, X, Y, 
            Z, aa, ab, ac, ad, ae, af, ag, ah, ai, 
            aj, a, ak, al, am, an, ao, ap, aq, ar, 
            as, at, au, av, aw, ax, ay, az, aA, aB, 
            aC, aD, aE, aF, aG, aH, aI, aJ, aK, aL, 
            aM, aN, aO, aP, aQ, aR, aS, aT, aU, aV, 
            aW, aX, aY, aZ, ba, bb, bc, bd, be
        });
    }
}
