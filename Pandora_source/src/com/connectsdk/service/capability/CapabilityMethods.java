// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.service.capability;

import java.util.regex.Pattern;

public interface CapabilityMethods
{
    public static final class CapabilityPriorityLevel extends Enum
    {

        private static final CapabilityPriorityLevel $VALUES[];
        public static final CapabilityPriorityLevel HIGH;
        public static final CapabilityPriorityLevel LOW;
        public static final CapabilityPriorityLevel NORMAL;
        public static final CapabilityPriorityLevel VERY_HIGH;
        public static final CapabilityPriorityLevel VERY_LOW;
        private final int value;

        public static CapabilityPriorityLevel valueOf(String s)
        {
            return (CapabilityPriorityLevel)Enum.valueOf(com/connectsdk/service/capability/CapabilityMethods$CapabilityPriorityLevel, s);
        }

        public static CapabilityPriorityLevel[] values()
        {
            return (CapabilityPriorityLevel[])$VALUES.clone();
        }

        public int getValue()
        {
            return value;
        }

        static 
        {
            VERY_LOW = new CapabilityPriorityLevel("VERY_LOW", 0, 1);
            LOW = new CapabilityPriorityLevel("LOW", 1, 25);
            NORMAL = new CapabilityPriorityLevel("NORMAL", 2, 50);
            HIGH = new CapabilityPriorityLevel("HIGH", 3, 75);
            VERY_HIGH = new CapabilityPriorityLevel("VERY_HIGH", 4, 100);
            $VALUES = (new CapabilityPriorityLevel[] {
                VERY_LOW, LOW, NORMAL, HIGH, VERY_HIGH
            });
        }

        private CapabilityPriorityLevel(String s, int i, int j)
        {
            super(s, i);
            value = j;
        }
    }


    public static final Pattern ANY_PATTERN = Pattern.compile(".+\\.(?=Any)");

}
