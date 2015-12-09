// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;


// Referenced classes of package com.fitbit.data.domain:
//            a, Entity

public static final class code extends Enum
    implements a
{

    private static final PENDING_DELETE $VALUES[];
    public static final PENDING_DELETE PENDING_DELETE;
    public static final PENDING_DELETE PENDING_OPERATION;
    public static final PENDING_DELETE SYNCED;
    private final int code;

    public static code valueOf(int i)
    {
        code acode[] = values();
        int k = acode.length;
        for (int j = 0; j < k; j++)
        {
            code code1 = acode[j];
            if (code1.getCode() == i)
            {
                return code1;
            }
        }

        throw new IllegalArgumentException();
    }

    public static getCode valueOf(String s)
    {
        return (getCode)Enum.valueOf(com/fitbit/data/domain/Entity$EntityStatus, s);
    }

    public static getCode[] values()
    {
        return (getCode[])$VALUES.clone();
    }

    public int getCode()
    {
        return code;
    }

    static 
    {
        SYNCED = new <init>("SYNCED", 0, 0);
        PENDING_OPERATION = new <init>("PENDING_OPERATION", 1, 1);
        PENDING_DELETE = new <init>("PENDING_DELETE", 2, 2);
        $VALUES = (new .VALUES[] {
            SYNCED, PENDING_OPERATION, PENDING_DELETE
        });
    }


    private (String s, int i, int j)
    {
        super(s, i);
        code = j;
    }
}
