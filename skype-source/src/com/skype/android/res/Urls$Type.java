// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.res;

import com.skype.android.util.DeviceFeatures;

// Referenced classes of package com.skype.android.res:
//            Urls

public static final class y extends Enum
{

    public static final w a;
    public static final w b;
    public static final w c;
    public static final w d;
    public static final w e;
    public static final w f;
    public static final w g;
    public static final w h;
    public static final w i;
    public static final w j;
    public static final w k;
    public static final w l;
    public static final w m;
    public static final w n;
    public static final w o;
    public static final w p;
    public static final w q;
    public static final w r;
    public static final w s;
    public static final w t;
    public static final w u;
    public static final w v;
    public static final w w;
    private static final w z[];
    private boolean x;
    private int y;

    public static y valueOf(String s1)
    {
        return (y)Enum.valueOf(com/skype/android/res/Urls$Type, s1);
    }

    public static y[] values()
    {
        return (y[])z.clone();
    }

    public final boolean a()
    {
        return x;
    }

    final int b()
    {
        return y;
    }

    static 
    {
        a = new <init>("SKYPE_HELP", 0, 0x7f080513, false);
        b = new <init>("SKYPE_USER_FEEDBACK", 1, 0x7f080508, false);
        c = new <init>("SKYPE_BUY_ONLINE_NUMBER", 2, 0x7f0804f6, true);
        d = new <init>("SKYPE_BUY_VOICEMAIL", 3, 0x7f0804fa, true);
        e = new <init>("SKYPE_BUY_CREDIT", 4, 0x7f0804f7, true);
        f = new <init>("SKYPE_BUY_SUBSCRIPTION", 5, 0x7f0804f9, true);
        g = new <init>("SKYPE_BUY_PREMIUM", 6, 0x7f0804f8, true);
        h = new <init>("SKYPE_ACCOUNT", 7, 0x7f0804f1, true);
        int i1;
        if (DeviceFeatures.c())
        {
            i1 = 0x7f080569;
        } else
        {
            i1 = 0x7f080568;
        }
        i = new <init>("ANDROID_MARKET_DETAILS", 8, i1, false);
        if (DeviceFeatures.c())
        {
            i1 = 0x7f08056c;
        } else
        if (DeviceFeatures.d())
        {
            i1 = 0x7f08056b;
        } else
        {
            i1 = 0x7f08056a;
        }
        j = new <init>("ANDROID_MARKET_SEARCH", 9, i1, false);
        if (DeviceFeatures.c())
        {
            i1 = 0x7f08056f;
        } else
        if (DeviceFeatures.d())
        {
            i1 = 0x7f08056e;
        } else
        {
            i1 = 0x7f08056d;
        }
        k = new <init>("ANDROID_MARKET", 10, i1, false);
        if (DeviceFeatures.c())
        {
            i1 = 0x7f080578;
        } else
        {
            i1 = 0x7f080577;
        }
        l = new <init>("SKYPE_WIFI_URL", 11, i1, false);
        m = new <init>("SKYPE_WIFI_PACKAGE", 12, 0x7f080576, false);
        n = new <init>("SKYPE_FORGOTTEN_PASSWORD", 13, 0x7f080509, false);
        o = new <init>("SKYPE_FEEDBACK", 14, 0x7f08034f, false);
        p = new <init>("SKYPE_ACCOUNT_BLOCKED", 15, 0x7f0804f0, false);
        if (DeviceFeatures.c())
        {
            i1 = 0x7f08058c;
        } else
        if (DeviceFeatures.d())
        {
            i1 = 0x7f08058b;
        } else
        {
            i1 = 0x7f08058a;
        }
        q = new <init>("WHITELIST_VERSION", 16, i1, false);
        r = new <init>("LIVEID_AUTH", 17, 0, false);
        s = new <init>("TERMS_OF_USE", 18, 0x7f08057e, false);
        t = new <init>("PRIVACY_POLICY", 19, 0x7f080574, false);
        u = new <init>("MANAGE_MSA_ALIASES", 20, 0x7f080566, false);
        v = new <init>("MANAGE_PROFILE_LINK", 21, 0x7f080567, false);
        w = new <init>("SKYPE_PSTN_BLOCKED_REGULATORY_INDIA", 22, 0x7f080563, false);
        z = (new z[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w
        });
    }

    private tures(String s1, int i1, int j1, boolean flag)
    {
        super(s1, i1);
        x = flag;
        y = j1;
    }
}
