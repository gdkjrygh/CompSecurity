// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;


public final class AnalyticsParameter extends Enum
{

    public static final AnalyticsParameter A;
    public static final AnalyticsParameter B;
    public static final AnalyticsParameter C;
    public static final AnalyticsParameter D;
    public static final AnalyticsParameter E;
    public static final AnalyticsParameter F;
    public static final AnalyticsParameter G;
    public static final AnalyticsParameter H;
    public static final AnalyticsParameter I;
    public static final AnalyticsParameter J;
    public static final AnalyticsParameter K;
    public static final AnalyticsParameter L;
    public static final AnalyticsParameter M;
    public static final AnalyticsParameter N;
    public static final AnalyticsParameter O;
    public static final AnalyticsParameter P;
    public static final AnalyticsParameter Q;
    public static final AnalyticsParameter R;
    public static final AnalyticsParameter S;
    public static final AnalyticsParameter T;
    public static final AnalyticsParameter U;
    private static final AnalyticsParameter X[];
    public static final AnalyticsParameter a;
    public static final AnalyticsParameter b;
    public static final AnalyticsParameter c;
    public static final AnalyticsParameter d;
    public static final AnalyticsParameter e;
    public static final AnalyticsParameter f;
    public static final AnalyticsParameter g;
    public static final AnalyticsParameter h;
    public static final AnalyticsParameter i;
    public static final AnalyticsParameter j;
    public static final AnalyticsParameter k;
    public static final AnalyticsParameter l;
    public static final AnalyticsParameter m;
    public static final AnalyticsParameter n;
    public static final AnalyticsParameter o;
    public static final AnalyticsParameter p;
    public static final AnalyticsParameter q;
    public static final AnalyticsParameter r;
    public static final AnalyticsParameter s;
    public static final AnalyticsParameter t;
    public static final AnalyticsParameter u;
    public static final AnalyticsParameter v;
    public static final AnalyticsParameter w;
    public static final AnalyticsParameter x;
    public static final AnalyticsParameter y;
    public static final AnalyticsParameter z;
    private final int V;
    private final Class W;

    private AnalyticsParameter(String s1, int i1, int j1, Class class1)
    {
        super(s1, i1);
        V = j1;
        W = class1;
    }

    public static AnalyticsParameter valueOf(String s1)
    {
        return (AnalyticsParameter)Enum.valueOf(com/skype/android/analytics/AnalyticsParameter, s1);
    }

    public static AnalyticsParameter[] values()
    {
        return (AnalyticsParameter[])X.clone();
    }

    public final Class a()
    {
        return W;
    }

    public final int b()
    {
        return V;
    }

    static 
    {
        a = new AnalyticsParameter("EVENT_ID", 0, 1, java/lang/Integer);
        b = new AnalyticsParameter("EVENT_VALUE", 1, 2, java/lang/String);
        c = new AnalyticsParameter("LAST_EVENT", 2, 3, java/lang/Integer);
        d = new AnalyticsParameter("TIME_SINCE_LAST_EVENT", 3, 4, java/lang/Integer);
        e = new AnalyticsParameter("DEVICE_INFO", 4, 6, java/lang/String);
        f = new AnalyticsParameter("RESPONSE_CODE", 5, 7, java/lang/String);
        g = new AnalyticsParameter("SERVER_ADDRESS", 6, 8, java/lang/String);
        h = new AnalyticsParameter("EXCEPTION", 7, 9, java/lang/String);
        i = new AnalyticsParameter("DURATION", 8, 10, java/lang/Integer);
        j = new AnalyticsParameter("RETRY_COUNT", 9, 11, java/lang/Integer);
        k = new AnalyticsParameter("USER_TYPE", 10, 12, java/lang/String);
        l = new AnalyticsParameter("BUTTON_TYPE", 11, 13, java/lang/String);
        m = new AnalyticsParameter("SCREEN_NAME", 12, 14, java/lang/String);
        n = new AnalyticsParameter("PRESENTED_PHONE_EDITED", 13, 15, java/lang/String);
        o = new AnalyticsParameter("PRESENTED_PHONE_FROM", 14, 16, java/lang/String);
        p = new AnalyticsParameter("E_TAG", 15, 17, java/lang/String);
        q = new AnalyticsParameter("ERROR_TYPE", 16, 18, java/lang/String);
        r = new AnalyticsParameter("DEVICE_DETAILS", 17, 19, java/lang/String);
        s = new AnalyticsParameter("DURATION_STRING_VALUE", 18, 20, java/lang/String);
        t = new AnalyticsParameter("FEATURE_ENABLED", 19, 21, java/lang/String);
        u = new AnalyticsParameter("RETRY_SUCCESS_COUNT", 20, 22, java/lang/String);
        v = new AnalyticsParameter("REASON_SKIP", 21, 23, java/lang/String);
        w = new AnalyticsParameter("USER_SOURCE", 22, 24, java/lang/String);
        x = new AnalyticsParameter("SCRAPE_QUERIED", 23, 25, java/lang/Integer);
        y = new AnalyticsParameter("SCRAPE_RESOLVED", 24, 26, java/lang/Integer);
        z = new AnalyticsParameter("FLOW_TYPE", 25, 27, java/lang/String);
        A = new AnalyticsParameter("ACCOUNT_TYPE", 26, 28, java/lang/String);
        B = new AnalyticsParameter("IS_MSA_SDK_USED", 27, 29, java/lang/Boolean);
        C = new AnalyticsParameter("PREVIOUS_SCREEN", 28, 30, java/lang/String);
        D = new AnalyticsParameter("CURRENT_SCREEN", 29, 31, java/lang/String);
        E = new AnalyticsParameter("SIGN_IN_DURATION", 30, 32, java/lang/String);
        F = new AnalyticsParameter("INSTALL_ID", 31, 33, java/lang/String);
        G = new AnalyticsParameter("UNIFIED_LOGIN_AUTO_REDIRECT", 32, 34, java/lang/Boolean);
        H = new AnalyticsParameter("UNIFIED_LOGIN_ID_USED_TO_SIGNIN", 33, 35, java/lang/String);
        I = new AnalyticsParameter("URL_TYPE", 34, 37, java/lang/String);
        J = new AnalyticsParameter("URL_TITLE_STATUS", 35, 38, java/lang/String);
        K = new AnalyticsParameter("ICON_PROFILE_STATUS", 36, 39, java/lang/String);
        L = new AnalyticsParameter("THUMBNAIL_PROFILE_STATUS", 37, 40, java/lang/String);
        M = new AnalyticsParameter("CACHE_FETCH_COUNT", 38, 41, java/lang/Integer);
        N = new AnalyticsParameter("CLICK_TYPE", 39, 42, java/lang/String);
        O = new AnalyticsParameter("VIM_ICON", 40, 43, java/lang/String);
        P = new AnalyticsParameter("VIM_FILTER_TYPE", 41, 44, java/lang/String);
        Q = new AnalyticsParameter("VIM_FILTER_COUNT", 42, 45, java/lang/Integer);
        R = new AnalyticsParameter("VIM_RECORDING_STATE", 43, 46, java/lang/String);
        S = new AnalyticsParameter("FAB_MENU_ITEM_SELECTED", 44, 52, java/lang/String);
        T = new AnalyticsParameter("LOCATION", 45, 60, java/lang/String);
        U = new AnalyticsParameter("MSG_ACTION_TYPE", 46, 62, java/lang/String);
        X = (new AnalyticsParameter[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B, C, D, 
            E, F, G, H, I, J, K, L, M, N, 
            O, P, Q, R, S, T, U
        });
    }
}
