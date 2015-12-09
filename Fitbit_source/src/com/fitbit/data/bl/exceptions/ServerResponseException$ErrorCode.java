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

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    private static final f g[];
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
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return serializablename;
        }
        return s1;
    }

    public static valueOf valueOf(String s1)
    {
        return (valueOf)Enum.valueOf(com/fitbit/data/bl/exceptions/ServerResponseException$ErrorCode, s1);
    }

    public static valueOf[] values()
    {
        return (valueOf[])g.clone();
    }

    public String getSerializableName()
    {
        return serializableName;
    }

    static 
    {
        a = new <init>("VALIDATION_ERROR", 0, "VALIDATION_ERROR");
        b = new <init>("SYSTEM_ERROR", 1, "SYSTEM_ERROR");
        c = new <init>("SYSTEM_ERROR_DETAILS", 2, "SYSTEM_ERROR_DETAILS");
        d = new <init>("NOT_PAIRED", 3, "NOT_PAIRED");
        e = new <init>("LOW_BATTERY", 4, "LOW_BATTERY");
        f = new <init>("UNKNOWN_ERROR", 5, "UNKNOWN_ERROR");
        g = (new g[] {
            a, b, c, d, e, f
        });
    }

    private (String s1, int i, String s2)
    {
        super(s1, i);
        serializableName = s2;
    }
}
