// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave;


public class ABRParameters
{
    public static final class ABRPolicy extends Enum
    {

        private static final ABRPolicy $VALUES[];
        public static final ABRPolicy ABR_AGGRESSIVE;
        public static final ABRPolicy ABR_AUTO_OFF;
        public static final ABRPolicy ABR_CONSERVATIVE;
        public static final ABRPolicy ABR_MODERATE;
        private final int value;

        public static ABRPolicy valueOf(String s)
        {
            return (ABRPolicy)Enum.valueOf(com/adobe/ave/ABRParameters$ABRPolicy, s);
        }

        public static ABRPolicy[] values()
        {
            return (ABRPolicy[])$VALUES.clone();
        }

        public int getValue()
        {
            return value;
        }

        static 
        {
            ABR_AGGRESSIVE = new ABRPolicy("ABR_AGGRESSIVE", 0, 0);
            ABR_MODERATE = new ABRPolicy("ABR_MODERATE", 1, 1);
            ABR_CONSERVATIVE = new ABRPolicy("ABR_CONSERVATIVE", 2, 2);
            ABR_AUTO_OFF = new ABRPolicy("ABR_AUTO_OFF", 3, 3);
            $VALUES = (new ABRPolicy[] {
                ABR_AGGRESSIVE, ABR_MODERATE, ABR_CONSERVATIVE, ABR_AUTO_OFF
            });
        }

        private ABRPolicy(String s, int i, int j)
        {
            super(s, i);
            value = j;
        }
    }


    public int maxBitsPerSecond;
    public int maxVideoHeight;
    public int maxVideoWidth;
    public int minBitsPerSecond;
    public int minVideoHeight;
    public int minVideoWidth;
    public ABRPolicy policy;
    public int profileIndex;
    public int startBitsPerSecond;

    public ABRParameters()
    {
        policy = ABRPolicy.ABR_MODERATE;
        profileIndex = 0;
        startBitsPerSecond = 0;
        minBitsPerSecond = 0;
        maxBitsPerSecond = 0x7fffffff;
        minVideoWidth = 0;
        maxVideoWidth = 0x7fffffff;
        minVideoHeight = 0;
        maxVideoHeight = 0x7fffffff;
    }

    public int getPolicyType()
    {
        return policy.getValue();
    }
}
