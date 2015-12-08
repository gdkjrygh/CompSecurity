// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

public interface Term
{
    public static final class CONDITION extends Enum
    {

        private static final CONDITION $VALUES[];
        public static final CONDITION CONTAINS_WORDS;
        public static final CONDITION CONTAINS_WORD_PREFIXES;
        public static final CONDITION EQ;
        public static final CONDITION GE;
        public static final CONDITION GT;
        public static final CONDITION LE;
        public static final CONDITION LT;
        public static final CONDITION PREFIX_EQ;
        public static final CONDITION PREFIX_GE;
        public static final CONDITION PREFIX_LE;
        public static final CONDITION WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static CONDITION fromInt(int i)
        {
            CONDITION condition = (CONDITION)intToTypeMap.a(i);
            if (condition != null)
            {
                return condition;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static CONDITION valueOf(String s)
        {
            return (CONDITION)Enum.valueOf(com/skype/Term$CONDITION, s);
        }

        public static CONDITION[] values()
        {
            return (CONDITION[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            EQ = new CONDITION("EQ", 0, 0);
            GT = new CONDITION("GT", 1, 1);
            GE = new CONDITION("GE", 2, 2);
            LT = new CONDITION("LT", 3, 3);
            LE = new CONDITION("LE", 4, 4);
            PREFIX_EQ = new CONDITION("PREFIX_EQ", 5, 5);
            PREFIX_GE = new CONDITION("PREFIX_GE", 6, 6);
            PREFIX_LE = new CONDITION("PREFIX_LE", 7, 7);
            CONTAINS_WORDS = new CONDITION("CONTAINS_WORDS", 8, 8);
            CONTAINS_WORD_PREFIXES = new CONDITION("CONTAINS_WORD_PREFIXES", 9, 9);
            WRAPPER_UNKNOWN_VALUE = new CONDITION("WRAPPER_UNKNOWN_VALUE", 10, 0x7fffffff);
            $VALUES = (new CONDITION[] {
                EQ, GT, GE, LT, LE, PREFIX_EQ, PREFIX_GE, PREFIX_LE, CONTAINS_WORDS, CONTAINS_WORD_PREFIXES, 
                WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            CONDITION acondition[] = values();
            int k = acondition.length;
            for (int i = 0; i < k; i++)
            {
                CONDITION condition = acondition[i];
                intToTypeMap.a(condition.value, condition);
            }

        }

        private CONDITION(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

}
