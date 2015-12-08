// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;


public final class em extends Enum
{

    public static final em A;
    public static final em B;
    public static final em C;
    public static final em D;
    public static final em E;
    public static final em F;
    public static final em G;
    public static final em H;
    public static final em I;
    public static final em J;
    public static final em K;
    public static final em L;
    public static final em M;
    public static final em N;
    public static final em O;
    public static final em P;
    public static final em Q;
    public static final em R;
    public static final em S;
    public static final em T;
    public static final em U;
    public static final em V;
    public static final em W;
    public static final em X;
    public static final em Y;
    public static final em Z;
    public static final em a;
    public static final em aA;
    public static final em aB;
    public static final em aC;
    public static final em aD;
    public static final em aE;
    public static final em aF;
    public static final em aG;
    public static final em aH;
    public static final em aI;
    public static final em aJ;
    public static final em aK;
    public static final em aL;
    public static final em aM;
    public static final em aN;
    public static final em aO;
    public static final em aP;
    public static final em aQ;
    public static final em aR;
    public static final em aS;
    public static final em aT;
    public static final em aU;
    public static final em aV;
    public static final em aW;
    public static final em aX;
    public static final em aY;
    public static final em aZ;
    public static final em aa;
    public static final em ab;
    public static final em ac;
    public static final em ad;
    public static final em ae;
    public static final em af;
    public static final em ag;
    public static final em ah;
    public static final em ai;
    public static final em aj;
    public static final em ak;
    public static final em al;
    public static final em am;
    public static final em an;
    public static final em ao;
    public static final em ap;
    public static final em aq;
    public static final em ar;
    public static final em as;
    public static final em at;
    public static final em au;
    public static final em av;
    public static final em aw;
    public static final em ax;
    public static final em ay;
    public static final em az;
    public static final em b;
    public static final em ba;
    public static final em bb;
    public static final em bc;
    public static final em bd;
    public static final em be;
    public static final em bf;
    public static final em bg;
    public static final em bh;
    public static final em bi;
    public static final em bj;
    public static final em bk;
    public static final em bl;
    public static final em bm;
    public static final em bn;
    public static final em bo;
    public static final em bp;
    public static final em bq;
    public static final em br;
    public static final em bs;
    public static final em bt;
    public static final em bu;
    private static final em bv[];
    public static final em c;
    public static final em d;
    public static final em e;
    public static final em f;
    public static final em g;
    public static final em h;
    public static final em i;
    public static final em j;
    public static final em k;
    public static final em l;
    public static final em m;
    public static final em n;
    public static final em o;
    public static final em p;
    public static final em q;
    public static final em r;
    public static final em s;
    public static final em t;
    public static final em u;
    public static final em v;
    public static final em w;
    public static final em x;
    public static final em y;
    public static final em z;

    private em(String s1, int i1)
    {
        super(s1, i1);
    }

    public static em valueOf(String s1)
    {
        return (em)Enum.valueOf(com/paypal/android/sdk/em, s1);
    }

    public static em[] values()
    {
        return (em[])bv.clone();
    }

    static 
    {
        a = new em("AGREE_AND_PAY", 0);
        b = new em("AND_OTHER_FUNDING_SOURCES", 1);
        c = new em("AUTHENTICATING", 2);
        d = new em("BACK_BUTTON", 3);
        e = new em("BACKUP_FUNDING_SOURCE", 4);
        f = new em("CANCEL", 5);
        g = new em("CARDTYPE_AMERICANEXPRESS", 6);
        h = new em("CARDTYPE_CARTAAURA", 7);
        i = new em("CARDTYPE_CARTEAURORE", 8);
        j = new em("CARDTYPE_CARTAPREPAGATAPAYPAL", 9);
        k = new em("CARDTYPE_CARTEBLEUE", 10);
        l = new em("CARDTYPE_COFINOGA", 11);
        m = new em("CARDTYPE_DELTA", 12);
        n = new em("CARDTYPE_DISCOVER", 13);
        o = new em("CARDTYPE_ELECTRON", 14);
        p = new em("CARDTYPE_JCB", 15);
        q = new em("CARDTYPE_MAESTRO", 16);
        r = new em("CARDTYPE_MASTERCARD", 17);
        s = new em("CARDTYPE_POSTEPAY", 18);
        t = new em("CARDTYPE_4ETOILES", 19);
        u = new em("CARDTYPE_TARJETAAURORA", 20);
        v = new em("CARDTYPE_VISA", 21);
        w = new em("CHANGE_PAYMENT_METHOD", 22);
        x = new em("CHECKING_ACCOUNT_FOR_INSTITUTION", 23);
        y = new em("CHECKING_DEVICE", 24);
        z = new em("CLEAR_CREDIT_CARD_INFO", 25);
        A = new em("CONFIRM", 26);
        B = new em("CONFIRM_CLEAR_CREDIT_CARD_INFO", 27);
        C = new em("CONFIRM_CHARGE_CREDIT_CARD", 28);
        D = new em("CONFIRM_LOG_OUT", 29);
        E = new em("CONFIRM_SEND_PAYMENT", 30);
        F = new em("CONSENT_AGREEMENT_AGREE", 31);
        G = new em("CONSENT_AGREEMENT_ATTRIBUTE_ACCOUNT_CREATION_DATE", 32);
        H = new em("CONSENT_AGREEMENT_ATTRIBUTE_ACCOUNT_STATUS", 33);
        I = new em("CONSENT_AGREEMENT_ATTRIBUTE_ACCOUNT_TYPE", 34);
        J = new em("CONSENT_AGREEMENT_ATTRIBUTE_ADDRESS", 35);
        K = new em("CONSENT_AGREEMENT_ATTRIBUTE_AGE_RANGE", 36);
        L = new em("CONSENT_AGREEMENT_ATTRIBUTE_DATE_OF_BIRTH", 37);
        M = new em("CONSENT_AGREEMENT_ATTRIBUTE_EMAIL_ADDRESS", 38);
        N = new em("CONSENT_AGREEMENT_ATTRIBUTE_FULL_NAME", 39);
        O = new em("CONSENT_AGREEMENT_ATTRIBUTE_GENDER", 40);
        P = new em("CONSENT_AGREEMENT_ATTRIBUTE_LANGUAGE", 41);
        Q = new em("CONSENT_AGREEMENT_ATTRIBUTE_LOCALE", 42);
        R = new em("CONSENT_AGREEMENT_ATTRIBUTE_PHONE", 43);
        S = new em("CONSENT_AGREEMENT_ATTRIBUTE_TIME_ZONE", 44);
        T = new em("CONSENT_AGREEMENT_ATTRIBUTES", 45);
        U = new em("CONSENT_AGREEMENT_EXPRESS_CHECKOUT", 46);
        V = new em("CONSENT_AGREEMENT_INTRO", 47);
        W = new em("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS", 48);
        X = new em("CONSENT_AGREEMENT_FUNDING_OPTIONS", 49);
        Y = new em("CONSENT_AGREEMENT_FUTURE_PAYMENTS", 50);
        Z = new em("CONSENT_AGREEMENT_LOYALTY_CARD", 51);
        aa = new em("CONSENT_AGREEMENT_MERCHANT_PRIVACY_POLICY", 52);
        ab = new em("CONSENT_AGREEMENT_REQUEST_MONEY", 53);
        ac = new em("CONSENT_AGREEMENT_SEND_MONEY", 54);
        ad = new em("CONSENT_AGREEMENT_TITLE", 55);
        ae = new em("EMAIL", 56);
        af = new em("ENVIRONMENT_MOCK_DATA", 57);
        ag = new em("ENVIRONMENT_SANDBOX", 58);
        ah = new em("EXPIRES_ON_DATE", 59);
        ai = new em("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS", 60);
        aj = new em("FORGOT_PASSWORD", 61);
        ak = new em("FROM_ACCOUNT", 62);
        al = new em("FUTURE_PAYMENT_METHOD_QUESTION", 63);
        am = new em("FUTURE_PAYMENT_LEGAL_DETAILS", 64);
        an = new em("INTERNAL_ERROR", 65);
        ao = new em("JAPANESE_COMPLIANCE_AGREEMENT", 66);
        ap = new em("LOG_IN", 67);
        aq = new em("LOG_IN_TO_PAYPAL", 68);
        ar = new em("LOG_OUT_BUTTON", 69);
        as = new em("LOG_OUT", 70);
        at = new em("OK", 71);
        au = new em("PASSWORD", 72);
        av = new em("PAY_AFTER_DELIVERY", 73);
        aw = new em("PAY_WITH", 74);
        ax = new em("PAY_WITH_CARD", 75);
        ay = new em("PAYPAL_BALANCE", 76);
        az = new em("PAYPAL_CREDIT", 77);
        aA = new em("PHONE", 78);
        aB = new em("PIN", 79);
        aC = new em("PREFERRED_PAYMENT_METHOD", 80);
        aD = new em("PRIVACY", 81);
        aE = new em("PROCESSING", 82);
        aF = new em("REMEMBER_CARD", 83);
        aG = new em("REQUEST_MONEY", 84);
        aH = new em("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS", 85);
        aI = new em("SAVINGS_ACCOUNT_FOR_INSTITUTION", 86);
        aJ = new em("SEND_MONEY", 87);
        aK = new em("SERVER_PROBLEM", 88);
        aL = new em("SESSION_EXPIRED_MESSAGE", 89);
        aM = new em("SESSION_EXPIRED_TITLE", 90);
        aN = new em("SHIPPING_ADDRESS", 91);
        aO = new em("SIGN_UP", 92);
        aP = new em("STAY_LOGGED_IN", 93);
        aQ = new em("SYSTEM_ERROR_WITH_CODE", 94);
        aR = new em("TRY_AGAIN", 95);
        aS = new em("TWO_FA_REQUIRED_ERROR", 96);
        aT = new em("TWO_FACTOR_AUTH_TITLE", 97);
        aU = new em("TWO_FACTOR_AUTH_SUBTITLE", 98);
        aV = new em("TWO_FACTOR_AUTH_SENDING_DIALOG", 99);
        aW = new em("TWO_FACTOR_AUTH_ENTER_SECURITY_CODE", 100);
        aX = new em("TWO_FACTOR_AUTH_ENTER_MOBILE_NUMBER", 101);
        aY = new em("TWO_FACTOR_AUTH_SEND_SMS", 102);
        aZ = new em("TWO_FACTOR_AUTH_SEND_SMS_AGAIN", 103);
        ba = new em("TWO_FACTOR_AUTH_NO_ACTIVE_TOKENS_ERROR", 104);
        bb = new em("UNAUTHORIZED_DEVICE_MESSAGE", 105);
        bc = new em("UNAUTHORIZED_DEVICE_TITLE", 106);
        bd = new em("UNAUTHORIZED_MERCHANT_MESSAGE", 107);
        be = new em("UNAUTHORIZED_MERCHANT_TITLE", 108);
        bf = new em("UNEXPECTED_PAYMENT_FLOW", 109);
        bg = new em("UNKNOWN_FUNDING_SOURCE", 110);
        bh = new em("WE_ARE_SORRY", 111);
        bi = new em("YOUR_ORDER", 112);
        bj = new em("CLEAR_CC_ALERT_TITLE", 113);
        bk = new em("CONSENT_FAILED_ALERT_TITLE", 114);
        bl = new em("CONNECTION_FAILED_TITLE", 115);
        bm = new em("LOGIN_FAILED_ALERT_TITLE", 116);
        bn = new em("LOGIN_WITH_EMAIL", 117);
        bo = new em("LOGIN_WITH_PHONE", 118);
        bp = new em("ONE_MOMENT", 119);
        bq = new em("PAY_FAILED_ALERT_TITLE", 120);
        br = new em("SCAN_CARD_ICON_DESCRIPTION", 121);
        bs = new em("TWO_FACTOR_AUTH_INVALID_ONE_TIME_PASSWORD", 122);
        bt = new em("VIA_LABEL", 123);
        bu = new em("PP_SERVICE_ERROR_JSON_PARSE_ERROR", 124);
        bv = (new em[] {
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
