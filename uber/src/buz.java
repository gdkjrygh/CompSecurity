// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class buz extends Enum
{

    public static final buz A;
    public static final buz B;
    public static final buz C;
    public static final buz D;
    public static final buz E;
    public static final buz F;
    public static final buz G;
    public static final buz H;
    public static final buz I;
    public static final buz J;
    public static final buz K;
    public static final buz L;
    public static final buz M;
    public static final buz N;
    public static final buz O;
    public static final buz P;
    public static final buz Q;
    public static final buz R;
    public static final buz S;
    public static final buz T;
    public static final buz U;
    public static final buz V;
    public static final buz W;
    public static final buz X;
    public static final buz Y;
    public static final buz Z;
    public static final buz a;
    public static final buz aA;
    public static final buz aB;
    public static final buz aC;
    public static final buz aD;
    public static final buz aE;
    public static final buz aF;
    public static final buz aG;
    public static final buz aH;
    public static final buz aI;
    public static final buz aJ;
    public static final buz aK;
    public static final buz aL;
    public static final buz aM;
    public static final buz aN;
    public static final buz aO;
    public static final buz aP;
    public static final buz aQ;
    public static final buz aR;
    public static final buz aS;
    public static final buz aT;
    public static final buz aU;
    public static final buz aV;
    public static final buz aW;
    public static final buz aX;
    public static final buz aY;
    public static final buz aZ;
    public static final buz aa;
    public static final buz ab;
    public static final buz ac;
    public static final buz ad;
    public static final buz ae;
    public static final buz af;
    public static final buz ag;
    public static final buz ah;
    public static final buz ai;
    public static final buz aj;
    public static final buz ak;
    public static final buz al;
    public static final buz am;
    public static final buz an;
    public static final buz ao;
    public static final buz ap;
    public static final buz aq;
    public static final buz ar;
    public static final buz as;
    public static final buz at;
    public static final buz au;
    public static final buz av;
    public static final buz aw;
    public static final buz ax;
    public static final buz ay;
    public static final buz az;
    public static final buz b;
    public static final buz ba;
    public static final buz bb;
    public static final buz bc;
    public static final buz bd;
    public static final buz be;
    public static final buz bf;
    public static final buz bg;
    public static final buz bh;
    public static final buz bi;
    public static final buz bj;
    public static final buz bk;
    public static final buz bl;
    public static final buz bm;
    public static final buz bn;
    public static final buz bo;
    public static final buz bp;
    public static final buz bq;
    public static final buz br;
    public static final buz bs;
    public static final buz bt;
    public static final buz bu;
    private static final buz bv[];
    public static final buz c;
    public static final buz d;
    public static final buz e;
    public static final buz f;
    public static final buz g;
    public static final buz h;
    public static final buz i;
    public static final buz j;
    public static final buz k;
    public static final buz l;
    public static final buz m;
    public static final buz n;
    public static final buz o;
    public static final buz p;
    public static final buz q;
    public static final buz r;
    public static final buz s;
    public static final buz t;
    public static final buz u;
    public static final buz v;
    public static final buz w;
    public static final buz x;
    public static final buz y;
    public static final buz z;

    private buz(String s1, int i1)
    {
        super(s1, i1);
    }

    public static buz valueOf(String s1)
    {
        return (buz)Enum.valueOf(buz, s1);
    }

    public static buz[] values()
    {
        return (buz[])bv.clone();
    }

    static 
    {
        a = new buz("AGREE_AND_PAY", 0);
        b = new buz("AND_OTHER_FUNDING_SOURCES", 1);
        c = new buz("AUTHENTICATING", 2);
        d = new buz("BACK_BUTTON", 3);
        e = new buz("BACKUP_FUNDING_SOURCE", 4);
        f = new buz("CANCEL", 5);
        g = new buz("CARDTYPE_AMERICANEXPRESS", 6);
        h = new buz("CARDTYPE_CARTAAURA", 7);
        i = new buz("CARDTYPE_CARTEAURORE", 8);
        j = new buz("CARDTYPE_CARTAPREPAGATAPAYPAL", 9);
        k = new buz("CARDTYPE_CARTEBLEUE", 10);
        l = new buz("CARDTYPE_COFINOGA", 11);
        m = new buz("CARDTYPE_DELTA", 12);
        n = new buz("CARDTYPE_DISCOVER", 13);
        o = new buz("CARDTYPE_ELECTRON", 14);
        p = new buz("CARDTYPE_JCB", 15);
        q = new buz("CARDTYPE_MAESTRO", 16);
        r = new buz("CARDTYPE_MASTERCARD", 17);
        s = new buz("CARDTYPE_POSTEPAY", 18);
        t = new buz("CARDTYPE_4ETOILES", 19);
        u = new buz("CARDTYPE_TARJETAAURORA", 20);
        v = new buz("CARDTYPE_VISA", 21);
        w = new buz("CHANGE_PAYMENT_METHOD", 22);
        x = new buz("CHECKING_ACCOUNT_FOR_INSTITUTION", 23);
        y = new buz("CHECKING_DEVICE", 24);
        z = new buz("CLEAR_CREDIT_CARD_INFO", 25);
        A = new buz("CONFIRM", 26);
        B = new buz("CONFIRM_CLEAR_CREDIT_CARD_INFO", 27);
        C = new buz("CONFIRM_CHARGE_CREDIT_CARD", 28);
        D = new buz("CONFIRM_LOG_OUT", 29);
        E = new buz("CONFIRM_SEND_PAYMENT", 30);
        F = new buz("CONSENT_AGREEMENT_AGREE", 31);
        G = new buz("CONSENT_AGREEMENT_ATTRIBUTE_ACCOUNT_CREATION_DATE", 32);
        H = new buz("CONSENT_AGREEMENT_ATTRIBUTE_ACCOUNT_STATUS", 33);
        I = new buz("CONSENT_AGREEMENT_ATTRIBUTE_ACCOUNT_TYPE", 34);
        J = new buz("CONSENT_AGREEMENT_ATTRIBUTE_ADDRESS", 35);
        K = new buz("CONSENT_AGREEMENT_ATTRIBUTE_AGE_RANGE", 36);
        L = new buz("CONSENT_AGREEMENT_ATTRIBUTE_DATE_OF_BIRTH", 37);
        M = new buz("CONSENT_AGREEMENT_ATTRIBUTE_EMAIL_ADDRESS", 38);
        N = new buz("CONSENT_AGREEMENT_ATTRIBUTE_FULL_NAME", 39);
        O = new buz("CONSENT_AGREEMENT_ATTRIBUTE_GENDER", 40);
        P = new buz("CONSENT_AGREEMENT_ATTRIBUTE_LANGUAGE", 41);
        Q = new buz("CONSENT_AGREEMENT_ATTRIBUTE_LOCALE", 42);
        R = new buz("CONSENT_AGREEMENT_ATTRIBUTE_PHONE", 43);
        S = new buz("CONSENT_AGREEMENT_ATTRIBUTE_TIME_ZONE", 44);
        T = new buz("CONSENT_AGREEMENT_ATTRIBUTES", 45);
        U = new buz("CONSENT_AGREEMENT_EXPRESS_CHECKOUT", 46);
        V = new buz("CONSENT_AGREEMENT_INTRO", 47);
        W = new buz("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS", 48);
        X = new buz("CONSENT_AGREEMENT_FUNDING_OPTIONS", 49);
        Y = new buz("CONSENT_AGREEMENT_FUTURE_PAYMENTS", 50);
        Z = new buz("CONSENT_AGREEMENT_LOYALTY_CARD", 51);
        aa = new buz("CONSENT_AGREEMENT_MERCHANT_PRIVACY_POLICY", 52);
        ab = new buz("CONSENT_AGREEMENT_REQUEST_MONEY", 53);
        ac = new buz("CONSENT_AGREEMENT_SEND_MONEY", 54);
        ad = new buz("CONSENT_AGREEMENT_TITLE", 55);
        ae = new buz("EMAIL", 56);
        af = new buz("ENVIRONMENT_MOCK_DATA", 57);
        ag = new buz("ENVIRONMENT_SANDBOX", 58);
        ah = new buz("EXPIRES_ON_DATE", 59);
        ai = new buz("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS", 60);
        aj = new buz("FORGOT_PASSWORD", 61);
        ak = new buz("FROM_ACCOUNT", 62);
        al = new buz("FUTURE_PAYMENT_METHOD_QUESTION", 63);
        am = new buz("FUTURE_PAYMENT_LEGAL_DETAILS", 64);
        an = new buz("INTERNAL_ERROR", 65);
        ao = new buz("JAPANESE_COMPLIANCE_AGREEMENT", 66);
        ap = new buz("LOG_IN", 67);
        aq = new buz("LOG_IN_TO_PAYPAL", 68);
        ar = new buz("LOG_OUT_BUTTON", 69);
        as = new buz("LOG_OUT", 70);
        at = new buz("OK", 71);
        au = new buz("PASSWORD", 72);
        av = new buz("PAY_AFTER_DELIVERY", 73);
        aw = new buz("PAY_WITH", 74);
        ax = new buz("PAY_WITH_CARD", 75);
        ay = new buz("PAYPAL_BALANCE", 76);
        az = new buz("PAYPAL_CREDIT", 77);
        aA = new buz("PHONE", 78);
        aB = new buz("PIN", 79);
        aC = new buz("PREFERRED_PAYMENT_METHOD", 80);
        aD = new buz("PRIVACY", 81);
        aE = new buz("PROCESSING", 82);
        aF = new buz("REMEMBER_CARD", 83);
        aG = new buz("REQUEST_MONEY", 84);
        aH = new buz("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS", 85);
        aI = new buz("SAVINGS_ACCOUNT_FOR_INSTITUTION", 86);
        aJ = new buz("SEND_MONEY", 87);
        aK = new buz("SERVER_PROBLEM", 88);
        aL = new buz("SESSION_EXPIRED_MESSAGE", 89);
        aM = new buz("SESSION_EXPIRED_TITLE", 90);
        aN = new buz("SHIPPING_ADDRESS", 91);
        aO = new buz("SIGN_UP", 92);
        aP = new buz("STAY_LOGGED_IN", 93);
        aQ = new buz("SYSTEM_ERROR_WITH_CODE", 94);
        aR = new buz("TRY_AGAIN", 95);
        aS = new buz("TWO_FA_REQUIRED_ERROR", 96);
        aT = new buz("TWO_FACTOR_AUTH_TITLE", 97);
        aU = new buz("TWO_FACTOR_AUTH_SUBTITLE", 98);
        aV = new buz("TWO_FACTOR_AUTH_SENDING_DIALOG", 99);
        aW = new buz("TWO_FACTOR_AUTH_ENTER_SECURITY_CODE", 100);
        aX = new buz("TWO_FACTOR_AUTH_ENTER_MOBILE_NUMBER", 101);
        aY = new buz("TWO_FACTOR_AUTH_SEND_SMS", 102);
        aZ = new buz("TWO_FACTOR_AUTH_SEND_SMS_AGAIN", 103);
        ba = new buz("TWO_FACTOR_AUTH_NO_ACTIVE_TOKENS_ERROR", 104);
        bb = new buz("UNAUTHORIZED_DEVICE_MESSAGE", 105);
        bc = new buz("UNAUTHORIZED_DEVICE_TITLE", 106);
        bd = new buz("UNAUTHORIZED_MERCHANT_MESSAGE", 107);
        be = new buz("UNAUTHORIZED_MERCHANT_TITLE", 108);
        bf = new buz("UNEXPECTED_PAYMENT_FLOW", 109);
        bg = new buz("UNKNOWN_FUNDING_SOURCE", 110);
        bh = new buz("WE_ARE_SORRY", 111);
        bi = new buz("YOUR_ORDER", 112);
        bj = new buz("CLEAR_CC_ALERT_TITLE", 113);
        bk = new buz("CONSENT_FAILED_ALERT_TITLE", 114);
        bl = new buz("CONNECTION_FAILED_TITLE", 115);
        bm = new buz("LOGIN_FAILED_ALERT_TITLE", 116);
        bn = new buz("LOGIN_WITH_EMAIL", 117);
        bo = new buz("LOGIN_WITH_PHONE", 118);
        bp = new buz("ONE_MOMENT", 119);
        bq = new buz("PAY_FAILED_ALERT_TITLE", 120);
        br = new buz("SCAN_CARD_ICON_DESCRIPTION", 121);
        bs = new buz("TWO_FACTOR_AUTH_INVALID_ONE_TIME_PASSWORD", 122);
        bt = new buz("VIA_LABEL", 123);
        bu = new buz("PP_SERVICE_ERROR_JSON_PARSE_ERROR", 124);
        bv = (new buz[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B, C, D, 
            E, F, G, H, I, J, K, L, M, N, 
            O, P, Q, R, S, T, U, V, W, X, 
            Y, Z, aa, ab, ac, ad, ae, af, ag, ah, 
            ai, aj, ak, al, am, an, ao, ap, aq, ar, 
            as, at, au, av, aw, ax, ay, az, aA, aB, 
            aC, aD, aE, aF, aG, aH, aI, aJ, aK, aL, 
            aM, aN, aO, aP, aQ, aR, aS, aT, aU, aV, 
            aW, aX, aY, aZ, ba, bb, bc, bd, be, bf, 
            bg, bh, bi, bj, bk, bl, bm, bn, bo, bp, 
            bq, br, bs, bt, bu
        });
    }
}
