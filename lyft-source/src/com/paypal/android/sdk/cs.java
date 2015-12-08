// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;


public final class cs extends Enum
{

    public static final cs A;
    public static final cs B;
    public static final cs C;
    public static final cs D;
    public static final cs E;
    public static final cs F;
    public static final cs G;
    public static final cs H;
    public static final cs I;
    public static final cs J;
    public static final cs K;
    public static final cs L;
    public static final cs M;
    public static final cs N;
    public static final cs O;
    public static final cs P;
    public static final cs Q;
    public static final cs R;
    public static final cs S;
    public static final cs T;
    public static final cs U;
    public static final cs V;
    public static final cs W;
    public static final cs X;
    public static final cs Y;
    public static final cs Z;
    public static final cs a;
    public static final cs aA;
    public static final cs aB;
    public static final cs aC;
    public static final cs aD;
    public static final cs aE;
    public static final cs aF;
    public static final cs aG;
    public static final cs aH;
    public static final cs aI;
    public static final cs aJ;
    public static final cs aK;
    public static final cs aL;
    public static final cs aM;
    public static final cs aN;
    public static final cs aO;
    public static final cs aP;
    public static final cs aQ;
    public static final cs aR;
    public static final cs aS;
    public static final cs aT;
    public static final cs aU;
    public static final cs aV;
    public static final cs aW;
    public static final cs aX;
    public static final cs aY;
    public static final cs aZ;
    public static final cs aa;
    public static final cs ab;
    public static final cs ac;
    public static final cs ad;
    public static final cs ae;
    public static final cs af;
    public static final cs ag;
    public static final cs ah;
    public static final cs ai;
    public static final cs aj;
    public static final cs ak;
    public static final cs al;
    public static final cs am;
    public static final cs an;
    public static final cs ao;
    public static final cs ap;
    public static final cs aq;
    public static final cs ar;
    public static final cs as;
    public static final cs at;
    public static final cs au;
    public static final cs av;
    public static final cs aw;
    public static final cs ax;
    public static final cs ay;
    public static final cs az;
    public static final cs b;
    public static final cs ba;
    public static final cs bb;
    public static final cs bc;
    public static final cs bd;
    public static final cs be;
    public static final cs bf;
    public static final cs bg;
    public static final cs bh;
    public static final cs bi;
    public static final cs bj;
    public static final cs bk;
    public static final cs bl;
    public static final cs bm;
    public static final cs bn;
    public static final cs bo;
    public static final cs bp;
    public static final cs bq;
    public static final cs br;
    public static final cs bs;
    public static final cs bt;
    private static final cs bu[];
    public static final cs c;
    public static final cs d;
    public static final cs e;
    public static final cs f;
    public static final cs g;
    public static final cs h;
    public static final cs i;
    public static final cs j;
    public static final cs k;
    public static final cs l;
    public static final cs m;
    public static final cs n;
    public static final cs o;
    public static final cs p;
    public static final cs q;
    public static final cs r;
    public static final cs s;
    public static final cs t;
    public static final cs u;
    public static final cs v;
    public static final cs w;
    public static final cs x;
    public static final cs y;
    public static final cs z;

    private cs(String s1, int i1)
    {
        super(s1, i1);
    }

    public static cs valueOf(String s1)
    {
        return (cs)Enum.valueOf(com/paypal/android/sdk/cs, s1);
    }

    public static cs[] values()
    {
        return (cs[])bu.clone();
    }

    static 
    {
        a = new cs("AGREE_AND_PAY", 0);
        b = new cs("AND_OTHER_FUNDING_SOURCES", 1);
        c = new cs("AUTHENTICATING", 2);
        d = new cs("BACK_BUTTON", 3);
        e = new cs("BACKUP_FUNDING_SOURCE", 4);
        f = new cs("CANCEL", 5);
        g = new cs("CARDTYPE_AMERICANEXPRESS", 6);
        h = new cs("CARDTYPE_CARTAAURA", 7);
        i = new cs("CARDTYPE_CARTEAURORE", 8);
        j = new cs("CARDTYPE_CARTAPREPAGATAPAYPAL", 9);
        k = new cs("CARDTYPE_CARTEBLEUE", 10);
        l = new cs("CARDTYPE_COFINOGA", 11);
        m = new cs("CARDTYPE_DELTA", 12);
        n = new cs("CARDTYPE_DISCOVER", 13);
        o = new cs("CARDTYPE_ELECTRON", 14);
        p = new cs("CARDTYPE_JCB", 15);
        q = new cs("CARDTYPE_MAESTRO", 16);
        r = new cs("CARDTYPE_MASTERCARD", 17);
        s = new cs("CARDTYPE_POSTEPAY", 18);
        t = new cs("CARDTYPE_4ETOILES", 19);
        u = new cs("CARDTYPE_TARJETAAURORA", 20);
        v = new cs("CARDTYPE_VISA", 21);
        w = new cs("CHANGE_PAYMENT_METHOD", 22);
        x = new cs("CHECKING_ACCOUNT_FOR_INSTITUTION", 23);
        y = new cs("CHECKING_DEVICE", 24);
        z = new cs("CLEAR_CREDIT_CARD_INFO", 25);
        A = new cs("CONFIRM", 26);
        B = new cs("CONFIRM_CLEAR_CREDIT_CARD_INFO", 27);
        C = new cs("CONFIRM_CHARGE_CREDIT_CARD", 28);
        D = new cs("CONFIRM_LOG_OUT", 29);
        E = new cs("CONFIRM_SEND_PAYMENT", 30);
        F = new cs("CONSENT_AGREEMENT_AGREE", 31);
        G = new cs("CONSENT_AGREEMENT_ATTRIBUTE_ACCOUNT_CREATION_DATE", 32);
        H = new cs("CONSENT_AGREEMENT_ATTRIBUTE_ACCOUNT_STATUS", 33);
        I = new cs("CONSENT_AGREEMENT_ATTRIBUTE_ACCOUNT_TYPE", 34);
        J = new cs("CONSENT_AGREEMENT_ATTRIBUTE_ADDRESS", 35);
        K = new cs("CONSENT_AGREEMENT_ATTRIBUTE_AGE_RANGE", 36);
        L = new cs("CONSENT_AGREEMENT_ATTRIBUTE_DATE_OF_BIRTH", 37);
        M = new cs("CONSENT_AGREEMENT_ATTRIBUTE_EMAIL_ADDRESS", 38);
        N = new cs("CONSENT_AGREEMENT_ATTRIBUTE_FULL_NAME", 39);
        O = new cs("CONSENT_AGREEMENT_ATTRIBUTE_GENDER", 40);
        P = new cs("CONSENT_AGREEMENT_ATTRIBUTE_LANGUAGE", 41);
        Q = new cs("CONSENT_AGREEMENT_ATTRIBUTE_LOCALE", 42);
        R = new cs("CONSENT_AGREEMENT_ATTRIBUTE_PHONE", 43);
        S = new cs("CONSENT_AGREEMENT_ATTRIBUTE_TIME_ZONE", 44);
        T = new cs("CONSENT_AGREEMENT_ATTRIBUTES", 45);
        U = new cs("CONSENT_AGREEMENT_INTRO", 46);
        V = new cs("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS", 47);
        W = new cs("CONSENT_AGREEMENT_FUNDING_OPTIONS", 48);
        X = new cs("CONSENT_AGREEMENT_FUTURE_PAYMENTS", 49);
        Y = new cs("CONSENT_AGREEMENT_LOYALTY_CARD", 50);
        Z = new cs("CONSENT_AGREEMENT_MERCHANT_PRIVACY_POLICY", 51);
        aa = new cs("CONSENT_AGREEMENT_REQUEST_MONEY", 52);
        ab = new cs("CONSENT_AGREEMENT_SEND_MONEY", 53);
        ac = new cs("CONSENT_AGREEMENT_TITLE", 54);
        ad = new cs("EMAIL", 55);
        ae = new cs("ENVIRONMENT_MOCK_DATA", 56);
        af = new cs("ENVIRONMENT_SANDBOX", 57);
        ag = new cs("EXPIRES_ON_DATE", 58);
        ah = new cs("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS", 59);
        ai = new cs("FORGOT_PASSWORD", 60);
        aj = new cs("FROM_ACCOUNT", 61);
        ak = new cs("FUTURE_PAYMENT_METHOD_QUESTION", 62);
        al = new cs("FUTURE_PAYMENT_LEGAL_DETAILS", 63);
        am = new cs("INTERNAL_ERROR", 64);
        an = new cs("JAPANESE_COMPLIANCE_AGREEMENT", 65);
        ao = new cs("LOG_IN", 66);
        ap = new cs("LOG_IN_TO_PAYPAL", 67);
        aq = new cs("LOG_OUT_BUTTON", 68);
        ar = new cs("LOG_OUT", 69);
        as = new cs("OK", 70);
        at = new cs("PASSWORD", 71);
        au = new cs("PAY_AFTER_DELIVERY", 72);
        av = new cs("PAY_WITH", 73);
        aw = new cs("PAY_WITH_CARD", 74);
        ax = new cs("PAYPAL_BALANCE", 75);
        ay = new cs("PAYPAL_CREDIT", 76);
        az = new cs("PHONE", 77);
        aA = new cs("PIN", 78);
        aB = new cs("PREFERRED_PAYMENT_METHOD", 79);
        aC = new cs("PRIVACY", 80);
        aD = new cs("PROCESSING", 81);
        aE = new cs("REMEMBER_CARD", 82);
        aF = new cs("REQUEST_MONEY", 83);
        aG = new cs("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS", 84);
        aH = new cs("SAVINGS_ACCOUNT_FOR_INSTITUTION", 85);
        aI = new cs("SEND_MONEY", 86);
        aJ = new cs("SERVER_PROBLEM", 87);
        aK = new cs("SESSION_EXPIRED_MESSAGE", 88);
        aL = new cs("SESSION_EXPIRED_TITLE", 89);
        aM = new cs("SHIPPING_ADDRESS", 90);
        aN = new cs("SIGN_UP", 91);
        aO = new cs("STAY_LOGGED_IN", 92);
        aP = new cs("SYSTEM_ERROR_WITH_CODE", 93);
        aQ = new cs("TRY_AGAIN", 94);
        aR = new cs("TWO_FA_REQUIRED_ERROR", 95);
        aS = new cs("TWO_FACTOR_AUTH_TITLE", 96);
        aT = new cs("TWO_FACTOR_AUTH_SUBTITLE", 97);
        aU = new cs("TWO_FACTOR_AUTH_SENDING_DIALOG", 98);
        aV = new cs("TWO_FACTOR_AUTH_ENTER_SECURITY_CODE", 99);
        aW = new cs("TWO_FACTOR_AUTH_ENTER_MOBILE_NUMBER", 100);
        aX = new cs("TWO_FACTOR_AUTH_SEND_SMS", 101);
        aY = new cs("TWO_FACTOR_AUTH_SEND_SMS_AGAIN", 102);
        aZ = new cs("TWO_FACTOR_AUTH_NO_ACTIVE_TOKENS_ERROR", 103);
        ba = new cs("UNAUTHORIZED_DEVICE_MESSAGE", 104);
        bb = new cs("UNAUTHORIZED_DEVICE_TITLE", 105);
        bc = new cs("UNAUTHORIZED_MERCHANT_MESSAGE", 106);
        bd = new cs("UNAUTHORIZED_MERCHANT_TITLE", 107);
        be = new cs("UNEXPECTED_PAYMENT_FLOW", 108);
        bf = new cs("UNKNOWN_FUNDING_SOURCE", 109);
        bg = new cs("WE_ARE_SORRY", 110);
        bh = new cs("YOUR_ORDER", 111);
        bi = new cs("CLEAR_CC_ALERT_TITLE", 112);
        bj = new cs("CONSENT_FAILED_ALERT_TITLE", 113);
        bk = new cs("CONNECTION_FAILED_TITLE", 114);
        bl = new cs("LOGIN_FAILED_ALERT_TITLE", 115);
        bm = new cs("LOGIN_WITH_EMAIL", 116);
        bn = new cs("LOGIN_WITH_PHONE", 117);
        bo = new cs("ONE_MOMENT", 118);
        bp = new cs("PAY_FAILED_ALERT_TITLE", 119);
        bq = new cs("SCAN_CARD_ICON_DESCRIPTION", 120);
        br = new cs("TWO_FACTOR_AUTH_INVALID_ONE_TIME_PASSWORD", 121);
        bs = new cs("VIA_LABEL", 122);
        bt = new cs("PP_SERVICE_ERROR_JSON_PARSE_ERROR", 123);
        bu = (new cs[] {
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
            bq, br, bs, bt
        });
    }
}
