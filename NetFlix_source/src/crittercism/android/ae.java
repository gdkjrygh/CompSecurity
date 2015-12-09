// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;


public final class ae extends Enum
{

    public static final ae a;
    public static final ae b;
    public static final ae c;
    public static final ae d;
    public static final ae e;
    public static final ae f;
    public static final ae g;
    public static final ae h;
    public static final ae i;
    public static final ae j;
    public static final ae k;
    private static final ae o[];
    private String l;
    private String m;
    private String n;

    private ae(String s, int i1, String s1, String s2)
    {
        super(s, i1);
        l = s1;
        m = s2;
        n = null;
    }

    public static ae valueOf(String s)
    {
        return (ae)Enum.valueOf(crittercism/android/ae, s);
    }

    public static ae[] values()
    {
        return (ae[])o.clone();
    }

    public final String a()
    {
        return l;
    }

    public final String b()
    {
        return m;
    }

    static 
    {
        a = new ae("CURRENT_BREADCRUMBS", 0, "com.crittercism.breadcrumbs", "currentBreadcrumbs");
        b = new ae("PREVIOUS_BREADCRUMBS", 1, "com.crittercism.breadcrumbs", "previousBreadcrumbs");
        c = new ae("NETWORK_BREADCRUMBS", 2, "com.crittercism.breadcrumbs", "networkBreadcrumbs");
        d = new ae("RATE_APP_SETTING", 3, "com.crittercism.usersettings", "rateAppSettings");
        e = new ae("CRASHED_ON_LAST_LOAD_SETTING", 4, "com.crittercism.usersettings", "crashedOnLastLoad");
        f = new ae("OPT_OUT_STATUS_SETTING", 5, "com.crittercism.usersettings", "optOutStatusSettings");
        g = new ae("HASHED_DEVICE_ID_SETTING", 6, "com.crittercism.usersettings", "hashedDeviceID");
        h = new ae("SESSION_ID_SETTING", 7, "com.crittercism.usersettings", "sessionIDSetting");
        i = new ae("OLD_HASHED_DEVICE_ID_SETTING", 8, "com.crittercism.prefs", "com.crittercism.prefs.did");
        j = new ae("OLD_SESSION_ID_SETTING", 9, "com.crittercism.prefs", "com.crittercism.prefs.sessid");
        k = new ae("OLD_OPT_OUT_STATUS_SETTING", 10, "com.crittercism.prefs", "optOutStatus");
        o = (new ae[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }
}
