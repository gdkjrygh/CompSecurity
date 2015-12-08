// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


public final class dl extends Enum
{

    public static final dl a;
    public static final dl b;
    public static final dl c;
    public static final dl d;
    public static final dl e;
    public static final dl f;
    public static final dl g;
    public static final dl h;
    public static final dl i;
    public static final dl j;
    public static final dl k;
    public static final dl l;
    private static final dl o[];
    private String m;
    private String n;

    private dl(String s, int i1, String s1, String s2)
    {
        super(s, i1);
        m = s1;
        n = s2;
    }

    public static dl valueOf(String s)
    {
        return (dl)Enum.valueOf(b/a/dl, s);
    }

    public static dl[] values()
    {
        return (dl[])o.clone();
    }

    public final String a()
    {
        return m;
    }

    public final String b()
    {
        return n;
    }

    static 
    {
        a = new dl("APP_LOADS_FILES", 0, "com.crittercism.apploads", "appLoadFiles");
        b = new dl("HANDLED_EXCEPTION_FILES", 1, "com.crittercism.exceptions", "handledExceptionFiles");
        c = new dl("SDK_CRASHES_FILES", 2, "com.crittercism.sdkcrashes", "sdkCrashFiles");
        d = new dl("NDK_CRASHES_FILES", 3, "com.crittercism.ndkcrashes", "ndkCrashFiles");
        e = new dl("CURRENT_BREADCRUMBS_FILES", 4, "com.crittercism.breadcrumbs", "currentBreadcrumbFiles");
        f = new dl("PREVIOUS_BREADCRUMBS_FILES", 5, "com.crittercism.breadcrumbs", "previousBreadcrumbFiles");
        g = new dl("NETWORK_BREADCRUMBS_FILES", 6, "com.crittercism.breadcrumbs", "networkBreadcrumbFiles");
        h = new dl("CRASHED_ON_LAST_LOAD_SETTING", 7, "com.crittercism.usersettings", "crashedOnLastLoad");
        i = new dl("OPT_OUT_STATUS_SETTING", 8, "com.crittercism.usersettings", "optOutStatusSettings");
        j = new dl("SESSION_ID_SETTING", 9, "com.crittercism.usersettings", "sessionIDSetting");
        k = new dl("OLD_SESSION_ID_SETTING", 10, "com.crittercism.prefs", "com.crittercism.prefs.sessid");
        l = new dl("OLD_OPT_OUT_STATUS_SETTING", 11, "com.crittercism.prefs", "optOutStatus");
        o = (new dl[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l
        });
    }
}
