// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl.exceptions;

import com.fitbit.data.domain.s;

// Referenced classes of package com.fitbit.data.bl.exceptions:
//            ServerResponseException

public static final class serializableName extends Enum
    implements s
{

    public static final b a;
    public static final b b;
    private static final b c[];
    private final String serializableName;

    public static serializableName a(String s1, serializableName serializablename)
    {
        try
        {
            s1 = valueOf(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return serializablename;
        }
        return s1;
    }

    public static valueOf valueOf(String s1)
    {
        return (valueOf)Enum.valueOf(com/fitbit/data/bl/exceptions/ServerResponseException$ErrorType, s1);
    }

    public static valueOf[] values()
    {
        return (valueOf[])c.clone();
    }

    public String getSerializableName()
    {
        return serializableName;
    }

    static 
    {
        a = new <init>("GOAL", 0, "GOAL");
        b = new <init>("NO_TYPE", 1, "NO_TYPE");
        c = (new c[] {
            a, b
        });
    }

    private (String s1, int i, String s2)
    {
        super(s1, i);
        serializableName = s2;
    }
}
