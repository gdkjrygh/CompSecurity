// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.time;


public class DateUtils
{
    private static final class ModifyType extends Enum
    {

        private static final ModifyType $VALUES[];
        public static final ModifyType CEILING;
        public static final ModifyType ROUND;
        public static final ModifyType TRUNCATE;

        public static ModifyType valueOf(String s)
        {
            return (ModifyType)Enum.valueOf(org/apache/commons/lang3/time/DateUtils$ModifyType, s);
        }

        public static ModifyType[] values()
        {
            return (ModifyType[])$VALUES.clone();
        }

        static 
        {
            TRUNCATE = new ModifyType("TRUNCATE", 0);
            ROUND = new ModifyType("ROUND", 1);
            CEILING = new ModifyType("CEILING", 2);
            $VALUES = (new ModifyType[] {
                TRUNCATE, ROUND, CEILING
            });
        }

        private ModifyType(String s, int i)
        {
            super(s, i);
        }
    }


    private static final int fields[][] = {
        {
            14
        }, {
            13
        }, {
            12
        }, {
            11, 10
        }, {
            5, 5, 9
        }, {
            2, 1001
        }, {
            1
        }, {
            0
        }
    };

}
