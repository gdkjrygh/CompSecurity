// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;


public interface cb
{
    public static final class a extends Enum
    {

        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;
        public static final a U;
        public static final a V;
        public static final a W;
        public static final a X;
        public static final a Y;
        public static final a Z;
        public static final a a;
        public static final a aA;
        public static final a aB;
        public static final a aC;
        public static final a aD;
        public static final a aE;
        public static final a aF;
        public static final a aG;
        public static final a aH;
        public static final a aI;
        public static final a aJ;
        public static final a aK;
        public static final a aL;
        public static final a aM;
        public static final a aN;
        public static final a aO;
        public static final a aP;
        public static final a aQ;
        public static final a aR;
        public static final a aS;
        public static final a aT;
        public static final a aU;
        public static final a aV;
        public static final a aW;
        public static final a aX;
        public static final a aY;
        public static final a aZ;
        public static final a aa;
        public static final a ab;
        public static final a ac;
        public static final a ad;
        public static final a ae;
        public static final a af;
        public static final a ag;
        public static final a ah;
        public static final a ai;
        public static final a aj;
        public static final a ak;
        public static final a al;
        public static final a am;
        public static final a an;
        public static final a ao;
        public static final a ap;
        public static final a aq;
        public static final a ar;
        public static final a as;
        public static final a at;
        public static final a au;
        public static final a av;
        public static final a aw;
        public static final a ax;
        public static final a ay;
        public static final a az;
        public static final a b;
        public static final a bA;
        public static final a bB;
        public static final a bC;
        public static final a bD;
        public static final a bE;
        public static final a bF;
        public static final a bG;
        public static final a bH;
        public static final a bI;
        public static final a bJ;
        public static final a bK;
        public static final a bL;
        public static final a bM;
        public static final a bN;
        public static final a bO;
        public static final a bP;
        public static final a bQ;
        public static final a bR;
        public static final a bS;
        public static final a bT;
        public static final a bU;
        public static final a bV;
        public static final a bW;
        public static final a bX;
        public static final a bY;
        public static final a bZ;
        public static final a ba;
        public static final a bb;
        public static final a bc;
        public static final a bd;
        public static final a be;
        public static final a bf;
        public static final a bg;
        public static final a bh;
        public static final a bi;
        public static final a bj;
        public static final a bk;
        public static final a bl;
        public static final a bm;
        public static final a bn;
        public static final a bo;
        public static final a bp;
        public static final a bq;
        public static final a br;
        public static final a bs;
        public static final a bt;
        public static final a bu;
        public static final a bv;
        public static final a bw;
        public static final a bx;
        public static final a by;
        public static final a bz;
        public static final a c;
        private static a cA;
        private static a cB;
        private static a cC;
        private static a cD;
        private static a cE;
        private static a cF;
        private static a cG;
        private static a cH;
        private static a cI;
        private static a cJ;
        private static a cK;
        private static a cL;
        private static final a cM[];
        public static final a ca;
        public static final a cb;
        public static final a cc;
        public static final a cd;
        public static final a ce;
        public static final a cf;
        public static final a cg;
        public static final a ch;
        private static a ck;
        private static a cl;
        private static a cm;
        private static a cn;
        private static a co;
        private static a cp;
        private static a cq;
        private static a cr;
        private static a cs;
        private static a ct;
        private static a cu;
        private static a cv;
        private static a cw;
        private static a cx;
        private static a cy;
        private static a cz;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        public static final a k;
        public static final a l;
        public static final a m;
        public static final a n;
        public static final a o;
        public static final a p;
        public static final a q;
        public static final a r;
        public static final a s;
        public static final a t;
        public static final a u;
        public static final a v;
        public static final a w;
        public static final a x;
        public static final a y;
        public static final a z;
        public final String ci;
        public final int cj;

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/google/android/m4b/maps/cg/cb$a, s1);
        }

        public static a[] values()
        {
            return (a[])cM.clone();
        }

        static 
        {
            a = new a("MAP_CREATED", 0, "mc", 100);
            ck = new a("MAP_SET_ZOOM_LIMIT", 1, "mz", 101);
            b = new a("MAP_SET_ON_MAP_READY_CALLBACK", 2, "mrc", 102);
            c = new a("MAP_ADD_MARKER", 3, "ma", 200);
            d = new a("MARKER_REMOVE", 4, "mr", 201);
            e = new a("MARKER_SET_POSITION", 5, "mp", 202);
            f = new a("MARKER_TITLE", 6, "mt", 203);
            g = new a("MARKER_SNIPPET", 7, "ms", 204);
            h = new a("MARKER_ICON", 8, "mI", 205);
            i = new a("MARKER_ANCHOR", 9, "mA", 206);
            j = new a("MARKER_DRAGGABLE", 10, "md", 207);
            cl = new a("MARKER_WAS_DRAGGED", 11, "mdw", 208);
            k = new a("MARKER_VISIBILITY", 12, "mv", 209);
            l = new a("MARKER_FLAT", 13, "mF", 210);
            m = new a("MARKER_ROTATION", 14, "mR", 211);
            n = new a("MARKER_INFO_WINDOW_ANCHOR", 15, "miA", 212);
            o = new a("MARKER_ALPHA", 16, "mo", 213);
            p = new a("MARKER_SHOW_INFO_BUBBLE", 17, "mb", 214);
            q = new a("MARKER_HIDE_INFO_BUBBLE", 18, "mh", 215);
            r = new a("MARKER_SET_INFO_CONTENTS_ADAPTER", 19, "mi", 216);
            s = new a("MARKER_INFO_WINDOW_CLICK_WITH_LISTENER", 20, "micwl", 217);
            t = new a("MARKER_INFO_WINDOW_CLICK_WITHOUT_LISTENER", 21, "micwol", 218);
            u = new a("MARKER_CLICK_WITH_LISTENER", 22, "mcwl", 219);
            v = new a("MARKER_CLICK_WITH_INTERRUPTING_LISTENER", 23, "mcwil", 220);
            w = new a("MARKER_CLICK_WITHOUT_LISTENER", 24, "mcwol", 221);
            cm = new a("OBSOLETE_MARKER_SHOW_INFO_BUBBLE_CONTENTS", 25, "mB", 222);
            x = new a("MAP_ADD_POLYLINE", 26, "la", 300);
            y = new a("POLYLINE_REMOVE", 27, "lr", 301);
            z = new a("POLYLINE_SET_POINTS", 28, "lp", 302);
            A = new a("POLYLINE_WIDTH", 29, "lw", 303);
            B = new a("POLYLINE_COLOR", 30, "lc", 304);
            C = new a("POLYLINE_Z_INDEX", 31, "lz", 305);
            D = new a("POLYLINE_VISIBILITY", 32, "lv", 306);
            E = new a("POLYLINE_GEODESIC", 33, "lg", 307);
            cn = new a("POLYLINE_TEXTURE", 34, "lt", 308);
            co = new a("POLYLINE_SPANS", 35, "ls", 309);
            cp = new a("POLYLINE_SPANS_GRADIENT", 36, "lsG", 310);
            cq = new a("POLYLINE_SPANS_FRACTIONAL", 37, "lsF", 311);
            F = new a("MAP_ADD_POLYGON", 38, "sa", 400);
            G = new a("POLYGON_REMOVE", 39, "sr", 401);
            H = new a("POLYGON_SET_POINTS", 40, "sp", 402);
            I = new a("POLYGON_HOLES", 41, "sh", 403);
            J = new a("POLYGON_WIDTH", 42, "sw", 404);
            K = new a("POLYGON_STROKE_COLOR", 43, "sc", 405);
            L = new a("POLYGON_FILL_COLOR", 44, "sC", 406);
            M = new a("POLYGON_Z_INDEX", 45, "sz", 407);
            N = new a("POLYGON_VISIBILITY", 46, "sv", 408);
            O = new a("POLYGON_GEODESIC", 47, "sg", 409);
            P = new a("MAP_ADD_CIRCLE", 48, "cia", 500);
            Q = new a("CIRCLE_REMOVE", 49, "cir", 501);
            R = new a("CIRCLE_SET_CENTER", 50, "cip", 502);
            S = new a("CIRCLE_SET_RADIUS", 51, "cis", 503);
            T = new a("CIRCLE_WIDTH", 52, "ciw", 504);
            U = new a("CIRCLE_STROKE_COLOR", 53, "cic", 505);
            V = new a("CIRCLE_FILL_COLOR", 54, "ciC", 506);
            W = new a("CIRCLE_Z_INDEX", 55, "ciz", 507);
            X = new a("CIRCLE_VISIBILITY", 56, "civ", 508);
            Y = new a("MAP_ADD_GROUND_OVERLAY", 57, "ga", 600);
            Z = new a("GROUND_OVERLAY_REMOVE", 58, "gr", 601);
            aa = new a("GROUND_OVERLAY_BEARING", 59, "gb", 602);
            ab = new a("GROUND_OVERLAY_SET_DIMENSIONS", 60, "gd", 603);
            ac = new a("GROUND_OVERLAY_SET_LOCATION", 61, "gl", 604);
            ad = new a("GROUND_OVERLAY_Z_INDEX", 62, "gz", 605);
            ae = new a("GROUND_OVERLAY_VISIBILITY", 63, "gv", 606);
            af = new a("GROUND_OVERLAY_TRANSPARENCY", 64, "gt", 607);
            ag = new a("GROUND_OVERLAY_SET_IMAGE", 65, "gi", 608);
            ah = new a("MAP_ADD_TILE_OVERLAY", 66, "ta", 700);
            ai = new a("TILE_OVERLAY_CLEAR_CACHE", 67, "tc", 701);
            cr = new a("TILE_OVERLAY_REMOVE", 68, "tr", 702);
            aj = new a("TILE_OVERLAY_Z_INDEX", 69, "tz", 703);
            ak = new a("TILE_OVERLAY_VISIBILITY", 70, "tv", 704);
            al = new a("TILE_OVERLAY_FADE", 71, "tf", 705);
            cs = new a("MAP_ADD_MAPS_ENGINE_OVERLAY", 72, "mea", 800);
            ct = new a("MAPS_ENGINE_OVERLAY_REMOVE", 73, "mer", 801);
            am = new a("MAPS_ENGINE_OVERLAY_Z_INDEX", 74, "mez", 802);
            an = new a("MAPS_ENGINE_OVERLAY_VISIBILITY", 75, "mev", 803);
            ao = new a("MAPS_ENGINE_OVERLAY_DEFAULT_UI", 76, "meu", 804);
            ap = new a("MAPS_ENGINE_OVERLAY_CLICK_LISTENER", 77, "mel", 805);
            aq = new a("MAP_ANIMATE_CAMERA", 78, "ca", 900);
            ar = new a("MAP_ANIMATE_CAMERA_WITH_CALLBACK", 79, "cac", 901);
            as = new a("MAP_ANIMATE_CAMERA_WITH_CALLBACK_AND_CUSTOM_DURATION", 80, "cad", 902);
            at = new a("MAP_MOVE_CAMERA", 81, "cm", 903);
            au = new a("MAP_STOP_ANIMATION", 82, "cs", 904);
            av = new a("CAMERA_UPDATE_ZOOM_IN", 83, "Czi", 1000);
            aw = new a("CAMERA_UPDATE_ZOOM_OUT", 84, "Czo", 1001);
            ax = new a("CAMERA_UPDATE_SCROLL_BY", 85, "Cs", 1002);
            ay = new a("CAMERA_UPDATE_ZOOM_TO", 86, "Czt", 1003);
            az = new a("CAMERA_UPDATE_ZOOM_BY", 87, "Czb", 1004);
            aA = new a("CAMERA_UPDATE_ZOOM_BY_FIXING", 88, "Czf", 1005);
            aB = new a("CAMERA_UPDATE_NEW_CAMERA_POSITION", 89, "Ccp", 1006);
            aC = new a("CAMERA_UPDATE_NEW_LATLNG", 90, "Cl", 1007);
            aD = new a("CAMERA_UPDATE_NEW_LATLNG_ZOOM", 91, "Clz", 1008);
            aE = new a("CAMERA_UPDATE_NEW_LATLNG_BOUNDS", 92, "Clb", 1009);
            aF = new a("CAMERA_UPDATE_NEW_LATLNG_BOUNDS_WITH_DIMENSIONS", 93, "Cld", 1010);
            aG = new a("MAP_CLEAR", 94, "oc", 1100);
            aH = new a("MAP_SET_MAP_TYPE", 95, "ot", 1101);
            aI = new a("MAP_SET_TRAFFIC_DISABLED", 96, "oTd", 1102);
            aJ = new a("MAP_SET_TRAFFIC_ENABLED", 97, "oT", 1103);
            cu = new a("MAP_SET_TRANSIT_DISABLED", 98, "oTsd", 1104);
            cv = new a("MAP_SET_TRANSIT_ENABLED", 99, "oTs", 1105);
            aK = new a("MAP_SET_MY_LOCATION_DISABLED", 100, "omd", 1106);
            aL = new a("MAP_SET_MY_LOCATION_ENABLED", 101, "om", 1107);
            aM = new a("MAP_SET_BUILDINGS_DISABLED", 102, "obd", 1108);
            aN = new a("MAP_SET_BUILDINGS_ENABLED", 103, "ob", 1109);
            aO = new a("MAP_CLEAR_LOCATION_SOURCE", 104, "Lc", 1200);
            cw = new a("MAP_GET_MY_LOCATION", 105, "Lg", 1201);
            aP = new a("MAP_SET_LOCATION_SOURCE", 106, "Lp", 1202);
            aQ = new a("MAP_SET_ON_MY_LOCATION_CHANGE_LISTENER", 107, "Ll", 1203);
            aR = new a("MAP_SET_ON_MY_LOCATION_BUTTON_CLICK_LISTENER", 108, "Lbl", 1204);
            aS = new a("MAP_SET_ON_BUBBLE_CLICK_LISTENER", 109, "eb", 1300);
            cx = new a("MAP_SET_ON_BUBBLE_DOUBLE_CLICK_LISTENER", 110, "eB", 1301);
            aT = new a("MAP_SET_ON_CAMERA_CHANGE_LISTENER", 111, "ec", 1302);
            aU = new a("MAP_SET_ON_INDOOR_LISTENER", 112, "ei", 1303);
            cy = new a("OBSOLETE_MAP_SET_ON_MAP_GESTURE_LISTENER", 113, "eg", 1304);
            aV = new a("MAP_SET_ON_MAP_CLICK_LISTENER", 114, "emc", 1305);
            aW = new a("MAP_SET_ON_MAP_LONG_CLICK_LISTENER", 115, "eml", 1306);
            aX = new a("MAP_SET_ON_MARKER_CLICK_LISTENER", 116, "em", 1307);
            aY = new a("MAP_SET_ON_MARKER_DRAG_LISTENER", 117, "ed", 1308);
            aZ = new a("MAP_SET_ON_MAP_IDLE_LISTENER", 118, "el", 1309);
            ba = new a("COMPASS_BUTTON_CLICK", 119, "uC", 1400);
            bb = new a("MAP_DISABLE_COMPASS", 120, "uch", 1401);
            bc = new a("MAP_DISABLE_MY_LOCATION_BUTTON", 121, "uLh", 1402);
            bd = new a("MAP_DISABLE_ZOOM_CONTROLS", 122, "uzh", 1403);
            be = new a("MAP_ENABLE_COMPASS", 123, "uc", 1404);
            bf = new a("MAP_ENABLE_MY_LOCATION_BUTTON", 124, "uL", 1405);
            bg = new a("MAP_ENABLE_ZOOM_CONTROLS", 125, "uz", 1406);
            bh = new a("MY_LOCATION_BUTTON_CLICK", 126, "ul", 1407);
            cz = new a("GOOGLE_LOGO_CLICK", 127, "uG", 1408);
            bi = new a("ZOOM_IN_BUTTON_CLICK", 128, "ui", 1409);
            bj = new a("ZOOM_OUT_BUTTON_CLICK", 129, "uo", 1410);
            bk = new a("MAP_ENABLE_SCROLL", 130, "use", 1411);
            bl = new a("MAP_DISABLE_SCROLL", 131, "usd", 1412);
            bm = new a("MAP_ENABLE_ZOOM", 132, "uze", 1413);
            bn = new a("MAP_DISABLE_ZOOM", 133, "uzd", 1414);
            bo = new a("MAP_ENABLE_ROTATE", 134, "ure", 1415);
            bp = new a("MAP_DISABLE_ROTATE", 135, "urd", 1416);
            bq = new a("MAP_ENABLE_TILT", 136, "ute", 1417);
            br = new a("MAP_DISABLE_TILT", 137, "utd", 1418);
            bs = new a("MAP_ENABLE_ALL_GESTURES", 138, "uae", 1419);
            bt = new a("MAP_DISABLE_ALL_GESTURES", 139, "uad", 1420);
            bu = new a("MAP_ENABLE_MAP_TOOLBAR", 140, "ub", 1421);
            bv = new a("MAP_DISABLE_MAP_TOOLBAR", 141, "ubh", 1422);
            cA = new a("MAP_SET_INFO_WINDOW", 142, "uiw", 1500);
            cB = new a("MAP_GET_PROJECTION", 143, "pg", 1600);
            bw = new a("PROJECTION_FROM_SCREEN_LOCATION", 144, "pl", 1601);
            bx = new a("PROJECTION_GET_FRUSTUM", 145, "pf", 1602);
            by = new a("PROJECTION_TO_SCREEN_LOCATION", 146, "ps", 1603);
            cC = new a("KEYBOARD_UP", 147, "ku", 1700);
            cD = new a("KEYBOARD_DOWN", 148, "kd", 1701);
            cE = new a("KEYBOARD_LEFT", 149, "kl", 1702);
            cF = new a("KEYBOARD_RIGHT", 150, "kr", 1703);
            bz = new a("MAP_ENABLE_INDOOR", 151, "ie", 1800);
            bA = new a("MAP_DISABLE_INDOOR", 152, "id", 1801);
            bB = new a("MAP_ENABLE_INDOOR_LEVEL_PICKER", 153, "iep", 1802);
            bC = new a("MAP_DISABLE_INDOOR_LEVEL_PICKER", 154, "idp", 1803);
            bD = new a("INDOOR_ACTIVATE_LEVEL", 155, "isa", 1804);
            bE = new a("INDOOR_GET_ACTIVE_LEVEL", 156, "ia", 1805);
            bF = new a("INDOOR_GET_FOCUSED_BULIDING", 157, "if", 1806);
            cG = new a("INDOOR_GET_LEVELS", 158, "il", 1807);
            cH = new a("INDOOR_GET_VISIBLE_BUILDINGS", 159, "iv", 1808);
            bG = new a("INDOOR_GET_DEFAULT_LEVEL", 160, "ix", 1809);
            bH = new a("INDOOR_IS_UNDERGROUND", 161, "iu", 1810);
            cI = new a("MAP_REQUEST_TILE_PREFETCH_AREA", 162, "ra", 1900);
            bI = new a("MAP_SNAPSHOT", 163, "Sn", 2000);
            bJ = new a("MAP_SNAPSHOT_ALLOCATED_BITMAP", 164, "SN", 2001);
            bK = new a("PANORAMA_CREATED", 165, "pc", 2100);
            cJ = new a("PANORAMA_ADD_MARKER", 166, "pma", 2101);
            cK = new a("PANORAMA_REMOVE_MARKER", 167, "pmr", 2102);
            bL = new a("PANORAMA_ENABLE_ZOOM", 168, "pez", 2103);
            bM = new a("PANORAMA_ENABLE_PANNING", 169, "pep", 2104);
            bN = new a("PANORAMA_ENABLE_NAVIGATION", 170, "pen", 2105);
            bO = new a("PANORAMA_ENABLE_STREET_NAMES", 171, "pes", 2106);
            bP = new a("PANORAMA_ANIMATE_TO", 172, "pat", 2107);
            bQ = new a("PANORAMA_SET_POSITION_WITH_ID", 173, "ppi", 2108);
            bR = new a("PANORAMA_SET_POSITION", 174, "psp", 2109);
            bS = new a("PANORAMA_SET_POSITION_WITH_RADIUS", 175, "ppr", 2110);
            bT = new a("PANORAMA_SET_CHANGE_LISTENER", 176, "pcl", 2111);
            bU = new a("PANORAMA_SET_CAMERA_CHANGE_LISTENER", 177, "pccl", 2112);
            bV = new a("PANORAMA_SET_CLICK_LISTENER", 178, "pCl", 2113);
            bW = new a("PANORAMA_SET_LONG_CLICK_LISTENER", 179, "pLCl", 2117);
            bX = new a("PANORAMA_PROJECT_TO_ORIENTATION", 180, "ppo", 2114);
            bY = new a("PANORAMA_PROJECT_TO_POINT", 181, "ppp", 2115);
            bZ = new a("PANORAMA_SET_ON_PANORAMA_READY_CALLBACK", 182, "prc", 2116);
            ca = new a("MAP_SET_VISIBLE_REGION", 183, "vr", 2200);
            cb = new a("MAP_SET_OAUTH_TOKEN_PROVIDER", 184, "moauth", 2300);
            cc = new a("INTENT_VIEW_NO_MARKERS", 185, "gm0", 2400);
            cd = new a("INTENT_VIEW_ONE_MARKER", 186, "gm1", 2401);
            ce = new a("INTENT_VIEW_MULTIPLE_MARKERS_ONE_SELECTED", 187, "gm2", 2402);
            cf = new a("INTENT_VIEW_MULTIPLE_MARKERS_NONE_SELECTED", 188, "gm3", 2403);
            cg = new a("INTENT_DIRECTIONS", 189, "gmd", 2404);
            ch = new a("MAP_ENABLE_AMBIENT_STYLING", 190, "as", 2500);
            cL = new a("DEPRECATED_MARKER_ICON_FACTORY_CREATE_ICON", 191, "mf", 0);
            cM = (new a[] {
                a, ck, b, c, d, e, f, g, h, i, 
                j, cl, k, l, m, n, o, p, q, r, 
                s, t, u, v, w, cm, x, y, z, A, 
                B, C, D, E, cn, co, cp, cq, F, G, 
                H, I, J, K, L, M, N, O, P, Q, 
                R, S, T, U, V, W, X, Y, Z, aa, 
                ab, ac, ad, ae, af, ag, ah, ai, cr, aj, 
                ak, al, cs, ct, am, an, ao, ap, aq, ar, 
                as, at, au, av, aw, ax, ay, az, aA, aB, 
                aC, aD, aE, aF, aG, aH, aI, aJ, cu, cv, 
                aK, aL, aM, aN, aO, cw, aP, aQ, aR, aS, 
                cx, aT, aU, cy, aV, aW, aX, aY, aZ, ba, 
                bb, bc, bd, be, bf, bg, bh, cz, bi, bj, 
                bk, bl, bm, bn, bo, bp, bq, br, bs, bt, 
                bu, bv, cA, cB, bw, bx, by, cC, cD, cE, 
                cF, bz, bA, bB, bC, bD, bE, bF, cG, cH, 
                bG, bH, cI, bI, bJ, bK, cJ, cK, bL, bM, 
                bN, bO, bP, bQ, bR, bS, bT, bU, bV, bW, 
                bX, bY, bZ, ca, cb, cc, cd, ce, cf, cg, 
                ch, cL
            });
        }

        private a(String s1, int i1, String s2, int j1)
        {
            super(s1, i1);
            ci = s2;
            cj = j1;
        }
    }


    public abstract void a();

    public abstract void a(a a1);

    public abstract void b(a a1);
}
