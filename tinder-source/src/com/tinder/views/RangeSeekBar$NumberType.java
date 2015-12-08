// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import java.math.BigDecimal;

// Referenced classes of package com.tinder.views:
//            RangeSeekBar

private static final class  extends Enum
{

    private static final BIG_DECIMAL $VALUES[];
    public static final BIG_DECIMAL BIG_DECIMAL;
    public static final BIG_DECIMAL BYTE;
    public static final BIG_DECIMAL DOUBLE;
    public static final BIG_DECIMAL FLOAT;
    public static final BIG_DECIMAL INTEGER;
    public static final BIG_DECIMAL LONG;
    public static final BIG_DECIMAL SHORT;

    public static  fromNumber(Number number)
        throws IllegalArgumentException
    {
        if (number instanceof Long)
        {
            return LONG;
        }
        if (number instanceof Double)
        {
            return DOUBLE;
        }
        if (number instanceof Integer)
        {
            return INTEGER;
        }
        if (number instanceof Float)
        {
            return FLOAT;
        }
        if (number instanceof Short)
        {
            return SHORT;
        }
        if (number instanceof Byte)
        {
            return BYTE;
        }
        if (number instanceof BigDecimal)
        {
            return BIG_DECIMAL;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Number class '")).append(number.getClass().getName()).append("' is not supported").toString());
        }
    }

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/tinder/views/RangeSeekBar$NumberType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    public final Number toNumber(double d)
    {
        switch (p.com.tinder.views.RangeSeekBar.NumberType[ordinal()])
        {
        default:
            throw new InstantiationError((new StringBuilder("can't convert ")).append(this).append(" to a Number object").toString());

        case 1: // '\001'
            return new Long((long)d);

        case 2: // '\002'
            return Double.valueOf(d);

        case 3: // '\003'
            return new Integer((int)d);

        case 4: // '\004'
            return new Float(d);

        case 5: // '\005'
            return new Short((short)(int)d);

        case 6: // '\006'
            return new Byte((byte)(int)d);

        case 7: // '\007'
            return new BigDecimal(d);
        }
    }

    static 
    {
        LONG = new <init>("LONG", 0);
        DOUBLE = new <init>("DOUBLE", 1);
        INTEGER = new <init>("INTEGER", 2);
        FLOAT = new <init>("FLOAT", 3);
        SHORT = new <init>("SHORT", 4);
        BYTE = new <init>("BYTE", 5);
        BIG_DECIMAL = new <init>("BIG_DECIMAL", 6);
        $VALUES = (new .VALUES[] {
            LONG, DOUBLE, INTEGER, FLOAT, SHORT, BYTE, BIG_DECIMAL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
