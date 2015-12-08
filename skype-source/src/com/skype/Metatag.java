// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

public interface Metatag
{
    public static final class TYPE extends Enum
    {

        private static final TYPE $VALUES[];
        public static final TYPE BINARY;
        public static final TYPE INTEGER;
        public static final TYPE STRING;
        public static final TYPE WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static TYPE fromInt(int i)
        {
            TYPE type = (TYPE)intToTypeMap.a(i);
            if (type != null)
            {
                return type;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static TYPE valueOf(String s)
        {
            return (TYPE)Enum.valueOf(com/skype/Metatag$TYPE, s);
        }

        public static TYPE[] values()
        {
            return (TYPE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            INTEGER = new TYPE("INTEGER", 0, 0);
            STRING = new TYPE("STRING", 1, 1);
            BINARY = new TYPE("BINARY", 2, 2);
            WRAPPER_UNKNOWN_VALUE = new TYPE("WRAPPER_UNKNOWN_VALUE", 3, 0x7fffffff);
            $VALUES = (new TYPE[] {
                INTEGER, STRING, BINARY, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            TYPE atype[] = values();
            int k = atype.length;
            for (int i = 0; i < k; i++)
            {
                TYPE type = atype[i];
                intToTypeMap.a(type.value, type);
            }

        }

        private TYPE(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }


    public abstract int getAllocedSize();

    public abstract byte[] getBinValue();

    public abstract long getInt64Value();

    public abstract int getIntValue();

    public abstract int getKey();

    public abstract String getStrValue();

    public abstract TYPE getType();

    public abstract boolean isFullEqual(Metatag metatag);

    public abstract boolean isKeyEqual(Metatag metatag);

    public abstract boolean isNull();

    public abstract boolean isValueEqual(Metatag metatag);
}
