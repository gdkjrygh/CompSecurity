// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;


// Referenced classes of package com.google.analytics.tracking.android:
//            AdMobInfo

static final class mBowParameter extends Enum
{

    private static final VISITOR_ID_KEY $VALUES[];
    public static final VISITOR_ID_KEY CLIENT_ID_KEY;
    public static final VISITOR_ID_KEY HIT_ID_KEY;
    public static final VISITOR_ID_KEY PROPERTY_ID_KEY;
    public static final VISITOR_ID_KEY VISITOR_ID_KEY;
    private String mBowParameter;

    public static mBowParameter valueOf(String s)
    {
        return (mBowParameter)Enum.valueOf(com/google/analytics/tracking/android/AdMobInfo$AdMobKey, s);
    }

    public static mBowParameter[] values()
    {
        return (mBowParameter[])$VALUES.clone();
    }

    String getBowParameter()
    {
        return mBowParameter;
    }

    static 
    {
        CLIENT_ID_KEY = new <init>("CLIENT_ID_KEY", 0, "ga_cid");
        HIT_ID_KEY = new <init>("HIT_ID_KEY", 1, "ga_hid");
        PROPERTY_ID_KEY = new <init>("PROPERTY_ID_KEY", 2, "ga_wpids");
        VISITOR_ID_KEY = new <init>("VISITOR_ID_KEY", 3, "ga_uid");
        $VALUES = (new .VALUES[] {
            CLIENT_ID_KEY, HIT_ID_KEY, PROPERTY_ID_KEY, VISITOR_ID_KEY
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        mBowParameter = s1;
    }
}
