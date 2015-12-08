// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import java.util.Map;
import java.util.Random;

class AdMobInfo
{
    static final class AdMobKey extends Enum
    {

        private static final AdMobKey $VALUES[];
        public static final AdMobKey CLIENT_ID_KEY;
        public static final AdMobKey HIT_ID_KEY;
        public static final AdMobKey PROPERTY_ID_KEY;
        public static final AdMobKey VISITOR_ID_KEY;
        private String mBowParameter;

        public static AdMobKey valueOf(String s)
        {
            return (AdMobKey)Enum.valueOf(com/google/analytics/tracking/android/AdMobInfo$AdMobKey, s);
        }

        public static AdMobKey[] values()
        {
            return (AdMobKey[])$VALUES.clone();
        }

        String getBowParameter()
        {
            return mBowParameter;
        }

        static 
        {
            CLIENT_ID_KEY = new AdMobKey("CLIENT_ID_KEY", 0, "ga_cid");
            HIT_ID_KEY = new AdMobKey("HIT_ID_KEY", 1, "ga_hid");
            PROPERTY_ID_KEY = new AdMobKey("PROPERTY_ID_KEY", 2, "ga_wpids");
            VISITOR_ID_KEY = new AdMobKey("VISITOR_ID_KEY", 3, "ga_uid");
            $VALUES = (new AdMobKey[] {
                CLIENT_ID_KEY, HIT_ID_KEY, PROPERTY_ID_KEY, VISITOR_ID_KEY
            });
        }

        private AdMobKey(String s, int i, String s1)
        {
            super(s, i);
            mBowParameter = s1;
        }
    }


    private static final AdMobInfo INSTANCE = new AdMobInfo();
    private int mAdHitId;
    private Random mRandom;

    private AdMobInfo()
    {
        mRandom = new Random();
    }

    static AdMobInfo getInstance()
    {
        return INSTANCE;
    }

    int generateAdHitId()
    {
        mAdHitId = mRandom.nextInt(0x7ffffffe) + 1;
        return mAdHitId;
    }

    int getAdHitId()
    {
        return mAdHitId;
    }

    Map getJoinIds()
    {
        return null;
    }

    void setAdHitId(int i)
    {
        mAdHitId = i;
    }

}
