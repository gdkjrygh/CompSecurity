// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bue extends Enum
{

    public static final bue a;
    public static final bue b;
    public static final bue c;
    public static final bue d;
    private static bue f;
    private static bue g;
    private static bue h;
    private static bue i;
    private static bue j;
    private static bue k;
    private static bue l;
    private static bue m;
    private static bue n;
    private static bue o;
    private static bue p;
    private static bue q;
    private static bue r;
    private static bue s;
    private static bue t;
    private static bue u;
    private static bue v;
    private static bue w;
    private static bue x;
    private static bue y;
    private static final bue z[];
    String e;

    private bue(String s1, int i1, String s2)
    {
        super(s1, i1);
        e = s2;
    }

    public static bue valueOf(String s1)
    {
        return (bue)Enum.valueOf(bue, s1);
    }

    public static bue[] values()
    {
        return (bue[])z.clone();
    }

    static 
    {
        f = new bue("UP_SYNC_BEGIN", 0, "Up sync has begun for %s.");
        g = new bue("UP_SYNC_END", 1, "Up sync has finished for %s.");
        h = new bue("DOWN_SYNC_BEGIN", 2, "Down sync has begun.");
        i = new bue("DOWN_SYNC_END", 3, "Down sync has finished.");
        j = new bue("NO_CLUSTERS_SELECTED_FOR_ANALYSIS", 4, "No clusters selected for analysis.");
        k = new bue("CLUSTERS_SELECTED_FOR_ANALYSIS", 5, "Clusters selected for analysis. Count = %s.");
        a = new bue("PLUGGED_IN_ANALYSIS_BEGIN", 6, "Plugged-in analysis has begun.");
        b = new bue("PLUGGED_IN_ANALYSIS_END", 7, "Plugged-in analysis has finished. Successful = %s.");
        l = new bue("PHOTO_ANALYSIS_BEGIN", 8, "Photo analysis has begun for %s.");
        m = new bue("PHOTO_ANALYSIS_END", 9, "Photo analysis has finished for %s. Successful = %s.");
        c = new bue("VIDEO_ANALYSIS_BEGIN", 10, "Video analysis has begun for %s.");
        d = new bue("VIDEO_ANALYSIS_END", 11, "Video analysis has finished for %s. Successful = %s.");
        n = new bue("CLUSTER_ANALYSIS_END", 12, "Cluster analysis has finished for %s.");
        o = new bue("ATTRIBUTE_SET", 13, "Cluster attribute set for %s.");
        p = new bue("ATTRIBUTE_CLEARED", 14, "Cluster attribute cleared for %s.");
        q = new bue("CAN_SHOW_NEW_AAM_SYSTEM_NOTIFICATION", 15, "Can show new aam system notification = %s, last dismiss = %s.");
        r = new bue("CAN_SHOW_NEW_AAM_IN_APP_NOTIFICATION", 16, "Can show new aam in app notification = %s, last dismiss = %s.");
        s = new bue("INSPECTED_CLUSTER_TIMESTAMP", 17, "Cluster '%s' timestamp inspected. Min timestamp = %s.");
        t = new bue("NEW_AAM_COUNT_UPDATED", 18, "New aam count updated. Count = %s. Max viewed timestamp = %s.");
        u = new bue("NEW_AAM_COUNT_RESET", 19, "New aam count reset. Max viewed timestamp = %s.");
        v = new bue("NEW_AAM_IN_APP_NOTIFICATION_SHOWN", 20, "New aam in-app notification shown.");
        w = new bue("NEW_AAM_SYSTEM_NOTIFICATION_SHOWN", 21, "New aam system notification shown. Count = %s.");
        x = new bue("NEW_AAM_SYSTEM_NOTIFICATION_DISMISSED", 22, "New aam system notification dismissed.");
        y = new bue("NEW_AAM_IN_APP_NOTIFICATION_DISMISSED", 23, "New aam in-app notification dismissed.");
        z = (new bue[] {
            f, g, h, i, j, k, a, b, l, m, 
            c, d, n, o, p, q, r, s, t, u, 
            v, w, x, y
        });
    }
}
