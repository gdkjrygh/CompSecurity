// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.data;

import com.pandora.android.provider.b;

// Referenced classes of package com.pandora.android.data:
//            e

public class d
{

    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static boolean j;
    public static String k = "pandora";

    static 
    {
        j = false;
        e e1 = new e(b.a.h());
        a = e1.a("API_HTTP_URL", "http://tuner.pandora.com/services/json/");
        b = e1.a("API_HTTPS_URL", "https://tuner.pandora.com/services/json/");
        c = e1.a("AJAX_HTTP_URL", "http://tuner.pandora.com/services/ajax/");
        d = e1.a("AUTOCOMPLETE_URL", "http://autocomplete.pandora.com/");
        e = e1.a("LISTENING_TIMEOUT_MESSAGE_URL", "http://www.pandora.com/");
        f = e1.a("STATS_COLLECTOR_URL", "http://stats.pandora.com/");
        g = e1.a("HTTP_AUTHORITY", "http://www.pandora.com/");
        i = e1.a("HTTP_AUTHORITY", "http://proxy.pandora.com:80");
        h = e1.a("CHROMECAST_APP_NAME", "36061251");
        k = e1.a("BUILD_TYPE", "pandora");
        e1.a(j);
    }
}
