// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;


// Referenced classes of package com.fitbit.data.domain:
//            a, Operation

public static final class code extends Enum
    implements a
{

    private static final DELETE $VALUES[];
    public static final DELETE CREATE;
    public static final DELETE DELETE;
    public static final DELETE UPDATE;
    private final int code;

    public static code valueOf(String s)
    {
        return (code)Enum.valueOf(com/fitbit/data/domain/Operation$OperationType, s);
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
        CREATE = new <init>("CREATE", 0, 0);
        UPDATE = new <init>("UPDATE", 1, 1);
        DELETE = new <init>("DELETE", 2, 2);
        $VALUES = (new .VALUES[] {
            CREATE, UPDATE, DELETE
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        code = j;
    }
}
