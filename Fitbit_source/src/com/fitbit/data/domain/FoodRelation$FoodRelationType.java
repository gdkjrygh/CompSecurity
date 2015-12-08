// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;


// Referenced classes of package com.fitbit.data.domain:
//            a, FoodRelation

public static final class code extends Enum
    implements a
{

    private static final FREQUENT $VALUES[];
    public static final FREQUENT FREQUENT;
    public static final FREQUENT RECENT;
    public static final FREQUENT UNKNOWN;
    private final int code;

    public static code getByCode(int i)
    {
        code acode[] = values();
        int k = acode.length;
        for (int j = 0; j < k; j++)
        {
            code code1 = acode[j];
            if (i == code1.code)
            {
                return code1;
            }
        }

        return null;
    }

    public static code valueOf(String s)
    {
        return (code)Enum.valueOf(com/fitbit/data/domain/FoodRelation$FoodRelationType, s);
    }

    public static code[] values()
    {
        return (code[])$VALUES.clone();
    }

    public int getCode()
    {
        return code;
    }

    static 
    {
        UNKNOWN = new <init>("UNKNOWN", 0, 0);
        RECENT = new <init>("RECENT", 1, 1);
        FREQUENT = new <init>("FREQUENT", 2, 2);
        $VALUES = (new .VALUES[] {
            UNKNOWN, RECENT, FREQUENT
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        code = j;
    }
}
