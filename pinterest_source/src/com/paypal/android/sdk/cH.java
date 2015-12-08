// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;


public final class cH extends Enum
{

    public static final cH A;
    public static final cH B;
    public static final cH C;
    public static final cH D;
    public static final cH E;
    public static final cH F;
    public static final cH G;
    public static final cH H;
    public static final cH I;
    public static final cH J;
    public static final cH K;
    public static final cH L;
    public static final cH M;
    public static final cH N;
    public static final cH O;
    public static final cH P;
    public static final cH Q;
    public static final cH R;
    public static final cH S;
    public static final cH T;
    public static final cH U;
    public static final cH V;
    public static final cH W;
    public static final cH X;
    public static final cH Y;
    public static final cH Z;
    public static final cH a;
    public static final cH aA;
    public static final cH aB;
    public static final cH aC;
    public static final cH aD;
    public static final cH aE;
    public static final cH aF;
    public static final cH aG;
    public static final cH aH;
    public static final cH aI;
    public static final cH aJ;
    public static final cH aK;
    public static final cH aL;
    public static final cH aM;
    public static final cH aN;
    public static final cH aO;
    public static final cH aP;
    public static final cH aQ;
    public static final cH aR;
    public static final cH aS;
    public static final cH aT;
    public static final cH aU;
    public static final cH aV;
    public static final cH aW;
    public static final cH aX;
    public static final cH aY;
    public static final cH aZ;
    public static final cH aa;
    public static final cH ab;
    public static final cH ac;
    public static final cH ad;
    public static final cH ae;
    public static final cH af;
    public static final cH ag;
    public static final cH ah;
    public static final cH ai;
    public static final cH aj;
    public static final cH ak;
    public static final cH al;
    public static final cH am;
    public static final cH an;
    public static final cH ao;
    public static final cH ap;
    public static final cH aq;
    public static final cH ar;
    public static final cH as;
    public static final cH at;
    public static final cH au;
    public static final cH av;
    public static final cH aw;
    public static final cH ax;
    public static final cH ay;
    public static final cH az;
    public static final cH b;
    public static final cH ba;
    public static final cH bb;
    public static final cH bc;
    public static final cH bd;
    public static final cH be;
    public static final cH bf;
    public static final cH bg;
    public static final cH bh;
    public static final cH bi;
    public static final cH bj;
    public static final cH bk;
    public static final cH bl;
    public static final cH bm;
    public static final cH bn;
    public static final cH bo;
    public static final cH bp;
    public static final cH bq;
    public static final cH br;
    public static final cH bs;
    public static final cH bt;
    public static final cH bu;
    private static final cH bv[];
    public static final cH c;
    public static final cH d;
    public static final cH e;
    public static final cH f;
    public static final cH g;
    public static final cH h;
    public static final cH i;
    public static final cH j;
    public static final cH k;
    public static final cH l;
    public static final cH m;
    public static final cH n;
    public static final cH o;
    public static final cH p;
    public static final cH q;
    public static final cH r;
    public static final cH s;
    public static final cH t;
    public static final cH u;
    public static final cH v;
    public static final cH w;
    public static final cH x;
    public static final cH y;
    public static final cH z;

    private cH(String s1, int i1)
    {
        super(s1, i1);
    }

    public static cH valueOf(String s1)
    {
        return (cH)Enum.valueOf(com/paypal/android/sdk/cH, s1);
    }

    public static cH[] values()
    {
        return (cH[])bv.clone();
    }

    static 
    {
        a = new cH("AGREE_AND_PAY", 0);
        b = new cH("AND_OTHER_FUNDING_SOURCES", 1);
        c = new cH("AUTHENTICATING", 2);
        d = new cH("BACK_BUTTON", 3);
        e = new cH("BACKUP_FUNDING_SOURCE", 4);
        f = new cH("CANCEL", 5);
        g = new cH("CARDTYPE_AMERICANEXPRESS", 6);
        h = new cH("CARDTYPE_CARTAAURA", 7);
        i = new cH("CARDTYPE_CARTEAURORE", 8);
        j = new cH("CARDTYPE_CARTAPREPAGATAPAYPAL", 9);
        k = new cH("CARDTYPE_CARTEBLEUE", 10);
        l = new cH("CARDTYPE_COFINOGA", 11);
        m = new cH("CARDTYPE_DELTA", 12);
        n = new cH("CARDTYPE_DISCOVER", 13);
        o = new cH("CARDTYPE_ELECTRON", 14);
        p = new cH("CARDTYPE_JCB", 15);
        q = new cH("CARDTYPE_MAESTRO", 16);
        r = new cH("CARDTYPE_MASTERCARD", 17);
        s = new cH("CARDTYPE_POSTEPAY", 18);
        t = new cH("CARDTYPE_4ETOILES", 19);
        u = new cH("CARDTYPE_TARJETAAURORA", 20);
        v = new cH("CARDTYPE_VISA", 21);
        w = new cH("CHANGE_PAYMENT_METHOD", 22);
        x = new cH("CHECKING_ACCOUNT_FOR_INSTITUTION", 23);
        y = new cH("CHECKING_DEVICE", 24);
        z = new cH("CLEAR_CREDIT_CARD_INFO", 25);
        A = new cH("CONFIRM", 26);
        B = new cH("CONFIRM_CLEAR_CREDIT_CARD_INFO", 27);
        C = new cH("CONFIRM_CHARGE_CREDIT_CARD", 28);
        D = new cH("CONFIRM_LOG_OUT", 29);
        E = new cH("CONFIRM_SEND_PAYMENT", 30);
        F = new cH("CONSENT_AGREEMENT_AGREE", 31);
        G = new cH("CONSENT_AGREEMENT_ATTRIBUTE_ACCOUNT_CREATION_DATE", 32);
        H = new cH("CONSENT_AGREEMENT_ATTRIBUTE_ACCOUNT_STATUS", 33);
        I = new cH("CONSENT_AGREEMENT_ATTRIBUTE_ACCOUNT_TYPE", 34);
        J = new cH("CONSENT_AGREEMENT_ATTRIBUTE_ADDRESS", 35);
        K = new cH("CONSENT_AGREEMENT_ATTRIBUTE_AGE_RANGE", 36);
        L = new cH("CONSENT_AGREEMENT_ATTRIBUTE_DATE_OF_BIRTH", 37);
        M = new cH("CONSENT_AGREEMENT_ATTRIBUTE_EMAIL_ADDRESS", 38);
        N = new cH("CONSENT_AGREEMENT_ATTRIBUTE_FULL_NAME", 39);
        O = new cH("CONSENT_AGREEMENT_ATTRIBUTE_GENDER", 40);
        P = new cH("CONSENT_AGREEMENT_ATTRIBUTE_LANGUAGE", 41);
        Q = new cH("CONSENT_AGREEMENT_ATTRIBUTE_LOCALE", 42);
        R = new cH("CONSENT_AGREEMENT_ATTRIBUTE_PHONE", 43);
        S = new cH("CONSENT_AGREEMENT_ATTRIBUTE_TIME_ZONE", 44);
        T = new cH("CONSENT_AGREEMENT_ATTRIBUTES", 45);
        U = new cH("CONSENT_AGREEMENT_EXPRESS_CHECKOUT", 46);
        V = new cH("CONSENT_AGREEMENT_INTRO", 47);
        W = new cH("CONSENT_AGREEMENT_FINANCIAL_INSTRUMENTS", 48);
        X = new cH("CONSENT_AGREEMENT_FUNDING_OPTIONS", 49);
        Y = new cH("CONSENT_AGREEMENT_FUTURE_PAYMENTS", 50);
        Z = new cH("CONSENT_AGREEMENT_LOYALTY_CARD", 51);
        aa = new cH("CONSENT_AGREEMENT_MERCHANT_PRIVACY_POLICY", 52);
        ab = new cH("CONSENT_AGREEMENT_REQUEST_MONEY", 53);
        ac = new cH("CONSENT_AGREEMENT_SEND_MONEY", 54);
        ad = new cH("CONSENT_AGREEMENT_TITLE", 55);
        ae = new cH("EMAIL", 56);
        af = new cH("ENVIRONMENT_MOCK_DATA", 57);
        ag = new cH("ENVIRONMENT_SANDBOX", 58);
        ah = new cH("EXPIRES_ON_DATE", 59);
        ai = new cH("FINANCIAL_INSTRUMENTS_LEGAL_DETAILS", 60);
        aj = new cH("FORGOT_PASSWORD", 61);
        ak = new cH("FROM_ACCOUNT", 62);
        al = new cH("FUTURE_PAYMENT_METHOD_QUESTION", 63);
        am = new cH("FUTURE_PAYMENT_LEGAL_DETAILS", 64);
        an = new cH("INTERNAL_ERROR", 65);
        ao = new cH("JAPANESE_COMPLIANCE_AGREEMENT", 66);
        ap = new cH("LOG_IN", 67);
        aq = new cH("LOG_IN_TO_PAYPAL", 68);
        ar = new cH("LOG_OUT_BUTTON", 69);
        as = new cH("LOG_OUT", 70);
        at = new cH("OK", 71);
        au = new cH("PASSWORD", 72);
        av = new cH("PAY_AFTER_DELIVERY", 73);
        aw = new cH("PAY_WITH", 74);
        ax = new cH("PAY_WITH_CARD", 75);
        ay = new cH("PAYPAL_BALANCE", 76);
        az = new cH("PAYPAL_CREDIT", 77);
        aA = new cH("PHONE", 78);
        aB = new cH("PIN", 79);
        aC = new cH("PREFERRED_PAYMENT_METHOD", 80);
        aD = new cH("PRIVACY", 81);
        aE = new cH("PROCESSING", 82);
        aF = new cH("REMEMBER_CARD", 83);
        aG = new cH("REQUEST_MONEY", 84);
        aH = new cH("REQUEST_OR_SEND_MONEY_LEGAL_DETAILS", 85);
        aI = new cH("SAVINGS_ACCOUNT_FOR_INSTITUTION", 86);
        aJ = new cH("SEND_MONEY", 87);
        aK = new cH("SERVER_PROBLEM", 88);
        aL = new cH("SESSION_EXPIRED_MESSAGE", 89);
        aM = new cH("SESSION_EXPIRED_TITLE", 90);
        aN = new cH("SHIPPING_ADDRESS", 91);
        aO = new cH("SIGN_UP", 92);
        aP = new cH("STAY_LOGGED_IN", 93);
        aQ = new cH("SYSTEM_ERROR_WITH_CODE", 94);
        aR = new cH("TRY_AGAIN", 95);
        aS = new cH("TWO_FA_REQUIRED_ERROR", 96);
        aT = new cH("TWO_FACTOR_AUTH_TITLE", 97);
        aU = new cH("TWO_FACTOR_AUTH_SUBTITLE", 98);
        aV = new cH("TWO_FACTOR_AUTH_SENDING_DIALOG", 99);
        aW = new cH("TWO_FACTOR_AUTH_ENTER_SECURITY_CODE", 100);
        aX = new cH("TWO_FACTOR_AUTH_ENTER_MOBILE_NUMBER", 101);
        aY = new cH("TWO_FACTOR_AUTH_SEND_SMS", 102);
        aZ = new cH("TWO_FACTOR_AUTH_SEND_SMS_AGAIN", 103);
        ba = new cH("TWO_FACTOR_AUTH_NO_ACTIVE_TOKENS_ERROR", 104);
        bb = new cH("UNAUTHORIZED_DEVICE_MESSAGE", 105);
        bc = new cH("UNAUTHORIZED_DEVICE_TITLE", 106);
        bd = new cH("UNAUTHORIZED_MERCHANT_MESSAGE", 107);
        be = new cH("UNAUTHORIZED_MERCHANT_TITLE", 108);
        bf = new cH("UNEXPECTED_PAYMENT_FLOW", 109);
        bg = new cH("UNKNOWN_FUNDING_SOURCE", 110);
        bh = new cH("WE_ARE_SORRY", 111);
        bi = new cH("YOUR_ORDER", 112);
        bj = new cH("CLEAR_CC_ALERT_TITLE", 113);
        bk = new cH("CONSENT_FAILED_ALERT_TITLE", 114);
        bl = new cH("CONNECTION_FAILED_TITLE", 115);
        bm = new cH("LOGIN_FAILED_ALERT_TITLE", 116);
        bn = new cH("LOGIN_WITH_EMAIL", 117);
        bo = new cH("LOGIN_WITH_PHONE", 118);
        bp = new cH("ONE_MOMENT", 119);
        bq = new cH("PAY_FAILED_ALERT_TITLE", 120);
        br = new cH("SCAN_CARD_ICON_DESCRIPTION", 121);
        bs = new cH("TWO_FACTOR_AUTH_INVALID_ONE_TIME_PASSWORD", 122);
        bt = new cH("VIA_LABEL", 123);
        bu = new cH("PP_SERVICE_ERROR_JSON_PARSE_ERROR", 124);
        bv = (new cH[] {
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
