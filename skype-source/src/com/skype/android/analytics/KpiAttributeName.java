// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;


// Referenced classes of package com.skype.android.analytics:
//            EventAttribute

public final class KpiAttributeName extends Enum
    implements EventAttribute
{

    public static final KpiAttributeName a;
    public static final KpiAttributeName b;
    public static final KpiAttributeName c;
    public static final KpiAttributeName d;
    public static final KpiAttributeName e;
    public static final KpiAttributeName f;
    public static final KpiAttributeName g;
    public static final KpiAttributeName h;
    public static final KpiAttributeName i;
    public static final KpiAttributeName j;
    public static final KpiAttributeName k;
    public static final KpiAttributeName l;
    public static final KpiAttributeName m;
    private static final KpiAttributeName n[];

    private KpiAttributeName(String s, int i1)
    {
        super(s, i1);
    }

    public static KpiAttributeName valueOf(String s)
    {
        return (KpiAttributeName)Enum.valueOf(com/skype/android/analytics/KpiAttributeName, s);
    }

    public static KpiAttributeName[] values()
    {
        return (KpiAttributeName[])n.clone();
    }

    static 
    {
        a = new KpiAttributeName("ClosedTimestamp", 0);
        b = new KpiAttributeName("OpenedTimestamp", 1);
        c = new KpiAttributeName("TimeInForeground", 2);
        d = new KpiAttributeName("Entry_Point", 3);
        e = new KpiAttributeName("Exit_Point", 4);
        f = new KpiAttributeName("Foregrounded_Duration", 5);
        g = new KpiAttributeName("Foreground_Start_Time", 6);
        h = new KpiAttributeName("Content_Type", 7);
        i = new KpiAttributeName("Conversation_Id", 8);
        j = new KpiAttributeName("Device_Type", 9);
        k = new KpiAttributeName("Group_Conversation", 10);
        l = new KpiAttributeName("Message_Type", 11);
        m = new KpiAttributeName("Status", 12);
        n = (new KpiAttributeName[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m
        });
    }
}
