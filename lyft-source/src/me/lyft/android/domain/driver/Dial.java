// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.driver;

import me.lyft.android.common.INullable;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.infrastructure.lyft.driver.DialDTO;

public class Dial
    implements INullable
{

    boolean goalMet;
    int maxValue;
    String subtitle;
    String title;
    Type type;
    int value;

    public Dial(Type type1, String s, String s1, Integer integer, Integer integer1, Boolean boolean1)
    {
        type = type1;
        title = s;
        subtitle = s1;
        value = integer.intValue();
        maxValue = integer1.intValue();
        goalMet = boolean1.booleanValue();
    }

    public static Dial empty()
    {
        return NullDial.getInstance();
    }

    public static Dial fromDto(DialDTO dialdto)
    {
        Object obj = dialdto.type;
        if (Strings.isNullOrEmpty(((String) (obj))))
        {
            obj = Type.COUNT;
        } else
        {
            obj = Type.valueOf(((String) (obj)).toUpperCase());
        }
        return new Dial(((Type) (obj)), (String)Objects.firstNonNull(dialdto.title, ""), (String)Objects.firstNonNull(dialdto.subtitle, ""), (Integer)Objects.firstNonNull(dialdto.value, Integer.valueOf(0)), (Integer)Objects.firstNonNull(dialdto.maxValue, Integer.valueOf(0)), (Boolean)Objects.firstNonNull(dialdto.goalMet, Boolean.valueOf(false)));
    }

    public int getMaxValue()
    {
        return maxValue;
    }

    public String getSubtitle()
    {
        return subtitle;
    }

    public String getTitle()
    {
        return title;
    }

    public Type getType()
    {
        return type;
    }

    public int getValue()
    {
        return value;
    }

    public boolean isGoalMet()
    {
        return goalMet;
    }

    public boolean isNull()
    {
        return false;
    }

    private class NullDial extends Dial
    {
        private class Type extends Enum
        {

            private static final Type $VALUES[];
            public static final Type COUNT;
            public static final Type MONEY;
            public static final Type PERCENTAGE;
            public static final Type TIME;

            public static Type valueOf(String s)
            {
                return (Type)Enum.valueOf(me/lyft/android/domain/driver/Dial$Type, s);
            }

            public static Type[] values()
            {
                return (Type[])$VALUES.clone();
            }

            static 
            {
                COUNT = new Type("COUNT", 0);
                TIME = new Type("TIME", 1);
                PERCENTAGE = new Type("PERCENTAGE", 2);
                MONEY = new Type("MONEY", 3);
                $VALUES = (new Type[] {
                    COUNT, TIME, PERCENTAGE, MONEY
                });
            }

            private Type(String s, int i)
            {
                super(s, i);
            }
        }


        private static final Dial INSTANCE = new NullDial();

        static Dial getInstance()
        {
            return INSTANCE;
        }

        public boolean isNull()
        {
            return true;
        }


        private NullDial()
        {
            super(Type.COUNT, "", "", Integer.valueOf(0), Integer.valueOf(0), Boolean.valueOf(false));
        }
    }

}
