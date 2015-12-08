// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;

public final class RN extends Enum
{

    private static final RN $VALUES[];
    public static final RN IMAGE;
    public static final RN UNRECOGNIZED_VALUE;
    private static final HashMap VALUE_TO_ENUM;
    public static final RN VIDEO;
    public static final RN VIDEO_NO_SOUND;
    private final int intValue;

    private RN(String s, int i, int j)
    {
        super(s, i);
        intValue = j;
    }

    public static RN a(Integer integer)
    {
        RN rn = (RN)VALUE_TO_ENUM.get(integer);
        integer = rn;
        if (rn == null)
        {
            integer = UNRECOGNIZED_VALUE;
        }
        return integer;
    }

    public static RN valueOf(String s)
    {
        return (RN)Enum.valueOf(RN, s);
    }

    public static RN[] values()
    {
        return (RN[])$VALUES.clone();
    }

    static 
    {
        int i = 0;
        IMAGE = new RN("IMAGE", 0, 0);
        VIDEO = new RN("VIDEO", 1, 1);
        VIDEO_NO_SOUND = new RN("VIDEO_NO_SOUND", 2, 2);
        UNRECOGNIZED_VALUE = new RN("UNRECOGNIZED_VALUE", 3, -9999);
        $VALUES = (new RN[] {
            IMAGE, VIDEO, VIDEO_NO_SOUND, UNRECOGNIZED_VALUE
        });
        VALUE_TO_ENUM = new HashMap();
        RN arn[] = values();
        for (int j = arn.length; i < j; i++)
        {
            RN rn = arn[i];
            VALUE_TO_ENUM.put(Integer.valueOf(rn.intValue), rn);
        }

    }
}
