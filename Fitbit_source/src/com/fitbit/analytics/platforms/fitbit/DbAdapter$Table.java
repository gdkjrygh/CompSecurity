// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.analytics.platforms.fitbit;


// Referenced classes of package com.fitbit.analytics.platforms.fitbit:
//            DbAdapter

public static final class tableName extends Enum
{

    public static final a a;
    private static final a b[];
    private final String tableName;

    public static tableName valueOf(String s)
    {
        return (tableName)Enum.valueOf(com/fitbit/analytics/platforms/fitbit/DbAdapter$Table, s);
    }

    public static tableName[] values()
    {
        return (tableName[])b.clone();
    }

    public String a()
    {
        return tableName;
    }

    static 
    {
        a = new <init>("INTERACTION", 0, "interaction");
        b = (new b[] {
            a
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        tableName = s1;
    }
}
