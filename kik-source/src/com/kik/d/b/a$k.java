// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.d.b;

import com.c.b.bl;

// Referenced classes of package com.kik.d.b:
//            a, i

public static final class al extends Enum
    implements bl
{

    public static final ah A;
    public static final ah B;
    public static final ah C;
    public static final ah D;
    public static final ah E;
    public static final ah F;
    public static final ah G;
    public static final ah H;
    public static final ah I;
    public static final ah J;
    public static final ah K;
    public static final ah L;
    public static final ah M;
    public static final ah N;
    public static final ah O;
    public static final ah P;
    public static final ah Q;
    public static final ah R;
    public static final ah S;
    public static final ah T;
    public static final ah U;
    public static final ah V;
    public static final ah W;
    public static final ah X;
    public static final ah Y;
    public static final ah Z;
    public static final ah a;
    public static final ah aa;
    public static final ah ab;
    public static final ah ac;
    public static final ah ad;
    public static final ah ae;
    public static final ah af;
    public static final ah ag;
    public static final ah ah;
    private static com.c.b. ai = new i();
    private static final nit> aj[] = values();
    private static final values am[];
    public static final values b;
    public static final values c;
    public static final values d;
    public static final values e;
    public static final values f;
    public static final values g;
    public static final values h;
    public static final values i;
    public static final values j;
    public static final values k;
    public static final values l;
    public static final values m;
    public static final values n;
    public static final values o;
    public static final values p;
    public static final values q;
    public static final values r;
    public static final values s;
    public static final values t;
    public static final values u;
    public static final values v;
    public static final values w;
    public static final values x;
    public static final values y;
    public static final values z;
    private final int ak;
    private final int al;

    public static al a(int i1)
    {
        switch (i1)
        {
        case 334: 
        case 335: 
        case 356: 
        case 357: 
        case 358: 
        case 359: 
        default:
            return null;

        case 300: 
            return a;

        case 301: 
            return b;

        case 302: 
            return c;

        case 303: 
            return d;

        case 304: 
            return e;

        case 305: 
            return f;

        case 306: 
            return g;

        case 307: 
            return h;

        case 308: 
            return i;

        case 309: 
            return j;

        case 310: 
            return k;

        case 311: 
            return l;

        case 312: 
            return m;

        case 313: 
            return n;

        case 314: 
            return o;

        case 315: 
            return p;

        case 316: 
            return q;

        case 317: 
            return r;

        case 318: 
            return s;

        case 319: 
            return t;

        case 320: 
            return u;

        case 321: 
            return v;

        case 322: 
            return w;

        case 323: 
            return x;

        case 324: 
            return y;

        case 325: 
            return z;

        case 326: 
            return A;

        case 327: 
            return B;

        case 328: 
            return C;

        case 329: 
            return D;

        case 330: 
            return E;

        case 331: 
            return F;

        case 332: 
            return G;

        case 333: 
            return H;

        case 336: 
            return I;

        case 337: 
            return J;

        case 338: 
            return K;

        case 339: 
            return L;

        case 340: 
            return M;

        case 341: 
            return N;

        case 342: 
            return O;

        case 343: 
            return P;

        case 344: 
            return Q;

        case 345: 
            return R;

        case 346: 
            return S;

        case 347: 
            return T;

        case 348: 
            return U;

        case 349: 
            return V;

        case 350: 
            return W;

        case 351: 
            return X;

        case 352: 
            return Y;

        case 353: 
            return Z;

        case 354: 
            return aa;

        case 355: 
            return ab;

        case 360: 
            return ac;

        case 361: 
            return ad;

        case 362: 
            return ae;

        case 363: 
            return af;

        case 364: 
            return ag;

        case 365: 
            return ah;
        }
    }

    public static  valueOf(String s1)
    {
        return ()Enum.valueOf(com/kik/d/b/a$k, s1);
    }

    public static [] values()
    {
        return ([])am.clone();
    }

    public final int a()
    {
        return al;
    }

    static 
    {
        a = new <init>("DISCARDED_DATA", 0, 0, 300);
        b = new <init>("FIRST_EVER_RUN", 1, 1, 301);
        c = new <init>("SCREEN_VISITED", 2, 2, 302);
        d = new <init>("FIELD_VISITED", 3, 3, 303);
        e = new <init>("LOGIN_SUCCESS", 4, 4, 304);
        f = new <init>("LOGIN_ERROR", 5, 5, 305);
        g = new <init>("REGISTRATION_SUCCESS", 6, 6, 306);
        h = new <init>("REGISTRATION_ERROR", 7, 7, 307);
        i = new <init>("UNIT_TEST", 8, 8, 308);
        j = new <init>("AB_SELECTION", 9, 9, 309);
        k = new <init>("APP_OPENED", 10, 10, 310);
        l = new <init>("STREAM_INIT_COMPLETE", 11, 11, 311);
        m = new <init>("OPEN_CONVERSATIONS_CHANGED", 12, 12, 312);
        n = new <init>("MISSED_CONVERSATIONS_CHANGED", 13, 13, 313);
        o = new <init>("SIDEBAR_OPENED", 14, 14, 314);
        p = new <init>("CARD_LOADED", 15, 15, 315);
        q = new <init>("CARD_DELETED", 16, 16, 316);
        r = new <init>("CARD_ERROR_PROMPT_DISPLAYED", 17, 17, 317);
        s = new <init>("CARD_SWITCH_BEFORE_READY", 18, 18, 318);
        t = new <init>("CERTIFICATE_ERROR", 19, 19, 319);
        u = new <init>("CARD_FAVORITED", 20, 20, 320);
        v = new <init>("CARD_UNFAVORITED", 21, 21, 321);
        w = new <init>("SETTINGS_VISITED", 22, 22, 322);
        x = new <init>("USER_SEARCHED", 23, 23, 323);
        y = new <init>("EXPLICIT_SEARCH_SCREEN_VISITED", 24, 24, 324);
        z = new <init>("IAP_PURCHASE_SUCCESSFUL", 25, 25, 325);
        A = new <init>("IAP_PURCHASE_CANCELLED", 26, 26, 326);
        B = new <init>("IAP_PURCHASE_ERROR", 27, 27, 327);
        C = new <init>("MEDIA_TRAY_OPENED", 28, 28, 328);
        D = new <init>("MEDIA_TRAY_LAUNCHED_CARD", 29, 29, 329);
        E = new <init>("SMILEY_TRAY_OPENED", 30, 30, 330);
        F = new <init>("SMILEY_TRAY_SMILEY_SELECTED", 31, 31, 331);
        G = new <init>("PICKER_BACK_PRESSED", 32, 32, 332);
        H = new <init>("CONVO_OPENED", 33, 33, 333);
        I = new <init>("SEARCH_SUGGESTIONS_SHOWN", 34, 34, 336);
        J = new <init>("SEARCH_SUGGESTION_VISITED", 35, 35, 337);
        K = new <init>("SEARCH_ERROR", 36, 36, 338);
        L = new <init>("SEARCH_COMPLETED", 37, 37, 339);
        M = new <init>("SETTING_USED", 38, 38, 340);
        N = new <init>("STICKERS_OPENED_FROM_SMILEY", 39, 39, 341);
        O = new <init>("STICKERS_OPENED_FROM_TRAY", 40, 40, 342);
        P = new <init>("NETWORK_PING", 41, 41, 343);
        Q = new <init>("APP_READY", 42, 42, 344);
        R = new <init>("CONNECTION_FAILED_DIALOG_SHOWN", 43, 43, 345);
        S = new <init>("CHAT_BUBBLE_COLOR_OPENED", 44, 44, 346);
        T = new <init>("CHAT_BUBBLE_COLOR_CHANGED", 45, 45, 347);
        U = new <init>("MESSAGE_SENT", 46, 46, 348);
        V = new <init>("MESSAGE_DELETED", 47, 47, 349);
        W = new <init>("AB_TEST_JOINED", 48, 48, 350);
        X = new <init>("DEEP_LINK_TAPPED", 49, 49, 351);
        Y = new <init>("APP_CLOSED", 50, 50, 352);
        Z = new <init>("SCROLLED_CHATS_SCREEN", 51, 51, 353);
        aa = new <init>("SCROLLED_TALK_TO_SCREEN", 52, 52, 354);
        ab = new <init>("SCROLLED_MESSAGES_SCREEN", 53, 53, 355);
        ac = new <init>("LOADED_CHATS_SCREEN", 54, 54, 360);
        ad = new <init>("LOADED_TALK_TO_SCREEN", 55, 55, 361);
        ae = new <init>("LINK_WARNING_SHOWN_IGNORED", 56, 56, 362);
        af = new <init>("LINK_WARNING_SHOWN_ACCEPTED", 57, 57, 363);
        ag = new <init>("LINK_STATUS_TIMEOUT", 58, 58, 364);
        ah = new <init>("ADDRESS_BOOK_PROMPT", 59, 59, 365);
        am = (new am[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B, C, D, 
            E, F, G, H, I, J, K, L, M, N, 
            O, P, Q, R, S, T, U, V, W, X, 
            Y, Z, aa, ab, ac, ad, ae, af, ag, ah
        });
    }

    private (String s1, int i1, int j1, int k1)
    {
        super(s1, i1);
        ak = j1;
        al = k1;
    }
}
