// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;


public final class cq extends Enum
{

    public static final cq a;
    public static final cq b;
    public static final cq c;
    public static final cq d;
    public static final cq e;
    public static final cq f;
    public static final cq g;
    public static final cq h;
    public static final cq i;
    public static final cq j;
    public static final cq k;
    public static final cq l;
    private static final cq o[];
    private String m;
    private String n;

    private cq(String s, int i1, String s1, String s2)
    {
        super(s, i1);
        m = s1;
        n = s2;
    }

    public static cq valueOf(String s)
    {
        return (cq)Enum.valueOf(crittercism/android/cq, s);
    }

    public static cq[] values()
    {
        return (cq[])o.clone();
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
        a = new cq("APP_LOADS_FILES", 0, "com.crittercism.apploads", "appLoadFiles");
        b = new cq("HANDLED_EXCEPTION_FILES", 1, "com.crittercism.exceptions", "handledExceptionFiles");
        c = new cq("SDK_CRASHES_FILES", 2, "com.crittercism.sdkcrashes", "sdkCrashFiles");
        d = new cq("NDK_CRASHES_FILES", 3, "com.crittercism.ndkcrashes", "ndkCrashFiles");
        e = new cq("CURRENT_BREADCRUMBS_FILES", 4, "com.crittercism.breadcrumbs", "currentBreadcrumbFiles");
        f = new cq("PREVIOUS_BREADCRUMBS_FILES", 5, "com.crittercism.breadcrumbs", "previousBreadcrumbFiles");
        g = new cq("NETWORK_BREADCRUMBS_FILES", 6, "com.crittercism.breadcrumbs", "networkBreadcrumbFiles");
        h = new cq("CRASHED_ON_LAST_LOAD_SETTING", 7, "com.crittercism.usersettings", "crashedOnLastLoad");
        i = new cq("OPT_OUT_STATUS_SETTING", 8, "com.crittercism.usersettings", "optOutStatusSettings");
        j = new cq("SESSION_ID_SETTING", 9, "com.crittercism.usersettings", "sessionIDSetting");
        k = new cq("OLD_SESSION_ID_SETTING", 10, "com.crittercism.prefs", "com.crittercism.prefs.sessid");
        l = new cq("OLD_OPT_OUT_STATUS_SETTING", 11, "com.crittercism.prefs", "optOutStatus");
        o = (new cq[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l
        });
    }
}
