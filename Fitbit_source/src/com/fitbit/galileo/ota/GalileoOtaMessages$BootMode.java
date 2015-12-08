// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.ota;


// Referenced classes of package com.fitbit.galileo.ota:
//            GalileoOtaMessages

public static final class byteValue extends Enum
{

    public static final b a;
    public static final b b;
    private static final b c[];
    public final byte byteValue;

    public static byteValue a(byte byte0)
    {
        byteValue abytevalue[] = values();
        int j = abytevalue.length;
        for (int i = 0; i < j; i++)
        {
            byteValue bytevalue = abytevalue[i];
            if (bytevalue.byteValue == byte0)
            {
                return bytevalue;
            }
        }

        throw new IllegalArgumentException((new StringBuilder()).append("cannot parse value = ").append(byte0).toString());
    }

    public static byteValue valueOf(String s)
    {
        return (byteValue)Enum.valueOf(com/fitbit/galileo/ota/GalileoOtaMessages$BootMode, s);
    }

    public static byteValue[] values()
    {
        return (byteValue[])c.clone();
    }

    static 
    {
        a = new <init>("RF_BOOTMODE_APP", 0, (byte)0);
        b = new <init>("RF_BOOTMODE_BSL", 1, (byte)1);
        c = (new c[] {
            a, b
        });
    }

    private (String s, int i, byte byte0)
    {
        super(s, i);
        byteValue = byte0;
    }
}
