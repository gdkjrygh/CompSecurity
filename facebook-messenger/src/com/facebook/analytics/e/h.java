// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.e;


public final class h extends Enum
{

    private static final h $VALUES[];
    public static final h ACTIVITY_CREATED;
    public static final h ACTIVITY_RESUMED;
    public static final h CLIENT_TTI;
    public static final h DATA_RECEIVED;
    public static final h DATA_REQUESTED;
    public static final h MARK;
    public static final h START;
    public static final h STOP;
    public static final h VALUE;
    private final String mMarkerName;

    private h(String s, int i, String s1)
    {
        super(s, i);
        mMarkerName = s1;
    }

    public static h valueOf(String s)
    {
        return (h)Enum.valueOf(com/facebook/analytics/e/h, s);
    }

    public static h[] values()
    {
        return (h[])$VALUES.clone();
    }

    public String toString()
    {
        return mMarkerName;
    }

    static 
    {
        START = new h("START", 0, "start");
        STOP = new h("STOP", 1, "stop");
        MARK = new h("MARK", 2, "mark");
        CLIENT_TTI = new h("CLIENT_TTI", 3, "client_tti");
        VALUE = new h("VALUE", 4, "value");
        DATA_REQUESTED = new h("DATA_REQUESTED", 5, "data_requested");
        DATA_RECEIVED = new h("DATA_RECEIVED", 6, "data_received");
        ACTIVITY_CREATED = new h("ACTIVITY_CREATED", 7, "activity_created");
        ACTIVITY_RESUMED = new h("ACTIVITY_RESUMED", 8, "activity_resumed");
        $VALUES = (new h[] {
            START, STOP, MARK, CLIENT_TTI, VALUE, DATA_REQUESTED, DATA_RECEIVED, ACTIVITY_CREATED, ACTIVITY_RESUMED
        });
    }
}
